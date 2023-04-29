
package client.soma.generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dmSAMLAttributeSource.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="dmSAMLAttributeSource">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="var"/>
 *     &lt;enumeration value="xpath"/>
 *     &lt;enumeration value="static"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "dmSAMLAttributeSource")
@XmlEnum
public enum DmSAMLAttributeSource {

    @XmlEnumValue("var")
    VAR("var"),
    @XmlEnumValue("xpath")
    XPATH("xpath"),
    @XmlEnumValue("static")
    STATIC("static");
    private final String value;

    DmSAMLAttributeSource(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DmSAMLAttributeSource fromValue(String v) {
        for (DmSAMLAttributeSource c: DmSAMLAttributeSource.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
