
package client.soma.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ActionUniversalStopPacketCapture complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ActionUniversalStopPacketCapture">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="InterfaceType" type="{http://www.datapower.com/schemas/management}dmPcapInterfaceType"/>
 *         &lt;element name="EthernetInterface" type="{http://www.datapower.com/schemas/management}dmReference" minOccurs="0"/>
 *         &lt;element name="VLANInterface" type="{http://www.datapower.com/schemas/management}dmReference" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ActionUniversalStopPacketCapture", propOrder = {
    "interfaceType",
    "ethernetInterface",
    "vlanInterface"
})
public class ActionUniversalStopPacketCapture {

    @XmlElement(name = "InterfaceType", required = true)
    protected DmPcapInterfaceType interfaceType;
    @XmlElement(name = "EthernetInterface")
    protected DmReference ethernetInterface;
    @XmlElement(name = "VLANInterface")
    protected DmReference vlanInterface;

    /**
     * Gets the value of the interfaceType property.
     * 
     * @return
     *     possible object is
     *     {@link DmPcapInterfaceType }
     *     
     */
    public DmPcapInterfaceType getInterfaceType() {
        return interfaceType;
    }

    /**
     * Sets the value of the interfaceType property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmPcapInterfaceType }
     *     
     */
    public void setInterfaceType(DmPcapInterfaceType value) {
        this.interfaceType = value;
    }

    /**
     * Gets the value of the ethernetInterface property.
     * 
     * @return
     *     possible object is
     *     {@link DmReference }
     *     
     */
    public DmReference getEthernetInterface() {
        return ethernetInterface;
    }

    /**
     * Sets the value of the ethernetInterface property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmReference }
     *     
     */
    public void setEthernetInterface(DmReference value) {
        this.ethernetInterface = value;
    }

    /**
     * Gets the value of the vlanInterface property.
     * 
     * @return
     *     possible object is
     *     {@link DmReference }
     *     
     */
    public DmReference getVLANInterface() {
        return vlanInterface;
    }

    /**
     * Sets the value of the vlanInterface property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmReference }
     *     
     */
    public void setVLANInterface(DmReference value) {
        this.vlanInterface = value;
    }

}
