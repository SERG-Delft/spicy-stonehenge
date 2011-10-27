
package nl.tudelft.ewi.st.atlantis.tudelft.v1.services.exchangeservice.test;

import junit.framework.TestCase;
import nl.tudelft.ewi.st.atlantis.tudelft.v1.services.ExchangeCurrencyResponse;
import nl.tudelft.ewi.st.atlantis.tudelft.v1.services.exchangeservice.ExchangeServiceV1;
import org.ebayopensource.turmeric.runtime.common.exceptions.ServiceException;
import org.ebayopensource.turmeric.runtime.sif.service.Service;
import org.ebayopensource.turmeric.runtime.sif.service.ServiceFactory;

public class ExchangeServiceV1Test
    extends TestCase
{

    private ExchangeServiceV1 m_proxy = null;

    public ExchangeServiceV1Test(String testcaseName) {
        super(testcaseName);
    }

    private ExchangeServiceV1 getProxy()
        throws ServiceException
    {
        if (m_proxy == null) {
            String svcAdminName = "ExchangeServiceV1";
            String envName = "production";
            String clientName = "ExchangeServiceV1_Test";
            Service service = ServiceFactory.create(svcAdminName, envName, clientName, null);
            m_proxy = service.getProxy();
        }
        return m_proxy;
    }

    public void testExchangeCurrency()
        throws Exception
    {
        ExchangeCurrencyResponse result = null;
        // TODO: REPLACE PARAMETER(S) WITH ACTUAL VALUE(S)
        result = getProxy().exchangeCurrency(null);
        if (result == null) {
            throw new Exception("Response is Null");
        }
        // TODO: FIX FOLLOWING ASSERT STATEMENT
        assertTrue(false);
    }

}
