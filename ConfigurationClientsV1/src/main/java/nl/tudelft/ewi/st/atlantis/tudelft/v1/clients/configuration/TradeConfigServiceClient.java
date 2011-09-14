package nl.tudelft.ewi.st.atlantis.tudelft.v1.clients.configuration;

import java.net.MalformedURLException;

import org.ebayopensource.turmeric.runtime.common.exceptions.ServiceException;

import nl.tudelft.ewi.st.atlantis.tudelft.v1.services.GetBSConfigRequest;
import nl.tudelft.ewi.st.atlantis.tudelft.v1.services.GetBSConfigResponse;
import nl.tudelft.ewi.st.atlantis.tudelft.v1.services.GetClientConfigRequest;
import nl.tudelft.ewi.st.atlantis.tudelft.v1.services.GetClientConfigResponse;
import nl.tudelft.ewi.st.atlantis.tudelft.v1.services.configurationservice.gen.SharedConfigurationServiceV1Consumer;
import nl.tudelft.stocktrader.dal.ConfigServiceDAO;
import nl.tudelft.stocktrader.dal.DAOFactory;
import nl.tudelft.stocktrader.services.TradeOrderConfig;

public class TradeConfigServiceClient extends
		SharedConfigurationServiceV1Consumer {

	private static TradeConfigServiceClient self = null;
	
	private static ConfigServiceDAO configServiceDAO;
	
	public static TradeConfigServiceClient getInstance() throws ServiceException, MalformedURLException {
		configServiceDAO = DAOFactory.getFactory().getConfigServiceDAO();
		
		self = new TradeConfigServiceClient("TradeService");
		
		self.setServiceLocation(configServiceDAO.getConfigService());
		return self;
	}
	
	public TradeOrderConfig getTraderOrderConfig() {
		GetClientConfigRequest configRequest = new GetClientConfigRequest();
		configRequest.setClientName("TradeService");
		
		GetClientConfigResponse configResponse = self.getClientConfig(configRequest);
		
		String bsName = configResponse.getBSName();
		
		GetBSConfigRequest bsRequest = new GetBSConfigRequest();
		bsRequest.setBSName(bsName);
		
		GetBSConfigResponse bsResponse = self.getBSConfig(bsRequest);
		
		TradeOrderConfig config = new TradeOrderConfig();
		config.setServiceName(bsResponse.getOPSName());
		config.setEndpointURL(bsResponse.getOPS());
		config.setSecure(bsResponse.isSec());
		
		return config;
	}
	
	public TradeConfigServiceClient(String clientName) throws ServiceException {
		super(clientName);
		// TODO Auto-generated constructor stub
	}

	public TradeConfigServiceClient(String clientName, String environment)
			throws ServiceException {
		super(clientName, environment);
		// TODO Auto-generated constructor stub
	}

}
