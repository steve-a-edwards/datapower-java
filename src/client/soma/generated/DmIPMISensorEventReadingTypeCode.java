
package client.soma.generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dmIPMISensorEventReadingTypeCode.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="dmIPMISensorEventReadingTypeCode">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="none"/>
 *     &lt;enumeration value="undefined"/>
 *     &lt;enumeration value="lowerNonCriticalGoingLow"/>
 *     &lt;enumeration value="lowerNonCriticalGoingHigh"/>
 *     &lt;enumeration value="lowerCriticalGoingLow"/>
 *     &lt;enumeration value="lowerCriticalGoingHigh"/>
 *     &lt;enumeration value="lowerNonRecoverableGoingLow"/>
 *     &lt;enumeration value="lowerNonRecoverableGoingHigh"/>
 *     &lt;enumeration value="upperNonCriticalGoingLow"/>
 *     &lt;enumeration value="upperNonCriticalGoingHigh"/>
 *     &lt;enumeration value="upperCriticalGoingLow"/>
 *     &lt;enumeration value="upperCriticalGoingHigh"/>
 *     &lt;enumeration value="upperNonRecoverableGoingLow"/>
 *     &lt;enumeration value="upperNonRecoverableGoingHigh"/>
 *     &lt;enumeration value="transitionToIdle"/>
 *     &lt;enumeration value="transitionToActive"/>
 *     &lt;enumeration value="transitionToBusy"/>
 *     &lt;enumeration value="stateDeasserted"/>
 *     &lt;enumeration value="stateAsserted"/>
 *     &lt;enumeration value="predictiveFailureDeasserted"/>
 *     &lt;enumeration value="predictiveFailureAsserted"/>
 *     &lt;enumeration value="limitNotExceeded"/>
 *     &lt;enumeration value="limitExceeded"/>
 *     &lt;enumeration value="performanceMet"/>
 *     &lt;enumeration value="performanceLags"/>
 *     &lt;enumeration value="transitionToOK"/>
 *     &lt;enumeration value="transitionToNonCriticalFromOK"/>
 *     &lt;enumeration value="transitionToCriticalFromLessSevere"/>
 *     &lt;enumeration value="transitionToNonRecoverableFromLessSevere"/>
 *     &lt;enumeration value="transitionToNonCriticalFromMoreSevere"/>
 *     &lt;enumeration value="transitionToCriticalFromNonRecoverable"/>
 *     &lt;enumeration value="transitionToNonRecoverable"/>
 *     &lt;enumeration value="monitor"/>
 *     &lt;enumeration value="informational"/>
 *     &lt;enumeration value="deviceRemovedOrAbsent"/>
 *     &lt;enumeration value="deviceInsertedOrPresent"/>
 *     &lt;enumeration value="deviceDisabled"/>
 *     &lt;enumeration value="deviceEnabled"/>
 *     &lt;enumeration value="transitionToRunning"/>
 *     &lt;enumeration value="transitionToInTest"/>
 *     &lt;enumeration value="transitionToPowerOff"/>
 *     &lt;enumeration value="transitionToOnLine"/>
 *     &lt;enumeration value="transitionToOffLine"/>
 *     &lt;enumeration value="transitionToOffDuty"/>
 *     &lt;enumeration value="transitionToDegraded"/>
 *     &lt;enumeration value="transitionToPowerSave"/>
 *     &lt;enumeration value="installError"/>
 *     &lt;enumeration value="fullyRedundant"/>
 *     &lt;enumeration value="redundancyLost"/>
 *     &lt;enumeration value="redundancyDegraded"/>
 *     &lt;enumeration value="nonRedundantSufficientResourcesFromRedundant"/>
 *     &lt;enumeration value="nonRedundantSufficientResourcesFromInsufficient"/>
 *     &lt;enumeration value="nonRedundantInsufficientResources"/>
 *     &lt;enumeration value="redundancyDegradedFromFullyRedundant"/>
 *     &lt;enumeration value="redundancyDegradedFRomNonRedundant"/>
 *     &lt;enumeration value="acpiD0PowerState"/>
 *     &lt;enumeration value="acpiD1PowerState"/>
 *     &lt;enumeration value="acpiD2PowerState"/>
 *     &lt;enumeration value="acpiD3PowerState"/>
 *     &lt;enumeration value="temperature"/>
 *     &lt;enumeration value="voltage"/>
 *     &lt;enumeration value="current"/>
 *     &lt;enumeration value="fan"/>
 *     &lt;enumeration value="generalChassisIntrusion"/>
 *     &lt;enumeration value="driveBayIntrusion"/>
 *     &lt;enumeration value="ioCardAreaIntrusion"/>
 *     &lt;enumeration value="processorAreaIntrusion"/>
 *     &lt;enumeration value="lanLeashLost"/>
 *     &lt;enumeration value="unauthorizedDockUndock"/>
 *     &lt;enumeration value="fanAreaIntrusion"/>
 *     &lt;enumeration value="secureModeViolationAttempt"/>
 *     &lt;enumeration value="preBootPasswordViolationUser"/>
 *     &lt;enumeration value="preBootPasswordViolationSetup"/>
 *     &lt;enumeration value="preBootPasswordViolationNetworkBoot"/>
 *     &lt;enumeration value="otherPreBootPasswordViolation"/>
 *     &lt;enumeration value="outOfBandAccessPasswordViolation"/>
 *     &lt;enumeration value="ierr"/>
 *     &lt;enumeration value="thermalTrip"/>
 *     &lt;enumeration value="frb1BistFailure"/>
 *     &lt;enumeration value="frb2HangInPostFailure"/>
 *     &lt;enumeration value="frb3ProcessorStartupInitializationFailure"/>
 *     &lt;enumeration value="configurationError"/>
 *     &lt;enumeration value="smbiosUncorrectableCpuComplexError"/>
 *     &lt;enumeration value="processorPresenceDetected"/>
 *     &lt;enumeration value="processorDisabled"/>
 *     &lt;enumeration value="terminatorPresenceDetected"/>
 *     &lt;enumeration value="processorAutomaticallyThrottled"/>
 *     &lt;enumeration value="powerSupplyPresenceDetected"/>
 *     &lt;enumeration value="powerSupplyFailureDetected"/>
 *     &lt;enumeration value="powerSupplyPredictiveFailure"/>
 *     &lt;enumeration value="powerSupplyAcLost"/>
 *     &lt;enumeration value="powerSupplyAcLostOrOutOfRange"/>
 *     &lt;enumeration value="powerSupplyAcOutOfRangeButPresent"/>
 *     &lt;enumeration value="powerSupplyConfigurationError"/>
 *     &lt;enumeration value="powerUnitPowerOff"/>
 *     &lt;enumeration value="powerUnitPowerCycle"/>
 *     &lt;enumeration value="powerUnit240VaPowerDown"/>
 *     &lt;enumeration value="powerUnitInterlockPowerDown"/>
 *     &lt;enumeration value="powerUnitAcLost"/>
 *     &lt;enumeration value="powerUnitSoftPowerControlFailure"/>
 *     &lt;enumeration value="powerUnitFailureDetected"/>
 *     &lt;enumeration value="powerUnitPredictiveFailure"/>
 *     &lt;enumeration value="correctableEcc"/>
 *     &lt;enumeration value="uncorrectableEcc"/>
 *     &lt;enumeration value="parity"/>
 *     &lt;enumeration value="memoryScrubFailed"/>
 *     &lt;enumeration value="memoryDeviceDisabled"/>
 *     &lt;enumeration value="correctableEccLoggingLimitReached"/>
 *     &lt;enumeration value="memoryPresenceDetected"/>
 *     &lt;enumeration value="memoryConfigurationError"/>
 *     &lt;enumeration value="memorySpare"/>
 *     &lt;enumeration value="memoryAutomaticallyThrottled"/>
 *     &lt;enumeration value="memoryCriticalOvertemperature"/>
 *     &lt;enumeration value="drivePresence"/>
 *     &lt;enumeration value="driveFault"/>
 *     &lt;enumeration value="drivePredictiveFailure"/>
 *     &lt;enumeration value="driveHotSpare"/>
 *     &lt;enumeration value="driveConsistencyCheckInProgress"/>
 *     &lt;enumeration value="driveInCriticalArray"/>
 *     &lt;enumeration value="driveInFailedArray"/>
 *     &lt;enumeration value="driveRebuildInProgress"/>
 *     &lt;enumeration value="driveRebuildAborted"/>
 *     &lt;enumeration value="systemFirmwareError"/>
 *     &lt;enumeration value="systemFirmwareHang"/>
 *     &lt;enumeration value="systemFirmwareProgress"/>
 *     &lt;enumeration value="correctableMemoryErrorLoggingDisabled"/>
 *     &lt;enumeration value="eventLoggingDisabled"/>
 *     &lt;enumeration value="logAreaReset"/>
 *     &lt;enumeration value="allEventLoggingDisabled"/>
 *     &lt;enumeration value="selFull"/>
 *     &lt;enumeration value="selAlmostFull"/>
 *     &lt;enumeration value="biosWatchdogReset"/>
 *     &lt;enumeration value="osWatchdogReset"/>
 *     &lt;enumeration value="osWatchdogShutDown"/>
 *     &lt;enumeration value="osWatchdogPowerDown"/>
 *     &lt;enumeration value="osWatchdogPowerCycle"/>
 *     &lt;enumeration value="osWatchdogNmiDiagnosticInterrupt"/>
 *     &lt;enumeration value="osWatchdogExpiredStatusOnly"/>
 *     &lt;enumeration value="osWatchdogPreTimeoutInterrupt"/>
 *     &lt;enumeration value="systemReconfigured"/>
 *     &lt;enumeration value="oemSystemBootEvent"/>
 *     &lt;enumeration value="undeterminedSystemHardwareFailure"/>
 *     &lt;enumeration value="entryAddedToAuxiliaryLog"/>
 *     &lt;enumeration value="pefAction"/>
 *     &lt;enumeration value="frontPanelNmiInterrupt"/>
 *     &lt;enumeration value="busTimeout"/>
 *     &lt;enumeration value="ioChannelCheckNmi"/>
 *     &lt;enumeration value="softwareNmi"/>
 *     &lt;enumeration value="pciPerr"/>
 *     &lt;enumeration value="pciSerr"/>
 *     &lt;enumeration value="eisaFailSafeTimeout"/>
 *     &lt;enumeration value="busCorrectableError"/>
 *     &lt;enumeration value="busUncorrectableError"/>
 *     &lt;enumeration value="fatalNmi"/>
 *     &lt;enumeration value="busFatalError"/>
 *     &lt;enumeration value="busDegraded"/>
 *     &lt;enumeration value="powerButtonPressed"/>
 *     &lt;enumeration value="sleepButtonPressed"/>
 *     &lt;enumeration value="resetButtonPressed"/>
 *     &lt;enumeration value="fruLatchOpen"/>
 *     &lt;enumeration value="fruServiceRequestButton"/>
 *     &lt;enumeration value="softPowerControlFailure"/>
 *     &lt;enumeration value="initiatedByPowerUp"/>
 *     &lt;enumeration value="initiatedByHardReset"/>
 *     &lt;enumeration value="initiatedByWarmReset"/>
 *     &lt;enumeration value="userRequestedPxeBoot"/>
 *     &lt;enumeration value="automaticBootToDiagnostic"/>
 *     &lt;enumeration value="noBootableMedia"/>
 *     &lt;enumeration value="nonBootableDiskette"/>
 *     &lt;enumeration value="pxeServerNotFound"/>
 *     &lt;enumeration value="invalidBootSector"/>
 *     &lt;enumeration value="timeoutWaitingForUserSelectionOfBootSource"/>
 *     &lt;enumeration value="aBootCompleted"/>
 *     &lt;enumeration value="cBootCompleted"/>
 *     &lt;enumeration value="pxeBootCompleted"/>
 *     &lt;enumeration value="diagnosticBootCompleted"/>
 *     &lt;enumeration value="cdromBootCompleted"/>
 *     &lt;enumeration value="romBootCompleted"/>
 *     &lt;enumeration value="bootCompleted"/>
 *     &lt;enumeration value="stopDuringOsLoadInitialization"/>
 *     &lt;enumeration value="runTimeStop"/>
 *     &lt;enumeration value="slotFaultStatusAsserted"/>
 *     &lt;enumeration value="slotIdentifyStatusAsserted"/>
 *     &lt;enumeration value="slotDeviceInstalled"/>
 *     &lt;enumeration value="slotReadyForDeviceInstallation"/>
 *     &lt;enumeration value="slotReadyForDeviceRemoval"/>
 *     &lt;enumeration value="slotPowerIsOff"/>
 *     &lt;enumeration value="slotDeviceRemovalRequest"/>
 *     &lt;enumeration value="slotInterlockAsserted"/>
 *     &lt;enumeration value="slotIsDisabled"/>
 *     &lt;enumeration value="slotHoldsSpare"/>
 *     &lt;enumeration value="acpiS0G0PowerState"/>
 *     &lt;enumeration value="acpiS1PowerState"/>
 *     &lt;enumeration value="acpiS2PowerState"/>
 *     &lt;enumeration value="acpiS3PowerState"/>
 *     &lt;enumeration value="acpiS4PowerState"/>
 *     &lt;enumeration value="acpiS5G2PowerState"/>
 *     &lt;enumeration value="acpiS4S5SoftOff"/>
 *     &lt;enumeration value="acpiG3PowerState"/>
 *     &lt;enumeration value="acpiSleepingS1S2S3"/>
 *     &lt;enumeration value="acpiG1PowerState"/>
 *     &lt;enumeration value="acpiS5OverrideState"/>
 *     &lt;enumeration value="acpiLegacyOnState"/>
 *     &lt;enumeration value="acpiLegacyOffState"/>
 *     &lt;enumeration value="acpiUnknown"/>
 *     &lt;enumeration value="watchdog2TimeExpired"/>
 *     &lt;enumeration value="watchdog2HardReset"/>
 *     &lt;enumeration value="watchdog2PowerDown"/>
 *     &lt;enumeration value="watchdog2PowerCycle"/>
 *     &lt;enumeration value="watchdog2TimerInterrupt"/>
 *     &lt;enumeration value="platformGeneratedPage"/>
 *     &lt;enumeration value="platformGeneratedLanAlert"/>
 *     &lt;enumeration value="platformGeneratedEventTrap"/>
 *     &lt;enumeration value="platformGeneratedSnmpTrap"/>
 *     &lt;enumeration value="entityPresent"/>
 *     &lt;enumeration value="entityAbsent"/>
 *     &lt;enumeration value="entityDisabled"/>
 *     &lt;enumeration value="lanHeartbeatLost"/>
 *     &lt;enumeration value="lanHeartbeat"/>
 *     &lt;enumeration value="sensorAccessDegradedOrUnavailable"/>
 *     &lt;enumeration value="controllerAccessDegradedOrUnavailable"/>
 *     &lt;enumeration value="managementControllerOffLine"/>
 *     &lt;enumeration value="managementControllerUnavailable"/>
 *     &lt;enumeration value="batteryLow"/>
 *     &lt;enumeration value="batteryFailed"/>
 *     &lt;enumeration value="batteryPresenceDetected"/>
 *     &lt;enumeration value="sessionActivated"/>
 *     &lt;enumeration value="sessionDeactivated"/>
 *     &lt;enumeration value="hardwareVersionChange"/>
 *     &lt;enumeration value="firmwareVersionChange"/>
 *     &lt;enumeration value="hardwareIncompatibility"/>
 *     &lt;enumeration value="firmwareIncompatibility"/>
 *     &lt;enumeration value="entityIsUnsupportedHardwareVersion"/>
 *     &lt;enumeration value="entityContainsUnsupportedFirmwareVersion"/>
 *     &lt;enumeration value="hardwareChangeSuccessful"/>
 *     &lt;enumeration value="firmwareChangeSuccessful"/>
 *     &lt;enumeration value="fruNotInstalled"/>
 *     &lt;enumeration value="fruInactive"/>
 *     &lt;enumeration value="fruActivationRequested"/>
 *     &lt;enumeration value="fruActivationInProgress"/>
 *     &lt;enumeration value="fruActive"/>
 *     &lt;enumeration value="fruDeactivationRequested"/>
 *     &lt;enumeration value="fruDeactivationInProgress"/>
 *     &lt;enumeration value="fruCommunicationLost"/>
 *     &lt;enumeration value="kernelPanic"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "dmIPMISensorEventReadingTypeCode")
@XmlEnum
public enum DmIPMISensorEventReadingTypeCode {

    @XmlEnumValue("none")
    NONE("none"),
    @XmlEnumValue("undefined")
    UNDEFINED("undefined"),
    @XmlEnumValue("lowerNonCriticalGoingLow")
    LOWER_NON_CRITICAL_GOING_LOW("lowerNonCriticalGoingLow"),
    @XmlEnumValue("lowerNonCriticalGoingHigh")
    LOWER_NON_CRITICAL_GOING_HIGH("lowerNonCriticalGoingHigh"),
    @XmlEnumValue("lowerCriticalGoingLow")
    LOWER_CRITICAL_GOING_LOW("lowerCriticalGoingLow"),
    @XmlEnumValue("lowerCriticalGoingHigh")
    LOWER_CRITICAL_GOING_HIGH("lowerCriticalGoingHigh"),
    @XmlEnumValue("lowerNonRecoverableGoingLow")
    LOWER_NON_RECOVERABLE_GOING_LOW("lowerNonRecoverableGoingLow"),
    @XmlEnumValue("lowerNonRecoverableGoingHigh")
    LOWER_NON_RECOVERABLE_GOING_HIGH("lowerNonRecoverableGoingHigh"),
    @XmlEnumValue("upperNonCriticalGoingLow")
    UPPER_NON_CRITICAL_GOING_LOW("upperNonCriticalGoingLow"),
    @XmlEnumValue("upperNonCriticalGoingHigh")
    UPPER_NON_CRITICAL_GOING_HIGH("upperNonCriticalGoingHigh"),
    @XmlEnumValue("upperCriticalGoingLow")
    UPPER_CRITICAL_GOING_LOW("upperCriticalGoingLow"),
    @XmlEnumValue("upperCriticalGoingHigh")
    UPPER_CRITICAL_GOING_HIGH("upperCriticalGoingHigh"),
    @XmlEnumValue("upperNonRecoverableGoingLow")
    UPPER_NON_RECOVERABLE_GOING_LOW("upperNonRecoverableGoingLow"),
    @XmlEnumValue("upperNonRecoverableGoingHigh")
    UPPER_NON_RECOVERABLE_GOING_HIGH("upperNonRecoverableGoingHigh"),
    @XmlEnumValue("transitionToIdle")
    TRANSITION_TO_IDLE("transitionToIdle"),
    @XmlEnumValue("transitionToActive")
    TRANSITION_TO_ACTIVE("transitionToActive"),
    @XmlEnumValue("transitionToBusy")
    TRANSITION_TO_BUSY("transitionToBusy"),
    @XmlEnumValue("stateDeasserted")
    STATE_DEASSERTED("stateDeasserted"),
    @XmlEnumValue("stateAsserted")
    STATE_ASSERTED("stateAsserted"),
    @XmlEnumValue("predictiveFailureDeasserted")
    PREDICTIVE_FAILURE_DEASSERTED("predictiveFailureDeasserted"),
    @XmlEnumValue("predictiveFailureAsserted")
    PREDICTIVE_FAILURE_ASSERTED("predictiveFailureAsserted"),
    @XmlEnumValue("limitNotExceeded")
    LIMIT_NOT_EXCEEDED("limitNotExceeded"),
    @XmlEnumValue("limitExceeded")
    LIMIT_EXCEEDED("limitExceeded"),
    @XmlEnumValue("performanceMet")
    PERFORMANCE_MET("performanceMet"),
    @XmlEnumValue("performanceLags")
    PERFORMANCE_LAGS("performanceLags"),
    @XmlEnumValue("transitionToOK")
    TRANSITION_TO_OK("transitionToOK"),
    @XmlEnumValue("transitionToNonCriticalFromOK")
    TRANSITION_TO_NON_CRITICAL_FROM_OK("transitionToNonCriticalFromOK"),
    @XmlEnumValue("transitionToCriticalFromLessSevere")
    TRANSITION_TO_CRITICAL_FROM_LESS_SEVERE("transitionToCriticalFromLessSevere"),
    @XmlEnumValue("transitionToNonRecoverableFromLessSevere")
    TRANSITION_TO_NON_RECOVERABLE_FROM_LESS_SEVERE("transitionToNonRecoverableFromLessSevere"),
    @XmlEnumValue("transitionToNonCriticalFromMoreSevere")
    TRANSITION_TO_NON_CRITICAL_FROM_MORE_SEVERE("transitionToNonCriticalFromMoreSevere"),
    @XmlEnumValue("transitionToCriticalFromNonRecoverable")
    TRANSITION_TO_CRITICAL_FROM_NON_RECOVERABLE("transitionToCriticalFromNonRecoverable"),
    @XmlEnumValue("transitionToNonRecoverable")
    TRANSITION_TO_NON_RECOVERABLE("transitionToNonRecoverable"),
    @XmlEnumValue("monitor")
    MONITOR("monitor"),
    @XmlEnumValue("informational")
    INFORMATIONAL("informational"),
    @XmlEnumValue("deviceRemovedOrAbsent")
    DEVICE_REMOVED_OR_ABSENT("deviceRemovedOrAbsent"),
    @XmlEnumValue("deviceInsertedOrPresent")
    DEVICE_INSERTED_OR_PRESENT("deviceInsertedOrPresent"),
    @XmlEnumValue("deviceDisabled")
    DEVICE_DISABLED("deviceDisabled"),
    @XmlEnumValue("deviceEnabled")
    DEVICE_ENABLED("deviceEnabled"),
    @XmlEnumValue("transitionToRunning")
    TRANSITION_TO_RUNNING("transitionToRunning"),
    @XmlEnumValue("transitionToInTest")
    TRANSITION_TO_IN_TEST("transitionToInTest"),
    @XmlEnumValue("transitionToPowerOff")
    TRANSITION_TO_POWER_OFF("transitionToPowerOff"),
    @XmlEnumValue("transitionToOnLine")
    TRANSITION_TO_ON_LINE("transitionToOnLine"),
    @XmlEnumValue("transitionToOffLine")
    TRANSITION_TO_OFF_LINE("transitionToOffLine"),
    @XmlEnumValue("transitionToOffDuty")
    TRANSITION_TO_OFF_DUTY("transitionToOffDuty"),
    @XmlEnumValue("transitionToDegraded")
    TRANSITION_TO_DEGRADED("transitionToDegraded"),
    @XmlEnumValue("transitionToPowerSave")
    TRANSITION_TO_POWER_SAVE("transitionToPowerSave"),
    @XmlEnumValue("installError")
    INSTALL_ERROR("installError"),
    @XmlEnumValue("fullyRedundant")
    FULLY_REDUNDANT("fullyRedundant"),
    @XmlEnumValue("redundancyLost")
    REDUNDANCY_LOST("redundancyLost"),
    @XmlEnumValue("redundancyDegraded")
    REDUNDANCY_DEGRADED("redundancyDegraded"),
    @XmlEnumValue("nonRedundantSufficientResourcesFromRedundant")
    NON_REDUNDANT_SUFFICIENT_RESOURCES_FROM_REDUNDANT("nonRedundantSufficientResourcesFromRedundant"),
    @XmlEnumValue("nonRedundantSufficientResourcesFromInsufficient")
    NON_REDUNDANT_SUFFICIENT_RESOURCES_FROM_INSUFFICIENT("nonRedundantSufficientResourcesFromInsufficient"),
    @XmlEnumValue("nonRedundantInsufficientResources")
    NON_REDUNDANT_INSUFFICIENT_RESOURCES("nonRedundantInsufficientResources"),
    @XmlEnumValue("redundancyDegradedFromFullyRedundant")
    REDUNDANCY_DEGRADED_FROM_FULLY_REDUNDANT("redundancyDegradedFromFullyRedundant"),
    @XmlEnumValue("redundancyDegradedFRomNonRedundant")
    REDUNDANCY_DEGRADED_F_ROM_NON_REDUNDANT("redundancyDegradedFRomNonRedundant"),
    @XmlEnumValue("acpiD0PowerState")
    ACPI_D_0_POWER_STATE("acpiD0PowerState"),
    @XmlEnumValue("acpiD1PowerState")
    ACPI_D_1_POWER_STATE("acpiD1PowerState"),
    @XmlEnumValue("acpiD2PowerState")
    ACPI_D_2_POWER_STATE("acpiD2PowerState"),
    @XmlEnumValue("acpiD3PowerState")
    ACPI_D_3_POWER_STATE("acpiD3PowerState"),
    @XmlEnumValue("temperature")
    TEMPERATURE("temperature"),
    @XmlEnumValue("voltage")
    VOLTAGE("voltage"),
    @XmlEnumValue("current")
    CURRENT("current"),
    @XmlEnumValue("fan")
    FAN("fan"),
    @XmlEnumValue("generalChassisIntrusion")
    GENERAL_CHASSIS_INTRUSION("generalChassisIntrusion"),
    @XmlEnumValue("driveBayIntrusion")
    DRIVE_BAY_INTRUSION("driveBayIntrusion"),
    @XmlEnumValue("ioCardAreaIntrusion")
    IO_CARD_AREA_INTRUSION("ioCardAreaIntrusion"),
    @XmlEnumValue("processorAreaIntrusion")
    PROCESSOR_AREA_INTRUSION("processorAreaIntrusion"),
    @XmlEnumValue("lanLeashLost")
    LAN_LEASH_LOST("lanLeashLost"),
    @XmlEnumValue("unauthorizedDockUndock")
    UNAUTHORIZED_DOCK_UNDOCK("unauthorizedDockUndock"),
    @XmlEnumValue("fanAreaIntrusion")
    FAN_AREA_INTRUSION("fanAreaIntrusion"),
    @XmlEnumValue("secureModeViolationAttempt")
    SECURE_MODE_VIOLATION_ATTEMPT("secureModeViolationAttempt"),
    @XmlEnumValue("preBootPasswordViolationUser")
    PRE_BOOT_PASSWORD_VIOLATION_USER("preBootPasswordViolationUser"),
    @XmlEnumValue("preBootPasswordViolationSetup")
    PRE_BOOT_PASSWORD_VIOLATION_SETUP("preBootPasswordViolationSetup"),
    @XmlEnumValue("preBootPasswordViolationNetworkBoot")
    PRE_BOOT_PASSWORD_VIOLATION_NETWORK_BOOT("preBootPasswordViolationNetworkBoot"),
    @XmlEnumValue("otherPreBootPasswordViolation")
    OTHER_PRE_BOOT_PASSWORD_VIOLATION("otherPreBootPasswordViolation"),
    @XmlEnumValue("outOfBandAccessPasswordViolation")
    OUT_OF_BAND_ACCESS_PASSWORD_VIOLATION("outOfBandAccessPasswordViolation"),
    @XmlEnumValue("ierr")
    IERR("ierr"),
    @XmlEnumValue("thermalTrip")
    THERMAL_TRIP("thermalTrip"),
    @XmlEnumValue("frb1BistFailure")
    FRB_1_BIST_FAILURE("frb1BistFailure"),
    @XmlEnumValue("frb2HangInPostFailure")
    FRB_2_HANG_IN_POST_FAILURE("frb2HangInPostFailure"),
    @XmlEnumValue("frb3ProcessorStartupInitializationFailure")
    FRB_3_PROCESSOR_STARTUP_INITIALIZATION_FAILURE("frb3ProcessorStartupInitializationFailure"),
    @XmlEnumValue("configurationError")
    CONFIGURATION_ERROR("configurationError"),
    @XmlEnumValue("smbiosUncorrectableCpuComplexError")
    SMBIOS_UNCORRECTABLE_CPU_COMPLEX_ERROR("smbiosUncorrectableCpuComplexError"),
    @XmlEnumValue("processorPresenceDetected")
    PROCESSOR_PRESENCE_DETECTED("processorPresenceDetected"),
    @XmlEnumValue("processorDisabled")
    PROCESSOR_DISABLED("processorDisabled"),
    @XmlEnumValue("terminatorPresenceDetected")
    TERMINATOR_PRESENCE_DETECTED("terminatorPresenceDetected"),
    @XmlEnumValue("processorAutomaticallyThrottled")
    PROCESSOR_AUTOMATICALLY_THROTTLED("processorAutomaticallyThrottled"),
    @XmlEnumValue("powerSupplyPresenceDetected")
    POWER_SUPPLY_PRESENCE_DETECTED("powerSupplyPresenceDetected"),
    @XmlEnumValue("powerSupplyFailureDetected")
    POWER_SUPPLY_FAILURE_DETECTED("powerSupplyFailureDetected"),
    @XmlEnumValue("powerSupplyPredictiveFailure")
    POWER_SUPPLY_PREDICTIVE_FAILURE("powerSupplyPredictiveFailure"),
    @XmlEnumValue("powerSupplyAcLost")
    POWER_SUPPLY_AC_LOST("powerSupplyAcLost"),
    @XmlEnumValue("powerSupplyAcLostOrOutOfRange")
    POWER_SUPPLY_AC_LOST_OR_OUT_OF_RANGE("powerSupplyAcLostOrOutOfRange"),
    @XmlEnumValue("powerSupplyAcOutOfRangeButPresent")
    POWER_SUPPLY_AC_OUT_OF_RANGE_BUT_PRESENT("powerSupplyAcOutOfRangeButPresent"),
    @XmlEnumValue("powerSupplyConfigurationError")
    POWER_SUPPLY_CONFIGURATION_ERROR("powerSupplyConfigurationError"),
    @XmlEnumValue("powerUnitPowerOff")
    POWER_UNIT_POWER_OFF("powerUnitPowerOff"),
    @XmlEnumValue("powerUnitPowerCycle")
    POWER_UNIT_POWER_CYCLE("powerUnitPowerCycle"),
    @XmlEnumValue("powerUnit240VaPowerDown")
    POWER_UNIT_240_VA_POWER_DOWN("powerUnit240VaPowerDown"),
    @XmlEnumValue("powerUnitInterlockPowerDown")
    POWER_UNIT_INTERLOCK_POWER_DOWN("powerUnitInterlockPowerDown"),
    @XmlEnumValue("powerUnitAcLost")
    POWER_UNIT_AC_LOST("powerUnitAcLost"),
    @XmlEnumValue("powerUnitSoftPowerControlFailure")
    POWER_UNIT_SOFT_POWER_CONTROL_FAILURE("powerUnitSoftPowerControlFailure"),
    @XmlEnumValue("powerUnitFailureDetected")
    POWER_UNIT_FAILURE_DETECTED("powerUnitFailureDetected"),
    @XmlEnumValue("powerUnitPredictiveFailure")
    POWER_UNIT_PREDICTIVE_FAILURE("powerUnitPredictiveFailure"),
    @XmlEnumValue("correctableEcc")
    CORRECTABLE_ECC("correctableEcc"),
    @XmlEnumValue("uncorrectableEcc")
    UNCORRECTABLE_ECC("uncorrectableEcc"),
    @XmlEnumValue("parity")
    PARITY("parity"),
    @XmlEnumValue("memoryScrubFailed")
    MEMORY_SCRUB_FAILED("memoryScrubFailed"),
    @XmlEnumValue("memoryDeviceDisabled")
    MEMORY_DEVICE_DISABLED("memoryDeviceDisabled"),
    @XmlEnumValue("correctableEccLoggingLimitReached")
    CORRECTABLE_ECC_LOGGING_LIMIT_REACHED("correctableEccLoggingLimitReached"),
    @XmlEnumValue("memoryPresenceDetected")
    MEMORY_PRESENCE_DETECTED("memoryPresenceDetected"),
    @XmlEnumValue("memoryConfigurationError")
    MEMORY_CONFIGURATION_ERROR("memoryConfigurationError"),
    @XmlEnumValue("memorySpare")
    MEMORY_SPARE("memorySpare"),
    @XmlEnumValue("memoryAutomaticallyThrottled")
    MEMORY_AUTOMATICALLY_THROTTLED("memoryAutomaticallyThrottled"),
    @XmlEnumValue("memoryCriticalOvertemperature")
    MEMORY_CRITICAL_OVERTEMPERATURE("memoryCriticalOvertemperature"),
    @XmlEnumValue("drivePresence")
    DRIVE_PRESENCE("drivePresence"),
    @XmlEnumValue("driveFault")
    DRIVE_FAULT("driveFault"),
    @XmlEnumValue("drivePredictiveFailure")
    DRIVE_PREDICTIVE_FAILURE("drivePredictiveFailure"),
    @XmlEnumValue("driveHotSpare")
    DRIVE_HOT_SPARE("driveHotSpare"),
    @XmlEnumValue("driveConsistencyCheckInProgress")
    DRIVE_CONSISTENCY_CHECK_IN_PROGRESS("driveConsistencyCheckInProgress"),
    @XmlEnumValue("driveInCriticalArray")
    DRIVE_IN_CRITICAL_ARRAY("driveInCriticalArray"),
    @XmlEnumValue("driveInFailedArray")
    DRIVE_IN_FAILED_ARRAY("driveInFailedArray"),
    @XmlEnumValue("driveRebuildInProgress")
    DRIVE_REBUILD_IN_PROGRESS("driveRebuildInProgress"),
    @XmlEnumValue("driveRebuildAborted")
    DRIVE_REBUILD_ABORTED("driveRebuildAborted"),
    @XmlEnumValue("systemFirmwareError")
    SYSTEM_FIRMWARE_ERROR("systemFirmwareError"),
    @XmlEnumValue("systemFirmwareHang")
    SYSTEM_FIRMWARE_HANG("systemFirmwareHang"),
    @XmlEnumValue("systemFirmwareProgress")
    SYSTEM_FIRMWARE_PROGRESS("systemFirmwareProgress"),
    @XmlEnumValue("correctableMemoryErrorLoggingDisabled")
    CORRECTABLE_MEMORY_ERROR_LOGGING_DISABLED("correctableMemoryErrorLoggingDisabled"),
    @XmlEnumValue("eventLoggingDisabled")
    EVENT_LOGGING_DISABLED("eventLoggingDisabled"),
    @XmlEnumValue("logAreaReset")
    LOG_AREA_RESET("logAreaReset"),
    @XmlEnumValue("allEventLoggingDisabled")
    ALL_EVENT_LOGGING_DISABLED("allEventLoggingDisabled"),
    @XmlEnumValue("selFull")
    SEL_FULL("selFull"),
    @XmlEnumValue("selAlmostFull")
    SEL_ALMOST_FULL("selAlmostFull"),
    @XmlEnumValue("biosWatchdogReset")
    BIOS_WATCHDOG_RESET("biosWatchdogReset"),
    @XmlEnumValue("osWatchdogReset")
    OS_WATCHDOG_RESET("osWatchdogReset"),
    @XmlEnumValue("osWatchdogShutDown")
    OS_WATCHDOG_SHUT_DOWN("osWatchdogShutDown"),
    @XmlEnumValue("osWatchdogPowerDown")
    OS_WATCHDOG_POWER_DOWN("osWatchdogPowerDown"),
    @XmlEnumValue("osWatchdogPowerCycle")
    OS_WATCHDOG_POWER_CYCLE("osWatchdogPowerCycle"),
    @XmlEnumValue("osWatchdogNmiDiagnosticInterrupt")
    OS_WATCHDOG_NMI_DIAGNOSTIC_INTERRUPT("osWatchdogNmiDiagnosticInterrupt"),
    @XmlEnumValue("osWatchdogExpiredStatusOnly")
    OS_WATCHDOG_EXPIRED_STATUS_ONLY("osWatchdogExpiredStatusOnly"),
    @XmlEnumValue("osWatchdogPreTimeoutInterrupt")
    OS_WATCHDOG_PRE_TIMEOUT_INTERRUPT("osWatchdogPreTimeoutInterrupt"),
    @XmlEnumValue("systemReconfigured")
    SYSTEM_RECONFIGURED("systemReconfigured"),
    @XmlEnumValue("oemSystemBootEvent")
    OEM_SYSTEM_BOOT_EVENT("oemSystemBootEvent"),
    @XmlEnumValue("undeterminedSystemHardwareFailure")
    UNDETERMINED_SYSTEM_HARDWARE_FAILURE("undeterminedSystemHardwareFailure"),
    @XmlEnumValue("entryAddedToAuxiliaryLog")
    ENTRY_ADDED_TO_AUXILIARY_LOG("entryAddedToAuxiliaryLog"),
    @XmlEnumValue("pefAction")
    PEF_ACTION("pefAction"),
    @XmlEnumValue("frontPanelNmiInterrupt")
    FRONT_PANEL_NMI_INTERRUPT("frontPanelNmiInterrupt"),
    @XmlEnumValue("busTimeout")
    BUS_TIMEOUT("busTimeout"),
    @XmlEnumValue("ioChannelCheckNmi")
    IO_CHANNEL_CHECK_NMI("ioChannelCheckNmi"),
    @XmlEnumValue("softwareNmi")
    SOFTWARE_NMI("softwareNmi"),
    @XmlEnumValue("pciPerr")
    PCI_PERR("pciPerr"),
    @XmlEnumValue("pciSerr")
    PCI_SERR("pciSerr"),
    @XmlEnumValue("eisaFailSafeTimeout")
    EISA_FAIL_SAFE_TIMEOUT("eisaFailSafeTimeout"),
    @XmlEnumValue("busCorrectableError")
    BUS_CORRECTABLE_ERROR("busCorrectableError"),
    @XmlEnumValue("busUncorrectableError")
    BUS_UNCORRECTABLE_ERROR("busUncorrectableError"),
    @XmlEnumValue("fatalNmi")
    FATAL_NMI("fatalNmi"),
    @XmlEnumValue("busFatalError")
    BUS_FATAL_ERROR("busFatalError"),
    @XmlEnumValue("busDegraded")
    BUS_DEGRADED("busDegraded"),
    @XmlEnumValue("powerButtonPressed")
    POWER_BUTTON_PRESSED("powerButtonPressed"),
    @XmlEnumValue("sleepButtonPressed")
    SLEEP_BUTTON_PRESSED("sleepButtonPressed"),
    @XmlEnumValue("resetButtonPressed")
    RESET_BUTTON_PRESSED("resetButtonPressed"),
    @XmlEnumValue("fruLatchOpen")
    FRU_LATCH_OPEN("fruLatchOpen"),
    @XmlEnumValue("fruServiceRequestButton")
    FRU_SERVICE_REQUEST_BUTTON("fruServiceRequestButton"),
    @XmlEnumValue("softPowerControlFailure")
    SOFT_POWER_CONTROL_FAILURE("softPowerControlFailure"),
    @XmlEnumValue("initiatedByPowerUp")
    INITIATED_BY_POWER_UP("initiatedByPowerUp"),
    @XmlEnumValue("initiatedByHardReset")
    INITIATED_BY_HARD_RESET("initiatedByHardReset"),
    @XmlEnumValue("initiatedByWarmReset")
    INITIATED_BY_WARM_RESET("initiatedByWarmReset"),
    @XmlEnumValue("userRequestedPxeBoot")
    USER_REQUESTED_PXE_BOOT("userRequestedPxeBoot"),
    @XmlEnumValue("automaticBootToDiagnostic")
    AUTOMATIC_BOOT_TO_DIAGNOSTIC("automaticBootToDiagnostic"),
    @XmlEnumValue("noBootableMedia")
    NO_BOOTABLE_MEDIA("noBootableMedia"),
    @XmlEnumValue("nonBootableDiskette")
    NON_BOOTABLE_DISKETTE("nonBootableDiskette"),
    @XmlEnumValue("pxeServerNotFound")
    PXE_SERVER_NOT_FOUND("pxeServerNotFound"),
    @XmlEnumValue("invalidBootSector")
    INVALID_BOOT_SECTOR("invalidBootSector"),
    @XmlEnumValue("timeoutWaitingForUserSelectionOfBootSource")
    TIMEOUT_WAITING_FOR_USER_SELECTION_OF_BOOT_SOURCE("timeoutWaitingForUserSelectionOfBootSource"),
    @XmlEnumValue("aBootCompleted")
    A_BOOT_COMPLETED("aBootCompleted"),
    @XmlEnumValue("cBootCompleted")
    C_BOOT_COMPLETED("cBootCompleted"),
    @XmlEnumValue("pxeBootCompleted")
    PXE_BOOT_COMPLETED("pxeBootCompleted"),
    @XmlEnumValue("diagnosticBootCompleted")
    DIAGNOSTIC_BOOT_COMPLETED("diagnosticBootCompleted"),
    @XmlEnumValue("cdromBootCompleted")
    CDROM_BOOT_COMPLETED("cdromBootCompleted"),
    @XmlEnumValue("romBootCompleted")
    ROM_BOOT_COMPLETED("romBootCompleted"),
    @XmlEnumValue("bootCompleted")
    BOOT_COMPLETED("bootCompleted"),
    @XmlEnumValue("stopDuringOsLoadInitialization")
    STOP_DURING_OS_LOAD_INITIALIZATION("stopDuringOsLoadInitialization"),
    @XmlEnumValue("runTimeStop")
    RUN_TIME_STOP("runTimeStop"),
    @XmlEnumValue("slotFaultStatusAsserted")
    SLOT_FAULT_STATUS_ASSERTED("slotFaultStatusAsserted"),
    @XmlEnumValue("slotIdentifyStatusAsserted")
    SLOT_IDENTIFY_STATUS_ASSERTED("slotIdentifyStatusAsserted"),
    @XmlEnumValue("slotDeviceInstalled")
    SLOT_DEVICE_INSTALLED("slotDeviceInstalled"),
    @XmlEnumValue("slotReadyForDeviceInstallation")
    SLOT_READY_FOR_DEVICE_INSTALLATION("slotReadyForDeviceInstallation"),
    @XmlEnumValue("slotReadyForDeviceRemoval")
    SLOT_READY_FOR_DEVICE_REMOVAL("slotReadyForDeviceRemoval"),
    @XmlEnumValue("slotPowerIsOff")
    SLOT_POWER_IS_OFF("slotPowerIsOff"),
    @XmlEnumValue("slotDeviceRemovalRequest")
    SLOT_DEVICE_REMOVAL_REQUEST("slotDeviceRemovalRequest"),
    @XmlEnumValue("slotInterlockAsserted")
    SLOT_INTERLOCK_ASSERTED("slotInterlockAsserted"),
    @XmlEnumValue("slotIsDisabled")
    SLOT_IS_DISABLED("slotIsDisabled"),
    @XmlEnumValue("slotHoldsSpare")
    SLOT_HOLDS_SPARE("slotHoldsSpare"),
    @XmlEnumValue("acpiS0G0PowerState")
    ACPI_S_0_G_0_POWER_STATE("acpiS0G0PowerState"),
    @XmlEnumValue("acpiS1PowerState")
    ACPI_S_1_POWER_STATE("acpiS1PowerState"),
    @XmlEnumValue("acpiS2PowerState")
    ACPI_S_2_POWER_STATE("acpiS2PowerState"),
    @XmlEnumValue("acpiS3PowerState")
    ACPI_S_3_POWER_STATE("acpiS3PowerState"),
    @XmlEnumValue("acpiS4PowerState")
    ACPI_S_4_POWER_STATE("acpiS4PowerState"),
    @XmlEnumValue("acpiS5G2PowerState")
    ACPI_S_5_G_2_POWER_STATE("acpiS5G2PowerState"),
    @XmlEnumValue("acpiS4S5SoftOff")
    ACPI_S_4_S_5_SOFT_OFF("acpiS4S5SoftOff"),
    @XmlEnumValue("acpiG3PowerState")
    ACPI_G_3_POWER_STATE("acpiG3PowerState"),
    @XmlEnumValue("acpiSleepingS1S2S3")
    ACPI_SLEEPING_S_1_S_2_S_3("acpiSleepingS1S2S3"),
    @XmlEnumValue("acpiG1PowerState")
    ACPI_G_1_POWER_STATE("acpiG1PowerState"),
    @XmlEnumValue("acpiS5OverrideState")
    ACPI_S_5_OVERRIDE_STATE("acpiS5OverrideState"),
    @XmlEnumValue("acpiLegacyOnState")
    ACPI_LEGACY_ON_STATE("acpiLegacyOnState"),
    @XmlEnumValue("acpiLegacyOffState")
    ACPI_LEGACY_OFF_STATE("acpiLegacyOffState"),
    @XmlEnumValue("acpiUnknown")
    ACPI_UNKNOWN("acpiUnknown"),
    @XmlEnumValue("watchdog2TimeExpired")
    WATCHDOG_2_TIME_EXPIRED("watchdog2TimeExpired"),
    @XmlEnumValue("watchdog2HardReset")
    WATCHDOG_2_HARD_RESET("watchdog2HardReset"),
    @XmlEnumValue("watchdog2PowerDown")
    WATCHDOG_2_POWER_DOWN("watchdog2PowerDown"),
    @XmlEnumValue("watchdog2PowerCycle")
    WATCHDOG_2_POWER_CYCLE("watchdog2PowerCycle"),
    @XmlEnumValue("watchdog2TimerInterrupt")
    WATCHDOG_2_TIMER_INTERRUPT("watchdog2TimerInterrupt"),
    @XmlEnumValue("platformGeneratedPage")
    PLATFORM_GENERATED_PAGE("platformGeneratedPage"),
    @XmlEnumValue("platformGeneratedLanAlert")
    PLATFORM_GENERATED_LAN_ALERT("platformGeneratedLanAlert"),
    @XmlEnumValue("platformGeneratedEventTrap")
    PLATFORM_GENERATED_EVENT_TRAP("platformGeneratedEventTrap"),
    @XmlEnumValue("platformGeneratedSnmpTrap")
    PLATFORM_GENERATED_SNMP_TRAP("platformGeneratedSnmpTrap"),
    @XmlEnumValue("entityPresent")
    ENTITY_PRESENT("entityPresent"),
    @XmlEnumValue("entityAbsent")
    ENTITY_ABSENT("entityAbsent"),
    @XmlEnumValue("entityDisabled")
    ENTITY_DISABLED("entityDisabled"),
    @XmlEnumValue("lanHeartbeatLost")
    LAN_HEARTBEAT_LOST("lanHeartbeatLost"),
    @XmlEnumValue("lanHeartbeat")
    LAN_HEARTBEAT("lanHeartbeat"),
    @XmlEnumValue("sensorAccessDegradedOrUnavailable")
    SENSOR_ACCESS_DEGRADED_OR_UNAVAILABLE("sensorAccessDegradedOrUnavailable"),
    @XmlEnumValue("controllerAccessDegradedOrUnavailable")
    CONTROLLER_ACCESS_DEGRADED_OR_UNAVAILABLE("controllerAccessDegradedOrUnavailable"),
    @XmlEnumValue("managementControllerOffLine")
    MANAGEMENT_CONTROLLER_OFF_LINE("managementControllerOffLine"),
    @XmlEnumValue("managementControllerUnavailable")
    MANAGEMENT_CONTROLLER_UNAVAILABLE("managementControllerUnavailable"),
    @XmlEnumValue("batteryLow")
    BATTERY_LOW("batteryLow"),
    @XmlEnumValue("batteryFailed")
    BATTERY_FAILED("batteryFailed"),
    @XmlEnumValue("batteryPresenceDetected")
    BATTERY_PRESENCE_DETECTED("batteryPresenceDetected"),
    @XmlEnumValue("sessionActivated")
    SESSION_ACTIVATED("sessionActivated"),
    @XmlEnumValue("sessionDeactivated")
    SESSION_DEACTIVATED("sessionDeactivated"),
    @XmlEnumValue("hardwareVersionChange")
    HARDWARE_VERSION_CHANGE("hardwareVersionChange"),
    @XmlEnumValue("firmwareVersionChange")
    FIRMWARE_VERSION_CHANGE("firmwareVersionChange"),
    @XmlEnumValue("hardwareIncompatibility")
    HARDWARE_INCOMPATIBILITY("hardwareIncompatibility"),
    @XmlEnumValue("firmwareIncompatibility")
    FIRMWARE_INCOMPATIBILITY("firmwareIncompatibility"),
    @XmlEnumValue("entityIsUnsupportedHardwareVersion")
    ENTITY_IS_UNSUPPORTED_HARDWARE_VERSION("entityIsUnsupportedHardwareVersion"),
    @XmlEnumValue("entityContainsUnsupportedFirmwareVersion")
    ENTITY_CONTAINS_UNSUPPORTED_FIRMWARE_VERSION("entityContainsUnsupportedFirmwareVersion"),
    @XmlEnumValue("hardwareChangeSuccessful")
    HARDWARE_CHANGE_SUCCESSFUL("hardwareChangeSuccessful"),
    @XmlEnumValue("firmwareChangeSuccessful")
    FIRMWARE_CHANGE_SUCCESSFUL("firmwareChangeSuccessful"),
    @XmlEnumValue("fruNotInstalled")
    FRU_NOT_INSTALLED("fruNotInstalled"),
    @XmlEnumValue("fruInactive")
    FRU_INACTIVE("fruInactive"),
    @XmlEnumValue("fruActivationRequested")
    FRU_ACTIVATION_REQUESTED("fruActivationRequested"),
    @XmlEnumValue("fruActivationInProgress")
    FRU_ACTIVATION_IN_PROGRESS("fruActivationInProgress"),
    @XmlEnumValue("fruActive")
    FRU_ACTIVE("fruActive"),
    @XmlEnumValue("fruDeactivationRequested")
    FRU_DEACTIVATION_REQUESTED("fruDeactivationRequested"),
    @XmlEnumValue("fruDeactivationInProgress")
    FRU_DEACTIVATION_IN_PROGRESS("fruDeactivationInProgress"),
    @XmlEnumValue("fruCommunicationLost")
    FRU_COMMUNICATION_LOST("fruCommunicationLost"),
    @XmlEnumValue("kernelPanic")
    KERNEL_PANIC("kernelPanic");
    private final String value;

    DmIPMISensorEventReadingTypeCode(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DmIPMISensorEventReadingTypeCode fromValue(String v) {
        for (DmIPMISensorEventReadingTypeCode c: DmIPMISensorEventReadingTypeCode.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
