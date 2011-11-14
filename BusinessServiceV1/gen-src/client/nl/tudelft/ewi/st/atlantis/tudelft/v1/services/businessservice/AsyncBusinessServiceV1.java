
package nl.tudelft.ewi.st.atlantis.tudelft.v1.services.businessservice;

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

public interface AsyncBusinessServiceV1
    extends BusinessServiceV1
{


    public Future<?> registerAsync(RegisterRequest param0, AsyncHandler<RegisterResponse> handler);

    public Response<RegisterResponse> registerAsync(RegisterRequest param0);

    public Future<?> loginAsync(LoginRequest param0, AsyncHandler<LoginResponse> handler);

    public Response<LoginResponse> loginAsync(LoginRequest param0);

    public Future<?> logoutAsync(LogoutRequest param0, AsyncHandler<LogoutResponse> handler);

    public Response<LogoutResponse> logoutAsync(LogoutRequest param0);

    public Future<?> updateWalletDataAsync(UpdateWalletDataRequest param0, AsyncHandler<UpdateWalletDataResponse> handler);

    public Response<UpdateWalletDataResponse> updateWalletDataAsync(UpdateWalletDataRequest param0);

    public Future<?> getWalletDataAsync(GetWalletDataRequest param0, AsyncHandler<GetWalletDataResponse> handler);

    public Response<GetWalletDataResponse> getWalletDataAsync(GetWalletDataRequest param0);

    public Future<?> getQuoteAsync(GetQuoteRequest param0, AsyncHandler<GetQuoteResponse> handler);

    public Response<GetQuoteResponse> getQuoteAsync(GetQuoteRequest param0);

    public Future<?> getMarketSummaryAsync(GetMarketSummaryRequest param0, AsyncHandler<GetMarketSummaryResponse> handler);

    public Response<GetMarketSummaryResponse> getMarketSummaryAsync(GetMarketSummaryRequest param0);

    public Future<?> buyAsync(BuyRequest param0, AsyncHandler<BuyResponse> handler);

    public Response<BuyResponse> buyAsync(BuyRequest param0);

    public Future<?> getAccountDataAsync(GetAccountDataRequest param0, AsyncHandler<GetAccountDataResponse> handler);

    public Response<GetAccountDataResponse> getAccountDataAsync(GetAccountDataRequest param0);

    public Future<?> getHoldingAsync(GetHoldingRequest param0, AsyncHandler<GetHoldingResponse> handler);

    public Response<GetHoldingResponse> getHoldingAsync(GetHoldingRequest param0);

    public Future<?> sellEnhancedAsync(SellEnhancedRequest param0, AsyncHandler<SellEnhancedResponse> handler);

    public Response<SellEnhancedResponse> sellEnhancedAsync(SellEnhancedRequest param0);

    public Future<?> updateAccountProfileAsync(UpdateAccountProfileRequest param0, AsyncHandler<UpdateAccountProfileResponse> handler);

    public Response<UpdateAccountProfileResponse> updateAccountProfileAsync(UpdateAccountProfileRequest param0);

    public Future<?> getTopOrdersAsync(GetTopOrdersRequest param0, AsyncHandler<GetTopOrdersResponse> handler);

    public Response<GetTopOrdersResponse> getTopOrdersAsync(GetTopOrdersRequest param0);

    public Future<?> getAccountProfileDataAsync(GetAccountProfileDataRequest param0, AsyncHandler<GetAccountProfileDataResponse> handler);

    public Response<GetAccountProfileDataResponse> getAccountProfileDataAsync(GetAccountProfileDataRequest param0);

    public Future<?> getAllQuotesAsync(GetAllQuotesRequest param0, AsyncHandler<GetAllQuotesResponse> handler);

    public Response<GetAllQuotesResponse> getAllQuotesAsync(GetAllQuotesRequest param0);

    public Future<?> sellAsync(SellRequest param0, AsyncHandler<SellResponse> handler);

    public Response<SellResponse> sellAsync(SellRequest param0);

    public Future<?> getOrdersAsync(GetOrdersRequest param0, AsyncHandler<GetOrdersResponse> handler);

    public Response<GetOrdersResponse> getOrdersAsync(GetOrdersRequest param0);

    public Future<?> getHoldingsAsync(GetHoldingsRequest param0, AsyncHandler<GetHoldingsResponse> handler);

    public Response<GetHoldingsResponse> getHoldingsAsync(GetHoldingsRequest param0);

    public Future<?> getClosedOrdersAsync(GetClosedOrdersRequest param0, AsyncHandler<GetClosedOrdersResponse> handler);

    public Response<GetClosedOrdersResponse> getClosedOrdersAsync(GetClosedOrdersRequest param0);

    public List<Response<?>> poll(boolean block, boolean partial)
        throws InterruptedException
    ;

}
