
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

    private final static QName _SubmitOrderRequest_QNAME = new QName("http://atlantis.st.ewi.tudelft.nl/tudelft/v1/services", "submitOrderRequest");
    private final static QName _IsOnlineRequest_QNAME = new QName("http://atlantis.st.ewi.tudelft.nl/tudelft/v1/services", "isOnlineRequest");
    private final static QName _IsOnlineResponse_QNAME = new QName("http://atlantis.st.ewi.tudelft.nl/tudelft/v1/services", "isOnlineResponse");
    private final static QName _SubmitOrderResponse_QNAME = new QName("http://atlantis.st.ewi.tudelft.nl/tudelft/v1/services", "submitOrderResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: nl.tudelft.ewi.st.atlantis.tudelft.v1.services
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link SubmitOrderResponse }
     * 
     */
    public SubmitOrderResponse createSubmitOrderResponse() {
        return new SubmitOrderResponse();
    }

    /**
     * Create an instance of {@link SubmitOrderRequest }
     * 
     */
    public SubmitOrderRequest createSubmitOrderRequest() {
        return new SubmitOrderRequest();
    }

    /**
     * Create an instance of {@link IsOnlineRequest }
     * 
     */
    public IsOnlineRequest createIsOnlineRequest() {
        return new IsOnlineRequest();
    }

    /**
     * Create an instance of {@link IsOnlineResponse }
     * 
     */
    public IsOnlineResponse createIsOnlineResponse() {
        return new IsOnlineResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SubmitOrderRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://atlantis.st.ewi.tudelft.nl/tudelft/v1/services", name = "submitOrderRequest")
    public JAXBElement<SubmitOrderRequest> createSubmitOrderRequest(SubmitOrderRequest value) {
        return new JAXBElement<SubmitOrderRequest>(_SubmitOrderRequest_QNAME, SubmitOrderRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IsOnlineRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://atlantis.st.ewi.tudelft.nl/tudelft/v1/services", name = "isOnlineRequest")
    public JAXBElement<IsOnlineRequest> createIsOnlineRequest(IsOnlineRequest value) {
        return new JAXBElement<IsOnlineRequest>(_IsOnlineRequest_QNAME, IsOnlineRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IsOnlineResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://atlantis.st.ewi.tudelft.nl/tudelft/v1/services", name = "isOnlineResponse")
    public JAXBElement<IsOnlineResponse> createIsOnlineResponse(IsOnlineResponse value) {
        return new JAXBElement<IsOnlineResponse>(_IsOnlineResponse_QNAME, IsOnlineResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SubmitOrderResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://atlantis.st.ewi.tudelft.nl/tudelft/v1/services", name = "submitOrderResponse")
    public JAXBElement<SubmitOrderResponse> createSubmitOrderResponse(SubmitOrderResponse value) {
        return new JAXBElement<SubmitOrderResponse>(_SubmitOrderResponse_QNAME, SubmitOrderResponse.class, null, value);
    }

}
