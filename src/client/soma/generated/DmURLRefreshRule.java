
package client.soma.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dmURLRefreshRule complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="dmURLRefreshRule">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="URLMap" type="{http://www.datapower.com/schemas/management}dmReference"/>
 *         &lt;element name="URLRefreshPolicy" type="{http://www.datapower.com/schemas/management}dmURLRefreshPolicyType"/>
 *         &lt;element name="URLRefreshInterval" type="{http://www.datapower.com/schemas/management}dmTimeInterval"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dmURLRefreshRule", propOrder = {
    "urlMap",
    "urlRefreshPolicy",
    "urlRefreshInterval"
})
public class DmURLRefreshRule {

    @XmlElement(name = "URLMap", required = true)
    protected DmReference urlMap;
    @XmlElement(name = "URLRefreshPolicy", required = true, nillable = true)
    protected DmURLRefreshPolicyType urlRefreshPolicy;
    @XmlElement(name = "URLRefreshInterval", required = true, type = Long.class, nillable = true)
    protected Long urlRefreshInterval;

    /**
     * Gets the value of the urlMap property.
     * 
     * @return
     *     possible object is
     *     {@link DmReference }
     *     
     */
    public DmReference getURLMap() {
        return urlMap;
    }

    /**
     * Sets the value of the urlMap property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmReference }
     *     
     */
    public void setURLMap(DmReference value) {
        this.urlMap = value;
    }

    /**
     * Gets the value of the urlRefreshPolicy property.
     * 
     * @return
     *     possible object is
     *     {@link DmURLRefreshPolicyType }
     *     
     */
    public DmURLRefreshPolicyType getURLRefreshPolicy() {
        return urlRefreshPolicy;
    }

    /**
     * Sets the value of the urlRefreshPolicy property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmURLRefreshPolicyType }
     *     
     */
    public void setURLRefreshPolicy(DmURLRefreshPolicyType value) {
        this.urlRefreshPolicy = value;
    }

    /**
     * Gets the value of the urlRefreshInterval property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getURLRefreshInterval() {
        return urlRefreshInterval;
    }

    /**
     * Sets the value of the urlRefreshInterval property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setURLRefreshInterval(Long value) {
        this.urlRefreshInterval = value;
    }

}
