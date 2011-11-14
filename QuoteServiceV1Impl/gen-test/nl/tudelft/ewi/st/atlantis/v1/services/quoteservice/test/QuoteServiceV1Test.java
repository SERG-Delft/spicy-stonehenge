
package nl.tudelft.ewi.st.atlantis.v1.services.quoteservice.test;

import junit.framework.TestCase;
import nl.tudelft.ewi.st.atlantis.v1.services.GetQuotesResponse;
import nl.tudelft.ewi.st.atlantis.v1.services.quoteservice.QuoteServiceV1;
import org.ebayopensource.turmeric.runtime.common.exceptions.ServiceException;
import org.ebayopensource.turmeric.runtime.sif.service.Service;
import org.ebayopensource.turmeric.runtime.sif.service.ServiceFactory;

public class QuoteServiceV1Test
    extends TestCase
{

    private QuoteServiceV1 m_proxy = null;

    public QuoteServiceV1Test(String testcaseName) {
        super(testcaseName);
    }

    private QuoteServiceV1 getProxy()
        throws ServiceException
    {
        if (m_proxy == null) {
            String svcAdminName = "QuoteServiceV1";
            String envName = "production";
            String clientName = "QuoteServiceV1_Test";
            Service service = ServiceFactory.create(svcAdminName, envName, clientName, null);
            m_proxy = service.getProxy();
        }
        return m_proxy;
    }

    public void testGetQuotes()
        throws Exception
    {
        GetQuotesResponse result = null;
        // TODO: REPLACE PARAMETER(S) WITH ACTUAL VALUE(S)
        result = getProxy().getQuotes(null);
        if (result == null) {
            throw new Exception("Response is Null");
        }
        // TODO: FIX FOLLOWING ASSERT STATEMENT
        assertTrue(false);
    }

}
