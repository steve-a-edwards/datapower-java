
package client.soma.generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dmWSWSDLVersion.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="dmWSWSDLVersion">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="WSDL1.1"/>
 *     &lt;enumeration value="WSDL2.0"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "dmWSWSDLVersion")
@XmlEnum
public enum DmWSWSDLVersion {

    @XmlEnumValue("WSDL1.1")
    WSDL_1_1("WSDL1.1"),
    @XmlEnumValue("WSDL2.0")
    WSDL_2_0("WSDL2.0");
    private final String value;

    DmWSWSDLVersion(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DmWSWSDLVersion fromValue(String v) {
        for (DmWSWSDLVersion c: DmWSWSDLVersion.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
