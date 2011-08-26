package nl.tudelft.stocktrader.dal.configservice;

public class OPSConfig {
	private String DBName;
	private String DBHostName;
	private int DBPort;
	public String getDBName() {
		return DBName;
	}
	public void setDBName(String dBName) {
		DBName = dBName;
	}
	public String getDBHostName() {
		return DBHostName;
	}
	public void setDBHostName(String dBHostName) {
		DBHostName = dBHostName;
	}
	public int getDBPort() {
		return DBPort;
	}
	public void setDBPort(int dBPort) {
		DBPort = dBPort;
	}
	public OPSConfig(String dBName, String dBHostName, int dBPort) {
		DBName = dBName;
		DBHostName = dBHostName;
		DBPort = dBPort;
	}
	
	
}
