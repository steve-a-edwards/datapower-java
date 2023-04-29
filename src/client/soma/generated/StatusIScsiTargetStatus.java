
package client.soma.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for StatusIScsiTargetStatus complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StatusIScsiTargetStatus">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TargetInstance" type="{http://www.datapower.com/schemas/management}dmString" minOccurs="0"/>
 *         &lt;element name="OpState" type="{http://www.datapower.com/schemas/management}dmOpState" minOccurs="0"/>
 *         &lt;element name="ConnectionState" type="{http://www.datapower.com/schemas/management}dmString" minOccurs="0"/>
 *         &lt;element name="TargetName" type="{http://www.datapower.com/schemas/management}dmString" minOccurs="0"/>
 *         &lt;element name="HostAddress" type="{http://www.datapower.com/schemas/management}dmString" minOccurs="0"/>
 *         &lt;element name="PortNumber" type="{http://www.datapower.com/schemas/management}dmUInt16" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StatusIScsiTargetStatus", propOrder = {
    "targetInstance",
    "opState",
    "connectionState",
    "targetName",
    "hostAddress",
    "portNumber"
})
public class StatusIScsiTargetStatus {

    @XmlElement(name = "TargetInstance")
    protected String targetInstance;
    @XmlElement(name = "OpState")
    protected DmOpState opState;
    @XmlElement(name = "ConnectionState")
    protected String connectionState;
    @XmlElement(name = "TargetName")
    protected String targetName;
    @XmlElement(name = "HostAddress")
    protected String hostAddress;
    @XmlElement(name = "PortNumber")
    protected Integer portNumber;

    /**
     * Gets the value of the targetInstance property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTargetInstance() {
        return targetInstance;
    }

    /**
     * Sets the value of the targetInstance property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTargetInstance(String value) {
        this.targetInstance = value;
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
     * Gets the value of the connectionState property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConnectionState() {
        return connectionState;
    }

    /**
     * Sets the value of the connectionState property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConnectionState(String value) {
        this.connectionState = value;
    }

    /**
     * Gets the value of the targetName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTargetName() {
        return targetName;
    }

    /**
     * Sets the value of the targetName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTargetName(String value) {
        this.targetName = value;
    }

    /**
     * Gets the value of the hostAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHostAddress() {
        return hostAddress;
    }

    /**
     * Sets the value of the hostAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHostAddress(String value) {
        this.hostAddress = value;
    }

    /**
     * Gets the value of the portNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPortNumber() {
        return portNumber;
    }

    /**
     * Sets the value of the portNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPortNumber(Integer value) {
        this.portNumber = value;
    }

}
