
package client.soma.generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dmReplayXPathType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="dmReplayXPathType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="WSSecPasswordDigestNonce"/>
 *     &lt;enumeration value="WSAddressingID"/>
 *     &lt;enumeration value="Custom"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "dmReplayXPathType")
@XmlEnum
public enum DmReplayXPathType {

    @XmlEnumValue("WSSecPasswordDigestNonce")
    WS_SEC_PASSWORD_DIGEST_NONCE("WSSecPasswordDigestNonce"),
    @XmlEnumValue("WSAddressingID")
    WS_ADDRESSING_ID("WSAddressingID"),
    @XmlEnumValue("Custom")
    CUSTOM("Custom");
    private final String value;

    DmReplayXPathType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DmReplayXPathType fromValue(String v) {
        for (DmReplayXPathType c: DmReplayXPathType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
