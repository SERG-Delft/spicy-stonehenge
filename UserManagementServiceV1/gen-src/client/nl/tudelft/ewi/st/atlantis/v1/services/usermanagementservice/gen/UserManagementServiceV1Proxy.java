
package nl.tudelft.ewi.st.atlantis.v1.services.usermanagementservice.gen;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Future;
import javax.xml.ws.AsyncHandler;
import javax.xml.ws.Dispatch;
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
import org.ebayopensource.turmeric.runtime.common.exceptions.ServiceInvocationException;
import org.ebayopensource.turmeric.runtime.sif.impl.internal.service.BaseServiceProxy;
import org.ebayopensource.turmeric.runtime.sif.service.Service;


/**
 * Note : Generated file, any changes will be lost upon regeneration.
 * 
 */
public class UserManagementServiceV1Proxy
    extends BaseServiceProxy<AsyncUserManagementServiceV1>
    implements AsyncUserManagementServiceV1
{


    public UserManagementServiceV1Proxy(Service service) {
        super(service);
    }

    public List<Response<?>> poll(boolean block, boolean partial)
        throws InterruptedException
    {
        return m_service.poll(block, partial);
    }

    public Response<RegisterResponse> registerAsync(RegisterRequest param0) {
        Dispatch dispatch = m_service.createDispatch("register");
        Response<RegisterResponse> result = dispatch.invokeAsync(param0);
        return result;
    }

    public Future<?> registerAsync(RegisterRequest param0, AsyncHandler<RegisterResponse> param1) {
        Dispatch dispatch = m_service.createDispatch("register");
        Future<?> result = dispatch.invokeAsync(param0, param1);
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

    public Future<?> updateAccountProfileAsync(UpdateAccountProfileRequest param0, AsyncHandler<UpdateAccountProfileResponse> param1) {
        Dispatch dispatch = m_service.createDispatch("updateAccountProfile");
        Future<?> result = dispatch.invokeAsync(param0, param1);
        return result;
    }

    public Response<UpdateAccountProfileResponse> updateAccountProfileAsync(UpdateAccountProfileRequest param0) {
        Dispatch dispatch = m_service.createDispatch("updateAccountProfile");
        Response<UpdateAccountProfileResponse> result = dispatch.invokeAsync(param0);
        return result;
    }

    public Future<?> getAccountProfileDataAsync(GetAccountProfileDataRequest param0, AsyncHandler<GetAccountProfileDataResponse> param1) {
        Dispatch dispatch = m_service.createDispatch("getAccountProfileData");
        Future<?> result = dispatch.invokeAsync(param0, param1);
        return result;
    }

    public Response<GetAccountProfileDataResponse> getAccountProfileDataAsync(GetAccountProfileDataRequest param0) {
        Dispatch dispatch = m_service.createDispatch("getAccountProfileData");
        Response<GetAccountProfileDataResponse> result = dispatch.invokeAsync(param0);
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

}
