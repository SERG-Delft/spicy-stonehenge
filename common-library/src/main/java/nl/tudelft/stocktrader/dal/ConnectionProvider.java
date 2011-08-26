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

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Properties;

public interface ConnectionProvider {

    String PROP_DB_HOST = "org.apache.stonehenge.stocktrader.database.host";
    String PROP_DB_PORT = "org.apache.stonehenge.stocktrader.database.port";
    String PROP_DB_NAME = "org.apache.stonehenge.stocktrader.database.db";
    String PROP_DB_USER = "org.apache.stonehenge.stocktrader.database.user";
    String PROP_DB_PASSWORD = "org.apache.stonehenge.stocktrader.database.password";

    Connection provide(Properties properties) throws SQLException;
}
