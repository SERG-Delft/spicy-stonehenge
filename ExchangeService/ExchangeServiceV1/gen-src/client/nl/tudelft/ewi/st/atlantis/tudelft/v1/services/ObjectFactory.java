
package nl.tudelft.ewi.st.atlantis.tudelft.v1.services;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the nl.tudelft.ewi.st.atlantis.tudelft.v1.services package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _CheckCurrencyRequest_QNAME = new QName("http://atlantis.st.ewi.tudelft.nl/tudelft/v1/services", "checkCurrencyRequest");
    private final static QName _CheckAmountRequest_QNAME = new QName("http://atlantis.st.ewi.tudelft.nl/tudelft/v1/services", "checkAmountRequest");
    private final static QName _ExchangeCurrencyRequest_QNAME = new QName("http://atlantis.st.ewi.tudelft.nl/tudelft/v1/services", "exchangeCurrencyRequest");
    private final static QName _ExchangeCurrencyResponse_QNAME = new QName("http://atlantis.st.ewi.tudelft.nl/tudelft/v1/services", "exchangeCurrencyResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: nl.tudelft.ewi.st.atlantis.tudelft.v1.services
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CheckCurrency }
     * 
     */
    public CheckCurrency createCheckCurrency() {
        return new CheckCurrency();
    }

    /**
     * Create an instance of {@link CheckCurrencyResponse }
     * 
     */
    public CheckCurrencyResponse createCheckCurrencyResponse() {
        return new CheckCurrencyResponse();
    }

    /**
     * Create an instance of {@link CheckCurrencyRequest }
     * 
     */
    public CheckCurrencyRequest createCheckCurrencyRequest() {
        return new CheckCurrencyRequest();
    }

    /**
     * Create an instance of {@link ExchangeCurrencyRequest }
     * 
     */
    public ExchangeCurrencyRequest createExchangeCurrencyRequest() {
        return new ExchangeCurrencyRequest();
    }

    /**
     * Create an instance of {@link UpdateWalletDataRequest }
     * 
     */
    public UpdateWalletDataRequest createUpdateWalletDataRequest() {
        return new UpdateWalletDataRequest();
    }

    /**
     * Create an instance of {@link ExchangeCurrencyResponse }
     * 
     */
    public ExchangeCurrencyResponse createExchangeCurrencyResponse() {
        return new ExchangeCurrencyResponse();
    }

    /**
     * Create an instance of {@link UpdateWalletDataResponse }
     * 
     */
    public UpdateWalletDataResponse createUpdateWalletDataResponse() {
        return new UpdateWalletDataResponse();
    }

    /**
     * Create an instance of {@link CheckAmountResponse }
     * 
     */
    public CheckAmountResponse createCheckAmountResponse() {
        return new CheckAmountResponse();
    }

    /**
     * Create an instance of {@link CheckAmountRequest }
     * 
     */
    public CheckAmountRequest createCheckAmountRequest() {
        return new CheckAmountRequest();
    }

    /**
     * Create an instance of {@link CheckCurrencyReponse }
     * 
     */
    public CheckCurrencyReponse createCheckCurrencyReponse() {
        return new CheckCurrencyReponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CheckCurrencyRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://atlantis.st.ewi.tudelft.nl/tudelft/v1/services", name = "checkCurrencyRequest")
    public JAXBElement<CheckCurrencyRequest> createCheckCurrencyRequest(CheckCurrencyRequest value) {
        return new JAXBElement<CheckCurrencyRequest>(_CheckCurrencyRequest_QNAME, CheckCurrencyRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CheckAmountRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://atlantis.st.ewi.tudelft.nl/tudelft/v1/services", name = "checkAmountRequest")
    public JAXBElement<CheckAmountRequest> createCheckAmountRequest(CheckAmountRequest value) {
        return new JAXBElement<CheckAmountRequest>(_CheckAmountRequest_QNAME, CheckAmountRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExchangeCurrencyRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://atlantis.st.ewi.tudelft.nl/tudelft/v1/services", name = "exchangeCurrencyRequest")
    public JAXBElement<ExchangeCurrencyRequest> createExchangeCurrencyRequest(ExchangeCurrencyRequest value) {
        return new JAXBElement<ExchangeCurrencyRequest>(_ExchangeCurrencyRequest_QNAME, ExchangeCurrencyRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExchangeCurrencyResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://atlantis.st.ewi.tudelft.nl/tudelft/v1/services", name = "exchangeCurrencyResponse")
    public JAXBElement<ExchangeCurrencyResponse> createExchangeCurrencyResponse(ExchangeCurrencyResponse value) {
        return new JAXBElement<ExchangeCurrencyResponse>(_ExchangeCurrencyResponse_QNAME, ExchangeCurrencyResponse.class, null, value);
    }

}
