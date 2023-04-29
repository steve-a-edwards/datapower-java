
package client.soma.generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dmCryptoHashAlgorithm.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="dmCryptoHashAlgorithm">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="sha1"/>
 *     &lt;enumeration value="sha256"/>
 *     &lt;enumeration value="sha512"/>
 *     &lt;enumeration value="ripemd160"/>
 *     &lt;enumeration value="sha224"/>
 *     &lt;enumeration value="sha384"/>
 *     &lt;enumeration value="md5"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "dmCryptoHashAlgorithm")
@XmlEnum
public enum DmCryptoHashAlgorithm {

    @XmlEnumValue("sha1")
    SHA_1("sha1"),
    @XmlEnumValue("sha256")
    SHA_256("sha256"),
    @XmlEnumValue("sha512")
    SHA_512("sha512"),
    @XmlEnumValue("ripemd160")
    RIPEMD_160("ripemd160"),
    @XmlEnumValue("sha224")
    SHA_224("sha224"),
    @XmlEnumValue("sha384")
    SHA_384("sha384"),
    @XmlEnumValue("md5")
    MD_5("md5");
    private final String value;

    DmCryptoHashAlgorithm(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DmCryptoHashAlgorithm fromValue(String v) {
        for (DmCryptoHashAlgorithm c: DmCryptoHashAlgorithm.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
