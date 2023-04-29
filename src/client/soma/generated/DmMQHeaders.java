
package client.soma.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dmMQHeaders complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="dmMQHeaders">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="MQCIH" type="{http://www.datapower.com/schemas/management}dmToggle" minOccurs="0"/>
 *         &lt;element name="MQDLH" type="{http://www.datapower.com/schemas/management}dmToggle" minOccurs="0"/>
 *         &lt;element name="MQIIH" type="{http://www.datapower.com/schemas/management}dmToggle" minOccurs="0"/>
 *         &lt;element name="MQRFH" type="{http://www.datapower.com/schemas/management}dmToggle" minOccurs="0"/>
 *         &lt;element name="MQRFH2" type="{http://www.datapower.com/schemas/management}dmToggle" minOccurs="0"/>
 *         &lt;element name="MQWIH" type="{http://www.datapower.com/schemas/management}dmToggle" minOccurs="0"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dmMQHeaders", propOrder = {

})
public class DmMQHeaders {

    @XmlElement(name = "MQCIH")
    protected DmToggle mqcih;
    @XmlElement(name = "MQDLH")
    protected DmToggle mqdlh;
    @XmlElement(name = "MQIIH")
    protected DmToggle mqiih;
    @XmlElement(name = "MQRFH")
    protected DmToggle mqrfh;
    @XmlElement(name = "MQRFH2")
    protected DmToggle mqrfh2;
    @XmlElement(name = "MQWIH")
    protected DmToggle mqwih;

    /**
     * Gets the value of the mqcih property.
     * 
     * @return
     *     possible object is
     *     {@link DmToggle }
     *     
     */
    public DmToggle getMQCIH() {
        return mqcih;
    }

    /**
     * Sets the value of the mqcih property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmToggle }
     *     
     */
    public void setMQCIH(DmToggle value) {
        this.mqcih = value;
    }

    /**
     * Gets the value of the mqdlh property.
     * 
     * @return
     *     possible object is
     *     {@link DmToggle }
     *     
     */
    public DmToggle getMQDLH() {
        return mqdlh;
    }

    /**
     * Sets the value of the mqdlh property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmToggle }
     *     
     */
    public void setMQDLH(DmToggle value) {
        this.mqdlh = value;
    }

    /**
     * Gets the value of the mqiih property.
     * 
     * @return
     *     possible object is
     *     {@link DmToggle }
     *     
     */
    public DmToggle getMQIIH() {
        return mqiih;
    }

    /**
     * Sets the value of the mqiih property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmToggle }
     *     
     */
    public void setMQIIH(DmToggle value) {
        this.mqiih = value;
    }

    /**
     * Gets the value of the mqrfh property.
     * 
     * @return
     *     possible object is
     *     {@link DmToggle }
     *     
     */
    public DmToggle getMQRFH() {
        return mqrfh;
    }

    /**
     * Sets the value of the mqrfh property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmToggle }
     *     
     */
    public void setMQRFH(DmToggle value) {
        this.mqrfh = value;
    }

    /**
     * Gets the value of the mqrfh2 property.
     * 
     * @return
     *     possible object is
     *     {@link DmToggle }
     *     
     */
    public DmToggle getMQRFH2() {
        return mqrfh2;
    }

    /**
     * Sets the value of the mqrfh2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmToggle }
     *     
     */
    public void setMQRFH2(DmToggle value) {
        this.mqrfh2 = value;
    }

    /**
     * Gets the value of the mqwih property.
     * 
     * @return
     *     possible object is
     *     {@link DmToggle }
     *     
     */
    public DmToggle getMQWIH() {
        return mqwih;
    }

    /**
     * Sets the value of the mqwih property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmToggle }
     *     
     */
    public void setMQWIH(DmToggle value) {
        this.mqwih = value;
    }

}
