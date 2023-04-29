
package client.soma.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ActionPacketCaptureDebug complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ActionPacketCaptureDebug">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Interface" type="{http://www.datapower.com/schemas/management}dmReference"/>
 *         &lt;element name="CaptureMode" type="{http://www.datapower.com/schemas/management}dmPacketCaptureMode"/>
 *         &lt;element name="MaxTime" type="{http://www.datapower.com/schemas/management}dmTimeInterval"/>
 *         &lt;element name="MaxSize" type="{http://www.datapower.com/schemas/management}dmUInt32"/>
 *         &lt;element name="Filter" type="{http://www.datapower.com/schemas/management}dmString" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ActionPacketCaptureDebug", propOrder = {
    "_interface",
    "captureMode",
    "maxTime",
    "maxSize",
    "filter"
})
public class ActionPacketCaptureDebug {

    @XmlElement(name = "Interface", required = true)
    protected DmReference _interface;
    @XmlElement(name = "CaptureMode", required = true)
    protected DmPacketCaptureMode captureMode;
    @XmlElement(name = "MaxTime")
    protected long maxTime;
    @XmlElement(name = "MaxSize")
    protected long maxSize;
    @XmlElement(name = "Filter")
    protected String filter;

    /**
     * Gets the value of the interface property.
     * 
     * @return
     *     possible object is
     *     {@link DmReference }
     *     
     */
    public DmReference getInterface() {
        return _interface;
    }

    /**
     * Sets the value of the interface property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmReference }
     *     
     */
    public void setInterface(DmReference value) {
        this._interface = value;
    }

    /**
     * Gets the value of the captureMode property.
     * 
     * @return
     *     possible object is
     *     {@link DmPacketCaptureMode }
     *     
     */
    public DmPacketCaptureMode getCaptureMode() {
        return captureMode;
    }

    /**
     * Sets the value of the captureMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmPacketCaptureMode }
     *     
     */
    public void setCaptureMode(DmPacketCaptureMode value) {
        this.captureMode = value;
    }

    /**
     * Gets the value of the maxTime property.
     * 
     */
    public long getMaxTime() {
        return maxTime;
    }

    /**
     * Sets the value of the maxTime property.
     * 
     */
    public void setMaxTime(long value) {
        this.maxTime = value;
    }

    /**
     * Gets the value of the maxSize property.
     * 
     */
    public long getMaxSize() {
        return maxSize;
    }

    /**
     * Sets the value of the maxSize property.
     * 
     */
    public void setMaxSize(long value) {
        this.maxSize = value;
    }

    /**
     * Gets the value of the filter property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFilter() {
        return filter;
    }

    /**
     * Sets the value of the filter property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFilter(String value) {
        this.filter = value;
    }

}
