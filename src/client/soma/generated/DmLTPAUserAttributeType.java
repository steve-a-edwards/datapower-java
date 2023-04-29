
package client.soma.generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dmLTPAUserAttributeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="dmLTPAUserAttributeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="static"/>
 *     &lt;enumeration value="xpath"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "dmLTPAUserAttributeType")
@XmlEnum
public enum DmLTPAUserAttributeType {

    @XmlEnumValue("static")
    STATIC("static"),
    @XmlEnumValue("xpath")
    XPATH("xpath");
    private final String value;

    DmLTPAUserAttributeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DmLTPAUserAttributeType fromValue(String v) {
        for (DmLTPAUserAttributeType c: DmLTPAUserAttributeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
