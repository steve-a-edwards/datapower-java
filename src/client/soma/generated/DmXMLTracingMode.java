
package client.soma.generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dmXMLTracingMode.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="dmXMLTracingMode">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="off"/>
 *     &lt;enumeration value="always"/>
 *     &lt;enumeration value="errors"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "dmXMLTracingMode")
@XmlEnum
public enum DmXMLTracingMode {

    @XmlEnumValue("off")
    OFF("off"),
    @XmlEnumValue("always")
    ALWAYS("always"),
    @XmlEnumValue("errors")
    ERRORS("errors");
    private final String value;

    DmXMLTracingMode(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DmXMLTracingMode fromValue(String v) {
        for (DmXMLTracingMode c: DmXMLTracingMode.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
