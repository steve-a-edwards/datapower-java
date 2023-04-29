
package client.soma.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dmHTTPVersionMask complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="dmHTTPVersionMask">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="HTTP-1.0" type="{http://www.datapower.com/schemas/management}dmToggle" minOccurs="0"/>
 *         &lt;element name="HTTP-1.1" type="{http://www.datapower.com/schemas/management}dmToggle" minOccurs="0"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dmHTTPVersionMask", propOrder = {

})
public class DmHTTPVersionMask {

    @XmlElement(name = "HTTP-1.0")
    protected DmToggle http10;
    @XmlElement(name = "HTTP-1.1")
    protected DmToggle http11;

    /**
     * Gets the value of the http10 property.
     * 
     * @return
     *     possible object is
     *     {@link DmToggle }
     *     
     */
    public DmToggle getHTTP10() {
        return http10;
    }

    /**
     * Sets the value of the http10 property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmToggle }
     *     
     */
    public void setHTTP10(DmToggle value) {
        this.http10 = value;
    }

    /**
     * Gets the value of the http11 property.
     * 
     * @return
     *     possible object is
     *     {@link DmToggle }
     *     
     */
    public DmToggle getHTTP11() {
        return http11;
    }

    /**
     * Sets the value of the http11 property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmToggle }
     *     
     */
    public void setHTTP11(DmToggle value) {
        this.http11 = value;
    }

}
