
package client.soma.generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dmAttachmentMode.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="dmAttachmentMode">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="strip"/>
 *     &lt;enumeration value="reject"/>
 *     &lt;enumeration value="allow"/>
 *     &lt;enumeration value="streaming"/>
 *     &lt;enumeration value="unprocessed"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "dmAttachmentMode")
@XmlEnum
public enum DmAttachmentMode {

    @XmlEnumValue("strip")
    STRIP("strip"),
    @XmlEnumValue("reject")
    REJECT("reject"),
    @XmlEnumValue("allow")
    ALLOW("allow"),
    @XmlEnumValue("streaming")
    STREAMING("streaming"),
    @XmlEnumValue("unprocessed")
    UNPROCESSED("unprocessed");
    private final String value;

    DmAttachmentMode(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DmAttachmentMode fromValue(String v) {
        for (DmAttachmentMode c: DmAttachmentMode.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
