
package client.soma.generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dmSchemaExceptionType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="dmSchemaExceptionType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="AllowEncrypted"/>
 *     &lt;enumeration value="RequireEncrypted"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "dmSchemaExceptionType")
@XmlEnum
public enum DmSchemaExceptionType {

    @XmlEnumValue("AllowEncrypted")
    ALLOW_ENCRYPTED("AllowEncrypted"),
    @XmlEnumValue("RequireEncrypted")
    REQUIRE_ENCRYPTED("RequireEncrypted");
    private final String value;

    DmSchemaExceptionType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DmSchemaExceptionType fromValue(String v) {
        for (DmSchemaExceptionType c: DmSchemaExceptionType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
