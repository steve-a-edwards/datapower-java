
package client.soma.generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dmUserConnection.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="dmUserConnection">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="serial-port"/>
 *     &lt;enumeration value="telnet"/>
 *     &lt;enumeration value="secure-shell"/>
 *     &lt;enumeration value="web-gui"/>
 *     &lt;enumeration value="saml-artifact"/>
 *     &lt;enumeration value="system"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "dmUserConnection")
@XmlEnum
public enum DmUserConnection {

    @XmlEnumValue("serial-port")
    SERIAL_PORT("serial-port"),
    @XmlEnumValue("telnet")
    TELNET("telnet"),
    @XmlEnumValue("secure-shell")
    SECURE_SHELL("secure-shell"),
    @XmlEnumValue("web-gui")
    WEB_GUI("web-gui"),
    @XmlEnumValue("saml-artifact")
    SAML_ARTIFACT("saml-artifact"),
    @XmlEnumValue("system")
    SYSTEM("system");
    private final String value;

    DmUserConnection(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DmUserConnection fromValue(String v) {
        for (DmUserConnection c: DmUserConnection.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
