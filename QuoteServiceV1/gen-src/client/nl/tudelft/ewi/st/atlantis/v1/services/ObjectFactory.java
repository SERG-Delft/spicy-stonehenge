
package nl.tudelft.ewi.st.atlantis.v1.services;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the nl.tudelft.ewi.st.atlantis.v1.services package. 
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

    private final static QName _GetQuotesRequest_QNAME = new QName("http://atlantis.st.ewi.tudelft.nl/v1/services", "getQuotesRequest");
    private final static QName _GetQuotesResponse_QNAME = new QName("http://atlantis.st.ewi.tudelft.nl/v1/services", "getQuotesResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: nl.tudelft.ewi.st.atlantis.v1.services
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetQuotesRequest }
     * 
     */
    public GetQuotesRequest createGetQuotesRequest() {
        return new GetQuotesRequest();
    }

    /**
     * Create an instance of {@link GetQuotesResponse }
     * 
     */
    public GetQuotesResponse createGetQuotesResponse() {
        return new GetQuotesResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetQuotesRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://atlantis.st.ewi.tudelft.nl/v1/services", name = "getQuotesRequest")
    public JAXBElement<GetQuotesRequest> createGetQuotesRequest(GetQuotesRequest value) {
        return new JAXBElement<GetQuotesRequest>(_GetQuotesRequest_QNAME, GetQuotesRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetQuotesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://atlantis.st.ewi.tudelft.nl/v1/services", name = "getQuotesResponse")
    public JAXBElement<GetQuotesResponse> createGetQuotesResponse(GetQuotesResponse value) {
        return new JAXBElement<GetQuotesResponse>(_GetQuotesResponse_QNAME, GetQuotesResponse.class, null, value);
    }

}
