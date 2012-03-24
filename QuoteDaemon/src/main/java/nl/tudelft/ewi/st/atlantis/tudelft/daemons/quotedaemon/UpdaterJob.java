package nl.tudelft.ewi.st.atlantis.tudelft.daemons.quotedaemon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.Calendar;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

import nl.tudelft.ewi.st.atlantis.tudelft.external.v1.types.RemoteQuoteData;
import nl.tudelft.ewi.st.atlantis.tudelft.v1.services.quoteservice.SharedQuoteServiceV1Consumer;
import nl.tudelft.ewi.st.atlantis.tudelft.v1.types.GetQuotesRequest;
import nl.tudelft.ewi.st.atlantis.tudelft.v1.types.GetQuotesResponse;

import org.ebayopensource.turmeric.runtime.common.exceptions.ServiceException;
import org.quartz.Job;
import org.quartz.JobDataMap;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;

public class UpdaterJob implements Job {

	public final static int BULK_SIZE = 20;
	
	private Connection c = null;
	
	public void execute(JobExecutionContext ctx) throws JobExecutionException {
		try {
			SharedQuoteServiceV1Consumer quoteService = new SharedQuoteServiceV1Consumer("QuoteDaemon", "production");
			
			JobDataMap dataMap = ctx.getJobDetail().getJobDataMap();
			
			InputStream fileIS = (InputStream)dataMap.get("filestream");
			c = (Connection)dataMap.get("connection");
			
			BufferedReader br = new BufferedReader(new InputStreamReader(fileIS));
			
			String strLine = null;
            LinkedList<String> tickers = new LinkedList<String>();

			//Read File Line By Line
            while ((strLine = br.readLine()) != null)   {
                    int pos = strLine.indexOf("	");

                    if (pos == -1) {
                            pos = strLine.indexOf(" ");
                    }

                    String ticker = strLine.substring(0, pos);

                    tickers.add(ticker);                    
                    if (tickers.size() == UpdaterJob.BULK_SIZE) {
                    	GetQuotesRequest request = new GetQuotesRequest();
            			request.getSymbols().addAll(tickers);
            			
            			GetQuotesResponse response = new GetQuotesResponse();
            			response = quoteService.getQuotes(request);
                        
            			List<RemoteQuoteData> quotes = response.getQuoteData();
            			
                        processStockData(quotes);
                        
                        tickers.clear();
                    }
            }		
		} catch (ServiceException se) {
			se.printStackTrace();
		} catch (IOException ioe) {
			ioe.printStackTrace();
		} catch (SQLException se) {
			se.printStackTrace();
		}
	}
	
	private void processStockData(List<RemoteQuoteData> quotes) throws SQLException {
		if (quotes.size() == 0) return;
		
		StringBuilder select = new StringBuilder();
		select.append("SELECT LOW, HIGH, OPEN1, SYMBOL, LAST_UPDATE FROM QUOTE WHERE SYMBOL = ?");
		
		for(int i=0; i<quotes.size()-1; i++) select.append(" OR SYMBOL = ?");
		
		PreparedStatement st = c.prepareStatement(select.toString());
		
		/* Makes it easier to check later */
		HashMap<String, RemoteQuoteData> quoteMap = new HashMap<String, RemoteQuoteData>(quotes.size());
		
		int i = 1;
		for(RemoteQuoteData q : quotes) {
			st.setString(i++, q.getTicker());
			quoteMap.put(q.getTicker(), q);
		}
		
		
		ResultSet rs = st.executeQuery();
		
		/* Go through DB records and update as needed */
		while (rs.next()) {
			double low = rs.getDouble("LOW");
			double high = rs.getDouble("HIGH");
			Timestamp lastUpdate = rs.getTimestamp("LAST_UPDATE");
			
			String symbol = rs.getString("SYMBOL");
			RemoteQuoteData newData = quoteMap.get(symbol);
			quoteMap.remove(symbol);
			
			int day = lastUpdate.getDay();
			int today = Calendar.getInstance().get(Calendar.DAY_OF_YEAR);
			
			double open1 = rs.getDouble("OPEN1");
			/* Existing data is from yesterday, update */
			if (day < today) {
				open1 = newData.getValue();
			}
			
			/* New value is lower than low */
			if (newData.getValue() < low) {
				low = newData.getValue();
			}
			
			/* New value is higher than high */
			if (newData.getValue() > high) {
				high = newData.getValue();
			}
			
			/* Update price and change */
			double price = newData.getValue();
			double change1 = newData.getChange();
			
			lastUpdate = new Timestamp(newData.getTimestamp().toGregorianCalendar().getTimeInMillis());
			
			PreparedStatement update = c.prepareStatement("UPDATE QUOTE SET LOW = ?, OPEN1 = ?, HIGH = ?, PRICE = ?, CHANGE1 = ?, LAST_UPDATE = ? "+
														  "WHERE SYMBOL = ?");
			update.setDouble(1, low);
			update.setDouble(2, open1);
			update.setDouble(3, high);
			update.setDouble(4, price);
			update.setDouble(5, change1);
			update.setTimestamp(6, lastUpdate);
			
			update.setString(7, symbol);
			
			update.execute();
		}
		
		PreparedStatement insert = c.prepareStatement
				(
				"INSERT INTO QUOTE "+
				"(LOW, OPEN1, VOLUME, PRICE, HIGH, COMPANYNAME, SYMBOL, CHANGE1, LAST_UPDATE) "+
		  		"VALUES (?,?,?,?,?,?,?,?,?)"
				);
		
		for (RemoteQuoteData leftover : quoteMap.values()) {
			insert.setDouble(1, leftover.getValue());
			insert.setDouble(2, leftover.getValue());
			insert.setDouble(3, 0);
			insert.setDouble(4, leftover.getValue());
			insert.setDouble(5, leftover.getValue());
			insert.setString(6, leftover.getTicker());
			insert.setString(7, leftover.getTicker());
			insert.setDouble(8, leftover.getChange());
			
			Timestamp t = new Timestamp(leftover.getTimestamp().toGregorianCalendar().getTimeInMillis());
			insert.setTimestamp(9, t);
			
			insert.execute();
			
			insert.clearParameters();
		}
	}

}
