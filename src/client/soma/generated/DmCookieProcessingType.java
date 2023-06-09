
package client.soma.generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dmCookieProcessingType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="dmCookieProcessingType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="none"/>
 *     &lt;enumeration value="sign"/>
 *     &lt;enumeration value="encrypt"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "dmCookieProcessingType")
@XmlEnum
public enum DmCookieProcessingType {

    @XmlEnumValue("none")
    NONE("none"),
    @XmlEnumValue("sign")
    SIGN("sign"),
    @XmlEnumValue("encrypt")
    ENCRYPT("encrypt");
    private final String value;

    DmCookieProcessingType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DmCookieProcessingType fromValue(String v) {
        for (DmCookieProcessingType c: DmCookieProcessingType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
