
package client.soma.generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dmResultsMultiWayMode.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="dmResultsMultiWayMode">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="first-available"/>
 *     &lt;enumeration value="require-all"/>
 *     &lt;enumeration value="attempt-all"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "dmResultsMultiWayMode")
@XmlEnum
public enum DmResultsMultiWayMode {

    @XmlEnumValue("first-available")
    FIRST_AVAILABLE("first-available"),
    @XmlEnumValue("require-all")
    REQUIRE_ALL("require-all"),
    @XmlEnumValue("attempt-all")
    ATTEMPT_ALL("attempt-all");
    private final String value;

    DmResultsMultiWayMode(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DmResultsMultiWayMode fromValue(String v) {
        for (DmResultsMultiWayMode c: DmResultsMultiWayMode.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
