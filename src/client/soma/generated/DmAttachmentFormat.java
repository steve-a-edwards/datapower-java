
package client.soma.generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dmAttachmentFormat.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="dmAttachmentFormat">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="dynamic"/>
 *     &lt;enumeration value="mime"/>
 *     &lt;enumeration value="dime"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "dmAttachmentFormat")
@XmlEnum
public enum DmAttachmentFormat {

    @XmlEnumValue("dynamic")
    DYNAMIC("dynamic"),
    @XmlEnumValue("mime")
    MIME("mime"),
    @XmlEnumValue("dime")
    DIME("dime");
    private final String value;

    DmAttachmentFormat(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DmAttachmentFormat fromValue(String v) {
        for (DmAttachmentFormat c: DmAttachmentFormat.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
