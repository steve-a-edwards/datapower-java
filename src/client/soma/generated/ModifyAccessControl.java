
package client.soma.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ModifyAccessControl complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ModifyAccessControl">
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
@XmlType(name = "ModifyAccessControl")
@XmlSeeAlso({
    ModifyTAM.class,
    ModifySAMLAttributes.class,
    ModifyRADIUSSettings.class,
    ModifyRBMSettings.class,
    ModifyDomain.class,
    ModifyProcessingMetadata.class,
    ModifySOAPHeaderDisposition.class,
    ModifyLDAPSearchParameters.class,
    ModifyTFIMEndpoint.class,
    ModifyAAAPolicy.class,
    ModifyXACMLPDP.class
})
public class ModifyAccessControl
    extends ModifyConfigBase
{


}
