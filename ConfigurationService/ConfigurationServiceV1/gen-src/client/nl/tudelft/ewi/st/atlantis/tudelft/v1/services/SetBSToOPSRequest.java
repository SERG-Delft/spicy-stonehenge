
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
 * <p>Java class for SetBSToOPSRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SetBSToOPSRequest">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.ebayopensource.org/turmeric/common/v1/types}BaseRequest">
 *       &lt;sequence>
 *         &lt;element name="Bs" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Ops" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SetBSToOPSRequest", propOrder = {
    "bs",
    "ops"
})
public class SetBSToOPSRequest
    extends BaseRequest
{

    @XmlElement(name = "Bs", required = true)
    protected String bs;
    @XmlElement(name = "Ops", required = true)
    protected String ops;

    /**
     * Gets the value of the bs property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBs() {
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
    public void setBs(String value) {
        this.bs = value;
    }

    /**
     * Gets the value of the ops property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOps() {
        return ops;
    }

    /**
     * Sets the value of the ops property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOps(String value) {
        this.ops = value;
    }

}
