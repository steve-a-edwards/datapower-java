
package client.soma.generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dmInterfaceType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="dmInterfaceType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Ethernet"/>
 *     &lt;enumeration value="Tunnel"/>
 *     &lt;enumeration value="VLAN"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "dmInterfaceType")
@XmlEnum
public enum DmInterfaceType {

    @XmlEnumValue("Ethernet")
    ETHERNET("Ethernet"),
    @XmlEnumValue("Tunnel")
    TUNNEL("Tunnel"),
    VLAN("VLAN");
    private final String value;

    DmInterfaceType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DmInterfaceType fromValue(String v) {
        for (DmInterfaceType c: DmInterfaceType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
