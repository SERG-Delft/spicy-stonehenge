
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
 * <p>Java class for GetOPSConfigResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetOPSConfigResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.ebayopensource.org/turmeric/common/v1/types}BaseResponse">
 *       &lt;sequence>
 *         &lt;element name="DBHostName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="DBName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="DBPort" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetOPSConfigResponse", propOrder = {
    "dbHostName",
    "dbName",
    "dbPort"
})
public class GetOPSConfigResponse
    extends BaseResponse
{

    @XmlElement(name = "DBHostName", required = true)
    protected String dbHostName;
    @XmlElement(name = "DBName", required = true)
    protected String dbName;
    @XmlElement(name = "DBPort")
    protected int dbPort;

    /**
     * Gets the value of the dbHostName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDBHostName() {
        return dbHostName;
    }

    /**
     * Sets the value of the dbHostName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDBHostName(String value) {
        this.dbHostName = value;
    }

    /**
     * Gets the value of the dbName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDBName() {
        return dbName;
    }

    /**
     * Sets the value of the dbName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDBName(String value) {
        this.dbName = value;
    }

    /**
     * Gets the value of the dbPort property.
     * 
     */
    public int getDBPort() {
        return dbPort;
    }

    /**
     * Sets the value of the dbPort property.
     * 
     */
    public void setDBPort(int value) {
        this.dbPort = value;
    }

}
