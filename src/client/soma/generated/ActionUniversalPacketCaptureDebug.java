
package client.soma.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ActionUniversalPacketCaptureDebug complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ActionUniversalPacketCaptureDebug">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="InterfaceType" type="{http://www.datapower.com/schemas/management}dmPcapInterfaceType"/>
 *         &lt;element name="EthernetInterface" type="{http://www.datapower.com/schemas/management}dmReference" minOccurs="0"/>
 *         &lt;element name="VLANInterface" type="{http://www.datapower.com/schemas/management}dmReference" minOccurs="0"/>
 *         &lt;element name="CaptureMode" type="{http://www.datapower.com/schemas/management}dmPacketCaptureMode"/>
 *         &lt;element name="MaxTime" type="{http://www.datapower.com/schemas/management}dmTimeInterval" minOccurs="0"/>
 *         &lt;element name="MaxSize" type="{http://www.datapower.com/schemas/management}dmUInt32"/>
 *         &lt;element name="MaxPacketSize" type="{http://www.datapower.com/schemas/management}dmUInt32"/>
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
@XmlType(name = "ActionUniversalPacketCaptureDebug", propOrder = {
    "interfaceType",
    "ethernetInterface",
    "vlanInterface",
    "captureMode",
    "maxTime",
    "maxSize",
    "maxPacketSize",
    "filter"
})
public class ActionUniversalPacketCaptureDebug {

    @XmlElement(name = "InterfaceType", required = true)
    protected DmPcapInterfaceType interfaceType;
    @XmlElement(name = "EthernetInterface")
    protected DmReference ethernetInterface;
    @XmlElement(name = "VLANInterface")
    protected DmReference vlanInterface;
    @XmlElement(name = "CaptureMode", required = true)
    protected DmPacketCaptureMode captureMode;
    @XmlElement(name = "MaxTime")
    protected Long maxTime;
    @XmlElement(name = "MaxSize")
    protected long maxSize;
    @XmlElement(name = "MaxPacketSize")
    protected long maxPacketSize;
    @XmlElement(name = "Filter")
    protected String filter;

    /**
     * Gets the value of the interfaceType property.
     * 
     * @return
     *     possible object is
     *     {@link DmPcapInterfaceType }
     *     
     */
    public DmPcapInterfaceType getInterfaceType() {
        return interfaceType;
    }

    /**
     * Sets the value of the interfaceType property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmPcapInterfaceType }
     *     
     */
    public void setInterfaceType(DmPcapInterfaceType value) {
        this.interfaceType = value;
    }

    /**
     * Gets the value of the ethernetInterface property.
     * 
     * @return
     *     possible object is
     *     {@link DmReference }
     *     
     */
    public DmReference getEthernetInterface() {
        return ethernetInterface;
    }

    /**
     * Sets the value of the ethernetInterface property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmReference }
     *     
     */
    public void setEthernetInterface(DmReference value) {
        this.ethernetInterface = value;
    }

    /**
     * Gets the value of the vlanInterface property.
     * 
     * @return
     *     possible object is
     *     {@link DmReference }
     *     
     */
    public DmReference getVLANInterface() {
        return vlanInterface;
    }

    /**
     * Sets the value of the vlanInterface property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmReference }
     *     
     */
    public void setVLANInterface(DmReference value) {
        this.vlanInterface = value;
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
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getMaxTime() {
        return maxTime;
    }

    /**
     * Sets the value of the maxTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setMaxTime(Long value) {
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
     * Gets the value of the maxPacketSize property.
     * 
     */
    public long getMaxPacketSize() {
        return maxPacketSize;
    }

    /**
     * Sets the value of the maxPacketSize property.
     * 
     */
    public void setMaxPacketSize(long value) {
        this.maxPacketSize = value;
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
