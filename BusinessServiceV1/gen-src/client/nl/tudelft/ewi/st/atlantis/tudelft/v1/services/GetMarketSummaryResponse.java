
package nl.tudelft.ewi.st.atlantis.tudelft.v1.services;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import nl.tudelft.ewi.st.atlantis.tudelft.v1.types.MarketSummaryData;
import org.ebayopensource.turmeric.common.v1.types.BaseResponse;


/**
 * 
 * 						Document goes here
 * 					
 * 
 * <p>Java class for GetMarketSummaryResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetMarketSummaryResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.ebayopensource.org/turmeric/common/v1/types}BaseResponse">
 *       &lt;sequence>
 *         &lt;element name="marketSummaryData" type="{http://atlantis.st.ewi.tudelft.nl/tudelft/v1/types}MarketSummaryData"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetMarketSummaryResponse", propOrder = {
    "marketSummaryData"
})
public class GetMarketSummaryResponse
    extends BaseResponse
{

    @XmlElement(required = true)
    protected MarketSummaryData marketSummaryData;

    /**
     * Gets the value of the marketSummaryData property.
     * 
     * @return
     *     possible object is
     *     {@link MarketSummaryData }
     *     
     */
    public MarketSummaryData getMarketSummaryData() {
        return marketSummaryData;
    }

    /**
     * Sets the value of the marketSummaryData property.
     * 
     * @param value
     *     allowed object is
     *     {@link MarketSummaryData }
     *     
     */
    public void setMarketSummaryData(MarketSummaryData value) {
        this.marketSummaryData = value;
    }

}
