
package client.soma.generated;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AnyDeleteElement complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AnyDeleteElement">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice maxOccurs="unbounded">
 *         &lt;element name="AAAPolicy" type="{http://www.datapower.com/schemas/management}dmDelConfig"/>
 *         &lt;element name="Domain" type="{http://www.datapower.com/schemas/management}dmDelConfig"/>
 *         &lt;element name="LDAPSearchParameters" type="{http://www.datapower.com/schemas/management}dmDelConfig"/>
 *         &lt;element name="ProcessingMetadata" type="{http://www.datapower.com/schemas/management}dmDelConfig"/>
 *         &lt;element name="RADIUSSettings" type="{http://www.datapower.com/schemas/management}dmDelConfig"/>
 *         &lt;element name="RBMSettings" type="{http://www.datapower.com/schemas/management}dmDelConfig"/>
 *         &lt;element name="SAMLAttributes" type="{http://www.datapower.com/schemas/management}dmDelConfig"/>
 *         &lt;element name="SOAPHeaderDisposition" type="{http://www.datapower.com/schemas/management}dmDelConfig"/>
 *         &lt;element name="TAM" type="{http://www.datapower.com/schemas/management}dmDelConfig"/>
 *         &lt;element name="TFIMEndpoint" type="{http://www.datapower.com/schemas/management}dmDelConfig"/>
 *         &lt;element name="XACMLPDP" type="{http://www.datapower.com/schemas/management}dmDelConfig"/>
 *         &lt;element name="AccessControlList" type="{http://www.datapower.com/schemas/management}dmDelConfig"/>
 *         &lt;element name="AppSecurityPolicy" type="{http://www.datapower.com/schemas/management}dmDelConfig"/>
 *         &lt;element name="CompactFlash" type="{http://www.datapower.com/schemas/management}dmDelConfig"/>
 *         &lt;element name="CompileOptionsPolicy" type="{http://www.datapower.com/schemas/management}dmDelConfig"/>
 *         &lt;element name="ConfigDeploymentPolicy" type="{http://www.datapower.com/schemas/management}dmDelConfig"/>
 *         &lt;element name="ConformancePolicy" type="{http://www.datapower.com/schemas/management}dmDelConfig"/>
 *         &lt;element name="CertMonitor" type="{http://www.datapower.com/schemas/management}dmDelConfig"/>
 *         &lt;element name="CRLFetch" type="{http://www.datapower.com/schemas/management}dmDelConfig"/>
 *         &lt;element name="CryptoCertificate" type="{http://www.datapower.com/schemas/management}dmDelConfig"/>
 *         &lt;element name="CryptoFWCred" type="{http://www.datapower.com/schemas/management}dmDelConfig"/>
 *         &lt;element name="CryptoIdentCred" type="{http://www.datapower.com/schemas/management}dmDelConfig"/>
 *         &lt;element name="CryptoKerberosKDC" type="{http://www.datapower.com/schemas/management}dmDelConfig"/>
 *         &lt;element name="CryptoKerberosKeytab" type="{http://www.datapower.com/schemas/management}dmDelConfig"/>
 *         &lt;element name="CryptoKey" type="{http://www.datapower.com/schemas/management}dmDelConfig"/>
 *         &lt;element name="CryptoProfile" type="{http://www.datapower.com/schemas/management}dmDelConfig"/>
 *         &lt;element name="CryptoSSKey" type="{http://www.datapower.com/schemas/management}dmDelConfig"/>
 *         &lt;element name="CryptoValCred" type="{http://www.datapower.com/schemas/management}dmDelConfig"/>
 *         &lt;element name="SSHClientProfile" type="{http://www.datapower.com/schemas/management}dmDelConfig"/>
 *         &lt;element name="SSLProxyProfile" type="{http://www.datapower.com/schemas/management}dmDelConfig"/>
 *         &lt;element name="ErrorReportSettings" type="{http://www.datapower.com/schemas/management}dmDelConfig"/>
 *         &lt;element name="SystemSettings" type="{http://www.datapower.com/schemas/management}dmDelConfig"/>
 *         &lt;element name="TimeSettings" type="{http://www.datapower.com/schemas/management}dmDelConfig"/>
 *         &lt;element name="SchemaExceptionMap" type="{http://www.datapower.com/schemas/management}dmDelConfig"/>
 *         &lt;element name="DocumentCryptoMap" type="{http://www.datapower.com/schemas/management}dmDelConfig"/>
 *         &lt;element name="XPathRoutingMap" type="{http://www.datapower.com/schemas/management}dmDelConfig"/>
 *         &lt;element name="LogTarget" type="{http://www.datapower.com/schemas/management}dmDelConfig"/>
 *         &lt;element name="FormsLoginPolicy" type="{http://www.datapower.com/schemas/management}dmDelConfig"/>
 *         &lt;element name="FTPQuoteCommands" type="{http://www.datapower.com/schemas/management}dmDelConfig"/>
 *         &lt;element name="MultiProtocolGateway" type="{http://www.datapower.com/schemas/management}dmDelConfig"/>
 *         &lt;element name="WSGateway" type="{http://www.datapower.com/schemas/management}dmDelConfig"/>
 *         &lt;element name="HTTPInputConversionMap" type="{http://www.datapower.com/schemas/management}dmDelConfig"/>
 *         &lt;element name="HTTPUserAgent" type="{http://www.datapower.com/schemas/management}dmDelConfig"/>
 *         &lt;element name="ImportPackage" type="{http://www.datapower.com/schemas/management}dmDelConfig"/>
 *         &lt;element name="IMSConnect" type="{http://www.datapower.com/schemas/management}dmDelConfig"/>
 *         &lt;element name="IncludeConfig" type="{http://www.datapower.com/schemas/management}dmDelConfig"/>
 *         &lt;element name="EthernetInterface" type="{http://www.datapower.com/schemas/management}dmDelConfig"/>
 *         &lt;element name="VLANInterface" type="{http://www.datapower.com/schemas/management}dmDelConfig"/>
 *         &lt;element name="IPMILanChannel" type="{http://www.datapower.com/schemas/management}dmDelConfig"/>
 *         &lt;element name="IPMIUser" type="{http://www.datapower.com/schemas/management}dmDelConfig"/>
 *         &lt;element name="IScsiChapConfig" type="{http://www.datapower.com/schemas/management}dmDelConfig"/>
 *         &lt;element name="IScsiHBAConfig" type="{http://www.datapower.com/schemas/management}dmDelConfig"/>
 *         &lt;element name="IScsiInitiatorConfig" type="{http://www.datapower.com/schemas/management}dmDelConfig"/>
 *         &lt;element name="IScsiTargetConfig" type="{http://www.datapower.com/schemas/management}dmDelConfig"/>
 *         &lt;element name="IScsiVolumeConfig" type="{http://www.datapower.com/schemas/management}dmDelConfig"/>
 *         &lt;element name="TibcoEMSServer" type="{http://www.datapower.com/schemas/management}dmDelConfig"/>
 *         &lt;element name="WebSphereJMSServer" type="{http://www.datapower.com/schemas/management}dmDelConfig"/>
 *         &lt;element name="LoadBalancerGroup" type="{http://www.datapower.com/schemas/management}dmDelConfig"/>
 *         &lt;element name="LogLabel" type="{http://www.datapower.com/schemas/management}dmDelConfig"/>
 *         &lt;element name="Matching" type="{http://www.datapower.com/schemas/management}dmDelConfig"/>
 *         &lt;element name="FilterAction" type="{http://www.datapower.com/schemas/management}dmDelConfig"/>
 *         &lt;element name="MessageMatching" type="{http://www.datapower.com/schemas/management}dmDelConfig"/>
 *         &lt;element name="CountMonitor" type="{http://www.datapower.com/schemas/management}dmDelConfig"/>
 *         &lt;element name="DurationMonitor" type="{http://www.datapower.com/schemas/management}dmDelConfig"/>
 *         &lt;element name="MessageType" type="{http://www.datapower.com/schemas/management}dmDelConfig"/>
 *         &lt;element name="MQGW" type="{http://www.datapower.com/schemas/management}dmDelConfig"/>
 *         &lt;element name="MQhost" type="{http://www.datapower.com/schemas/management}dmDelConfig"/>
 *         &lt;element name="MQproxy" type="{http://www.datapower.com/schemas/management}dmDelConfig"/>
 *         &lt;element name="MQQM" type="{http://www.datapower.com/schemas/management}dmDelConfig"/>
 *         &lt;element name="MQQMGroup" type="{http://www.datapower.com/schemas/management}dmDelConfig"/>
 *         &lt;element name="MTOMPolicy" type="{http://www.datapower.com/schemas/management}dmDelConfig"/>
 *         &lt;element name="NameValueProfile" type="{http://www.datapower.com/schemas/management}dmDelConfig"/>
 *         &lt;element name="DNSNameService" type="{http://www.datapower.com/schemas/management}dmDelConfig"/>
 *         &lt;element name="HostAlias" type="{http://www.datapower.com/schemas/management}dmDelConfig"/>
 *         &lt;element name="NetworkSettings" type="{http://www.datapower.com/schemas/management}dmDelConfig"/>
 *         &lt;element name="NTPService" type="{http://www.datapower.com/schemas/management}dmDelConfig"/>
 *         &lt;element name="NFSClientSettings" type="{http://www.datapower.com/schemas/management}dmDelConfig"/>
 *         &lt;element name="NFSDynamicMounts" type="{http://www.datapower.com/schemas/management}dmDelConfig"/>
 *         &lt;element name="NFSStaticMount" type="{http://www.datapower.com/schemas/management}dmDelConfig"/>
 *         &lt;element name="PeerGroup" type="{http://www.datapower.com/schemas/management}dmDelConfig"/>
 *         &lt;element name="PolicyAttachments" type="{http://www.datapower.com/schemas/management}dmDelConfig"/>
 *         &lt;element name="PolicyParameters" type="{http://www.datapower.com/schemas/management}dmDelConfig"/>
 *         &lt;element name="RaidVolume" type="{http://www.datapower.com/schemas/management}dmDelConfig"/>
 *         &lt;element name="SQLRuntimeSettings" type="{http://www.datapower.com/schemas/management}dmDelConfig"/>
 *         &lt;element name="SecureCloudConnector" type="{http://www.datapower.com/schemas/management}dmDelConfig"/>
 *         &lt;element name="MgmtInterface" type="{http://www.datapower.com/schemas/management}dmDelConfig"/>
 *         &lt;element name="SSHService" type="{http://www.datapower.com/schemas/management}dmDelConfig"/>
 *         &lt;element name="TelnetService" type="{http://www.datapower.com/schemas/management}dmDelConfig"/>
 *         &lt;element name="WebGUI" type="{http://www.datapower.com/schemas/management}dmDelConfig"/>
 *         &lt;element name="XMLFirewallService" type="{http://www.datapower.com/schemas/management}dmDelConfig"/>
 *         &lt;element name="XSLProxyService" type="{http://www.datapower.com/schemas/management}dmDelConfig"/>
 *         &lt;element name="HTTPService" type="{http://www.datapower.com/schemas/management}dmDelConfig"/>
 *         &lt;element name="SSLProxyService" type="{http://www.datapower.com/schemas/management}dmDelConfig"/>
 *         &lt;element name="TCPProxyService" type="{http://www.datapower.com/schemas/management}dmDelConfig"/>
 *         &lt;element name="XSLCoprocService" type="{http://www.datapower.com/schemas/management}dmDelConfig"/>
 *         &lt;element name="ShellAlias" type="{http://www.datapower.com/schemas/management}dmDelConfig"/>
 *         &lt;element name="SimpleCountMonitor" type="{http://www.datapower.com/schemas/management}dmDelConfig"/>
 *         &lt;element name="SLMAction" type="{http://www.datapower.com/schemas/management}dmDelConfig"/>
 *         &lt;element name="SLMCredClass" type="{http://www.datapower.com/schemas/management}dmDelConfig"/>
 *         &lt;element name="SLMPolicy" type="{http://www.datapower.com/schemas/management}dmDelConfig"/>
 *         &lt;element name="SLMRsrcClass" type="{http://www.datapower.com/schemas/management}dmDelConfig"/>
 *         &lt;element name="SLMSchedule" type="{http://www.datapower.com/schemas/management}dmDelConfig"/>
 *         &lt;element name="SNMPSettings" type="{http://www.datapower.com/schemas/management}dmDelConfig"/>
 *         &lt;element name="FTPFilePollerSourceProtocolHandler" type="{http://www.datapower.com/schemas/management}dmDelConfig"/>
 *         &lt;element name="NFSFilePollerSourceProtocolHandler" type="{http://www.datapower.com/schemas/management}dmDelConfig"/>
 *         &lt;element name="SFTPFilePollerSourceProtocolHandler" type="{http://www.datapower.com/schemas/management}dmDelConfig"/>
 *         &lt;element name="FTPServerSourceProtocolHandler" type="{http://www.datapower.com/schemas/management}dmDelConfig"/>
 *         &lt;element name="HTTPSourceProtocolHandler" type="{http://www.datapower.com/schemas/management}dmDelConfig"/>
 *         &lt;element name="HTTPSSourceProtocolHandler" type="{http://www.datapower.com/schemas/management}dmDelConfig"/>
 *         &lt;element name="IMSConnectSourceProtocolHandler" type="{http://www.datapower.com/schemas/management}dmDelConfig"/>
 *         &lt;element name="TibcoEMSSourceProtocolHandler" type="{http://www.datapower.com/schemas/management}dmDelConfig"/>
 *         &lt;element name="WebSphereJMSSourceProtocolHandler" type="{http://www.datapower.com/schemas/management}dmDelConfig"/>
 *         &lt;element name="MQFTESourceProtocolHandler" type="{http://www.datapower.com/schemas/management}dmDelConfig"/>
 *         &lt;element name="MQSourceProtocolHandler" type="{http://www.datapower.com/schemas/management}dmDelConfig"/>
 *         &lt;element name="SSHServerSourceProtocolHandler" type="{http://www.datapower.com/schemas/management}dmDelConfig"/>
 *         &lt;element name="StatelessTCPSourceProtocolHandler" type="{http://www.datapower.com/schemas/management}dmDelConfig"/>
 *         &lt;element name="XTCProtocolHandler" type="{http://www.datapower.com/schemas/management}dmDelConfig"/>
 *         &lt;element name="SQLDataSource" type="{http://www.datapower.com/schemas/management}dmDelConfig"/>
 *         &lt;element name="Statistics" type="{http://www.datapower.com/schemas/management}dmDelConfig"/>
 *         &lt;element name="StylePolicy" type="{http://www.datapower.com/schemas/management}dmDelConfig"/>
 *         &lt;element name="StylePolicyAction" type="{http://www.datapower.com/schemas/management}dmDelConfig"/>
 *         &lt;element name="StylePolicyRule" type="{http://www.datapower.com/schemas/management}dmDelConfig"/>
 *         &lt;element name="WSStylePolicyRule" type="{http://www.datapower.com/schemas/management}dmDelConfig"/>
 *         &lt;element name="Throttler" type="{http://www.datapower.com/schemas/management}dmDelConfig"/>
 *         &lt;element name="UDDIRegistry" type="{http://www.datapower.com/schemas/management}dmDelConfig"/>
 *         &lt;element name="URLMap" type="{http://www.datapower.com/schemas/management}dmDelConfig"/>
 *         &lt;element name="URLRefreshPolicy" type="{http://www.datapower.com/schemas/management}dmDelConfig"/>
 *         &lt;element name="URLRewritePolicy" type="{http://www.datapower.com/schemas/management}dmDelConfig"/>
 *         &lt;element name="User" type="{http://www.datapower.com/schemas/management}dmDelConfig"/>
 *         &lt;element name="UserGroup" type="{http://www.datapower.com/schemas/management}dmDelConfig"/>
 *         &lt;element name="WCCService" type="{http://www.datapower.com/schemas/management}dmDelConfig"/>
 *         &lt;element name="WebAppErrorHandlingPolicy" type="{http://www.datapower.com/schemas/management}dmDelConfig"/>
 *         &lt;element name="WebAppFW" type="{http://www.datapower.com/schemas/management}dmDelConfig"/>
 *         &lt;element name="WebAppRequest" type="{http://www.datapower.com/schemas/management}dmDelConfig"/>
 *         &lt;element name="WebAppResponse" type="{http://www.datapower.com/schemas/management}dmDelConfig"/>
 *         &lt;element name="WebAppSessionPolicy" type="{http://www.datapower.com/schemas/management}dmDelConfig"/>
 *         &lt;element name="WebServiceMonitor" type="{http://www.datapower.com/schemas/management}dmDelConfig"/>
 *         &lt;element name="WebServicesAgent" type="{http://www.datapower.com/schemas/management}dmDelConfig"/>
 *         &lt;element name="UDDISubscription" type="{http://www.datapower.com/schemas/management}dmDelConfig"/>
 *         &lt;element name="WSRRSavedSearchSubscription" type="{http://www.datapower.com/schemas/management}dmDelConfig"/>
 *         &lt;element name="WSRRSubscription" type="{http://www.datapower.com/schemas/management}dmDelConfig"/>
 *         &lt;element name="WSEndpointRewritePolicy" type="{http://www.datapower.com/schemas/management}dmDelConfig"/>
 *         &lt;element name="WSRRServer" type="{http://www.datapower.com/schemas/management}dmDelConfig"/>
 *         &lt;element name="WSStylePolicy" type="{http://www.datapower.com/schemas/management}dmDelConfig"/>
 *         &lt;element name="XMLManager" type="{http://www.datapower.com/schemas/management}dmDelConfig"/>
 *         &lt;element name="xmltrace" type="{http://www.datapower.com/schemas/management}dmDelConfig"/>
 *         &lt;element name="ZHybridTargetControlService" type="{http://www.datapower.com/schemas/management}dmDelConfig"/>
 *         &lt;element name="ZosNSSClient" type="{http://www.datapower.com/schemas/management}dmDelConfig"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AnyDeleteElement", propOrder = {
    "aaaPolicyOrDomainOrLDAPSearchParameters"
})
public class AnyDeleteElement {

    @XmlElementRefs({
        @XmlElementRef(name = "MQQM", type = JAXBElement.class),
        @XmlElementRef(name = "NTPService", type = JAXBElement.class),
        @XmlElementRef(name = "CRLFetch", type = JAXBElement.class),
        @XmlElementRef(name = "ProcessingMetadata", type = JAXBElement.class),
        @XmlElementRef(name = "WebAppFW", type = JAXBElement.class),
        @XmlElementRef(name = "WebAppSessionPolicy", type = JAXBElement.class),
        @XmlElementRef(name = "TibcoEMSServer", type = JAXBElement.class),
        @XmlElementRef(name = "NameValueProfile", type = JAXBElement.class),
        @XmlElementRef(name = "SLMPolicy", type = JAXBElement.class),
        @XmlElementRef(name = "MQSourceProtocolHandler", type = JAXBElement.class),
        @XmlElementRef(name = "Throttler", type = JAXBElement.class),
        @XmlElementRef(name = "WebAppErrorHandlingPolicy", type = JAXBElement.class),
        @XmlElementRef(name = "WebSphereJMSSourceProtocolHandler", type = JAXBElement.class),
        @XmlElementRef(name = "WebServicesAgent", type = JAXBElement.class),
        @XmlElementRef(name = "User", type = JAXBElement.class),
        @XmlElementRef(name = "TimeSettings", type = JAXBElement.class),
        @XmlElementRef(name = "WSEndpointRewritePolicy", type = JAXBElement.class),
        @XmlElementRef(name = "WebServiceMonitor", type = JAXBElement.class),
        @XmlElementRef(name = "DNSNameService", type = JAXBElement.class),
        @XmlElementRef(name = "SAMLAttributes", type = JAXBElement.class),
        @XmlElementRef(name = "TelnetService", type = JAXBElement.class),
        @XmlElementRef(name = "WSRRServer", type = JAXBElement.class),
        @XmlElementRef(name = "URLMap", type = JAXBElement.class),
        @XmlElementRef(name = "SFTPFilePollerSourceProtocolHandler", type = JAXBElement.class),
        @XmlElementRef(name = "SSLProxyService", type = JAXBElement.class),
        @XmlElementRef(name = "CryptoSSKey", type = JAXBElement.class),
        @XmlElementRef(name = "NetworkSettings", type = JAXBElement.class),
        @XmlElementRef(name = "IPMILanChannel", type = JAXBElement.class),
        @XmlElementRef(name = "SSHClientProfile", type = JAXBElement.class),
        @XmlElementRef(name = "CryptoProfile", type = JAXBElement.class),
        @XmlElementRef(name = "XTCProtocolHandler", type = JAXBElement.class),
        @XmlElementRef(name = "IScsiChapConfig", type = JAXBElement.class),
        @XmlElementRef(name = "AccessControlList", type = JAXBElement.class),
        @XmlElementRef(name = "RBMSettings", type = JAXBElement.class),
        @XmlElementRef(name = "ShellAlias", type = JAXBElement.class),
        @XmlElementRef(name = "PolicyParameters", type = JAXBElement.class),
        @XmlElementRef(name = "UDDISubscription", type = JAXBElement.class),
        @XmlElementRef(name = "CertMonitor", type = JAXBElement.class),
        @XmlElementRef(name = "XPathRoutingMap", type = JAXBElement.class),
        @XmlElementRef(name = "URLRewritePolicy", type = JAXBElement.class),
        @XmlElementRef(name = "IPMIUser", type = JAXBElement.class),
        @XmlElementRef(name = "IScsiInitiatorConfig", type = JAXBElement.class),
        @XmlElementRef(name = "HTTPUserAgent", type = JAXBElement.class),
        @XmlElementRef(name = "MQGW", type = JAXBElement.class),
        @XmlElementRef(name = "NFSDynamicMounts", type = JAXBElement.class),
        @XmlElementRef(name = "WCCService", type = JAXBElement.class),
        @XmlElementRef(name = "SLMSchedule", type = JAXBElement.class),
        @XmlElementRef(name = "FTPFilePollerSourceProtocolHandler", type = JAXBElement.class),
        @XmlElementRef(name = "WSGateway", type = JAXBElement.class),
        @XmlElementRef(name = "VLANInterface", type = JAXBElement.class),
        @XmlElementRef(name = "IMSConnect", type = JAXBElement.class),
        @XmlElementRef(name = "HTTPSSourceProtocolHandler", type = JAXBElement.class),
        @XmlElementRef(name = "CryptoIdentCred", type = JAXBElement.class),
        @XmlElementRef(name = "SLMAction", type = JAXBElement.class),
        @XmlElementRef(name = "xmltrace", type = JAXBElement.class),
        @XmlElementRef(name = "MQQMGroup", type = JAXBElement.class),
        @XmlElementRef(name = "UDDIRegistry", type = JAXBElement.class),
        @XmlElementRef(name = "ZosNSSClient", type = JAXBElement.class),
        @XmlElementRef(name = "TAM", type = JAXBElement.class),
        @XmlElementRef(name = "TibcoEMSSourceProtocolHandler", type = JAXBElement.class),
        @XmlElementRef(name = "StylePolicyAction", type = JAXBElement.class),
        @XmlElementRef(name = "CryptoFWCred", type = JAXBElement.class),
        @XmlElementRef(name = "MQhost", type = JAXBElement.class),
        @XmlElementRef(name = "WSRRSubscription", type = JAXBElement.class),
        @XmlElementRef(name = "TCPProxyService", type = JAXBElement.class),
        @XmlElementRef(name = "MessageMatching", type = JAXBElement.class),
        @XmlElementRef(name = "WSStylePolicyRule", type = JAXBElement.class),
        @XmlElementRef(name = "MQFTESourceProtocolHandler", type = JAXBElement.class),
        @XmlElementRef(name = "ErrorReportSettings", type = JAXBElement.class),
        @XmlElementRef(name = "XSLProxyService", type = JAXBElement.class),
        @XmlElementRef(name = "XMLManager", type = JAXBElement.class),
        @XmlElementRef(name = "Domain", type = JAXBElement.class),
        @XmlElementRef(name = "StatelessTCPSourceProtocolHandler", type = JAXBElement.class),
        @XmlElementRef(name = "WebAppRequest", type = JAXBElement.class),
        @XmlElementRef(name = "HostAlias", type = JAXBElement.class),
        @XmlElementRef(name = "LDAPSearchParameters", type = JAXBElement.class),
        @XmlElementRef(name = "SQLRuntimeSettings", type = JAXBElement.class),
        @XmlElementRef(name = "DocumentCryptoMap", type = JAXBElement.class),
        @XmlElementRef(name = "StylePolicy", type = JAXBElement.class),
        @XmlElementRef(name = "ConfigDeploymentPolicy", type = JAXBElement.class),
        @XmlElementRef(name = "AAAPolicy", type = JAXBElement.class),
        @XmlElementRef(name = "XACMLPDP", type = JAXBElement.class),
        @XmlElementRef(name = "HTTPInputConversionMap", type = JAXBElement.class),
        @XmlElementRef(name = "SSHService", type = JAXBElement.class),
        @XmlElementRef(name = "FTPServerSourceProtocolHandler", type = JAXBElement.class),
        @XmlElementRef(name = "MessageType", type = JAXBElement.class),
        @XmlElementRef(name = "CryptoKey", type = JAXBElement.class),
        @XmlElementRef(name = "CryptoKerberosKDC", type = JAXBElement.class),
        @XmlElementRef(name = "WebAppResponse", type = JAXBElement.class),
        @XmlElementRef(name = "CompactFlash", type = JAXBElement.class),
        @XmlElementRef(name = "FilterAction", type = JAXBElement.class),
        @XmlElementRef(name = "Matching", type = JAXBElement.class),
        @XmlElementRef(name = "WebGUI", type = JAXBElement.class),
        @XmlElementRef(name = "XSLCoprocService", type = JAXBElement.class),
        @XmlElementRef(name = "URLRefreshPolicy", type = JAXBElement.class),
        @XmlElementRef(name = "MTOMPolicy", type = JAXBElement.class),
        @XmlElementRef(name = "ZHybridTargetControlService", type = JAXBElement.class),
        @XmlElementRef(name = "NFSClientSettings", type = JAXBElement.class),
        @XmlElementRef(name = "EthernetInterface", type = JAXBElement.class),
        @XmlElementRef(name = "NFSStaticMount", type = JAXBElement.class),
        @XmlElementRef(name = "WSStylePolicy", type = JAXBElement.class),
        @XmlElementRef(name = "CountMonitor", type = JAXBElement.class),
        @XmlElementRef(name = "DurationMonitor", type = JAXBElement.class),
        @XmlElementRef(name = "NFSFilePollerSourceProtocolHandler", type = JAXBElement.class),
        @XmlElementRef(name = "IncludeConfig", type = JAXBElement.class),
        @XmlElementRef(name = "IMSConnectSourceProtocolHandler", type = JAXBElement.class),
        @XmlElementRef(name = "IScsiVolumeConfig", type = JAXBElement.class),
        @XmlElementRef(name = "PolicyAttachments", type = JAXBElement.class),
        @XmlElementRef(name = "RaidVolume", type = JAXBElement.class),
        @XmlElementRef(name = "RADIUSSettings", type = JAXBElement.class),
        @XmlElementRef(name = "SLMCredClass", type = JAXBElement.class),
        @XmlElementRef(name = "IScsiTargetConfig", type = JAXBElement.class),
        @XmlElementRef(name = "FormsLoginPolicy", type = JAXBElement.class),
        @XmlElementRef(name = "SQLDataSource", type = JAXBElement.class),
        @XmlElementRef(name = "LogLabel", type = JAXBElement.class),
        @XmlElementRef(name = "CryptoValCred", type = JAXBElement.class),
        @XmlElementRef(name = "HTTPService", type = JAXBElement.class),
        @XmlElementRef(name = "IScsiHBAConfig", type = JAXBElement.class),
        @XmlElementRef(name = "MgmtInterface", type = JAXBElement.class),
        @XmlElementRef(name = "TFIMEndpoint", type = JAXBElement.class),
        @XmlElementRef(name = "CryptoCertificate", type = JAXBElement.class),
        @XmlElementRef(name = "Statistics", type = JAXBElement.class),
        @XmlElementRef(name = "PeerGroup", type = JAXBElement.class),
        @XmlElementRef(name = "SOAPHeaderDisposition", type = JAXBElement.class),
        @XmlElementRef(name = "SecureCloudConnector", type = JAXBElement.class),
        @XmlElementRef(name = "SSHServerSourceProtocolHandler", type = JAXBElement.class),
        @XmlElementRef(name = "MultiProtocolGateway", type = JAXBElement.class),
        @XmlElementRef(name = "SNMPSettings", type = JAXBElement.class),
        @XmlElementRef(name = "XMLFirewallService", type = JAXBElement.class),
        @XmlElementRef(name = "UserGroup", type = JAXBElement.class),
        @XmlElementRef(name = "ConformancePolicy", type = JAXBElement.class),
        @XmlElementRef(name = "SimpleCountMonitor", type = JAXBElement.class),
        @XmlElementRef(name = "WSRRSavedSearchSubscription", type = JAXBElement.class),
        @XmlElementRef(name = "StylePolicyRule", type = JAXBElement.class),
        @XmlElementRef(name = "LogTarget", type = JAXBElement.class),
        @XmlElementRef(name = "FTPQuoteCommands", type = JAXBElement.class),
        @XmlElementRef(name = "MQproxy", type = JAXBElement.class),
        @XmlElementRef(name = "HTTPSourceProtocolHandler", type = JAXBElement.class),
        @XmlElementRef(name = "SchemaExceptionMap", type = JAXBElement.class),
        @XmlElementRef(name = "CryptoKerberosKeytab", type = JAXBElement.class),
        @XmlElementRef(name = "SLMRsrcClass", type = JAXBElement.class),
        @XmlElementRef(name = "LoadBalancerGroup", type = JAXBElement.class),
        @XmlElementRef(name = "WebSphereJMSServer", type = JAXBElement.class),
        @XmlElementRef(name = "SystemSettings", type = JAXBElement.class),
        @XmlElementRef(name = "CompileOptionsPolicy", type = JAXBElement.class),
        @XmlElementRef(name = "AppSecurityPolicy", type = JAXBElement.class),
        @XmlElementRef(name = "ImportPackage", type = JAXBElement.class),
        @XmlElementRef(name = "SSLProxyProfile", type = JAXBElement.class)
    })
    protected List<JAXBElement<DmDelConfig>> aaaPolicyOrDomainOrLDAPSearchParameters;

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
     * {@link JAXBElement }{@code <}{@link DmDelConfig }{@code >}
     * {@link JAXBElement }{@code <}{@link DmDelConfig }{@code >}
     * {@link JAXBElement }{@code <}{@link DmDelConfig }{@code >}
     * {@link JAXBElement }{@code <}{@link DmDelConfig }{@code >}
     * {@link JAXBElement }{@code <}{@link DmDelConfig }{@code >}
     * {@link JAXBElement }{@code <}{@link DmDelConfig }{@code >}
     * {@link JAXBElement }{@code <}{@link DmDelConfig }{@code >}
     * {@link JAXBElement }{@code <}{@link DmDelConfig }{@code >}
     * {@link JAXBElement }{@code <}{@link DmDelConfig }{@code >}
     * {@link JAXBElement }{@code <}{@link DmDelConfig }{@code >}
     * {@link JAXBElement }{@code <}{@link DmDelConfig }{@code >}
     * {@link JAXBElement }{@code <}{@link DmDelConfig }{@code >}
     * {@link JAXBElement }{@code <}{@link DmDelConfig }{@code >}
     * {@link JAXBElement }{@code <}{@link DmDelConfig }{@code >}
     * {@link JAXBElement }{@code <}{@link DmDelConfig }{@code >}
     * {@link JAXBElement }{@code <}{@link DmDelConfig }{@code >}
     * {@link JAXBElement }{@code <}{@link DmDelConfig }{@code >}
     * {@link JAXBElement }{@code <}{@link DmDelConfig }{@code >}
     * {@link JAXBElement }{@code <}{@link DmDelConfig }{@code >}
     * {@link JAXBElement }{@code <}{@link DmDelConfig }{@code >}
     * {@link JAXBElement }{@code <}{@link DmDelConfig }{@code >}
     * {@link JAXBElement }{@code <}{@link DmDelConfig }{@code >}
     * {@link JAXBElement }{@code <}{@link DmDelConfig }{@code >}
     * {@link JAXBElement }{@code <}{@link DmDelConfig }{@code >}
     * {@link JAXBElement }{@code <}{@link DmDelConfig }{@code >}
     * {@link JAXBElement }{@code <}{@link DmDelConfig }{@code >}
     * {@link JAXBElement }{@code <}{@link DmDelConfig }{@code >}
     * {@link JAXBElement }{@code <}{@link DmDelConfig }{@code >}
     * {@link JAXBElement }{@code <}{@link DmDelConfig }{@code >}
     * {@link JAXBElement }{@code <}{@link DmDelConfig }{@code >}
     * {@link JAXBElement }{@code <}{@link DmDelConfig }{@code >}
     * {@link JAXBElement }{@code <}{@link DmDelConfig }{@code >}
     * {@link JAXBElement }{@code <}{@link DmDelConfig }{@code >}
     * {@link JAXBElement }{@code <}{@link DmDelConfig }{@code >}
     * {@link JAXBElement }{@code <}{@link DmDelConfig }{@code >}
     * {@link JAXBElement }{@code <}{@link DmDelConfig }{@code >}
     * {@link JAXBElement }{@code <}{@link DmDelConfig }{@code >}
     * {@link JAXBElement }{@code <}{@link DmDelConfig }{@code >}
     * {@link JAXBElement }{@code <}{@link DmDelConfig }{@code >}
     * {@link JAXBElement }{@code <}{@link DmDelConfig }{@code >}
     * {@link JAXBElement }{@code <}{@link DmDelConfig }{@code >}
     * {@link JAXBElement }{@code <}{@link DmDelConfig }{@code >}
     * {@link JAXBElement }{@code <}{@link DmDelConfig }{@code >}
     * {@link JAXBElement }{@code <}{@link DmDelConfig }{@code >}
     * {@link JAXBElement }{@code <}{@link DmDelConfig }{@code >}
     * {@link JAXBElement }{@code <}{@link DmDelConfig }{@code >}
     * {@link JAXBElement }{@code <}{@link DmDelConfig }{@code >}
     * {@link JAXBElement }{@code <}{@link DmDelConfig }{@code >}
     * {@link JAXBElement }{@code <}{@link DmDelConfig }{@code >}
     * {@link JAXBElement }{@code <}{@link DmDelConfig }{@code >}
     * {@link JAXBElement }{@code <}{@link DmDelConfig }{@code >}
     * {@link JAXBElement }{@code <}{@link DmDelConfig }{@code >}
     * {@link JAXBElement }{@code <}{@link DmDelConfig }{@code >}
     * {@link JAXBElement }{@code <}{@link DmDelConfig }{@code >}
     * {@link JAXBElement }{@code <}{@link DmDelConfig }{@code >}
     * {@link JAXBElement }{@code <}{@link DmDelConfig }{@code >}
     * {@link JAXBElement }{@code <}{@link DmDelConfig }{@code >}
     * {@link JAXBElement }{@code <}{@link DmDelConfig }{@code >}
     * {@link JAXBElement }{@code <}{@link DmDelConfig }{@code >}
     * {@link JAXBElement }{@code <}{@link DmDelConfig }{@code >}
     * {@link JAXBElement }{@code <}{@link DmDelConfig }{@code >}
     * {@link JAXBElement }{@code <}{@link DmDelConfig }{@code >}
     * {@link JAXBElement }{@code <}{@link DmDelConfig }{@code >}
     * {@link JAXBElement }{@code <}{@link DmDelConfig }{@code >}
     * {@link JAXBElement }{@code <}{@link DmDelConfig }{@code >}
     * {@link JAXBElement }{@code <}{@link DmDelConfig }{@code >}
     * {@link JAXBElement }{@code <}{@link DmDelConfig }{@code >}
     * {@link JAXBElement }{@code <}{@link DmDelConfig }{@code >}
     * {@link JAXBElement }{@code <}{@link DmDelConfig }{@code >}
     * {@link JAXBElement }{@code <}{@link DmDelConfig }{@code >}
     * {@link JAXBElement }{@code <}{@link DmDelConfig }{@code >}
     * {@link JAXBElement }{@code <}{@link DmDelConfig }{@code >}
     * {@link JAXBElement }{@code <}{@link DmDelConfig }{@code >}
     * {@link JAXBElement }{@code <}{@link DmDelConfig }{@code >}
     * {@link JAXBElement }{@code <}{@link DmDelConfig }{@code >}
     * {@link JAXBElement }{@code <}{@link DmDelConfig }{@code >}
     * {@link JAXBElement }{@code <}{@link DmDelConfig }{@code >}
     * {@link JAXBElement }{@code <}{@link DmDelConfig }{@code >}
     * {@link JAXBElement }{@code <}{@link DmDelConfig }{@code >}
     * {@link JAXBElement }{@code <}{@link DmDelConfig }{@code >}
     * {@link JAXBElement }{@code <}{@link DmDelConfig }{@code >}
     * {@link JAXBElement }{@code <}{@link DmDelConfig }{@code >}
     * {@link JAXBElement }{@code <}{@link DmDelConfig }{@code >}
     * {@link JAXBElement }{@code <}{@link DmDelConfig }{@code >}
     * {@link JAXBElement }{@code <}{@link DmDelConfig }{@code >}
     * {@link JAXBElement }{@code <}{@link DmDelConfig }{@code >}
     * {@link JAXBElement }{@code <}{@link DmDelConfig }{@code >}
     * {@link JAXBElement }{@code <}{@link DmDelConfig }{@code >}
     * {@link JAXBElement }{@code <}{@link DmDelConfig }{@code >}
     * {@link JAXBElement }{@code <}{@link DmDelConfig }{@code >}
     * {@link JAXBElement }{@code <}{@link DmDelConfig }{@code >}
     * {@link JAXBElement }{@code <}{@link DmDelConfig }{@code >}
     * {@link JAXBElement }{@code <}{@link DmDelConfig }{@code >}
     * {@link JAXBElement }{@code <}{@link DmDelConfig }{@code >}
     * {@link JAXBElement }{@code <}{@link DmDelConfig }{@code >}
     * {@link JAXBElement }{@code <}{@link DmDelConfig }{@code >}
     * {@link JAXBElement }{@code <}{@link DmDelConfig }{@code >}
     * {@link JAXBElement }{@code <}{@link DmDelConfig }{@code >}
     * {@link JAXBElement }{@code <}{@link DmDelConfig }{@code >}
     * {@link JAXBElement }{@code <}{@link DmDelConfig }{@code >}
     * {@link JAXBElement }{@code <}{@link DmDelConfig }{@code >}
     * {@link JAXBElement }{@code <}{@link DmDelConfig }{@code >}
     * {@link JAXBElement }{@code <}{@link DmDelConfig }{@code >}
     * {@link JAXBElement }{@code <}{@link DmDelConfig }{@code >}
     * {@link JAXBElement }{@code <}{@link DmDelConfig }{@code >}
     * {@link JAXBElement }{@code <}{@link DmDelConfig }{@code >}
     * {@link JAXBElement }{@code <}{@link DmDelConfig }{@code >}
     * {@link JAXBElement }{@code <}{@link DmDelConfig }{@code >}
     * {@link JAXBElement }{@code <}{@link DmDelConfig }{@code >}
     * {@link JAXBElement }{@code <}{@link DmDelConfig }{@code >}
     * {@link JAXBElement }{@code <}{@link DmDelConfig }{@code >}
     * {@link JAXBElement }{@code <}{@link DmDelConfig }{@code >}
     * {@link JAXBElement }{@code <}{@link DmDelConfig }{@code >}
     * {@link JAXBElement }{@code <}{@link DmDelConfig }{@code >}
     * {@link JAXBElement }{@code <}{@link DmDelConfig }{@code >}
     * {@link JAXBElement }{@code <}{@link DmDelConfig }{@code >}
     * {@link JAXBElement }{@code <}{@link DmDelConfig }{@code >}
     * {@link JAXBElement }{@code <}{@link DmDelConfig }{@code >}
     * {@link JAXBElement }{@code <}{@link DmDelConfig }{@code >}
     * {@link JAXBElement }{@code <}{@link DmDelConfig }{@code >}
     * {@link JAXBElement }{@code <}{@link DmDelConfig }{@code >}
     * {@link JAXBElement }{@code <}{@link DmDelConfig }{@code >}
     * {@link JAXBElement }{@code <}{@link DmDelConfig }{@code >}
     * {@link JAXBElement }{@code <}{@link DmDelConfig }{@code >}
     * {@link JAXBElement }{@code <}{@link DmDelConfig }{@code >}
     * {@link JAXBElement }{@code <}{@link DmDelConfig }{@code >}
     * {@link JAXBElement }{@code <}{@link DmDelConfig }{@code >}
     * {@link JAXBElement }{@code <}{@link DmDelConfig }{@code >}
     * {@link JAXBElement }{@code <}{@link DmDelConfig }{@code >}
     * {@link JAXBElement }{@code <}{@link DmDelConfig }{@code >}
     * {@link JAXBElement }{@code <}{@link DmDelConfig }{@code >}
     * {@link JAXBElement }{@code <}{@link DmDelConfig }{@code >}
     * {@link JAXBElement }{@code <}{@link DmDelConfig }{@code >}
     * {@link JAXBElement }{@code <}{@link DmDelConfig }{@code >}
     * {@link JAXBElement }{@code <}{@link DmDelConfig }{@code >}
     * {@link JAXBElement }{@code <}{@link DmDelConfig }{@code >}
     * {@link JAXBElement }{@code <}{@link DmDelConfig }{@code >}
     * {@link JAXBElement }{@code <}{@link DmDelConfig }{@code >}
     * {@link JAXBElement }{@code <}{@link DmDelConfig }{@code >}
     * {@link JAXBElement }{@code <}{@link DmDelConfig }{@code >}
     * {@link JAXBElement }{@code <}{@link DmDelConfig }{@code >}
     * {@link JAXBElement }{@code <}{@link DmDelConfig }{@code >}
     * {@link JAXBElement }{@code <}{@link DmDelConfig }{@code >}
     * {@link JAXBElement }{@code <}{@link DmDelConfig }{@code >}
     * {@link JAXBElement }{@code <}{@link DmDelConfig }{@code >}
     * {@link JAXBElement }{@code <}{@link DmDelConfig }{@code >}
     * {@link JAXBElement }{@code <}{@link DmDelConfig }{@code >}
     * {@link JAXBElement }{@code <}{@link DmDelConfig }{@code >}
     * 
     * 
     */
    public List<JAXBElement<DmDelConfig>> getAAAPolicyOrDomainOrLDAPSearchParameters() {
        if (aaaPolicyOrDomainOrLDAPSearchParameters == null) {
            aaaPolicyOrDomainOrLDAPSearchParameters = new ArrayList<JAXBElement<DmDelConfig>>();
        }
        return this.aaaPolicyOrDomainOrLDAPSearchParameters;
    }

}
