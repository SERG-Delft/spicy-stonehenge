package nl.tudelft.stocktrader.dal.configservice;

public class ClientConfig {
	private String BSName;
	private String BS;
	private boolean Sec;
	public String getBSName() {
		return BSName;
	}
	public void setBSName(String bSName) {
		BSName = bSName;
	}
	public String getBS() {
		return BS;
	}
	public void setBS(String bS) {
		BS = bS;
	}
	public boolean isSec() {
		return Sec;
	}
	public void setSec(boolean sec) {
		Sec = sec;
	}
	public ClientConfig(String bSName, String bS, boolean sec) {
		BSName = bSName;
		BS = bS;
		Sec = sec;
	}	
}
