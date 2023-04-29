
package client.soma.generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dmDsigVerifyType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="dmDsigVerifyType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="verify-all"/>
 *     &lt;enumeration value="symmetric"/>
 *     &lt;enumeration value="asymmetric"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "dmDsigVerifyType")
@XmlEnum
public enum DmDsigVerifyType {

    @XmlEnumValue("verify-all")
    VERIFY_ALL("verify-all"),
    @XmlEnumValue("symmetric")
    SYMMETRIC("symmetric"),
    @XmlEnumValue("asymmetric")
    ASYMMETRIC("asymmetric");
    private final String value;

    DmDsigVerifyType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DmDsigVerifyType fromValue(String v) {
        for (DmDsigVerifyType c: DmDsigVerifyType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
