
package client.soma.generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dmOutputMode.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="dmOutputMode">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="general"/>
 *     &lt;enumeration value="stream"/>
 *     &lt;enumeration value="context"/>
 *     &lt;enumeration value="events"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "dmOutputMode")
@XmlEnum
public enum DmOutputMode {

    @XmlEnumValue("general")
    GENERAL("general"),
    @XmlEnumValue("stream")
    STREAM("stream"),
    @XmlEnumValue("context")
    CONTEXT("context"),
    @XmlEnumValue("events")
    EVENTS("events");
    private final String value;

    DmOutputMode(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DmOutputMode fromValue(String v) {
        for (DmOutputMode c: DmOutputMode.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
