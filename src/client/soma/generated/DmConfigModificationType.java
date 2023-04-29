
package client.soma.generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dmConfigModificationType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="dmConfigModificationType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="add"/>
 *     &lt;enumeration value="delete"/>
 *     &lt;enumeration value="change"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "dmConfigModificationType")
@XmlEnum
public enum DmConfigModificationType {

    @XmlEnumValue("add")
    ADD("add"),
    @XmlEnumValue("delete")
    DELETE("delete"),
    @XmlEnumValue("change")
    CHANGE("change");
    private final String value;

    DmConfigModificationType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DmConfigModificationType fromValue(String v) {
        for (DmConfigModificationType c: DmConfigModificationType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
