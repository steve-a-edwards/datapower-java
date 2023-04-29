
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
 * <p>Java class for ModifyFilePollerSourceProtocolHandler complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ModifyFilePollerSourceProtocolHandler">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.datapower.com/schemas/management}ModifySourceProtocolHandler">
 *       &lt;choice maxOccurs="unbounded">
 *         &lt;element name="UserSummary" type="{http://www.datapower.com/schemas/management}dmString" minOccurs="0"/>
 *         &lt;element name="TargetDirectory" type="{http://www.datapower.com/schemas/management}dmString" minOccurs="0"/>
 *         &lt;element name="DelayBetweenPolls" type="{http://www.datapower.com/schemas/management}dmUInt32" minOccurs="0"/>
 *         &lt;element name="InputFileMatchPattern" type="{http://www.datapower.com/schemas/management}dmPCRE" minOccurs="0"/>
 *         &lt;element name="ProcessingRenamePattern" type="{http://www.datapower.com/schemas/management}dmPCRE" minOccurs="0"/>
 *         &lt;element name="DeleteOnSuccess" type="{http://www.datapower.com/schemas/management}dmToggle" minOccurs="0"/>
 *         &lt;element name="SuccessRenamePattern" type="{http://www.datapower.com/schemas/management}dmPCRE" minOccurs="0"/>
 *         &lt;element name="DeleteOnError" type="{http://www.datapower.com/schemas/management}dmToggle" minOccurs="0"/>
 *         &lt;element name="ErrorRenamePattern" type="{http://www.datapower.com/schemas/management}dmPCRE" minOccurs="0"/>
 *         &lt;element name="GenerateResultFile" type="{http://www.datapower.com/schemas/management}dmToggle" minOccurs="0"/>
 *         &lt;element name="ResultNamePattern" type="{http://www.datapower.com/schemas/management}dmPCRE" minOccurs="0"/>
 *         &lt;element name="ProcessingSeizeTimeout" type="{http://www.datapower.com/schemas/management}dmUInt32" minOccurs="0"/>
 *         &lt;element name="ProcessingSeizePattern" type="{http://www.datapower.com/schemas/management}dmPCRE" minOccurs="0"/>
 *         &lt;element name="XMLManager" type="{http://www.datapower.com/schemas/management}dmReference" minOccurs="0"/>
 *         &lt;element name="MaxTransfersPerPoll" type="{http://www.datapower.com/schemas/management}dmUInt32" minOccurs="0"/>
 *       &lt;/choice>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ModifyFilePollerSourceProtocolHandler", propOrder = {
    "userSummaryOrTargetDirectoryOrDelayBetweenPolls"
})
@XmlSeeAlso({
    ModifySFTPFilePollerSourceProtocolHandler.class,
    ModifyFTPFilePollerSourceProtocolHandler.class,
    ModifyNFSFilePollerSourceProtocolHandler.class
})
public class ModifyFilePollerSourceProtocolHandler
    extends ModifySourceProtocolHandler
{

    @XmlElementRefs({
        @XmlElementRef(name = "TargetDirectory", type = JAXBElement.class),
        @XmlElementRef(name = "ProcessingSeizePattern", type = JAXBElement.class),
        @XmlElementRef(name = "ProcessingRenamePattern", type = JAXBElement.class),
        @XmlElementRef(name = "DeleteOnSuccess", type = JAXBElement.class),
        @XmlElementRef(name = "DeleteOnError", type = JAXBElement.class),
        @XmlElementRef(name = "XMLManager", type = JAXBElement.class),
        @XmlElementRef(name = "ResultNamePattern", type = JAXBElement.class),
        @XmlElementRef(name = "SuccessRenamePattern", type = JAXBElement.class),
        @XmlElementRef(name = "UserSummary", type = JAXBElement.class),
        @XmlElementRef(name = "ProcessingSeizeTimeout", type = JAXBElement.class),
        @XmlElementRef(name = "DelayBetweenPolls", type = JAXBElement.class),
        @XmlElementRef(name = "GenerateResultFile", type = JAXBElement.class),
        @XmlElementRef(name = "InputFileMatchPattern", type = JAXBElement.class),
        @XmlElementRef(name = "MaxTransfersPerPoll", type = JAXBElement.class),
        @XmlElementRef(name = "ErrorRenamePattern", type = JAXBElement.class)
    })
    protected List<JAXBElement<?>> userSummaryOrTargetDirectoryOrDelayBetweenPolls;

    /**
     * Gets the value of the userSummaryOrTargetDirectoryOrDelayBetweenPolls property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the userSummaryOrTargetDirectoryOrDelayBetweenPolls property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUserSummaryOrTargetDirectoryOrDelayBetweenPolls().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link DmToggle }{@code >}
     * {@link JAXBElement }{@code <}{@link DmToggle }{@code >}
     * {@link JAXBElement }{@code <}{@link DmReference }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link Long }{@code >}
     * {@link JAXBElement }{@code <}{@link Long }{@code >}
     * {@link JAXBElement }{@code <}{@link DmToggle }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link Long }{@code >}
     * 
     * 
     */
    public List<JAXBElement<?>> getUserSummaryOrTargetDirectoryOrDelayBetweenPolls() {
        if (userSummaryOrTargetDirectoryOrDelayBetweenPolls == null) {
            userSummaryOrTargetDirectoryOrDelayBetweenPolls = new ArrayList<JAXBElement<?>>();
        }
        return this.userSummaryOrTargetDirectoryOrDelayBetweenPolls;
    }

}
