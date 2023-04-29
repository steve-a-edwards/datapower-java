
package client.soma.generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dmSLMRsrcType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="dmSLMRsrcType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="aaa-mapped-resource"/>
 *     &lt;enumeration value="front-url"/>
 *     &lt;enumeration value="destination-url"/>
 *     &lt;enumeration value="xpath-filter"/>
 *     &lt;enumeration value="request-message"/>
 *     &lt;enumeration value="response-message"/>
 *     &lt;enumeration value="soap-fault"/>
 *     &lt;enumeration value="errorcode"/>
 *     &lt;enumeration value="custom-stylesheet"/>
 *     &lt;enumeration value="concurrent-connections"/>
 *     &lt;enumeration value="concurrent-transactions"/>
 *     &lt;enumeration value="wsdl"/>
 *     &lt;enumeration value="wsdl-service"/>
 *     &lt;enumeration value="wsdl-port"/>
 *     &lt;enumeration value="wsdl-operation"/>
 *     &lt;enumeration value="request-mq-qname"/>
 *     &lt;enumeration value="reply-mq-qname"/>
 *     &lt;enumeration value="uddi-subscription"/>
 *     &lt;enumeration value="wsrr-subscription"/>
 *     &lt;enumeration value="wsrr-saved-search-subscription"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "dmSLMRsrcType")
@XmlEnum
public enum DmSLMRsrcType {

    @XmlEnumValue("aaa-mapped-resource")
    AAA_MAPPED_RESOURCE("aaa-mapped-resource"),
    @XmlEnumValue("front-url")
    FRONT_URL("front-url"),
    @XmlEnumValue("destination-url")
    DESTINATION_URL("destination-url"),
    @XmlEnumValue("xpath-filter")
    XPATH_FILTER("xpath-filter"),
    @XmlEnumValue("request-message")
    REQUEST_MESSAGE("request-message"),
    @XmlEnumValue("response-message")
    RESPONSE_MESSAGE("response-message"),
    @XmlEnumValue("soap-fault")
    SOAP_FAULT("soap-fault"),
    @XmlEnumValue("errorcode")
    ERRORCODE("errorcode"),
    @XmlEnumValue("custom-stylesheet")
    CUSTOM_STYLESHEET("custom-stylesheet"),
    @XmlEnumValue("concurrent-connections")
    CONCURRENT_CONNECTIONS("concurrent-connections"),
    @XmlEnumValue("concurrent-transactions")
    CONCURRENT_TRANSACTIONS("concurrent-transactions"),
    @XmlEnumValue("wsdl")
    WSDL("wsdl"),
    @XmlEnumValue("wsdl-service")
    WSDL_SERVICE("wsdl-service"),
    @XmlEnumValue("wsdl-port")
    WSDL_PORT("wsdl-port"),
    @XmlEnumValue("wsdl-operation")
    WSDL_OPERATION("wsdl-operation"),
    @XmlEnumValue("request-mq-qname")
    REQUEST_MQ_QNAME("request-mq-qname"),
    @XmlEnumValue("reply-mq-qname")
    REPLY_MQ_QNAME("reply-mq-qname"),
    @XmlEnumValue("uddi-subscription")
    UDDI_SUBSCRIPTION("uddi-subscription"),
    @XmlEnumValue("wsrr-subscription")
    WSRR_SUBSCRIPTION("wsrr-subscription"),
    @XmlEnumValue("wsrr-saved-search-subscription")
    WSRR_SAVED_SEARCH_SUBSCRIPTION("wsrr-saved-search-subscription");
    private final String value;

    DmSLMRsrcType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DmSLMRsrcType fromValue(String v) {
        for (DmSLMRsrcType c: DmSLMRsrcType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
