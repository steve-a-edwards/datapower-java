
package client.soma.generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dmCryptoEncryptionAlgorithm.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="dmCryptoEncryptionAlgorithm">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="http://www.w3.org/2001/04/xmlenc#tripledes-cbc"/>
 *     &lt;enumeration value="http://www.w3.org/2001/04/xmlenc#aes128-cbc"/>
 *     &lt;enumeration value="http://www.w3.org/2001/04/xmlenc#aes192-cbc"/>
 *     &lt;enumeration value="http://www.w3.org/2001/04/xmlenc#aes256-cbc"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "dmCryptoEncryptionAlgorithm")
@XmlEnum
public enum DmCryptoEncryptionAlgorithm {

    @XmlEnumValue("http://www.w3.org/2001/04/xmlenc#tripledes-cbc")
    HTTP_WWW_W_3_ORG_2001_04_XMLENC_TRIPLEDES_CBC("http://www.w3.org/2001/04/xmlenc#tripledes-cbc"),
    @XmlEnumValue("http://www.w3.org/2001/04/xmlenc#aes128-cbc")
    HTTP_WWW_W_3_ORG_2001_04_XMLENC_AES_128_CBC("http://www.w3.org/2001/04/xmlenc#aes128-cbc"),
    @XmlEnumValue("http://www.w3.org/2001/04/xmlenc#aes192-cbc")
    HTTP_WWW_W_3_ORG_2001_04_XMLENC_AES_192_CBC("http://www.w3.org/2001/04/xmlenc#aes192-cbc"),
    @XmlEnumValue("http://www.w3.org/2001/04/xmlenc#aes256-cbc")
    HTTP_WWW_W_3_ORG_2001_04_XMLENC_AES_256_CBC("http://www.w3.org/2001/04/xmlenc#aes256-cbc");
    private final String value;

    DmCryptoEncryptionAlgorithm(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DmCryptoEncryptionAlgorithm fromValue(String v) {
        for (DmCryptoEncryptionAlgorithm c: DmCryptoEncryptionAlgorithm.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
