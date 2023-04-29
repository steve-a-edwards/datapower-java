
package client.soma.generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dmAffinityMode.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="dmAffinityMode">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="active"/>
 *     &lt;enumeration value="activeConditional"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "dmAffinityMode")
@XmlEnum
public enum DmAffinityMode {

    @XmlEnumValue("active")
    ACTIVE("active"),
    @XmlEnumValue("activeConditional")
    ACTIVE_CONDITIONAL("activeConditional");
    private final String value;

    DmAffinityMode(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DmAffinityMode fromValue(String v) {
        for (DmAffinityMode c: DmAffinityMode.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
