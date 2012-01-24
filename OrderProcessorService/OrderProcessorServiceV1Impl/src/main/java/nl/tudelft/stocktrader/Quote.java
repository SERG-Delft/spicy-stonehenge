package nl.tudelft.stocktrader;

import java.math.BigDecimal;

public class Quote {
	private String symbol;
	private String companyName;
	private double volume;
	private BigDecimal price;
	private BigDecimal open;
	private BigDecimal low;
	private BigDecimal high;
	private double change;

	public Quote() {
	}

	/**
	 * Constructs an instance for quote information.
	 * 
	 * @param symbol
	 * @param companyName
	 * @param volume
	 * @param price
	 * @param open
	 * @param low
	 * @param high
	 * @param change
	 */
	public Quote(String symbol, String companyName, double volume,
			BigDecimal price, BigDecimal open, BigDecimal low, BigDecimal high,
			double change) {
		this.symbol = symbol;
		this.companyName = companyName;
		this.volume = volume;
		this.price = price;
		this.open = open;
		this.low = low;
		this.high = high;
		this.change = change;
	}

	public String getSymbol() {
		return symbol;
	}

	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public double getVolume() {
		return volume;
	}

	public void setVolume(double volume) {
		this.volume = volume;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	public BigDecimal getOpen() {
		return open;
	}

	public void setOpen(BigDecimal open) {
		this.open = open;
	}

	public BigDecimal getLow() {
		return low;
	}

	public void setLow(BigDecimal low) {
		this.low = low;
	}

	public BigDecimal getHigh() {
		return high;
	}

	public void setHigh(BigDecimal high) {
		this.high = high;
	}

	public double getChange() {
		return change;
	}

	public void setChange(double change) {
		this.change = change;
	}}
