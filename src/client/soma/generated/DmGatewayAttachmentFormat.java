
package client.soma.generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dmGatewayAttachmentFormat.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="dmGatewayAttachmentFormat">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="dynamic"/>
 *     &lt;enumeration value="mime"/>
 *     &lt;enumeration value="dime"/>
 *     &lt;enumeration value="detect"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "dmGatewayAttachmentFormat")
@XmlEnum
public enum DmGatewayAttachmentFormat {

    @XmlEnumValue("dynamic")
    DYNAMIC("dynamic"),
    @XmlEnumValue("mime")
    MIME("mime"),
    @XmlEnumValue("dime")
    DIME("dime"),
    @XmlEnumValue("detect")
    DETECT("detect");
    private final String value;

    DmGatewayAttachmentFormat(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DmGatewayAttachmentFormat fromValue(String v) {
        for (DmGatewayAttachmentFormat c: DmGatewayAttachmentFormat.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
