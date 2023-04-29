
package client.soma.generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dmSQLSourceType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="dmSQLSourceType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="static"/>
 *     &lt;enumeration value="variable"/>
 *     &lt;enumeration value="stylesheet"/>
 *     &lt;enumeration value="static_internal"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "dmSQLSourceType")
@XmlEnum
public enum DmSQLSourceType {

    @XmlEnumValue("static")
    STATIC("static"),
    @XmlEnumValue("variable")
    VARIABLE("variable"),
    @XmlEnumValue("stylesheet")
    STYLESHEET("stylesheet"),
    @XmlEnumValue("static_internal")
    STATIC_INTERNAL("static_internal");
    private final String value;

    DmSQLSourceType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DmSQLSourceType fromValue(String v) {
        for (DmSQLSourceType c: DmSQLSourceType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
