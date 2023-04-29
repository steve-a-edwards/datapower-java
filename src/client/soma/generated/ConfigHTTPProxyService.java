
package client.soma.generated;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ConfigHTTPProxyService complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ConfigHTTPProxyService">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.datapower.com/schemas/management}ConfigService">
 *       &lt;choice maxOccurs="unbounded">
 *         &lt;element name="UserSummary" type="{http://www.datapower.com/schemas/management}dmString" minOccurs="0"/>
 *         &lt;element name="Priority" type="{http://www.datapower.com/schemas/management}dmSchedulerPriority" minOccurs="0"/>
 *         &lt;element name="LocalPort" type="{http://www.datapower.com/schemas/management}dmIPPort"/>
 *         &lt;element name="RemoteAddress" type="{http://www.datapower.com/schemas/management}dmHostname" minOccurs="0"/>
 *         &lt;element name="RemotePort" type="{http://www.datapower.com/schemas/management}dmIPPort" minOccurs="0"/>
 *         &lt;element name="ACL" type="{http://www.datapower.com/schemas/management}dmReference" minOccurs="0"/>
 *         &lt;element name="HTTPTimeout" type="{http://www.datapower.com/schemas/management}dmTimeInterval" minOccurs="0"/>
 *         &lt;element name="HTTPPersistTimeout" type="{http://www.datapower.com/schemas/management}dmTimeInterval" minOccurs="0"/>
 *         &lt;element name="DoHostRewrite" type="{http://www.datapower.com/schemas/management}dmToggle" minOccurs="0"/>
 *         &lt;element name="SuppressHTTPWarnings" type="{http://www.datapower.com/schemas/management}dmToggle" minOccurs="0"/>
 *         &lt;element name="HTTPCompression" type="{http://www.datapower.com/schemas/management}dmToggle" minOccurs="0"/>
 *         &lt;element name="HTTPIncludeResponseTypeEncoding" type="{http://www.datapower.com/schemas/management}dmToggle" minOccurs="0"/>
 *         &lt;element name="AlwaysShowErrors" type="{http://www.datapower.com/schemas/management}dmToggle" minOccurs="0"/>
 *         &lt;element name="DisallowGet" type="{http://www.datapower.com/schemas/management}dmToggle" minOccurs="0"/>
 *         &lt;element name="DisallowEmptyResponse" type="{http://www.datapower.com/schemas/management}dmToggle" minOccurs="0"/>
 *         &lt;element name="HTTPPersistentConnections" type="{http://www.datapower.com/schemas/management}dmToggle" minOccurs="0"/>
 *         &lt;element name="HTTPClientIPLabel" type="{http://www.datapower.com/schemas/management}dmString" minOccurs="0"/>
 *         &lt;element name="HTTPProxyHost" type="{http://www.datapower.com/schemas/management}dmHostname" minOccurs="0"/>
 *         &lt;element name="HTTPProxyPort" type="{http://www.datapower.com/schemas/management}dmIPPort" minOccurs="0"/>
 *         &lt;element name="HTTPVersion" type="{http://www.datapower.com/schemas/management}dmHTTPClientServerVersion" minOccurs="0"/>
 *         &lt;element name="DoChunkedUpload" type="{http://www.datapower.com/schemas/management}dmToggle" minOccurs="0"/>
 *         &lt;element name="HeaderInjection" type="{http://www.datapower.com/schemas/management}dmHeaderInjection" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="HeaderSuppression" type="{http://www.datapower.com/schemas/management}dmHeaderSuppression" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="StylesheetParameters" type="{http://www.datapower.com/schemas/management}dmStylesheetParameter" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="DefaultParamNamespace" type="{http://www.datapower.com/schemas/management}dmString" minOccurs="0"/>
 *         &lt;element name="QueryParamNamespace" type="{http://www.datapower.com/schemas/management}dmString" minOccurs="0"/>
 *         &lt;element name="ForcePolicyExec" type="{http://www.datapower.com/schemas/management}dmToggle" minOccurs="0"/>
 *         &lt;element name="CountMonitors" type="{http://www.datapower.com/schemas/management}dmReference" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="DurationMonitors" type="{http://www.datapower.com/schemas/management}dmReference" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="MonitorProcessingPolicy" type="{http://www.datapower.com/schemas/management}dmMonitorProcessingPolicy" minOccurs="0"/>
 *         &lt;element name="DebugMode" type="{http://www.datapower.com/schemas/management}dmDebugMode" minOccurs="0"/>
 *         &lt;element name="DebugHistory" type="{http://www.datapower.com/schemas/management}dmUInt32" minOccurs="0"/>
 *         &lt;element name="DebugTrigger" type="{http://www.datapower.com/schemas/management}dmMSDebugTriggerType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/choice>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConfigHTTPProxyService", propOrder = {
    "userSummaryOrPriorityOrLocalPort"
})
@XmlSeeAlso({
    ConfigXSLProxyService.class,
    ConfigXMLFirewallService.class
})
public class ConfigHTTPProxyService
    extends ConfigService
{

    @XmlElementRefs({
        @XmlElementRef(name = "DebugMode", type = JAXBElement.class),
        @XmlElementRef(name = "DurationMonitors", type = JAXBElement.class),
        @XmlElementRef(name = "SuppressHTTPWarnings", type = JAXBElement.class),
        @XmlElementRef(name = "HTTPTimeout", type = JAXBElement.class),
        @XmlElementRef(name = "HTTPProxyHost", type = JAXBElement.class),
        @XmlElementRef(name = "QueryParamNamespace", type = JAXBElement.class),
        @XmlElementRef(name = "HTTPPersistentConnections", type = JAXBElement.class),
        @XmlElementRef(name = "ACL", type = JAXBElement.class),
        @XmlElementRef(name = "HTTPCompression", type = JAXBElement.class),
        @XmlElementRef(name = "AlwaysShowErrors", type = JAXBElement.class),
        @XmlElementRef(name = "DisallowEmptyResponse", type = JAXBElement.class),
        @XmlElementRef(name = "RemotePort", type = JAXBElement.class),
        @XmlElementRef(name = "HTTPVersion", type = JAXBElement.class),
        @XmlElementRef(name = "DoChunkedUpload", type = JAXBElement.class),
        @XmlElementRef(name = "UserSummary", type = JAXBElement.class),
        @XmlElementRef(name = "Priority", type = JAXBElement.class),
        @XmlElementRef(name = "LocalPort", type = JAXBElement.class),
        @XmlElementRef(name = "HTTPClientIPLabel", type = JAXBElement.class),
        @XmlElementRef(name = "MonitorProcessingPolicy", type = JAXBElement.class),
        @XmlElementRef(name = "HTTPIncludeResponseTypeEncoding", type = JAXBElement.class),
        @XmlElementRef(name = "RemoteAddress", type = JAXBElement.class),
        @XmlElementRef(name = "DoHostRewrite", type = JAXBElement.class),
        @XmlElementRef(name = "HTTPPersistTimeout", type = JAXBElement.class),
        @XmlElementRef(name = "ForcePolicyExec", type = JAXBElement.class),
        @XmlElementRef(name = "StylesheetParameters", type = JAXBElement.class),
        @XmlElementRef(name = "CountMonitors", type = JAXBElement.class),
        @XmlElementRef(name = "HeaderSuppression", type = JAXBElement.class),
        @XmlElementRef(name = "HeaderInjection", type = JAXBElement.class),
        @XmlElementRef(name = "DisallowGet", type = JAXBElement.class),
        @XmlElementRef(name = "HTTPProxyPort", type = JAXBElement.class),
        @XmlElementRef(name = "DefaultParamNamespace", type = JAXBElement.class),
        @XmlElementRef(name = "DebugHistory", type = JAXBElement.class),
        @XmlElementRef(name = "DebugTrigger", type = JAXBElement.class)
    })
    protected List<JAXBElement<?>> userSummaryOrPriorityOrLocalPort;

    /**
     * Gets the value of the userSummaryOrPriorityOrLocalPort property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the userSummaryOrPriorityOrLocalPort property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUserSummaryOrPriorityOrLocalPort().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link DmDebugMode }{@code >}
     * {@link JAXBElement }{@code <}{@link DmReference }{@code >}
     * {@link JAXBElement }{@code <}{@link Long }{@code >}
     * {@link JAXBElement }{@code <}{@link DmToggle }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link DmToggle }{@code >}
     * {@link JAXBElement }{@code <}{@link DmReference }{@code >}
     * {@link JAXBElement }{@code <}{@link DmToggle }{@code >}
     * {@link JAXBElement }{@code <}{@link DmToggle }{@code >}
     * {@link JAXBElement }{@code <}{@link DmToggle }{@code >}
     * {@link JAXBElement }{@code <}{@link Integer }{@code >}
     * {@link JAXBElement }{@code <}{@link DmHTTPClientServerVersion }{@code >}
     * {@link JAXBElement }{@code <}{@link DmToggle }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link Integer }{@code >}
     * {@link JAXBElement }{@code <}{@link DmSchedulerPriority }{@code >}
     * {@link JAXBElement }{@code <}{@link DmMonitorProcessingPolicy }{@code >}
     * {@link JAXBElement }{@code <}{@link DmToggle }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link DmToggle }{@code >}
     * {@link JAXBElement }{@code <}{@link Long }{@code >}
     * {@link JAXBElement }{@code <}{@link DmToggle }{@code >}
     * {@link JAXBElement }{@code <}{@link DmStylesheetParameter }{@code >}
     * {@link JAXBElement }{@code <}{@link DmReference }{@code >}
     * {@link JAXBElement }{@code <}{@link DmHeaderSuppression }{@code >}
     * {@link JAXBElement }{@code <}{@link DmToggle }{@code >}
     * {@link JAXBElement }{@code <}{@link DmHeaderInjection }{@code >}
     * {@link JAXBElement }{@code <}{@link Long }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link Integer }{@code >}
     * {@link JAXBElement }{@code <}{@link DmMSDebugTriggerType }{@code >}
     * 
     * 
     */
    public List<JAXBElement<?>> getUserSummaryOrPriorityOrLocalPort() {
        if (userSummaryOrPriorityOrLocalPort == null) {
            userSummaryOrPriorityOrLocalPort = new ArrayList<JAXBElement<?>>();
        }
        return this.userSummaryOrPriorityOrLocalPort;
    }

}
