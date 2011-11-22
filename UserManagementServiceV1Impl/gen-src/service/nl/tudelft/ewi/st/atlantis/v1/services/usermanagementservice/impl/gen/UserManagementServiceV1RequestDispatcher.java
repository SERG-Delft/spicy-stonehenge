
package nl.tudelft.ewi.st.atlantis.v1.services.usermanagementservice.impl.gen;

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
import nl.tudelft.ewi.st.atlantis.v1.services.usermanagementservice.UserManagementServiceV1;
import org.ebayopensource.turmeric.runtime.common.exceptions.ServiceException;
import org.ebayopensource.turmeric.runtime.common.pipeline.Message;
import org.ebayopensource.turmeric.runtime.common.pipeline.MessageContext;
import org.ebayopensource.turmeric.runtime.spf.impl.internal.pipeline.BaseServiceRequestDispatcher;


/**
 * Note : Generated file, any changes will be lost upon regeneration.
 * 
 */
public class UserManagementServiceV1RequestDispatcher
    extends BaseServiceRequestDispatcher<UserManagementServiceV1>
{


    public UserManagementServiceV1RequestDispatcher() {
        super(UserManagementServiceV1 .class);
        addSupportedOperation("register", new Class[] {RegisterRequest.class }, new Class[] {RegisterResponse.class });
        addSupportedOperation("login", new Class[] {LoginRequest.class }, new Class[] {LoginResponse.class });
        addSupportedOperation("logout", new Class[] {LogoutRequest.class }, new Class[] {LogoutResponse.class });
        addSupportedOperation("getWalletData", new Class[] {GetWalletDataRequest.class }, new Class[] {GetWalletDataResponse.class });
        addSupportedOperation("getAccountData", new Class[] {GetAccountDataRequest.class }, new Class[] {GetAccountDataResponse.class });
        addSupportedOperation("updateWalletData", new Class[] {UpdateWalletDataRequest.class }, new Class[] {UpdateWalletDataResponse.class });
        addSupportedOperation("updateAccountProfile", new Class[] {UpdateAccountProfileRequest.class }, new Class[] {UpdateAccountProfileResponse.class });
        addSupportedOperation("getAccountProfileData", new Class[] {GetAccountProfileDataRequest.class }, new Class[] {GetAccountProfileDataResponse.class });
    }

    public boolean dispatch(MessageContext param0, UserManagementServiceV1 param1)
        throws ServiceException
    {
        MessageContext msgCtx = param0;
        UserManagementServiceV1 service = param1;
        String operationName = msgCtx.getOperationName();
        Message requestMsg = msgCtx.getRequestMessage();
         
        if ("register".equals(operationName)) {
            RegisterRequest param2 = ((RegisterRequest) requestMsg.getParam(0));
            try {
                Message responseMsg = msgCtx.getResponseMessage();
                RegisterResponse result = service.register(param2);
                responseMsg.setParam(0, result);
            } catch (Throwable th) {
                handleServiceException(msgCtx, th);
            }
            return true;
        }
        else 
        if ("login".equals(operationName)) {
            LoginRequest param2 = ((LoginRequest) requestMsg.getParam(0));
            try {
                Message responseMsg = msgCtx.getResponseMessage();
                LoginResponse result = service.login(param2);
                responseMsg.setParam(0, result);
            } catch (Throwable th) {
                handleServiceException(msgCtx, th);
            }
            return true;
        }
        else 
        if ("logout".equals(operationName)) {
            LogoutRequest param2 = ((LogoutRequest) requestMsg.getParam(0));
            try {
                Message responseMsg = msgCtx.getResponseMessage();
                LogoutResponse result = service.logout(param2);
                responseMsg.setParam(0, result);
            } catch (Throwable th) {
                handleServiceException(msgCtx, th);
            }
            return true;
        }
        else 
        if ("getWalletData".equals(operationName)) {
            GetWalletDataRequest param2 = ((GetWalletDataRequest) requestMsg.getParam(0));
            try {
                Message responseMsg = msgCtx.getResponseMessage();
                GetWalletDataResponse result = service.getWalletData(param2);
                responseMsg.setParam(0, result);
            } catch (Throwable th) {
                handleServiceException(msgCtx, th);
            }
            return true;
        }
        else 
        if ("getAccountData".equals(operationName)) {
            GetAccountDataRequest param2 = ((GetAccountDataRequest) requestMsg.getParam(0));
            try {
                Message responseMsg = msgCtx.getResponseMessage();
                GetAccountDataResponse result = service.getAccountData(param2);
                responseMsg.setParam(0, result);
            } catch (Throwable th) {
                handleServiceException(msgCtx, th);
            }
            return true;
        }
        else 
        if ("updateWalletData".equals(operationName)) {
            UpdateWalletDataRequest param2 = ((UpdateWalletDataRequest) requestMsg.getParam(0));
            try {
                Message responseMsg = msgCtx.getResponseMessage();
                UpdateWalletDataResponse result = service.updateWalletData(param2);
                responseMsg.setParam(0, result);
            } catch (Throwable th) {
                handleServiceException(msgCtx, th);
            }
            return true;
        }
        else 
        if ("updateAccountProfile".equals(operationName)) {
            UpdateAccountProfileRequest param2 = ((UpdateAccountProfileRequest) requestMsg.getParam(0));
            try {
                Message responseMsg = msgCtx.getResponseMessage();
                UpdateAccountProfileResponse result = service.updateAccountProfile(param2);
                responseMsg.setParam(0, result);
            } catch (Throwable th) {
                handleServiceException(msgCtx, th);
            }
            return true;
        }
        else 
        if ("getAccountProfileData".equals(operationName)) {
            GetAccountProfileDataRequest param2 = ((GetAccountProfileDataRequest) requestMsg.getParam(0));
            try {
                Message responseMsg = msgCtx.getResponseMessage();
                GetAccountProfileDataResponse result = service.getAccountProfileData(param2);
                responseMsg.setParam(0, result);
            } catch (Throwable th) {
                handleServiceException(msgCtx, th);
            }
            return true;
        }
        return false;
    }

}
