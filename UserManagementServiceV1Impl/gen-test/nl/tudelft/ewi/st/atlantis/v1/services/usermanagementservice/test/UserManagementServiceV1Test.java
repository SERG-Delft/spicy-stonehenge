
package nl.tudelft.ewi.st.atlantis.v1.services.usermanagementservice.test;

import junit.framework.TestCase;
import nl.tudelft.ewi.st.atlantis.v1.services.GetAccountDataResponse;
import nl.tudelft.ewi.st.atlantis.v1.services.GetAccountProfileDataResponse;
import nl.tudelft.ewi.st.atlantis.v1.services.GetWalletDataResponse;
import nl.tudelft.ewi.st.atlantis.v1.services.LoginResponse;
import nl.tudelft.ewi.st.atlantis.v1.services.LogoutResponse;
import nl.tudelft.ewi.st.atlantis.v1.services.RegisterResponse;
import nl.tudelft.ewi.st.atlantis.v1.services.UpdateAccountProfileResponse;
import nl.tudelft.ewi.st.atlantis.v1.services.UpdateWalletDataResponse;
import nl.tudelft.ewi.st.atlantis.v1.services.usermanagementservice.UserManagementServiceV1;
import org.ebayopensource.turmeric.runtime.common.exceptions.ServiceException;
import org.ebayopensource.turmeric.runtime.sif.service.Service;
import org.ebayopensource.turmeric.runtime.sif.service.ServiceFactory;

public class UserManagementServiceV1Test
    extends TestCase
{

    private UserManagementServiceV1 m_proxy = null;

    public UserManagementServiceV1Test(String testcaseName) {
        super(testcaseName);
    }

    private UserManagementServiceV1 getProxy()
        throws ServiceException
    {
        if (m_proxy == null) {
            String svcAdminName = "UserManagementServiceV1";
            String envName = "production";
            String clientName = "UserManagementServiceV1_Test";
            Service service = ServiceFactory.create(svcAdminName, envName, clientName, null);
            m_proxy = service.getProxy();
        }
        return m_proxy;
    }

    public void testRegister()
        throws Exception
    {
        RegisterResponse result = null;
        // TODO: REPLACE PARAMETER(S) WITH ACTUAL VALUE(S)
        result = getProxy().register(null);
        if (result == null) {
            throw new Exception("Response is Null");
        }
        // TODO: FIX FOLLOWING ASSERT STATEMENT
        assertTrue(false);
    }

    public void testLogin()
        throws Exception
    {
        LoginResponse result = null;
        // TODO: REPLACE PARAMETER(S) WITH ACTUAL VALUE(S)
        result = getProxy().login(null);
        if (result == null) {
            throw new Exception("Response is Null");
        }
        // TODO: FIX FOLLOWING ASSERT STATEMENT
        assertTrue(false);
    }

    public void testLogout()
        throws Exception
    {
        LogoutResponse result = null;
        // TODO: REPLACE PARAMETER(S) WITH ACTUAL VALUE(S)
        result = getProxy().logout(null);
        if (result == null) {
            throw new Exception("Response is Null");
        }
        // TODO: FIX FOLLOWING ASSERT STATEMENT
        assertTrue(false);
    }

    public void testGetWalletData()
        throws Exception
    {
        GetWalletDataResponse result = null;
        // TODO: REPLACE PARAMETER(S) WITH ACTUAL VALUE(S)
        result = getProxy().getWalletData(null);
        if (result == null) {
            throw new Exception("Response is Null");
        }
        // TODO: FIX FOLLOWING ASSERT STATEMENT
        assertTrue(false);
    }

    public void testGetAccountData()
        throws Exception
    {
        GetAccountDataResponse result = null;
        // TODO: REPLACE PARAMETER(S) WITH ACTUAL VALUE(S)
        result = getProxy().getAccountData(null);
        if (result == null) {
            throw new Exception("Response is Null");
        }
        // TODO: FIX FOLLOWING ASSERT STATEMENT
        assertTrue(false);
    }

    public void testUpdateWalletData()
        throws Exception
    {
        UpdateWalletDataResponse result = null;
        // TODO: REPLACE PARAMETER(S) WITH ACTUAL VALUE(S)
        result = getProxy().updateWalletData(null);
        if (result == null) {
            throw new Exception("Response is Null");
        }
        // TODO: FIX FOLLOWING ASSERT STATEMENT
        assertTrue(false);
    }

    public void testUpdateAccountProfile()
        throws Exception
    {
        UpdateAccountProfileResponse result = null;
        // TODO: REPLACE PARAMETER(S) WITH ACTUAL VALUE(S)
        result = getProxy().updateAccountProfile(null);
        if (result == null) {
            throw new Exception("Response is Null");
        }
        // TODO: FIX FOLLOWING ASSERT STATEMENT
        assertTrue(false);
    }

    public void testGetAccountProfileData()
        throws Exception
    {
        GetAccountProfileDataResponse result = null;
        // TODO: REPLACE PARAMETER(S) WITH ACTUAL VALUE(S)
        result = getProxy().getAccountProfileData(null);
        if (result == null) {
            throw new Exception("Response is Null");
        }
        // TODO: FIX FOLLOWING ASSERT STATEMENT
        assertTrue(false);
    }

}
