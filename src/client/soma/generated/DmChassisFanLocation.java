
package client.soma.generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dmChassisFanLocation.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="dmChassisFanLocation">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="cpu-1"/>
 *     &lt;enumeration value="cpu-2"/>
 *     &lt;enumeration value="fan-tray-1"/>
 *     &lt;enumeration value="fan-tray-2"/>
 *     &lt;enumeration value="hard-disk-drive-tray"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "dmChassisFanLocation")
@XmlEnum
public enum DmChassisFanLocation {

    @XmlEnumValue("cpu-1")
    CPU_1("cpu-1"),
    @XmlEnumValue("cpu-2")
    CPU_2("cpu-2"),
    @XmlEnumValue("fan-tray-1")
    FAN_TRAY_1("fan-tray-1"),
    @XmlEnumValue("fan-tray-2")
    FAN_TRAY_2("fan-tray-2"),
    @XmlEnumValue("hard-disk-drive-tray")
    HARD_DISK_DRIVE_TRAY("hard-disk-drive-tray");
    private final String value;

    DmChassisFanLocation(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DmChassisFanLocation fromValue(String v) {
        for (DmChassisFanLocation c: DmChassisFanLocation.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
