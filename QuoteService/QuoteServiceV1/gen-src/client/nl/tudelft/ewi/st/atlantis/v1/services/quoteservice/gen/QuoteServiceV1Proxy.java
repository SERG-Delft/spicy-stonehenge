
package nl.tudelft.ewi.st.atlantis.v1.services.quoteservice.gen;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Future;
import javax.xml.ws.AsyncHandler;
import javax.xml.ws.Dispatch;
import javax.xml.ws.Response;
import nl.tudelft.ewi.st.atlantis.v1.services.GetQuotesRequest;
import nl.tudelft.ewi.st.atlantis.v1.services.GetQuotesResponse;
import nl.tudelft.ewi.st.atlantis.v1.services.quoteservice.AsyncQuoteServiceV1;
import org.ebayopensource.turmeric.runtime.common.exceptions.ServiceInvocationException;
import org.ebayopensource.turmeric.runtime.sif.impl.internal.service.BaseServiceProxy;
import org.ebayopensource.turmeric.runtime.sif.service.Service;


/**
 * Note : Generated file, any changes will be lost upon regeneration.
 * 
 */
public class QuoteServiceV1Proxy
    extends BaseServiceProxy<AsyncQuoteServiceV1>
    implements AsyncQuoteServiceV1
{


    public QuoteServiceV1Proxy(Service service) {
        super(service);
    }

    public List<Response<?>> poll(boolean block, boolean partial)
        throws InterruptedException
    {
        return m_service.poll(block, partial);
    }

    public Future<?> getQuotesAsync(GetQuotesRequest param0, AsyncHandler<GetQuotesResponse> param1) {
        Dispatch dispatch = m_service.createDispatch("getQuotes");
        Future<?> result = dispatch.invokeAsync(param0, param1);
        return result;
    }

    public Response<GetQuotesResponse> getQuotesAsync(GetQuotesRequest param0) {
        Dispatch dispatch = m_service.createDispatch("getQuotes");
        Response<GetQuotesResponse> result = dispatch.invokeAsync(param0);
        return result;
    }

    public GetQuotesResponse getQuotes(GetQuotesRequest param0) {
        Object[] params = new Object[ 1 ] ;
        params[ 0 ] = param0;
        List<Object> returnParamList = new ArrayList<Object>();
        try {
            m_service.invoke("getQuotes", params, returnParamList);
        } catch (ServiceInvocationException svcInvocationEx) {
            throw wrapInvocationException(svcInvocationEx);
        }
        GetQuotesResponse result = ((GetQuotesResponse) returnParamList.get(0));
        return result;
    }

}
