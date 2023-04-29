
package client.soma.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dmConformanceProfiles complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="dmConformanceProfiles">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="BP10" type="{http://www.datapower.com/schemas/management}dmToggle" minOccurs="0"/>
 *         &lt;element name="BP11" type="{http://www.datapower.com/schemas/management}dmToggle" minOccurs="0"/>
 *         &lt;element name="AP10" type="{http://www.datapower.com/schemas/management}dmToggle" minOccurs="0"/>
 *         &lt;element name="BSP10" type="{http://www.datapower.com/schemas/management}dmToggle" minOccurs="0"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dmConformanceProfiles", propOrder = {

})
public class DmConformanceProfiles {

    @XmlElement(name = "BP10")
    protected DmToggle bp10;
    @XmlElement(name = "BP11")
    protected DmToggle bp11;
    @XmlElement(name = "AP10")
    protected DmToggle ap10;
    @XmlElement(name = "BSP10")
    protected DmToggle bsp10;

    /**
     * Gets the value of the bp10 property.
     * 
     * @return
     *     possible object is
     *     {@link DmToggle }
     *     
     */
    public DmToggle getBP10() {
        return bp10;
    }

    /**
     * Sets the value of the bp10 property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmToggle }
     *     
     */
    public void setBP10(DmToggle value) {
        this.bp10 = value;
    }

    /**
     * Gets the value of the bp11 property.
     * 
     * @return
     *     possible object is
     *     {@link DmToggle }
     *     
     */
    public DmToggle getBP11() {
        return bp11;
    }

    /**
     * Sets the value of the bp11 property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmToggle }
     *     
     */
    public void setBP11(DmToggle value) {
        this.bp11 = value;
    }

    /**
     * Gets the value of the ap10 property.
     * 
     * @return
     *     possible object is
     *     {@link DmToggle }
     *     
     */
    public DmToggle getAP10() {
        return ap10;
    }

    /**
     * Sets the value of the ap10 property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmToggle }
     *     
     */
    public void setAP10(DmToggle value) {
        this.ap10 = value;
    }

    /**
     * Gets the value of the bsp10 property.
     * 
     * @return
     *     possible object is
     *     {@link DmToggle }
     *     
     */
    public DmToggle getBSP10() {
        return bsp10;
    }

    /**
     * Sets the value of the bsp10 property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmToggle }
     *     
     */
    public void setBSP10(DmToggle value) {
        this.bsp10 = value;
    }

}
