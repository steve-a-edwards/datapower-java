
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
 * <p>Java class for ModifyLoadBalancerGroup complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ModifyLoadBalancerGroup">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.datapower.com/schemas/management}ModifyConfigBase">
 *       &lt;choice maxOccurs="unbounded">
 *         &lt;element name="UserSummary" type="{http://www.datapower.com/schemas/management}dmString" minOccurs="0"/>
 *         &lt;element name="Algorithm" type="{http://www.datapower.com/schemas/management}dmLoadBalanceAlgorithm" minOccurs="0"/>
 *         &lt;element name="RetrieveInfo" type="{http://www.datapower.com/schemas/management}dmToggle" minOccurs="0"/>
 *         &lt;element name="WLMRetrieval" type="{http://www.datapower.com/schemas/management}dmWLMRetrieval" minOccurs="0"/>
 *         &lt;element name="WebSphereCellConfig" type="{http://www.datapower.com/schemas/management}dmReference" minOccurs="0"/>
 *         &lt;element name="WLMGroup" type="{http://www.datapower.com/schemas/management}dmString" minOccurs="0"/>
 *         &lt;element name="WLMTransport" type="{http://www.datapower.com/schemas/management}dmWLMTransport" minOccurs="0"/>
 *         &lt;element name="Damp" type="{http://www.datapower.com/schemas/management}dmUInt32" minOccurs="0"/>
 *         &lt;element name="NeverReturnSickMember" type="{http://www.datapower.com/schemas/management}dmToggle" minOccurs="0"/>
 *         &lt;element name="LBGroupMembers" type="{http://www.datapower.com/schemas/management}dmLBGroupMember" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="TryEveryServerBeforeFailing" type="{http://www.datapower.com/schemas/management}dmToggle" minOccurs="0"/>
 *         &lt;element name="LBGroupChecks" type="{http://www.datapower.com/schemas/management}dmLBGroupCheck" minOccurs="0"/>
 *         &lt;element name="MasqueradeMember" type="{http://www.datapower.com/schemas/management}dmToggle" minOccurs="0"/>
 *         &lt;element name="ApplicationRouting" type="{http://www.datapower.com/schemas/management}dmToggle" minOccurs="0"/>
 *         &lt;element name="LBGroupAffinityConf" type="{http://www.datapower.com/schemas/management}dmLBGroupAffinity" minOccurs="0"/>
 *         &lt;element name="MonitoredCookies" type="{http://www.datapower.com/schemas/management}dmString" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "ModifyLoadBalancerGroup", propOrder = {
    "userSummaryOrAlgorithmOrRetrieveInfo"
})
public class ModifyLoadBalancerGroup
    extends ModifyConfigBase
{

    @XmlElementRefs({
        @XmlElementRef(name = "Algorithm", type = JAXBElement.class),
        @XmlElementRef(name = "LBGroupChecks", type = JAXBElement.class),
        @XmlElementRef(name = "ApplicationRouting", type = JAXBElement.class),
        @XmlElementRef(name = "UserSummary", type = JAXBElement.class),
        @XmlElementRef(name = "WLMGroup", type = JAXBElement.class),
        @XmlElementRef(name = "RetrieveInfo", type = JAXBElement.class),
        @XmlElementRef(name = "WLMTransport", type = JAXBElement.class),
        @XmlElementRef(name = "WebSphereCellConfig", type = JAXBElement.class),
        @XmlElementRef(name = "WLMRetrieval", type = JAXBElement.class),
        @XmlElementRef(name = "NeverReturnSickMember", type = JAXBElement.class),
        @XmlElementRef(name = "LBGroupMembers", type = JAXBElement.class),
        @XmlElementRef(name = "Damp", type = JAXBElement.class),
        @XmlElementRef(name = "MasqueradeMember", type = JAXBElement.class),
        @XmlElementRef(name = "MonitoredCookies", type = JAXBElement.class),
        @XmlElementRef(name = "LBGroupAffinityConf", type = JAXBElement.class),
        @XmlElementRef(name = "TryEveryServerBeforeFailing", type = JAXBElement.class)
    })
    protected List<JAXBElement<?>> userSummaryOrAlgorithmOrRetrieveInfo;
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
     * Gets the value of the userSummaryOrAlgorithmOrRetrieveInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the userSummaryOrAlgorithmOrRetrieveInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUserSummaryOrAlgorithmOrRetrieveInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link DmLoadBalanceAlgorithm }{@code >}
     * {@link JAXBElement }{@code <}{@link DmLBGroupCheck }{@code >}
     * {@link JAXBElement }{@code <}{@link DmToggle }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link DmToggle }{@code >}
     * {@link JAXBElement }{@code <}{@link DmWLMTransport }{@code >}
     * {@link JAXBElement }{@code <}{@link DmReference }{@code >}
     * {@link JAXBElement }{@code <}{@link DmWLMRetrieval }{@code >}
     * {@link JAXBElement }{@code <}{@link DmToggle }{@code >}
     * {@link JAXBElement }{@code <}{@link DmLBGroupMember }{@code >}
     * {@link JAXBElement }{@code <}{@link Long }{@code >}
     * {@link JAXBElement }{@code <}{@link DmToggle }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link DmLBGroupAffinity }{@code >}
     * {@link JAXBElement }{@code <}{@link DmToggle }{@code >}
     * 
     * 
     */
    public List<JAXBElement<?>> getUserSummaryOrAlgorithmOrRetrieveInfo() {
        if (userSummaryOrAlgorithmOrRetrieveInfo == null) {
            userSummaryOrAlgorithmOrRetrieveInfo = new ArrayList<JAXBElement<?>>();
        }
        return this.userSummaryOrAlgorithmOrRetrieveInfo;
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
