
package client.soma.generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dmHTTPMethod.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="dmHTTPMethod">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="any"/>
 *     &lt;enumeration value="OPTIONS"/>
 *     &lt;enumeration value="GET"/>
 *     &lt;enumeration value="HEAD"/>
 *     &lt;enumeration value="POST"/>
 *     &lt;enumeration value="PUT"/>
 *     &lt;enumeration value="DELETE"/>
 *     &lt;enumeration value="TRACE"/>
 *     &lt;enumeration value="CONNECT"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "dmHTTPMethod")
@XmlEnum
public enum DmHTTPMethod {

    @XmlEnumValue("any")
    ANY("any"),
    OPTIONS("OPTIONS"),
    GET("GET"),
    HEAD("HEAD"),
    POST("POST"),
    PUT("PUT"),
    DELETE("DELETE"),
    TRACE("TRACE"),
    CONNECT("CONNECT");
    private final String value;

    DmHTTPMethod(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DmHTTPMethod fromValue(String v) {
        for (DmHTTPMethod c: DmHTTPMethod.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
