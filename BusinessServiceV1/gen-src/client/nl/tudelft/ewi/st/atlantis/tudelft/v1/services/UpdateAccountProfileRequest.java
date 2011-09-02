
package nl.tudelft.ewi.st.atlantis.tudelft.v1.services;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import nl.tudelft.ewi.st.atlantis.tudelft.v1.types.AccountProfileData;
import org.ebayopensource.turmeric.common.v1.types.BaseRequest;


/**
 * 
 * 						Document goes here
 * 					
 * 
 * <p>Java class for UpdateAccountProfileRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UpdateAccountProfileRequest">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.ebayopensource.org/turmeric/common/v1/types}BaseRequest">
 *       &lt;sequence>
 *         &lt;element name="accountProfileData" type="{http://atlantis.st.ewi.tudelft.nl/tudelft/v1/types}AccountProfileData"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UpdateAccountProfileRequest", propOrder = {
    "accountProfileData"
})
public class UpdateAccountProfileRequest
    extends BaseRequest
{

    @XmlElement(required = true)
    protected AccountProfileData accountProfileData;

    /**
     * Gets the value of the accountProfileData property.
     * 
     * @return
     *     possible object is
     *     {@link AccountProfileData }
     *     
     */
    public AccountProfileData getAccountProfileData() {
        return accountProfileData;
    }

    /**
     * Sets the value of the accountProfileData property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountProfileData }
     *     
     */
    public void setAccountProfileData(AccountProfileData value) {
        this.accountProfileData = value;
    }

}
