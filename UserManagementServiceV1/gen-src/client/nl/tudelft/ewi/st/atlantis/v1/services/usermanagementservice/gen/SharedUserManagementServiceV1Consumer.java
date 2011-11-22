
package nl.tudelft.ewi.st.atlantis.v1.services.usermanagementservice.gen;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.concurrent.Future;
import javax.xml.ws.AsyncHandler;
import javax.xml.ws.Response;
import nl.tudelft.ewi.st.atlantis.v1.services.GetAccountDataRequest;
import nl.tudelft.ewi.st.atlantis.v1.services.GetAccountDataResponse;
import nl.tudelft.ewi.st.atlantis.v1.services.GetAccountProfileDataRequest;
import nl.tudelft.ewi.st.atlantis.v1.services.GetAccountProfileDataResponse;
import nl.tudelft.ewi.st.atlantis.v1.services.GetWalletDataRequest;
import nl.tudelft.ewi.st.atlantis.v1.services.GetWalletDataResponse;
import nl.tudelft.ewi.st.atlantis.v1.services.LoginRequest;
import nl.tudelft.ewi.st.atlantis.v1.services.LoginResponse;
import nl.tudelft.ewi.st.atlantis.v1.services.LogoutRequest;
import nl.tudelft.ewi.st.atlantis.v1.services.LogoutResponse;
import nl.tudelft.ewi.st.atlantis.v1.services.RegisterRequest;
import nl.tudelft.ewi.st.atlantis.v1.services.RegisterResponse;
import nl.tudelft.ewi.st.atlantis.v1.services.UpdateAccountProfileRequest;
import nl.tudelft.ewi.st.atlantis.v1.services.UpdateAccountProfileResponse;
import nl.tudelft.ewi.st.atlantis.v1.services.UpdateWalletDataRequest;
import nl.tudelft.ewi.st.atlantis.v1.services.UpdateWalletDataResponse;
import nl.tudelft.ewi.st.atlantis.v1.services.usermanagementservice.AsyncUserManagementServiceV1;
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
public class SharedUserManagementServiceV1Consumer
    implements AsyncUserManagementServiceV1
{

    private URL m_serviceLocation = null;
    private final static String SVC_ADMIN_NAME = "UserManagementServiceV1";
    private String m_clientName;
    private String m_environment = "production";
    private AsyncUserManagementServiceV1 m_proxy = null;
    private String m_authToken = null;
    private Cookie[] m_cookies;
    private Service m_service = null;

    public SharedUserManagementServiceV1Consumer(String clientName)
        throws ServiceException
    {
        if (clientName == null) {
            throw new ServiceException("clientName can not be null");
        }
        m_clientName = clientName;
    }

    public SharedUserManagementServiceV1Consumer(String clientName, String environment)
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

    protected AsyncUserManagementServiceV1 getProxy()
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

}
