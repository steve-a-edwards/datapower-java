
package client.soma.generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dmDurationFilterType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="dmDurationFilterType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="average"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "dmDurationFilterType")
@XmlEnum
public enum DmDurationFilterType {

    @XmlEnumValue("average")
    AVERAGE("average");
    private final String value;

    DmDurationFilterType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DmDurationFilterType fromValue(String v) {
        for (DmDurationFilterType c: DmDurationFilterType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
