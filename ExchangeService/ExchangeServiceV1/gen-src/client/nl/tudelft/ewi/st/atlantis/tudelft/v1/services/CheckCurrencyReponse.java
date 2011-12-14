
package nl.tudelft.ewi.st.atlantis.tudelft.v1.services;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for checkCurrencyReponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="checkCurrencyReponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="currencyExist" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "checkCurrencyReponse", propOrder = {
    "currencyExist"
})
public class CheckCurrencyReponse {

    protected boolean currencyExist;

    /**
     * Gets the value of the currencyExist property.
     * 
     */
    public boolean isCurrencyExist() {
        return currencyExist;
    }

    /**
     * Sets the value of the currencyExist property.
     * 
     */
    public void setCurrencyExist(boolean value) {
        this.currencyExist = value;
    }

}
