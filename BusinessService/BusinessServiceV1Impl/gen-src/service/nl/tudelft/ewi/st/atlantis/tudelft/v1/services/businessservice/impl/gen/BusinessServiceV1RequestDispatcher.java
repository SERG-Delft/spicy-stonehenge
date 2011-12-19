
package nl.tudelft.ewi.st.atlantis.tudelft.v1.services.businessservice.impl.gen;

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
import nl.tudelft.ewi.st.atlantis.tudelft.v1.services.businessservice.BusinessServiceV1;
import org.ebayopensource.turmeric.runtime.common.exceptions.ServiceException;
import org.ebayopensource.turmeric.runtime.common.pipeline.Message;
import org.ebayopensource.turmeric.runtime.common.pipeline.MessageContext;
import org.ebayopensource.turmeric.runtime.spf.impl.internal.pipeline.BaseServiceRequestDispatcher;


/**
 * Note : Generated file, any changes will be lost upon regeneration.
 * 
 */
public class BusinessServiceV1RequestDispatcher
    extends BaseServiceRequestDispatcher<BusinessServiceV1>
{


    public BusinessServiceV1RequestDispatcher() {
        super(BusinessServiceV1 .class);
        addSupportedOperation("register", new Class[] {RegisterRequest.class }, new Class[] {RegisterResponse.class });
        addSupportedOperation("login", new Class[] {LoginRequest.class }, new Class[] {LoginResponse.class });
        addSupportedOperation("logout", new Class[] {LogoutRequest.class }, new Class[] {LogoutResponse.class });
        addSupportedOperation("getQuote", new Class[] {GetQuoteRequest.class }, new Class[] {GetQuoteResponse.class });
        addSupportedOperation("getMarketSummary", new Class[] {GetMarketSummaryRequest.class }, new Class[] {GetMarketSummaryResponse.class });
        addSupportedOperation("buy", new Class[] {BuyRequest.class }, new Class[] {BuyResponse.class });
        addSupportedOperation("getAccountData", new Class[] {GetAccountDataRequest.class }, new Class[] {GetAccountDataResponse.class });
        addSupportedOperation("getHolding", new Class[] {GetHoldingRequest.class }, new Class[] {GetHoldingResponse.class });
        addSupportedOperation("updateWalletData", new Class[] {UpdateWalletDataRequest.class }, new Class[] {UpdateWalletDataResponse.class });
        addSupportedOperation("sellEnhanced", new Class[] {SellEnhancedRequest.class }, new Class[] {SellEnhancedResponse.class });
        addSupportedOperation("updateAccountProfile", new Class[] {UpdateAccountProfileRequest.class }, new Class[] {UpdateAccountProfileResponse.class });
        addSupportedOperation("getTopOrders", new Class[] {GetTopOrdersRequest.class }, new Class[] {GetTopOrdersResponse.class });
        addSupportedOperation("getAccountProfileData", new Class[] {GetAccountProfileDataRequest.class }, new Class[] {GetAccountProfileDataResponse.class });
        addSupportedOperation("getAllQuotes", new Class[] {GetAllQuotesRequest.class }, new Class[] {GetAllQuotesResponse.class });
        addSupportedOperation("sell", new Class[] {SellRequest.class }, new Class[] {SellResponse.class });
        addSupportedOperation("getOrders", new Class[] {GetOrdersRequest.class }, new Class[] {GetOrdersResponse.class });
        addSupportedOperation("getHoldings", new Class[] {GetHoldingsRequest.class }, new Class[] {GetHoldingsResponse.class });
        addSupportedOperation("getWalletData", new Class[] {GetWalletDataRequest.class }, new Class[] {GetWalletDataResponse.class });
        addSupportedOperation("getClosedOrders", new Class[] {GetClosedOrdersRequest.class }, new Class[] {GetClosedOrdersResponse.class });
    }

    public boolean dispatch(MessageContext param0, BusinessServiceV1 param1)
        throws ServiceException
    {
        MessageContext msgCtx = param0;
        BusinessServiceV1 service = param1;
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
        if ("getQuote".equals(operationName)) {
            GetQuoteRequest param2 = ((GetQuoteRequest) requestMsg.getParam(0));
            try {
                Message responseMsg = msgCtx.getResponseMessage();
                GetQuoteResponse result = service.getQuote(param2);
                responseMsg.setParam(0, result);
            } catch (Throwable th) {
                handleServiceException(msgCtx, th);
            }
            return true;
        }
        else 
        if ("getMarketSummary".equals(operationName)) {
            GetMarketSummaryRequest param2 = ((GetMarketSummaryRequest) requestMsg.getParam(0));
            try {
                Message responseMsg = msgCtx.getResponseMessage();
                GetMarketSummaryResponse result = service.getMarketSummary(param2);
                responseMsg.setParam(0, result);
            } catch (Throwable th) {
                handleServiceException(msgCtx, th);
            }
            return true;
        }
        else 
        if ("buy".equals(operationName)) {
            BuyRequest param2 = ((BuyRequest) requestMsg.getParam(0));
            try {
                Message responseMsg = msgCtx.getResponseMessage();
                BuyResponse result = service.buy(param2);
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
        if ("getHolding".equals(operationName)) {
            GetHoldingRequest param2 = ((GetHoldingRequest) requestMsg.getParam(0));
            try {
                Message responseMsg = msgCtx.getResponseMessage();
                GetHoldingResponse result = service.getHolding(param2);
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
        if ("sellEnhanced".equals(operationName)) {
            SellEnhancedRequest param2 = ((SellEnhancedRequest) requestMsg.getParam(0));
            try {
                Message responseMsg = msgCtx.getResponseMessage();
                SellEnhancedResponse result = service.sellEnhanced(param2);
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
        if ("getTopOrders".equals(operationName)) {
            GetTopOrdersRequest param2 = ((GetTopOrdersRequest) requestMsg.getParam(0));
            try {
                Message responseMsg = msgCtx.getResponseMessage();
                GetTopOrdersResponse result = service.getTopOrders(param2);
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
        else 
        if ("getAllQuotes".equals(operationName)) {
            GetAllQuotesRequest param2 = ((GetAllQuotesRequest) requestMsg.getParam(0));
            try {
                Message responseMsg = msgCtx.getResponseMessage();
                GetAllQuotesResponse result = service.getAllQuotes(param2);
                responseMsg.setParam(0, result);
            } catch (Throwable th) {
                handleServiceException(msgCtx, th);
            }
            return true;
        }
        else 
        if ("sell".equals(operationName)) {
            SellRequest param2 = ((SellRequest) requestMsg.getParam(0));
            try {
                Message responseMsg = msgCtx.getResponseMessage();
                SellResponse result = service.sell(param2);
                responseMsg.setParam(0, result);
            } catch (Throwable th) {
                handleServiceException(msgCtx, th);
            }
            return true;
        }
        else 
        if ("getOrders".equals(operationName)) {
            GetOrdersRequest param2 = ((GetOrdersRequest) requestMsg.getParam(0));
            try {
                Message responseMsg = msgCtx.getResponseMessage();
                GetOrdersResponse result = service.getOrders(param2);
                responseMsg.setParam(0, result);
            } catch (Throwable th) {
                handleServiceException(msgCtx, th);
            }
            return true;
        }
        else 
        if ("getHoldings".equals(operationName)) {
            GetHoldingsRequest param2 = ((GetHoldingsRequest) requestMsg.getParam(0));
            try {
                Message responseMsg = msgCtx.getResponseMessage();
                GetHoldingsResponse result = service.getHoldings(param2);
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
        if ("getClosedOrders".equals(operationName)) {
            GetClosedOrdersRequest param2 = ((GetClosedOrdersRequest) requestMsg.getParam(0));
            try {
                Message responseMsg = msgCtx.getResponseMessage();
                GetClosedOrdersResponse result = service.getClosedOrders(param2);
                responseMsg.setParam(0, result);
            } catch (Throwable th) {
                handleServiceException(msgCtx, th);
            }
            return true;
        }
        return false;
    }

}
