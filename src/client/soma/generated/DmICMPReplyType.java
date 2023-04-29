
package client.soma.generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dmICMPReplyType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="dmICMPReplyType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Echo-Reply"/>
 *     &lt;enumeration value="Timestamp-Reply"/>
 *     &lt;enumeration value="Info-Reply"/>
 *     &lt;enumeration value="Addressmask-Reply"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "dmICMPReplyType")
@XmlEnum
public enum DmICMPReplyType {

    @XmlEnumValue("Echo-Reply")
    ECHO_REPLY("Echo-Reply"),
    @XmlEnumValue("Timestamp-Reply")
    TIMESTAMP_REPLY("Timestamp-Reply"),
    @XmlEnumValue("Info-Reply")
    INFO_REPLY("Info-Reply"),
    @XmlEnumValue("Addressmask-Reply")
    ADDRESSMASK_REPLY("Addressmask-Reply");
    private final String value;

    DmICMPReplyType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DmICMPReplyType fromValue(String v) {
        for (DmICMPReplyType c: DmICMPReplyType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
