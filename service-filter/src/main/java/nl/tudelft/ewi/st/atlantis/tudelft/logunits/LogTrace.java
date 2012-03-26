package nl.tudelft.ewi.st.atlantis.tudelft.logunits;

import java.util.ArrayList;
import java.util.List;

public class LogTrace {
	private List<LogPair> sortedPairs;
	private String requestID;
	
	public LogTrace(String requestID) {
		sortedPairs = new ArrayList<LogPair>();
		this.requestID = requestID;
	}
	
	public void addPair(LogPair lp) {
		sortedPairs.add(lp);
	}
	
	public String getRequestID(){
		return requestID;
	}
	
	public List<LogPair> getTrace() {
		return sortedPairs;
	}
	
}
