
package client.soma.generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dmCryptoEncryptionKeyType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="dmCryptoEncryptionKeyType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="asymmetric"/>
 *     &lt;enumeration value="symmetric"/>
 *     &lt;enumeration value="keywrap"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "dmCryptoEncryptionKeyType")
@XmlEnum
public enum DmCryptoEncryptionKeyType {

    @XmlEnumValue("asymmetric")
    ASYMMETRIC("asymmetric"),
    @XmlEnumValue("symmetric")
    SYMMETRIC("symmetric"),
    @XmlEnumValue("keywrap")
    KEYWRAP("keywrap");
    private final String value;

    DmCryptoEncryptionKeyType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DmCryptoEncryptionKeyType fromValue(String v) {
        for (DmCryptoEncryptionKeyType c: DmCryptoEncryptionKeyType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
