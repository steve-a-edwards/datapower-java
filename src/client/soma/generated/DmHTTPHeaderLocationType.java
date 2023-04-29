
package client.soma.generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dmHTTPHeaderLocationType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="dmHTTPHeaderLocationType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="front"/>
 *     &lt;enumeration value="back"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "dmHTTPHeaderLocationType")
@XmlEnum
public enum DmHTTPHeaderLocationType {

    @XmlEnumValue("front")
    FRONT("front"),
    @XmlEnumValue("back")
    BACK("back");
    private final String value;

    DmHTTPHeaderLocationType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DmHTTPHeaderLocationType fromValue(String v) {
        for (DmHTTPHeaderLocationType c: DmHTTPHeaderLocationType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
