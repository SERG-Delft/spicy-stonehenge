package nl.tudelft.stocktrader.dal.configservice;

public class BSConfig {
	private String OPSName;
	private String OPS;
	private boolean Sec;
	private String DBName;
	private String DBHostName;
	private int DBPort;
	public String getOPSName() {
		return OPSName;
	}
	public void setOPSName(String oPSName) {
		OPSName = oPSName;
	}
	public String getOPS() {
		return OPS;
	}
	public void setOPS(String oPS) {
		OPS = oPS;
	}
	public boolean isSec() {
		return Sec;
	}
	public void setSec(boolean sec) {
		Sec = sec;
	}
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
	public BSConfig(String oPSName, String oPS, boolean sec, String dBName,
			String dBHostName, int dBPort) {
		OPSName = oPSName;
		OPS = oPS;
		Sec = sec;
		DBName = dBName;
		DBHostName = dBHostName;
		DBPort = dBPort;
	}
	
	
}
