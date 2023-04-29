
package client.soma.generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dmRaidVolumeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="dmRaidVolumeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="unknown"/>
 *     &lt;enumeration value="raid-0"/>
 *     &lt;enumeration value="raid-1"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "dmRaidVolumeType")
@XmlEnum
public enum DmRaidVolumeType {

    @XmlEnumValue("unknown")
    UNKNOWN("unknown"),
    @XmlEnumValue("raid-0")
    RAID_0("raid-0"),
    @XmlEnumValue("raid-1")
    RAID_1("raid-1");
    private final String value;

    DmRaidVolumeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DmRaidVolumeType fromValue(String v) {
        for (DmRaidVolumeType c: DmRaidVolumeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
