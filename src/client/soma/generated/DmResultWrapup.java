
package client.soma.generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dmResultWrapup.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="dmResultWrapup">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="wssec-replace"/>
 *     &lt;enumeration value="wssec-new"/>
 *     &lt;enumeration value="wssec-inject"/>
 *     &lt;enumeration value="soap-body"/>
 *     &lt;enumeration value="none"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "dmResultWrapup")
@XmlEnum
public enum DmResultWrapup {

    @XmlEnumValue("wssec-replace")
    WSSEC_REPLACE("wssec-replace"),
    @XmlEnumValue("wssec-new")
    WSSEC_NEW("wssec-new"),
    @XmlEnumValue("wssec-inject")
    WSSEC_INJECT("wssec-inject"),
    @XmlEnumValue("soap-body")
    SOAP_BODY("soap-body"),
    @XmlEnumValue("none")
    NONE("none");
    private final String value;

    DmResultWrapup(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DmResultWrapup fromValue(String v) {
        for (DmResultWrapup c: DmResultWrapup.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
