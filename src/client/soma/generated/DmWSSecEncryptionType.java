
package client.soma.generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dmWSSecEncryptionType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="dmWSSecEncryptionType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="message"/>
 *     &lt;enumeration value="attachments"/>
 *     &lt;enumeration value="message-attachments"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "dmWSSecEncryptionType")
@XmlEnum
public enum DmWSSecEncryptionType {

    @XmlEnumValue("message")
    MESSAGE("message"),
    @XmlEnumValue("attachments")
    ATTACHMENTS("attachments"),
    @XmlEnumValue("message-attachments")
    MESSAGE_ATTACHMENTS("message-attachments");
    private final String value;

    DmWSSecEncryptionType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DmWSSecEncryptionType fromValue(String v) {
        for (DmWSSecEncryptionType c: DmWSSecEncryptionType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
