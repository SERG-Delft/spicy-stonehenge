package stockgrabber.provider;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import stockgrabber.model.StockData;

public class YahooProvider implements StockDataProvider {
	private String market = null;
	
	public YahooProvider(String market) {
		this.market = market;
	}
	
	public StockData getOneStockQuote(String ticker) {
		ArrayList<String> d = new ArrayList<String>();
		d.add(ticker);
		
		List<StockData> l = getManyStockQuotes(d);
		
		if (l.isEmpty()) {
			return null;
		} else {
			return l.get(0);
		}
	}

	public List<StockData> getManyStockQuotes(List<String> tickers) {
		if (tickers.size() < 1) return new ArrayList<StockData>();
		
		try {
			StringBuffer urlString = new StringBuffer();
            urlString.append("http://finance.yahoo.com/q?s=");
            
            for(String ticker : tickers) {
                urlString.append(ticker+",");
            }
            
            URL url = new URL(urlString.toString());
            URLConnection conn = url.openConnection();
            conn.setDoOutput(true);

            // Get the response
            BufferedReader rd = new BufferedReader(new InputStreamReader(conn.getInputStream()));
            
            StringBuffer body = new StringBuffer();
            
            String line = null;
            while ((line = rd.readLine()) != null) {
                body.append(line);
            }
            rd.close();
                        
            ArrayList<StockData> data = new ArrayList<StockData>(tickers.size());
            for(String t : tickers) {
            	/* Get timestamp */
            	String upperLimit = "<a href=\"/q?s="+t+"\">"+t+"</a></span></td><td class=\"col-time cell-raw:";
            	String bottomLimit = "\"><span class=\"wrapper\">";
            	
            	int index = body.indexOf(upperLimit);
            	if (index == -1) {
            		continue;
            	}
            	int start = index + upperLimit.length();
            	int end = body.indexOf(bottomLimit, start);
            	
            	long timeMillis = Long.parseLong(body.substring(start, end))*1000;
            	
            	Calendar timestamp = Calendar.getInstance();
            	timestamp.setTimeInMillis(timeMillis);
            	
            	/* Tiago: Hopefully if we clean up as we go, this will make it more performant */
            	body.delete(0, end);
            	
            	/* Get value */
            	upperLimit = "<td class=\"col-price cell-raw:";
            	bottomLimit = "\"><span class=\"wrapper\">";
            	
            	index = body.indexOf(upperLimit);
            	if (index == -1) {
            		continue;
            	}
            	start = index + upperLimit.length();
            	end = body.indexOf(bottomLimit, start);
            	
            	double value = Double.parseDouble(body.substring(start, end));
            	
            	/* Cleanup */
            	body.delete(0, end);

            	/* Get change value */
            	double change = 0;
            	
            	upperLimit = "<td class=\"col-change yfi-price-change-down cell-raw:";
            	bottomLimit = "\"><span class=\"wrapper\">";
            	
            	index = body.indexOf(upperLimit);
            	if (index != -1) {
            		start = index + upperLimit.length();
                	end = body.indexOf(bottomLimit, start);
                	
                	change = Double.parseDouble(body.substring(start, end));
            	}
            	
            	double changePercent = 0;
            	
            	upperLimit = "<td class=\"col-percent_change yfi-price-change-down cell-raw:";
            	bottomLimit = "\"><span class=\"wrapper\">";
            	
            	index = body.indexOf(upperLimit);
            	if (index != -1) {
            		start = index + upperLimit.length();
                	end = body.indexOf(bottomLimit, start);
                	
                	changePercent = Double.parseDouble(body.substring(start, end));
            	}
            	
            	StockData s = new StockData(t, market, value, timestamp, change, changePercent);
            	
            	data.add(s);
            }
            
            return data;
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return new ArrayList();
	}

}
