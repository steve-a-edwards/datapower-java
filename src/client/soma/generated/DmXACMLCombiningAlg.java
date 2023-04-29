
package client.soma.generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dmXACMLCombiningAlg.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="dmXACMLCombiningAlg">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="first-applicable"/>
 *     &lt;enumeration value="deny-overrides"/>
 *     &lt;enumeration value="permit-overrides"/>
 *     &lt;enumeration value="only-one-applicable"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "dmXACMLCombiningAlg")
@XmlEnum
public enum DmXACMLCombiningAlg {

    @XmlEnumValue("first-applicable")
    FIRST_APPLICABLE("first-applicable"),
    @XmlEnumValue("deny-overrides")
    DENY_OVERRIDES("deny-overrides"),
    @XmlEnumValue("permit-overrides")
    PERMIT_OVERRIDES("permit-overrides"),
    @XmlEnumValue("only-one-applicable")
    ONLY_ONE_APPLICABLE("only-one-applicable");
    private final String value;

    DmXACMLCombiningAlg(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DmXACMLCombiningAlg fromValue(String v) {
        for (DmXACMLCombiningAlg c: DmXACMLCombiningAlg.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
