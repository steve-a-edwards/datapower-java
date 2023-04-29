
package client.soma.generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dmCryptoExportMechanism.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="dmCryptoExportMechanism">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="hsmkwk"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "dmCryptoExportMechanism")
@XmlEnum
public enum DmCryptoExportMechanism {

    @XmlEnumValue("hsmkwk")
    HSMKWK("hsmkwk");
    private final String value;

    DmCryptoExportMechanism(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DmCryptoExportMechanism fromValue(String v) {
        for (DmCryptoExportMechanism c: DmCryptoExportMechanism.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
