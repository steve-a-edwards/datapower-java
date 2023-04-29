
package client.soma.generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dmDetectIntrusion.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="dmDetectIntrusion">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="enable"/>
 *     &lt;enumeration value="disable"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "dmDetectIntrusion")
@XmlEnum
public enum DmDetectIntrusion {

    @XmlEnumValue("enable")
    ENABLE("enable"),
    @XmlEnumValue("disable")
    DISABLE("disable");
    private final String value;

    DmDetectIntrusion(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DmDetectIntrusion fromValue(String v) {
        for (DmDetectIntrusion c: DmDetectIntrusion.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
