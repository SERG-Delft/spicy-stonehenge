package nl.tudelft.stocktrader;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.List;

public class Wallet {
	protected String userID;
	HashMap<String, BigDecimal> money = new HashMap<String, BigDecimal>();
//    protected BigDecimal eur = BigDecimal.ZERO;
//    protected BigDecimal usd = BigDecimal.ZERO;
//    protected BigDecimal gbp = BigDecimal.ZERO;
//    protected BigDecimal cny = BigDecimal.ZERO;
//    protected BigDecimal inr = BigDecimal.ZERO;
//    protected static String currencyTypes[] = {"EUR","USD","GBP","CNY","INR"};
    
    public Wallet(String userID){
    	setUserID(userID);
    	money.put("EUR", BigDecimal.ZERO);
    	money.put("USD", BigDecimal.ZERO);
    	money.put("GBP", BigDecimal.ZERO);
    	money.put("CNY", BigDecimal.ZERO);
    	money.put("INR", BigDecimal.ZERO);   	
    }
    
    public Wallet(String userID, BigDecimal usd, BigDecimal eur, BigDecimal gbp, BigDecimal cny, BigDecimal inr){
    	setUserID(userID);
    	setEur(eur);
    	setUsd(usd);
    	setGbp(gbp);
    	setCny(cny);
    	setInr(inr);    	
    }
    
    public boolean checkCurrency(String inputCurrrency){
    	return money.containsKey(inputCurrrency);
    }
   
    public void setMoney(String currencyType, BigDecimal value){
    	money.put(currencyType, value);
    }
    
    public BigDecimal getMoney(String currencyType){
    	return money.get(currencyType);
    }
    
   
	public String getUserID() {
		return userID;
	}
	public void setUserID(String userID) {
		this.userID = userID;
	}
	public BigDecimal getEur() {
		return money.get("EUR");
	}
	public void setEur(BigDecimal eur) {
		money.put("EUR", eur);
	}
	public BigDecimal getUsd() {
		return money.get("USD");
	}
	public void setUsd(BigDecimal usd) {
		money.put("USD", usd);
	}
	public BigDecimal getGbp() {
		return money.get("GBP");
	}
	public void setGbp(BigDecimal gbp) {
		money.put("GBP", gbp);
	}
	public BigDecimal getCny() {
		return money.get("CNY");
	}
	public void setCny(BigDecimal cny) {
		money.put("CNY", cny);
	}
	public BigDecimal getInr() {
		return money.get("INR");
	}
	public void setInr(BigDecimal inr) {
		money.put("INR", inr);
	}
}
