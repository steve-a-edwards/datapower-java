
package client.soma.generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dmMatchType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="dmMatchType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="url"/>
 *     &lt;enumeration value="http"/>
 *     &lt;enumeration value="errorcode"/>
 *     &lt;enumeration value="xpath"/>
 *     &lt;enumeration value="fullyqualifiedurl"/>
 *     &lt;enumeration value="host"/>
 *     &lt;enumeration value="method"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "dmMatchType")
@XmlEnum
public enum DmMatchType {

    @XmlEnumValue("url")
    URL("url"),
    @XmlEnumValue("http")
    HTTP("http"),
    @XmlEnumValue("errorcode")
    ERRORCODE("errorcode"),
    @XmlEnumValue("xpath")
    XPATH("xpath"),
    @XmlEnumValue("fullyqualifiedurl")
    FULLYQUALIFIEDURL("fullyqualifiedurl"),
    @XmlEnumValue("host")
    HOST("host"),
    @XmlEnumValue("method")
    METHOD("method");
    private final String value;

    DmMatchType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DmMatchType fromValue(String v) {
        for (DmMatchType c: DmMatchType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
