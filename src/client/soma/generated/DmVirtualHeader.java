
package client.soma.generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dmVirtualHeader.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="dmVirtualHeader">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="MQMD"/>
 *     &lt;enumeration value="X-MQ-Receive-Q"/>
 *     &lt;enumeration value="X-MQ-Send-Q"/>
 *     &lt;enumeration value="JMSCorrelationID"/>
 *     &lt;enumeration value="JMSDeliveryMode"/>
 *     &lt;enumeration value="JMSDestination"/>
 *     &lt;enumeration value="JMSExpiration"/>
 *     &lt;enumeration value="JMSMessageID"/>
 *     &lt;enumeration value="JMSPriority"/>
 *     &lt;enumeration value="JMSRedelivered"/>
 *     &lt;enumeration value="JMSReplyTo"/>
 *     &lt;enumeration value="JMSTimestamp"/>
 *     &lt;enumeration value="JMSType"/>
 *     &lt;enumeration value="JMSXUserID"/>
 *     &lt;enumeration value="JMSXAppID"/>
 *     &lt;enumeration value="JMSXDeliveryCount"/>
 *     &lt;enumeration value="JMSXGroupID"/>
 *     &lt;enumeration value="JMSXGroupSeq"/>
 *     &lt;enumeration value="JMSXProducerTXID"/>
 *     &lt;enumeration value="JMSXConsumerTXID"/>
 *     &lt;enumeration value="JMSXRcvTimestamp"/>
 *     &lt;enumeration value="JMSXState"/>
 *     &lt;enumeration value="DP_JMSMessageType"/>
 *     &lt;enumeration value="DP_JMSReplyToServer"/>
 *     &lt;enumeration value="DP_JMSReplyToTopicSpace"/>
 *     &lt;enumeration value="JMS_TIBCO_COMPRESS"/>
 *     &lt;enumeration value="JMS_TIBCO_IMPORTED"/>
 *     &lt;enumeration value="JMS_TIBCO_SENDER"/>
 *     &lt;enumeration value="JMS_TIBCO_DISABLE_SENDER"/>
 *     &lt;enumeration value="JMS_TIBCO_PRESERVE_UNDELIVERED"/>
 *     &lt;enumeration value="JMS_TIBCO_MSG_EXT"/>
 *     &lt;enumeration value="JMS_TIBCO_MSG_TRACE"/>
 *     &lt;enumeration value="JMS_TIBCO_CM_PUBLISHER"/>
 *     &lt;enumeration value="JMS_TIBCO_CM_SEQUENCE"/>
 *     &lt;enumeration value="JMS_TIBCO_SS_SENDER"/>
 *     &lt;enumeration value="JMS_TIBCO_SS_DELIVERY_MODE"/>
 *     &lt;enumeration value="JMS_TIBCO_SS_EXPIRATION"/>
 *     &lt;enumeration value="JMS_TIBCO_SS_LB_MODE"/>
 *     &lt;enumeration value="JMS_TIBCO_SS_MESSAGE_ID"/>
 *     &lt;enumeration value="JMS_TIBCO_SS_PRIORITY"/>
 *     &lt;enumeration value="JMS_TIBCO_SS_SENDER_TIMESTAMP"/>
 *     &lt;enumeration value="JMS_TIBCO_SS_TYPE_NUM"/>
 *     &lt;enumeration value="JMS_TIBCO_SS_CORRELATION_ID"/>
 *     &lt;enumeration value="JMS_TIBCO_SS_SEQ_NUM"/>
 *     &lt;enumeration value="JMS_TIBCO_SS_USER_PROP"/>
 *     &lt;enumeration value="JMS_IBM_Character_Set"/>
 *     &lt;enumeration value="JMS_IBM_Encoding"/>
 *     &lt;enumeration value="JMS_IBM_ExceptionMessage"/>
 *     &lt;enumeration value="JMS_IBM_ExceptionReason"/>
 *     &lt;enumeration value="JMS_IBM_ExceptionTimestamp"/>
 *     &lt;enumeration value="JMS_IBM_ExceptionProblemDestination"/>
 *     &lt;enumeration value="JMS_IBM_Feedback"/>
 *     &lt;enumeration value="JMS_IBM_Format"/>
 *     &lt;enumeration value="JMS_IBM_Last_Msg_In_Group"/>
 *     &lt;enumeration value="JMS_IBM_MsgType"/>
 *     &lt;enumeration value="JMS_IBM_PutApplType"/>
 *     &lt;enumeration value="JMS_IBM_PutDate"/>
 *     &lt;enumeration value="JMS_IBM_PutTime"/>
 *     &lt;enumeration value="JMS_IBM_Report_COA"/>
 *     &lt;enumeration value="JMS_IBM_Report_COD"/>
 *     &lt;enumeration value="JMS_IBM_Report_Discard_Msg"/>
 *     &lt;enumeration value="JMS_IBM_Report_Exception"/>
 *     &lt;enumeration value="JMS_IBM_Report_Expiration"/>
 *     &lt;enumeration value="JMS_IBM_Report_NAN"/>
 *     &lt;enumeration value="JMS_IBM_Report_PAN"/>
 *     &lt;enumeration value="JMS_IBM_Report_Pass_Correl_ID"/>
 *     &lt;enumeration value="JMS_IBM_Report_Pass_Msg_ID"/>
 *     &lt;enumeration value="JMS_IBM_System_MessageID"/>
 *     &lt;enumeration value="Accept"/>
 *     &lt;enumeration value="Accept-Charset"/>
 *     &lt;enumeration value="Accept-Encoding"/>
 *     &lt;enumeration value="Accept-Language"/>
 *     &lt;enumeration value="Accept-Ranges"/>
 *     &lt;enumeration value="Age"/>
 *     &lt;enumeration value="Allow"/>
 *     &lt;enumeration value="Authorization"/>
 *     &lt;enumeration value="Cache-Control"/>
 *     &lt;enumeration value="Connection"/>
 *     &lt;enumeration value="Content-Encoding"/>
 *     &lt;enumeration value="Content-Language"/>
 *     &lt;enumeration value="Content-Length"/>
 *     &lt;enumeration value="Content-Location"/>
 *     &lt;enumeration value="Content-MD5"/>
 *     &lt;enumeration value="Content-Range"/>
 *     &lt;enumeration value="Content-Type"/>
 *     &lt;enumeration value="Date"/>
 *     &lt;enumeration value="ETag"/>
 *     &lt;enumeration value="Expect"/>
 *     &lt;enumeration value="Expires"/>
 *     &lt;enumeration value="From"/>
 *     &lt;enumeration value="Host"/>
 *     &lt;enumeration value="If-Match"/>
 *     &lt;enumeration value="If-Modified-Since"/>
 *     &lt;enumeration value="If-None-Match"/>
 *     &lt;enumeration value="If-Range"/>
 *     &lt;enumeration value="If-Unmodified-Since"/>
 *     &lt;enumeration value="Last-Modified"/>
 *     &lt;enumeration value="Location"/>
 *     &lt;enumeration value="Max-Forwards"/>
 *     &lt;enumeration value="Pragma"/>
 *     &lt;enumeration value="Proxy-Authenticate"/>
 *     &lt;enumeration value="Proxy-Authorization"/>
 *     &lt;enumeration value="Range"/>
 *     &lt;enumeration value="Referer"/>
 *     &lt;enumeration value="Retry-After"/>
 *     &lt;enumeration value="Server"/>
 *     &lt;enumeration value="TE"/>
 *     &lt;enumeration value="Trailer"/>
 *     &lt;enumeration value="Transfer-Encoding"/>
 *     &lt;enumeration value="Upgrade"/>
 *     &lt;enumeration value="User-Agent"/>
 *     &lt;enumeration value="Vary"/>
 *     &lt;enumeration value="Via"/>
 *     &lt;enumeration value="Warning"/>
 *     &lt;enumeration value="WWW-Authenticate"/>
 *     &lt;enumeration value="SOAPAction"/>
 *     &lt;enumeration value="X-Attachment"/>
 *     &lt;enumeration value="X-Backside-Transport"/>
 *     &lt;enumeration value="X-DataPower-External-Request"/>
 *     &lt;enumeration value="X-Forwarded-for"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "dmVirtualHeader")
@XmlEnum
public enum DmVirtualHeader {

    MQMD("MQMD"),
    @XmlEnumValue("X-MQ-Receive-Q")
    X_MQ_RECEIVE_Q("X-MQ-Receive-Q"),
    @XmlEnumValue("X-MQ-Send-Q")
    X_MQ_SEND_Q("X-MQ-Send-Q"),
    @XmlEnumValue("JMSCorrelationID")
    JMS_CORRELATION_ID("JMSCorrelationID"),
    @XmlEnumValue("JMSDeliveryMode")
    JMS_DELIVERY_MODE("JMSDeliveryMode"),
    @XmlEnumValue("JMSDestination")
    JMS_DESTINATION("JMSDestination"),
    @XmlEnumValue("JMSExpiration")
    JMS_EXPIRATION("JMSExpiration"),
    @XmlEnumValue("JMSMessageID")
    JMS_MESSAGE_ID("JMSMessageID"),
    @XmlEnumValue("JMSPriority")
    JMS_PRIORITY("JMSPriority"),
    @XmlEnumValue("JMSRedelivered")
    JMS_REDELIVERED("JMSRedelivered"),
    @XmlEnumValue("JMSReplyTo")
    JMS_REPLY_TO("JMSReplyTo"),
    @XmlEnumValue("JMSTimestamp")
    JMS_TIMESTAMP("JMSTimestamp"),
    @XmlEnumValue("JMSType")
    JMS_TYPE("JMSType"),
    @XmlEnumValue("JMSXUserID")
    JMSX_USER_ID("JMSXUserID"),
    @XmlEnumValue("JMSXAppID")
    JMSX_APP_ID("JMSXAppID"),
    @XmlEnumValue("JMSXDeliveryCount")
    JMSX_DELIVERY_COUNT("JMSXDeliveryCount"),
    @XmlEnumValue("JMSXGroupID")
    JMSX_GROUP_ID("JMSXGroupID"),
    @XmlEnumValue("JMSXGroupSeq")
    JMSX_GROUP_SEQ("JMSXGroupSeq"),
    @XmlEnumValue("JMSXProducerTXID")
    JMSX_PRODUCER_TXID("JMSXProducerTXID"),
    @XmlEnumValue("JMSXConsumerTXID")
    JMSX_CONSUMER_TXID("JMSXConsumerTXID"),
    @XmlEnumValue("JMSXRcvTimestamp")
    JMSX_RCV_TIMESTAMP("JMSXRcvTimestamp"),
    @XmlEnumValue("JMSXState")
    JMSX_STATE("JMSXState"),
    @XmlEnumValue("DP_JMSMessageType")
    DP_JMS_MESSAGE_TYPE("DP_JMSMessageType"),
    @XmlEnumValue("DP_JMSReplyToServer")
    DP_JMS_REPLY_TO_SERVER("DP_JMSReplyToServer"),
    @XmlEnumValue("DP_JMSReplyToTopicSpace")
    DP_JMS_REPLY_TO_TOPIC_SPACE("DP_JMSReplyToTopicSpace"),
    JMS_TIBCO_COMPRESS("JMS_TIBCO_COMPRESS"),
    JMS_TIBCO_IMPORTED("JMS_TIBCO_IMPORTED"),
    JMS_TIBCO_SENDER("JMS_TIBCO_SENDER"),
    JMS_TIBCO_DISABLE_SENDER("JMS_TIBCO_DISABLE_SENDER"),
    JMS_TIBCO_PRESERVE_UNDELIVERED("JMS_TIBCO_PRESERVE_UNDELIVERED"),
    JMS_TIBCO_MSG_EXT("JMS_TIBCO_MSG_EXT"),
    JMS_TIBCO_MSG_TRACE("JMS_TIBCO_MSG_TRACE"),
    JMS_TIBCO_CM_PUBLISHER("JMS_TIBCO_CM_PUBLISHER"),
    JMS_TIBCO_CM_SEQUENCE("JMS_TIBCO_CM_SEQUENCE"),
    JMS_TIBCO_SS_SENDER("JMS_TIBCO_SS_SENDER"),
    JMS_TIBCO_SS_DELIVERY_MODE("JMS_TIBCO_SS_DELIVERY_MODE"),
    JMS_TIBCO_SS_EXPIRATION("JMS_TIBCO_SS_EXPIRATION"),
    JMS_TIBCO_SS_LB_MODE("JMS_TIBCO_SS_LB_MODE"),
    JMS_TIBCO_SS_MESSAGE_ID("JMS_TIBCO_SS_MESSAGE_ID"),
    JMS_TIBCO_SS_PRIORITY("JMS_TIBCO_SS_PRIORITY"),
    JMS_TIBCO_SS_SENDER_TIMESTAMP("JMS_TIBCO_SS_SENDER_TIMESTAMP"),
    JMS_TIBCO_SS_TYPE_NUM("JMS_TIBCO_SS_TYPE_NUM"),
    JMS_TIBCO_SS_CORRELATION_ID("JMS_TIBCO_SS_CORRELATION_ID"),
    JMS_TIBCO_SS_SEQ_NUM("JMS_TIBCO_SS_SEQ_NUM"),
    JMS_TIBCO_SS_USER_PROP("JMS_TIBCO_SS_USER_PROP"),
    @XmlEnumValue("JMS_IBM_Character_Set")
    JMS_IBM_CHARACTER_SET("JMS_IBM_Character_Set"),
    @XmlEnumValue("JMS_IBM_Encoding")
    JMS_IBM_ENCODING("JMS_IBM_Encoding"),
    @XmlEnumValue("JMS_IBM_ExceptionMessage")
    JMS_IBM_EXCEPTION_MESSAGE("JMS_IBM_ExceptionMessage"),
    @XmlEnumValue("JMS_IBM_ExceptionReason")
    JMS_IBM_EXCEPTION_REASON("JMS_IBM_ExceptionReason"),
    @XmlEnumValue("JMS_IBM_ExceptionTimestamp")
    JMS_IBM_EXCEPTION_TIMESTAMP("JMS_IBM_ExceptionTimestamp"),
    @XmlEnumValue("JMS_IBM_ExceptionProblemDestination")
    JMS_IBM_EXCEPTION_PROBLEM_DESTINATION("JMS_IBM_ExceptionProblemDestination"),
    @XmlEnumValue("JMS_IBM_Feedback")
    JMS_IBM_FEEDBACK("JMS_IBM_Feedback"),
    @XmlEnumValue("JMS_IBM_Format")
    JMS_IBM_FORMAT("JMS_IBM_Format"),
    @XmlEnumValue("JMS_IBM_Last_Msg_In_Group")
    JMS_IBM_LAST_MSG_IN_GROUP("JMS_IBM_Last_Msg_In_Group"),
    @XmlEnumValue("JMS_IBM_MsgType")
    JMS_IBM_MSG_TYPE("JMS_IBM_MsgType"),
    @XmlEnumValue("JMS_IBM_PutApplType")
    JMS_IBM_PUT_APPL_TYPE("JMS_IBM_PutApplType"),
    @XmlEnumValue("JMS_IBM_PutDate")
    JMS_IBM_PUT_DATE("JMS_IBM_PutDate"),
    @XmlEnumValue("JMS_IBM_PutTime")
    JMS_IBM_PUT_TIME("JMS_IBM_PutTime"),
    @XmlEnumValue("JMS_IBM_Report_COA")
    JMS_IBM_REPORT_COA("JMS_IBM_Report_COA"),
    @XmlEnumValue("JMS_IBM_Report_COD")
    JMS_IBM_REPORT_COD("JMS_IBM_Report_COD"),
    @XmlEnumValue("JMS_IBM_Report_Discard_Msg")
    JMS_IBM_REPORT_DISCARD_MSG("JMS_IBM_Report_Discard_Msg"),
    @XmlEnumValue("JMS_IBM_Report_Exception")
    JMS_IBM_REPORT_EXCEPTION("JMS_IBM_Report_Exception"),
    @XmlEnumValue("JMS_IBM_Report_Expiration")
    JMS_IBM_REPORT_EXPIRATION("JMS_IBM_Report_Expiration"),
    @XmlEnumValue("JMS_IBM_Report_NAN")
    JMS_IBM_REPORT_NAN("JMS_IBM_Report_NAN"),
    @XmlEnumValue("JMS_IBM_Report_PAN")
    JMS_IBM_REPORT_PAN("JMS_IBM_Report_PAN"),
    @XmlEnumValue("JMS_IBM_Report_Pass_Correl_ID")
    JMS_IBM_REPORT_PASS_CORREL_ID("JMS_IBM_Report_Pass_Correl_ID"),
    @XmlEnumValue("JMS_IBM_Report_Pass_Msg_ID")
    JMS_IBM_REPORT_PASS_MSG_ID("JMS_IBM_Report_Pass_Msg_ID"),
    @XmlEnumValue("JMS_IBM_System_MessageID")
    JMS_IBM_SYSTEM_MESSAGE_ID("JMS_IBM_System_MessageID"),
    @XmlEnumValue("Accept")
    ACCEPT("Accept"),
    @XmlEnumValue("Accept-Charset")
    ACCEPT_CHARSET("Accept-Charset"),
    @XmlEnumValue("Accept-Encoding")
    ACCEPT_ENCODING("Accept-Encoding"),
    @XmlEnumValue("Accept-Language")
    ACCEPT_LANGUAGE("Accept-Language"),
    @XmlEnumValue("Accept-Ranges")
    ACCEPT_RANGES("Accept-Ranges"),
    @XmlEnumValue("Age")
    AGE("Age"),
    @XmlEnumValue("Allow")
    ALLOW("Allow"),
    @XmlEnumValue("Authorization")
    AUTHORIZATION("Authorization"),
    @XmlEnumValue("Cache-Control")
    CACHE_CONTROL("Cache-Control"),
    @XmlEnumValue("Connection")
    CONNECTION("Connection"),
    @XmlEnumValue("Content-Encoding")
    CONTENT_ENCODING("Content-Encoding"),
    @XmlEnumValue("Content-Language")
    CONTENT_LANGUAGE("Content-Language"),
    @XmlEnumValue("Content-Length")
    CONTENT_LENGTH("Content-Length"),
    @XmlEnumValue("Content-Location")
    CONTENT_LOCATION("Content-Location"),
    @XmlEnumValue("Content-MD5")
    CONTENT_MD_5("Content-MD5"),
    @XmlEnumValue("Content-Range")
    CONTENT_RANGE("Content-Range"),
    @XmlEnumValue("Content-Type")
    CONTENT_TYPE("Content-Type"),
    @XmlEnumValue("Date")
    DATE("Date"),
    @XmlEnumValue("ETag")
    E_TAG("ETag"),
    @XmlEnumValue("Expect")
    EXPECT("Expect"),
    @XmlEnumValue("Expires")
    EXPIRES("Expires"),
    @XmlEnumValue("From")
    FROM("From"),
    @XmlEnumValue("Host")
    HOST("Host"),
    @XmlEnumValue("If-Match")
    IF_MATCH("If-Match"),
    @XmlEnumValue("If-Modified-Since")
    IF_MODIFIED_SINCE("If-Modified-Since"),
    @XmlEnumValue("If-None-Match")
    IF_NONE_MATCH("If-None-Match"),
    @XmlEnumValue("If-Range")
    IF_RANGE("If-Range"),
    @XmlEnumValue("If-Unmodified-Since")
    IF_UNMODIFIED_SINCE("If-Unmodified-Since"),
    @XmlEnumValue("Last-Modified")
    LAST_MODIFIED("Last-Modified"),
    @XmlEnumValue("Location")
    LOCATION("Location"),
    @XmlEnumValue("Max-Forwards")
    MAX_FORWARDS("Max-Forwards"),
    @XmlEnumValue("Pragma")
    PRAGMA("Pragma"),
    @XmlEnumValue("Proxy-Authenticate")
    PROXY_AUTHENTICATE("Proxy-Authenticate"),
    @XmlEnumValue("Proxy-Authorization")
    PROXY_AUTHORIZATION("Proxy-Authorization"),
    @XmlEnumValue("Range")
    RANGE("Range"),
    @XmlEnumValue("Referer")
    REFERER("Referer"),
    @XmlEnumValue("Retry-After")
    RETRY_AFTER("Retry-After"),
    @XmlEnumValue("Server")
    SERVER("Server"),
    TE("TE"),
    @XmlEnumValue("Trailer")
    TRAILER("Trailer"),
    @XmlEnumValue("Transfer-Encoding")
    TRANSFER_ENCODING("Transfer-Encoding"),
    @XmlEnumValue("Upgrade")
    UPGRADE("Upgrade"),
    @XmlEnumValue("User-Agent")
    USER_AGENT("User-Agent"),
    @XmlEnumValue("Vary")
    VARY("Vary"),
    @XmlEnumValue("Via")
    VIA("Via"),
    @XmlEnumValue("Warning")
    WARNING("Warning"),
    @XmlEnumValue("WWW-Authenticate")
    WWW_AUTHENTICATE("WWW-Authenticate"),
    @XmlEnumValue("SOAPAction")
    SOAP_ACTION("SOAPAction"),
    @XmlEnumValue("X-Attachment")
    X_ATTACHMENT("X-Attachment"),
    @XmlEnumValue("X-Backside-Transport")
    X_BACKSIDE_TRANSPORT("X-Backside-Transport"),
    @XmlEnumValue("X-DataPower-External-Request")
    X_DATA_POWER_EXTERNAL_REQUEST("X-DataPower-External-Request"),
    @XmlEnumValue("X-Forwarded-for")
    X_FORWARDED_FOR("X-Forwarded-for");
    private final String value;

    DmVirtualHeader(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DmVirtualHeader fromValue(String v) {
        for (DmVirtualHeader c: DmVirtualHeader.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
