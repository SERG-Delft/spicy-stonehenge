
package nl.tudelft.ewi.st.atlantis.tudelft.v1.services;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.ebayopensource.turmeric.common.v1.types.BaseRequest;


/**
 * 
 * 						Document goes here
 * 					
 * 
 * <p>Java class for ExchangeCurrencyRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ExchangeCurrencyRequest">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.ebayopensource.org/turmeric/common/v1/types}BaseRequest">
 *       &lt;sequence>
 *         &lt;element name="baseCurrency" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="aimCurrency" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="exchAmount" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExchangeCurrencyRequest", propOrder = {
    "baseCurrency",
    "aimCurrency",
    "exchAmount"
})
public class ExchangeCurrencyRequest
    extends BaseRequest
{

    @XmlElement(required = true)
    protected String baseCurrency;
    @XmlElement(required = true)
    protected String aimCurrency;
    protected double exchAmount;

    /**
     * Gets the value of the baseCurrency property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBaseCurrency() {
        return baseCurrency;
    }

    /**
     * Sets the value of the baseCurrency property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBaseCurrency(String value) {
        this.baseCurrency = value;
    }

    /**
     * Gets the value of the aimCurrency property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAimCurrency() {
        return aimCurrency;
    }

    /**
     * Sets the value of the aimCurrency property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAimCurrency(String value) {
        this.aimCurrency = value;
    }

    /**
     * Gets the value of the exchAmount property.
     * 
     */
    public double getExchAmount() {
        return exchAmount;
    }

    /**
     * Sets the value of the exchAmount property.
     * 
     */
    public void setExchAmount(double value) {
        this.exchAmount = value;
    }

}
