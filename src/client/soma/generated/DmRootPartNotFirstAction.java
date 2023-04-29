
package client.soma.generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dmRootPartNotFirstAction.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="dmRootPartNotFirstAction">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="process-in-order"/>
 *     &lt;enumeration value="buffer"/>
 *     &lt;enumeration value="abort"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "dmRootPartNotFirstAction")
@XmlEnum
public enum DmRootPartNotFirstAction {

    @XmlEnumValue("process-in-order")
    PROCESS_IN_ORDER("process-in-order"),
    @XmlEnumValue("buffer")
    BUFFER("buffer"),
    @XmlEnumValue("abort")
    ABORT("abort");
    private final String value;

    DmRootPartNotFirstAction(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DmRootPartNotFirstAction fromValue(String v) {
        for (DmRootPartNotFirstAction c: DmRootPartNotFirstAction.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
