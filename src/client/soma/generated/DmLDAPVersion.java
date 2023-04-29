
package client.soma.generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dmLDAPVersion.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="dmLDAPVersion">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="v2"/>
 *     &lt;enumeration value="v3"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "dmLDAPVersion")
@XmlEnum
public enum DmLDAPVersion {

    @XmlEnumValue("v2")
    V_2("v2"),
    @XmlEnumValue("v3")
    V_3("v3");
    private final String value;

    DmLDAPVersion(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DmLDAPVersion fromValue(String v) {
        for (DmLDAPVersion c: DmLDAPVersion.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
