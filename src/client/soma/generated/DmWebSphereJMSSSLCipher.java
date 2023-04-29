
package client.soma.generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dmWebSphereJMSSSLCipher.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="dmWebSphereJMSSSLCipher">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="SSL_RSA_WITH_NULL_MD5"/>
 *     &lt;enumeration value="SSL_RSA_EXPORT_WITH_RC2_CBC_40_MD5"/>
 *     &lt;enumeration value="SSL_RSA_EXPORT_WITH_RC4_40_MD5"/>
 *     &lt;enumeration value="SSL_RSA_WITH_RC4_128_MD5"/>
 *     &lt;enumeration value="SSL_RSA_WITH_NULL_SHA"/>
 *     &lt;enumeration value="SSL_RSA_EXPORT1024_WITH_RC4_56_SHA"/>
 *     &lt;enumeration value="SSL_RSA_WITH_RC4_128_SHA"/>
 *     &lt;enumeration value="SSL_RSA_WITH_DES_CBC_SHA"/>
 *     &lt;enumeration value="SSL_RSA_EXPORT1024_WITH_DES_CBC_SHA"/>
 *     &lt;enumeration value="SSL_RSA_FIPS_WITH_DES_CBC_SHA"/>
 *     &lt;enumeration value="SSL_RSA_WITH_3DES_EDE_CBC_SHA"/>
 *     &lt;enumeration value="SSL_RSA_FIPS_WITH_3DES_EDE_CBC_SHA"/>
 *     &lt;enumeration value="TLS_RSA_WITH_DES_CBC_SHA"/>
 *     &lt;enumeration value="TLS_RSA_WITH_3DES_EDE_CBC_SHA"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "dmWebSphereJMSSSLCipher")
@XmlEnum
public enum DmWebSphereJMSSSLCipher {

    @XmlEnumValue("SSL_RSA_WITH_NULL_MD5")
    SSL_RSA_WITH_NULL_MD_5("SSL_RSA_WITH_NULL_MD5"),
    @XmlEnumValue("SSL_RSA_EXPORT_WITH_RC2_CBC_40_MD5")
    SSL_RSA_EXPORT_WITH_RC_2_CBC_40_MD_5("SSL_RSA_EXPORT_WITH_RC2_CBC_40_MD5"),
    @XmlEnumValue("SSL_RSA_EXPORT_WITH_RC4_40_MD5")
    SSL_RSA_EXPORT_WITH_RC_4_40_MD_5("SSL_RSA_EXPORT_WITH_RC4_40_MD5"),
    @XmlEnumValue("SSL_RSA_WITH_RC4_128_MD5")
    SSL_RSA_WITH_RC_4_128_MD_5("SSL_RSA_WITH_RC4_128_MD5"),
    SSL_RSA_WITH_NULL_SHA("SSL_RSA_WITH_NULL_SHA"),
    @XmlEnumValue("SSL_RSA_EXPORT1024_WITH_RC4_56_SHA")
    SSL_RSA_EXPORT_1024_WITH_RC_4_56_SHA("SSL_RSA_EXPORT1024_WITH_RC4_56_SHA"),
    @XmlEnumValue("SSL_RSA_WITH_RC4_128_SHA")
    SSL_RSA_WITH_RC_4_128_SHA("SSL_RSA_WITH_RC4_128_SHA"),
    SSL_RSA_WITH_DES_CBC_SHA("SSL_RSA_WITH_DES_CBC_SHA"),
    @XmlEnumValue("SSL_RSA_EXPORT1024_WITH_DES_CBC_SHA")
    SSL_RSA_EXPORT_1024_WITH_DES_CBC_SHA("SSL_RSA_EXPORT1024_WITH_DES_CBC_SHA"),
    SSL_RSA_FIPS_WITH_DES_CBC_SHA("SSL_RSA_FIPS_WITH_DES_CBC_SHA"),
    @XmlEnumValue("SSL_RSA_WITH_3DES_EDE_CBC_SHA")
    SSL_RSA_WITH_3_DES_EDE_CBC_SHA("SSL_RSA_WITH_3DES_EDE_CBC_SHA"),
    @XmlEnumValue("SSL_RSA_FIPS_WITH_3DES_EDE_CBC_SHA")
    SSL_RSA_FIPS_WITH_3_DES_EDE_CBC_SHA("SSL_RSA_FIPS_WITH_3DES_EDE_CBC_SHA"),
    TLS_RSA_WITH_DES_CBC_SHA("TLS_RSA_WITH_DES_CBC_SHA"),
    @XmlEnumValue("TLS_RSA_WITH_3DES_EDE_CBC_SHA")
    TLS_RSA_WITH_3_DES_EDE_CBC_SHA("TLS_RSA_WITH_3DES_EDE_CBC_SHA");
    private final String value;

    DmWebSphereJMSSSLCipher(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DmWebSphereJMSSSLCipher fromValue(String v) {
        for (DmWebSphereJMSSSLCipher c: DmWebSphereJMSSSLCipher.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
