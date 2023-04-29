
package client.soma.generated;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AnyStatusElement complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AnyStatusElement">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice maxOccurs="unbounded">
 *         &lt;element name="ActiveUsers" type="{http://www.datapower.com/schemas/management}StatusActiveUsers"/>
 *         &lt;element name="ARPStatus" type="{http://www.datapower.com/schemas/management}StatusARPStatus"/>
 *         &lt;element name="AS1PollerSourceProtocolHandlerSummary" type="{http://www.datapower.com/schemas/management}StatusAS1PollerSourceProtocolHandlerSummary"/>
 *         &lt;element name="AS2SourceProtocolHandlerSummary" type="{http://www.datapower.com/schemas/management}StatusAS2SourceProtocolHandlerSummary"/>
 *         &lt;element name="AS3SourceProtocolHandlerSummary" type="{http://www.datapower.com/schemas/management}StatusAS3SourceProtocolHandlerSummary"/>
 *         &lt;element name="B2BGatewaySummary" type="{http://www.datapower.com/schemas/management}StatusB2BGatewaySummary"/>
 *         &lt;element name="Battery" type="{http://www.datapower.com/schemas/management}StatusBattery"/>
 *         &lt;element name="ConnectionsAccepted" type="{http://www.datapower.com/schemas/management}StatusConnectionsAccepted"/>
 *         &lt;element name="CPUUsage" type="{http://www.datapower.com/schemas/management}StatusCPUUsage"/>
 *         &lt;element name="CryptoEngineStatus" type="{http://www.datapower.com/schemas/management}StatusCryptoEngineStatus"/>
 *         &lt;element name="CurrentSensors" type="{http://www.datapower.com/schemas/management}StatusCurrentSensors"/>
 *         &lt;element name="DateTimeStatus" type="{http://www.datapower.com/schemas/management}StatusDateTimeStatus"/>
 *         &lt;element name="DNSCacheHostStatus" type="{http://www.datapower.com/schemas/management}StatusDNSCacheHostStatus"/>
 *         &lt;element name="DNSCacheHostStatus2" type="{http://www.datapower.com/schemas/management}StatusDNSCacheHostStatus2"/>
 *         &lt;element name="DNSNameServerStatus" type="{http://www.datapower.com/schemas/management}StatusDNSNameServerStatus"/>
 *         &lt;element name="DNSNameServerStatus2" type="{http://www.datapower.com/schemas/management}StatusDNSNameServerStatus2"/>
 *         &lt;element name="DNSSearchDomainStatus" type="{http://www.datapower.com/schemas/management}StatusDNSSearchDomainStatus"/>
 *         &lt;element name="DNSStaticHostStatus" type="{http://www.datapower.com/schemas/management}StatusDNSStaticHostStatus"/>
 *         &lt;element name="DocumentCachingSummary" type="{http://www.datapower.com/schemas/management}StatusDocumentCachingSummary"/>
 *         &lt;element name="DocumentStatus" type="{http://www.datapower.com/schemas/management}StatusDocumentStatus"/>
 *         &lt;element name="DocumentStatusSimpleIndex" type="{http://www.datapower.com/schemas/management}StatusDocumentStatusSimpleIndex"/>
 *         &lt;element name="DomainCheckpointStatus" type="{http://www.datapower.com/schemas/management}StatusDomainCheckpointStatus"/>
 *         &lt;element name="DomainsMemoryStatus" type="{http://www.datapower.com/schemas/management}StatusDomainsMemoryStatus"/>
 *         &lt;element name="DomainStatus" type="{http://www.datapower.com/schemas/management}StatusDomainStatus"/>
 *         &lt;element name="DomainSummary" type="{http://www.datapower.com/schemas/management}StatusDomainSummary"/>
 *         &lt;element name="DynamicQueueManager" type="{http://www.datapower.com/schemas/management}StatusDynamicQueueManager"/>
 *         &lt;element name="DynamicTibcoEMSStatus" type="{http://www.datapower.com/schemas/management}StatusDynamicTibcoEMSStatus"/>
 *         &lt;element name="EBMS2SourceProtocolHandlerSummary" type="{http://www.datapower.com/schemas/management}StatusEBMS2SourceProtocolHandlerSummary"/>
 *         &lt;element name="EnvironmentalFanSensors" type="{http://www.datapower.com/schemas/management}StatusEnvironmentalFanSensors"/>
 *         &lt;element name="EnvironmentalSensors" type="{http://www.datapower.com/schemas/management}StatusEnvironmentalSensors"/>
 *         &lt;element name="EthernetCountersStatus" type="{http://www.datapower.com/schemas/management}StatusEthernetCountersStatus"/>
 *         &lt;element name="EthernetInterfaceStatus" type="{http://www.datapower.com/schemas/management}StatusEthernetInterfaceStatus"/>
 *         &lt;element name="EthernetMAUStatus" type="{http://www.datapower.com/schemas/management}StatusEthernetMAUStatus"/>
 *         &lt;element name="EthernetMIIRegisterStatus" type="{http://www.datapower.com/schemas/management}StatusEthernetMIIRegisterStatus"/>
 *         &lt;element name="FailureNotificationStatus" type="{http://www.datapower.com/schemas/management}StatusFailureNotificationStatus"/>
 *         &lt;element name="FailureNotificationStatus2" type="{http://www.datapower.com/schemas/management}StatusFailureNotificationStatus2"/>
 *         &lt;element name="FilePollerStatus" type="{http://www.datapower.com/schemas/management}StatusFilePollerStatus"/>
 *         &lt;element name="FilesystemStatus" type="{http://www.datapower.com/schemas/management}StatusFilesystemStatus"/>
 *         &lt;element name="FirmwareStatus" type="{http://www.datapower.com/schemas/management}StatusFirmwareStatus"/>
 *         &lt;element name="FirmwareVersion" type="{http://www.datapower.com/schemas/management}StatusFirmwareVersion"/>
 *         &lt;element name="FTPFilePollerSourceProtocolHandlerSummary" type="{http://www.datapower.com/schemas/management}StatusFTPFilePollerSourceProtocolHandlerSummary"/>
 *         &lt;element name="FTPServerSourceProtocolHandlerSummary" type="{http://www.datapower.com/schemas/management}StatusFTPServerSourceProtocolHandlerSummary"/>
 *         &lt;element name="HSMKeyStatus" type="{http://www.datapower.com/schemas/management}StatusHSMKeyStatus"/>
 *         &lt;element name="HTTPConnections" type="{http://www.datapower.com/schemas/management}StatusHTTPConnections"/>
 *         &lt;element name="HTTPConnectionsCreated" type="{http://www.datapower.com/schemas/management}StatusHTTPConnectionsCreated"/>
 *         &lt;element name="HTTPConnectionsDestroyed" type="{http://www.datapower.com/schemas/management}StatusHTTPConnectionsDestroyed"/>
 *         &lt;element name="HTTPConnectionsOffered" type="{http://www.datapower.com/schemas/management}StatusHTTPConnectionsOffered"/>
 *         &lt;element name="HTTPConnectionsRequested" type="{http://www.datapower.com/schemas/management}StatusHTTPConnectionsRequested"/>
 *         &lt;element name="HTTPConnectionsReturned" type="{http://www.datapower.com/schemas/management}StatusHTTPConnectionsReturned"/>
 *         &lt;element name="HTTPConnectionsReused" type="{http://www.datapower.com/schemas/management}StatusHTTPConnectionsReused"/>
 *         &lt;element name="HTTPMeanTransactionTime" type="{http://www.datapower.com/schemas/management}StatusHTTPMeanTransactionTime"/>
 *         &lt;element name="HTTPMeanTransactionTime2" type="{http://www.datapower.com/schemas/management}StatusHTTPMeanTransactionTime2"/>
 *         &lt;element name="HTTPServiceSummary" type="{http://www.datapower.com/schemas/management}StatusHTTPServiceSummary"/>
 *         &lt;element name="HTTPSourceProtocolHandlerSummary" type="{http://www.datapower.com/schemas/management}StatusHTTPSourceProtocolHandlerSummary"/>
 *         &lt;element name="HTTPSSourceProtocolHandlerSummary" type="{http://www.datapower.com/schemas/management}StatusHTTPSSourceProtocolHandlerSummary"/>
 *         &lt;element name="HTTPTransactions" type="{http://www.datapower.com/schemas/management}StatusHTTPTransactions"/>
 *         &lt;element name="HTTPTransactions2" type="{http://www.datapower.com/schemas/management}StatusHTTPTransactions2"/>
 *         &lt;element name="IGMPStatus" type="{http://www.datapower.com/schemas/management}StatusIGMPStatus"/>
 *         &lt;element name="IMSConnectSourceProtocolHandlerSummary" type="{http://www.datapower.com/schemas/management}StatusIMSConnectSourceProtocolHandlerSummary"/>
 *         &lt;element name="IMSConnectstatus" type="{http://www.datapower.com/schemas/management}StatusIMSConnectstatus"/>
 *         &lt;element name="IPMISelEvents" type="{http://www.datapower.com/schemas/management}StatusIPMISelEvents"/>
 *         &lt;element name="IScsiHBAStatus" type="{http://www.datapower.com/schemas/management}StatusIScsiHBAStatus"/>
 *         &lt;element name="IScsiInitiatorStatus" type="{http://www.datapower.com/schemas/management}StatusIScsiInitiatorStatus"/>
 *         &lt;element name="IScsiTargetStatus" type="{http://www.datapower.com/schemas/management}StatusIScsiTargetStatus"/>
 *         &lt;element name="IScsiVolumeStatus" type="{http://www.datapower.com/schemas/management}StatusIScsiVolumeStatus"/>
 *         &lt;element name="LibraryVersion" type="{http://www.datapower.com/schemas/management}StatusLibraryVersion"/>
 *         &lt;element name="LicenseStatus" type="{http://www.datapower.com/schemas/management}StatusLicenseStatus"/>
 *         &lt;element name="LLMPolicySummary" type="{http://www.datapower.com/schemas/management}StatusLLMPolicySummary"/>
 *         &lt;element name="LLMSourceProtocolHandlerSummary" type="{http://www.datapower.com/schemas/management}StatusLLMSourceProtocolHandlerSummary"/>
 *         &lt;element name="LoadBalancerStatus" type="{http://www.datapower.com/schemas/management}StatusLoadBalancerStatus"/>
 *         &lt;element name="LoadBalancerStatus2" type="{http://www.datapower.com/schemas/management}StatusLoadBalancerStatus2"/>
 *         &lt;element name="LogTargetStatus" type="{http://www.datapower.com/schemas/management}StatusLogTargetStatus"/>
 *         &lt;element name="MemoryStatus" type="{http://www.datapower.com/schemas/management}StatusMemoryStatus"/>
 *         &lt;element name="MessageCountFilters" type="{http://www.datapower.com/schemas/management}StatusMessageCountFilters"/>
 *         &lt;element name="MessageCounts" type="{http://www.datapower.com/schemas/management}StatusMessageCounts"/>
 *         &lt;element name="MessageDurationFilters" type="{http://www.datapower.com/schemas/management}StatusMessageDurationFilters"/>
 *         &lt;element name="MessageDurations" type="{http://www.datapower.com/schemas/management}StatusMessageDurations"/>
 *         &lt;element name="MessageSources" type="{http://www.datapower.com/schemas/management}StatusMessageSources"/>
 *         &lt;element name="MQFTESourceProtocolHandlerSummary" type="{http://www.datapower.com/schemas/management}StatusMQFTESourceProtocolHandlerSummary"/>
 *         &lt;element name="MQQMstatus" type="{http://www.datapower.com/schemas/management}StatusMQQMstatus"/>
 *         &lt;element name="MQSourceProtocolHandlerSummary" type="{http://www.datapower.com/schemas/management}StatusMQSourceProtocolHandlerSummary"/>
 *         &lt;element name="MQStatus" type="{http://www.datapower.com/schemas/management}StatusMQStatus"/>
 *         &lt;element name="MultiProtocolGatewaySummary" type="{http://www.datapower.com/schemas/management}StatusMultiProtocolGatewaySummary"/>
 *         &lt;element name="NDCacheStatus" type="{http://www.datapower.com/schemas/management}StatusNDCacheStatus"/>
 *         &lt;element name="NetworkInterfaceStatus" type="{http://www.datapower.com/schemas/management}StatusNetworkInterfaceStatus"/>
 *         &lt;element name="NetworkReceiveDataThroughput" type="{http://www.datapower.com/schemas/management}StatusNetworkReceiveDataThroughput"/>
 *         &lt;element name="NetworkReceivePacketThroughput" type="{http://www.datapower.com/schemas/management}StatusNetworkReceivePacketThroughput"/>
 *         &lt;element name="NetworkTransmitDataThroughput" type="{http://www.datapower.com/schemas/management}StatusNetworkTransmitDataThroughput"/>
 *         &lt;element name="NetworkTransmitPacketThroughput" type="{http://www.datapower.com/schemas/management}StatusNetworkTransmitPacketThroughput"/>
 *         &lt;element name="NFSFilePollerSourceProtocolHandlerSummary" type="{http://www.datapower.com/schemas/management}StatusNFSFilePollerSourceProtocolHandlerSummary"/>
 *         &lt;element name="NFSMountStatus" type="{http://www.datapower.com/schemas/management}StatusNFSMountStatus"/>
 *         &lt;element name="NTPRefreshStatus" type="{http://www.datapower.com/schemas/management}StatusNTPRefreshStatus"/>
 *         &lt;element name="ObjectStatus" type="{http://www.datapower.com/schemas/management}StatusObjectStatus"/>
 *         &lt;element name="OtherSensors" type="{http://www.datapower.com/schemas/management}StatusOtherSensors"/>
 *         &lt;element name="PCIBus" type="{http://www.datapower.com/schemas/management}StatusPCIBus"/>
 *         &lt;element name="POPPollerSourceProtocolHandlerSummary" type="{http://www.datapower.com/schemas/management}StatusPOPPollerSourceProtocolHandlerSummary"/>
 *         &lt;element name="PortStatus" type="{http://www.datapower.com/schemas/management}StatusPortStatus"/>
 *         &lt;element name="PowerSensors" type="{http://www.datapower.com/schemas/management}StatusPowerSensors"/>
 *         &lt;element name="RaidArrayStatus" type="{http://www.datapower.com/schemas/management}StatusRaidArrayStatus"/>
 *         &lt;element name="RaidBatteryBackUpStatus" type="{http://www.datapower.com/schemas/management}StatusRaidBatteryBackUpStatus"/>
 *         &lt;element name="RaidLogicalDriveStatus" type="{http://www.datapower.com/schemas/management}StatusRaidLogicalDriveStatus"/>
 *         &lt;element name="RaidPartitionStatus" type="{http://www.datapower.com/schemas/management}StatusRaidPartitionStatus"/>
 *         &lt;element name="RaidPhysDiskStatus" type="{http://www.datapower.com/schemas/management}StatusRaidPhysDiskStatus"/>
 *         &lt;element name="RaidPhysDiskStatus2" type="{http://www.datapower.com/schemas/management}StatusRaidPhysDiskStatus2"/>
 *         &lt;element name="RaidPhysicalDriveStatus" type="{http://www.datapower.com/schemas/management}StatusRaidPhysicalDriveStatus"/>
 *         &lt;element name="RaidVolumeStatus" type="{http://www.datapower.com/schemas/management}StatusRaidVolumeStatus"/>
 *         &lt;element name="RaidVolumeStatus2" type="{http://www.datapower.com/schemas/management}StatusRaidVolumeStatus2"/>
 *         &lt;element name="ReceiveKbpsThroughput" type="{http://www.datapower.com/schemas/management}StatusReceiveKbpsThroughput"/>
 *         &lt;element name="ReceivePacketThroughput" type="{http://www.datapower.com/schemas/management}StatusReceivePacketThroughput"/>
 *         &lt;element name="RoutingStatus" type="{http://www.datapower.com/schemas/management}StatusRoutingStatus"/>
 *         &lt;element name="RoutingStatus2" type="{http://www.datapower.com/schemas/management}StatusRoutingStatus2"/>
 *         &lt;element name="SecureCloudConnectorConnectionsStatus" type="{http://www.datapower.com/schemas/management}StatusSecureCloudConnectorConnectionsStatus"/>
 *         &lt;element name="SelfBalancedStatus" type="{http://www.datapower.com/schemas/management}StatusSelfBalancedStatus"/>
 *         &lt;element name="SelfBalancedTable" type="{http://www.datapower.com/schemas/management}StatusSelfBalancedTable"/>
 *         &lt;element name="ServicesMemoryStatus" type="{http://www.datapower.com/schemas/management}StatusServicesMemoryStatus"/>
 *         &lt;element name="ServicesStatus" type="{http://www.datapower.com/schemas/management}StatusServicesStatus"/>
 *         &lt;element name="SFTPFilePollerSourceProtocolHandlerSummary" type="{http://www.datapower.com/schemas/management}StatusSFTPFilePollerSourceProtocolHandlerSummary"/>
 *         &lt;element name="SLMPeeringStatus" type="{http://www.datapower.com/schemas/management}StatusSLMPeeringStatus"/>
 *         &lt;element name="SLMSummaryStatus" type="{http://www.datapower.com/schemas/management}StatusSLMSummaryStatus"/>
 *         &lt;element name="SNMPStatus" type="{http://www.datapower.com/schemas/management}StatusSNMPStatus"/>
 *         &lt;element name="SQLRuntimeStatus" type="{http://www.datapower.com/schemas/management}StatusSQLRuntimeStatus"/>
 *         &lt;element name="SQLStatus" type="{http://www.datapower.com/schemas/management}StatusSQLStatus"/>
 *         &lt;element name="SSHKnownHostFileStatus" type="{http://www.datapower.com/schemas/management}StatusSSHKnownHostFileStatus"/>
 *         &lt;element name="SSHKnownHostStatus" type="{http://www.datapower.com/schemas/management}StatusSSHKnownHostStatus"/>
 *         &lt;element name="SSHServerSourceProtocolHandlerSummary" type="{http://www.datapower.com/schemas/management}StatusSSHServerSourceProtocolHandlerSummary"/>
 *         &lt;element name="SSHTrustedHostStatus" type="{http://www.datapower.com/schemas/management}StatusSSHTrustedHostStatus"/>
 *         &lt;element name="SSLProxyServiceSummary" type="{http://www.datapower.com/schemas/management}StatusSSLProxyServiceSummary"/>
 *         &lt;element name="StandbyStatus" type="{http://www.datapower.com/schemas/management}StatusStandbyStatus"/>
 *         &lt;element name="StatelessTCPSourceProtocolHandlerSummary" type="{http://www.datapower.com/schemas/management}StatusStatelessTCPSourceProtocolHandlerSummary"/>
 *         &lt;element name="StylesheetCachingSummary" type="{http://www.datapower.com/schemas/management}StatusStylesheetCachingSummary"/>
 *         &lt;element name="StylesheetExecutions" type="{http://www.datapower.com/schemas/management}StatusStylesheetExecutions"/>
 *         &lt;element name="StylesheetExecutionsSimpleIndex" type="{http://www.datapower.com/schemas/management}StatusStylesheetExecutionsSimpleIndex"/>
 *         &lt;element name="StylesheetMeanExecutionTime" type="{http://www.datapower.com/schemas/management}StatusStylesheetMeanExecutionTime"/>
 *         &lt;element name="StylesheetMeanExecutionTimeSimpleIndex" type="{http://www.datapower.com/schemas/management}StatusStylesheetMeanExecutionTimeSimpleIndex"/>
 *         &lt;element name="StylesheetProfiles" type="{http://www.datapower.com/schemas/management}StatusStylesheetProfiles"/>
 *         &lt;element name="StylesheetProfilesSimpleIndex" type="{http://www.datapower.com/schemas/management}StatusStylesheetProfilesSimpleIndex"/>
 *         &lt;element name="StylesheetStatus" type="{http://www.datapower.com/schemas/management}StatusStylesheetStatus"/>
 *         &lt;element name="StylesheetStatusSimpleIndex" type="{http://www.datapower.com/schemas/management}StatusStylesheetStatusSimpleIndex"/>
 *         &lt;element name="SystemUsage" type="{http://www.datapower.com/schemas/management}StatusSystemUsage"/>
 *         &lt;element name="SystemUsage2Table" type="{http://www.datapower.com/schemas/management}StatusSystemUsage2Table"/>
 *         &lt;element name="SystemUsageTable" type="{http://www.datapower.com/schemas/management}StatusSystemUsageTable"/>
 *         &lt;element name="TCPProxyServiceSummary" type="{http://www.datapower.com/schemas/management}StatusTCPProxyServiceSummary"/>
 *         &lt;element name="TCPSummary" type="{http://www.datapower.com/schemas/management}StatusTCPSummary"/>
 *         &lt;element name="TCPTable" type="{http://www.datapower.com/schemas/management}StatusTCPTable"/>
 *         &lt;element name="TemperatureSensors" type="{http://www.datapower.com/schemas/management}StatusTemperatureSensors"/>
 *         &lt;element name="TibcoEMSSourceProtocolHandlerSummary" type="{http://www.datapower.com/schemas/management}StatusTibcoEMSSourceProtocolHandlerSummary"/>
 *         &lt;element name="TibcoEMSStatus" type="{http://www.datapower.com/schemas/management}StatusTibcoEMSStatus"/>
 *         &lt;element name="TransmitKbpsThroughput" type="{http://www.datapower.com/schemas/management}StatusTransmitKbpsThroughput"/>
 *         &lt;element name="TransmitPacketThroughput" type="{http://www.datapower.com/schemas/management}StatusTransmitPacketThroughput"/>
 *         &lt;element name="TRVPolicySummary" type="{http://www.datapower.com/schemas/management}StatusTRVPolicySummary"/>
 *         &lt;element name="TRVSourceProtocolHandlerSummary" type="{http://www.datapower.com/schemas/management}StatusTRVSourceProtocolHandlerSummary"/>
 *         &lt;element name="UDDISubscriptionKeyStatusSimpleIndex" type="{http://www.datapower.com/schemas/management}StatusUDDISubscriptionKeyStatusSimpleIndex"/>
 *         &lt;element name="UDDISubscriptionServiceStatusSimpleIndex" type="{http://www.datapower.com/schemas/management}StatusUDDISubscriptionServiceStatusSimpleIndex"/>
 *         &lt;element name="UDDISubscriptionStatusSimpleIndex" type="{http://www.datapower.com/schemas/management}StatusUDDISubscriptionStatusSimpleIndex"/>
 *         &lt;element name="Version" type="{http://www.datapower.com/schemas/management}StatusVersion"/>
 *         &lt;element name="VlanInterfaceStatus" type="{http://www.datapower.com/schemas/management}StatusVlanInterfaceStatus"/>
 *         &lt;element name="VoltageSensors" type="{http://www.datapower.com/schemas/management}StatusVoltageSensors"/>
 *         &lt;element name="WebAppFwAccepted" type="{http://www.datapower.com/schemas/management}StatusWebAppFwAccepted"/>
 *         &lt;element name="WebAppFwRejected" type="{http://www.datapower.com/schemas/management}StatusWebAppFwRejected"/>
 *         &lt;element name="WebAppFWSummary" type="{http://www.datapower.com/schemas/management}StatusWebAppFWSummary"/>
 *         &lt;element name="WebSphereJMSSourceProtocolHandlerSummary" type="{http://www.datapower.com/schemas/management}StatusWebSphereJMSSourceProtocolHandlerSummary"/>
 *         &lt;element name="WebSphereJMSStatus" type="{http://www.datapower.com/schemas/management}StatusWebSphereJMSStatus"/>
 *         &lt;element name="WSGatewaySummary" type="{http://www.datapower.com/schemas/management}StatusWSGatewaySummary"/>
 *         &lt;element name="WSMAgentSpoolers" type="{http://www.datapower.com/schemas/management}StatusWSMAgentSpoolers"/>
 *         &lt;element name="WSMAgentStatus" type="{http://www.datapower.com/schemas/management}StatusWSMAgentStatus"/>
 *         &lt;element name="WSOperationMetrics" type="{http://www.datapower.com/schemas/management}StatusWSOperationMetrics"/>
 *         &lt;element name="WSOperationMetricsSimpleIndex" type="{http://www.datapower.com/schemas/management}StatusWSOperationMetricsSimpleIndex"/>
 *         &lt;element name="WSOperationsStatus" type="{http://www.datapower.com/schemas/management}StatusWSOperationsStatus"/>
 *         &lt;element name="WSOperationsStatusSimpleIndex" type="{http://www.datapower.com/schemas/management}StatusWSOperationsStatusSimpleIndex"/>
 *         &lt;element name="WSRRSavdSrchSubsPolicyAttachmentsStatus" type="{http://www.datapower.com/schemas/management}StatusWSRRSavdSrchSubsPolicyAttachmentsStatus"/>
 *         &lt;element name="WSRRSavedSearchSubscriptionServiceStatus" type="{http://www.datapower.com/schemas/management}StatusWSRRSavedSearchSubscriptionServiceStatus"/>
 *         &lt;element name="WSRRSavedSearchSubscriptionStatus" type="{http://www.datapower.com/schemas/management}StatusWSRRSavedSearchSubscriptionStatus"/>
 *         &lt;element name="WSRRSubscriptionPolicyAttachmentsStatus" type="{http://www.datapower.com/schemas/management}StatusWSRRSubscriptionPolicyAttachmentsStatus"/>
 *         &lt;element name="WSRRSubscriptionServiceStatus" type="{http://www.datapower.com/schemas/management}StatusWSRRSubscriptionServiceStatus"/>
 *         &lt;element name="WSRRSubscriptionStatus" type="{http://www.datapower.com/schemas/management}StatusWSRRSubscriptionStatus"/>
 *         &lt;element name="WSWSDLStatus" type="{http://www.datapower.com/schemas/management}StatusWSWSDLStatus"/>
 *         &lt;element name="WSWSDLStatusSimpleIndex" type="{http://www.datapower.com/schemas/management}StatusWSWSDLStatusSimpleIndex"/>
 *         &lt;element name="XMLFirewallServiceSummary" type="{http://www.datapower.com/schemas/management}StatusXMLFirewallServiceSummary"/>
 *         &lt;element name="XMLNamesStatus" type="{http://www.datapower.com/schemas/management}StatusXMLNamesStatus"/>
 *         &lt;element name="XSLCoprocServiceSummary" type="{http://www.datapower.com/schemas/management}StatusXSLCoprocServiceSummary"/>
 *         &lt;element name="XSLProxyServiceSummary" type="{http://www.datapower.com/schemas/management}StatusXSLProxyServiceSummary"/>
 *         &lt;element name="XTCProtocolHandlerSummary" type="{http://www.datapower.com/schemas/management}StatusXTCProtocolHandlerSummary"/>
 *         &lt;element name="ZHybridTCSstatus" type="{http://www.datapower.com/schemas/management}StatusZHybridTCSstatus"/>
 *         &lt;element name="ZosNSSstatus" type="{http://www.datapower.com/schemas/management}StatusZosNSSstatus"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AnyStatusElement", propOrder = {
    "activeUsersOrARPStatusOrAS1PollerSourceProtocolHandlerSummary"
})
public class AnyStatusElement {

    @XmlElements({
        @XmlElement(name = "ObjectStatus", type = StatusObjectStatus.class),
        @XmlElement(name = "WSMAgentStatus", type = StatusWSMAgentStatus.class),
        @XmlElement(name = "TransmitKbpsThroughput", type = StatusTransmitKbpsThroughput.class),
        @XmlElement(name = "NetworkReceiveDataThroughput", type = StatusNetworkReceiveDataThroughput.class),
        @XmlElement(name = "CryptoEngineStatus", type = StatusCryptoEngineStatus.class),
        @XmlElement(name = "WSRRSavdSrchSubsPolicyAttachmentsStatus", type = StatusWSRRSavdSrchSubsPolicyAttachmentsStatus.class),
        @XmlElement(name = "DateTimeStatus", type = StatusDateTimeStatus.class),
        @XmlElement(name = "HTTPServiceSummary", type = StatusHTTPServiceSummary.class),
        @XmlElement(name = "SystemUsage2Table", type = StatusSystemUsage2Table.class),
        @XmlElement(name = "TCPSummary", type = StatusTCPSummary.class),
        @XmlElement(name = "SSHKnownHostFileStatus", type = StatusSSHKnownHostFileStatus.class),
        @XmlElement(name = "RaidLogicalDriveStatus", type = StatusRaidLogicalDriveStatus.class),
        @XmlElement(name = "AS3SourceProtocolHandlerSummary", type = StatusAS3SourceProtocolHandlerSummary.class),
        @XmlElement(name = "LLMPolicySummary", type = StatusLLMPolicySummary.class),
        @XmlElement(name = "StylesheetProfilesSimpleIndex", type = StatusStylesheetProfilesSimpleIndex.class),
        @XmlElement(name = "StylesheetCachingSummary", type = StatusStylesheetCachingSummary.class),
        @XmlElement(name = "SSHServerSourceProtocolHandlerSummary", type = StatusSSHServerSourceProtocolHandlerSummary.class),
        @XmlElement(name = "SelfBalancedStatus", type = StatusSelfBalancedStatus.class),
        @XmlElement(name = "MQSourceProtocolHandlerSummary", type = StatusMQSourceProtocolHandlerSummary.class),
        @XmlElement(name = "EthernetInterfaceStatus", type = StatusEthernetInterfaceStatus.class),
        @XmlElement(name = "PortStatus", type = StatusPortStatus.class),
        @XmlElement(name = "WSOperationMetricsSimpleIndex", type = StatusWSOperationMetricsSimpleIndex.class),
        @XmlElement(name = "MessageDurationFilters", type = StatusMessageDurationFilters.class),
        @XmlElement(name = "DNSCacheHostStatus", type = StatusDNSCacheHostStatus.class),
        @XmlElement(name = "ReceivePacketThroughput", type = StatusReceivePacketThroughput.class),
        @XmlElement(name = "UDDISubscriptionStatusSimpleIndex", type = StatusUDDISubscriptionStatusSimpleIndex.class),
        @XmlElement(name = "DNSNameServerStatus2", type = StatusDNSNameServerStatus2 .class),
        @XmlElement(name = "DNSCacheHostStatus2", type = StatusDNSCacheHostStatus2 .class),
        @XmlElement(name = "TransmitPacketThroughput", type = StatusTransmitPacketThroughput.class),
        @XmlElement(name = "ReceiveKbpsThroughput", type = StatusReceiveKbpsThroughput.class),
        @XmlElement(name = "NetworkTransmitDataThroughput", type = StatusNetworkTransmitDataThroughput.class),
        @XmlElement(name = "TCPTable", type = StatusTCPTable.class),
        @XmlElement(name = "FilePollerStatus", type = StatusFilePollerStatus.class),
        @XmlElement(name = "DynamicTibcoEMSStatus", type = StatusDynamicTibcoEMSStatus.class),
        @XmlElement(name = "EthernetCountersStatus", type = StatusEthernetCountersStatus.class),
        @XmlElement(name = "EnvironmentalSensors", type = StatusEnvironmentalSensors.class),
        @XmlElement(name = "LogTargetStatus", type = StatusLogTargetStatus.class),
        @XmlElement(name = "SSLProxyServiceSummary", type = StatusSSLProxyServiceSummary.class),
        @XmlElement(name = "DomainStatus", type = StatusDomainStatus.class),
        @XmlElement(name = "HTTPTransactions2", type = StatusHTTPTransactions2 .class),
        @XmlElement(name = "LLMSourceProtocolHandlerSummary", type = StatusLLMSourceProtocolHandlerSummary.class),
        @XmlElement(name = "StandbyStatus", type = StatusStandbyStatus.class),
        @XmlElement(name = "ActiveUsers", type = StatusActiveUsers.class),
        @XmlElement(name = "WSWSDLStatusSimpleIndex", type = StatusWSWSDLStatusSimpleIndex.class),
        @XmlElement(name = "WSRRSubscriptionStatus", type = StatusWSRRSubscriptionStatus.class),
        @XmlElement(name = "DocumentStatusSimpleIndex", type = StatusDocumentStatusSimpleIndex.class),
        @XmlElement(name = "IScsiVolumeStatus", type = StatusIScsiVolumeStatus.class),
        @XmlElement(name = "WSOperationsStatusSimpleIndex", type = StatusWSOperationsStatusSimpleIndex.class),
        @XmlElement(name = "SelfBalancedTable", type = StatusSelfBalancedTable.class),
        @XmlElement(name = "HTTPConnectionsOffered", type = StatusHTTPConnectionsOffered.class),
        @XmlElement(name = "FTPServerSourceProtocolHandlerSummary", type = StatusFTPServerSourceProtocolHandlerSummary.class),
        @XmlElement(name = "MessageDurations", type = StatusMessageDurations.class),
        @XmlElement(name = "DocumentStatus", type = StatusDocumentStatus.class),
        @XmlElement(name = "SFTPFilePollerSourceProtocolHandlerSummary", type = StatusSFTPFilePollerSourceProtocolHandlerSummary.class),
        @XmlElement(name = "TemperatureSensors", type = StatusTemperatureSensors.class),
        @XmlElement(name = "LoadBalancerStatus2", type = StatusLoadBalancerStatus2 .class),
        @XmlElement(name = "RaidBatteryBackUpStatus", type = StatusRaidBatteryBackUpStatus.class),
        @XmlElement(name = "XSLProxyServiceSummary", type = StatusXSLProxyServiceSummary.class),
        @XmlElement(name = "XMLFirewallServiceSummary", type = StatusXMLFirewallServiceSummary.class),
        @XmlElement(name = "XSLCoprocServiceSummary", type = StatusXSLCoprocServiceSummary.class),
        @XmlElement(name = "StylesheetMeanExecutionTimeSimpleIndex", type = StatusStylesheetMeanExecutionTimeSimpleIndex.class),
        @XmlElement(name = "WSRRSubscriptionServiceStatus", type = StatusWSRRSubscriptionServiceStatus.class),
        @XmlElement(name = "DocumentCachingSummary", type = StatusDocumentCachingSummary.class),
        @XmlElement(name = "SQLStatus", type = StatusSQLStatus.class),
        @XmlElement(name = "PCIBus", type = StatusPCIBus.class),
        @XmlElement(name = "NDCacheStatus", type = StatusNDCacheStatus.class),
        @XmlElement(name = "IScsiTargetStatus", type = StatusIScsiTargetStatus.class),
        @XmlElement(name = "OtherSensors", type = StatusOtherSensors.class),
        @XmlElement(name = "DNSStaticHostStatus", type = StatusDNSStaticHostStatus.class),
        @XmlElement(name = "SLMPeeringStatus", type = StatusSLMPeeringStatus.class),
        @XmlElement(name = "ZosNSSstatus", type = StatusZosNSSstatus.class),
        @XmlElement(name = "HTTPConnectionsRequested", type = StatusHTTPConnectionsRequested.class),
        @XmlElement(name = "NetworkTransmitPacketThroughput", type = StatusNetworkTransmitPacketThroughput.class),
        @XmlElement(name = "StylesheetExecutionsSimpleIndex", type = StatusStylesheetExecutionsSimpleIndex.class),
        @XmlElement(name = "TRVSourceProtocolHandlerSummary", type = StatusTRVSourceProtocolHandlerSummary.class),
        @XmlElement(name = "HTTPMeanTransactionTime", type = StatusHTTPMeanTransactionTime.class),
        @XmlElement(name = "TCPProxyServiceSummary", type = StatusTCPProxyServiceSummary.class),
        @XmlElement(name = "RaidPhysDiskStatus", type = StatusRaidPhysDiskStatus.class),
        @XmlElement(name = "FailureNotificationStatus2", type = StatusFailureNotificationStatus2 .class),
        @XmlElement(name = "MessageCounts", type = StatusMessageCounts.class),
        @XmlElement(name = "TibcoEMSSourceProtocolHandlerSummary", type = StatusTibcoEMSSourceProtocolHandlerSummary.class),
        @XmlElement(name = "ARPStatus", type = StatusARPStatus.class),
        @XmlElement(name = "DNSSearchDomainStatus", type = StatusDNSSearchDomainStatus.class),
        @XmlElement(name = "MultiProtocolGatewaySummary", type = StatusMultiProtocolGatewaySummary.class),
        @XmlElement(name = "ServicesStatus", type = StatusServicesStatus.class),
        @XmlElement(name = "RaidArrayStatus", type = StatusRaidArrayStatus.class),
        @XmlElement(name = "ConnectionsAccepted", type = StatusConnectionsAccepted.class),
        @XmlElement(name = "LicenseStatus", type = StatusLicenseStatus.class),
        @XmlElement(name = "WSWSDLStatus", type = StatusWSWSDLStatus.class),
        @XmlElement(name = "NFSFilePollerSourceProtocolHandlerSummary", type = StatusNFSFilePollerSourceProtocolHandlerSummary.class),
        @XmlElement(name = "WebSphereJMSSourceProtocolHandlerSummary", type = StatusWebSphereJMSSourceProtocolHandlerSummary.class),
        @XmlElement(name = "RaidVolumeStatus", type = StatusRaidVolumeStatus.class),
        @XmlElement(name = "XTCProtocolHandlerSummary", type = StatusXTCProtocolHandlerSummary.class),
        @XmlElement(name = "WSOperationMetrics", type = StatusWSOperationMetrics.class),
        @XmlElement(name = "MQFTESourceProtocolHandlerSummary", type = StatusMQFTESourceProtocolHandlerSummary.class),
        @XmlElement(name = "HTTPMeanTransactionTime2", type = StatusHTTPMeanTransactionTime2 .class),
        @XmlElement(name = "NFSMountStatus", type = StatusNFSMountStatus.class),
        @XmlElement(name = "VlanInterfaceStatus", type = StatusVlanInterfaceStatus.class),
        @XmlElement(name = "EnvironmentalFanSensors", type = StatusEnvironmentalFanSensors.class),
        @XmlElement(name = "WebAppFwAccepted", type = StatusWebAppFwAccepted.class),
        @XmlElement(name = "FirmwareVersion", type = StatusFirmwareVersion.class),
        @XmlElement(name = "FilesystemStatus", type = StatusFilesystemStatus.class),
        @XmlElement(name = "EthernetMIIRegisterStatus", type = StatusEthernetMIIRegisterStatus.class),
        @XmlElement(name = "IMSConnectstatus", type = StatusIMSConnectstatus.class),
        @XmlElement(name = "SystemUsage", type = StatusSystemUsage.class),
        @XmlElement(name = "StylesheetProfiles", type = StatusStylesheetProfiles.class),
        @XmlElement(name = "FailureNotificationStatus", type = StatusFailureNotificationStatus.class),
        @XmlElement(name = "SNMPStatus", type = StatusSNMPStatus.class),
        @XmlElement(name = "ServicesMemoryStatus", type = StatusServicesMemoryStatus.class),
        @XmlElement(name = "IGMPStatus", type = StatusIGMPStatus.class),
        @XmlElement(name = "DomainSummary", type = StatusDomainSummary.class),
        @XmlElement(name = "IScsiHBAStatus", type = StatusIScsiHBAStatus.class),
        @XmlElement(name = "HTTPConnectionsReturned", type = StatusHTTPConnectionsReturned.class),
        @XmlElement(name = "DomainCheckpointStatus", type = StatusDomainCheckpointStatus.class),
        @XmlElement(name = "RaidVolumeStatus2", type = StatusRaidVolumeStatus2 .class),
        @XmlElement(name = "WebAppFWSummary", type = StatusWebAppFWSummary.class),
        @XmlElement(name = "MemoryStatus", type = StatusMemoryStatus.class),
        @XmlElement(name = "SecureCloudConnectorConnectionsStatus", type = StatusSecureCloudConnectorConnectionsStatus.class),
        @XmlElement(name = "WSGatewaySummary", type = StatusWSGatewaySummary.class),
        @XmlElement(name = "MessageSources", type = StatusMessageSources.class),
        @XmlElement(name = "VoltageSensors", type = StatusVoltageSensors.class),
        @XmlElement(name = "RoutingStatus2", type = StatusRoutingStatus2 .class),
        @XmlElement(name = "XMLNamesStatus", type = StatusXMLNamesStatus.class),
        @XmlElement(name = "WSRRSavedSearchSubscriptionStatus", type = StatusWSRRSavedSearchSubscriptionStatus.class),
        @XmlElement(name = "EthernetMAUStatus", type = StatusEthernetMAUStatus.class),
        @XmlElement(name = "HTTPConnections", type = StatusHTTPConnections.class),
        @XmlElement(name = "DomainsMemoryStatus", type = StatusDomainsMemoryStatus.class),
        @XmlElement(name = "RoutingStatus", type = StatusRoutingStatus.class),
        @XmlElement(name = "MQStatus", type = StatusMQStatus.class),
        @XmlElement(name = "POPPollerSourceProtocolHandlerSummary", type = StatusPOPPollerSourceProtocolHandlerSummary.class),
        @XmlElement(name = "UDDISubscriptionServiceStatusSimpleIndex", type = StatusUDDISubscriptionServiceStatusSimpleIndex.class),
        @XmlElement(name = "MQQMstatus", type = StatusMQQMstatus.class),
        @XmlElement(name = "HTTPConnectionsDestroyed", type = StatusHTTPConnectionsDestroyed.class),
        @XmlElement(name = "DynamicQueueManager", type = StatusDynamicQueueManager.class),
        @XmlElement(name = "TibcoEMSStatus", type = StatusTibcoEMSStatus.class),
        @XmlElement(name = "B2BGatewaySummary", type = StatusB2BGatewaySummary.class),
        @XmlElement(name = "StylesheetMeanExecutionTime", type = StatusStylesheetMeanExecutionTime.class),
        @XmlElement(name = "HTTPConnectionsReused", type = StatusHTTPConnectionsReused.class),
        @XmlElement(name = "HTTPTransactions", type = StatusHTTPTransactions.class),
        @XmlElement(name = "IScsiInitiatorStatus", type = StatusIScsiInitiatorStatus.class),
        @XmlElement(name = "RaidPhysicalDriveStatus", type = StatusRaidPhysicalDriveStatus.class),
        @XmlElement(name = "SQLRuntimeStatus", type = StatusSQLRuntimeStatus.class),
        @XmlElement(name = "PowerSensors", type = StatusPowerSensors.class),
        @XmlElement(name = "FTPFilePollerSourceProtocolHandlerSummary", type = StatusFTPFilePollerSourceProtocolHandlerSummary.class),
        @XmlElement(name = "LoadBalancerStatus", type = StatusLoadBalancerStatus.class),
        @XmlElement(name = "WebAppFwRejected", type = StatusWebAppFwRejected.class),
        @XmlElement(name = "RaidPhysDiskStatus2", type = StatusRaidPhysDiskStatus2 .class),
        @XmlElement(name = "NetworkInterfaceStatus", type = StatusNetworkInterfaceStatus.class),
        @XmlElement(name = "AS2SourceProtocolHandlerSummary", type = StatusAS2SourceProtocolHandlerSummary.class),
        @XmlElement(name = "NTPRefreshStatus", type = StatusNTPRefreshStatus.class),
        @XmlElement(name = "CurrentSensors", type = StatusCurrentSensors.class),
        @XmlElement(name = "StylesheetStatusSimpleIndex", type = StatusStylesheetStatusSimpleIndex.class),
        @XmlElement(name = "NetworkReceivePacketThroughput", type = StatusNetworkReceivePacketThroughput.class),
        @XmlElement(name = "DNSNameServerStatus", type = StatusDNSNameServerStatus.class),
        @XmlElement(name = "IMSConnectSourceProtocolHandlerSummary", type = StatusIMSConnectSourceProtocolHandlerSummary.class),
        @XmlElement(name = "FirmwareStatus", type = StatusFirmwareStatus.class),
        @XmlElement(name = "TRVPolicySummary", type = StatusTRVPolicySummary.class),
        @XmlElement(name = "StylesheetStatus", type = StatusStylesheetStatus.class),
        @XmlElement(name = "MessageCountFilters", type = StatusMessageCountFilters.class),
        @XmlElement(name = "Version", type = StatusVersion.class),
        @XmlElement(name = "Battery", type = StatusBattery.class),
        @XmlElement(name = "IPMISelEvents", type = StatusIPMISelEvents.class),
        @XmlElement(name = "ZHybridTCSstatus", type = StatusZHybridTCSstatus.class),
        @XmlElement(name = "EBMS2SourceProtocolHandlerSummary", type = StatusEBMS2SourceProtocolHandlerSummary.class),
        @XmlElement(name = "SLMSummaryStatus", type = StatusSLMSummaryStatus.class),
        @XmlElement(name = "HTTPSourceProtocolHandlerSummary", type = StatusHTTPSourceProtocolHandlerSummary.class),
        @XmlElement(name = "AS1PollerSourceProtocolHandlerSummary", type = StatusAS1PollerSourceProtocolHandlerSummary.class),
        @XmlElement(name = "CPUUsage", type = StatusCPUUsage.class),
        @XmlElement(name = "WebSphereJMSStatus", type = StatusWebSphereJMSStatus.class),
        @XmlElement(name = "SystemUsageTable", type = StatusSystemUsageTable.class),
        @XmlElement(name = "StatelessTCPSourceProtocolHandlerSummary", type = StatusStatelessTCPSourceProtocolHandlerSummary.class),
        @XmlElement(name = "WSRRSavedSearchSubscriptionServiceStatus", type = StatusWSRRSavedSearchSubscriptionServiceStatus.class),
        @XmlElement(name = "WSMAgentSpoolers", type = StatusWSMAgentSpoolers.class),
        @XmlElement(name = "StylesheetExecutions", type = StatusStylesheetExecutions.class),
        @XmlElement(name = "HSMKeyStatus", type = StatusHSMKeyStatus.class),
        @XmlElement(name = "SSHTrustedHostStatus", type = StatusSSHTrustedHostStatus.class),
        @XmlElement(name = "UDDISubscriptionKeyStatusSimpleIndex", type = StatusUDDISubscriptionKeyStatusSimpleIndex.class),
        @XmlElement(name = "WSRRSubscriptionPolicyAttachmentsStatus", type = StatusWSRRSubscriptionPolicyAttachmentsStatus.class),
        @XmlElement(name = "SSHKnownHostStatus", type = StatusSSHKnownHostStatus.class),
        @XmlElement(name = "HTTPConnectionsCreated", type = StatusHTTPConnectionsCreated.class),
        @XmlElement(name = "HTTPSSourceProtocolHandlerSummary", type = StatusHTTPSSourceProtocolHandlerSummary.class),
        @XmlElement(name = "WSOperationsStatus", type = StatusWSOperationsStatus.class),
        @XmlElement(name = "RaidPartitionStatus", type = StatusRaidPartitionStatus.class),
        @XmlElement(name = "LibraryVersion", type = StatusLibraryVersion.class)
    })
    protected List<Object> activeUsersOrARPStatusOrAS1PollerSourceProtocolHandlerSummary;

    /**
     * Gets the value of the activeUsersOrARPStatusOrAS1PollerSourceProtocolHandlerSummary property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the activeUsersOrARPStatusOrAS1PollerSourceProtocolHandlerSummary property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getActiveUsersOrARPStatusOrAS1PollerSourceProtocolHandlerSummary().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StatusObjectStatus }
     * {@link StatusWSMAgentStatus }
     * {@link StatusTransmitKbpsThroughput }
     * {@link StatusNetworkReceiveDataThroughput }
     * {@link StatusCryptoEngineStatus }
     * {@link StatusWSRRSavdSrchSubsPolicyAttachmentsStatus }
     * {@link StatusDateTimeStatus }
     * {@link StatusHTTPServiceSummary }
     * {@link StatusSystemUsage2Table }
     * {@link StatusTCPSummary }
     * {@link StatusSSHKnownHostFileStatus }
     * {@link StatusRaidLogicalDriveStatus }
     * {@link StatusAS3SourceProtocolHandlerSummary }
     * {@link StatusLLMPolicySummary }
     * {@link StatusStylesheetProfilesSimpleIndex }
     * {@link StatusStylesheetCachingSummary }
     * {@link StatusSSHServerSourceProtocolHandlerSummary }
     * {@link StatusSelfBalancedStatus }
     * {@link StatusMQSourceProtocolHandlerSummary }
     * {@link StatusEthernetInterfaceStatus }
     * {@link StatusPortStatus }
     * {@link StatusWSOperationMetricsSimpleIndex }
     * {@link StatusMessageDurationFilters }
     * {@link StatusDNSCacheHostStatus }
     * {@link StatusReceivePacketThroughput }
     * {@link StatusUDDISubscriptionStatusSimpleIndex }
     * {@link StatusDNSNameServerStatus2 }
     * {@link StatusDNSCacheHostStatus2 }
     * {@link StatusTransmitPacketThroughput }
     * {@link StatusReceiveKbpsThroughput }
     * {@link StatusNetworkTransmitDataThroughput }
     * {@link StatusTCPTable }
     * {@link StatusFilePollerStatus }
     * {@link StatusDynamicTibcoEMSStatus }
     * {@link StatusEthernetCountersStatus }
     * {@link StatusEnvironmentalSensors }
     * {@link StatusLogTargetStatus }
     * {@link StatusSSLProxyServiceSummary }
     * {@link StatusDomainStatus }
     * {@link StatusHTTPTransactions2 }
     * {@link StatusLLMSourceProtocolHandlerSummary }
     * {@link StatusStandbyStatus }
     * {@link StatusActiveUsers }
     * {@link StatusWSWSDLStatusSimpleIndex }
     * {@link StatusWSRRSubscriptionStatus }
     * {@link StatusDocumentStatusSimpleIndex }
     * {@link StatusIScsiVolumeStatus }
     * {@link StatusWSOperationsStatusSimpleIndex }
     * {@link StatusSelfBalancedTable }
     * {@link StatusHTTPConnectionsOffered }
     * {@link StatusFTPServerSourceProtocolHandlerSummary }
     * {@link StatusMessageDurations }
     * {@link StatusDocumentStatus }
     * {@link StatusSFTPFilePollerSourceProtocolHandlerSummary }
     * {@link StatusTemperatureSensors }
     * {@link StatusLoadBalancerStatus2 }
     * {@link StatusRaidBatteryBackUpStatus }
     * {@link StatusXSLProxyServiceSummary }
     * {@link StatusXMLFirewallServiceSummary }
     * {@link StatusXSLCoprocServiceSummary }
     * {@link StatusStylesheetMeanExecutionTimeSimpleIndex }
     * {@link StatusWSRRSubscriptionServiceStatus }
     * {@link StatusDocumentCachingSummary }
     * {@link StatusSQLStatus }
     * {@link StatusPCIBus }
     * {@link StatusNDCacheStatus }
     * {@link StatusIScsiTargetStatus }
     * {@link StatusOtherSensors }
     * {@link StatusDNSStaticHostStatus }
     * {@link StatusSLMPeeringStatus }
     * {@link StatusZosNSSstatus }
     * {@link StatusHTTPConnectionsRequested }
     * {@link StatusNetworkTransmitPacketThroughput }
     * {@link StatusStylesheetExecutionsSimpleIndex }
     * {@link StatusTRVSourceProtocolHandlerSummary }
     * {@link StatusHTTPMeanTransactionTime }
     * {@link StatusTCPProxyServiceSummary }
     * {@link StatusRaidPhysDiskStatus }
     * {@link StatusFailureNotificationStatus2 }
     * {@link StatusMessageCounts }
     * {@link StatusTibcoEMSSourceProtocolHandlerSummary }
     * {@link StatusARPStatus }
     * {@link StatusDNSSearchDomainStatus }
     * {@link StatusMultiProtocolGatewaySummary }
     * {@link StatusServicesStatus }
     * {@link StatusRaidArrayStatus }
     * {@link StatusConnectionsAccepted }
     * {@link StatusLicenseStatus }
     * {@link StatusWSWSDLStatus }
     * {@link StatusNFSFilePollerSourceProtocolHandlerSummary }
     * {@link StatusWebSphereJMSSourceProtocolHandlerSummary }
     * {@link StatusRaidVolumeStatus }
     * {@link StatusXTCProtocolHandlerSummary }
     * {@link StatusWSOperationMetrics }
     * {@link StatusMQFTESourceProtocolHandlerSummary }
     * {@link StatusHTTPMeanTransactionTime2 }
     * {@link StatusNFSMountStatus }
     * {@link StatusVlanInterfaceStatus }
     * {@link StatusEnvironmentalFanSensors }
     * {@link StatusWebAppFwAccepted }
     * {@link StatusFirmwareVersion }
     * {@link StatusFilesystemStatus }
     * {@link StatusEthernetMIIRegisterStatus }
     * {@link StatusIMSConnectstatus }
     * {@link StatusSystemUsage }
     * {@link StatusStylesheetProfiles }
     * {@link StatusFailureNotificationStatus }
     * {@link StatusSNMPStatus }
     * {@link StatusServicesMemoryStatus }
     * {@link StatusIGMPStatus }
     * {@link StatusDomainSummary }
     * {@link StatusIScsiHBAStatus }
     * {@link StatusHTTPConnectionsReturned }
     * {@link StatusDomainCheckpointStatus }
     * {@link StatusRaidVolumeStatus2 }
     * {@link StatusWebAppFWSummary }
     * {@link StatusMemoryStatus }
     * {@link StatusSecureCloudConnectorConnectionsStatus }
     * {@link StatusWSGatewaySummary }
     * {@link StatusMessageSources }
     * {@link StatusVoltageSensors }
     * {@link StatusRoutingStatus2 }
     * {@link StatusXMLNamesStatus }
     * {@link StatusWSRRSavedSearchSubscriptionStatus }
     * {@link StatusEthernetMAUStatus }
     * {@link StatusHTTPConnections }
     * {@link StatusDomainsMemoryStatus }
     * {@link StatusRoutingStatus }
     * {@link StatusMQStatus }
     * {@link StatusPOPPollerSourceProtocolHandlerSummary }
     * {@link StatusUDDISubscriptionServiceStatusSimpleIndex }
     * {@link StatusMQQMstatus }
     * {@link StatusHTTPConnectionsDestroyed }
     * {@link StatusDynamicQueueManager }
     * {@link StatusTibcoEMSStatus }
     * {@link StatusB2BGatewaySummary }
     * {@link StatusStylesheetMeanExecutionTime }
     * {@link StatusHTTPConnectionsReused }
     * {@link StatusHTTPTransactions }
     * {@link StatusIScsiInitiatorStatus }
     * {@link StatusRaidPhysicalDriveStatus }
     * {@link StatusSQLRuntimeStatus }
     * {@link StatusPowerSensors }
     * {@link StatusFTPFilePollerSourceProtocolHandlerSummary }
     * {@link StatusLoadBalancerStatus }
     * {@link StatusWebAppFwRejected }
     * {@link StatusRaidPhysDiskStatus2 }
     * {@link StatusNetworkInterfaceStatus }
     * {@link StatusAS2SourceProtocolHandlerSummary }
     * {@link StatusNTPRefreshStatus }
     * {@link StatusCurrentSensors }
     * {@link StatusStylesheetStatusSimpleIndex }
     * {@link StatusNetworkReceivePacketThroughput }
     * {@link StatusDNSNameServerStatus }
     * {@link StatusIMSConnectSourceProtocolHandlerSummary }
     * {@link StatusFirmwareStatus }
     * {@link StatusTRVPolicySummary }
     * {@link StatusStylesheetStatus }
     * {@link StatusMessageCountFilters }
     * {@link StatusVersion }
     * {@link StatusBattery }
     * {@link StatusIPMISelEvents }
     * {@link StatusZHybridTCSstatus }
     * {@link StatusEBMS2SourceProtocolHandlerSummary }
     * {@link StatusSLMSummaryStatus }
     * {@link StatusHTTPSourceProtocolHandlerSummary }
     * {@link StatusAS1PollerSourceProtocolHandlerSummary }
     * {@link StatusCPUUsage }
     * {@link StatusWebSphereJMSStatus }
     * {@link StatusSystemUsageTable }
     * {@link StatusStatelessTCPSourceProtocolHandlerSummary }
     * {@link StatusWSRRSavedSearchSubscriptionServiceStatus }
     * {@link StatusWSMAgentSpoolers }
     * {@link StatusStylesheetExecutions }
     * {@link StatusHSMKeyStatus }
     * {@link StatusSSHTrustedHostStatus }
     * {@link StatusUDDISubscriptionKeyStatusSimpleIndex }
     * {@link StatusWSRRSubscriptionPolicyAttachmentsStatus }
     * {@link StatusSSHKnownHostStatus }
     * {@link StatusHTTPConnectionsCreated }
     * {@link StatusHTTPSSourceProtocolHandlerSummary }
     * {@link StatusWSOperationsStatus }
     * {@link StatusRaidPartitionStatus }
     * {@link StatusLibraryVersion }
     * 
     * 
     */
    public List<Object> getActiveUsersOrARPStatusOrAS1PollerSourceProtocolHandlerSummary() {
        if (activeUsersOrARPStatusOrAS1PollerSourceProtocolHandlerSummary == null) {
            activeUsersOrARPStatusOrAS1PollerSourceProtocolHandlerSummary = new ArrayList<Object>();
        }
        return this.activeUsersOrARPStatusOrAS1PollerSourceProtocolHandlerSummary;
    }

}
