
package client.soma.generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dmWSBindingStyle.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="dmWSBindingStyle">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="DocumentLiteral"/>
 *     &lt;enumeration value="DocumentEncoded"/>
 *     &lt;enumeration value="RPCLiteral"/>
 *     &lt;enumeration value="RPCEncoded"/>
 *     &lt;enumeration value="Unknown"/>
 *     &lt;enumeration value="UnknownEncoding"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "dmWSBindingStyle")
@XmlEnum
public enum DmWSBindingStyle {

    @XmlEnumValue("DocumentLiteral")
    DOCUMENT_LITERAL("DocumentLiteral"),
    @XmlEnumValue("DocumentEncoded")
    DOCUMENT_ENCODED("DocumentEncoded"),
    @XmlEnumValue("RPCLiteral")
    RPC_LITERAL("RPCLiteral"),
    @XmlEnumValue("RPCEncoded")
    RPC_ENCODED("RPCEncoded"),
    @XmlEnumValue("Unknown")
    UNKNOWN("Unknown"),
    @XmlEnumValue("UnknownEncoding")
    UNKNOWN_ENCODING("UnknownEncoding");
    private final String value;

    DmWSBindingStyle(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DmWSBindingStyle fromValue(String v) {
        for (DmWSBindingStyle c: DmWSBindingStyle.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
