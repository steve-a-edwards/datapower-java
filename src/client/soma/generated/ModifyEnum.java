
package client.soma.generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ModifyEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ModifyEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="AAAPolicy"/>
 *     &lt;enumeration value="Domain"/>
 *     &lt;enumeration value="LDAPSearchParameters"/>
 *     &lt;enumeration value="ProcessingMetadata"/>
 *     &lt;enumeration value="RADIUSSettings"/>
 *     &lt;enumeration value="RBMSettings"/>
 *     &lt;enumeration value="SAMLAttributes"/>
 *     &lt;enumeration value="SOAPHeaderDisposition"/>
 *     &lt;enumeration value="TAM"/>
 *     &lt;enumeration value="TFIMEndpoint"/>
 *     &lt;enumeration value="XACMLPDP"/>
 *     &lt;enumeration value="AccessControlList"/>
 *     &lt;enumeration value="AppSecurityPolicy"/>
 *     &lt;enumeration value="CompactFlash"/>
 *     &lt;enumeration value="CompileOptionsPolicy"/>
 *     &lt;enumeration value="ConfigDeploymentPolicy"/>
 *     &lt;enumeration value="ConformancePolicy"/>
 *     &lt;enumeration value="CertMonitor"/>
 *     &lt;enumeration value="CRLFetch"/>
 *     &lt;enumeration value="CryptoCertificate"/>
 *     &lt;enumeration value="CryptoFWCred"/>
 *     &lt;enumeration value="CryptoIdentCred"/>
 *     &lt;enumeration value="CryptoKerberosKDC"/>
 *     &lt;enumeration value="CryptoKerberosKeytab"/>
 *     &lt;enumeration value="CryptoKey"/>
 *     &lt;enumeration value="CryptoProfile"/>
 *     &lt;enumeration value="CryptoSSKey"/>
 *     &lt;enumeration value="CryptoValCred"/>
 *     &lt;enumeration value="SSHClientProfile"/>
 *     &lt;enumeration value="SSLProxyProfile"/>
 *     &lt;enumeration value="ErrorReportSettings"/>
 *     &lt;enumeration value="SystemSettings"/>
 *     &lt;enumeration value="TimeSettings"/>
 *     &lt;enumeration value="SchemaExceptionMap"/>
 *     &lt;enumeration value="DocumentCryptoMap"/>
 *     &lt;enumeration value="XPathRoutingMap"/>
 *     &lt;enumeration value="LogTarget"/>
 *     &lt;enumeration value="FormsLoginPolicy"/>
 *     &lt;enumeration value="FTPQuoteCommands"/>
 *     &lt;enumeration value="MultiProtocolGateway"/>
 *     &lt;enumeration value="WSGateway"/>
 *     &lt;enumeration value="HTTPInputConversionMap"/>
 *     &lt;enumeration value="HTTPUserAgent"/>
 *     &lt;enumeration value="ImportPackage"/>
 *     &lt;enumeration value="IMSConnect"/>
 *     &lt;enumeration value="IncludeConfig"/>
 *     &lt;enumeration value="EthernetInterface"/>
 *     &lt;enumeration value="VLANInterface"/>
 *     &lt;enumeration value="IPMILanChannel"/>
 *     &lt;enumeration value="IPMIUser"/>
 *     &lt;enumeration value="IScsiChapConfig"/>
 *     &lt;enumeration value="IScsiHBAConfig"/>
 *     &lt;enumeration value="IScsiInitiatorConfig"/>
 *     &lt;enumeration value="IScsiTargetConfig"/>
 *     &lt;enumeration value="IScsiVolumeConfig"/>
 *     &lt;enumeration value="TibcoEMSServer"/>
 *     &lt;enumeration value="WebSphereJMSServer"/>
 *     &lt;enumeration value="LoadBalancerGroup"/>
 *     &lt;enumeration value="LogLabel"/>
 *     &lt;enumeration value="Matching"/>
 *     &lt;enumeration value="FilterAction"/>
 *     &lt;enumeration value="MessageMatching"/>
 *     &lt;enumeration value="CountMonitor"/>
 *     &lt;enumeration value="DurationMonitor"/>
 *     &lt;enumeration value="MessageType"/>
 *     &lt;enumeration value="MQGW"/>
 *     &lt;enumeration value="MQhost"/>
 *     &lt;enumeration value="MQproxy"/>
 *     &lt;enumeration value="MQQM"/>
 *     &lt;enumeration value="MQQMGroup"/>
 *     &lt;enumeration value="MTOMPolicy"/>
 *     &lt;enumeration value="NameValueProfile"/>
 *     &lt;enumeration value="DNSNameService"/>
 *     &lt;enumeration value="HostAlias"/>
 *     &lt;enumeration value="NetworkSettings"/>
 *     &lt;enumeration value="NTPService"/>
 *     &lt;enumeration value="NFSClientSettings"/>
 *     &lt;enumeration value="NFSDynamicMounts"/>
 *     &lt;enumeration value="NFSStaticMount"/>
 *     &lt;enumeration value="PeerGroup"/>
 *     &lt;enumeration value="PolicyAttachments"/>
 *     &lt;enumeration value="PolicyParameters"/>
 *     &lt;enumeration value="RaidVolume"/>
 *     &lt;enumeration value="SQLRuntimeSettings"/>
 *     &lt;enumeration value="SecureCloudConnector"/>
 *     &lt;enumeration value="MgmtInterface"/>
 *     &lt;enumeration value="SSHService"/>
 *     &lt;enumeration value="TelnetService"/>
 *     &lt;enumeration value="WebGUI"/>
 *     &lt;enumeration value="XMLFirewallService"/>
 *     &lt;enumeration value="XSLProxyService"/>
 *     &lt;enumeration value="HTTPService"/>
 *     &lt;enumeration value="SSLProxyService"/>
 *     &lt;enumeration value="TCPProxyService"/>
 *     &lt;enumeration value="XSLCoprocService"/>
 *     &lt;enumeration value="ShellAlias"/>
 *     &lt;enumeration value="SimpleCountMonitor"/>
 *     &lt;enumeration value="SLMAction"/>
 *     &lt;enumeration value="SLMCredClass"/>
 *     &lt;enumeration value="SLMPolicy"/>
 *     &lt;enumeration value="SLMRsrcClass"/>
 *     &lt;enumeration value="SLMSchedule"/>
 *     &lt;enumeration value="SNMPSettings"/>
 *     &lt;enumeration value="FTPFilePollerSourceProtocolHandler"/>
 *     &lt;enumeration value="NFSFilePollerSourceProtocolHandler"/>
 *     &lt;enumeration value="SFTPFilePollerSourceProtocolHandler"/>
 *     &lt;enumeration value="FTPServerSourceProtocolHandler"/>
 *     &lt;enumeration value="HTTPSourceProtocolHandler"/>
 *     &lt;enumeration value="HTTPSSourceProtocolHandler"/>
 *     &lt;enumeration value="IMSConnectSourceProtocolHandler"/>
 *     &lt;enumeration value="TibcoEMSSourceProtocolHandler"/>
 *     &lt;enumeration value="WebSphereJMSSourceProtocolHandler"/>
 *     &lt;enumeration value="MQFTESourceProtocolHandler"/>
 *     &lt;enumeration value="MQSourceProtocolHandler"/>
 *     &lt;enumeration value="SSHServerSourceProtocolHandler"/>
 *     &lt;enumeration value="StatelessTCPSourceProtocolHandler"/>
 *     &lt;enumeration value="XTCProtocolHandler"/>
 *     &lt;enumeration value="SQLDataSource"/>
 *     &lt;enumeration value="Statistics"/>
 *     &lt;enumeration value="StylePolicy"/>
 *     &lt;enumeration value="StylePolicyAction"/>
 *     &lt;enumeration value="StylePolicyRule"/>
 *     &lt;enumeration value="WSStylePolicyRule"/>
 *     &lt;enumeration value="Throttler"/>
 *     &lt;enumeration value="UDDIRegistry"/>
 *     &lt;enumeration value="URLMap"/>
 *     &lt;enumeration value="URLRefreshPolicy"/>
 *     &lt;enumeration value="URLRewritePolicy"/>
 *     &lt;enumeration value="User"/>
 *     &lt;enumeration value="UserGroup"/>
 *     &lt;enumeration value="WCCService"/>
 *     &lt;enumeration value="WebAppErrorHandlingPolicy"/>
 *     &lt;enumeration value="WebAppFW"/>
 *     &lt;enumeration value="WebAppRequest"/>
 *     &lt;enumeration value="WebAppResponse"/>
 *     &lt;enumeration value="WebAppSessionPolicy"/>
 *     &lt;enumeration value="WebServiceMonitor"/>
 *     &lt;enumeration value="WebServicesAgent"/>
 *     &lt;enumeration value="UDDISubscription"/>
 *     &lt;enumeration value="WSRRSavedSearchSubscription"/>
 *     &lt;enumeration value="WSRRSubscription"/>
 *     &lt;enumeration value="WSEndpointRewritePolicy"/>
 *     &lt;enumeration value="WSRRServer"/>
 *     &lt;enumeration value="WSStylePolicy"/>
 *     &lt;enumeration value="XMLManager"/>
 *     &lt;enumeration value="xmltrace"/>
 *     &lt;enumeration value="ZHybridTargetControlService"/>
 *     &lt;enumeration value="ZosNSSClient"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ModifyEnum")
@XmlEnum
public enum ModifyEnum {

    @XmlEnumValue("AAAPolicy")
    AAA_POLICY("AAAPolicy"),
    @XmlEnumValue("Domain")
    DOMAIN("Domain"),
    @XmlEnumValue("LDAPSearchParameters")
    LDAP_SEARCH_PARAMETERS("LDAPSearchParameters"),
    @XmlEnumValue("ProcessingMetadata")
    PROCESSING_METADATA("ProcessingMetadata"),
    @XmlEnumValue("RADIUSSettings")
    RADIUS_SETTINGS("RADIUSSettings"),
    @XmlEnumValue("RBMSettings")
    RBM_SETTINGS("RBMSettings"),
    @XmlEnumValue("SAMLAttributes")
    SAML_ATTRIBUTES("SAMLAttributes"),
    @XmlEnumValue("SOAPHeaderDisposition")
    SOAP_HEADER_DISPOSITION("SOAPHeaderDisposition"),
    TAM("TAM"),
    @XmlEnumValue("TFIMEndpoint")
    TFIM_ENDPOINT("TFIMEndpoint"),
    XACMLPDP("XACMLPDP"),
    @XmlEnumValue("AccessControlList")
    ACCESS_CONTROL_LIST("AccessControlList"),
    @XmlEnumValue("AppSecurityPolicy")
    APP_SECURITY_POLICY("AppSecurityPolicy"),
    @XmlEnumValue("CompactFlash")
    COMPACT_FLASH("CompactFlash"),
    @XmlEnumValue("CompileOptionsPolicy")
    COMPILE_OPTIONS_POLICY("CompileOptionsPolicy"),
    @XmlEnumValue("ConfigDeploymentPolicy")
    CONFIG_DEPLOYMENT_POLICY("ConfigDeploymentPolicy"),
    @XmlEnumValue("ConformancePolicy")
    CONFORMANCE_POLICY("ConformancePolicy"),
    @XmlEnumValue("CertMonitor")
    CERT_MONITOR("CertMonitor"),
    @XmlEnumValue("CRLFetch")
    CRL_FETCH("CRLFetch"),
    @XmlEnumValue("CryptoCertificate")
    CRYPTO_CERTIFICATE("CryptoCertificate"),
    @XmlEnumValue("CryptoFWCred")
    CRYPTO_FW_CRED("CryptoFWCred"),
    @XmlEnumValue("CryptoIdentCred")
    CRYPTO_IDENT_CRED("CryptoIdentCred"),
    @XmlEnumValue("CryptoKerberosKDC")
    CRYPTO_KERBEROS_KDC("CryptoKerberosKDC"),
    @XmlEnumValue("CryptoKerberosKeytab")
    CRYPTO_KERBEROS_KEYTAB("CryptoKerberosKeytab"),
    @XmlEnumValue("CryptoKey")
    CRYPTO_KEY("CryptoKey"),
    @XmlEnumValue("CryptoProfile")
    CRYPTO_PROFILE("CryptoProfile"),
    @XmlEnumValue("CryptoSSKey")
    CRYPTO_SS_KEY("CryptoSSKey"),
    @XmlEnumValue("CryptoValCred")
    CRYPTO_VAL_CRED("CryptoValCred"),
    @XmlEnumValue("SSHClientProfile")
    SSH_CLIENT_PROFILE("SSHClientProfile"),
    @XmlEnumValue("SSLProxyProfile")
    SSL_PROXY_PROFILE("SSLProxyProfile"),
    @XmlEnumValue("ErrorReportSettings")
    ERROR_REPORT_SETTINGS("ErrorReportSettings"),
    @XmlEnumValue("SystemSettings")
    SYSTEM_SETTINGS("SystemSettings"),
    @XmlEnumValue("TimeSettings")
    TIME_SETTINGS("TimeSettings"),
    @XmlEnumValue("SchemaExceptionMap")
    SCHEMA_EXCEPTION_MAP("SchemaExceptionMap"),
    @XmlEnumValue("DocumentCryptoMap")
    DOCUMENT_CRYPTO_MAP("DocumentCryptoMap"),
    @XmlEnumValue("XPathRoutingMap")
    X_PATH_ROUTING_MAP("XPathRoutingMap"),
    @XmlEnumValue("LogTarget")
    LOG_TARGET("LogTarget"),
    @XmlEnumValue("FormsLoginPolicy")
    FORMS_LOGIN_POLICY("FormsLoginPolicy"),
    @XmlEnumValue("FTPQuoteCommands")
    FTP_QUOTE_COMMANDS("FTPQuoteCommands"),
    @XmlEnumValue("MultiProtocolGateway")
    MULTI_PROTOCOL_GATEWAY("MultiProtocolGateway"),
    @XmlEnumValue("WSGateway")
    WS_GATEWAY("WSGateway"),
    @XmlEnumValue("HTTPInputConversionMap")
    HTTP_INPUT_CONVERSION_MAP("HTTPInputConversionMap"),
    @XmlEnumValue("HTTPUserAgent")
    HTTP_USER_AGENT("HTTPUserAgent"),
    @XmlEnumValue("ImportPackage")
    IMPORT_PACKAGE("ImportPackage"),
    @XmlEnumValue("IMSConnect")
    IMS_CONNECT("IMSConnect"),
    @XmlEnumValue("IncludeConfig")
    INCLUDE_CONFIG("IncludeConfig"),
    @XmlEnumValue("EthernetInterface")
    ETHERNET_INTERFACE("EthernetInterface"),
    @XmlEnumValue("VLANInterface")
    VLAN_INTERFACE("VLANInterface"),
    @XmlEnumValue("IPMILanChannel")
    IPMI_LAN_CHANNEL("IPMILanChannel"),
    @XmlEnumValue("IPMIUser")
    IPMI_USER("IPMIUser"),
    @XmlEnumValue("IScsiChapConfig")
    I_SCSI_CHAP_CONFIG("IScsiChapConfig"),
    @XmlEnumValue("IScsiHBAConfig")
    I_SCSI_HBA_CONFIG("IScsiHBAConfig"),
    @XmlEnumValue("IScsiInitiatorConfig")
    I_SCSI_INITIATOR_CONFIG("IScsiInitiatorConfig"),
    @XmlEnumValue("IScsiTargetConfig")
    I_SCSI_TARGET_CONFIG("IScsiTargetConfig"),
    @XmlEnumValue("IScsiVolumeConfig")
    I_SCSI_VOLUME_CONFIG("IScsiVolumeConfig"),
    @XmlEnumValue("TibcoEMSServer")
    TIBCO_EMS_SERVER("TibcoEMSServer"),
    @XmlEnumValue("WebSphereJMSServer")
    WEB_SPHERE_JMS_SERVER("WebSphereJMSServer"),
    @XmlEnumValue("LoadBalancerGroup")
    LOAD_BALANCER_GROUP("LoadBalancerGroup"),
    @XmlEnumValue("LogLabel")
    LOG_LABEL("LogLabel"),
    @XmlEnumValue("Matching")
    MATCHING("Matching"),
    @XmlEnumValue("FilterAction")
    FILTER_ACTION("FilterAction"),
    @XmlEnumValue("MessageMatching")
    MESSAGE_MATCHING("MessageMatching"),
    @XmlEnumValue("CountMonitor")
    COUNT_MONITOR("CountMonitor"),
    @XmlEnumValue("DurationMonitor")
    DURATION_MONITOR("DurationMonitor"),
    @XmlEnumValue("MessageType")
    MESSAGE_TYPE("MessageType"),
    MQGW("MQGW"),
    @XmlEnumValue("MQhost")
    M_QHOST("MQhost"),
    @XmlEnumValue("MQproxy")
    M_QPROXY("MQproxy"),
    MQQM("MQQM"),
    @XmlEnumValue("MQQMGroup")
    MQQM_GROUP("MQQMGroup"),
    @XmlEnumValue("MTOMPolicy")
    MTOM_POLICY("MTOMPolicy"),
    @XmlEnumValue("NameValueProfile")
    NAME_VALUE_PROFILE("NameValueProfile"),
    @XmlEnumValue("DNSNameService")
    DNS_NAME_SERVICE("DNSNameService"),
    @XmlEnumValue("HostAlias")
    HOST_ALIAS("HostAlias"),
    @XmlEnumValue("NetworkSettings")
    NETWORK_SETTINGS("NetworkSettings"),
    @XmlEnumValue("NTPService")
    NTP_SERVICE("NTPService"),
    @XmlEnumValue("NFSClientSettings")
    NFS_CLIENT_SETTINGS("NFSClientSettings"),
    @XmlEnumValue("NFSDynamicMounts")
    NFS_DYNAMIC_MOUNTS("NFSDynamicMounts"),
    @XmlEnumValue("NFSStaticMount")
    NFS_STATIC_MOUNT("NFSStaticMount"),
    @XmlEnumValue("PeerGroup")
    PEER_GROUP("PeerGroup"),
    @XmlEnumValue("PolicyAttachments")
    POLICY_ATTACHMENTS("PolicyAttachments"),
    @XmlEnumValue("PolicyParameters")
    POLICY_PARAMETERS("PolicyParameters"),
    @XmlEnumValue("RaidVolume")
    RAID_VOLUME("RaidVolume"),
    @XmlEnumValue("SQLRuntimeSettings")
    SQL_RUNTIME_SETTINGS("SQLRuntimeSettings"),
    @XmlEnumValue("SecureCloudConnector")
    SECURE_CLOUD_CONNECTOR("SecureCloudConnector"),
    @XmlEnumValue("MgmtInterface")
    MGMT_INTERFACE("MgmtInterface"),
    @XmlEnumValue("SSHService")
    SSH_SERVICE("SSHService"),
    @XmlEnumValue("TelnetService")
    TELNET_SERVICE("TelnetService"),
    @XmlEnumValue("WebGUI")
    WEB_GUI("WebGUI"),
    @XmlEnumValue("XMLFirewallService")
    XML_FIREWALL_SERVICE("XMLFirewallService"),
    @XmlEnumValue("XSLProxyService")
    XSL_PROXY_SERVICE("XSLProxyService"),
    @XmlEnumValue("HTTPService")
    HTTP_SERVICE("HTTPService"),
    @XmlEnumValue("SSLProxyService")
    SSL_PROXY_SERVICE("SSLProxyService"),
    @XmlEnumValue("TCPProxyService")
    TCP_PROXY_SERVICE("TCPProxyService"),
    @XmlEnumValue("XSLCoprocService")
    XSL_COPROC_SERVICE("XSLCoprocService"),
    @XmlEnumValue("ShellAlias")
    SHELL_ALIAS("ShellAlias"),
    @XmlEnumValue("SimpleCountMonitor")
    SIMPLE_COUNT_MONITOR("SimpleCountMonitor"),
    @XmlEnumValue("SLMAction")
    SLM_ACTION("SLMAction"),
    @XmlEnumValue("SLMCredClass")
    SLM_CRED_CLASS("SLMCredClass"),
    @XmlEnumValue("SLMPolicy")
    SLM_POLICY("SLMPolicy"),
    @XmlEnumValue("SLMRsrcClass")
    SLM_RSRC_CLASS("SLMRsrcClass"),
    @XmlEnumValue("SLMSchedule")
    SLM_SCHEDULE("SLMSchedule"),
    @XmlEnumValue("SNMPSettings")
    SNMP_SETTINGS("SNMPSettings"),
    @XmlEnumValue("FTPFilePollerSourceProtocolHandler")
    FTP_FILE_POLLER_SOURCE_PROTOCOL_HANDLER("FTPFilePollerSourceProtocolHandler"),
    @XmlEnumValue("NFSFilePollerSourceProtocolHandler")
    NFS_FILE_POLLER_SOURCE_PROTOCOL_HANDLER("NFSFilePollerSourceProtocolHandler"),
    @XmlEnumValue("SFTPFilePollerSourceProtocolHandler")
    SFTP_FILE_POLLER_SOURCE_PROTOCOL_HANDLER("SFTPFilePollerSourceProtocolHandler"),
    @XmlEnumValue("FTPServerSourceProtocolHandler")
    FTP_SERVER_SOURCE_PROTOCOL_HANDLER("FTPServerSourceProtocolHandler"),
    @XmlEnumValue("HTTPSourceProtocolHandler")
    HTTP_SOURCE_PROTOCOL_HANDLER("HTTPSourceProtocolHandler"),
    @XmlEnumValue("HTTPSSourceProtocolHandler")
    HTTPS_SOURCE_PROTOCOL_HANDLER("HTTPSSourceProtocolHandler"),
    @XmlEnumValue("IMSConnectSourceProtocolHandler")
    IMS_CONNECT_SOURCE_PROTOCOL_HANDLER("IMSConnectSourceProtocolHandler"),
    @XmlEnumValue("TibcoEMSSourceProtocolHandler")
    TIBCO_EMS_SOURCE_PROTOCOL_HANDLER("TibcoEMSSourceProtocolHandler"),
    @XmlEnumValue("WebSphereJMSSourceProtocolHandler")
    WEB_SPHERE_JMS_SOURCE_PROTOCOL_HANDLER("WebSphereJMSSourceProtocolHandler"),
    @XmlEnumValue("MQFTESourceProtocolHandler")
    MQFTE_SOURCE_PROTOCOL_HANDLER("MQFTESourceProtocolHandler"),
    @XmlEnumValue("MQSourceProtocolHandler")
    MQ_SOURCE_PROTOCOL_HANDLER("MQSourceProtocolHandler"),
    @XmlEnumValue("SSHServerSourceProtocolHandler")
    SSH_SERVER_SOURCE_PROTOCOL_HANDLER("SSHServerSourceProtocolHandler"),
    @XmlEnumValue("StatelessTCPSourceProtocolHandler")
    STATELESS_TCP_SOURCE_PROTOCOL_HANDLER("StatelessTCPSourceProtocolHandler"),
    @XmlEnumValue("XTCProtocolHandler")
    XTC_PROTOCOL_HANDLER("XTCProtocolHandler"),
    @XmlEnumValue("SQLDataSource")
    SQL_DATA_SOURCE("SQLDataSource"),
    @XmlEnumValue("Statistics")
    STATISTICS("Statistics"),
    @XmlEnumValue("StylePolicy")
    STYLE_POLICY("StylePolicy"),
    @XmlEnumValue("StylePolicyAction")
    STYLE_POLICY_ACTION("StylePolicyAction"),
    @XmlEnumValue("StylePolicyRule")
    STYLE_POLICY_RULE("StylePolicyRule"),
    @XmlEnumValue("WSStylePolicyRule")
    WS_STYLE_POLICY_RULE("WSStylePolicyRule"),
    @XmlEnumValue("Throttler")
    THROTTLER("Throttler"),
    @XmlEnumValue("UDDIRegistry")
    UDDI_REGISTRY("UDDIRegistry"),
    @XmlEnumValue("URLMap")
    URL_MAP("URLMap"),
    @XmlEnumValue("URLRefreshPolicy")
    URL_REFRESH_POLICY("URLRefreshPolicy"),
    @XmlEnumValue("URLRewritePolicy")
    URL_REWRITE_POLICY("URLRewritePolicy"),
    @XmlEnumValue("User")
    USER("User"),
    @XmlEnumValue("UserGroup")
    USER_GROUP("UserGroup"),
    @XmlEnumValue("WCCService")
    WCC_SERVICE("WCCService"),
    @XmlEnumValue("WebAppErrorHandlingPolicy")
    WEB_APP_ERROR_HANDLING_POLICY("WebAppErrorHandlingPolicy"),
    @XmlEnumValue("WebAppFW")
    WEB_APP_FW("WebAppFW"),
    @XmlEnumValue("WebAppRequest")
    WEB_APP_REQUEST("WebAppRequest"),
    @XmlEnumValue("WebAppResponse")
    WEB_APP_RESPONSE("WebAppResponse"),
    @XmlEnumValue("WebAppSessionPolicy")
    WEB_APP_SESSION_POLICY("WebAppSessionPolicy"),
    @XmlEnumValue("WebServiceMonitor")
    WEB_SERVICE_MONITOR("WebServiceMonitor"),
    @XmlEnumValue("WebServicesAgent")
    WEB_SERVICES_AGENT("WebServicesAgent"),
    @XmlEnumValue("UDDISubscription")
    UDDI_SUBSCRIPTION("UDDISubscription"),
    @XmlEnumValue("WSRRSavedSearchSubscription")
    WSRR_SAVED_SEARCH_SUBSCRIPTION("WSRRSavedSearchSubscription"),
    @XmlEnumValue("WSRRSubscription")
    WSRR_SUBSCRIPTION("WSRRSubscription"),
    @XmlEnumValue("WSEndpointRewritePolicy")
    WS_ENDPOINT_REWRITE_POLICY("WSEndpointRewritePolicy"),
    @XmlEnumValue("WSRRServer")
    WSRR_SERVER("WSRRServer"),
    @XmlEnumValue("WSStylePolicy")
    WS_STYLE_POLICY("WSStylePolicy"),
    @XmlEnumValue("XMLManager")
    XML_MANAGER("XMLManager"),
    @XmlEnumValue("xmltrace")
    XMLTRACE("xmltrace"),
    @XmlEnumValue("ZHybridTargetControlService")
    Z_HYBRID_TARGET_CONTROL_SERVICE("ZHybridTargetControlService"),
    @XmlEnumValue("ZosNSSClient")
    ZOS_NSS_CLIENT("ZosNSSClient");
    private final String value;

    ModifyEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ModifyEnum fromValue(String v) {
        for (ModifyEnum c: ModifyEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
