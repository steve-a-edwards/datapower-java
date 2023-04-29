
package client.soma.generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dmLogTimestampFormat.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="dmLogTimestampFormat">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="syslog"/>
 *     &lt;enumeration value="numeric"/>
 *     &lt;enumeration value="zulu"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "dmLogTimestampFormat")
@XmlEnum
public enum DmLogTimestampFormat {

    @XmlEnumValue("syslog")
    SYSLOG("syslog"),
    @XmlEnumValue("numeric")
    NUMERIC("numeric"),
    @XmlEnumValue("zulu")
    ZULU("zulu");
    private final String value;

    DmLogTimestampFormat(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DmLogTimestampFormat fromValue(String v) {
        for (DmLogTimestampFormat c: DmLogTimestampFormat.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
