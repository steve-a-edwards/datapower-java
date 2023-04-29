
package client.soma.generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dmCountMonitorSource.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="dmCountMonitorSource">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="all"/>
 *     &lt;enumeration value="each-ip"/>
 *     &lt;enumeration value="ip-from-header"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "dmCountMonitorSource")
@XmlEnum
public enum DmCountMonitorSource {

    @XmlEnumValue("all")
    ALL("all"),
    @XmlEnumValue("each-ip")
    EACH_IP("each-ip"),
    @XmlEnumValue("ip-from-header")
    IP_FROM_HEADER("ip-from-header");
    private final String value;

    DmCountMonitorSource(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DmCountMonitorSource fromValue(String v) {
        for (DmCountMonitorSource c: DmCountMonitorSource.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
