
package client.soma.generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dmActionOutputType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="dmActionOutputType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="default"/>
 *     &lt;enumeration value="binary"/>
 *     &lt;enumeration value="xml"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "dmActionOutputType")
@XmlEnum
public enum DmActionOutputType {

    @XmlEnumValue("default")
    DEFAULT("default"),
    @XmlEnumValue("binary")
    BINARY("binary"),
    @XmlEnumValue("xml")
    XML("xml");
    private final String value;

    DmActionOutputType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DmActionOutputType fromValue(String v) {
        for (DmActionOutputType c: DmActionOutputType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
