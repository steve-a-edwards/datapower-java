
package client.soma.generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dmWSRMPolicyDeliveryAssurance.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="dmWSRMPolicyDeliveryAssurance">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="exactly-once"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "dmWSRMPolicyDeliveryAssurance")
@XmlEnum
public enum DmWSRMPolicyDeliveryAssurance {

    @XmlEnumValue("exactly-once")
    EXACTLY_ONCE("exactly-once");
    private final String value;

    DmWSRMPolicyDeliveryAssurance(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DmWSRMPolicyDeliveryAssurance fromValue(String v) {
        for (DmWSRMPolicyDeliveryAssurance c: DmWSRMPolicyDeliveryAssurance.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
