
package client.soma.generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dmUDDIVersion.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="dmUDDIVersion">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="UDDIv2"/>
 *     &lt;enumeration value="UDDIv3"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "dmUDDIVersion")
@XmlEnum
public enum DmUDDIVersion {

    @XmlEnumValue("UDDIv2")
    UDD_IV_2("UDDIv2"),
    @XmlEnumValue("UDDIv3")
    UDD_IV_3("UDDIv3");
    private final String value;

    DmUDDIVersion(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DmUDDIVersion fromValue(String v) {
        for (DmUDDIVersion c: DmUDDIVersion.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
