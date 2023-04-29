
package client.soma.generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dmSecurityHeaderLayout.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="dmSecurityHeaderLayout">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="strict"/>
 *     &lt;enumeration value="lax"/>
 *     &lt;enumeration value="laxtimestampfirst"/>
 *     &lt;enumeration value="laxtimestamplast"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "dmSecurityHeaderLayout")
@XmlEnum
public enum DmSecurityHeaderLayout {

    @XmlEnumValue("strict")
    STRICT("strict"),
    @XmlEnumValue("lax")
    LAX("lax"),
    @XmlEnumValue("laxtimestampfirst")
    LAXTIMESTAMPFIRST("laxtimestampfirst"),
    @XmlEnumValue("laxtimestamplast")
    LAXTIMESTAMPLAST("laxtimestamplast");
    private final String value;

    DmSecurityHeaderLayout(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DmSecurityHeaderLayout fromValue(String v) {
        for (DmSecurityHeaderLayout c: DmSecurityHeaderLayout.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
