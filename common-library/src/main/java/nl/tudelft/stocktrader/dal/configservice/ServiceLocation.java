package nl.tudelft.stocktrader.dal.configservice;

public class ServiceLocation {
    private String serviceName;
    private String serviceURL;
    private boolean Sec;
	public String getServiceName() {
		return serviceName;
	}
	public void setServiceName(String serviceName) {
		this.serviceName = serviceName;
	}
	public String getServiceURL() {
		return serviceURL;
	}
	public void setServiceURL(String serviceURL) {
		this.serviceURL = serviceURL;
	}
	public boolean isSec() {
		return Sec;
	}
	public void setSec(boolean sec) {
		Sec = sec;
	}
	public ServiceLocation(String serviceName, String serviceURL, boolean sec) {
		this.serviceName = serviceName;
		this.serviceURL = serviceURL;
		Sec = sec;
	}   
}
