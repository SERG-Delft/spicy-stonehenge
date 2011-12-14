
package nl.tudelft.ewi.st.atlantis.tudelft.v1.services;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.ebayopensource.turmeric.common.v1.types.BaseResponse;


/**
 * 
 * 						Document goes here
 * 					
 * 
 * <p>Java class for GetClientConfigResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetClientConfigResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.ebayopensource.org/turmeric/common/v1/types}BaseResponse">
 *       &lt;sequence>
 *         &lt;element name="BS" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="BSName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Sec" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetClientConfigResponse", propOrder = {
    "bs",
    "bsName",
    "sec"
})
public class GetClientConfigResponse
    extends BaseResponse
{

    @XmlElement(name = "BS", required = true)
    protected String bs;
    @XmlElement(name = "BSName", required = true)
    protected String bsName;
    @XmlElement(name = "Sec")
    protected boolean sec;

    /**
     * Gets the value of the bs property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBS() {
        return bs;
    }

    /**
     * Sets the value of the bs property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBS(String value) {
        this.bs = value;
    }

    /**
     * Gets the value of the bsName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBSName() {
        return bsName;
    }

    /**
     * Sets the value of the bsName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBSName(String value) {
        this.bsName = value;
    }

    /**
     * Gets the value of the sec property.
     * 
     */
    public boolean isSec() {
        return sec;
    }

    /**
     * Sets the value of the sec property.
     * 
     */
    public void setSec(boolean value) {
        this.sec = value;
    }

}
