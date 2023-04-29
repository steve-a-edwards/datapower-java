
package client.soma.generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dmInteropWithVendor.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="dmInteropWithVendor">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="standard"/>
 *     &lt;enumeration value="was"/>
 *     &lt;enumeration value="bea10"/>
 *     &lt;enumeration value="microsoft"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "dmInteropWithVendor")
@XmlEnum
public enum DmInteropWithVendor {

    @XmlEnumValue("standard")
    STANDARD("standard"),
    @XmlEnumValue("was")
    WAS("was"),
    @XmlEnumValue("bea10")
    BEA_10("bea10"),
    @XmlEnumValue("microsoft")
    MICROSOFT("microsoft");
    private final String value;

    DmInteropWithVendor(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DmInteropWithVendor fromValue(String v) {
        for (DmInteropWithVendor c: DmInteropWithVendor.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
