
package client.soma.generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dmRouteProto.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="dmRouteProto">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="other"/>
 *     &lt;enumeration value="local"/>
 *     &lt;enumeration value="netmgmt"/>
 *     &lt;enumeration value="icmp"/>
 *     &lt;enumeration value="ipv6nd"/>
 *     &lt;enumeration value="ipv6ra"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "dmRouteProto")
@XmlEnum
public enum DmRouteProto {

    @XmlEnumValue("other")
    OTHER("other"),
    @XmlEnumValue("local")
    LOCAL("local"),
    @XmlEnumValue("netmgmt")
    NETMGMT("netmgmt"),
    @XmlEnumValue("icmp")
    ICMP("icmp"),
    @XmlEnumValue("ipv6nd")
    IPV_6_ND("ipv6nd"),
    @XmlEnumValue("ipv6ra")
    IPV_6_RA("ipv6ra");
    private final String value;

    DmRouteProto(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DmRouteProto fromValue(String v) {
        for (DmRouteProto c: DmRouteProto.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
