package nl.tudelft.ewi.st.atlantis.tudelft.util;

import nl.tudelft.ewi.st.atlantis.tudelft.v1.services.GetBSConfigResponse;
import nl.tudelft.ewi.st.atlantis.tudelft.v1.services.GetClientConfigResponse;
import nl.tudelft.ewi.st.atlantis.tudelft.v1.services.GetOPSConfigResponse;
import nl.tudelft.stocktrader.dal.configservice.BSConfig;
import nl.tudelft.stocktrader.dal.configservice.ClientConfig;
import nl.tudelft.stocktrader.dal.configservice.OPSConfig;


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
		response.setOPSName(data.getOPSName());
		response.setSec(data.isSec());
		
		return response;
	}
	
	public static GetOPSConfigResponse toGetOPSConfigResponse(OPSConfig data) {
		GetOPSConfigResponse response = new GetOPSConfigResponse();
		response.setDBHostName(data.getDBHostName());
		response.setDBName(data.getDBName());
		response.setDBPort(data.getDBPort());
		
		return response;
	}
}
