
package client.soma.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for StatusStylesheetStatusSimpleIndex complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StatusStylesheetStatusSimpleIndex">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="XMLManager" type="{http://www.datapower.com/schemas/management}dmReference" minOccurs="0"/>
 *         &lt;element name="ID" type="{http://www.datapower.com/schemas/management}dmUInt32" minOccurs="0"/>
 *         &lt;element name="OutputMode" type="{http://www.datapower.com/schemas/management}dmOutputMode" minOccurs="0"/>
 *         &lt;element name="URL" type="{http://www.datapower.com/schemas/management}dmURL" minOccurs="0"/>
 *         &lt;element name="CompileOptions" type="{http://www.datapower.com/schemas/management}dmString" minOccurs="0"/>
 *         &lt;element name="Status" type="{http://www.datapower.com/schemas/management}dmStylesheetStatus" minOccurs="0"/>
 *         &lt;element name="CompileSpeed" type="{http://www.datapower.com/schemas/management}dmTimeIntervalMillis" minOccurs="0"/>
 *         &lt;element name="RefreshInterval" type="{http://www.datapower.com/schemas/management}dmTimeInterval" minOccurs="0"/>
 *         &lt;element name="Flushable" type="{http://www.datapower.com/schemas/management}dmToggle" minOccurs="0"/>
 *         &lt;element name="LastRefresh" type="{http://www.datapower.com/schemas/management}dmTimestamp" minOccurs="0"/>
 *         &lt;element name="Message" type="{http://www.datapower.com/schemas/management}dmString" minOccurs="0"/>
 *         &lt;element name="Log" type="{http://www.datapower.com/schemas/management}dmFormattedText" minOccurs="0"/>
 *         &lt;element name="XG4Enabled" type="{http://www.datapower.com/schemas/management}dmToggle" minOccurs="0"/>
 *         &lt;element name="XG4Size" type="{http://www.datapower.com/schemas/management}dmUInt32" minOccurs="0"/>
 *         &lt;element name="MemSize" type="{http://www.datapower.com/schemas/management}dmUInt32" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StatusStylesheetStatusSimpleIndex", propOrder = {
    "xmlManager",
    "id",
    "outputMode",
    "url",
    "compileOptions",
    "status",
    "compileSpeed",
    "refreshInterval",
    "flushable",
    "lastRefresh",
    "message",
    "log",
    "xg4Enabled",
    "xg4Size",
    "memSize"
})
public class StatusStylesheetStatusSimpleIndex {

    @XmlElement(name = "XMLManager")
    protected DmReference xmlManager;
    @XmlElement(name = "ID")
    protected Long id;
    @XmlElement(name = "OutputMode")
    protected DmOutputMode outputMode;
    @XmlElement(name = "URL")
    protected String url;
    @XmlElement(name = "CompileOptions")
    protected String compileOptions;
    @XmlElement(name = "Status")
    protected DmStylesheetStatus status;
    @XmlElement(name = "CompileSpeed")
    protected Long compileSpeed;
    @XmlElement(name = "RefreshInterval")
    protected Long refreshInterval;
    @XmlElement(name = "Flushable")
    protected DmToggle flushable;
    @XmlElement(name = "LastRefresh")
    protected Long lastRefresh;
    @XmlElement(name = "Message")
    protected String message;
    @XmlElement(name = "Log")
    protected String log;
    @XmlElement(name = "XG4Enabled")
    protected DmToggle xg4Enabled;
    @XmlElement(name = "XG4Size")
    protected Long xg4Size;
    @XmlElement(name = "MemSize")
    protected Long memSize;

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
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getID() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setID(Long value) {
        this.id = value;
    }

    /**
     * Gets the value of the outputMode property.
     * 
     * @return
     *     possible object is
     *     {@link DmOutputMode }
     *     
     */
    public DmOutputMode getOutputMode() {
        return outputMode;
    }

    /**
     * Sets the value of the outputMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmOutputMode }
     *     
     */
    public void setOutputMode(DmOutputMode value) {
        this.outputMode = value;
    }

    /**
     * Gets the value of the url property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getURL() {
        return url;
    }

    /**
     * Sets the value of the url property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setURL(String value) {
        this.url = value;
    }

    /**
     * Gets the value of the compileOptions property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompileOptions() {
        return compileOptions;
    }

    /**
     * Sets the value of the compileOptions property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompileOptions(String value) {
        this.compileOptions = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link DmStylesheetStatus }
     *     
     */
    public DmStylesheetStatus getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmStylesheetStatus }
     *     
     */
    public void setStatus(DmStylesheetStatus value) {
        this.status = value;
    }

    /**
     * Gets the value of the compileSpeed property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCompileSpeed() {
        return compileSpeed;
    }

    /**
     * Sets the value of the compileSpeed property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCompileSpeed(Long value) {
        this.compileSpeed = value;
    }

    /**
     * Gets the value of the refreshInterval property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getRefreshInterval() {
        return refreshInterval;
    }

    /**
     * Sets the value of the refreshInterval property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setRefreshInterval(Long value) {
        this.refreshInterval = value;
    }

    /**
     * Gets the value of the flushable property.
     * 
     * @return
     *     possible object is
     *     {@link DmToggle }
     *     
     */
    public DmToggle getFlushable() {
        return flushable;
    }

    /**
     * Sets the value of the flushable property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmToggle }
     *     
     */
    public void setFlushable(DmToggle value) {
        this.flushable = value;
    }

    /**
     * Gets the value of the lastRefresh property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getLastRefresh() {
        return lastRefresh;
    }

    /**
     * Sets the value of the lastRefresh property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setLastRefresh(Long value) {
        this.lastRefresh = value;
    }

    /**
     * Gets the value of the message property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessage() {
        return message;
    }

    /**
     * Sets the value of the message property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessage(String value) {
        this.message = value;
    }

    /**
     * Gets the value of the log property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLog() {
        return log;
    }

    /**
     * Sets the value of the log property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLog(String value) {
        this.log = value;
    }

    /**
     * Gets the value of the xg4Enabled property.
     * 
     * @return
     *     possible object is
     *     {@link DmToggle }
     *     
     */
    public DmToggle getXG4Enabled() {
        return xg4Enabled;
    }

    /**
     * Sets the value of the xg4Enabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmToggle }
     *     
     */
    public void setXG4Enabled(DmToggle value) {
        this.xg4Enabled = value;
    }

    /**
     * Gets the value of the xg4Size property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getXG4Size() {
        return xg4Size;
    }

    /**
     * Sets the value of the xg4Size property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setXG4Size(Long value) {
        this.xg4Size = value;
    }

    /**
     * Gets the value of the memSize property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getMemSize() {
        return memSize;
    }

    /**
     * Sets the value of the memSize property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setMemSize(Long value) {
        this.memSize = value;
    }

}
