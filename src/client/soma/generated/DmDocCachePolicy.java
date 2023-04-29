
package client.soma.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dmDocCachePolicy complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="dmDocCachePolicy">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Match" type="{http://www.datapower.com/schemas/management}dmString"/>
 *         &lt;element name="Type" type="{http://www.datapower.com/schemas/management}dmDocCachePolicyType"/>
 *         &lt;element name="TTL" type="{http://www.datapower.com/schemas/management}dmUInt32"/>
 *         &lt;element name="Priority" type="{http://www.datapower.com/schemas/management}dmUInt32"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dmDocCachePolicy", propOrder = {
    "match",
    "type",
    "ttl",
    "priority"
})
public class DmDocCachePolicy {

    @XmlElement(name = "Match", required = true, nillable = true)
    protected String match;
    @XmlElement(name = "Type", required = true)
    protected DmDocCachePolicyType type;
    @XmlElement(name = "TTL", required = true, type = Long.class, nillable = true)
    protected Long ttl;
    @XmlElement(name = "Priority")
    protected long priority;

    /**
     * Gets the value of the match property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMatch() {
        return match;
    }

    /**
     * Sets the value of the match property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMatch(String value) {
        this.match = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link DmDocCachePolicyType }
     *     
     */
    public DmDocCachePolicyType getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmDocCachePolicyType }
     *     
     */
    public void setType(DmDocCachePolicyType value) {
        this.type = value;
    }

    /**
     * Gets the value of the ttl property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTTL() {
        return ttl;
    }

    /**
     * Sets the value of the ttl property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTTL(Long value) {
        this.ttl = value;
    }

    /**
     * Gets the value of the priority property.
     * 
     */
    public long getPriority() {
        return priority;
    }

    /**
     * Sets the value of the priority property.
     * 
     */
    public void setPriority(long value) {
        this.priority = value;
    }

}
