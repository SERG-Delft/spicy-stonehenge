package nl.tudelft.stocktrader;

import java.math.BigDecimal;

public class Wallet {
	protected String userID;
    protected BigDecimal eur = BigDecimal.ZERO;
    protected BigDecimal usd = BigDecimal.ZERO;
    protected BigDecimal gbp = BigDecimal.ZERO;
    protected BigDecimal cny = BigDecimal.ZERO;
    protected BigDecimal inr = BigDecimal.ZERO;
    
    public Wallet(){
    }
    
    public Wallet(String userID, BigDecimal usd, BigDecimal eur, BigDecimal gbp, BigDecimal cny, BigDecimal inr){
    	setUserID(userID);
    	setEur(eur);
    	setUsd(usd);
    	setGbp(gbp);
    	setCny(cny);
    	setInr(inr);    	
    }
    
    
	public String getUserID() {
		return userID;
	}
	public void setUserID(String userID) {
		this.userID = userID;
	}
	public BigDecimal getEur() {
		return eur;
	}
	public void setEur(BigDecimal eur) {
		this.eur = eur;
	}
	public BigDecimal getUsd() {
		return usd;
	}
	public void setUsd(BigDecimal usd) {
		this.usd = usd;
	}
	public BigDecimal getGbp() {
		return gbp;
	}
	public void setGbp(BigDecimal gbp) {
		this.gbp = gbp;
	}
	public BigDecimal getCny() {
		return cny;
	}
	public void setCny(BigDecimal cny) {
		this.cny = cny;
	}
	public BigDecimal getInr() {
		return inr;
	}
	public void setInr(BigDecimal inr) {
		this.inr = inr;
	}
}
