
package client.soma.generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dmRaidLDCachePolicy.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="dmRaidLDCachePolicy">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="noReadAhead"/>
 *     &lt;enumeration value="adaptiveReadAhead"/>
 *     &lt;enumeration value="readAhead"/>
 *     &lt;enumeration value="writeThrough"/>
 *     &lt;enumeration value="writeBack"/>
 *     &lt;enumeration value="writeCachingOkIfBadBBU"/>
 *     &lt;enumeration value="cachedIO"/>
 *     &lt;enumeration value="directIO"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "dmRaidLDCachePolicy")
@XmlEnum
public enum DmRaidLDCachePolicy {

    @XmlEnumValue("noReadAhead")
    NO_READ_AHEAD("noReadAhead"),
    @XmlEnumValue("adaptiveReadAhead")
    ADAPTIVE_READ_AHEAD("adaptiveReadAhead"),
    @XmlEnumValue("readAhead")
    READ_AHEAD("readAhead"),
    @XmlEnumValue("writeThrough")
    WRITE_THROUGH("writeThrough"),
    @XmlEnumValue("writeBack")
    WRITE_BACK("writeBack"),
    @XmlEnumValue("writeCachingOkIfBadBBU")
    WRITE_CACHING_OK_IF_BAD_BBU("writeCachingOkIfBadBBU"),
    @XmlEnumValue("cachedIO")
    CACHED_IO("cachedIO"),
    @XmlEnumValue("directIO")
    DIRECT_IO("directIO");
    private final String value;

    DmRaidLDCachePolicy(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DmRaidLDCachePolicy fromValue(String v) {
        for (DmRaidLDCachePolicy c: DmRaidLDCachePolicy.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
