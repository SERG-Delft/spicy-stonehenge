package nl.tudelft.stocktrader.util;
/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */



import java.math.BigDecimal;
import java.sql.Date;
import java.util.Calendar;
import java.util.Random;

public class StockTraderUtility {
	
	public static final String TRADE_ORDER_SERVICE_PROPERTY_FILE = "TradeServiceConfig.properties";
	public static final String TRADE_ORDER_SERVICE_SECURITY_FILE = "security-policy.xml";
	public static final String MSSQL_DB_PROPERRTIES_FILE = "mssql-db.properties";
    public static final String DB_PROPERRTIES_FILE = "db.properties";
	public static final String ORDER_TYPE_BUY = "buy";
	public static final String ORDER_TYPE_SELL = "sell";
	public static final String ORDER_TYPE_SELL_ENHANCED = "sellEnhanced";
	public static final String ORDER_STATUS_CLOSED = "closed";
	public static final String ORDER_STATUS_OPEN = "open";

	public static final int MAX_QUERY_TOP_ORDERS = 5;
	public static final int MAX_QUERY_ORDERS = 5;

	public static final BigDecimal PENNY_STOCK_P = BigDecimal.valueOf(0.1);
	public static final BigDecimal JUNK_STOCK_MIRACLE_MULTIPLIER = BigDecimal
			.valueOf(500);
	public static final BigDecimal STOCK_P_HIGH_BAR = BigDecimal.valueOf(1000);
	public static final BigDecimal STOCK_P_HIGH_BAR_CRASH = BigDecimal
			.valueOf(0.05);
	public static final BigDecimal STOCK_CHANGE_MAX_PERCENT = BigDecimal
			.valueOf(5);
	public static final BigDecimal BUY_FEE = BigDecimal.valueOf(15.95);
	public static final BigDecimal SELL_FEE = BigDecimal.valueOf(25.95);

//	private static final Log logger = LogFactory
//			.getLog(StockTraderUtility.class);

	public static BigDecimal getRandomPriceChangeFactor(BigDecimal currentPrice) {
		if (currentPrice.compareTo(PENNY_STOCK_P) == -1
				|| currentPrice.compareTo(PENNY_STOCK_P) == 0) {
			return JUNK_STOCK_MIRACLE_MULTIPLIER;
		} else if (currentPrice.compareTo(STOCK_P_HIGH_BAR) == 1
				|| currentPrice.compareTo(STOCK_P_HIGH_BAR) == 0) {
			return STOCK_P_HIGH_BAR_CRASH;
		}

		BigDecimal factor = BigDecimal.valueOf(0);
		Random rand = new Random();
		int y = rand.nextInt(STOCK_CHANGE_MAX_PERCENT.subtract(BigDecimal.ONE)
				.intValue());
		y = y + 1;
		int x = rand.nextInt();

		if (x % 2 == 0) {
			factor = BigDecimal.ONE.subtract((BigDecimal.valueOf(y))
					.divide(BigDecimal.valueOf(100)));// / 100m;
		} else
			factor = BigDecimal.ONE.add(BigDecimal.ONE.add(BigDecimal
					.valueOf(y).divide(BigDecimal.valueOf(100))));
		return factor;
	}

	public static Date convertToSqlDate(Calendar calendar) {
		return new Date(calendar.getTimeInMillis());
	}

	public static Calendar convertToCalendar(Date date) {
		Calendar calendar = Calendar.getInstance();
		calendar.setTimeInMillis(date.getTime());
		return calendar;
	}

	public static BigDecimal getOrderFee(String orderType) {
		if (StockTraderUtility.ORDER_TYPE_BUY.equals(orderType)
				|| StockTraderUtility.ORDER_TYPE_SELL.equals(orderType)) {
			return BUY_FEE;
		} else {
			return SELL_FEE;
		}
	}

}
