
package client.soma.generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dmWLMRetrieval.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="dmWLMRetrieval">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="use-websphere"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "dmWLMRetrieval")
@XmlEnum
public enum DmWLMRetrieval {

    @XmlEnumValue("use-websphere")
    USE_WEBSPHERE("use-websphere");
    private final String value;

    DmWLMRetrieval(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DmWLMRetrieval fromValue(String v) {
        for (DmWLMRetrieval c: DmWLMRetrieval.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
