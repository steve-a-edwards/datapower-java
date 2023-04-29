
package client.soma.generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dmSLMIntervalType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="dmSLMIntervalType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="fixed"/>
 *     &lt;enumeration value="moving"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "dmSLMIntervalType")
@XmlEnum
public enum DmSLMIntervalType {

    @XmlEnumValue("fixed")
    FIXED("fixed"),
    @XmlEnumValue("moving")
    MOVING("moving");
    private final String value;

    DmSLMIntervalType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DmSLMIntervalType fromValue(String v) {
        for (DmSLMIntervalType c: DmSLMIntervalType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
