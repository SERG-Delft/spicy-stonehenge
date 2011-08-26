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

package nl.tudelft.stocktrader.mysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import nl.tudelft.stocktrader.dal.CustomerDAO;
import nl.tudelft.stocktrader.dal.DAOException;
import nl.tudelft.stocktrader.dal.DAOFactory;
import nl.tudelft.stocktrader.dal.MarketSummaryDAO;
import nl.tudelft.stocktrader.dal.OrderDAO;
import nl.tudelft.stocktrader.mysql.MySQLCustomerDAO;
import nl.tudelft.stocktrader.mysql.MySQLOrderDAO;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class MySQLDAOFactory extends DAOFactory {

	private static Log logger = LogFactory.getLog(MySQLDAOFactory.class);
	private static MySQLDAOFactory self = null;

	private Connection sqlConnection = null;

	private String connection = null;

    static {
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			logger.warn("Unable to load DBDrive class", e);
		}
	}

	public static DAOFactory getInstance() {
		if (self == null) {
			self = new MySQLDAOFactory();
		}
		return self;
	}

	private MySQLDAOFactory() {
	}

	public OrderDAO getOrderDAO() throws DAOException {
		logger.debug("MySQLDAOFactory.getOrderDAO");
		try {
			OrderDAO orderDAO = new MySQLOrderDAO(getConnection());
			return orderDAO;
		} catch (SQLException e) {
			logger.debug("", e);
			throw new DAOException("Exception was thrown when instantiating MySQLOrderDAO object",e);
		}
	}

	public CustomerDAO getCustomerDAO() throws DAOException {
		logger.debug("MySQLDAOFactory.getCustomerDAO");
		try {
			CustomerDAO customerDAO = new MySQLCustomerDAO(getConnection());
			return customerDAO;
		} catch (SQLException e) {
			logger.debug("", e);
			throw new DAOException("Exception was thrown when instantiating a MySQLCustomerDAO",e);
		}
	}

	public MarketSummaryDAO getMarketSummaryDAO() throws DAOException {
		logger.debug("MySQLDAOFactory.getMarketSummaryDAO");
		try {
			MarketSummaryDAO marketSummaryDAO = new MySQLMarketSummaryDAO(getConnection());
			return marketSummaryDAO;
		} catch (SQLException e) {
			logger.debug("", e);
			throw new DAOException("Exception was thrown when instantiating a MarketSummaryDAO",e);
		}
	}

	private String getConnectionString() {
		if (connection == null) {
            loadProperties();
            if (prop.size() <= 0) {
//			if (prop == null) {
				connection = "jdbc:mysql://localhost:3306/stocktraderdb?user=trade&password=yyy";
			} else {
				StringBuffer buf = new StringBuffer();
				buf.append("jdbc:mysql://");
				buf.append(prop.getProperty(PROP_DB_HOST));
				buf.append(":" + prop.getProperty(PROP_DB_PORT));
				buf.append("/" + prop.getProperty(PROP_DB_NAME));
				buf.append("?user=" + prop.getProperty(PROP_DB_USER));
				buf.append("&password=" + prop.getProperty(PROP_DB_PASSWORD));
				connection = buf.toString();
			}
		}

		if (logger.isDebugEnabled()) {
			logger.debug("MySQLDAOFactory.getConnectionString()\nConnection :"+ connection);
		}
		return connection;
	}

	private Connection getConnection() throws SQLException {
		if (sqlConnection == null || sqlConnection.isClosed()) {
			sqlConnection = DriverManager.getConnection(getConnectionString());
		}
		return sqlConnection;
	}
}
