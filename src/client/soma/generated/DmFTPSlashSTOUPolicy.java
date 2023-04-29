
package client.soma.generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dmFTPSlashSTOUPolicy.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="dmFTPSlashSTOUPolicy">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="slash-stou-off"/>
 *     &lt;enumeration value="slash-stou-on"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "dmFTPSlashSTOUPolicy")
@XmlEnum
public enum DmFTPSlashSTOUPolicy {

    @XmlEnumValue("slash-stou-off")
    SLASH_STOU_OFF("slash-stou-off"),
    @XmlEnumValue("slash-stou-on")
    SLASH_STOU_ON("slash-stou-on");
    private final String value;

    DmFTPSlashSTOUPolicy(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DmFTPSlashSTOUPolicy fromValue(String v) {
        for (DmFTPSlashSTOUPolicy c: DmFTPSlashSTOUPolicy.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
