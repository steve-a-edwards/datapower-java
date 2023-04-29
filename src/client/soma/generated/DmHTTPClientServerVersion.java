
package client.soma.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dmHTTPClientServerVersion complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="dmHTTPClientServerVersion">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Front" type="{http://www.datapower.com/schemas/management}dmHTTPVersion"/>
 *         &lt;element name="Back" type="{http://www.datapower.com/schemas/management}dmHTTPVersion"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dmHTTPClientServerVersion", propOrder = {
    "front",
    "back"
})
public class DmHTTPClientServerVersion {

    @XmlElement(name = "Front", required = true, nillable = true)
    protected DmHTTPVersion front;
    @XmlElement(name = "Back", required = true, nillable = true)
    protected DmHTTPVersion back;

    /**
     * Gets the value of the front property.
     * 
     * @return
     *     possible object is
     *     {@link DmHTTPVersion }
     *     
     */
    public DmHTTPVersion getFront() {
        return front;
    }

    /**
     * Sets the value of the front property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmHTTPVersion }
     *     
     */
    public void setFront(DmHTTPVersion value) {
        this.front = value;
    }

    /**
     * Gets the value of the back property.
     * 
     * @return
     *     possible object is
     *     {@link DmHTTPVersion }
     *     
     */
    public DmHTTPVersion getBack() {
        return back;
    }

    /**
     * Sets the value of the back property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmHTTPVersion }
     *     
     */
    public void setBack(DmHTTPVersion value) {
        this.back = value;
    }

}
