
package client.soma.generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dmPolicyEnforcementMode.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="dmPolicyEnforcementMode">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="filter"/>
 *     &lt;enumeration value="enforce"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "dmPolicyEnforcementMode")
@XmlEnum
public enum DmPolicyEnforcementMode {

    @XmlEnumValue("filter")
    FILTER("filter"),
    @XmlEnumValue("enforce")
    ENFORCE("enforce");
    private final String value;

    DmPolicyEnforcementMode(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DmPolicyEnforcementMode fromValue(String v) {
        for (DmPolicyEnforcementMode c: DmPolicyEnforcementMode.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
