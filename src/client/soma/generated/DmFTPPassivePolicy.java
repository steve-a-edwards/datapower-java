
package client.soma.generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dmFTPPassivePolicy.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="dmFTPPassivePolicy">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="pasv-off"/>
 *     &lt;enumeration value="pasv-opt"/>
 *     &lt;enumeration value="pasv-req"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "dmFTPPassivePolicy")
@XmlEnum
public enum DmFTPPassivePolicy {

    @XmlEnumValue("pasv-off")
    PASV_OFF("pasv-off"),
    @XmlEnumValue("pasv-opt")
    PASV_OPT("pasv-opt"),
    @XmlEnumValue("pasv-req")
    PASV_REQ("pasv-req");
    private final String value;

    DmFTPPassivePolicy(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DmFTPPassivePolicy fromValue(String v) {
        for (DmFTPPassivePolicy c: DmFTPPassivePolicy.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
