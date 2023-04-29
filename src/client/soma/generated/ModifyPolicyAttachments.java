
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
 * <p>Java class for ModifyPolicyAttachments complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ModifyPolicyAttachments">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.datapower.com/schemas/management}ModifyConfigBase">
 *       &lt;choice maxOccurs="unbounded">
 *         &lt;element name="UserSummary" type="{http://www.datapower.com/schemas/management}dmString" minOccurs="0"/>
 *         &lt;element name="EnforcementMode" type="{http://www.datapower.com/schemas/management}dmPolicyEnforcementMode" minOccurs="0"/>
 *         &lt;element name="PolicyReferences" type="{http://www.datapower.com/schemas/management}dmToggle" minOccurs="0"/>
 *         &lt;element name="IgnoredPolicyAttachmentPoints" type="{http://www.datapower.com/schemas/management}dmPolicyAttachmentPoint" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ExternalPolicy" type="{http://www.datapower.com/schemas/management}dmExternalAttachedPolicy" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "ModifyPolicyAttachments", propOrder = {
    "userSummaryOrEnforcementModeOrPolicyReferences"
})
public class ModifyPolicyAttachments
    extends ModifyConfigBase
{

    @XmlElements({
        @XmlElement(name = "IgnoredPolicyAttachmentPoints", type = DmPolicyAttachmentPoint.class),
        @XmlElement(name = "EnforcementMode", type = DmPolicyEnforcementMode.class),
        @XmlElement(name = "UserSummary", type = String.class),
        @XmlElement(name = "ExternalPolicy", type = DmExternalAttachedPolicy.class),
        @XmlElement(name = "PolicyReferences", type = DmToggle.class)
    })
    protected List<Object> userSummaryOrEnforcementModeOrPolicyReferences;
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
     * Gets the value of the userSummaryOrEnforcementModeOrPolicyReferences property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the userSummaryOrEnforcementModeOrPolicyReferences property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUserSummaryOrEnforcementModeOrPolicyReferences().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DmPolicyAttachmentPoint }
     * {@link DmPolicyEnforcementMode }
     * {@link String }
     * {@link DmExternalAttachedPolicy }
     * {@link DmToggle }
     * 
     * 
     */
    public List<Object> getUserSummaryOrEnforcementModeOrPolicyReferences() {
        if (userSummaryOrEnforcementModeOrPolicyReferences == null) {
            userSummaryOrEnforcementModeOrPolicyReferences = new ArrayList<Object>();
        }
        return this.userSummaryOrEnforcementModeOrPolicyReferences;
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
