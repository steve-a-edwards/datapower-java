
package client.soma.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dmLTPATokenVersion complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="dmLTPATokenVersion">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="LTPA" type="{http://www.datapower.com/schemas/management}dmToggle" minOccurs="0"/>
 *         &lt;element name="LTPA2" type="{http://www.datapower.com/schemas/management}dmToggle" minOccurs="0"/>
 *         &lt;element name="LTPADomino" type="{http://www.datapower.com/schemas/management}dmToggle" minOccurs="0"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dmLTPATokenVersion", propOrder = {

})
public class DmLTPATokenVersion {

    @XmlElement(name = "LTPA")
    protected DmToggle ltpa;
    @XmlElement(name = "LTPA2")
    protected DmToggle ltpa2;
    @XmlElement(name = "LTPADomino")
    protected DmToggle ltpaDomino;

    /**
     * Gets the value of the ltpa property.
     * 
     * @return
     *     possible object is
     *     {@link DmToggle }
     *     
     */
    public DmToggle getLTPA() {
        return ltpa;
    }

    /**
     * Sets the value of the ltpa property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmToggle }
     *     
     */
    public void setLTPA(DmToggle value) {
        this.ltpa = value;
    }

    /**
     * Gets the value of the ltpa2 property.
     * 
     * @return
     *     possible object is
     *     {@link DmToggle }
     *     
     */
    public DmToggle getLTPA2() {
        return ltpa2;
    }

    /**
     * Sets the value of the ltpa2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmToggle }
     *     
     */
    public void setLTPA2(DmToggle value) {
        this.ltpa2 = value;
    }

    /**
     * Gets the value of the ltpaDomino property.
     * 
     * @return
     *     possible object is
     *     {@link DmToggle }
     *     
     */
    public DmToggle getLTPADomino() {
        return ltpaDomino;
    }

    /**
     * Sets the value of the ltpaDomino property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmToggle }
     *     
     */
    public void setLTPADomino(DmToggle value) {
        this.ltpaDomino = value;
    }

}
