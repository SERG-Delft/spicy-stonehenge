
package nl.tudelft.ewi.st.atlantis.tudelft.v1.services.businessservice.gen;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.concurrent.Future;
import javax.xml.ws.AsyncHandler;
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
import org.ebayopensource.turmeric.runtime.common.exceptions.ServiceException;
import org.ebayopensource.turmeric.runtime.common.exceptions.ServiceRuntimeException;
import org.ebayopensource.turmeric.runtime.common.types.Cookie;
import org.ebayopensource.turmeric.runtime.common.types.SOAHeaders;
import org.ebayopensource.turmeric.runtime.sif.service.Service;
import org.ebayopensource.turmeric.runtime.sif.service.ServiceFactory;
import org.ebayopensource.turmeric.runtime.sif.service.ServiceInvokerOptions;


/**
 * Note : Generated file, any changes will be lost upon regeneration.
 * This class is not thread safe
 * 
 */
public class SharedBusinessServiceV1Consumer
    implements AsyncBusinessServiceV1
{

    private URL m_serviceLocation = null;
    private final static String SVC_ADMIN_NAME = "BusinessServiceV1";
    private String m_clientName;
    private String m_environment = "production";
    private AsyncBusinessServiceV1 m_proxy = null;
    private String m_authToken = null;
    private Cookie[] m_cookies;
    private Service m_service = null;

    public SharedBusinessServiceV1Consumer(String clientName)
        throws ServiceException
    {
        if (clientName == null) {
            throw new ServiceException("clientName can not be null");
        }
        m_clientName = clientName;
    }

    public SharedBusinessServiceV1Consumer(String clientName, String environment)
        throws ServiceException
    {
        if (environment == null) {
            throw new ServiceException("environment can not be null");
        }
        if (clientName == null) {
            throw new ServiceException("clientName can not be null");
        }
        m_clientName = clientName;
        m_environment = environment;
    }

    /**
     * Use this method to initialize ConsumerApp after creating a Consumer instance
     * 
     */
    public void init()
        throws ServiceException
    {
        getService();
    }

    protected void setServiceLocation(String serviceLocation)
        throws MalformedURLException
    {
        m_serviceLocation = new URL(serviceLocation);
        if (m_service!= null) {
            m_service.setServiceLocation(m_serviceLocation);
        }
    }

    private void setUserProvidedSecurityCredentials(Service service) {
        if (m_authToken!= null) {
            service.setSessionTransportHeader(SOAHeaders.AUTH_TOKEN, m_authToken);
        }
        if (m_cookies!= null) {
            for (int i = 0; (i<m_cookies.length); i ++) {
                service.setCookie(m_cookies[i]);
            }
        }
    }

    /**
     * Use this method to set User Credentials (Token) 
     * 
     */
    protected void setAuthToken(String authToken) {
        m_authToken = authToken;
    }

    /**
     * Use this method to set User Credentials (Cookie)
     * 
     */
    protected void setCookies(Cookie[] cookies) {
        m_cookies = cookies;
    }

    /**
     * Use this method to get the Invoker Options on the Service and set them to user-preferences
     * 
     */
    public ServiceInvokerOptions getServiceInvokerOptions()
        throws ServiceException
    {
        m_service = getService();
        return m_service.getInvokerOptions();
    }

    protected AsyncBusinessServiceV1 getProxy()
        throws ServiceException
    {
        m_service = getService();
        m_proxy = m_service.getProxy();
        return m_proxy;
    }

    /**
     * Method returns an instance of Service which has been initilized for this Consumer
     * 
     */
    public Service getService()
        throws ServiceException
    {
        if (m_service == null) {
            m_service = ServiceFactory.create(SVC_ADMIN_NAME, m_environment, m_clientName, m_serviceLocation);
        }
        setUserProvidedSecurityCredentials(m_service);
        return m_service;
    }

    public List<Response<?>> poll(boolean param0, boolean param1)
        throws InterruptedException
    {
        List<Response<?>> result = null;
        try {
            m_proxy = getProxy();
        } catch (ServiceException serviceException) {
            throw ServiceRuntimeException.wrap(serviceException);
        }
        result = m_proxy.poll(param0, param1);
        return result;
    }

    public Response<RegisterResponse> registerAsync(RegisterRequest param0) {
        Response<RegisterResponse> result = null;
        try {
            m_proxy = getProxy();
        } catch (ServiceException serviceException) {
            throw ServiceRuntimeException.wrap(serviceException);
        }
        result = m_proxy.registerAsync(param0);
        return result;
    }

    public Future<?> registerAsync(RegisterRequest param0, AsyncHandler<RegisterResponse> param1) {
        Future<?> result = null;
        try {
            m_proxy = getProxy();
        } catch (ServiceException serviceException) {
            throw ServiceRuntimeException.wrap(serviceException);
        }
        result = m_proxy.registerAsync(param0, param1);
        return result;
    }

    public Response<LoginResponse> loginAsync(LoginRequest param0) {
        Response<LoginResponse> result = null;
        try {
            m_proxy = getProxy();
        } catch (ServiceException serviceException) {
            throw ServiceRuntimeException.wrap(serviceException);
        }
        result = m_proxy.loginAsync(param0);
        return result;
    }

    public Future<?> loginAsync(LoginRequest param0, AsyncHandler<LoginResponse> param1) {
        Future<?> result = null;
        try {
            m_proxy = getProxy();
        } catch (ServiceException serviceException) {
            throw ServiceRuntimeException.wrap(serviceException);
        }
        result = m_proxy.loginAsync(param0, param1);
        return result;
    }

    public Future<?> logoutAsync(LogoutRequest param0, AsyncHandler<LogoutResponse> param1) {
        Future<?> result = null;
        try {
            m_proxy = getProxy();
        } catch (ServiceException serviceException) {
            throw ServiceRuntimeException.wrap(serviceException);
        }
        result = m_proxy.logoutAsync(param0, param1);
        return result;
    }

    public Response<LogoutResponse> logoutAsync(LogoutRequest param0) {
        Response<LogoutResponse> result = null;
        try {
            m_proxy = getProxy();
        } catch (ServiceException serviceException) {
            throw ServiceRuntimeException.wrap(serviceException);
        }
        result = m_proxy.logoutAsync(param0);
        return result;
    }

    public Response<GetQuoteResponse> getQuoteAsync(GetQuoteRequest param0) {
        Response<GetQuoteResponse> result = null;
        try {
            m_proxy = getProxy();
        } catch (ServiceException serviceException) {
            throw ServiceRuntimeException.wrap(serviceException);
        }
        result = m_proxy.getQuoteAsync(param0);
        return result;
    }

    public Future<?> getQuoteAsync(GetQuoteRequest param0, AsyncHandler<GetQuoteResponse> param1) {
        Future<?> result = null;
        try {
            m_proxy = getProxy();
        } catch (ServiceException serviceException) {
            throw ServiceRuntimeException.wrap(serviceException);
        }
        result = m_proxy.getQuoteAsync(param0, param1);
        return result;
    }

    public Response<GetMarketSummaryResponse> getMarketSummaryAsync(GetMarketSummaryRequest param0) {
        Response<GetMarketSummaryResponse> result = null;
        try {
            m_proxy = getProxy();
        } catch (ServiceException serviceException) {
            throw ServiceRuntimeException.wrap(serviceException);
        }
        result = m_proxy.getMarketSummaryAsync(param0);
        return result;
    }

    public Future<?> getMarketSummaryAsync(GetMarketSummaryRequest param0, AsyncHandler<GetMarketSummaryResponse> param1) {
        Future<?> result = null;
        try {
            m_proxy = getProxy();
        } catch (ServiceException serviceException) {
            throw ServiceRuntimeException.wrap(serviceException);
        }
        result = m_proxy.getMarketSummaryAsync(param0, param1);
        return result;
    }

    public Future<?> buyAsync(BuyRequest param0, AsyncHandler<BuyResponse> param1) {
        Future<?> result = null;
        try {
            m_proxy = getProxy();
        } catch (ServiceException serviceException) {
            throw ServiceRuntimeException.wrap(serviceException);
        }
        result = m_proxy.buyAsync(param0, param1);
        return result;
    }

    public Response<BuyResponse> buyAsync(BuyRequest param0) {
        Response<BuyResponse> result = null;
        try {
            m_proxy = getProxy();
        } catch (ServiceException serviceException) {
            throw ServiceRuntimeException.wrap(serviceException);
        }
        result = m_proxy.buyAsync(param0);
        return result;
    }

    public Future<?> getAccountDataAsync(GetAccountDataRequest param0, AsyncHandler<GetAccountDataResponse> param1) {
        Future<?> result = null;
        try {
            m_proxy = getProxy();
        } catch (ServiceException serviceException) {
            throw ServiceRuntimeException.wrap(serviceException);
        }
        result = m_proxy.getAccountDataAsync(param0, param1);
        return result;
    }

    public Response<GetAccountDataResponse> getAccountDataAsync(GetAccountDataRequest param0) {
        Response<GetAccountDataResponse> result = null;
        try {
            m_proxy = getProxy();
        } catch (ServiceException serviceException) {
            throw ServiceRuntimeException.wrap(serviceException);
        }
        result = m_proxy.getAccountDataAsync(param0);
        return result;
    }

    public Response<GetHoldingResponse> getHoldingAsync(GetHoldingRequest param0) {
        Response<GetHoldingResponse> result = null;
        try {
            m_proxy = getProxy();
        } catch (ServiceException serviceException) {
            throw ServiceRuntimeException.wrap(serviceException);
        }
        result = m_proxy.getHoldingAsync(param0);
        return result;
    }

    public Future<?> getHoldingAsync(GetHoldingRequest param0, AsyncHandler<GetHoldingResponse> param1) {
        Future<?> result = null;
        try {
            m_proxy = getProxy();
        } catch (ServiceException serviceException) {
            throw ServiceRuntimeException.wrap(serviceException);
        }
        result = m_proxy.getHoldingAsync(param0, param1);
        return result;
    }

    public Response<UpdateWalletDataResponse> updateWalletDataAsync(UpdateWalletDataRequest param0) {
        Response<UpdateWalletDataResponse> result = null;
        try {
            m_proxy = getProxy();
        } catch (ServiceException serviceException) {
            throw ServiceRuntimeException.wrap(serviceException);
        }
        result = m_proxy.updateWalletDataAsync(param0);
        return result;
    }

    public Future<?> updateWalletDataAsync(UpdateWalletDataRequest param0, AsyncHandler<UpdateWalletDataResponse> param1) {
        Future<?> result = null;
        try {
            m_proxy = getProxy();
        } catch (ServiceException serviceException) {
            throw ServiceRuntimeException.wrap(serviceException);
        }
        result = m_proxy.updateWalletDataAsync(param0, param1);
        return result;
    }

    public Future<?> sellEnhancedAsync(SellEnhancedRequest param0, AsyncHandler<SellEnhancedResponse> param1) {
        Future<?> result = null;
        try {
            m_proxy = getProxy();
        } catch (ServiceException serviceException) {
            throw ServiceRuntimeException.wrap(serviceException);
        }
        result = m_proxy.sellEnhancedAsync(param0, param1);
        return result;
    }

    public Response<SellEnhancedResponse> sellEnhancedAsync(SellEnhancedRequest param0) {
        Response<SellEnhancedResponse> result = null;
        try {
            m_proxy = getProxy();
        } catch (ServiceException serviceException) {
            throw ServiceRuntimeException.wrap(serviceException);
        }
        result = m_proxy.sellEnhancedAsync(param0);
        return result;
    }

    public Future<?> updateAccountProfileAsync(UpdateAccountProfileRequest param0, AsyncHandler<UpdateAccountProfileResponse> param1) {
        Future<?> result = null;
        try {
            m_proxy = getProxy();
        } catch (ServiceException serviceException) {
            throw ServiceRuntimeException.wrap(serviceException);
        }
        result = m_proxy.updateAccountProfileAsync(param0, param1);
        return result;
    }

    public Response<UpdateAccountProfileResponse> updateAccountProfileAsync(UpdateAccountProfileRequest param0) {
        Response<UpdateAccountProfileResponse> result = null;
        try {
            m_proxy = getProxy();
        } catch (ServiceException serviceException) {
            throw ServiceRuntimeException.wrap(serviceException);
        }
        result = m_proxy.updateAccountProfileAsync(param0);
        return result;
    }

    public Future<?> getTopOrdersAsync(GetTopOrdersRequest param0, AsyncHandler<GetTopOrdersResponse> param1) {
        Future<?> result = null;
        try {
            m_proxy = getProxy();
        } catch (ServiceException serviceException) {
            throw ServiceRuntimeException.wrap(serviceException);
        }
        result = m_proxy.getTopOrdersAsync(param0, param1);
        return result;
    }

    public Response<GetTopOrdersResponse> getTopOrdersAsync(GetTopOrdersRequest param0) {
        Response<GetTopOrdersResponse> result = null;
        try {
            m_proxy = getProxy();
        } catch (ServiceException serviceException) {
            throw ServiceRuntimeException.wrap(serviceException);
        }
        result = m_proxy.getTopOrdersAsync(param0);
        return result;
    }

    public Response<GetAccountProfileDataResponse> getAccountProfileDataAsync(GetAccountProfileDataRequest param0) {
        Response<GetAccountProfileDataResponse> result = null;
        try {
            m_proxy = getProxy();
        } catch (ServiceException serviceException) {
            throw ServiceRuntimeException.wrap(serviceException);
        }
        result = m_proxy.getAccountProfileDataAsync(param0);
        return result;
    }

    public Future<?> getAccountProfileDataAsync(GetAccountProfileDataRequest param0, AsyncHandler<GetAccountProfileDataResponse> param1) {
        Future<?> result = null;
        try {
            m_proxy = getProxy();
        } catch (ServiceException serviceException) {
            throw ServiceRuntimeException.wrap(serviceException);
        }
        result = m_proxy.getAccountProfileDataAsync(param0, param1);
        return result;
    }

    public Response<GetAllQuotesResponse> getAllQuotesAsync(GetAllQuotesRequest param0) {
        Response<GetAllQuotesResponse> result = null;
        try {
            m_proxy = getProxy();
        } catch (ServiceException serviceException) {
            throw ServiceRuntimeException.wrap(serviceException);
        }
        result = m_proxy.getAllQuotesAsync(param0);
        return result;
    }

    public Future<?> getAllQuotesAsync(GetAllQuotesRequest param0, AsyncHandler<GetAllQuotesResponse> param1) {
        Future<?> result = null;
        try {
            m_proxy = getProxy();
        } catch (ServiceException serviceException) {
            throw ServiceRuntimeException.wrap(serviceException);
        }
        result = m_proxy.getAllQuotesAsync(param0, param1);
        return result;
    }

    public Response<SellResponse> sellAsync(SellRequest param0) {
        Response<SellResponse> result = null;
        try {
            m_proxy = getProxy();
        } catch (ServiceException serviceException) {
            throw ServiceRuntimeException.wrap(serviceException);
        }
        result = m_proxy.sellAsync(param0);
        return result;
    }

    public Future<?> sellAsync(SellRequest param0, AsyncHandler<SellResponse> param1) {
        Future<?> result = null;
        try {
            m_proxy = getProxy();
        } catch (ServiceException serviceException) {
            throw ServiceRuntimeException.wrap(serviceException);
        }
        result = m_proxy.sellAsync(param0, param1);
        return result;
    }

    public Response<GetOrdersResponse> getOrdersAsync(GetOrdersRequest param0) {
        Response<GetOrdersResponse> result = null;
        try {
            m_proxy = getProxy();
        } catch (ServiceException serviceException) {
            throw ServiceRuntimeException.wrap(serviceException);
        }
        result = m_proxy.getOrdersAsync(param0);
        return result;
    }

    public Future<?> getOrdersAsync(GetOrdersRequest param0, AsyncHandler<GetOrdersResponse> param1) {
        Future<?> result = null;
        try {
            m_proxy = getProxy();
        } catch (ServiceException serviceException) {
            throw ServiceRuntimeException.wrap(serviceException);
        }
        result = m_proxy.getOrdersAsync(param0, param1);
        return result;
    }

    public Response<GetHoldingsResponse> getHoldingsAsync(GetHoldingsRequest param0) {
        Response<GetHoldingsResponse> result = null;
        try {
            m_proxy = getProxy();
        } catch (ServiceException serviceException) {
            throw ServiceRuntimeException.wrap(serviceException);
        }
        result = m_proxy.getHoldingsAsync(param0);
        return result;
    }

    public Future<?> getHoldingsAsync(GetHoldingsRequest param0, AsyncHandler<GetHoldingsResponse> param1) {
        Future<?> result = null;
        try {
            m_proxy = getProxy();
        } catch (ServiceException serviceException) {
            throw ServiceRuntimeException.wrap(serviceException);
        }
        result = m_proxy.getHoldingsAsync(param0, param1);
        return result;
    }

    public Response<GetWalletDataResponse> getWalletDataAsync(GetWalletDataRequest param0) {
        Response<GetWalletDataResponse> result = null;
        try {
            m_proxy = getProxy();
        } catch (ServiceException serviceException) {
            throw ServiceRuntimeException.wrap(serviceException);
        }
        result = m_proxy.getWalletDataAsync(param0);
        return result;
    }

    public Future<?> getWalletDataAsync(GetWalletDataRequest param0, AsyncHandler<GetWalletDataResponse> param1) {
        Future<?> result = null;
        try {
            m_proxy = getProxy();
        } catch (ServiceException serviceException) {
            throw ServiceRuntimeException.wrap(serviceException);
        }
        result = m_proxy.getWalletDataAsync(param0, param1);
        return result;
    }

    public Response<GetClosedOrdersResponse> getClosedOrdersAsync(GetClosedOrdersRequest param0) {
        Response<GetClosedOrdersResponse> result = null;
        try {
            m_proxy = getProxy();
        } catch (ServiceException serviceException) {
            throw ServiceRuntimeException.wrap(serviceException);
        }
        result = m_proxy.getClosedOrdersAsync(param0);
        return result;
    }

    public Future<?> getClosedOrdersAsync(GetClosedOrdersRequest param0, AsyncHandler<GetClosedOrdersResponse> param1) {
        Future<?> result = null;
        try {
            m_proxy = getProxy();
        } catch (ServiceException serviceException) {
            throw ServiceRuntimeException.wrap(serviceException);
        }
        result = m_proxy.getClosedOrdersAsync(param0, param1);
        return result;
    }

    public RegisterResponse register(RegisterRequest param0) {
        RegisterResponse result = null;
        try {
            m_proxy = getProxy();
        } catch (ServiceException serviceException) {
            throw ServiceRuntimeException.wrap(serviceException);
        }
        result = m_proxy.register(param0);
        return result;
    }

    public LoginResponse login(LoginRequest param0) {
        LoginResponse result = null;
        try {
            m_proxy = getProxy();
        } catch (ServiceException serviceException) {
            throw ServiceRuntimeException.wrap(serviceException);
        }
        result = m_proxy.login(param0);
        return result;
    }

    public LogoutResponse logout(LogoutRequest param0) {
        LogoutResponse result = null;
        try {
            m_proxy = getProxy();
        } catch (ServiceException serviceException) {
            throw ServiceRuntimeException.wrap(serviceException);
        }
        result = m_proxy.logout(param0);
        return result;
    }

    public GetQuoteResponse getQuote(GetQuoteRequest param0) {
        GetQuoteResponse result = null;
        try {
            m_proxy = getProxy();
        } catch (ServiceException serviceException) {
            throw ServiceRuntimeException.wrap(serviceException);
        }
        result = m_proxy.getQuote(param0);
        return result;
    }

    public GetMarketSummaryResponse getMarketSummary(GetMarketSummaryRequest param0) {
        GetMarketSummaryResponse result = null;
        try {
            m_proxy = getProxy();
        } catch (ServiceException serviceException) {
            throw ServiceRuntimeException.wrap(serviceException);
        }
        result = m_proxy.getMarketSummary(param0);
        return result;
    }

    public BuyResponse buy(BuyRequest param0) {
        BuyResponse result = null;
        try {
            m_proxy = getProxy();
        } catch (ServiceException serviceException) {
            throw ServiceRuntimeException.wrap(serviceException);
        }
        result = m_proxy.buy(param0);
        return result;
    }

    public GetAccountDataResponse getAccountData(GetAccountDataRequest param0) {
        GetAccountDataResponse result = null;
        try {
            m_proxy = getProxy();
        } catch (ServiceException serviceException) {
            throw ServiceRuntimeException.wrap(serviceException);
        }
        result = m_proxy.getAccountData(param0);
        return result;
    }

    public GetHoldingResponse getHolding(GetHoldingRequest param0) {
        GetHoldingResponse result = null;
        try {
            m_proxy = getProxy();
        } catch (ServiceException serviceException) {
            throw ServiceRuntimeException.wrap(serviceException);
        }
        result = m_proxy.getHolding(param0);
        return result;
    }

    public UpdateWalletDataResponse updateWalletData(UpdateWalletDataRequest param0) {
        UpdateWalletDataResponse result = null;
        try {
            m_proxy = getProxy();
        } catch (ServiceException serviceException) {
            throw ServiceRuntimeException.wrap(serviceException);
        }
        result = m_proxy.updateWalletData(param0);
        return result;
    }

    public SellEnhancedResponse sellEnhanced(SellEnhancedRequest param0) {
        SellEnhancedResponse result = null;
        try {
            m_proxy = getProxy();
        } catch (ServiceException serviceException) {
            throw ServiceRuntimeException.wrap(serviceException);
        }
        result = m_proxy.sellEnhanced(param0);
        return result;
    }

    public UpdateAccountProfileResponse updateAccountProfile(UpdateAccountProfileRequest param0) {
        UpdateAccountProfileResponse result = null;
        try {
            m_proxy = getProxy();
        } catch (ServiceException serviceException) {
            throw ServiceRuntimeException.wrap(serviceException);
        }
        result = m_proxy.updateAccountProfile(param0);
        return result;
    }

    public GetTopOrdersResponse getTopOrders(GetTopOrdersRequest param0) {
        GetTopOrdersResponse result = null;
        try {
            m_proxy = getProxy();
        } catch (ServiceException serviceException) {
            throw ServiceRuntimeException.wrap(serviceException);
        }
        result = m_proxy.getTopOrders(param0);
        return result;
    }

    public GetAccountProfileDataResponse getAccountProfileData(GetAccountProfileDataRequest param0) {
        GetAccountProfileDataResponse result = null;
        try {
            m_proxy = getProxy();
        } catch (ServiceException serviceException) {
            throw ServiceRuntimeException.wrap(serviceException);
        }
        result = m_proxy.getAccountProfileData(param0);
        return result;
    }

    public GetAllQuotesResponse getAllQuotes(GetAllQuotesRequest param0) {
        GetAllQuotesResponse result = null;
        try {
            m_proxy = getProxy();
        } catch (ServiceException serviceException) {
            throw ServiceRuntimeException.wrap(serviceException);
        }
        result = m_proxy.getAllQuotes(param0);
        return result;
    }

    public SellResponse sell(SellRequest param0) {
        SellResponse result = null;
        try {
            m_proxy = getProxy();
        } catch (ServiceException serviceException) {
            throw ServiceRuntimeException.wrap(serviceException);
        }
        result = m_proxy.sell(param0);
        return result;
    }

    public GetOrdersResponse getOrders(GetOrdersRequest param0) {
        GetOrdersResponse result = null;
        try {
            m_proxy = getProxy();
        } catch (ServiceException serviceException) {
            throw ServiceRuntimeException.wrap(serviceException);
        }
        result = m_proxy.getOrders(param0);
        return result;
    }

    public GetHoldingsResponse getHoldings(GetHoldingsRequest param0) {
        GetHoldingsResponse result = null;
        try {
            m_proxy = getProxy();
        } catch (ServiceException serviceException) {
            throw ServiceRuntimeException.wrap(serviceException);
        }
        result = m_proxy.getHoldings(param0);
        return result;
    }

    public GetWalletDataResponse getWalletData(GetWalletDataRequest param0) {
        GetWalletDataResponse result = null;
        try {
            m_proxy = getProxy();
        } catch (ServiceException serviceException) {
            throw ServiceRuntimeException.wrap(serviceException);
        }
        result = m_proxy.getWalletData(param0);
        return result;
    }

    public GetClosedOrdersResponse getClosedOrders(GetClosedOrdersRequest param0) {
        GetClosedOrdersResponse result = null;
        try {
            m_proxy = getProxy();
        } catch (ServiceException serviceException) {
            throw ServiceRuntimeException.wrap(serviceException);
        }
        result = m_proxy.getClosedOrders(param0);
        return result;
    }

}
