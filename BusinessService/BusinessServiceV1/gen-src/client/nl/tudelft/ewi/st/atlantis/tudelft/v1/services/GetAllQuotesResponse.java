
package nl.tudelft.ewi.st.atlantis.tudelft.v1.services;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import nl.tudelft.ewi.st.atlantis.tudelft.v1.types.QuoteData;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="quotes" type="{http://atlantis.st.ewi.tudelft.nl/tudelft/v1/types}QuoteData" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "quotes"
})
@XmlRootElement(name = "getAllQuotesResponse")
public class GetAllQuotesResponse {

    protected List<QuoteData> quotes;

    /**
     * Gets the value of the quotes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the quotes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getQuotes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link QuoteData }
     * 
     * 
     */
    public List<QuoteData> getQuotes() {
        if (quotes == null) {
            quotes = new ArrayList<QuoteData>();
        }
        return this.quotes;
    }

}
