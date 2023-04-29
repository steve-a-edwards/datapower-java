
package client.soma.generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dmMSDebuggerType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="dmMSDebuggerType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="internal"/>
 *     &lt;enumeration value="external"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "dmMSDebuggerType")
@XmlEnum
public enum DmMSDebuggerType {

    @XmlEnumValue("internal")
    INTERNAL("internal"),
    @XmlEnumValue("external")
    EXTERNAL("external");
    private final String value;

    DmMSDebuggerType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DmMSDebuggerType fromValue(String v) {
        for (DmMSDebuggerType c: DmMSDebuggerType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
