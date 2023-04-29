
package client.soma.generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dmSnmpSecretType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="dmSnmpSecretType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="password"/>
 *     &lt;enumeration value="key"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "dmSnmpSecretType")
@XmlEnum
public enum DmSnmpSecretType {

    @XmlEnumValue("password")
    PASSWORD("password"),
    @XmlEnumValue("key")
    KEY("key");
    private final String value;

    DmSnmpSecretType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DmSnmpSecretType fromValue(String v) {
        for (DmSnmpSecretType c: DmSnmpSecretType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
