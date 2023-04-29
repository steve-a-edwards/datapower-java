
package client.soma.generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dmLoadBalancerMemberHealth.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="dmLoadBalancerMemberHealth">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="up"/>
 *     &lt;enumeration value="softdown"/>
 *     &lt;enumeration value="down"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "dmLoadBalancerMemberHealth")
@XmlEnum
public enum DmLoadBalancerMemberHealth {

    @XmlEnumValue("up")
    UP("up"),
    @XmlEnumValue("softdown")
    SOFTDOWN("softdown"),
    @XmlEnumValue("down")
    DOWN("down");
    private final String value;

    DmLoadBalancerMemberHealth(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DmLoadBalancerMemberHealth fromValue(String v) {
        for (DmLoadBalancerMemberHealth c: DmLoadBalancerMemberHealth.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
