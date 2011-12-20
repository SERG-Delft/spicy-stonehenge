
package nl.tudelft.ewi.st.atlantis.tudelft.v1.services.configurationservice.gen;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.concurrent.Future;
import javax.xml.ws.AsyncHandler;
import javax.xml.ws.Response;
import nl.tudelft.ewi.st.atlantis.tudelft.v1.services.GetBSConfigRequest;
import nl.tudelft.ewi.st.atlantis.tudelft.v1.services.GetBSConfigResponse;
import nl.tudelft.ewi.st.atlantis.tudelft.v1.services.GetBSLocationsRequest;
import nl.tudelft.ewi.st.atlantis.tudelft.v1.services.GetBSLocationsResponse;
import nl.tudelft.ewi.st.atlantis.tudelft.v1.services.GetClientConfigRequest;
import nl.tudelft.ewi.st.atlantis.tudelft.v1.services.GetClientConfigResponse;
import nl.tudelft.ewi.st.atlantis.tudelft.v1.services.GetESLocationRequest;
import nl.tudelft.ewi.st.atlantis.tudelft.v1.services.GetESLocationsResponse;
import nl.tudelft.ewi.st.atlantis.tudelft.v1.services.GetOPSConfigRequest;
import nl.tudelft.ewi.st.atlantis.tudelft.v1.services.GetOPSConfigResponse;
import nl.tudelft.ewi.st.atlantis.tudelft.v1.services.GetOPSLocationsRequest;
import nl.tudelft.ewi.st.atlantis.tudelft.v1.services.GetOPSLocationsResponse;
import nl.tudelft.ewi.st.atlantis.tudelft.v1.services.GetQSLocationsRequest;
import nl.tudelft.ewi.st.atlantis.tudelft.v1.services.GetQSLocationsResponse;
import nl.tudelft.ewi.st.atlantis.tudelft.v1.services.SetBSToOPSRequest;
import nl.tudelft.ewi.st.atlantis.tudelft.v1.services.SetBSToOPSResponse;
import nl.tudelft.ewi.st.atlantis.tudelft.v1.services.SetClientToBSRequest;
import nl.tudelft.ewi.st.atlantis.tudelft.v1.services.SetClientToBSResponse;
import nl.tudelft.ewi.st.atlantis.tudelft.v1.services.SetServiceLocationRequest;
import nl.tudelft.ewi.st.atlantis.tudelft.v1.services.SetServiceLocationResponse;
import nl.tudelft.ewi.st.atlantis.tudelft.v1.services.configurationservice.AsyncConfigurationServiceV1;
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
public class SharedConfigurationServiceV1Consumer
    implements AsyncConfigurationServiceV1
{

    private URL m_serviceLocation = null;
    private final static String SVC_ADMIN_NAME = "ConfigurationServiceV1";
    private String m_clientName;
    private String m_environment = "production";
    private AsyncConfigurationServiceV1 m_proxy = null;
    private String m_authToken = null;
    private Cookie[] m_cookies;
    private Service m_service = null;

    public SharedConfigurationServiceV1Consumer(String clientName)
        throws ServiceException
    {
        if (clientName == null) {
            throw new ServiceException("clientName can not be null");
        }
        m_clientName = clientName;
    }

    public SharedConfigurationServiceV1Consumer(String clientName, String environment)
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

    protected AsyncConfigurationServiceV1 getProxy()
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

    public Response<GetClientConfigResponse> getClientConfigAsync(GetClientConfigRequest param0) {
        Response<GetClientConfigResponse> result = null;
        try {
            m_proxy = getProxy();
        } catch (ServiceException serviceException) {
            throw ServiceRuntimeException.wrap(serviceException);
        }
        result = m_proxy.getClientConfigAsync(param0);
        return result;
    }

    public Future<?> getClientConfigAsync(GetClientConfigRequest param0, AsyncHandler<GetClientConfigResponse> param1) {
        Future<?> result = null;
        try {
            m_proxy = getProxy();
        } catch (ServiceException serviceException) {
            throw ServiceRuntimeException.wrap(serviceException);
        }
        result = m_proxy.getClientConfigAsync(param0, param1);
        return result;
    }

    public Future<?> setServiceLocationAsync(SetServiceLocationRequest param0, AsyncHandler<SetServiceLocationResponse> param1) {
        Future<?> result = null;
        try {
            m_proxy = getProxy();
        } catch (ServiceException serviceException) {
            throw ServiceRuntimeException.wrap(serviceException);
        }
        result = m_proxy.setServiceLocationAsync(param0, param1);
        return result;
    }

    public Response<SetServiceLocationResponse> setServiceLocationAsync(SetServiceLocationRequest param0) {
        Response<SetServiceLocationResponse> result = null;
        try {
            m_proxy = getProxy();
        } catch (ServiceException serviceException) {
            throw ServiceRuntimeException.wrap(serviceException);
        }
        result = m_proxy.setServiceLocationAsync(param0);
        return result;
    }

    public Response<GetBSConfigResponse> getBSConfigAsync(GetBSConfigRequest param0) {
        Response<GetBSConfigResponse> result = null;
        try {
            m_proxy = getProxy();
        } catch (ServiceException serviceException) {
            throw ServiceRuntimeException.wrap(serviceException);
        }
        result = m_proxy.getBSConfigAsync(param0);
        return result;
    }

    public Future<?> getBSConfigAsync(GetBSConfigRequest param0, AsyncHandler<GetBSConfigResponse> param1) {
        Future<?> result = null;
        try {
            m_proxy = getProxy();
        } catch (ServiceException serviceException) {
            throw ServiceRuntimeException.wrap(serviceException);
        }
        result = m_proxy.getBSConfigAsync(param0, param1);
        return result;
    }

    public Response<GetOPSConfigResponse> getOPSConfigAsync(GetOPSConfigRequest param0) {
        Response<GetOPSConfigResponse> result = null;
        try {
            m_proxy = getProxy();
        } catch (ServiceException serviceException) {
            throw ServiceRuntimeException.wrap(serviceException);
        }
        result = m_proxy.getOPSConfigAsync(param0);
        return result;
    }

    public Future<?> getOPSConfigAsync(GetOPSConfigRequest param0, AsyncHandler<GetOPSConfigResponse> param1) {
        Future<?> result = null;
        try {
            m_proxy = getProxy();
        } catch (ServiceException serviceException) {
            throw ServiceRuntimeException.wrap(serviceException);
        }
        result = m_proxy.getOPSConfigAsync(param0, param1);
        return result;
    }

    public Response<GetQSLocationsResponse> getQSLocationsAsync(GetQSLocationsRequest param0) {
        Response<GetQSLocationsResponse> result = null;
        try {
            m_proxy = getProxy();
        } catch (ServiceException serviceException) {
            throw ServiceRuntimeException.wrap(serviceException);
        }
        result = m_proxy.getQSLocationsAsync(param0);
        return result;
    }

    public Future<?> getQSLocationsAsync(GetQSLocationsRequest param0, AsyncHandler<GetQSLocationsResponse> param1) {
        Future<?> result = null;
        try {
            m_proxy = getProxy();
        } catch (ServiceException serviceException) {
            throw ServiceRuntimeException.wrap(serviceException);
        }
        result = m_proxy.getQSLocationsAsync(param0, param1);
        return result;
    }

    public Response<SetClientToBSResponse> setClientToBSAsync(SetClientToBSRequest param0) {
        Response<SetClientToBSResponse> result = null;
        try {
            m_proxy = getProxy();
        } catch (ServiceException serviceException) {
            throw ServiceRuntimeException.wrap(serviceException);
        }
        result = m_proxy.setClientToBSAsync(param0);
        return result;
    }

    public Future<?> setClientToBSAsync(SetClientToBSRequest param0, AsyncHandler<SetClientToBSResponse> param1) {
        Future<?> result = null;
        try {
            m_proxy = getProxy();
        } catch (ServiceException serviceException) {
            throw ServiceRuntimeException.wrap(serviceException);
        }
        result = m_proxy.setClientToBSAsync(param0, param1);
        return result;
    }

    public Future<?> getESLocationsAsync(GetESLocationRequest param0, AsyncHandler<GetESLocationsResponse> param1) {
        Future<?> result = null;
        try {
            m_proxy = getProxy();
        } catch (ServiceException serviceException) {
            throw ServiceRuntimeException.wrap(serviceException);
        }
        result = m_proxy.getESLocationsAsync(param0, param1);
        return result;
    }

    public Response<GetESLocationsResponse> getESLocationsAsync(GetESLocationRequest param0) {
        Response<GetESLocationsResponse> result = null;
        try {
            m_proxy = getProxy();
        } catch (ServiceException serviceException) {
            throw ServiceRuntimeException.wrap(serviceException);
        }
        result = m_proxy.getESLocationsAsync(param0);
        return result;
    }

    public Response<SetBSToOPSResponse> setBSToOPSAsync(SetBSToOPSRequest param0) {
        Response<SetBSToOPSResponse> result = null;
        try {
            m_proxy = getProxy();
        } catch (ServiceException serviceException) {
            throw ServiceRuntimeException.wrap(serviceException);
        }
        result = m_proxy.setBSToOPSAsync(param0);
        return result;
    }

    public Future<?> setBSToOPSAsync(SetBSToOPSRequest param0, AsyncHandler<SetBSToOPSResponse> param1) {
        Future<?> result = null;
        try {
            m_proxy = getProxy();
        } catch (ServiceException serviceException) {
            throw ServiceRuntimeException.wrap(serviceException);
        }
        result = m_proxy.setBSToOPSAsync(param0, param1);
        return result;
    }

    public Response<GetBSLocationsResponse> getBSLocationsAsync(GetBSLocationsRequest param0) {
        Response<GetBSLocationsResponse> result = null;
        try {
            m_proxy = getProxy();
        } catch (ServiceException serviceException) {
            throw ServiceRuntimeException.wrap(serviceException);
        }
        result = m_proxy.getBSLocationsAsync(param0);
        return result;
    }

    public Future<?> getBSLocationsAsync(GetBSLocationsRequest param0, AsyncHandler<GetBSLocationsResponse> param1) {
        Future<?> result = null;
        try {
            m_proxy = getProxy();
        } catch (ServiceException serviceException) {
            throw ServiceRuntimeException.wrap(serviceException);
        }
        result = m_proxy.getBSLocationsAsync(param0, param1);
        return result;
    }

    public Response<GetOPSLocationsResponse> getOPSLocationsAsync(GetOPSLocationsRequest param0) {
        Response<GetOPSLocationsResponse> result = null;
        try {
            m_proxy = getProxy();
        } catch (ServiceException serviceException) {
            throw ServiceRuntimeException.wrap(serviceException);
        }
        result = m_proxy.getOPSLocationsAsync(param0);
        return result;
    }

    public Future<?> getOPSLocationsAsync(GetOPSLocationsRequest param0, AsyncHandler<GetOPSLocationsResponse> param1) {
        Future<?> result = null;
        try {
            m_proxy = getProxy();
        } catch (ServiceException serviceException) {
            throw ServiceRuntimeException.wrap(serviceException);
        }
        result = m_proxy.getOPSLocationsAsync(param0, param1);
        return result;
    }

    public GetClientConfigResponse getClientConfig(GetClientConfigRequest param0) {
        GetClientConfigResponse result = null;
        try {
            m_proxy = getProxy();
        } catch (ServiceException serviceException) {
            throw ServiceRuntimeException.wrap(serviceException);
        }
        result = m_proxy.getClientConfig(param0);
        return result;
    }

    public SetServiceLocationResponse setServiceLocation(SetServiceLocationRequest param0) {
        SetServiceLocationResponse result = null;
        try {
            m_proxy = getProxy();
        } catch (ServiceException serviceException) {
            throw ServiceRuntimeException.wrap(serviceException);
        }
        result = m_proxy.setServiceLocation(param0);
        return result;
    }

    public GetBSConfigResponse getBSConfig(GetBSConfigRequest param0) {
        GetBSConfigResponse result = null;
        try {
            m_proxy = getProxy();
        } catch (ServiceException serviceException) {
            throw ServiceRuntimeException.wrap(serviceException);
        }
        result = m_proxy.getBSConfig(param0);
        return result;
    }

    public GetOPSConfigResponse getOPSConfig(GetOPSConfigRequest param0) {
        GetOPSConfigResponse result = null;
        try {
            m_proxy = getProxy();
        } catch (ServiceException serviceException) {
            throw ServiceRuntimeException.wrap(serviceException);
        }
        result = m_proxy.getOPSConfig(param0);
        return result;
    }

    public GetQSLocationsResponse getQSLocations(GetQSLocationsRequest param0) {
        GetQSLocationsResponse result = null;
        try {
            m_proxy = getProxy();
        } catch (ServiceException serviceException) {
            throw ServiceRuntimeException.wrap(serviceException);
        }
        result = m_proxy.getQSLocations(param0);
        return result;
    }

    public SetClientToBSResponse setClientToBS(SetClientToBSRequest param0) {
        SetClientToBSResponse result = null;
        try {
            m_proxy = getProxy();
        } catch (ServiceException serviceException) {
            throw ServiceRuntimeException.wrap(serviceException);
        }
        result = m_proxy.setClientToBS(param0);
        return result;
    }

    public GetESLocationsResponse getESLocations(GetESLocationRequest param0) {
        GetESLocationsResponse result = null;
        try {
            m_proxy = getProxy();
        } catch (ServiceException serviceException) {
            throw ServiceRuntimeException.wrap(serviceException);
        }
        result = m_proxy.getESLocations(param0);
        return result;
    }

    public SetBSToOPSResponse setBSToOPS(SetBSToOPSRequest param0) {
        SetBSToOPSResponse result = null;
        try {
            m_proxy = getProxy();
        } catch (ServiceException serviceException) {
            throw ServiceRuntimeException.wrap(serviceException);
        }
        result = m_proxy.setBSToOPS(param0);
        return result;
    }

    public GetBSLocationsResponse getBSLocations(GetBSLocationsRequest param0) {
        GetBSLocationsResponse result = null;
        try {
            m_proxy = getProxy();
        } catch (ServiceException serviceException) {
            throw ServiceRuntimeException.wrap(serviceException);
        }
        result = m_proxy.getBSLocations(param0);
        return result;
    }

    public GetOPSLocationsResponse getOPSLocations(GetOPSLocationsRequest param0) {
        GetOPSLocationsResponse result = null;
        try {
            m_proxy = getProxy();
        } catch (ServiceException serviceException) {
            throw ServiceRuntimeException.wrap(serviceException);
        }
        result = m_proxy.getOPSLocations(param0);
        return result;
    }

}
