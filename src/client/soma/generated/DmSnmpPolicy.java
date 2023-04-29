
package client.soma.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dmSnmpPolicy complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="dmSnmpPolicy">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Community" type="{http://www.datapower.com/schemas/management}dmString"/>
 *         &lt;element name="Domain" type="{http://www.datapower.com/schemas/management}dmReference"/>
 *         &lt;element name="Mode" type="{http://www.datapower.com/schemas/management}dmSnmpAccessMode"/>
 *         &lt;element name="Host" type="{http://www.datapower.com/schemas/management}dmIPNetAddress"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dmSnmpPolicy", propOrder = {
    "community",
    "domain",
    "mode",
    "host"
})
public class DmSnmpPolicy {

    @XmlElement(name = "Community", required = true)
    protected String community;
    @XmlElement(name = "Domain", required = true)
    protected DmReference domain;
    @XmlElement(name = "Mode", required = true)
    protected DmSnmpAccessMode mode;
    @XmlElement(name = "Host", required = true, nillable = true)
    protected String host;

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
     * Gets the value of the domain property.
     * 
     * @return
     *     possible object is
     *     {@link DmReference }
     *     
     */
    public DmReference getDomain() {
        return domain;
    }

    /**
     * Sets the value of the domain property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmReference }
     *     
     */
    public void setDomain(DmReference value) {
        this.domain = value;
    }

    /**
     * Gets the value of the mode property.
     * 
     * @return
     *     possible object is
     *     {@link DmSnmpAccessMode }
     *     
     */
    public DmSnmpAccessMode getMode() {
        return mode;
    }

    /**
     * Sets the value of the mode property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmSnmpAccessMode }
     *     
     */
    public void setMode(DmSnmpAccessMode value) {
        this.mode = value;
    }

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

}
