
package client.soma.generated;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ConfigJMSSourceProtocolHandler complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ConfigJMSSourceProtocolHandler">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.datapower.com/schemas/management}ConfigSourceProtocolHandler">
 *       &lt;choice maxOccurs="unbounded">
 *         &lt;element name="UserSummary" type="{http://www.datapower.com/schemas/management}dmString" minOccurs="0"/>
 *         &lt;element name="GetQueue" type="{http://www.datapower.com/schemas/management}dmString"/>
 *         &lt;element name="PutQueue" type="{http://www.datapower.com/schemas/management}dmString" minOccurs="0"/>
 *         &lt;element name="Selector" type="{http://www.datapower.com/schemas/management}dmString" minOccurs="0"/>
 *         &lt;element name="AsyncMessageProcessing" type="{http://www.datapower.com/schemas/management}dmToggle" minOccurs="0"/>
 *       &lt;/choice>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConfigJMSSourceProtocolHandler", propOrder = {
    "userSummaryOrGetQueueOrPutQueue"
})
@XmlSeeAlso({
    ConfigWebSphereJMSSourceProtocolHandler.class,
    ConfigTibcoEMSSourceProtocolHandler.class
})
public class ConfigJMSSourceProtocolHandler
    extends ConfigSourceProtocolHandler
{

    @XmlElementRefs({
        @XmlElementRef(name = "AsyncMessageProcessing", type = JAXBElement.class),
        @XmlElementRef(name = "UserSummary", type = JAXBElement.class),
        @XmlElementRef(name = "Selector", type = JAXBElement.class),
        @XmlElementRef(name = "PutQueue", type = JAXBElement.class),
        @XmlElementRef(name = "GetQueue", type = JAXBElement.class)
    })
    protected List<JAXBElement<?>> userSummaryOrGetQueueOrPutQueue;

    /**
     * Gets the value of the userSummaryOrGetQueueOrPutQueue property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the userSummaryOrGetQueueOrPutQueue property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUserSummaryOrGetQueueOrPutQueue().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link DmToggle }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * 
     */
    public List<JAXBElement<?>> getUserSummaryOrGetQueueOrPutQueue() {
        if (userSummaryOrGetQueueOrPutQueue == null) {
            userSummaryOrGetQueueOrPutQueue = new ArrayList<JAXBElement<?>>();
        }
        return this.userSummaryOrGetQueueOrPutQueue;
    }

}
