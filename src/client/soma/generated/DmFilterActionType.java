
package client.soma.generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dmFilterActionType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="dmFilterActionType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="notify"/>
 *     &lt;enumeration value="reject"/>
 *     &lt;enumeration value="shape"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "dmFilterActionType")
@XmlEnum
public enum DmFilterActionType {

    @XmlEnumValue("notify")
    NOTIFY("notify"),
    @XmlEnumValue("reject")
    REJECT("reject"),
    @XmlEnumValue("shape")
    SHAPE("shape");
    private final String value;

    DmFilterActionType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DmFilterActionType fromValue(String v) {
        for (DmFilterActionType c: DmFilterActionType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
