
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
 * <p>Java class for ConfigWebAppFW complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ConfigWebAppFW">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.datapower.com/schemas/management}ConfigConfigBase">
 *       &lt;choice maxOccurs="unbounded">
 *         &lt;element name="UserSummary" type="{http://www.datapower.com/schemas/management}dmString" minOccurs="0"/>
 *         &lt;element name="Priority" type="{http://www.datapower.com/schemas/management}dmSchedulerPriority" minOccurs="0"/>
 *         &lt;element name="FrontSide" type="{http://www.datapower.com/schemas/management}dmFrontSide" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="RemoteAddress" type="{http://www.datapower.com/schemas/management}dmHostname"/>
 *         &lt;element name="RemotePort" type="{http://www.datapower.com/schemas/management}dmIPPort" minOccurs="0"/>
 *         &lt;element name="SSLProxyProfile" type="{http://www.datapower.com/schemas/management}dmReference" minOccurs="0"/>
 *         &lt;element name="StylePolicy" type="{http://www.datapower.com/schemas/management}dmReference"/>
 *         &lt;element name="XMLManager" type="{http://www.datapower.com/schemas/management}dmReference"/>
 *         &lt;element name="ErrorPolicy" type="{http://www.datapower.com/schemas/management}dmReference" minOccurs="0"/>
 *         &lt;element name="URINormalization" type="{http://www.datapower.com/schemas/management}dmToggle" minOccurs="0"/>
 *         &lt;element name="RewriteErrors" type="{http://www.datapower.com/schemas/management}dmToggle" minOccurs="0"/>
 *         &lt;element name="DelayErrors" type="{http://www.datapower.com/schemas/management}dmToggle" minOccurs="0"/>
 *         &lt;element name="DelayErrorsDuration" type="{http://www.datapower.com/schemas/management}dmUInt32" minOccurs="0"/>
 *         &lt;element name="StreamOutputToBack" type="{http://www.datapower.com/schemas/management}dmQuarantineMode" minOccurs="0"/>
 *         &lt;element name="StreamOutputToFront" type="{http://www.datapower.com/schemas/management}dmQuarantineMode" minOccurs="0"/>
 *         &lt;element name="FrontTimeout" type="{http://www.datapower.com/schemas/management}dmTimeInterval"/>
 *         &lt;element name="BackTimeout" type="{http://www.datapower.com/schemas/management}dmTimeInterval"/>
 *         &lt;element name="FrontPersistentTimeout" type="{http://www.datapower.com/schemas/management}dmTimeInterval"/>
 *         &lt;element name="BackPersistentTimeout" type="{http://www.datapower.com/schemas/management}dmTimeInterval"/>
 *         &lt;element name="FrontHTTPVersion" type="{http://www.datapower.com/schemas/management}dmHTTPVersion" minOccurs="0"/>
 *         &lt;element name="BackHTTPVersion" type="{http://www.datapower.com/schemas/management}dmHTTPVersion" minOccurs="0"/>
 *         &lt;element name="RequestSideSecurity" type="{http://www.datapower.com/schemas/management}dmToggle" minOccurs="0"/>
 *         &lt;element name="ResponseSideSecurity" type="{http://www.datapower.com/schemas/management}dmToggle" minOccurs="0"/>
 *         &lt;element name="DoChunkedUpload" type="{http://www.datapower.com/schemas/management}dmToggle" minOccurs="0"/>
 *         &lt;element name="FollowRedirects" type="{http://www.datapower.com/schemas/management}dmToggle" minOccurs="0"/>
 *         &lt;element name="HTTPClientIPLabel" type="{http://www.datapower.com/schemas/management}dmString" minOccurs="0"/>
 *         &lt;element name="DebugMode" type="{http://www.datapower.com/schemas/management}dmDebugMode" minOccurs="0"/>
 *         &lt;element name="DebugHistory" type="{http://www.datapower.com/schemas/management}dmUInt32" minOccurs="0"/>
 *         &lt;element name="DebugTrigger" type="{http://www.datapower.com/schemas/management}dmMSDebugTriggerType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="URLRewritePolicy" type="{http://www.datapower.com/schemas/management}dmReference" minOccurs="0"/>
 *         &lt;element name="DoHostRewriting" type="{http://www.datapower.com/schemas/management}dmToggle" minOccurs="0"/>
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
@XmlType(name = "ConfigWebAppFW", propOrder = {
    "userSummaryOrPriorityOrFrontSide"
})
public class ConfigWebAppFW
    extends ConfigConfigBase
{

    @XmlElementRefs({
        @XmlElementRef(name = "DelayErrorsDuration", type = JAXBElement.class),
        @XmlElementRef(name = "DoHostRewriting", type = JAXBElement.class),
        @XmlElementRef(name = "DoChunkedUpload", type = JAXBElement.class),
        @XmlElementRef(name = "StylePolicy", type = JAXBElement.class),
        @XmlElementRef(name = "URLRewritePolicy", type = JAXBElement.class),
        @XmlElementRef(name = "FrontTimeout", type = JAXBElement.class),
        @XmlElementRef(name = "RemotePort", type = JAXBElement.class),
        @XmlElementRef(name = "XMLManager", type = JAXBElement.class),
        @XmlElementRef(name = "URINormalization", type = JAXBElement.class),
        @XmlElementRef(name = "StreamOutputToFront", type = JAXBElement.class),
        @XmlElementRef(name = "RewriteErrors", type = JAXBElement.class),
        @XmlElementRef(name = "FollowRedirects", type = JAXBElement.class),
        @XmlElementRef(name = "ResponseSideSecurity", type = JAXBElement.class),
        @XmlElementRef(name = "FrontPersistentTimeout", type = JAXBElement.class),
        @XmlElementRef(name = "RemoteAddress", type = JAXBElement.class),
        @XmlElementRef(name = "BackHTTPVersion", type = JAXBElement.class),
        @XmlElementRef(name = "ErrorPolicy", type = JAXBElement.class),
        @XmlElementRef(name = "RequestSideSecurity", type = JAXBElement.class),
        @XmlElementRef(name = "BackTimeout", type = JAXBElement.class),
        @XmlElementRef(name = "SSLProxyProfile", type = JAXBElement.class),
        @XmlElementRef(name = "FrontHTTPVersion", type = JAXBElement.class),
        @XmlElementRef(name = "DebugMode", type = JAXBElement.class),
        @XmlElementRef(name = "DelayErrors", type = JAXBElement.class),
        @XmlElementRef(name = "DebugHistory", type = JAXBElement.class),
        @XmlElementRef(name = "FrontSide", type = JAXBElement.class),
        @XmlElementRef(name = "BackPersistentTimeout", type = JAXBElement.class),
        @XmlElementRef(name = "DebugTrigger", type = JAXBElement.class),
        @XmlElementRef(name = "UserSummary", type = JAXBElement.class),
        @XmlElementRef(name = "HTTPClientIPLabel", type = JAXBElement.class),
        @XmlElementRef(name = "StreamOutputToBack", type = JAXBElement.class),
        @XmlElementRef(name = "Priority", type = JAXBElement.class)
    })
    protected List<JAXBElement<?>> userSummaryOrPriorityOrFrontSide;
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
     * Gets the value of the userSummaryOrPriorityOrFrontSide property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the userSummaryOrPriorityOrFrontSide property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUserSummaryOrPriorityOrFrontSide().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link Long }{@code >}
     * {@link JAXBElement }{@code <}{@link DmToggle }{@code >}
     * {@link JAXBElement }{@code <}{@link DmToggle }{@code >}
     * {@link JAXBElement }{@code <}{@link DmReference }{@code >}
     * {@link JAXBElement }{@code <}{@link DmReference }{@code >}
     * {@link JAXBElement }{@code <}{@link Long }{@code >}
     * {@link JAXBElement }{@code <}{@link Integer }{@code >}
     * {@link JAXBElement }{@code <}{@link DmReference }{@code >}
     * {@link JAXBElement }{@code <}{@link DmToggle }{@code >}
     * {@link JAXBElement }{@code <}{@link DmQuarantineMode }{@code >}
     * {@link JAXBElement }{@code <}{@link DmToggle }{@code >}
     * {@link JAXBElement }{@code <}{@link DmToggle }{@code >}
     * {@link JAXBElement }{@code <}{@link DmToggle }{@code >}
     * {@link JAXBElement }{@code <}{@link Long }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link DmHTTPVersion }{@code >}
     * {@link JAXBElement }{@code <}{@link DmReference }{@code >}
     * {@link JAXBElement }{@code <}{@link DmToggle }{@code >}
     * {@link JAXBElement }{@code <}{@link Long }{@code >}
     * {@link JAXBElement }{@code <}{@link DmReference }{@code >}
     * {@link JAXBElement }{@code <}{@link DmHTTPVersion }{@code >}
     * {@link JAXBElement }{@code <}{@link DmDebugMode }{@code >}
     * {@link JAXBElement }{@code <}{@link DmToggle }{@code >}
     * {@link JAXBElement }{@code <}{@link Long }{@code >}
     * {@link JAXBElement }{@code <}{@link DmFrontSide }{@code >}
     * {@link JAXBElement }{@code <}{@link Long }{@code >}
     * {@link JAXBElement }{@code <}{@link DmMSDebugTriggerType }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link DmSchedulerPriority }{@code >}
     * {@link JAXBElement }{@code <}{@link DmQuarantineMode }{@code >}
     * 
     * 
     */
    public List<JAXBElement<?>> getUserSummaryOrPriorityOrFrontSide() {
        if (userSummaryOrPriorityOrFrontSide == null) {
            userSummaryOrPriorityOrFrontSide = new ArrayList<JAXBElement<?>>();
        }
        return this.userSummaryOrPriorityOrFrontSide;
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
