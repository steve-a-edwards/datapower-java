
package client.soma.generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dmCryptoHMACSigningAlgorithm.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="dmCryptoHMACSigningAlgorithm">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="hmac-sha1"/>
 *     &lt;enumeration value="hmac-sha224"/>
 *     &lt;enumeration value="hmac-sha256"/>
 *     &lt;enumeration value="hmac-sha384"/>
 *     &lt;enumeration value="hmac-sha512"/>
 *     &lt;enumeration value="hmac-ripemd160"/>
 *     &lt;enumeration value="hmac-md5"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "dmCryptoHMACSigningAlgorithm")
@XmlEnum
public enum DmCryptoHMACSigningAlgorithm {

    @XmlEnumValue("hmac-sha1")
    HMAC_SHA_1("hmac-sha1"),
    @XmlEnumValue("hmac-sha224")
    HMAC_SHA_224("hmac-sha224"),
    @XmlEnumValue("hmac-sha256")
    HMAC_SHA_256("hmac-sha256"),
    @XmlEnumValue("hmac-sha384")
    HMAC_SHA_384("hmac-sha384"),
    @XmlEnumValue("hmac-sha512")
    HMAC_SHA_512("hmac-sha512"),
    @XmlEnumValue("hmac-ripemd160")
    HMAC_RIPEMD_160("hmac-ripemd160"),
    @XmlEnumValue("hmac-md5")
    HMAC_MD_5("hmac-md5");
    private final String value;

    DmCryptoHMACSigningAlgorithm(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DmCryptoHMACSigningAlgorithm fromValue(String v) {
        for (DmCryptoHMACSigningAlgorithm c: DmCryptoHMACSigningAlgorithm.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
