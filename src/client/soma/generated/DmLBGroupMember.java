
package client.soma.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dmLBGroupMember complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="dmLBGroupMember">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Server" type="{http://www.datapower.com/schemas/management}dmHostname"/>
 *         &lt;element name="Weight" type="{http://www.datapower.com/schemas/management}dmUInt32"/>
 *         &lt;element name="MappedPort" type="{http://www.datapower.com/schemas/management}dmIPPort"/>
 *         &lt;element name="Activity" type="{http://www.datapower.com/schemas/management}dmString"/>
 *         &lt;element name="HealthPort" type="{http://www.datapower.com/schemas/management}dmIPPort"/>
 *         &lt;element name="LBMemberState" type="{http://www.datapower.com/schemas/management}dmAdminState"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dmLBGroupMember", propOrder = {
    "server",
    "weight",
    "mappedPort",
    "activity",
    "healthPort",
    "lbMemberState"
})
public class DmLBGroupMember {

    @XmlElement(name = "Server", required = true)
    protected String server;
    @XmlElement(name = "Weight", required = true, type = Long.class, nillable = true)
    protected Long weight;
    @XmlElement(name = "MappedPort", required = true, type = Integer.class, nillable = true)
    protected Integer mappedPort;
    @XmlElement(name = "Activity", required = true, nillable = true)
    protected String activity;
    @XmlElement(name = "HealthPort", required = true, type = Integer.class, nillable = true)
    protected Integer healthPort;
    @XmlElement(name = "LBMemberState", required = true, nillable = true)
    protected DmAdminState lbMemberState;

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
     * Gets the value of the mappedPort property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMappedPort() {
        return mappedPort;
    }

    /**
     * Sets the value of the mappedPort property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMappedPort(Integer value) {
        this.mappedPort = value;
    }

    /**
     * Gets the value of the activity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActivity() {
        return activity;
    }

    /**
     * Sets the value of the activity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActivity(String value) {
        this.activity = value;
    }

    /**
     * Gets the value of the healthPort property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getHealthPort() {
        return healthPort;
    }

    /**
     * Sets the value of the healthPort property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setHealthPort(Integer value) {
        this.healthPort = value;
    }

    /**
     * Gets the value of the lbMemberState property.
     * 
     * @return
     *     possible object is
     *     {@link DmAdminState }
     *     
     */
    public DmAdminState getLBMemberState() {
        return lbMemberState;
    }

    /**
     * Sets the value of the lbMemberState property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmAdminState }
     *     
     */
    public void setLBMemberState(DmAdminState value) {
        this.lbMemberState = value;
    }

}
