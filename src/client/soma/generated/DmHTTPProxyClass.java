
package client.soma.generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dmHTTPProxyClass.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="dmHTTPProxyClass">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="unknown"/>
 *     &lt;enumeration value="xSLProxyService"/>
 *     &lt;enumeration value="xMLFirewallService"/>
 *     &lt;enumeration value="wSGateway"/>
 *     &lt;enumeration value="multiProtocolGateway"/>
 *     &lt;enumeration value="webAppFW"/>
 *     &lt;enumeration value="b2BGateway"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "dmHTTPProxyClass")
@XmlEnum
public enum DmHTTPProxyClass {

    @XmlEnumValue("unknown")
    UNKNOWN("unknown"),
    @XmlEnumValue("xSLProxyService")
    X_SL_PROXY_SERVICE("xSLProxyService"),
    @XmlEnumValue("xMLFirewallService")
    X_ML_FIREWALL_SERVICE("xMLFirewallService"),
    @XmlEnumValue("wSGateway")
    W_S_GATEWAY("wSGateway"),
    @XmlEnumValue("multiProtocolGateway")
    MULTI_PROTOCOL_GATEWAY("multiProtocolGateway"),
    @XmlEnumValue("webAppFW")
    WEB_APP_FW("webAppFW"),
    @XmlEnumValue("b2BGateway")
    B_2_B_GATEWAY("b2BGateway");
    private final String value;

    DmHTTPProxyClass(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DmHTTPProxyClass fromValue(String v) {
        for (DmHTTPProxyClass c: DmHTTPProxyClass.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
