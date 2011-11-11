
package nl.tudelft.ewi.st.atlantis.tudelft.v1.types;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for MarketSummaryData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MarketSummaryData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="summaryDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="topLosers" type="{http://atlantis.st.ewi.tudelft.nl/tudelft/v1/types}QuoteData" maxOccurs="unbounded"/>
 *         &lt;element name="topGainers" type="{http://atlantis.st.ewi.tudelft.nl/tudelft/v1/types}QuoteData" maxOccurs="unbounded"/>
 *         &lt;element name="volume" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="openTSIA" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="TSIA" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MarketSummaryData", propOrder = {
    "summaryDate",
    "topLosers",
    "topGainers",
    "volume",
    "openTSIA",
    "tsia"
})
public class MarketSummaryData {

    @XmlElement(required = true)
    protected XMLGregorianCalendar summaryDate;
    @XmlElement(required = true)
    protected List<QuoteData> topLosers;
    @XmlElement(required = true)
    protected List<QuoteData> topGainers;
    protected double volume;
    protected double openTSIA;
    @XmlElement(name = "TSIA")
    protected double tsia;

    /**
     * Gets the value of the summaryDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSummaryDate() {
        return summaryDate;
    }

    /**
     * Sets the value of the summaryDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSummaryDate(XMLGregorianCalendar value) {
        this.summaryDate = value;
    }

    /**
     * Gets the value of the topLosers property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the topLosers property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTopLosers().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link QuoteData }
     * 
     * 
     */
    public List<QuoteData> getTopLosers() {
        if (topLosers == null) {
            topLosers = new ArrayList<QuoteData>();
        }
        return this.topLosers;
    }

    /**
     * Gets the value of the topGainers property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the topGainers property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTopGainers().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link QuoteData }
     * 
     * 
     */
    public List<QuoteData> getTopGainers() {
        if (topGainers == null) {
            topGainers = new ArrayList<QuoteData>();
        }
        return this.topGainers;
    }

    /**
     * Gets the value of the volume property.
     * 
     */
    public double getVolume() {
        return volume;
    }

    /**
     * Sets the value of the volume property.
     * 
     */
    public void setVolume(double value) {
        this.volume = value;
    }

    /**
     * Gets the value of the openTSIA property.
     * 
     */
    public double getOpenTSIA() {
        return openTSIA;
    }

    /**
     * Sets the value of the openTSIA property.
     * 
     */
    public void setOpenTSIA(double value) {
        this.openTSIA = value;
    }

    /**
     * Gets the value of the tsia property.
     * 
     */
    public double getTSIA() {
        return tsia;
    }

    /**
     * Sets the value of the tsia property.
     * 
     */
    public void setTSIA(double value) {
        this.tsia = value;
    }

}
