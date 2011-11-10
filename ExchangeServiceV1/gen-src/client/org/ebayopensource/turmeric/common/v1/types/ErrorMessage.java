
package org.ebayopensource.turmeric.common.v1.types;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 						Documentation goes here
 * 					
 * 
 * <p>Java class for ErrorMessage complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ErrorMessage">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="error" type="{http://www.ebayopensource.org/turmeric/common/v1/types}CommonErrorData" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ErrorMessage", propOrder = {
    "error"
})
public class ErrorMessage {

    protected List<CommonErrorData> error;

    /**
     * Gets the value of the error property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the error property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getError().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CommonErrorData }
     * 
     * 
     */
    public List<CommonErrorData> getError() {
        if (error == null) {
            error = new ArrayList<CommonErrorData>();
        }
        return this.error;
    }

}
