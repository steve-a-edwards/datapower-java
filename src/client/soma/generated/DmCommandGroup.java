
package client.soma.generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dmCommandGroup.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="dmCommandGroup">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="aaapolicy"/>
 *     &lt;enumeration value="acl"/>
 *     &lt;enumeration value="common"/>
 *     &lt;enumeration value="compile-options"/>
 *     &lt;enumeration value="config-management"/>
 *     &lt;enumeration value="configuration"/>
 *     &lt;enumeration value="crl"/>
 *     &lt;enumeration value="crypto"/>
 *     &lt;enumeration value="device-management"/>
 *     &lt;enumeration value="diagnostics"/>
 *     &lt;enumeration value="document-crypto-map"/>
 *     &lt;enumeration value="domain"/>
 *     &lt;enumeration value="failure-notification"/>
 *     &lt;enumeration value="file-management"/>
 *     &lt;enumeration value="firewallcred"/>
 *     &lt;enumeration value="flash"/>
 *     &lt;enumeration value="httpserv"/>
 *     &lt;enumeration value="input-conversion"/>
 *     &lt;enumeration value="interface"/>
 *     &lt;enumeration value="load-balancer"/>
 *     &lt;enumeration value="logging"/>
 *     &lt;enumeration value="matching"/>
 *     &lt;enumeration value="messages"/>
 *     &lt;enumeration value="monitors"/>
 *     &lt;enumeration value="mpgw"/>
 *     &lt;enumeration value="mq-host"/>
 *     &lt;enumeration value="mq-node"/>
 *     &lt;enumeration value="mq-qm"/>
 *     &lt;enumeration value="network"/>
 *     &lt;enumeration value="radius"/>
 *     &lt;enumeration value="rbm"/>
 *     &lt;enumeration value="schema-exception-map"/>
 *     &lt;enumeration value="service-monitor"/>
 *     &lt;enumeration value="snmp"/>
 *     &lt;enumeration value="sql"/>
 *     &lt;enumeration value="sslforwarder"/>
 *     &lt;enumeration value="stylesheetaction"/>
 *     &lt;enumeration value="stylesheetpolicy"/>
 *     &lt;enumeration value="stylesheetrule"/>
 *     &lt;enumeration value="system"/>
 *     &lt;enumeration value="tam"/>
 *     &lt;enumeration value="tcpproxy"/>
 *     &lt;enumeration value="urlmap"/>
 *     &lt;enumeration value="urlrefresh"/>
 *     &lt;enumeration value="urlrewrite"/>
 *     &lt;enumeration value="useragent"/>
 *     &lt;enumeration value="usergroup"/>
 *     &lt;enumeration value="validation"/>
 *     &lt;enumeration value="webservice"/>
 *     &lt;enumeration value="wsm-agent"/>
 *     &lt;enumeration value="xmlfirewall"/>
 *     &lt;enumeration value="xmlmgr"/>
 *     &lt;enumeration value="xpath-routing"/>
 *     &lt;enumeration value="xslcoproc"/>
 *     &lt;enumeration value="xslproxy"/>
 *     &lt;enumeration value="http"/>
 *     &lt;enumeration value="document-cache"/>
 *     &lt;enumeration value="parserlimit"/>
 *     &lt;enumeration value="rule"/>
 *     &lt;enumeration value="password-change"/>
 *     &lt;enumeration value="reserved50"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "dmCommandGroup")
@XmlEnum
public enum DmCommandGroup {

    @XmlEnumValue("aaapolicy")
    AAAPOLICY("aaapolicy"),
    @XmlEnumValue("acl")
    ACL("acl"),
    @XmlEnumValue("common")
    COMMON("common"),
    @XmlEnumValue("compile-options")
    COMPILE_OPTIONS("compile-options"),
    @XmlEnumValue("config-management")
    CONFIG_MANAGEMENT("config-management"),
    @XmlEnumValue("configuration")
    CONFIGURATION("configuration"),
    @XmlEnumValue("crl")
    CRL("crl"),
    @XmlEnumValue("crypto")
    CRYPTO("crypto"),
    @XmlEnumValue("device-management")
    DEVICE_MANAGEMENT("device-management"),
    @XmlEnumValue("diagnostics")
    DIAGNOSTICS("diagnostics"),
    @XmlEnumValue("document-crypto-map")
    DOCUMENT_CRYPTO_MAP("document-crypto-map"),
    @XmlEnumValue("domain")
    DOMAIN("domain"),
    @XmlEnumValue("failure-notification")
    FAILURE_NOTIFICATION("failure-notification"),
    @XmlEnumValue("file-management")
    FILE_MANAGEMENT("file-management"),
    @XmlEnumValue("firewallcred")
    FIREWALLCRED("firewallcred"),
    @XmlEnumValue("flash")
    FLASH("flash"),
    @XmlEnumValue("httpserv")
    HTTPSERV("httpserv"),
    @XmlEnumValue("input-conversion")
    INPUT_CONVERSION("input-conversion"),
    @XmlEnumValue("interface")
    INTERFACE("interface"),
    @XmlEnumValue("load-balancer")
    LOAD_BALANCER("load-balancer"),
    @XmlEnumValue("logging")
    LOGGING("logging"),
    @XmlEnumValue("matching")
    MATCHING("matching"),
    @XmlEnumValue("messages")
    MESSAGES("messages"),
    @XmlEnumValue("monitors")
    MONITORS("monitors"),
    @XmlEnumValue("mpgw")
    MPGW("mpgw"),
    @XmlEnumValue("mq-host")
    MQ_HOST("mq-host"),
    @XmlEnumValue("mq-node")
    MQ_NODE("mq-node"),
    @XmlEnumValue("mq-qm")
    MQ_QM("mq-qm"),
    @XmlEnumValue("network")
    NETWORK("network"),
    @XmlEnumValue("radius")
    RADIUS("radius"),
    @XmlEnumValue("rbm")
    RBM("rbm"),
    @XmlEnumValue("schema-exception-map")
    SCHEMA_EXCEPTION_MAP("schema-exception-map"),
    @XmlEnumValue("service-monitor")
    SERVICE_MONITOR("service-monitor"),
    @XmlEnumValue("snmp")
    SNMP("snmp"),
    @XmlEnumValue("sql")
    SQL("sql"),
    @XmlEnumValue("sslforwarder")
    SSLFORWARDER("sslforwarder"),
    @XmlEnumValue("stylesheetaction")
    STYLESHEETACTION("stylesheetaction"),
    @XmlEnumValue("stylesheetpolicy")
    STYLESHEETPOLICY("stylesheetpolicy"),
    @XmlEnumValue("stylesheetrule")
    STYLESHEETRULE("stylesheetrule"),
    @XmlEnumValue("system")
    SYSTEM("system"),
    @XmlEnumValue("tam")
    TAM("tam"),
    @XmlEnumValue("tcpproxy")
    TCPPROXY("tcpproxy"),
    @XmlEnumValue("urlmap")
    URLMAP("urlmap"),
    @XmlEnumValue("urlrefresh")
    URLREFRESH("urlrefresh"),
    @XmlEnumValue("urlrewrite")
    URLREWRITE("urlrewrite"),
    @XmlEnumValue("useragent")
    USERAGENT("useragent"),
    @XmlEnumValue("usergroup")
    USERGROUP("usergroup"),
    @XmlEnumValue("validation")
    VALIDATION("validation"),
    @XmlEnumValue("webservice")
    WEBSERVICE("webservice"),
    @XmlEnumValue("wsm-agent")
    WSM_AGENT("wsm-agent"),
    @XmlEnumValue("xmlfirewall")
    XMLFIREWALL("xmlfirewall"),
    @XmlEnumValue("xmlmgr")
    XMLMGR("xmlmgr"),
    @XmlEnumValue("xpath-routing")
    XPATH_ROUTING("xpath-routing"),
    @XmlEnumValue("xslcoproc")
    XSLCOPROC("xslcoproc"),
    @XmlEnumValue("xslproxy")
    XSLPROXY("xslproxy"),
    @XmlEnumValue("http")
    HTTP("http"),
    @XmlEnumValue("document-cache")
    DOCUMENT_CACHE("document-cache"),
    @XmlEnumValue("parserlimit")
    PARSERLIMIT("parserlimit"),
    @XmlEnumValue("rule")
    RULE("rule"),
    @XmlEnumValue("password-change")
    PASSWORD_CHANGE("password-change"),
    @XmlEnumValue("reserved50")
    RESERVED_50("reserved50");
    private final String value;

    DmCommandGroup(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DmCommandGroup fromValue(String v) {
        for (DmCommandGroup c: DmCommandGroup.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
