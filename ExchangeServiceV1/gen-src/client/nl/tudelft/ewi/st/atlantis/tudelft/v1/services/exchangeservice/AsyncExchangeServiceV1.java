
package nl.tudelft.ewi.st.atlantis.tudelft.v1.services.exchangeservice;

import java.util.List;
import java.util.concurrent.Future;
import javax.xml.ws.AsyncHandler;
import javax.xml.ws.Response;
import nl.tudelft.ewi.st.atlantis.tudelft.v1.services.CheckAmountRequest;
import nl.tudelft.ewi.st.atlantis.tudelft.v1.services.CheckAmountResponse;
import nl.tudelft.ewi.st.atlantis.tudelft.v1.services.CheckCurrencyRequest;
import nl.tudelft.ewi.st.atlantis.tudelft.v1.services.CheckCurrencyResponse;
import nl.tudelft.ewi.st.atlantis.tudelft.v1.services.ExchangeCurrencyRequest;
import nl.tudelft.ewi.st.atlantis.tudelft.v1.services.ExchangeCurrencyResponse;
import nl.tudelft.ewi.st.atlantis.tudelft.v1.services.UpdateWalletDataRequest;
import nl.tudelft.ewi.st.atlantis.tudelft.v1.services.UpdateWalletDataResponse;

public interface AsyncExchangeServiceV1
    extends ExchangeServiceV1
{


    public Future<?> updateWalletDataAsync(UpdateWalletDataRequest param0, AsyncHandler<UpdateWalletDataResponse> handler);

    public Response<UpdateWalletDataResponse> updateWalletDataAsync(UpdateWalletDataRequest param0);

    public Future<?> exchangeCurrencyAsync(ExchangeCurrencyRequest param0, AsyncHandler<ExchangeCurrencyResponse> handler);

    public Response<ExchangeCurrencyResponse> exchangeCurrencyAsync(ExchangeCurrencyRequest param0);

    public Future<?> checkCurrencyAsync(CheckCurrencyRequest param0, AsyncHandler<CheckCurrencyResponse> handler);

    public Response<CheckCurrencyResponse> checkCurrencyAsync(CheckCurrencyRequest param0);

    public Future<?> checkAmountAsync(CheckAmountRequest param0, AsyncHandler<CheckAmountResponse> handler);

    public Response<CheckAmountResponse> checkAmountAsync(CheckAmountRequest param0);

    public List<Response<?>> poll(boolean block, boolean partial)
        throws InterruptedException
    ;

}
