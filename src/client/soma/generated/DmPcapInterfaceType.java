
package client.soma.generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dmPcapInterfaceType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="dmPcapInterfaceType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Ethernet"/>
 *     &lt;enumeration value="VLAN"/>
 *     &lt;enumeration value="Loopback"/>
 *     &lt;enumeration value="All"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "dmPcapInterfaceType")
@XmlEnum
public enum DmPcapInterfaceType {

    @XmlEnumValue("Ethernet")
    ETHERNET("Ethernet"),
    VLAN("VLAN"),
    @XmlEnumValue("Loopback")
    LOOPBACK("Loopback"),
    @XmlEnumValue("All")
    ALL("All");
    private final String value;

    DmPcapInterfaceType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DmPcapInterfaceType fromValue(String v) {
        for (DmPcapInterfaceType c: DmPcapInterfaceType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
