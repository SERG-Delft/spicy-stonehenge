/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package stockgrabber.model;

import java.util.Calendar;
import java.util.GregorianCalendar;

import stockgrabber.utils.json.JSONException;
import stockgrabber.utils.json.JSONObject;

/**
 *
 * @author tiago
 */
public class StockData {
    private String ticker;
    private String market;
    private double value;
    private Calendar timestamp;
    private double change;
    private double changePercent;
    
    public StockData(String ticker, String market, double value, Calendar timestamp,
            double change, double changePercent) {
        setMarket(market);
        setTicker(ticker);
        setValue(value);
        setTimestamp(timestamp);
        setChange(change);
        setChangePercent(changePercent);
    }
    
    /**
     * @return the ticker
     */
    public String getTicker() {
        return ticker;
    }

    /**
     * @param ticker the ticker to set
     */
    public void setTicker(String ticker) {
        this.ticker = ticker;
    }

    /**
     * @return the market
     */
    public String getMarket() {
        return market;
    }

    /**
     * @param market the market to set
     */
    public void setMarket(String market) {
        this.market = market;
    }

    /**
     * @return the value
     */
    public double getValue() {
        return value;
    }

    /**
     * @param value the value to set
     */
    public void setValue(double value) {
        this.value = value;
    }

    /**
     * @return the timestamp
     */
    public Calendar getTimestamp() {
        return timestamp;
    }

    /**
     * @param timestamp the timestamp to set
     */
    public void setTimestamp(Calendar timestamp) {
        this.timestamp = timestamp;
    }
    
    public String toString() {
        StringBuilder out = new StringBuilder();
        out.append("Market: "+getMarket()+"\n");
        out.append("Ticker: "+getTicker()+"\n");
        out.append("Value: "+getValue()+"\n");
        out.append("Timestamp: "+getTimestamp().getTime().getTime()+"\n");
        out.append("Change: "+getChange()+"\n");
        out.append("Change (percent): "+getChangePercent()+"\n");
        
        return out.toString();
    }
    
    public String toJSONString() {
    	try {
    		JSONObject o = (JSONObject)JSONObject.wrap(this);
			o.put("timestamp", timestamp.getTimeInMillis());
	    	return o.toString();
    	} catch (JSONException e) {
			e.printStackTrace();
		}
    	return null;
    }
    
    /**
     * @return the change
     */
    public double getChange() {
        return change;
    }

    /**
     * @param change the change to set
     */
    public void setChange(double change) {
        this.change = change;
    }

    /**
     * @return the changePercent
     */
    public double getChangePercent() {
        return changePercent;
    }

    /**
     * @param changePercent the changePercent to set
     */
    public void setChangePercent(double changePercent) {
        this.changePercent = changePercent;
    }
}
