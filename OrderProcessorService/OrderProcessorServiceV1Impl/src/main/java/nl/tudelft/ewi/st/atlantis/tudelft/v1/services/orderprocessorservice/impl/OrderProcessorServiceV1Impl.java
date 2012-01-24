package nl.tudelft.ewi.st.atlantis.tudelft.v1.services.orderprocessorservice.impl;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import nl.tudelft.ewi.st.atlantis.tudelft.intf.OrderProcessorServiceV1;
import nl.tudelft.ewi.st.atlantis.tudelft.v1.types.IsOnlineRequest;
import nl.tudelft.ewi.st.atlantis.tudelft.v1.types.IsOnlineResponse;
import nl.tudelft.ewi.st.atlantis.tudelft.v1.types.SubmitOrderRequest;
import nl.tudelft.ewi.st.atlantis.tudelft.v1.types.SubmitOrderResponse;
import nl.tudelft.ewi.st.atlantis.tudelft.v1.types.OrderData;
import nl.tudelft.stocktrader.Order;
import nl.tudelft.stocktrader.TypeFactory;
import nl.tudelft.stocktrader.dal.DAOException;

public class OrderProcessorServiceV1Impl implements OrderProcessorServiceV1
{

    private static final Log logger = LogFactory.getLog(OrderProcessorServiceV1Impl.class);
    
	// OrderProcessManager is the controller for managing order processing.
	private final OrderProcessManager orderProcessManager = new OrderProcessManager();

    public IsOnlineResponse isOnline(IsOnlineRequest empty) {
    	logger.debug("OrderProcessorImpl.isOnline(IsOnlines)");
    	return new IsOnlineResponse();
    }

    public SubmitOrderResponse submitOrder(SubmitOrderRequest request) {
    	OrderData orderData = request.getData();
		Order order = TypeFactory.toOrder(orderData);
		try {
			processOrder(order);
		} catch (DAOException e) {
			logger.error("", e);
		}
		
		return new SubmitOrderResponse();
    }
    
    private void processOrder(Order queueOrder) throws DAOException {
		// 2 seconds delay to ensure that MSFT-BL has committed new order
		// entries to the database which will happen when it gets HTTP 202
		// accepted header
		
    	// Tiago: Not sure we need this. taking it out
    	//Thread.sleep(2 * 1000);
    	
    	
		orderProcessManager.processAndCompleteOrder(queueOrder);
	}

}
