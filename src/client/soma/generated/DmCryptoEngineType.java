
package client.soma.generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dmCryptoEngineType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="dmCryptoEngineType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="standard"/>
 *     &lt;enumeration value="hardware1"/>
 *     &lt;enumeration value="hardware2"/>
 *     &lt;enumeration value="hsm1"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "dmCryptoEngineType")
@XmlEnum
public enum DmCryptoEngineType {

    @XmlEnumValue("standard")
    STANDARD("standard"),
    @XmlEnumValue("hardware1")
    HARDWARE_1("hardware1"),
    @XmlEnumValue("hardware2")
    HARDWARE_2("hardware2"),
    @XmlEnumValue("hsm1")
    HSM_1("hsm1");
    private final String value;

    DmCryptoEngineType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DmCryptoEngineType fromValue(String v) {
        for (DmCryptoEngineType c: DmCryptoEngineType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
