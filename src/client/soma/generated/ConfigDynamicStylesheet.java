
package client.soma.generated;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ConfigDynamicStylesheet complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ConfigDynamicStylesheet">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.datapower.com/schemas/management}ConfigDynamicXMLContentMap">
 *       &lt;choice maxOccurs="unbounded">
 *         &lt;element name="NameSpaceMappings" type="{http://www.datapower.com/schemas/management}dmNamespaceMapping" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/choice>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConfigDynamicStylesheet", propOrder = {
    "nameSpaceMappings"
})
@XmlSeeAlso({
    ConfigDocumentCryptoMap.class,
    ConfigXPathRoutingMap.class
})
public class ConfigDynamicStylesheet
    extends ConfigDynamicXMLContentMap
{

    @XmlElement(name = "NameSpaceMappings")
    protected List<DmNamespaceMapping> nameSpaceMappings;

    /**
     * Gets the value of the nameSpaceMappings property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the nameSpaceMappings property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNameSpaceMappings().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DmNamespaceMapping }
     * 
     * 
     */
    public List<DmNamespaceMapping> getNameSpaceMappings() {
        if (nameSpaceMappings == null) {
            nameSpaceMappings = new ArrayList<DmNamespaceMapping>();
        }
        return this.nameSpaceMappings;
    }

}
