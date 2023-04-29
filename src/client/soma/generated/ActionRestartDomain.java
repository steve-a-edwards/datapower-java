
package client.soma.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ActionRestartDomain complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ActionRestartDomain">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Domain" type="{http://www.datapower.com/schemas/management}dmReference"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ActionRestartDomain", propOrder = {
    "domain"
})
public class ActionRestartDomain {

    @XmlElement(name = "Domain", required = true)
    protected DmReference domain;

    /**
     * Gets the value of the domain property.
     * 
     * @return
     *     possible object is
     *     {@link DmReference }
     *     
     */
    public DmReference getDomain() {
        return domain;
    }

    /**
     * Sets the value of the domain property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmReference }
     *     
     */
    public void setDomain(DmReference value) {
        this.domain = value;
    }

}
