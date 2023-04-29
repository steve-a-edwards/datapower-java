
package client.soma.generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dmCryptoKeySymmetricEncryptionAlgorithm.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="dmCryptoKeySymmetricEncryptionAlgorithm">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="http://www.w3.org/2001/04/xmlenc#kw-tripledes"/>
 *     &lt;enumeration value="http://www.w3.org/2001/04/xmlenc#kw-aes128"/>
 *     &lt;enumeration value="http://www.w3.org/2001/04/xmlenc#kw-aes192"/>
 *     &lt;enumeration value="http://www.w3.org/2001/04/xmlenc#kw-aes256"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "dmCryptoKeySymmetricEncryptionAlgorithm")
@XmlEnum
public enum DmCryptoKeySymmetricEncryptionAlgorithm {

    @XmlEnumValue("http://www.w3.org/2001/04/xmlenc#kw-tripledes")
    HTTP_WWW_W_3_ORG_2001_04_XMLENC_KW_TRIPLEDES("http://www.w3.org/2001/04/xmlenc#kw-tripledes"),
    @XmlEnumValue("http://www.w3.org/2001/04/xmlenc#kw-aes128")
    HTTP_WWW_W_3_ORG_2001_04_XMLENC_KW_AES_128("http://www.w3.org/2001/04/xmlenc#kw-aes128"),
    @XmlEnumValue("http://www.w3.org/2001/04/xmlenc#kw-aes192")
    HTTP_WWW_W_3_ORG_2001_04_XMLENC_KW_AES_192("http://www.w3.org/2001/04/xmlenc#kw-aes192"),
    @XmlEnumValue("http://www.w3.org/2001/04/xmlenc#kw-aes256")
    HTTP_WWW_W_3_ORG_2001_04_XMLENC_KW_AES_256("http://www.w3.org/2001/04/xmlenc#kw-aes256");
    private final String value;

    DmCryptoKeySymmetricEncryptionAlgorithm(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DmCryptoKeySymmetricEncryptionAlgorithm fromValue(String v) {
        for (DmCryptoKeySymmetricEncryptionAlgorithm c: DmCryptoKeySymmetricEncryptionAlgorithm.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
