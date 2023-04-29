
package client.soma.generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dmLabelType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="dmLabelType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="pre-defined"/>
 *     &lt;enumeration value="user"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "dmLabelType")
@XmlEnum
public enum DmLabelType {

    @XmlEnumValue("pre-defined")
    PRE_DEFINED("pre-defined"),
    @XmlEnumValue("user")
    USER("user");
    private final String value;

    DmLabelType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DmLabelType fromValue(String v) {
        for (DmLabelType c: DmLabelType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
