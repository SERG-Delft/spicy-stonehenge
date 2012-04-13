package nl.tudelft.ewi.st.atlantis.tudelft.logunits;

public class LogUnit {
	private String ip;
	private String serviceName;
	private String method;
	
	public LogUnit(String serviceName, String ip, String method) {
		this.serviceName = serviceName;
		this.ip = ip;
		this.method = method;
	}
	
	public String getIP() {
		return ip;
	}
	
	public String getServiceName() {
		return serviceName;
	}
	
	public String getMethod() {
		return method;
	}
}
