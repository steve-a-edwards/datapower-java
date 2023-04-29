
package client.soma.generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dmSLMThresholdAlgorithm.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="dmSLMThresholdAlgorithm">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="greater-than"/>
 *     &lt;enumeration value="less-than"/>
 *     &lt;enumeration value="token-bucket"/>
 *     &lt;enumeration value="high-low-thresholds"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "dmSLMThresholdAlgorithm")
@XmlEnum
public enum DmSLMThresholdAlgorithm {

    @XmlEnumValue("greater-than")
    GREATER_THAN("greater-than"),
    @XmlEnumValue("less-than")
    LESS_THAN("less-than"),
    @XmlEnumValue("token-bucket")
    TOKEN_BUCKET("token-bucket"),
    @XmlEnumValue("high-low-thresholds")
    HIGH_LOW_THRESHOLDS("high-low-thresholds");
    private final String value;

    DmSLMThresholdAlgorithm(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DmSLMThresholdAlgorithm fromValue(String v) {
        for (DmSLMThresholdAlgorithm c: DmSLMThresholdAlgorithm.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
