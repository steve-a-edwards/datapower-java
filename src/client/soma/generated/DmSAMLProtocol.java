
package client.soma.generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dmSAMLProtocol.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="dmSAMLProtocol">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="assertion"/>
 *     &lt;enumeration value="response"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "dmSAMLProtocol")
@XmlEnum
public enum DmSAMLProtocol {

    @XmlEnumValue("assertion")
    ASSERTION("assertion"),
    @XmlEnumValue("response")
    RESPONSE("response");
    private final String value;

    DmSAMLProtocol(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DmSAMLProtocol fromValue(String v) {
        for (DmSAMLProtocol c: DmSAMLProtocol.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
