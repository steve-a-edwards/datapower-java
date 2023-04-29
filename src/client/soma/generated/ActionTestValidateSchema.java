
package client.soma.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ActionTestValidateSchema complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ActionTestValidateSchema">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="XMLFile" type="{http://www.datapower.com/schemas/management}dmFSFile"/>
 *         &lt;element name="SchemaFile" type="{http://www.datapower.com/schemas/management}dmFSFile"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ActionTestValidateSchema", propOrder = {
    "xmlFile",
    "schemaFile"
})
public class ActionTestValidateSchema {

    @XmlElement(name = "XMLFile", required = true)
    protected String xmlFile;
    @XmlElement(name = "SchemaFile", required = true)
    protected String schemaFile;

    /**
     * Gets the value of the xmlFile property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXMLFile() {
        return xmlFile;
    }

    /**
     * Sets the value of the xmlFile property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXMLFile(String value) {
        this.xmlFile = value;
    }

    /**
     * Gets the value of the schemaFile property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSchemaFile() {
        return schemaFile;
    }

    /**
     * Sets the value of the schemaFile property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSchemaFile(String value) {
        this.schemaFile = value;
    }

}
