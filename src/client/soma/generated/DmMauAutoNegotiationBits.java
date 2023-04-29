
package client.soma.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dmMauAutoNegotiationBits complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="dmMauAutoNegotiationBits">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="eth10baseTHD" type="{http://www.datapower.com/schemas/management}dmToggle" minOccurs="0"/>
 *         &lt;element name="eth10baseTFD" type="{http://www.datapower.com/schemas/management}dmToggle" minOccurs="0"/>
 *         &lt;element name="eth100baseXHD" type="{http://www.datapower.com/schemas/management}dmToggle" minOccurs="0"/>
 *         &lt;element name="eth100baseXFD" type="{http://www.datapower.com/schemas/management}dmToggle" minOccurs="0"/>
 *         &lt;element name="eth100baseT4HD" type="{http://www.datapower.com/schemas/management}dmToggle" minOccurs="0"/>
 *         &lt;element name="eth100baseTXHD" type="{http://www.datapower.com/schemas/management}dmToggle" minOccurs="0"/>
 *         &lt;element name="eth100baseTXFD" type="{http://www.datapower.com/schemas/management}dmToggle" minOccurs="0"/>
 *         &lt;element name="eth100baseT2HD" type="{http://www.datapower.com/schemas/management}dmToggle" minOccurs="0"/>
 *         &lt;element name="eth100baseT2FD" type="{http://www.datapower.com/schemas/management}dmToggle" minOccurs="0"/>
 *         &lt;element name="eth1000baseTHD" type="{http://www.datapower.com/schemas/management}dmToggle" minOccurs="0"/>
 *         &lt;element name="eth1000baseTFD" type="{http://www.datapower.com/schemas/management}dmToggle" minOccurs="0"/>
 *         &lt;element name="eth1000baseXHD" type="{http://www.datapower.com/schemas/management}dmToggle" minOccurs="0"/>
 *         &lt;element name="eth1000baseXFD" type="{http://www.datapower.com/schemas/management}dmToggle" minOccurs="0"/>
 *         &lt;element name="ethAsymPauseFD" type="{http://www.datapower.com/schemas/management}dmToggle" minOccurs="0"/>
 *         &lt;element name="ethSymPauseFD" type="{http://www.datapower.com/schemas/management}dmToggle" minOccurs="0"/>
 *         &lt;element name="ethAsymSymPauseFD" type="{http://www.datapower.com/schemas/management}dmToggle" minOccurs="0"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dmMauAutoNegotiationBits", propOrder = {

})
public class DmMauAutoNegotiationBits {

    @XmlElement(name = "eth10baseTHD")
    protected DmToggle eth10BaseTHD;
    @XmlElement(name = "eth10baseTFD")
    protected DmToggle eth10BaseTFD;
    @XmlElement(name = "eth100baseXHD")
    protected DmToggle eth100BaseXHD;
    @XmlElement(name = "eth100baseXFD")
    protected DmToggle eth100BaseXFD;
    @XmlElement(name = "eth100baseT4HD")
    protected DmToggle eth100BaseT4HD;
    @XmlElement(name = "eth100baseTXHD")
    protected DmToggle eth100BaseTXHD;
    @XmlElement(name = "eth100baseTXFD")
    protected DmToggle eth100BaseTXFD;
    @XmlElement(name = "eth100baseT2HD")
    protected DmToggle eth100BaseT2HD;
    @XmlElement(name = "eth100baseT2FD")
    protected DmToggle eth100BaseT2FD;
    @XmlElement(name = "eth1000baseTHD")
    protected DmToggle eth1000BaseTHD;
    @XmlElement(name = "eth1000baseTFD")
    protected DmToggle eth1000BaseTFD;
    @XmlElement(name = "eth1000baseXHD")
    protected DmToggle eth1000BaseXHD;
    @XmlElement(name = "eth1000baseXFD")
    protected DmToggle eth1000BaseXFD;
    protected DmToggle ethAsymPauseFD;
    protected DmToggle ethSymPauseFD;
    protected DmToggle ethAsymSymPauseFD;

    /**
     * Gets the value of the eth10BaseTHD property.
     * 
     * @return
     *     possible object is
     *     {@link DmToggle }
     *     
     */
    public DmToggle getEth10BaseTHD() {
        return eth10BaseTHD;
    }

    /**
     * Sets the value of the eth10BaseTHD property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmToggle }
     *     
     */
    public void setEth10BaseTHD(DmToggle value) {
        this.eth10BaseTHD = value;
    }

    /**
     * Gets the value of the eth10BaseTFD property.
     * 
     * @return
     *     possible object is
     *     {@link DmToggle }
     *     
     */
    public DmToggle getEth10BaseTFD() {
        return eth10BaseTFD;
    }

    /**
     * Sets the value of the eth10BaseTFD property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmToggle }
     *     
     */
    public void setEth10BaseTFD(DmToggle value) {
        this.eth10BaseTFD = value;
    }

    /**
     * Gets the value of the eth100BaseXHD property.
     * 
     * @return
     *     possible object is
     *     {@link DmToggle }
     *     
     */
    public DmToggle getEth100BaseXHD() {
        return eth100BaseXHD;
    }

    /**
     * Sets the value of the eth100BaseXHD property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmToggle }
     *     
     */
    public void setEth100BaseXHD(DmToggle value) {
        this.eth100BaseXHD = value;
    }

    /**
     * Gets the value of the eth100BaseXFD property.
     * 
     * @return
     *     possible object is
     *     {@link DmToggle }
     *     
     */
    public DmToggle getEth100BaseXFD() {
        return eth100BaseXFD;
    }

    /**
     * Sets the value of the eth100BaseXFD property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmToggle }
     *     
     */
    public void setEth100BaseXFD(DmToggle value) {
        this.eth100BaseXFD = value;
    }

    /**
     * Gets the value of the eth100BaseT4HD property.
     * 
     * @return
     *     possible object is
     *     {@link DmToggle }
     *     
     */
    public DmToggle getEth100BaseT4HD() {
        return eth100BaseT4HD;
    }

    /**
     * Sets the value of the eth100BaseT4HD property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmToggle }
     *     
     */
    public void setEth100BaseT4HD(DmToggle value) {
        this.eth100BaseT4HD = value;
    }

    /**
     * Gets the value of the eth100BaseTXHD property.
     * 
     * @return
     *     possible object is
     *     {@link DmToggle }
     *     
     */
    public DmToggle getEth100BaseTXHD() {
        return eth100BaseTXHD;
    }

    /**
     * Sets the value of the eth100BaseTXHD property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmToggle }
     *     
     */
    public void setEth100BaseTXHD(DmToggle value) {
        this.eth100BaseTXHD = value;
    }

    /**
     * Gets the value of the eth100BaseTXFD property.
     * 
     * @return
     *     possible object is
     *     {@link DmToggle }
     *     
     */
    public DmToggle getEth100BaseTXFD() {
        return eth100BaseTXFD;
    }

    /**
     * Sets the value of the eth100BaseTXFD property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmToggle }
     *     
     */
    public void setEth100BaseTXFD(DmToggle value) {
        this.eth100BaseTXFD = value;
    }

    /**
     * Gets the value of the eth100BaseT2HD property.
     * 
     * @return
     *     possible object is
     *     {@link DmToggle }
     *     
     */
    public DmToggle getEth100BaseT2HD() {
        return eth100BaseT2HD;
    }

    /**
     * Sets the value of the eth100BaseT2HD property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmToggle }
     *     
     */
    public void setEth100BaseT2HD(DmToggle value) {
        this.eth100BaseT2HD = value;
    }

    /**
     * Gets the value of the eth100BaseT2FD property.
     * 
     * @return
     *     possible object is
     *     {@link DmToggle }
     *     
     */
    public DmToggle getEth100BaseT2FD() {
        return eth100BaseT2FD;
    }

    /**
     * Sets the value of the eth100BaseT2FD property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmToggle }
     *     
     */
    public void setEth100BaseT2FD(DmToggle value) {
        this.eth100BaseT2FD = value;
    }

    /**
     * Gets the value of the eth1000BaseTHD property.
     * 
     * @return
     *     possible object is
     *     {@link DmToggle }
     *     
     */
    public DmToggle getEth1000BaseTHD() {
        return eth1000BaseTHD;
    }

    /**
     * Sets the value of the eth1000BaseTHD property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmToggle }
     *     
     */
    public void setEth1000BaseTHD(DmToggle value) {
        this.eth1000BaseTHD = value;
    }

    /**
     * Gets the value of the eth1000BaseTFD property.
     * 
     * @return
     *     possible object is
     *     {@link DmToggle }
     *     
     */
    public DmToggle getEth1000BaseTFD() {
        return eth1000BaseTFD;
    }

    /**
     * Sets the value of the eth1000BaseTFD property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmToggle }
     *     
     */
    public void setEth1000BaseTFD(DmToggle value) {
        this.eth1000BaseTFD = value;
    }

    /**
     * Gets the value of the eth1000BaseXHD property.
     * 
     * @return
     *     possible object is
     *     {@link DmToggle }
     *     
     */
    public DmToggle getEth1000BaseXHD() {
        return eth1000BaseXHD;
    }

    /**
     * Sets the value of the eth1000BaseXHD property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmToggle }
     *     
     */
    public void setEth1000BaseXHD(DmToggle value) {
        this.eth1000BaseXHD = value;
    }

    /**
     * Gets the value of the eth1000BaseXFD property.
     * 
     * @return
     *     possible object is
     *     {@link DmToggle }
     *     
     */
    public DmToggle getEth1000BaseXFD() {
        return eth1000BaseXFD;
    }

    /**
     * Sets the value of the eth1000BaseXFD property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmToggle }
     *     
     */
    public void setEth1000BaseXFD(DmToggle value) {
        this.eth1000BaseXFD = value;
    }

    /**
     * Gets the value of the ethAsymPauseFD property.
     * 
     * @return
     *     possible object is
     *     {@link DmToggle }
     *     
     */
    public DmToggle getEthAsymPauseFD() {
        return ethAsymPauseFD;
    }

    /**
     * Sets the value of the ethAsymPauseFD property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmToggle }
     *     
     */
    public void setEthAsymPauseFD(DmToggle value) {
        this.ethAsymPauseFD = value;
    }

    /**
     * Gets the value of the ethSymPauseFD property.
     * 
     * @return
     *     possible object is
     *     {@link DmToggle }
     *     
     */
    public DmToggle getEthSymPauseFD() {
        return ethSymPauseFD;
    }

    /**
     * Sets the value of the ethSymPauseFD property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmToggle }
     *     
     */
    public void setEthSymPauseFD(DmToggle value) {
        this.ethSymPauseFD = value;
    }

    /**
     * Gets the value of the ethAsymSymPauseFD property.
     * 
     * @return
     *     possible object is
     *     {@link DmToggle }
     *     
     */
    public DmToggle getEthAsymSymPauseFD() {
        return ethAsymSymPauseFD;
    }

    /**
     * Sets the value of the ethAsymSymPauseFD property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmToggle }
     *     
     */
    public void setEthAsymSymPauseFD(DmToggle value) {
        this.ethAsymSymPauseFD = value;
    }

}
