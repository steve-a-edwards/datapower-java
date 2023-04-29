
package client.soma.generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dmSLMMatchType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="dmSLMMatchType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="per-extracted-value"/>
 *     &lt;enumeration value="exact-match"/>
 *     &lt;enumeration value="regexp-match"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "dmSLMMatchType")
@XmlEnum
public enum DmSLMMatchType {

    @XmlEnumValue("per-extracted-value")
    PER_EXTRACTED_VALUE("per-extracted-value"),
    @XmlEnumValue("exact-match")
    EXACT_MATCH("exact-match"),
    @XmlEnumValue("regexp-match")
    REGEXP_MATCH("regexp-match");
    private final String value;

    DmSLMMatchType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DmSLMMatchType fromValue(String v) {
        for (DmSLMMatchType c: DmSLMMatchType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
