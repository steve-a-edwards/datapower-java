
package client.soma.generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dmCryptoSwATransform.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="dmCryptoSwATransform">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="MIMEContentOnly"/>
 *     &lt;enumeration value="MIMEContentAndHeader"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "dmCryptoSwATransform")
@XmlEnum
public enum DmCryptoSwATransform {

    @XmlEnumValue("MIMEContentOnly")
    MIME_CONTENT_ONLY("MIMEContentOnly"),
    @XmlEnumValue("MIMEContentAndHeader")
    MIME_CONTENT_AND_HEADER("MIMEContentAndHeader");
    private final String value;

    DmCryptoSwATransform(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DmCryptoSwATransform fromValue(String v) {
        for (DmCryptoSwATransform c: DmCryptoSwATransform.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
