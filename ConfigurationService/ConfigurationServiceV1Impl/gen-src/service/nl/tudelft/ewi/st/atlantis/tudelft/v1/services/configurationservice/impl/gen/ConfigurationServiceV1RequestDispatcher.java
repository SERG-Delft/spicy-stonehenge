
package nl.tudelft.ewi.st.atlantis.tudelft.v1.services.configurationservice.impl.gen;

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
import nl.tudelft.ewi.st.atlantis.tudelft.v1.services.configurationservice.ConfigurationServiceV1;
import org.ebayopensource.turmeric.runtime.common.exceptions.ServiceException;
import org.ebayopensource.turmeric.runtime.common.pipeline.Message;
import org.ebayopensource.turmeric.runtime.common.pipeline.MessageContext;
import org.ebayopensource.turmeric.runtime.spf.impl.internal.pipeline.BaseServiceRequestDispatcher;


/**
 * Note : Generated file, any changes will be lost upon regeneration.
 * 
 */
public class ConfigurationServiceV1RequestDispatcher
    extends BaseServiceRequestDispatcher<ConfigurationServiceV1>
{


    public ConfigurationServiceV1RequestDispatcher() {
        super(ConfigurationServiceV1 .class);
        addSupportedOperation("setServiceLocation", new Class[] {SetServiceLocationRequest.class }, new Class[] {SetServiceLocationResponse.class });
        addSupportedOperation("getClientConfig", new Class[] {GetClientConfigRequest.class }, new Class[] {GetClientConfigResponse.class });
        addSupportedOperation("getBSConfig", new Class[] {GetBSConfigRequest.class }, new Class[] {GetBSConfigResponse.class });
        addSupportedOperation("getOPSConfig", new Class[] {GetOPSConfigRequest.class }, new Class[] {GetOPSConfigResponse.class });
        addSupportedOperation("getQSLocations", new Class[] {GetQSLocationsRequest.class }, new Class[] {GetQSLocationsResponse.class });
        addSupportedOperation("setClientToBS", new Class[] {SetClientToBSRequest.class }, new Class[] {SetClientToBSResponse.class });
        addSupportedOperation("getESLocations", new Class[] {GetESLocationRequest.class }, new Class[] {GetESLocationsResponse.class });
        addSupportedOperation("setBSToOPS", new Class[] {SetBSToOPSRequest.class }, new Class[] {SetBSToOPSResponse.class });
        addSupportedOperation("getBSLocations", new Class[] {GetBSLocationsRequest.class }, new Class[] {GetBSLocationsResponse.class });
        addSupportedOperation("getOPSLocations", new Class[] {GetOPSLocationsRequest.class }, new Class[] {GetOPSLocationsResponse.class });
    }

    public boolean dispatch(MessageContext param0, ConfigurationServiceV1 param1)
        throws ServiceException
    {
        MessageContext msgCtx = param0;
        ConfigurationServiceV1 service = param1;
        String operationName = msgCtx.getOperationName();
        Message requestMsg = msgCtx.getRequestMessage();
         
        if ("setServiceLocation".equals(operationName)) {
            SetServiceLocationRequest param2 = ((SetServiceLocationRequest) requestMsg.getParam(0));
            try {
                Message responseMsg = msgCtx.getResponseMessage();
                SetServiceLocationResponse result = service.setServiceLocation(param2);
                responseMsg.setParam(0, result);
            } catch (Throwable th) {
                handleServiceException(msgCtx, th);
            }
            return true;
        }
        else 
        if ("getClientConfig".equals(operationName)) {
            GetClientConfigRequest param2 = ((GetClientConfigRequest) requestMsg.getParam(0));
            try {
                Message responseMsg = msgCtx.getResponseMessage();
                GetClientConfigResponse result = service.getClientConfig(param2);
                responseMsg.setParam(0, result);
            } catch (Throwable th) {
                handleServiceException(msgCtx, th);
            }
            return true;
        }
        else 
        if ("getBSConfig".equals(operationName)) {
            GetBSConfigRequest param2 = ((GetBSConfigRequest) requestMsg.getParam(0));
            try {
                Message responseMsg = msgCtx.getResponseMessage();
                GetBSConfigResponse result = service.getBSConfig(param2);
                responseMsg.setParam(0, result);
            } catch (Throwable th) {
                handleServiceException(msgCtx, th);
            }
            return true;
        }
        else 
        if ("getOPSConfig".equals(operationName)) {
            GetOPSConfigRequest param2 = ((GetOPSConfigRequest) requestMsg.getParam(0));
            try {
                Message responseMsg = msgCtx.getResponseMessage();
                GetOPSConfigResponse result = service.getOPSConfig(param2);
                responseMsg.setParam(0, result);
            } catch (Throwable th) {
                handleServiceException(msgCtx, th);
            }
            return true;
        }
        else 
        if ("getQSLocations".equals(operationName)) {
            GetQSLocationsRequest param2 = ((GetQSLocationsRequest) requestMsg.getParam(0));
            try {
                Message responseMsg = msgCtx.getResponseMessage();
                GetQSLocationsResponse result = service.getQSLocations(param2);
                responseMsg.setParam(0, result);
            } catch (Throwable th) {
                handleServiceException(msgCtx, th);
            }
            return true;
        }
        else 
        if ("setClientToBS".equals(operationName)) {
            SetClientToBSRequest param2 = ((SetClientToBSRequest) requestMsg.getParam(0));
            try {
                Message responseMsg = msgCtx.getResponseMessage();
                SetClientToBSResponse result = service.setClientToBS(param2);
                responseMsg.setParam(0, result);
            } catch (Throwable th) {
                handleServiceException(msgCtx, th);
            }
            return true;
        }
        else 
        if ("getESLocations".equals(operationName)) {
            GetESLocationRequest param2 = ((GetESLocationRequest) requestMsg.getParam(0));
            try {
                Message responseMsg = msgCtx.getResponseMessage();
                GetESLocationsResponse result = service.getESLocations(param2);
                responseMsg.setParam(0, result);
            } catch (Throwable th) {
                handleServiceException(msgCtx, th);
            }
            return true;
        }
        else 
        if ("setBSToOPS".equals(operationName)) {
            SetBSToOPSRequest param2 = ((SetBSToOPSRequest) requestMsg.getParam(0));
            try {
                Message responseMsg = msgCtx.getResponseMessage();
                SetBSToOPSResponse result = service.setBSToOPS(param2);
                responseMsg.setParam(0, result);
            } catch (Throwable th) {
                handleServiceException(msgCtx, th);
            }
            return true;
        }
        else 
        if ("getBSLocations".equals(operationName)) {
            GetBSLocationsRequest param2 = ((GetBSLocationsRequest) requestMsg.getParam(0));
            try {
                Message responseMsg = msgCtx.getResponseMessage();
                GetBSLocationsResponse result = service.getBSLocations(param2);
                responseMsg.setParam(0, result);
            } catch (Throwable th) {
                handleServiceException(msgCtx, th);
            }
            return true;
        }
        else 
        if ("getOPSLocations".equals(operationName)) {
            GetOPSLocationsRequest param2 = ((GetOPSLocationsRequest) requestMsg.getParam(0));
            try {
                Message responseMsg = msgCtx.getResponseMessage();
                GetOPSLocationsResponse result = service.getOPSLocations(param2);
                responseMsg.setParam(0, result);
            } catch (Throwable th) {
                handleServiceException(msgCtx, th);
            }
            return true;
        }
        return false;
    }

}
