
package client.soma.generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dmSLMAction.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="dmSLMAction">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="log"/>
 *     &lt;enumeration value="throttle"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "dmSLMAction")
@XmlEnum
public enum DmSLMAction {

    @XmlEnumValue("log")
    LOG("log"),
    @XmlEnumValue("throttle")
    THROTTLE("throttle");
    private final String value;

    DmSLMAction(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DmSLMAction fromValue(String v) {
        for (DmSLMAction c: DmSLMAction.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
