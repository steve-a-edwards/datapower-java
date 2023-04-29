
package client.soma.generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dmStyleActionType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="dmStyleActionType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="validate"/>
 *     &lt;enumeration value="filter"/>
 *     &lt;enumeration value="route-action"/>
 *     &lt;enumeration value="aaa"/>
 *     &lt;enumeration value="xformpi"/>
 *     &lt;enumeration value="xformbin"/>
 *     &lt;enumeration value="cryptobin"/>
 *     &lt;enumeration value="xform"/>
 *     &lt;enumeration value="convert-http"/>
 *     &lt;enumeration value="log"/>
 *     &lt;enumeration value="results"/>
 *     &lt;enumeration value="results-async"/>
 *     &lt;enumeration value="setvar"/>
 *     &lt;enumeration value="fetch"/>
 *     &lt;enumeration value="extract"/>
 *     &lt;enumeration value="rewrite"/>
 *     &lt;enumeration value="route-set"/>
 *     &lt;enumeration value="strip-attachments"/>
 *     &lt;enumeration value="call"/>
 *     &lt;enumeration value="on-error"/>
 *     &lt;enumeration value="checkpoint"/>
 *     &lt;enumeration value="slm"/>
 *     &lt;enumeration value="sql"/>
 *     &lt;enumeration value="conditional"/>
 *     &lt;enumeration value="for-each"/>
 *     &lt;enumeration value="event-sink"/>
 *     &lt;enumeration value="method-rewrite"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "dmStyleActionType")
@XmlEnum
public enum DmStyleActionType {

    @XmlEnumValue("validate")
    VALIDATE("validate"),
    @XmlEnumValue("filter")
    FILTER("filter"),
    @XmlEnumValue("route-action")
    ROUTE_ACTION("route-action"),
    @XmlEnumValue("aaa")
    AAA("aaa"),
    @XmlEnumValue("xformpi")
    XFORMPI("xformpi"),
    @XmlEnumValue("xformbin")
    XFORMBIN("xformbin"),
    @XmlEnumValue("cryptobin")
    CRYPTOBIN("cryptobin"),
    @XmlEnumValue("xform")
    XFORM("xform"),
    @XmlEnumValue("convert-http")
    CONVERT_HTTP("convert-http"),
    @XmlEnumValue("log")
    LOG("log"),
    @XmlEnumValue("results")
    RESULTS("results"),
    @XmlEnumValue("results-async")
    RESULTS_ASYNC("results-async"),
    @XmlEnumValue("setvar")
    SETVAR("setvar"),
    @XmlEnumValue("fetch")
    FETCH("fetch"),
    @XmlEnumValue("extract")
    EXTRACT("extract"),
    @XmlEnumValue("rewrite")
    REWRITE("rewrite"),
    @XmlEnumValue("route-set")
    ROUTE_SET("route-set"),
    @XmlEnumValue("strip-attachments")
    STRIP_ATTACHMENTS("strip-attachments"),
    @XmlEnumValue("call")
    CALL("call"),
    @XmlEnumValue("on-error")
    ON_ERROR("on-error"),
    @XmlEnumValue("checkpoint")
    CHECKPOINT("checkpoint"),
    @XmlEnumValue("slm")
    SLM("slm"),
    @XmlEnumValue("sql")
    SQL("sql"),
    @XmlEnumValue("conditional")
    CONDITIONAL("conditional"),
    @XmlEnumValue("for-each")
    FOR_EACH("for-each"),
    @XmlEnumValue("event-sink")
    EVENT_SINK("event-sink"),
    @XmlEnumValue("method-rewrite")
    METHOD_REWRITE("method-rewrite");
    private final String value;

    DmStyleActionType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DmStyleActionType fromValue(String v) {
        for (DmStyleActionType c: DmStyleActionType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
