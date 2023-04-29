
package client.soma.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for StatusNetworkReceiveDataThroughput complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StatusNetworkReceiveDataThroughput">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="InterfaceType" type="{http://www.datapower.com/schemas/management}dmInterfaceType" minOccurs="0"/>
 *         &lt;element name="InterfaceName" type="{http://www.datapower.com/schemas/management}dmString" minOccurs="0"/>
 *         &lt;element name="TenSecondsBits" type="{http://www.datapower.com/schemas/management}dmUInt32" minOccurs="0"/>
 *         &lt;element name="OneMinuteBits" type="{http://www.datapower.com/schemas/management}dmUInt32" minOccurs="0"/>
 *         &lt;element name="TenMinutesBits" type="{http://www.datapower.com/schemas/management}dmUInt32" minOccurs="0"/>
 *         &lt;element name="OneHourBits" type="{http://www.datapower.com/schemas/management}dmUInt32" minOccurs="0"/>
 *         &lt;element name="OneDayBits" type="{http://www.datapower.com/schemas/management}dmUInt32" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StatusNetworkReceiveDataThroughput", propOrder = {
    "interfaceType",
    "interfaceName",
    "tenSecondsBits",
    "oneMinuteBits",
    "tenMinutesBits",
    "oneHourBits",
    "oneDayBits"
})
public class StatusNetworkReceiveDataThroughput {

    @XmlElement(name = "InterfaceType")
    protected DmInterfaceType interfaceType;
    @XmlElement(name = "InterfaceName")
    protected String interfaceName;
    @XmlElement(name = "TenSecondsBits")
    protected Long tenSecondsBits;
    @XmlElement(name = "OneMinuteBits")
    protected Long oneMinuteBits;
    @XmlElement(name = "TenMinutesBits")
    protected Long tenMinutesBits;
    @XmlElement(name = "OneHourBits")
    protected Long oneHourBits;
    @XmlElement(name = "OneDayBits")
    protected Long oneDayBits;

    /**
     * Gets the value of the interfaceType property.
     * 
     * @return
     *     possible object is
     *     {@link DmInterfaceType }
     *     
     */
    public DmInterfaceType getInterfaceType() {
        return interfaceType;
    }

    /**
     * Sets the value of the interfaceType property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmInterfaceType }
     *     
     */
    public void setInterfaceType(DmInterfaceType value) {
        this.interfaceType = value;
    }

    /**
     * Gets the value of the interfaceName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInterfaceName() {
        return interfaceName;
    }

    /**
     * Sets the value of the interfaceName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInterfaceName(String value) {
        this.interfaceName = value;
    }

    /**
     * Gets the value of the tenSecondsBits property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTenSecondsBits() {
        return tenSecondsBits;
    }

    /**
     * Sets the value of the tenSecondsBits property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTenSecondsBits(Long value) {
        this.tenSecondsBits = value;
    }

    /**
     * Gets the value of the oneMinuteBits property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getOneMinuteBits() {
        return oneMinuteBits;
    }

    /**
     * Sets the value of the oneMinuteBits property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setOneMinuteBits(Long value) {
        this.oneMinuteBits = value;
    }

    /**
     * Gets the value of the tenMinutesBits property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTenMinutesBits() {
        return tenMinutesBits;
    }

    /**
     * Sets the value of the tenMinutesBits property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTenMinutesBits(Long value) {
        this.tenMinutesBits = value;
    }

    /**
     * Gets the value of the oneHourBits property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getOneHourBits() {
        return oneHourBits;
    }

    /**
     * Sets the value of the oneHourBits property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setOneHourBits(Long value) {
        this.oneHourBits = value;
    }

    /**
     * Gets the value of the oneDayBits property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getOneDayBits() {
        return oneDayBits;
    }

    /**
     * Sets the value of the oneDayBits property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setOneDayBits(Long value) {
        this.oneDayBits = value;
    }

}
