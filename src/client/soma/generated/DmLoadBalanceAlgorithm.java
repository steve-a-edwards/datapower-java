
package client.soma.generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dmLoadBalanceAlgorithm.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="dmLoadBalanceAlgorithm">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="round-robin"/>
 *     &lt;enumeration value="weighted-round-robin"/>
 *     &lt;enumeration value="hash"/>
 *     &lt;enumeration value="least-connections"/>
 *     &lt;enumeration value="first-alive"/>
 *     &lt;enumeration value="weighted-least-connections"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "dmLoadBalanceAlgorithm")
@XmlEnum
public enum DmLoadBalanceAlgorithm {

    @XmlEnumValue("round-robin")
    ROUND_ROBIN("round-robin"),
    @XmlEnumValue("weighted-round-robin")
    WEIGHTED_ROUND_ROBIN("weighted-round-robin"),
    @XmlEnumValue("hash")
    HASH("hash"),
    @XmlEnumValue("least-connections")
    LEAST_CONNECTIONS("least-connections"),
    @XmlEnumValue("first-alive")
    FIRST_ALIVE("first-alive"),
    @XmlEnumValue("weighted-least-connections")
    WEIGHTED_LEAST_CONNECTIONS("weighted-least-connections");
    private final String value;

    DmLoadBalanceAlgorithm(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DmLoadBalanceAlgorithm fromValue(String v) {
        for (DmLoadBalanceAlgorithm c: DmLoadBalanceAlgorithm.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
