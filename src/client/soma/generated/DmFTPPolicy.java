
package client.soma.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dmFTPPolicy complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="dmFTPPolicy">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RegExp" type="{http://www.datapower.com/schemas/management}dmString"/>
 *         &lt;element name="Passive" type="{http://www.datapower.com/schemas/management}dmFTPPassivePolicy"/>
 *         &lt;element name="AuthTLS" type="{http://www.datapower.com/schemas/management}dmFTPAuthPolicy"/>
 *         &lt;element name="UseCCC" type="{http://www.datapower.com/schemas/management}dmFTPCCCPolicy"/>
 *         &lt;element name="EncryptData" type="{http://www.datapower.com/schemas/management}dmFTPDataEncryptionPolicy"/>
 *         &lt;element name="DataType" type="{http://www.datapower.com/schemas/management}dmFTPDataTypePolicy"/>
 *         &lt;element name="SlashSTOU" type="{http://www.datapower.com/schemas/management}dmFTPSlashSTOUPolicy"/>
 *         &lt;element name="QuotedCommands" type="{http://www.datapower.com/schemas/management}dmReference"/>
 *         &lt;element name="SizeCheck" type="{http://www.datapower.com/schemas/management}dmFTPSizeCheckPolicy"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dmFTPPolicy", propOrder = {
    "regExp",
    "passive",
    "authTLS",
    "useCCC",
    "encryptData",
    "dataType",
    "slashSTOU",
    "quotedCommands",
    "sizeCheck"
})
public class DmFTPPolicy {

    @XmlElement(name = "RegExp", required = true)
    protected String regExp;
    @XmlElement(name = "Passive", required = true)
    protected DmFTPPassivePolicy passive;
    @XmlElement(name = "AuthTLS", required = true)
    protected DmFTPAuthPolicy authTLS;
    @XmlElement(name = "UseCCC", required = true)
    protected DmFTPCCCPolicy useCCC;
    @XmlElement(name = "EncryptData", required = true)
    protected DmFTPDataEncryptionPolicy encryptData;
    @XmlElement(name = "DataType", required = true)
    protected DmFTPDataTypePolicy dataType;
    @XmlElement(name = "SlashSTOU", required = true)
    protected DmFTPSlashSTOUPolicy slashSTOU;
    @XmlElement(name = "QuotedCommands", required = true, nillable = true)
    protected DmReference quotedCommands;
    @XmlElement(name = "SizeCheck", required = true, nillable = true)
    protected DmFTPSizeCheckPolicy sizeCheck;

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
     * Gets the value of the passive property.
     * 
     * @return
     *     possible object is
     *     {@link DmFTPPassivePolicy }
     *     
     */
    public DmFTPPassivePolicy getPassive() {
        return passive;
    }

    /**
     * Sets the value of the passive property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmFTPPassivePolicy }
     *     
     */
    public void setPassive(DmFTPPassivePolicy value) {
        this.passive = value;
    }

    /**
     * Gets the value of the authTLS property.
     * 
     * @return
     *     possible object is
     *     {@link DmFTPAuthPolicy }
     *     
     */
    public DmFTPAuthPolicy getAuthTLS() {
        return authTLS;
    }

    /**
     * Sets the value of the authTLS property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmFTPAuthPolicy }
     *     
     */
    public void setAuthTLS(DmFTPAuthPolicy value) {
        this.authTLS = value;
    }

    /**
     * Gets the value of the useCCC property.
     * 
     * @return
     *     possible object is
     *     {@link DmFTPCCCPolicy }
     *     
     */
    public DmFTPCCCPolicy getUseCCC() {
        return useCCC;
    }

    /**
     * Sets the value of the useCCC property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmFTPCCCPolicy }
     *     
     */
    public void setUseCCC(DmFTPCCCPolicy value) {
        this.useCCC = value;
    }

    /**
     * Gets the value of the encryptData property.
     * 
     * @return
     *     possible object is
     *     {@link DmFTPDataEncryptionPolicy }
     *     
     */
    public DmFTPDataEncryptionPolicy getEncryptData() {
        return encryptData;
    }

    /**
     * Sets the value of the encryptData property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmFTPDataEncryptionPolicy }
     *     
     */
    public void setEncryptData(DmFTPDataEncryptionPolicy value) {
        this.encryptData = value;
    }

    /**
     * Gets the value of the dataType property.
     * 
     * @return
     *     possible object is
     *     {@link DmFTPDataTypePolicy }
     *     
     */
    public DmFTPDataTypePolicy getDataType() {
        return dataType;
    }

    /**
     * Sets the value of the dataType property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmFTPDataTypePolicy }
     *     
     */
    public void setDataType(DmFTPDataTypePolicy value) {
        this.dataType = value;
    }

    /**
     * Gets the value of the slashSTOU property.
     * 
     * @return
     *     possible object is
     *     {@link DmFTPSlashSTOUPolicy }
     *     
     */
    public DmFTPSlashSTOUPolicy getSlashSTOU() {
        return slashSTOU;
    }

    /**
     * Sets the value of the slashSTOU property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmFTPSlashSTOUPolicy }
     *     
     */
    public void setSlashSTOU(DmFTPSlashSTOUPolicy value) {
        this.slashSTOU = value;
    }

    /**
     * Gets the value of the quotedCommands property.
     * 
     * @return
     *     possible object is
     *     {@link DmReference }
     *     
     */
    public DmReference getQuotedCommands() {
        return quotedCommands;
    }

    /**
     * Sets the value of the quotedCommands property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmReference }
     *     
     */
    public void setQuotedCommands(DmReference value) {
        this.quotedCommands = value;
    }

    /**
     * Gets the value of the sizeCheck property.
     * 
     * @return
     *     possible object is
     *     {@link DmFTPSizeCheckPolicy }
     *     
     */
    public DmFTPSizeCheckPolicy getSizeCheck() {
        return sizeCheck;
    }

    /**
     * Sets the value of the sizeCheck property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmFTPSizeCheckPolicy }
     *     
     */
    public void setSizeCheck(DmFTPSizeCheckPolicy value) {
        this.sizeCheck = value;
    }

}
