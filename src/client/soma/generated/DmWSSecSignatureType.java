
package client.soma.generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dmWSSecSignatureType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="dmWSSecSignatureType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="message-attachments"/>
 *     &lt;enumeration value="attachments"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "dmWSSecSignatureType")
@XmlEnum
public enum DmWSSecSignatureType {

    @XmlEnumValue("message-attachments")
    MESSAGE_ATTACHMENTS("message-attachments"),
    @XmlEnumValue("attachments")
    ATTACHMENTS("attachments");
    private final String value;

    DmWSSecSignatureType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DmWSSecSignatureType fromValue(String v) {
        for (DmWSSecSignatureType c: DmWSSecSignatureType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
