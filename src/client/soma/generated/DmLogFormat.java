
package client.soma.generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dmLogFormat.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="dmLogFormat">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="text"/>
 *     &lt;enumeration value="raw"/>
 *     &lt;enumeration value="xml"/>
 *     &lt;enumeration value="cbe"/>
 *     &lt;enumeration value="csv"/>
 *     &lt;enumeration value="audit"/>
 *     &lt;enumeration value="diag"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "dmLogFormat")
@XmlEnum
public enum DmLogFormat {

    @XmlEnumValue("text")
    TEXT("text"),
    @XmlEnumValue("raw")
    RAW("raw"),
    @XmlEnumValue("xml")
    XML("xml"),
    @XmlEnumValue("cbe")
    CBE("cbe"),
    @XmlEnumValue("csv")
    CSV("csv"),
    @XmlEnumValue("audit")
    AUDIT("audit"),
    @XmlEnumValue("diag")
    DIAG("diag");
    private final String value;

    DmLogFormat(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DmLogFormat fromValue(String v) {
        for (DmLogFormat c: DmLogFormat.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
