
package client.soma.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for StatusNTPRefreshStatus complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StatusNTPRefreshStatus">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="LastRefreshIndex" type="{http://www.datapower.com/schemas/management}dmIPHostAddress" minOccurs="0"/>
 *         &lt;element name="LastRefreshResult" type="{http://www.datapower.com/schemas/management}dmString" minOccurs="0"/>
 *         &lt;element name="LastRefreshTime" type="{http://www.datapower.com/schemas/management}dmTimestamp" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StatusNTPRefreshStatus", propOrder = {
    "lastRefreshIndex",
    "lastRefreshResult",
    "lastRefreshTime"
})
public class StatusNTPRefreshStatus {

    @XmlElement(name = "LastRefreshIndex")
    protected String lastRefreshIndex;
    @XmlElement(name = "LastRefreshResult")
    protected String lastRefreshResult;
    @XmlElement(name = "LastRefreshTime")
    protected Long lastRefreshTime;

    /**
     * Gets the value of the lastRefreshIndex property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastRefreshIndex() {
        return lastRefreshIndex;
    }

    /**
     * Sets the value of the lastRefreshIndex property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastRefreshIndex(String value) {
        this.lastRefreshIndex = value;
    }

    /**
     * Gets the value of the lastRefreshResult property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastRefreshResult() {
        return lastRefreshResult;
    }

    /**
     * Sets the value of the lastRefreshResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastRefreshResult(String value) {
        this.lastRefreshResult = value;
    }

    /**
     * Gets the value of the lastRefreshTime property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getLastRefreshTime() {
        return lastRefreshTime;
    }

    /**
     * Sets the value of the lastRefreshTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setLastRefreshTime(Long value) {
        this.lastRefreshTime = value;
    }

}
