
package client.soma.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ConfigAccessControl complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ConfigAccessControl">
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
@XmlType(name = "ConfigAccessControl")
@XmlSeeAlso({
    ConfigXACMLPDP.class,
    ConfigDomain.class,
    ConfigSOAPHeaderDisposition.class,
    ConfigTAM.class,
    ConfigTFIMEndpoint.class,
    ConfigLDAPSearchParameters.class,
    ConfigRADIUSSettings.class,
    ConfigProcessingMetadata.class,
    ConfigRBMSettings.class,
    ConfigSAMLAttributes.class,
    ConfigAAAPolicy.class
})
public class ConfigAccessControl
    extends ConfigConfigBase
{


}
