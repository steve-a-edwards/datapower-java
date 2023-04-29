
package client.soma.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for StatusStandbyStatus complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StatusStandbyStatus">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Name" type="{http://www.datapower.com/schemas/management}dmPortName" minOccurs="0"/>
 *         &lt;element name="Group" type="{http://www.datapower.com/schemas/management}dmUInt16" minOccurs="0"/>
 *         &lt;element name="IP" type="{http://www.datapower.com/schemas/management}dmIPHostAddress" minOccurs="0"/>
 *         &lt;element name="Priority" type="{http://www.datapower.com/schemas/management}dmUInt16" minOccurs="0"/>
 *         &lt;element name="Mode" type="{http://www.datapower.com/schemas/management}dmStandbyMode" minOccurs="0"/>
 *         &lt;element name="Preempt" type="{http://www.datapower.com/schemas/management}dmToggle" minOccurs="0"/>
 *         &lt;element name="GroupLeader" type="{http://www.datapower.com/schemas/management}dmIPHostAddress" minOccurs="0"/>
 *         &lt;element name="InterfaceType" type="{http://www.datapower.com/schemas/management}dmInterfaceType" minOccurs="0"/>
 *         &lt;element name="VlanName" type="{http://www.datapower.com/schemas/management}dmString" minOccurs="0"/>
 *         &lt;element name="SelfBalance" type="{http://www.datapower.com/schemas/management}dmToggle" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StatusStandbyStatus", propOrder = {
    "name",
    "group",
    "ip",
    "priority",
    "mode",
    "preempt",
    "groupLeader",
    "interfaceType",
    "vlanName",
    "selfBalance"
})
public class StatusStandbyStatus {

    @XmlElement(name = "Name")
    protected DmPortName name;
    @XmlElement(name = "Group")
    protected Integer group;
    @XmlElement(name = "IP")
    protected String ip;
    @XmlElement(name = "Priority")
    protected Integer priority;
    @XmlElement(name = "Mode")
    protected DmStandbyMode mode;
    @XmlElement(name = "Preempt")
    protected DmToggle preempt;
    @XmlElement(name = "GroupLeader")
    protected String groupLeader;
    @XmlElement(name = "InterfaceType")
    protected DmInterfaceType interfaceType;
    @XmlElement(name = "VlanName")
    protected String vlanName;
    @XmlElement(name = "SelfBalance")
    protected DmToggle selfBalance;

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link DmPortName }
     *     
     */
    public DmPortName getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmPortName }
     *     
     */
    public void setName(DmPortName value) {
        this.name = value;
    }

    /**
     * Gets the value of the group property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getGroup() {
        return group;
    }

    /**
     * Sets the value of the group property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setGroup(Integer value) {
        this.group = value;
    }

    /**
     * Gets the value of the ip property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIP() {
        return ip;
    }

    /**
     * Sets the value of the ip property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIP(String value) {
        this.ip = value;
    }

    /**
     * Gets the value of the priority property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPriority() {
        return priority;
    }

    /**
     * Sets the value of the priority property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPriority(Integer value) {
        this.priority = value;
    }

    /**
     * Gets the value of the mode property.
     * 
     * @return
     *     possible object is
     *     {@link DmStandbyMode }
     *     
     */
    public DmStandbyMode getMode() {
        return mode;
    }

    /**
     * Sets the value of the mode property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmStandbyMode }
     *     
     */
    public void setMode(DmStandbyMode value) {
        this.mode = value;
    }

    /**
     * Gets the value of the preempt property.
     * 
     * @return
     *     possible object is
     *     {@link DmToggle }
     *     
     */
    public DmToggle getPreempt() {
        return preempt;
    }

    /**
     * Sets the value of the preempt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmToggle }
     *     
     */
    public void setPreempt(DmToggle value) {
        this.preempt = value;
    }

    /**
     * Gets the value of the groupLeader property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGroupLeader() {
        return groupLeader;
    }

    /**
     * Sets the value of the groupLeader property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGroupLeader(String value) {
        this.groupLeader = value;
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
     * Gets the value of the selfBalance property.
     * 
     * @return
     *     possible object is
     *     {@link DmToggle }
     *     
     */
    public DmToggle getSelfBalance() {
        return selfBalance;
    }

    /**
     * Sets the value of the selfBalance property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmToggle }
     *     
     */
    public void setSelfBalance(DmToggle value) {
        this.selfBalance = value;
    }

}
