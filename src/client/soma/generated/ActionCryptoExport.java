
package client.soma.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ActionCryptoExport complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ActionCryptoExport">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ObjectType" type="{http://www.datapower.com/schemas/management}dmCryptoObjectType" minOccurs="0"/>
 *         &lt;element name="ObjectName" type="{http://www.datapower.com/schemas/management}dmString"/>
 *         &lt;element name="OutputFilename" type="{http://www.datapower.com/schemas/management}dmString"/>
 *         &lt;element name="Mechanism" type="{http://www.datapower.com/schemas/management}dmCryptoExportMechanism" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ActionCryptoExport", propOrder = {
    "objectType",
    "objectName",
    "outputFilename",
    "mechanism"
})
public class ActionCryptoExport {

    @XmlElement(name = "ObjectType")
    protected DmCryptoObjectType objectType;
    @XmlElement(name = "ObjectName", required = true)
    protected String objectName;
    @XmlElement(name = "OutputFilename", required = true)
    protected String outputFilename;
    @XmlElement(name = "Mechanism")
    protected DmCryptoExportMechanism mechanism;

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
     * Gets the value of the outputFilename property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutputFilename() {
        return outputFilename;
    }

    /**
     * Sets the value of the outputFilename property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutputFilename(String value) {
        this.outputFilename = value;
    }

    /**
     * Gets the value of the mechanism property.
     * 
     * @return
     *     possible object is
     *     {@link DmCryptoExportMechanism }
     *     
     */
    public DmCryptoExportMechanism getMechanism() {
        return mechanism;
    }

    /**
     * Sets the value of the mechanism property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmCryptoExportMechanism }
     *     
     */
    public void setMechanism(DmCryptoExportMechanism value) {
        this.mechanism = value;
    }

}
