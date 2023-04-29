
package client.soma.generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dmEncodingScheme.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="dmEncodingScheme">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="NotSet"/>
 *     &lt;enumeration value="Default"/>
 *     &lt;enumeration value="UTF8"/>
 *     &lt;enumeration value="UCS2"/>
 *     &lt;enumeration value="UTF16"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "dmEncodingScheme")
@XmlEnum
public enum DmEncodingScheme {

    @XmlEnumValue("NotSet")
    NOT_SET("NotSet"),
    @XmlEnumValue("Default")
    DEFAULT("Default"),
    @XmlEnumValue("UTF8")
    UTF_8("UTF8"),
    @XmlEnumValue("UCS2")
    UCS_2("UCS2"),
    @XmlEnumValue("UTF16")
    UTF_16("UTF16");
    private final String value;

    DmEncodingScheme(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DmEncodingScheme fromValue(String v) {
        for (DmEncodingScheme c: DmEncodingScheme.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
