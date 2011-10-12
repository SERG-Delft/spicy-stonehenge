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
 
 package nl.tudelft.stocktrader.derby;

import nl.tudelft.stocktrader.dal.ConnectionProvider;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.DriverManager;
import java.util.Properties;

public class DerbyConnectionProvider implements ConnectionProvider{

    private static Log logger = LogFactory.getLog(DerbyConnectionProvider.class);
    private Connection sqlConnection = null;
    private String connection = null;

    static {
        try {
            Class.forName("org.apache.derby.jdbc.ClientDriver");
        } catch (ClassNotFoundException e) {
            logger.warn("Unable to load DBDrive class", e);
        }
    }

    private String getConnectionString(Properties prop) {
        if (connection == null) {
			if (prop == null || prop.size()<=0) {
                connection = "jdbc:derby://localhost:1527/stocktraderdb?user=trade&password=yyy";
            } else {
                StringBuffer buf = new StringBuffer();
                buf.append("jdbc:derby://");
                buf.append(prop.getProperty(PROP_DB_HOST));
                buf.append(":" + prop.getProperty(PROP_DB_PORT));
                buf.append("/" + prop.getProperty(PROP_DB_NAME));
                //buf.append("?user=" + prop.getProperty(PROP_DB_USER));
                //buf.append("&password=" + prop.getProperty(PROP_DB_PASSWORD));
                connection = buf.toString();
            }
        }

        if (logger.isDebugEnabled()) {
            logger.debug("DerbyDAOFactory.getConnectionString()\nConnection :" + connection);
        }
        return connection;
    }

    public Connection provide(Properties prop) throws SQLException {
        if (sqlConnection == null || sqlConnection.isClosed()) {
            sqlConnection = DriverManager.getConnection(getConnectionString(prop));
        }
        return sqlConnection;
    }
}
