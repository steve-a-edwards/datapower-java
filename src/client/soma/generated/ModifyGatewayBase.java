
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
 * <p>Java class for ModifyGatewayBase complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ModifyGatewayBase">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.datapower.com/schemas/management}ModifyConfigBase">
 *       &lt;choice maxOccurs="unbounded">
 *         &lt;element name="UserSummary" type="{http://www.datapower.com/schemas/management}dmString" minOccurs="0"/>
 *         &lt;element name="Priority" type="{http://www.datapower.com/schemas/management}dmSchedulerPriority" minOccurs="0"/>
 *         &lt;element name="FrontProtocol" type="{http://www.datapower.com/schemas/management}dmReference" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="XMLManager" type="{http://www.datapower.com/schemas/management}dmReference" minOccurs="0"/>
 *         &lt;element name="URLRewritePolicy" type="{http://www.datapower.com/schemas/management}dmReference" minOccurs="0"/>
 *         &lt;element name="SSLProxy" type="{http://www.datapower.com/schemas/management}dmReference" minOccurs="0"/>
 *         &lt;element name="FWCred" type="{http://www.datapower.com/schemas/management}dmReference" minOccurs="0"/>
 *         &lt;element name="HeaderInjection" type="{http://www.datapower.com/schemas/management}dmHeaderInjection" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="HeaderSuppression" type="{http://www.datapower.com/schemas/management}dmHeaderSuppression" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="StylesheetParameters" type="{http://www.datapower.com/schemas/management}dmStylesheetParameter" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="DefaultParamNamespace" type="{http://www.datapower.com/schemas/management}dmString" minOccurs="0"/>
 *         &lt;element name="QueryParamNamespace" type="{http://www.datapower.com/schemas/management}dmString" minOccurs="0"/>
 *         &lt;element name="BackendUrl" type="{http://www.datapower.com/schemas/management}dmURL" minOccurs="0"/>
 *         &lt;element name="PropagateURI" type="{http://www.datapower.com/schemas/management}dmToggle" minOccurs="0"/>
 *         &lt;element name="ServiceMonitors" type="{http://www.datapower.com/schemas/management}dmReference" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="CountMonitors" type="{http://www.datapower.com/schemas/management}dmReference" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="DurationMonitors" type="{http://www.datapower.com/schemas/management}dmReference" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="MonitorProcessingPolicy" type="{http://www.datapower.com/schemas/management}dmMonitorProcessingPolicy" minOccurs="0"/>
 *         &lt;element name="RequestAttachments" type="{http://www.datapower.com/schemas/management}dmAttachmentMode" minOccurs="0"/>
 *         &lt;element name="ResponseAttachments" type="{http://www.datapower.com/schemas/management}dmAttachmentMode" minOccurs="0"/>
 *         &lt;element name="RootPartNotFirstAction" type="{http://www.datapower.com/schemas/management}dmRootPartNotFirstAction" minOccurs="0"/>
 *         &lt;element name="FrontAttachmentFormat" type="{http://www.datapower.com/schemas/management}dmGatewayAttachmentFormat" minOccurs="0"/>
 *         &lt;element name="BackAttachmentFormat" type="{http://www.datapower.com/schemas/management}dmGatewayAttachmentFormat" minOccurs="0"/>
 *         &lt;element name="MIMEFrontHeaders" type="{http://www.datapower.com/schemas/management}dmToggle" minOccurs="0"/>
 *         &lt;element name="MIMEBackHeaders" type="{http://www.datapower.com/schemas/management}dmToggle" minOccurs="0"/>
 *         &lt;element name="StreamOutputToBack" type="{http://www.datapower.com/schemas/management}dmQuarantineMode" minOccurs="0"/>
 *         &lt;element name="StreamOutputToFront" type="{http://www.datapower.com/schemas/management}dmQuarantineMode" minOccurs="0"/>
 *         &lt;element name="MaxMessageSize" type="{http://www.datapower.com/schemas/management}dmUInt32" minOccurs="0"/>
 *         &lt;element name="GatewayParserLimits" type="{http://www.datapower.com/schemas/management}dmToggle" minOccurs="0"/>
 *         &lt;element name="ParserLimitsElementDepth" type="{http://www.datapower.com/schemas/management}dmUInt16" minOccurs="0"/>
 *         &lt;element name="ParserLimitsAttributeCount" type="{http://www.datapower.com/schemas/management}dmUInt16" minOccurs="0"/>
 *         &lt;element name="ParserLimitsMaxNodeSize" type="{http://www.datapower.com/schemas/management}dmUInt32" minOccurs="0"/>
 *         &lt;element name="ParserLimitsForbidExternalReferences" type="{http://www.datapower.com/schemas/management}dmToggle" minOccurs="0"/>
 *         &lt;element name="ParserLimitsExternalReferences" type="{http://www.datapower.com/schemas/management}dmExternalRefHandling" minOccurs="0"/>
 *         &lt;element name="ParserLimitsMaxPrefixes" type="{http://www.datapower.com/schemas/management}dmUInt16" minOccurs="0"/>
 *         &lt;element name="ParserLimitsMaxNamespaces" type="{http://www.datapower.com/schemas/management}dmUInt16" minOccurs="0"/>
 *         &lt;element name="ParserLimitsMaxLocalNames" type="{http://www.datapower.com/schemas/management}dmUInt16" minOccurs="0"/>
 *         &lt;element name="ParserLimitsAttachmentByteCount" type="{http://www.datapower.com/schemas/management}dmUInt32" minOccurs="0"/>
 *         &lt;element name="ParserLimitsAttachmentPackageByteCount" type="{http://www.datapower.com/schemas/management}dmUInt32" minOccurs="0"/>
 *         &lt;element name="DebugMode" type="{http://www.datapower.com/schemas/management}dmDebugMode" minOccurs="0"/>
 *         &lt;element name="DebugHistory" type="{http://www.datapower.com/schemas/management}dmUInt32" minOccurs="0"/>
 *         &lt;element name="DebugTrigger" type="{http://www.datapower.com/schemas/management}dmMSDebugTriggerType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="FlowControl" type="{http://www.datapower.com/schemas/management}dmToggle" minOccurs="0"/>
 *         &lt;element name="SOAPSchemaURL" type="{http://www.datapower.com/schemas/management}dmURL" minOccurs="0"/>
 *         &lt;element name="FrontTimeout" type="{http://www.datapower.com/schemas/management}dmTimeInterval" minOccurs="0"/>
 *         &lt;element name="BackTimeout" type="{http://www.datapower.com/schemas/management}dmTimeInterval" minOccurs="0"/>
 *         &lt;element name="FrontPersistentTimeout" type="{http://www.datapower.com/schemas/management}dmTimeInterval" minOccurs="0"/>
 *         &lt;element name="BackPersistentTimeout" type="{http://www.datapower.com/schemas/management}dmTimeInterval" minOccurs="0"/>
 *         &lt;element name="IncludeResponseTypeEncoding" type="{http://www.datapower.com/schemas/management}dmToggle" minOccurs="0"/>
 *         &lt;element name="BackHTTPVersion" type="{http://www.datapower.com/schemas/management}dmHTTPVersion" minOccurs="0"/>
 *         &lt;element name="AllowCompression" type="{http://www.datapower.com/schemas/management}dmToggle" minOccurs="0"/>
 *         &lt;element name="PersistentConnections" type="{http://www.datapower.com/schemas/management}dmToggle" minOccurs="0"/>
 *         &lt;element name="LoopDetection" type="{http://www.datapower.com/schemas/management}dmToggle" minOccurs="0"/>
 *         &lt;element name="FollowRedirects" type="{http://www.datapower.com/schemas/management}dmToggle" minOccurs="0"/>
 *         &lt;element name="DoHostRewriting" type="{http://www.datapower.com/schemas/management}dmToggle" minOccurs="0"/>
 *         &lt;element name="DoChunkedUpload" type="{http://www.datapower.com/schemas/management}dmToggle" minOccurs="0"/>
 *         &lt;element name="ProcessHTTPErrors" type="{http://www.datapower.com/schemas/management}dmToggle" minOccurs="0"/>
 *         &lt;element name="HTTPClientIPLabel" type="{http://www.datapower.com/schemas/management}dmString" minOccurs="0"/>
 *         &lt;element name="LoadBalancerHashHeader" type="{http://www.datapower.com/schemas/management}dmString" minOccurs="0"/>
 *         &lt;element name="InOrderMode" type="{http://www.datapower.com/schemas/management}dmGatewayInOrderMode" minOccurs="0"/>
 *         &lt;element name="WSAMode" type="{http://www.datapower.com/schemas/management}dmWSAModeType" minOccurs="0"/>
 *         &lt;element name="WSARequireAAA" type="{http://www.datapower.com/schemas/management}dmToggle" minOccurs="0"/>
 *         &lt;element name="WSARewriteReplyTo" type="{http://www.datapower.com/schemas/management}dmReference" minOccurs="0"/>
 *         &lt;element name="WSARewriteFaultTo" type="{http://www.datapower.com/schemas/management}dmReference" minOccurs="0"/>
 *         &lt;element name="WSARewriteTo" type="{http://www.datapower.com/schemas/management}dmReference" minOccurs="0"/>
 *         &lt;element name="WSAStrip" type="{http://www.datapower.com/schemas/management}dmToggle" minOccurs="0"/>
 *         &lt;element name="WSADefaultReplyTo" type="{http://www.datapower.com/schemas/management}dmURL" minOccurs="0"/>
 *         &lt;element name="WSADefaultFaultTo" type="{http://www.datapower.com/schemas/management}dmURL" minOccurs="0"/>
 *         &lt;element name="WSAForce" type="{http://www.datapower.com/schemas/management}dmToggle" minOccurs="0"/>
 *         &lt;element name="WSAGenStyle" type="{http://www.datapower.com/schemas/management}dmWSAOriginatedRequestType" minOccurs="0"/>
 *         &lt;element name="WSAHTTPAsyncResponseCode" type="{http://www.datapower.com/schemas/management}dmUInt16" minOccurs="0"/>
 *         &lt;element name="WSABackProtocol" type="{http://www.datapower.com/schemas/management}dmReference" minOccurs="0"/>
 *         &lt;element name="WSATimeout" type="{http://www.datapower.com/schemas/management}dmUInt32" minOccurs="0"/>
 *         &lt;element name="WSRMEnabled" type="{http://www.datapower.com/schemas/management}dmToggle" minOccurs="0"/>
 *         &lt;element name="WSRMSequenceExpiration" type="{http://www.datapower.com/schemas/management}dmTimeInterval" minOccurs="0"/>
 *         &lt;element name="WSRMAAAPolicy" type="{http://www.datapower.com/schemas/management}dmReference" minOccurs="0"/>
 *         &lt;element name="WSRMDestinationAcceptCreateSequence" type="{http://www.datapower.com/schemas/management}dmToggle" minOccurs="0"/>
 *         &lt;element name="WSRMDestinationMaximumSequences" type="{http://www.datapower.com/schemas/management}dmUInt32" minOccurs="0"/>
 *         &lt;element name="WSRMDestinationInOrder" type="{http://www.datapower.com/schemas/management}dmToggle" minOccurs="0"/>
 *         &lt;element name="WSRMDestinationMaximumInOrderQueueLength" type="{http://www.datapower.com/schemas/management}dmUInt32" minOccurs="0"/>
 *         &lt;element name="WSRMDestinationAcceptOffers" type="{http://www.datapower.com/schemas/management}dmToggle" minOccurs="0"/>
 *         &lt;element name="WSRMFrontForce" type="{http://www.datapower.com/schemas/management}dmToggle" minOccurs="0"/>
 *         &lt;element name="WSRMBackForce" type="{http://www.datapower.com/schemas/management}dmToggle" minOccurs="0"/>
 *         &lt;element name="WSRMBackCreateSequence" type="{http://www.datapower.com/schemas/management}dmToggle" minOccurs="0"/>
 *         &lt;element name="WSRMFrontCreateSequence" type="{http://www.datapower.com/schemas/management}dmToggle" minOccurs="0"/>
 *         &lt;element name="WSRMSourceMakeOffer" type="{http://www.datapower.com/schemas/management}dmToggle" minOccurs="0"/>
 *         &lt;element name="WSRMUsesSequenceSSL" type="{http://www.datapower.com/schemas/management}dmToggle" minOccurs="0"/>
 *         &lt;element name="WSRMFrontAcksTo" type="{http://www.datapower.com/schemas/management}dmReference" minOccurs="0"/>
 *         &lt;element name="WSRMBackAcksTo" type="{http://www.datapower.com/schemas/management}dmReference" minOccurs="0"/>
 *         &lt;element name="WSRMSourceMaximumSequences" type="{http://www.datapower.com/schemas/management}dmUInt32" minOccurs="0"/>
 *         &lt;element name="WSRMSourceRetransmissionInterval" type="{http://www.datapower.com/schemas/management}dmTimeInterval" minOccurs="0"/>
 *         &lt;element name="WSRMSourceExponentialBackoff" type="{http://www.datapower.com/schemas/management}dmToggle" minOccurs="0"/>
 *         &lt;element name="WSRMSourceMaximumRetransmissions" type="{http://www.datapower.com/schemas/management}dmUInt32" minOccurs="0"/>
 *         &lt;element name="WSRMSourceMaximumQueueLength" type="{http://www.datapower.com/schemas/management}dmUInt32" minOccurs="0"/>
 *         &lt;element name="WSRMSourceRequestAckCount" type="{http://www.datapower.com/schemas/management}dmUInt32" minOccurs="0"/>
 *         &lt;element name="WSRMSourceInactivityClose" type="{http://www.datapower.com/schemas/management}dmTimeInterval" minOccurs="0"/>
 *         &lt;element name="ForcePolicyExec" type="{http://www.datapower.com/schemas/management}dmToggle" minOccurs="0"/>
 *         &lt;element name="RewriteErrors" type="{http://www.datapower.com/schemas/management}dmToggle" minOccurs="0"/>
 *         &lt;element name="DelayErrors" type="{http://www.datapower.com/schemas/management}dmToggle" minOccurs="0"/>
 *         &lt;element name="DelayErrorsDuration" type="{http://www.datapower.com/schemas/management}dmUInt32" minOccurs="0"/>
 *       &lt;/choice>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ModifyGatewayBase", propOrder = {
    "userSummaryOrPriorityOrFrontProtocol"
})
@XmlSeeAlso({
    ModifyWSGateway.class,
    ModifyMultiProtocolGateway.class
})
public class ModifyGatewayBase
    extends ModifyConfigBase
{

    @XmlElementRefs({
        @XmlElementRef(name = "AllowCompression", type = JAXBElement.class),
        @XmlElementRef(name = "WSARewriteFaultTo", type = JAXBElement.class),
        @XmlElementRef(name = "QueryParamNamespace", type = JAXBElement.class),
        @XmlElementRef(name = "HeaderSuppression", type = JAXBElement.class),
        @XmlElementRef(name = "BackHTTPVersion", type = JAXBElement.class),
        @XmlElementRef(name = "FollowRedirects", type = JAXBElement.class),
        @XmlElementRef(name = "WSRMSourceRequestAckCount", type = JAXBElement.class),
        @XmlElementRef(name = "ResponseAttachments", type = JAXBElement.class),
        @XmlElementRef(name = "MIMEBackHeaders", type = JAXBElement.class),
        @XmlElementRef(name = "BackTimeout", type = JAXBElement.class),
        @XmlElementRef(name = "WSADefaultFaultTo", type = JAXBElement.class),
        @XmlElementRef(name = "WSRMSourceMaximumSequences", type = JAXBElement.class),
        @XmlElementRef(name = "WSRMFrontAcksTo", type = JAXBElement.class),
        @XmlElementRef(name = "LoadBalancerHashHeader", type = JAXBElement.class),
        @XmlElementRef(name = "WSRMSourceRetransmissionInterval", type = JAXBElement.class),
        @XmlElementRef(name = "StreamOutputToBack", type = JAXBElement.class),
        @XmlElementRef(name = "LoopDetection", type = JAXBElement.class),
        @XmlElementRef(name = "WSAHTTPAsyncResponseCode", type = JAXBElement.class),
        @XmlElementRef(name = "InOrderMode", type = JAXBElement.class),
        @XmlElementRef(name = "ServiceMonitors", type = JAXBElement.class),
        @XmlElementRef(name = "ParserLimitsElementDepth", type = JAXBElement.class),
        @XmlElementRef(name = "BackPersistentTimeout", type = JAXBElement.class),
        @XmlElementRef(name = "FWCred", type = JAXBElement.class),
        @XmlElementRef(name = "ProcessHTTPErrors", type = JAXBElement.class),
        @XmlElementRef(name = "IncludeResponseTypeEncoding", type = JAXBElement.class),
        @XmlElementRef(name = "ParserLimitsMaxNamespaces", type = JAXBElement.class),
        @XmlElementRef(name = "DoChunkedUpload", type = JAXBElement.class),
        @XmlElementRef(name = "PersistentConnections", type = JAXBElement.class),
        @XmlElementRef(name = "FrontTimeout", type = JAXBElement.class),
        @XmlElementRef(name = "WSARewriteTo", type = JAXBElement.class),
        @XmlElementRef(name = "UserSummary", type = JAXBElement.class),
        @XmlElementRef(name = "RootPartNotFirstAction", type = JAXBElement.class),
        @XmlElementRef(name = "WSRMDestinationMaximumInOrderQueueLength", type = JAXBElement.class),
        @XmlElementRef(name = "DurationMonitors", type = JAXBElement.class),
        @XmlElementRef(name = "DefaultParamNamespace", type = JAXBElement.class),
        @XmlElementRef(name = "WSRMUsesSequenceSSL", type = JAXBElement.class),
        @XmlElementRef(name = "CountMonitors", type = JAXBElement.class),
        @XmlElementRef(name = "DoHostRewriting", type = JAXBElement.class),
        @XmlElementRef(name = "WSRMSourceInactivityClose", type = JAXBElement.class),
        @XmlElementRef(name = "WSRMEnabled", type = JAXBElement.class),
        @XmlElementRef(name = "WSRMBackAcksTo", type = JAXBElement.class),
        @XmlElementRef(name = "WSADefaultReplyTo", type = JAXBElement.class),
        @XmlElementRef(name = "WSRMBackForce", type = JAXBElement.class),
        @XmlElementRef(name = "WSRMAAAPolicy", type = JAXBElement.class),
        @XmlElementRef(name = "ParserLimitsAttachmentPackageByteCount", type = JAXBElement.class),
        @XmlElementRef(name = "FrontPersistentTimeout", type = JAXBElement.class),
        @XmlElementRef(name = "MIMEFrontHeaders", type = JAXBElement.class),
        @XmlElementRef(name = "DebugMode", type = JAXBElement.class),
        @XmlElementRef(name = "WSRMSourceMaximumRetransmissions", type = JAXBElement.class),
        @XmlElementRef(name = "WSAGenStyle", type = JAXBElement.class),
        @XmlElementRef(name = "WSRMSourceMaximumQueueLength", type = JAXBElement.class),
        @XmlElementRef(name = "BackendUrl", type = JAXBElement.class),
        @XmlElementRef(name = "WSRMSourceMakeOffer", type = JAXBElement.class),
        @XmlElementRef(name = "ParserLimitsMaxPrefixes", type = JAXBElement.class),
        @XmlElementRef(name = "WSATimeout", type = JAXBElement.class),
        @XmlElementRef(name = "RewriteErrors", type = JAXBElement.class),
        @XmlElementRef(name = "WSRMSourceExponentialBackoff", type = JAXBElement.class),
        @XmlElementRef(name = "ParserLimitsForbidExternalReferences", type = JAXBElement.class),
        @XmlElementRef(name = "SOAPSchemaURL", type = JAXBElement.class),
        @XmlElementRef(name = "DelayErrors", type = JAXBElement.class),
        @XmlElementRef(name = "WSRMFrontCreateSequence", type = JAXBElement.class),
        @XmlElementRef(name = "WSAStrip", type = JAXBElement.class),
        @XmlElementRef(name = "RequestAttachments", type = JAXBElement.class),
        @XmlElementRef(name = "ForcePolicyExec", type = JAXBElement.class),
        @XmlElementRef(name = "HTTPClientIPLabel", type = JAXBElement.class),
        @XmlElementRef(name = "PropagateURI", type = JAXBElement.class),
        @XmlElementRef(name = "ParserLimitsMaxNodeSize", type = JAXBElement.class),
        @XmlElementRef(name = "WSRMFrontForce", type = JAXBElement.class),
        @XmlElementRef(name = "DelayErrorsDuration", type = JAXBElement.class),
        @XmlElementRef(name = "StylesheetParameters", type = JAXBElement.class),
        @XmlElementRef(name = "ParserLimitsAttributeCount", type = JAXBElement.class),
        @XmlElementRef(name = "WSRMDestinationInOrder", type = JAXBElement.class),
        @XmlElementRef(name = "Priority", type = JAXBElement.class),
        @XmlElementRef(name = "MonitorProcessingPolicy", type = JAXBElement.class),
        @XmlElementRef(name = "DebugTrigger", type = JAXBElement.class),
        @XmlElementRef(name = "WSAMode", type = JAXBElement.class),
        @XmlElementRef(name = "HeaderInjection", type = JAXBElement.class),
        @XmlElementRef(name = "ParserLimitsMaxLocalNames", type = JAXBElement.class),
        @XmlElementRef(name = "ParserLimitsExternalReferences", type = JAXBElement.class),
        @XmlElementRef(name = "WSARewriteReplyTo", type = JAXBElement.class),
        @XmlElementRef(name = "MaxMessageSize", type = JAXBElement.class),
        @XmlElementRef(name = "WSRMBackCreateSequence", type = JAXBElement.class),
        @XmlElementRef(name = "WSARequireAAA", type = JAXBElement.class),
        @XmlElementRef(name = "DebugHistory", type = JAXBElement.class),
        @XmlElementRef(name = "WSAForce", type = JAXBElement.class),
        @XmlElementRef(name = "StreamOutputToFront", type = JAXBElement.class),
        @XmlElementRef(name = "ParserLimitsAttachmentByteCount", type = JAXBElement.class),
        @XmlElementRef(name = "SSLProxy", type = JAXBElement.class),
        @XmlElementRef(name = "FrontProtocol", type = JAXBElement.class),
        @XmlElementRef(name = "WSRMDestinationAcceptCreateSequence", type = JAXBElement.class),
        @XmlElementRef(name = "WSABackProtocol", type = JAXBElement.class),
        @XmlElementRef(name = "WSRMSequenceExpiration", type = JAXBElement.class),
        @XmlElementRef(name = "FrontAttachmentFormat", type = JAXBElement.class),
        @XmlElementRef(name = "XMLManager", type = JAXBElement.class),
        @XmlElementRef(name = "FlowControl", type = JAXBElement.class),
        @XmlElementRef(name = "WSRMDestinationAcceptOffers", type = JAXBElement.class),
        @XmlElementRef(name = "URLRewritePolicy", type = JAXBElement.class),
        @XmlElementRef(name = "WSRMDestinationMaximumSequences", type = JAXBElement.class),
        @XmlElementRef(name = "GatewayParserLimits", type = JAXBElement.class),
        @XmlElementRef(name = "BackAttachmentFormat", type = JAXBElement.class)
    })
    protected List<JAXBElement<?>> userSummaryOrPriorityOrFrontProtocol;

    /**
     * Gets the value of the userSummaryOrPriorityOrFrontProtocol property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the userSummaryOrPriorityOrFrontProtocol property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUserSummaryOrPriorityOrFrontProtocol().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link DmToggle }{@code >}
     * {@link JAXBElement }{@code <}{@link DmReference }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link DmHeaderSuppression }{@code >}
     * {@link JAXBElement }{@code <}{@link DmHTTPVersion }{@code >}
     * {@link JAXBElement }{@code <}{@link DmToggle }{@code >}
     * {@link JAXBElement }{@code <}{@link Long }{@code >}
     * {@link JAXBElement }{@code <}{@link DmAttachmentMode }{@code >}
     * {@link JAXBElement }{@code <}{@link DmToggle }{@code >}
     * {@link JAXBElement }{@code <}{@link Long }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link Long }{@code >}
     * {@link JAXBElement }{@code <}{@link DmReference }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link Long }{@code >}
     * {@link JAXBElement }{@code <}{@link DmQuarantineMode }{@code >}
     * {@link JAXBElement }{@code <}{@link DmToggle }{@code >}
     * {@link JAXBElement }{@code <}{@link Integer }{@code >}
     * {@link JAXBElement }{@code <}{@link DmGatewayInOrderMode }{@code >}
     * {@link JAXBElement }{@code <}{@link DmReference }{@code >}
     * {@link JAXBElement }{@code <}{@link Integer }{@code >}
     * {@link JAXBElement }{@code <}{@link Long }{@code >}
     * {@link JAXBElement }{@code <}{@link DmReference }{@code >}
     * {@link JAXBElement }{@code <}{@link DmToggle }{@code >}
     * {@link JAXBElement }{@code <}{@link DmToggle }{@code >}
     * {@link JAXBElement }{@code <}{@link Integer }{@code >}
     * {@link JAXBElement }{@code <}{@link DmToggle }{@code >}
     * {@link JAXBElement }{@code <}{@link DmToggle }{@code >}
     * {@link JAXBElement }{@code <}{@link Long }{@code >}
     * {@link JAXBElement }{@code <}{@link DmReference }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link DmRootPartNotFirstAction }{@code >}
     * {@link JAXBElement }{@code <}{@link Long }{@code >}
     * {@link JAXBElement }{@code <}{@link DmReference }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link DmToggle }{@code >}
     * {@link JAXBElement }{@code <}{@link DmReference }{@code >}
     * {@link JAXBElement }{@code <}{@link DmToggle }{@code >}
     * {@link JAXBElement }{@code <}{@link Long }{@code >}
     * {@link JAXBElement }{@code <}{@link DmToggle }{@code >}
     * {@link JAXBElement }{@code <}{@link DmReference }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link DmToggle }{@code >}
     * {@link JAXBElement }{@code <}{@link DmReference }{@code >}
     * {@link JAXBElement }{@code <}{@link Long }{@code >}
     * {@link JAXBElement }{@code <}{@link Long }{@code >}
     * {@link JAXBElement }{@code <}{@link DmToggle }{@code >}
     * {@link JAXBElement }{@code <}{@link DmDebugMode }{@code >}
     * {@link JAXBElement }{@code <}{@link Long }{@code >}
     * {@link JAXBElement }{@code <}{@link DmWSAOriginatedRequestType }{@code >}
     * {@link JAXBElement }{@code <}{@link Long }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link DmToggle }{@code >}
     * {@link JAXBElement }{@code <}{@link Integer }{@code >}
     * {@link JAXBElement }{@code <}{@link Long }{@code >}
     * {@link JAXBElement }{@code <}{@link DmToggle }{@code >}
     * {@link JAXBElement }{@code <}{@link DmToggle }{@code >}
     * {@link JAXBElement }{@code <}{@link DmToggle }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link DmToggle }{@code >}
     * {@link JAXBElement }{@code <}{@link DmToggle }{@code >}
     * {@link JAXBElement }{@code <}{@link DmToggle }{@code >}
     * {@link JAXBElement }{@code <}{@link DmAttachmentMode }{@code >}
     * {@link JAXBElement }{@code <}{@link DmToggle }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link DmToggle }{@code >}
     * {@link JAXBElement }{@code <}{@link Long }{@code >}
     * {@link JAXBElement }{@code <}{@link DmToggle }{@code >}
     * {@link JAXBElement }{@code <}{@link Long }{@code >}
     * {@link JAXBElement }{@code <}{@link DmStylesheetParameter }{@code >}
     * {@link JAXBElement }{@code <}{@link Integer }{@code >}
     * {@link JAXBElement }{@code <}{@link DmToggle }{@code >}
     * {@link JAXBElement }{@code <}{@link DmSchedulerPriority }{@code >}
     * {@link JAXBElement }{@code <}{@link DmMonitorProcessingPolicy }{@code >}
     * {@link JAXBElement }{@code <}{@link DmMSDebugTriggerType }{@code >}
     * {@link JAXBElement }{@code <}{@link DmWSAModeType }{@code >}
     * {@link JAXBElement }{@code <}{@link DmHeaderInjection }{@code >}
     * {@link JAXBElement }{@code <}{@link Integer }{@code >}
     * {@link JAXBElement }{@code <}{@link DmExternalRefHandling }{@code >}
     * {@link JAXBElement }{@code <}{@link DmReference }{@code >}
     * {@link JAXBElement }{@code <}{@link Long }{@code >}
     * {@link JAXBElement }{@code <}{@link DmToggle }{@code >}
     * {@link JAXBElement }{@code <}{@link DmToggle }{@code >}
     * {@link JAXBElement }{@code <}{@link Long }{@code >}
     * {@link JAXBElement }{@code <}{@link DmToggle }{@code >}
     * {@link JAXBElement }{@code <}{@link DmQuarantineMode }{@code >}
     * {@link JAXBElement }{@code <}{@link Long }{@code >}
     * {@link JAXBElement }{@code <}{@link DmReference }{@code >}
     * {@link JAXBElement }{@code <}{@link DmReference }{@code >}
     * {@link JAXBElement }{@code <}{@link DmToggle }{@code >}
     * {@link JAXBElement }{@code <}{@link DmReference }{@code >}
     * {@link JAXBElement }{@code <}{@link Long }{@code >}
     * {@link JAXBElement }{@code <}{@link DmGatewayAttachmentFormat }{@code >}
     * {@link JAXBElement }{@code <}{@link DmReference }{@code >}
     * {@link JAXBElement }{@code <}{@link DmToggle }{@code >}
     * {@link JAXBElement }{@code <}{@link DmToggle }{@code >}
     * {@link JAXBElement }{@code <}{@link DmReference }{@code >}
     * {@link JAXBElement }{@code <}{@link Long }{@code >}
     * {@link JAXBElement }{@code <}{@link DmToggle }{@code >}
     * {@link JAXBElement }{@code <}{@link DmGatewayAttachmentFormat }{@code >}
     * 
     * 
     */
    public List<JAXBElement<?>> getUserSummaryOrPriorityOrFrontProtocol() {
        if (userSummaryOrPriorityOrFrontProtocol == null) {
            userSummaryOrPriorityOrFrontProtocol = new ArrayList<JAXBElement<?>>();
        }
        return this.userSummaryOrPriorityOrFrontProtocol;
    }

}
