
package client.soma.generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dmWebSphereJMSTransport.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="dmWebSphereJMSTransport">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="TCP"/>
 *     &lt;enumeration value="SSL"/>
 *     &lt;enumeration value="HTTP"/>
 *     &lt;enumeration value="HTTPS"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "dmWebSphereJMSTransport")
@XmlEnum
public enum DmWebSphereJMSTransport {

    TCP,
    SSL,
    HTTP,
    HTTPS;

    public String value() {
        return name();
    }

    public static DmWebSphereJMSTransport fromValue(String v) {
        return valueOf(v);
    }

}
