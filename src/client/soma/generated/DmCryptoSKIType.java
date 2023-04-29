
package client.soma.generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dmCryptoSKIType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="dmCryptoSKIType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="pkix"/>
 *     &lt;enumeration value="ms-wse-1"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "dmCryptoSKIType")
@XmlEnum
public enum DmCryptoSKIType {

    @XmlEnumValue("pkix")
    PKIX("pkix"),
    @XmlEnumValue("ms-wse-1")
    MS_WSE_1("ms-wse-1");
    private final String value;

    DmCryptoSKIType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DmCryptoSKIType fromValue(String v) {
        for (DmCryptoSKIType c: DmCryptoSKIType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
