
package nl.tudelft.ewi.st.atlantis.tudelft.v1.services.exchangeservice.impl;

import java.math.BigDecimal;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import nl.tudelft.ewi.st.atlantis.tudelft.intf.ExchangeServiceV1;
import nl.tudelft.ewi.st.atlantis.tudelft.v1.services.CheckAmountRequest;
import nl.tudelft.ewi.st.atlantis.tudelft.v1.services.CheckAmountResponse;
import nl.tudelft.ewi.st.atlantis.tudelft.v1.services.CheckCurrencyRequest;
import nl.tudelft.ewi.st.atlantis.tudelft.v1.services.CheckCurrencyResponse;
import nl.tudelft.ewi.st.atlantis.tudelft.v1.services.ExchangeCurrencyRequest;
import nl.tudelft.ewi.st.atlantis.tudelft.v1.services.ExchangeCurrencyResponse;
import nl.tudelft.ewi.st.atlantis.tudelft.v1.services.UpdateWalletDataRequest;
import nl.tudelft.ewi.st.atlantis.tudelft.v1.services.UpdateWalletDataResponse;
import nl.tudelft.stocktrader.TypeFactory;
import nl.tudelft.stocktrader.Wallet;
import nl.tudelft.stocktrader.dal.DAOException;


public class ExchangeServiceV1Impl
    implements ExchangeServiceV1
{
	private final ExchangeServiceManager mgr = new ExchangeServiceManager();
	private static final Log logger = LogFactory.getLog(ExchangeServiceV1Impl.class);

	@Override
	public UpdateWalletDataResponse updateWalletData(
			UpdateWalletDataRequest updateWalletDataRequest) {
		Wallet wallet = null;
		try {
			wallet = mgr.updateWallet(updateWalletDataRequest.getUserID(), 
					updateWalletDataRequest.getFromCurrency(), 
					updateWalletDataRequest.getToCurrency(), 
					BigDecimal.valueOf(updateWalletDataRequest.getFromAmount()), 
					BigDecimal.valueOf(updateWalletDataRequest.getToAmount()));
		} catch (DAOException e) {
			logger.debug("", e);
		}
		UpdateWalletDataResponse response = new UpdateWalletDataResponse();
		response.setWalletData(TypeFactory.toWalletData(wallet));
		
		return response;
	}

	@Override
	public ExchangeCurrencyResponse exchangeCurrency(
			ExchangeCurrencyRequest exchangeCurrencyRequest) {
		
	    BigDecimal result = mgr.exchangeCurrency(BigDecimal.valueOf(exchangeCurrencyRequest.getExchAmount()), 
	    		exchangeCurrencyRequest.getBaseCurrency(), 
	    		exchangeCurrencyRequest.getAimCurrency());

	    ExchangeCurrencyResponse response = new ExchangeCurrencyResponse();
		response.setExchResult(result.doubleValue());		
		
		return response;
	}

	@Override
	public CheckCurrencyResponse checkCurrency(
			CheckCurrencyRequest checkCurrencyRequest) {
		boolean result = mgr.checkCurrency(checkCurrencyRequest.getUserID(), 
					checkCurrencyRequest.getBaseCurrency(), checkCurrencyRequest.getAimCurrency());
		
		CheckCurrencyResponse response = new CheckCurrencyResponse();
		response.setCurrencyExist(result);
		return response;
	}

	@Override
	public CheckAmountResponse checkAmount(CheckAmountRequest checkAmountRequest) {
		// TODO Auto-generated method stub
		boolean result = false;
		try {
			result = mgr.checkAmount(checkAmountRequest.getUserID(), 
					checkAmountRequest.getCurrencyType(), 
					BigDecimal.valueOf(checkAmountRequest.getCheckAmount()));			
		} catch (DAOException e) {
			logger.debug("", e);
		}
		
		CheckAmountResponse response = new CheckAmountResponse();
		response.setAmountEnough(result);
		return response;
	}

}
