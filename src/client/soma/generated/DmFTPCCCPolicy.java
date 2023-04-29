
package client.soma.generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dmFTPCCCPolicy.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="dmFTPCCCPolicy">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ccc-off"/>
 *     &lt;enumeration value="ccc-opt"/>
 *     &lt;enumeration value="ccc-req"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "dmFTPCCCPolicy")
@XmlEnum
public enum DmFTPCCCPolicy {

    @XmlEnumValue("ccc-off")
    CCC_OFF("ccc-off"),
    @XmlEnumValue("ccc-opt")
    CCC_OPT("ccc-opt"),
    @XmlEnumValue("ccc-req")
    CCC_REQ("ccc-req");
    private final String value;

    DmFTPCCCPolicy(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DmFTPCCCPolicy fromValue(String v) {
        for (DmFTPCCCPolicy c: DmFTPCCCPolicy.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
