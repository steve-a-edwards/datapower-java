
package client.soma.generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dmOpState.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="dmOpState">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="up"/>
 *     &lt;enumeration value="down"/>
 *     &lt;enumeration value="PendingUp"/>
 *     &lt;enumeration value="PendingDown"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "dmOpState")
@XmlEnum
public enum DmOpState {

    @XmlEnumValue("up")
    UP("up"),
    @XmlEnumValue("down")
    DOWN("down"),
    @XmlEnumValue("PendingUp")
    PENDING_UP("PendingUp"),
    @XmlEnumValue("PendingDown")
    PENDING_DOWN("PendingDown");
    private final String value;

    DmOpState(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DmOpState fromValue(String v) {
        for (DmOpState c: DmOpState.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
