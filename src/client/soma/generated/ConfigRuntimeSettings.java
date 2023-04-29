
package client.soma.generated;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ConfigRuntimeSettings complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ConfigRuntimeSettings">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.datapower.com/schemas/management}ConfigConfigBase">
 *       &lt;choice maxOccurs="unbounded">
 *         &lt;element name="EnableSharing" type="{http://www.datapower.com/schemas/management}dmToggle" minOccurs="0"/>
 *         &lt;element name="Profiles" type="{http://www.datapower.com/schemas/management}dmRuntimeProfile"/>
 *       &lt;/choice>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConfigRuntimeSettings", propOrder = {
    "enableSharingOrProfiles"
})
@XmlSeeAlso({
    ConfigSQLRuntimeSettings.class
})
public class ConfigRuntimeSettings
    extends ConfigConfigBase
{

    @XmlElements({
        @XmlElement(name = "Profiles", type = DmRuntimeProfile.class),
        @XmlElement(name = "EnableSharing", type = DmToggle.class)
    })
    protected List<Object> enableSharingOrProfiles;

    /**
     * Gets the value of the enableSharingOrProfiles property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the enableSharingOrProfiles property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEnableSharingOrProfiles().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DmRuntimeProfile }
     * {@link DmToggle }
     * 
     * 
     */
    public List<Object> getEnableSharingOrProfiles() {
        if (enableSharingOrProfiles == null) {
            enableSharingOrProfiles = new ArrayList<Object>();
        }
        return this.enableSharingOrProfiles;
    }

}
