
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
 * <p>Java class for ModifyConformancePolicy complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ModifyConformancePolicy">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.datapower.com/schemas/management}ModifyConfigBase">
 *       &lt;choice maxOccurs="unbounded">
 *         &lt;element name="UserSummary" type="{http://www.datapower.com/schemas/management}dmString" minOccurs="0"/>
 *         &lt;element name="Profiles" type="{http://www.datapower.com/schemas/management}dmConformanceProfiles" minOccurs="0"/>
 *         &lt;element name="IgnoredRequirements" type="{http://www.datapower.com/schemas/management}dmString" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="FixupStylesheets" type="{http://www.datapower.com/schemas/management}dmURL" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="AssertBP10Conformance" type="{http://www.datapower.com/schemas/management}dmToggle" minOccurs="0"/>
 *         &lt;element name="ReportLevel" type="{http://www.datapower.com/schemas/management}dmConformanceReportLevel" minOccurs="0"/>
 *         &lt;element name="LogTarget" type="{http://www.datapower.com/schemas/management}dmURL" minOccurs="0"/>
 *         &lt;element name="RejectLevel" type="{http://www.datapower.com/schemas/management}dmConformanceRejectLevel" minOccurs="0"/>
 *         &lt;element name="RejectIncludeSummary" type="{http://www.datapower.com/schemas/management}dmToggle" minOccurs="0"/>
 *         &lt;element name="ResultIsConformanceReport" type="{http://www.datapower.com/schemas/management}dmToggle" minOccurs="0"/>
 *         &lt;element name="ResponsePropertiesEnabled" type="{http://www.datapower.com/schemas/management}dmToggle" minOccurs="0"/>
 *         &lt;element name="ResponseReportLevel" type="{http://www.datapower.com/schemas/management}dmConformanceReportLevel" minOccurs="0"/>
 *         &lt;element name="ResponseLogTarget" type="{http://www.datapower.com/schemas/management}dmURL" minOccurs="0"/>
 *         &lt;element name="ResponseRejectLevel" type="{http://www.datapower.com/schemas/management}dmConformanceRejectLevel" minOccurs="0"/>
 *         &lt;element name="ResponseRejectIncludeSummary" type="{http://www.datapower.com/schemas/management}dmToggle" minOccurs="0"/>
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
@XmlType(name = "ModifyConformancePolicy", propOrder = {
    "userSummaryOrProfilesOrIgnoredRequirements"
})
public class ModifyConformancePolicy
    extends ModifyConfigBase
{

    @XmlElementRefs({
        @XmlElementRef(name = "RejectLevel", type = JAXBElement.class),
        @XmlElementRef(name = "RejectIncludeSummary", type = JAXBElement.class),
        @XmlElementRef(name = "AssertBP10Conformance", type = JAXBElement.class),
        @XmlElementRef(name = "ResponseReportLevel", type = JAXBElement.class),
        @XmlElementRef(name = "ResponsePropertiesEnabled", type = JAXBElement.class),
        @XmlElementRef(name = "ResultIsConformanceReport", type = JAXBElement.class),
        @XmlElementRef(name = "UserSummary", type = JAXBElement.class),
        @XmlElementRef(name = "ReportLevel", type = JAXBElement.class),
        @XmlElementRef(name = "ResponseRejectLevel", type = JAXBElement.class),
        @XmlElementRef(name = "LogTarget", type = JAXBElement.class),
        @XmlElementRef(name = "FixupStylesheets", type = JAXBElement.class),
        @XmlElementRef(name = "IgnoredRequirements", type = JAXBElement.class),
        @XmlElementRef(name = "ResponseLogTarget", type = JAXBElement.class),
        @XmlElementRef(name = "ResponseRejectIncludeSummary", type = JAXBElement.class),
        @XmlElementRef(name = "Profiles", type = JAXBElement.class)
    })
    protected List<JAXBElement<?>> userSummaryOrProfilesOrIgnoredRequirements;
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
     * Gets the value of the userSummaryOrProfilesOrIgnoredRequirements property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the userSummaryOrProfilesOrIgnoredRequirements property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUserSummaryOrProfilesOrIgnoredRequirements().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link DmConformanceRejectLevel }{@code >}
     * {@link JAXBElement }{@code <}{@link DmToggle }{@code >}
     * {@link JAXBElement }{@code <}{@link DmToggle }{@code >}
     * {@link JAXBElement }{@code <}{@link DmConformanceReportLevel }{@code >}
     * {@link JAXBElement }{@code <}{@link DmToggle }{@code >}
     * {@link JAXBElement }{@code <}{@link DmToggle }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link DmConformanceReportLevel }{@code >}
     * {@link JAXBElement }{@code <}{@link DmConformanceRejectLevel }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link DmToggle }{@code >}
     * {@link JAXBElement }{@code <}{@link DmConformanceProfiles }{@code >}
     * 
     * 
     */
    public List<JAXBElement<?>> getUserSummaryOrProfilesOrIgnoredRequirements() {
        if (userSummaryOrProfilesOrIgnoredRequirements == null) {
            userSummaryOrProfilesOrIgnoredRequirements = new ArrayList<JAXBElement<?>>();
        }
        return this.userSummaryOrProfilesOrIgnoredRequirements;
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
