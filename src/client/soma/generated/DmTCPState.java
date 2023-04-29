
package client.soma.generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dmTCPState.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="dmTCPState">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="established"/>
 *     &lt;enumeration value="syn-sent"/>
 *     &lt;enumeration value="syn-received"/>
 *     &lt;enumeration value="fin-wait-1"/>
 *     &lt;enumeration value="fin-wait-2"/>
 *     &lt;enumeration value="time-wait"/>
 *     &lt;enumeration value="closed"/>
 *     &lt;enumeration value="close-wait"/>
 *     &lt;enumeration value="last-ack"/>
 *     &lt;enumeration value="listen"/>
 *     &lt;enumeration value="closing"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "dmTCPState")
@XmlEnum
public enum DmTCPState {

    @XmlEnumValue("established")
    ESTABLISHED("established"),
    @XmlEnumValue("syn-sent")
    SYN_SENT("syn-sent"),
    @XmlEnumValue("syn-received")
    SYN_RECEIVED("syn-received"),
    @XmlEnumValue("fin-wait-1")
    FIN_WAIT_1("fin-wait-1"),
    @XmlEnumValue("fin-wait-2")
    FIN_WAIT_2("fin-wait-2"),
    @XmlEnumValue("time-wait")
    TIME_WAIT("time-wait"),
    @XmlEnumValue("closed")
    CLOSED("closed"),
    @XmlEnumValue("close-wait")
    CLOSE_WAIT("close-wait"),
    @XmlEnumValue("last-ack")
    LAST_ACK("last-ack"),
    @XmlEnumValue("listen")
    LISTEN("listen"),
    @XmlEnumValue("closing")
    CLOSING("closing");
    private final String value;

    DmTCPState(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DmTCPState fromValue(String v) {
        for (DmTCPState c: DmTCPState.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
