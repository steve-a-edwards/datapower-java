
package client.soma.generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dmSnmpAuthProtocol.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="dmSnmpAuthProtocol">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="none"/>
 *     &lt;enumeration value="md5"/>
 *     &lt;enumeration value="sha"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "dmSnmpAuthProtocol")
@XmlEnum
public enum DmSnmpAuthProtocol {

    @XmlEnumValue("none")
    NONE("none"),
    @XmlEnumValue("md5")
    MD_5("md5"),
    @XmlEnumValue("sha")
    SHA("sha");
    private final String value;

    DmSnmpAuthProtocol(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DmSnmpAuthProtocol fromValue(String v) {
        for (DmSnmpAuthProtocol c: DmSnmpAuthProtocol.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
