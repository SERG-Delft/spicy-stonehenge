
package nl.tudelft.ewi.st.atlantis.tudelft.v1.services;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import nl.tudelft.ewi.st.atlantis.tudelft.v1.types.HoldingData;
import org.ebayopensource.turmeric.common.v1.types.BaseResponse;


/**
 * 
 * 						Document goes here
 * 					
 * 
 * <p>Java class for GetHoldingResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetHoldingResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.ebayopensource.org/turmeric/common/v1/types}BaseResponse">
 *       &lt;sequence>
 *         &lt;element name="holdingData" type="{http://atlantis.st.ewi.tudelft.nl/tudelft/v1/types}HoldingData"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetHoldingResponse", propOrder = {
    "holdingData"
})
public class GetHoldingResponse
    extends BaseResponse
{

    @XmlElement(required = true)
    protected HoldingData holdingData;

    /**
     * Gets the value of the holdingData property.
     * 
     * @return
     *     possible object is
     *     {@link HoldingData }
     *     
     */
    public HoldingData getHoldingData() {
        return holdingData;
    }

    /**
     * Sets the value of the holdingData property.
     * 
     * @param value
     *     allowed object is
     *     {@link HoldingData }
     *     
     */
    public void setHoldingData(HoldingData value) {
        this.holdingData = value;
    }

}
