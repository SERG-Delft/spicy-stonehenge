package nl.tudelft.ewi.st.atlantis.tudelft.logunits;

public class LogPair {
	private LogUnit consumer;
	private LogUnit service;
	
	public LogPair(LogUnit consumer, LogUnit service) {
		this.consumer = consumer;
		this.service = service;
	}



	public LogUnit getService() {
		return service;
	}

	public LogUnit getConsumer() {
		return consumer;
	}
	
	
	
}
