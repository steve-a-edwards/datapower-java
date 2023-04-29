
package client.soma.generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dmRaidPDState.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="dmRaidPDState">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="unconfiguredGood"/>
 *     &lt;enumeration value="unconfiguredGoodForeign"/>
 *     &lt;enumeration value="unconfiguredBad"/>
 *     &lt;enumeration value="unconfiguredBadForeign"/>
 *     &lt;enumeration value="hotSpare"/>
 *     &lt;enumeration value="offline"/>
 *     &lt;enumeration value="failed"/>
 *     &lt;enumeration value="rebuild"/>
 *     &lt;enumeration value="online"/>
 *     &lt;enumeration value="copyback"/>
 *     &lt;enumeration value="system"/>
 *     &lt;enumeration value="undefined"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "dmRaidPDState")
@XmlEnum
public enum DmRaidPDState {

    @XmlEnumValue("unconfiguredGood")
    UNCONFIGURED_GOOD("unconfiguredGood"),
    @XmlEnumValue("unconfiguredGoodForeign")
    UNCONFIGURED_GOOD_FOREIGN("unconfiguredGoodForeign"),
    @XmlEnumValue("unconfiguredBad")
    UNCONFIGURED_BAD("unconfiguredBad"),
    @XmlEnumValue("unconfiguredBadForeign")
    UNCONFIGURED_BAD_FOREIGN("unconfiguredBadForeign"),
    @XmlEnumValue("hotSpare")
    HOT_SPARE("hotSpare"),
    @XmlEnumValue("offline")
    OFFLINE("offline"),
    @XmlEnumValue("failed")
    FAILED("failed"),
    @XmlEnumValue("rebuild")
    REBUILD("rebuild"),
    @XmlEnumValue("online")
    ONLINE("online"),
    @XmlEnumValue("copyback")
    COPYBACK("copyback"),
    @XmlEnumValue("system")
    SYSTEM("system"),
    @XmlEnumValue("undefined")
    UNDEFINED("undefined");
    private final String value;

    DmRaidPDState(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DmRaidPDState fromValue(String v) {
        for (DmRaidPDState c: DmRaidPDState.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
