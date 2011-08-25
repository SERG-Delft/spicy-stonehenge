
package nl.tudelft.ewi.st.atlantis.tudelft.v1.services.orderprocessorservice.test;

import junit.framework.TestCase;
import nl.tudelft.ewi.st.atlantis.tudelft.v1.services.IsOnlineResponse;
import nl.tudelft.ewi.st.atlantis.tudelft.v1.services.SubmitOrderResponse;
import nl.tudelft.ewi.st.atlantis.tudelft.v1.services.orderprocessorservice.OrderProcessorServiceV1;
import org.ebayopensource.turmeric.runtime.common.exceptions.ServiceException;
import org.ebayopensource.turmeric.runtime.sif.service.Service;
import org.ebayopensource.turmeric.runtime.sif.service.ServiceFactory;

public class OrderProcessorServiceV1Test
    extends TestCase
{

    private OrderProcessorServiceV1 m_proxy = null;

    public OrderProcessorServiceV1Test(String testcaseName) {
        super(testcaseName);
    }

    private OrderProcessorServiceV1 getProxy()
        throws ServiceException
    {
        if (m_proxy == null) {
            String svcAdminName = "OrderProcessorServiceV1";
            String envName = "production";
            String clientName = "OrderProcessorServiceV1_Test";
            Service service = ServiceFactory.create(svcAdminName, envName, clientName, null);
            m_proxy = service.getProxy();
        }
        return m_proxy;
    }

    public void testIsOnline()
        throws Exception
    {
        IsOnlineResponse result = null;
        // TODO: REPLACE PARAMETER(S) WITH ACTUAL VALUE(S)
        result = getProxy().isOnline(null);
        if (result == null) {
            throw new Exception("Response is Null");
        }
        // TODO: FIX FOLLOWING ASSERT STATEMENT
        assertTrue(false);
    }

    public void testSubmitOrder()
        throws Exception
    {
        SubmitOrderResponse result = null;
        // TODO: REPLACE PARAMETER(S) WITH ACTUAL VALUE(S)
        result = getProxy().submitOrder(null);
        if (result == null) {
            throw new Exception("Response is Null");
        }
        // TODO: FIX FOLLOWING ASSERT STATEMENT
        assertTrue(false);
    }

}
