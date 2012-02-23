package nl.tudelft.ewi.st.atlantis.tudelft.util;

import java.util.ArrayList;
import java.util.List;

import nl.tudelft.ewi.st.atlantis.tudelft.v1.types.GetBSConfigResponse;
import nl.tudelft.ewi.st.atlantis.tudelft.v1.types.GetClientConfigResponse;
import nl.tudelft.ewi.st.atlantis.tudelft.v1.types.GetOPSConfigResponse;
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
	
	public static List<nl.tudelft.ewi.st.atlantis.tudelft.v1.types.ServiceLocation> toRemoteServiceLocationList(List<nl.tudelft.stocktrader.dal.configservice.ServiceLocation> locations) {
		List<nl.tudelft.ewi.st.atlantis.tudelft.v1.types.ServiceLocation> remote = new ArrayList<nl.tudelft.ewi.st.atlantis.tudelft.v1.types.ServiceLocation>();
		
		for(nl.tudelft.stocktrader.dal.configservice.ServiceLocation l : locations) {
			remote.add(toRemoteServiceLocation(l));
		}
		
		return remote;
	}
	
	public static nl.tudelft.ewi.st.atlantis.tudelft.v1.types.ServiceLocation toRemoteServiceLocation(nl.tudelft.stocktrader.dal.configservice.ServiceLocation location) {
		nl.tudelft.ewi.st.atlantis.tudelft.v1.types.ServiceLocation remote = new nl.tudelft.ewi.st.atlantis.tudelft.v1.types.ServiceLocation();
		
		remote.setSec(location.isSec());
		remote.setServiceName(location.getServiceName());
		remote.setServiceURL(location.getServiceURL());
		
		return remote;
	}
}
