
package client.soma.generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for export-all-classes.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="export-all-classes">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="all-classes"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "export-all-classes")
@XmlEnum
public enum ExportAllClasses {

    @XmlEnumValue("all-classes")
    ALL_CLASSES("all-classes");
    private final String value;

    ExportAllClasses(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ExportAllClasses fromValue(String v) {
        for (ExportAllClasses c: ExportAllClasses.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
