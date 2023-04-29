
package client.soma.generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dmHTTPVersion.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="dmHTTPVersion">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="HTTP/1.0"/>
 *     &lt;enumeration value="HTTP/1.1"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "dmHTTPVersion")
@XmlEnum
public enum DmHTTPVersion {

    @XmlEnumValue("HTTP/1.0")
    HTTP_1_0("HTTP/1.0"),
    @XmlEnumValue("HTTP/1.1")
    HTTP_1_1("HTTP/1.1");
    private final String value;

    DmHTTPVersion(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DmHTTPVersion fromValue(String v) {
        for (DmHTTPVersion c: DmHTTPVersion.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
