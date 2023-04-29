
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
 * <p>Java class for ConfigMQproxy complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ConfigMQproxy">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.datapower.com/schemas/management}ConfigMQConfiguration">
 *       &lt;choice maxOccurs="unbounded">
 *         &lt;element name="UserSummary" type="{http://www.datapower.com/schemas/management}dmString" minOccurs="0"/>
 *         &lt;element name="FrontQueueManager" type="{http://www.datapower.com/schemas/management}dmReference"/>
 *         &lt;element name="BackQueueManager" type="{http://www.datapower.com/schemas/management}dmReference"/>
 *         &lt;element name="Concurrent" type="{http://www.datapower.com/schemas/management}dmUInt16" minOccurs="0"/>
 *         &lt;element name="WaitTimeout" type="{http://www.datapower.com/schemas/management}dmUInt32" minOccurs="0"/>
 *         &lt;element name="FirewallExtensions" type="{http://www.datapower.com/schemas/management}dmToggle" minOccurs="0"/>
 *         &lt;element name="RequestGetQueue" type="{http://www.datapower.com/schemas/management}dmString"/>
 *         &lt;element name="RequestPutQueue" type="{http://www.datapower.com/schemas/management}dmString"/>
 *         &lt;element name="ResponseGetQueue" type="{http://www.datapower.com/schemas/management}dmString"/>
 *         &lt;element name="ResponsePutQueue" type="{http://www.datapower.com/schemas/management}dmString"/>
 *         &lt;element name="XMLManager" type="{http://www.datapower.com/schemas/management}dmReference"/>
 *         &lt;element name="ContentType" type="{http://www.datapower.com/schemas/management}dmString" minOccurs="0"/>
 *         &lt;element name="RequestType" type="{http://www.datapower.com/schemas/management}dmXMLReqRespType" minOccurs="0"/>
 *         &lt;element name="ResponseType" type="{http://www.datapower.com/schemas/management}dmXMLReqRespType" minOccurs="0"/>
 *         &lt;element name="Credentials" type="{http://www.datapower.com/schemas/management}dmReference" minOccurs="0"/>
 *         &lt;element name="StylesheetParameters" type="{http://www.datapower.com/schemas/management}dmStylesheetParameter" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="DefaultParameterNamespace" type="{http://www.datapower.com/schemas/management}dmString" minOccurs="0"/>
 *         &lt;element name="RequestStylePolicyRule" type="{http://www.datapower.com/schemas/management}dmReference"/>
 *         &lt;element name="ResponseStylePolicyRule" type="{http://www.datapower.com/schemas/management}dmReference"/>
 *         &lt;element name="ErrorStylePolicyRule" type="{http://www.datapower.com/schemas/management}dmReference" minOccurs="0"/>
 *         &lt;element name="RequestAttachments" type="{http://www.datapower.com/schemas/management}dmAttachmentMode" minOccurs="0"/>
 *         &lt;element name="ResponseAttachments" type="{http://www.datapower.com/schemas/management}dmAttachmentMode" minOccurs="0"/>
 *         &lt;element name="RootPartNotFirstAction" type="{http://www.datapower.com/schemas/management}dmRootPartNotFirstAction" minOccurs="0"/>
 *         &lt;element name="FrontAttachmentFormat" type="{http://www.datapower.com/schemas/management}dmAttachmentFormat" minOccurs="0"/>
 *         &lt;element name="BackAttachmentFormat" type="{http://www.datapower.com/schemas/management}dmAttachmentFormat" minOccurs="0"/>
 *         &lt;element name="DebugMode" type="{http://www.datapower.com/schemas/management}dmDebugMode" minOccurs="0"/>
 *         &lt;element name="DebugHistory" type="{http://www.datapower.com/schemas/management}dmUInt32" minOccurs="0"/>
 *         &lt;element name="DebugTrigger" type="{http://www.datapower.com/schemas/management}dmMQMSDebugTriggerType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="SOAPSchemaURL" type="{http://www.datapower.com/schemas/management}dmURL" minOccurs="0"/>
 *         &lt;element name="CountMonitors" type="{http://www.datapower.com/schemas/management}dmReference" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="DurationMonitors" type="{http://www.datapower.com/schemas/management}dmReference" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "ConfigMQproxy", propOrder = {
    "userSummaryOrFrontQueueManagerOrBackQueueManager"
})
public class ConfigMQproxy
    extends ConfigMQConfiguration
{

    @XmlElementRefs({
        @XmlElementRef(name = "StylesheetParameters", type = JAXBElement.class),
        @XmlElementRef(name = "ResponsePutQueue", type = JAXBElement.class),
        @XmlElementRef(name = "FirewallExtensions", type = JAXBElement.class),
        @XmlElementRef(name = "RequestStylePolicyRule", type = JAXBElement.class),
        @XmlElementRef(name = "RequestType", type = JAXBElement.class),
        @XmlElementRef(name = "ErrorStylePolicyRule", type = JAXBElement.class),
        @XmlElementRef(name = "SOAPSchemaURL", type = JAXBElement.class),
        @XmlElementRef(name = "UserSummary", type = JAXBElement.class),
        @XmlElementRef(name = "XMLManager", type = JAXBElement.class),
        @XmlElementRef(name = "RootPartNotFirstAction", type = JAXBElement.class),
        @XmlElementRef(name = "ContentType", type = JAXBElement.class),
        @XmlElementRef(name = "BackQueueManager", type = JAXBElement.class),
        @XmlElementRef(name = "FrontQueueManager", type = JAXBElement.class),
        @XmlElementRef(name = "RequestPutQueue", type = JAXBElement.class),
        @XmlElementRef(name = "BackAttachmentFormat", type = JAXBElement.class),
        @XmlElementRef(name = "DebugMode", type = JAXBElement.class),
        @XmlElementRef(name = "ResponseAttachments", type = JAXBElement.class),
        @XmlElementRef(name = "RequestAttachments", type = JAXBElement.class),
        @XmlElementRef(name = "ResponseType", type = JAXBElement.class),
        @XmlElementRef(name = "Concurrent", type = JAXBElement.class),
        @XmlElementRef(name = "WaitTimeout", type = JAXBElement.class),
        @XmlElementRef(name = "Credentials", type = JAXBElement.class),
        @XmlElementRef(name = "ResponseStylePolicyRule", type = JAXBElement.class),
        @XmlElementRef(name = "RequestGetQueue", type = JAXBElement.class),
        @XmlElementRef(name = "DurationMonitors", type = JAXBElement.class),
        @XmlElementRef(name = "DebugHistory", type = JAXBElement.class),
        @XmlElementRef(name = "DefaultParameterNamespace", type = JAXBElement.class),
        @XmlElementRef(name = "FrontAttachmentFormat", type = JAXBElement.class),
        @XmlElementRef(name = "CountMonitors", type = JAXBElement.class),
        @XmlElementRef(name = "DebugTrigger", type = JAXBElement.class),
        @XmlElementRef(name = "ResponseGetQueue", type = JAXBElement.class)
    })
    protected List<JAXBElement<?>> userSummaryOrFrontQueueManagerOrBackQueueManager;
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
     * Gets the value of the userSummaryOrFrontQueueManagerOrBackQueueManager property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the userSummaryOrFrontQueueManagerOrBackQueueManager property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUserSummaryOrFrontQueueManagerOrBackQueueManager().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link DmStylesheetParameter }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link DmToggle }{@code >}
     * {@link JAXBElement }{@code <}{@link DmReference }{@code >}
     * {@link JAXBElement }{@code <}{@link DmXMLReqRespType }{@code >}
     * {@link JAXBElement }{@code <}{@link DmReference }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link DmReference }{@code >}
     * {@link JAXBElement }{@code <}{@link DmRootPartNotFirstAction }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link DmReference }{@code >}
     * {@link JAXBElement }{@code <}{@link DmReference }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link DmAttachmentFormat }{@code >}
     * {@link JAXBElement }{@code <}{@link DmDebugMode }{@code >}
     * {@link JAXBElement }{@code <}{@link DmAttachmentMode }{@code >}
     * {@link JAXBElement }{@code <}{@link DmAttachmentMode }{@code >}
     * {@link JAXBElement }{@code <}{@link DmXMLReqRespType }{@code >}
     * {@link JAXBElement }{@code <}{@link Integer }{@code >}
     * {@link JAXBElement }{@code <}{@link Long }{@code >}
     * {@link JAXBElement }{@code <}{@link DmReference }{@code >}
     * {@link JAXBElement }{@code <}{@link DmReference }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link DmReference }{@code >}
     * {@link JAXBElement }{@code <}{@link Long }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link DmReference }{@code >}
     * {@link JAXBElement }{@code <}{@link DmAttachmentFormat }{@code >}
     * {@link JAXBElement }{@code <}{@link DmMQMSDebugTriggerType }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * 
     */
    public List<JAXBElement<?>> getUserSummaryOrFrontQueueManagerOrBackQueueManager() {
        if (userSummaryOrFrontQueueManagerOrBackQueueManager == null) {
            userSummaryOrFrontQueueManagerOrBackQueueManager = new ArrayList<JAXBElement<?>>();
        }
        return this.userSummaryOrFrontQueueManagerOrBackQueueManager;
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
