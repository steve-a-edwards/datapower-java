
package client.soma.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dmFTPQuotedCommand complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="dmFTPQuotedCommand">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="QuotedCommand" type="{http://www.datapower.com/schemas/management}dmString"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dmFTPQuotedCommand", propOrder = {
    "quotedCommand"
})
public class DmFTPQuotedCommand {

    @XmlElement(name = "QuotedCommand", required = true)
    protected String quotedCommand;

    /**
     * Gets the value of the quotedCommand property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQuotedCommand() {
        return quotedCommand;
    }

    /**
     * Sets the value of the quotedCommand property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQuotedCommand(String value) {
        this.quotedCommand = value;
    }

}
