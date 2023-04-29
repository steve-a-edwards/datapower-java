
package client.soma.generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dmUDDIUseSSL.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="dmUDDIUseSSL">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Always"/>
 *     &lt;enumeration value="Publish"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "dmUDDIUseSSL")
@XmlEnum
public enum DmUDDIUseSSL {

    @XmlEnumValue("Always")
    ALWAYS("Always"),
    @XmlEnumValue("Publish")
    PUBLISH("Publish");
    private final String value;

    DmUDDIUseSSL(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DmUDDIUseSSL fromValue(String v) {
        for (DmUDDIUseSSL c: DmUDDIUseSSL.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
