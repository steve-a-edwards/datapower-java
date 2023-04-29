
package client.soma.generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dmCryptoOperationType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="dmCryptoOperationType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="encrypt"/>
 *     &lt;enumeration value="encrypt-wssec"/>
 *     &lt;enumeration value="decrypt"/>
 *     &lt;enumeration value="sign-wssec"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "dmCryptoOperationType")
@XmlEnum
public enum DmCryptoOperationType {

    @XmlEnumValue("encrypt")
    ENCRYPT("encrypt"),
    @XmlEnumValue("encrypt-wssec")
    ENCRYPT_WSSEC("encrypt-wssec"),
    @XmlEnumValue("decrypt")
    DECRYPT("decrypt"),
    @XmlEnumValue("sign-wssec")
    SIGN_WSSEC("sign-wssec");
    private final String value;

    DmCryptoOperationType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DmCryptoOperationType fromValue(String v) {
        for (DmCryptoOperationType c: DmCryptoOperationType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
