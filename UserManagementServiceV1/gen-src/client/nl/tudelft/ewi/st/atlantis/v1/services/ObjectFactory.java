
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

    private final static QName _LogoutResponse_QNAME = new QName("http://atlantis.st.ewi.tudelft.nl/v1/services", "logoutResponse");
    private final static QName _GetAccountProfileDataRequest_QNAME = new QName("http://atlantis.st.ewi.tudelft.nl/v1/services", "getAccountProfileDataRequest");
    private final static QName _RegisterResponse_QNAME = new QName("http://atlantis.st.ewi.tudelft.nl/v1/services", "registerResponse");
    private final static QName _UpdateAccountProfileRequest_QNAME = new QName("http://atlantis.st.ewi.tudelft.nl/v1/services", "updateAccountProfileRequest");
    private final static QName _RegisterRequest_QNAME = new QName("http://atlantis.st.ewi.tudelft.nl/v1/services", "registerRequest");
    private final static QName _GetWalletDataRequest_QNAME = new QName("http://atlantis.st.ewi.tudelft.nl/v1/services", "getWalletDataRequest");
    private final static QName _LoginRequest_QNAME = new QName("http://atlantis.st.ewi.tudelft.nl/v1/services", "loginRequest");
    private final static QName _UpdateAccountProfileResponse_QNAME = new QName("http://atlantis.st.ewi.tudelft.nl/v1/services", "updateAccountProfileResponse");
    private final static QName _LogoutRequest_QNAME = new QName("http://atlantis.st.ewi.tudelft.nl/v1/services", "logoutRequest");
    private final static QName _UpdateWalletDataRequest_QNAME = new QName("http://atlantis.st.ewi.tudelft.nl/v1/services", "updateWalletDataRequest");
    private final static QName _GetAccountProfileDataResponse_QNAME = new QName("http://atlantis.st.ewi.tudelft.nl/v1/services", "getAccountProfileDataResponse");
    private final static QName _GetWalletDataResponse_QNAME = new QName("http://atlantis.st.ewi.tudelft.nl/v1/services", "getWalletDataResponse");
    private final static QName _LoginResponse_QNAME = new QName("http://atlantis.st.ewi.tudelft.nl/v1/services", "loginResponse");
    private final static QName _UpdateWalletDataResponse_QNAME = new QName("http://atlantis.st.ewi.tudelft.nl/v1/services", "updateWalletDataResponse");
    private final static QName _GetAccountDataResponse_QNAME = new QName("http://atlantis.st.ewi.tudelft.nl/v1/services", "getAccountDataResponse");
    private final static QName _GetAccountDataRequest_QNAME = new QName("http://atlantis.st.ewi.tudelft.nl/v1/services", "getAccountDataRequest");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: nl.tudelft.ewi.st.atlantis.v1.services
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link UpdateAccountProfileResponse }
     * 
     */
    public UpdateAccountProfileResponse createUpdateAccountProfileResponse() {
        return new UpdateAccountProfileResponse();
    }

    /**
     * Create an instance of {@link UpdateAccountProfileRequest }
     * 
     */
    public UpdateAccountProfileRequest createUpdateAccountProfileRequest() {
        return new UpdateAccountProfileRequest();
    }

    /**
     * Create an instance of {@link GetAccountDataRequest }
     * 
     */
    public GetAccountDataRequest createGetAccountDataRequest() {
        return new GetAccountDataRequest();
    }

    /**
     * Create an instance of {@link RegisterResponse }
     * 
     */
    public RegisterResponse createRegisterResponse() {
        return new RegisterResponse();
    }

    /**
     * Create an instance of {@link RegisterRequest }
     * 
     */
    public RegisterRequest createRegisterRequest() {
        return new RegisterRequest();
    }

    /**
     * Create an instance of {@link LogoutRequest }
     * 
     */
    public LogoutRequest createLogoutRequest() {
        return new LogoutRequest();
    }

    /**
     * Create an instance of {@link LoginResponse }
     * 
     */
    public LoginResponse createLoginResponse() {
        return new LoginResponse();
    }

    /**
     * Create an instance of {@link LoginRequest }
     * 
     */
    public LoginRequest createLoginRequest() {
        return new LoginRequest();
    }

    /**
     * Create an instance of {@link GetAccountProfileDataResponse }
     * 
     */
    public GetAccountProfileDataResponse createGetAccountProfileDataResponse() {
        return new GetAccountProfileDataResponse();
    }

    /**
     * Create an instance of {@link UpdateWalletDataRequest }
     * 
     */
    public UpdateWalletDataRequest createUpdateWalletDataRequest() {
        return new UpdateWalletDataRequest();
    }

    /**
     * Create an instance of {@link GetWalletDataResponse }
     * 
     */
    public GetWalletDataResponse createGetWalletDataResponse() {
        return new GetWalletDataResponse();
    }

    /**
     * Create an instance of {@link GetWalletDataRequest }
     * 
     */
    public GetWalletDataRequest createGetWalletDataRequest() {
        return new GetWalletDataRequest();
    }

    /**
     * Create an instance of {@link GetAccountProfileDataRequest }
     * 
     */
    public GetAccountProfileDataRequest createGetAccountProfileDataRequest() {
        return new GetAccountProfileDataRequest();
    }

    /**
     * Create an instance of {@link GetAccountDataResponse }
     * 
     */
    public GetAccountDataResponse createGetAccountDataResponse() {
        return new GetAccountDataResponse();
    }

    /**
     * Create an instance of {@link UpdateWalletDataResponse }
     * 
     */
    public UpdateWalletDataResponse createUpdateWalletDataResponse() {
        return new UpdateWalletDataResponse();
    }

    /**
     * Create an instance of {@link LogoutResponse }
     * 
     */
    public LogoutResponse createLogoutResponse() {
        return new LogoutResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LogoutResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://atlantis.st.ewi.tudelft.nl/v1/services", name = "logoutResponse")
    public JAXBElement<LogoutResponse> createLogoutResponse(LogoutResponse value) {
        return new JAXBElement<LogoutResponse>(_LogoutResponse_QNAME, LogoutResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAccountProfileDataRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://atlantis.st.ewi.tudelft.nl/v1/services", name = "getAccountProfileDataRequest")
    public JAXBElement<GetAccountProfileDataRequest> createGetAccountProfileDataRequest(GetAccountProfileDataRequest value) {
        return new JAXBElement<GetAccountProfileDataRequest>(_GetAccountProfileDataRequest_QNAME, GetAccountProfileDataRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegisterResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://atlantis.st.ewi.tudelft.nl/v1/services", name = "registerResponse")
    public JAXBElement<RegisterResponse> createRegisterResponse(RegisterResponse value) {
        return new JAXBElement<RegisterResponse>(_RegisterResponse_QNAME, RegisterResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateAccountProfileRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://atlantis.st.ewi.tudelft.nl/v1/services", name = "updateAccountProfileRequest")
    public JAXBElement<UpdateAccountProfileRequest> createUpdateAccountProfileRequest(UpdateAccountProfileRequest value) {
        return new JAXBElement<UpdateAccountProfileRequest>(_UpdateAccountProfileRequest_QNAME, UpdateAccountProfileRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegisterRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://atlantis.st.ewi.tudelft.nl/v1/services", name = "registerRequest")
    public JAXBElement<RegisterRequest> createRegisterRequest(RegisterRequest value) {
        return new JAXBElement<RegisterRequest>(_RegisterRequest_QNAME, RegisterRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetWalletDataRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://atlantis.st.ewi.tudelft.nl/v1/services", name = "getWalletDataRequest")
    public JAXBElement<GetWalletDataRequest> createGetWalletDataRequest(GetWalletDataRequest value) {
        return new JAXBElement<GetWalletDataRequest>(_GetWalletDataRequest_QNAME, GetWalletDataRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LoginRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://atlantis.st.ewi.tudelft.nl/v1/services", name = "loginRequest")
    public JAXBElement<LoginRequest> createLoginRequest(LoginRequest value) {
        return new JAXBElement<LoginRequest>(_LoginRequest_QNAME, LoginRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateAccountProfileResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://atlantis.st.ewi.tudelft.nl/v1/services", name = "updateAccountProfileResponse")
    public JAXBElement<UpdateAccountProfileResponse> createUpdateAccountProfileResponse(UpdateAccountProfileResponse value) {
        return new JAXBElement<UpdateAccountProfileResponse>(_UpdateAccountProfileResponse_QNAME, UpdateAccountProfileResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LogoutRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://atlantis.st.ewi.tudelft.nl/v1/services", name = "logoutRequest")
    public JAXBElement<LogoutRequest> createLogoutRequest(LogoutRequest value) {
        return new JAXBElement<LogoutRequest>(_LogoutRequest_QNAME, LogoutRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateWalletDataRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://atlantis.st.ewi.tudelft.nl/v1/services", name = "updateWalletDataRequest")
    public JAXBElement<UpdateWalletDataRequest> createUpdateWalletDataRequest(UpdateWalletDataRequest value) {
        return new JAXBElement<UpdateWalletDataRequest>(_UpdateWalletDataRequest_QNAME, UpdateWalletDataRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAccountProfileDataResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://atlantis.st.ewi.tudelft.nl/v1/services", name = "getAccountProfileDataResponse")
    public JAXBElement<GetAccountProfileDataResponse> createGetAccountProfileDataResponse(GetAccountProfileDataResponse value) {
        return new JAXBElement<GetAccountProfileDataResponse>(_GetAccountProfileDataResponse_QNAME, GetAccountProfileDataResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetWalletDataResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://atlantis.st.ewi.tudelft.nl/v1/services", name = "getWalletDataResponse")
    public JAXBElement<GetWalletDataResponse> createGetWalletDataResponse(GetWalletDataResponse value) {
        return new JAXBElement<GetWalletDataResponse>(_GetWalletDataResponse_QNAME, GetWalletDataResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LoginResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://atlantis.st.ewi.tudelft.nl/v1/services", name = "loginResponse")
    public JAXBElement<LoginResponse> createLoginResponse(LoginResponse value) {
        return new JAXBElement<LoginResponse>(_LoginResponse_QNAME, LoginResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateWalletDataResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://atlantis.st.ewi.tudelft.nl/v1/services", name = "updateWalletDataResponse")
    public JAXBElement<UpdateWalletDataResponse> createUpdateWalletDataResponse(UpdateWalletDataResponse value) {
        return new JAXBElement<UpdateWalletDataResponse>(_UpdateWalletDataResponse_QNAME, UpdateWalletDataResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAccountDataResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://atlantis.st.ewi.tudelft.nl/v1/services", name = "getAccountDataResponse")
    public JAXBElement<GetAccountDataResponse> createGetAccountDataResponse(GetAccountDataResponse value) {
        return new JAXBElement<GetAccountDataResponse>(_GetAccountDataResponse_QNAME, GetAccountDataResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAccountDataRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://atlantis.st.ewi.tudelft.nl/v1/services", name = "getAccountDataRequest")
    public JAXBElement<GetAccountDataRequest> createGetAccountDataRequest(GetAccountDataRequest value) {
        return new JAXBElement<GetAccountDataRequest>(_GetAccountDataRequest_QNAME, GetAccountDataRequest.class, null, value);
    }

}
