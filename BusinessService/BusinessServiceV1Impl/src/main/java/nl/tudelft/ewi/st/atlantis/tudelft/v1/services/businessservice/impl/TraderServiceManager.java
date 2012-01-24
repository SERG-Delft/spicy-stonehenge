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

package nl.tudelft.ewi.st.atlantis.tudelft.v1.services.businessservice.impl;

import java.math.BigDecimal;

import java.util.List;

import nl.tudelft.ewi.st.atlantis.tudelft.v1.services.orderprocessorservice.SharedOrderProcessorServiceV1Consumer;
import nl.tudelft.ewi.st.atlantis.tudelft.v1.types.SubmitOrderRequest;
import nl.tudelft.stocktrader.Account;
import nl.tudelft.stocktrader.AccountProfile;
import nl.tudelft.stocktrader.Holding;
import nl.tudelft.stocktrader.MarketSummary;
import nl.tudelft.stocktrader.Order;
import nl.tudelft.stocktrader.Quote;
import nl.tudelft.stocktrader.TypeFactory;
import nl.tudelft.stocktrader.Wallet;
import nl.tudelft.stocktrader.dal.CustomerDAO;
import nl.tudelft.stocktrader.dal.DAOException;
import nl.tudelft.stocktrader.dal.DAOFactory;
import nl.tudelft.stocktrader.dal.MarketSummaryDAO;
import nl.tudelft.stocktrader.dal.OrderDAO;
import nl.tudelft.stocktrader.util.StockTraderUtility;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class TraderServiceManager {

  static {
    //WORKAROUND. TO BE REMOVED.
    javax.net.ssl.HttpsURLConnection.setDefaultHostnameVerifier(
      new javax.net.ssl.HostnameVerifier(){
        public boolean verify(String hostname, javax.net.ssl.SSLSession sslSession) {
            return true;
        }});
      
  }
                    
	private static final Log logger = LogFactory
			.getLog(TraderServiceManager.class);

	private DAOFactory factory = null;

  public TraderServiceManager() {
		factory = DAOFactory.getFactory();
	}

	public Account login(String userId, String password)
			throws DAOException {
		CustomerDAO customerDAO = factory.getCustomerDAO();
		return customerDAO.login(userId, password);
	}

	public void logout(String userId) throws DAOException {
		CustomerDAO customerDAO = factory.getCustomerDAO();
		customerDAO.logoutUser(userId);
	}

	public Account getAccountData(String userId) throws DAOException {
		CustomerDAO customerDAO = factory.getCustomerDAO();
		return customerDAO.getCustomerByUserId(userId);
	}

	public AccountProfile getAccountProfileData(String userId)
			throws DAOException {
		CustomerDAO customerDAO = factory.getCustomerDAO();
		return customerDAO.getAccountProfileData(userId);
	}

	public List<Order> getOrders(String userId) throws DAOException {
		CustomerDAO customerDAO = factory.getCustomerDAO();
		return customerDAO.getOrders(userId, false,
				StockTraderUtility.MAX_QUERY_TOP_ORDERS,
				StockTraderUtility.MAX_QUERY_ORDERS);
	}

	public List<Order> getTopOrders(String userId)
			throws DAOException {
		CustomerDAO customerDAO = factory.getCustomerDAO();
		return customerDAO.getOrders(userId, true,
				StockTraderUtility.MAX_QUERY_TOP_ORDERS,
				StockTraderUtility.MAX_QUERY_ORDERS);
	}

	public List<Order> getCompletedOrders(String userId)
			throws DAOException {
		CustomerDAO customerDAO = factory.getCustomerDAO();
		return customerDAO.getCompletedOrders(userId);
	}

	public String register(String userId, String password,
			String fullName, String address, String email, String creditcard,
			BigDecimal openBalance, String currencyType) throws DAOException {
		
		String result;
		CustomerDAO customerDAO = factory.getCustomerDAO();
		if(customerDAO.getAccountProfileData(userId)==null){
			Account a = new Account();
			a.setUserID(userId);
			a.setOpenBalance(openBalance);
			a.setBalance(openBalance);
			a.setCurrencyType(currencyType);
			a.setLogoutCount(0);			
			boolean insertAccount = customerDAO.insertAccount(a);
			boolean insertAP = customerDAO.insertAccountProfile(new AccountProfile(userId, password, 
											fullName, address, email, creditcard));	
			//also need to insert wallet
			Wallet wallet = new Wallet(userId);
			wallet.setMoney(currencyType, openBalance);
			boolean insertWallet = customerDAO.insertWallet(wallet);
			if(insertAP && insertAccount && insertWallet)
				result = "success";
			else
				result = "failed";
		}else
			result = "userexist";	

		return result;
	}

//	public CustomAccountBean addNewRegisteredUser(String userId,
//			String password, String fullName, String address, String email,
//			String creditcard, BigDecimal openBalance) throws DAOException {
//		CustomerDAO customerDAO = factory.getCustomerDAO();
//		CustomAccountProfileBean customerProfile = new CustomAccountProfileBean(
//				userId, password, fullName, address, email, creditcard);
//		customerDAO.insertAccountProfile(customerProfile);
//		CustomAccountBean customer = new CustomAccountBean(0, userId, Calendar
//				.getInstance(), openBalance, 0, openBalance, Calendar
//				.getInstance(), 0);
//		return customer;
//	}

	public AccountProfile updateAccountProfile(
			AccountProfile customAccountProfile) throws DAOException {
		CustomerDAO customerDAO = factory.getCustomerDAO();
		return customerDAO.update(customAccountProfile);
	}

	public MarketSummary getMarketSummary() throws DAOException {
		MarketSummaryDAO marketSummaryDAO = factory.getMarketSummaryDAO();
		return marketSummaryDAO.getCustomMarketSummary();
	}

	public Quote getQuote(String symbol) throws DAOException {
		MarketSummaryDAO marketSummaryDAO = factory.getMarketSummaryDAO();
		return marketSummaryDAO.getQuote(symbol);
	}

	public List<Quote> getAllQuotes() throws DAOException {
		MarketSummaryDAO marketSummaryDAO = factory.getMarketSummaryDAO();
		return marketSummaryDAO.getAllQuotes();	
	}
	
	public Order buy(String userID, String symbol, double quantity)
			throws DAOException {
		return placeOrder(StockTraderUtility.ORDER_TYPE_BUY, userID, 0, symbol,
				quantity);
	}

	public Order sell(String userID, int holdingID,
			int orderProcessingMode) throws DAOException {
		return placeOrder(StockTraderUtility.ORDER_TYPE_SELL, userID,
				holdingID, null, 0);
	}

	public Order sellEnhanced(String userID, int holdingID,
			double quantity) throws DAOException {
		return placeOrder(StockTraderUtility.ORDER_TYPE_SELL_ENHANCED, userID,
				holdingID, null, quantity);
	}

	private Order placeOrder(String orderType, String userID,
			int holdingID, String symbol, double quantity) throws DAOException {
		
	  	
	  System.setProperty("java.net.debug", "ssl,handshake");	
	  	
		OrderDAO orderDAO = factory.getOrderDAO();
		Order order = null;
		Holding holding = new Holding();
		try {

			orderDAO.beginTransaction();
			order = createOrder(orderType, userID, holdingID, symbol, quantity,
					holding);

			SharedOrderProcessorServiceV1Consumer asynClient = new SharedOrderProcessorServiceV1Consumer("BusinessService","production");
			
			SubmitOrderRequest request = new SubmitOrderRequest();
			request.setData(TypeFactory.toOrderData(order));

			asynClient.submitOrderAsync(request);
			orderDAO.commitTransaction();
			return order;
		} catch (Exception e) {
			try {
				orderDAO.rollbackTransaction();
			} catch (DAOException e2) {
				throw e2;
			}
            logger.error(e);
			throw new RuntimeException(e);
		}
	}

	private Order createOrder(String orderType, String userID,
			int holdingID, String symbol, double quantity,
			Holding holding) throws DAOException {
		Order order = null;
		OrderDAO orderDAO = factory.getOrderDAO();

		if (StockTraderUtility.ORDER_TYPE_SELL.equals(orderType)) {
			// CHECKME holding is the argument
			holding = orderDAO.getHolding(holdingID);
			if (holding == null) {
				throw new DAOException("No holding entry found for HoldingID<"
						+ holdingID + ">");
			}
			order = orderDAO.createOrder(userID, holding.getQuoteId(),
					StockTraderUtility.ORDER_TYPE_SELL, holding.getQuantity(),
					holdingID);
		} else if (StockTraderUtility.ORDER_TYPE_SELL_ENHANCED
				.equals(orderType)) {
			holding = orderDAO.getHolding(holdingID);
			if (holding == null) {
				throw new DAOException("No holding entry found for HoldingID<"
						+ holdingID + ">");
			}
			if (quantity > holding.getQuantity()) {
				order = orderDAO.createOrder(userID, holding.getQuoteId(),
						StockTraderUtility.ORDER_TYPE_SELL, holding
								.getQuantity(), holdingID);
			} else {
				order = orderDAO
						.createOrder(userID, holding.getQuoteId(),
								StockTraderUtility.ORDER_TYPE_SELL, quantity,
								holdingID);
			}
		} else if (StockTraderUtility.ORDER_TYPE_BUY.equals(orderType)) {
			order = orderDAO.createOrder(userID, symbol,
					StockTraderUtility.ORDER_TYPE_BUY, quantity, -1);
		} else {
			throw new IllegalArgumentException("Invalid orderType<" + orderType
					+ ">");
		}
		return order;
	}

	public Holding getHolding(String userID, int holdingID)
			throws DAOException {
		CustomerDAO customerDAO = factory.getCustomerDAO();
		return customerDAO.getHolding(userID, holdingID);
	}

	public List<Holding> getHoldings(String userID)
			throws DAOException {
		CustomerDAO customerDAO = factory.getCustomerDAO();
		return customerDAO.getHoldings(userID);
	}
	
	public Wallet getWallet(String userID) 
			throws DAOException {
		CustomerDAO customerDAO = factory.getCustomerDAO();
		return customerDAO.getWallet(userID);
		
	}
	
	public Wallet updateWallet(Wallet wallet) throws DAOException{
		CustomerDAO customerDAO = factory.getCustomerDAO();
		return customerDAO.updateWallet(wallet);
	}

}
