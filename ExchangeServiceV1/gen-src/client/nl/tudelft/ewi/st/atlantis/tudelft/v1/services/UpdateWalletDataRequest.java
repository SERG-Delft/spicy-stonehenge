
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
 *         &lt;element name="userID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="fromCurrency" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="toCurrency" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="fromAmount" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="toAmount" type="{http://www.w3.org/2001/XMLSchema}double"/>
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
    "userID",
    "fromCurrency",
    "toCurrency",
    "fromAmount",
    "toAmount"
})
@XmlRootElement(name = "updateWalletDataRequest")
public class UpdateWalletDataRequest {

    @XmlElement(required = true)
    protected String userID;
    @XmlElement(required = true)
    protected String fromCurrency;
    @XmlElement(required = true)
    protected String toCurrency;
    protected double fromAmount;
    protected double toAmount;

    /**
     * Gets the value of the userID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserID() {
        return userID;
    }

    /**
     * Sets the value of the userID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserID(String value) {
        this.userID = value;
    }

    /**
     * Gets the value of the fromCurrency property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFromCurrency() {
        return fromCurrency;
    }

    /**
     * Sets the value of the fromCurrency property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFromCurrency(String value) {
        this.fromCurrency = value;
    }

    /**
     * Gets the value of the toCurrency property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getToCurrency() {
        return toCurrency;
    }

    /**
     * Sets the value of the toCurrency property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setToCurrency(String value) {
        this.toCurrency = value;
    }

    /**
     * Gets the value of the fromAmount property.
     * 
     */
    public double getFromAmount() {
        return fromAmount;
    }

    /**
     * Sets the value of the fromAmount property.
     * 
     */
    public void setFromAmount(double value) {
        this.fromAmount = value;
    }

    /**
     * Gets the value of the toAmount property.
     * 
     */
    public double getToAmount() {
        return toAmount;
    }

    /**
     * Sets the value of the toAmount property.
     * 
     */
    public void setToAmount(double value) {
        this.toAmount = value;
    }

}
