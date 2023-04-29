
package client.soma.generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dmWSBindingTransport.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="dmWSBindingTransport">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="SOAPOverHTTP"/>
 *     &lt;enumeration value="HTTPGET"/>
 *     &lt;enumeration value="HTTPPOST"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "dmWSBindingTransport")
@XmlEnum
public enum DmWSBindingTransport {

    @XmlEnumValue("SOAPOverHTTP")
    SOAP_OVER_HTTP("SOAPOverHTTP"),
    HTTPGET("HTTPGET"),
    HTTPPOST("HTTPPOST");
    private final String value;

    DmWSBindingTransport(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DmWSBindingTransport fromValue(String v) {
        for (DmWSBindingTransport c: DmWSBindingTransport.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
