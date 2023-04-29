
package client.soma.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ConfigCrypto complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ConfigCrypto">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.datapower.com/schemas/management}ConfigConfigBase">
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConfigCrypto")
@XmlSeeAlso({
    ConfigCertMonitor.class,
    ConfigSSHClientProfile.class,
    ConfigCryptoKerberosKeytab.class,
    ConfigCryptoValCred.class,
    ConfigCryptoProfile.class,
    ConfigCryptoFWCred.class,
    ConfigCryptoKerberosKDC.class,
    ConfigCryptoIdentCred.class,
    ConfigCryptoCertificate.class,
    ConfigCryptoKey.class,
    ConfigSSLProxyProfile.class,
    ConfigCRLFetch.class,
    ConfigCryptoSSKey.class
})
public class ConfigCrypto
    extends ConfigConfigBase
{


}
