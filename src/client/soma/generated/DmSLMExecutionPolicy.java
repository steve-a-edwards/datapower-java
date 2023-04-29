
package client.soma.generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dmSLMExecutionPolicy.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="dmSLMExecutionPolicy">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="terminate-at-first-reject"/>
 *     &lt;enumeration value="terminate-at-first-action"/>
 *     &lt;enumeration value="execute-all-statements"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "dmSLMExecutionPolicy")
@XmlEnum
public enum DmSLMExecutionPolicy {

    @XmlEnumValue("terminate-at-first-reject")
    TERMINATE_AT_FIRST_REJECT("terminate-at-first-reject"),
    @XmlEnumValue("terminate-at-first-action")
    TERMINATE_AT_FIRST_ACTION("terminate-at-first-action"),
    @XmlEnumValue("execute-all-statements")
    EXECUTE_ALL_STATEMENTS("execute-all-statements");
    private final String value;

    DmSLMExecutionPolicy(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DmSLMExecutionPolicy fromValue(String v) {
        for (DmSLMExecutionPolicy c: DmSLMExecutionPolicy.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
