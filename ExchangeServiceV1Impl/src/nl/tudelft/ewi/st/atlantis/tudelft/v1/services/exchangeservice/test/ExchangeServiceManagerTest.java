package nl.tudelft.ewi.st.atlantis.tudelft.v1.services.exchangeservice.test;

import static org.junit.Assert.*;

import java.io.File;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

import nl.tudelft.ewi.st.atlantis.tudelft.v1.services.exchangeservice.impl.ExchangeServiceManager;
import nl.tudelft.stocktrader.dal.DAOFactory;

import org.apache.commons.dbcp.BasicDataSource;
import org.apache.commons.io.FileUtils;
import org.apache.ddlutils.task.DdlToDatabaseTask;
import org.apache.ddlutils.task.WriteDataToDatabaseCommand;
import org.apache.ddlutils.task.WriteSchemaToDatabaseCommand;
import org.apache.derby.drda.NetworkServerControl;
import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class ExchangeServiceManagerTest {

	private static NetworkServerControl server = null;
	private static Connection conn = null;
	
	@Before
	public void setUp() throws Exception {
	   
		  DdlToDatabaseTask d = new DdlToDatabaseTask();
		  
		  WriteSchemaToDatabaseCommand writeCommand = new WriteSchemaToDatabaseCommand();
		  writeCommand.setDoDrops(true);
		  d.addWriteSchemaToDatabase(writeCommand);
		  
		  d.setSchemaFile(new File("resources/db-schema.xml"));
		  
		  BasicDataSource dataSource = new BasicDataSource();
		  dataSource.setDriverClassName("org.apache.derby.jdbc.ClientDriver");
		  dataSource.setUrl("jdbc:derby://localhost:1527/testdb");
		  
		  d.addConfiguredDatabase(dataSource);
		  
		  WriteDataToDatabaseCommand cmd = new WriteDataToDatabaseCommand();
		  cmd.setDataFile(new File("resources/db-data.xml"));
		  
		  d.addWriteDataToDatabase(cmd);
		  
		  d.execute();
	}
	
	@BeforeClass
	public static void setUpDatabase() throws Exception {
		Properties db = new Properties();
		  db.setProperty("org.apache.stonehenge.stocktrader.database.host","localhost");
		  db.setProperty("org.apache.stonehenge.stocktrader.database.db","testdb");
		  db.setProperty("org.apache.stonehenge.stocktrader.database.port","1527");
		  db.setProperty("org.apache.stonehenge.stocktrader.database.type","derby");		  
		  DAOFactory.prop = db;
		  PrintWriter p = new PrintWriter(System.out);		  
		  server = new NetworkServerControl();
		  server.start(p);
		  DriverManager.getConnection("jdbc:derby://localhost:1527/testdb;create=true");		
	}

	public static void tearDownDatabase() throws Exception {
		System.out.println("Test");
		conn.close();
		server.shutdown();
		  
		  try {
		   while(true) {
		    server.ping();
		    Thread.currentThread().sleep(1000);
		   }
		  } catch(Exception e) {}
		  
		  FileUtils.forceDelete(new File("testdb"));
		  FileUtils.forceDelete(new File("derby.log"));
	}
	
	@After
	public void tearDown() throws Exception {
		  
	}

	@Test
	public void testExchangeServiceManager() {
		fail("Not yet implemented");
	}

	@Test
	public void testCheckCurrency() {
		ExchangeServiceManager m = new ExchangeServiceManager();
		m.checkCurrency("uid:0", "", "");
	}

	@Test
	public void testCheckAmount() {
		fail("Not yet implemented");
	}

	@Test
	public void testExchangeCurrency() {
		fail("Not yet implemented");
	}

	@Test
	public void testUpdateWallet() {
		fail("Not yet implemented");
	}

}
