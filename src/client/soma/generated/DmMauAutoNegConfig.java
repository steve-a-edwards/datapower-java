
package client.soma.generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dmMauAutoNegConfig.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="dmMauAutoNegConfig">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="other"/>
 *     &lt;enumeration value="configuring"/>
 *     &lt;enumeration value="complete"/>
 *     &lt;enumeration value="disabled"/>
 *     &lt;enumeration value="parallelDetectFail"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "dmMauAutoNegConfig")
@XmlEnum
public enum DmMauAutoNegConfig {

    @XmlEnumValue("other")
    OTHER("other"),
    @XmlEnumValue("configuring")
    CONFIGURING("configuring"),
    @XmlEnumValue("complete")
    COMPLETE("complete"),
    @XmlEnumValue("disabled")
    DISABLED("disabled"),
    @XmlEnumValue("parallelDetectFail")
    PARALLEL_DETECT_FAIL("parallelDetectFail");
    private final String value;

    DmMauAutoNegConfig(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DmMauAutoNegConfig fromValue(String v) {
        for (DmMauAutoNegConfig c: DmMauAutoNegConfig.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
