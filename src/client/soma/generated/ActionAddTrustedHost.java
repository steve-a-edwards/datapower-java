
package client.soma.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ActionAddTrustedHost complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ActionAddTrustedHost">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Host" type="{http://www.datapower.com/schemas/management}dmHostname"/>
 *         &lt;element name="Type" type="{http://www.datapower.com/schemas/management}dmTrustedHostKeyType"/>
 *         &lt;element name="Key" type="{http://www.datapower.com/schemas/management}dmString"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ActionAddTrustedHost", propOrder = {
    "host",
    "type",
    "key"
})
public class ActionAddTrustedHost {

    @XmlElement(name = "Host", required = true)
    protected String host;
    @XmlElement(name = "Type", required = true)
    protected DmTrustedHostKeyType type;
    @XmlElement(name = "Key", required = true)
    protected String key;

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
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link DmTrustedHostKeyType }
     *     
     */
    public DmTrustedHostKeyType getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmTrustedHostKeyType }
     *     
     */
    public void setType(DmTrustedHostKeyType value) {
        this.type = value;
    }

    /**
     * Gets the value of the key property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKey() {
        return key;
    }

    /**
     * Sets the value of the key property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKey(String value) {
        this.key = value;
    }

}
