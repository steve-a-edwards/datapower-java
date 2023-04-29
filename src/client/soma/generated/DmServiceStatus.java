
package client.soma.generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dmServiceStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="dmServiceStatus">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="UDP-LISTEN"/>
 *     &lt;enumeration value="TCP-LISTEN"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "dmServiceStatus")
@XmlEnum
public enum DmServiceStatus {

    @XmlEnumValue("UDP-LISTEN")
    UDP_LISTEN("UDP-LISTEN"),
    @XmlEnumValue("TCP-LISTEN")
    TCP_LISTEN("TCP-LISTEN");
    private final String value;

    DmServiceStatus(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DmServiceStatus fromValue(String v) {
        for (DmServiceStatus c: DmServiceStatus.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
