
package nl.tudelft.ewi.st.atlantis.tudelft.v1.services;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="exchResult" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "exchResult"
})
@XmlRootElement(name = "exchangeCurrencyResponse")
public class ExchangeCurrencyResponse {

    @XmlElement(required = true)
    protected String exchResult;

    /**
     * Gets the value of the exchResult property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExchResult() {
        return exchResult;
    }

    /**
     * Sets the value of the exchResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExchResult(String value) {
        this.exchResult = value;
    }

}
