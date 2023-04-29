
package client.soma.generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dmMtomMode.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="dmMtomMode">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="encode"/>
 *     &lt;enumeration value="decode"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "dmMtomMode")
@XmlEnum
public enum DmMtomMode {

    @XmlEnumValue("encode")
    ENCODE("encode"),
    @XmlEnumValue("decode")
    DECODE("decode");
    private final String value;

    DmMtomMode(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DmMtomMode fromValue(String v) {
        for (DmMtomMode c: DmMtomMode.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
