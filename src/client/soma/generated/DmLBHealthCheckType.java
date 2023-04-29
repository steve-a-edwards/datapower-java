
package client.soma.generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dmLBHealthCheckType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="dmLBHealthCheckType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Standard"/>
 *     &lt;enumeration value="LDAP"/>
 *     &lt;enumeration value="IMSConnect"/>
 *     &lt;enumeration value="on"/>
 *     &lt;enumeration value="off"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "dmLBHealthCheckType")
@XmlEnum
public enum DmLBHealthCheckType {

    @XmlEnumValue("Standard")
    STANDARD("Standard"),
    LDAP("LDAP"),
    @XmlEnumValue("IMSConnect")
    IMS_CONNECT("IMSConnect"),
    @XmlEnumValue("on")
    ON("on"),
    @XmlEnumValue("off")
    OFF("off");
    private final String value;

    DmLBHealthCheckType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DmLBHealthCheckType fromValue(String v) {
        for (DmLBHealthCheckType c: DmLBHealthCheckType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
