
package nl.tudelft.ewi.st.atlantis.tudelft.v1.services;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import nl.tudelft.ewi.st.atlantis.tudelft.v1.types.ServiceLocation;
import org.ebayopensource.turmeric.common.v1.types.BaseRequest;


/**
 * 
 * 						Document goes here
 * 					
 * 
 * <p>Java class for SetServiceLocationRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SetServiceLocationRequest">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.ebayopensource.org/turmeric/common/v1/types}BaseRequest">
 *       &lt;sequence>
 *         &lt;element name="location" type="{http://atlantis.st.ewi.tudelft.nl/tudelft/v1/types}ServiceLocation"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SetServiceLocationRequest", propOrder = {
    "location"
})
public class SetServiceLocationRequest
    extends BaseRequest
{

    @XmlElement(required = true)
    protected ServiceLocation location;

    /**
     * Gets the value of the location property.
     * 
     * @return
     *     possible object is
     *     {@link ServiceLocation }
     *     
     */
    public ServiceLocation getLocation() {
        return location;
    }

    /**
     * Sets the value of the location property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceLocation }
     *     
     */
    public void setLocation(ServiceLocation value) {
        this.location = value;
    }

}
