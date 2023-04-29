
package client.soma.generated;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AnyModifyElement complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AnyModifyElement">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice maxOccurs="unbounded">
 *         &lt;element name="AAAPolicy" type="{http://www.datapower.com/schemas/management}ModifyAAAPolicy"/>
 *         &lt;element name="Domain" type="{http://www.datapower.com/schemas/management}ModifyDomain"/>
 *         &lt;element name="LDAPSearchParameters" type="{http://www.datapower.com/schemas/management}ModifyLDAPSearchParameters"/>
 *         &lt;element name="ProcessingMetadata" type="{http://www.datapower.com/schemas/management}ModifyProcessingMetadata"/>
 *         &lt;element name="RADIUSSettings" type="{http://www.datapower.com/schemas/management}ModifyRADIUSSettings"/>
 *         &lt;element name="RBMSettings" type="{http://www.datapower.com/schemas/management}ModifyRBMSettings"/>
 *         &lt;element name="SAMLAttributes" type="{http://www.datapower.com/schemas/management}ModifySAMLAttributes"/>
 *         &lt;element name="SOAPHeaderDisposition" type="{http://www.datapower.com/schemas/management}ModifySOAPHeaderDisposition"/>
 *         &lt;element name="TAM" type="{http://www.datapower.com/schemas/management}ModifyTAM"/>
 *         &lt;element name="TFIMEndpoint" type="{http://www.datapower.com/schemas/management}ModifyTFIMEndpoint"/>
 *         &lt;element name="XACMLPDP" type="{http://www.datapower.com/schemas/management}ModifyXACMLPDP"/>
 *         &lt;element name="AccessControlList" type="{http://www.datapower.com/schemas/management}ModifyAccessControlList"/>
 *         &lt;element name="AppSecurityPolicy" type="{http://www.datapower.com/schemas/management}ModifyAppSecurityPolicy"/>
 *         &lt;element name="CompactFlash" type="{http://www.datapower.com/schemas/management}ModifyCompactFlash"/>
 *         &lt;element name="CompileOptionsPolicy" type="{http://www.datapower.com/schemas/management}ModifyCompileOptionsPolicy"/>
 *         &lt;element name="ConfigDeploymentPolicy" type="{http://www.datapower.com/schemas/management}ModifyConfigDeploymentPolicy"/>
 *         &lt;element name="ConformancePolicy" type="{http://www.datapower.com/schemas/management}ModifyConformancePolicy"/>
 *         &lt;element name="CertMonitor" type="{http://www.datapower.com/schemas/management}ModifyCertMonitor"/>
 *         &lt;element name="CRLFetch" type="{http://www.datapower.com/schemas/management}ModifyCRLFetch"/>
 *         &lt;element name="CryptoCertificate" type="{http://www.datapower.com/schemas/management}ModifyCryptoCertificate"/>
 *         &lt;element name="CryptoFWCred" type="{http://www.datapower.com/schemas/management}ModifyCryptoFWCred"/>
 *         &lt;element name="CryptoIdentCred" type="{http://www.datapower.com/schemas/management}ModifyCryptoIdentCred"/>
 *         &lt;element name="CryptoKerberosKDC" type="{http://www.datapower.com/schemas/management}ModifyCryptoKerberosKDC"/>
 *         &lt;element name="CryptoKerberosKeytab" type="{http://www.datapower.com/schemas/management}ModifyCryptoKerberosKeytab"/>
 *         &lt;element name="CryptoKey" type="{http://www.datapower.com/schemas/management}ModifyCryptoKey"/>
 *         &lt;element name="CryptoProfile" type="{http://www.datapower.com/schemas/management}ModifyCryptoProfile"/>
 *         &lt;element name="CryptoSSKey" type="{http://www.datapower.com/schemas/management}ModifyCryptoSSKey"/>
 *         &lt;element name="CryptoValCred" type="{http://www.datapower.com/schemas/management}ModifyCryptoValCred"/>
 *         &lt;element name="SSHClientProfile" type="{http://www.datapower.com/schemas/management}ModifySSHClientProfile"/>
 *         &lt;element name="SSLProxyProfile" type="{http://www.datapower.com/schemas/management}ModifySSLProxyProfile"/>
 *         &lt;element name="ErrorReportSettings" type="{http://www.datapower.com/schemas/management}ModifyErrorReportSettings"/>
 *         &lt;element name="SystemSettings" type="{http://www.datapower.com/schemas/management}ModifySystemSettings"/>
 *         &lt;element name="TimeSettings" type="{http://www.datapower.com/schemas/management}ModifyTimeSettings"/>
 *         &lt;element name="SchemaExceptionMap" type="{http://www.datapower.com/schemas/management}ModifySchemaExceptionMap"/>
 *         &lt;element name="DocumentCryptoMap" type="{http://www.datapower.com/schemas/management}ModifyDocumentCryptoMap"/>
 *         &lt;element name="XPathRoutingMap" type="{http://www.datapower.com/schemas/management}ModifyXPathRoutingMap"/>
 *         &lt;element name="LogTarget" type="{http://www.datapower.com/schemas/management}ModifyLogTarget"/>
 *         &lt;element name="FormsLoginPolicy" type="{http://www.datapower.com/schemas/management}ModifyFormsLoginPolicy"/>
 *         &lt;element name="FTPQuoteCommands" type="{http://www.datapower.com/schemas/management}ModifyFTPQuoteCommands"/>
 *         &lt;element name="MultiProtocolGateway" type="{http://www.datapower.com/schemas/management}ModifyMultiProtocolGateway"/>
 *         &lt;element name="WSGateway" type="{http://www.datapower.com/schemas/management}ModifyWSGateway"/>
 *         &lt;element name="HTTPInputConversionMap" type="{http://www.datapower.com/schemas/management}ModifyHTTPInputConversionMap"/>
 *         &lt;element name="HTTPUserAgent" type="{http://www.datapower.com/schemas/management}ModifyHTTPUserAgent"/>
 *         &lt;element name="ImportPackage" type="{http://www.datapower.com/schemas/management}ModifyImportPackage"/>
 *         &lt;element name="IMSConnect" type="{http://www.datapower.com/schemas/management}ModifyIMSConnect"/>
 *         &lt;element name="IncludeConfig" type="{http://www.datapower.com/schemas/management}ModifyIncludeConfig"/>
 *         &lt;element name="EthernetInterface" type="{http://www.datapower.com/schemas/management}ModifyEthernetInterface"/>
 *         &lt;element name="VLANInterface" type="{http://www.datapower.com/schemas/management}ModifyVLANInterface"/>
 *         &lt;element name="IPMILanChannel" type="{http://www.datapower.com/schemas/management}ModifyIPMILanChannel"/>
 *         &lt;element name="IPMIUser" type="{http://www.datapower.com/schemas/management}ModifyIPMIUser"/>
 *         &lt;element name="IScsiChapConfig" type="{http://www.datapower.com/schemas/management}ModifyIScsiChapConfig"/>
 *         &lt;element name="IScsiHBAConfig" type="{http://www.datapower.com/schemas/management}ModifyIScsiHBAConfig"/>
 *         &lt;element name="IScsiInitiatorConfig" type="{http://www.datapower.com/schemas/management}ModifyIScsiInitiatorConfig"/>
 *         &lt;element name="IScsiTargetConfig" type="{http://www.datapower.com/schemas/management}ModifyIScsiTargetConfig"/>
 *         &lt;element name="IScsiVolumeConfig" type="{http://www.datapower.com/schemas/management}ModifyIScsiVolumeConfig"/>
 *         &lt;element name="TibcoEMSServer" type="{http://www.datapower.com/schemas/management}ModifyTibcoEMSServer"/>
 *         &lt;element name="WebSphereJMSServer" type="{http://www.datapower.com/schemas/management}ModifyWebSphereJMSServer"/>
 *         &lt;element name="LoadBalancerGroup" type="{http://www.datapower.com/schemas/management}ModifyLoadBalancerGroup"/>
 *         &lt;element name="LogLabel" type="{http://www.datapower.com/schemas/management}ModifyLogLabel"/>
 *         &lt;element name="Matching" type="{http://www.datapower.com/schemas/management}ModifyMatching"/>
 *         &lt;element name="FilterAction" type="{http://www.datapower.com/schemas/management}ModifyFilterAction"/>
 *         &lt;element name="MessageMatching" type="{http://www.datapower.com/schemas/management}ModifyMessageMatching"/>
 *         &lt;element name="CountMonitor" type="{http://www.datapower.com/schemas/management}ModifyCountMonitor"/>
 *         &lt;element name="DurationMonitor" type="{http://www.datapower.com/schemas/management}ModifyDurationMonitor"/>
 *         &lt;element name="MessageType" type="{http://www.datapower.com/schemas/management}ModifyMessageType"/>
 *         &lt;element name="MQGW" type="{http://www.datapower.com/schemas/management}ModifyMQGW"/>
 *         &lt;element name="MQhost" type="{http://www.datapower.com/schemas/management}ModifyMQhost"/>
 *         &lt;element name="MQproxy" type="{http://www.datapower.com/schemas/management}ModifyMQproxy"/>
 *         &lt;element name="MQQM" type="{http://www.datapower.com/schemas/management}ModifyMQQM"/>
 *         &lt;element name="MQQMGroup" type="{http://www.datapower.com/schemas/management}ModifyMQQMGroup"/>
 *         &lt;element name="MTOMPolicy" type="{http://www.datapower.com/schemas/management}ModifyMTOMPolicy"/>
 *         &lt;element name="NameValueProfile" type="{http://www.datapower.com/schemas/management}ModifyNameValueProfile"/>
 *         &lt;element name="DNSNameService" type="{http://www.datapower.com/schemas/management}ModifyDNSNameService"/>
 *         &lt;element name="HostAlias" type="{http://www.datapower.com/schemas/management}ModifyHostAlias"/>
 *         &lt;element name="NetworkSettings" type="{http://www.datapower.com/schemas/management}ModifyNetworkSettings"/>
 *         &lt;element name="NTPService" type="{http://www.datapower.com/schemas/management}ModifyNTPService"/>
 *         &lt;element name="NFSClientSettings" type="{http://www.datapower.com/schemas/management}ModifyNFSClientSettings"/>
 *         &lt;element name="NFSDynamicMounts" type="{http://www.datapower.com/schemas/management}ModifyNFSDynamicMounts"/>
 *         &lt;element name="NFSStaticMount" type="{http://www.datapower.com/schemas/management}ModifyNFSStaticMount"/>
 *         &lt;element name="PeerGroup" type="{http://www.datapower.com/schemas/management}ModifyPeerGroup"/>
 *         &lt;element name="PolicyAttachments" type="{http://www.datapower.com/schemas/management}ModifyPolicyAttachments"/>
 *         &lt;element name="PolicyParameters" type="{http://www.datapower.com/schemas/management}ModifyPolicyParameters"/>
 *         &lt;element name="RaidVolume" type="{http://www.datapower.com/schemas/management}ModifyRaidVolume"/>
 *         &lt;element name="SQLRuntimeSettings" type="{http://www.datapower.com/schemas/management}ModifySQLRuntimeSettings"/>
 *         &lt;element name="SecureCloudConnector" type="{http://www.datapower.com/schemas/management}ModifySecureCloudConnector"/>
 *         &lt;element name="MgmtInterface" type="{http://www.datapower.com/schemas/management}ModifyMgmtInterface"/>
 *         &lt;element name="SSHService" type="{http://www.datapower.com/schemas/management}ModifySSHService"/>
 *         &lt;element name="TelnetService" type="{http://www.datapower.com/schemas/management}ModifyTelnetService"/>
 *         &lt;element name="WebGUI" type="{http://www.datapower.com/schemas/management}ModifyWebGUI"/>
 *         &lt;element name="XMLFirewallService" type="{http://www.datapower.com/schemas/management}ModifyXMLFirewallService"/>
 *         &lt;element name="XSLProxyService" type="{http://www.datapower.com/schemas/management}ModifyXSLProxyService"/>
 *         &lt;element name="HTTPService" type="{http://www.datapower.com/schemas/management}ModifyHTTPService"/>
 *         &lt;element name="SSLProxyService" type="{http://www.datapower.com/schemas/management}ModifySSLProxyService"/>
 *         &lt;element name="TCPProxyService" type="{http://www.datapower.com/schemas/management}ModifyTCPProxyService"/>
 *         &lt;element name="XSLCoprocService" type="{http://www.datapower.com/schemas/management}ModifyXSLCoprocService"/>
 *         &lt;element name="ShellAlias" type="{http://www.datapower.com/schemas/management}ModifyShellAlias"/>
 *         &lt;element name="SimpleCountMonitor" type="{http://www.datapower.com/schemas/management}ModifySimpleCountMonitor"/>
 *         &lt;element name="SLMAction" type="{http://www.datapower.com/schemas/management}ModifySLMAction"/>
 *         &lt;element name="SLMCredClass" type="{http://www.datapower.com/schemas/management}ModifySLMCredClass"/>
 *         &lt;element name="SLMPolicy" type="{http://www.datapower.com/schemas/management}ModifySLMPolicy"/>
 *         &lt;element name="SLMRsrcClass" type="{http://www.datapower.com/schemas/management}ModifySLMRsrcClass"/>
 *         &lt;element name="SLMSchedule" type="{http://www.datapower.com/schemas/management}ModifySLMSchedule"/>
 *         &lt;element name="SNMPSettings" type="{http://www.datapower.com/schemas/management}ModifySNMPSettings"/>
 *         &lt;element name="FTPFilePollerSourceProtocolHandler" type="{http://www.datapower.com/schemas/management}ModifyFTPFilePollerSourceProtocolHandler"/>
 *         &lt;element name="NFSFilePollerSourceProtocolHandler" type="{http://www.datapower.com/schemas/management}ModifyNFSFilePollerSourceProtocolHandler"/>
 *         &lt;element name="SFTPFilePollerSourceProtocolHandler" type="{http://www.datapower.com/schemas/management}ModifySFTPFilePollerSourceProtocolHandler"/>
 *         &lt;element name="FTPServerSourceProtocolHandler" type="{http://www.datapower.com/schemas/management}ModifyFTPServerSourceProtocolHandler"/>
 *         &lt;element name="HTTPSourceProtocolHandler" type="{http://www.datapower.com/schemas/management}ModifyHTTPSourceProtocolHandler"/>
 *         &lt;element name="HTTPSSourceProtocolHandler" type="{http://www.datapower.com/schemas/management}ModifyHTTPSSourceProtocolHandler"/>
 *         &lt;element name="IMSConnectSourceProtocolHandler" type="{http://www.datapower.com/schemas/management}ModifyIMSConnectSourceProtocolHandler"/>
 *         &lt;element name="TibcoEMSSourceProtocolHandler" type="{http://www.datapower.com/schemas/management}ModifyTibcoEMSSourceProtocolHandler"/>
 *         &lt;element name="WebSphereJMSSourceProtocolHandler" type="{http://www.datapower.com/schemas/management}ModifyWebSphereJMSSourceProtocolHandler"/>
 *         &lt;element name="MQFTESourceProtocolHandler" type="{http://www.datapower.com/schemas/management}ModifyMQFTESourceProtocolHandler"/>
 *         &lt;element name="MQSourceProtocolHandler" type="{http://www.datapower.com/schemas/management}ModifyMQSourceProtocolHandler"/>
 *         &lt;element name="SSHServerSourceProtocolHandler" type="{http://www.datapower.com/schemas/management}ModifySSHServerSourceProtocolHandler"/>
 *         &lt;element name="StatelessTCPSourceProtocolHandler" type="{http://www.datapower.com/schemas/management}ModifyStatelessTCPSourceProtocolHandler"/>
 *         &lt;element name="XTCProtocolHandler" type="{http://www.datapower.com/schemas/management}ModifyXTCProtocolHandler"/>
 *         &lt;element name="SQLDataSource" type="{http://www.datapower.com/schemas/management}ModifySQLDataSource"/>
 *         &lt;element name="Statistics" type="{http://www.datapower.com/schemas/management}ModifyStatistics"/>
 *         &lt;element name="StylePolicy" type="{http://www.datapower.com/schemas/management}ModifyStylePolicy"/>
 *         &lt;element name="StylePolicyAction" type="{http://www.datapower.com/schemas/management}ModifyStylePolicyAction"/>
 *         &lt;element name="StylePolicyRule" type="{http://www.datapower.com/schemas/management}ModifyStylePolicyRule"/>
 *         &lt;element name="WSStylePolicyRule" type="{http://www.datapower.com/schemas/management}ModifyWSStylePolicyRule"/>
 *         &lt;element name="Throttler" type="{http://www.datapower.com/schemas/management}ModifyThrottler"/>
 *         &lt;element name="UDDIRegistry" type="{http://www.datapower.com/schemas/management}ModifyUDDIRegistry"/>
 *         &lt;element name="URLMap" type="{http://www.datapower.com/schemas/management}ModifyURLMap"/>
 *         &lt;element name="URLRefreshPolicy" type="{http://www.datapower.com/schemas/management}ModifyURLRefreshPolicy"/>
 *         &lt;element name="URLRewritePolicy" type="{http://www.datapower.com/schemas/management}ModifyURLRewritePolicy"/>
 *         &lt;element name="User" type="{http://www.datapower.com/schemas/management}ModifyUser"/>
 *         &lt;element name="UserGroup" type="{http://www.datapower.com/schemas/management}ModifyUserGroup"/>
 *         &lt;element name="WCCService" type="{http://www.datapower.com/schemas/management}ModifyWCCService"/>
 *         &lt;element name="WebAppErrorHandlingPolicy" type="{http://www.datapower.com/schemas/management}ModifyWebAppErrorHandlingPolicy"/>
 *         &lt;element name="WebAppFW" type="{http://www.datapower.com/schemas/management}ModifyWebAppFW"/>
 *         &lt;element name="WebAppRequest" type="{http://www.datapower.com/schemas/management}ModifyWebAppRequest"/>
 *         &lt;element name="WebAppResponse" type="{http://www.datapower.com/schemas/management}ModifyWebAppResponse"/>
 *         &lt;element name="WebAppSessionPolicy" type="{http://www.datapower.com/schemas/management}ModifyWebAppSessionPolicy"/>
 *         &lt;element name="WebServiceMonitor" type="{http://www.datapower.com/schemas/management}ModifyWebServiceMonitor"/>
 *         &lt;element name="WebServicesAgent" type="{http://www.datapower.com/schemas/management}ModifyWebServicesAgent"/>
 *         &lt;element name="UDDISubscription" type="{http://www.datapower.com/schemas/management}ModifyUDDISubscription"/>
 *         &lt;element name="WSRRSavedSearchSubscription" type="{http://www.datapower.com/schemas/management}ModifyWSRRSavedSearchSubscription"/>
 *         &lt;element name="WSRRSubscription" type="{http://www.datapower.com/schemas/management}ModifyWSRRSubscription"/>
 *         &lt;element name="WSEndpointRewritePolicy" type="{http://www.datapower.com/schemas/management}ModifyWSEndpointRewritePolicy"/>
 *         &lt;element name="WSRRServer" type="{http://www.datapower.com/schemas/management}ModifyWSRRServer"/>
 *         &lt;element name="WSStylePolicy" type="{http://www.datapower.com/schemas/management}ModifyWSStylePolicy"/>
 *         &lt;element name="XMLManager" type="{http://www.datapower.com/schemas/management}ModifyXMLManager"/>
 *         &lt;element name="xmltrace" type="{http://www.datapower.com/schemas/management}Modifyxmltrace"/>
 *         &lt;element name="ZHybridTargetControlService" type="{http://www.datapower.com/schemas/management}ModifyZHybridTargetControlService"/>
 *         &lt;element name="ZosNSSClient" type="{http://www.datapower.com/schemas/management}ModifyZosNSSClient"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AnyModifyElement", propOrder = {
    "aaaPolicyOrDomainOrLDAPSearchParameters"
})
public class AnyModifyElement {

    @XmlElements({
        @XmlElement(name = "ConfigDeploymentPolicy", type = ModifyConfigDeploymentPolicy.class),
        @XmlElement(name = "CompileOptionsPolicy", type = ModifyCompileOptionsPolicy.class),
        @XmlElement(name = "FTPServerSourceProtocolHandler", type = ModifyFTPServerSourceProtocolHandler.class),
        @XmlElement(name = "CryptoFWCred", type = ModifyCryptoFWCred.class),
        @XmlElement(name = "IScsiInitiatorConfig", type = ModifyIScsiInitiatorConfig.class),
        @XmlElement(name = "URLRefreshPolicy", type = ModifyURLRefreshPolicy.class),
        @XmlElement(name = "WSGateway", type = ModifyWSGateway.class),
        @XmlElement(name = "CountMonitor", type = ModifyCountMonitor.class),
        @XmlElement(name = "XTCProtocolHandler", type = ModifyXTCProtocolHandler.class),
        @XmlElement(name = "Domain", type = ModifyDomain.class),
        @XmlElement(name = "IMSConnect", type = ModifyIMSConnect.class),
        @XmlElement(name = "TibcoEMSSourceProtocolHandler", type = ModifyTibcoEMSSourceProtocolHandler.class),
        @XmlElement(name = "WSStylePolicy", type = ModifyWSStylePolicy.class),
        @XmlElement(name = "AAAPolicy", type = ModifyAAAPolicy.class),
        @XmlElement(name = "NTPService", type = ModifyNTPService.class),
        @XmlElement(name = "EthernetInterface", type = ModifyEthernetInterface.class),
        @XmlElement(name = "MessageType", type = ModifyMessageType.class),
        @XmlElement(name = "NetworkSettings", type = ModifyNetworkSettings.class),
        @XmlElement(name = "StylePolicy", type = ModifyStylePolicy.class),
        @XmlElement(name = "NFSClientSettings", type = ModifyNFSClientSettings.class),
        @XmlElement(name = "StylePolicyRule", type = ModifyStylePolicyRule.class),
        @XmlElement(name = "TCPProxyService", type = ModifyTCPProxyService.class),
        @XmlElement(name = "SFTPFilePollerSourceProtocolHandler", type = ModifySFTPFilePollerSourceProtocolHandler.class),
        @XmlElement(name = "CompactFlash", type = ModifyCompactFlash.class),
        @XmlElement(name = "IScsiVolumeConfig", type = ModifyIScsiVolumeConfig.class),
        @XmlElement(name = "CryptoIdentCred", type = ModifyCryptoIdentCred.class),
        @XmlElement(name = "AccessControlList", type = ModifyAccessControlList.class),
        @XmlElement(name = "UDDIRegistry", type = ModifyUDDIRegistry.class),
        @XmlElement(name = "CryptoValCred", type = ModifyCryptoValCred.class),
        @XmlElement(name = "XACMLPDP", type = ModifyXACMLPDP.class),
        @XmlElement(name = "WSRRSubscription", type = ModifyWSRRSubscription.class),
        @XmlElement(name = "XMLManager", type = ModifyXMLManager.class),
        @XmlElement(name = "SecureCloudConnector", type = ModifySecureCloudConnector.class),
        @XmlElement(name = "WebSphereJMSServer", type = ModifyWebSphereJMSServer.class),
        @XmlElement(name = "UserGroup", type = ModifyUserGroup.class),
        @XmlElement(name = "LDAPSearchParameters", type = ModifyLDAPSearchParameters.class),
        @XmlElement(name = "WebAppResponse", type = ModifyWebAppResponse.class),
        @XmlElement(name = "ProcessingMetadata", type = ModifyProcessingMetadata.class),
        @XmlElement(name = "PeerGroup", type = ModifyPeerGroup.class),
        @XmlElement(name = "WebAppRequest", type = ModifyWebAppRequest.class),
        @XmlElement(name = "MQSourceProtocolHandler", type = ModifyMQSourceProtocolHandler.class),
        @XmlElement(name = "IMSConnectSourceProtocolHandler", type = ModifyIMSConnectSourceProtocolHandler.class),
        @XmlElement(name = "WebServiceMonitor", type = ModifyWebServiceMonitor.class),
        @XmlElement(name = "ConformancePolicy", type = ModifyConformancePolicy.class),
        @XmlElement(name = "NFSFilePollerSourceProtocolHandler", type = ModifyNFSFilePollerSourceProtocolHandler.class),
        @XmlElement(name = "ZHybridTargetControlService", type = ModifyZHybridTargetControlService.class),
        @XmlElement(name = "LogTarget", type = ModifyLogTarget.class),
        @XmlElement(name = "DNSNameService", type = ModifyDNSNameService.class),
        @XmlElement(name = "Matching", type = ModifyMatching.class),
        @XmlElement(name = "MQproxy", type = ModifyMQproxy.class),
        @XmlElement(name = "ShellAlias", type = ModifyShellAlias.class),
        @XmlElement(name = "RBMSettings", type = ModifyRBMSettings.class),
        @XmlElement(name = "ImportPackage", type = ModifyImportPackage.class),
        @XmlElement(name = "DocumentCryptoMap", type = ModifyDocumentCryptoMap.class),
        @XmlElement(name = "Throttler", type = ModifyThrottler.class),
        @XmlElement(name = "SQLDataSource", type = ModifySQLDataSource.class),
        @XmlElement(name = "SLMAction", type = ModifySLMAction.class),
        @XmlElement(name = "FTPQuoteCommands", type = ModifyFTPQuoteCommands.class),
        @XmlElement(name = "TibcoEMSServer", type = ModifyTibcoEMSServer.class),
        @XmlElement(name = "LogLabel", type = ModifyLogLabel.class),
        @XmlElement(name = "User", type = ModifyUser.class),
        @XmlElement(name = "SQLRuntimeSettings", type = ModifySQLRuntimeSettings.class),
        @XmlElement(name = "WebAppErrorHandlingPolicy", type = ModifyWebAppErrorHandlingPolicy.class),
        @XmlElement(name = "SchemaExceptionMap", type = ModifySchemaExceptionMap.class),
        @XmlElement(name = "DurationMonitor", type = ModifyDurationMonitor.class),
        @XmlElement(name = "SystemSettings", type = ModifySystemSettings.class),
        @XmlElement(name = "PolicyAttachments", type = ModifyPolicyAttachments.class),
        @XmlElement(name = "MultiProtocolGateway", type = ModifyMultiProtocolGateway.class),
        @XmlElement(name = "CryptoKey", type = ModifyCryptoKey.class),
        @XmlElement(name = "UDDISubscription", type = ModifyUDDISubscription.class),
        @XmlElement(name = "NameValueProfile", type = ModifyNameValueProfile.class),
        @XmlElement(name = "WebServicesAgent", type = ModifyWebServicesAgent.class),
        @XmlElement(name = "NFSDynamicMounts", type = ModifyNFSDynamicMounts.class),
        @XmlElement(name = "FilterAction", type = ModifyFilterAction.class),
        @XmlElement(name = "TAM", type = ModifyTAM.class),
        @XmlElement(name = "CryptoCertificate", type = ModifyCryptoCertificate.class),
        @XmlElement(name = "HTTPInputConversionMap", type = ModifyHTTPInputConversionMap.class),
        @XmlElement(name = "CryptoKerberosKeytab", type = ModifyCryptoKerberosKeytab.class),
        @XmlElement(name = "WSStylePolicyRule", type = ModifyWSStylePolicyRule.class),
        @XmlElement(name = "FormsLoginPolicy", type = ModifyFormsLoginPolicy.class),
        @XmlElement(name = "SAMLAttributes", type = ModifySAMLAttributes.class),
        @XmlElement(name = "VLANInterface", type = ModifyVLANInterface.class),
        @XmlElement(name = "IScsiChapConfig", type = ModifyIScsiChapConfig.class),
        @XmlElement(name = "WebGUI", type = ModifyWebGUI.class),
        @XmlElement(name = "ErrorReportSettings", type = ModifyErrorReportSettings.class),
        @XmlElement(name = "XSLCoprocService", type = ModifyXSLCoprocService.class),
        @XmlElement(name = "MgmtInterface", type = ModifyMgmtInterface.class),
        @XmlElement(name = "SSHServerSourceProtocolHandler", type = ModifySSHServerSourceProtocolHandler.class),
        @XmlElement(name = "CryptoSSKey", type = ModifyCryptoSSKey.class),
        @XmlElement(name = "FTPFilePollerSourceProtocolHandler", type = ModifyFTPFilePollerSourceProtocolHandler.class),
        @XmlElement(name = "PolicyParameters", type = ModifyPolicyParameters.class),
        @XmlElement(name = "SimpleCountMonitor", type = ModifySimpleCountMonitor.class),
        @XmlElement(name = "LoadBalancerGroup", type = ModifyLoadBalancerGroup.class),
        @XmlElement(name = "RaidVolume", type = ModifyRaidVolume.class),
        @XmlElement(name = "SSLProxyProfile", type = ModifySSLProxyProfile.class),
        @XmlElement(name = "MQFTESourceProtocolHandler", type = ModifyMQFTESourceProtocolHandler.class),
        @XmlElement(name = "IncludeConfig", type = ModifyIncludeConfig.class),
        @XmlElement(name = "WSEndpointRewritePolicy", type = ModifyWSEndpointRewritePolicy.class),
        @XmlElement(name = "HTTPService", type = ModifyHTTPService.class),
        @XmlElement(name = "AppSecurityPolicy", type = ModifyAppSecurityPolicy.class),
        @XmlElement(name = "StylePolicyAction", type = ModifyStylePolicyAction.class),
        @XmlElement(name = "WebAppSessionPolicy", type = ModifyWebAppSessionPolicy.class),
        @XmlElement(name = "WebAppFW", type = ModifyWebAppFW.class),
        @XmlElement(name = "IPMILanChannel", type = ModifyIPMILanChannel.class),
        @XmlElement(name = "XPathRoutingMap", type = ModifyXPathRoutingMap.class),
        @XmlElement(name = "SSHClientProfile", type = ModifySSHClientProfile.class),
        @XmlElement(name = "TFIMEndpoint", type = ModifyTFIMEndpoint.class),
        @XmlElement(name = "TimeSettings", type = ModifyTimeSettings.class),
        @XmlElement(name = "WSRRSavedSearchSubscription", type = ModifyWSRRSavedSearchSubscription.class),
        @XmlElement(name = "SLMCredClass", type = ModifySLMCredClass.class),
        @XmlElement(name = "SOAPHeaderDisposition", type = ModifySOAPHeaderDisposition.class),
        @XmlElement(name = "SLMSchedule", type = ModifySLMSchedule.class),
        @XmlElement(name = "SSLProxyService", type = ModifySSLProxyService.class),
        @XmlElement(name = "MTOMPolicy", type = ModifyMTOMPolicy.class),
        @XmlElement(name = "xmltrace", type = Modifyxmltrace.class),
        @XmlElement(name = "SSHService", type = ModifySSHService.class),
        @XmlElement(name = "CertMonitor", type = ModifyCertMonitor.class),
        @XmlElement(name = "MQQM", type = ModifyMQQM.class),
        @XmlElement(name = "URLRewritePolicy", type = ModifyURLRewritePolicy.class),
        @XmlElement(name = "IScsiHBAConfig", type = ModifyIScsiHBAConfig.class),
        @XmlElement(name = "MQhost", type = ModifyMQhost.class),
        @XmlElement(name = "WebSphereJMSSourceProtocolHandler", type = ModifyWebSphereJMSSourceProtocolHandler.class),
        @XmlElement(name = "XMLFirewallService", type = ModifyXMLFirewallService.class),
        @XmlElement(name = "Statistics", type = ModifyStatistics.class),
        @XmlElement(name = "CRLFetch", type = ModifyCRLFetch.class),
        @XmlElement(name = "TelnetService", type = ModifyTelnetService.class),
        @XmlElement(name = "SLMRsrcClass", type = ModifySLMRsrcClass.class),
        @XmlElement(name = "HTTPUserAgent", type = ModifyHTTPUserAgent.class),
        @XmlElement(name = "HTTPSourceProtocolHandler", type = ModifyHTTPSourceProtocolHandler.class),
        @XmlElement(name = "IPMIUser", type = ModifyIPMIUser.class),
        @XmlElement(name = "HTTPSSourceProtocolHandler", type = ModifyHTTPSSourceProtocolHandler.class),
        @XmlElement(name = "RADIUSSettings", type = ModifyRADIUSSettings.class),
        @XmlElement(name = "SLMPolicy", type = ModifySLMPolicy.class),
        @XmlElement(name = "CryptoKerberosKDC", type = ModifyCryptoKerberosKDC.class),
        @XmlElement(name = "MQGW", type = ModifyMQGW.class),
        @XmlElement(name = "IScsiTargetConfig", type = ModifyIScsiTargetConfig.class),
        @XmlElement(name = "HostAlias", type = ModifyHostAlias.class),
        @XmlElement(name = "CryptoProfile", type = ModifyCryptoProfile.class),
        @XmlElement(name = "NFSStaticMount", type = ModifyNFSStaticMount.class),
        @XmlElement(name = "XSLProxyService", type = ModifyXSLProxyService.class),
        @XmlElement(name = "URLMap", type = ModifyURLMap.class),
        @XmlElement(name = "StatelessTCPSourceProtocolHandler", type = ModifyStatelessTCPSourceProtocolHandler.class),
        @XmlElement(name = "SNMPSettings", type = ModifySNMPSettings.class),
        @XmlElement(name = "WSRRServer", type = ModifyWSRRServer.class),
        @XmlElement(name = "ZosNSSClient", type = ModifyZosNSSClient.class),
        @XmlElement(name = "MessageMatching", type = ModifyMessageMatching.class),
        @XmlElement(name = "MQQMGroup", type = ModifyMQQMGroup.class),
        @XmlElement(name = "WCCService", type = ModifyWCCService.class)
    })
    protected List<ModifyConfigBase> aaaPolicyOrDomainOrLDAPSearchParameters;

    /**
     * Gets the value of the aaaPolicyOrDomainOrLDAPSearchParameters property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the aaaPolicyOrDomainOrLDAPSearchParameters property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAAAPolicyOrDomainOrLDAPSearchParameters().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ModifyConfigDeploymentPolicy }
     * {@link ModifyCompileOptionsPolicy }
     * {@link ModifyFTPServerSourceProtocolHandler }
     * {@link ModifyCryptoFWCred }
     * {@link ModifyIScsiInitiatorConfig }
     * {@link ModifyURLRefreshPolicy }
     * {@link ModifyWSGateway }
     * {@link ModifyCountMonitor }
     * {@link ModifyXTCProtocolHandler }
     * {@link ModifyDomain }
     * {@link ModifyIMSConnect }
     * {@link ModifyTibcoEMSSourceProtocolHandler }
     * {@link ModifyWSStylePolicy }
     * {@link ModifyAAAPolicy }
     * {@link ModifyNTPService }
     * {@link ModifyEthernetInterface }
     * {@link ModifyMessageType }
     * {@link ModifyNetworkSettings }
     * {@link ModifyStylePolicy }
     * {@link ModifyNFSClientSettings }
     * {@link ModifyStylePolicyRule }
     * {@link ModifyTCPProxyService }
     * {@link ModifySFTPFilePollerSourceProtocolHandler }
     * {@link ModifyCompactFlash }
     * {@link ModifyIScsiVolumeConfig }
     * {@link ModifyCryptoIdentCred }
     * {@link ModifyAccessControlList }
     * {@link ModifyUDDIRegistry }
     * {@link ModifyCryptoValCred }
     * {@link ModifyXACMLPDP }
     * {@link ModifyWSRRSubscription }
     * {@link ModifyXMLManager }
     * {@link ModifySecureCloudConnector }
     * {@link ModifyWebSphereJMSServer }
     * {@link ModifyUserGroup }
     * {@link ModifyLDAPSearchParameters }
     * {@link ModifyWebAppResponse }
     * {@link ModifyProcessingMetadata }
     * {@link ModifyPeerGroup }
     * {@link ModifyWebAppRequest }
     * {@link ModifyMQSourceProtocolHandler }
     * {@link ModifyIMSConnectSourceProtocolHandler }
     * {@link ModifyWebServiceMonitor }
     * {@link ModifyConformancePolicy }
     * {@link ModifyNFSFilePollerSourceProtocolHandler }
     * {@link ModifyZHybridTargetControlService }
     * {@link ModifyLogTarget }
     * {@link ModifyDNSNameService }
     * {@link ModifyMatching }
     * {@link ModifyMQproxy }
     * {@link ModifyShellAlias }
     * {@link ModifyRBMSettings }
     * {@link ModifyImportPackage }
     * {@link ModifyDocumentCryptoMap }
     * {@link ModifyThrottler }
     * {@link ModifySQLDataSource }
     * {@link ModifySLMAction }
     * {@link ModifyFTPQuoteCommands }
     * {@link ModifyTibcoEMSServer }
     * {@link ModifyLogLabel }
     * {@link ModifyUser }
     * {@link ModifySQLRuntimeSettings }
     * {@link ModifyWebAppErrorHandlingPolicy }
     * {@link ModifySchemaExceptionMap }
     * {@link ModifyDurationMonitor }
     * {@link ModifySystemSettings }
     * {@link ModifyPolicyAttachments }
     * {@link ModifyMultiProtocolGateway }
     * {@link ModifyCryptoKey }
     * {@link ModifyUDDISubscription }
     * {@link ModifyNameValueProfile }
     * {@link ModifyWebServicesAgent }
     * {@link ModifyNFSDynamicMounts }
     * {@link ModifyFilterAction }
     * {@link ModifyTAM }
     * {@link ModifyCryptoCertificate }
     * {@link ModifyHTTPInputConversionMap }
     * {@link ModifyCryptoKerberosKeytab }
     * {@link ModifyWSStylePolicyRule }
     * {@link ModifyFormsLoginPolicy }
     * {@link ModifySAMLAttributes }
     * {@link ModifyVLANInterface }
     * {@link ModifyIScsiChapConfig }
     * {@link ModifyWebGUI }
     * {@link ModifyErrorReportSettings }
     * {@link ModifyXSLCoprocService }
     * {@link ModifyMgmtInterface }
     * {@link ModifySSHServerSourceProtocolHandler }
     * {@link ModifyCryptoSSKey }
     * {@link ModifyFTPFilePollerSourceProtocolHandler }
     * {@link ModifyPolicyParameters }
     * {@link ModifySimpleCountMonitor }
     * {@link ModifyLoadBalancerGroup }
     * {@link ModifyRaidVolume }
     * {@link ModifySSLProxyProfile }
     * {@link ModifyMQFTESourceProtocolHandler }
     * {@link ModifyIncludeConfig }
     * {@link ModifyWSEndpointRewritePolicy }
     * {@link ModifyHTTPService }
     * {@link ModifyAppSecurityPolicy }
     * {@link ModifyStylePolicyAction }
     * {@link ModifyWebAppSessionPolicy }
     * {@link ModifyWebAppFW }
     * {@link ModifyIPMILanChannel }
     * {@link ModifyXPathRoutingMap }
     * {@link ModifySSHClientProfile }
     * {@link ModifyTFIMEndpoint }
     * {@link ModifyTimeSettings }
     * {@link ModifyWSRRSavedSearchSubscription }
     * {@link ModifySLMCredClass }
     * {@link ModifySOAPHeaderDisposition }
     * {@link ModifySLMSchedule }
     * {@link ModifySSLProxyService }
     * {@link ModifyMTOMPolicy }
     * {@link Modifyxmltrace }
     * {@link ModifySSHService }
     * {@link ModifyCertMonitor }
     * {@link ModifyMQQM }
     * {@link ModifyURLRewritePolicy }
     * {@link ModifyIScsiHBAConfig }
     * {@link ModifyMQhost }
     * {@link ModifyWebSphereJMSSourceProtocolHandler }
     * {@link ModifyXMLFirewallService }
     * {@link ModifyStatistics }
     * {@link ModifyCRLFetch }
     * {@link ModifyTelnetService }
     * {@link ModifySLMRsrcClass }
     * {@link ModifyHTTPUserAgent }
     * {@link ModifyHTTPSourceProtocolHandler }
     * {@link ModifyIPMIUser }
     * {@link ModifyHTTPSSourceProtocolHandler }
     * {@link ModifyRADIUSSettings }
     * {@link ModifySLMPolicy }
     * {@link ModifyCryptoKerberosKDC }
     * {@link ModifyMQGW }
     * {@link ModifyIScsiTargetConfig }
     * {@link ModifyHostAlias }
     * {@link ModifyCryptoProfile }
     * {@link ModifyNFSStaticMount }
     * {@link ModifyXSLProxyService }
     * {@link ModifyURLMap }
     * {@link ModifyStatelessTCPSourceProtocolHandler }
     * {@link ModifySNMPSettings }
     * {@link ModifyWSRRServer }
     * {@link ModifyZosNSSClient }
     * {@link ModifyMessageMatching }
     * {@link ModifyMQQMGroup }
     * {@link ModifyWCCService }
     * 
     * 
     */
    public List<ModifyConfigBase> getAAAPolicyOrDomainOrLDAPSearchParameters() {
        if (aaaPolicyOrDomainOrLDAPSearchParameters == null) {
            aaaPolicyOrDomainOrLDAPSearchParameters = new ArrayList<ModifyConfigBase>();
        }
        return this.aaaPolicyOrDomainOrLDAPSearchParameters;
    }

}
