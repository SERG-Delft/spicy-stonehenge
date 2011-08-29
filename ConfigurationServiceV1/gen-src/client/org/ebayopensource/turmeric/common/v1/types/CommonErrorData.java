
package org.ebayopensource.turmeric.common.v1.types;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.w3c.dom.Element;


/**
 * 
 * 						Documentation goes here
 * 					
 * 
 * <p>Java class for CommonErrorData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CommonErrorData">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.ebayopensource.org/turmeric/common/v1/types}ErrorData">
 *       &lt;sequence>
 *         &lt;element name="errorName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="cause" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="resolution" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="errorGroups" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="organization" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;any/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CommonErrorData", propOrder = {
    "errorName",
    "cause",
    "resolution",
    "errorGroups",
    "organization",
    "any"
})
public class CommonErrorData
    extends ErrorData
{

    @XmlElement(required = true)
    protected String errorName;
    protected String cause;
    protected String resolution;
    protected String errorGroups;
    @XmlElement(required = true)
    protected String organization;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the errorName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getErrorName() {
        return errorName;
    }

    /**
     * Sets the value of the errorName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setErrorName(String value) {
        this.errorName = value;
    }

    /**
     * Gets the value of the cause property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCause() {
        return cause;
    }

    /**
     * Sets the value of the cause property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCause(String value) {
        this.cause = value;
    }

    /**
     * Gets the value of the resolution property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResolution() {
        return resolution;
    }

    /**
     * Sets the value of the resolution property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResolution(String value) {
        this.resolution = value;
    }

    /**
     * Gets the value of the errorGroups property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getErrorGroups() {
        return errorGroups;
    }

    /**
     * Sets the value of the errorGroups property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setErrorGroups(String value) {
        this.errorGroups = value;
    }

    /**
     * Gets the value of the organization property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrganization() {
        return organization;
    }

    /**
     * Sets the value of the organization property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrganization(String value) {
        this.organization = value;
    }

    /**
     * Gets the value of the any property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the any property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAny().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Element }
     * {@link Object }
     * 
     * 
     */
    public List<Object> getAny() {
        if (any == null) {
            any = new ArrayList<Object>();
        }
        return this.any;
    }

}
