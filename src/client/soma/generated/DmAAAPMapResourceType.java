
package client.soma.generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dmAAAPMapResourceType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="dmAAAPMapResourceType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="none"/>
 *     &lt;enumeration value="custom"/>
 *     &lt;enumeration value="xmlfile"/>
 *     &lt;enumeration value="xpath"/>
 *     &lt;enumeration value="tivoli"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "dmAAAPMapResourceType")
@XmlEnum
public enum DmAAAPMapResourceType {

    @XmlEnumValue("none")
    NONE("none"),
    @XmlEnumValue("custom")
    CUSTOM("custom"),
    @XmlEnumValue("xmlfile")
    XMLFILE("xmlfile"),
    @XmlEnumValue("xpath")
    XPATH("xpath"),
    @XmlEnumValue("tivoli")
    TIVOLI("tivoli");
    private final String value;

    DmAAAPMapResourceType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DmAAAPMapResourceType fromValue(String v) {
        for (DmAAAPMapResourceType c: DmAAAPMapResourceType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
