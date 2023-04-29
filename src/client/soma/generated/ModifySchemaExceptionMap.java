
package client.soma.generated;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ModifySchemaExceptionMap complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ModifySchemaExceptionMap">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.datapower.com/schemas/management}ModifyDynamicSchema">
 *       &lt;choice maxOccurs="unbounded">
 *         &lt;element name="OriginalSchemaURL" type="{http://www.datapower.com/schemas/management}dmURL" minOccurs="0"/>
 *         &lt;element name="SchemaExceptionRules" type="{http://www.datapower.com/schemas/management}dmSchemaExceptionRule" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/choice>
 *       &lt;attGroup ref="{http://www.datapower.com/schemas/management}ConfigAttributes"/>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ModifySchemaExceptionMap", propOrder = {
    "originalSchemaURLOrSchemaExceptionRules"
})
public class ModifySchemaExceptionMap
    extends ModifyDynamicSchema
{

    @XmlElements({
        @XmlElement(name = "SchemaExceptionRules", type = DmSchemaExceptionRule.class),
        @XmlElement(name = "OriginalSchemaURL", type = String.class)
    })
    protected List<Object> originalSchemaURLOrSchemaExceptionRules;
    @XmlAttribute
    protected String name;
    @XmlAttribute
    protected Boolean local;
    @XmlAttribute
    protected Boolean intrinsic;
    @XmlAttribute(name = "read-only")
    protected Boolean readOnly;
    @XmlAttribute
    protected Boolean external;

    /**
     * Gets the value of the originalSchemaURLOrSchemaExceptionRules property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the originalSchemaURLOrSchemaExceptionRules property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOriginalSchemaURLOrSchemaExceptionRules().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DmSchemaExceptionRule }
     * {@link String }
     * 
     * 
     */
    public List<Object> getOriginalSchemaURLOrSchemaExceptionRules() {
        if (originalSchemaURLOrSchemaExceptionRules == null) {
            originalSchemaURLOrSchemaExceptionRules = new ArrayList<Object>();
        }
        return this.originalSchemaURLOrSchemaExceptionRules;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the local property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isLocal() {
        return local;
    }

    /**
     * Sets the value of the local property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLocal(Boolean value) {
        this.local = value;
    }

    /**
     * Gets the value of the intrinsic property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIntrinsic() {
        return intrinsic;
    }

    /**
     * Sets the value of the intrinsic property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIntrinsic(Boolean value) {
        this.intrinsic = value;
    }

    /**
     * Gets the value of the readOnly property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isReadOnly() {
        return readOnly;
    }

    /**
     * Sets the value of the readOnly property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setReadOnly(Boolean value) {
        this.readOnly = value;
    }

    /**
     * Gets the value of the external property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isExternal() {
        return external;
    }

    /**
     * Sets the value of the external property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setExternal(Boolean value) {
        this.external = value;
    }

}
