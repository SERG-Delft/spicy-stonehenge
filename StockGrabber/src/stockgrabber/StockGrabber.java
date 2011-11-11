/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package stockgrabber;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

import org.zeromq.ZMQ;

import stockgrabber.model.StockData;
import stockgrabber.provider.GoogleProvider;
import stockgrabber.provider.StockDataProvider;
import stockgrabber.provider.YahooProvider;
import stockgrabber.utils.json.JSONArray;
import stockgrabber.utils.json.JSONObject;

/**
 *
 * @author tiago
 */
public class StockGrabber {

    public static final int BULK_SIZE = 10;
    
    private static Connection c = null;
    private static ZMQ.Socket publisher = null;
    static {
        try {
            c = DriverManager.getConnection(
                                        "jdbc:derby://localhost:1527/stonehenge");
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        
        ZMQ.Context context = ZMQ.context(1);
	    publisher = context.socket(ZMQ.PUB);

	    // We send updates via this socket
	    publisher.bind("tcp://*:5565");
    }
    
    public static Connection getConnection() {
    	return c;
    }
    
    public static ZMQ.Socket getPublisher() {
    	return publisher;
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
    	String[] filenames = new String[]{"NASDAQ-part1.txt","NASDAQ-part2.txt","NASDAQ-part3.txt",
    									  "NASDAQ-part4.txt","NASDAQ-part5.txt","NASDAQ-part6.txt"};
    	
    	for(String filename : filenames) {
    		new GrabberThread(filename).start();
    	}
    	//StockData d = new StockData("blah", "nasdaq", 100, Calendar.getInstance(), 100, 10);
    	
    	//JSONObject o = (JSONObject)JSONObject.wrap(d);
    	
    	//System.out.println(d.toString());
//    	ArrayList<String> t = new ArrayList<String>();
//    	t.add("GOOG");
//    	t.add("MSFT");
//    	
//    	YahooProvider p = new YahooProvider("NASDAQ");
//    	
//    	List<StockData> q = p.getManyStockQuotes(t);
//    	
//    	for(StockData s : q) {
//    		System.out.println(s);
//    	}
//    	System.exit(0);
    	
//    	GoogleProvider provider = new GoogleProvider("NASDAQ");
    	
    	
    }
    
    
    
    private static void debug(List<StockData> ds) {
        for(StockData d : ds) {
            System.out.println(d);
        }
    }
}
