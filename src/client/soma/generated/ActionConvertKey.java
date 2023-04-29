
package client.soma.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ActionConvertKey complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ActionConvertKey">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ObjectName" type="{http://www.datapower.com/schemas/management}dmReference"/>
 *         &lt;element name="OutputFilename" type="{http://www.datapower.com/schemas/management}dmString"/>
 *         &lt;element name="Format" type="{http://www.datapower.com/schemas/management}dmCryptoConvertKeyFormat" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ActionConvertKey", propOrder = {
    "objectName",
    "outputFilename",
    "format"
})
public class ActionConvertKey {

    @XmlElement(name = "ObjectName", required = true)
    protected DmReference objectName;
    @XmlElement(name = "OutputFilename", required = true)
    protected String outputFilename;
    @XmlElement(name = "Format")
    protected DmCryptoConvertKeyFormat format;

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
     *     {@link DmCryptoConvertKeyFormat }
     *     
     */
    public DmCryptoConvertKeyFormat getFormat() {
        return format;
    }

    /**
     * Sets the value of the format property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmCryptoConvertKeyFormat }
     *     
     */
    public void setFormat(DmCryptoConvertKeyFormat value) {
        this.format = value;
    }

}
