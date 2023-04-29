
package client.soma.generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dmLogFileArchiveMode.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="dmLogFileArchiveMode">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="rotate"/>
 *     &lt;enumeration value="upload"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "dmLogFileArchiveMode")
@XmlEnum
public enum DmLogFileArchiveMode {

    @XmlEnumValue("rotate")
    ROTATE("rotate"),
    @XmlEnumValue("upload")
    UPLOAD("upload");
    private final String value;

    DmLogFileArchiveMode(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DmLogFileArchiveMode fromValue(String v) {
        for (DmLogFileArchiveMode c: DmLogFileArchiveMode.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
