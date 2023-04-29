
package client.soma.generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dmSatisfactionPolicy.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="dmSatisfactionPolicy">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="pre-requisite"/>
 *     &lt;enumeration value="admission"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "dmSatisfactionPolicy")
@XmlEnum
public enum DmSatisfactionPolicy {

    @XmlEnumValue("pre-requisite")
    PRE_REQUISITE("pre-requisite"),
    @XmlEnumValue("admission")
    ADMISSION("admission");
    private final String value;

    DmSatisfactionPolicy(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DmSatisfactionPolicy fromValue(String v) {
        for (DmSatisfactionPolicy c: DmSatisfactionPolicy.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
