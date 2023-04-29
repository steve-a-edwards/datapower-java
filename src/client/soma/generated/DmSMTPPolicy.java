
package client.soma.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dmSMTPPolicy complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="dmSMTPPolicy">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RegExp" type="{http://www.datapower.com/schemas/management}dmString"/>
 *         &lt;element name="Recipient" type="{http://www.datapower.com/schemas/management}dmString"/>
 *         &lt;element name="Sender" type="{http://www.datapower.com/schemas/management}dmString"/>
 *         &lt;element name="Subject" type="{http://www.datapower.com/schemas/management}dmString"/>
 *         &lt;element name="Options" type="{http://www.datapower.com/schemas/management}dmSMTPOptions"/>
 *         &lt;element name="Auth" type="{http://www.datapower.com/schemas/management}dmSMTPAuth"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dmSMTPPolicy", propOrder = {
    "regExp",
    "recipient",
    "sender",
    "subject",
    "options",
    "auth"
})
public class DmSMTPPolicy {

    @XmlElement(name = "RegExp", required = true)
    protected String regExp;
    @XmlElement(name = "Recipient", required = true, nillable = true)
    protected String recipient;
    @XmlElement(name = "Sender", required = true, nillable = true)
    protected String sender;
    @XmlElement(name = "Subject", required = true, nillable = true)
    protected String subject;
    @XmlElement(name = "Options", required = true, nillable = true)
    protected DmSMTPOptions options;
    @XmlElement(name = "Auth", required = true, nillable = true)
    protected DmSMTPAuth auth;

    /**
     * Gets the value of the regExp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegExp() {
        return regExp;
    }

    /**
     * Sets the value of the regExp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegExp(String value) {
        this.regExp = value;
    }

    /**
     * Gets the value of the recipient property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecipient() {
        return recipient;
    }

    /**
     * Sets the value of the recipient property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRecipient(String value) {
        this.recipient = value;
    }

    /**
     * Gets the value of the sender property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSender() {
        return sender;
    }

    /**
     * Sets the value of the sender property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSender(String value) {
        this.sender = value;
    }

    /**
     * Gets the value of the subject property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubject() {
        return subject;
    }

    /**
     * Sets the value of the subject property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubject(String value) {
        this.subject = value;
    }

    /**
     * Gets the value of the options property.
     * 
     * @return
     *     possible object is
     *     {@link DmSMTPOptions }
     *     
     */
    public DmSMTPOptions getOptions() {
        return options;
    }

    /**
     * Sets the value of the options property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmSMTPOptions }
     *     
     */
    public void setOptions(DmSMTPOptions value) {
        this.options = value;
    }

    /**
     * Gets the value of the auth property.
     * 
     * @return
     *     possible object is
     *     {@link DmSMTPAuth }
     *     
     */
    public DmSMTPAuth getAuth() {
        return auth;
    }

    /**
     * Sets the value of the auth property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmSMTPAuth }
     *     
     */
    public void setAuth(DmSMTPAuth value) {
        this.auth = value;
    }

}
