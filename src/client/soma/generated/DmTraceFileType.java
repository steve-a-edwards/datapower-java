
package client.soma.generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dmTraceFileType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="dmTraceFileType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="textfile"/>
 *     &lt;enumeration value="utf8file"/>
 *     &lt;enumeration value="xmlfile"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "dmTraceFileType")
@XmlEnum
public enum DmTraceFileType {

    @XmlEnumValue("textfile")
    TEXTFILE("textfile"),
    @XmlEnumValue("utf8file")
    UTF_8_FILE("utf8file"),
    @XmlEnumValue("xmlfile")
    XMLFILE("xmlfile");
    private final String value;

    DmTraceFileType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DmTraceFileType fromValue(String v) {
        for (DmTraceFileType c: DmTraceFileType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
