
package client.soma.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dmIPMIUserBinding complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="dmIPMIUserBinding">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="UserID" type="{http://www.datapower.com/schemas/management}dmReference"/>
 *         &lt;element name="PrivilegeLevel" type="{http://www.datapower.com/schemas/management}dmIPMIPrivilegeLevel"/>
 *         &lt;element name="SOLEnabled" type="{http://www.datapower.com/schemas/management}dmToggle"/>
 *         &lt;element name="MaxSimultaneousSessions" type="{http://www.datapower.com/schemas/management}dmUInt32"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dmIPMIUserBinding", propOrder = {
    "userID",
    "privilegeLevel",
    "solEnabled",
    "maxSimultaneousSessions"
})
public class DmIPMIUserBinding {

    @XmlElement(name = "UserID", required = true)
    protected DmReference userID;
    @XmlElement(name = "PrivilegeLevel", required = true, nillable = true)
    protected DmIPMIPrivilegeLevel privilegeLevel;
    @XmlElement(name = "SOLEnabled", required = true, nillable = true)
    protected DmToggle solEnabled;
    @XmlElement(name = "MaxSimultaneousSessions", required = true, type = Long.class, nillable = true)
    protected Long maxSimultaneousSessions;

    /**
     * Gets the value of the userID property.
     * 
     * @return
     *     possible object is
     *     {@link DmReference }
     *     
     */
    public DmReference getUserID() {
        return userID;
    }

    /**
     * Sets the value of the userID property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmReference }
     *     
     */
    public void setUserID(DmReference value) {
        this.userID = value;
    }

    /**
     * Gets the value of the privilegeLevel property.
     * 
     * @return
     *     possible object is
     *     {@link DmIPMIPrivilegeLevel }
     *     
     */
    public DmIPMIPrivilegeLevel getPrivilegeLevel() {
        return privilegeLevel;
    }

    /**
     * Sets the value of the privilegeLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmIPMIPrivilegeLevel }
     *     
     */
    public void setPrivilegeLevel(DmIPMIPrivilegeLevel value) {
        this.privilegeLevel = value;
    }

    /**
     * Gets the value of the solEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link DmToggle }
     *     
     */
    public DmToggle getSOLEnabled() {
        return solEnabled;
    }

    /**
     * Sets the value of the solEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmToggle }
     *     
     */
    public void setSOLEnabled(DmToggle value) {
        this.solEnabled = value;
    }

    /**
     * Gets the value of the maxSimultaneousSessions property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getMaxSimultaneousSessions() {
        return maxSimultaneousSessions;
    }

    /**
     * Sets the value of the maxSimultaneousSessions property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setMaxSimultaneousSessions(Long value) {
        this.maxSimultaneousSessions = value;
    }

}
