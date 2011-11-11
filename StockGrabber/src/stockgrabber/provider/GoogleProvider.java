package stockgrabber.provider;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import stockgrabber.model.StockData;
import stockgrabber.utils.json.JSONArray;
import stockgrabber.utils.json.JSONObject;

public class GoogleProvider implements StockDataProvider {
	private String market = null;
	
	public GoogleProvider(String market) {
		this.market = market;
	}
	
	public StockData getOneStockQuote(String ticker) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<StockData> getManyStockQuotes(List<String> tickers) {
		if (tickers.size() < 1) return new ArrayList();
        
        try {
            StringBuffer urlString = new StringBuffer();
            urlString.append("http://finance.google.com/finance/info?client=ig&q=");
            
            for(String ticker : tickers) {
                urlString.append(market+":"+ticker+",");
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
            
            String json = body.toString().replace("// [", "[").replace("]\n", "]");
            JSONArray arr = new JSONArray(json);
            
            ArrayList<StockData> datas = new ArrayList<StockData>(arr.length());
            for(int i=0;i<arr.length();i++) {
                datas.add(JSONtoStockData(arr.getJSONObject(i)));
            }

            return datas;
        } catch(Exception e) {
            e.printStackTrace();
        }
        
        return null;
	}

	private StockData JSONtoStockData(JSONObject obj) {
        try {
            
            String date = obj.getString("lt");
            String value = obj.getString("l").replace(",", "");
            String change = obj.getString("c").replace(",", "");
            String changePercent = obj.getString("cp").replace(",", "");
            
            /* Some values are not set, return an empty old value */
            if (date.isEmpty() || value.isEmpty() || change.isEmpty() || changePercent.isEmpty()) {
                Calendar longLongTimeAgo = Calendar.getInstance();
                longLongTimeAgo.clear();
                
                return new StockData(obj.getString("t"), obj.getString("e"), 0,
                                    longLongTimeAgo,0,0);
            }
            
            Calendar cal = Calendar.getInstance();
            SimpleDateFormat sdf = new SimpleDateFormat("MMM dd, HH:mma z");
            cal.setTime(sdf.parse(date));// all done
            cal.set(Calendar.YEAR, Calendar.getInstance().get(Calendar.YEAR));
            
            StockData data = new StockData(obj.getString("t"),
                                           obj.getString("e"),
                                           Double.parseDouble(value),
                                           cal,
                                           Double.parseDouble(change),
                                           Double.parseDouble(changePercent));
            return data;
        } catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }
}
