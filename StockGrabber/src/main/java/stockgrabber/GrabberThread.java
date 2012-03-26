package stockgrabber;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

import stockgrabber.model.StockData;
import stockgrabber.provider.StockDataProvider;
import stockgrabber.provider.YahooProvider;

public class GrabberThread extends Thread {
	private String filename;
	
	public GrabberThread(String filename) {
		this.filename = filename;
	}
	
	public void run() {
		System.out.println("Thread "+Thread.currentThread().getName()+" reporting for duty! File: "+filename);
		StockDataProvider provider = new YahooProvider("NASDAQ");
    	
    	while (true) {
	        try{
	            // Open the file that is the first 
	            // command line parameter
	            FileInputStream fstream = new FileInputStream(filename);
	
	            // Get the object of DataInputStream
	            DataInputStream in = new DataInputStream(fstream);
	            BufferedReader br = new BufferedReader(new InputStreamReader(in));
	            String strLine;
	
	            //truncateTable();
	            
	            LinkedList<String> tickers = new LinkedList<String>();

	            //Read File Line By Line
	            while ((strLine = br.readLine()) != null)   {
	                    int pos = strLine.indexOf("	");
	
	                    if (pos == -1) {
	                            pos = strLine.indexOf(" ");
	                    }
	
	                    String ticker = strLine.substring(0, pos);
	
	                    tickers.add(ticker);                    
	                    if (tickers.size() == StockGrabber.BULK_SIZE) {
	                        List<StockData> data = provider.getManyStockQuotes(tickers);
	                        
	                        storeStockData(data);
	                        
	                        tickers.clear();
	                    }
	            }
	
	            //Close the input stream
	            in.close();
	            br.close();
	            fstream.close();
	            
	            in = null;
	            br = null;
	            fstream = null;
	            
	            tickers = null;
	            
	        }catch (Exception e){//Catch exception if any
	            System.err.println("Error: " + e.getMessage());
	        }
    	}
	}
	

    /**
     * Grabs all the stock data information and updates the database
     * on an AS-NEEDED BASIS.
     * 
     * @param data List of datas to update
     * @return How many datas were updated
     */
    private static int storeStockData(List<StockData> data) {
    	/* Nothing to do here, move along */
    	if (data.size() == 0) return 0;
    	
        /* This hashmap serves as a dictionary for later lookup in the code */
        HashMap<String,StockData> map = new HashMap<String, StockData>(data.size());

        /* This array list will contain a filtered list of StockData that require update */
        //ArrayList<String> updateTickers = new ArrayList<String>();
        
        /* Get all tickers that
         * a) are in data
         * b) have a newer update (latest_update < current timestamp)
         */
        StringBuilder statsBuilder = new StringBuilder();
        statsBuilder.append("SELECT ticker, latest_update FROM quotestats WHERE ");
        
        for (int i=0; i<data.size()-1; i++) {
            statsBuilder.append("ticker = ? OR ");
        }
        statsBuilder.append("ticker = ?");
        
        try {
            PreparedStatement stats = StockGrabber.getConnection().prepareStatement(statsBuilder.toString());
            
            int i = 0;
            for(StockData s : data) {
                map.put(s.getTicker(), s);
                
                stats.setString(1+i, s.getTicker());
                //stats.setTimestamp(2+i, new Timestamp(s.getTimestamp().getTimeInMillis()));
                i++;
            }
            
            // Run SQL and populate filtered list
            ResultSet rs = stats.executeQuery();
            while(rs.next()) {
                String ticker = rs.getString("ticker");
                
                Timestamp newTime = new Timestamp(
                        map.get(ticker).getTimestamp().getTimeInMillis()
                        );
                
                if (!rs.getTimestamp("latest_update").before(newTime)) {
                    map.remove(ticker);
                }
                //updateTickers.add(rs.getString("ticker"));
            }
            
            /* Nothing to update here, move along */
            if (map.isEmpty()) return 0;
            
            /* At this stage we know which stockdata need updates. Insert them into the DB */
            StringBuilder insertBuilder = new StringBuilder();
            insertBuilder.append("INSERT INTO APP.QUOTEDATA ");
            insertBuilder.append("(ticker, remote_timestamp, market, value, change, change_percent) VALUES ");

            for (i=0; i<map.keySet().size()-1; i++) {
                insertBuilder.append("(?,?,?,?,?,?), ");
            }
            insertBuilder.append("(?,?,?,?,?,?)");

            PreparedStatement ps = StockGrabber.getConnection().prepareStatement(insertBuilder.toString());
            
            i = 0;
            for(StockData s : map.values()) {
                Timestamp t = new Timestamp(s.getTimestamp().getTimeInMillis());
                
                ps.setString(1+i, s.getTicker());
                ps.setTimestamp(2+i, t);
                ps.setString(3+i, "NASDAQ");
                ps.setDouble(4+i, s.getValue());
                ps.setDouble(5+i, s.getChange());
                ps.setDouble(6+i, s.getChangePercent());
                
                /* While we're at it, update the stats table */
                updateOrInsertStat(s.getTicker(), t);
                
                i+=6;
                
                StockGrabber.getPublisher().send((s.getTicker()+" "+s.toJSONString()).getBytes(), 0);
            }
            
            ps.execute();
        } catch (SQLException ex) {
            ex.printStackTrace();
            System.exit(0);
        }
        
        /* Sue me */
        return data.size();
    }
    
    private static boolean updateOrInsertStat(String ticker, Timestamp t) throws SQLException {
        String sql = "UPDATE quotestats SET latest_update = ? WHERE ticker = ?";
        
        PreparedStatement ps = StockGrabber.getConnection().prepareStatement(sql);
        
        ps.setTimestamp(1, t);
        ps.setString(2, ticker);
        
        int rows = ps.executeUpdate();
        
        if (rows == 0) {
            String sqlInsert = "INSERT INTO quotestats (ticker, latest_update) VALUES (?,?)";
            
            ps = StockGrabber.getConnection().prepareStatement(sqlInsert);
            
            ps.setString(1, ticker);
            ps.setTimestamp(2, t);
            
            ps.execute();
        }
        
        return true;
    }
}
