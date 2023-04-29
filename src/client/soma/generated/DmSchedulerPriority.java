
package client.soma.generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dmSchedulerPriority.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="dmSchedulerPriority">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="unknown"/>
 *     &lt;enumeration value="high-min"/>
 *     &lt;enumeration value="high"/>
 *     &lt;enumeration value="high-max"/>
 *     &lt;enumeration value="normal-min"/>
 *     &lt;enumeration value="normal"/>
 *     &lt;enumeration value="normal-max"/>
 *     &lt;enumeration value="low-min"/>
 *     &lt;enumeration value="low"/>
 *     &lt;enumeration value="low-max"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "dmSchedulerPriority")
@XmlEnum
public enum DmSchedulerPriority {

    @XmlEnumValue("unknown")
    UNKNOWN("unknown"),
    @XmlEnumValue("high-min")
    HIGH_MIN("high-min"),
    @XmlEnumValue("high")
    HIGH("high"),
    @XmlEnumValue("high-max")
    HIGH_MAX("high-max"),
    @XmlEnumValue("normal-min")
    NORMAL_MIN("normal-min"),
    @XmlEnumValue("normal")
    NORMAL("normal"),
    @XmlEnumValue("normal-max")
    NORMAL_MAX("normal-max"),
    @XmlEnumValue("low-min")
    LOW_MIN("low-min"),
    @XmlEnumValue("low")
    LOW("low"),
    @XmlEnumValue("low-max")
    LOW_MAX("low-max");
    private final String value;

    DmSchedulerPriority(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DmSchedulerPriority fromValue(String v) {
        for (DmSchedulerPriority c: DmSchedulerPriority.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
