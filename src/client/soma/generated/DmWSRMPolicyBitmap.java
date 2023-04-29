
package client.soma.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dmWSRMPolicyBitmap complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="dmWSRMPolicyBitmap">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="Optional" type="{http://www.datapower.com/schemas/management}dmToggle" minOccurs="0"/>
 *         &lt;element name="SequenceTransportSecurity" type="{http://www.datapower.com/schemas/management}dmToggle" minOccurs="0"/>
 *         &lt;element name="InOrder" type="{http://www.datapower.com/schemas/management}dmToggle" minOccurs="0"/>
 *         &lt;element name="TwoWay" type="{http://www.datapower.com/schemas/management}dmToggle" minOccurs="0"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dmWSRMPolicyBitmap", propOrder = {

})
public class DmWSRMPolicyBitmap {

    @XmlElement(name = "Optional")
    protected DmToggle optional;
    @XmlElement(name = "SequenceTransportSecurity")
    protected DmToggle sequenceTransportSecurity;
    @XmlElement(name = "InOrder")
    protected DmToggle inOrder;
    @XmlElement(name = "TwoWay")
    protected DmToggle twoWay;

    /**
     * Gets the value of the optional property.
     * 
     * @return
     *     possible object is
     *     {@link DmToggle }
     *     
     */
    public DmToggle getOptional() {
        return optional;
    }

    /**
     * Sets the value of the optional property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmToggle }
     *     
     */
    public void setOptional(DmToggle value) {
        this.optional = value;
    }

    /**
     * Gets the value of the sequenceTransportSecurity property.
     * 
     * @return
     *     possible object is
     *     {@link DmToggle }
     *     
     */
    public DmToggle getSequenceTransportSecurity() {
        return sequenceTransportSecurity;
    }

    /**
     * Sets the value of the sequenceTransportSecurity property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmToggle }
     *     
     */
    public void setSequenceTransportSecurity(DmToggle value) {
        this.sequenceTransportSecurity = value;
    }

    /**
     * Gets the value of the inOrder property.
     * 
     * @return
     *     possible object is
     *     {@link DmToggle }
     *     
     */
    public DmToggle getInOrder() {
        return inOrder;
    }

    /**
     * Sets the value of the inOrder property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmToggle }
     *     
     */
    public void setInOrder(DmToggle value) {
        this.inOrder = value;
    }

    /**
     * Gets the value of the twoWay property.
     * 
     * @return
     *     possible object is
     *     {@link DmToggle }
     *     
     */
    public DmToggle getTwoWay() {
        return twoWay;
    }

    /**
     * Sets the value of the twoWay property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmToggle }
     *     
     */
    public void setTwoWay(DmToggle value) {
        this.twoWay = value;
    }

}
