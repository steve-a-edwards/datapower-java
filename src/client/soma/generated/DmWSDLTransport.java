
package client.soma.generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dmWSDLTransport.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="dmWSDLTransport">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="http-get"/>
 *     &lt;enumeration value="http-post"/>
 *     &lt;enumeration value="soap-doc"/>
 *     &lt;enumeration value="soap-rpc"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "dmWSDLTransport")
@XmlEnum
public enum DmWSDLTransport {

    @XmlEnumValue("http-get")
    HTTP_GET("http-get"),
    @XmlEnumValue("http-post")
    HTTP_POST("http-post"),
    @XmlEnumValue("soap-doc")
    SOAP_DOC("soap-doc"),
    @XmlEnumValue("soap-rpc")
    SOAP_RPC("soap-rpc");
    private final String value;

    DmWSDLTransport(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DmWSDLTransport fromValue(String v) {
        for (DmWSDLTransport c: DmWSDLTransport.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
