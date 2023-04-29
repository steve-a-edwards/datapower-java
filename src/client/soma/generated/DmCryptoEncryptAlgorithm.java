
package client.soma.generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dmCryptoEncryptAlgorithm.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="dmCryptoEncryptAlgorithm">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="smime"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "dmCryptoEncryptAlgorithm")
@XmlEnum
public enum DmCryptoEncryptAlgorithm {

    @XmlEnumValue("smime")
    SMIME("smime");
    private final String value;

    DmCryptoEncryptAlgorithm(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DmCryptoEncryptAlgorithm fromValue(String v) {
        for (DmCryptoEncryptAlgorithm c: DmCryptoEncryptAlgorithm.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
