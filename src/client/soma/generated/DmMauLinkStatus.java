
package client.soma.generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dmMauLinkStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="dmMauLinkStatus">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="other"/>
 *     &lt;enumeration value="unknown"/>
 *     &lt;enumeration value="available"/>
 *     &lt;enumeration value="notAvailable"/>
 *     &lt;enumeration value="remoteFault"/>
 *     &lt;enumeration value="offline"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "dmMauLinkStatus")
@XmlEnum
public enum DmMauLinkStatus {

    @XmlEnumValue("other")
    OTHER("other"),
    @XmlEnumValue("unknown")
    UNKNOWN("unknown"),
    @XmlEnumValue("available")
    AVAILABLE("available"),
    @XmlEnumValue("notAvailable")
    NOT_AVAILABLE("notAvailable"),
    @XmlEnumValue("remoteFault")
    REMOTE_FAULT("remoteFault"),
    @XmlEnumValue("offline")
    OFFLINE("offline");
    private final String value;

    DmMauLinkStatus(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DmMauLinkStatus fromValue(String v) {
        for (DmMauLinkStatus c: DmMauLinkStatus.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
