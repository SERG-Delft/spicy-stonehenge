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

import nl.tudelft.ewi.st.atlantis.tudelft.v1.types.OrderData;
import nl.tudelft.stocktrader.Holding;
import nl.tudelft.stocktrader.Order;
import nl.tudelft.stocktrader.Quote;

public interface OrderDAO {

	public Quote getQuoteForUpdate(String symbol) throws DAOException;

	public int createHolding(Order order) throws DAOException;

	public void updateHolding(int holdingId, double quantity)
			throws DAOException;

	public void deleteHolding(int holdingId) throws DAOException;

	public Holding getHoldingForUpdate(int orderId)
			throws DAOException;

	public Holding getHolding(int holdingId) throws DAOException;

	public void updateAccountBalance(int accountId, BigDecimal total)
			throws DAOException;

	public Order createOrder(String userID, String symbol,
			String orderType, double quantity, int holdingID)
			throws DAOException;

	public void updateOrder(Order order) throws DAOException;

	public void updateStockPriceVolume(double quantity, Quote quote)
			throws DAOException;

	public void closeOrder(Order order) throws DAOException;

    public void beginTransaction() throws DAOException;

    public void commitTransaction() throws DAOException;

    public void rollbackTransaction() throws DAOException;

    public void close() throws DAOException;
}
