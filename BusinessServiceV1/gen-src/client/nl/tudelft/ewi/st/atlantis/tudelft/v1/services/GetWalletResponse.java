
package nl.tudelft.ewi.st.atlantis.tudelft.v1.services;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import nl.tudelft.ewi.st.atlantis.tudelft.v1.types.WalletData;


/**
 * <p>Java class for GetWalletResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetWalletResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="wallet" type="{http://atlantis.st.ewi.tudelft.nl/tudelft/v1/types}WalletData"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetWalletResponse", propOrder = {
    "wallet"
})
public class GetWalletResponse {

    @XmlElement(required = true)
    protected WalletData wallet;

    /**
     * Gets the value of the wallet property.
     * 
     * @return
     *     possible object is
     *     {@link WalletData }
     *     
     */
    public WalletData getWallet() {
        return wallet;
    }

    /**
     * Sets the value of the wallet property.
     * 
     * @param value
     *     allowed object is
     *     {@link WalletData }
     *     
     */
    public void setWallet(WalletData value) {
        this.wallet = value;
    }

}
