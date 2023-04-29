
package client.soma.generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dmHTTPInputEncoding.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="dmHTTPInputEncoding">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="plain"/>
 *     &lt;enumeration value="urlencoded"/>
 *     &lt;enumeration value="xml"/>
 *     &lt;enumeration value="urlencoded-xml"/>
 *     &lt;enumeration value="base64"/>
 *     &lt;enumeration value="base64-text"/>
 *     &lt;enumeration value="base64-xml"/>
 *     &lt;enumeration value="json"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "dmHTTPInputEncoding")
@XmlEnum
public enum DmHTTPInputEncoding {

    @XmlEnumValue("plain")
    PLAIN("plain"),
    @XmlEnumValue("urlencoded")
    URLENCODED("urlencoded"),
    @XmlEnumValue("xml")
    XML("xml"),
    @XmlEnumValue("urlencoded-xml")
    URLENCODED_XML("urlencoded-xml"),
    @XmlEnumValue("base64")
    BASE_64("base64"),
    @XmlEnumValue("base64-text")
    BASE_64_TEXT("base64-text"),
    @XmlEnumValue("base64-xml")
    BASE_64_XML("base64-xml"),
    @XmlEnumValue("json")
    JSON("json");
    private final String value;

    DmHTTPInputEncoding(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DmHTTPInputEncoding fromValue(String v) {
        for (DmHTTPInputEncoding c: DmHTTPInputEncoding.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
