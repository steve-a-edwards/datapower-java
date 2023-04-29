
package client.soma.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for StatusVlanInterfaceStatus complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StatusVlanInterfaceStatus">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Name" type="{http://www.datapower.com/schemas/management}dmString" minOccurs="0"/>
 *         &lt;element name="InterfaceIndex" type="{http://www.datapower.com/schemas/management}dmUInt32" minOccurs="0"/>
 *         &lt;element name="OnEthernet" type="{http://www.datapower.com/schemas/management}dmPortName" minOccurs="0"/>
 *         &lt;element name="VlanIdentifier" type="{http://www.datapower.com/schemas/management}dmUInt32" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StatusVlanInterfaceStatus", propOrder = {
    "name",
    "interfaceIndex",
    "onEthernet",
    "vlanIdentifier"
})
public class StatusVlanInterfaceStatus {

    @XmlElement(name = "Name")
    protected String name;
    @XmlElement(name = "InterfaceIndex")
    protected Long interfaceIndex;
    @XmlElement(name = "OnEthernet")
    protected DmPortName onEthernet;
    @XmlElement(name = "VlanIdentifier")
    protected Long vlanIdentifier;

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the interfaceIndex property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getInterfaceIndex() {
        return interfaceIndex;
    }

    /**
     * Sets the value of the interfaceIndex property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setInterfaceIndex(Long value) {
        this.interfaceIndex = value;
    }

    /**
     * Gets the value of the onEthernet property.
     * 
     * @return
     *     possible object is
     *     {@link DmPortName }
     *     
     */
    public DmPortName getOnEthernet() {
        return onEthernet;
    }

    /**
     * Sets the value of the onEthernet property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmPortName }
     *     
     */
    public void setOnEthernet(DmPortName value) {
        this.onEthernet = value;
    }

    /**
     * Gets the value of the vlanIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getVlanIdentifier() {
        return vlanIdentifier;
    }

    /**
     * Sets the value of the vlanIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setVlanIdentifier(Long value) {
        this.vlanIdentifier = value;
    }

}
