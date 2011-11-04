
package nl.tudelft.ewi.st.atlantis.tudelft.v1.services;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import nl.tudelft.ewi.st.atlantis.tudelft.v1.types.WalletData;


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
 *         &lt;element name="newWalletData" type="{http://atlantis.st.ewi.tudelft.nl/tudelft/v1/types}WalletData"/>
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
    "newWalletData"
})
@XmlRootElement(name = "updateWalletResponse")
public class UpdateWalletResponse {

    @XmlElement(required = true)
    protected WalletData newWalletData;

    /**
     * Gets the value of the newWalletData property.
     * 
     * @return
     *     possible object is
     *     {@link WalletData }
     *     
     */
    public WalletData getNewWalletData() {
        return newWalletData;
    }

    /**
     * Sets the value of the newWalletData property.
     * 
     * @param value
     *     allowed object is
     *     {@link WalletData }
     *     
     */
    public void setNewWalletData(WalletData value) {
        this.newWalletData = value;
    }

}
