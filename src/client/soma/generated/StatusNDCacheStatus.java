
package client.soma.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for StatusNDCacheStatus complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StatusNDCacheStatus">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="IPAddress" type="{http://www.datapower.com/schemas/management}dmIPHostAddress" minOccurs="0"/>
 *         &lt;element name="HardwareAddress" type="{http://www.datapower.com/schemas/management}dmMACAddress" minOccurs="0"/>
 *         &lt;element name="Interface" type="{http://www.datapower.com/schemas/management}dmPortName" minOccurs="0"/>
 *         &lt;element name="InterfaceIndex" type="{http://www.datapower.com/schemas/management}dmUInt32" minOccurs="0"/>
 *         &lt;element name="InterfaceType" type="{http://www.datapower.com/schemas/management}dmInterfaceType" minOccurs="0"/>
 *         &lt;element name="VlanName" type="{http://www.datapower.com/schemas/management}dmString" minOccurs="0"/>
 *         &lt;element name="State" type="{http://www.datapower.com/schemas/management}dmNDCacheEntryState" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StatusNDCacheStatus", propOrder = {
    "ipAddress",
    "hardwareAddress",
    "_interface",
    "interfaceIndex",
    "interfaceType",
    "vlanName",
    "state"
})
public class StatusNDCacheStatus {

    @XmlElement(name = "IPAddress")
    protected String ipAddress;
    @XmlElement(name = "HardwareAddress")
    protected String hardwareAddress;
    @XmlElement(name = "Interface")
    protected DmPortName _interface;
    @XmlElement(name = "InterfaceIndex")
    protected Long interfaceIndex;
    @XmlElement(name = "InterfaceType")
    protected DmInterfaceType interfaceType;
    @XmlElement(name = "VlanName")
    protected String vlanName;
    @XmlElement(name = "State")
    protected DmNDCacheEntryState state;

    /**
     * Gets the value of the ipAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIPAddress() {
        return ipAddress;
    }

    /**
     * Sets the value of the ipAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIPAddress(String value) {
        this.ipAddress = value;
    }

    /**
     * Gets the value of the hardwareAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHardwareAddress() {
        return hardwareAddress;
    }

    /**
     * Sets the value of the hardwareAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHardwareAddress(String value) {
        this.hardwareAddress = value;
    }

    /**
     * Gets the value of the interface property.
     * 
     * @return
     *     possible object is
     *     {@link DmPortName }
     *     
     */
    public DmPortName getInterface() {
        return _interface;
    }

    /**
     * Sets the value of the interface property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmPortName }
     *     
     */
    public void setInterface(DmPortName value) {
        this._interface = value;
    }

    /**
     * Gets the value of the interfaceIndex property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getInterfaceIndex() {
        return interfaceIndex;
    }

    /**
     * Sets the value of the interfaceIndex property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setInterfaceIndex(Long value) {
        this.interfaceIndex = value;
    }

    /**
     * Gets the value of the interfaceType property.
     * 
     * @return
     *     possible object is
     *     {@link DmInterfaceType }
     *     
     */
    public DmInterfaceType getInterfaceType() {
        return interfaceType;
    }

    /**
     * Sets the value of the interfaceType property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmInterfaceType }
     *     
     */
    public void setInterfaceType(DmInterfaceType value) {
        this.interfaceType = value;
    }

    /**
     * Gets the value of the vlanName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVlanName() {
        return vlanName;
    }

    /**
     * Sets the value of the vlanName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVlanName(String value) {
        this.vlanName = value;
    }

    /**
     * Gets the value of the state property.
     * 
     * @return
     *     possible object is
     *     {@link DmNDCacheEntryState }
     *     
     */
    public DmNDCacheEntryState getState() {
        return state;
    }

    /**
     * Sets the value of the state property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmNDCacheEntryState }
     *     
     */
    public void setState(DmNDCacheEntryState value) {
        this.state = value;
    }

}
