
package client.soma.generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dmIPMISensorEventData2.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="dmIPMISensorEventData2">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="none"/>
 *     &lt;enumeration value="unspecified"/>
 *     &lt;enumeration value="noSystemMemoryInstalled"/>
 *     &lt;enumeration value="noUsableSystemMemory"/>
 *     &lt;enumeration value="unrecoverableHardDiskDeviceFailure"/>
 *     &lt;enumeration value="unrecoverableSystemBoardFailure"/>
 *     &lt;enumeration value="unrecoverableDisketteSubsystemFailure"/>
 *     &lt;enumeration value="unrecoverableHardDiskControllerFailure"/>
 *     &lt;enumeration value="unrecoverableKeyboardFailure"/>
 *     &lt;enumeration value="removableBootMediaNotFound"/>
 *     &lt;enumeration value="unrecoverableVideoControllerFailure"/>
 *     &lt;enumeration value="noVideoDeviceDetected"/>
 *     &lt;enumeration value="firmwareRomCorruptionDetected"/>
 *     &lt;enumeration value="cpuVoltageMismatch"/>
 *     &lt;enumeration value="cpuSpeedMatchingFailure"/>
 *     &lt;enumeration value="memoryInitialization"/>
 *     &lt;enumeration value="hardDiskInitialization"/>
 *     &lt;enumeration value="secondaryProcessorInitialization"/>
 *     &lt;enumeration value="userAuthentication"/>
 *     &lt;enumeration value="userInitiatedSystemStartup"/>
 *     &lt;enumeration value="usbResourceConfiguration"/>
 *     &lt;enumeration value="pciResourceConfiguration"/>
 *     &lt;enumeration value="optionRomInitialization"/>
 *     &lt;enumeration value="videoInitialization"/>
 *     &lt;enumeration value="cacheInitialization"/>
 *     &lt;enumeration value="smbusInitialization"/>
 *     &lt;enumeration value="keyboardControllerInitialization"/>
 *     &lt;enumeration value="embeddedManagementControllerInitialization"/>
 *     &lt;enumeration value="dockingStationAttachment"/>
 *     &lt;enumeration value="enablingDockingStation"/>
 *     &lt;enumeration value="dockingStationEjection"/>
 *     &lt;enumeration value="disablingDockingStation"/>
 *     &lt;enumeration value="callingOperatingSystemWakeupVector"/>
 *     &lt;enumeration value="startingOperatingSystemBoot"/>
 *     &lt;enumeration value="baseboardInitialization"/>
 *     &lt;enumeration value="reserved"/>
 *     &lt;enumeration value="floppyInitialization"/>
 *     &lt;enumeration value="keyboardTest"/>
 *     &lt;enumeration value="pointingDeviceTest"/>
 *     &lt;enumeration value="primaryProcessorInitialization"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "dmIPMISensorEventData2")
@XmlEnum
public enum DmIPMISensorEventData2 {

    @XmlEnumValue("none")
    NONE("none"),
    @XmlEnumValue("unspecified")
    UNSPECIFIED("unspecified"),
    @XmlEnumValue("noSystemMemoryInstalled")
    NO_SYSTEM_MEMORY_INSTALLED("noSystemMemoryInstalled"),
    @XmlEnumValue("noUsableSystemMemory")
    NO_USABLE_SYSTEM_MEMORY("noUsableSystemMemory"),
    @XmlEnumValue("unrecoverableHardDiskDeviceFailure")
    UNRECOVERABLE_HARD_DISK_DEVICE_FAILURE("unrecoverableHardDiskDeviceFailure"),
    @XmlEnumValue("unrecoverableSystemBoardFailure")
    UNRECOVERABLE_SYSTEM_BOARD_FAILURE("unrecoverableSystemBoardFailure"),
    @XmlEnumValue("unrecoverableDisketteSubsystemFailure")
    UNRECOVERABLE_DISKETTE_SUBSYSTEM_FAILURE("unrecoverableDisketteSubsystemFailure"),
    @XmlEnumValue("unrecoverableHardDiskControllerFailure")
    UNRECOVERABLE_HARD_DISK_CONTROLLER_FAILURE("unrecoverableHardDiskControllerFailure"),
    @XmlEnumValue("unrecoverableKeyboardFailure")
    UNRECOVERABLE_KEYBOARD_FAILURE("unrecoverableKeyboardFailure"),
    @XmlEnumValue("removableBootMediaNotFound")
    REMOVABLE_BOOT_MEDIA_NOT_FOUND("removableBootMediaNotFound"),
    @XmlEnumValue("unrecoverableVideoControllerFailure")
    UNRECOVERABLE_VIDEO_CONTROLLER_FAILURE("unrecoverableVideoControllerFailure"),
    @XmlEnumValue("noVideoDeviceDetected")
    NO_VIDEO_DEVICE_DETECTED("noVideoDeviceDetected"),
    @XmlEnumValue("firmwareRomCorruptionDetected")
    FIRMWARE_ROM_CORRUPTION_DETECTED("firmwareRomCorruptionDetected"),
    @XmlEnumValue("cpuVoltageMismatch")
    CPU_VOLTAGE_MISMATCH("cpuVoltageMismatch"),
    @XmlEnumValue("cpuSpeedMatchingFailure")
    CPU_SPEED_MATCHING_FAILURE("cpuSpeedMatchingFailure"),
    @XmlEnumValue("memoryInitialization")
    MEMORY_INITIALIZATION("memoryInitialization"),
    @XmlEnumValue("hardDiskInitialization")
    HARD_DISK_INITIALIZATION("hardDiskInitialization"),
    @XmlEnumValue("secondaryProcessorInitialization")
    SECONDARY_PROCESSOR_INITIALIZATION("secondaryProcessorInitialization"),
    @XmlEnumValue("userAuthentication")
    USER_AUTHENTICATION("userAuthentication"),
    @XmlEnumValue("userInitiatedSystemStartup")
    USER_INITIATED_SYSTEM_STARTUP("userInitiatedSystemStartup"),
    @XmlEnumValue("usbResourceConfiguration")
    USB_RESOURCE_CONFIGURATION("usbResourceConfiguration"),
    @XmlEnumValue("pciResourceConfiguration")
    PCI_RESOURCE_CONFIGURATION("pciResourceConfiguration"),
    @XmlEnumValue("optionRomInitialization")
    OPTION_ROM_INITIALIZATION("optionRomInitialization"),
    @XmlEnumValue("videoInitialization")
    VIDEO_INITIALIZATION("videoInitialization"),
    @XmlEnumValue("cacheInitialization")
    CACHE_INITIALIZATION("cacheInitialization"),
    @XmlEnumValue("smbusInitialization")
    SMBUS_INITIALIZATION("smbusInitialization"),
    @XmlEnumValue("keyboardControllerInitialization")
    KEYBOARD_CONTROLLER_INITIALIZATION("keyboardControllerInitialization"),
    @XmlEnumValue("embeddedManagementControllerInitialization")
    EMBEDDED_MANAGEMENT_CONTROLLER_INITIALIZATION("embeddedManagementControllerInitialization"),
    @XmlEnumValue("dockingStationAttachment")
    DOCKING_STATION_ATTACHMENT("dockingStationAttachment"),
    @XmlEnumValue("enablingDockingStation")
    ENABLING_DOCKING_STATION("enablingDockingStation"),
    @XmlEnumValue("dockingStationEjection")
    DOCKING_STATION_EJECTION("dockingStationEjection"),
    @XmlEnumValue("disablingDockingStation")
    DISABLING_DOCKING_STATION("disablingDockingStation"),
    @XmlEnumValue("callingOperatingSystemWakeupVector")
    CALLING_OPERATING_SYSTEM_WAKEUP_VECTOR("callingOperatingSystemWakeupVector"),
    @XmlEnumValue("startingOperatingSystemBoot")
    STARTING_OPERATING_SYSTEM_BOOT("startingOperatingSystemBoot"),
    @XmlEnumValue("baseboardInitialization")
    BASEBOARD_INITIALIZATION("baseboardInitialization"),
    @XmlEnumValue("reserved")
    RESERVED("reserved"),
    @XmlEnumValue("floppyInitialization")
    FLOPPY_INITIALIZATION("floppyInitialization"),
    @XmlEnumValue("keyboardTest")
    KEYBOARD_TEST("keyboardTest"),
    @XmlEnumValue("pointingDeviceTest")
    POINTING_DEVICE_TEST("pointingDeviceTest"),
    @XmlEnumValue("primaryProcessorInitialization")
    PRIMARY_PROCESSOR_INITIALIZATION("primaryProcessorInitialization");
    private final String value;

    DmIPMISensorEventData2(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DmIPMISensorEventData2 fromValue(String v) {
        for (DmIPMISensorEventData2 c: DmIPMISensorEventData2 .values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
