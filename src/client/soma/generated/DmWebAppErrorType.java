
package client.soma.generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dmWebAppErrorType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="dmWebAppErrorType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="standard"/>
 *     &lt;enumeration value="redirect"/>
 *     &lt;enumeration value="proxy"/>
 *     &lt;enumeration value="error-rule"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "dmWebAppErrorType")
@XmlEnum
public enum DmWebAppErrorType {

    @XmlEnumValue("standard")
    STANDARD("standard"),
    @XmlEnumValue("redirect")
    REDIRECT("redirect"),
    @XmlEnumValue("proxy")
    PROXY("proxy"),
    @XmlEnumValue("error-rule")
    ERROR_RULE("error-rule");
    private final String value;

    DmWebAppErrorType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DmWebAppErrorType fromValue(String v) {
        for (DmWebAppErrorType c: DmWebAppErrorType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
