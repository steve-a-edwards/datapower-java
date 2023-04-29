
package client.soma.generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dmCryptoHSMKeyType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="dmCryptoHSMKeyType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="private"/>
 *     &lt;enumeration value="public"/>
 *     &lt;enumeration value="secret"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "dmCryptoHSMKeyType")
@XmlEnum
public enum DmCryptoHSMKeyType {

    @XmlEnumValue("private")
    PRIVATE("private"),
    @XmlEnumValue("public")
    PUBLIC("public"),
    @XmlEnumValue("secret")
    SECRET("secret");
    private final String value;

    DmCryptoHSMKeyType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DmCryptoHSMKeyType fromValue(String v) {
        for (DmCryptoHSMKeyType c: DmCryptoHSMKeyType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
