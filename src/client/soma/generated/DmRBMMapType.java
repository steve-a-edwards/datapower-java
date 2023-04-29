
package client.soma.generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dmRBMMapType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="dmRBMMapType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="local"/>
 *     &lt;enumeration value="xmlfile"/>
 *     &lt;enumeration value="custom"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "dmRBMMapType")
@XmlEnum
public enum DmRBMMapType {

    @XmlEnumValue("local")
    LOCAL("local"),
    @XmlEnumValue("xmlfile")
    XMLFILE("xmlfile"),
    @XmlEnumValue("custom")
    CUSTOM("custom");
    private final String value;

    DmRBMMapType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DmRBMMapType fromValue(String v) {
        for (DmRBMMapType c: DmRBMMapType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
