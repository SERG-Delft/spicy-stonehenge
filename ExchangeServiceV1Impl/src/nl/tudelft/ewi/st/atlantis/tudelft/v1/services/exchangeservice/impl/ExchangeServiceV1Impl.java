
package nl.tudelft.ewi.st.atlantis.tudelft.v1.services.exchangeservice.impl;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.URL;

import com.google.gson.Gson;

import nl.tudelft.ewi.st.atlantis.tudelft.v1.services.ExchangeCurrencyRequest;
import nl.tudelft.ewi.st.atlantis.tudelft.v1.services.ExchangeCurrencyResponse;
import nl.tudelft.ewi.st.atlantis.tudelft.v1.services.exchangeservice.ExchangeServiceV1;
import nl.tudelft.ewi.st.atlantis.tudelft.v1.types.GsonResult;

public class ExchangeServiceV1Impl
    implements ExchangeServiceV1
{


    public ExchangeCurrencyResponse exchangeCurrency(ExchangeCurrencyRequest exchangeCurrency) {
    	
    	String google = "http://www.google.com/ig/calculator?hl=en&q=";
	    String charset = "UTF-8";
	    String result = null;
			
			try {
				
				URL url = new URL(google + exchangeCurrency.getExchAmount() 
						+ exchangeCurrency.getBaseCurrency() + "%3D%3F" + exchangeCurrency.getAimCurrency());
			    Reader reader = new InputStreamReader(url.openStream(), charset);
			    GsonResult res = new Gson().fromJson(reader, GsonResult.class);
			    // Get the value without the term currency.
			    result = res.getRhs().split("\\s+")[0];
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
    		
		ExchangeCurrencyResponse response = new ExchangeCurrencyResponse();
		response.setExchResult(result);		
		
		return response;
    }

}
