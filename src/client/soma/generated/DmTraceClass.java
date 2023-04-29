
package client.soma.generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dmTraceClass.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="dmTraceClass">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="evtlog"/>
 *     &lt;enumeration value="webgui"/>
 *     &lt;enumeration value="all"/>
 *     &lt;enumeration value="crl"/>
 *     &lt;enumeration value="cache-service"/>
 *     &lt;enumeration value="dispatcher"/>
 *     &lt;enumeration value="dhcp"/>
 *     &lt;enumeration value="document-handler"/>
 *     &lt;enumeration value="resource-fetcher"/>
 *     &lt;enumeration value="ethernet-fix"/>
 *     &lt;enumeration value="file-store"/>
 *     &lt;enumeration value="first-level"/>
 *     &lt;enumeration value="http-latency"/>
 *     &lt;enumeration value="http-parser"/>
 *     &lt;enumeration value="http-proxy"/>
 *     &lt;enumeration value="http-rewriter"/>
 *     &lt;enumeration value="http-server"/>
 *     &lt;enumeration value="http-useragent"/>
 *     &lt;enumeration value="identity-processor"/>
 *     &lt;enumeration value="interface"/>
 *     &lt;enumeration value="ldap"/>
 *     &lt;enumeration value="mac-fix"/>
 *     &lt;enumeration value="main"/>
 *     &lt;enumeration value="management"/>
 *     &lt;enumeration value="monitor"/>
 *     &lt;enumeration value="match"/>
 *     &lt;enumeration value="mime"/>
 *     &lt;enumeration value="multistep"/>
 *     &lt;enumeration value="name-service"/>
 *     &lt;enumeration value="ntp-service"/>
 *     &lt;enumeration value="packet-capture"/>
 *     &lt;enumeration value="payload-processor"/>
 *     &lt;enumeration value="ping-service"/>
 *     &lt;enumeration value="rewrite-policy"/>
 *     &lt;enumeration value="rule-processor"/>
 *     &lt;enumeration value="schema"/>
 *     &lt;enumeration value="server-manager"/>
 *     &lt;enumeration value="shell"/>
 *     &lt;enumeration value="simple-forwarder"/>
 *     &lt;enumeration value="snmp"/>
 *     &lt;enumeration value="soap-envelope"/>
 *     &lt;enumeration value="soap-processor"/>
 *     &lt;enumeration value="soap-validator"/>
 *     &lt;enumeration value="ssh-handler"/>
 *     &lt;enumeration value="ssl"/>
 *     &lt;enumeration value="ssl-forwarder"/>
 *     &lt;enumeration value="standby-control"/>
 *     &lt;enumeration value="statistics-service"/>
 *     &lt;enumeration value="status"/>
 *     &lt;enumeration value="stylesheet-policy"/>
 *     &lt;enumeration value="stylesheet-service"/>
 *     &lt;enumeration value="stream-cache"/>
 *     &lt;enumeration value="telnet-handler"/>
 *     &lt;enumeration value="thread-manager"/>
 *     &lt;enumeration value="throttler"/>
 *     &lt;enumeration value="url-opener"/>
 *     &lt;enumeration value="user-session"/>
 *     &lt;enumeration value="watchdog"/>
 *     &lt;enumeration value="xpl-doc"/>
 *     &lt;enumeration value="xsl-coproc"/>
 *     &lt;enumeration value="xsl-processor"/>
 *     &lt;enumeration value="jit-feeder"/>
 *     &lt;enumeration value="xslt"/>
 *     &lt;enumeration value="mq"/>
 *     &lt;enumeration value="tam"/>
 *     &lt;enumeration value="acl"/>
 *     &lt;enumeration value="crypto"/>
 *     &lt;enumeration value="compiler"/>
 *     &lt;enumeration value="xml-fetcher"/>
 *     &lt;enumeration value="dynamic-schema-loader"/>
 *     &lt;enumeration value="cert-monitor"/>
 *     &lt;enumeration value="post-fetcher"/>
 *     &lt;enumeration value="savefile-processor"/>
 *     &lt;enumeration value="ocsp"/>
 *     &lt;enumeration value="ws-proxy"/>
 *     &lt;enumeration value="mpgw"/>
 *     &lt;enumeration value="kerberos"/>
 *     &lt;enumeration value="slm"/>
 *     &lt;enumeration value="sql"/>
 *     &lt;enumeration value="netegrity"/>
 *     &lt;enumeration value="supervisor"/>
 *     &lt;enumeration value="network-file"/>
 *     &lt;enumeration value="icap"/>
 *     &lt;enumeration value="webapp-firewall"/>
 *     &lt;enumeration value="http-convert"/>
 *     &lt;enumeration value="jms"/>
 *     &lt;enumeration value="xacml"/>
 *     &lt;enumeration value="ltpa"/>
 *     &lt;enumeration value="file-poller"/>
 *     &lt;enumeration value="tfim"/>
 *     &lt;enumeration value="uddisub"/>
 *     &lt;enumeration value="wsrr"/>
 *     &lt;enumeration value="secure-conversation"/>
 *     &lt;enumeration value="fap"/>
 *     &lt;enumeration value="serialize-processor"/>
 *     &lt;enumeration value="wsrm"/>
 *     &lt;enumeration value="ims"/>
 *     &lt;enumeration value="platform-mgmt"/>
 *     &lt;enumeration value="sidecar"/>
 *     &lt;enumeration value="wtx"/>
 *     &lt;enumeration value="zosnss"/>
 *     &lt;enumeration value="llm"/>
 *     &lt;enumeration value="sftp"/>
 *     &lt;enumeration value="ssh"/>
 *     &lt;enumeration value="b2bp"/>
 *     &lt;enumeration value="b2bgw"/>
 *     &lt;enumeration value="b2b-retransmit"/>
 *     &lt;enumeration value="wcc"/>
 *     &lt;enumeration value="pop"/>
 *     &lt;enumeration value="sysplexdistributor"/>
 *     &lt;enumeration value="failure-notification"/>
 *     &lt;enumeration value="fibre-channel"/>
 *     &lt;enumeration value="multipath-handler"/>
 *     &lt;enumeration value="cluster-service"/>
 *     &lt;enumeration value="secure-cloud-connector"/>
 *     &lt;enumeration value="b2b-archive"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "dmTraceClass")
@XmlEnum
public enum DmTraceClass {

    @XmlEnumValue("evtlog")
    EVTLOG("evtlog"),
    @XmlEnumValue("webgui")
    WEBGUI("webgui"),
    @XmlEnumValue("all")
    ALL("all"),
    @XmlEnumValue("crl")
    CRL("crl"),
    @XmlEnumValue("cache-service")
    CACHE_SERVICE("cache-service"),
    @XmlEnumValue("dispatcher")
    DISPATCHER("dispatcher"),
    @XmlEnumValue("dhcp")
    DHCP("dhcp"),
    @XmlEnumValue("document-handler")
    DOCUMENT_HANDLER("document-handler"),
    @XmlEnumValue("resource-fetcher")
    RESOURCE_FETCHER("resource-fetcher"),
    @XmlEnumValue("ethernet-fix")
    ETHERNET_FIX("ethernet-fix"),
    @XmlEnumValue("file-store")
    FILE_STORE("file-store"),
    @XmlEnumValue("first-level")
    FIRST_LEVEL("first-level"),
    @XmlEnumValue("http-latency")
    HTTP_LATENCY("http-latency"),
    @XmlEnumValue("http-parser")
    HTTP_PARSER("http-parser"),
    @XmlEnumValue("http-proxy")
    HTTP_PROXY("http-proxy"),
    @XmlEnumValue("http-rewriter")
    HTTP_REWRITER("http-rewriter"),
    @XmlEnumValue("http-server")
    HTTP_SERVER("http-server"),
    @XmlEnumValue("http-useragent")
    HTTP_USERAGENT("http-useragent"),
    @XmlEnumValue("identity-processor")
    IDENTITY_PROCESSOR("identity-processor"),
    @XmlEnumValue("interface")
    INTERFACE("interface"),
    @XmlEnumValue("ldap")
    LDAP("ldap"),
    @XmlEnumValue("mac-fix")
    MAC_FIX("mac-fix"),
    @XmlEnumValue("main")
    MAIN("main"),
    @XmlEnumValue("management")
    MANAGEMENT("management"),
    @XmlEnumValue("monitor")
    MONITOR("monitor"),
    @XmlEnumValue("match")
    MATCH("match"),
    @XmlEnumValue("mime")
    MIME("mime"),
    @XmlEnumValue("multistep")
    MULTISTEP("multistep"),
    @XmlEnumValue("name-service")
    NAME_SERVICE("name-service"),
    @XmlEnumValue("ntp-service")
    NTP_SERVICE("ntp-service"),
    @XmlEnumValue("packet-capture")
    PACKET_CAPTURE("packet-capture"),
    @XmlEnumValue("payload-processor")
    PAYLOAD_PROCESSOR("payload-processor"),
    @XmlEnumValue("ping-service")
    PING_SERVICE("ping-service"),
    @XmlEnumValue("rewrite-policy")
    REWRITE_POLICY("rewrite-policy"),
    @XmlEnumValue("rule-processor")
    RULE_PROCESSOR("rule-processor"),
    @XmlEnumValue("schema")
    SCHEMA("schema"),
    @XmlEnumValue("server-manager")
    SERVER_MANAGER("server-manager"),
    @XmlEnumValue("shell")
    SHELL("shell"),
    @XmlEnumValue("simple-forwarder")
    SIMPLE_FORWARDER("simple-forwarder"),
    @XmlEnumValue("snmp")
    SNMP("snmp"),
    @XmlEnumValue("soap-envelope")
    SOAP_ENVELOPE("soap-envelope"),
    @XmlEnumValue("soap-processor")
    SOAP_PROCESSOR("soap-processor"),
    @XmlEnumValue("soap-validator")
    SOAP_VALIDATOR("soap-validator"),
    @XmlEnumValue("ssh-handler")
    SSH_HANDLER("ssh-handler"),
    @XmlEnumValue("ssl")
    SSL("ssl"),
    @XmlEnumValue("ssl-forwarder")
    SSL_FORWARDER("ssl-forwarder"),
    @XmlEnumValue("standby-control")
    STANDBY_CONTROL("standby-control"),
    @XmlEnumValue("statistics-service")
    STATISTICS_SERVICE("statistics-service"),
    @XmlEnumValue("status")
    STATUS("status"),
    @XmlEnumValue("stylesheet-policy")
    STYLESHEET_POLICY("stylesheet-policy"),
    @XmlEnumValue("stylesheet-service")
    STYLESHEET_SERVICE("stylesheet-service"),
    @XmlEnumValue("stream-cache")
    STREAM_CACHE("stream-cache"),
    @XmlEnumValue("telnet-handler")
    TELNET_HANDLER("telnet-handler"),
    @XmlEnumValue("thread-manager")
    THREAD_MANAGER("thread-manager"),
    @XmlEnumValue("throttler")
    THROTTLER("throttler"),
    @XmlEnumValue("url-opener")
    URL_OPENER("url-opener"),
    @XmlEnumValue("user-session")
    USER_SESSION("user-session"),
    @XmlEnumValue("watchdog")
    WATCHDOG("watchdog"),
    @XmlEnumValue("xpl-doc")
    XPL_DOC("xpl-doc"),
    @XmlEnumValue("xsl-coproc")
    XSL_COPROC("xsl-coproc"),
    @XmlEnumValue("xsl-processor")
    XSL_PROCESSOR("xsl-processor"),
    @XmlEnumValue("jit-feeder")
    JIT_FEEDER("jit-feeder"),
    @XmlEnumValue("xslt")
    XSLT("xslt"),
    @XmlEnumValue("mq")
    MQ("mq"),
    @XmlEnumValue("tam")
    TAM("tam"),
    @XmlEnumValue("acl")
    ACL("acl"),
    @XmlEnumValue("crypto")
    CRYPTO("crypto"),
    @XmlEnumValue("compiler")
    COMPILER("compiler"),
    @XmlEnumValue("xml-fetcher")
    XML_FETCHER("xml-fetcher"),
    @XmlEnumValue("dynamic-schema-loader")
    DYNAMIC_SCHEMA_LOADER("dynamic-schema-loader"),
    @XmlEnumValue("cert-monitor")
    CERT_MONITOR("cert-monitor"),
    @XmlEnumValue("post-fetcher")
    POST_FETCHER("post-fetcher"),
    @XmlEnumValue("savefile-processor")
    SAVEFILE_PROCESSOR("savefile-processor"),
    @XmlEnumValue("ocsp")
    OCSP("ocsp"),
    @XmlEnumValue("ws-proxy")
    WS_PROXY("ws-proxy"),
    @XmlEnumValue("mpgw")
    MPGW("mpgw"),
    @XmlEnumValue("kerberos")
    KERBEROS("kerberos"),
    @XmlEnumValue("slm")
    SLM("slm"),
    @XmlEnumValue("sql")
    SQL("sql"),
    @XmlEnumValue("netegrity")
    NETEGRITY("netegrity"),
    @XmlEnumValue("supervisor")
    SUPERVISOR("supervisor"),
    @XmlEnumValue("network-file")
    NETWORK_FILE("network-file"),
    @XmlEnumValue("icap")
    ICAP("icap"),
    @XmlEnumValue("webapp-firewall")
    WEBAPP_FIREWALL("webapp-firewall"),
    @XmlEnumValue("http-convert")
    HTTP_CONVERT("http-convert"),
    @XmlEnumValue("jms")
    JMS("jms"),
    @XmlEnumValue("xacml")
    XACML("xacml"),
    @XmlEnumValue("ltpa")
    LTPA("ltpa"),
    @XmlEnumValue("file-poller")
    FILE_POLLER("file-poller"),
    @XmlEnumValue("tfim")
    TFIM("tfim"),
    @XmlEnumValue("uddisub")
    UDDISUB("uddisub"),
    @XmlEnumValue("wsrr")
    WSRR("wsrr"),
    @XmlEnumValue("secure-conversation")
    SECURE_CONVERSATION("secure-conversation"),
    @XmlEnumValue("fap")
    FAP("fap"),
    @XmlEnumValue("serialize-processor")
    SERIALIZE_PROCESSOR("serialize-processor"),
    @XmlEnumValue("wsrm")
    WSRM("wsrm"),
    @XmlEnumValue("ims")
    IMS("ims"),
    @XmlEnumValue("platform-mgmt")
    PLATFORM_MGMT("platform-mgmt"),
    @XmlEnumValue("sidecar")
    SIDECAR("sidecar"),
    @XmlEnumValue("wtx")
    WTX("wtx"),
    @XmlEnumValue("zosnss")
    ZOSNSS("zosnss"),
    @XmlEnumValue("llm")
    LLM("llm"),
    @XmlEnumValue("sftp")
    SFTP("sftp"),
    @XmlEnumValue("ssh")
    SSH("ssh"),
    @XmlEnumValue("b2bp")
    B_2_BP("b2bp"),
    @XmlEnumValue("b2bgw")
    B_2_BGW("b2bgw"),
    @XmlEnumValue("b2b-retransmit")
    B_2_B_RETRANSMIT("b2b-retransmit"),
    @XmlEnumValue("wcc")
    WCC("wcc"),
    @XmlEnumValue("pop")
    POP("pop"),
    @XmlEnumValue("sysplexdistributor")
    SYSPLEXDISTRIBUTOR("sysplexdistributor"),
    @XmlEnumValue("failure-notification")
    FAILURE_NOTIFICATION("failure-notification"),
    @XmlEnumValue("fibre-channel")
    FIBRE_CHANNEL("fibre-channel"),
    @XmlEnumValue("multipath-handler")
    MULTIPATH_HANDLER("multipath-handler"),
    @XmlEnumValue("cluster-service")
    CLUSTER_SERVICE("cluster-service"),
    @XmlEnumValue("secure-cloud-connector")
    SECURE_CLOUD_CONNECTOR("secure-cloud-connector"),
    @XmlEnumValue("b2b-archive")
    B_2_B_ARCHIVE("b2b-archive");
    private final String value;

    DmTraceClass(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DmTraceClass fromValue(String v) {
        for (DmTraceClass c: DmTraceClass.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
