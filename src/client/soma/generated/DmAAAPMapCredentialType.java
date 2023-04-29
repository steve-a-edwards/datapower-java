
package client.soma.generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dmAAAPMapCredentialType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="dmAAAPMapCredentialType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="none"/>
 *     &lt;enumeration value="custom"/>
 *     &lt;enumeration value="xmlfile"/>
 *     &lt;enumeration value="xpath"/>
 *     &lt;enumeration value="ws-secureconversation"/>
 *     &lt;enumeration value="TFIM"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "dmAAAPMapCredentialType")
@XmlEnum
public enum DmAAAPMapCredentialType {

    @XmlEnumValue("none")
    NONE("none"),
    @XmlEnumValue("custom")
    CUSTOM("custom"),
    @XmlEnumValue("xmlfile")
    XMLFILE("xmlfile"),
    @XmlEnumValue("xpath")
    XPATH("xpath"),
    @XmlEnumValue("ws-secureconversation")
    WS_SECURECONVERSATION("ws-secureconversation"),
    TFIM("TFIM");
    private final String value;

    DmAAAPMapCredentialType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DmAAAPMapCredentialType fromValue(String v) {
        for (DmAAAPMapCredentialType c: DmAAAPMapCredentialType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
