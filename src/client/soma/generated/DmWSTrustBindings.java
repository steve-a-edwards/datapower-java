
package client.soma.generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dmWSTrustBindings.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="dmWSTrustBindings">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="CancelBinding"/>
 *     &lt;enumeration value="AmendBinding"/>
 *     &lt;enumeration value="RenewalBinding"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "dmWSTrustBindings")
@XmlEnum
public enum DmWSTrustBindings {

    @XmlEnumValue("CancelBinding")
    CANCEL_BINDING("CancelBinding"),
    @XmlEnumValue("AmendBinding")
    AMEND_BINDING("AmendBinding"),
    @XmlEnumValue("RenewalBinding")
    RENEWAL_BINDING("RenewalBinding");
    private final String value;

    DmWSTrustBindings(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DmWSTrustBindings fromValue(String v) {
        for (DmWSTrustBindings c: DmWSTrustBindings.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
