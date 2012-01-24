package nl.tudelft.stocktrader;

import java.math.BigDecimal;
import java.util.Calendar;

public class Holding {
	private int accountId;
	private int holdingId;
	private double quantity;
	private BigDecimal purchasePrice;
	private Calendar purchaseDate;
	private String quoteId;

	public Holding() {
	}

	/**
	 * Constructs a data model instance with holding information.
	 * 
	 * @param accountId the account ID of the buyer
	 * @param holdingId the holding ID of the stock 
	 * @param quantity the quantity of the stock
	 * @param purchasePrice the purchase price of the stock
	 * @param purchaseDate the date of the purchase of the stock
	 * @param quoteId the quote ID of the stock 
	 */
	public Holding(int accountId, int holdingId, double quantity,
			BigDecimal purchasePrice, Calendar purchaseDate, String quoteId) {
		this.accountId = accountId;
		this.holdingId = holdingId;
		this.quantity = quantity;
		this.purchasePrice = purchasePrice;
		this.purchaseDate = purchaseDate;
		this.quoteId = quoteId;
	}
	
	public Holding(int holdingID, double quantity,
			BigDecimal purchasePrice, Calendar purchaseDate, String quoteID,
			int accountID) {
		setHoldingId(holdingID);
		setAccountId(accountID);
		setQuantity(quantity);
		setPurchasePrice(purchasePrice);
		setPurchaseDate(purchaseDate);
		setQuoteId(quoteID);
	}

	public int getAccountId() {
		return accountId;
	}

	public void setAccountId(int accountId) {
		this.accountId = accountId;
	}

	public int getHoldingId() {
		return holdingId;
	}
	
	// Forgive me God.
	public int getHoldingID() {
		return getHoldingId();
	}
	
	public int getAccountID() {
		return getAccountId();
	}

	public void setHoldingId(int holdingId) {
		this.holdingId = holdingId;
	}

	public double getQuantity() {
		return quantity;
	}

	public void setQuantity(double quantity) {
		this.quantity = quantity;
	}

	public BigDecimal getPurchasePrice() {
		return purchasePrice;
	}

	public void setPurchasePrice(BigDecimal purchasePrice) {
		this.purchasePrice = purchasePrice;
	}

	public Calendar getPurchaseDate() {
		return purchaseDate;
	}

	public void setPurchaseDate(Calendar purchaseDate) {
		this.purchaseDate = purchaseDate;
	}

	public String getQuoteId() {
		return quoteId;
	}

	public void setQuoteId(String quoteId) {
		this.quoteId = quoteId;
	}
}
