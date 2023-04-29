
package client.soma.generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dmWSDLBindingProtocol.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="dmWSDLBindingProtocol">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="default"/>
 *     &lt;enumeration value="soap-11"/>
 *     &lt;enumeration value="soap-12"/>
 *     &lt;enumeration value="http-get"/>
 *     &lt;enumeration value="http-post"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "dmWSDLBindingProtocol")
@XmlEnum
public enum DmWSDLBindingProtocol {

    @XmlEnumValue("default")
    DEFAULT("default"),
    @XmlEnumValue("soap-11")
    SOAP_11("soap-11"),
    @XmlEnumValue("soap-12")
    SOAP_12("soap-12"),
    @XmlEnumValue("http-get")
    HTTP_GET("http-get"),
    @XmlEnumValue("http-post")
    HTTP_POST("http-post");
    private final String value;

    DmWSDLBindingProtocol(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DmWSDLBindingProtocol fromValue(String v) {
        for (DmWSDLBindingProtocol c: DmWSDLBindingProtocol.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
