
package client.soma.generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dmSoapVersion.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="dmSoapVersion">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="soap11"/>
 *     &lt;enumeration value="soap12"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "dmSoapVersion")
@XmlEnum
public enum DmSoapVersion {

    @XmlEnumValue("soap11")
    SOAP_11("soap11"),
    @XmlEnumValue("soap12")
    SOAP_12("soap12");
    private final String value;

    DmSoapVersion(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DmSoapVersion fromValue(String v) {
        for (DmSoapVersion c: DmSoapVersion.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
