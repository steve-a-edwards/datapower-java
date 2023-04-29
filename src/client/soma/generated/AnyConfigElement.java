
package client.soma.generated;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AnyConfigElement complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AnyConfigElement">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice maxOccurs="unbounded">
 *         &lt;element name="AAAPolicy" type="{http://www.datapower.com/schemas/management}ConfigAAAPolicy"/>
 *         &lt;element name="Domain" type="{http://www.datapower.com/schemas/management}ConfigDomain"/>
 *         &lt;element name="LDAPSearchParameters" type="{http://www.datapower.com/schemas/management}ConfigLDAPSearchParameters"/>
 *         &lt;element name="ProcessingMetadata" type="{http://www.datapower.com/schemas/management}ConfigProcessingMetadata"/>
 *         &lt;element name="RADIUSSettings" type="{http://www.datapower.com/schemas/management}ConfigRADIUSSettings"/>
 *         &lt;element name="RBMSettings" type="{http://www.datapower.com/schemas/management}ConfigRBMSettings"/>
 *         &lt;element name="SAMLAttributes" type="{http://www.datapower.com/schemas/management}ConfigSAMLAttributes"/>
 *         &lt;element name="SOAPHeaderDisposition" type="{http://www.datapower.com/schemas/management}ConfigSOAPHeaderDisposition"/>
 *         &lt;element name="TAM" type="{http://www.datapower.com/schemas/management}ConfigTAM"/>
 *         &lt;element name="TFIMEndpoint" type="{http://www.datapower.com/schemas/management}ConfigTFIMEndpoint"/>
 *         &lt;element name="XACMLPDP" type="{http://www.datapower.com/schemas/management}ConfigXACMLPDP"/>
 *         &lt;element name="AccessControlList" type="{http://www.datapower.com/schemas/management}ConfigAccessControlList"/>
 *         &lt;element name="AppSecurityPolicy" type="{http://www.datapower.com/schemas/management}ConfigAppSecurityPolicy"/>
 *         &lt;element name="CompactFlash" type="{http://www.datapower.com/schemas/management}ConfigCompactFlash"/>
 *         &lt;element name="CompileOptionsPolicy" type="{http://www.datapower.com/schemas/management}ConfigCompileOptionsPolicy"/>
 *         &lt;element name="ConfigDeploymentPolicy" type="{http://www.datapower.com/schemas/management}ConfigConfigDeploymentPolicy"/>
 *         &lt;element name="ConformancePolicy" type="{http://www.datapower.com/schemas/management}ConfigConformancePolicy"/>
 *         &lt;element name="CertMonitor" type="{http://www.datapower.com/schemas/management}ConfigCertMonitor"/>
 *         &lt;element name="CRLFetch" type="{http://www.datapower.com/schemas/management}ConfigCRLFetch"/>
 *         &lt;element name="CryptoCertificate" type="{http://www.datapower.com/schemas/management}ConfigCryptoCertificate"/>
 *         &lt;element name="CryptoFWCred" type="{http://www.datapower.com/schemas/management}ConfigCryptoFWCred"/>
 *         &lt;element name="CryptoIdentCred" type="{http://www.datapower.com/schemas/management}ConfigCryptoIdentCred"/>
 *         &lt;element name="CryptoKerberosKDC" type="{http://www.datapower.com/schemas/management}ConfigCryptoKerberosKDC"/>
 *         &lt;element name="CryptoKerberosKeytab" type="{http://www.datapower.com/schemas/management}ConfigCryptoKerberosKeytab"/>
 *         &lt;element name="CryptoKey" type="{http://www.datapower.com/schemas/management}ConfigCryptoKey"/>
 *         &lt;element name="CryptoProfile" type="{http://www.datapower.com/schemas/management}ConfigCryptoProfile"/>
 *         &lt;element name="CryptoSSKey" type="{http://www.datapower.com/schemas/management}ConfigCryptoSSKey"/>
 *         &lt;element name="CryptoValCred" type="{http://www.datapower.com/schemas/management}ConfigCryptoValCred"/>
 *         &lt;element name="SSHClientProfile" type="{http://www.datapower.com/schemas/management}ConfigSSHClientProfile"/>
 *         &lt;element name="SSLProxyProfile" type="{http://www.datapower.com/schemas/management}ConfigSSLProxyProfile"/>
 *         &lt;element name="ErrorReportSettings" type="{http://www.datapower.com/schemas/management}ConfigErrorReportSettings"/>
 *         &lt;element name="SystemSettings" type="{http://www.datapower.com/schemas/management}ConfigSystemSettings"/>
 *         &lt;element name="TimeSettings" type="{http://www.datapower.com/schemas/management}ConfigTimeSettings"/>
 *         &lt;element name="SchemaExceptionMap" type="{http://www.datapower.com/schemas/management}ConfigSchemaExceptionMap"/>
 *         &lt;element name="DocumentCryptoMap" type="{http://www.datapower.com/schemas/management}ConfigDocumentCryptoMap"/>
 *         &lt;element name="XPathRoutingMap" type="{http://www.datapower.com/schemas/management}ConfigXPathRoutingMap"/>
 *         &lt;element name="LogTarget" type="{http://www.datapower.com/schemas/management}ConfigLogTarget"/>
 *         &lt;element name="FormsLoginPolicy" type="{http://www.datapower.com/schemas/management}ConfigFormsLoginPolicy"/>
 *         &lt;element name="FTPQuoteCommands" type="{http://www.datapower.com/schemas/management}ConfigFTPQuoteCommands"/>
 *         &lt;element name="MultiProtocolGateway" type="{http://www.datapower.com/schemas/management}ConfigMultiProtocolGateway"/>
 *         &lt;element name="WSGateway" type="{http://www.datapower.com/schemas/management}ConfigWSGateway"/>
 *         &lt;element name="HTTPInputConversionMap" type="{http://www.datapower.com/schemas/management}ConfigHTTPInputConversionMap"/>
 *         &lt;element name="HTTPUserAgent" type="{http://www.datapower.com/schemas/management}ConfigHTTPUserAgent"/>
 *         &lt;element name="ImportPackage" type="{http://www.datapower.com/schemas/management}ConfigImportPackage"/>
 *         &lt;element name="IMSConnect" type="{http://www.datapower.com/schemas/management}ConfigIMSConnect"/>
 *         &lt;element name="IncludeConfig" type="{http://www.datapower.com/schemas/management}ConfigIncludeConfig"/>
 *         &lt;element name="EthernetInterface" type="{http://www.datapower.com/schemas/management}ConfigEthernetInterface"/>
 *         &lt;element name="VLANInterface" type="{http://www.datapower.com/schemas/management}ConfigVLANInterface"/>
 *         &lt;element name="IPMILanChannel" type="{http://www.datapower.com/schemas/management}ConfigIPMILanChannel"/>
 *         &lt;element name="IPMIUser" type="{http://www.datapower.com/schemas/management}ConfigIPMIUser"/>
 *         &lt;element name="IScsiChapConfig" type="{http://www.datapower.com/schemas/management}ConfigIScsiChapConfig"/>
 *         &lt;element name="IScsiHBAConfig" type="{http://www.datapower.com/schemas/management}ConfigIScsiHBAConfig"/>
 *         &lt;element name="IScsiInitiatorConfig" type="{http://www.datapower.com/schemas/management}ConfigIScsiInitiatorConfig"/>
 *         &lt;element name="IScsiTargetConfig" type="{http://www.datapower.com/schemas/management}ConfigIScsiTargetConfig"/>
 *         &lt;element name="IScsiVolumeConfig" type="{http://www.datapower.com/schemas/management}ConfigIScsiVolumeConfig"/>
 *         &lt;element name="TibcoEMSServer" type="{http://www.datapower.com/schemas/management}ConfigTibcoEMSServer"/>
 *         &lt;element name="WebSphereJMSServer" type="{http://www.datapower.com/schemas/management}ConfigWebSphereJMSServer"/>
 *         &lt;element name="LoadBalancerGroup" type="{http://www.datapower.com/schemas/management}ConfigLoadBalancerGroup"/>
 *         &lt;element name="LogLabel" type="{http://www.datapower.com/schemas/management}ConfigLogLabel"/>
 *         &lt;element name="Matching" type="{http://www.datapower.com/schemas/management}ConfigMatching"/>
 *         &lt;element name="FilterAction" type="{http://www.datapower.com/schemas/management}ConfigFilterAction"/>
 *         &lt;element name="MessageMatching" type="{http://www.datapower.com/schemas/management}ConfigMessageMatching"/>
 *         &lt;element name="CountMonitor" type="{http://www.datapower.com/schemas/management}ConfigCountMonitor"/>
 *         &lt;element name="DurationMonitor" type="{http://www.datapower.com/schemas/management}ConfigDurationMonitor"/>
 *         &lt;element name="MessageType" type="{http://www.datapower.com/schemas/management}ConfigMessageType"/>
 *         &lt;element name="MQGW" type="{http://www.datapower.com/schemas/management}ConfigMQGW"/>
 *         &lt;element name="MQhost" type="{http://www.datapower.com/schemas/management}ConfigMQhost"/>
 *         &lt;element name="MQproxy" type="{http://www.datapower.com/schemas/management}ConfigMQproxy"/>
 *         &lt;element name="MQQM" type="{http://www.datapower.com/schemas/management}ConfigMQQM"/>
 *         &lt;element name="MQQMGroup" type="{http://www.datapower.com/schemas/management}ConfigMQQMGroup"/>
 *         &lt;element name="MTOMPolicy" type="{http://www.datapower.com/schemas/management}ConfigMTOMPolicy"/>
 *         &lt;element name="NameValueProfile" type="{http://www.datapower.com/schemas/management}ConfigNameValueProfile"/>
 *         &lt;element name="DNSNameService" type="{http://www.datapower.com/schemas/management}ConfigDNSNameService"/>
 *         &lt;element name="HostAlias" type="{http://www.datapower.com/schemas/management}ConfigHostAlias"/>
 *         &lt;element name="NetworkSettings" type="{http://www.datapower.com/schemas/management}ConfigNetworkSettings"/>
 *         &lt;element name="NTPService" type="{http://www.datapower.com/schemas/management}ConfigNTPService"/>
 *         &lt;element name="NFSClientSettings" type="{http://www.datapower.com/schemas/management}ConfigNFSClientSettings"/>
 *         &lt;element name="NFSDynamicMounts" type="{http://www.datapower.com/schemas/management}ConfigNFSDynamicMounts"/>
 *         &lt;element name="NFSStaticMount" type="{http://www.datapower.com/schemas/management}ConfigNFSStaticMount"/>
 *         &lt;element name="PeerGroup" type="{http://www.datapower.com/schemas/management}ConfigPeerGroup"/>
 *         &lt;element name="PolicyAttachments" type="{http://www.datapower.com/schemas/management}ConfigPolicyAttachments"/>
 *         &lt;element name="PolicyParameters" type="{http://www.datapower.com/schemas/management}ConfigPolicyParameters"/>
 *         &lt;element name="RaidVolume" type="{http://www.datapower.com/schemas/management}ConfigRaidVolume"/>
 *         &lt;element name="SQLRuntimeSettings" type="{http://www.datapower.com/schemas/management}ConfigSQLRuntimeSettings"/>
 *         &lt;element name="SecureCloudConnector" type="{http://www.datapower.com/schemas/management}ConfigSecureCloudConnector"/>
 *         &lt;element name="MgmtInterface" type="{http://www.datapower.com/schemas/management}ConfigMgmtInterface"/>
 *         &lt;element name="SSHService" type="{http://www.datapower.com/schemas/management}ConfigSSHService"/>
 *         &lt;element name="TelnetService" type="{http://www.datapower.com/schemas/management}ConfigTelnetService"/>
 *         &lt;element name="WebGUI" type="{http://www.datapower.com/schemas/management}ConfigWebGUI"/>
 *         &lt;element name="XMLFirewallService" type="{http://www.datapower.com/schemas/management}ConfigXMLFirewallService"/>
 *         &lt;element name="XSLProxyService" type="{http://www.datapower.com/schemas/management}ConfigXSLProxyService"/>
 *         &lt;element name="HTTPService" type="{http://www.datapower.com/schemas/management}ConfigHTTPService"/>
 *         &lt;element name="SSLProxyService" type="{http://www.datapower.com/schemas/management}ConfigSSLProxyService"/>
 *         &lt;element name="TCPProxyService" type="{http://www.datapower.com/schemas/management}ConfigTCPProxyService"/>
 *         &lt;element name="XSLCoprocService" type="{http://www.datapower.com/schemas/management}ConfigXSLCoprocService"/>
 *         &lt;element name="ShellAlias" type="{http://www.datapower.com/schemas/management}ConfigShellAlias"/>
 *         &lt;element name="SimpleCountMonitor" type="{http://www.datapower.com/schemas/management}ConfigSimpleCountMonitor"/>
 *         &lt;element name="SLMAction" type="{http://www.datapower.com/schemas/management}ConfigSLMAction"/>
 *         &lt;element name="SLMCredClass" type="{http://www.datapower.com/schemas/management}ConfigSLMCredClass"/>
 *         &lt;element name="SLMPolicy" type="{http://www.datapower.com/schemas/management}ConfigSLMPolicy"/>
 *         &lt;element name="SLMRsrcClass" type="{http://www.datapower.com/schemas/management}ConfigSLMRsrcClass"/>
 *         &lt;element name="SLMSchedule" type="{http://www.datapower.com/schemas/management}ConfigSLMSchedule"/>
 *         &lt;element name="SNMPSettings" type="{http://www.datapower.com/schemas/management}ConfigSNMPSettings"/>
 *         &lt;element name="FTPFilePollerSourceProtocolHandler" type="{http://www.datapower.com/schemas/management}ConfigFTPFilePollerSourceProtocolHandler"/>
 *         &lt;element name="NFSFilePollerSourceProtocolHandler" type="{http://www.datapower.com/schemas/management}ConfigNFSFilePollerSourceProtocolHandler"/>
 *         &lt;element name="SFTPFilePollerSourceProtocolHandler" type="{http://www.datapower.com/schemas/management}ConfigSFTPFilePollerSourceProtocolHandler"/>
 *         &lt;element name="FTPServerSourceProtocolHandler" type="{http://www.datapower.com/schemas/management}ConfigFTPServerSourceProtocolHandler"/>
 *         &lt;element name="HTTPSourceProtocolHandler" type="{http://www.datapower.com/schemas/management}ConfigHTTPSourceProtocolHandler"/>
 *         &lt;element name="HTTPSSourceProtocolHandler" type="{http://www.datapower.com/schemas/management}ConfigHTTPSSourceProtocolHandler"/>
 *         &lt;element name="IMSConnectSourceProtocolHandler" type="{http://www.datapower.com/schemas/management}ConfigIMSConnectSourceProtocolHandler"/>
 *         &lt;element name="TibcoEMSSourceProtocolHandler" type="{http://www.datapower.com/schemas/management}ConfigTibcoEMSSourceProtocolHandler"/>
 *         &lt;element name="WebSphereJMSSourceProtocolHandler" type="{http://www.datapower.com/schemas/management}ConfigWebSphereJMSSourceProtocolHandler"/>
 *         &lt;element name="MQFTESourceProtocolHandler" type="{http://www.datapower.com/schemas/management}ConfigMQFTESourceProtocolHandler"/>
 *         &lt;element name="MQSourceProtocolHandler" type="{http://www.datapower.com/schemas/management}ConfigMQSourceProtocolHandler"/>
 *         &lt;element name="SSHServerSourceProtocolHandler" type="{http://www.datapower.com/schemas/management}ConfigSSHServerSourceProtocolHandler"/>
 *         &lt;element name="StatelessTCPSourceProtocolHandler" type="{http://www.datapower.com/schemas/management}ConfigStatelessTCPSourceProtocolHandler"/>
 *         &lt;element name="XTCProtocolHandler" type="{http://www.datapower.com/schemas/management}ConfigXTCProtocolHandler"/>
 *         &lt;element name="SQLDataSource" type="{http://www.datapower.com/schemas/management}ConfigSQLDataSource"/>
 *         &lt;element name="Statistics" type="{http://www.datapower.com/schemas/management}ConfigStatistics"/>
 *         &lt;element name="StylePolicy" type="{http://www.datapower.com/schemas/management}ConfigStylePolicy"/>
 *         &lt;element name="StylePolicyAction" type="{http://www.datapower.com/schemas/management}ConfigStylePolicyAction"/>
 *         &lt;element name="StylePolicyRule" type="{http://www.datapower.com/schemas/management}ConfigStylePolicyRule"/>
 *         &lt;element name="WSStylePolicyRule" type="{http://www.datapower.com/schemas/management}ConfigWSStylePolicyRule"/>
 *         &lt;element name="Throttler" type="{http://www.datapower.com/schemas/management}ConfigThrottler"/>
 *         &lt;element name="UDDIRegistry" type="{http://www.datapower.com/schemas/management}ConfigUDDIRegistry"/>
 *         &lt;element name="URLMap" type="{http://www.datapower.com/schemas/management}ConfigURLMap"/>
 *         &lt;element name="URLRefreshPolicy" type="{http://www.datapower.com/schemas/management}ConfigURLRefreshPolicy"/>
 *         &lt;element name="URLRewritePolicy" type="{http://www.datapower.com/schemas/management}ConfigURLRewritePolicy"/>
 *         &lt;element name="User" type="{http://www.datapower.com/schemas/management}ConfigUser"/>
 *         &lt;element name="UserGroup" type="{http://www.datapower.com/schemas/management}ConfigUserGroup"/>
 *         &lt;element name="WCCService" type="{http://www.datapower.com/schemas/management}ConfigWCCService"/>
 *         &lt;element name="WebAppErrorHandlingPolicy" type="{http://www.datapower.com/schemas/management}ConfigWebAppErrorHandlingPolicy"/>
 *         &lt;element name="WebAppFW" type="{http://www.datapower.com/schemas/management}ConfigWebAppFW"/>
 *         &lt;element name="WebAppRequest" type="{http://www.datapower.com/schemas/management}ConfigWebAppRequest"/>
 *         &lt;element name="WebAppResponse" type="{http://www.datapower.com/schemas/management}ConfigWebAppResponse"/>
 *         &lt;element name="WebAppSessionPolicy" type="{http://www.datapower.com/schemas/management}ConfigWebAppSessionPolicy"/>
 *         &lt;element name="WebServiceMonitor" type="{http://www.datapower.com/schemas/management}ConfigWebServiceMonitor"/>
 *         &lt;element name="WebServicesAgent" type="{http://www.datapower.com/schemas/management}ConfigWebServicesAgent"/>
 *         &lt;element name="UDDISubscription" type="{http://www.datapower.com/schemas/management}ConfigUDDISubscription"/>
 *         &lt;element name="WSRRSavedSearchSubscription" type="{http://www.datapower.com/schemas/management}ConfigWSRRSavedSearchSubscription"/>
 *         &lt;element name="WSRRSubscription" type="{http://www.datapower.com/schemas/management}ConfigWSRRSubscription"/>
 *         &lt;element name="WSEndpointRewritePolicy" type="{http://www.datapower.com/schemas/management}ConfigWSEndpointRewritePolicy"/>
 *         &lt;element name="WSRRServer" type="{http://www.datapower.com/schemas/management}ConfigWSRRServer"/>
 *         &lt;element name="WSStylePolicy" type="{http://www.datapower.com/schemas/management}ConfigWSStylePolicy"/>
 *         &lt;element name="XMLManager" type="{http://www.datapower.com/schemas/management}ConfigXMLManager"/>
 *         &lt;element name="xmltrace" type="{http://www.datapower.com/schemas/management}Configxmltrace"/>
 *         &lt;element name="ZHybridTargetControlService" type="{http://www.datapower.com/schemas/management}ConfigZHybridTargetControlService"/>
 *         &lt;element name="ZosNSSClient" type="{http://www.datapower.com/schemas/management}ConfigZosNSSClient"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AnyConfigElement", propOrder = {
    "aaaPolicyOrDomainOrLDAPSearchParameters"
})
public class AnyConfigElement {

    @XmlElements({
        @XmlElement(name = "AAAPolicy", type = ConfigAAAPolicy.class),
        @XmlElement(name = "SSHClientProfile", type = ConfigSSHClientProfile.class),
        @XmlElement(name = "SchemaExceptionMap", type = ConfigSchemaExceptionMap.class),
        @XmlElement(name = "MQproxy", type = ConfigMQproxy.class),
        @XmlElement(name = "PeerGroup", type = ConfigPeerGroup.class),
        @XmlElement(name = "CryptoIdentCred", type = ConfigCryptoIdentCred.class),
        @XmlElement(name = "IPMIUser", type = ConfigIPMIUser.class),
        @XmlElement(name = "CRLFetch", type = ConfigCRLFetch.class),
        @XmlElement(name = "CryptoFWCred", type = ConfigCryptoFWCred.class),
        @XmlElement(name = "Matching", type = ConfigMatching.class),
        @XmlElement(name = "XSLCoprocService", type = ConfigXSLCoprocService.class),
        @XmlElement(name = "ConfigDeploymentPolicy", type = ConfigConfigDeploymentPolicy.class),
        @XmlElement(name = "MTOMPolicy", type = ConfigMTOMPolicy.class),
        @XmlElement(name = "PolicyAttachments", type = ConfigPolicyAttachments.class),
        @XmlElement(name = "UDDISubscription", type = ConfigUDDISubscription.class),
        @XmlElement(name = "NFSFilePollerSourceProtocolHandler", type = ConfigNFSFilePollerSourceProtocolHandler.class),
        @XmlElement(name = "WebSphereJMSServer", type = ConfigWebSphereJMSServer.class),
        @XmlElement(name = "MQFTESourceProtocolHandler", type = ConfigMQFTESourceProtocolHandler.class),
        @XmlElement(name = "MultiProtocolGateway", type = ConfigMultiProtocolGateway.class),
        @XmlElement(name = "Domain", type = ConfigDomain.class),
        @XmlElement(name = "CompileOptionsPolicy", type = ConfigCompileOptionsPolicy.class),
        @XmlElement(name = "FilterAction", type = ConfigFilterAction.class),
        @XmlElement(name = "XTCProtocolHandler", type = ConfigXTCProtocolHandler.class),
        @XmlElement(name = "UDDIRegistry", type = ConfigUDDIRegistry.class),
        @XmlElement(name = "SOAPHeaderDisposition", type = ConfigSOAPHeaderDisposition.class),
        @XmlElement(name = "TFIMEndpoint", type = ConfigTFIMEndpoint.class),
        @XmlElement(name = "CryptoProfile", type = ConfigCryptoProfile.class),
        @XmlElement(name = "Statistics", type = ConfigStatistics.class),
        @XmlElement(name = "CryptoCertificate", type = ConfigCryptoCertificate.class),
        @XmlElement(name = "CertMonitor", type = ConfigCertMonitor.class),
        @XmlElement(name = "WebAppFW", type = ConfigWebAppFW.class),
        @XmlElement(name = "WebAppSessionPolicy", type = ConfigWebAppSessionPolicy.class),
        @XmlElement(name = "HTTPService", type = ConfigHTTPService.class),
        @XmlElement(name = "ImportPackage", type = ConfigImportPackage.class),
        @XmlElement(name = "SLMSchedule", type = ConfigSLMSchedule.class),
        @XmlElement(name = "CryptoValCred", type = ConfigCryptoValCred.class),
        @XmlElement(name = "CryptoSSKey", type = ConfigCryptoSSKey.class),
        @XmlElement(name = "IScsiChapConfig", type = ConfigIScsiChapConfig.class),
        @XmlElement(name = "MQQM", type = ConfigMQQM.class),
        @XmlElement(name = "FormsLoginPolicy", type = ConfigFormsLoginPolicy.class),
        @XmlElement(name = "RBMSettings", type = ConfigRBMSettings.class),
        @XmlElement(name = "WCCService", type = ConfigWCCService.class),
        @XmlElement(name = "IScsiHBAConfig", type = ConfigIScsiHBAConfig.class),
        @XmlElement(name = "HTTPSSourceProtocolHandler", type = ConfigHTTPSSourceProtocolHandler.class),
        @XmlElement(name = "IMSConnect", type = ConfigIMSConnect.class),
        @XmlElement(name = "NTPService", type = ConfigNTPService.class),
        @XmlElement(name = "IScsiTargetConfig", type = ConfigIScsiTargetConfig.class),
        @XmlElement(name = "HTTPInputConversionMap", type = ConfigHTTPInputConversionMap.class),
        @XmlElement(name = "ErrorReportSettings", type = ConfigErrorReportSettings.class),
        @XmlElement(name = "WSStylePolicyRule", type = ConfigWSStylePolicyRule.class),
        @XmlElement(name = "MQQMGroup", type = ConfigMQQMGroup.class),
        @XmlElement(name = "URLRefreshPolicy", type = ConfigURLRefreshPolicy.class),
        @XmlElement(name = "PolicyParameters", type = ConfigPolicyParameters.class),
        @XmlElement(name = "IMSConnectSourceProtocolHandler", type = ConfigIMSConnectSourceProtocolHandler.class),
        @XmlElement(name = "DNSNameService", type = ConfigDNSNameService.class),
        @XmlElement(name = "LoadBalancerGroup", type = ConfigLoadBalancerGroup.class),
        @XmlElement(name = "ZHybridTargetControlService", type = ConfigZHybridTargetControlService.class),
        @XmlElement(name = "MQGW", type = ConfigMQGW.class),
        @XmlElement(name = "MQhost", type = ConfigMQhost.class),
        @XmlElement(name = "ConformancePolicy", type = ConfigConformancePolicy.class),
        @XmlElement(name = "SQLDataSource", type = ConfigSQLDataSource.class),
        @XmlElement(name = "AppSecurityPolicy", type = ConfigAppSecurityPolicy.class),
        @XmlElement(name = "StylePolicy", type = ConfigStylePolicy.class),
        @XmlElement(name = "AccessControlList", type = ConfigAccessControlList.class),
        @XmlElement(name = "SystemSettings", type = ConfigSystemSettings.class),
        @XmlElement(name = "CompactFlash", type = ConfigCompactFlash.class),
        @XmlElement(name = "FTPQuoteCommands", type = ConfigFTPQuoteCommands.class),
        @XmlElement(name = "SimpleCountMonitor", type = ConfigSimpleCountMonitor.class),
        @XmlElement(name = "StylePolicyAction", type = ConfigStylePolicyAction.class),
        @XmlElement(name = "MgmtInterface", type = ConfigMgmtInterface.class),
        @XmlElement(name = "FTPServerSourceProtocolHandler", type = ConfigFTPServerSourceProtocolHandler.class),
        @XmlElement(name = "VLANInterface", type = ConfigVLANInterface.class),
        @XmlElement(name = "HTTPUserAgent", type = ConfigHTTPUserAgent.class),
        @XmlElement(name = "HostAlias", type = ConfigHostAlias.class),
        @XmlElement(name = "ProcessingMetadata", type = ConfigProcessingMetadata.class),
        @XmlElement(name = "MQSourceProtocolHandler", type = ConfigMQSourceProtocolHandler.class),
        @XmlElement(name = "SLMRsrcClass", type = ConfigSLMRsrcClass.class),
        @XmlElement(name = "TAM", type = ConfigTAM.class),
        @XmlElement(name = "IScsiInitiatorConfig", type = ConfigIScsiInitiatorConfig.class),
        @XmlElement(name = "EthernetInterface", type = ConfigEthernetInterface.class),
        @XmlElement(name = "MessageMatching", type = ConfigMessageMatching.class),
        @XmlElement(name = "NameValueProfile", type = ConfigNameValueProfile.class),
        @XmlElement(name = "SSHService", type = ConfigSSHService.class),
        @XmlElement(name = "SSLProxyService", type = ConfigSSLProxyService.class),
        @XmlElement(name = "TelnetService", type = ConfigTelnetService.class),
        @XmlElement(name = "WebServiceMonitor", type = ConfigWebServiceMonitor.class),
        @XmlElement(name = "URLMap", type = ConfigURLMap.class),
        @XmlElement(name = "MessageType", type = ConfigMessageType.class),
        @XmlElement(name = "SQLRuntimeSettings", type = ConfigSQLRuntimeSettings.class),
        @XmlElement(name = "ShellAlias", type = ConfigShellAlias.class),
        @XmlElement(name = "WebAppRequest", type = ConfigWebAppRequest.class),
        @XmlElement(name = "User", type = ConfigUser.class),
        @XmlElement(name = "WebServicesAgent", type = ConfigWebServicesAgent.class),
        @XmlElement(name = "HTTPSourceProtocolHandler", type = ConfigHTTPSourceProtocolHandler.class),
        @XmlElement(name = "ZosNSSClient", type = ConfigZosNSSClient.class),
        @XmlElement(name = "XPathRoutingMap", type = ConfigXPathRoutingMap.class),
        @XmlElement(name = "LogTarget", type = ConfigLogTarget.class),
        @XmlElement(name = "XMLManager", type = ConfigXMLManager.class),
        @XmlElement(name = "CryptoKerberosKDC", type = ConfigCryptoKerberosKDC.class),
        @XmlElement(name = "TimeSettings", type = ConfigTimeSettings.class),
        @XmlElement(name = "CryptoKey", type = ConfigCryptoKey.class),
        @XmlElement(name = "XMLFirewallService", type = ConfigXMLFirewallService.class),
        @XmlElement(name = "xmltrace", type = Configxmltrace.class),
        @XmlElement(name = "WSEndpointRewritePolicy", type = ConfigWSEndpointRewritePolicy.class),
        @XmlElement(name = "IncludeConfig", type = ConfigIncludeConfig.class),
        @XmlElement(name = "XACMLPDP", type = ConfigXACMLPDP.class),
        @XmlElement(name = "WebAppErrorHandlingPolicy", type = ConfigWebAppErrorHandlingPolicy.class),
        @XmlElement(name = "WebSphereJMSSourceProtocolHandler", type = ConfigWebSphereJMSSourceProtocolHandler.class),
        @XmlElement(name = "NFSClientSettings", type = ConfigNFSClientSettings.class),
        @XmlElement(name = "SecureCloudConnector", type = ConfigSecureCloudConnector.class),
        @XmlElement(name = "SSLProxyProfile", type = ConfigSSLProxyProfile.class),
        @XmlElement(name = "CryptoKerberosKeytab", type = ConfigCryptoKerberosKeytab.class),
        @XmlElement(name = "CountMonitor", type = ConfigCountMonitor.class),
        @XmlElement(name = "DurationMonitor", type = ConfigDurationMonitor.class),
        @XmlElement(name = "TibcoEMSServer", type = ConfigTibcoEMSServer.class),
        @XmlElement(name = "WebAppResponse", type = ConfigWebAppResponse.class),
        @XmlElement(name = "WebGUI", type = ConfigWebGUI.class),
        @XmlElement(name = "FTPFilePollerSourceProtocolHandler", type = ConfigFTPFilePollerSourceProtocolHandler.class),
        @XmlElement(name = "XSLProxyService", type = ConfigXSLProxyService.class),
        @XmlElement(name = "SAMLAttributes", type = ConfigSAMLAttributes.class),
        @XmlElement(name = "DocumentCryptoMap", type = ConfigDocumentCryptoMap.class),
        @XmlElement(name = "Throttler", type = ConfigThrottler.class),
        @XmlElement(name = "WSRRSubscription", type = ConfigWSRRSubscription.class),
        @XmlElement(name = "IScsiVolumeConfig", type = ConfigIScsiVolumeConfig.class),
        @XmlElement(name = "NFSStaticMount", type = ConfigNFSStaticMount.class),
        @XmlElement(name = "SLMAction", type = ConfigSLMAction.class),
        @XmlElement(name = "NetworkSettings", type = ConfigNetworkSettings.class),
        @XmlElement(name = "NFSDynamicMounts", type = ConfigNFSDynamicMounts.class),
        @XmlElement(name = "WSRRSavedSearchSubscription", type = ConfigWSRRSavedSearchSubscription.class),
        @XmlElement(name = "SFTPFilePollerSourceProtocolHandler", type = ConfigSFTPFilePollerSourceProtocolHandler.class),
        @XmlElement(name = "StatelessTCPSourceProtocolHandler", type = ConfigStatelessTCPSourceProtocolHandler.class),
        @XmlElement(name = "LDAPSearchParameters", type = ConfigLDAPSearchParameters.class),
        @XmlElement(name = "RaidVolume", type = ConfigRaidVolume.class),
        @XmlElement(name = "UserGroup", type = ConfigUserGroup.class),
        @XmlElement(name = "URLRewritePolicy", type = ConfigURLRewritePolicy.class),
        @XmlElement(name = "SNMPSettings", type = ConfigSNMPSettings.class),
        @XmlElement(name = "RADIUSSettings", type = ConfigRADIUSSettings.class),
        @XmlElement(name = "SSHServerSourceProtocolHandler", type = ConfigSSHServerSourceProtocolHandler.class),
        @XmlElement(name = "LogLabel", type = ConfigLogLabel.class),
        @XmlElement(name = "SLMCredClass", type = ConfigSLMCredClass.class),
        @XmlElement(name = "StylePolicyRule", type = ConfigStylePolicyRule.class),
        @XmlElement(name = "WSRRServer", type = ConfigWSRRServer.class),
        @XmlElement(name = "TibcoEMSSourceProtocolHandler", type = ConfigTibcoEMSSourceProtocolHandler.class),
        @XmlElement(name = "WSGateway", type = ConfigWSGateway.class),
        @XmlElement(name = "TCPProxyService", type = ConfigTCPProxyService.class),
        @XmlElement(name = "IPMILanChannel", type = ConfigIPMILanChannel.class),
        @XmlElement(name = "WSStylePolicy", type = ConfigWSStylePolicy.class),
        @XmlElement(name = "SLMPolicy", type = ConfigSLMPolicy.class)
    })
    protected List<ConfigConfigBase> aaaPolicyOrDomainOrLDAPSearchParameters;

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
     * {@link ConfigAAAPolicy }
     * {@link ConfigSSHClientProfile }
     * {@link ConfigSchemaExceptionMap }
     * {@link ConfigMQproxy }
     * {@link ConfigPeerGroup }
     * {@link ConfigCryptoIdentCred }
     * {@link ConfigIPMIUser }
     * {@link ConfigCRLFetch }
     * {@link ConfigCryptoFWCred }
     * {@link ConfigMatching }
     * {@link ConfigXSLCoprocService }
     * {@link ConfigConfigDeploymentPolicy }
     * {@link ConfigMTOMPolicy }
     * {@link ConfigPolicyAttachments }
     * {@link ConfigUDDISubscription }
     * {@link ConfigNFSFilePollerSourceProtocolHandler }
     * {@link ConfigWebSphereJMSServer }
     * {@link ConfigMQFTESourceProtocolHandler }
     * {@link ConfigMultiProtocolGateway }
     * {@link ConfigDomain }
     * {@link ConfigCompileOptionsPolicy }
     * {@link ConfigFilterAction }
     * {@link ConfigXTCProtocolHandler }
     * {@link ConfigUDDIRegistry }
     * {@link ConfigSOAPHeaderDisposition }
     * {@link ConfigTFIMEndpoint }
     * {@link ConfigCryptoProfile }
     * {@link ConfigStatistics }
     * {@link ConfigCryptoCertificate }
     * {@link ConfigCertMonitor }
     * {@link ConfigWebAppFW }
     * {@link ConfigWebAppSessionPolicy }
     * {@link ConfigHTTPService }
     * {@link ConfigImportPackage }
     * {@link ConfigSLMSchedule }
     * {@link ConfigCryptoValCred }
     * {@link ConfigCryptoSSKey }
     * {@link ConfigIScsiChapConfig }
     * {@link ConfigMQQM }
     * {@link ConfigFormsLoginPolicy }
     * {@link ConfigRBMSettings }
     * {@link ConfigWCCService }
     * {@link ConfigIScsiHBAConfig }
     * {@link ConfigHTTPSSourceProtocolHandler }
     * {@link ConfigIMSConnect }
     * {@link ConfigNTPService }
     * {@link ConfigIScsiTargetConfig }
     * {@link ConfigHTTPInputConversionMap }
     * {@link ConfigErrorReportSettings }
     * {@link ConfigWSStylePolicyRule }
     * {@link ConfigMQQMGroup }
     * {@link ConfigURLRefreshPolicy }
     * {@link ConfigPolicyParameters }
     * {@link ConfigIMSConnectSourceProtocolHandler }
     * {@link ConfigDNSNameService }
     * {@link ConfigLoadBalancerGroup }
     * {@link ConfigZHybridTargetControlService }
     * {@link ConfigMQGW }
     * {@link ConfigMQhost }
     * {@link ConfigConformancePolicy }
     * {@link ConfigSQLDataSource }
     * {@link ConfigAppSecurityPolicy }
     * {@link ConfigStylePolicy }
     * {@link ConfigAccessControlList }
     * {@link ConfigSystemSettings }
     * {@link ConfigCompactFlash }
     * {@link ConfigFTPQuoteCommands }
     * {@link ConfigSimpleCountMonitor }
     * {@link ConfigStylePolicyAction }
     * {@link ConfigMgmtInterface }
     * {@link ConfigFTPServerSourceProtocolHandler }
     * {@link ConfigVLANInterface }
     * {@link ConfigHTTPUserAgent }
     * {@link ConfigHostAlias }
     * {@link ConfigProcessingMetadata }
     * {@link ConfigMQSourceProtocolHandler }
     * {@link ConfigSLMRsrcClass }
     * {@link ConfigTAM }
     * {@link ConfigIScsiInitiatorConfig }
     * {@link ConfigEthernetInterface }
     * {@link ConfigMessageMatching }
     * {@link ConfigNameValueProfile }
     * {@link ConfigSSHService }
     * {@link ConfigSSLProxyService }
     * {@link ConfigTelnetService }
     * {@link ConfigWebServiceMonitor }
     * {@link ConfigURLMap }
     * {@link ConfigMessageType }
     * {@link ConfigSQLRuntimeSettings }
     * {@link ConfigShellAlias }
     * {@link ConfigWebAppRequest }
     * {@link ConfigUser }
     * {@link ConfigWebServicesAgent }
     * {@link ConfigHTTPSourceProtocolHandler }
     * {@link ConfigZosNSSClient }
     * {@link ConfigXPathRoutingMap }
     * {@link ConfigLogTarget }
     * {@link ConfigXMLManager }
     * {@link ConfigCryptoKerberosKDC }
     * {@link ConfigTimeSettings }
     * {@link ConfigCryptoKey }
     * {@link ConfigXMLFirewallService }
     * {@link Configxmltrace }
     * {@link ConfigWSEndpointRewritePolicy }
     * {@link ConfigIncludeConfig }
     * {@link ConfigXACMLPDP }
     * {@link ConfigWebAppErrorHandlingPolicy }
     * {@link ConfigWebSphereJMSSourceProtocolHandler }
     * {@link ConfigNFSClientSettings }
     * {@link ConfigSecureCloudConnector }
     * {@link ConfigSSLProxyProfile }
     * {@link ConfigCryptoKerberosKeytab }
     * {@link ConfigCountMonitor }
     * {@link ConfigDurationMonitor }
     * {@link ConfigTibcoEMSServer }
     * {@link ConfigWebAppResponse }
     * {@link ConfigWebGUI }
     * {@link ConfigFTPFilePollerSourceProtocolHandler }
     * {@link ConfigXSLProxyService }
     * {@link ConfigSAMLAttributes }
     * {@link ConfigDocumentCryptoMap }
     * {@link ConfigThrottler }
     * {@link ConfigWSRRSubscription }
     * {@link ConfigIScsiVolumeConfig }
     * {@link ConfigNFSStaticMount }
     * {@link ConfigSLMAction }
     * {@link ConfigNetworkSettings }
     * {@link ConfigNFSDynamicMounts }
     * {@link ConfigWSRRSavedSearchSubscription }
     * {@link ConfigSFTPFilePollerSourceProtocolHandler }
     * {@link ConfigStatelessTCPSourceProtocolHandler }
     * {@link ConfigLDAPSearchParameters }
     * {@link ConfigRaidVolume }
     * {@link ConfigUserGroup }
     * {@link ConfigURLRewritePolicy }
     * {@link ConfigSNMPSettings }
     * {@link ConfigRADIUSSettings }
     * {@link ConfigSSHServerSourceProtocolHandler }
     * {@link ConfigLogLabel }
     * {@link ConfigSLMCredClass }
     * {@link ConfigStylePolicyRule }
     * {@link ConfigWSRRServer }
     * {@link ConfigTibcoEMSSourceProtocolHandler }
     * {@link ConfigWSGateway }
     * {@link ConfigTCPProxyService }
     * {@link ConfigIPMILanChannel }
     * {@link ConfigWSStylePolicy }
     * {@link ConfigSLMPolicy }
     * 
     * 
     */
    public List<ConfigConfigBase> getAAAPolicyOrDomainOrLDAPSearchParameters() {
        if (aaaPolicyOrDomainOrLDAPSearchParameters == null) {
            aaaPolicyOrDomainOrLDAPSearchParameters = new ArrayList<ConfigConfigBase>();
        }
        return this.aaaPolicyOrDomainOrLDAPSearchParameters;
    }

}
