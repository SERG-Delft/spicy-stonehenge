
package nl.tudelft.ewi.st.atlantis.tudelft.v1.services.configurationservice.test;

import junit.framework.TestCase;
import nl.tudelft.ewi.st.atlantis.tudelft.v1.services.GetBSConfigResponse;
import nl.tudelft.ewi.st.atlantis.tudelft.v1.services.GetBSLocationsResponse;
import nl.tudelft.ewi.st.atlantis.tudelft.v1.services.GetClientConfigResponse;
import nl.tudelft.ewi.st.atlantis.tudelft.v1.services.GetESLocationsResponse;
import nl.tudelft.ewi.st.atlantis.tudelft.v1.services.GetOPSConfigResponse;
import nl.tudelft.ewi.st.atlantis.tudelft.v1.services.GetOPSLocationsResponse;
import nl.tudelft.ewi.st.atlantis.tudelft.v1.services.SetBSToOPSResponse;
import nl.tudelft.ewi.st.atlantis.tudelft.v1.services.SetClientToBSResponse;
import nl.tudelft.ewi.st.atlantis.tudelft.v1.services.SetServiceLocationResponse;
import nl.tudelft.ewi.st.atlantis.tudelft.v1.services.configurationservice.ConfigurationServiceV1;
import org.ebayopensource.turmeric.runtime.common.exceptions.ServiceException;
import org.ebayopensource.turmeric.runtime.sif.service.Service;
import org.ebayopensource.turmeric.runtime.sif.service.ServiceFactory;

public class ConfigurationServiceV1Test
    extends TestCase
{

    private ConfigurationServiceV1 m_proxy = null;

    public ConfigurationServiceV1Test(String testcaseName) {
        super(testcaseName);
    }

    private ConfigurationServiceV1 getProxy()
        throws ServiceException
    {
        if (m_proxy == null) {
            String svcAdminName = "ConfigurationServiceV1";
            String envName = "production";
            String clientName = "ConfigurationServiceV1_Test";
            Service service = ServiceFactory.create(svcAdminName, envName, clientName, null);
            m_proxy = service.getProxy();
        }
        return m_proxy;
    }

    public void testGetClientConfig()
        throws Exception
    {
        GetClientConfigResponse result = null;
        // TODO: REPLACE PARAMETER(S) WITH ACTUAL VALUE(S)
        result = getProxy().getClientConfig(null);
        if (result == null) {
            throw new Exception("Response is Null");
        }
        // TODO: FIX FOLLOWING ASSERT STATEMENT
        assertTrue(false);
    }

    public void testSetServiceLocation()
        throws Exception
    {
        SetServiceLocationResponse result = null;
        // TODO: REPLACE PARAMETER(S) WITH ACTUAL VALUE(S)
        result = getProxy().setServiceLocation(null);
        if (result == null) {
            throw new Exception("Response is Null");
        }
        // TODO: FIX FOLLOWING ASSERT STATEMENT
        assertTrue(false);
    }

    public void testGetBSConfig()
        throws Exception
    {
        GetBSConfigResponse result = null;
        // TODO: REPLACE PARAMETER(S) WITH ACTUAL VALUE(S)
        result = getProxy().getBSConfig(null);
        if (result == null) {
            throw new Exception("Response is Null");
        }
        // TODO: FIX FOLLOWING ASSERT STATEMENT
        assertTrue(false);
    }

    public void testGetOPSConfig()
        throws Exception
    {
        GetOPSConfigResponse result = null;
        // TODO: REPLACE PARAMETER(S) WITH ACTUAL VALUE(S)
        result = getProxy().getOPSConfig(null);
        if (result == null) {
            throw new Exception("Response is Null");
        }
        // TODO: FIX FOLLOWING ASSERT STATEMENT
        assertTrue(false);
    }

    public void testSetClientToBS()
        throws Exception
    {
        SetClientToBSResponse result = null;
        // TODO: REPLACE PARAMETER(S) WITH ACTUAL VALUE(S)
        result = getProxy().setClientToBS(null);
        if (result == null) {
            throw new Exception("Response is Null");
        }
        // TODO: FIX FOLLOWING ASSERT STATEMENT
        assertTrue(false);
    }

    public void testGetESLocations()
        throws Exception
    {
        GetESLocationsResponse result = null;
        // TODO: REPLACE PARAMETER(S) WITH ACTUAL VALUE(S)
        result = getProxy().getESLocations(null);
        if (result == null) {
            throw new Exception("Response is Null");
        }
        // TODO: FIX FOLLOWING ASSERT STATEMENT
        assertTrue(false);
    }

    public void testSetBSToOPS()
        throws Exception
    {
        SetBSToOPSResponse result = null;
        // TODO: REPLACE PARAMETER(S) WITH ACTUAL VALUE(S)
        result = getProxy().setBSToOPS(null);
        if (result == null) {
            throw new Exception("Response is Null");
        }
        // TODO: FIX FOLLOWING ASSERT STATEMENT
        assertTrue(false);
    }

    public void testGetBSLocations()
        throws Exception
    {
        GetBSLocationsResponse result = null;
        // TODO: REPLACE PARAMETER(S) WITH ACTUAL VALUE(S)
        result = getProxy().getBSLocations(null);
        if (result == null) {
            throw new Exception("Response is Null");
        }
        // TODO: FIX FOLLOWING ASSERT STATEMENT
        assertTrue(false);
    }

    public void testGetOPSLocations()
        throws Exception
    {
        GetOPSLocationsResponse result = null;
        // TODO: REPLACE PARAMETER(S) WITH ACTUAL VALUE(S)
        result = getProxy().getOPSLocations(null);
        if (result == null) {
            throw new Exception("Response is Null");
        }
        // TODO: FIX FOLLOWING ASSERT STATEMENT
        assertTrue(false);
    }

}
