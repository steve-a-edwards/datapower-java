
package client.soma.generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dmURIFragmentFixupType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="dmURIFragmentFixupType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="allow"/>
 *     &lt;enumeration value="reject"/>
 *     &lt;enumeration value="truncate"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "dmURIFragmentFixupType")
@XmlEnum
public enum DmURIFragmentFixupType {

    @XmlEnumValue("allow")
    ALLOW("allow"),
    @XmlEnumValue("reject")
    REJECT("reject"),
    @XmlEnumValue("truncate")
    TRUNCATE("truncate");
    private final String value;

    DmURIFragmentFixupType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DmURIFragmentFixupType fromValue(String v) {
        for (DmURIFragmentFixupType c: DmURIFragmentFixupType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
