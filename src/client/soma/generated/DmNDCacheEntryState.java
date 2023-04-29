
package client.soma.generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dmNDCacheEntryState.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="dmNDCacheEntryState">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="incomplete"/>
 *     &lt;enumeration value="reachable"/>
 *     &lt;enumeration value="stale"/>
 *     &lt;enumeration value="delay"/>
 *     &lt;enumeration value="probe"/>
 *     &lt;enumeration value="failed"/>
 *     &lt;enumeration value="noarp"/>
 *     &lt;enumeration value="permanent"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "dmNDCacheEntryState")
@XmlEnum
public enum DmNDCacheEntryState {

    @XmlEnumValue("incomplete")
    INCOMPLETE("incomplete"),
    @XmlEnumValue("reachable")
    REACHABLE("reachable"),
    @XmlEnumValue("stale")
    STALE("stale"),
    @XmlEnumValue("delay")
    DELAY("delay"),
    @XmlEnumValue("probe")
    PROBE("probe"),
    @XmlEnumValue("failed")
    FAILED("failed"),
    @XmlEnumValue("noarp")
    NOARP("noarp"),
    @XmlEnumValue("permanent")
    PERMANENT("permanent");
    private final String value;

    DmNDCacheEntryState(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DmNDCacheEntryState fromValue(String v) {
        for (DmNDCacheEntryState c: DmNDCacheEntryState.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
