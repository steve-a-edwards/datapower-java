
package client.soma.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ActionRollbackCheckpoint complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ActionRollbackCheckpoint">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ChkName" type="{http://www.datapower.com/schemas/management}dmString"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ActionRollbackCheckpoint", propOrder = {
    "chkName"
})
public class ActionRollbackCheckpoint {

    @XmlElement(name = "ChkName", required = true)
    protected String chkName;

    /**
     * Gets the value of the chkName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChkName() {
        return chkName;
    }

    /**
     * Sets the value of the chkName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChkName(String value) {
        this.chkName = value;
    }

}
