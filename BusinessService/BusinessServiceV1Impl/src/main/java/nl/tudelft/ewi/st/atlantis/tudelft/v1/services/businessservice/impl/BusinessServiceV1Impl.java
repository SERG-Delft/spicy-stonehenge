
package nl.tudelft.ewi.st.atlantis.tudelft.v1.services.businessservice.impl;

import java.math.BigDecimal;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import nl.tudelft.ewi.st.atlantis.tudelft.intf.BusinessServiceV1;
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
import nl.tudelft.stocktrader.Account;
import nl.tudelft.stocktrader.AccountProfile;
import nl.tudelft.stocktrader.Holding;
import nl.tudelft.stocktrader.MarketSummary;
import nl.tudelft.stocktrader.Order;
import nl.tudelft.stocktrader.Quote;
import nl.tudelft.stocktrader.TypeFactory;
import nl.tudelft.stocktrader.Wallet;
import nl.tudelft.stocktrader.dal.DAOException;

public class BusinessServiceV1Impl
    implements BusinessServiceV1
{

	private final TraderServiceManager mgr = new TraderServiceManager();
	private static final Log logger = LogFactory.getLog(BusinessServiceV1Impl.class);
	
    public GetQuoteResponse getQuote(GetQuoteRequest request) {
    	Quote q = null;
    	
    	try {
			q = mgr.getQuote(request.getSymbol());
		} catch (DAOException e) {
			logger.debug("", e);
		}
    	
		GetQuoteResponse response = new GetQuoteResponse();
		response.setQuoteData(TypeFactory.toQuoteData(q));
		
		return response;
    }

    public GetMarketSummaryResponse getMarketSummary(GetMarketSummaryRequest param0) {
    	MarketSummary summary = null;
    	
    	try {
			summary = mgr.getMarketSummary();
		} catch (DAOException e) {
			logger.debug("", e);
		}
    	
    	GetMarketSummaryResponse response = new GetMarketSummaryResponse();
    	response.setMarketSummaryData(TypeFactory.toMarketSummaryData(summary));
    	
    	return response;
    }

    public BuyResponse buy(BuyRequest request) {
    	Order o = null;
    	
    	try {
			o = mgr.buy(request.getUserID(), request.getSymbol(), request.getQuantity());
		} catch (DAOException e) {
			logger.debug("", e);
		}
    	
    	BuyResponse response = new BuyResponse();
    	response.setOrderData(TypeFactory.toOrderData(o));
    	
    	return response;
    }

    public GetAccountDataResponse getAccountData(GetAccountDataRequest request) {
    	Account a = null;
    	try {
			a = mgr.getAccountData(request.getUserID());
		} catch (DAOException e) {
			logger.debug("", e);
		}
		
		GetAccountDataResponse response = new GetAccountDataResponse();
		response.setAccountData(TypeFactory.toAccountData(a));
	 
		return response;
    }

    public GetHoldingResponse getHolding(GetHoldingRequest request) {
        Holding h = null;
        try {
			h = mgr.getHolding(request.getUserID(),request.getHoldingID());
		} catch (DAOException e) {
			logger.debug("", e);
		}
		
		GetHoldingResponse response = new GetHoldingResponse();
		response.setHoldingData(TypeFactory.toHoldingData(h));
		
		return response;
    }

    public SellEnhancedResponse sellEnhanced(SellEnhancedRequest request) {
    	Order o = null;
    	try {
			o = mgr.sellEnhanced(request.getUserID(),
							request.getHoldingID(), request.getQuantity());
		} catch (DAOException e) {
			logger.debug("", e);
		}

		SellEnhancedResponse response = new SellEnhancedResponse();
		
		response.setOrderData(TypeFactory.toOrderData(o));
		
		return response;
    }

    public UpdateAccountProfileResponse updateAccountProfile(UpdateAccountProfileRequest request) {
    	AccountProfile accProfile = null;
    	
    	try {
			accProfile = mgr.updateAccountProfile(
							TypeFactory.toAccountProfile(request.getAccountProfileData()));
		} catch (DAOException e) {
			logger.debug("", e);
		}
    	
		UpdateAccountProfileResponse response = new UpdateAccountProfileResponse();
		
		response.setAccountProfileData(TypeFactory.toAccountProfileData(accProfile));
		
		return response;
    }

    public GetTopOrdersResponse getTopOrders(GetTopOrdersRequest request) {
        List<Order> topOrders = null;
        
        try {
			topOrders = mgr.getTopOrders(request.getUserID());
		} catch (DAOException e) {
			logger.debug("", e);
		}
		
		GetTopOrdersResponse response = new GetTopOrdersResponse();
		response.getOrderData().addAll(TypeFactory.toListOrderData(topOrders));
		
		return response;
    }

    public GetAccountProfileDataResponse getAccountProfileData(GetAccountProfileDataRequest request) {
    	AccountProfile ap = null;
        
    	try {
			ap = mgr.getAccountProfileData(request.getUserID());
		} catch (DAOException e) {
			logger.debug("", e);
		}
		
		GetAccountProfileDataResponse response = new GetAccountProfileDataResponse();
		response.setAccountProfileData(TypeFactory.toAccountProfileData(ap));
		
		return response;
	}

    public SellResponse sell(SellRequest request) {
    	Order o = null;
    	
    	try {
			o = mgr.sell(request.getUserID(), request.getHoldingID(),
					request.getOrderProcessingMode());
		} catch (DAOException e) {
			logger.debug("", e);
		}
    	
    	SellResponse response = new SellResponse();
    	response.setOrderData(TypeFactory.toOrderData(o));
    	
    	return response;
    }

    public GetOrdersResponse getOrders(GetOrdersRequest request) {
    	List<Order> orders = null;
    	
    	try {
			orders = mgr.getOrders(request.getUserID());
		} catch (DAOException e) {
			logger.debug("", e);
		}
		
		GetOrdersResponse response = new GetOrdersResponse();
		response.getOrderData().addAll(TypeFactory.toListOrderData(orders));
		
		return response;
    }

    public GetHoldingsResponse getHoldings(GetHoldingsRequest request) {
    	List<Holding> holdings = null;
    	
    	try {
			holdings = mgr.getHoldings(request.getUserID());
		} catch (DAOException e) {
			logger.debug("", e);
		}
		
		GetHoldingsResponse response = new GetHoldingsResponse();
		response.getHoldingData().addAll(TypeFactory.toListHoldingData(holdings));
		
		return response;
    }

    public GetClosedOrdersResponse getClosedOrders(GetClosedOrdersRequest request) {
        List<Order> orders = null;
        
        try {
			orders = mgr.getCompletedOrders(request.getUserID());
		} catch (DAOException e) {
			logger.debug("", e);
		}
		
		GetClosedOrdersResponse response = new GetClosedOrdersResponse();
		response.getOrderData().addAll(TypeFactory.toListOrderData(orders));
		
		return response;
    }

	public LogoutResponse logout(LogoutRequest logoutRequest) {
		try {
			mgr.logout(logoutRequest.getUserID());
		} catch (DAOException e) {
			logger.debug("", e);
		}
		
		LogoutResponse response = new LogoutResponse();
		
		return response;
	}

	public LoginResponse login(LoginRequest loginRequest) {
		Account a = null;
		try {
			a = mgr.login(loginRequest.getUserID(), loginRequest.getPassword());
		} catch (DAOException e) {
			logger.debug("", e);
		}
		
		LoginResponse response = new LoginResponse();
		response.setAccount(TypeFactory.toAccountData(a));
		
		return response;
	}

	public GetAllQuotesResponse getAllQuotes(GetAllQuotesRequest getAllQuotesRequest) {
		List<Quote> quotes = null;
		try {
			quotes = mgr.getAllQuotes();
		} catch (DAOException e) {
			logger.debug("",e);
		}
		
		GetAllQuotesResponse response = new GetAllQuotesResponse();
		response.getQuotes().addAll(TypeFactory.toListQuoteData(quotes));

		return response;
	}

	@Override
	public RegisterResponse register(RegisterRequest registerRequest) {
		// TODO Auto-generated method stub
		String registerResult = null;
		
		try {
			registerResult = mgr.register(registerRequest.getUserID(), registerRequest.getPassword(), 
					registerRequest.getFullname(), registerRequest.getAddress(), 
					registerRequest.getEmail(), registerRequest.getCreditcard(), 
					BigDecimal.valueOf(registerRequest.getOpenBalance()), registerRequest.getCurrencyType());
		} catch (DAOException e) {
			logger.debug("", e);
		}
		RegisterResponse response = new RegisterResponse();
		response.setOut(registerResult);
		
		return response;
	}

	@Override
	public GetWalletDataResponse getWalletData(GetWalletDataRequest getWalletRequest) {
		Wallet wallet = null;
    	try {
			wallet = mgr.getWallet(getWalletRequest.getUserID());
		} catch (DAOException e) {
			logger.debug("", e);
		}
		
		GetWalletDataResponse response = new GetWalletDataResponse();
		response.setWalletData(TypeFactory.toWalletData(wallet));
		
		return response;
	}


	@Override
	public UpdateWalletDataResponse updateWalletData(
			UpdateWalletDataRequest updateWalletDataRequest) {
		Wallet wallet = null;
    	try {
			wallet = mgr.updateWallet(
					TypeFactory.toWallet(updateWalletDataRequest.getWalletData()));
			
		} catch (DAOException e) {
			logger.debug("", e);
		}
		
		UpdateWalletDataResponse response = new UpdateWalletDataResponse();
		response.setNewWalletData(TypeFactory.toWalletData(wallet));
		
		return response;
	}

}
