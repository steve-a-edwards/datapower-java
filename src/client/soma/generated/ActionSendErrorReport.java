
package client.soma.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ActionSendErrorReport complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ActionSendErrorReport">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SmtpServer" type="{http://www.datapower.com/schemas/management}dmHostname"/>
 *         &lt;element name="LocationIdentifier" type="{http://www.datapower.com/schemas/management}dmString"/>
 *         &lt;element name="EmailAddress" type="{http://www.datapower.com/schemas/management}dmString"/>
 *         &lt;element name="EmailSenderAddress" type="{http://www.datapower.com/schemas/management}dmString" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ActionSendErrorReport", propOrder = {
    "smtpServer",
    "locationIdentifier",
    "emailAddress",
    "emailSenderAddress"
})
public class ActionSendErrorReport {

    @XmlElement(name = "SmtpServer", required = true)
    protected String smtpServer;
    @XmlElement(name = "LocationIdentifier", required = true)
    protected String locationIdentifier;
    @XmlElement(name = "EmailAddress", required = true)
    protected String emailAddress;
    @XmlElement(name = "EmailSenderAddress")
    protected String emailSenderAddress;

    /**
     * Gets the value of the smtpServer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSmtpServer() {
        return smtpServer;
    }

    /**
     * Sets the value of the smtpServer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSmtpServer(String value) {
        this.smtpServer = value;
    }

    /**
     * Gets the value of the locationIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocationIdentifier() {
        return locationIdentifier;
    }

    /**
     * Sets the value of the locationIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocationIdentifier(String value) {
        this.locationIdentifier = value;
    }

    /**
     * Gets the value of the emailAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmailAddress() {
        return emailAddress;
    }

    /**
     * Sets the value of the emailAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmailAddress(String value) {
        this.emailAddress = value;
    }

    /**
     * Gets the value of the emailSenderAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmailSenderAddress() {
        return emailSenderAddress;
    }

    /**
     * Sets the value of the emailSenderAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmailSenderAddress(String value) {
        this.emailSenderAddress = value;
    }

}
