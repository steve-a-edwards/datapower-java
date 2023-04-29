
package client.soma.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for StatusIScsiHBAStatus complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StatusIScsiHBAStatus">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="HBAInstance" type="{http://www.datapower.com/schemas/management}dmString" minOccurs="0"/>
 *         &lt;element name="OpState" type="{http://www.datapower.com/schemas/management}dmOpState" minOccurs="0"/>
 *         &lt;element name="IScsiName" type="{http://www.datapower.com/schemas/management}dmString" minOccurs="0"/>
 *         &lt;element name="IpAddress" type="{http://www.datapower.com/schemas/management}dmIPNetAddress" minOccurs="0"/>
 *         &lt;element name="DefaultGateway" type="{http://www.datapower.com/schemas/management}dmIPHostAddress" minOccurs="0"/>
 *         &lt;element name="MacAddress" type="{http://www.datapower.com/schemas/management}dmMACAddress" minOccurs="0"/>
 *         &lt;element name="LinkStatus" type="{http://www.datapower.com/schemas/management}dmLinkStatus" minOccurs="0"/>
 *         &lt;element name="UseDHCP" type="{http://www.datapower.com/schemas/management}dmString" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StatusIScsiHBAStatus", propOrder = {
    "hbaInstance",
    "opState",
    "iScsiName",
    "ipAddress",
    "defaultGateway",
    "macAddress",
    "linkStatus",
    "useDHCP"
})
public class StatusIScsiHBAStatus {

    @XmlElement(name = "HBAInstance")
    protected String hbaInstance;
    @XmlElement(name = "OpState")
    protected DmOpState opState;
    @XmlElement(name = "IScsiName")
    protected String iScsiName;
    @XmlElement(name = "IpAddress")
    protected String ipAddress;
    @XmlElement(name = "DefaultGateway")
    protected String defaultGateway;
    @XmlElement(name = "MacAddress")
    protected String macAddress;
    @XmlElement(name = "LinkStatus")
    protected DmLinkStatus linkStatus;
    @XmlElement(name = "UseDHCP")
    protected String useDHCP;

    /**
     * Gets the value of the hbaInstance property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHBAInstance() {
        return hbaInstance;
    }

    /**
     * Sets the value of the hbaInstance property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHBAInstance(String value) {
        this.hbaInstance = value;
    }

    /**
     * Gets the value of the opState property.
     * 
     * @return
     *     possible object is
     *     {@link DmOpState }
     *     
     */
    public DmOpState getOpState() {
        return opState;
    }

    /**
     * Sets the value of the opState property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmOpState }
     *     
     */
    public void setOpState(DmOpState value) {
        this.opState = value;
    }

    /**
     * Gets the value of the iScsiName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIScsiName() {
        return iScsiName;
    }

    /**
     * Sets the value of the iScsiName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIScsiName(String value) {
        this.iScsiName = value;
    }

    /**
     * Gets the value of the ipAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIpAddress() {
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
    public void setIpAddress(String value) {
        this.ipAddress = value;
    }

    /**
     * Gets the value of the defaultGateway property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDefaultGateway() {
        return defaultGateway;
    }

    /**
     * Sets the value of the defaultGateway property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDefaultGateway(String value) {
        this.defaultGateway = value;
    }

    /**
     * Gets the value of the macAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMacAddress() {
        return macAddress;
    }

    /**
     * Sets the value of the macAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMacAddress(String value) {
        this.macAddress = value;
    }

    /**
     * Gets the value of the linkStatus property.
     * 
     * @return
     *     possible object is
     *     {@link DmLinkStatus }
     *     
     */
    public DmLinkStatus getLinkStatus() {
        return linkStatus;
    }

    /**
     * Sets the value of the linkStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmLinkStatus }
     *     
     */
    public void setLinkStatus(DmLinkStatus value) {
        this.linkStatus = value;
    }

    /**
     * Gets the value of the useDHCP property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUseDHCP() {
        return useDHCP;
    }

    /**
     * Sets the value of the useDHCP property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUseDHCP(String value) {
        this.useDHCP = value;
    }

}
