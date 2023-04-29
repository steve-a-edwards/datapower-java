
package client.soma.generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dmIPMISensorTypeCode.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="dmIPMISensorTypeCode">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="reserved"/>
 *     &lt;enumeration value="temperature"/>
 *     &lt;enumeration value="voltage"/>
 *     &lt;enumeration value="current"/>
 *     &lt;enumeration value="fan"/>
 *     &lt;enumeration value="physicalSecurity"/>
 *     &lt;enumeration value="platformSecurityViolationAttempt"/>
 *     &lt;enumeration value="processor"/>
 *     &lt;enumeration value="powerSupply"/>
 *     &lt;enumeration value="powerUnit"/>
 *     &lt;enumeration value="coolingDevice"/>
 *     &lt;enumeration value="otherUnitsBasedSensor"/>
 *     &lt;enumeration value="memory"/>
 *     &lt;enumeration value="driveSlot"/>
 *     &lt;enumeration value="postMemoryResize"/>
 *     &lt;enumeration value="systemFirmwareProgress"/>
 *     &lt;enumeration value="eventLoggingDisabled"/>
 *     &lt;enumeration value="watchdog1"/>
 *     &lt;enumeration value="systemEvent"/>
 *     &lt;enumeration value="criticalInterrupt"/>
 *     &lt;enumeration value="button"/>
 *     &lt;enumeration value="moduleOrBoard"/>
 *     &lt;enumeration value="microcontrollerOrCoprocessor"/>
 *     &lt;enumeration value="addInCard"/>
 *     &lt;enumeration value="chassis"/>
 *     &lt;enumeration value="chipSet"/>
 *     &lt;enumeration value="otherFru"/>
 *     &lt;enumeration value="cableOrInterconnect"/>
 *     &lt;enumeration value="terminator"/>
 *     &lt;enumeration value="systemBootRestartInitiated"/>
 *     &lt;enumeration value="bootError"/>
 *     &lt;enumeration value="osBoot"/>
 *     &lt;enumeration value="osCriticalStop"/>
 *     &lt;enumeration value="slotOrConnector"/>
 *     &lt;enumeration value="systemAcpiPowerStatus"/>
 *     &lt;enumeration value="watchdog2"/>
 *     &lt;enumeration value="platformAlert"/>
 *     &lt;enumeration value="entityPresence"/>
 *     &lt;enumeration value="monitorAsicIc"/>
 *     &lt;enumeration value="lan"/>
 *     &lt;enumeration value="managmentSubsystemHealth"/>
 *     &lt;enumeration value="battery"/>
 *     &lt;enumeration value="sessionAudit"/>
 *     &lt;enumeration value="versionChange"/>
 *     &lt;enumeration value="fruState"/>
 *     &lt;enumeration value="kernel"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "dmIPMISensorTypeCode")
@XmlEnum
public enum DmIPMISensorTypeCode {

    @XmlEnumValue("reserved")
    RESERVED("reserved"),
    @XmlEnumValue("temperature")
    TEMPERATURE("temperature"),
    @XmlEnumValue("voltage")
    VOLTAGE("voltage"),
    @XmlEnumValue("current")
    CURRENT("current"),
    @XmlEnumValue("fan")
    FAN("fan"),
    @XmlEnumValue("physicalSecurity")
    PHYSICAL_SECURITY("physicalSecurity"),
    @XmlEnumValue("platformSecurityViolationAttempt")
    PLATFORM_SECURITY_VIOLATION_ATTEMPT("platformSecurityViolationAttempt"),
    @XmlEnumValue("processor")
    PROCESSOR("processor"),
    @XmlEnumValue("powerSupply")
    POWER_SUPPLY("powerSupply"),
    @XmlEnumValue("powerUnit")
    POWER_UNIT("powerUnit"),
    @XmlEnumValue("coolingDevice")
    COOLING_DEVICE("coolingDevice"),
    @XmlEnumValue("otherUnitsBasedSensor")
    OTHER_UNITS_BASED_SENSOR("otherUnitsBasedSensor"),
    @XmlEnumValue("memory")
    MEMORY("memory"),
    @XmlEnumValue("driveSlot")
    DRIVE_SLOT("driveSlot"),
    @XmlEnumValue("postMemoryResize")
    POST_MEMORY_RESIZE("postMemoryResize"),
    @XmlEnumValue("systemFirmwareProgress")
    SYSTEM_FIRMWARE_PROGRESS("systemFirmwareProgress"),
    @XmlEnumValue("eventLoggingDisabled")
    EVENT_LOGGING_DISABLED("eventLoggingDisabled"),
    @XmlEnumValue("watchdog1")
    WATCHDOG_1("watchdog1"),
    @XmlEnumValue("systemEvent")
    SYSTEM_EVENT("systemEvent"),
    @XmlEnumValue("criticalInterrupt")
    CRITICAL_INTERRUPT("criticalInterrupt"),
    @XmlEnumValue("button")
    BUTTON("button"),
    @XmlEnumValue("moduleOrBoard")
    MODULE_OR_BOARD("moduleOrBoard"),
    @XmlEnumValue("microcontrollerOrCoprocessor")
    MICROCONTROLLER_OR_COPROCESSOR("microcontrollerOrCoprocessor"),
    @XmlEnumValue("addInCard")
    ADD_IN_CARD("addInCard"),
    @XmlEnumValue("chassis")
    CHASSIS("chassis"),
    @XmlEnumValue("chipSet")
    CHIP_SET("chipSet"),
    @XmlEnumValue("otherFru")
    OTHER_FRU("otherFru"),
    @XmlEnumValue("cableOrInterconnect")
    CABLE_OR_INTERCONNECT("cableOrInterconnect"),
    @XmlEnumValue("terminator")
    TERMINATOR("terminator"),
    @XmlEnumValue("systemBootRestartInitiated")
    SYSTEM_BOOT_RESTART_INITIATED("systemBootRestartInitiated"),
    @XmlEnumValue("bootError")
    BOOT_ERROR("bootError"),
    @XmlEnumValue("osBoot")
    OS_BOOT("osBoot"),
    @XmlEnumValue("osCriticalStop")
    OS_CRITICAL_STOP("osCriticalStop"),
    @XmlEnumValue("slotOrConnector")
    SLOT_OR_CONNECTOR("slotOrConnector"),
    @XmlEnumValue("systemAcpiPowerStatus")
    SYSTEM_ACPI_POWER_STATUS("systemAcpiPowerStatus"),
    @XmlEnumValue("watchdog2")
    WATCHDOG_2("watchdog2"),
    @XmlEnumValue("platformAlert")
    PLATFORM_ALERT("platformAlert"),
    @XmlEnumValue("entityPresence")
    ENTITY_PRESENCE("entityPresence"),
    @XmlEnumValue("monitorAsicIc")
    MONITOR_ASIC_IC("monitorAsicIc"),
    @XmlEnumValue("lan")
    LAN("lan"),
    @XmlEnumValue("managmentSubsystemHealth")
    MANAGMENT_SUBSYSTEM_HEALTH("managmentSubsystemHealth"),
    @XmlEnumValue("battery")
    BATTERY("battery"),
    @XmlEnumValue("sessionAudit")
    SESSION_AUDIT("sessionAudit"),
    @XmlEnumValue("versionChange")
    VERSION_CHANGE("versionChange"),
    @XmlEnumValue("fruState")
    FRU_STATE("fruState"),
    @XmlEnumValue("kernel")
    KERNEL("kernel");
    private final String value;

    DmIPMISensorTypeCode(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DmIPMISensorTypeCode fromValue(String v) {
        for (DmIPMISensorTypeCode c: DmIPMISensorTypeCode.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
