package nl.tudelft.ewi.st.atlantis.tudelft.util;

import java.math.BigDecimal;
import java.util.Calendar;

import nl.tudelft.ewi.st.atlantis.tudelft.v1.types.OrderData;
import nl.tudelft.stocktrader.Order;

public class TypeFactory {
	public static Order toOrder(OrderData data) {
		return new Order(data.getOrderID(),data.getOrderType(),
						data.getOrderStatus(), (Calendar)data.getOpenDate().toGregorianCalendar(),
						(Calendar)data.getCompletionDate().toGregorianCalendar(), data.getQuantity(),
						new BigDecimal(data.getPrice()), new BigDecimal(data.getOrderFee()),
						data.getSymbol());
	}
}
