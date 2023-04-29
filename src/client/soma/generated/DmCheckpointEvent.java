
package client.soma.generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dmCheckpointEvent.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="dmCheckpointEvent">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Request"/>
 *     &lt;enumeration value="Response"/>
 *     &lt;enumeration value="Fault"/>
 *     &lt;enumeration value="AuthComplete"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "dmCheckpointEvent")
@XmlEnum
public enum DmCheckpointEvent {

    @XmlEnumValue("Request")
    REQUEST("Request"),
    @XmlEnumValue("Response")
    RESPONSE("Response"),
    @XmlEnumValue("Fault")
    FAULT("Fault"),
    @XmlEnumValue("AuthComplete")
    AUTH_COMPLETE("AuthComplete");
    private final String value;

    DmCheckpointEvent(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DmCheckpointEvent fromValue(String v) {
        for (DmCheckpointEvent c: DmCheckpointEvent.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
