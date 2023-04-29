
package client.soma.generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dmWSUsernameTokenPasswordType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="dmWSUsernameTokenPasswordType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Text"/>
 *     &lt;enumeration value="Digest"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "dmWSUsernameTokenPasswordType")
@XmlEnum
public enum DmWSUsernameTokenPasswordType {

    @XmlEnumValue("Text")
    TEXT("Text"),
    @XmlEnumValue("Digest")
    DIGEST("Digest");
    private final String value;

    DmWSUsernameTokenPasswordType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DmWSUsernameTokenPasswordType fromValue(String v) {
        for (DmWSUsernameTokenPasswordType c: DmWSUsernameTokenPasswordType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
