
package client.soma.generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dmTrustedHostKeyType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="dmTrustedHostKeyType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ssh-rsa"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "dmTrustedHostKeyType")
@XmlEnum
public enum DmTrustedHostKeyType {

    @XmlEnumValue("ssh-rsa")
    SSH_RSA("ssh-rsa");
    private final String value;

    DmTrustedHostKeyType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DmTrustedHostKeyType fromValue(String v) {
        for (DmTrustedHostKeyType c: DmTrustedHostKeyType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
