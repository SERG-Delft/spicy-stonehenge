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

import java.sql.Connection;
import java.sql.SQLException;

import nl.tudelft.stocktrader.dal.DAOException;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class AbstractDerbyDAO {

	private static final Log logger = LogFactory.getLog(AbstractDerbyDAO.class);

	protected Connection sqlConnection;

	private int previousTransactionIsolation;

	public AbstractDerbyDAO(Connection sqlConnection) throws DAOException {
		this.sqlConnection = sqlConnection;
	}

	public void beginTransaction() throws DAOException {
		logger.debug("AbstractMSSQLDAO.beginTransaction()");
		try {
			sqlConnection.setAutoCommit(false);
			previousTransactionIsolation = sqlConnection.getTransactionIsolation();
			sqlConnection.setTransactionIsolation(Connection.TRANSACTION_READ_COMMITTED);
		} catch (SQLException e) {
			e.printStackTrace();
			logger.debug("", e);
			throw new DAOException("Exception was thrown during the start of transaction", e);
		}
	}

	public void commitTransaction() throws DAOException {
		logger.debug("AbstractMSSQLDAO.commitTransaction()");
		try {
			sqlConnection.commit();
			sqlConnection.setAutoCommit(true);
			sqlConnection.setTransactionIsolation(previousTransactionIsolation);
		} catch (SQLException e) {
			throw new DAOException("Exception is thrown during the commit of transaction", e);
		}
	}

	public void rollbackTransaction() throws DAOException {
		logger.debug("AbstractMySQLDAO.rollbackTransaction()");
		try {
			sqlConnection.rollback();
			sqlConnection.setAutoCommit(true);
			sqlConnection.setTransactionIsolation(previousTransactionIsolation);
		} catch (SQLException e) {
			throw new DAOException("Exception is thrown during the rollback of transaction", e);

		}
	}

	public void close() throws DAOException {
		try {
			sqlConnection.close();
		} catch (SQLException e) {
			throw new DAOException("", e);
		}
	}
}
