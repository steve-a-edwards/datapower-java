
package client.soma.generated;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ModifyCompileOptionsPolicy complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ModifyCompileOptionsPolicy">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.datapower.com/schemas/management}ModifyConfigBase">
 *       &lt;choice maxOccurs="unbounded">
 *         &lt;element name="UserSummary" type="{http://www.datapower.com/schemas/management}dmString" minOccurs="0"/>
 *         &lt;element name="XSLTVersion" type="{http://www.datapower.com/schemas/management}dmXSLTVersion" minOccurs="0"/>
 *         &lt;element name="Strict" type="{http://www.datapower.com/schemas/management}dmToggle" minOccurs="0"/>
 *         &lt;element name="Profile" type="{http://www.datapower.com/schemas/management}dmReference" minOccurs="0"/>
 *         &lt;element name="Debug" type="{http://www.datapower.com/schemas/management}dmReference" minOccurs="0"/>
 *         &lt;element name="Stream" type="{http://www.datapower.com/schemas/management}dmReference" minOccurs="0"/>
 *         &lt;element name="TryStream" type="{http://www.datapower.com/schemas/management}dmReference" minOccurs="0"/>
 *         &lt;element name="MinimumEscaping" type="{http://www.datapower.com/schemas/management}dmReference" minOccurs="0"/>
 *         &lt;element name="StackSize" type="{http://www.datapower.com/schemas/management}dmUInt32" minOccurs="0"/>
 *         &lt;element name="PreferXG4" type="{http://www.datapower.com/schemas/management}dmReference" minOccurs="0"/>
 *         &lt;element name="DisallowXG4" type="{http://www.datapower.com/schemas/management}dmReference" minOccurs="0"/>
 *         &lt;element name="WSIValidation" type="{http://www.datapower.com/schemas/management}dmWSIValidationMode" minOccurs="0"/>
 *         &lt;element name="WSDLValidateBody" type="{http://www.datapower.com/schemas/management}dmWSDLValidationMode" minOccurs="0"/>
 *         &lt;element name="WSDLValidateHeaders" type="{http://www.datapower.com/schemas/management}dmWSDLValidationMode" minOccurs="0"/>
 *         &lt;element name="WSDLValidateFaults" type="{http://www.datapower.com/schemas/management}dmWSDLValidationMode" minOccurs="0"/>
 *         &lt;element name="WSDLWrappedFaults" type="{http://www.datapower.com/schemas/management}dmToggle" minOccurs="0"/>
 *         &lt;element name="AllowSoapEncArray" type="{http://www.datapower.com/schemas/management}dmReference" minOccurs="0"/>
 *         &lt;element name="ValidateSoapEncArray" type="{http://www.datapower.com/schemas/management}dmReference" minOccurs="0"/>
 *         &lt;element name="WildcardsIgnoreXsiType" type="{http://www.datapower.com/schemas/management}dmReference" minOccurs="0"/>
 *         &lt;element name="WSDLStrictSOAPVersion" type="{http://www.datapower.com/schemas/management}dmToggle" minOccurs="0"/>
 *         &lt;element name="XACMLDebug" type="{http://www.datapower.com/schemas/management}dmToggle" minOccurs="0"/>
 *         &lt;element name="AllowXOPInclude" type="{http://www.datapower.com/schemas/management}dmReference" minOccurs="0"/>
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
@XmlType(name = "ModifyCompileOptionsPolicy", propOrder = {
    "userSummaryOrXSLTVersionOrStrict"
})
public class ModifyCompileOptionsPolicy
    extends ModifyConfigBase
{

    @XmlElementRefs({
        @XmlElementRef(name = "XACMLDebug", type = JAXBElement.class),
        @XmlElementRef(name = "WSDLStrictSOAPVersion", type = JAXBElement.class),
        @XmlElementRef(name = "Profile", type = JAXBElement.class),
        @XmlElementRef(name = "UserSummary", type = JAXBElement.class),
        @XmlElementRef(name = "WSDLValidateBody", type = JAXBElement.class),
        @XmlElementRef(name = "XSLTVersion", type = JAXBElement.class),
        @XmlElementRef(name = "WSDLValidateHeaders", type = JAXBElement.class),
        @XmlElementRef(name = "TryStream", type = JAXBElement.class),
        @XmlElementRef(name = "Debug", type = JAXBElement.class),
        @XmlElementRef(name = "WSDLValidateFaults", type = JAXBElement.class),
        @XmlElementRef(name = "DisallowXG4", type = JAXBElement.class),
        @XmlElementRef(name = "AllowXOPInclude", type = JAXBElement.class),
        @XmlElementRef(name = "WSIValidation", type = JAXBElement.class),
        @XmlElementRef(name = "WSDLWrappedFaults", type = JAXBElement.class),
        @XmlElementRef(name = "AllowSoapEncArray", type = JAXBElement.class),
        @XmlElementRef(name = "StackSize", type = JAXBElement.class),
        @XmlElementRef(name = "ValidateSoapEncArray", type = JAXBElement.class),
        @XmlElementRef(name = "PreferXG4", type = JAXBElement.class),
        @XmlElementRef(name = "Strict", type = JAXBElement.class),
        @XmlElementRef(name = "WildcardsIgnoreXsiType", type = JAXBElement.class),
        @XmlElementRef(name = "Stream", type = JAXBElement.class),
        @XmlElementRef(name = "MinimumEscaping", type = JAXBElement.class)
    })
    protected List<JAXBElement<?>> userSummaryOrXSLTVersionOrStrict;
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
     * Gets the value of the userSummaryOrXSLTVersionOrStrict property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the userSummaryOrXSLTVersionOrStrict property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUserSummaryOrXSLTVersionOrStrict().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link DmToggle }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link DmReference }{@code >}
     * {@link JAXBElement }{@code <}{@link DmToggle }{@code >}
     * {@link JAXBElement }{@code <}{@link DmWSDLValidationMode }{@code >}
     * {@link JAXBElement }{@code <}{@link DmXSLTVersion }{@code >}
     * {@link JAXBElement }{@code <}{@link DmWSDLValidationMode }{@code >}
     * {@link JAXBElement }{@code <}{@link DmReference }{@code >}
     * {@link JAXBElement }{@code <}{@link DmReference }{@code >}
     * {@link JAXBElement }{@code <}{@link DmReference }{@code >}
     * {@link JAXBElement }{@code <}{@link DmWSDLValidationMode }{@code >}
     * {@link JAXBElement }{@code <}{@link DmToggle }{@code >}
     * {@link JAXBElement }{@code <}{@link DmWSIValidationMode }{@code >}
     * {@link JAXBElement }{@code <}{@link DmReference }{@code >}
     * {@link JAXBElement }{@code <}{@link DmReference }{@code >}
     * {@link JAXBElement }{@code <}{@link DmReference }{@code >}
     * {@link JAXBElement }{@code <}{@link Long }{@code >}
     * {@link JAXBElement }{@code <}{@link DmReference }{@code >}
     * {@link JAXBElement }{@code <}{@link DmToggle }{@code >}
     * {@link JAXBElement }{@code <}{@link DmReference }{@code >}
     * {@link JAXBElement }{@code <}{@link DmReference }{@code >}
     * {@link JAXBElement }{@code <}{@link DmReference }{@code >}
     * 
     * 
     */
    public List<JAXBElement<?>> getUserSummaryOrXSLTVersionOrStrict() {
        if (userSummaryOrXSLTVersionOrStrict == null) {
            userSummaryOrXSLTVersionOrStrict = new ArrayList<JAXBElement<?>>();
        }
        return this.userSummaryOrXSLTVersionOrStrict;
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
