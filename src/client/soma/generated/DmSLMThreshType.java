
package client.soma.generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dmSLMThreshType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="dmSLMThreshType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="count-all"/>
 *     &lt;enumeration value="count-errors"/>
 *     &lt;enumeration value="latency-internal"/>
 *     &lt;enumeration value="latency-backend"/>
 *     &lt;enumeration value="latency-total"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "dmSLMThreshType")
@XmlEnum
public enum DmSLMThreshType {

    @XmlEnumValue("count-all")
    COUNT_ALL("count-all"),
    @XmlEnumValue("count-errors")
    COUNT_ERRORS("count-errors"),
    @XmlEnumValue("latency-internal")
    LATENCY_INTERNAL("latency-internal"),
    @XmlEnumValue("latency-backend")
    LATENCY_BACKEND("latency-backend"),
    @XmlEnumValue("latency-total")
    LATENCY_TOTAL("latency-total");
    private final String value;

    DmSLMThreshType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DmSLMThreshType fromValue(String v) {
        for (DmSLMThreshType c: DmSLMThreshType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
