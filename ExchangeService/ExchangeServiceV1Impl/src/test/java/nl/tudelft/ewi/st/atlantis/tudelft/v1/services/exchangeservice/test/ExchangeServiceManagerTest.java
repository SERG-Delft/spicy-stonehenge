package nl.tudelft.ewi.st.atlantis.tudelft.v1.services.exchangeservice.test;

import static org.junit.Assert.*;

import java.io.File;
import java.io.PrintWriter;
import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

import nl.tudelft.ewi.st.atlantis.tudelft.v1.services.exchangeservice.impl.ExchangeServiceManager;
import nl.tudelft.stocktrader.Wallet;
import nl.tudelft.stocktrader.dal.DAOException;
import nl.tudelft.stocktrader.dal.DAOFactory;

import org.apache.commons.dbcp.BasicDataSource;
import org.apache.ddlutils.task.DdlToDatabaseTask;
import org.apache.ddlutils.task.WriteDataToDatabaseCommand;
import org.apache.ddlutils.task.WriteSchemaToDatabaseCommand;
import org.apache.derby.drda.NetworkServerControl;
import org.junit.After;
import org.junit.AfterClass;
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
		  writeCommand.setAlterDatabase(false);
		  writeCommand.setDoDrops(true);
		  d.addWriteSchemaToDatabase(writeCommand);
		  
		  d.setSchemaFile(new File("src/test/resources/db-schema.xml"));
		  
		  BasicDataSource dataSource = new BasicDataSource();
		  dataSource.setDriverClassName("org.apache.derby.jdbc.ClientDriver");
		  dataSource.setUrl("jdbc:derby://localhost:1527/testdb");
		  
		  d.addConfiguredDatabase(dataSource);
		  
		  WriteDataToDatabaseCommand cmd = new WriteDataToDatabaseCommand();
		  cmd.setDataFile(new File("src/test/resources/db-data.xml"));
		  
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

	@AfterClass
	public static void tearDownDatabase() throws Exception {
		System.out.println("Test");
		if(conn!=null)
			conn.close();
		server.shutdown();
		  
		  try {
		   while(true) {
		    server.ping();
		    Thread.sleep(1000);
		   }
		  } catch(Exception e) {}
		  
//		  FileUtils.forceDelete(new File("testdb"));
//		  FileUtils.forceDelete(new File("derby.log"));
	}
	
	@After
	public void tearDown() throws Exception {
		  
	}

	@Test
	public void testExchangeServiceManager() {
		ExchangeServiceManager t = new ExchangeServiceManager();
		assertTrue("ExchangeServiceManager Constructor failed", t != null);
	}

	@Test
	public void testCheckCurrency() {
		ExchangeServiceManager m = new ExchangeServiceManager();
		assertTrue("check existing currency failed", m.checkCurrency("uid:0", "EUR", "USD"));
		assertTrue("check non-existing base currency failed", !m.checkCurrency("uid:0", "ER", "USD"));
		assertTrue("check non-existing aim currency failed", !m.checkCurrency("uid:0", "EUR", "UD"));
		assertTrue("check non-existing currencies failed", !m.checkCurrency("uid:0", "ER", "UD"));		
	}

	@Test
	public void testCheckAmount() throws DAOException {
		ExchangeServiceManager m = new ExchangeServiceManager();
		assertTrue("check enough currency failed", m.checkAmount("uid:0", "EUR", BigDecimal.valueOf(90)));
		assertTrue("check not-enough currency failed", !m.checkAmount("uid:0", "EUR", BigDecimal.valueOf(1000)));		
	}

	@Test
	public void testExchangeCurrency() {
		ExchangeServiceManager m = new ExchangeServiceManager();
		BigDecimal exchSmall = m.exchangeCurrency(BigDecimal.valueOf(10), "EUR", "CNY");
		assertTrue("Exchange small currency failed", exchSmall != null);
		
		//Pay attention!!!! The exchange rate is always changing. Need up-date data to test..		
		assertTrue("Exchange small currency result does not match expected", exchSmall.compareTo(BigDecimal.valueOf(82))==1);
		
		BigDecimal exchLarge = m.exchangeCurrency(BigDecimal.valueOf(10000000), "EUR", "CNY");
		assertTrue("Exchange large currency failed", exchLarge != null);
		System.out.println("the large amount is " + exchLarge.toString());
		assertTrue("Exchange large currency result is not correct", exchLarge.compareTo(BigDecimal.valueOf(80000000))==1);
	}

	@Test
	public void testUpdateWallet() throws DAOException {
		ExchangeServiceManager m = new ExchangeServiceManager();
		Wallet w = m.updateWallet("uid:0", "EUR", "INR", BigDecimal.valueOf(10), BigDecimal.valueOf(100));
		//  <WALLET WALLETID="1" USERID="uid:0" USD="100.00" EUR="990.00" GBP="10.00" CNY="20.00" INR="714.84" />
		
		assertTrue("updateWallet failed completely", w != null);
		assertTrue("userID of Wallet does not match expected", w.getUserID().equals("uid:0"));
		assertTrue("USD of Wallet does not match expected", w.getUsd().compareTo(BigDecimal.valueOf(100.00))==0);
		assertTrue("EUR of Wallet does not match expected", w.getEur().compareTo(BigDecimal.valueOf(980.00))==0);
		assertTrue("GBP of Wallet does not match expected", w.getGbp().compareTo(BigDecimal.valueOf(10.00))==0);
		assertTrue("CNY of Wallet does not match expected", w.getCny().compareTo(BigDecimal.valueOf(20.00))==0);
		assertTrue("INR of Wallet does not match expected", w.getInr().compareTo(BigDecimal.valueOf(814.84))==0);		
		
	}

}
