
package client.soma.generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dmDebugMode.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="dmDebugMode">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="on"/>
 *     &lt;enumeration value="off"/>
 *     &lt;enumeration value="unbounded"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "dmDebugMode")
@XmlEnum
public enum DmDebugMode {

    @XmlEnumValue("on")
    ON("on"),
    @XmlEnumValue("off")
    OFF("off"),
    @XmlEnumValue("unbounded")
    UNBOUNDED("unbounded");
    private final String value;

    DmDebugMode(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DmDebugMode fromValue(String v) {
        for (DmDebugMode c: DmDebugMode.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
