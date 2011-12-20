
package nl.tudelft.ewi.st.atlantis.v1.services.quoteservice.impl.gen;

import nl.tudelft.ewi.st.atlantis.tudelft.v1.services.GetQuotesRequest;
import nl.tudelft.ewi.st.atlantis.tudelft.v1.services.GetQuotesResponse;
import nl.tudelft.ewi.st.atlantis.tudelft.v1.services.quoteservice.QuoteServiceV1;
import org.ebayopensource.turmeric.runtime.common.exceptions.ServiceException;
import org.ebayopensource.turmeric.runtime.common.pipeline.Message;
import org.ebayopensource.turmeric.runtime.common.pipeline.MessageContext;
import org.ebayopensource.turmeric.runtime.spf.impl.internal.pipeline.BaseServiceRequestDispatcher;


/**
 * Note : Generated file, any changes will be lost upon regeneration.
 * 
 */
public class QuoteServiceV1RequestDispatcher
    extends BaseServiceRequestDispatcher<QuoteServiceV1>
{


    public QuoteServiceV1RequestDispatcher() {
        super(QuoteServiceV1 .class);
        addSupportedOperation("getQuotes", new Class[] {GetQuotesRequest.class }, new Class[] {GetQuotesResponse.class });
    }

    public boolean dispatch(MessageContext param0, QuoteServiceV1 param1)
        throws ServiceException
    {
        MessageContext msgCtx = param0;
        QuoteServiceV1 service = param1;
        String operationName = msgCtx.getOperationName();
        Message requestMsg = msgCtx.getRequestMessage();
         
        if ("getQuotes".equals(operationName)) {
            GetQuotesRequest param2 = ((GetQuotesRequest) requestMsg.getParam(0));
            try {
                Message responseMsg = msgCtx.getResponseMessage();
                GetQuotesResponse result = service.getQuotes(param2);
                responseMsg.setParam(0, result);
            } catch (Throwable th) {
                handleServiceException(msgCtx, th);
            }
            return true;
        }
        return false;
    }

}
