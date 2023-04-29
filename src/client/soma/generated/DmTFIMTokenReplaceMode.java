
package client.soma.generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dmTFIMTokenReplaceMode.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="dmTFIMTokenReplaceMode">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="all"/>
 *     &lt;enumeration value="replace"/>
 *     &lt;enumeration value="preserve"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "dmTFIMTokenReplaceMode")
@XmlEnum
public enum DmTFIMTokenReplaceMode {

    @XmlEnumValue("all")
    ALL("all"),
    @XmlEnumValue("replace")
    REPLACE("replace"),
    @XmlEnumValue("preserve")
    PRESERVE("preserve");
    private final String value;

    DmTFIMTokenReplaceMode(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DmTFIMTokenReplaceMode fromValue(String v) {
        for (DmTFIMTokenReplaceMode c: DmTFIMTokenReplaceMode.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
