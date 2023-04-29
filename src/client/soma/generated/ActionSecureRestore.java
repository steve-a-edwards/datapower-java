
package client.soma.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ActionSecureRestore complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ActionSecureRestore">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cred" type="{http://www.datapower.com/schemas/management}dmReference"/>
 *         &lt;element name="source" type="{http://www.datapower.com/schemas/management}dmURL"/>
 *         &lt;element name="validate" type="{http://www.datapower.com/schemas/management}dmToggle" minOccurs="0"/>
 *         &lt;element name="BackupMachineType" type="{http://www.datapower.com/schemas/management}dmString" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ActionSecureRestore", propOrder = {
    "cred",
    "source",
    "validate",
    "backupMachineType"
})
public class ActionSecureRestore {

    @XmlElement(required = true)
    protected DmReference cred;
    @XmlElement(required = true)
    protected String source;
    protected DmToggle validate;
    @XmlElement(name = "BackupMachineType")
    protected String backupMachineType;

    /**
     * Gets the value of the cred property.
     * 
     * @return
     *     possible object is
     *     {@link DmReference }
     *     
     */
    public DmReference getCred() {
        return cred;
    }

    /**
     * Sets the value of the cred property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmReference }
     *     
     */
    public void setCred(DmReference value) {
        this.cred = value;
    }

    /**
     * Gets the value of the source property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSource() {
        return source;
    }

    /**
     * Sets the value of the source property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSource(String value) {
        this.source = value;
    }

    /**
     * Gets the value of the validate property.
     * 
     * @return
     *     possible object is
     *     {@link DmToggle }
     *     
     */
    public DmToggle getValidate() {
        return validate;
    }

    /**
     * Sets the value of the validate property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmToggle }
     *     
     */
    public void setValidate(DmToggle value) {
        this.validate = value;
    }

    /**
     * Gets the value of the backupMachineType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBackupMachineType() {
        return backupMachineType;
    }

    /**
     * Sets the value of the backupMachineType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBackupMachineType(String value) {
        this.backupMachineType = value;
    }

}
