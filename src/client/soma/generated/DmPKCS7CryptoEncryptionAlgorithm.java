
package client.soma.generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dmPKCS7CryptoEncryptionAlgorithm.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="dmPKCS7CryptoEncryptionAlgorithm">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="tripledes-cbc"/>
 *     &lt;enumeration value="aes128-cbc"/>
 *     &lt;enumeration value="aes192-cbc"/>
 *     &lt;enumeration value="aes256-cbc"/>
 *     &lt;enumeration value="rc2-40-cbc"/>
 *     &lt;enumeration value="rc2-64-cbc"/>
 *     &lt;enumeration value="rc2-cbc"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "dmPKCS7CryptoEncryptionAlgorithm")
@XmlEnum
public enum DmPKCS7CryptoEncryptionAlgorithm {

    @XmlEnumValue("tripledes-cbc")
    TRIPLEDES_CBC("tripledes-cbc"),
    @XmlEnumValue("aes128-cbc")
    AES_128_CBC("aes128-cbc"),
    @XmlEnumValue("aes192-cbc")
    AES_192_CBC("aes192-cbc"),
    @XmlEnumValue("aes256-cbc")
    AES_256_CBC("aes256-cbc"),
    @XmlEnumValue("rc2-40-cbc")
    RC_2_40_CBC("rc2-40-cbc"),
    @XmlEnumValue("rc2-64-cbc")
    RC_2_64_CBC("rc2-64-cbc"),
    @XmlEnumValue("rc2-cbc")
    RC_2_CBC("rc2-cbc");
    private final String value;

    DmPKCS7CryptoEncryptionAlgorithm(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DmPKCS7CryptoEncryptionAlgorithm fromValue(String v) {
        for (DmPKCS7CryptoEncryptionAlgorithm c: DmPKCS7CryptoEncryptionAlgorithm.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
