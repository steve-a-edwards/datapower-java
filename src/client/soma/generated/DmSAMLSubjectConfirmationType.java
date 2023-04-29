
package client.soma.generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dmSAMLSubjectConfirmationType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="dmSAMLSubjectConfirmationType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="bearer"/>
 *     &lt;enumeration value="hok"/>
 *     &lt;enumeration value="sv"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "dmSAMLSubjectConfirmationType")
@XmlEnum
public enum DmSAMLSubjectConfirmationType {

    @XmlEnumValue("bearer")
    BEARER("bearer"),
    @XmlEnumValue("hok")
    HOK("hok"),
    @XmlEnumValue("sv")
    SV("sv");
    private final String value;

    DmSAMLSubjectConfirmationType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DmSAMLSubjectConfirmationType fromValue(String v) {
        for (DmSAMLSubjectConfirmationType c: DmSAMLSubjectConfirmationType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
