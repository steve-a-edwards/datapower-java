
package client.soma.generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dmHTTPServiceMode.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="dmHTTPServiceMode">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="normal"/>
 *     &lt;enumeration value="webgui"/>
 *     &lt;enumeration value="echo"/>
 *     &lt;enumeration value="mq"/>
 *     &lt;enumeration value="filetrace"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "dmHTTPServiceMode")
@XmlEnum
public enum DmHTTPServiceMode {

    @XmlEnumValue("normal")
    NORMAL("normal"),
    @XmlEnumValue("webgui")
    WEBGUI("webgui"),
    @XmlEnumValue("echo")
    ECHO("echo"),
    @XmlEnumValue("mq")
    MQ("mq"),
    @XmlEnumValue("filetrace")
    FILETRACE("filetrace");
    private final String value;

    DmHTTPServiceMode(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DmHTTPServiceMode fromValue(String v) {
        for (DmHTTPServiceMode c: DmHTTPServiceMode.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
