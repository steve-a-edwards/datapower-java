
package client.soma.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dmSnmpTarget complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="dmSnmpTarget">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Host" type="{http://www.datapower.com/schemas/management}dmIPHostAddress"/>
 *         &lt;element name="Port" type="{http://www.datapower.com/schemas/management}dmIPPort"/>
 *         &lt;element name="Community" type="{http://www.datapower.com/schemas/management}dmString"/>
 *         &lt;element name="TrapVersion" type="{http://www.datapower.com/schemas/management}dmSnmpVersion"/>
 *         &lt;element name="SecurityName" type="{http://www.datapower.com/schemas/management}dmString"/>
 *         &lt;element name="SecurityLevel" type="{http://www.datapower.com/schemas/management}dmSnmpSecurityLevel"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dmSnmpTarget", propOrder = {
    "host",
    "port",
    "community",
    "trapVersion",
    "securityName",
    "securityLevel"
})
public class DmSnmpTarget {

    @XmlElement(name = "Host", required = true)
    protected String host;
    @XmlElement(name = "Port", required = true, type = Integer.class, nillable = true)
    protected Integer port;
    @XmlElement(name = "Community", required = true, nillable = true)
    protected String community;
    @XmlElement(name = "TrapVersion", required = true, nillable = true)
    protected String trapVersion;
    @XmlElement(name = "SecurityName", required = true, nillable = true)
    protected String securityName;
    @XmlElement(name = "SecurityLevel", required = true, nillable = true)
    protected DmSnmpSecurityLevel securityLevel;

    /**
     * Gets the value of the host property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHost() {
        return host;
    }

    /**
     * Sets the value of the host property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHost(String value) {
        this.host = value;
    }

    /**
     * Gets the value of the port property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPort() {
        return port;
    }

    /**
     * Sets the value of the port property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPort(Integer value) {
        this.port = value;
    }

    /**
     * Gets the value of the community property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCommunity() {
        return community;
    }

    /**
     * Sets the value of the community property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCommunity(String value) {
        this.community = value;
    }

    /**
     * Gets the value of the trapVersion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrapVersion() {
        return trapVersion;
    }

    /**
     * Sets the value of the trapVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrapVersion(String value) {
        this.trapVersion = value;
    }

    /**
     * Gets the value of the securityName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSecurityName() {
        return securityName;
    }

    /**
     * Sets the value of the securityName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSecurityName(String value) {
        this.securityName = value;
    }

    /**
     * Gets the value of the securityLevel property.
     * 
     * @return
     *     possible object is
     *     {@link DmSnmpSecurityLevel }
     *     
     */
    public DmSnmpSecurityLevel getSecurityLevel() {
        return securityLevel;
    }

    /**
     * Sets the value of the securityLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmSnmpSecurityLevel }
     *     
     */
    public void setSecurityLevel(DmSnmpSecurityLevel value) {
        this.securityLevel = value;
    }

}
