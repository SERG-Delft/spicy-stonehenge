package nl.tudelft.ewi.st.atlantis.tudelft.v1.services.businessservice.test;

import static org.junit.Assert.*;

import java.io.File;
import java.io.PrintWriter;
import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Calendar;
import java.util.Properties;

import nl.tudelft.ewi.st.atlantis.tudelft.v1.services.businessservice.impl.TraderServiceManager;
import nl.tudelft.stocktrader.Account;
import nl.tudelft.stocktrader.dal.DAOException;
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

public class TraderServiceManagerTest {
	
	private static NetworkServerControl server = null;
	private static Connection conn = null;
	
	@Before
	public void setUp() throws Exception {
		  //FileUtils.copyFileToDirectory(new File("resources/db.properties"), new File("./build/classes/nl/tudelft/ewi/st/atlantis/tudelft/v1/services/businessservice/impl/"));
		   
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
	public void testTraderServiceManager() {
		//how to create test case for constructor
	}

	@Test
	public void testLogin() throws DAOException {
		TraderServiceManager t = new TraderServiceManager();
		Account a = t.login("uid:0", "xxx");
		
		assertTrue("login failed", a != null);

		Calendar creationDate = Calendar.getInstance();
		creationDate.set(2011, 9, 8, 0, 0, 0);
		assertTrue("CreationDate of Account does not match expected", a.getCreationDate().equals(creationDate));
		assertTrue("OpenBalance of Account does not match expected", a.getOpenBalance().equals(BigDecimal.valueOf(100.00)));
		assertEquals("LogoutCount of Account does not match expected", (double)13, (double)a.getLogoutCount());
		assertTrue("Balance of Account does not match expected", a.getBalance().equals(BigDecimal.valueOf(200.00)));
		assertEquals("AccountID of Account does not match expected", (double)1, (double)a.getAccountID());
		Calendar lastLogin = Calendar.getInstance();
		lastLogin.set(2011, 11, 11, 15, 49, (int) 38.295);
		assertTrue("LastLogin of Account does not match expected", a.getLastLogin().equals(lastLogin));
		assertEquals("LoginCount of Account does not match expected", (double)36, (double)a.getLoginCount());
		assertTrue("UserID of Account does not match expected", a.getUserID().equals("uid:0"));
		assertTrue("ProfileID of Account does not match expected", a.getProfileID().equals("uid:0"));
		assertTrue("CurrencyType of Account does not match expected", a.getCurrencyType().equals("USD"));	
		
	}

	@Test
	public void testLogout() {
		
	}

	@Test
	public void testGetAccountData() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetAccountProfileData() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetOrders() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetTopOrders() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetClosedOrders() {
		fail("Not yet implemented");
	}

	@Test
	public void testRegister() {
		fail("Not yet implemented");
	}

	@Test
	public void testUpdateAccountProfile() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetMarketSummary() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetQuote() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetAllQuotes() {
		fail("Not yet implemented");
	}

	@Test
	public void testBuy() {
		fail("Not yet implemented");
	}

	@Test
	public void testSell() {
		fail("Not yet implemented");
	}

	@Test
	public void testSellEnhanced() {
		fail("Not yet implemented");
	}

	@Test
	public void testPlaceOrder() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetHolding() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetHoldings() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetWallet() {
		fail("Not yet implemented");
	}

	@Test
	public void testUpdateWallet() {
		fail("Not yet implemented");
	}

}
