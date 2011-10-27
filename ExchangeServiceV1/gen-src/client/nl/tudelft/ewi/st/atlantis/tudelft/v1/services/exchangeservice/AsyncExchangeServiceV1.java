
package nl.tudelft.ewi.st.atlantis.tudelft.v1.services.exchangeservice;

import java.util.List;
import java.util.concurrent.Future;
import javax.xml.ws.AsyncHandler;
import javax.xml.ws.Response;
import nl.tudelft.ewi.st.atlantis.tudelft.v1.services.ExchangeCurrencyRequest;
import nl.tudelft.ewi.st.atlantis.tudelft.v1.services.ExchangeCurrencyResponse;

public interface AsyncExchangeServiceV1
    extends ExchangeServiceV1
{


    public Future<?> exchangeCurrencyAsync(ExchangeCurrencyRequest param0, AsyncHandler<ExchangeCurrencyResponse> handler);

    public Response<ExchangeCurrencyResponse> exchangeCurrencyAsync(ExchangeCurrencyRequest param0);

    public List<Response<?>> poll(boolean block, boolean partial)
        throws InterruptedException
    ;

}
