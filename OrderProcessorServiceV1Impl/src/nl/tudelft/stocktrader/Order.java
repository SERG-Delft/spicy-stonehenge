package nl.tudelft.stocktrader;

import java.math.BigDecimal;
import java.util.Calendar;

public class Order {
	int accountId;
	int holdingId;

    protected Integer orderID;
    protected String orderType;
    protected String orderStatus;
    protected Calendar openDate;
    protected Calendar completionDate;
    protected Double quantity;
    protected BigDecimal price;
    protected BigDecimal orderFee;
    protected String symbol;

	public Order(int orderId, String orderType, String orderStatus,
			Calendar openDate, Calendar completionDate, double quantity,
			BigDecimal price, BigDecimal orderFee, String symbol) {
		setOrderID(orderId);
		setOrderType(orderType);
		setOrderStatus(orderStatus);
		setOpenDate(openDate);
		setCompletionDate(completionDate);
		setQuantity(quantity);
		setPrice(price);
		setOrderFee(orderFee);
		setSymbol(symbol);
	}

	/**
	 * Constructs data instance for order information.
	 * 
	 * @param accountId
	 *            the account ID of the buyer or seller
	 * @param holdingId
	 *            the ID of corresponding holding of the order
	 */
	public Order(int accountId, int holdingId) {
		this.accountId = accountId;
		this.holdingId = holdingId;
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

	public void setHoldingId(int holdingId) {
		this.holdingId = holdingId;
	}

    public Integer getOrderID() {
        return orderID;
    }

    public void setOrderID(Integer orderID) {
        this.orderID = orderID;
    }

    public String getOrderType() {
        return orderType;
    }

    public void setOrderType(String orderType) {
        this.orderType = orderType;
    }

    public String getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
    }

    public Calendar getOpenDate() {
        return openDate;
    }

    public void setOpenDate(Calendar openDate) {
        this.openDate = openDate;
    }

    public Calendar getCompletionDate() {
        return completionDate;
    }

    public void setCompletionDate(Calendar completionDate) {
        this.completionDate = completionDate;
    }

    public Double getQuantity() {
        return quantity;
    }

    public void setQuantity(Double quantity) {
        this.quantity = quantity;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public BigDecimal getOrderFee() {
        return orderFee;
    }

    public void setOrderFee(BigDecimal orderFee) {
        this.orderFee = orderFee;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }
}
