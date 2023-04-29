
package client.soma.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ModifyCrypto complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ModifyCrypto">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.datapower.com/schemas/management}ModifyConfigBase">
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ModifyCrypto")
@XmlSeeAlso({
    ModifyCryptoKerberosKDC.class,
    ModifyCRLFetch.class,
    ModifyCryptoValCred.class,
    ModifySSHClientProfile.class,
    ModifyCryptoProfile.class,
    ModifyCryptoCertificate.class,
    ModifyCryptoSSKey.class,
    ModifyCertMonitor.class,
    ModifyCryptoKey.class,
    ModifySSLProxyProfile.class,
    ModifyCryptoFWCred.class,
    ModifyCryptoKerberosKeytab.class,
    ModifyCryptoIdentCred.class
})
public class ModifyCrypto
    extends ModifyConfigBase
{


}
