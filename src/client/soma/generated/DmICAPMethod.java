
package client.soma.generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dmICAPMethod.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="dmICAPMethod">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="any"/>
 *     &lt;enumeration value="OPTIONS"/>
 *     &lt;enumeration value="REQMOD"/>
 *     &lt;enumeration value="RESPMOD"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "dmICAPMethod")
@XmlEnum
public enum DmICAPMethod {

    @XmlEnumValue("any")
    ANY("any"),
    OPTIONS("OPTIONS"),
    REQMOD("REQMOD"),
    RESPMOD("RESPMOD");
    private final String value;

    DmICAPMethod(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DmICAPMethod fromValue(String v) {
        for (DmICAPMethod c: DmICAPMethod.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
