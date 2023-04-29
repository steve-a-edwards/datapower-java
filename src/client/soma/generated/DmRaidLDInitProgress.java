
package client.soma.generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dmRaidLDInitProgress.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="dmRaidLDInitProgress">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="noInitInProgress"/>
 *     &lt;enumeration value="quickInitInProgress"/>
 *     &lt;enumeration value="fullInitInProgress"/>
 *     &lt;enumeration value="unknown"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "dmRaidLDInitProgress")
@XmlEnum
public enum DmRaidLDInitProgress {

    @XmlEnumValue("noInitInProgress")
    NO_INIT_IN_PROGRESS("noInitInProgress"),
    @XmlEnumValue("quickInitInProgress")
    QUICK_INIT_IN_PROGRESS("quickInitInProgress"),
    @XmlEnumValue("fullInitInProgress")
    FULL_INIT_IN_PROGRESS("fullInitInProgress"),
    @XmlEnumValue("unknown")
    UNKNOWN("unknown");
    private final String value;

    DmRaidLDInitProgress(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DmRaidLDInitProgress fromValue(String v) {
        for (DmRaidLDInitProgress c: DmRaidLDInitProgress.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
