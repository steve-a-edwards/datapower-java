
package client.soma.generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dmShutdownMode.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="dmShutdownMode">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="reboot"/>
 *     &lt;enumeration value="reload"/>
 *     &lt;enumeration value="halt"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "dmShutdownMode")
@XmlEnum
public enum DmShutdownMode {

    @XmlEnumValue("reboot")
    REBOOT("reboot"),
    @XmlEnumValue("reload")
    RELOAD("reload"),
    @XmlEnumValue("halt")
    HALT("halt");
    private final String value;

    DmShutdownMode(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DmShutdownMode fromValue(String v) {
        for (DmShutdownMode c: DmShutdownMode.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
