package nl.tudelft.ewi.st.atlantis.tudelft.v1.clients.orderprocessor;
import org.ebayopensource.turmeric.runtime.common.exceptions.ServiceException;

import nl.tudelft.ewi.st.atlantis.tudelft.v1.services.orderprocessorservice.gen.SharedOrderProcessorServiceV1Consumer;


public class TradeOrderServiceClient extends
		SharedOrderProcessorServiceV1Consumer {

	public TradeOrderServiceClient(String clientName) throws ServiceException {
		super(clientName);
		// TODO Auto-generated constructor stub
	}

	public TradeOrderServiceClient(String clientName, String environment)
			throws ServiceException {
		super(clientName, environment);
		// TODO Auto-generated constructor stub
	}

	
}
