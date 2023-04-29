
package client.soma.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ActionConvertCertificate complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ActionConvertCertificate">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ObjectName" type="{http://www.datapower.com/schemas/management}dmReference"/>
 *         &lt;element name="OutputFilename" type="{http://www.datapower.com/schemas/management}dmString"/>
 *         &lt;element name="Format" type="{http://www.datapower.com/schemas/management}dmCryptoConvertCertificateFormat" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ActionConvertCertificate", propOrder = {
    "objectName",
    "outputFilename",
    "format"
})
public class ActionConvertCertificate {

    @XmlElement(name = "ObjectName", required = true)
    protected DmReference objectName;
    @XmlElement(name = "OutputFilename", required = true)
    protected String outputFilename;
    @XmlElement(name = "Format")
    protected DmCryptoConvertCertificateFormat format;

    /**
     * Gets the value of the objectName property.
     * 
     * @return
     *     possible object is
     *     {@link DmReference }
     *     
     */
    public DmReference getObjectName() {
        return objectName;
    }

    /**
     * Sets the value of the objectName property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmReference }
     *     
     */
    public void setObjectName(DmReference value) {
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
     * Gets the value of the format property.
     * 
     * @return
     *     possible object is
     *     {@link DmCryptoConvertCertificateFormat }
     *     
     */
    public DmCryptoConvertCertificateFormat getFormat() {
        return format;
    }

    /**
     * Sets the value of the format property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmCryptoConvertCertificateFormat }
     *     
     */
    public void setFormat(DmCryptoConvertCertificateFormat value) {
        this.format = value;
    }

}
