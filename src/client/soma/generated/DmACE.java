
package client.soma.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dmACE complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="dmACE">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Access" type="{http://www.datapower.com/schemas/management}dmACEAccess"/>
 *         &lt;element name="Address" type="{http://www.datapower.com/schemas/management}dmIPNetAddress"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dmACE", propOrder = {
    "access",
    "address"
})
public class DmACE {

    @XmlElement(name = "Access", required = true)
    protected DmACEAccess access;
    @XmlElement(name = "Address", required = true)
    protected String address;

    /**
     * Gets the value of the access property.
     * 
     * @return
     *     possible object is
     *     {@link DmACEAccess }
     *     
     */
    public DmACEAccess getAccess() {
        return access;
    }

    /**
     * Sets the value of the access property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmACEAccess }
     *     
     */
    public void setAccess(DmACEAccess value) {
        this.access = value;
    }

    /**
     * Gets the value of the address property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddress() {
        return address;
    }

    /**
     * Sets the value of the address property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddress(String value) {
        this.address = value;
    }

}
