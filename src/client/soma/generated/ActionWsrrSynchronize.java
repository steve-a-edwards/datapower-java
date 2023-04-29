
package client.soma.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ActionWsrrSynchronize complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ActionWsrrSynchronize">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="WSRRSubscription" type="{http://www.datapower.com/schemas/management}dmString"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ActionWsrrSynchronize", propOrder = {
    "wsrrSubscription"
})
public class ActionWsrrSynchronize {

    @XmlElement(name = "WSRRSubscription", required = true)
    protected String wsrrSubscription;

    /**
     * Gets the value of the wsrrSubscription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWSRRSubscription() {
        return wsrrSubscription;
    }

    /**
     * Sets the value of the wsrrSubscription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWSRRSubscription(String value) {
        this.wsrrSubscription = value;
    }

}
