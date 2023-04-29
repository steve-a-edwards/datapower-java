
package client.soma.generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dmWSSecurityPolicyLayoutType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="dmWSSecurityPolicyLayoutType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Strict"/>
 *     &lt;enumeration value="Lax"/>
 *     &lt;enumeration value="LaxTimestampFirst"/>
 *     &lt;enumeration value="LaxTimestampLast"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "dmWSSecurityPolicyLayoutType")
@XmlEnum
public enum DmWSSecurityPolicyLayoutType {

    @XmlEnumValue("Strict")
    STRICT("Strict"),
    @XmlEnumValue("Lax")
    LAX("Lax"),
    @XmlEnumValue("LaxTimestampFirst")
    LAX_TIMESTAMP_FIRST("LaxTimestampFirst"),
    @XmlEnumValue("LaxTimestampLast")
    LAX_TIMESTAMP_LAST("LaxTimestampLast");
    private final String value;

    DmWSSecurityPolicyLayoutType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DmWSSecurityPolicyLayoutType fromValue(String v) {
        for (DmWSSecurityPolicyLayoutType c: DmWSSecurityPolicyLayoutType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
