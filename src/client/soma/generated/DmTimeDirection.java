
package client.soma.generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dmTimeDirection.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="dmTimeDirection">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="East"/>
 *     &lt;enumeration value="West"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "dmTimeDirection")
@XmlEnum
public enum DmTimeDirection {

    @XmlEnumValue("East")
    EAST("East"),
    @XmlEnumValue("West")
    WEST("West");
    private final String value;

    DmTimeDirection(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DmTimeDirection fromValue(String v) {
        for (DmTimeDirection c: DmTimeDirection.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
