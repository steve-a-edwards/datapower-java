
package client.soma.generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dmDNSLoadBalanceAlgorithm.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="dmDNSLoadBalanceAlgorithm">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="round-robin"/>
 *     &lt;enumeration value="first-alive"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "dmDNSLoadBalanceAlgorithm")
@XmlEnum
public enum DmDNSLoadBalanceAlgorithm {

    @XmlEnumValue("round-robin")
    ROUND_ROBIN("round-robin"),
    @XmlEnumValue("first-alive")
    FIRST_ALIVE("first-alive");
    private final String value;

    DmDNSLoadBalanceAlgorithm(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DmDNSLoadBalanceAlgorithm fromValue(String v) {
        for (DmDNSLoadBalanceAlgorithm c: DmDNSLoadBalanceAlgorithm.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
