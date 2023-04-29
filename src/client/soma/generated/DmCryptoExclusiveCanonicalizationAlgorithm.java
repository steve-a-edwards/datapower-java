
package client.soma.generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dmCryptoExclusiveCanonicalizationAlgorithm.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="dmCryptoExclusiveCanonicalizationAlgorithm">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="exc-c14n"/>
 *     &lt;enumeration value="exc-c14n-comments"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "dmCryptoExclusiveCanonicalizationAlgorithm")
@XmlEnum
public enum DmCryptoExclusiveCanonicalizationAlgorithm {

    @XmlEnumValue("exc-c14n")
    EXC_C_14_N("exc-c14n"),
    @XmlEnumValue("exc-c14n-comments")
    EXC_C_14_N_COMMENTS("exc-c14n-comments");
    private final String value;

    DmCryptoExclusiveCanonicalizationAlgorithm(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DmCryptoExclusiveCanonicalizationAlgorithm fromValue(String v) {
        for (DmCryptoExclusiveCanonicalizationAlgorithm c: DmCryptoExclusiveCanonicalizationAlgorithm.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
