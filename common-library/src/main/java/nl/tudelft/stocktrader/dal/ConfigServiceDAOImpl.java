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
 
 package nl.tudelft.stocktrader.dal;

import nl.tudelft.stocktrader.dal.configservice.BSConfig;
import nl.tudelft.stocktrader.dal.configservice.ClientConfig;
import nl.tudelft.stocktrader.dal.configservice.OPSConfig;
import nl.tudelft.stocktrader.dal.configservice.ServiceLocation;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ConfigServiceDAOImpl implements ConfigServiceDAO {
    private static Log logger = LogFactory.getLog(ConfigServiceDAOImpl.class);

    private Connection connection;

    public ConfigServiceDAOImpl() {
    }

    public void setConnection(Connection connection) {
        this.connection = connection;
    }

    private static final String SQL_SELECT_BSLOCATION_FROM_SERVICE = "SELECT servicename,url,sec FROM SERVICE WHERE SERVICENAME LIKE '%_BS%'";
    private static final String SQL_SELECT_OPSLOCATION_FROM_SERVICE = "SELECT servicename,url,sec FROM SERVICE WHERE SERVICENAME LIKE '%_OPS%'";
    private static final String SQL_INSERT_VALUE_INTO_CLIENT_TO_BS = "INSERT INTO CLIENTTOBS (CLIENT , BS) VALUES (?,?);";
    private static final String SQL_UPDATE_CLIENT_TO_BS = "UPDATE CLIENTTOBS SET BS=? WHERE CLIENT = ?;";
    private static final String SQL_INSERT_VALUE_INTO_BS_TO_OPS = "INSERT INTO BSTOOPS (BS, OPS) VALUES (?,?);";
    private static final String SQL_UPDATE_BS_TO_OPS = "UPDATE BSTOOPS SET OPS=? WHERE BS  = ?;";
    private static final String SQL_SELECT_BSSERVICE_ADDRESS_BY_ClIENTNAME = "SELECT servicename,url,sec FROM SERVICE INNER JOIN CLIENTTOBS ON SERVICE.SERVICENAME = CLIENTTOBS.BS  WHERE CLIENT=?";
    private static final String SQL_SELECT_OPSSERVICE_ADDRESS_BY_CLIENTNAME = "SELECT servicename,url,sec,DBNAME, HOSTNAME,PORT FROM SERVICE INNER JOIN BSTOOPS ON SERVICE.SERVICENAME = BSTOOPS.OPS CROSS JOIN DBCONFIG WHERE BSTOOPS.BS=?";
    private static final String SQL_SELECT_FROM_CLIENTTOBS = "SELECT * FROM CLIENTTOBS WHERE CLIENT = ?;";
    private static final String SQL_SELECT_FROM_BSTOOPS = "SELECT * FROM BSTOOPS WHERE BS = ?;";
    private static final String SQL_SELECT_OPS_CONFIG = "SELECT * FROM DBCONFIG;";
    private static final String SQL_UPDATE_SERVICE = "UPDATE SERVICE SET URL = ?, SEC = ? WHERE SERVICENAME = ?;";
    private static final String SQL_SELECT_SERVICE = "SELECT * FROM SERVICE WHERE SERVICENAME = ?;";
    private static final String SQL_INSERT_VALUE_INTO_SERVICE = "INSERT INTO SERVICE VALUES (?,?,?);";

    public List<ServiceLocation> getBSLocations() {
        return (List<ServiceLocation>) executeQuery(new SimpleStatementPopulator(SQL_SELECT_BSLOCATION_FROM_SERVICE),
                new ServiceResultSetExtractor());
    }

    public List<ServiceLocation> getOPSLocations() {
        return (List<ServiceLocation>) executeQuery(new SimpleStatementPopulator(SQL_SELECT_OPSLOCATION_FROM_SERVICE),
                new ServiceResultSetExtractor());
    }

    public ClientConfig getClientConfig(String clientName) {
        return (ClientConfig) executeQuery(
                new SimpleStatementPopulator(SQL_SELECT_BSSERVICE_ADDRESS_BY_ClIENTNAME, clientName),
                new ClientConfigResponseResultSetExtractor());
    }

    public BSConfig getBSConfig(String bsName) {
        return (BSConfig) executeQuery(
                new SimpleStatementPopulator(SQL_SELECT_OPSSERVICE_ADDRESS_BY_CLIENTNAME, bsName),
                new BSConfigResponseResultSetExtractor());
    }

    public OPSConfig getOPSConfig(String opsName) {
        return (OPSConfig) executeQuery(new SimpleStatementPopulator(SQL_SELECT_OPS_CONFIG),
                new OPSConfigResponseResultSetExtractor());
    }

    public boolean setClientToBS(String clientName, String bsName) {
        StatementPopulator queryStatement = new SimpleStatementPopulator(SQL_SELECT_FROM_CLIENTTOBS, clientName);
        StatementPopulator updateStatement = new SimpleStatementPopulator(SQL_UPDATE_CLIENT_TO_BS, bsName, clientName);
        StatementPopulator insertStatement = new SimpleStatementPopulator(SQL_INSERT_VALUE_INTO_CLIENT_TO_BS,
                clientName, bsName);
        return executeTransaction(
                new SaveOrUpdateTransactionCallback(queryStatement, updateStatement, insertStatement));
    }

    public boolean setBSToOPS(String bs, String ops) {
        StatementPopulator queryStatement = new SimpleStatementPopulator(SQL_SELECT_FROM_BSTOOPS, bs);
        StatementPopulator updateStatement = new SimpleStatementPopulator(SQL_UPDATE_BS_TO_OPS, ops, bs);
        StatementPopulator insertStatement = new SimpleStatementPopulator(SQL_INSERT_VALUE_INTO_BS_TO_OPS,
                bs, ops);
        return executeTransaction(
                new SaveOrUpdateTransactionCallback(queryStatement, updateStatement, insertStatement));
    }

    public boolean setServiceLocation(final String serviceName, final String serviceUrl, final Boolean isSec) {
        int sec = (isSec == true) ? 1 : 0;
        StatementPopulator queryStatement = new SimpleStatementPopulator(SQL_SELECT_SERVICE, serviceName);
        StatementPopulator updateStatement = new SimpleStatementPopulator(SQL_UPDATE_SERVICE, serviceUrl, sec,
                serviceName);
        StatementPopulator insertStatement = new SimpleStatementPopulator(SQL_INSERT_VALUE_INTO_SERVICE, serviceName,
                serviceUrl, sec);
        return executeTransaction(
                new SaveOrUpdateTransactionCallback(queryStatement, updateStatement, insertStatement));
    }

    class SaveOrUpdateTransactionCallback implements TransactionCallback {
        private final StatementPopulator queryStatementPopulator;
        private final StatementPopulator updateStatementPopulator;
        private final StatementPopulator insertStatementPopulator;

        SaveOrUpdateTransactionCallback(
                StatementPopulator queryStatementPopulator,
                StatementPopulator updateStatementPopulator,
                StatementPopulator insertStatementPopulator) {
            this.queryStatementPopulator = queryStatementPopulator;
            this.updateStatementPopulator = updateStatementPopulator;
            this.insertStatementPopulator = insertStatementPopulator;
        }

        public void executeTransaction(Connection connection) throws SQLException {
            boolean hasEntry = checkUpdateStatus(queryStatementPopulator, connection);
            if (hasEntry) {
                executeUpdate(updateStatementPopulator, connection);
            } else {
                executeInsert(insertStatementPopulator, connection);
            }
        }

        private boolean checkUpdateStatus(StatementPopulator statementPopulator, Connection connection) throws
                SQLException {
            PreparedStatement statement1 = statementPopulator.populateStatement(connection);
            ResultSet resultSet = statement1.executeQuery();
            boolean hasEntry = resultSet.next();
            return hasEntry;
        }

        private void executeUpdate(StatementPopulator updateStatementPopulator, Connection connection) throws
                SQLException {
            PreparedStatement statement2 = updateStatementPopulator.populateStatement(connection);
            statement2.executeUpdate();
        }

        private void executeInsert(StatementPopulator insertStatementPopulator, Connection connection) throws
                SQLException {
            PreparedStatement statement3 = insertStatementPopulator.populateStatement(connection);
            statement3.executeUpdate();
        }
    }

    private class SimpleStatementPopulator implements StatementPopulator {
        private final String sql;
        private final Object[] params;

        private SimpleStatementPopulator(String sql, Object... params) {
            this.sql = sql;
            this.params = params;
        }

        public PreparedStatement populateStatement(Connection connection) throws
                SQLException {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            int index = 1;
            for (Object param : params) {
                preparedStatement.setObject(index++, param);
            }
            return preparedStatement;
        }

    }

    class ServiceResultSetExtractor implements ResultSetExtractor<List<ServiceLocation>> {

        public List<ServiceLocation> extractResultSet(ResultSet rs) throws SQLException {
            List<ServiceLocation> serviceLocations = new ArrayList<ServiceLocation>();
            while (rs.next()) {
                ServiceLocation serviceLocation = new ServiceLocation(rs.getString("serviceName"),
                													  rs.getString("url"),
                													  rs.getBoolean("sec"));
                serviceLocations.add(serviceLocation);
            }
            return serviceLocations;
        }

    }

    class OPSConfigResponseResultSetExtractor implements ResultSetExtractor<OPSConfig> {
        public OPSConfig extractResultSet(ResultSet rs) throws SQLException {
        	OPSConfig response = null;
            while (rs.next()) {
            	response = new OPSConfig(rs.getString("dbname"),
            							 rs.getString("hostname"),
            							 rs.getInt("port"));
            }
            return response;
        }
    }

    class ClientConfigResponseResultSetExtractor implements ResultSetExtractor<ClientConfig> {
        public ClientConfig extractResultSet(ResultSet rs) throws SQLException {
            ClientConfig response = null;
            while (rs.next()) {
            	response = new ClientConfig(rs.getString("serviceName"),
            								rs.getString("url"),
            								rs.getBoolean("sec"));
            }
            return response;
        }
    }

    class BSConfigResponseResultSetExtractor implements ResultSetExtractor<BSConfig> {

        public BSConfig extractResultSet(ResultSet rs) throws SQLException {
        	BSConfig response = null;
            while (rs.next()) {
            	response = new BSConfig(rs.getString("serviceName"),
            							rs.getString("url"),
            							rs.getBoolean("sec"),
            							rs.getString("dbname"),
            							rs.getString("hostname"),
            							rs.getInt("port"));
            }
            return response;
        }
    }

    private interface StatementPopulator {
        public PreparedStatement populateStatement(Connection connection) throws SQLException;
    }

    private interface ResultSetExtractor<T> {
        T extractResultSet(ResultSet rs) throws SQLException;
    }

    private Object executeQuery(StatementPopulator stPopulator, ResultSetExtractor rsExtractor) {
        Object result = null;
        ResultSet rs = null;
        try {
            PreparedStatement statement = stPopulator.populateStatement(connection);
            rs = statement.executeQuery();
            result = rsExtractor.extractResultSet(rs);
        } catch (SQLException exception) {
            logger.error(exception, exception);
        }
        finally {
            try {
                if (rs != null) {
                    rs.close();
                }
                try {
                    if (connection != null && !connection.isClosed()) {
                        connection.close();
                    }
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            } catch (SQLException exception) {
                logger.error(exception, exception);
            }
        }
        return result;
    }

    interface TransactionCallback {
        void executeTransaction(Connection connection) throws SQLException;
    }

    private boolean executeTransaction(TransactionCallback transactionCallback) {
        try {
            connection.setAutoCommit(false);

            transactionCallback.executeTransaction(connection);

            connection.commit();
            return true;
        } catch (SQLException e) {
            try {
                connection.rollback();
            } catch (SQLException e1) {
                e1.printStackTrace();
            }
            logger.error(e, e);
            return false;
        } finally {
            try {
                connection.setAutoCommit(true);
                if (connection != null && !connection.isClosed()) {
                    connection.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
