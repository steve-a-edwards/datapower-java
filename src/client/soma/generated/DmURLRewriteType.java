
package client.soma.generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dmURLRewriteType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="dmURLRewriteType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="rewrite"/>
 *     &lt;enumeration value="absolute-rewrite"/>
 *     &lt;enumeration value="post-body"/>
 *     &lt;enumeration value="header-rewrite"/>
 *     &lt;enumeration value="content-type"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "dmURLRewriteType")
@XmlEnum
public enum DmURLRewriteType {

    @XmlEnumValue("rewrite")
    REWRITE("rewrite"),
    @XmlEnumValue("absolute-rewrite")
    ABSOLUTE_REWRITE("absolute-rewrite"),
    @XmlEnumValue("post-body")
    POST_BODY("post-body"),
    @XmlEnumValue("header-rewrite")
    HEADER_REWRITE("header-rewrite"),
    @XmlEnumValue("content-type")
    CONTENT_TYPE("content-type");
    private final String value;

    DmURLRewriteType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DmURLRewriteType fromValue(String v) {
        for (DmURLRewriteType c: DmURLRewriteType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
