
package client.soma.generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dmSSLProxyDirection.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="dmSSLProxyDirection">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="forward"/>
 *     &lt;enumeration value="reverse"/>
 *     &lt;enumeration value="two-way"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "dmSSLProxyDirection")
@XmlEnum
public enum DmSSLProxyDirection {

    @XmlEnumValue("forward")
    FORWARD("forward"),
    @XmlEnumValue("reverse")
    REVERSE("reverse"),
    @XmlEnumValue("two-way")
    TWO_WAY("two-way");
    private final String value;

    DmSSLProxyDirection(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DmSSLProxyDirection fromValue(String v) {
        for (DmSSLProxyDirection c: DmSSLProxyDirection.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
