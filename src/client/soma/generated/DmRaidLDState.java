
package client.soma.generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dmRaidLDState.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="dmRaidLDState">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="offline"/>
 *     &lt;enumeration value="partiallyDegraded"/>
 *     &lt;enumeration value="degraded"/>
 *     &lt;enumeration value="optimal"/>
 *     &lt;enumeration value="unknown"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "dmRaidLDState")
@XmlEnum
public enum DmRaidLDState {

    @XmlEnumValue("offline")
    OFFLINE("offline"),
    @XmlEnumValue("partiallyDegraded")
    PARTIALLY_DEGRADED("partiallyDegraded"),
    @XmlEnumValue("degraded")
    DEGRADED("degraded"),
    @XmlEnumValue("optimal")
    OPTIMAL("optimal"),
    @XmlEnumValue("unknown")
    UNKNOWN("unknown");
    private final String value;

    DmRaidLDState(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DmRaidLDState fromValue(String v) {
        for (DmRaidLDState c: DmRaidLDState.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
