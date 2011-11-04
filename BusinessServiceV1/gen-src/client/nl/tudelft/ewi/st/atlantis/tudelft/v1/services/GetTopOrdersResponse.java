
package nl.tudelft.ewi.st.atlantis.tudelft.v1.services;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import nl.tudelft.ewi.st.atlantis.tudelft.v1.types.OrderData;
import org.ebayopensource.turmeric.common.v1.types.BaseResponse;


/**
 * 
 * 						Document goes here
 * 					
 * 
 * <p>Java class for GetTopOrdersResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetTopOrdersResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.ebayopensource.org/turmeric/common/v1/types}BaseResponse">
 *       &lt;sequence>
 *         &lt;element name="orderData" type="{http://atlantis.st.ewi.tudelft.nl/tudelft/v1/types}OrderData" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetTopOrdersResponse", propOrder = {
    "orderData"
})
public class GetTopOrdersResponse
    extends BaseResponse
{

    protected List<OrderData> orderData;

    /**
     * Gets the value of the orderData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the orderData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOrderData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OrderData }
     * 
     * 
     */
    public List<OrderData> getOrderData() {
        if (orderData == null) {
            orderData = new ArrayList<OrderData>();
        }
        return this.orderData;
    }

}
