
package client.soma.generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dmSLMTarget.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="dmSLMTarget">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="front"/>
 *     &lt;enumeration value="rate"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "dmSLMTarget")
@XmlEnum
public enum DmSLMTarget {

    @XmlEnumValue("front")
    FRONT("front"),
    @XmlEnumValue("rate")
    RATE("rate");
    private final String value;

    DmSLMTarget(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DmSLMTarget fromValue(String v) {
        for (DmSLMTarget c: DmSLMTarget.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
