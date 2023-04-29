
package client.soma.generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ActionEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ActionEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="AddKnownHost"/>
 *     &lt;enumeration value="AddPasswordMap"/>
 *     &lt;enumeration value="AddSelTestEntry"/>
 *     &lt;enumeration value="AddTrustedHost"/>
 *     &lt;enumeration value="ApplyPatch"/>
 *     &lt;enumeration value="BackupConfig"/>
 *     &lt;enumeration value="BootDelete"/>
 *     &lt;enumeration value="BootSwitch"/>
 *     &lt;enumeration value="BootUpdate"/>
 *     &lt;enumeration value="CacheSchema"/>
 *     &lt;enumeration value="CacheStylesheet"/>
 *     &lt;enumeration value="CacheWSDL"/>
 *     &lt;enumeration value="ChangePassword"/>
 *     &lt;enumeration value="ClearSel"/>
 *     &lt;enumeration value="ConvertCertificate"/>
 *     &lt;enumeration value="ConvertKey"/>
 *     &lt;enumeration value="CreateDir"/>
 *     &lt;enumeration value="CreateTAMFiles"/>
 *     &lt;enumeration value="CryptoExport"/>
 *     &lt;enumeration value="CryptoImport"/>
 *     &lt;enumeration value="DeleteFile"/>
 *     &lt;enumeration value="DeleteHSMKey"/>
 *     &lt;enumeration value="DeleteKnownHost"/>
 *     &lt;enumeration value="DeleteKnownHostTable"/>
 *     &lt;enumeration value="DeletePasswordMap"/>
 *     &lt;enumeration value="DeleteTrustedHost"/>
 *     &lt;enumeration value="DeviceCertificate"/>
 *     &lt;enumeration value="Disconnect"/>
 *     &lt;enumeration value="DomainQuiesce"/>
 *     &lt;enumeration value="DomainUnquiesce"/>
 *     &lt;enumeration value="ErrorReport"/>
 *     &lt;enumeration value="ExecConfig"/>
 *     &lt;enumeration value="FetchFile"/>
 *     &lt;enumeration value="FileCapture"/>
 *     &lt;enumeration value="FlushAAACache"/>
 *     &lt;enumeration value="FlushArpCache"/>
 *     &lt;enumeration value="FlushDNSCache"/>
 *     &lt;enumeration value="FlushDocumentCache"/>
 *     &lt;enumeration value="FlushNDCache"/>
 *     &lt;enumeration value="FlushNSSCache"/>
 *     &lt;enumeration value="FlushPDPCache"/>
 *     &lt;enumeration value="FlushRBMCache"/>
 *     &lt;enumeration value="FlushStylesheetCache"/>
 *     &lt;enumeration value="HSMCloneKWK"/>
 *     &lt;enumeration value="HSMReInit"/>
 *     &lt;enumeration value="ImportExecute"/>
 *     &lt;enumeration value="InitFibreChannelFilesystem"/>
 *     &lt;enumeration value="InitializeCompactFlashFilesystem"/>
 *     &lt;enumeration value="InitializeRaidVolumeFilesystem"/>
 *     &lt;enumeration value="InitializeRaidVolumeFilesystemNoEncryption"/>
 *     &lt;enumeration value="InitIScsiFilesystem"/>
 *     &lt;enumeration value="Keygen"/>
 *     &lt;enumeration value="LocateDevice"/>
 *     &lt;enumeration value="MoveFile"/>
 *     &lt;enumeration value="NoPasswordMap"/>
 *     &lt;enumeration value="PacketCapture"/>
 *     &lt;enumeration value="PacketCaptureDebug"/>
 *     &lt;enumeration value="PasswordMap"/>
 *     &lt;enumeration value="Ping"/>
 *     &lt;enumeration value="Quiesce"/>
 *     &lt;enumeration value="QuiesceDP"/>
 *     &lt;enumeration value="RaidActivate"/>
 *     &lt;enumeration value="RaidDelete"/>
 *     &lt;enumeration value="RaidInitialize"/>
 *     &lt;enumeration value="RaidLearnBattery"/>
 *     &lt;enumeration value="RaidMakeHotSpare"/>
 *     &lt;enumeration value="RaidRebuild"/>
 *     &lt;enumeration value="RefreshDocument"/>
 *     &lt;enumeration value="RefreshStylesheet"/>
 *     &lt;enumeration value="RefreshTAMCerts"/>
 *     &lt;enumeration value="RemoveCheckpoint"/>
 *     &lt;enumeration value="RemoveDir"/>
 *     &lt;enumeration value="RemoveStylesheet"/>
 *     &lt;enumeration value="RepairCompactFlashFilesystem"/>
 *     &lt;enumeration value="RepairFibreChannelFilesystem"/>
 *     &lt;enumeration value="RepairIScsiFilesystem"/>
 *     &lt;enumeration value="RepairRaidVolumeFilesystem"/>
 *     &lt;enumeration value="ResetDomain"/>
 *     &lt;enumeration value="ResetThisDomain"/>
 *     &lt;enumeration value="RestartDomain"/>
 *     &lt;enumeration value="RestartThisDomain"/>
 *     &lt;enumeration value="RollbackCheckpoint"/>
 *     &lt;enumeration value="SaveCheckpoint"/>
 *     &lt;enumeration value="SaveConfig"/>
 *     &lt;enumeration value="SaveInternalState"/>
 *     &lt;enumeration value="SecureBackup"/>
 *     &lt;enumeration value="SecureRestore"/>
 *     &lt;enumeration value="SelectConfig"/>
 *     &lt;enumeration value="SendErrorReport"/>
 *     &lt;enumeration value="SendFile"/>
 *     &lt;enumeration value="SendLogEvent"/>
 *     &lt;enumeration value="ServiceQuiesce"/>
 *     &lt;enumeration value="ServiceStatusQuiesce"/>
 *     &lt;enumeration value="ServiceStatusUnquiesce"/>
 *     &lt;enumeration value="ServiceUnquiesce"/>
 *     &lt;enumeration value="SetLogLevel"/>
 *     &lt;enumeration value="SetRBMDebugLog"/>
 *     &lt;enumeration value="SetSystemVar"/>
 *     &lt;enumeration value="SetTimeAndDate"/>
 *     &lt;enumeration value="Shutdown"/>
 *     &lt;enumeration value="StopPacketCapture"/>
 *     &lt;enumeration value="TCPConnectionTest"/>
 *     &lt;enumeration value="TestHardware"/>
 *     &lt;enumeration value="TestPasswordMap"/>
 *     &lt;enumeration value="TestRadius"/>
 *     &lt;enumeration value="TestURLMap"/>
 *     &lt;enumeration value="TestURLRefresh"/>
 *     &lt;enumeration value="TestURLRewrite"/>
 *     &lt;enumeration value="TestValidateSchema"/>
 *     &lt;enumeration value="UndoConfig"/>
 *     &lt;enumeration value="UniversalPacketCaptureDebug"/>
 *     &lt;enumeration value="UniversalStopPacketCapture"/>
 *     &lt;enumeration value="Unquiesce"/>
 *     &lt;enumeration value="UnquiesceDP"/>
 *     &lt;enumeration value="UpgradeWatchdog"/>
 *     &lt;enumeration value="UserForcePasswordChange"/>
 *     &lt;enumeration value="UserResetFailedLogin"/>
 *     &lt;enumeration value="UserResetPassword"/>
 *     &lt;enumeration value="ValCredAddCertsFromDir"/>
 *     &lt;enumeration value="VLANPacketCapture"/>
 *     &lt;enumeration value="VLANStopPacketCapture"/>
 *     &lt;enumeration value="WsrrSynchronize"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ActionEnum")
@XmlEnum
public enum ActionEnum {

    @XmlEnumValue("AddKnownHost")
    ADD_KNOWN_HOST("AddKnownHost"),
    @XmlEnumValue("AddPasswordMap")
    ADD_PASSWORD_MAP("AddPasswordMap"),
    @XmlEnumValue("AddSelTestEntry")
    ADD_SEL_TEST_ENTRY("AddSelTestEntry"),
    @XmlEnumValue("AddTrustedHost")
    ADD_TRUSTED_HOST("AddTrustedHost"),
    @XmlEnumValue("ApplyPatch")
    APPLY_PATCH("ApplyPatch"),
    @XmlEnumValue("BackupConfig")
    BACKUP_CONFIG("BackupConfig"),
    @XmlEnumValue("BootDelete")
    BOOT_DELETE("BootDelete"),
    @XmlEnumValue("BootSwitch")
    BOOT_SWITCH("BootSwitch"),
    @XmlEnumValue("BootUpdate")
    BOOT_UPDATE("BootUpdate"),
    @XmlEnumValue("CacheSchema")
    CACHE_SCHEMA("CacheSchema"),
    @XmlEnumValue("CacheStylesheet")
    CACHE_STYLESHEET("CacheStylesheet"),
    @XmlEnumValue("CacheWSDL")
    CACHE_WSDL("CacheWSDL"),
    @XmlEnumValue("ChangePassword")
    CHANGE_PASSWORD("ChangePassword"),
    @XmlEnumValue("ClearSel")
    CLEAR_SEL("ClearSel"),
    @XmlEnumValue("ConvertCertificate")
    CONVERT_CERTIFICATE("ConvertCertificate"),
    @XmlEnumValue("ConvertKey")
    CONVERT_KEY("ConvertKey"),
    @XmlEnumValue("CreateDir")
    CREATE_DIR("CreateDir"),
    @XmlEnumValue("CreateTAMFiles")
    CREATE_TAM_FILES("CreateTAMFiles"),
    @XmlEnumValue("CryptoExport")
    CRYPTO_EXPORT("CryptoExport"),
    @XmlEnumValue("CryptoImport")
    CRYPTO_IMPORT("CryptoImport"),
    @XmlEnumValue("DeleteFile")
    DELETE_FILE("DeleteFile"),
    @XmlEnumValue("DeleteHSMKey")
    DELETE_HSM_KEY("DeleteHSMKey"),
    @XmlEnumValue("DeleteKnownHost")
    DELETE_KNOWN_HOST("DeleteKnownHost"),
    @XmlEnumValue("DeleteKnownHostTable")
    DELETE_KNOWN_HOST_TABLE("DeleteKnownHostTable"),
    @XmlEnumValue("DeletePasswordMap")
    DELETE_PASSWORD_MAP("DeletePasswordMap"),
    @XmlEnumValue("DeleteTrustedHost")
    DELETE_TRUSTED_HOST("DeleteTrustedHost"),
    @XmlEnumValue("DeviceCertificate")
    DEVICE_CERTIFICATE("DeviceCertificate"),
    @XmlEnumValue("Disconnect")
    DISCONNECT("Disconnect"),
    @XmlEnumValue("DomainQuiesce")
    DOMAIN_QUIESCE("DomainQuiesce"),
    @XmlEnumValue("DomainUnquiesce")
    DOMAIN_UNQUIESCE("DomainUnquiesce"),
    @XmlEnumValue("ErrorReport")
    ERROR_REPORT("ErrorReport"),
    @XmlEnumValue("ExecConfig")
    EXEC_CONFIG("ExecConfig"),
    @XmlEnumValue("FetchFile")
    FETCH_FILE("FetchFile"),
    @XmlEnumValue("FileCapture")
    FILE_CAPTURE("FileCapture"),
    @XmlEnumValue("FlushAAACache")
    FLUSH_AAA_CACHE("FlushAAACache"),
    @XmlEnumValue("FlushArpCache")
    FLUSH_ARP_CACHE("FlushArpCache"),
    @XmlEnumValue("FlushDNSCache")
    FLUSH_DNS_CACHE("FlushDNSCache"),
    @XmlEnumValue("FlushDocumentCache")
    FLUSH_DOCUMENT_CACHE("FlushDocumentCache"),
    @XmlEnumValue("FlushNDCache")
    FLUSH_ND_CACHE("FlushNDCache"),
    @XmlEnumValue("FlushNSSCache")
    FLUSH_NSS_CACHE("FlushNSSCache"),
    @XmlEnumValue("FlushPDPCache")
    FLUSH_PDP_CACHE("FlushPDPCache"),
    @XmlEnumValue("FlushRBMCache")
    FLUSH_RBM_CACHE("FlushRBMCache"),
    @XmlEnumValue("FlushStylesheetCache")
    FLUSH_STYLESHEET_CACHE("FlushStylesheetCache"),
    @XmlEnumValue("HSMCloneKWK")
    HSM_CLONE_KWK("HSMCloneKWK"),
    @XmlEnumValue("HSMReInit")
    HSM_RE_INIT("HSMReInit"),
    @XmlEnumValue("ImportExecute")
    IMPORT_EXECUTE("ImportExecute"),
    @XmlEnumValue("InitFibreChannelFilesystem")
    INIT_FIBRE_CHANNEL_FILESYSTEM("InitFibreChannelFilesystem"),
    @XmlEnumValue("InitializeCompactFlashFilesystem")
    INITIALIZE_COMPACT_FLASH_FILESYSTEM("InitializeCompactFlashFilesystem"),
    @XmlEnumValue("InitializeRaidVolumeFilesystem")
    INITIALIZE_RAID_VOLUME_FILESYSTEM("InitializeRaidVolumeFilesystem"),
    @XmlEnumValue("InitializeRaidVolumeFilesystemNoEncryption")
    INITIALIZE_RAID_VOLUME_FILESYSTEM_NO_ENCRYPTION("InitializeRaidVolumeFilesystemNoEncryption"),
    @XmlEnumValue("InitIScsiFilesystem")
    INIT_I_SCSI_FILESYSTEM("InitIScsiFilesystem"),
    @XmlEnumValue("Keygen")
    KEYGEN("Keygen"),
    @XmlEnumValue("LocateDevice")
    LOCATE_DEVICE("LocateDevice"),
    @XmlEnumValue("MoveFile")
    MOVE_FILE("MoveFile"),
    @XmlEnumValue("NoPasswordMap")
    NO_PASSWORD_MAP("NoPasswordMap"),
    @XmlEnumValue("PacketCapture")
    PACKET_CAPTURE("PacketCapture"),
    @XmlEnumValue("PacketCaptureDebug")
    PACKET_CAPTURE_DEBUG("PacketCaptureDebug"),
    @XmlEnumValue("PasswordMap")
    PASSWORD_MAP("PasswordMap"),
    @XmlEnumValue("Ping")
    PING("Ping"),
    @XmlEnumValue("Quiesce")
    QUIESCE("Quiesce"),
    @XmlEnumValue("QuiesceDP")
    QUIESCE_DP("QuiesceDP"),
    @XmlEnumValue("RaidActivate")
    RAID_ACTIVATE("RaidActivate"),
    @XmlEnumValue("RaidDelete")
    RAID_DELETE("RaidDelete"),
    @XmlEnumValue("RaidInitialize")
    RAID_INITIALIZE("RaidInitialize"),
    @XmlEnumValue("RaidLearnBattery")
    RAID_LEARN_BATTERY("RaidLearnBattery"),
    @XmlEnumValue("RaidMakeHotSpare")
    RAID_MAKE_HOT_SPARE("RaidMakeHotSpare"),
    @XmlEnumValue("RaidRebuild")
    RAID_REBUILD("RaidRebuild"),
    @XmlEnumValue("RefreshDocument")
    REFRESH_DOCUMENT("RefreshDocument"),
    @XmlEnumValue("RefreshStylesheet")
    REFRESH_STYLESHEET("RefreshStylesheet"),
    @XmlEnumValue("RefreshTAMCerts")
    REFRESH_TAM_CERTS("RefreshTAMCerts"),
    @XmlEnumValue("RemoveCheckpoint")
    REMOVE_CHECKPOINT("RemoveCheckpoint"),
    @XmlEnumValue("RemoveDir")
    REMOVE_DIR("RemoveDir"),
    @XmlEnumValue("RemoveStylesheet")
    REMOVE_STYLESHEET("RemoveStylesheet"),
    @XmlEnumValue("RepairCompactFlashFilesystem")
    REPAIR_COMPACT_FLASH_FILESYSTEM("RepairCompactFlashFilesystem"),
    @XmlEnumValue("RepairFibreChannelFilesystem")
    REPAIR_FIBRE_CHANNEL_FILESYSTEM("RepairFibreChannelFilesystem"),
    @XmlEnumValue("RepairIScsiFilesystem")
    REPAIR_I_SCSI_FILESYSTEM("RepairIScsiFilesystem"),
    @XmlEnumValue("RepairRaidVolumeFilesystem")
    REPAIR_RAID_VOLUME_FILESYSTEM("RepairRaidVolumeFilesystem"),
    @XmlEnumValue("ResetDomain")
    RESET_DOMAIN("ResetDomain"),
    @XmlEnumValue("ResetThisDomain")
    RESET_THIS_DOMAIN("ResetThisDomain"),
    @XmlEnumValue("RestartDomain")
    RESTART_DOMAIN("RestartDomain"),
    @XmlEnumValue("RestartThisDomain")
    RESTART_THIS_DOMAIN("RestartThisDomain"),
    @XmlEnumValue("RollbackCheckpoint")
    ROLLBACK_CHECKPOINT("RollbackCheckpoint"),
    @XmlEnumValue("SaveCheckpoint")
    SAVE_CHECKPOINT("SaveCheckpoint"),
    @XmlEnumValue("SaveConfig")
    SAVE_CONFIG("SaveConfig"),
    @XmlEnumValue("SaveInternalState")
    SAVE_INTERNAL_STATE("SaveInternalState"),
    @XmlEnumValue("SecureBackup")
    SECURE_BACKUP("SecureBackup"),
    @XmlEnumValue("SecureRestore")
    SECURE_RESTORE("SecureRestore"),
    @XmlEnumValue("SelectConfig")
    SELECT_CONFIG("SelectConfig"),
    @XmlEnumValue("SendErrorReport")
    SEND_ERROR_REPORT("SendErrorReport"),
    @XmlEnumValue("SendFile")
    SEND_FILE("SendFile"),
    @XmlEnumValue("SendLogEvent")
    SEND_LOG_EVENT("SendLogEvent"),
    @XmlEnumValue("ServiceQuiesce")
    SERVICE_QUIESCE("ServiceQuiesce"),
    @XmlEnumValue("ServiceStatusQuiesce")
    SERVICE_STATUS_QUIESCE("ServiceStatusQuiesce"),
    @XmlEnumValue("ServiceStatusUnquiesce")
    SERVICE_STATUS_UNQUIESCE("ServiceStatusUnquiesce"),
    @XmlEnumValue("ServiceUnquiesce")
    SERVICE_UNQUIESCE("ServiceUnquiesce"),
    @XmlEnumValue("SetLogLevel")
    SET_LOG_LEVEL("SetLogLevel"),
    @XmlEnumValue("SetRBMDebugLog")
    SET_RBM_DEBUG_LOG("SetRBMDebugLog"),
    @XmlEnumValue("SetSystemVar")
    SET_SYSTEM_VAR("SetSystemVar"),
    @XmlEnumValue("SetTimeAndDate")
    SET_TIME_AND_DATE("SetTimeAndDate"),
    @XmlEnumValue("Shutdown")
    SHUTDOWN("Shutdown"),
    @XmlEnumValue("StopPacketCapture")
    STOP_PACKET_CAPTURE("StopPacketCapture"),
    @XmlEnumValue("TCPConnectionTest")
    TCP_CONNECTION_TEST("TCPConnectionTest"),
    @XmlEnumValue("TestHardware")
    TEST_HARDWARE("TestHardware"),
    @XmlEnumValue("TestPasswordMap")
    TEST_PASSWORD_MAP("TestPasswordMap"),
    @XmlEnumValue("TestRadius")
    TEST_RADIUS("TestRadius"),
    @XmlEnumValue("TestURLMap")
    TEST_URL_MAP("TestURLMap"),
    @XmlEnumValue("TestURLRefresh")
    TEST_URL_REFRESH("TestURLRefresh"),
    @XmlEnumValue("TestURLRewrite")
    TEST_URL_REWRITE("TestURLRewrite"),
    @XmlEnumValue("TestValidateSchema")
    TEST_VALIDATE_SCHEMA("TestValidateSchema"),
    @XmlEnumValue("UndoConfig")
    UNDO_CONFIG("UndoConfig"),
    @XmlEnumValue("UniversalPacketCaptureDebug")
    UNIVERSAL_PACKET_CAPTURE_DEBUG("UniversalPacketCaptureDebug"),
    @XmlEnumValue("UniversalStopPacketCapture")
    UNIVERSAL_STOP_PACKET_CAPTURE("UniversalStopPacketCapture"),
    @XmlEnumValue("Unquiesce")
    UNQUIESCE("Unquiesce"),
    @XmlEnumValue("UnquiesceDP")
    UNQUIESCE_DP("UnquiesceDP"),
    @XmlEnumValue("UpgradeWatchdog")
    UPGRADE_WATCHDOG("UpgradeWatchdog"),
    @XmlEnumValue("UserForcePasswordChange")
    USER_FORCE_PASSWORD_CHANGE("UserForcePasswordChange"),
    @XmlEnumValue("UserResetFailedLogin")
    USER_RESET_FAILED_LOGIN("UserResetFailedLogin"),
    @XmlEnumValue("UserResetPassword")
    USER_RESET_PASSWORD("UserResetPassword"),
    @XmlEnumValue("ValCredAddCertsFromDir")
    VAL_CRED_ADD_CERTS_FROM_DIR("ValCredAddCertsFromDir"),
    @XmlEnumValue("VLANPacketCapture")
    VLAN_PACKET_CAPTURE("VLANPacketCapture"),
    @XmlEnumValue("VLANStopPacketCapture")
    VLAN_STOP_PACKET_CAPTURE("VLANStopPacketCapture"),
    @XmlEnumValue("WsrrSynchronize")
    WSRR_SYNCHRONIZE("WsrrSynchronize");
    private final String value;

    ActionEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ActionEnum fromValue(String v) {
        for (ActionEnum c: ActionEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
