
package client.soma.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for StatusHTTPConnectionsCreated complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StatusHTTPConnectionsCreated">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Dummy" type="{http://www.datapower.com/schemas/management}dmCounter32" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StatusHTTPConnectionsCreated", propOrder = {
    "dummy"
})
public class StatusHTTPConnectionsCreated {

    @XmlElement(name = "Dummy")
    protected Long dummy;

    /**
     * Gets the value of the dummy property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getDummy() {
        return dummy;
    }

    /**
     * Sets the value of the dummy property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setDummy(Long value) {
        this.dummy = value;
    }

}
