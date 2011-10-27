
package nl.tudelft.ewi.st.atlantis.tudelft.v1.services.exchangeservice.impl.gen;

import nl.tudelft.ewi.st.atlantis.tudelft.v1.services.ExchangeCurrencyRequest;
import nl.tudelft.ewi.st.atlantis.tudelft.v1.services.ExchangeCurrencyResponse;
import nl.tudelft.ewi.st.atlantis.tudelft.v1.services.exchangeservice.ExchangeServiceV1;
import org.ebayopensource.turmeric.runtime.common.exceptions.ServiceException;
import org.ebayopensource.turmeric.runtime.common.pipeline.Message;
import org.ebayopensource.turmeric.runtime.common.pipeline.MessageContext;
import org.ebayopensource.turmeric.runtime.spf.impl.internal.pipeline.BaseServiceRequestDispatcher;


/**
 * Note : Generated file, any changes will be lost upon regeneration.
 * 
 */
public class ExchangeServiceV1RequestDispatcher
    extends BaseServiceRequestDispatcher<ExchangeServiceV1>
{


    public ExchangeServiceV1RequestDispatcher() {
        super(ExchangeServiceV1 .class);
        addSupportedOperation("exchangeCurrency", new Class[] {ExchangeCurrencyRequest.class }, new Class[] {ExchangeCurrencyResponse.class });
    }

    public boolean dispatch(MessageContext param0, ExchangeServiceV1 param1)
        throws ServiceException
    {
        MessageContext msgCtx = param0;
        ExchangeServiceV1 service = param1;
        String operationName = msgCtx.getOperationName();
        Message requestMsg = msgCtx.getRequestMessage();
         
        if ("exchangeCurrency".equals(operationName)) {
            ExchangeCurrencyRequest param2 = ((ExchangeCurrencyRequest) requestMsg.getParam(0));
            try {
                Message responseMsg = msgCtx.getResponseMessage();
                ExchangeCurrencyResponse result = service.exchangeCurrency(param2);
                responseMsg.setParam(0, result);
            } catch (Throwable th) {
                handleServiceException(msgCtx, th);
            }
            return true;
        }
        return false;
    }

}
