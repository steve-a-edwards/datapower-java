
package client.soma.generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dmCryptoKeyAsymmetricEncryptionAlgorithm.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="dmCryptoKeyAsymmetricEncryptionAlgorithm">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="http://www.w3.org/2001/04/xmlenc#rsa-1_5"/>
 *     &lt;enumeration value="http://www.w3.org/2001/04/xmlenc#rsa-oaep-mgf1p"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "dmCryptoKeyAsymmetricEncryptionAlgorithm")
@XmlEnum
public enum DmCryptoKeyAsymmetricEncryptionAlgorithm {

    @XmlEnumValue("http://www.w3.org/2001/04/xmlenc#rsa-1_5")
    HTTP_WWW_W_3_ORG_2001_04_XMLENC_RSA_1_5("http://www.w3.org/2001/04/xmlenc#rsa-1_5"),
    @XmlEnumValue("http://www.w3.org/2001/04/xmlenc#rsa-oaep-mgf1p")
    HTTP_WWW_W_3_ORG_2001_04_XMLENC_RSA_OAEP_MGF_1_P("http://www.w3.org/2001/04/xmlenc#rsa-oaep-mgf1p");
    private final String value;

    DmCryptoKeyAsymmetricEncryptionAlgorithm(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DmCryptoKeyAsymmetricEncryptionAlgorithm fromValue(String v) {
        for (DmCryptoKeyAsymmetricEncryptionAlgorithm c: DmCryptoKeyAsymmetricEncryptionAlgorithm.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
