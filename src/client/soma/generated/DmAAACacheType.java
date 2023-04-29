
package client.soma.generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dmAAACacheType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="dmAAACacheType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="absolute"/>
 *     &lt;enumeration value="disabled"/>
 *     &lt;enumeration value="maximum"/>
 *     &lt;enumeration value="minimum"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "dmAAACacheType")
@XmlEnum
public enum DmAAACacheType {

    @XmlEnumValue("absolute")
    ABSOLUTE("absolute"),
    @XmlEnumValue("disabled")
    DISABLED("disabled"),
    @XmlEnumValue("maximum")
    MAXIMUM("maximum"),
    @XmlEnumValue("minimum")
    MINIMUM("minimum");
    private final String value;

    DmAAACacheType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DmAAACacheType fromValue(String v) {
        for (DmAAACacheType c: DmAAACacheType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
