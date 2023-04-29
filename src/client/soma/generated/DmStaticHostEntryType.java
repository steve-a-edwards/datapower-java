
package client.soma.generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dmStaticHostEntryType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="dmStaticHostEntryType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="static"/>
 *     &lt;enumeration value="alias"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "dmStaticHostEntryType")
@XmlEnum
public enum DmStaticHostEntryType {

    @XmlEnumValue("static")
    STATIC("static"),
    @XmlEnumValue("alias")
    ALIAS("alias");
    private final String value;

    DmStaticHostEntryType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DmStaticHostEntryType fromValue(String v) {
        for (DmStaticHostEntryType c: DmStaticHostEntryType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
