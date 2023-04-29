
package client.soma.generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dmMQtype.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="dmMQtype">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="static-backend"/>
 *     &lt;enumeration value="dynamic-backend"/>
 *     &lt;enumeration value="dynamic-response"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "dmMQtype")
@XmlEnum
public enum DmMQtype {

    @XmlEnumValue("static-backend")
    STATIC_BACKEND("static-backend"),
    @XmlEnumValue("dynamic-backend")
    DYNAMIC_BACKEND("dynamic-backend"),
    @XmlEnumValue("dynamic-response")
    DYNAMIC_RESPONSE("dynamic-response");
    private final String value;

    DmMQtype(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DmMQtype fromValue(String v) {
        for (DmMQtype c: DmMQtype.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
