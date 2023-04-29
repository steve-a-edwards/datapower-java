
package client.soma.generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dmServiceVar.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="dmServiceVar">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="var://service/content-type"/>
 *     &lt;enumeration value="var://service/urlopener-factory"/>
 *     &lt;enumeration value="var://service/max-message-size"/>
 *     &lt;enumeration value="var://service/include-charset"/>
 *     &lt;enumeration value="var://service/raw-mode"/>
 *     &lt;enumeration value="var://service/response-mode"/>
 *     &lt;enumeration value="var://service/webgui-mode"/>
 *     &lt;enumeration value="var://service/expect-mime-headers"/>
 *     &lt;enumeration value="var://service/url-as-dpurl"/>
 *     &lt;enumeration value="var://service/rule-selection-header"/>
 *     &lt;enumeration value="var://service/rule-direction"/>
 *     &lt;enumeration value="var://service/parser-flags"/>
 *     &lt;enumeration value="var://service/log-parser-error-at-debug-level"/>
 *     &lt;enumeration value="var://service/back-processing-mode"/>
 *     &lt;enumeration value="var://service/error-cause"/>
 *     &lt;enumeration value="var://service/soap-schema-url"/>
 *     &lt;enumeration value="var://service/soap-enable-mode"/>
 *     &lt;enumeration value="var://service/soap-error-level"/>
 *     &lt;enumeration value="var://service/next-attachment-uri"/>
 *     &lt;enumeration value="var://service/max-attachment-size"/>
 *     &lt;enumeration value="var://service/max-attachment-pkg-size"/>
 *     &lt;enumeration value="var://service/attachment-detection-offset"/>
 *     &lt;enumeration value="var://service/input-is-package-part"/>
 *     &lt;enumeration value="var://service/input-is-root-part"/>
 *     &lt;enumeration value="var://service/ap_conformance/MIMErequirements"/>
 *     &lt;enumeration value="var://service/attachment-streaming-mode"/>
 *     &lt;enumeration value="var://service/ss-ready-stamp"/>
 *     &lt;enumeration value="var://service/doc-ready-stamp"/>
 *     &lt;enumeration value="var://service/wsrm/pause"/>
 *     &lt;enumeration value="var://service/wsrm/resume"/>
 *     &lt;enumeration value="var://service/wsrm/aaa-policy-name"/>
 *     &lt;enumeration value="var://service/wsrm/aaa-conditional-xpath"/>
 *     &lt;enumeration value="var://service/slm-policy-name"/>
 *     &lt;enumeration value="var://service/output2original"/>
 *     &lt;enumeration value="var://service/set-ulog"/>
 *     &lt;enumeration value="var://service/aaa/ok"/>
 *     &lt;enumeration value="var://service/aaa-error-logs"/>
 *     &lt;enumeration value="var://service/aaa/username"/>
 *     &lt;enumeration value="var://service/aaa/password"/>
 *     &lt;enumeration value="var://service/transaction-step"/>
 *     &lt;enumeration value="var://service/transaction-session-id"/>
 *     &lt;enumeration value="var://service/transaction-trace"/>
 *     &lt;enumeration value="var://service/transaction-abort"/>
 *     &lt;enumeration value="var://service/trace/call/"/>
 *     &lt;enumeration value="var://service/trace/flush"/>
 *     &lt;enumeration value="var://service/debug-mode"/>
 *     &lt;enumeration value="var://service/config"/>
 *     &lt;enumeration value="var://service/system/ident"/>
 *     &lt;enumeration value="var://service/system/status"/>
 *     &lt;enumeration value="var://service/system/config/"/>
 *     &lt;enumeration value="var://service/cache/"/>
 *     &lt;enumeration value="var://service/ws-security-policy/symmetric-binding-info"/>
 *     &lt;enumeration value="var://service/ws-security-policy/asymmetric-binding-info"/>
 *     &lt;enumeration value="var://service/URL-in"/>
 *     &lt;enumeration value="var://service/URL-out"/>
 *     &lt;enumeration value="var://service/URI"/>
 *     &lt;enumeration value="var://service/local-service-address"/>
 *     &lt;enumeration value="var://service/client-service-address"/>
 *     &lt;enumeration value="var://service/protocol"/>
 *     &lt;enumeration value="var://service/protocol-method"/>
 *     &lt;enumeration value="var://service/time-started"/>
 *     &lt;enumeration value="var://service/time-forwarded"/>
 *     &lt;enumeration value="var://service/time-response-complete"/>
 *     &lt;enumeration value="var://service/time-elapsed"/>
 *     &lt;enumeration value="var://service/memory-used"/>
 *     &lt;enumeration value="var://service/transaction-key"/>
 *     &lt;enumeration value="var://service/transaction-timeout"/>
 *     &lt;enumeration value="var://service/transaction-name"/>
 *     &lt;enumeration value="var://service/error-code"/>
 *     &lt;enumeration value="var://service/error-message"/>
 *     &lt;enumeration value="var://service/error-protocol-response"/>
 *     &lt;enumeration value="var://service/xmlreqrspmode"/>
 *     &lt;enumeration value="var://service/error-protocol-reason-phrase"/>
 *     &lt;enumeration value="var://service/error-subcode"/>
 *     &lt;enumeration value="var://service/error-headers"/>
 *     &lt;enumeration value="var://service/formatted-error-message"/>
 *     &lt;enumeration value="var://service/error-ignore"/>
 *     &lt;enumeration value="var://service/strict-error-mode"/>
 *     &lt;enumeration value="var://service/soap-fault-response"/>
 *     &lt;enumeration value="var://service/soap-oneway-mep"/>
 *     &lt;enumeration value="var://service/xmlmgr-name"/>
 *     &lt;enumeration value="var://service/domain-name"/>
 *     &lt;enumeration value="var://service/default-stylesheet"/>
 *     &lt;enumeration value="var://service/processor-type"/>
 *     &lt;enumeration value="var://service/processor-name"/>
 *     &lt;enumeration value="var://service/max-call-depth"/>
 *     &lt;enumeration value="var://service/max-action-depth"/>
 *     &lt;enumeration value="var://service/system/frontwsdl"/>
 *     &lt;enumeration value="var://service/front-attachment-format"/>
 *     &lt;enumeration value="var://service/back-attachment-format"/>
 *     &lt;enumeration value="var://service/config-param/"/>
 *     &lt;enumeration value="var://service/lbhealth/"/>
 *     &lt;enumeration value="var://service/lb/group"/>
 *     &lt;enumeration value="var://service/lb/member"/>
 *     &lt;enumeration value="var://service/lb/hash"/>
 *     &lt;enumeration value="var://service/transaction-id"/>
 *     &lt;enumeration value="var://service/transaction-client"/>
 *     &lt;enumeration value="var://service/transaction-rule-name"/>
 *     &lt;enumeration value="var://service/transaction-rule-type"/>
 *     &lt;enumeration value="var://service/transaction-policy-name"/>
 *     &lt;enumeration value="var://service/transaction-audit-trail"/>
 *     &lt;enumeration value="var://service/current-call-depth"/>
 *     &lt;enumeration value="var://service/input-size"/>
 *     &lt;enumeration value="var://service/routing-url"/>
 *     &lt;enumeration value="var://service/routing-url-sslprofile"/>
 *     &lt;enumeration value="var://service/routing-url-delay-content-type-determination"/>
 *     &lt;enumeration value="var://service/persistent-connection-counter"/>
 *     &lt;enumeration value="var://service/connection/note"/>
 *     &lt;enumeration value="var://service/mpgw/skip-backside"/>
 *     &lt;enumeration value="var://service/mpgw/backend-timeout"/>
 *     &lt;enumeration value="var://service/mpgw/request-size"/>
 *     &lt;enumeration value="var://service/mpgw/response-size"/>
 *     &lt;enumeration value="var://service/mpgw/flow-control-enabled"/>
 *     &lt;enumeration value="var://service/header-manifest"/>
 *     &lt;enumeration value="var://service/set-request-header/"/>
 *     &lt;enumeration value="var://service/append-request-header/"/>
 *     &lt;enumeration value="var://service/set-response-header/"/>
 *     &lt;enumeration value="var://service/append-response-header/"/>
 *     &lt;enumeration value="var://service/original-content-type"/>
 *     &lt;enumeration value="var://service/report"/>
 *     &lt;enumeration value="var://service/message-type"/>
 *     &lt;enumeration value="var://service/expiry"/>
 *     &lt;enumeration value="var://service/format"/>
 *     &lt;enumeration value="var://service/priority"/>
 *     &lt;enumeration value="var://service/persistence"/>
 *     &lt;enumeration value="var://service/message-identifier"/>
 *     &lt;enumeration value="var://service/correlation-identifier"/>
 *     &lt;enumeration value="var://service/backout-count"/>
 *     &lt;enumeration value="var://service/reply-to-q"/>
 *     &lt;enumeration value="var://service/reply-to-qm"/>
 *     &lt;enumeration value="var://service/mqmd-reply-to-q"/>
 *     &lt;enumeration value="var://service/mqmd-reply-to-qm"/>
 *     &lt;enumeration value="var://service/user-identifier"/>
 *     &lt;enumeration value="var://service/accounting-token"/>
 *     &lt;enumeration value="var://service/put-date"/>
 *     &lt;enumeration value="var://service/put-time"/>
 *     &lt;enumeration value="var://service/original-length"/>
 *     &lt;enumeration value="var://service/mq-error-code"/>
 *     &lt;enumeration value="var://service/mq-ccsi"/>
 *     &lt;enumeration value="var://service/wsm/enabled"/>
 *     &lt;enumeration value="var://service/wsm/wsdl-source-class"/>
 *     &lt;enumeration value="var://service/wsm/wsdl-source"/>
 *     &lt;enumeration value="var://service/wsm/wsdl"/>
 *     &lt;enumeration value="var://service/wsm/service"/>
 *     &lt;enumeration value="var://service/wsm/service-port"/>
 *     &lt;enumeration value="var://service/wsm/back-service-port"/>
 *     &lt;enumeration value="var://service/wsm/binding"/>
 *     &lt;enumeration value="var://service/wsm/back-binding"/>
 *     &lt;enumeration value="var://service/wsm/binding-data"/>
 *     &lt;enumeration value="var://service/wsm/back-binding-data"/>
 *     &lt;enumeration value="var://service/wsm/operation"/>
 *     &lt;enumeration value="var://service/wsm/back-operation"/>
 *     &lt;enumeration value="var://service/wsm/service-port-operation"/>
 *     &lt;enumeration value="var://service/wsm/back-service-port-operation"/>
 *     &lt;enumeration value="var://service/wsm/validate-faults"/>
 *     &lt;enumeration value="var://service/wsm/validate-headers"/>
 *     &lt;enumeration value="var://service/wsm/strict-fault-document-style"/>
 *     &lt;enumeration value="var://service/wsm/schemalocation"/>
 *     &lt;enumeration value="var://service/wsm/part-exists/"/>
 *     &lt;enumeration value="var://service/wsm/part-is-xml-element/"/>
 *     &lt;enumeration value="var://service/wsm/num-subschema"/>
 *     &lt;enumeration value="var://service/wsm/wsdl-error"/>
 *     &lt;enumeration value="var://service/wsm/wsdl-warning"/>
 *     &lt;enumeration value="var://service/wsm/validate-message"/>
 *     &lt;enumeration value="var://service/wsm/resolve-hrefs"/>
 *     &lt;enumeration value="var://service/wsm/aaa-policy-name"/>
 *     &lt;enumeration value="var://service/wspolicy/required-policy-subjects"/>
 *     &lt;enumeration value="var://service/wspolicy/enforcement-mode"/>
 *     &lt;enumeration value="var://service/wspolicy/endpoint/configname"/>
 *     &lt;enumeration value="var://service/wspolicy/service/configname"/>
 *     &lt;enumeration value="var://service/wspolicy/operation/configname"/>
 *     &lt;enumeration value="var://service/wspolicy/message/configname"/>
 *     &lt;enumeration value="var://service/conformance/policyname"/>
 *     &lt;enumeration value="var://service/conformance/generatedPolicy"/>
 *     &lt;enumeration value="var://service/wsa/timeout"/>
 *     &lt;enumeration value="var://service/wsa/genpattern"/>
 *     &lt;enumeration value="var://service/multistep/input-context-name"/>
 *     &lt;enumeration value="var://service/multistep/output-context-name"/>
 *     &lt;enumeration value="var://service/multistep/clientid"/>
 *     &lt;enumeration value="var://service/multistep/cidextmthd"/>
 *     &lt;enumeration value="var://service/multistep/aumthd"/>
 *     &lt;enumeration value="var://service/multistep/clientsocode"/>
 *     &lt;enumeration value="var://service/multistep/clienthopcount"/>
 *     &lt;enumeration value="var://service/multistep/mysocode"/>
 *     &lt;enumeration value="var://service/multistep/targetsocode"/>
 *     &lt;enumeration value="var://service/multistep/kdversion"/>
 *     &lt;enumeration value="var://service/multistep/serversocode"/>
 *     &lt;enumeration value="var://service/multistep/serverhopcount"/>
 *     &lt;enumeration value="var://service/multistep/sfid"/>
 *     &lt;enumeration value="var://service/multistep/loop-iterator"/>
 *     &lt;enumeration value="var://service/multistep/loop-count"/>
 *     &lt;enumeration value="var://service/multistep/tx-warn"/>
 *     &lt;enumeration value="var://service/qos/priority"/>
 *     &lt;enumeration value="var://service/wsm/front-protocol"/>
 *     &lt;enumeration value="var://service/wsm/back-protocol"/>
 *     &lt;enumeration value="var://service/wsm/http-parsed-url-replacement"/>
 *     &lt;enumeration value="var://service/wsm/wsdl-content-type"/>
 *     &lt;enumeration value="var://service/log/soapversion"/>
 *     &lt;enumeration value="var://service/multistep/contexts"/>
 *     &lt;enumeration value="var://service/rewrite-errors"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "dmServiceVar")
@XmlEnum
public enum DmServiceVar {

    @XmlEnumValue("var://service/content-type")
    VAR_SERVICE_CONTENT_TYPE("var://service/content-type"),
    @XmlEnumValue("var://service/urlopener-factory")
    VAR_SERVICE_URLOPENER_FACTORY("var://service/urlopener-factory"),
    @XmlEnumValue("var://service/max-message-size")
    VAR_SERVICE_MAX_MESSAGE_SIZE("var://service/max-message-size"),
    @XmlEnumValue("var://service/include-charset")
    VAR_SERVICE_INCLUDE_CHARSET("var://service/include-charset"),
    @XmlEnumValue("var://service/raw-mode")
    VAR_SERVICE_RAW_MODE("var://service/raw-mode"),
    @XmlEnumValue("var://service/response-mode")
    VAR_SERVICE_RESPONSE_MODE("var://service/response-mode"),
    @XmlEnumValue("var://service/webgui-mode")
    VAR_SERVICE_WEBGUI_MODE("var://service/webgui-mode"),
    @XmlEnumValue("var://service/expect-mime-headers")
    VAR_SERVICE_EXPECT_MIME_HEADERS("var://service/expect-mime-headers"),
    @XmlEnumValue("var://service/url-as-dpurl")
    VAR_SERVICE_URL_AS_DPURL("var://service/url-as-dpurl"),
    @XmlEnumValue("var://service/rule-selection-header")
    VAR_SERVICE_RULE_SELECTION_HEADER("var://service/rule-selection-header"),
    @XmlEnumValue("var://service/rule-direction")
    VAR_SERVICE_RULE_DIRECTION("var://service/rule-direction"),
    @XmlEnumValue("var://service/parser-flags")
    VAR_SERVICE_PARSER_FLAGS("var://service/parser-flags"),
    @XmlEnumValue("var://service/log-parser-error-at-debug-level")
    VAR_SERVICE_LOG_PARSER_ERROR_AT_DEBUG_LEVEL("var://service/log-parser-error-at-debug-level"),
    @XmlEnumValue("var://service/back-processing-mode")
    VAR_SERVICE_BACK_PROCESSING_MODE("var://service/back-processing-mode"),
    @XmlEnumValue("var://service/error-cause")
    VAR_SERVICE_ERROR_CAUSE("var://service/error-cause"),
    @XmlEnumValue("var://service/soap-schema-url")
    VAR_SERVICE_SOAP_SCHEMA_URL("var://service/soap-schema-url"),
    @XmlEnumValue("var://service/soap-enable-mode")
    VAR_SERVICE_SOAP_ENABLE_MODE("var://service/soap-enable-mode"),
    @XmlEnumValue("var://service/soap-error-level")
    VAR_SERVICE_SOAP_ERROR_LEVEL("var://service/soap-error-level"),
    @XmlEnumValue("var://service/next-attachment-uri")
    VAR_SERVICE_NEXT_ATTACHMENT_URI("var://service/next-attachment-uri"),
    @XmlEnumValue("var://service/max-attachment-size")
    VAR_SERVICE_MAX_ATTACHMENT_SIZE("var://service/max-attachment-size"),
    @XmlEnumValue("var://service/max-attachment-pkg-size")
    VAR_SERVICE_MAX_ATTACHMENT_PKG_SIZE("var://service/max-attachment-pkg-size"),
    @XmlEnumValue("var://service/attachment-detection-offset")
    VAR_SERVICE_ATTACHMENT_DETECTION_OFFSET("var://service/attachment-detection-offset"),
    @XmlEnumValue("var://service/input-is-package-part")
    VAR_SERVICE_INPUT_IS_PACKAGE_PART("var://service/input-is-package-part"),
    @XmlEnumValue("var://service/input-is-root-part")
    VAR_SERVICE_INPUT_IS_ROOT_PART("var://service/input-is-root-part"),
    @XmlEnumValue("var://service/ap_conformance/MIMErequirements")
    VAR_SERVICE_AP_CONFORMANCE_MIM_EREQUIREMENTS("var://service/ap_conformance/MIMErequirements"),
    @XmlEnumValue("var://service/attachment-streaming-mode")
    VAR_SERVICE_ATTACHMENT_STREAMING_MODE("var://service/attachment-streaming-mode"),
    @XmlEnumValue("var://service/ss-ready-stamp")
    VAR_SERVICE_SS_READY_STAMP("var://service/ss-ready-stamp"),
    @XmlEnumValue("var://service/doc-ready-stamp")
    VAR_SERVICE_DOC_READY_STAMP("var://service/doc-ready-stamp"),
    @XmlEnumValue("var://service/wsrm/pause")
    VAR_SERVICE_WSRM_PAUSE("var://service/wsrm/pause"),
    @XmlEnumValue("var://service/wsrm/resume")
    VAR_SERVICE_WSRM_RESUME("var://service/wsrm/resume"),
    @XmlEnumValue("var://service/wsrm/aaa-policy-name")
    VAR_SERVICE_WSRM_AAA_POLICY_NAME("var://service/wsrm/aaa-policy-name"),
    @XmlEnumValue("var://service/wsrm/aaa-conditional-xpath")
    VAR_SERVICE_WSRM_AAA_CONDITIONAL_XPATH("var://service/wsrm/aaa-conditional-xpath"),
    @XmlEnumValue("var://service/slm-policy-name")
    VAR_SERVICE_SLM_POLICY_NAME("var://service/slm-policy-name"),
    @XmlEnumValue("var://service/output2original")
    VAR_SERVICE_OUTPUT_2_ORIGINAL("var://service/output2original"),
    @XmlEnumValue("var://service/set-ulog")
    VAR_SERVICE_SET_ULOG("var://service/set-ulog"),
    @XmlEnumValue("var://service/aaa/ok")
    VAR_SERVICE_AAA_OK("var://service/aaa/ok"),
    @XmlEnumValue("var://service/aaa-error-logs")
    VAR_SERVICE_AAA_ERROR_LOGS("var://service/aaa-error-logs"),
    @XmlEnumValue("var://service/aaa/username")
    VAR_SERVICE_AAA_USERNAME("var://service/aaa/username"),
    @XmlEnumValue("var://service/aaa/password")
    VAR_SERVICE_AAA_PASSWORD("var://service/aaa/password"),
    @XmlEnumValue("var://service/transaction-step")
    VAR_SERVICE_TRANSACTION_STEP("var://service/transaction-step"),
    @XmlEnumValue("var://service/transaction-session-id")
    VAR_SERVICE_TRANSACTION_SESSION_ID("var://service/transaction-session-id"),
    @XmlEnumValue("var://service/transaction-trace")
    VAR_SERVICE_TRANSACTION_TRACE("var://service/transaction-trace"),
    @XmlEnumValue("var://service/transaction-abort")
    VAR_SERVICE_TRANSACTION_ABORT("var://service/transaction-abort"),
    @XmlEnumValue("var://service/trace/call/")
    VAR_SERVICE_TRACE_CALL("var://service/trace/call/"),
    @XmlEnumValue("var://service/trace/flush")
    VAR_SERVICE_TRACE_FLUSH("var://service/trace/flush"),
    @XmlEnumValue("var://service/debug-mode")
    VAR_SERVICE_DEBUG_MODE("var://service/debug-mode"),
    @XmlEnumValue("var://service/config")
    VAR_SERVICE_CONFIG("var://service/config"),
    @XmlEnumValue("var://service/system/ident")
    VAR_SERVICE_SYSTEM_IDENT("var://service/system/ident"),
    @XmlEnumValue("var://service/system/status")
    VAR_SERVICE_SYSTEM_STATUS("var://service/system/status"),
    @XmlEnumValue("var://service/system/config/")
    VAR_SERVICE_SYSTEM_CONFIG("var://service/system/config/"),
    @XmlEnumValue("var://service/cache/")
    VAR_SERVICE_CACHE("var://service/cache/"),
    @XmlEnumValue("var://service/ws-security-policy/symmetric-binding-info")
    VAR_SERVICE_WS_SECURITY_POLICY_SYMMETRIC_BINDING_INFO("var://service/ws-security-policy/symmetric-binding-info"),
    @XmlEnumValue("var://service/ws-security-policy/asymmetric-binding-info")
    VAR_SERVICE_WS_SECURITY_POLICY_ASYMMETRIC_BINDING_INFO("var://service/ws-security-policy/asymmetric-binding-info"),
    @XmlEnumValue("var://service/URL-in")
    VAR_SERVICE_URL_IN("var://service/URL-in"),
    @XmlEnumValue("var://service/URL-out")
    VAR_SERVICE_URL_OUT("var://service/URL-out"),
    @XmlEnumValue("var://service/URI")
    VAR_SERVICE_URI("var://service/URI"),
    @XmlEnumValue("var://service/local-service-address")
    VAR_SERVICE_LOCAL_SERVICE_ADDRESS("var://service/local-service-address"),
    @XmlEnumValue("var://service/client-service-address")
    VAR_SERVICE_CLIENT_SERVICE_ADDRESS("var://service/client-service-address"),
    @XmlEnumValue("var://service/protocol")
    VAR_SERVICE_PROTOCOL("var://service/protocol"),
    @XmlEnumValue("var://service/protocol-method")
    VAR_SERVICE_PROTOCOL_METHOD("var://service/protocol-method"),
    @XmlEnumValue("var://service/time-started")
    VAR_SERVICE_TIME_STARTED("var://service/time-started"),
    @XmlEnumValue("var://service/time-forwarded")
    VAR_SERVICE_TIME_FORWARDED("var://service/time-forwarded"),
    @XmlEnumValue("var://service/time-response-complete")
    VAR_SERVICE_TIME_RESPONSE_COMPLETE("var://service/time-response-complete"),
    @XmlEnumValue("var://service/time-elapsed")
    VAR_SERVICE_TIME_ELAPSED("var://service/time-elapsed"),
    @XmlEnumValue("var://service/memory-used")
    VAR_SERVICE_MEMORY_USED("var://service/memory-used"),
    @XmlEnumValue("var://service/transaction-key")
    VAR_SERVICE_TRANSACTION_KEY("var://service/transaction-key"),
    @XmlEnumValue("var://service/transaction-timeout")
    VAR_SERVICE_TRANSACTION_TIMEOUT("var://service/transaction-timeout"),
    @XmlEnumValue("var://service/transaction-name")
    VAR_SERVICE_TRANSACTION_NAME("var://service/transaction-name"),
    @XmlEnumValue("var://service/error-code")
    VAR_SERVICE_ERROR_CODE("var://service/error-code"),
    @XmlEnumValue("var://service/error-message")
    VAR_SERVICE_ERROR_MESSAGE("var://service/error-message"),
    @XmlEnumValue("var://service/error-protocol-response")
    VAR_SERVICE_ERROR_PROTOCOL_RESPONSE("var://service/error-protocol-response"),
    @XmlEnumValue("var://service/xmlreqrspmode")
    VAR_SERVICE_XMLREQRSPMODE("var://service/xmlreqrspmode"),
    @XmlEnumValue("var://service/error-protocol-reason-phrase")
    VAR_SERVICE_ERROR_PROTOCOL_REASON_PHRASE("var://service/error-protocol-reason-phrase"),
    @XmlEnumValue("var://service/error-subcode")
    VAR_SERVICE_ERROR_SUBCODE("var://service/error-subcode"),
    @XmlEnumValue("var://service/error-headers")
    VAR_SERVICE_ERROR_HEADERS("var://service/error-headers"),
    @XmlEnumValue("var://service/formatted-error-message")
    VAR_SERVICE_FORMATTED_ERROR_MESSAGE("var://service/formatted-error-message"),
    @XmlEnumValue("var://service/error-ignore")
    VAR_SERVICE_ERROR_IGNORE("var://service/error-ignore"),
    @XmlEnumValue("var://service/strict-error-mode")
    VAR_SERVICE_STRICT_ERROR_MODE("var://service/strict-error-mode"),
    @XmlEnumValue("var://service/soap-fault-response")
    VAR_SERVICE_SOAP_FAULT_RESPONSE("var://service/soap-fault-response"),
    @XmlEnumValue("var://service/soap-oneway-mep")
    VAR_SERVICE_SOAP_ONEWAY_MEP("var://service/soap-oneway-mep"),
    @XmlEnumValue("var://service/xmlmgr-name")
    VAR_SERVICE_XMLMGR_NAME("var://service/xmlmgr-name"),
    @XmlEnumValue("var://service/domain-name")
    VAR_SERVICE_DOMAIN_NAME("var://service/domain-name"),
    @XmlEnumValue("var://service/default-stylesheet")
    VAR_SERVICE_DEFAULT_STYLESHEET("var://service/default-stylesheet"),
    @XmlEnumValue("var://service/processor-type")
    VAR_SERVICE_PROCESSOR_TYPE("var://service/processor-type"),
    @XmlEnumValue("var://service/processor-name")
    VAR_SERVICE_PROCESSOR_NAME("var://service/processor-name"),
    @XmlEnumValue("var://service/max-call-depth")
    VAR_SERVICE_MAX_CALL_DEPTH("var://service/max-call-depth"),
    @XmlEnumValue("var://service/max-action-depth")
    VAR_SERVICE_MAX_ACTION_DEPTH("var://service/max-action-depth"),
    @XmlEnumValue("var://service/system/frontwsdl")
    VAR_SERVICE_SYSTEM_FRONTWSDL("var://service/system/frontwsdl"),
    @XmlEnumValue("var://service/front-attachment-format")
    VAR_SERVICE_FRONT_ATTACHMENT_FORMAT("var://service/front-attachment-format"),
    @XmlEnumValue("var://service/back-attachment-format")
    VAR_SERVICE_BACK_ATTACHMENT_FORMAT("var://service/back-attachment-format"),
    @XmlEnumValue("var://service/config-param/")
    VAR_SERVICE_CONFIG_PARAM("var://service/config-param/"),
    @XmlEnumValue("var://service/lbhealth/")
    VAR_SERVICE_LBHEALTH("var://service/lbhealth/"),
    @XmlEnumValue("var://service/lb/group")
    VAR_SERVICE_LB_GROUP("var://service/lb/group"),
    @XmlEnumValue("var://service/lb/member")
    VAR_SERVICE_LB_MEMBER("var://service/lb/member"),
    @XmlEnumValue("var://service/lb/hash")
    VAR_SERVICE_LB_HASH("var://service/lb/hash"),
    @XmlEnumValue("var://service/transaction-id")
    VAR_SERVICE_TRANSACTION_ID("var://service/transaction-id"),
    @XmlEnumValue("var://service/transaction-client")
    VAR_SERVICE_TRANSACTION_CLIENT("var://service/transaction-client"),
    @XmlEnumValue("var://service/transaction-rule-name")
    VAR_SERVICE_TRANSACTION_RULE_NAME("var://service/transaction-rule-name"),
    @XmlEnumValue("var://service/transaction-rule-type")
    VAR_SERVICE_TRANSACTION_RULE_TYPE("var://service/transaction-rule-type"),
    @XmlEnumValue("var://service/transaction-policy-name")
    VAR_SERVICE_TRANSACTION_POLICY_NAME("var://service/transaction-policy-name"),
    @XmlEnumValue("var://service/transaction-audit-trail")
    VAR_SERVICE_TRANSACTION_AUDIT_TRAIL("var://service/transaction-audit-trail"),
    @XmlEnumValue("var://service/current-call-depth")
    VAR_SERVICE_CURRENT_CALL_DEPTH("var://service/current-call-depth"),
    @XmlEnumValue("var://service/input-size")
    VAR_SERVICE_INPUT_SIZE("var://service/input-size"),
    @XmlEnumValue("var://service/routing-url")
    VAR_SERVICE_ROUTING_URL("var://service/routing-url"),
    @XmlEnumValue("var://service/routing-url-sslprofile")
    VAR_SERVICE_ROUTING_URL_SSLPROFILE("var://service/routing-url-sslprofile"),
    @XmlEnumValue("var://service/routing-url-delay-content-type-determination")
    VAR_SERVICE_ROUTING_URL_DELAY_CONTENT_TYPE_DETERMINATION("var://service/routing-url-delay-content-type-determination"),
    @XmlEnumValue("var://service/persistent-connection-counter")
    VAR_SERVICE_PERSISTENT_CONNECTION_COUNTER("var://service/persistent-connection-counter"),
    @XmlEnumValue("var://service/connection/note")
    VAR_SERVICE_CONNECTION_NOTE("var://service/connection/note"),
    @XmlEnumValue("var://service/mpgw/skip-backside")
    VAR_SERVICE_MPGW_SKIP_BACKSIDE("var://service/mpgw/skip-backside"),
    @XmlEnumValue("var://service/mpgw/backend-timeout")
    VAR_SERVICE_MPGW_BACKEND_TIMEOUT("var://service/mpgw/backend-timeout"),
    @XmlEnumValue("var://service/mpgw/request-size")
    VAR_SERVICE_MPGW_REQUEST_SIZE("var://service/mpgw/request-size"),
    @XmlEnumValue("var://service/mpgw/response-size")
    VAR_SERVICE_MPGW_RESPONSE_SIZE("var://service/mpgw/response-size"),
    @XmlEnumValue("var://service/mpgw/flow-control-enabled")
    VAR_SERVICE_MPGW_FLOW_CONTROL_ENABLED("var://service/mpgw/flow-control-enabled"),
    @XmlEnumValue("var://service/header-manifest")
    VAR_SERVICE_HEADER_MANIFEST("var://service/header-manifest"),
    @XmlEnumValue("var://service/set-request-header/")
    VAR_SERVICE_SET_REQUEST_HEADER("var://service/set-request-header/"),
    @XmlEnumValue("var://service/append-request-header/")
    VAR_SERVICE_APPEND_REQUEST_HEADER("var://service/append-request-header/"),
    @XmlEnumValue("var://service/set-response-header/")
    VAR_SERVICE_SET_RESPONSE_HEADER("var://service/set-response-header/"),
    @XmlEnumValue("var://service/append-response-header/")
    VAR_SERVICE_APPEND_RESPONSE_HEADER("var://service/append-response-header/"),
    @XmlEnumValue("var://service/original-content-type")
    VAR_SERVICE_ORIGINAL_CONTENT_TYPE("var://service/original-content-type"),
    @XmlEnumValue("var://service/report")
    VAR_SERVICE_REPORT("var://service/report"),
    @XmlEnumValue("var://service/message-type")
    VAR_SERVICE_MESSAGE_TYPE("var://service/message-type"),
    @XmlEnumValue("var://service/expiry")
    VAR_SERVICE_EXPIRY("var://service/expiry"),
    @XmlEnumValue("var://service/format")
    VAR_SERVICE_FORMAT("var://service/format"),
    @XmlEnumValue("var://service/priority")
    VAR_SERVICE_PRIORITY("var://service/priority"),
    @XmlEnumValue("var://service/persistence")
    VAR_SERVICE_PERSISTENCE("var://service/persistence"),
    @XmlEnumValue("var://service/message-identifier")
    VAR_SERVICE_MESSAGE_IDENTIFIER("var://service/message-identifier"),
    @XmlEnumValue("var://service/correlation-identifier")
    VAR_SERVICE_CORRELATION_IDENTIFIER("var://service/correlation-identifier"),
    @XmlEnumValue("var://service/backout-count")
    VAR_SERVICE_BACKOUT_COUNT("var://service/backout-count"),
    @XmlEnumValue("var://service/reply-to-q")
    VAR_SERVICE_REPLY_TO_Q("var://service/reply-to-q"),
    @XmlEnumValue("var://service/reply-to-qm")
    VAR_SERVICE_REPLY_TO_QM("var://service/reply-to-qm"),
    @XmlEnumValue("var://service/mqmd-reply-to-q")
    VAR_SERVICE_MQMD_REPLY_TO_Q("var://service/mqmd-reply-to-q"),
    @XmlEnumValue("var://service/mqmd-reply-to-qm")
    VAR_SERVICE_MQMD_REPLY_TO_QM("var://service/mqmd-reply-to-qm"),
    @XmlEnumValue("var://service/user-identifier")
    VAR_SERVICE_USER_IDENTIFIER("var://service/user-identifier"),
    @XmlEnumValue("var://service/accounting-token")
    VAR_SERVICE_ACCOUNTING_TOKEN("var://service/accounting-token"),
    @XmlEnumValue("var://service/put-date")
    VAR_SERVICE_PUT_DATE("var://service/put-date"),
    @XmlEnumValue("var://service/put-time")
    VAR_SERVICE_PUT_TIME("var://service/put-time"),
    @XmlEnumValue("var://service/original-length")
    VAR_SERVICE_ORIGINAL_LENGTH("var://service/original-length"),
    @XmlEnumValue("var://service/mq-error-code")
    VAR_SERVICE_MQ_ERROR_CODE("var://service/mq-error-code"),
    @XmlEnumValue("var://service/mq-ccsi")
    VAR_SERVICE_MQ_CCSI("var://service/mq-ccsi"),
    @XmlEnumValue("var://service/wsm/enabled")
    VAR_SERVICE_WSM_ENABLED("var://service/wsm/enabled"),
    @XmlEnumValue("var://service/wsm/wsdl-source-class")
    VAR_SERVICE_WSM_WSDL_SOURCE_CLASS("var://service/wsm/wsdl-source-class"),
    @XmlEnumValue("var://service/wsm/wsdl-source")
    VAR_SERVICE_WSM_WSDL_SOURCE("var://service/wsm/wsdl-source"),
    @XmlEnumValue("var://service/wsm/wsdl")
    VAR_SERVICE_WSM_WSDL("var://service/wsm/wsdl"),
    @XmlEnumValue("var://service/wsm/service")
    VAR_SERVICE_WSM_SERVICE("var://service/wsm/service"),
    @XmlEnumValue("var://service/wsm/service-port")
    VAR_SERVICE_WSM_SERVICE_PORT("var://service/wsm/service-port"),
    @XmlEnumValue("var://service/wsm/back-service-port")
    VAR_SERVICE_WSM_BACK_SERVICE_PORT("var://service/wsm/back-service-port"),
    @XmlEnumValue("var://service/wsm/binding")
    VAR_SERVICE_WSM_BINDING("var://service/wsm/binding"),
    @XmlEnumValue("var://service/wsm/back-binding")
    VAR_SERVICE_WSM_BACK_BINDING("var://service/wsm/back-binding"),
    @XmlEnumValue("var://service/wsm/binding-data")
    VAR_SERVICE_WSM_BINDING_DATA("var://service/wsm/binding-data"),
    @XmlEnumValue("var://service/wsm/back-binding-data")
    VAR_SERVICE_WSM_BACK_BINDING_DATA("var://service/wsm/back-binding-data"),
    @XmlEnumValue("var://service/wsm/operation")
    VAR_SERVICE_WSM_OPERATION("var://service/wsm/operation"),
    @XmlEnumValue("var://service/wsm/back-operation")
    VAR_SERVICE_WSM_BACK_OPERATION("var://service/wsm/back-operation"),
    @XmlEnumValue("var://service/wsm/service-port-operation")
    VAR_SERVICE_WSM_SERVICE_PORT_OPERATION("var://service/wsm/service-port-operation"),
    @XmlEnumValue("var://service/wsm/back-service-port-operation")
    VAR_SERVICE_WSM_BACK_SERVICE_PORT_OPERATION("var://service/wsm/back-service-port-operation"),
    @XmlEnumValue("var://service/wsm/validate-faults")
    VAR_SERVICE_WSM_VALIDATE_FAULTS("var://service/wsm/validate-faults"),
    @XmlEnumValue("var://service/wsm/validate-headers")
    VAR_SERVICE_WSM_VALIDATE_HEADERS("var://service/wsm/validate-headers"),
    @XmlEnumValue("var://service/wsm/strict-fault-document-style")
    VAR_SERVICE_WSM_STRICT_FAULT_DOCUMENT_STYLE("var://service/wsm/strict-fault-document-style"),
    @XmlEnumValue("var://service/wsm/schemalocation")
    VAR_SERVICE_WSM_SCHEMALOCATION("var://service/wsm/schemalocation"),
    @XmlEnumValue("var://service/wsm/part-exists/")
    VAR_SERVICE_WSM_PART_EXISTS("var://service/wsm/part-exists/"),
    @XmlEnumValue("var://service/wsm/part-is-xml-element/")
    VAR_SERVICE_WSM_PART_IS_XML_ELEMENT("var://service/wsm/part-is-xml-element/"),
    @XmlEnumValue("var://service/wsm/num-subschema")
    VAR_SERVICE_WSM_NUM_SUBSCHEMA("var://service/wsm/num-subschema"),
    @XmlEnumValue("var://service/wsm/wsdl-error")
    VAR_SERVICE_WSM_WSDL_ERROR("var://service/wsm/wsdl-error"),
    @XmlEnumValue("var://service/wsm/wsdl-warning")
    VAR_SERVICE_WSM_WSDL_WARNING("var://service/wsm/wsdl-warning"),
    @XmlEnumValue("var://service/wsm/validate-message")
    VAR_SERVICE_WSM_VALIDATE_MESSAGE("var://service/wsm/validate-message"),
    @XmlEnumValue("var://service/wsm/resolve-hrefs")
    VAR_SERVICE_WSM_RESOLVE_HREFS("var://service/wsm/resolve-hrefs"),
    @XmlEnumValue("var://service/wsm/aaa-policy-name")
    VAR_SERVICE_WSM_AAA_POLICY_NAME("var://service/wsm/aaa-policy-name"),
    @XmlEnumValue("var://service/wspolicy/required-policy-subjects")
    VAR_SERVICE_WSPOLICY_REQUIRED_POLICY_SUBJECTS("var://service/wspolicy/required-policy-subjects"),
    @XmlEnumValue("var://service/wspolicy/enforcement-mode")
    VAR_SERVICE_WSPOLICY_ENFORCEMENT_MODE("var://service/wspolicy/enforcement-mode"),
    @XmlEnumValue("var://service/wspolicy/endpoint/configname")
    VAR_SERVICE_WSPOLICY_ENDPOINT_CONFIGNAME("var://service/wspolicy/endpoint/configname"),
    @XmlEnumValue("var://service/wspolicy/service/configname")
    VAR_SERVICE_WSPOLICY_SERVICE_CONFIGNAME("var://service/wspolicy/service/configname"),
    @XmlEnumValue("var://service/wspolicy/operation/configname")
    VAR_SERVICE_WSPOLICY_OPERATION_CONFIGNAME("var://service/wspolicy/operation/configname"),
    @XmlEnumValue("var://service/wspolicy/message/configname")
    VAR_SERVICE_WSPOLICY_MESSAGE_CONFIGNAME("var://service/wspolicy/message/configname"),
    @XmlEnumValue("var://service/conformance/policyname")
    VAR_SERVICE_CONFORMANCE_POLICYNAME("var://service/conformance/policyname"),
    @XmlEnumValue("var://service/conformance/generatedPolicy")
    VAR_SERVICE_CONFORMANCE_GENERATED_POLICY("var://service/conformance/generatedPolicy"),
    @XmlEnumValue("var://service/wsa/timeout")
    VAR_SERVICE_WSA_TIMEOUT("var://service/wsa/timeout"),
    @XmlEnumValue("var://service/wsa/genpattern")
    VAR_SERVICE_WSA_GENPATTERN("var://service/wsa/genpattern"),
    @XmlEnumValue("var://service/multistep/input-context-name")
    VAR_SERVICE_MULTISTEP_INPUT_CONTEXT_NAME("var://service/multistep/input-context-name"),
    @XmlEnumValue("var://service/multistep/output-context-name")
    VAR_SERVICE_MULTISTEP_OUTPUT_CONTEXT_NAME("var://service/multistep/output-context-name"),
    @XmlEnumValue("var://service/multistep/clientid")
    VAR_SERVICE_MULTISTEP_CLIENTID("var://service/multistep/clientid"),
    @XmlEnumValue("var://service/multistep/cidextmthd")
    VAR_SERVICE_MULTISTEP_CIDEXTMTHD("var://service/multistep/cidextmthd"),
    @XmlEnumValue("var://service/multistep/aumthd")
    VAR_SERVICE_MULTISTEP_AUMTHD("var://service/multistep/aumthd"),
    @XmlEnumValue("var://service/multistep/clientsocode")
    VAR_SERVICE_MULTISTEP_CLIENTSOCODE("var://service/multistep/clientsocode"),
    @XmlEnumValue("var://service/multistep/clienthopcount")
    VAR_SERVICE_MULTISTEP_CLIENTHOPCOUNT("var://service/multistep/clienthopcount"),
    @XmlEnumValue("var://service/multistep/mysocode")
    VAR_SERVICE_MULTISTEP_MYSOCODE("var://service/multistep/mysocode"),
    @XmlEnumValue("var://service/multistep/targetsocode")
    VAR_SERVICE_MULTISTEP_TARGETSOCODE("var://service/multistep/targetsocode"),
    @XmlEnumValue("var://service/multistep/kdversion")
    VAR_SERVICE_MULTISTEP_KDVERSION("var://service/multistep/kdversion"),
    @XmlEnumValue("var://service/multistep/serversocode")
    VAR_SERVICE_MULTISTEP_SERVERSOCODE("var://service/multistep/serversocode"),
    @XmlEnumValue("var://service/multistep/serverhopcount")
    VAR_SERVICE_MULTISTEP_SERVERHOPCOUNT("var://service/multistep/serverhopcount"),
    @XmlEnumValue("var://service/multistep/sfid")
    VAR_SERVICE_MULTISTEP_SFID("var://service/multistep/sfid"),
    @XmlEnumValue("var://service/multistep/loop-iterator")
    VAR_SERVICE_MULTISTEP_LOOP_ITERATOR("var://service/multistep/loop-iterator"),
    @XmlEnumValue("var://service/multistep/loop-count")
    VAR_SERVICE_MULTISTEP_LOOP_COUNT("var://service/multistep/loop-count"),
    @XmlEnumValue("var://service/multistep/tx-warn")
    VAR_SERVICE_MULTISTEP_TX_WARN("var://service/multistep/tx-warn"),
    @XmlEnumValue("var://service/qos/priority")
    VAR_SERVICE_QOS_PRIORITY("var://service/qos/priority"),
    @XmlEnumValue("var://service/wsm/front-protocol")
    VAR_SERVICE_WSM_FRONT_PROTOCOL("var://service/wsm/front-protocol"),
    @XmlEnumValue("var://service/wsm/back-protocol")
    VAR_SERVICE_WSM_BACK_PROTOCOL("var://service/wsm/back-protocol"),
    @XmlEnumValue("var://service/wsm/http-parsed-url-replacement")
    VAR_SERVICE_WSM_HTTP_PARSED_URL_REPLACEMENT("var://service/wsm/http-parsed-url-replacement"),
    @XmlEnumValue("var://service/wsm/wsdl-content-type")
    VAR_SERVICE_WSM_WSDL_CONTENT_TYPE("var://service/wsm/wsdl-content-type"),
    @XmlEnumValue("var://service/log/soapversion")
    VAR_SERVICE_LOG_SOAPVERSION("var://service/log/soapversion"),
    @XmlEnumValue("var://service/multistep/contexts")
    VAR_SERVICE_MULTISTEP_CONTEXTS("var://service/multistep/contexts"),
    @XmlEnumValue("var://service/rewrite-errors")
    VAR_SERVICE_REWRITE_ERRORS("var://service/rewrite-errors");
    private final String value;

    DmServiceVar(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DmServiceVar fromValue(String v) {
        for (DmServiceVar c: DmServiceVar.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
