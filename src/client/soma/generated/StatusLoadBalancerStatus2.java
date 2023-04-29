
package client.soma.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for StatusLoadBalancerStatus2 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StatusLoadBalancerStatus2">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Group" type="{http://www.datapower.com/schemas/management}dmReference" minOccurs="0"/>
 *         &lt;element name="Server" type="{http://www.datapower.com/schemas/management}dmString" minOccurs="0"/>
 *         &lt;element name="Port" type="{http://www.datapower.com/schemas/management}dmUInt32" minOccurs="0"/>
 *         &lt;element name="Health" type="{http://www.datapower.com/schemas/management}dmLoadBalancerMemberHealth" minOccurs="0"/>
 *         &lt;element name="Weight" type="{http://www.datapower.com/schemas/management}dmUInt32" minOccurs="0"/>
 *         &lt;element name="AdminState" type="{http://www.datapower.com/schemas/management}dmLBMemberAdminStatus" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StatusLoadBalancerStatus2", propOrder = {
    "group",
    "server",
    "port",
    "health",
    "weight",
    "adminState"
})
public class StatusLoadBalancerStatus2 {

    @XmlElement(name = "Group")
    protected DmReference group;
    @XmlElement(name = "Server")
    protected String server;
    @XmlElement(name = "Port")
    protected Long port;
    @XmlElement(name = "Health")
    protected DmLoadBalancerMemberHealth health;
    @XmlElement(name = "Weight")
    protected Long weight;
    @XmlElement(name = "AdminState")
    protected DmLBMemberAdminStatus adminState;

    /**
     * Gets the value of the group property.
     * 
     * @return
     *     possible object is
     *     {@link DmReference }
     *     
     */
    public DmReference getGroup() {
        return group;
    }

    /**
     * Sets the value of the group property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmReference }
     *     
     */
    public void setGroup(DmReference value) {
        this.group = value;
    }

    /**
     * Gets the value of the server property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServer() {
        return server;
    }

    /**
     * Sets the value of the server property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServer(String value) {
        this.server = value;
    }

    /**
     * Gets the value of the port property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPort() {
        return port;
    }

    /**
     * Sets the value of the port property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPort(Long value) {
        this.port = value;
    }

    /**
     * Gets the value of the health property.
     * 
     * @return
     *     possible object is
     *     {@link DmLoadBalancerMemberHealth }
     *     
     */
    public DmLoadBalancerMemberHealth getHealth() {
        return health;
    }

    /**
     * Sets the value of the health property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmLoadBalancerMemberHealth }
     *     
     */
    public void setHealth(DmLoadBalancerMemberHealth value) {
        this.health = value;
    }

    /**
     * Gets the value of the weight property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getWeight() {
        return weight;
    }

    /**
     * Sets the value of the weight property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setWeight(Long value) {
        this.weight = value;
    }

    /**
     * Gets the value of the adminState property.
     * 
     * @return
     *     possible object is
     *     {@link DmLBMemberAdminStatus }
     *     
     */
    public DmLBMemberAdminStatus getAdminState() {
        return adminState;
    }

    /**
     * Sets the value of the adminState property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmLBMemberAdminStatus }
     *     
     */
    public void setAdminState(DmLBMemberAdminStatus value) {
        this.adminState = value;
    }

}
