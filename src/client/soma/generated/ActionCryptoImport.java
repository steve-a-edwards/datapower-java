
package client.soma.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ActionCryptoImport complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ActionCryptoImport">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ObjectType" type="{http://www.datapower.com/schemas/management}dmCryptoObjectType" minOccurs="0"/>
 *         &lt;element name="ObjectName" type="{http://www.datapower.com/schemas/management}dmString"/>
 *         &lt;element name="InputFilename" type="{http://www.datapower.com/schemas/management}dmFSFile"/>
 *         &lt;element name="ImportPassword" type="{http://www.datapower.com/schemas/management}dmString" minOccurs="0"/>
 *         &lt;element name="ImportPasswordAlias" type="{http://www.datapower.com/schemas/management}dmString" minOccurs="0"/>
 *         &lt;element name="KwkExportable" type="{http://www.datapower.com/schemas/management}dmToggle" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ActionCryptoImport", propOrder = {
    "objectType",
    "objectName",
    "inputFilename",
    "importPassword",
    "importPasswordAlias",
    "kwkExportable"
})
public class ActionCryptoImport {

    @XmlElement(name = "ObjectType")
    protected DmCryptoObjectType objectType;
    @XmlElement(name = "ObjectName", required = true)
    protected String objectName;
    @XmlElement(name = "InputFilename", required = true)
    protected String inputFilename;
    @XmlElement(name = "ImportPassword")
    protected String importPassword;
    @XmlElement(name = "ImportPasswordAlias")
    protected String importPasswordAlias;
    @XmlElement(name = "KwkExportable")
    protected DmToggle kwkExportable;

    /**
     * Gets the value of the objectType property.
     * 
     * @return
     *     possible object is
     *     {@link DmCryptoObjectType }
     *     
     */
    public DmCryptoObjectType getObjectType() {
        return objectType;
    }

    /**
     * Sets the value of the objectType property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmCryptoObjectType }
     *     
     */
    public void setObjectType(DmCryptoObjectType value) {
        this.objectType = value;
    }

    /**
     * Gets the value of the objectName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getObjectName() {
        return objectName;
    }

    /**
     * Sets the value of the objectName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setObjectName(String value) {
        this.objectName = value;
    }

    /**
     * Gets the value of the inputFilename property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInputFilename() {
        return inputFilename;
    }

    /**
     * Sets the value of the inputFilename property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInputFilename(String value) {
        this.inputFilename = value;
    }

    /**
     * Gets the value of the importPassword property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImportPassword() {
        return importPassword;
    }

    /**
     * Sets the value of the importPassword property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImportPassword(String value) {
        this.importPassword = value;
    }

    /**
     * Gets the value of the importPasswordAlias property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImportPasswordAlias() {
        return importPasswordAlias;
    }

    /**
     * Sets the value of the importPasswordAlias property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImportPasswordAlias(String value) {
        this.importPasswordAlias = value;
    }

    /**
     * Gets the value of the kwkExportable property.
     * 
     * @return
     *     possible object is
     *     {@link DmToggle }
     *     
     */
    public DmToggle getKwkExportable() {
        return kwkExportable;
    }

    /**
     * Sets the value of the kwkExportable property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmToggle }
     *     
     */
    public void setKwkExportable(DmToggle value) {
        this.kwkExportable = value;
    }

}
