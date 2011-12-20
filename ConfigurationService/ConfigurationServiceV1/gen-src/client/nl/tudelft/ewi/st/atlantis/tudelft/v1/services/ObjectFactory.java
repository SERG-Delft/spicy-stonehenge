
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

    private final static QName _SetBSToOPSResponse_QNAME = new QName("http://atlantis.st.ewi.tudelft.nl/tudelft/v1/services", "setBSToOPSResponse");
    private final static QName _GetClientConfigResponse_QNAME = new QName("http://atlantis.st.ewi.tudelft.nl/tudelft/v1/services", "getClientConfigResponse");
    private final static QName _GetOPSConfigResponse_QNAME = new QName("http://atlantis.st.ewi.tudelft.nl/tudelft/v1/services", "getOPSConfigResponse");
    private final static QName _GetBSLocationsResponse_QNAME = new QName("http://atlantis.st.ewi.tudelft.nl/tudelft/v1/services", "getBSLocationsResponse");
    private final static QName _GetQSLocationsRequest_QNAME = new QName("http://atlantis.st.ewi.tudelft.nl/tudelft/v1/services", "getQSLocationsRequest");
    private final static QName _GetClientConfigRequest_QNAME = new QName("http://atlantis.st.ewi.tudelft.nl/tudelft/v1/services", "getClientConfigRequest");
    private final static QName _GetBSLocationsRequest_QNAME = new QName("http://atlantis.st.ewi.tudelft.nl/tudelft/v1/services", "getBSLocationsRequest");
    private final static QName _GetOPSConfigRequest_QNAME = new QName("http://atlantis.st.ewi.tudelft.nl/tudelft/v1/services", "getOPSConfigRequest");
    private final static QName _GetESLocationsRequest_QNAME = new QName("http://atlantis.st.ewi.tudelft.nl/tudelft/v1/services", "getESLocationsRequest");
    private final static QName _SetClientToBSRequest_QNAME = new QName("http://atlantis.st.ewi.tudelft.nl/tudelft/v1/services", "setClientToBSRequest");
    private final static QName _SetBSToOPSRequest_QNAME = new QName("http://atlantis.st.ewi.tudelft.nl/tudelft/v1/services", "setBSToOPSRequest");
    private final static QName _SetServiceLocationResponse_QNAME = new QName("http://atlantis.st.ewi.tudelft.nl/tudelft/v1/services", "setServiceLocationResponse");
    private final static QName _GetBSConfigRequest_QNAME = new QName("http://atlantis.st.ewi.tudelft.nl/tudelft/v1/services", "getBSConfigRequest");
    private final static QName _GetQSLocations_QNAME = new QName("http://atlantis.st.ewi.tudelft.nl/tudelft/v1/services", "getQSLocations");
    private final static QName _GetBSConfigResponse_QNAME = new QName("http://atlantis.st.ewi.tudelft.nl/tudelft/v1/services", "getBSConfigResponse");
    private final static QName _SetClientToBSResponse_QNAME = new QName("http://atlantis.st.ewi.tudelft.nl/tudelft/v1/services", "setClientToBSResponse");
    private final static QName _GetOPSLocationsRequest_QNAME = new QName("http://atlantis.st.ewi.tudelft.nl/tudelft/v1/services", "getOPSLocationsRequest");
    private final static QName _SetServiceLocationRequest_QNAME = new QName("http://atlantis.st.ewi.tudelft.nl/tudelft/v1/services", "setServiceLocationRequest");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: nl.tudelft.ewi.st.atlantis.tudelft.v1.services
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetOPSConfigResponse }
     * 
     */
    public GetOPSConfigResponse createGetOPSConfigResponse() {
        return new GetOPSConfigResponse();
    }

    /**
     * Create an instance of {@link SetClientToBSResponse }
     * 
     */
    public SetClientToBSResponse createSetClientToBSResponse() {
        return new SetClientToBSResponse();
    }

    /**
     * Create an instance of {@link GetQSLocationsResponse }
     * 
     */
    public GetQSLocationsResponse createGetQSLocationsResponse() {
        return new GetQSLocationsResponse();
    }

    /**
     * Create an instance of {@link SetServiceLocationRequest }
     * 
     */
    public SetServiceLocationRequest createSetServiceLocationRequest() {
        return new SetServiceLocationRequest();
    }

    /**
     * Create an instance of {@link GetOPSConfigRequest }
     * 
     */
    public GetOPSConfigRequest createGetOPSConfigRequest() {
        return new GetOPSConfigRequest();
    }

    /**
     * Create an instance of {@link GetClientConfigRequest }
     * 
     */
    public GetClientConfigRequest createGetClientConfigRequest() {
        return new GetClientConfigRequest();
    }

    /**
     * Create an instance of {@link GetBSConfigRequest }
     * 
     */
    public GetBSConfigRequest createGetBSConfigRequest() {
        return new GetBSConfigRequest();
    }

    /**
     * Create an instance of {@link GetOPSLocations }
     * 
     */
    public GetOPSLocations createGetOPSLocations() {
        return new GetOPSLocations();
    }

    /**
     * Create an instance of {@link GetESLocations }
     * 
     */
    public GetESLocations createGetESLocations() {
        return new GetESLocations();
    }

    /**
     * Create an instance of {@link SetClientToBSRequest }
     * 
     */
    public SetClientToBSRequest createSetClientToBSRequest() {
        return new SetClientToBSRequest();
    }

    /**
     * Create an instance of {@link GetBSConfigResponse }
     * 
     */
    public GetBSConfigResponse createGetBSConfigResponse() {
        return new GetBSConfigResponse();
    }

    /**
     * Create an instance of {@link SetBSToOPSResponse }
     * 
     */
    public SetBSToOPSResponse createSetBSToOPSResponse() {
        return new SetBSToOPSResponse();
    }

    /**
     * Create an instance of {@link GetESLocationsResponse }
     * 
     */
    public GetESLocationsResponse createGetESLocationsResponse() {
        return new GetESLocationsResponse();
    }

    /**
     * Create an instance of {@link GetBSLocationsRequest }
     * 
     */
    public GetBSLocationsRequest createGetBSLocationsRequest() {
        return new GetBSLocationsRequest();
    }

    /**
     * Create an instance of {@link GetBSLocationsResponse }
     * 
     */
    public GetBSLocationsResponse createGetBSLocationsResponse() {
        return new GetBSLocationsResponse();
    }

    /**
     * Create an instance of {@link GetQSLocationsRequest }
     * 
     */
    public GetQSLocationsRequest createGetQSLocationsRequest() {
        return new GetQSLocationsRequest();
    }

    /**
     * Create an instance of {@link GetOPSLocationsResponse }
     * 
     */
    public GetOPSLocationsResponse createGetOPSLocationsResponse() {
        return new GetOPSLocationsResponse();
    }

    /**
     * Create an instance of {@link SetServiceLocationResponse }
     * 
     */
    public SetServiceLocationResponse createSetServiceLocationResponse() {
        return new SetServiceLocationResponse();
    }

    /**
     * Create an instance of {@link SetBSToOPSRequest }
     * 
     */
    public SetBSToOPSRequest createSetBSToOPSRequest() {
        return new SetBSToOPSRequest();
    }

    /**
     * Create an instance of {@link GetESLocationRequest }
     * 
     */
    public GetESLocationRequest createGetESLocationRequest() {
        return new GetESLocationRequest();
    }

    /**
     * Create an instance of {@link GetOPSLocationsRequest }
     * 
     */
    public GetOPSLocationsRequest createGetOPSLocationsRequest() {
        return new GetOPSLocationsRequest();
    }

    /**
     * Create an instance of {@link GetClientConfigResponse }
     * 
     */
    public GetClientConfigResponse createGetClientConfigResponse() {
        return new GetClientConfigResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetBSToOPSResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://atlantis.st.ewi.tudelft.nl/tudelft/v1/services", name = "setBSToOPSResponse")
    public JAXBElement<SetBSToOPSResponse> createSetBSToOPSResponse(SetBSToOPSResponse value) {
        return new JAXBElement<SetBSToOPSResponse>(_SetBSToOPSResponse_QNAME, SetBSToOPSResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetClientConfigResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://atlantis.st.ewi.tudelft.nl/tudelft/v1/services", name = "getClientConfigResponse")
    public JAXBElement<GetClientConfigResponse> createGetClientConfigResponse(GetClientConfigResponse value) {
        return new JAXBElement<GetClientConfigResponse>(_GetClientConfigResponse_QNAME, GetClientConfigResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetOPSConfigResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://atlantis.st.ewi.tudelft.nl/tudelft/v1/services", name = "getOPSConfigResponse")
    public JAXBElement<GetOPSConfigResponse> createGetOPSConfigResponse(GetOPSConfigResponse value) {
        return new JAXBElement<GetOPSConfigResponse>(_GetOPSConfigResponse_QNAME, GetOPSConfigResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetBSLocationsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://atlantis.st.ewi.tudelft.nl/tudelft/v1/services", name = "getBSLocationsResponse")
    public JAXBElement<GetBSLocationsResponse> createGetBSLocationsResponse(GetBSLocationsResponse value) {
        return new JAXBElement<GetBSLocationsResponse>(_GetBSLocationsResponse_QNAME, GetBSLocationsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetQSLocationsRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://atlantis.st.ewi.tudelft.nl/tudelft/v1/services", name = "getQSLocationsRequest")
    public JAXBElement<GetQSLocationsRequest> createGetQSLocationsRequest(GetQSLocationsRequest value) {
        return new JAXBElement<GetQSLocationsRequest>(_GetQSLocationsRequest_QNAME, GetQSLocationsRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetClientConfigRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://atlantis.st.ewi.tudelft.nl/tudelft/v1/services", name = "getClientConfigRequest")
    public JAXBElement<GetClientConfigRequest> createGetClientConfigRequest(GetClientConfigRequest value) {
        return new JAXBElement<GetClientConfigRequest>(_GetClientConfigRequest_QNAME, GetClientConfigRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetBSLocationsRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://atlantis.st.ewi.tudelft.nl/tudelft/v1/services", name = "getBSLocationsRequest")
    public JAXBElement<GetBSLocationsRequest> createGetBSLocationsRequest(GetBSLocationsRequest value) {
        return new JAXBElement<GetBSLocationsRequest>(_GetBSLocationsRequest_QNAME, GetBSLocationsRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetOPSConfigRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://atlantis.st.ewi.tudelft.nl/tudelft/v1/services", name = "getOPSConfigRequest")
    public JAXBElement<GetOPSConfigRequest> createGetOPSConfigRequest(GetOPSConfigRequest value) {
        return new JAXBElement<GetOPSConfigRequest>(_GetOPSConfigRequest_QNAME, GetOPSConfigRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetESLocationRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://atlantis.st.ewi.tudelft.nl/tudelft/v1/services", name = "getESLocationsRequest")
    public JAXBElement<GetESLocationRequest> createGetESLocationsRequest(GetESLocationRequest value) {
        return new JAXBElement<GetESLocationRequest>(_GetESLocationsRequest_QNAME, GetESLocationRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetClientToBSRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://atlantis.st.ewi.tudelft.nl/tudelft/v1/services", name = "setClientToBSRequest")
    public JAXBElement<SetClientToBSRequest> createSetClientToBSRequest(SetClientToBSRequest value) {
        return new JAXBElement<SetClientToBSRequest>(_SetClientToBSRequest_QNAME, SetClientToBSRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetBSToOPSRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://atlantis.st.ewi.tudelft.nl/tudelft/v1/services", name = "setBSToOPSRequest")
    public JAXBElement<SetBSToOPSRequest> createSetBSToOPSRequest(SetBSToOPSRequest value) {
        return new JAXBElement<SetBSToOPSRequest>(_SetBSToOPSRequest_QNAME, SetBSToOPSRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetServiceLocationResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://atlantis.st.ewi.tudelft.nl/tudelft/v1/services", name = "setServiceLocationResponse")
    public JAXBElement<SetServiceLocationResponse> createSetServiceLocationResponse(SetServiceLocationResponse value) {
        return new JAXBElement<SetServiceLocationResponse>(_SetServiceLocationResponse_QNAME, SetServiceLocationResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetBSConfigRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://atlantis.st.ewi.tudelft.nl/tudelft/v1/services", name = "getBSConfigRequest")
    public JAXBElement<GetBSConfigRequest> createGetBSConfigRequest(GetBSConfigRequest value) {
        return new JAXBElement<GetBSConfigRequest>(_GetBSConfigRequest_QNAME, GetBSConfigRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetQSLocationsRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://atlantis.st.ewi.tudelft.nl/tudelft/v1/services", name = "getQSLocations")
    public JAXBElement<GetQSLocationsRequest> createGetQSLocations(GetQSLocationsRequest value) {
        return new JAXBElement<GetQSLocationsRequest>(_GetQSLocations_QNAME, GetQSLocationsRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetBSConfigResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://atlantis.st.ewi.tudelft.nl/tudelft/v1/services", name = "getBSConfigResponse")
    public JAXBElement<GetBSConfigResponse> createGetBSConfigResponse(GetBSConfigResponse value) {
        return new JAXBElement<GetBSConfigResponse>(_GetBSConfigResponse_QNAME, GetBSConfigResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetClientToBSResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://atlantis.st.ewi.tudelft.nl/tudelft/v1/services", name = "setClientToBSResponse")
    public JAXBElement<SetClientToBSResponse> createSetClientToBSResponse(SetClientToBSResponse value) {
        return new JAXBElement<SetClientToBSResponse>(_SetClientToBSResponse_QNAME, SetClientToBSResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetOPSLocationsRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://atlantis.st.ewi.tudelft.nl/tudelft/v1/services", name = "getOPSLocationsRequest")
    public JAXBElement<GetOPSLocationsRequest> createGetOPSLocationsRequest(GetOPSLocationsRequest value) {
        return new JAXBElement<GetOPSLocationsRequest>(_GetOPSLocationsRequest_QNAME, GetOPSLocationsRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetServiceLocationRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://atlantis.st.ewi.tudelft.nl/tudelft/v1/services", name = "setServiceLocationRequest")
    public JAXBElement<SetServiceLocationRequest> createSetServiceLocationRequest(SetServiceLocationRequest value) {
        return new JAXBElement<SetServiceLocationRequest>(_SetServiceLocationRequest_QNAME, SetServiceLocationRequest.class, null, value);
    }

}
