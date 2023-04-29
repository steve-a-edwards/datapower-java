
package client.soma.generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dmWSSCKeyDerivationType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="dmWSSCKeyDerivationType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="sct-available"/>
 *     &lt;enumeration value="dkt"/>
 *     &lt;enumeration value="encryptedkey"/>
 *     &lt;enumeration value="no"/>
 *     &lt;enumeration value="kerberos"/>
 *     &lt;enumeration value="eks"/>
 *     &lt;enumeration value="saml-symmetric-hok"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "dmWSSCKeyDerivationType")
@XmlEnum
public enum DmWSSCKeyDerivationType {

    @XmlEnumValue("sct-available")
    SCT_AVAILABLE("sct-available"),
    @XmlEnumValue("dkt")
    DKT("dkt"),
    @XmlEnumValue("encryptedkey")
    ENCRYPTEDKEY("encryptedkey"),
    @XmlEnumValue("no")
    NO("no"),
    @XmlEnumValue("kerberos")
    KERBEROS("kerberos"),
    @XmlEnumValue("eks")
    EKS("eks"),
    @XmlEnumValue("saml-symmetric-hok")
    SAML_SYMMETRIC_HOK("saml-symmetric-hok");
    private final String value;

    DmWSSCKeyDerivationType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DmWSSCKeyDerivationType fromValue(String v) {
        for (DmWSSCKeyDerivationType c: DmWSSCKeyDerivationType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
