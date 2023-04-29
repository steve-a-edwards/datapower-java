
package client.soma.generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dmErrorReportUploadStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="dmErrorReportUploadStatus">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="success"/>
 *     &lt;enumeration value="failure"/>
 *     &lt;enumeration value="in-progress"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "dmErrorReportUploadStatus")
@XmlEnum
public enum DmErrorReportUploadStatus {

    @XmlEnumValue("success")
    SUCCESS("success"),
    @XmlEnumValue("failure")
    FAILURE("failure"),
    @XmlEnumValue("in-progress")
    IN_PROGRESS("in-progress");
    private final String value;

    DmErrorReportUploadStatus(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DmErrorReportUploadStatus fromValue(String v) {
        for (DmErrorReportUploadStatus c: DmErrorReportUploadStatus.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
