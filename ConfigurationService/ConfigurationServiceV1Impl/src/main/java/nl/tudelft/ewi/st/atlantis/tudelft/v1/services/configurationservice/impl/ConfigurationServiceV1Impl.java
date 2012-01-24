
package nl.tudelft.ewi.st.atlantis.tudelft.v1.services.configurationservice.impl;

import nl.tudelft.ewi.st.atlantis.tudelft.intf.ConfigurationServiceV1;
import nl.tudelft.ewi.st.atlantis.tudelft.util.TypeFactory;
import nl.tudelft.ewi.st.atlantis.tudelft.v1.types.GetBSConfigRequest;
import nl.tudelft.ewi.st.atlantis.tudelft.v1.types.GetBSConfigResponse;
import nl.tudelft.ewi.st.atlantis.tudelft.v1.types.GetBSLocationsRequest;
import nl.tudelft.ewi.st.atlantis.tudelft.v1.types.GetBSLocationsResponse;
import nl.tudelft.ewi.st.atlantis.tudelft.v1.types.GetClientConfigRequest;
import nl.tudelft.ewi.st.atlantis.tudelft.v1.types.GetClientConfigResponse;
import nl.tudelft.ewi.st.atlantis.tudelft.v1.types.GetESLocationRequest;
import nl.tudelft.ewi.st.atlantis.tudelft.v1.types.GetESLocationsResponse;
import nl.tudelft.ewi.st.atlantis.tudelft.v1.types.GetOPSConfigRequest;
import nl.tudelft.ewi.st.atlantis.tudelft.v1.types.GetOPSConfigResponse;
import nl.tudelft.ewi.st.atlantis.tudelft.v1.types.GetOPSLocationsRequest;
import nl.tudelft.ewi.st.atlantis.tudelft.v1.types.GetOPSLocationsResponse;
import nl.tudelft.ewi.st.atlantis.tudelft.v1.types.GetQSLocationsRequest;
import nl.tudelft.ewi.st.atlantis.tudelft.v1.types.GetQSLocationsResponse;
import nl.tudelft.ewi.st.atlantis.tudelft.v1.types.SetBSToOPSRequest;
import nl.tudelft.ewi.st.atlantis.tudelft.v1.types.SetBSToOPSResponse;
import nl.tudelft.ewi.st.atlantis.tudelft.v1.types.SetClientToBSRequest;
import nl.tudelft.ewi.st.atlantis.tudelft.v1.types.SetClientToBSResponse;
import nl.tudelft.ewi.st.atlantis.tudelft.v1.types.SetServiceLocationRequest;
import nl.tudelft.ewi.st.atlantis.tudelft.v1.types.SetServiceLocationResponse;
import nl.tudelft.stocktrader.dal.ConfigServiceDAO;
import nl.tudelft.stocktrader.dal.DAOFactory;
import nl.tudelft.stocktrader.dal.configservice.BSConfig;
import nl.tudelft.stocktrader.dal.configservice.ClientConfig;
import nl.tudelft.stocktrader.dal.configservice.OPSConfig;

public class ConfigurationServiceV1Impl
    implements ConfigurationServiceV1
    {

    	private final DAOFactory factory;

    	public ConfigurationServiceV1Impl() {
    		factory = DAOFactory.getFactory();
    	}
    	
        public ConfigServiceDAO getConfigServiceDAO() {
            return factory.getConfigServiceDAO();
        }
        
        public GetClientConfigResponse getClientConfig(GetClientConfigRequest request) {
            String clientName = request.getClientName();
            ClientConfig config = getConfigServiceDAO().getClientConfig(clientName);
            
            return TypeFactory.toGetClientConfigResponse(config);
        }

        public SetServiceLocationResponse setServiceLocation(SetServiceLocationRequest request) {
        	String serviceName = request.getLocation().getServiceName();
            String serviceUrl = request.getLocation().getServiceURL();
            Boolean isSec = request.getLocation().isSec();
            
            if (getConfigServiceDAO().setServiceLocation(serviceName, serviceUrl, isSec)) {
                return new SetServiceLocationResponse();
            }
            return null;
        }

        public GetBSConfigResponse getBSConfig(GetBSConfigRequest request) {
            BSConfig configResponse = getConfigServiceDAO().getBSConfig(request.getBSName());
            
            return TypeFactory.toGetBSConfigResponse(configResponse);
        }

        public GetOPSConfigResponse getOPSConfig(GetOPSConfigRequest request) {
        	OPSConfig response = getConfigServiceDAO().getOPSConfig(request.getOPSName());
            
            return TypeFactory.toGetOPSConfigResponse(response);
        }

        public SetBSToOPSResponse setBSToOPS(SetBSToOPSRequest request) {
            if (getConfigServiceDAO().setBSToOPS(request.getBs(), request.getOps())) {
                return new SetBSToOPSResponse();
            }
            return null;
        }

        public SetClientToBSResponse setClientToBS(SetClientToBSRequest request) {
            if (getConfigServiceDAO().setClientToBS(request.getClient(), request.getBs())) {
                return new SetClientToBSResponse();
            }
            return null;
        }

        public GetBSLocationsResponse getBSLocations(GetBSLocationsRequest request) {
        	GetBSLocationsResponse getBSLocationsResponse = new GetBSLocationsResponse();
        	getBSLocationsResponse.getLocations()
        				.addAll(TypeFactory.toRemoteServiceLocationList(
        						getConfigServiceDAO().getBSLocations()));
        	return getBSLocationsResponse;
        }

		public GetOPSLocationsResponse getOPSLocations(GetOPSLocationsRequest getOPSLocationsRequest) {
			GetOPSLocationsResponse getOPSLocationsResponse = new GetOPSLocationsResponse();
			
			getOPSLocationsResponse.getLocations()
						.addAll(TypeFactory.toRemoteServiceLocationList(
								getConfigServiceDAO().getOPSLocations()));
			
			return getOPSLocationsResponse;	
		}

		@Override
		public GetESLocationsResponse getESLocations(
				GetESLocationRequest getESLocationsRequest) {
			GetESLocationsResponse getESLocationsResponse = new GetESLocationsResponse();
			getESLocationsResponse.getLocations()
        				.addAll(TypeFactory.toRemoteServiceLocationList(
        						getConfigServiceDAO().getESLocations()));
        	return getESLocationsResponse;
		}

		public GetQSLocationsResponse getQSLocations(GetQSLocationsRequest getQSLocationsRequest) {
			GetQSLocationsResponse response = new GetQSLocationsResponse();
			
			response.getLocations().addAll(TypeFactory.toRemoteServiceLocationList(
								getConfigServiceDAO().getQSLocations()));
			
			return response;
		}
}
