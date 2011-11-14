
package nl.tudelft.ewi.st.atlantis.v1.services.quoteservice;

import java.util.List;
import java.util.concurrent.Future;
import javax.xml.ws.AsyncHandler;
import javax.xml.ws.Response;
import nl.tudelft.ewi.st.atlantis.v1.services.GetQuotesRequest;
import nl.tudelft.ewi.st.atlantis.v1.services.GetQuotesResponse;

public interface AsyncQuoteServiceV1
    extends QuoteServiceV1
{


    public Future<?> getQuotesAsync(GetQuotesRequest param0, AsyncHandler<GetQuotesResponse> handler);

    public Response<GetQuotesResponse> getQuotesAsync(GetQuotesRequest param0);

    public List<Response<?>> poll(boolean block, boolean partial)
        throws InterruptedException
    ;

}
