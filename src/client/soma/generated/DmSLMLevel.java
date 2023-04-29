
package client.soma.generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dmSLMLevel.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="dmSLMLevel">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="low"/>
 *     &lt;enumeration value="high"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "dmSLMLevel")
@XmlEnum
public enum DmSLMLevel {

    @XmlEnumValue("low")
    LOW("low"),
    @XmlEnumValue("high")
    HIGH("high");
    private final String value;

    DmSLMLevel(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DmSLMLevel fromValue(String v) {
        for (DmSLMLevel c: DmSLMLevel.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
