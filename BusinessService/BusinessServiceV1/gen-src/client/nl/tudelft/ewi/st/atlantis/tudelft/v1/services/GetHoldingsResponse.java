
package nl.tudelft.ewi.st.atlantis.tudelft.v1.services;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import nl.tudelft.ewi.st.atlantis.tudelft.v1.types.HoldingData;
import org.ebayopensource.turmeric.common.v1.types.BaseResponse;


/**
 * 
 * 						Document goes here
 * 					
 * 
 * <p>Java class for GetHoldingsResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetHoldingsResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.ebayopensource.org/turmeric/common/v1/types}BaseResponse">
 *       &lt;sequence>
 *         &lt;element name="holdingData" type="{http://atlantis.st.ewi.tudelft.nl/tudelft/v1/types}HoldingData" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetHoldingsResponse", propOrder = {
    "holdingData"
})
public class GetHoldingsResponse
    extends BaseResponse
{

    protected List<HoldingData> holdingData;

    /**
     * Gets the value of the holdingData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the holdingData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHoldingData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HoldingData }
     * 
     * 
     */
    public List<HoldingData> getHoldingData() {
        if (holdingData == null) {
            holdingData = new ArrayList<HoldingData>();
        }
        return this.holdingData;
    }

}
