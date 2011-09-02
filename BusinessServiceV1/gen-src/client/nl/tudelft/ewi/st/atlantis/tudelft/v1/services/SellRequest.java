
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
 * <p>Java class for SellRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SellRequest">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.ebayopensource.org/turmeric/common/v1/types}BaseRequest">
 *       &lt;sequence>
 *         &lt;element name="userID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="holdingID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="orderProcessingMode" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SellRequest", propOrder = {
    "userID",
    "holdingID",
    "orderProcessingMode"
})
public class SellRequest
    extends BaseRequest
{

    @XmlElement(required = true)
    protected String userID;
    protected int holdingID;
    protected int orderProcessingMode;

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
     * Gets the value of the holdingID property.
     * 
     */
    public int getHoldingID() {
        return holdingID;
    }

    /**
     * Sets the value of the holdingID property.
     * 
     */
    public void setHoldingID(int value) {
        this.holdingID = value;
    }

    /**
     * Gets the value of the orderProcessingMode property.
     * 
     */
    public int getOrderProcessingMode() {
        return orderProcessingMode;
    }

    /**
     * Sets the value of the orderProcessingMode property.
     * 
     */
    public void setOrderProcessingMode(int value) {
        this.orderProcessingMode = value;
    }

}
