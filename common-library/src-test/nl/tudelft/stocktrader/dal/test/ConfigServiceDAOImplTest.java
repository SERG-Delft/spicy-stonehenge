package nl.tudelft.stocktrader.dal.test;

import static org.junit.Assert.*;

import java.io.File;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.List;
import java.util.Properties;

import nl.tudelft.stocktrader.dal.ConfigServiceDAO;
import nl.tudelft.stocktrader.dal.ConfigServiceDAOImpl;
import nl.tudelft.stocktrader.dal.DAOFactory;
import nl.tudelft.stocktrader.dal.configservice.BSConfig;
import nl.tudelft.stocktrader.dal.configservice.ClientConfig;
import nl.tudelft.stocktrader.dal.configservice.OPSConfig;
import nl.tudelft.stocktrader.dal.configservice.ServiceLocation;

import org.apache.commons.dbcp.BasicDataSource;
import org.apache.commons.io.FileUtils;
import org.apache.ddlutils.task.DdlToDatabaseTask;
import org.apache.ddlutils.task.WriteDataToDatabaseCommand;
import org.apache.ddlutils.task.WriteSchemaToDatabaseCommand;
import org.apache.derby.drda.NetworkServerControl;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class ConfigServiceDAOImplTest {

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

		 conn = DriverManager.getConnection("jdbc:derby://localhost:1527/testdb;create=true");
	}
	
	@AfterClass
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

//	@Test
//	public void testConfigServiceDAOImpl() {
//		fail("Not yet implemented");
//	}

	@Test
	public void testSetConnection() throws Exception {
		Connection c = DriverManager.getConnection("jdbc:derby:wombat;create=true");
		
		ConfigServiceDAOImpl configService = new ConfigServiceDAOImpl();
		configService.setConnection(c);
		
		/* Is the connection the same? */
		assertEquals("The connection was modified.", c, configService.getConnection());
		
		c.close();
		
		File db = new File("wombat");
		
		FileUtils.forceDelete(db);
		
		assertFalse("Could not delete database",db.exists());
	}

	@Test
	public void testUpdateConfigService() throws Exception {
		DAOFactory factory = DAOFactory.getFactory();
		
		String newConfigURL = "This is a new URL";
		
		/* Get the data access object */
		ConfigServiceDAO dao = factory.getConfigServiceDAO();
		
		/* Test that it is different before */
		assertFalse("Config service was already set to new value",
					dao.getConfigService().equals(newConfigURL));
		
		
		/* Connection gets closed after each call */
		dao = factory.getConfigServiceDAO();
		
		/* Test whether the update was successful */
		assertTrue("Could not update config service",
					dao.updateConfigService(newConfigURL));
		
		
		/* Connection gets closed after each call */
		dao = factory.getConfigServiceDAO();
		
		/* Make sure the update persisted */
		assertTrue("Config service was not updated",
				newConfigURL.equals(dao.getConfigService()));
		
		/* Connection gets closed after each call */
		dao = factory.getConfigServiceDAO();
		
		assertFalse("Config service accepted null",
				dao.updateConfigService(null));
	}

	@Test
	public void testGetConfigService() {
		/* Get the data access object */
		ConfigServiceDAO dao = DAOFactory.getFactory().getConfigServiceDAO();
		
		String configServiceLocation = "http://localhost:8080/configurationservice/ConfigurationServiceV1";
		
		assertTrue("Config service does not match expected",
				dao.getConfigService().equals(configServiceLocation));
	}

	@Test
	public void testGetQSLocations() {
		/* Get the data access object */
		ConfigServiceDAO dao = DAOFactory.getFactory().getConfigServiceDAO();
		
		List<ServiceLocation> locations = dao.getQSLocations();
		
		/* Check size of result */
		assertTrue("Got more QS locations than expected!", locations.size() == 1);
		
		ServiceLocation s = locations.get(0);
		
		/* Check data in result */
		assertTrue("", s.getServiceName().equals("atlantis_QS"));
		assertTrue("", s.getServiceURL().equals("http://localhost:8080/quoteservice/QuoteServiceV1"));
	}

	@Test
	public void testGetESLocations() {
		/* Get the data access object */
		ConfigServiceDAO dao = DAOFactory.getFactory().getConfigServiceDAO();
		
		List<ServiceLocation> locations = dao.getESLocations();
		
		/* Check size of result */
		assertTrue("Got more ES locations than expected!", locations.size() == 1);
		
		ServiceLocation s = locations.get(0);
		
		/* Check data in result */
		assertTrue("", s.getServiceName().equals("atlantis_ES"));
		assertTrue("", s.getServiceURL().equals("http://localhost:8080/exchange-service-war/ExchangeServiceV1"));
	}

	@Test
	public void testGetBSLocations() {
		/* Get the data access object */
		ConfigServiceDAO dao = DAOFactory.getFactory().getConfigServiceDAO();
		
		List<ServiceLocation> locations = dao.getBSLocations();
		
		/* Check size of result */
		assertTrue("Got more BS locations than expected!", locations.size() == 1);
		
		ServiceLocation s = locations.get(0);
		
		/* Check data in result */
		assertTrue("", s.getServiceName().equals("atlantis_BS"));
		assertTrue("", s.getServiceURL().equals("http://localhost:8080/business-service-war/BusinessServiceV1"));
	}

	@Test
	public void testGetOPSLocations() {
		/* Get the data access object */
		ConfigServiceDAO dao = DAOFactory.getFactory().getConfigServiceDAO();
		
		List<ServiceLocation> locations = dao.getOPSLocations();
		
		/* Check size of result */
		assertTrue("Got more OPS locations than expected!", locations.size() == 1);
		
		ServiceLocation s = locations.get(0);
		
		/* Check data in result */
		assertTrue("", s.getServiceName().equals("atlantis_OPS"));
		assertTrue("", s.getServiceURL().equals("http://localhost:8080/orderprocessor-service-war/OrderProcessorServiceV1"));
	}

	@Test
	public void testGetClientConfig() {
		/* Get the data access object */
		ConfigServiceDAO dao = DAOFactory.getFactory().getConfigServiceDAO();
		
		ClientConfig client = dao.getClientConfig("PHP_CLIENT");
		
		String expectedEndpoint = "http://localhost:8080/business-service-war/BusinessServiceV1";
		String expectedName = "atlantis_BS";
		
		assertTrue("Endpoint different than expected in client config",
				client.getBS().equals(expectedEndpoint));
		assertTrue("Name different than expected in client config",
				client.getBSName().equals(expectedName));
	}

	@Test
	public void testGetBSConfig() {
		/* Get the data access object */
		ConfigServiceDAO dao = DAOFactory.getFactory().getConfigServiceDAO();
		
		BSConfig bs = dao.getBSConfig("atlantis_BS");
		
		assertNotNull("BSConfig was null", bs);
		
		String expectedHostName = "atlantis.st.ewi.tudelft.nl";
		String expectedName = "atlantis";
		int expectedPort = 1527;
		String expectedOPS = "http://localhost:8080/orderprocessor-service-war/OrderProcessorServiceV1";
		String expectedOPSName = "atlantis_OPS";
		
		assertTrue("Got wrong DB hostname", bs.getDBHostName().equals(expectedHostName));
		assertTrue("Got wrong DB name", bs.getDBName().equals(expectedName));
		assertTrue("Got wrong DB port", bs.getDBPort() == expectedPort);
		assertTrue("Got wrong OPS", bs.getOPS().equals(expectedOPS));
		assertTrue("Got wrong OPS name", bs.getOPSName().equals(expectedOPSName));
	}

	@Test
	public void testGetOPSConfig() {
		DAOFactory factory = DAOFactory.getFactory();
		
		/* Get the data access object */
		ConfigServiceDAO dao = factory.getConfigServiceDAO();
		
		OPSConfig ops = dao.getOPSConfig("atlantis_OPS");
		
		assertNotNull("OPSConfig was null", ops);
		
		String expectedHostName = "atlantis.st.ewi.tudelft.nl";
		String expectedName = "atlantis";
		int expectedPort = 1527;
		
		assertTrue("Got wrong DB hostname", ops.getDBHostName().equals(expectedHostName));
		assertTrue("Got wrong DB name", ops.getDBName().equals(expectedName));
		assertTrue("Got wrong DB port", ops.getDBPort() == expectedPort);
		
		/* Connection gets closed after each call */
		dao = factory.getConfigServiceDAO();
		
		OPSConfig c = dao.getOPSConfig("inexistent");
		
		System.out.println();
		
	}

	@Test
	public void testSetClientToBS() {
		DAOFactory factory = DAOFactory.getFactory();
		
		/* Get the data access object */
		ConfigServiceDAO dao = factory.getConfigServiceDAO();
		
		assertTrue("Could not set client to BS",
				dao.setClientToBS("JUnit", "atlantis_BS"));
		
		/* Connection gets closed after each call */
		dao = factory.getConfigServiceDAO();
		
		ClientConfig config = dao.getClientConfig("JUnit");
		
		assertNotNull("ClientConfig was null", config);
		
		String expectedBSendpoint = "http://localhost:8080/business-service-war/BusinessServiceV1";
		String expectedBSName = "atlantis_BS";
		
		assertTrue("BS endpoint not as expected", config.getBS().equals(expectedBSendpoint));
		assertTrue("BSName not as expected", config.getBSName().equals(expectedBSName));
		
		/* Connection gets closed after each call */
		dao = factory.getConfigServiceDAO();
		
		assertFalse("Managed to set a null client to BS",
				dao.setClientToBS(null, null));
	}

	@Test
	public void testSetBSToOPS() {
		DAOFactory factory = DAOFactory.getFactory();
		
		/* Get the data access object */
		ConfigServiceDAO dao = factory.getConfigServiceDAO();
		
		assertTrue("Could not set BS to OPS",
				dao.setBSToOPS("atlantis_BS", "atlantis_OPS"));
		
		/* Connection gets closed after each call */
		dao = factory.getConfigServiceDAO();
		
		assertFalse("Managed to set a null OPS",
				dao.setBSToOPS("atlantis_BS", null));
		
		/* Connection gets closed after each call */
		dao = factory.getConfigServiceDAO();
		
		assertFalse("Managed to set an inexistant OPS to a BS",
				dao.setBSToOPS("atlantis_BS", "Nothing"));
		
		/* Connection gets closed after each call */
		dao = factory.getConfigServiceDAO();
		
		assertFalse("Managed to set an OPS to an inexistant BS",
				dao.setBSToOPS("Nothing", "atlantis_OPS"));
	}
//
//	@Test
//	public void testSetServiceLocation() {
//		fail("Not yet implemented");
//	}

}
