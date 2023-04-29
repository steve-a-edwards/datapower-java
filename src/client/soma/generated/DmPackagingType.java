
package client.soma.generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dmPackagingType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="dmPackagingType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="none"/>
 *     &lt;enumeration value="as2"/>
 *     &lt;enumeration value="as3"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "dmPackagingType")
@XmlEnum
public enum DmPackagingType {

    @XmlEnumValue("none")
    NONE("none"),
    @XmlEnumValue("as2")
    AS_2("as2"),
    @XmlEnumValue("as3")
    AS_3("as3");
    private final String value;

    DmPackagingType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DmPackagingType fromValue(String v) {
        for (DmPackagingType c: DmPackagingType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
