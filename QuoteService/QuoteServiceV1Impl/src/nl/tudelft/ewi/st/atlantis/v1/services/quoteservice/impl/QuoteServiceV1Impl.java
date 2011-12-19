
package nl.tudelft.ewi.st.atlantis.v1.services.quoteservice.impl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;

import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

import nl.tudelft.ewi.st.atlantis.tudelft.external.v1.types.RemoteQuoteData;
import nl.tudelft.ewi.st.atlantis.v1.services.GetQuotesRequest;
import nl.tudelft.ewi.st.atlantis.v1.services.GetQuotesResponse;
import nl.tudelft.ewi.st.atlantis.v1.services.quoteservice.QuoteServiceV1;

public class QuoteServiceV1Impl
    implements QuoteServiceV1
{


    public GetQuotesResponse getQuotes(GetQuotesRequest request) {
    	if (request.getSymbols().size() == 0) return new GetQuotesResponse();
    	
    	List<String> symbols = request.getSymbols();
    	
    	try {
    		/* Assumes the DB is there. If it isn't, tough luck. */
			Connection c = DriverManager.getConnection("jdbc:derby://localhost:1527/quotes");
			
			StringBuilder sb = new StringBuilder();
			
			sb.append("SELECT TICKER, REMOTE_TIMESTAMP, MARKET, VALUE, CHANGE, CHANGE_PERCENT " +
					  "FROM QUOTEDATA WHERE TICKER = ?");
			
			int i = 0;
			for(i = 0; i<symbols.size()-1;i++){
				sb.append(" OR TICKER = ?");
			}
			
			PreparedStatement ps = c.prepareStatement(sb.toString());
			
			i = 1;
			for(String t : symbols) {
				ps.setString(i++, t);
			}
			
			DatatypeFactory dtf = DatatypeFactory.newInstance();
			
			GetQuotesResponse response = new GetQuotesResponse();
			List<RemoteQuoteData> data = response.getQuoteData();
			
			ResultSet rs = ps.executeQuery();
			
			while(rs.next()) {
				RemoteQuoteData rqd = new RemoteQuoteData();
				rqd.setChange(rs.getDouble("CHANGE"));
				rqd.setChangePercent(rs.getDouble("CHANGE_PERCENT"));
				rqd.setMarket(rs.getString("MARKET"));
				rqd.setTicker(rs.getString("TICKER"));
				rqd.setValue(rs.getDouble("VALUE"));
				
				/* Tiago: What a mess, I know. In DB we have Timestamp.
				 * We need to go to GregorianCalendar and then XMLGregorianCalendar */
				Timestamp t = rs.getTimestamp("REMOTE_TIMESTAMP");
				GregorianCalendar gc = (GregorianCalendar)Calendar.getInstance();
				gc.setTimeInMillis(t.getTime());
				XMLGregorianCalendar timestamp = dtf.newXMLGregorianCalendar(gc);
				
				rqd.setTimestamp(timestamp);
				
				data.add(rqd);
			}
			
			return response;
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return new GetQuotesResponse();
    }

}
