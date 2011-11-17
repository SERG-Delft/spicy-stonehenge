package nl.tudelft.ewi.st.atlantis.tudelft.v1.services.businessservice.test;

import static org.junit.Assert.*;

import java.io.File;
import java.io.PrintWriter;
import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Calendar;
import java.util.List;
import java.util.Properties;

import nl.tudelft.ewi.st.atlantis.tudelft.v1.services.businessservice.impl.TraderServiceManager;
import nl.tudelft.stocktrader.Account;
import nl.tudelft.stocktrader.AccountProfile;
import nl.tudelft.stocktrader.Order;
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
	public void testLogout() throws DAOException {
		TraderServiceManager t = new TraderServiceManager();
		t.logout("uid:0");
		
		Account a = t.getAccountData("uid:0");
		assertTrue("Logout doesn't match expected", a.getLogoutCount()!=14);
		
	}

	@Test
	public void testGetAccountData() throws DAOException {
		TraderServiceManager t = new TraderServiceManager();
		Account a = t.getAccountData("uid:0");
		
		assertTrue("getAccountData failed", a != null);

		Calendar creationDate = Calendar.getInstance();
		creationDate.set(2011, 9, 8, 0, 0, 0);
		assertTrue("CreationDate of Account does not match expected", a.getCreationDate().equals(creationDate));
		assertTrue("OpenBalance of Account does not match expected", a.getOpenBalance().equals(BigDecimal.valueOf(100.00)));
		assertEquals("LogoutCount of Account does not match expected", (double)13, (double)a.getLogoutCount());
		assertTrue("Balance of Account does not match expected", a.getBalance().equals(BigDecimal.valueOf(200.00)));
		assertEquals("AccountID of Account does not match expected", (double)1, (double)a.getAccountID());
		Calendar lastLogin = Calendar.getInstance();
		lastLogin.set(2011, 11, 11, 15, 49, 38);
		assertTrue("LastLogin of Account does not match expected", a.getLastLogin().equals(lastLogin));
		assertEquals("LoginCount of Account does not match expected", (double)36, (double)a.getLoginCount());
		assertTrue("UserID of Account does not match expected", a.getUserID().equals("uid:0"));
		assertTrue("ProfileID of Account does not match expected", a.getProfileID().equals("uid:0"));
		assertTrue("CurrencyType of Account does not match expected", a.getCurrencyType().equals("USD"));
		
	}

	@Test
	public void testGetAccountProfileData() throws DAOException {
		TraderServiceManager t = new TraderServiceManager();
		AccountProfile ap = t.getAccountProfileData("uid:0");
		
		assertTrue("getAccountProfileData failed", ap != null);

		assertTrue("Address of AccountProfile does not match expected", ap.getAddress().equals("blah"));
		assertTrue("Password of AccountProfile does not match expected", ap.getPassword().equals("xxx"));
		assertTrue("UserID of AccountProfile does not match expected", ap.getUserID().equals("uid:0"));
		assertTrue("Email of AccountProfile does not match expected", ap.getEmail().equals("blah"));
		assertTrue("Creditcard of AccountProfile does not match expected", ap.getCreditCard().equals("21321321321"));
		assertTrue("Fullname of AccountProfile does not match expected", ap.getFullName().equals("Tiago"));
		
	}

	@Test
	public void testGetOrders() throws DAOException {
		TraderServiceManager t = new TraderServiceManager();
		List<Order> orderList = t.getOrders("uid:0");
		assertTrue("getOrders failed", orderList != null);
		assertTrue("The number of orders does not match expected", orderList.size()==2);
		for(int i=0; i<2; i++){
			Order o = orderList.get(i);
			if(o.getOrderID() == 1){
				assertTrue("OrderFee of Order 1 does not match expected", o.getOrderFee().equals(BigDecimal.valueOf(15.95)));
				assertTrue("OrderType of Order 1 does not match expected", o.getOrderType().equals("buy"));
				assertTrue("OrderStatus of Order 1 does not match expected", o.getOrderStatus().equals("open"));
				assertTrue("Price of Order 1 does not match expected", o.getPrice().equals(BigDecimal.valueOf(1.00)));
				assertTrue("Quantity of Order 1 does not match expected", o.getQuantity().equals(10.0));
				Calendar openDate = Calendar.getInstance();
				openDate.set(2011, 9, 15, 15, 55, 18);
				assertTrue("OpenDate of Order 1 does not match expected", o.getOpenDate().equals(openDate));
				assertTrue("OrderID of Order 1 does not match expected", o.getOrderID()==1);
				assertTrue("AccountID of Order 1 does not match expected", o.getAccountId()==1);
				assertTrue("Quote_Symbol of Order 1 does not match expected", o.getSymbol().equals("s:AAPL"));
				assertTrue("HoldingID of Order 1 does not match expected", o.getHoldingId()== -1);				
				
			}else if(o.getOrderID() == 2){
				assertTrue("OrderFee of Order 2 does not match expected", o.getOrderFee().equals(BigDecimal.valueOf(15.95)));
				assertTrue("OrderType of Order 2 does not match expected", o.getOrderType().equals("buy"));
				assertTrue("OrderStatus of Order 2 does not match expected", o.getOrderStatus().equals("closed"));
				assertTrue("Price of Order 2 does not match expected", o.getPrice().equals(BigDecimal.valueOf(1.00)));
				assertTrue("Quantity of Order 2 does not match expected", o.getQuantity().equals(123.0));
				Calendar openDate = Calendar.getInstance();
				openDate.set(2011, 9, 15, 15, 55, 54);
				assertTrue("OpenDate of Order 2 does not match expected", o.getOpenDate().equals(openDate));
				assertTrue("OrderID of Order 2 does not match expected", o.getOrderID()==2);
				assertTrue("AccountID of Order 2 does not match expected", o.getAccountId()==1);
				assertTrue("Quote_Symbol of Order 2 does not match expected", o.getSymbol().equals("s:AAPL"));
				assertTrue("HoldingID of Order 2 does not match expected", o.getHoldingId()== -1);	
				
			}else{
				assertTrue("Order information does not match expected", false);
			}
		}	
	}

	@Test
	public void testGetTopOrders() throws DAOException {
		TraderServiceManager t = new TraderServiceManager();
		List<Order> topOrders = t.getTopOrders("uid:0");
		assertTrue("getTopOrders failed", topOrders != null);
		
		
	}

	@Test
	public void testGetClosedOrders() {
		TraderServiceManager t = new TraderServiceManager();
		assertTrue("getClosedOrders failed", a != null);
	}

	@Test
	public void testRegister() throws DAOException {
		TraderServiceManager t = new TraderServiceManager();
		String result = t.register("uid:33", "xxx", "blah", "blah", "blah", "666666666", BigDecimal.valueOf(10000.00), "USD");
		
		assertTrue("register function failed completely", result != null);
		assertTrue("register function failed", result.equals("success"));
		
		result = t.register("uid:33", "xxx", "blah", "blah", "blah", "666666666", BigDecimal.valueOf(10000.00), "USD");
		assertTrue("register function failed to check user exist", result.equals("userexist"));
		
		result = t.register(null, "xxx", "blah", "blah", "blah", "666666666", BigDecimal.valueOf(10000.00), "USD");
		assertTrue("register function failed to send back failed message", result.equals("failed"));
		
	}

	@Test
	public void testUpdateAccountProfile() {
		TraderServiceManager t = new TraderServiceManager();
		assertTrue("getAccountData failed", a != null);
	}

	@Test
	public void testGetMarketSummary() {
		TraderServiceManager t = new TraderServiceManager();
	}

	@Test
	public void testGetQuote() {
		TraderServiceManager t = new TraderServiceManager();
	}

	@Test
	public void testGetAllQuotes() {
		TraderServiceManager t = new TraderServiceManager();
	}

	@Test
	public void testBuy() {
		TraderServiceManager t = new TraderServiceManager();
	}

	@Test
	public void testSell() {
		TraderServiceManager t = new TraderServiceManager();
	}

	@Test
	public void testSellEnhanced() {
		TraderServiceManager t = new TraderServiceManager();
	}

	@Test
	public void testPlaceOrder() {
		TraderServiceManager t = new TraderServiceManager();
	}

	@Test
	public void testGetHolding() {
		TraderServiceManager t = new TraderServiceManager();
	}

	@Test
	public void testGetHoldings() {
		TraderServiceManager t = new TraderServiceManager();
	}

	@Test
	public void testGetWallet() {
		TraderServiceManager t = new TraderServiceManager();
	}

	@Test
	public void testUpdateWallet() {
		TraderServiceManager t = new TraderServiceManager();
	}

}
