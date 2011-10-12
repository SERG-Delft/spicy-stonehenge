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


import java.sql.Connection;
import java.sql.SQLException;
import java.util.Properties;
import java.io.InputStream;
import java.io.IOException;

import nl.tudelft.stocktrader.derby.DerbyConnectionProvider;
import nl.tudelft.stocktrader.derby.DerbyDAOFactory;
import nl.tudelft.stocktrader.util.StockTraderUtility;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public abstract class DAOFactory {
    public static final String PROP_DB_HOST = "org.apache.stonehenge.stocktrader.database.host";
    public static final String PROP_DB_PORT = "org.apache.stonehenge.stocktrader.database.port";
    public static final String PROP_DB_NAME = "org.apache.stonehenge.stocktrader.database.db";
    public static final String PROP_DB_USER = "org.apache.stonehenge.stocktrader.database.user";
    public static final String PROP_DB_PASSWORD = "org.apache.stonehenge.stocktrader.database.password";
    public static final String PROP_DB_TYPE = "org.apache.stonehenge.stocktrader.database.type";

    public static Properties prop = null;
 
    private static ConnectionProvider connectionProvider;
    
    public abstract CustomerDAO getCustomerDAO() throws DAOException;

    public abstract MarketSummaryDAO getMarketSummaryDAO() throws DAOException;

    public abstract OrderDAO getOrderDAO() throws DAOException;

    public static DAOFactory getFactory() {
        DAOFactory factory;
        loadProperties();
        if ("mysql".equals(prop.getProperty(PROP_DB_TYPE))) {
            //factory = MySQLDAOFactory.getInstance();
            //return factory;
        	throw new IllegalArgumentException("Disabling MySQL");
        } else if ("mssql".equals(prop.getProperty(PROP_DB_TYPE))) {
        	//TIAGO: Disabled for now.
        	System.out.println("TIAGO: DISABLED FOR NOW");
        	return null;
//            factory = MSSQLDAOFactory.getInstance();
//            return factory;
        } else if ("derby".equals(prop.getProperty(PROP_DB_TYPE))) {
        	factory = DerbyDAOFactory.getInstance();
        	return factory;
        } else {
            throw new IllegalArgumentException("Unknown Database type " + prop.getProperty(PROP_DB_TYPE));
        }
    }
    
    private ConfigServiceDAOImpl configServiceDAO;

    public DAOFactory() {
        configServiceDAO = new ConfigServiceDAOImpl();
        loadProperties();
    }
    
    public ConfigServiceDAO getConfigServiceDAO() {
        if ("mysql".equals(prop.getProperty(PROP_DB_TYPE))) {
            //connectionProvider = new MySQLConnectionProvider();
        	throw new IllegalArgumentException("Disabling MySQL");
        } else if ("mssql".equals(prop.getProperty(PROP_DB_TYPE))) {
            // Tiago: Disabled for now!
        	System.out.println("Disabled MSSQL for now! Check DAOFactory if enabling it.");
        	connectionProvider = null;
        	//connectionProvider = new MSSQLConnectionProvider();
        } else if ("derby".equals(prop.getProperty(PROP_DB_TYPE))) {
        	connectionProvider = new DerbyConnectionProvider();
        } else {
            throw new IllegalArgumentException("Unknown Database type " + prop.getProperty(PROP_DB_TYPE));
        }
        Connection connection;
        try {
            connection = connectionProvider.provide(prop);
        } catch (SQLException e) {
            e.printStackTrace();
            throw new RuntimeException(e.getMessage(), e);
        }
        configServiceDAO.setConnection(connection);
        return configServiceDAO;
    }

    public static void loadProperties() {
        Log logger = LogFactory.getLog(DAOFactory.class);
        if (prop == null) {
            prop = new Properties();
//			MessageContext messageContext = MessageContext.getCurrentMessageContext();
//			if (messageContext != null) {
//				AxisService service = messageContext.getAxisService();
//				ClassLoader serviceClassLoader = service.getClassLoader();
//				InputStream is = serviceClassLoader.getResourceAsStream(StockTraderUtility.DB_PROPERRTIES_FILE);
//				if (is != null) {
//					try {
//						prop.load(is);
//					} catch (IOException e) {
//						logger.debug("Unable to load mysql-db properties file and using [jdbc:mysql://localhost/stocktraderdb?user=trade&password=trade] as the default connection",e);
//					}
//				} else {
//					logger.debug("Unable to load mysql-db properties file and using [jdbc:mysql://localhost/stocktraderdb?user=trade&password=trade] as the default connection");
//
//				}
//			}

            InputStream is = DAOFactory.class.getClassLoader()
                    .getResourceAsStream(StockTraderUtility.DB_PROPERRTIES_FILE);
            if (is != null) {
                try {
                    prop.load(is);
                } catch (IOException e) {
                    logger.debug("Unable to load mysql-db properties file and using [jdbc:mysql://localhost/stocktraderdb?user=trade&password=trade] as the default connection", e);
                }
            } else {
                logger.debug("Unable to load mysql-db properties file and using [jdbc:mysql://localhost/stocktraderdb?user=trade&password=trade] as the default connection");

            }
        }
    }

}