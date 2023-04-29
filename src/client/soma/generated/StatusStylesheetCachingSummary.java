
package client.soma.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for StatusStylesheetCachingSummary complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StatusStylesheetCachingSummary">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="XMLManager" type="{http://www.datapower.com/schemas/management}dmReference" minOccurs="0"/>
 *         &lt;element name="CacheSize" type="{http://www.datapower.com/schemas/management}dmUInt32" minOccurs="0"/>
 *         &lt;element name="CacheCount" type="{http://www.datapower.com/schemas/management}dmUInt32" minOccurs="0"/>
 *         &lt;element name="ReadyCount" type="{http://www.datapower.com/schemas/management}dmUInt32" minOccurs="0"/>
 *         &lt;element name="PendingCount" type="{http://www.datapower.com/schemas/management}dmUInt32" minOccurs="0"/>
 *         &lt;element name="BadCount" type="{http://www.datapower.com/schemas/management}dmUInt32" minOccurs="0"/>
 *         &lt;element name="DupCount" type="{http://www.datapower.com/schemas/management}dmUInt32" minOccurs="0"/>
 *         &lt;element name="CacheKBCount" type="{http://www.datapower.com/schemas/management}dmUInt32" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StatusStylesheetCachingSummary", propOrder = {
    "xmlManager",
    "cacheSize",
    "cacheCount",
    "readyCount",
    "pendingCount",
    "badCount",
    "dupCount",
    "cacheKBCount"
})
public class StatusStylesheetCachingSummary {

    @XmlElement(name = "XMLManager")
    protected DmReference xmlManager;
    @XmlElement(name = "CacheSize")
    protected Long cacheSize;
    @XmlElement(name = "CacheCount")
    protected Long cacheCount;
    @XmlElement(name = "ReadyCount")
    protected Long readyCount;
    @XmlElement(name = "PendingCount")
    protected Long pendingCount;
    @XmlElement(name = "BadCount")
    protected Long badCount;
    @XmlElement(name = "DupCount")
    protected Long dupCount;
    @XmlElement(name = "CacheKBCount")
    protected Long cacheKBCount;

    /**
     * Gets the value of the xmlManager property.
     * 
     * @return
     *     possible object is
     *     {@link DmReference }
     *     
     */
    public DmReference getXMLManager() {
        return xmlManager;
    }

    /**
     * Sets the value of the xmlManager property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmReference }
     *     
     */
    public void setXMLManager(DmReference value) {
        this.xmlManager = value;
    }

    /**
     * Gets the value of the cacheSize property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCacheSize() {
        return cacheSize;
    }

    /**
     * Sets the value of the cacheSize property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCacheSize(Long value) {
        this.cacheSize = value;
    }

    /**
     * Gets the value of the cacheCount property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCacheCount() {
        return cacheCount;
    }

    /**
     * Sets the value of the cacheCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCacheCount(Long value) {
        this.cacheCount = value;
    }

    /**
     * Gets the value of the readyCount property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getReadyCount() {
        return readyCount;
    }

    /**
     * Sets the value of the readyCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setReadyCount(Long value) {
        this.readyCount = value;
    }

    /**
     * Gets the value of the pendingCount property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPendingCount() {
        return pendingCount;
    }

    /**
     * Sets the value of the pendingCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPendingCount(Long value) {
        this.pendingCount = value;
    }

    /**
     * Gets the value of the badCount property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getBadCount() {
        return badCount;
    }

    /**
     * Sets the value of the badCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setBadCount(Long value) {
        this.badCount = value;
    }

    /**
     * Gets the value of the dupCount property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getDupCount() {
        return dupCount;
    }

    /**
     * Sets the value of the dupCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setDupCount(Long value) {
        this.dupCount = value;
    }

    /**
     * Gets the value of the cacheKBCount property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCacheKBCount() {
        return cacheKBCount;
    }

    /**
     * Sets the value of the cacheKBCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCacheKBCount(Long value) {
        this.cacheKBCount = value;
    }

}
