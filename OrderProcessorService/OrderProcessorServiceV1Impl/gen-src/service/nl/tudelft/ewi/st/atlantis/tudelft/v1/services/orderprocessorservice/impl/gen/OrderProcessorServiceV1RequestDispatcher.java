
package nl.tudelft.ewi.st.atlantis.tudelft.v1.services.orderprocessorservice.impl.gen;

import nl.tudelft.ewi.st.atlantis.tudelft.v1.services.IsOnlineRequest;
import nl.tudelft.ewi.st.atlantis.tudelft.v1.services.IsOnlineResponse;
import nl.tudelft.ewi.st.atlantis.tudelft.v1.services.SubmitOrderRequest;
import nl.tudelft.ewi.st.atlantis.tudelft.v1.services.SubmitOrderResponse;
import nl.tudelft.ewi.st.atlantis.tudelft.v1.services.orderprocessorservice.OrderProcessorServiceV1;
import org.ebayopensource.turmeric.runtime.common.exceptions.ServiceException;
import org.ebayopensource.turmeric.runtime.common.pipeline.Message;
import org.ebayopensource.turmeric.runtime.common.pipeline.MessageContext;
import org.ebayopensource.turmeric.runtime.spf.impl.internal.pipeline.BaseServiceRequestDispatcher;


/**
 * Note : Generated file, any changes will be lost upon regeneration.
 * 
 */
public class OrderProcessorServiceV1RequestDispatcher
    extends BaseServiceRequestDispatcher<OrderProcessorServiceV1>
{


    public OrderProcessorServiceV1RequestDispatcher() {
        super(OrderProcessorServiceV1 .class);
        addSupportedOperation("isOnline", new Class[] {IsOnlineRequest.class }, new Class[] {IsOnlineResponse.class });
        addSupportedOperation("submitOrder", new Class[] {SubmitOrderRequest.class }, new Class[] {SubmitOrderResponse.class });
    }

    public boolean dispatch(MessageContext param0, OrderProcessorServiceV1 param1)
        throws ServiceException
    {
        MessageContext msgCtx = param0;
        OrderProcessorServiceV1 service = param1;
        String operationName = msgCtx.getOperationName();
        Message requestMsg = msgCtx.getRequestMessage();
         
        if ("isOnline".equals(operationName)) {
            IsOnlineRequest param2 = ((IsOnlineRequest) requestMsg.getParam(0));
            try {
                Message responseMsg = msgCtx.getResponseMessage();
                IsOnlineResponse result = service.isOnline(param2);
                responseMsg.setParam(0, result);
            } catch (Throwable th) {
                handleServiceException(msgCtx, th);
            }
            return true;
        }
        else 
        if ("submitOrder".equals(operationName)) {
            SubmitOrderRequest param2 = ((SubmitOrderRequest) requestMsg.getParam(0));
            try {
                Message responseMsg = msgCtx.getResponseMessage();
                SubmitOrderResponse result = service.submitOrder(param2);
                responseMsg.setParam(0, result);
            } catch (Throwable th) {
                handleServiceException(msgCtx, th);
            }
            return true;
        }
        return false;
    }

}
