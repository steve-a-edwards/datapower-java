
package client.soma.generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dmCryptoCanonicalizationAlgorithm.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="dmCryptoCanonicalizationAlgorithm">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="c14n"/>
 *     &lt;enumeration value="exc-c14n"/>
 *     &lt;enumeration value="c14n-comments"/>
 *     &lt;enumeration value="exc-c14n-comments"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "dmCryptoCanonicalizationAlgorithm")
@XmlEnum
public enum DmCryptoCanonicalizationAlgorithm {

    @XmlEnumValue("c14n")
    C_14_N("c14n"),
    @XmlEnumValue("exc-c14n")
    EXC_C_14_N("exc-c14n"),
    @XmlEnumValue("c14n-comments")
    C_14_N_COMMENTS("c14n-comments"),
    @XmlEnumValue("exc-c14n-comments")
    EXC_C_14_N_COMMENTS("exc-c14n-comments");
    private final String value;

    DmCryptoCanonicalizationAlgorithm(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DmCryptoCanonicalizationAlgorithm fromValue(String v) {
        for (DmCryptoCanonicalizationAlgorithm c: DmCryptoCanonicalizationAlgorithm.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
