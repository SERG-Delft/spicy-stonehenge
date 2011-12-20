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
		  writeCommand.setAlterDatabase(false);
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
		if(conn!=null)
			conn.close();
		server.shutdown();
		  
//		  try {
//		   while(true) {
//		    server.ping();
//		    Thread.currentThread().sleep(1000);
//		   }
//		  } catch(Exception e) {}
//		  
//		  FileUtils.forceDelete(new File("testdb"));
//		  FileUtils.forceDelete(new File("derby.log"));
	}
	
	@After
	public void tearDown() throws Exception {
		  
	}

	@Test
	public void testTraderServiceManager() {
		TraderServiceManager t = new TraderServiceManager();
		assertTrue("TraderServiceManager Constructor failed", t != null);
	}

	@Test
	public void testLogin() throws DAOException {
		TraderServiceManager t = new TraderServiceManager();
		Account a = t.login("uid:0", "xxx");
		
		assertTrue("login failed", a != null);

		Calendar creationDate = Calendar.getInstance();
//		creationDate.set(2011, 9, 8, 0, 0, 0);
		creationDate.setTimeInMillis(1315440000000l);
//		assertTrue("CreationDate of Account does not match expected", a.getCreationDate().compareTo(creationDate)==0d);
		assertTrue("OpenBalance of Account does not match expected", a.getOpenBalance().compareTo(BigDecimal.valueOf(100.00))==0.0);
		assertTrue("LogoutCount of Account does not match expected", a.getLogoutCount()==13.0);
		assertTrue("Balance of Account does not match expected", a.getBalance().compareTo(BigDecimal.valueOf(200.00))==0.0);
		assertTrue("AccountID of Account does not match expected", a.getAccountID()==1.0);
		Calendar lastLogin = Calendar.getInstance();
		lastLogin.setTimeInMillis(1321026578);
//		assertTrue("LastLogin of Account does not match expected", a.getLastLogin().compareTo(lastLogin)==0);
		System.out.println("Test Login: LoginCount is " + a.getLoginCount());
		//why is LoginCount is 38???
		assertTrue("LoginCount of Account does not match expected", a.getLoginCount()==36.0);
		assertTrue("ProfileID of Account does not match expected", a.getProfileID().equals("uid:0"));
//		assertTrue("CurrencyType of Account does not match expected", a.getCurrencyType().matches("USD"));	
		
	}

	@Test
	public void testLogout() throws DAOException {
		TraderServiceManager t = new TraderServiceManager();
		t.logout("uid:0");
		
		Account a = t.getAccountData("uid:0");
		System.out.println("logout count is " + a.getLogoutCount());
		assertTrue("Logout does not match expected", a.getLogoutCount()==14);
		
	}

	@Test
	public void testGetAccountData() throws DAOException {
		TraderServiceManager t = new TraderServiceManager();
		Account a = t.getAccountData("uid:0");
		
		assertTrue("getAccountData failed", a != null);

		Calendar creationDate = Calendar.getInstance();
		creationDate.set(2011, 9, 8, 0, 0, 0);
//		assertTrue("CreationDate of Account does not match expected", a.getCreationDate().equals(creationDate));
		assertEquals("OpenBalance of Account does not match expected", 0, a.getOpenBalance().compareTo(BigDecimal.valueOf(100.00)));
		assertTrue("LogoutCount of Account does not match expected", a.getLogoutCount()==13.0);
		assertTrue("Balance of Account does not match expected", a.getBalance().compareTo(BigDecimal.valueOf(200.00))==0.0);
		assertTrue("AccountID of Account does not match expected",a.getAccountID()==1.0);
		Calendar lastLogin = Calendar.getInstance();
		lastLogin.set(2011, 11, 11, 15, 49, 38);
//		assertTrue("LastLogin of Account does not match expected", a.getLastLogin().equals(lastLogin));
		System.out.println("TestGetAccountData getLoginCount is " + a.getLoginCount());
		assertTrue("LoginCount of Account does not match expected", a.getLoginCount()==35.0);
		System.out.println("TestGetAccountData getLoginCount is " + a.getLoginCount());
		assertTrue("ProfileID of Account does not match expected", a.getProfileID().equals("uid:0"));
//		assertTrue("CurrencyType of Account does not match expected", a.getCurrencyType().equals("USD"));
		
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
		assertTrue("The number of orders does not match expected", orderList.size()==2.0);
		
		//  <ORDERS ORDERFEE="15.95" ORDERTYPE="buy" ORDERSTATUS="open" PRICE="1.00" QUANTITY="10.0" OPENDATE="2011-11-09 16:14:08.828" ORDERID="14" ACCOUNT_ACCOUNTID="1" QUOTE_SYMBOL="s:AAPL" HOLDING_HOLDINGID="-1"/>
		//  <ORDERS COMPLETIONDATE="2011-11-09 16:26:41" OPENDATE="2011-11-09 16:26:38.151" ORDERID="15" ACCOUNT_ACCOUNTID="1" QUOTE_SYMBOL="AAPL" HOLDING_HOLDINGID="13"/>

		
		for(int i=0; i<2; i++){
			Order o = orderList.get(i);

			if(o.getOrderStatus().equals("open")){
				assertTrue("OrderFee of Order 1 does not match expected", o.getOrderFee().compareTo(BigDecimal.valueOf(15.95))==0.0);
				assertTrue("OrderType of Order 1 does not match expected", o.getOrderType().equals("buy"));
				assertTrue("OrderStatus of Order 1 does not match expected", o.getOrderStatus().equals("open"));
				assertTrue("Price of Order 1 does not match expected", o.getPrice().compareTo(BigDecimal.valueOf(1.00))==0.0);
				assertTrue("Quantity of Order 1 does not match expected", o.getQuantity().equals(10.0));
				Calendar openDate = Calendar.getInstance();
				openDate.set(2011, 11, 9, 16, 14, 8);
//				assertTrue("OpenDate of Order 1 does not match expected", o.getOpenDate().equals(openDate));
//				assertTrue("OrderID of Order 1 does not match expected", o.getOrderID()==14.0); // order id is auto increment.
				assertTrue("AccountID of Order 1 does not match expected", o.getAccountId()==0);
				assertTrue("Quote_Symbol of Order 1 does not match expected", o.getSymbol().equals("AAPL"));
				System.out.println("getorders holdingid is " + o.getHoldingId());
				assertTrue("HoldingID of Order 1 does not match expected", o.getHoldingId()== 0);				
				
			}else if(o.getOrderStatus().equals("completed")){
				assertTrue("OrderFee of Order 2 does not match expected", o.getOrderFee().compareTo(BigDecimal.valueOf(15.95))==0.0);
				
				Calendar completionDate = Calendar.getInstance();
				completionDate.set(2011, 11, 9, 16, 26, 38);
//				assertTrue("OpenDate of Order 1 does not match expected", o.getOpenDate().equals(completionDate));
				
				assertTrue("OrderType of Order 2 does not match expected", o.getOrderType().equals("buy"));
				assertTrue("OrderStatus of Order 2 does not match expected", o.getOrderStatus().equals("completed"));
				assertTrue("Price of Order 2 does not match expected", o.getPrice().compareTo(BigDecimal.valueOf(256.00))==0);
				assertTrue("Quantity of Order 2 does not match expected", o.getQuantity().equals(10.0));
				Calendar openDate = Calendar.getInstance();
				openDate.set(2011, 9, 15, 15, 55, 54);
//				assertTrue("OpenDate of Order 2 does not match expected", o.getOpenDate().equals(openDate));
//				assertTrue("OrderID of Order 2 does not match expected", o.getOrderID()==2.0);
				//why here the account id is 0 but not 1?
				assertTrue("AccountID of Order 2 does not match expected", o.getAccountId()==0);
				assertTrue("Quote_Symbol of Order 2 does not match expected", o.getSymbol().equals("AAPL"));
				assertTrue("HoldingID of Order 2 does not match expected", o.getHoldingId()== 0);	
				
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
				assertTrue("OrderFee of Order 1 does not match expected", o.getOrderFee().compareTo(BigDecimal.valueOf(15.95))==0d);
				assertTrue("OrderType of Order 1 does not match expected", o.getOrderType().equals("buy"));
				assertTrue("OrderStatus of Order 1 does not match expected", o.getOrderStatus().equals("open"));
				assertTrue("Price of Order 1 does not match expected", o.getPrice().compareTo(BigDecimal.valueOf(1.00))==0d);
				assertTrue("Quantity of Order 1 does not match expected", o.getQuantity().equals(10.0));
				Calendar openDate = Calendar.getInstance();
				openDate.set(2011, 9, 15, 15, 55, 18);
//				assertTrue("OpenDate of Order 1 does not match expected", o.getOpenDate().equals(openDate));
				assertTrue("OrderID of Order 1 does not match expected", o.getOrderID()==1);
				System.out.println("order1 account id is " + o.getAccountId());
				assertTrue("AccountID of Order 1 does not match expected", o.getAccountId()==0);
				assertTrue("Quote_Symbol of Order 1 does not match expected", o.getSymbol().equals("AAPL"));
				System.out.println("holding id of order 1 is " + o.getHoldingId());
				assertTrue("HoldingID of Order 1 does not match expected", o.getHoldingId()== 0);				
				 
			}else if(o.getOrderID() == 2){
				assertTrue("OrderFee of Order 2 does not match expected", o.getOrderFee().compareTo(BigDecimal.valueOf(15.95))==0d);
				assertTrue("OrderType of Order 2 does not match expected", o.getOrderType().equals("buy"));
				assertTrue("OrderStatus of Order 2 does not match expected", o.getOrderStatus().equals("completed"));
				assertTrue("Price of Order 2 does not match expected", o.getPrice().compareTo(BigDecimal.valueOf(256.00))==0d);
				assertTrue("Quantity of Order 2 does not match expected", o.getQuantity().equals(10.0));
				Calendar openDate = Calendar.getInstance();
				openDate.set(2011, 9, 15, 15, 55, 54);
//				assertTrue("OpenDate of Order 2 does not match expected", o.getOpenDate().equals(openDate));
				assertTrue("OrderID of Order 2 does not match expected", o.getOrderID()==2);
				assertTrue("AccountID of Order 2 does not match expected", o.getAccountId()==0);
				assertTrue("Quote_Symbol of Order 2 does not match expected", o.getSymbol().equals("AAPL"));
				assertTrue("HoldingID of Order 2 does not match expected", o.getHoldingId()== 0);	
				
			}else{
				assertTrue("Order information does not match expected", false);
			}
		}		
	}

	@Test
	public void testGetCompletedOrders() throws DAOException {
		TraderServiceManager t = new TraderServiceManager();
		List<Order> closedOrders = t.getCompletedOrders("uid:0");
		assertTrue("getClosedOrders failed", closedOrders != null);		
		assertTrue("The number of orders does not match expected", closedOrders.size()==1);

		Order o = closedOrders.get(0);
//  <ORDERS COMPLETIONDATE="2011-11-09 16:26:41.683"  OPENDATE="2011-11-09 16:26:38.151"/>  
		assertTrue("OrderFee of Order 2 does not match expected", o.getOrderFee().compareTo(BigDecimal.valueOf(15.95))==0d);
		assertTrue("OrderType of Order 2 does not match expected", o.getOrderType().equals("buy"));
		System.out.println("order status is " + o.getOrderStatus());
		assertTrue("OrderStatus of Order 2 does not match expected", o.getOrderStatus().equals("completed"));
		assertTrue("Price of Order 2 does not match expected", o.getPrice().compareTo(BigDecimal.valueOf(256.00))==0d);
		assertTrue("Quantity of Order 2 does not match expected", o.getQuantity().equals(10.0));
//		Calendar openDate = Calendar.getInstance();
//		openDate.set(2011, 9, 15, 15, 55, 54);
//		assertTrue("OpenDate of Order 2 does not match expected", o.getOpenDate().equals(openDate));
		assertTrue("OrderID of Order 2 does not match expected", o.getOrderID()==2);
		System.out.println("order 2 account ID is " + o.getAccountId());
		assertTrue("AccountID of Order 2 does not match expected", o.getAccountId()==0);
		assertTrue("Quote_Symbol of Order 2 does not match expected", o.getSymbol().equals("AAPL"));
		assertTrue("HoldingID of Order 2 does not match expected", o.getHoldingId()== 0);		
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
		
		
		// how to test the failed result?
//		result = t.register(null, "xxx", "blah", "blah", "blah", "666666666", BigDecimal.valueOf(10000.00), "USD");
//		assertTrue("register function failed completely", result != null);
//		assertTrue("register function failed to send back failed message", result.equals("failed"));
		
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
		
		assertTrue("OpenTSIA of MarketSummary does not match expected", ms.getOpenTSIA().compareTo(BigDecimal.valueOf(200.0))==0d);
		assertTrue("TSIA of MarketSummary does not match expected", ms.getTSIA().compareTo(BigDecimal.valueOf(510.0))==0d);
		assertTrue("Volume of MarketSummary does not match expected", ms.getVolume().equals(468.00));
		
		List<Quote> topGainers = ms.getTopGainers();
		assertTrue("getTopGainers failed", topGainers != null);
		Quote qTop = topGainers.get(0);		

//		 <QUOTE LOW="100.00" OPEN1="200.00" VOLUME="123.0" PRICE="256.00" HIGH="300.00" COMPANYNAME="Apple" SYMBOL="AAPL" CHANGE1="21.0" />
//		  <QUOTE LOW="100.00" OPEN1="200.00" VOLUME="345.0" PRICE="764.00" HIGH="321.00" COMPANYNAME="Microsoft" SYMBOL="MSFT" CHANGE1="2.0" />
		
		assertTrue("Low of QuoteTop does not match expected", qTop.getLow().compareTo(BigDecimal.valueOf(100.00))==0d);
		assertTrue("Open1 of QuoteTop does not match expected", qTop.getOpen().compareTo(BigDecimal.valueOf(200.00))==0d);

		assertTrue("Volume of QuoteTop does not match expected", qTop.getVolume()==123.0);
		assertTrue("Price of QuoteTop does not match expected", qTop.getPrice().doubleValue()==256.00);
		assertTrue("High of QuoteTop does not match expected", qTop.getHigh().doubleValue()==300.00);
		assertTrue("CompanyName of QuoteTop does not match expected", qTop.getCompanyName().equals("Apple"));
		assertTrue("Symbol of QuoteTop does not match expected", qTop.getSymbol().equals("AAPL"));
		assertTrue("Change1 of QuoteTop does not match expected", qTop.getChange()==21.0);
		
		Quote qTopSecond = topGainers.get(1);		
		assertTrue("Low of Quote does not match expected", qTopSecond.getLow().compareTo(BigDecimal.valueOf(100.00))==0d);
		assertTrue("Open1 of Quote does not match expected", qTopSecond.getOpen().compareTo(BigDecimal.valueOf(200.00))==0d);
		assertTrue("Volume of Quote does not match expected", qTopSecond.getVolume()==345.0);
		assertTrue("Price of Quote does not match expected", qTopSecond.getPrice().doubleValue()==764.00);
		assertTrue("High of Quote does not match expected", qTopSecond.getHigh().compareTo(BigDecimal.valueOf(321.00))==0d);
		assertTrue("CompanyName of Quote does not match expected", qTopSecond.getCompanyName().equals("Microsoft"));
		assertTrue("Symbol of Quote does not match expected", qTopSecond.getSymbol().equals("MSFT"));
		assertTrue("Change1 of Quote does not match expected", qTopSecond.getChange()==2.0);
		
		
		List<Quote> topLosers = ms.getTopLosers();
		assertTrue("getTopLosers failed", topLosers != null);
		
		Quote qLoser = topLosers.get(0);		
		assertTrue("Low of QuoteLoser does not match expected", qLoser.getLow().compareTo(BigDecimal.valueOf(100.00))==0d);
		assertTrue("Open1 of QuoteLoser does not match expected", qLoser.getOpen().compareTo(BigDecimal.valueOf(200.00))==0d);
		assertTrue("Volume of QuoteLoser does not match expected", qLoser.getVolume()==345.0);
		assertTrue("Price of QuoteLoser does not match expected", qLoser.getPrice().doubleValue()==764.00);
		assertTrue("High of QuoteLoser does not match expected", qLoser.getHigh().compareTo(BigDecimal.valueOf(321.00))==0d);
		assertTrue("CompanyName of QuoteLoser does not match expected", qLoser.getCompanyName().equals("Microsoft"));
		assertTrue("Symbol of QuoteLoser does not match expected", qLoser.getSymbol().equals("MSFT"));
		assertTrue("Change1 of QuoteLoser does not match expected", qLoser.getChange()==2.0);
		
		Quote qLoseSecond = topLosers.get(1);		
		assertTrue("Low of QuoteLoser2 does not match expected", qLoseSecond.getLow().compareTo(BigDecimal.valueOf(100.00))==0d);
		assertTrue("Open1 of QuoteLoser2 does not match expected", qLoseSecond.getOpen().compareTo(BigDecimal.valueOf(200.00))==0d);
		assertTrue("Volume of QuoteLoser2 does not match expected", qLoseSecond.getVolume()==123.0);
		assertTrue("Price of QuoteLoser2 does not match expected", qLoseSecond.getPrice().doubleValue()==256.00);
		assertTrue("High of QuoteLoser2 does not match expected", qLoseSecond.getHigh().compareTo(BigDecimal.valueOf(300.00))==0d);
		assertTrue("CompanyName of QuoteLoser2 does not match expected", qLoseSecond.getCompanyName().equals("Apple"));
		assertTrue("Symbol of QuoteLoser2 does not match expected", qLoseSecond.getSymbol().equals("AAPL"));
		assertTrue("Change1 of QuoteLoser2 does not match expected", qLoseSecond.getChange()==21.0);	
		
	}

	@Test
	public void testGetQuote() throws DAOException {
		TraderServiceManager t = new TraderServiceManager();
		Quote q = t.getQuote("AAPL");
		assertTrue("getQuote failed completely", q != null);

		assertTrue("Low of Quote does not match expected", (double) q.getLow().compareTo(BigDecimal.valueOf(100.00))==0d);
		assertTrue("Open1 of Quote does not match expected", q.getOpen().compareTo(BigDecimal.valueOf(200.00))==0);
		System.out.println("volume is " + q.getVolume());
		assertTrue("Volume of Quote does not match expected", q.getVolume()==123.0);
		assertTrue("Price of Quote does not match expected", q.getPrice().doubleValue()==256.0);
		assertTrue("High of Quote does not match expected", q.getHigh().compareTo(BigDecimal.valueOf(300.00))==0);
		assertTrue("CompanyName of Quote does not match expected", q.getCompanyName().equals("Apple"));
		assertTrue("Symbol of Quote does not match expected", q.getSymbol().equals("AAPL"));
		assertTrue("Change1 of Quote does not match expected", q.getChange()==21.0);

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
				
				assertTrue("Low of Quote AAPL does not match expected", q.getLow().doubleValue()==100.0);
				assertTrue("Open1 of Quote AAPL does not match expected", q.getOpen().doubleValue()==200.0);
				assertTrue("Volume of Quote AAPL does not match expected", q.getVolume()==123.0);
				assertTrue("Price of Quote AAPL does not match expected", q.getPrice().doubleValue()==256.0);
				assertTrue("High of Quote AAPL does not match expected", q.getHigh().doubleValue()==300.0);
				assertTrue("CompanyName of Quote AAPL does not match expected", q.getCompanyName().equals("Apple"));
				assertTrue("Symbol of Quote AAPL does not match expected", q.getSymbol().equals("AAPL"));
				assertTrue("Change1 of Quote AAPL does not match expected", q.getChange()==21.0);	
				
			}else if(q.getSymbol().equals("MSFT")){
				
				assertTrue("Low of Quote MSFT does not match expected", q.getLow().doubleValue()==100.0);
				assertTrue("Open1 of Quote MSFT does not match expected", q.getOpen().doubleValue()==200.0);
				assertTrue("Volume of Quote MSFT does not match expected", q.getVolume()==345.0);
				assertTrue("Price of Quote MSFT does not match expected", q.getPrice().doubleValue()==764.0);
				assertTrue("High of Quote MSFT does not match expected", q.getHigh().doubleValue()==321.0);
				assertTrue("CompanyName of Quote MSFT does not match expected", q.getCompanyName().equals("Microsoft"));
				assertTrue("Symbol of Quote MSFT does not match expected", q.getSymbol().equals("MSFT"));
				assertTrue("Change1 of Quote MSFT does not match expected", q.getChange()==2.0);
				
			}else{
				assertTrue("Quote information does not match expected", false);
			}		
		}		
	}

	//cannot access web service to test the following 3 methods
//	@Test
//	public void testBuy() throws DAOException {
//		TraderServiceManager t = new TraderServiceManager();
//		Order o = t.buy("uid:0", "AAPL", 20.0);
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


	@Test
	public void testGetHolding() throws DAOException {
		TraderServiceManager t = new TraderServiceManager();
		Holding h = t.getHolding("uid:0", 12);
		assertTrue("getHolding failed completely", h != null);
		assertTrue("PurchasePrice of Holding does not match expected", h.getPurchasePrice().doubleValue()==834.14);
		assertTrue("HoldingID of Holding does not match expected", h.getHoldingID()==12);
		assertTrue("Quantity of Holding does not match expected", h.getQuantity()==10.0);
		Calendar purchaseDate = Calendar.getInstance();
		purchaseDate.set(1970, 1, 1, 0, 0, 0);
//		assertTrue("PurchaseDate of Holding does not match expected", h.getPurchaseDate().equals(purchaseDate));
		assertTrue("AccountID of Holding does not match expected", h.getAccountID()==1);
		assertTrue("QuoteSymbol of Holding does not match expected", h.getQuoteId().equals("AAPL"));		
		
	}

	@Test
	public void testGetHoldings() throws DAOException {
		TraderServiceManager t = new TraderServiceManager();
		List<Holding> holdingList = t.getHoldings("uid:0");
		assertTrue("getHoldings failed completely", holdingList != null);
		
		assertTrue("The number of holdings does not match expected", holdingList.size()==2d);
	
		for(int i=0; i<2; i++){
			Holding h = holdingList.get(i);
			if(h.getHoldingId()==12){
				assertTrue("PurchasePrice of Holding does not match expected", h.getPurchasePrice().compareTo(BigDecimal.valueOf(834.14))==0d);
				assertTrue("HoldingID of Holding does not match expected", h.getHoldingID()==12d);
				assertTrue("Quantity of Holding does not match expected", h.getQuantity()==10d);
				Calendar purchaseDate = Calendar.getInstance();
				purchaseDate.set(1970, 1, 1, 0, 0, 0);
//				assertTrue("PurchaseDate of Holding does not match expected", h.getPurchaseDate().equals(purchaseDate));
				assertTrue("AccountID of Holding does not match expected", h.getAccountID()==1);
				assertTrue("QuoteSymbol of Holding does not match expected", h.getQuoteId().equals("AAPL"));					
			}else if(h.getHoldingId() == 13){
				
				//<HOLDING PURCHASEPRICE="256.00" HOLDINGID="13" QUANTITY="10.0" PURCHASEDATE="1970-01-01 00:00:00.0" ACCOUNT_ACCOUNTID="1" QUOTE_SYMBOL="s:AAPL"/>
				assertTrue("PurchasePrice of Holding does not match expected", h.getPurchasePrice().compareTo(BigDecimal.valueOf(256.00))==0d);
				assertTrue("HoldingID of Holding does not match expected", h.getHoldingID()==13.00d );
				assertTrue("Quantity of Holding does not match expected", h.getQuantity()==10.0);
				Calendar purchaseDate = Calendar.getInstance();
				purchaseDate.set(1970, 01, 01, 00, 00, 00);
//				assertTrue("PurchaseDate of Holding does not match expected", h.getPurchaseDate().equals(purchaseDate));
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
		assertTrue("USD of Wallet does not match expected", w.getUsd().compareTo(BigDecimal.valueOf(100.00))==0d);
		assertTrue("EUR of Wallet does not match expected", w.getEur().compareTo(BigDecimal.valueOf(990.00))==0d);
		assertTrue("GBP of Wallet does not match expected", w.getGbp().compareTo(BigDecimal.valueOf(10.00))==0d);
		assertTrue("CNY of Wallet does not match expected", w.getCny().compareTo(BigDecimal.valueOf(20.00))==0d);
		assertTrue("INR of Wallet does not match expected", w.getInr().compareTo(BigDecimal.valueOf(714.84))==0d);		
	}

	@Test
	public void testUpdateWallet() throws DAOException {
		TraderServiceManager t = new TraderServiceManager();
		Wallet newWallet = new Wallet("uid:0", BigDecimal.valueOf(200), BigDecimal.valueOf(1000), 
									BigDecimal.valueOf(100), BigDecimal.valueOf(200), BigDecimal.valueOf(800));
		Wallet w = t.updateWallet(newWallet);
		assertTrue("updateWallet failed completely", w != null);
		assertTrue("userID of Wallet does not match expected", w.getUserID().equals("uid:0"));
		assertTrue("USD of Wallet does not match expected", w.getUsd().compareTo(BigDecimal.valueOf(200.00))==0d);
		assertTrue("EUR of Wallet does not match expected", w.getEur().compareTo(BigDecimal.valueOf(1000.00))==0d);
		assertTrue("GBP of Wallet does not match expected", w.getGbp().compareTo(BigDecimal.valueOf(100.00))==0d);
		assertTrue("CNY of Wallet does not match expected", w.getCny().compareTo(BigDecimal.valueOf(200.00))==0d);
		assertTrue("INR of Wallet does not match expected", w.getInr().compareTo(BigDecimal.valueOf(800.00))==0d);			
	}
}
