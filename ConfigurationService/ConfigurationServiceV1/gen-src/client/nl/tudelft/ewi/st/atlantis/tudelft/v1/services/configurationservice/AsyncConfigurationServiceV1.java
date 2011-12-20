
package nl.tudelft.ewi.st.atlantis.tudelft.v1.services.configurationservice;

import java.util.List;
import java.util.concurrent.Future;
import javax.xml.ws.AsyncHandler;
import javax.xml.ws.Response;
import nl.tudelft.ewi.st.atlantis.tudelft.v1.services.GetBSConfigRequest;
import nl.tudelft.ewi.st.atlantis.tudelft.v1.services.GetBSConfigResponse;
import nl.tudelft.ewi.st.atlantis.tudelft.v1.services.GetBSLocationsRequest;
import nl.tudelft.ewi.st.atlantis.tudelft.v1.services.GetBSLocationsResponse;
import nl.tudelft.ewi.st.atlantis.tudelft.v1.services.GetClientConfigRequest;
import nl.tudelft.ewi.st.atlantis.tudelft.v1.services.GetClientConfigResponse;
import nl.tudelft.ewi.st.atlantis.tudelft.v1.services.GetESLocationRequest;
import nl.tudelft.ewi.st.atlantis.tudelft.v1.services.GetESLocationsResponse;
import nl.tudelft.ewi.st.atlantis.tudelft.v1.services.GetOPSConfigRequest;
import nl.tudelft.ewi.st.atlantis.tudelft.v1.services.GetOPSConfigResponse;
import nl.tudelft.ewi.st.atlantis.tudelft.v1.services.GetOPSLocationsRequest;
import nl.tudelft.ewi.st.atlantis.tudelft.v1.services.GetOPSLocationsResponse;
import nl.tudelft.ewi.st.atlantis.tudelft.v1.services.GetQSLocationsRequest;
import nl.tudelft.ewi.st.atlantis.tudelft.v1.services.GetQSLocationsResponse;
import nl.tudelft.ewi.st.atlantis.tudelft.v1.services.SetBSToOPSRequest;
import nl.tudelft.ewi.st.atlantis.tudelft.v1.services.SetBSToOPSResponse;
import nl.tudelft.ewi.st.atlantis.tudelft.v1.services.SetClientToBSRequest;
import nl.tudelft.ewi.st.atlantis.tudelft.v1.services.SetClientToBSResponse;
import nl.tudelft.ewi.st.atlantis.tudelft.v1.services.SetServiceLocationRequest;
import nl.tudelft.ewi.st.atlantis.tudelft.v1.services.SetServiceLocationResponse;

public interface AsyncConfigurationServiceV1
    extends ConfigurationServiceV1
{


    public Future<?> getClientConfigAsync(GetClientConfigRequest param0, AsyncHandler<GetClientConfigResponse> handler);

    public Response<GetClientConfigResponse> getClientConfigAsync(GetClientConfigRequest param0);

    public Future<?> setServiceLocationAsync(SetServiceLocationRequest param0, AsyncHandler<SetServiceLocationResponse> handler);

    public Response<SetServiceLocationResponse> setServiceLocationAsync(SetServiceLocationRequest param0);

    public Future<?> getBSConfigAsync(GetBSConfigRequest param0, AsyncHandler<GetBSConfigResponse> handler);

    public Response<GetBSConfigResponse> getBSConfigAsync(GetBSConfigRequest param0);

    public Future<?> getOPSConfigAsync(GetOPSConfigRequest param0, AsyncHandler<GetOPSConfigResponse> handler);

    public Response<GetOPSConfigResponse> getOPSConfigAsync(GetOPSConfigRequest param0);

    public Future<?> getQSLocationsAsync(GetQSLocationsRequest param0, AsyncHandler<GetQSLocationsResponse> handler);

    public Response<GetQSLocationsResponse> getQSLocationsAsync(GetQSLocationsRequest param0);

    public Future<?> setClientToBSAsync(SetClientToBSRequest param0, AsyncHandler<SetClientToBSResponse> handler);

    public Response<SetClientToBSResponse> setClientToBSAsync(SetClientToBSRequest param0);

    public Future<?> getESLocationsAsync(GetESLocationRequest param0, AsyncHandler<GetESLocationsResponse> handler);

    public Response<GetESLocationsResponse> getESLocationsAsync(GetESLocationRequest param0);

    public Future<?> setBSToOPSAsync(SetBSToOPSRequest param0, AsyncHandler<SetBSToOPSResponse> handler);

    public Response<SetBSToOPSResponse> setBSToOPSAsync(SetBSToOPSRequest param0);

    public Future<?> getBSLocationsAsync(GetBSLocationsRequest param0, AsyncHandler<GetBSLocationsResponse> handler);

    public Response<GetBSLocationsResponse> getBSLocationsAsync(GetBSLocationsRequest param0);

    public Future<?> getOPSLocationsAsync(GetOPSLocationsRequest param0, AsyncHandler<GetOPSLocationsResponse> handler);

    public Response<GetOPSLocationsResponse> getOPSLocationsAsync(GetOPSLocationsRequest param0);

    public List<Response<?>> poll(boolean block, boolean partial)
        throws InterruptedException
    ;

}
