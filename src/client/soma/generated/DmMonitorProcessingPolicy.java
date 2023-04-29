
package client.soma.generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dmMonitorProcessingPolicy.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="dmMonitorProcessingPolicy">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="terminate-at-first-throttle"/>
 *     &lt;enumeration value="terminate-at-first-match"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "dmMonitorProcessingPolicy")
@XmlEnum
public enum DmMonitorProcessingPolicy {

    @XmlEnumValue("terminate-at-first-throttle")
    TERMINATE_AT_FIRST_THROTTLE("terminate-at-first-throttle"),
    @XmlEnumValue("terminate-at-first-match")
    TERMINATE_AT_FIRST_MATCH("terminate-at-first-match");
    private final String value;

    DmMonitorProcessingPolicy(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DmMonitorProcessingPolicy fromValue(String v) {
        for (DmMonitorProcessingPolicy c: DmMonitorProcessingPolicy.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
