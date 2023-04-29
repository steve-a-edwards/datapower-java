
package client.soma.generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dmLDAPSearchScope.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="dmLDAPSearchScope">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="subtree"/>
 *     &lt;enumeration value="one-level"/>
 *     &lt;enumeration value="base"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "dmLDAPSearchScope")
@XmlEnum
public enum DmLDAPSearchScope {

    @XmlEnumValue("subtree")
    SUBTREE("subtree"),
    @XmlEnumValue("one-level")
    ONE_LEVEL("one-level"),
    @XmlEnumValue("base")
    BASE("base");
    private final String value;

    DmLDAPSearchScope(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DmLDAPSearchScope fromValue(String v) {
        for (DmLDAPSearchScope c: DmLDAPSearchScope.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
