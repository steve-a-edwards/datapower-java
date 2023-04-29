
package client.soma.generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for export-all-objects.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="export-all-objects">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="all-objects"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "export-all-objects")
@XmlEnum
public enum ExportAllObjects {

    @XmlEnumValue("all-objects")
    ALL_OBJECTS("all-objects");
    private final String value;

    ExportAllObjects(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ExportAllObjects fromValue(String v) {
        for (ExportAllObjects c: ExportAllObjects.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
