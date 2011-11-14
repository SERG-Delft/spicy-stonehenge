
package nl.tudelft.ewi.st.atlantis.tudelft.v1.services.businessservice.gen;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Future;
import javax.xml.ws.AsyncHandler;
import javax.xml.ws.Dispatch;
import javax.xml.ws.Response;
import nl.tudelft.ewi.st.atlantis.tudelft.v1.services.BuyRequest;
import nl.tudelft.ewi.st.atlantis.tudelft.v1.services.BuyResponse;
import nl.tudelft.ewi.st.atlantis.tudelft.v1.services.GetAccountDataRequest;
import nl.tudelft.ewi.st.atlantis.tudelft.v1.services.GetAccountDataResponse;
import nl.tudelft.ewi.st.atlantis.tudelft.v1.services.GetAccountProfileDataRequest;
import nl.tudelft.ewi.st.atlantis.tudelft.v1.services.GetAccountProfileDataResponse;
import nl.tudelft.ewi.st.atlantis.tudelft.v1.services.GetAllQuotesRequest;
import nl.tudelft.ewi.st.atlantis.tudelft.v1.services.GetAllQuotesResponse;
import nl.tudelft.ewi.st.atlantis.tudelft.v1.services.GetClosedOrdersRequest;
import nl.tudelft.ewi.st.atlantis.tudelft.v1.services.GetClosedOrdersResponse;
import nl.tudelft.ewi.st.atlantis.tudelft.v1.services.GetHoldingRequest;
import nl.tudelft.ewi.st.atlantis.tudelft.v1.services.GetHoldingResponse;
import nl.tudelft.ewi.st.atlantis.tudelft.v1.services.GetHoldingsRequest;
import nl.tudelft.ewi.st.atlantis.tudelft.v1.services.GetHoldingsResponse;
import nl.tudelft.ewi.st.atlantis.tudelft.v1.services.GetMarketSummaryRequest;
import nl.tudelft.ewi.st.atlantis.tudelft.v1.services.GetMarketSummaryResponse;
import nl.tudelft.ewi.st.atlantis.tudelft.v1.services.GetOrdersRequest;
import nl.tudelft.ewi.st.atlantis.tudelft.v1.services.GetOrdersResponse;
import nl.tudelft.ewi.st.atlantis.tudelft.v1.services.GetQuoteRequest;
import nl.tudelft.ewi.st.atlantis.tudelft.v1.services.GetQuoteResponse;
import nl.tudelft.ewi.st.atlantis.tudelft.v1.services.GetTopOrdersRequest;
import nl.tudelft.ewi.st.atlantis.tudelft.v1.services.GetTopOrdersResponse;
import nl.tudelft.ewi.st.atlantis.tudelft.v1.services.GetWalletDataRequest;
import nl.tudelft.ewi.st.atlantis.tudelft.v1.services.GetWalletDataResponse;
import nl.tudelft.ewi.st.atlantis.tudelft.v1.services.LoginRequest;
import nl.tudelft.ewi.st.atlantis.tudelft.v1.services.LoginResponse;
import nl.tudelft.ewi.st.atlantis.tudelft.v1.services.LogoutRequest;
import nl.tudelft.ewi.st.atlantis.tudelft.v1.services.LogoutResponse;
import nl.tudelft.ewi.st.atlantis.tudelft.v1.services.RegisterRequest;
import nl.tudelft.ewi.st.atlantis.tudelft.v1.services.RegisterResponse;
import nl.tudelft.ewi.st.atlantis.tudelft.v1.services.SellEnhancedRequest;
import nl.tudelft.ewi.st.atlantis.tudelft.v1.services.SellEnhancedResponse;
import nl.tudelft.ewi.st.atlantis.tudelft.v1.services.SellRequest;
import nl.tudelft.ewi.st.atlantis.tudelft.v1.services.SellResponse;
import nl.tudelft.ewi.st.atlantis.tudelft.v1.services.UpdateAccountProfileRequest;
import nl.tudelft.ewi.st.atlantis.tudelft.v1.services.UpdateAccountProfileResponse;
import nl.tudelft.ewi.st.atlantis.tudelft.v1.services.UpdateWalletDataRequest;
import nl.tudelft.ewi.st.atlantis.tudelft.v1.services.UpdateWalletDataResponse;
import nl.tudelft.ewi.st.atlantis.tudelft.v1.services.businessservice.AsyncBusinessServiceV1;
import org.ebayopensource.turmeric.runtime.common.exceptions.ServiceInvocationException;
import org.ebayopensource.turmeric.runtime.sif.impl.internal.service.BaseServiceProxy;
import org.ebayopensource.turmeric.runtime.sif.service.Service;


/**
 * Note : Generated file, any changes will be lost upon regeneration.
 * 
 */
public class BusinessServiceV1Proxy
    extends BaseServiceProxy<AsyncBusinessServiceV1>
    implements AsyncBusinessServiceV1
{


    public BusinessServiceV1Proxy(Service service) {
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

    public Future<?> registerAsync(RegisterRequest param0, AsyncHandler<RegisterResponse> param1) {
        Dispatch dispatch = m_service.createDispatch("register");
        Future<?> result = dispatch.invokeAsync(param0, param1);
        return result;
    }

    public Response<RegisterResponse> registerAsync(RegisterRequest param0) {
        Dispatch dispatch = m_service.createDispatch("register");
        Response<RegisterResponse> result = dispatch.invokeAsync(param0);
        return result;
    }

    public Response<LoginResponse> loginAsync(LoginRequest param0) {
        Dispatch dispatch = m_service.createDispatch("login");
        Response<LoginResponse> result = dispatch.invokeAsync(param0);
        return result;
    }

    public Future<?> loginAsync(LoginRequest param0, AsyncHandler<LoginResponse> param1) {
        Dispatch dispatch = m_service.createDispatch("login");
        Future<?> result = dispatch.invokeAsync(param0, param1);
        return result;
    }

    public Response<LogoutResponse> logoutAsync(LogoutRequest param0) {
        Dispatch dispatch = m_service.createDispatch("logout");
        Response<LogoutResponse> result = dispatch.invokeAsync(param0);
        return result;
    }

    public Future<?> logoutAsync(LogoutRequest param0, AsyncHandler<LogoutResponse> param1) {
        Dispatch dispatch = m_service.createDispatch("logout");
        Future<?> result = dispatch.invokeAsync(param0, param1);
        return result;
    }

    public Response<GetWalletDataResponse> getWalletDataAsync(GetWalletDataRequest param0) {
        Dispatch dispatch = m_service.createDispatch("getWalletData");
        Response<GetWalletDataResponse> result = dispatch.invokeAsync(param0);
        return result;
    }

    public Future<?> getWalletDataAsync(GetWalletDataRequest param0, AsyncHandler<GetWalletDataResponse> param1) {
        Dispatch dispatch = m_service.createDispatch("getWalletData");
        Future<?> result = dispatch.invokeAsync(param0, param1);
        return result;
    }

    public Response<GetQuoteResponse> getQuoteAsync(GetQuoteRequest param0) {
        Dispatch dispatch = m_service.createDispatch("getQuote");
        Response<GetQuoteResponse> result = dispatch.invokeAsync(param0);
        return result;
    }

    public Future<?> getQuoteAsync(GetQuoteRequest param0, AsyncHandler<GetQuoteResponse> param1) {
        Dispatch dispatch = m_service.createDispatch("getQuote");
        Future<?> result = dispatch.invokeAsync(param0, param1);
        return result;
    }

    public Response<GetMarketSummaryResponse> getMarketSummaryAsync(GetMarketSummaryRequest param0) {
        Dispatch dispatch = m_service.createDispatch("getMarketSummary");
        Response<GetMarketSummaryResponse> result = dispatch.invokeAsync(param0);
        return result;
    }

    public Future<?> getMarketSummaryAsync(GetMarketSummaryRequest param0, AsyncHandler<GetMarketSummaryResponse> param1) {
        Dispatch dispatch = m_service.createDispatch("getMarketSummary");
        Future<?> result = dispatch.invokeAsync(param0, param1);
        return result;
    }

    public Response<BuyResponse> buyAsync(BuyRequest param0) {
        Dispatch dispatch = m_service.createDispatch("buy");
        Response<BuyResponse> result = dispatch.invokeAsync(param0);
        return result;
    }

    public Future<?> buyAsync(BuyRequest param0, AsyncHandler<BuyResponse> param1) {
        Dispatch dispatch = m_service.createDispatch("buy");
        Future<?> result = dispatch.invokeAsync(param0, param1);
        return result;
    }

    public Response<GetAccountDataResponse> getAccountDataAsync(GetAccountDataRequest param0) {
        Dispatch dispatch = m_service.createDispatch("getAccountData");
        Response<GetAccountDataResponse> result = dispatch.invokeAsync(param0);
        return result;
    }

    public Future<?> getAccountDataAsync(GetAccountDataRequest param0, AsyncHandler<GetAccountDataResponse> param1) {
        Dispatch dispatch = m_service.createDispatch("getAccountData");
        Future<?> result = dispatch.invokeAsync(param0, param1);
        return result;
    }

    public Response<GetHoldingResponse> getHoldingAsync(GetHoldingRequest param0) {
        Dispatch dispatch = m_service.createDispatch("getHolding");
        Response<GetHoldingResponse> result = dispatch.invokeAsync(param0);
        return result;
    }

    public Future<?> getHoldingAsync(GetHoldingRequest param0, AsyncHandler<GetHoldingResponse> param1) {
        Dispatch dispatch = m_service.createDispatch("getHolding");
        Future<?> result = dispatch.invokeAsync(param0, param1);
        return result;
    }

    public Response<SellEnhancedResponse> sellEnhancedAsync(SellEnhancedRequest param0) {
        Dispatch dispatch = m_service.createDispatch("sellEnhanced");
        Response<SellEnhancedResponse> result = dispatch.invokeAsync(param0);
        return result;
    }

    public Future<?> sellEnhancedAsync(SellEnhancedRequest param0, AsyncHandler<SellEnhancedResponse> param1) {
        Dispatch dispatch = m_service.createDispatch("sellEnhanced");
        Future<?> result = dispatch.invokeAsync(param0, param1);
        return result;
    }

    public Response<UpdateAccountProfileResponse> updateAccountProfileAsync(UpdateAccountProfileRequest param0) {
        Dispatch dispatch = m_service.createDispatch("updateAccountProfile");
        Response<UpdateAccountProfileResponse> result = dispatch.invokeAsync(param0);
        return result;
    }

    public Future<?> updateAccountProfileAsync(UpdateAccountProfileRequest param0, AsyncHandler<UpdateAccountProfileResponse> param1) {
        Dispatch dispatch = m_service.createDispatch("updateAccountProfile");
        Future<?> result = dispatch.invokeAsync(param0, param1);
        return result;
    }

    public Response<GetTopOrdersResponse> getTopOrdersAsync(GetTopOrdersRequest param0) {
        Dispatch dispatch = m_service.createDispatch("getTopOrders");
        Response<GetTopOrdersResponse> result = dispatch.invokeAsync(param0);
        return result;
    }

    public Future<?> getTopOrdersAsync(GetTopOrdersRequest param0, AsyncHandler<GetTopOrdersResponse> param1) {
        Dispatch dispatch = m_service.createDispatch("getTopOrders");
        Future<?> result = dispatch.invokeAsync(param0, param1);
        return result;
    }

    public Response<GetAccountProfileDataResponse> getAccountProfileDataAsync(GetAccountProfileDataRequest param0) {
        Dispatch dispatch = m_service.createDispatch("getAccountProfileData");
        Response<GetAccountProfileDataResponse> result = dispatch.invokeAsync(param0);
        return result;
    }

    public Future<?> getAccountProfileDataAsync(GetAccountProfileDataRequest param0, AsyncHandler<GetAccountProfileDataResponse> param1) {
        Dispatch dispatch = m_service.createDispatch("getAccountProfileData");
        Future<?> result = dispatch.invokeAsync(param0, param1);
        return result;
    }

    public Response<GetAllQuotesResponse> getAllQuotesAsync(GetAllQuotesRequest param0) {
        Dispatch dispatch = m_service.createDispatch("getAllQuotes");
        Response<GetAllQuotesResponse> result = dispatch.invokeAsync(param0);
        return result;
    }

    public Future<?> getAllQuotesAsync(GetAllQuotesRequest param0, AsyncHandler<GetAllQuotesResponse> param1) {
        Dispatch dispatch = m_service.createDispatch("getAllQuotes");
        Future<?> result = dispatch.invokeAsync(param0, param1);
        return result;
    }

    public Response<SellResponse> sellAsync(SellRequest param0) {
        Dispatch dispatch = m_service.createDispatch("sell");
        Response<SellResponse> result = dispatch.invokeAsync(param0);
        return result;
    }

    public Future<?> sellAsync(SellRequest param0, AsyncHandler<SellResponse> param1) {
        Dispatch dispatch = m_service.createDispatch("sell");
        Future<?> result = dispatch.invokeAsync(param0, param1);
        return result;
    }

    public Response<GetOrdersResponse> getOrdersAsync(GetOrdersRequest param0) {
        Dispatch dispatch = m_service.createDispatch("getOrders");
        Response<GetOrdersResponse> result = dispatch.invokeAsync(param0);
        return result;
    }

    public Future<?> getOrdersAsync(GetOrdersRequest param0, AsyncHandler<GetOrdersResponse> param1) {
        Dispatch dispatch = m_service.createDispatch("getOrders");
        Future<?> result = dispatch.invokeAsync(param0, param1);
        return result;
    }

    public Response<GetHoldingsResponse> getHoldingsAsync(GetHoldingsRequest param0) {
        Dispatch dispatch = m_service.createDispatch("getHoldings");
        Response<GetHoldingsResponse> result = dispatch.invokeAsync(param0);
        return result;
    }

    public Future<?> getHoldingsAsync(GetHoldingsRequest param0, AsyncHandler<GetHoldingsResponse> param1) {
        Dispatch dispatch = m_service.createDispatch("getHoldings");
        Future<?> result = dispatch.invokeAsync(param0, param1);
        return result;
    }

    public Response<GetClosedOrdersResponse> getClosedOrdersAsync(GetClosedOrdersRequest param0) {
        Dispatch dispatch = m_service.createDispatch("getClosedOrders");
        Response<GetClosedOrdersResponse> result = dispatch.invokeAsync(param0);
        return result;
    }

    public Future<?> getClosedOrdersAsync(GetClosedOrdersRequest param0, AsyncHandler<GetClosedOrdersResponse> param1) {
        Dispatch dispatch = m_service.createDispatch("getClosedOrders");
        Future<?> result = dispatch.invokeAsync(param0, param1);
        return result;
    }

    public RegisterResponse register(RegisterRequest param0) {
        Object[] params = new Object[ 1 ] ;
        params[ 0 ] = param0;
        List<Object> returnParamList = new ArrayList<Object>();
        try {
            m_service.invoke("register", params, returnParamList);
        } catch (ServiceInvocationException svcInvocationEx) {
            throw wrapInvocationException(svcInvocationEx);
        }
        RegisterResponse result = ((RegisterResponse) returnParamList.get(0));
        return result;
    }

    public LoginResponse login(LoginRequest param0) {
        Object[] params = new Object[ 1 ] ;
        params[ 0 ] = param0;
        List<Object> returnParamList = new ArrayList<Object>();
        try {
            m_service.invoke("login", params, returnParamList);
        } catch (ServiceInvocationException svcInvocationEx) {
            throw wrapInvocationException(svcInvocationEx);
        }
        LoginResponse result = ((LoginResponse) returnParamList.get(0));
        return result;
    }

    public LogoutResponse logout(LogoutRequest param0) {
        Object[] params = new Object[ 1 ] ;
        params[ 0 ] = param0;
        List<Object> returnParamList = new ArrayList<Object>();
        try {
            m_service.invoke("logout", params, returnParamList);
        } catch (ServiceInvocationException svcInvocationEx) {
            throw wrapInvocationException(svcInvocationEx);
        }
        LogoutResponse result = ((LogoutResponse) returnParamList.get(0));
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

    public GetWalletDataResponse getWalletData(GetWalletDataRequest param0) {
        Object[] params = new Object[ 1 ] ;
        params[ 0 ] = param0;
        List<Object> returnParamList = new ArrayList<Object>();
        try {
            m_service.invoke("getWalletData", params, returnParamList);
        } catch (ServiceInvocationException svcInvocationEx) {
            throw wrapInvocationException(svcInvocationEx);
        }
        GetWalletDataResponse result = ((GetWalletDataResponse) returnParamList.get(0));
        return result;
    }

    public GetQuoteResponse getQuote(GetQuoteRequest param0) {
        Object[] params = new Object[ 1 ] ;
        params[ 0 ] = param0;
        List<Object> returnParamList = new ArrayList<Object>();
        try {
            m_service.invoke("getQuote", params, returnParamList);
        } catch (ServiceInvocationException svcInvocationEx) {
            throw wrapInvocationException(svcInvocationEx);
        }
        GetQuoteResponse result = ((GetQuoteResponse) returnParamList.get(0));
        return result;
    }

    public GetMarketSummaryResponse getMarketSummary(GetMarketSummaryRequest param0) {
        Object[] params = new Object[ 1 ] ;
        params[ 0 ] = param0;
        List<Object> returnParamList = new ArrayList<Object>();
        try {
            m_service.invoke("getMarketSummary", params, returnParamList);
        } catch (ServiceInvocationException svcInvocationEx) {
            throw wrapInvocationException(svcInvocationEx);
        }
        GetMarketSummaryResponse result = ((GetMarketSummaryResponse) returnParamList.get(0));
        return result;
    }

    public BuyResponse buy(BuyRequest param0) {
        Object[] params = new Object[ 1 ] ;
        params[ 0 ] = param0;
        List<Object> returnParamList = new ArrayList<Object>();
        try {
            m_service.invoke("buy", params, returnParamList);
        } catch (ServiceInvocationException svcInvocationEx) {
            throw wrapInvocationException(svcInvocationEx);
        }
        BuyResponse result = ((BuyResponse) returnParamList.get(0));
        return result;
    }

    public GetAccountDataResponse getAccountData(GetAccountDataRequest param0) {
        Object[] params = new Object[ 1 ] ;
        params[ 0 ] = param0;
        List<Object> returnParamList = new ArrayList<Object>();
        try {
            m_service.invoke("getAccountData", params, returnParamList);
        } catch (ServiceInvocationException svcInvocationEx) {
            throw wrapInvocationException(svcInvocationEx);
        }
        GetAccountDataResponse result = ((GetAccountDataResponse) returnParamList.get(0));
        return result;
    }

    public GetHoldingResponse getHolding(GetHoldingRequest param0) {
        Object[] params = new Object[ 1 ] ;
        params[ 0 ] = param0;
        List<Object> returnParamList = new ArrayList<Object>();
        try {
            m_service.invoke("getHolding", params, returnParamList);
        } catch (ServiceInvocationException svcInvocationEx) {
            throw wrapInvocationException(svcInvocationEx);
        }
        GetHoldingResponse result = ((GetHoldingResponse) returnParamList.get(0));
        return result;
    }

    public SellEnhancedResponse sellEnhanced(SellEnhancedRequest param0) {
        Object[] params = new Object[ 1 ] ;
        params[ 0 ] = param0;
        List<Object> returnParamList = new ArrayList<Object>();
        try {
            m_service.invoke("sellEnhanced", params, returnParamList);
        } catch (ServiceInvocationException svcInvocationEx) {
            throw wrapInvocationException(svcInvocationEx);
        }
        SellEnhancedResponse result = ((SellEnhancedResponse) returnParamList.get(0));
        return result;
    }

    public UpdateAccountProfileResponse updateAccountProfile(UpdateAccountProfileRequest param0) {
        Object[] params = new Object[ 1 ] ;
        params[ 0 ] = param0;
        List<Object> returnParamList = new ArrayList<Object>();
        try {
            m_service.invoke("updateAccountProfile", params, returnParamList);
        } catch (ServiceInvocationException svcInvocationEx) {
            throw wrapInvocationException(svcInvocationEx);
        }
        UpdateAccountProfileResponse result = ((UpdateAccountProfileResponse) returnParamList.get(0));
        return result;
    }

    public GetTopOrdersResponse getTopOrders(GetTopOrdersRequest param0) {
        Object[] params = new Object[ 1 ] ;
        params[ 0 ] = param0;
        List<Object> returnParamList = new ArrayList<Object>();
        try {
            m_service.invoke("getTopOrders", params, returnParamList);
        } catch (ServiceInvocationException svcInvocationEx) {
            throw wrapInvocationException(svcInvocationEx);
        }
        GetTopOrdersResponse result = ((GetTopOrdersResponse) returnParamList.get(0));
        return result;
    }

    public GetAccountProfileDataResponse getAccountProfileData(GetAccountProfileDataRequest param0) {
        Object[] params = new Object[ 1 ] ;
        params[ 0 ] = param0;
        List<Object> returnParamList = new ArrayList<Object>();
        try {
            m_service.invoke("getAccountProfileData", params, returnParamList);
        } catch (ServiceInvocationException svcInvocationEx) {
            throw wrapInvocationException(svcInvocationEx);
        }
        GetAccountProfileDataResponse result = ((GetAccountProfileDataResponse) returnParamList.get(0));
        return result;
    }

    public GetAllQuotesResponse getAllQuotes(GetAllQuotesRequest param0) {
        Object[] params = new Object[ 1 ] ;
        params[ 0 ] = param0;
        List<Object> returnParamList = new ArrayList<Object>();
        try {
            m_service.invoke("getAllQuotes", params, returnParamList);
        } catch (ServiceInvocationException svcInvocationEx) {
            throw wrapInvocationException(svcInvocationEx);
        }
        GetAllQuotesResponse result = ((GetAllQuotesResponse) returnParamList.get(0));
        return result;
    }

    public SellResponse sell(SellRequest param0) {
        Object[] params = new Object[ 1 ] ;
        params[ 0 ] = param0;
        List<Object> returnParamList = new ArrayList<Object>();
        try {
            m_service.invoke("sell", params, returnParamList);
        } catch (ServiceInvocationException svcInvocationEx) {
            throw wrapInvocationException(svcInvocationEx);
        }
        SellResponse result = ((SellResponse) returnParamList.get(0));
        return result;
    }

    public GetOrdersResponse getOrders(GetOrdersRequest param0) {
        Object[] params = new Object[ 1 ] ;
        params[ 0 ] = param0;
        List<Object> returnParamList = new ArrayList<Object>();
        try {
            m_service.invoke("getOrders", params, returnParamList);
        } catch (ServiceInvocationException svcInvocationEx) {
            throw wrapInvocationException(svcInvocationEx);
        }
        GetOrdersResponse result = ((GetOrdersResponse) returnParamList.get(0));
        return result;
    }

    public GetHoldingsResponse getHoldings(GetHoldingsRequest param0) {
        Object[] params = new Object[ 1 ] ;
        params[ 0 ] = param0;
        List<Object> returnParamList = new ArrayList<Object>();
        try {
            m_service.invoke("getHoldings", params, returnParamList);
        } catch (ServiceInvocationException svcInvocationEx) {
            throw wrapInvocationException(svcInvocationEx);
        }
        GetHoldingsResponse result = ((GetHoldingsResponse) returnParamList.get(0));
        return result;
    }

    public GetClosedOrdersResponse getClosedOrders(GetClosedOrdersRequest param0) {
        Object[] params = new Object[ 1 ] ;
        params[ 0 ] = param0;
        List<Object> returnParamList = new ArrayList<Object>();
        try {
            m_service.invoke("getClosedOrders", params, returnParamList);
        } catch (ServiceInvocationException svcInvocationEx) {
            throw wrapInvocationException(svcInvocationEx);
        }
        GetClosedOrdersResponse result = ((GetClosedOrdersResponse) returnParamList.get(0));
        return result;
    }

}
