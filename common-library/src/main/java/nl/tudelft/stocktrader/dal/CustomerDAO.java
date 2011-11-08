package nl.tudelft.stocktrader.dal;
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
import java.util.List;

import nl.tudelft.stocktrader.Account;
import nl.tudelft.stocktrader.AccountProfile;
import nl.tudelft.stocktrader.Holding;
import nl.tudelft.stocktrader.Order;
import nl.tudelft.stocktrader.Wallet;

public interface CustomerDAO {

	public Holding getHoldingForUpdate(int orderId)
			throws DAOException;

	public Holding getHolding(String userId, int holdingID)
			throws DAOException;

	public void updateAccountBalance(int accountId, BigDecimal total)
			throws DAOException;

	public Account login(String userId, String password)
			throws DAOException;

	public void logoutUser(String userId) throws DAOException;

	public Account getCustomerByUserId(String userId)
			throws DAOException;

	public AccountProfile getAccountProfileData(String userId)
			throws DAOException;

	public List<Order> getOrders(String userId, boolean top,
			int maxTop, int maxDefault) throws DAOException;

	public List<Order> getClosedOrders(String userId)
			throws DAOException;

	public boolean insertAccountProfile(AccountProfile accountProfileBean)
			throws DAOException;

	public boolean insertAccount(Account accountBean)
			throws DAOException;

	public AccountProfile update(AccountProfile customAccountProfile) 
			throws DAOException;

	public List<Holding> getHoldings(String userID)
			throws DAOException;

	public boolean insertWallet(Wallet wallet)
			throws DAOException;
	
	public Wallet getWallet(String userID)
			throws DAOException;
	
	public Wallet updateWallet(Wallet wallet)
			throws DAOException;
	
}
