
package nl.tudelft.ewi.st.atlantis.tudelft.v1.services.businessservice.test;

import junit.framework.TestCase;
import nl.tudelft.ewi.st.atlantis.tudelft.v1.services.BuyResponse;
import nl.tudelft.ewi.st.atlantis.tudelft.v1.services.GetAccountDataResponse;
import nl.tudelft.ewi.st.atlantis.tudelft.v1.services.GetAccountProfileDataResponse;
import nl.tudelft.ewi.st.atlantis.tudelft.v1.services.GetAllQuotesResponse;
import nl.tudelft.ewi.st.atlantis.tudelft.v1.services.GetClosedOrdersResponse;
import nl.tudelft.ewi.st.atlantis.tudelft.v1.services.GetHoldingResponse;
import nl.tudelft.ewi.st.atlantis.tudelft.v1.services.GetHoldingsResponse;
import nl.tudelft.ewi.st.atlantis.tudelft.v1.services.GetMarketSummaryResponse;
import nl.tudelft.ewi.st.atlantis.tudelft.v1.services.GetOrdersResponse;
import nl.tudelft.ewi.st.atlantis.tudelft.v1.services.GetQuoteResponse;
import nl.tudelft.ewi.st.atlantis.tudelft.v1.services.GetTopOrdersResponse;
import nl.tudelft.ewi.st.atlantis.tudelft.v1.services.LoginResponse;
import nl.tudelft.ewi.st.atlantis.tudelft.v1.services.LogoutResponse;
import nl.tudelft.ewi.st.atlantis.tudelft.v1.services.SellEnhancedResponse;
import nl.tudelft.ewi.st.atlantis.tudelft.v1.services.SellResponse;
import nl.tudelft.ewi.st.atlantis.tudelft.v1.services.UpdateAccountProfileResponse;
import nl.tudelft.ewi.st.atlantis.tudelft.v1.services.businessservice.BusinessServiceV1;
import org.ebayopensource.turmeric.runtime.common.exceptions.ServiceException;
import org.ebayopensource.turmeric.runtime.sif.service.Service;
import org.ebayopensource.turmeric.runtime.sif.service.ServiceFactory;

public class BusinessServiceV1Test
    extends TestCase
{

    private BusinessServiceV1 m_proxy = null;

    public BusinessServiceV1Test(String testcaseName) {
        super(testcaseName);
    }

    private BusinessServiceV1 getProxy()
        throws ServiceException
    {
        if (m_proxy == null) {
            String svcAdminName = "BusinessServiceV1";
            String envName = "production";
            String clientName = "BusinessServiceV1_Test";
            Service service = ServiceFactory.create(svcAdminName, envName, clientName, null);
            m_proxy = service.getProxy();
        }
        return m_proxy;
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

    public void testGetQuote()
        throws Exception
    {
        GetQuoteResponse result = null;
        // TODO: REPLACE PARAMETER(S) WITH ACTUAL VALUE(S)
        result = getProxy().getQuote(null);
        if (result == null) {
            throw new Exception("Response is Null");
        }
        // TODO: FIX FOLLOWING ASSERT STATEMENT
        assertTrue(false);
    }

    public void testGetMarketSummary()
        throws Exception
    {
        GetMarketSummaryResponse result = null;
        // TODO: REPLACE PARAMETER(S) WITH ACTUAL VALUE(S)
        result = getProxy().getMarketSummary(null);
        if (result == null) {
            throw new Exception("Response is Null");
        }
        // TODO: FIX FOLLOWING ASSERT STATEMENT
        assertTrue(false);
    }

    public void testBuy()
        throws Exception
    {
        BuyResponse result = null;
        // TODO: REPLACE PARAMETER(S) WITH ACTUAL VALUE(S)
        result = getProxy().buy(null);
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

    public void testGetHolding()
        throws Exception
    {
        GetHoldingResponse result = null;
        // TODO: REPLACE PARAMETER(S) WITH ACTUAL VALUE(S)
        result = getProxy().getHolding(null);
        if (result == null) {
            throw new Exception("Response is Null");
        }
        // TODO: FIX FOLLOWING ASSERT STATEMENT
        assertTrue(false);
    }

    public void testSellEnhanced()
        throws Exception
    {
        SellEnhancedResponse result = null;
        // TODO: REPLACE PARAMETER(S) WITH ACTUAL VALUE(S)
        result = getProxy().sellEnhanced(null);
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

    public void testGetTopOrders()
        throws Exception
    {
        GetTopOrdersResponse result = null;
        // TODO: REPLACE PARAMETER(S) WITH ACTUAL VALUE(S)
        result = getProxy().getTopOrders(null);
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

    public void testGetAllQuotes()
        throws Exception
    {
        GetAllQuotesResponse result = null;
        // TODO: REPLACE PARAMETER(S) WITH ACTUAL VALUE(S)
        result = getProxy().getAllQuotes(null);
        if (result == null) {
            throw new Exception("Response is Null");
        }
        // TODO: FIX FOLLOWING ASSERT STATEMENT
        assertTrue(false);
    }

    public void testSell()
        throws Exception
    {
        SellResponse result = null;
        // TODO: REPLACE PARAMETER(S) WITH ACTUAL VALUE(S)
        result = getProxy().sell(null);
        if (result == null) {
            throw new Exception("Response is Null");
        }
        // TODO: FIX FOLLOWING ASSERT STATEMENT
        assertTrue(false);
    }

    public void testGetOrders()
        throws Exception
    {
        GetOrdersResponse result = null;
        // TODO: REPLACE PARAMETER(S) WITH ACTUAL VALUE(S)
        result = getProxy().getOrders(null);
        if (result == null) {
            throw new Exception("Response is Null");
        }
        // TODO: FIX FOLLOWING ASSERT STATEMENT
        assertTrue(false);
    }

    public void testGetHoldings()
        throws Exception
    {
        GetHoldingsResponse result = null;
        // TODO: REPLACE PARAMETER(S) WITH ACTUAL VALUE(S)
        result = getProxy().getHoldings(null);
        if (result == null) {
            throw new Exception("Response is Null");
        }
        // TODO: FIX FOLLOWING ASSERT STATEMENT
        assertTrue(false);
    }

    public void testGetClosedOrders()
        throws Exception
    {
        GetClosedOrdersResponse result = null;
        // TODO: REPLACE PARAMETER(S) WITH ACTUAL VALUE(S)
        result = getProxy().getClosedOrders(null);
        if (result == null) {
            throw new Exception("Response is Null");
        }
        // TODO: FIX FOLLOWING ASSERT STATEMENT
        assertTrue(false);
    }

}
