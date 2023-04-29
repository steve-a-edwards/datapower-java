
package client.soma.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dmSchemaValidation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="dmSchemaValidation">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Matching" type="{http://www.datapower.com/schemas/management}dmReference"/>
 *         &lt;element name="ValidationMode" type="{http://www.datapower.com/schemas/management}dmValidationMode"/>
 *         &lt;element name="SchemaURL" type="{http://www.datapower.com/schemas/management}dmURL"/>
 *         &lt;element name="URLRewritePolicy" type="{http://www.datapower.com/schemas/management}dmReference"/>
 *         &lt;element name="DynamicSchema" type="{http://www.datapower.com/schemas/management}dmReference"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dmSchemaValidation", propOrder = {
    "matching",
    "validationMode",
    "schemaURL",
    "urlRewritePolicy",
    "dynamicSchema"
})
public class DmSchemaValidation {

    @XmlElement(name = "Matching", required = true)
    protected DmReference matching;
    @XmlElement(name = "ValidationMode", required = true)
    protected DmValidationMode validationMode;
    @XmlElement(name = "SchemaURL", required = true, nillable = true)
    protected String schemaURL;
    @XmlElement(name = "URLRewritePolicy", required = true, nillable = true)
    protected DmReference urlRewritePolicy;
    @XmlElement(name = "DynamicSchema", required = true, nillable = true)
    protected DmReference dynamicSchema;

    /**
     * Gets the value of the matching property.
     * 
     * @return
     *     possible object is
     *     {@link DmReference }
     *     
     */
    public DmReference getMatching() {
        return matching;
    }

    /**
     * Sets the value of the matching property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmReference }
     *     
     */
    public void setMatching(DmReference value) {
        this.matching = value;
    }

    /**
     * Gets the value of the validationMode property.
     * 
     * @return
     *     possible object is
     *     {@link DmValidationMode }
     *     
     */
    public DmValidationMode getValidationMode() {
        return validationMode;
    }

    /**
     * Sets the value of the validationMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmValidationMode }
     *     
     */
    public void setValidationMode(DmValidationMode value) {
        this.validationMode = value;
    }

    /**
     * Gets the value of the schemaURL property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSchemaURL() {
        return schemaURL;
    }

    /**
     * Sets the value of the schemaURL property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSchemaURL(String value) {
        this.schemaURL = value;
    }

    /**
     * Gets the value of the urlRewritePolicy property.
     * 
     * @return
     *     possible object is
     *     {@link DmReference }
     *     
     */
    public DmReference getURLRewritePolicy() {
        return urlRewritePolicy;
    }

    /**
     * Sets the value of the urlRewritePolicy property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmReference }
     *     
     */
    public void setURLRewritePolicy(DmReference value) {
        this.urlRewritePolicy = value;
    }

    /**
     * Gets the value of the dynamicSchema property.
     * 
     * @return
     *     possible object is
     *     {@link DmReference }
     *     
     */
    public DmReference getDynamicSchema() {
        return dynamicSchema;
    }

    /**
     * Sets the value of the dynamicSchema property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmReference }
     *     
     */
    public void setDynamicSchema(DmReference value) {
        this.dynamicSchema = value;
    }

}
