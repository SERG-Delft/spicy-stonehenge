package nl.tudelft.ewi.st.atlantis.tudelft.util;

import java.math.BigDecimal;
import java.util.Calendar;

import nl.tudelft.ewi.st.atlantis.tudelft.v1.services.GetBSConfigResponse;
import nl.tudelft.ewi.st.atlantis.tudelft.v1.services.GetClientConfigResponse;
import nl.tudelft.stocktrader.dal.configservice.BSConfig;
import nl.tudelft.stocktrader.dal.configservice.ClientConfig;


public class TypeFactory {
	public static GetClientConfigResponse toGetClientConfigResponse(ClientConfig data) {
		GetClientConfigResponse response = new GetClientConfigResponse();
		response.setBS(data.getBS());
		response.setBSName(data.getBSName());
		response.setSec(data.isSec());
		
		return response;
	}
	
	public static GetBSConfigResponse toGetBSConfigResponse(BSConfig data) {
		GetBSConfigResponse response = new GetBSConfigResponse();
		response.setDBHostName(data.getDBHostName());
		response.setDBName(data.getDBName());
		response.setDBPort(data.getDBPort());
		response.setOPS(data.getOPS());
		
		
		return response;
	}
}
