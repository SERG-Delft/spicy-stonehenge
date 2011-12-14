
package nl.tudelft.ewi.st.atlantis.tudelft.v1.services.orderprocessorservice;

import java.util.List;
import java.util.concurrent.Future;
import javax.xml.ws.AsyncHandler;
import javax.xml.ws.Response;
import nl.tudelft.ewi.st.atlantis.tudelft.v1.services.IsOnlineRequest;
import nl.tudelft.ewi.st.atlantis.tudelft.v1.services.IsOnlineResponse;
import nl.tudelft.ewi.st.atlantis.tudelft.v1.services.SubmitOrderRequest;
import nl.tudelft.ewi.st.atlantis.tudelft.v1.services.SubmitOrderResponse;

public interface AsyncOrderProcessorServiceV1
    extends OrderProcessorServiceV1
{


    public Future<?> isOnlineAsync(IsOnlineRequest param0, AsyncHandler<IsOnlineResponse> handler);

    public Response<IsOnlineResponse> isOnlineAsync(IsOnlineRequest param0);

    public Future<?> submitOrderAsync(SubmitOrderRequest param0, AsyncHandler<SubmitOrderResponse> handler);

    public Response<SubmitOrderResponse> submitOrderAsync(SubmitOrderRequest param0);

    public List<Response<?>> poll(boolean block, boolean partial)
        throws InterruptedException
    ;

}
