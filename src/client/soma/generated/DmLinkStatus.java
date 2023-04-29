
package client.soma.generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dmLinkStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="dmLinkStatus">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ok"/>
 *     &lt;enumeration value="no-link"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "dmLinkStatus")
@XmlEnum
public enum DmLinkStatus {

    @XmlEnumValue("ok")
    OK("ok"),
    @XmlEnumValue("no-link")
    NO_LINK("no-link");
    private final String value;

    DmLinkStatus(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DmLinkStatus fromValue(String v) {
        for (DmLinkStatus c: DmLinkStatus.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
