
package client.soma.generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dmNFSTransportType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="dmNFSTransportType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="tcp"/>
 *     &lt;enumeration value="udp"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "dmNFSTransportType")
@XmlEnum
public enum DmNFSTransportType {

    @XmlEnumValue("tcp")
    TCP("tcp"),
    @XmlEnumValue("udp")
    UDP("udp");
    private final String value;

    DmNFSTransportType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DmNFSTransportType fromValue(String v) {
        for (DmNFSTransportType c: DmNFSTransportType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
