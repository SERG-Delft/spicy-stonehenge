
package nl.tudelft.ewi.st.atlantis.tudelft.v1.services.orderprocessorservice.gen;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Future;
import javax.xml.ws.AsyncHandler;
import javax.xml.ws.Dispatch;
import javax.xml.ws.Response;
import nl.tudelft.ewi.st.atlantis.tudelft.v1.services.IsOnlineRequest;
import nl.tudelft.ewi.st.atlantis.tudelft.v1.services.IsOnlineResponse;
import nl.tudelft.ewi.st.atlantis.tudelft.v1.services.SubmitOrderRequest;
import nl.tudelft.ewi.st.atlantis.tudelft.v1.services.SubmitOrderResponse;
import nl.tudelft.ewi.st.atlantis.tudelft.v1.services.orderprocessorservice.AsyncOrderProcessorServiceV1;
import org.ebayopensource.turmeric.runtime.common.exceptions.ServiceInvocationException;
import org.ebayopensource.turmeric.runtime.sif.impl.internal.service.BaseServiceProxy;
import org.ebayopensource.turmeric.runtime.sif.service.Service;


/**
 * Note : Generated file, any changes will be lost upon regeneration.
 * 
 */
public class OrderProcessorServiceV1Proxy
    extends BaseServiceProxy<AsyncOrderProcessorServiceV1>
    implements AsyncOrderProcessorServiceV1
{


    public OrderProcessorServiceV1Proxy(Service service) {
        super(service);
    }

    public Future<?> isOnlineAsync(IsOnlineRequest param0, AsyncHandler<IsOnlineResponse> param1) {
        Dispatch dispatch = m_service.createDispatch("isOnline");
        Future<?> result = dispatch.invokeAsync(param0, param1);
        return result;
    }

    public Response<IsOnlineResponse> isOnlineAsync(IsOnlineRequest param0) {
        Dispatch dispatch = m_service.createDispatch("isOnline");
        Response<IsOnlineResponse> result = dispatch.invokeAsync(param0);
        return result;
    }

    public Future<?> submitOrderAsync(SubmitOrderRequest param0, AsyncHandler<SubmitOrderResponse> param1) {
        Dispatch dispatch = m_service.createDispatch("submitOrder");
        Future<?> result = dispatch.invokeAsync(param0, param1);
        return result;
    }

    public Response<SubmitOrderResponse> submitOrderAsync(SubmitOrderRequest param0) {
        Dispatch dispatch = m_service.createDispatch("submitOrder");
        Response<SubmitOrderResponse> result = dispatch.invokeAsync(param0);
        return result;
    }

    public List<Response<?>> poll(boolean block, boolean partial)
        throws InterruptedException
    {
        return m_service.poll(block, partial);
    }

    public IsOnlineResponse isOnline(IsOnlineRequest param0) {
        Object[] params = new Object[ 1 ] ;
        params[ 0 ] = param0;
        List<Object> returnParamList = new ArrayList<Object>();
        try {
            m_service.invoke("isOnline", params, returnParamList);
        } catch (ServiceInvocationException svcInvocationEx) {
            throw wrapInvocationException(svcInvocationEx);
        }
        IsOnlineResponse result = ((IsOnlineResponse) returnParamList.get(0));
        return result;
    }

    public SubmitOrderResponse submitOrder(SubmitOrderRequest param0) {
        Object[] params = new Object[ 1 ] ;
        params[ 0 ] = param0;
        List<Object> returnParamList = new ArrayList<Object>();
        try {
            m_service.invoke("submitOrder", params, returnParamList);
        } catch (ServiceInvocationException svcInvocationEx) {
            throw wrapInvocationException(svcInvocationEx);
        }
        SubmitOrderResponse result = ((SubmitOrderResponse) returnParamList.get(0));
        return result;
    }

}
