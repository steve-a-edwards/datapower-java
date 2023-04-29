
package client.soma.generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dmCRLFetchType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="dmCRLFetchType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="http"/>
 *     &lt;enumeration value="ldap"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "dmCRLFetchType")
@XmlEnum
public enum DmCRLFetchType {

    @XmlEnumValue("http")
    HTTP("http"),
    @XmlEnumValue("ldap")
    LDAP("ldap");
    private final String value;

    DmCRLFetchType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DmCRLFetchType fromValue(String v) {
        for (DmCRLFetchType c: DmCRLFetchType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
