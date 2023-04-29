
package client.soma.generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dmProxyType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="dmProxyType">
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
@XmlType(name = "dmProxyType")
@XmlEnum
public enum DmProxyType {

    @XmlEnumValue("static-backend")
    STATIC_BACKEND("static-backend"),
    @XmlEnumValue("loopback-proxy")
    LOOPBACK_PROXY("loopback-proxy"),
    @XmlEnumValue("strict-proxy")
    STRICT_PROXY("strict-proxy"),
    @XmlEnumValue("dynamic-backend")
    DYNAMIC_BACKEND("dynamic-backend");
    private final String value;

    DmProxyType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DmProxyType fromValue(String v) {
        for (DmProxyType c: DmProxyType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
