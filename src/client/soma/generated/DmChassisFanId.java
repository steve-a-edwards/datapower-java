
package client.soma.generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dmChassisFanId.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="dmChassisFanId">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="cpu-1"/>
 *     &lt;enumeration value="cpu-2"/>
 *     &lt;enumeration value="chassis-1"/>
 *     &lt;enumeration value="chassis-2"/>
 *     &lt;enumeration value="chassis-3"/>
 *     &lt;enumeration value="chassis-4"/>
 *     &lt;enumeration value="chassis-5"/>
 *     &lt;enumeration value="chassis-6"/>
 *     &lt;enumeration value="chassis-7"/>
 *     &lt;enumeration value="chassis-8"/>
 *     &lt;enumeration value="fan-tray-1-fan-1"/>
 *     &lt;enumeration value="fan-tray-1-fan-2"/>
 *     &lt;enumeration value="fan-tray-1-fan-3"/>
 *     &lt;enumeration value="fan-tray-1-fan-4"/>
 *     &lt;enumeration value="fan-tray-2-fan-1"/>
 *     &lt;enumeration value="fan-tray-2-fan-2"/>
 *     &lt;enumeration value="fan-tray-2-fan-3"/>
 *     &lt;enumeration value="fan-tray-2-fan-4"/>
 *     &lt;enumeration value="fan-tray-3-fan-1"/>
 *     &lt;enumeration value="fan-tray-3-fan-2"/>
 *     &lt;enumeration value="fan-tray-3-fan-3"/>
 *     &lt;enumeration value="fan-tray-3-fan-4"/>
 *     &lt;enumeration value="hard-disk-tray-fan-1"/>
 *     &lt;enumeration value="hard-disk-tray-fan-2"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "dmChassisFanId")
@XmlEnum
public enum DmChassisFanId {

    @XmlEnumValue("cpu-1")
    CPU_1("cpu-1"),
    @XmlEnumValue("cpu-2")
    CPU_2("cpu-2"),
    @XmlEnumValue("chassis-1")
    CHASSIS_1("chassis-1"),
    @XmlEnumValue("chassis-2")
    CHASSIS_2("chassis-2"),
    @XmlEnumValue("chassis-3")
    CHASSIS_3("chassis-3"),
    @XmlEnumValue("chassis-4")
    CHASSIS_4("chassis-4"),
    @XmlEnumValue("chassis-5")
    CHASSIS_5("chassis-5"),
    @XmlEnumValue("chassis-6")
    CHASSIS_6("chassis-6"),
    @XmlEnumValue("chassis-7")
    CHASSIS_7("chassis-7"),
    @XmlEnumValue("chassis-8")
    CHASSIS_8("chassis-8"),
    @XmlEnumValue("fan-tray-1-fan-1")
    FAN_TRAY_1_FAN_1("fan-tray-1-fan-1"),
    @XmlEnumValue("fan-tray-1-fan-2")
    FAN_TRAY_1_FAN_2("fan-tray-1-fan-2"),
    @XmlEnumValue("fan-tray-1-fan-3")
    FAN_TRAY_1_FAN_3("fan-tray-1-fan-3"),
    @XmlEnumValue("fan-tray-1-fan-4")
    FAN_TRAY_1_FAN_4("fan-tray-1-fan-4"),
    @XmlEnumValue("fan-tray-2-fan-1")
    FAN_TRAY_2_FAN_1("fan-tray-2-fan-1"),
    @XmlEnumValue("fan-tray-2-fan-2")
    FAN_TRAY_2_FAN_2("fan-tray-2-fan-2"),
    @XmlEnumValue("fan-tray-2-fan-3")
    FAN_TRAY_2_FAN_3("fan-tray-2-fan-3"),
    @XmlEnumValue("fan-tray-2-fan-4")
    FAN_TRAY_2_FAN_4("fan-tray-2-fan-4"),
    @XmlEnumValue("fan-tray-3-fan-1")
    FAN_TRAY_3_FAN_1("fan-tray-3-fan-1"),
    @XmlEnumValue("fan-tray-3-fan-2")
    FAN_TRAY_3_FAN_2("fan-tray-3-fan-2"),
    @XmlEnumValue("fan-tray-3-fan-3")
    FAN_TRAY_3_FAN_3("fan-tray-3-fan-3"),
    @XmlEnumValue("fan-tray-3-fan-4")
    FAN_TRAY_3_FAN_4("fan-tray-3-fan-4"),
    @XmlEnumValue("hard-disk-tray-fan-1")
    HARD_DISK_TRAY_FAN_1("hard-disk-tray-fan-1"),
    @XmlEnumValue("hard-disk-tray-fan-2")
    HARD_DISK_TRAY_FAN_2("hard-disk-tray-fan-2");
    private final String value;

    DmChassisFanId(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DmChassisFanId fromValue(String v) {
        for (DmChassisFanId c: DmChassisFanId.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
