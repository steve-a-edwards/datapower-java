
package client.soma.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dmVLANStandbyControl complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="dmVLANStandbyControl">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Group" type="{http://www.datapower.com/schemas/management}dmUInt32"/>
 *         &lt;element name="VirtualIP" type="{http://www.datapower.com/schemas/management}dmIPHostAddress"/>
 *         &lt;element name="Preempt" type="{http://www.datapower.com/schemas/management}dmToggle"/>
 *         &lt;element name="Priority" type="{http://www.datapower.com/schemas/management}dmUInt32"/>
 *         &lt;element name="AuthHigh" type="{http://www.datapower.com/schemas/management}dmUInt32"/>
 *         &lt;element name="AuthLow" type="{http://www.datapower.com/schemas/management}dmUInt32"/>
 *         &lt;element name="AuxVirtualIP" type="{http://www.datapower.com/schemas/management}dmString"/>
 *         &lt;element name="SelfBalance" type="{http://www.datapower.com/schemas/management}dmToggle"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dmVLANStandbyControl", propOrder = {
    "group",
    "virtualIP",
    "preempt",
    "priority",
    "authHigh",
    "authLow",
    "auxVirtualIP",
    "selfBalance"
})
public class DmVLANStandbyControl {

    @XmlElement(name = "Group", required = true, type = Long.class, nillable = true)
    protected Long group;
    @XmlElement(name = "VirtualIP", required = true)
    protected String virtualIP;
    @XmlElement(name = "Preempt", required = true, nillable = true)
    protected DmToggle preempt;
    @XmlElement(name = "Priority", required = true, type = Long.class, nillable = true)
    protected Long priority;
    @XmlElement(name = "AuthHigh", required = true, type = Long.class, nillable = true)
    protected Long authHigh;
    @XmlElement(name = "AuthLow", required = true, type = Long.class, nillable = true)
    protected Long authLow;
    @XmlElement(name = "AuxVirtualIP", required = true, nillable = true)
    protected String auxVirtualIP;
    @XmlElement(name = "SelfBalance", required = true, nillable = true)
    protected DmToggle selfBalance;

    /**
     * Gets the value of the group property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getGroup() {
        return group;
    }

    /**
     * Sets the value of the group property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setGroup(Long value) {
        this.group = value;
    }

    /**
     * Gets the value of the virtualIP property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVirtualIP() {
        return virtualIP;
    }

    /**
     * Sets the value of the virtualIP property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVirtualIP(String value) {
        this.virtualIP = value;
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
     * Gets the value of the priority property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPriority() {
        return priority;
    }

    /**
     * Sets the value of the priority property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPriority(Long value) {
        this.priority = value;
    }

    /**
     * Gets the value of the authHigh property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getAuthHigh() {
        return authHigh;
    }

    /**
     * Sets the value of the authHigh property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setAuthHigh(Long value) {
        this.authHigh = value;
    }

    /**
     * Gets the value of the authLow property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getAuthLow() {
        return authLow;
    }

    /**
     * Sets the value of the authLow property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setAuthLow(Long value) {
        this.authLow = value;
    }

    /**
     * Gets the value of the auxVirtualIP property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuxVirtualIP() {
        return auxVirtualIP;
    }

    /**
     * Sets the value of the auxVirtualIP property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuxVirtualIP(String value) {
        this.auxVirtualIP = value;
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
