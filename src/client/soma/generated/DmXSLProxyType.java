
package client.soma.generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dmXSLProxyType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="dmXSLProxyType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="static-backend"/>
 *     &lt;enumeration value="loopback-proxy"/>
 *     &lt;enumeration value="strict-proxy"/>
 *     &lt;enumeration value="dynamic-backend"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "dmXSLProxyType")
@XmlEnum
public enum DmXSLProxyType {

    @XmlEnumValue("static-backend")
    STATIC_BACKEND("static-backend"),
    @XmlEnumValue("loopback-proxy")
    LOOPBACK_PROXY("loopback-proxy"),
    @XmlEnumValue("strict-proxy")
    STRICT_PROXY("strict-proxy"),
    @XmlEnumValue("dynamic-backend")
    DYNAMIC_BACKEND("dynamic-backend");
    private final String value;

    DmXSLProxyType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DmXSLProxyType fromValue(String v) {
        for (DmXSLProxyType c: DmXSLProxyType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
