
package client.soma.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dmAAATransactionPriority complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="dmAAATransactionPriority">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Credential" type="{http://www.datapower.com/schemas/management}dmString"/>
 *         &lt;element name="Priority" type="{http://www.datapower.com/schemas/management}dmSchedulerPriority"/>
 *         &lt;element name="Authorization" type="{http://www.datapower.com/schemas/management}dmToggle"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dmAAATransactionPriority", propOrder = {
    "credential",
    "priority",
    "authorization"
})
public class DmAAATransactionPriority {

    @XmlElement(name = "Credential", required = true)
    protected String credential;
    @XmlElement(name = "Priority", required = true)
    protected DmSchedulerPriority priority;
    @XmlElement(name = "Authorization", required = true, nillable = true)
    protected DmToggle authorization;

    /**
     * Gets the value of the credential property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCredential() {
        return credential;
    }

    /**
     * Sets the value of the credential property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCredential(String value) {
        this.credential = value;
    }

    /**
     * Gets the value of the priority property.
     * 
     * @return
     *     possible object is
     *     {@link DmSchedulerPriority }
     *     
     */
    public DmSchedulerPriority getPriority() {
        return priority;
    }

    /**
     * Sets the value of the priority property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmSchedulerPriority }
     *     
     */
    public void setPriority(DmSchedulerPriority value) {
        this.priority = value;
    }

    /**
     * Gets the value of the authorization property.
     * 
     * @return
     *     possible object is
     *     {@link DmToggle }
     *     
     */
    public DmToggle getAuthorization() {
        return authorization;
    }

    /**
     * Sets the value of the authorization property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmToggle }
     *     
     */
    public void setAuthorization(DmToggle value) {
        this.authorization = value;
    }

}
