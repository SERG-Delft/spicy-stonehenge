
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
 *         &lt;element name="baseType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="aimType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="exchAmount" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    "baseType",
    "aimType",
    "exchAmount"
})
@XmlRootElement(name = "exchangeCurrency")
public class ExchangeCurrency {

    @XmlElement(required = true)
    protected String baseType;
    @XmlElement(required = true)
    protected String aimType;
    protected int exchAmount;

    /**
     * Gets the value of the baseType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBaseType() {
        return baseType;
    }

    /**
     * Sets the value of the baseType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBaseType(String value) {
        this.baseType = value;
    }

    /**
     * Gets the value of the aimType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAimType() {
        return aimType;
    }

    /**
     * Sets the value of the aimType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAimType(String value) {
        this.aimType = value;
    }

    /**
     * Gets the value of the exchAmount property.
     * 
     */
    public int getExchAmount() {
        return exchAmount;
    }

    /**
     * Sets the value of the exchAmount property.
     * 
     */
    public void setExchAmount(int value) {
        this.exchAmount = value;
    }

}
