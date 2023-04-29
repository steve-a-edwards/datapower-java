
package client.soma.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for StatusDocumentCachingSummary complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StatusDocumentCachingSummary">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="XMLManager" type="{http://www.datapower.com/schemas/management}dmReference" minOccurs="0"/>
 *         &lt;element name="CacheCount" type="{http://www.datapower.com/schemas/management}dmUInt32" minOccurs="0"/>
 *         &lt;element name="DocCount" type="{http://www.datapower.com/schemas/management}dmUInt32" minOccurs="0"/>
 *         &lt;element name="CacheSize" type="{http://www.datapower.com/schemas/management}dmUInt32" minOccurs="0"/>
 *         &lt;element name="ByteCount" type="{http://www.datapower.com/schemas/management}dmUInt32" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StatusDocumentCachingSummary", propOrder = {
    "xmlManager",
    "cacheCount",
    "docCount",
    "cacheSize",
    "byteCount"
})
public class StatusDocumentCachingSummary {

    @XmlElement(name = "XMLManager")
    protected DmReference xmlManager;
    @XmlElement(name = "CacheCount")
    protected Long cacheCount;
    @XmlElement(name = "DocCount")
    protected Long docCount;
    @XmlElement(name = "CacheSize")
    protected Long cacheSize;
    @XmlElement(name = "ByteCount")
    protected Long byteCount;

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
     * Gets the value of the docCount property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getDocCount() {
        return docCount;
    }

    /**
     * Sets the value of the docCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setDocCount(Long value) {
        this.docCount = value;
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
     * Gets the value of the byteCount property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getByteCount() {
        return byteCount;
    }

    /**
     * Sets the value of the byteCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setByteCount(Long value) {
        this.byteCount = value;
    }

}
