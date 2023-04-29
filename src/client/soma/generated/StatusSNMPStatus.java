
package client.soma.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for StatusSNMPStatus complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StatusSNMPStatus">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="EngineID" type="{http://www.datapower.com/schemas/management}dmString" minOccurs="0"/>
 *         &lt;element name="EngineBoots" type="{http://www.datapower.com/schemas/management}dmUInt32" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StatusSNMPStatus", propOrder = {
    "engineID",
    "engineBoots"
})
public class StatusSNMPStatus {

    @XmlElement(name = "EngineID")
    protected String engineID;
    @XmlElement(name = "EngineBoots")
    protected Long engineBoots;

    /**
     * Gets the value of the engineID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEngineID() {
        return engineID;
    }

    /**
     * Sets the value of the engineID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEngineID(String value) {
        this.engineID = value;
    }

    /**
     * Gets the value of the engineBoots property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getEngineBoots() {
        return engineBoots;
    }

    /**
     * Sets the value of the engineBoots property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setEngineBoots(Long value) {
        this.engineBoots = value;
    }

}
