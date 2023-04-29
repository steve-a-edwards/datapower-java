
package client.soma.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dmHeaderRetentionBitmap complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="dmHeaderRetentionBitmap">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="TE" type="{http://www.datapower.com/schemas/management}dmToggle" minOccurs="0"/>
 *         &lt;element name="Accept-Encoding" type="{http://www.datapower.com/schemas/management}dmToggle" minOccurs="0"/>
 *         &lt;element name="Range" type="{http://www.datapower.com/schemas/management}dmToggle" minOccurs="0"/>
 *         &lt;element name="MQMD" type="{http://www.datapower.com/schemas/management}dmToggle" minOccurs="0"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dmHeaderRetentionBitmap", propOrder = {

})
public class DmHeaderRetentionBitmap {

    @XmlElement(name = "TE")
    protected DmToggle te;
    @XmlElement(name = "Accept-Encoding")
    protected DmToggle acceptEncoding;
    @XmlElement(name = "Range")
    protected DmToggle range;
    @XmlElement(name = "MQMD")
    protected DmToggle mqmd;

    /**
     * Gets the value of the te property.
     * 
     * @return
     *     possible object is
     *     {@link DmToggle }
     *     
     */
    public DmToggle getTE() {
        return te;
    }

    /**
     * Sets the value of the te property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmToggle }
     *     
     */
    public void setTE(DmToggle value) {
        this.te = value;
    }

    /**
     * Gets the value of the acceptEncoding property.
     * 
     * @return
     *     possible object is
     *     {@link DmToggle }
     *     
     */
    public DmToggle getAcceptEncoding() {
        return acceptEncoding;
    }

    /**
     * Sets the value of the acceptEncoding property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmToggle }
     *     
     */
    public void setAcceptEncoding(DmToggle value) {
        this.acceptEncoding = value;
    }

    /**
     * Gets the value of the range property.
     * 
     * @return
     *     possible object is
     *     {@link DmToggle }
     *     
     */
    public DmToggle getRange() {
        return range;
    }

    /**
     * Sets the value of the range property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmToggle }
     *     
     */
    public void setRange(DmToggle value) {
        this.range = value;
    }

    /**
     * Gets the value of the mqmd property.
     * 
     * @return
     *     possible object is
     *     {@link DmToggle }
     *     
     */
    public DmToggle getMQMD() {
        return mqmd;
    }

    /**
     * Sets the value of the mqmd property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmToggle }
     *     
     */
    public void setMQMD(DmToggle value) {
        this.mqmd = value;
    }

}
