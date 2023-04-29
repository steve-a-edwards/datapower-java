
package client.soma.generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dmRaidSasInterfaceSpeed.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="dmRaidSasInterfaceSpeed">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="serial1point5GigabitsPerSecond"/>
 *     &lt;enumeration value="serial3point0GigabitsPerSecond"/>
 *     &lt;enumeration value="serial6point0GigabitsPerSecond"/>
 *     &lt;enumeration value="notApplicable"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "dmRaidSasInterfaceSpeed")
@XmlEnum
public enum DmRaidSasInterfaceSpeed {

    @XmlEnumValue("serial1point5GigabitsPerSecond")
    SERIAL_1_POINT_5_GIGABITS_PER_SECOND("serial1point5GigabitsPerSecond"),
    @XmlEnumValue("serial3point0GigabitsPerSecond")
    SERIAL_3_POINT_0_GIGABITS_PER_SECOND("serial3point0GigabitsPerSecond"),
    @XmlEnumValue("serial6point0GigabitsPerSecond")
    SERIAL_6_POINT_0_GIGABITS_PER_SECOND("serial6point0GigabitsPerSecond"),
    @XmlEnumValue("notApplicable")
    NOT_APPLICABLE("notApplicable");
    private final String value;

    DmRaidSasInterfaceSpeed(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DmRaidSasInterfaceSpeed fromValue(String v) {
        for (DmRaidSasInterfaceSpeed c: DmRaidSasInterfaceSpeed.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
