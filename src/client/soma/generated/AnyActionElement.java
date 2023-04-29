
package client.soma.generated;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AnyActionElement complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AnyActionElement">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice maxOccurs="unbounded">
 *         &lt;element name="AddKnownHost" type="{http://www.datapower.com/schemas/management}ActionAddKnownHost"/>
 *         &lt;element name="AddPasswordMap" type="{http://www.datapower.com/schemas/management}ActionAddPasswordMap"/>
 *         &lt;element name="AddSelTestEntry" type="{http://www.datapower.com/schemas/management}ActionAddSelTestEntry"/>
 *         &lt;element name="AddTrustedHost" type="{http://www.datapower.com/schemas/management}ActionAddTrustedHost"/>
 *         &lt;element name="ApplyPatch" type="{http://www.datapower.com/schemas/management}ActionApplyPatch"/>
 *         &lt;element name="BackupConfig" type="{http://www.datapower.com/schemas/management}ActionBackupConfig"/>
 *         &lt;element name="BootDelete" type="{http://www.datapower.com/schemas/management}ActionBootDelete"/>
 *         &lt;element name="BootSwitch" type="{http://www.datapower.com/schemas/management}ActionBootSwitch"/>
 *         &lt;element name="BootUpdate" type="{http://www.datapower.com/schemas/management}ActionBootUpdate"/>
 *         &lt;element name="CacheSchema" type="{http://www.datapower.com/schemas/management}ActionCacheSchema"/>
 *         &lt;element name="CacheStylesheet" type="{http://www.datapower.com/schemas/management}ActionCacheStylesheet"/>
 *         &lt;element name="CacheWSDL" type="{http://www.datapower.com/schemas/management}ActionCacheWSDL"/>
 *         &lt;element name="ChangePassword" type="{http://www.datapower.com/schemas/management}ActionChangePassword"/>
 *         &lt;element name="ClearSel" type="{http://www.datapower.com/schemas/management}ActionClearSel"/>
 *         &lt;element name="ConvertCertificate" type="{http://www.datapower.com/schemas/management}ActionConvertCertificate"/>
 *         &lt;element name="ConvertKey" type="{http://www.datapower.com/schemas/management}ActionConvertKey"/>
 *         &lt;element name="CreateDir" type="{http://www.datapower.com/schemas/management}ActionCreateDir"/>
 *         &lt;element name="CreateTAMFiles" type="{http://www.datapower.com/schemas/management}ActionCreateTAMFiles"/>
 *         &lt;element name="CryptoExport" type="{http://www.datapower.com/schemas/management}ActionCryptoExport"/>
 *         &lt;element name="CryptoImport" type="{http://www.datapower.com/schemas/management}ActionCryptoImport"/>
 *         &lt;element name="DeleteFile" type="{http://www.datapower.com/schemas/management}ActionDeleteFile"/>
 *         &lt;element name="DeleteHSMKey" type="{http://www.datapower.com/schemas/management}ActionDeleteHSMKey"/>
 *         &lt;element name="DeleteKnownHost" type="{http://www.datapower.com/schemas/management}ActionDeleteKnownHost"/>
 *         &lt;element name="DeleteKnownHostTable" type="{http://www.datapower.com/schemas/management}ActionDeleteKnownHostTable"/>
 *         &lt;element name="DeletePasswordMap" type="{http://www.datapower.com/schemas/management}ActionDeletePasswordMap"/>
 *         &lt;element name="DeleteTrustedHost" type="{http://www.datapower.com/schemas/management}ActionDeleteTrustedHost"/>
 *         &lt;element name="DeviceCertificate" type="{http://www.datapower.com/schemas/management}ActionDeviceCertificate"/>
 *         &lt;element name="Disconnect" type="{http://www.datapower.com/schemas/management}ActionDisconnect"/>
 *         &lt;element name="DomainQuiesce" type="{http://www.datapower.com/schemas/management}ActionDomainQuiesce"/>
 *         &lt;element name="DomainUnquiesce" type="{http://www.datapower.com/schemas/management}ActionDomainUnquiesce"/>
 *         &lt;element name="ErrorReport" type="{http://www.datapower.com/schemas/management}ActionErrorReport"/>
 *         &lt;element name="ExecConfig" type="{http://www.datapower.com/schemas/management}ActionExecConfig"/>
 *         &lt;element name="FetchFile" type="{http://www.datapower.com/schemas/management}ActionFetchFile"/>
 *         &lt;element name="FileCapture" type="{http://www.datapower.com/schemas/management}ActionFileCapture"/>
 *         &lt;element name="FlushAAACache" type="{http://www.datapower.com/schemas/management}ActionFlushAAACache"/>
 *         &lt;element name="FlushArpCache" type="{http://www.datapower.com/schemas/management}ActionFlushArpCache"/>
 *         &lt;element name="FlushDNSCache" type="{http://www.datapower.com/schemas/management}ActionFlushDNSCache"/>
 *         &lt;element name="FlushDocumentCache" type="{http://www.datapower.com/schemas/management}ActionFlushDocumentCache"/>
 *         &lt;element name="FlushNDCache" type="{http://www.datapower.com/schemas/management}ActionFlushNDCache"/>
 *         &lt;element name="FlushNSSCache" type="{http://www.datapower.com/schemas/management}ActionFlushNSSCache"/>
 *         &lt;element name="FlushPDPCache" type="{http://www.datapower.com/schemas/management}ActionFlushPDPCache"/>
 *         &lt;element name="FlushRBMCache" type="{http://www.datapower.com/schemas/management}ActionFlushRBMCache"/>
 *         &lt;element name="FlushStylesheetCache" type="{http://www.datapower.com/schemas/management}ActionFlushStylesheetCache"/>
 *         &lt;element name="HSMCloneKWK" type="{http://www.datapower.com/schemas/management}ActionHSMCloneKWK"/>
 *         &lt;element name="HSMReInit" type="{http://www.datapower.com/schemas/management}ActionHSMReInit"/>
 *         &lt;element name="ImportExecute" type="{http://www.datapower.com/schemas/management}ActionImportExecute"/>
 *         &lt;element name="InitFibreChannelFilesystem" type="{http://www.datapower.com/schemas/management}ActionInitFibreChannelFilesystem"/>
 *         &lt;element name="InitializeCompactFlashFilesystem" type="{http://www.datapower.com/schemas/management}ActionInitializeCompactFlashFilesystem"/>
 *         &lt;element name="InitializeRaidVolumeFilesystem" type="{http://www.datapower.com/schemas/management}ActionInitializeRaidVolumeFilesystem"/>
 *         &lt;element name="InitializeRaidVolumeFilesystemNoEncryption" type="{http://www.datapower.com/schemas/management}ActionInitializeRaidVolumeFilesystemNoEncryption"/>
 *         &lt;element name="InitIScsiFilesystem" type="{http://www.datapower.com/schemas/management}ActionInitIScsiFilesystem"/>
 *         &lt;element name="Keygen" type="{http://www.datapower.com/schemas/management}ActionKeygen"/>
 *         &lt;element name="LocateDevice" type="{http://www.datapower.com/schemas/management}ActionLocateDevice"/>
 *         &lt;element name="MoveFile" type="{http://www.datapower.com/schemas/management}ActionMoveFile"/>
 *         &lt;element name="NoPasswordMap" type="{http://www.datapower.com/schemas/management}ActionNoPasswordMap"/>
 *         &lt;element name="PacketCapture" type="{http://www.datapower.com/schemas/management}ActionPacketCapture"/>
 *         &lt;element name="PacketCaptureDebug" type="{http://www.datapower.com/schemas/management}ActionPacketCaptureDebug"/>
 *         &lt;element name="PasswordMap" type="{http://www.datapower.com/schemas/management}ActionPasswordMap"/>
 *         &lt;element name="Ping" type="{http://www.datapower.com/schemas/management}ActionPing"/>
 *         &lt;element name="Quiesce" type="{http://www.datapower.com/schemas/management}ActionQuiesce"/>
 *         &lt;element name="QuiesceDP" type="{http://www.datapower.com/schemas/management}ActionQuiesceDP"/>
 *         &lt;element name="RaidActivate" type="{http://www.datapower.com/schemas/management}ActionRaidActivate"/>
 *         &lt;element name="RaidDelete" type="{http://www.datapower.com/schemas/management}ActionRaidDelete"/>
 *         &lt;element name="RaidInitialize" type="{http://www.datapower.com/schemas/management}ActionRaidInitialize"/>
 *         &lt;element name="RaidLearnBattery" type="{http://www.datapower.com/schemas/management}ActionRaidLearnBattery"/>
 *         &lt;element name="RaidMakeHotSpare" type="{http://www.datapower.com/schemas/management}ActionRaidMakeHotSpare"/>
 *         &lt;element name="RaidRebuild" type="{http://www.datapower.com/schemas/management}ActionRaidRebuild"/>
 *         &lt;element name="RefreshDocument" type="{http://www.datapower.com/schemas/management}ActionRefreshDocument"/>
 *         &lt;element name="RefreshStylesheet" type="{http://www.datapower.com/schemas/management}ActionRefreshStylesheet"/>
 *         &lt;element name="RefreshTAMCerts" type="{http://www.datapower.com/schemas/management}ActionRefreshTAMCerts"/>
 *         &lt;element name="RemoveCheckpoint" type="{http://www.datapower.com/schemas/management}ActionRemoveCheckpoint"/>
 *         &lt;element name="RemoveDir" type="{http://www.datapower.com/schemas/management}ActionRemoveDir"/>
 *         &lt;element name="RemoveStylesheet" type="{http://www.datapower.com/schemas/management}ActionRemoveStylesheet"/>
 *         &lt;element name="RepairCompactFlashFilesystem" type="{http://www.datapower.com/schemas/management}ActionRepairCompactFlashFilesystem"/>
 *         &lt;element name="RepairFibreChannelFilesystem" type="{http://www.datapower.com/schemas/management}ActionRepairFibreChannelFilesystem"/>
 *         &lt;element name="RepairIScsiFilesystem" type="{http://www.datapower.com/schemas/management}ActionRepairIScsiFilesystem"/>
 *         &lt;element name="RepairRaidVolumeFilesystem" type="{http://www.datapower.com/schemas/management}ActionRepairRaidVolumeFilesystem"/>
 *         &lt;element name="ResetDomain" type="{http://www.datapower.com/schemas/management}ActionResetDomain"/>
 *         &lt;element name="ResetThisDomain" type="{http://www.datapower.com/schemas/management}ActionResetThisDomain"/>
 *         &lt;element name="RestartDomain" type="{http://www.datapower.com/schemas/management}ActionRestartDomain"/>
 *         &lt;element name="RestartThisDomain" type="{http://www.datapower.com/schemas/management}ActionRestartThisDomain"/>
 *         &lt;element name="RollbackCheckpoint" type="{http://www.datapower.com/schemas/management}ActionRollbackCheckpoint"/>
 *         &lt;element name="SaveCheckpoint" type="{http://www.datapower.com/schemas/management}ActionSaveCheckpoint"/>
 *         &lt;element name="SaveConfig" type="{http://www.datapower.com/schemas/management}ActionSaveConfig"/>
 *         &lt;element name="SaveInternalState" type="{http://www.datapower.com/schemas/management}ActionSaveInternalState"/>
 *         &lt;element name="SecureBackup" type="{http://www.datapower.com/schemas/management}ActionSecureBackup"/>
 *         &lt;element name="SecureRestore" type="{http://www.datapower.com/schemas/management}ActionSecureRestore"/>
 *         &lt;element name="SelectConfig" type="{http://www.datapower.com/schemas/management}ActionSelectConfig"/>
 *         &lt;element name="SendErrorReport" type="{http://www.datapower.com/schemas/management}ActionSendErrorReport"/>
 *         &lt;element name="SendFile" type="{http://www.datapower.com/schemas/management}ActionSendFile"/>
 *         &lt;element name="SendLogEvent" type="{http://www.datapower.com/schemas/management}ActionSendLogEvent"/>
 *         &lt;element name="ServiceQuiesce" type="{http://www.datapower.com/schemas/management}ActionServiceQuiesce"/>
 *         &lt;element name="ServiceStatusQuiesce" type="{http://www.datapower.com/schemas/management}ActionServiceStatusQuiesce"/>
 *         &lt;element name="ServiceStatusUnquiesce" type="{http://www.datapower.com/schemas/management}ActionServiceStatusUnquiesce"/>
 *         &lt;element name="ServiceUnquiesce" type="{http://www.datapower.com/schemas/management}ActionServiceUnquiesce"/>
 *         &lt;element name="SetLogLevel" type="{http://www.datapower.com/schemas/management}ActionSetLogLevel"/>
 *         &lt;element name="SetRBMDebugLog" type="{http://www.datapower.com/schemas/management}ActionSetRBMDebugLog"/>
 *         &lt;element name="SetSystemVar" type="{http://www.datapower.com/schemas/management}ActionSetSystemVar"/>
 *         &lt;element name="SetTimeAndDate" type="{http://www.datapower.com/schemas/management}ActionSetTimeAndDate"/>
 *         &lt;element name="Shutdown" type="{http://www.datapower.com/schemas/management}ActionShutdown"/>
 *         &lt;element name="StopPacketCapture" type="{http://www.datapower.com/schemas/management}ActionStopPacketCapture"/>
 *         &lt;element name="TCPConnectionTest" type="{http://www.datapower.com/schemas/management}ActionTCPConnectionTest"/>
 *         &lt;element name="TestHardware" type="{http://www.datapower.com/schemas/management}ActionTestHardware"/>
 *         &lt;element name="TestPasswordMap" type="{http://www.datapower.com/schemas/management}ActionTestPasswordMap"/>
 *         &lt;element name="TestRadius" type="{http://www.datapower.com/schemas/management}ActionTestRadius"/>
 *         &lt;element name="TestURLMap" type="{http://www.datapower.com/schemas/management}ActionTestURLMap"/>
 *         &lt;element name="TestURLRefresh" type="{http://www.datapower.com/schemas/management}ActionTestURLRefresh"/>
 *         &lt;element name="TestURLRewrite" type="{http://www.datapower.com/schemas/management}ActionTestURLRewrite"/>
 *         &lt;element name="TestValidateSchema" type="{http://www.datapower.com/schemas/management}ActionTestValidateSchema"/>
 *         &lt;element name="UndoConfig" type="{http://www.datapower.com/schemas/management}ActionUndoConfig"/>
 *         &lt;element name="UniversalPacketCaptureDebug" type="{http://www.datapower.com/schemas/management}ActionUniversalPacketCaptureDebug"/>
 *         &lt;element name="UniversalStopPacketCapture" type="{http://www.datapower.com/schemas/management}ActionUniversalStopPacketCapture"/>
 *         &lt;element name="Unquiesce" type="{http://www.datapower.com/schemas/management}ActionUnquiesce"/>
 *         &lt;element name="UnquiesceDP" type="{http://www.datapower.com/schemas/management}ActionUnquiesceDP"/>
 *         &lt;element name="UpgradeWatchdog" type="{http://www.datapower.com/schemas/management}ActionUpgradeWatchdog"/>
 *         &lt;element name="UserForcePasswordChange" type="{http://www.datapower.com/schemas/management}ActionUserForcePasswordChange"/>
 *         &lt;element name="UserResetFailedLogin" type="{http://www.datapower.com/schemas/management}ActionUserResetFailedLogin"/>
 *         &lt;element name="UserResetPassword" type="{http://www.datapower.com/schemas/management}ActionUserResetPassword"/>
 *         &lt;element name="ValCredAddCertsFromDir" type="{http://www.datapower.com/schemas/management}ActionValCredAddCertsFromDir"/>
 *         &lt;element name="VLANPacketCapture" type="{http://www.datapower.com/schemas/management}ActionVLANPacketCapture"/>
 *         &lt;element name="VLANStopPacketCapture" type="{http://www.datapower.com/schemas/management}ActionVLANStopPacketCapture"/>
 *         &lt;element name="WsrrSynchronize" type="{http://www.datapower.com/schemas/management}ActionWsrrSynchronize"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AnyActionElement", propOrder = {
    "addKnownHostOrAddPasswordMapOrAddSelTestEntry"
})
public class AnyActionElement {

    @XmlElements({
        @XmlElement(name = "Keygen", type = ActionKeygen.class),
        @XmlElement(name = "RemoveCheckpoint", type = ActionRemoveCheckpoint.class),
        @XmlElement(name = "Disconnect", type = ActionDisconnect.class),
        @XmlElement(name = "FlushPDPCache", type = ActionFlushPDPCache.class),
        @XmlElement(name = "RefreshStylesheet", type = ActionRefreshStylesheet.class),
        @XmlElement(name = "RepairIScsiFilesystem", type = ActionRepairIScsiFilesystem.class),
        @XmlElement(name = "HSMReInit", type = ActionHSMReInit.class),
        @XmlElement(name = "FlushAAACache", type = ActionFlushAAACache.class),
        @XmlElement(name = "SetTimeAndDate", type = ActionSetTimeAndDate.class),
        @XmlElement(name = "RaidActivate", type = ActionRaidActivate.class),
        @XmlElement(name = "UserForcePasswordChange", type = ActionUserForcePasswordChange.class),
        @XmlElement(name = "UndoConfig", type = ActionUndoConfig.class),
        @XmlElement(name = "RefreshDocument", type = ActionRefreshDocument.class),
        @XmlElement(name = "CacheWSDL", type = ActionCacheWSDL.class),
        @XmlElement(name = "ServiceStatusQuiesce", type = ActionServiceStatusQuiesce.class),
        @XmlElement(name = "InitFibreChannelFilesystem", type = ActionInitFibreChannelFilesystem.class),
        @XmlElement(name = "RaidLearnBattery", type = ActionRaidLearnBattery.class),
        @XmlElement(name = "FlushArpCache", type = ActionFlushArpCache.class),
        @XmlElement(name = "SaveConfig", type = ActionSaveConfig.class),
        @XmlElement(name = "SendLogEvent", type = ActionSendLogEvent.class),
        @XmlElement(name = "CryptoExport", type = ActionCryptoExport.class),
        @XmlElement(name = "RaidRebuild", type = ActionRaidRebuild.class),
        @XmlElement(name = "SendErrorReport", type = ActionSendErrorReport.class),
        @XmlElement(name = "RepairFibreChannelFilesystem", type = ActionRepairFibreChannelFilesystem.class),
        @XmlElement(name = "UserResetFailedLogin", type = ActionUserResetFailedLogin.class),
        @XmlElement(name = "ValCredAddCertsFromDir", type = ActionValCredAddCertsFromDir.class),
        @XmlElement(name = "AddKnownHost", type = ActionAddKnownHost.class),
        @XmlElement(name = "ServiceStatusUnquiesce", type = ActionServiceStatusUnquiesce.class),
        @XmlElement(name = "TestURLMap", type = ActionTestURLMap.class),
        @XmlElement(name = "InitIScsiFilesystem", type = ActionInitIScsiFilesystem.class),
        @XmlElement(name = "SetSystemVar", type = ActionSetSystemVar.class),
        @XmlElement(name = "RestartDomain", type = ActionRestartDomain.class),
        @XmlElement(name = "RefreshTAMCerts", type = ActionRefreshTAMCerts.class),
        @XmlElement(name = "DeleteFile", type = ActionDeleteFile.class),
        @XmlElement(name = "RaidMakeHotSpare", type = ActionRaidMakeHotSpare.class),
        @XmlElement(name = "RepairCompactFlashFilesystem", type = ActionRepairCompactFlashFilesystem.class),
        @XmlElement(name = "InitializeRaidVolumeFilesystemNoEncryption", type = ActionInitializeRaidVolumeFilesystemNoEncryption.class),
        @XmlElement(name = "SaveInternalState", type = ActionSaveInternalState.class),
        @XmlElement(name = "ServiceQuiesce", type = ActionServiceQuiesce.class),
        @XmlElement(name = "UserResetPassword", type = ActionUserResetPassword.class),
        @XmlElement(name = "VLANStopPacketCapture", type = ActionVLANStopPacketCapture.class),
        @XmlElement(name = "VLANPacketCapture", type = ActionVLANPacketCapture.class),
        @XmlElement(name = "TestRadius", type = ActionTestRadius.class),
        @XmlElement(name = "CacheSchema", type = ActionCacheSchema.class),
        @XmlElement(name = "TestValidateSchema", type = ActionTestValidateSchema.class),
        @XmlElement(name = "SetLogLevel", type = ActionSetLogLevel.class),
        @XmlElement(name = "FetchFile", type = ActionFetchFile.class),
        @XmlElement(name = "PacketCaptureDebug", type = ActionPacketCaptureDebug.class),
        @XmlElement(name = "TestHardware", type = ActionTestHardware.class),
        @XmlElement(name = "BackupConfig", type = ActionBackupConfig.class),
        @XmlElement(name = "PasswordMap", type = ActionPasswordMap.class),
        @XmlElement(name = "ImportExecute", type = ActionImportExecute.class),
        @XmlElement(name = "RollbackCheckpoint", type = ActionRollbackCheckpoint.class),
        @XmlElement(name = "ServiceUnquiesce", type = ActionServiceUnquiesce.class),
        @XmlElement(name = "Unquiesce", type = ActionUnquiesce.class),
        @XmlElement(name = "RemoveDir", type = ActionRemoveDir.class),
        @XmlElement(name = "BootDelete", type = ActionBootDelete.class),
        @XmlElement(name = "DeletePasswordMap", type = ActionDeletePasswordMap.class),
        @XmlElement(name = "AddPasswordMap", type = ActionAddPasswordMap.class),
        @XmlElement(name = "Shutdown", type = ActionShutdown.class),
        @XmlElement(name = "BootSwitch", type = ActionBootSwitch.class),
        @XmlElement(name = "HSMCloneKWK", type = ActionHSMCloneKWK.class),
        @XmlElement(name = "DomainQuiesce", type = ActionDomainQuiesce.class),
        @XmlElement(name = "WsrrSynchronize", type = ActionWsrrSynchronize.class),
        @XmlElement(name = "CryptoImport", type = ActionCryptoImport.class),
        @XmlElement(name = "TestPasswordMap", type = ActionTestPasswordMap.class),
        @XmlElement(name = "UnquiesceDP", type = ActionUnquiesceDP.class),
        @XmlElement(name = "NoPasswordMap", type = ActionNoPasswordMap.class),
        @XmlElement(name = "PacketCapture", type = ActionPacketCapture.class),
        @XmlElement(name = "SecureRestore", type = ActionSecureRestore.class),
        @XmlElement(name = "DeleteTrustedHost", type = ActionDeleteTrustedHost.class),
        @XmlElement(name = "CacheStylesheet", type = ActionCacheStylesheet.class),
        @XmlElement(name = "DeleteKnownHostTable", type = ActionDeleteKnownHostTable.class),
        @XmlElement(name = "SelectConfig", type = ActionSelectConfig.class),
        @XmlElement(name = "ClearSel", type = ActionClearSel.class),
        @XmlElement(name = "RaidInitialize", type = ActionRaidInitialize.class),
        @XmlElement(name = "InitializeRaidVolumeFilesystem", type = ActionInitializeRaidVolumeFilesystem.class),
        @XmlElement(name = "ResetDomain", type = ActionResetDomain.class),
        @XmlElement(name = "FlushDNSCache", type = ActionFlushDNSCache.class),
        @XmlElement(name = "DeleteHSMKey", type = ActionDeleteHSMKey.class),
        @XmlElement(name = "UniversalPacketCaptureDebug", type = ActionUniversalPacketCaptureDebug.class),
        @XmlElement(name = "CreateDir", type = ActionCreateDir.class),
        @XmlElement(name = "SecureBackup", type = ActionSecureBackup.class),
        @XmlElement(name = "UpgradeWatchdog", type = ActionUpgradeWatchdog.class),
        @XmlElement(name = "DomainUnquiesce", type = ActionDomainUnquiesce.class),
        @XmlElement(name = "SaveCheckpoint", type = ActionSaveCheckpoint.class),
        @XmlElement(name = "BootUpdate", type = ActionBootUpdate.class),
        @XmlElement(name = "Ping", type = ActionPing.class),
        @XmlElement(name = "FlushNDCache", type = ActionFlushNDCache.class),
        @XmlElement(name = "DeleteKnownHost", type = ActionDeleteKnownHost.class),
        @XmlElement(name = "ConvertKey", type = ActionConvertKey.class),
        @XmlElement(name = "AddTrustedHost", type = ActionAddTrustedHost.class),
        @XmlElement(name = "RaidDelete", type = ActionRaidDelete.class),
        @XmlElement(name = "FlushStylesheetCache", type = ActionFlushStylesheetCache.class),
        @XmlElement(name = "ExecConfig", type = ActionExecConfig.class),
        @XmlElement(name = "ApplyPatch", type = ActionApplyPatch.class),
        @XmlElement(name = "TCPConnectionTest", type = ActionTCPConnectionTest.class),
        @XmlElement(name = "ChangePassword", type = ActionChangePassword.class),
        @XmlElement(name = "CreateTAMFiles", type = ActionCreateTAMFiles.class),
        @XmlElement(name = "TestURLRefresh", type = ActionTestURLRefresh.class),
        @XmlElement(name = "RepairRaidVolumeFilesystem", type = ActionRepairRaidVolumeFilesystem.class),
        @XmlElement(name = "DeviceCertificate", type = ActionDeviceCertificate.class),
        @XmlElement(name = "UniversalStopPacketCapture", type = ActionUniversalStopPacketCapture.class),
        @XmlElement(name = "FileCapture", type = ActionFileCapture.class),
        @XmlElement(name = "AddSelTestEntry", type = ActionAddSelTestEntry.class),
        @XmlElement(name = "TestURLRewrite", type = ActionTestURLRewrite.class),
        @XmlElement(name = "StopPacketCapture", type = ActionStopPacketCapture.class),
        @XmlElement(name = "FlushRBMCache", type = ActionFlushRBMCache.class),
        @XmlElement(name = "SendFile", type = ActionSendFile.class),
        @XmlElement(name = "RestartThisDomain", type = ActionRestartThisDomain.class),
        @XmlElement(name = "RemoveStylesheet", type = ActionRemoveStylesheet.class),
        @XmlElement(name = "QuiesceDP", type = ActionQuiesceDP.class),
        @XmlElement(name = "ErrorReport", type = ActionErrorReport.class),
        @XmlElement(name = "SetRBMDebugLog", type = ActionSetRBMDebugLog.class),
        @XmlElement(name = "MoveFile", type = ActionMoveFile.class),
        @XmlElement(name = "ResetThisDomain", type = ActionResetThisDomain.class),
        @XmlElement(name = "InitializeCompactFlashFilesystem", type = ActionInitializeCompactFlashFilesystem.class),
        @XmlElement(name = "FlushNSSCache", type = ActionFlushNSSCache.class),
        @XmlElement(name = "Quiesce", type = ActionQuiesce.class),
        @XmlElement(name = "LocateDevice", type = ActionLocateDevice.class),
        @XmlElement(name = "ConvertCertificate", type = ActionConvertCertificate.class),
        @XmlElement(name = "FlushDocumentCache", type = ActionFlushDocumentCache.class)
    })
    protected List<Object> addKnownHostOrAddPasswordMapOrAddSelTestEntry;

    /**
     * Gets the value of the addKnownHostOrAddPasswordMapOrAddSelTestEntry property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the addKnownHostOrAddPasswordMapOrAddSelTestEntry property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAddKnownHostOrAddPasswordMapOrAddSelTestEntry().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ActionKeygen }
     * {@link ActionRemoveCheckpoint }
     * {@link ActionDisconnect }
     * {@link ActionFlushPDPCache }
     * {@link ActionRefreshStylesheet }
     * {@link ActionRepairIScsiFilesystem }
     * {@link ActionHSMReInit }
     * {@link ActionFlushAAACache }
     * {@link ActionSetTimeAndDate }
     * {@link ActionRaidActivate }
     * {@link ActionUserForcePasswordChange }
     * {@link ActionUndoConfig }
     * {@link ActionRefreshDocument }
     * {@link ActionCacheWSDL }
     * {@link ActionServiceStatusQuiesce }
     * {@link ActionInitFibreChannelFilesystem }
     * {@link ActionRaidLearnBattery }
     * {@link ActionFlushArpCache }
     * {@link ActionSaveConfig }
     * {@link ActionSendLogEvent }
     * {@link ActionCryptoExport }
     * {@link ActionRaidRebuild }
     * {@link ActionSendErrorReport }
     * {@link ActionRepairFibreChannelFilesystem }
     * {@link ActionUserResetFailedLogin }
     * {@link ActionValCredAddCertsFromDir }
     * {@link ActionAddKnownHost }
     * {@link ActionServiceStatusUnquiesce }
     * {@link ActionTestURLMap }
     * {@link ActionInitIScsiFilesystem }
     * {@link ActionSetSystemVar }
     * {@link ActionRestartDomain }
     * {@link ActionRefreshTAMCerts }
     * {@link ActionDeleteFile }
     * {@link ActionRaidMakeHotSpare }
     * {@link ActionRepairCompactFlashFilesystem }
     * {@link ActionInitializeRaidVolumeFilesystemNoEncryption }
     * {@link ActionSaveInternalState }
     * {@link ActionServiceQuiesce }
     * {@link ActionUserResetPassword }
     * {@link ActionVLANStopPacketCapture }
     * {@link ActionVLANPacketCapture }
     * {@link ActionTestRadius }
     * {@link ActionCacheSchema }
     * {@link ActionTestValidateSchema }
     * {@link ActionSetLogLevel }
     * {@link ActionFetchFile }
     * {@link ActionPacketCaptureDebug }
     * {@link ActionTestHardware }
     * {@link ActionBackupConfig }
     * {@link ActionPasswordMap }
     * {@link ActionImportExecute }
     * {@link ActionRollbackCheckpoint }
     * {@link ActionServiceUnquiesce }
     * {@link ActionUnquiesce }
     * {@link ActionRemoveDir }
     * {@link ActionBootDelete }
     * {@link ActionDeletePasswordMap }
     * {@link ActionAddPasswordMap }
     * {@link ActionShutdown }
     * {@link ActionBootSwitch }
     * {@link ActionHSMCloneKWK }
     * {@link ActionDomainQuiesce }
     * {@link ActionWsrrSynchronize }
     * {@link ActionCryptoImport }
     * {@link ActionTestPasswordMap }
     * {@link ActionUnquiesceDP }
     * {@link ActionNoPasswordMap }
     * {@link ActionPacketCapture }
     * {@link ActionSecureRestore }
     * {@link ActionDeleteTrustedHost }
     * {@link ActionCacheStylesheet }
     * {@link ActionDeleteKnownHostTable }
     * {@link ActionSelectConfig }
     * {@link ActionClearSel }
     * {@link ActionRaidInitialize }
     * {@link ActionInitializeRaidVolumeFilesystem }
     * {@link ActionResetDomain }
     * {@link ActionFlushDNSCache }
     * {@link ActionDeleteHSMKey }
     * {@link ActionUniversalPacketCaptureDebug }
     * {@link ActionCreateDir }
     * {@link ActionSecureBackup }
     * {@link ActionUpgradeWatchdog }
     * {@link ActionDomainUnquiesce }
     * {@link ActionSaveCheckpoint }
     * {@link ActionBootUpdate }
     * {@link ActionPing }
     * {@link ActionFlushNDCache }
     * {@link ActionDeleteKnownHost }
     * {@link ActionConvertKey }
     * {@link ActionAddTrustedHost }
     * {@link ActionRaidDelete }
     * {@link ActionFlushStylesheetCache }
     * {@link ActionExecConfig }
     * {@link ActionApplyPatch }
     * {@link ActionTCPConnectionTest }
     * {@link ActionChangePassword }
     * {@link ActionCreateTAMFiles }
     * {@link ActionTestURLRefresh }
     * {@link ActionRepairRaidVolumeFilesystem }
     * {@link ActionDeviceCertificate }
     * {@link ActionUniversalStopPacketCapture }
     * {@link ActionFileCapture }
     * {@link ActionAddSelTestEntry }
     * {@link ActionTestURLRewrite }
     * {@link ActionStopPacketCapture }
     * {@link ActionFlushRBMCache }
     * {@link ActionSendFile }
     * {@link ActionRestartThisDomain }
     * {@link ActionRemoveStylesheet }
     * {@link ActionQuiesceDP }
     * {@link ActionErrorReport }
     * {@link ActionSetRBMDebugLog }
     * {@link ActionMoveFile }
     * {@link ActionResetThisDomain }
     * {@link ActionInitializeCompactFlashFilesystem }
     * {@link ActionFlushNSSCache }
     * {@link ActionQuiesce }
     * {@link ActionLocateDevice }
     * {@link ActionConvertCertificate }
     * {@link ActionFlushDocumentCache }
     * 
     * 
     */
    public List<Object> getAddKnownHostOrAddPasswordMapOrAddSelTestEntry() {
        if (addKnownHostOrAddPasswordMapOrAddSelTestEntry == null) {
            addKnownHostOrAddPasswordMapOrAddSelTestEntry = new ArrayList<Object>();
        }
        return this.addKnownHostOrAddPasswordMapOrAddSelTestEntry;
    }

}
