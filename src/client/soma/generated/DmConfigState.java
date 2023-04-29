
package client.soma.generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dmConfigState.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="dmConfigState">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="invalid"/>
 *     &lt;enumeration value="saved"/>
 *     &lt;enumeration value="new"/>
 *     &lt;enumeration value="modified"/>
 *     &lt;enumeration value="deleted"/>
 *     &lt;enumeration value="external"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "dmConfigState")
@XmlEnum
public enum DmConfigState {

    @XmlEnumValue("invalid")
    INVALID("invalid"),
    @XmlEnumValue("saved")
    SAVED("saved"),
    @XmlEnumValue("new")
    NEW("new"),
    @XmlEnumValue("modified")
    MODIFIED("modified"),
    @XmlEnumValue("deleted")
    DELETED("deleted"),
    @XmlEnumValue("external")
    EXTERNAL("external");
    private final String value;

    DmConfigState(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DmConfigState fromValue(String v) {
        for (DmConfigState c: DmConfigState.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
