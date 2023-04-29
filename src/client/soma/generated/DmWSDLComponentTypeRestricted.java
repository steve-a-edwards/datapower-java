
package client.soma.generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dmWSDLComponentTypeRestricted.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="dmWSDLComponentTypeRestricted">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="service"/>
 *     &lt;enumeration value="port"/>
 *     &lt;enumeration value="fragmentid"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "dmWSDLComponentTypeRestricted")
@XmlEnum
public enum DmWSDLComponentTypeRestricted {

    @XmlEnumValue("service")
    SERVICE("service"),
    @XmlEnumValue("port")
    PORT("port"),
    @XmlEnumValue("fragmentid")
    FRAGMENTID("fragmentid");
    private final String value;

    DmWSDLComponentTypeRestricted(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DmWSDLComponentTypeRestricted fromValue(String v) {
        for (DmWSDLComponentTypeRestricted c: DmWSDLComponentTypeRestricted.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
