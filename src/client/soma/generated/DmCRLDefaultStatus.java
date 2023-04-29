
package client.soma.generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dmCRLDefaultStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="dmCRLDefaultStatus">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ok"/>
 *     &lt;enumeration value="revoked"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "dmCRLDefaultStatus")
@XmlEnum
public enum DmCRLDefaultStatus {

    @XmlEnumValue("ok")
    OK("ok"),
    @XmlEnumValue("revoked")
    REVOKED("revoked");
    private final String value;

    DmCRLDefaultStatus(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DmCRLDefaultStatus fromValue(String v) {
        for (DmCRLDefaultStatus c: DmCRLDefaultStatus.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
