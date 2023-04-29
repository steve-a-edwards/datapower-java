
package client.soma.generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dmCryptoSigningAlgorithm.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="dmCryptoSigningAlgorithm">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="rsa-sha1"/>
 *     &lt;enumeration value="dsa-sha1"/>
 *     &lt;enumeration value="rsa-sha256"/>
 *     &lt;enumeration value="rsa-sha384"/>
 *     &lt;enumeration value="rsa-sha512"/>
 *     &lt;enumeration value="rsa-ripemd160"/>
 *     &lt;enumeration value="rsa-md5"/>
 *     &lt;enumeration value="rsa"/>
 *     &lt;enumeration value="dsa"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "dmCryptoSigningAlgorithm")
@XmlEnum
public enum DmCryptoSigningAlgorithm {

    @XmlEnumValue("rsa-sha1")
    RSA_SHA_1("rsa-sha1"),
    @XmlEnumValue("dsa-sha1")
    DSA_SHA_1("dsa-sha1"),
    @XmlEnumValue("rsa-sha256")
    RSA_SHA_256("rsa-sha256"),
    @XmlEnumValue("rsa-sha384")
    RSA_SHA_384("rsa-sha384"),
    @XmlEnumValue("rsa-sha512")
    RSA_SHA_512("rsa-sha512"),
    @XmlEnumValue("rsa-ripemd160")
    RSA_RIPEMD_160("rsa-ripemd160"),
    @XmlEnumValue("rsa-md5")
    RSA_MD_5("rsa-md5"),
    @XmlEnumValue("rsa")
    RSA("rsa"),
    @XmlEnumValue("dsa")
    DSA("dsa");
    private final String value;

    DmCryptoSigningAlgorithm(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DmCryptoSigningAlgorithm fromValue(String v) {
        for (DmCryptoSigningAlgorithm c: DmCryptoSigningAlgorithm.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
