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
import nl.tudelft.stocktrader.Holding;
import nl.tudelft.stocktrader.MarketSummary;
import nl.tudelft.stocktrader.Order;
import nl.tudelft.stocktrader.Quote;
import nl.tudelft.stocktrader.Wallet;
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
				assertTrue("Quote_Symbol of Order 1 does not match expected", o.getSymbol().equals("AAPL"));
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
				assertTrue("Quote_Symbol of Order 2 does not match expected", o.getSymbol().equals("AAPL"));
				assertTrue("HoldingID of Order 2 does not match expected", o.getHoldingId()== -1);	
				
			}else{
				assertTrue("Order information does not match expected", false);
			}
		}	
	}

	@Test
	public void testGetTopOrders() throws DAOException {
		//almost same as getOrders???
		TraderServiceManager t = new TraderServiceManager();
		List<Order> topOrders = t.getTopOrders("uid:0");
		assertTrue("getTopOrders failed", topOrders != null);
		
		assertTrue("The number of orders does not match expected", topOrders.size()==2);
		for(int i=0; i<2; i++){
			Order o = topOrders.get(i);
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
				assertTrue("Quote_Symbol of Order 1 does not match expected", o.getSymbol().equals("AAPL"));
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
				assertTrue("Quote_Symbol of Order 2 does not match expected", o.getSymbol().equals("AAPL"));
				assertTrue("HoldingID of Order 2 does not match expected", o.getHoldingId()== -1);	
				
			}else{
				assertTrue("Order information does not match expected", false);
			}
		}		
	}

	@Test
	public void testGetClosedOrders() throws DAOException {
		TraderServiceManager t = new TraderServiceManager();
		List<Order> closedOrders = t.getClosedOrders("uid:0");
		assertTrue("getClosedOrders failed", closedOrders != null);		
		assertTrue("The number of orders does not match expected", closedOrders.size()==1);

		Order o = closedOrders.get(0);

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
		assertTrue("Quote_Symbol of Order 2 does not match expected", o.getSymbol().equals("AAPL"));
		assertTrue("HoldingID of Order 2 does not match expected", o.getHoldingId()== -1);		
	}

	@Test
	public void testRegister() throws DAOException {
		TraderServiceManager t = new TraderServiceManager();
		String result = t.register("uid:33", "xxx", "blah", "blah", "blah", "666666666", BigDecimal.valueOf(10000.00), "USD");
		
		assertTrue("register function failed completely", result != null);
		assertTrue("register function failed", result.equals("success"));
		
		result = t.register("uid:33", "xxx", "blah", "blah", "blah", "666666666", BigDecimal.valueOf(10000.00), "USD");
		assertTrue("register function failed completely", result != null);
		assertTrue("register function failed to check user exist", result.equals("userexist"));
		
		result = t.register(null, "xxx", "blah", "blah", "blah", "666666666", BigDecimal.valueOf(10000.00), "USD");
		assertTrue("register function failed completely", result != null);
		assertTrue("register function failed to send back failed message", result.equals("failed"));
		
	}

	@Test
	public void testUpdateAccountProfile() throws DAOException {
		TraderServiceManager t = new TraderServiceManager();
		AccountProfile newAP = new AccountProfile("uid:0", "XXX", "blah", "blah", "blah", "6666666699999");
		AccountProfile ap = t.updateAccountProfile(newAP);
		assertTrue("updateAccountProfile failed", ap != null);
		
		assertTrue("Address of AccountProfile does not match expected", ap.getAddress().equals("blah"));
		assertTrue("Password of AccountProfile does not match expected", ap.getPassword().equals("XXX"));
		assertTrue("UserID of AccountProfile does not match expected", ap.getUserID().equals("uid:0"));
		assertTrue("Email of AccountProfile does not match expected", ap.getEmail().equals("blah"));
		assertTrue("Creditcard of AccountProfile does not match expected", ap.getCreditCard().equals("6666666699999"));
		assertTrue("Fullname of AccountProfile does not match expected", ap.getFullName().equals("blah"));
	}

	@Test
	public void testGetMarketSummary() throws DAOException {
		TraderServiceManager t = new TraderServiceManager();
		MarketSummary ms = t.getMarketSummary();
		
		assertTrue("getMarketSummary failed completely", ms != null);
		
		assertTrue("OpenTSIA of MarketSummary does not match expected", ms.getOpenTSIA().equals(BigDecimal.valueOf(200.0)));
		assertTrue("TSIA of MarketSummary does not match expected", ms.getTSIA().equals(BigDecimal.valueOf(510.0)));
		assertTrue("Volume of MarketSummary does not match expected", ms.getVolume().equals(468.00));
		
		List<Quote> topGainers = ms.getTopGainers();
		assertTrue("getTopGainers failed", topGainers != null);
		Quote qTop = topGainers.get(0);		
		assertTrue("Low of QuoteTop does not match expected", qTop.getLow().equals(BigDecimal.valueOf(100.00)));
		assertTrue("Open1 of QuoteTop does not match expected", qTop.getOpen().equals(BigDecimal.valueOf(200.00)));
		assertEquals("Volume of QuoteTop does not match expected", 123.0, qTop.getVolume());
		assertEquals("Price of QuoteTop does not match expected", 256.00, qTop.getPrice());
		assertTrue("High of QuoteTop does not match expected", qTop.getHigh().equals(BigDecimal.valueOf(300.00)));
		assertTrue("CompanyName of QuoteTop does not match expected", qTop.getCompanyName().equals("Apple"));
		assertTrue("Symbol of QuoteTop does not match expected", qTop.getSymbol().equals("AAPL"));
		assertEquals("Change1 of QuoteTop does not match expected", 21.0, qTop.getChange());
		
		Quote qTopSecond = topGainers.get(1);		
		assertTrue("Low of Quote does not match expected", qTopSecond.getLow().equals(BigDecimal.valueOf(100.00)));
		assertTrue("Open1 of Quote does not match expected", qTopSecond.getOpen().equals(BigDecimal.valueOf(200.00)));
		assertEquals("Volume of Quote does not match expected", 345.0, qTopSecond.getVolume());
		assertEquals("Price of Quote does not match expected", 764.00, qTopSecond.getPrice());
		assertTrue("High of Quote does not match expected", qTopSecond.getHigh().equals(BigDecimal.valueOf(321.00)));
		assertTrue("CompanyName of Quote does not match expected", qTopSecond.getCompanyName().equals("Microsoft"));
		assertTrue("Symbol of Quote does not match expected", qTopSecond.getSymbol().equals("MSFT"));
		assertEquals("Change1 of Quote does not match expected", 2.0, qTopSecond.getChange());
		
		
		List<Quote> topLosers = ms.getTopLosers();
		assertTrue("getTopLosers failed", topLosers != null);
		
		Quote qLoser = topLosers.get(0);		
		assertTrue("Low of QuoteLoser does not match expected", qLoser.getLow().equals(BigDecimal.valueOf(100.00)));
		assertTrue("Open1 of QuoteLoser does not match expected", qLoser.getOpen().equals(BigDecimal.valueOf(200.00)));
		assertEquals("Volume of QuoteLoser does not match expected", 345.0, qLoser.getVolume());
		assertEquals("Price of QuoteLoser does not match expected", 764.00, qLoser.getPrice());
		assertTrue("High of QuoteLoser does not match expected", qLoser.getHigh().equals(BigDecimal.valueOf(321.00)));
		assertTrue("CompanyName of QuoteLoser does not match expected", qLoser.getCompanyName().equals("Microsoft"));
		assertTrue("Symbol of QuoteLoser does not match expected", qLoser.getSymbol().equals("MSFT"));
		assertEquals("Change1 of QuoteLoser does not match expected", 2.0, qLoser.getChange());
		
		Quote qLoseSecond = topLosers.get(1);		
		assertTrue("Low of QuoteLoser2 does not match expected", qLoseSecond.getLow().equals(BigDecimal.valueOf(100.00)));
		assertTrue("Open1 of QuoteLoser2 does not match expected", qLoseSecond.getOpen().equals(BigDecimal.valueOf(200.00)));
		assertEquals("Volume of QuoteLoser2 does not match expected", 123.0, qLoseSecond.getVolume());
		assertEquals("Price of QuoteLoser2 does not match expected", 256.00, qLoseSecond.getPrice());
		assertTrue("High of QuoteLoser2 does not match expected", qLoseSecond.getHigh().equals(BigDecimal.valueOf(300.00)));
		assertTrue("CompanyName of QuoteLoser2 does not match expected", qLoseSecond.getCompanyName().equals("Apple"));
		assertTrue("Symbol of QuoteLoser2 does not match expected", qLoseSecond.getSymbol().equals("AAPL"));
		assertEquals("Change1 of QuoteLoser2 does not match expected", 21.0, qLoseSecond.getChange());	
		
	}

	@Test
	public void testGetQuote() throws DAOException {
		TraderServiceManager t = new TraderServiceManager();
		Quote q = t.getQuote("AAPL");
		assertTrue("getQuote failed completely", q != null);

		assertTrue("Low of Quote does not match expected", q.getLow().equals(BigDecimal.valueOf(100.00)));
		assertTrue("Open1 of Quote does not match expected", q.getOpen().equals(BigDecimal.valueOf(200.00)));
		assertEquals("Volume of Quote does not match expected", 123.0, q.getVolume());
		assertEquals("Price of Quote does not match expected", 256.00, q.getPrice());
		assertTrue("High of Quote does not match expected", q.getHigh().equals(BigDecimal.valueOf(300.00)));
		assertTrue("CompanyName of Quote does not match expected", q.getCompanyName().equals("Apple"));
		assertTrue("Symbol of Quote does not match expected", q.getSymbol().equals("AAPL"));
		assertEquals("Change1 of Quote does not match expected", 21.0, q.getChange());

	}

	@Test
	public void testGetAllQuotes() throws DAOException {
		TraderServiceManager t = new TraderServiceManager();
		List<Quote> quoteList = t.getAllQuotes();
		assertTrue("getAllQuotes failed completely", quoteList != null);		
		assertTrue("The number of quotes does not match expected", quoteList.size()==2);
		
		for(int i=0; i<2; i++){
			Quote q = quoteList.get(i);
			if(q.getSymbol().equals("AAPL")){
				
				assertTrue("Low of Quote AAPL does not match expected", q.getLow().equals(BigDecimal.valueOf(100.00)));
				assertTrue("Open1 of Quote AAPL does not match expected", q.getOpen().equals(BigDecimal.valueOf(200.00)));
				assertEquals("Volume of Quote AAPL does not match expected", 123.0, q.getVolume());
				assertEquals("Price of Quote AAPL does not match expected", 256.00, q.getPrice());
				assertTrue("High of Quote AAPL does not match expected", q.getHigh().equals(BigDecimal.valueOf(300.00)));
				assertTrue("CompanyName of Quote AAPL does not match expected", q.getCompanyName().equals("Apple"));
				assertTrue("Symbol of Quote AAPL does not match expected", q.getSymbol().equals("AAPL"));
				assertEquals("Change1 of Quote AAPL does not match expected", 21.0, q.getChange());	
				
			}else if(q.getSymbol().equals("MSFT")){
				
				assertTrue("Low of Quote MSFT does not match expected", q.getLow().equals(BigDecimal.valueOf(100.00)));
				assertTrue("Open1 of Quote MSFT does not match expected", q.getOpen().equals(BigDecimal.valueOf(200.00)));
				assertEquals("Volume of Quote MSFT does not match expected", 345.0, q.getVolume());
				assertEquals("Price of Quote MSFT does not match expected", 764.00, q.getPrice());
				assertTrue("High of Quote MSFT does not match expected", q.getHigh().equals(BigDecimal.valueOf(321.00)));
				assertTrue("CompanyName of Quote MSFT does not match expected", q.getCompanyName().equals("Microsoft"));
				assertTrue("Symbol of Quote MSFT does not match expected", q.getSymbol().equals("MSFT"));
				assertEquals("Change1 of Quote MSFT does not match expected", 2.0, q.getChange());
				
			}else{
				assertTrue("Quote information does not match expected", false);
			}		
		}		
	}

//	@Test
//	public void testBuy() throws DAOException {
//		TraderServiceManager t = new TraderServiceManager();
//		Order o = t.buy("uid:0", "AAPL", 20.0);
//		buy service invoke other services
//		
//	}
//
//	@Test
//	public void testSell() {
//		TraderServiceManager t = new TraderServiceManager();
//	}
//
//	@Test
//	public void testSellEnhanced() {
//		TraderServiceManager t = new TraderServiceManager();
//	}
//

	@Test
	public void testGetHolding() throws DAOException {
		TraderServiceManager t = new TraderServiceManager();
		Holding h = t.getHolding("uid:0", 12);
		assertTrue("getHolding failed completely", h != null);

		assertTrue("PurchasePrice of Holding does not match expected", h.getPurchasePrice().equals(BigDecimal.valueOf(834.14)));
		assertTrue("HoldingID of Holding does not match expected", h.getHoldingID()==12);
		assertEquals("Quantity of Holding does not match expected", 10.0, h.getQuantity());
		Calendar purchaseDate = Calendar.getInstance();
		purchaseDate.set(1970, 1, 1, 0, 0, 0);
		assertTrue("PurchaseDate of Holding does not match expected", h.getPurchaseDate().equals(purchaseDate));
		assertTrue("AccountID of Holding does not match expected", h.getAccountID()==1);
		assertTrue("QuoteSymbol of Holding does not match expected", h.getQuoteId().equals("AAPL"));		
		
	}

	@Test
	public void testGetHoldings() throws DAOException {
		TraderServiceManager t = new TraderServiceManager();
		List<Holding> holdingList = t.getHoldings("uid:0");
		assertTrue("getHoldings failed completely", holdingList != null);
		
		assertTrue("The number of holdings does not match expected", holdingList.size()==2);
	
		for(int i=0; i<2; i++){
			Holding h = holdingList.get(i);
			if(h.getHoldingId()==12){
				assertTrue("PurchasePrice of Holding does not match expected", h.getPurchasePrice().equals(BigDecimal.valueOf(834.14)));
				assertTrue("HoldingID of Holding does not match expected", h.getHoldingID()==12);
				assertEquals("Quantity of Holding does not match expected", 10.0, h.getQuantity());
				Calendar purchaseDate = Calendar.getInstance();
				purchaseDate.set(1970, 1, 1, 0, 0, 0);
				assertTrue("PurchaseDate of Holding does not match expected", h.getPurchaseDate().equals(purchaseDate));
				assertTrue("AccountID of Holding does not match expected", h.getAccountID()==1);
				assertTrue("QuoteSymbol of Holding does not match expected", h.getQuoteId().equals("AAPL"));					
			}else if(h.getHoldingId() == 13){
				assertTrue("PurchasePrice of Holding does not match expected", h.getPurchasePrice().equals(BigDecimal.valueOf(817.45)));
				assertTrue("HoldingID of Holding does not match expected", h.getHoldingID()==13);
				assertEquals("Quantity of Holding does not match expected", 10.0, h.getQuantity());
				Calendar purchaseDate = Calendar.getInstance();
				purchaseDate.set(2011, 11, 10, 0, 0, 0);
				assertTrue("PurchaseDate of Holding does not match expected", h.getPurchaseDate().equals(purchaseDate));
				assertTrue("AccountID of Holding does not match expected", h.getAccountID()==1);
				assertTrue("QuoteSymbol of Holding does not match expected", h.getQuoteId().equals("AAPL"));	
				
			}else{
				assertTrue("Holding information does not match expected", false);
			}
		}
	}

	@Test
	public void testGetWallet() throws DAOException {
		TraderServiceManager t = new TraderServiceManager();
		Wallet w = t.getWallet("uid:0");
		assertTrue("getWallet failed completely", w != null);
		assertTrue("userID of Wallet does not match expected", w.getUserID().equals("uid:0"));
		assertTrue("USD of Wallet does not match expected", w.getUsd().equals(BigDecimal.valueOf(100.00)));
		assertTrue("EUR of Wallet does not match expected", w.getEur().equals(BigDecimal.valueOf(990.00)));
		assertTrue("GBP of Wallet does not match expected", w.getGbp().equals(BigDecimal.valueOf(10.00)));
		assertTrue("CNY of Wallet does not match expected", w.getCny().equals(BigDecimal.valueOf(20.00)));
		assertTrue("INR of Wallet does not match expected", w.getInr().equals(BigDecimal.valueOf(714.84)));		
	}

	@Test
	public void testUpdateWallet() throws DAOException {
		TraderServiceManager t = new TraderServiceManager();
		Wallet newWallet = new Wallet("uid:0", BigDecimal.valueOf(200), BigDecimal.valueOf(1000), 
									BigDecimal.valueOf(100), BigDecimal.valueOf(200), BigDecimal.valueOf(800));
		Wallet w = t.updateWallet(newWallet);
		assertTrue("updateWallet failed completely", w != null);
		assertTrue("userID of Wallet does not match expected", w.getUserID().equals("uid:0"));
		assertTrue("USD of Wallet does not match expected", w.getUsd().equals(BigDecimal.valueOf(100.00)));
		assertTrue("EUR of Wallet does not match expected", w.getEur().equals(BigDecimal.valueOf(990.00)));
		assertTrue("GBP of Wallet does not match expected", w.getGbp().equals(BigDecimal.valueOf(10.00)));
		assertTrue("CNY of Wallet does not match expected", w.getCny().equals(BigDecimal.valueOf(20.00)));
		assertTrue("INR of Wallet does not match expected", w.getInr().equals(BigDecimal.valueOf(714.84)));			
	}
}
