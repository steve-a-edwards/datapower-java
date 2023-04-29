
package client.soma.generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dmRaidVolumeState.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="dmRaidVolumeState">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="optimal"/>
 *     &lt;enumeration value="degraded"/>
 *     &lt;enumeration value="failed"/>
 *     &lt;enumeration value="missing"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "dmRaidVolumeState")
@XmlEnum
public enum DmRaidVolumeState {

    @XmlEnumValue("optimal")
    OPTIMAL("optimal"),
    @XmlEnumValue("degraded")
    DEGRADED("degraded"),
    @XmlEnumValue("failed")
    FAILED("failed"),
    @XmlEnumValue("missing")
    MISSING("missing");
    private final String value;

    DmRaidVolumeState(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DmRaidVolumeState fromValue(String v) {
        for (DmRaidVolumeState c: DmRaidVolumeState.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
