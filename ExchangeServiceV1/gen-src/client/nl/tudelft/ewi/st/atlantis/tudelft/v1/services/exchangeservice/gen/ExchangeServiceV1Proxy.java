
package nl.tudelft.ewi.st.atlantis.tudelft.v1.services.exchangeservice.gen;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Future;
import javax.xml.ws.AsyncHandler;
import javax.xml.ws.Dispatch;
import javax.xml.ws.Response;
import nl.tudelft.ewi.st.atlantis.tudelft.v1.services.CheckAmountRequest;
import nl.tudelft.ewi.st.atlantis.tudelft.v1.services.CheckAmountResponse;
import nl.tudelft.ewi.st.atlantis.tudelft.v1.services.CheckCurrencyRequest;
import nl.tudelft.ewi.st.atlantis.tudelft.v1.services.CheckCurrencyResponse;
import nl.tudelft.ewi.st.atlantis.tudelft.v1.services.ExchangeCurrencyRequest;
import nl.tudelft.ewi.st.atlantis.tudelft.v1.services.ExchangeCurrencyResponse;
import nl.tudelft.ewi.st.atlantis.tudelft.v1.services.UpdateWalletDataRequest;
import nl.tudelft.ewi.st.atlantis.tudelft.v1.services.UpdateWalletDataResponse;
import nl.tudelft.ewi.st.atlantis.tudelft.v1.services.exchangeservice.AsyncExchangeServiceV1;
import org.ebayopensource.turmeric.runtime.common.exceptions.ServiceInvocationException;
import org.ebayopensource.turmeric.runtime.sif.impl.internal.service.BaseServiceProxy;
import org.ebayopensource.turmeric.runtime.sif.service.Service;


/**
 * Note : Generated file, any changes will be lost upon regeneration.
 * 
 */
public class ExchangeServiceV1Proxy
    extends BaseServiceProxy<AsyncExchangeServiceV1>
    implements AsyncExchangeServiceV1
{


    public ExchangeServiceV1Proxy(Service service) {
        super(service);
    }

    public List<Response<?>> poll(boolean block, boolean partial)
        throws InterruptedException
    {
        return m_service.poll(block, partial);
    }

    public Response<UpdateWalletDataResponse> updateWalletDataAsync(UpdateWalletDataRequest param0) {
        Dispatch dispatch = m_service.createDispatch("updateWalletData");
        Response<UpdateWalletDataResponse> result = dispatch.invokeAsync(param0);
        return result;
    }

    public Future<?> updateWalletDataAsync(UpdateWalletDataRequest param0, AsyncHandler<UpdateWalletDataResponse> param1) {
        Dispatch dispatch = m_service.createDispatch("updateWalletData");
        Future<?> result = dispatch.invokeAsync(param0, param1);
        return result;
    }

    public Response<ExchangeCurrencyResponse> exchangeCurrencyAsync(ExchangeCurrencyRequest param0) {
        Dispatch dispatch = m_service.createDispatch("exchangeCurrency");
        Response<ExchangeCurrencyResponse> result = dispatch.invokeAsync(param0);
        return result;
    }

    public Future<?> exchangeCurrencyAsync(ExchangeCurrencyRequest param0, AsyncHandler<ExchangeCurrencyResponse> param1) {
        Dispatch dispatch = m_service.createDispatch("exchangeCurrency");
        Future<?> result = dispatch.invokeAsync(param0, param1);
        return result;
    }

    public Future<?> checkCurrencyAsync(CheckCurrencyRequest param0, AsyncHandler<CheckCurrencyResponse> param1) {
        Dispatch dispatch = m_service.createDispatch("checkCurrency");
        Future<?> result = dispatch.invokeAsync(param0, param1);
        return result;
    }

    public Response<CheckCurrencyResponse> checkCurrencyAsync(CheckCurrencyRequest param0) {
        Dispatch dispatch = m_service.createDispatch("checkCurrency");
        Response<CheckCurrencyResponse> result = dispatch.invokeAsync(param0);
        return result;
    }

    public Future<?> checkAmountAsync(CheckAmountRequest param0, AsyncHandler<CheckAmountResponse> param1) {
        Dispatch dispatch = m_service.createDispatch("checkAmount");
        Future<?> result = dispatch.invokeAsync(param0, param1);
        return result;
    }

    public Response<CheckAmountResponse> checkAmountAsync(CheckAmountRequest param0) {
        Dispatch dispatch = m_service.createDispatch("checkAmount");
        Response<CheckAmountResponse> result = dispatch.invokeAsync(param0);
        return result;
    }

    public UpdateWalletDataResponse updateWalletData(UpdateWalletDataRequest param0) {
        Object[] params = new Object[ 1 ] ;
        params[ 0 ] = param0;
        List<Object> returnParamList = new ArrayList<Object>();
        try {
            m_service.invoke("updateWalletData", params, returnParamList);
        } catch (ServiceInvocationException svcInvocationEx) {
            throw wrapInvocationException(svcInvocationEx);
        }
        UpdateWalletDataResponse result = ((UpdateWalletDataResponse) returnParamList.get(0));
        return result;
    }

    public ExchangeCurrencyResponse exchangeCurrency(ExchangeCurrencyRequest param0) {
        Object[] params = new Object[ 1 ] ;
        params[ 0 ] = param0;
        List<Object> returnParamList = new ArrayList<Object>();
        try {
            m_service.invoke("exchangeCurrency", params, returnParamList);
        } catch (ServiceInvocationException svcInvocationEx) {
            throw wrapInvocationException(svcInvocationEx);
        }
        ExchangeCurrencyResponse result = ((ExchangeCurrencyResponse) returnParamList.get(0));
        return result;
    }

    public CheckCurrencyResponse checkCurrency(CheckCurrencyRequest param0) {
        Object[] params = new Object[ 1 ] ;
        params[ 0 ] = param0;
        List<Object> returnParamList = new ArrayList<Object>();
        try {
            m_service.invoke("checkCurrency", params, returnParamList);
        } catch (ServiceInvocationException svcInvocationEx) {
            throw wrapInvocationException(svcInvocationEx);
        }
        CheckCurrencyResponse result = ((CheckCurrencyResponse) returnParamList.get(0));
        return result;
    }

    public CheckAmountResponse checkAmount(CheckAmountRequest param0) {
        Object[] params = new Object[ 1 ] ;
        params[ 0 ] = param0;
        List<Object> returnParamList = new ArrayList<Object>();
        try {
            m_service.invoke("checkAmount", params, returnParamList);
        } catch (ServiceInvocationException svcInvocationEx) {
            throw wrapInvocationException(svcInvocationEx);
        }
        CheckAmountResponse result = ((CheckAmountResponse) returnParamList.get(0));
        return result;
    }

}
