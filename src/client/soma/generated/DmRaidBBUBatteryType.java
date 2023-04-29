
package client.soma.generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dmRaidBBUBatteryType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="dmRaidBBUBatteryType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="noBatteryPresent"/>
 *     &lt;enumeration value="ibbu"/>
 *     &lt;enumeration value="bbu"/>
 *     &lt;enumeration value="zcrLegacyBBU"/>
 *     &lt;enumeration value="itbbu3"/>
 *     &lt;enumeration value="unknown"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "dmRaidBBUBatteryType")
@XmlEnum
public enum DmRaidBBUBatteryType {

    @XmlEnumValue("noBatteryPresent")
    NO_BATTERY_PRESENT("noBatteryPresent"),
    @XmlEnumValue("ibbu")
    IBBU("ibbu"),
    @XmlEnumValue("bbu")
    BBU("bbu"),
    @XmlEnumValue("zcrLegacyBBU")
    ZCR_LEGACY_BBU("zcrLegacyBBU"),
    @XmlEnumValue("itbbu3")
    ITBBU_3("itbbu3"),
    @XmlEnumValue("unknown")
    UNKNOWN("unknown");
    private final String value;

    DmRaidBBUBatteryType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DmRaidBBUBatteryType fromValue(String v) {
        for (DmRaidBBUBatteryType c: DmRaidBBUBatteryType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
