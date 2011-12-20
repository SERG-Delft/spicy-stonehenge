
package nl.tudelft.ewi.st.atlantis.tudelft.v1.services.configurationservice.gen;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Future;
import javax.xml.ws.AsyncHandler;
import javax.xml.ws.Dispatch;
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
import org.ebayopensource.turmeric.runtime.common.exceptions.ServiceInvocationException;
import org.ebayopensource.turmeric.runtime.sif.impl.internal.service.BaseServiceProxy;
import org.ebayopensource.turmeric.runtime.sif.service.Service;


/**
 * Note : Generated file, any changes will be lost upon regeneration.
 * 
 */
public class ConfigurationServiceV1Proxy
    extends BaseServiceProxy<AsyncConfigurationServiceV1>
    implements AsyncConfigurationServiceV1
{


    public ConfigurationServiceV1Proxy(Service service) {
        super(service);
    }

    public List<Response<?>> poll(boolean block, boolean partial)
        throws InterruptedException
    {
        return m_service.poll(block, partial);
    }

    public Response<GetClientConfigResponse> getClientConfigAsync(GetClientConfigRequest param0) {
        Dispatch dispatch = m_service.createDispatch("getClientConfig");
        Response<GetClientConfigResponse> result = dispatch.invokeAsync(param0);
        return result;
    }

    public Future<?> getClientConfigAsync(GetClientConfigRequest param0, AsyncHandler<GetClientConfigResponse> param1) {
        Dispatch dispatch = m_service.createDispatch("getClientConfig");
        Future<?> result = dispatch.invokeAsync(param0, param1);
        return result;
    }

    public Future<?> setServiceLocationAsync(SetServiceLocationRequest param0, AsyncHandler<SetServiceLocationResponse> param1) {
        Dispatch dispatch = m_service.createDispatch("setServiceLocation");
        Future<?> result = dispatch.invokeAsync(param0, param1);
        return result;
    }

    public Response<SetServiceLocationResponse> setServiceLocationAsync(SetServiceLocationRequest param0) {
        Dispatch dispatch = m_service.createDispatch("setServiceLocation");
        Response<SetServiceLocationResponse> result = dispatch.invokeAsync(param0);
        return result;
    }

    public Response<GetBSConfigResponse> getBSConfigAsync(GetBSConfigRequest param0) {
        Dispatch dispatch = m_service.createDispatch("getBSConfig");
        Response<GetBSConfigResponse> result = dispatch.invokeAsync(param0);
        return result;
    }

    public Future<?> getBSConfigAsync(GetBSConfigRequest param0, AsyncHandler<GetBSConfigResponse> param1) {
        Dispatch dispatch = m_service.createDispatch("getBSConfig");
        Future<?> result = dispatch.invokeAsync(param0, param1);
        return result;
    }

    public Response<GetOPSConfigResponse> getOPSConfigAsync(GetOPSConfigRequest param0) {
        Dispatch dispatch = m_service.createDispatch("getOPSConfig");
        Response<GetOPSConfigResponse> result = dispatch.invokeAsync(param0);
        return result;
    }

    public Future<?> getOPSConfigAsync(GetOPSConfigRequest param0, AsyncHandler<GetOPSConfigResponse> param1) {
        Dispatch dispatch = m_service.createDispatch("getOPSConfig");
        Future<?> result = dispatch.invokeAsync(param0, param1);
        return result;
    }

    public Response<GetQSLocationsResponse> getQSLocationsAsync(GetQSLocationsRequest param0) {
        Dispatch dispatch = m_service.createDispatch("getQSLocations");
        Response<GetQSLocationsResponse> result = dispatch.invokeAsync(param0);
        return result;
    }

    public Future<?> getQSLocationsAsync(GetQSLocationsRequest param0, AsyncHandler<GetQSLocationsResponse> param1) {
        Dispatch dispatch = m_service.createDispatch("getQSLocations");
        Future<?> result = dispatch.invokeAsync(param0, param1);
        return result;
    }

    public Response<SetClientToBSResponse> setClientToBSAsync(SetClientToBSRequest param0) {
        Dispatch dispatch = m_service.createDispatch("setClientToBS");
        Response<SetClientToBSResponse> result = dispatch.invokeAsync(param0);
        return result;
    }

    public Future<?> setClientToBSAsync(SetClientToBSRequest param0, AsyncHandler<SetClientToBSResponse> param1) {
        Dispatch dispatch = m_service.createDispatch("setClientToBS");
        Future<?> result = dispatch.invokeAsync(param0, param1);
        return result;
    }

    public Future<?> getESLocationsAsync(GetESLocationRequest param0, AsyncHandler<GetESLocationsResponse> param1) {
        Dispatch dispatch = m_service.createDispatch("getESLocations");
        Future<?> result = dispatch.invokeAsync(param0, param1);
        return result;
    }

    public Response<GetESLocationsResponse> getESLocationsAsync(GetESLocationRequest param0) {
        Dispatch dispatch = m_service.createDispatch("getESLocations");
        Response<GetESLocationsResponse> result = dispatch.invokeAsync(param0);
        return result;
    }

    public Response<SetBSToOPSResponse> setBSToOPSAsync(SetBSToOPSRequest param0) {
        Dispatch dispatch = m_service.createDispatch("setBSToOPS");
        Response<SetBSToOPSResponse> result = dispatch.invokeAsync(param0);
        return result;
    }

    public Future<?> setBSToOPSAsync(SetBSToOPSRequest param0, AsyncHandler<SetBSToOPSResponse> param1) {
        Dispatch dispatch = m_service.createDispatch("setBSToOPS");
        Future<?> result = dispatch.invokeAsync(param0, param1);
        return result;
    }

    public Response<GetBSLocationsResponse> getBSLocationsAsync(GetBSLocationsRequest param0) {
        Dispatch dispatch = m_service.createDispatch("getBSLocations");
        Response<GetBSLocationsResponse> result = dispatch.invokeAsync(param0);
        return result;
    }

    public Future<?> getBSLocationsAsync(GetBSLocationsRequest param0, AsyncHandler<GetBSLocationsResponse> param1) {
        Dispatch dispatch = m_service.createDispatch("getBSLocations");
        Future<?> result = dispatch.invokeAsync(param0, param1);
        return result;
    }

    public Response<GetOPSLocationsResponse> getOPSLocationsAsync(GetOPSLocationsRequest param0) {
        Dispatch dispatch = m_service.createDispatch("getOPSLocations");
        Response<GetOPSLocationsResponse> result = dispatch.invokeAsync(param0);
        return result;
    }

    public Future<?> getOPSLocationsAsync(GetOPSLocationsRequest param0, AsyncHandler<GetOPSLocationsResponse> param1) {
        Dispatch dispatch = m_service.createDispatch("getOPSLocations");
        Future<?> result = dispatch.invokeAsync(param0, param1);
        return result;
    }

    public GetClientConfigResponse getClientConfig(GetClientConfigRequest param0) {
        Object[] params = new Object[ 1 ] ;
        params[ 0 ] = param0;
        List<Object> returnParamList = new ArrayList<Object>();
        try {
            m_service.invoke("getClientConfig", params, returnParamList);
        } catch (ServiceInvocationException svcInvocationEx) {
            throw wrapInvocationException(svcInvocationEx);
        }
        GetClientConfigResponse result = ((GetClientConfigResponse) returnParamList.get(0));
        return result;
    }

    public SetServiceLocationResponse setServiceLocation(SetServiceLocationRequest param0) {
        Object[] params = new Object[ 1 ] ;
        params[ 0 ] = param0;
        List<Object> returnParamList = new ArrayList<Object>();
        try {
            m_service.invoke("setServiceLocation", params, returnParamList);
        } catch (ServiceInvocationException svcInvocationEx) {
            throw wrapInvocationException(svcInvocationEx);
        }
        SetServiceLocationResponse result = ((SetServiceLocationResponse) returnParamList.get(0));
        return result;
    }

    public GetBSConfigResponse getBSConfig(GetBSConfigRequest param0) {
        Object[] params = new Object[ 1 ] ;
        params[ 0 ] = param0;
        List<Object> returnParamList = new ArrayList<Object>();
        try {
            m_service.invoke("getBSConfig", params, returnParamList);
        } catch (ServiceInvocationException svcInvocationEx) {
            throw wrapInvocationException(svcInvocationEx);
        }
        GetBSConfigResponse result = ((GetBSConfigResponse) returnParamList.get(0));
        return result;
    }

    public GetOPSConfigResponse getOPSConfig(GetOPSConfigRequest param0) {
        Object[] params = new Object[ 1 ] ;
        params[ 0 ] = param0;
        List<Object> returnParamList = new ArrayList<Object>();
        try {
            m_service.invoke("getOPSConfig", params, returnParamList);
        } catch (ServiceInvocationException svcInvocationEx) {
            throw wrapInvocationException(svcInvocationEx);
        }
        GetOPSConfigResponse result = ((GetOPSConfigResponse) returnParamList.get(0));
        return result;
    }

    public GetQSLocationsResponse getQSLocations(GetQSLocationsRequest param0) {
        Object[] params = new Object[ 1 ] ;
        params[ 0 ] = param0;
        List<Object> returnParamList = new ArrayList<Object>();
        try {
            m_service.invoke("getQSLocations", params, returnParamList);
        } catch (ServiceInvocationException svcInvocationEx) {
            throw wrapInvocationException(svcInvocationEx);
        }
        GetQSLocationsResponse result = ((GetQSLocationsResponse) returnParamList.get(0));
        return result;
    }

    public SetClientToBSResponse setClientToBS(SetClientToBSRequest param0) {
        Object[] params = new Object[ 1 ] ;
        params[ 0 ] = param0;
        List<Object> returnParamList = new ArrayList<Object>();
        try {
            m_service.invoke("setClientToBS", params, returnParamList);
        } catch (ServiceInvocationException svcInvocationEx) {
            throw wrapInvocationException(svcInvocationEx);
        }
        SetClientToBSResponse result = ((SetClientToBSResponse) returnParamList.get(0));
        return result;
    }

    public GetESLocationsResponse getESLocations(GetESLocationRequest param0) {
        Object[] params = new Object[ 1 ] ;
        params[ 0 ] = param0;
        List<Object> returnParamList = new ArrayList<Object>();
        try {
            m_service.invoke("getESLocations", params, returnParamList);
        } catch (ServiceInvocationException svcInvocationEx) {
            throw wrapInvocationException(svcInvocationEx);
        }
        GetESLocationsResponse result = ((GetESLocationsResponse) returnParamList.get(0));
        return result;
    }

    public SetBSToOPSResponse setBSToOPS(SetBSToOPSRequest param0) {
        Object[] params = new Object[ 1 ] ;
        params[ 0 ] = param0;
        List<Object> returnParamList = new ArrayList<Object>();
        try {
            m_service.invoke("setBSToOPS", params, returnParamList);
        } catch (ServiceInvocationException svcInvocationEx) {
            throw wrapInvocationException(svcInvocationEx);
        }
        SetBSToOPSResponse result = ((SetBSToOPSResponse) returnParamList.get(0));
        return result;
    }

    public GetBSLocationsResponse getBSLocations(GetBSLocationsRequest param0) {
        Object[] params = new Object[ 1 ] ;
        params[ 0 ] = param0;
        List<Object> returnParamList = new ArrayList<Object>();
        try {
            m_service.invoke("getBSLocations", params, returnParamList);
        } catch (ServiceInvocationException svcInvocationEx) {
            throw wrapInvocationException(svcInvocationEx);
        }
        GetBSLocationsResponse result = ((GetBSLocationsResponse) returnParamList.get(0));
        return result;
    }

    public GetOPSLocationsResponse getOPSLocations(GetOPSLocationsRequest param0) {
        Object[] params = new Object[ 1 ] ;
        params[ 0 ] = param0;
        List<Object> returnParamList = new ArrayList<Object>();
        try {
            m_service.invoke("getOPSLocations", params, returnParamList);
        } catch (ServiceInvocationException svcInvocationEx) {
            throw wrapInvocationException(svcInvocationEx);
        }
        GetOPSLocationsResponse result = ((GetOPSLocationsResponse) returnParamList.get(0));
        return result;
    }

}
