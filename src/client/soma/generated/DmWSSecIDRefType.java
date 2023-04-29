
package client.soma.generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dmWSSecIDRefType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="dmWSSecIDRefType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="wsu:Id"/>
 *     &lt;enumeration value="xml:id"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "dmWSSecIDRefType")
@XmlEnum
public enum DmWSSecIDRefType {

    @XmlEnumValue("wsu:Id")
    WSU_ID("wsu:Id"),
    @XmlEnumValue("xml:id")
    XML_ID("xml:id");
    private final String value;

    DmWSSecIDRefType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DmWSSecIDRefType fromValue(String v) {
        for (DmWSSecIDRefType c: DmWSSecIDRefType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
