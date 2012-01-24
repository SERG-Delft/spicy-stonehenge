package nl.tudelft.ewi.st.atlantis.tudelft.v1.services.exchangeservice.impl;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.math.BigDecimal;
import java.net.URL;

//import org.apache.commons.logging.Log;
//import org.apache.commons.logging.LogFactory;

import nl.tudelft.stocktrader.Wallet;
import nl.tudelft.stocktrader.dal.CustomerDAO;
import nl.tudelft.stocktrader.dal.DAOException;
import nl.tudelft.stocktrader.dal.DAOFactory;

import com.google.gson.Gson;

public class ExchangeServiceManager {
	
	  static {
		    //WORKAROUND. TO BE REMOVED.
		    javax.net.ssl.HttpsURLConnection.setDefaultHostnameVerifier(
		      new javax.net.ssl.HostnameVerifier(){
		        public boolean verify(String hostname, javax.net.ssl.SSLSession sslSession) {
		            return true;
		        }});
		      
		  }
		                    
			//private static final Log logger = LogFactory.getLog(ExchangeServiceManager.class);
	
//	private Wallet wallet = null;
	
	private DAOFactory factory = null;

	  public ExchangeServiceManager() {
			factory = DAOFactory.getFactory();
		}
	
	public boolean checkCurrency(String userID, String baseCurrency, String aimCurrency){
		boolean isCurrencyOK = false;
		if(!baseCurrency.equals(aimCurrency)){			
			Wallet wallet = new Wallet(userID);
			 if(wallet.checkCurrency(baseCurrency)&&wallet.checkCurrency(aimCurrency)){
				 isCurrencyOK = true;
			 }
		}
		 return isCurrencyOK;
	}
	
	public boolean checkAmount(String userID, String checkCurrency, BigDecimal checkAmount) throws DAOException{
		CustomerDAO customerDAO = factory.getCustomerDAO();
		Wallet wallet = customerDAO.getWallet(userID);
		BigDecimal currentAmount = wallet.getMoney(checkCurrency);
		int i = currentAmount.compareTo(checkAmount);
		if(i>=0)
			return true;
		else
			return false;			
	}
		
 	public BigDecimal exchangeCurrency(BigDecimal exchAmount, String baseCurrency, String aimCurrency) {
    	
    	String google = "http://www.google.com/ig/calculator?hl=en&q=";
	    BigDecimal result = null;
			
			try {
				
				URL url = new URL(google + exchAmount + baseCurrency + "%3D%3F" + aimCurrency);
			    Reader reader = new InputStreamReader(url.openStream());
			    nl.tudelft.ewi.st.atlantis.tudelft.v1.types.GsonResult res = new Gson().fromJson(reader, nl.tudelft.ewi.st.atlantis.tudelft.v1.types.GsonResult.class);
			    
			    String money = res.getRhs().replaceAll(new String(new byte[]{-96}), "");
			    result = new BigDecimal(money.split(" ")[0]);
			    if(!(money.contains("million")||money.contains("billion")||money.contains("trillion")))
			    	return result;
			    else if(money.contains("million")){
			    	return result = BigDecimal.valueOf(1000000).multiply(result);
			    }else if(money.contains("billion")){
			    	return result = BigDecimal.valueOf(1000000000).multiply(result);
			    }
//			    else if(money.contains("trillion")){
//			    	return result = BigDecimal.valueOf(1000000000000).multiply(result);
//			    }
			} catch (IOException e) {
				e.printStackTrace();
			}
			return result;
		}

	public Wallet updateWallet(String userID, String fromCurrency, String toCurrency, BigDecimal fromAmount, BigDecimal toAmount) throws DAOException{
		CustomerDAO customerDAO = factory.getCustomerDAO();
		Wallet wallet = customerDAO.getWallet(userID);
		wallet.setMoney(fromCurrency, wallet.getMoney(fromCurrency).subtract(fromAmount));
		wallet.setMoney(toCurrency, wallet.getMoney(toCurrency).add(toAmount));
		customerDAO.updateWallet(wallet);	
		return wallet;
	}

}
