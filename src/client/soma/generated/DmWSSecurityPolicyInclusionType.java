
package client.soma.generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dmWSSecurityPolicyInclusionType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="dmWSSecurityPolicyInclusionType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Always"/>
 *     &lt;enumeration value="AlwaysToRecipient"/>
 *     &lt;enumeration value="AlwaysToIntiator"/>
 *     &lt;enumeration value="Once"/>
 *     &lt;enumeration value="Never"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "dmWSSecurityPolicyInclusionType")
@XmlEnum
public enum DmWSSecurityPolicyInclusionType {

    @XmlEnumValue("Always")
    ALWAYS("Always"),
    @XmlEnumValue("AlwaysToRecipient")
    ALWAYS_TO_RECIPIENT("AlwaysToRecipient"),
    @XmlEnumValue("AlwaysToIntiator")
    ALWAYS_TO_INTIATOR("AlwaysToIntiator"),
    @XmlEnumValue("Once")
    ONCE("Once"),
    @XmlEnumValue("Never")
    NEVER("Never");
    private final String value;

    DmWSSecurityPolicyInclusionType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DmWSSecurityPolicyInclusionType fromValue(String v) {
        for (DmWSSecurityPolicyInclusionType c: DmWSSecurityPolicyInclusionType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
