
package nl.tudelft.ewi.st.atlantis.tudelft.v1.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ServiceLocation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ServiceLocation">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ServiceURL" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ServiceName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Sec" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ServiceLocation", propOrder = {
    "serviceURL",
    "serviceName",
    "sec"
})
public class ServiceLocation {

    @XmlElement(name = "ServiceURL", required = true)
    protected String serviceURL;
    @XmlElement(name = "ServiceName", required = true)
    protected String serviceName;
    @XmlElement(name = "Sec")
    protected boolean sec;

    /**
     * Gets the value of the serviceURL property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceURL() {
        return serviceURL;
    }

    /**
     * Sets the value of the serviceURL property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceURL(String value) {
        this.serviceURL = value;
    }

    /**
     * Gets the value of the serviceName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceName() {
        return serviceName;
    }

    /**
     * Sets the value of the serviceName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceName(String value) {
        this.serviceName = value;
    }

    /**
     * Gets the value of the sec property.
     * 
     */
    public boolean isSec() {
        return sec;
    }

    /**
     * Sets the value of the sec property.
     * 
     */
    public void setSec(boolean value) {
        this.sec = value;
    }

}