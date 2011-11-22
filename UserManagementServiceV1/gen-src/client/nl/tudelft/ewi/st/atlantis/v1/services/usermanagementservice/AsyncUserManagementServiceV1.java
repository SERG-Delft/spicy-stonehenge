
package nl.tudelft.ewi.st.atlantis.v1.services.usermanagementservice;

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

public interface AsyncUserManagementServiceV1
    extends UserManagementServiceV1
{


    public Future<?> registerAsync(RegisterRequest param0, AsyncHandler<RegisterResponse> handler);

    public Response<RegisterResponse> registerAsync(RegisterRequest param0);

    public Future<?> loginAsync(LoginRequest param0, AsyncHandler<LoginResponse> handler);

    public Response<LoginResponse> loginAsync(LoginRequest param0);

    public Future<?> logoutAsync(LogoutRequest param0, AsyncHandler<LogoutResponse> handler);

    public Response<LogoutResponse> logoutAsync(LogoutRequest param0);

    public Future<?> getWalletDataAsync(GetWalletDataRequest param0, AsyncHandler<GetWalletDataResponse> handler);

    public Response<GetWalletDataResponse> getWalletDataAsync(GetWalletDataRequest param0);

    public Future<?> getAccountDataAsync(GetAccountDataRequest param0, AsyncHandler<GetAccountDataResponse> handler);

    public Response<GetAccountDataResponse> getAccountDataAsync(GetAccountDataRequest param0);

    public Future<?> updateWalletDataAsync(UpdateWalletDataRequest param0, AsyncHandler<UpdateWalletDataResponse> handler);

    public Response<UpdateWalletDataResponse> updateWalletDataAsync(UpdateWalletDataRequest param0);

    public Future<?> updateAccountProfileAsync(UpdateAccountProfileRequest param0, AsyncHandler<UpdateAccountProfileResponse> handler);

    public Response<UpdateAccountProfileResponse> updateAccountProfileAsync(UpdateAccountProfileRequest param0);

    public Future<?> getAccountProfileDataAsync(GetAccountProfileDataRequest param0, AsyncHandler<GetAccountProfileDataResponse> handler);

    public Response<GetAccountProfileDataResponse> getAccountProfileDataAsync(GetAccountProfileDataRequest param0);

    public List<Response<?>> poll(boolean block, boolean partial)
        throws InterruptedException
    ;

}
