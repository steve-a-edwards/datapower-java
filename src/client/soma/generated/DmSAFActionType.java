
package client.soma.generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dmSAFActionType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="dmSAFActionType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="r"/>
 *     &lt;enumeration value="u"/>
 *     &lt;enumeration value="a"/>
 *     &lt;enumeration value="c"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "dmSAFActionType")
@XmlEnum
public enum DmSAFActionType {

    @XmlEnumValue("r")
    R("r"),
    @XmlEnumValue("u")
    U("u"),
    @XmlEnumValue("a")
    A("a"),
    @XmlEnumValue("c")
    C("c");
    private final String value;

    DmSAFActionType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DmSAFActionType fromValue(String v) {
        for (DmSAFActionType c: DmSAFActionType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
