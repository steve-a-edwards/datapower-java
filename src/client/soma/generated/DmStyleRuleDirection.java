
package client.soma.generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dmStyleRuleDirection.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="dmStyleRuleDirection">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="rule"/>
 *     &lt;enumeration value="request-rule"/>
 *     &lt;enumeration value="response-rule"/>
 *     &lt;enumeration value="error-rule"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "dmStyleRuleDirection")
@XmlEnum
public enum DmStyleRuleDirection {

    @XmlEnumValue("rule")
    RULE("rule"),
    @XmlEnumValue("request-rule")
    REQUEST_RULE("request-rule"),
    @XmlEnumValue("response-rule")
    RESPONSE_RULE("response-rule"),
    @XmlEnumValue("error-rule")
    ERROR_RULE("error-rule");
    private final String value;

    DmStyleRuleDirection(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DmStyleRuleDirection fromValue(String v) {
        for (DmStyleRuleDirection c: DmStyleRuleDirection.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
