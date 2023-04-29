
package client.soma.generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dmPacketCaptureMode.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="dmPacketCaptureMode">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="timed"/>
 *     &lt;enumeration value="continuous"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "dmPacketCaptureMode")
@XmlEnum
public enum DmPacketCaptureMode {

    @XmlEnumValue("timed")
    TIMED("timed"),
    @XmlEnumValue("continuous")
    CONTINUOUS("continuous");
    private final String value;

    DmPacketCaptureMode(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DmPacketCaptureMode fromValue(String v) {
        for (DmPacketCaptureMode c: DmPacketCaptureMode.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
