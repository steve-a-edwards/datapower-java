
package client.soma.generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dmAAAXACMLBindingMethod.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="dmAAAXACMLBindingMethod">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="dp-pdp"/>
 *     &lt;enumeration value="custom"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "dmAAAXACMLBindingMethod")
@XmlEnum
public enum DmAAAXACMLBindingMethod {

    @XmlEnumValue("dp-pdp")
    DP_PDP("dp-pdp"),
    @XmlEnumValue("custom")
    CUSTOM("custom");
    private final String value;

    DmAAAXACMLBindingMethod(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DmAAAXACMLBindingMethod fromValue(String v) {
        for (DmAAAXACMLBindingMethod c: DmAAAXACMLBindingMethod.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
