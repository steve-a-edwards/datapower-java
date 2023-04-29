
package client.soma.generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dmConformanceRejectLevel.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="dmConformanceRejectLevel">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="never"/>
 *     &lt;enumeration value="failure"/>
 *     &lt;enumeration value="warning"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "dmConformanceRejectLevel")
@XmlEnum
public enum DmConformanceRejectLevel {

    @XmlEnumValue("never")
    NEVER("never"),
    @XmlEnumValue("failure")
    FAILURE("failure"),
    @XmlEnumValue("warning")
    WARNING("warning");
    private final String value;

    DmConformanceRejectLevel(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DmConformanceRejectLevel fromValue(String v) {
        for (DmConformanceRejectLevel c: DmConformanceRejectLevel.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
