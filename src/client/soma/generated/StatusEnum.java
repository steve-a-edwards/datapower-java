
package client.soma.generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for StatusEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="StatusEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ActiveUsers"/>
 *     &lt;enumeration value="ARPStatus"/>
 *     &lt;enumeration value="AS1PollerSourceProtocolHandlerSummary"/>
 *     &lt;enumeration value="AS2SourceProtocolHandlerSummary"/>
 *     &lt;enumeration value="AS3SourceProtocolHandlerSummary"/>
 *     &lt;enumeration value="B2BGatewaySummary"/>
 *     &lt;enumeration value="Battery"/>
 *     &lt;enumeration value="ConnectionsAccepted"/>
 *     &lt;enumeration value="CPUUsage"/>
 *     &lt;enumeration value="CryptoEngineStatus"/>
 *     &lt;enumeration value="CurrentSensors"/>
 *     &lt;enumeration value="DateTimeStatus"/>
 *     &lt;enumeration value="DNSCacheHostStatus"/>
 *     &lt;enumeration value="DNSCacheHostStatus2"/>
 *     &lt;enumeration value="DNSNameServerStatus"/>
 *     &lt;enumeration value="DNSNameServerStatus2"/>
 *     &lt;enumeration value="DNSSearchDomainStatus"/>
 *     &lt;enumeration value="DNSStaticHostStatus"/>
 *     &lt;enumeration value="DocumentCachingSummary"/>
 *     &lt;enumeration value="DocumentStatus"/>
 *     &lt;enumeration value="DocumentStatusSimpleIndex"/>
 *     &lt;enumeration value="DomainCheckpointStatus"/>
 *     &lt;enumeration value="DomainsMemoryStatus"/>
 *     &lt;enumeration value="DomainStatus"/>
 *     &lt;enumeration value="DomainSummary"/>
 *     &lt;enumeration value="DynamicQueueManager"/>
 *     &lt;enumeration value="DynamicTibcoEMSStatus"/>
 *     &lt;enumeration value="EBMS2SourceProtocolHandlerSummary"/>
 *     &lt;enumeration value="EnvironmentalFanSensors"/>
 *     &lt;enumeration value="EnvironmentalSensors"/>
 *     &lt;enumeration value="EthernetCountersStatus"/>
 *     &lt;enumeration value="EthernetInterfaceStatus"/>
 *     &lt;enumeration value="EthernetMAUStatus"/>
 *     &lt;enumeration value="EthernetMIIRegisterStatus"/>
 *     &lt;enumeration value="FailureNotificationStatus"/>
 *     &lt;enumeration value="FailureNotificationStatus2"/>
 *     &lt;enumeration value="FilePollerStatus"/>
 *     &lt;enumeration value="FilesystemStatus"/>
 *     &lt;enumeration value="FirmwareStatus"/>
 *     &lt;enumeration value="FirmwareVersion"/>
 *     &lt;enumeration value="FTPFilePollerSourceProtocolHandlerSummary"/>
 *     &lt;enumeration value="FTPServerSourceProtocolHandlerSummary"/>
 *     &lt;enumeration value="HSMKeyStatus"/>
 *     &lt;enumeration value="HTTPConnections"/>
 *     &lt;enumeration value="HTTPConnectionsCreated"/>
 *     &lt;enumeration value="HTTPConnectionsDestroyed"/>
 *     &lt;enumeration value="HTTPConnectionsOffered"/>
 *     &lt;enumeration value="HTTPConnectionsRequested"/>
 *     &lt;enumeration value="HTTPConnectionsReturned"/>
 *     &lt;enumeration value="HTTPConnectionsReused"/>
 *     &lt;enumeration value="HTTPMeanTransactionTime"/>
 *     &lt;enumeration value="HTTPMeanTransactionTime2"/>
 *     &lt;enumeration value="HTTPServiceSummary"/>
 *     &lt;enumeration value="HTTPSourceProtocolHandlerSummary"/>
 *     &lt;enumeration value="HTTPSSourceProtocolHandlerSummary"/>
 *     &lt;enumeration value="HTTPTransactions"/>
 *     &lt;enumeration value="HTTPTransactions2"/>
 *     &lt;enumeration value="IGMPStatus"/>
 *     &lt;enumeration value="IMSConnectSourceProtocolHandlerSummary"/>
 *     &lt;enumeration value="IMSConnectstatus"/>
 *     &lt;enumeration value="IPMISelEvents"/>
 *     &lt;enumeration value="IScsiHBAStatus"/>
 *     &lt;enumeration value="IScsiInitiatorStatus"/>
 *     &lt;enumeration value="IScsiTargetStatus"/>
 *     &lt;enumeration value="IScsiVolumeStatus"/>
 *     &lt;enumeration value="LibraryVersion"/>
 *     &lt;enumeration value="LicenseStatus"/>
 *     &lt;enumeration value="LLMPolicySummary"/>
 *     &lt;enumeration value="LLMSourceProtocolHandlerSummary"/>
 *     &lt;enumeration value="LoadBalancerStatus"/>
 *     &lt;enumeration value="LoadBalancerStatus2"/>
 *     &lt;enumeration value="LogTargetStatus"/>
 *     &lt;enumeration value="MemoryStatus"/>
 *     &lt;enumeration value="MessageCountFilters"/>
 *     &lt;enumeration value="MessageCounts"/>
 *     &lt;enumeration value="MessageDurationFilters"/>
 *     &lt;enumeration value="MessageDurations"/>
 *     &lt;enumeration value="MessageSources"/>
 *     &lt;enumeration value="MQFTESourceProtocolHandlerSummary"/>
 *     &lt;enumeration value="MQQMstatus"/>
 *     &lt;enumeration value="MQSourceProtocolHandlerSummary"/>
 *     &lt;enumeration value="MQStatus"/>
 *     &lt;enumeration value="MultiProtocolGatewaySummary"/>
 *     &lt;enumeration value="NDCacheStatus"/>
 *     &lt;enumeration value="NetworkInterfaceStatus"/>
 *     &lt;enumeration value="NetworkReceiveDataThroughput"/>
 *     &lt;enumeration value="NetworkReceivePacketThroughput"/>
 *     &lt;enumeration value="NetworkTransmitDataThroughput"/>
 *     &lt;enumeration value="NetworkTransmitPacketThroughput"/>
 *     &lt;enumeration value="NFSFilePollerSourceProtocolHandlerSummary"/>
 *     &lt;enumeration value="NFSMountStatus"/>
 *     &lt;enumeration value="NTPRefreshStatus"/>
 *     &lt;enumeration value="ObjectStatus"/>
 *     &lt;enumeration value="OtherSensors"/>
 *     &lt;enumeration value="PCIBus"/>
 *     &lt;enumeration value="POPPollerSourceProtocolHandlerSummary"/>
 *     &lt;enumeration value="PortStatus"/>
 *     &lt;enumeration value="PowerSensors"/>
 *     &lt;enumeration value="RaidArrayStatus"/>
 *     &lt;enumeration value="RaidBatteryBackUpStatus"/>
 *     &lt;enumeration value="RaidLogicalDriveStatus"/>
 *     &lt;enumeration value="RaidPartitionStatus"/>
 *     &lt;enumeration value="RaidPhysDiskStatus"/>
 *     &lt;enumeration value="RaidPhysDiskStatus2"/>
 *     &lt;enumeration value="RaidPhysicalDriveStatus"/>
 *     &lt;enumeration value="RaidVolumeStatus"/>
 *     &lt;enumeration value="RaidVolumeStatus2"/>
 *     &lt;enumeration value="ReceiveKbpsThroughput"/>
 *     &lt;enumeration value="ReceivePacketThroughput"/>
 *     &lt;enumeration value="RoutingStatus"/>
 *     &lt;enumeration value="RoutingStatus2"/>
 *     &lt;enumeration value="SecureCloudConnectorConnectionsStatus"/>
 *     &lt;enumeration value="SelfBalancedStatus"/>
 *     &lt;enumeration value="SelfBalancedTable"/>
 *     &lt;enumeration value="ServicesMemoryStatus"/>
 *     &lt;enumeration value="ServicesStatus"/>
 *     &lt;enumeration value="SFTPFilePollerSourceProtocolHandlerSummary"/>
 *     &lt;enumeration value="SLMPeeringStatus"/>
 *     &lt;enumeration value="SLMSummaryStatus"/>
 *     &lt;enumeration value="SNMPStatus"/>
 *     &lt;enumeration value="SQLRuntimeStatus"/>
 *     &lt;enumeration value="SQLStatus"/>
 *     &lt;enumeration value="SSHKnownHostFileStatus"/>
 *     &lt;enumeration value="SSHKnownHostStatus"/>
 *     &lt;enumeration value="SSHServerSourceProtocolHandlerSummary"/>
 *     &lt;enumeration value="SSHTrustedHostStatus"/>
 *     &lt;enumeration value="SSLProxyServiceSummary"/>
 *     &lt;enumeration value="StandbyStatus"/>
 *     &lt;enumeration value="StatelessTCPSourceProtocolHandlerSummary"/>
 *     &lt;enumeration value="StylesheetCachingSummary"/>
 *     &lt;enumeration value="StylesheetExecutions"/>
 *     &lt;enumeration value="StylesheetExecutionsSimpleIndex"/>
 *     &lt;enumeration value="StylesheetMeanExecutionTime"/>
 *     &lt;enumeration value="StylesheetMeanExecutionTimeSimpleIndex"/>
 *     &lt;enumeration value="StylesheetProfiles"/>
 *     &lt;enumeration value="StylesheetProfilesSimpleIndex"/>
 *     &lt;enumeration value="StylesheetStatus"/>
 *     &lt;enumeration value="StylesheetStatusSimpleIndex"/>
 *     &lt;enumeration value="SystemUsage"/>
 *     &lt;enumeration value="SystemUsage2Table"/>
 *     &lt;enumeration value="SystemUsageTable"/>
 *     &lt;enumeration value="TCPProxyServiceSummary"/>
 *     &lt;enumeration value="TCPSummary"/>
 *     &lt;enumeration value="TCPTable"/>
 *     &lt;enumeration value="TemperatureSensors"/>
 *     &lt;enumeration value="TibcoEMSSourceProtocolHandlerSummary"/>
 *     &lt;enumeration value="TibcoEMSStatus"/>
 *     &lt;enumeration value="TransmitKbpsThroughput"/>
 *     &lt;enumeration value="TransmitPacketThroughput"/>
 *     &lt;enumeration value="TRVPolicySummary"/>
 *     &lt;enumeration value="TRVSourceProtocolHandlerSummary"/>
 *     &lt;enumeration value="UDDISubscriptionKeyStatusSimpleIndex"/>
 *     &lt;enumeration value="UDDISubscriptionServiceStatusSimpleIndex"/>
 *     &lt;enumeration value="UDDISubscriptionStatusSimpleIndex"/>
 *     &lt;enumeration value="Version"/>
 *     &lt;enumeration value="VlanInterfaceStatus"/>
 *     &lt;enumeration value="VoltageSensors"/>
 *     &lt;enumeration value="WebAppFwAccepted"/>
 *     &lt;enumeration value="WebAppFwRejected"/>
 *     &lt;enumeration value="WebAppFWSummary"/>
 *     &lt;enumeration value="WebSphereJMSSourceProtocolHandlerSummary"/>
 *     &lt;enumeration value="WebSphereJMSStatus"/>
 *     &lt;enumeration value="WSGatewaySummary"/>
 *     &lt;enumeration value="WSMAgentSpoolers"/>
 *     &lt;enumeration value="WSMAgentStatus"/>
 *     &lt;enumeration value="WSOperationMetrics"/>
 *     &lt;enumeration value="WSOperationMetricsSimpleIndex"/>
 *     &lt;enumeration value="WSOperationsStatus"/>
 *     &lt;enumeration value="WSOperationsStatusSimpleIndex"/>
 *     &lt;enumeration value="WSRRSavdSrchSubsPolicyAttachmentsStatus"/>
 *     &lt;enumeration value="WSRRSavedSearchSubscriptionServiceStatus"/>
 *     &lt;enumeration value="WSRRSavedSearchSubscriptionStatus"/>
 *     &lt;enumeration value="WSRRSubscriptionPolicyAttachmentsStatus"/>
 *     &lt;enumeration value="WSRRSubscriptionServiceStatus"/>
 *     &lt;enumeration value="WSRRSubscriptionStatus"/>
 *     &lt;enumeration value="WSWSDLStatus"/>
 *     &lt;enumeration value="WSWSDLStatusSimpleIndex"/>
 *     &lt;enumeration value="XMLFirewallServiceSummary"/>
 *     &lt;enumeration value="XMLNamesStatus"/>
 *     &lt;enumeration value="XSLCoprocServiceSummary"/>
 *     &lt;enumeration value="XSLProxyServiceSummary"/>
 *     &lt;enumeration value="XTCProtocolHandlerSummary"/>
 *     &lt;enumeration value="ZHybridTCSstatus"/>
 *     &lt;enumeration value="ZosNSSstatus"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "StatusEnum")
@XmlEnum
public enum StatusEnum {

    @XmlEnumValue("ActiveUsers")
    ACTIVE_USERS("ActiveUsers"),
    @XmlEnumValue("ARPStatus")
    ARP_STATUS("ARPStatus"),
    @XmlEnumValue("AS1PollerSourceProtocolHandlerSummary")
    AS_1_POLLER_SOURCE_PROTOCOL_HANDLER_SUMMARY("AS1PollerSourceProtocolHandlerSummary"),
    @XmlEnumValue("AS2SourceProtocolHandlerSummary")
    AS_2_SOURCE_PROTOCOL_HANDLER_SUMMARY("AS2SourceProtocolHandlerSummary"),
    @XmlEnumValue("AS3SourceProtocolHandlerSummary")
    AS_3_SOURCE_PROTOCOL_HANDLER_SUMMARY("AS3SourceProtocolHandlerSummary"),
    @XmlEnumValue("B2BGatewaySummary")
    B_2_B_GATEWAY_SUMMARY("B2BGatewaySummary"),
    @XmlEnumValue("Battery")
    BATTERY("Battery"),
    @XmlEnumValue("ConnectionsAccepted")
    CONNECTIONS_ACCEPTED("ConnectionsAccepted"),
    @XmlEnumValue("CPUUsage")
    CPU_USAGE("CPUUsage"),
    @XmlEnumValue("CryptoEngineStatus")
    CRYPTO_ENGINE_STATUS("CryptoEngineStatus"),
    @XmlEnumValue("CurrentSensors")
    CURRENT_SENSORS("CurrentSensors"),
    @XmlEnumValue("DateTimeStatus")
    DATE_TIME_STATUS("DateTimeStatus"),
    @XmlEnumValue("DNSCacheHostStatus")
    DNS_CACHE_HOST_STATUS("DNSCacheHostStatus"),
    @XmlEnumValue("DNSCacheHostStatus2")
    DNS_CACHE_HOST_STATUS_2("DNSCacheHostStatus2"),
    @XmlEnumValue("DNSNameServerStatus")
    DNS_NAME_SERVER_STATUS("DNSNameServerStatus"),
    @XmlEnumValue("DNSNameServerStatus2")
    DNS_NAME_SERVER_STATUS_2("DNSNameServerStatus2"),
    @XmlEnumValue("DNSSearchDomainStatus")
    DNS_SEARCH_DOMAIN_STATUS("DNSSearchDomainStatus"),
    @XmlEnumValue("DNSStaticHostStatus")
    DNS_STATIC_HOST_STATUS("DNSStaticHostStatus"),
    @XmlEnumValue("DocumentCachingSummary")
    DOCUMENT_CACHING_SUMMARY("DocumentCachingSummary"),
    @XmlEnumValue("DocumentStatus")
    DOCUMENT_STATUS("DocumentStatus"),
    @XmlEnumValue("DocumentStatusSimpleIndex")
    DOCUMENT_STATUS_SIMPLE_INDEX("DocumentStatusSimpleIndex"),
    @XmlEnumValue("DomainCheckpointStatus")
    DOMAIN_CHECKPOINT_STATUS("DomainCheckpointStatus"),
    @XmlEnumValue("DomainsMemoryStatus")
    DOMAINS_MEMORY_STATUS("DomainsMemoryStatus"),
    @XmlEnumValue("DomainStatus")
    DOMAIN_STATUS("DomainStatus"),
    @XmlEnumValue("DomainSummary")
    DOMAIN_SUMMARY("DomainSummary"),
    @XmlEnumValue("DynamicQueueManager")
    DYNAMIC_QUEUE_MANAGER("DynamicQueueManager"),
    @XmlEnumValue("DynamicTibcoEMSStatus")
    DYNAMIC_TIBCO_EMS_STATUS("DynamicTibcoEMSStatus"),
    @XmlEnumValue("EBMS2SourceProtocolHandlerSummary")
    EBMS_2_SOURCE_PROTOCOL_HANDLER_SUMMARY("EBMS2SourceProtocolHandlerSummary"),
    @XmlEnumValue("EnvironmentalFanSensors")
    ENVIRONMENTAL_FAN_SENSORS("EnvironmentalFanSensors"),
    @XmlEnumValue("EnvironmentalSensors")
    ENVIRONMENTAL_SENSORS("EnvironmentalSensors"),
    @XmlEnumValue("EthernetCountersStatus")
    ETHERNET_COUNTERS_STATUS("EthernetCountersStatus"),
    @XmlEnumValue("EthernetInterfaceStatus")
    ETHERNET_INTERFACE_STATUS("EthernetInterfaceStatus"),
    @XmlEnumValue("EthernetMAUStatus")
    ETHERNET_MAU_STATUS("EthernetMAUStatus"),
    @XmlEnumValue("EthernetMIIRegisterStatus")
    ETHERNET_MII_REGISTER_STATUS("EthernetMIIRegisterStatus"),
    @XmlEnumValue("FailureNotificationStatus")
    FAILURE_NOTIFICATION_STATUS("FailureNotificationStatus"),
    @XmlEnumValue("FailureNotificationStatus2")
    FAILURE_NOTIFICATION_STATUS_2("FailureNotificationStatus2"),
    @XmlEnumValue("FilePollerStatus")
    FILE_POLLER_STATUS("FilePollerStatus"),
    @XmlEnumValue("FilesystemStatus")
    FILESYSTEM_STATUS("FilesystemStatus"),
    @XmlEnumValue("FirmwareStatus")
    FIRMWARE_STATUS("FirmwareStatus"),
    @XmlEnumValue("FirmwareVersion")
    FIRMWARE_VERSION("FirmwareVersion"),
    @XmlEnumValue("FTPFilePollerSourceProtocolHandlerSummary")
    FTP_FILE_POLLER_SOURCE_PROTOCOL_HANDLER_SUMMARY("FTPFilePollerSourceProtocolHandlerSummary"),
    @XmlEnumValue("FTPServerSourceProtocolHandlerSummary")
    FTP_SERVER_SOURCE_PROTOCOL_HANDLER_SUMMARY("FTPServerSourceProtocolHandlerSummary"),
    @XmlEnumValue("HSMKeyStatus")
    HSM_KEY_STATUS("HSMKeyStatus"),
    @XmlEnumValue("HTTPConnections")
    HTTP_CONNECTIONS("HTTPConnections"),
    @XmlEnumValue("HTTPConnectionsCreated")
    HTTP_CONNECTIONS_CREATED("HTTPConnectionsCreated"),
    @XmlEnumValue("HTTPConnectionsDestroyed")
    HTTP_CONNECTIONS_DESTROYED("HTTPConnectionsDestroyed"),
    @XmlEnumValue("HTTPConnectionsOffered")
    HTTP_CONNECTIONS_OFFERED("HTTPConnectionsOffered"),
    @XmlEnumValue("HTTPConnectionsRequested")
    HTTP_CONNECTIONS_REQUESTED("HTTPConnectionsRequested"),
    @XmlEnumValue("HTTPConnectionsReturned")
    HTTP_CONNECTIONS_RETURNED("HTTPConnectionsReturned"),
    @XmlEnumValue("HTTPConnectionsReused")
    HTTP_CONNECTIONS_REUSED("HTTPConnectionsReused"),
    @XmlEnumValue("HTTPMeanTransactionTime")
    HTTP_MEAN_TRANSACTION_TIME("HTTPMeanTransactionTime"),
    @XmlEnumValue("HTTPMeanTransactionTime2")
    HTTP_MEAN_TRANSACTION_TIME_2("HTTPMeanTransactionTime2"),
    @XmlEnumValue("HTTPServiceSummary")
    HTTP_SERVICE_SUMMARY("HTTPServiceSummary"),
    @XmlEnumValue("HTTPSourceProtocolHandlerSummary")
    HTTP_SOURCE_PROTOCOL_HANDLER_SUMMARY("HTTPSourceProtocolHandlerSummary"),
    @XmlEnumValue("HTTPSSourceProtocolHandlerSummary")
    HTTPS_SOURCE_PROTOCOL_HANDLER_SUMMARY("HTTPSSourceProtocolHandlerSummary"),
    @XmlEnumValue("HTTPTransactions")
    HTTP_TRANSACTIONS("HTTPTransactions"),
    @XmlEnumValue("HTTPTransactions2")
    HTTP_TRANSACTIONS_2("HTTPTransactions2"),
    @XmlEnumValue("IGMPStatus")
    IGMP_STATUS("IGMPStatus"),
    @XmlEnumValue("IMSConnectSourceProtocolHandlerSummary")
    IMS_CONNECT_SOURCE_PROTOCOL_HANDLER_SUMMARY("IMSConnectSourceProtocolHandlerSummary"),
    @XmlEnumValue("IMSConnectstatus")
    IMS_CONNECTSTATUS("IMSConnectstatus"),
    @XmlEnumValue("IPMISelEvents")
    IPMI_SEL_EVENTS("IPMISelEvents"),
    @XmlEnumValue("IScsiHBAStatus")
    I_SCSI_HBA_STATUS("IScsiHBAStatus"),
    @XmlEnumValue("IScsiInitiatorStatus")
    I_SCSI_INITIATOR_STATUS("IScsiInitiatorStatus"),
    @XmlEnumValue("IScsiTargetStatus")
    I_SCSI_TARGET_STATUS("IScsiTargetStatus"),
    @XmlEnumValue("IScsiVolumeStatus")
    I_SCSI_VOLUME_STATUS("IScsiVolumeStatus"),
    @XmlEnumValue("LibraryVersion")
    LIBRARY_VERSION("LibraryVersion"),
    @XmlEnumValue("LicenseStatus")
    LICENSE_STATUS("LicenseStatus"),
    @XmlEnumValue("LLMPolicySummary")
    LLM_POLICY_SUMMARY("LLMPolicySummary"),
    @XmlEnumValue("LLMSourceProtocolHandlerSummary")
    LLM_SOURCE_PROTOCOL_HANDLER_SUMMARY("LLMSourceProtocolHandlerSummary"),
    @XmlEnumValue("LoadBalancerStatus")
    LOAD_BALANCER_STATUS("LoadBalancerStatus"),
    @XmlEnumValue("LoadBalancerStatus2")
    LOAD_BALANCER_STATUS_2("LoadBalancerStatus2"),
    @XmlEnumValue("LogTargetStatus")
    LOG_TARGET_STATUS("LogTargetStatus"),
    @XmlEnumValue("MemoryStatus")
    MEMORY_STATUS("MemoryStatus"),
    @XmlEnumValue("MessageCountFilters")
    MESSAGE_COUNT_FILTERS("MessageCountFilters"),
    @XmlEnumValue("MessageCounts")
    MESSAGE_COUNTS("MessageCounts"),
    @XmlEnumValue("MessageDurationFilters")
    MESSAGE_DURATION_FILTERS("MessageDurationFilters"),
    @XmlEnumValue("MessageDurations")
    MESSAGE_DURATIONS("MessageDurations"),
    @XmlEnumValue("MessageSources")
    MESSAGE_SOURCES("MessageSources"),
    @XmlEnumValue("MQFTESourceProtocolHandlerSummary")
    MQFTE_SOURCE_PROTOCOL_HANDLER_SUMMARY("MQFTESourceProtocolHandlerSummary"),
    @XmlEnumValue("MQQMstatus")
    MQQ_MSTATUS("MQQMstatus"),
    @XmlEnumValue("MQSourceProtocolHandlerSummary")
    MQ_SOURCE_PROTOCOL_HANDLER_SUMMARY("MQSourceProtocolHandlerSummary"),
    @XmlEnumValue("MQStatus")
    MQ_STATUS("MQStatus"),
    @XmlEnumValue("MultiProtocolGatewaySummary")
    MULTI_PROTOCOL_GATEWAY_SUMMARY("MultiProtocolGatewaySummary"),
    @XmlEnumValue("NDCacheStatus")
    ND_CACHE_STATUS("NDCacheStatus"),
    @XmlEnumValue("NetworkInterfaceStatus")
    NETWORK_INTERFACE_STATUS("NetworkInterfaceStatus"),
    @XmlEnumValue("NetworkReceiveDataThroughput")
    NETWORK_RECEIVE_DATA_THROUGHPUT("NetworkReceiveDataThroughput"),
    @XmlEnumValue("NetworkReceivePacketThroughput")
    NETWORK_RECEIVE_PACKET_THROUGHPUT("NetworkReceivePacketThroughput"),
    @XmlEnumValue("NetworkTransmitDataThroughput")
    NETWORK_TRANSMIT_DATA_THROUGHPUT("NetworkTransmitDataThroughput"),
    @XmlEnumValue("NetworkTransmitPacketThroughput")
    NETWORK_TRANSMIT_PACKET_THROUGHPUT("NetworkTransmitPacketThroughput"),
    @XmlEnumValue("NFSFilePollerSourceProtocolHandlerSummary")
    NFS_FILE_POLLER_SOURCE_PROTOCOL_HANDLER_SUMMARY("NFSFilePollerSourceProtocolHandlerSummary"),
    @XmlEnumValue("NFSMountStatus")
    NFS_MOUNT_STATUS("NFSMountStatus"),
    @XmlEnumValue("NTPRefreshStatus")
    NTP_REFRESH_STATUS("NTPRefreshStatus"),
    @XmlEnumValue("ObjectStatus")
    OBJECT_STATUS("ObjectStatus"),
    @XmlEnumValue("OtherSensors")
    OTHER_SENSORS("OtherSensors"),
    @XmlEnumValue("PCIBus")
    PCI_BUS("PCIBus"),
    @XmlEnumValue("POPPollerSourceProtocolHandlerSummary")
    POP_POLLER_SOURCE_PROTOCOL_HANDLER_SUMMARY("POPPollerSourceProtocolHandlerSummary"),
    @XmlEnumValue("PortStatus")
    PORT_STATUS("PortStatus"),
    @XmlEnumValue("PowerSensors")
    POWER_SENSORS("PowerSensors"),
    @XmlEnumValue("RaidArrayStatus")
    RAID_ARRAY_STATUS("RaidArrayStatus"),
    @XmlEnumValue("RaidBatteryBackUpStatus")
    RAID_BATTERY_BACK_UP_STATUS("RaidBatteryBackUpStatus"),
    @XmlEnumValue("RaidLogicalDriveStatus")
    RAID_LOGICAL_DRIVE_STATUS("RaidLogicalDriveStatus"),
    @XmlEnumValue("RaidPartitionStatus")
    RAID_PARTITION_STATUS("RaidPartitionStatus"),
    @XmlEnumValue("RaidPhysDiskStatus")
    RAID_PHYS_DISK_STATUS("RaidPhysDiskStatus"),
    @XmlEnumValue("RaidPhysDiskStatus2")
    RAID_PHYS_DISK_STATUS_2("RaidPhysDiskStatus2"),
    @XmlEnumValue("RaidPhysicalDriveStatus")
    RAID_PHYSICAL_DRIVE_STATUS("RaidPhysicalDriveStatus"),
    @XmlEnumValue("RaidVolumeStatus")
    RAID_VOLUME_STATUS("RaidVolumeStatus"),
    @XmlEnumValue("RaidVolumeStatus2")
    RAID_VOLUME_STATUS_2("RaidVolumeStatus2"),
    @XmlEnumValue("ReceiveKbpsThroughput")
    RECEIVE_KBPS_THROUGHPUT("ReceiveKbpsThroughput"),
    @XmlEnumValue("ReceivePacketThroughput")
    RECEIVE_PACKET_THROUGHPUT("ReceivePacketThroughput"),
    @XmlEnumValue("RoutingStatus")
    ROUTING_STATUS("RoutingStatus"),
    @XmlEnumValue("RoutingStatus2")
    ROUTING_STATUS_2("RoutingStatus2"),
    @XmlEnumValue("SecureCloudConnectorConnectionsStatus")
    SECURE_CLOUD_CONNECTOR_CONNECTIONS_STATUS("SecureCloudConnectorConnectionsStatus"),
    @XmlEnumValue("SelfBalancedStatus")
    SELF_BALANCED_STATUS("SelfBalancedStatus"),
    @XmlEnumValue("SelfBalancedTable")
    SELF_BALANCED_TABLE("SelfBalancedTable"),
    @XmlEnumValue("ServicesMemoryStatus")
    SERVICES_MEMORY_STATUS("ServicesMemoryStatus"),
    @XmlEnumValue("ServicesStatus")
    SERVICES_STATUS("ServicesStatus"),
    @XmlEnumValue("SFTPFilePollerSourceProtocolHandlerSummary")
    SFTP_FILE_POLLER_SOURCE_PROTOCOL_HANDLER_SUMMARY("SFTPFilePollerSourceProtocolHandlerSummary"),
    @XmlEnumValue("SLMPeeringStatus")
    SLM_PEERING_STATUS("SLMPeeringStatus"),
    @XmlEnumValue("SLMSummaryStatus")
    SLM_SUMMARY_STATUS("SLMSummaryStatus"),
    @XmlEnumValue("SNMPStatus")
    SNMP_STATUS("SNMPStatus"),
    @XmlEnumValue("SQLRuntimeStatus")
    SQL_RUNTIME_STATUS("SQLRuntimeStatus"),
    @XmlEnumValue("SQLStatus")
    SQL_STATUS("SQLStatus"),
    @XmlEnumValue("SSHKnownHostFileStatus")
    SSH_KNOWN_HOST_FILE_STATUS("SSHKnownHostFileStatus"),
    @XmlEnumValue("SSHKnownHostStatus")
    SSH_KNOWN_HOST_STATUS("SSHKnownHostStatus"),
    @XmlEnumValue("SSHServerSourceProtocolHandlerSummary")
    SSH_SERVER_SOURCE_PROTOCOL_HANDLER_SUMMARY("SSHServerSourceProtocolHandlerSummary"),
    @XmlEnumValue("SSHTrustedHostStatus")
    SSH_TRUSTED_HOST_STATUS("SSHTrustedHostStatus"),
    @XmlEnumValue("SSLProxyServiceSummary")
    SSL_PROXY_SERVICE_SUMMARY("SSLProxyServiceSummary"),
    @XmlEnumValue("StandbyStatus")
    STANDBY_STATUS("StandbyStatus"),
    @XmlEnumValue("StatelessTCPSourceProtocolHandlerSummary")
    STATELESS_TCP_SOURCE_PROTOCOL_HANDLER_SUMMARY("StatelessTCPSourceProtocolHandlerSummary"),
    @XmlEnumValue("StylesheetCachingSummary")
    STYLESHEET_CACHING_SUMMARY("StylesheetCachingSummary"),
    @XmlEnumValue("StylesheetExecutions")
    STYLESHEET_EXECUTIONS("StylesheetExecutions"),
    @XmlEnumValue("StylesheetExecutionsSimpleIndex")
    STYLESHEET_EXECUTIONS_SIMPLE_INDEX("StylesheetExecutionsSimpleIndex"),
    @XmlEnumValue("StylesheetMeanExecutionTime")
    STYLESHEET_MEAN_EXECUTION_TIME("StylesheetMeanExecutionTime"),
    @XmlEnumValue("StylesheetMeanExecutionTimeSimpleIndex")
    STYLESHEET_MEAN_EXECUTION_TIME_SIMPLE_INDEX("StylesheetMeanExecutionTimeSimpleIndex"),
    @XmlEnumValue("StylesheetProfiles")
    STYLESHEET_PROFILES("StylesheetProfiles"),
    @XmlEnumValue("StylesheetProfilesSimpleIndex")
    STYLESHEET_PROFILES_SIMPLE_INDEX("StylesheetProfilesSimpleIndex"),
    @XmlEnumValue("StylesheetStatus")
    STYLESHEET_STATUS("StylesheetStatus"),
    @XmlEnumValue("StylesheetStatusSimpleIndex")
    STYLESHEET_STATUS_SIMPLE_INDEX("StylesheetStatusSimpleIndex"),
    @XmlEnumValue("SystemUsage")
    SYSTEM_USAGE("SystemUsage"),
    @XmlEnumValue("SystemUsage2Table")
    SYSTEM_USAGE_2_TABLE("SystemUsage2Table"),
    @XmlEnumValue("SystemUsageTable")
    SYSTEM_USAGE_TABLE("SystemUsageTable"),
    @XmlEnumValue("TCPProxyServiceSummary")
    TCP_PROXY_SERVICE_SUMMARY("TCPProxyServiceSummary"),
    @XmlEnumValue("TCPSummary")
    TCP_SUMMARY("TCPSummary"),
    @XmlEnumValue("TCPTable")
    TCP_TABLE("TCPTable"),
    @XmlEnumValue("TemperatureSensors")
    TEMPERATURE_SENSORS("TemperatureSensors"),
    @XmlEnumValue("TibcoEMSSourceProtocolHandlerSummary")
    TIBCO_EMS_SOURCE_PROTOCOL_HANDLER_SUMMARY("TibcoEMSSourceProtocolHandlerSummary"),
    @XmlEnumValue("TibcoEMSStatus")
    TIBCO_EMS_STATUS("TibcoEMSStatus"),
    @XmlEnumValue("TransmitKbpsThroughput")
    TRANSMIT_KBPS_THROUGHPUT("TransmitKbpsThroughput"),
    @XmlEnumValue("TransmitPacketThroughput")
    TRANSMIT_PACKET_THROUGHPUT("TransmitPacketThroughput"),
    @XmlEnumValue("TRVPolicySummary")
    TRV_POLICY_SUMMARY("TRVPolicySummary"),
    @XmlEnumValue("TRVSourceProtocolHandlerSummary")
    TRV_SOURCE_PROTOCOL_HANDLER_SUMMARY("TRVSourceProtocolHandlerSummary"),
    @XmlEnumValue("UDDISubscriptionKeyStatusSimpleIndex")
    UDDI_SUBSCRIPTION_KEY_STATUS_SIMPLE_INDEX("UDDISubscriptionKeyStatusSimpleIndex"),
    @XmlEnumValue("UDDISubscriptionServiceStatusSimpleIndex")
    UDDI_SUBSCRIPTION_SERVICE_STATUS_SIMPLE_INDEX("UDDISubscriptionServiceStatusSimpleIndex"),
    @XmlEnumValue("UDDISubscriptionStatusSimpleIndex")
    UDDI_SUBSCRIPTION_STATUS_SIMPLE_INDEX("UDDISubscriptionStatusSimpleIndex"),
    @XmlEnumValue("Version")
    VERSION("Version"),
    @XmlEnumValue("VlanInterfaceStatus")
    VLAN_INTERFACE_STATUS("VlanInterfaceStatus"),
    @XmlEnumValue("VoltageSensors")
    VOLTAGE_SENSORS("VoltageSensors"),
    @XmlEnumValue("WebAppFwAccepted")
    WEB_APP_FW_ACCEPTED("WebAppFwAccepted"),
    @XmlEnumValue("WebAppFwRejected")
    WEB_APP_FW_REJECTED("WebAppFwRejected"),
    @XmlEnumValue("WebAppFWSummary")
    WEB_APP_FW_SUMMARY("WebAppFWSummary"),
    @XmlEnumValue("WebSphereJMSSourceProtocolHandlerSummary")
    WEB_SPHERE_JMS_SOURCE_PROTOCOL_HANDLER_SUMMARY("WebSphereJMSSourceProtocolHandlerSummary"),
    @XmlEnumValue("WebSphereJMSStatus")
    WEB_SPHERE_JMS_STATUS("WebSphereJMSStatus"),
    @XmlEnumValue("WSGatewaySummary")
    WS_GATEWAY_SUMMARY("WSGatewaySummary"),
    @XmlEnumValue("WSMAgentSpoolers")
    WSM_AGENT_SPOOLERS("WSMAgentSpoolers"),
    @XmlEnumValue("WSMAgentStatus")
    WSM_AGENT_STATUS("WSMAgentStatus"),
    @XmlEnumValue("WSOperationMetrics")
    WS_OPERATION_METRICS("WSOperationMetrics"),
    @XmlEnumValue("WSOperationMetricsSimpleIndex")
    WS_OPERATION_METRICS_SIMPLE_INDEX("WSOperationMetricsSimpleIndex"),
    @XmlEnumValue("WSOperationsStatus")
    WS_OPERATIONS_STATUS("WSOperationsStatus"),
    @XmlEnumValue("WSOperationsStatusSimpleIndex")
    WS_OPERATIONS_STATUS_SIMPLE_INDEX("WSOperationsStatusSimpleIndex"),
    @XmlEnumValue("WSRRSavdSrchSubsPolicyAttachmentsStatus")
    WSRR_SAVD_SRCH_SUBS_POLICY_ATTACHMENTS_STATUS("WSRRSavdSrchSubsPolicyAttachmentsStatus"),
    @XmlEnumValue("WSRRSavedSearchSubscriptionServiceStatus")
    WSRR_SAVED_SEARCH_SUBSCRIPTION_SERVICE_STATUS("WSRRSavedSearchSubscriptionServiceStatus"),
    @XmlEnumValue("WSRRSavedSearchSubscriptionStatus")
    WSRR_SAVED_SEARCH_SUBSCRIPTION_STATUS("WSRRSavedSearchSubscriptionStatus"),
    @XmlEnumValue("WSRRSubscriptionPolicyAttachmentsStatus")
    WSRR_SUBSCRIPTION_POLICY_ATTACHMENTS_STATUS("WSRRSubscriptionPolicyAttachmentsStatus"),
    @XmlEnumValue("WSRRSubscriptionServiceStatus")
    WSRR_SUBSCRIPTION_SERVICE_STATUS("WSRRSubscriptionServiceStatus"),
    @XmlEnumValue("WSRRSubscriptionStatus")
    WSRR_SUBSCRIPTION_STATUS("WSRRSubscriptionStatus"),
    @XmlEnumValue("WSWSDLStatus")
    WSWSDL_STATUS("WSWSDLStatus"),
    @XmlEnumValue("WSWSDLStatusSimpleIndex")
    WSWSDL_STATUS_SIMPLE_INDEX("WSWSDLStatusSimpleIndex"),
    @XmlEnumValue("XMLFirewallServiceSummary")
    XML_FIREWALL_SERVICE_SUMMARY("XMLFirewallServiceSummary"),
    @XmlEnumValue("XMLNamesStatus")
    XML_NAMES_STATUS("XMLNamesStatus"),
    @XmlEnumValue("XSLCoprocServiceSummary")
    XSL_COPROC_SERVICE_SUMMARY("XSLCoprocServiceSummary"),
    @XmlEnumValue("XSLProxyServiceSummary")
    XSL_PROXY_SERVICE_SUMMARY("XSLProxyServiceSummary"),
    @XmlEnumValue("XTCProtocolHandlerSummary")
    XTC_PROTOCOL_HANDLER_SUMMARY("XTCProtocolHandlerSummary"),
    @XmlEnumValue("ZHybridTCSstatus")
    Z_HYBRID_TC_SSTATUS("ZHybridTCSstatus"),
    @XmlEnumValue("ZosNSSstatus")
    ZOS_NS_SSTATUS("ZosNSSstatus");
    private final String value;

    StatusEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static StatusEnum fromValue(String v) {
        for (StatusEnum c: StatusEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
