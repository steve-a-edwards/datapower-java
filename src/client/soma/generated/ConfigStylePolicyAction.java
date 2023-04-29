
package client.soma.generated;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ConfigStylePolicyAction complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ConfigStylePolicyAction">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.datapower.com/schemas/management}ConfigConfigBase">
 *       &lt;choice maxOccurs="unbounded">
 *         &lt;element name="UserSummary" type="{http://www.datapower.com/schemas/management}dmString" minOccurs="0"/>
 *         &lt;element name="Type" type="{http://www.datapower.com/schemas/management}dmStyleActionType"/>
 *         &lt;element name="Input" type="{http://www.datapower.com/schemas/management}dmString" minOccurs="0"/>
 *         &lt;element name="Transform" type="{http://www.datapower.com/schemas/management}dmString" minOccurs="0"/>
 *         &lt;element name="TxMap" type="{http://www.datapower.com/schemas/management}dmString" minOccurs="0"/>
 *         &lt;element name="TxTopLevelMap" type="{http://www.datapower.com/schemas/management}dmString" minOccurs="0"/>
 *         &lt;element name="TxMode" type="{http://www.datapower.com/schemas/management}dmTxMode" minOccurs="0"/>
 *         &lt;element name="TxAuditLog" type="{http://www.datapower.com/schemas/management}dmString" minOccurs="0"/>
 *         &lt;element name="Output" type="{http://www.datapower.com/schemas/management}dmString" minOccurs="0"/>
 *         &lt;element name="NamedInOutLocationType" type="{http://www.datapower.com/schemas/management}dmNamedInOutLocationType" minOccurs="0"/>
 *         &lt;element name="NamedInputs" type="{http://www.datapower.com/schemas/management}dmNamedInOut" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="NamedOutputs" type="{http://www.datapower.com/schemas/management}dmNamedInOut" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Destination" type="{http://www.datapower.com/schemas/management}dmURL" minOccurs="0"/>
 *         &lt;element name="SchemaURL" type="{http://www.datapower.com/schemas/management}dmURL" minOccurs="0"/>
 *         &lt;element name="WsdlURL" type="{http://www.datapower.com/schemas/management}dmURL" minOccurs="0"/>
 *         &lt;element name="Policy" type="{http://www.datapower.com/schemas/management}dmReference" minOccurs="0"/>
 *         &lt;element name="AAA" type="{http://www.datapower.com/schemas/management}dmReference" minOccurs="0"/>
 *         &lt;element name="DynamicSchema" type="{http://www.datapower.com/schemas/management}dmReference" minOccurs="0"/>
 *         &lt;element name="DynamicStylesheet" type="{http://www.datapower.com/schemas/management}dmReference" minOccurs="0"/>
 *         &lt;element name="InputConversion" type="{http://www.datapower.com/schemas/management}dmReference" minOccurs="0"/>
 *         &lt;element name="XPath" type="{http://www.datapower.com/schemas/management}dmXPathExpr" minOccurs="0"/>
 *         &lt;element name="Variable" type="{http://www.datapower.com/schemas/management}dmString" minOccurs="0"/>
 *         &lt;element name="Value" type="{http://www.datapower.com/schemas/management}dmString" minOccurs="0"/>
 *         &lt;element name="SSLCred" type="{http://www.datapower.com/schemas/management}dmString" minOccurs="0"/>
 *         &lt;element name="AttachmentURI" type="{http://www.datapower.com/schemas/management}dmString" minOccurs="0"/>
 *         &lt;element name="StylesheetParameters" type="{http://www.datapower.com/schemas/management}dmStylesheetParameter" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ErrorMode" type="{http://www.datapower.com/schemas/management}dmStyleErrorMode" minOccurs="0"/>
 *         &lt;element name="ErrorInput" type="{http://www.datapower.com/schemas/management}dmString" minOccurs="0"/>
 *         &lt;element name="ErrorOutput" type="{http://www.datapower.com/schemas/management}dmString" minOccurs="0"/>
 *         &lt;element name="Rule" type="{http://www.datapower.com/schemas/management}dmString" minOccurs="0"/>
 *         &lt;element name="OutputType" type="{http://www.datapower.com/schemas/management}dmActionOutputType" minOccurs="0"/>
 *         &lt;element name="LogLevel" type="{http://www.datapower.com/schemas/management}dmLogLevel" minOccurs="0"/>
 *         &lt;element name="LogType" type="{http://www.datapower.com/schemas/management}dmReference" minOccurs="0"/>
 *         &lt;element name="Transactional" type="{http://www.datapower.com/schemas/management}dmToggle" minOccurs="0"/>
 *         &lt;element name="CheckpointEvent" type="{http://www.datapower.com/schemas/management}dmCheckpointEvent" minOccurs="0"/>
 *         &lt;element name="SLMPolicy" type="{http://www.datapower.com/schemas/management}dmString" minOccurs="0"/>
 *         &lt;element name="SQLDataSource" type="{http://www.datapower.com/schemas/management}dmReference" minOccurs="0"/>
 *         &lt;element name="SQLText" type="{http://www.datapower.com/schemas/management}dmString" minOccurs="0"/>
 *         &lt;element name="SOAPValidation" type="{http://www.datapower.com/schemas/management}dmSOAPValidation" minOccurs="0"/>
 *         &lt;element name="SQLSourceType" type="{http://www.datapower.com/schemas/management}dmSQLSourceType" minOccurs="0"/>
 *         &lt;element name="Asynchronous" type="{http://www.datapower.com/schemas/management}dmToggle" minOccurs="0"/>
 *         &lt;element name="Condition" type="{http://www.datapower.com/schemas/management}dmCondition" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ResultsMode" type="{http://www.datapower.com/schemas/management}dmResultsMultiWayMode" minOccurs="0"/>
 *         &lt;element name="RetryCount" type="{http://www.datapower.com/schemas/management}dmUInt32" minOccurs="0"/>
 *         &lt;element name="RetryInterval" type="{http://www.datapower.com/schemas/management}dmTimeIntervalMillis" minOccurs="0"/>
 *         &lt;element name="MultipleOutputs" type="{http://www.datapower.com/schemas/management}dmToggle" minOccurs="0"/>
 *         &lt;element name="IteratorType" type="{http://www.datapower.com/schemas/management}dmIteratorType" minOccurs="0"/>
 *         &lt;element name="IteratorExpression" type="{http://www.datapower.com/schemas/management}dmXPathExpr" minOccurs="0"/>
 *         &lt;element name="IteratorCount" type="{http://www.datapower.com/schemas/management}dmUInt32" minOccurs="0"/>
 *         &lt;element name="LoopAction" type="{http://www.datapower.com/schemas/management}dmString" minOccurs="0"/>
 *         &lt;element name="AsyncAction" type="{http://www.datapower.com/schemas/management}dmString" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Timeout" type="{http://www.datapower.com/schemas/management}dmTimeIntervalMillis" minOccurs="0"/>
 *         &lt;element name="WSDLPortQName" type="{http://www.datapower.com/schemas/management}dmString" minOccurs="0"/>
 *         &lt;element name="WSDLOperationName" type="{http://www.datapower.com/schemas/management}dmString" minOccurs="0"/>
 *         &lt;element name="WSDLMessageDirectionOrName" type="{http://www.datapower.com/schemas/management}dmString" minOccurs="0"/>
 *         &lt;element name="WSDLAttachmentPart" type="{http://www.datapower.com/schemas/management}dmString" minOccurs="0"/>
 *         &lt;element name="MethodRewriteType" type="{http://www.datapower.com/schemas/management}dmHTTPMethodRESTType" minOccurs="0"/>
 *         &lt;element name="MethodType" type="{http://www.datapower.com/schemas/management}dmHTTPMethodRESTType" minOccurs="0"/>
 *         &lt;element name="MethodType2" type="{http://www.datapower.com/schemas/management}dmHTTPMethodRESTType2" minOccurs="0"/>
 *       &lt;/choice>
 *       &lt;attGroup ref="{http://www.datapower.com/schemas/management}ConfigAttributes"/>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConfigStylePolicyAction", propOrder = {
    "userSummaryOrTypeOrInput"
})
public class ConfigStylePolicyAction
    extends ConfigConfigBase
{

    @XmlElementRefs({
        @XmlElementRef(name = "WSDLAttachmentPart", type = JAXBElement.class),
        @XmlElementRef(name = "Value", type = JAXBElement.class),
        @XmlElementRef(name = "StylesheetParameters", type = JAXBElement.class),
        @XmlElementRef(name = "IteratorExpression", type = JAXBElement.class),
        @XmlElementRef(name = "ErrorOutput", type = JAXBElement.class),
        @XmlElementRef(name = "Output", type = JAXBElement.class),
        @XmlElementRef(name = "WSDLMessageDirectionOrName", type = JAXBElement.class),
        @XmlElementRef(name = "Destination", type = JAXBElement.class),
        @XmlElementRef(name = "AsyncAction", type = JAXBElement.class),
        @XmlElementRef(name = "AAA", type = JAXBElement.class),
        @XmlElementRef(name = "Asynchronous", type = JAXBElement.class),
        @XmlElementRef(name = "DynamicStylesheet", type = JAXBElement.class),
        @XmlElementRef(name = "RetryCount", type = JAXBElement.class),
        @XmlElementRef(name = "ResultsMode", type = JAXBElement.class),
        @XmlElementRef(name = "ErrorInput", type = JAXBElement.class),
        @XmlElementRef(name = "SQLDataSource", type = JAXBElement.class),
        @XmlElementRef(name = "ErrorMode", type = JAXBElement.class),
        @XmlElementRef(name = "InputConversion", type = JAXBElement.class),
        @XmlElementRef(name = "LoopAction", type = JAXBElement.class),
        @XmlElementRef(name = "RetryInterval", type = JAXBElement.class),
        @XmlElementRef(name = "WSDLPortQName", type = JAXBElement.class),
        @XmlElementRef(name = "TxMode", type = JAXBElement.class),
        @XmlElementRef(name = "MethodType2", type = JAXBElement.class),
        @XmlElementRef(name = "Type", type = JAXBElement.class),
        @XmlElementRef(name = "Rule", type = JAXBElement.class),
        @XmlElementRef(name = "NamedOutputs", type = JAXBElement.class),
        @XmlElementRef(name = "LogLevel", type = JAXBElement.class),
        @XmlElementRef(name = "WSDLOperationName", type = JAXBElement.class),
        @XmlElementRef(name = "SchemaURL", type = JAXBElement.class),
        @XmlElementRef(name = "MethodRewriteType", type = JAXBElement.class),
        @XmlElementRef(name = "SOAPValidation", type = JAXBElement.class),
        @XmlElementRef(name = "SLMPolicy", type = JAXBElement.class),
        @XmlElementRef(name = "SQLText", type = JAXBElement.class),
        @XmlElementRef(name = "NamedInputs", type = JAXBElement.class),
        @XmlElementRef(name = "TxAuditLog", type = JAXBElement.class),
        @XmlElementRef(name = "Input", type = JAXBElement.class),
        @XmlElementRef(name = "MethodType", type = JAXBElement.class),
        @XmlElementRef(name = "UserSummary", type = JAXBElement.class),
        @XmlElementRef(name = "OutputType", type = JAXBElement.class),
        @XmlElementRef(name = "LogType", type = JAXBElement.class),
        @XmlElementRef(name = "AttachmentURI", type = JAXBElement.class),
        @XmlElementRef(name = "MultipleOutputs", type = JAXBElement.class),
        @XmlElementRef(name = "TxTopLevelMap", type = JAXBElement.class),
        @XmlElementRef(name = "Policy", type = JAXBElement.class),
        @XmlElementRef(name = "IteratorType", type = JAXBElement.class),
        @XmlElementRef(name = "SQLSourceType", type = JAXBElement.class),
        @XmlElementRef(name = "IteratorCount", type = JAXBElement.class),
        @XmlElementRef(name = "TxMap", type = JAXBElement.class),
        @XmlElementRef(name = "DynamicSchema", type = JAXBElement.class),
        @XmlElementRef(name = "CheckpointEvent", type = JAXBElement.class),
        @XmlElementRef(name = "Transactional", type = JAXBElement.class),
        @XmlElementRef(name = "Condition", type = JAXBElement.class),
        @XmlElementRef(name = "Timeout", type = JAXBElement.class),
        @XmlElementRef(name = "WsdlURL", type = JAXBElement.class),
        @XmlElementRef(name = "Variable", type = JAXBElement.class),
        @XmlElementRef(name = "Transform", type = JAXBElement.class),
        @XmlElementRef(name = "NamedInOutLocationType", type = JAXBElement.class),
        @XmlElementRef(name = "XPath", type = JAXBElement.class),
        @XmlElementRef(name = "SSLCred", type = JAXBElement.class)
    })
    protected List<JAXBElement<?>> userSummaryOrTypeOrInput;
    @XmlAttribute
    protected String name;
    @XmlAttribute
    protected Boolean local;
    @XmlAttribute
    protected Boolean intrinsic;
    @XmlAttribute(name = "read-only")
    protected Boolean readOnly;
    @XmlAttribute
    protected Boolean external;

    /**
     * Gets the value of the userSummaryOrTypeOrInput property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the userSummaryOrTypeOrInput property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUserSummaryOrTypeOrInput().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link DmStylesheetParameter }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link DmReference }{@code >}
     * {@link JAXBElement }{@code <}{@link DmToggle }{@code >}
     * {@link JAXBElement }{@code <}{@link DmReference }{@code >}
     * {@link JAXBElement }{@code <}{@link Long }{@code >}
     * {@link JAXBElement }{@code <}{@link DmResultsMultiWayMode }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link DmReference }{@code >}
     * {@link JAXBElement }{@code <}{@link DmStyleErrorMode }{@code >}
     * {@link JAXBElement }{@code <}{@link DmReference }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link Long }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link DmTxMode }{@code >}
     * {@link JAXBElement }{@code <}{@link DmHTTPMethodRESTType2 }{@code >}
     * {@link JAXBElement }{@code <}{@link DmStyleActionType }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link DmNamedInOut }{@code >}
     * {@link JAXBElement }{@code <}{@link DmLogLevel }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link DmHTTPMethodRESTType }{@code >}
     * {@link JAXBElement }{@code <}{@link DmSOAPValidation }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link DmNamedInOut }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link DmHTTPMethodRESTType }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link DmActionOutputType }{@code >}
     * {@link JAXBElement }{@code <}{@link DmReference }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link DmToggle }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link DmReference }{@code >}
     * {@link JAXBElement }{@code <}{@link DmIteratorType }{@code >}
     * {@link JAXBElement }{@code <}{@link DmSQLSourceType }{@code >}
     * {@link JAXBElement }{@code <}{@link Long }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link DmReference }{@code >}
     * {@link JAXBElement }{@code <}{@link DmCheckpointEvent }{@code >}
     * {@link JAXBElement }{@code <}{@link DmToggle }{@code >}
     * {@link JAXBElement }{@code <}{@link DmCondition }{@code >}
     * {@link JAXBElement }{@code <}{@link Long }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link DmNamedInOutLocationType }{@code >}
     * 
     * 
     */
    public List<JAXBElement<?>> getUserSummaryOrTypeOrInput() {
        if (userSummaryOrTypeOrInput == null) {
            userSummaryOrTypeOrInput = new ArrayList<JAXBElement<?>>();
        }
        return this.userSummaryOrTypeOrInput;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the local property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isLocal() {
        return local;
    }

    /**
     * Sets the value of the local property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLocal(Boolean value) {
        this.local = value;
    }

    /**
     * Gets the value of the intrinsic property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIntrinsic() {
        return intrinsic;
    }

    /**
     * Sets the value of the intrinsic property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIntrinsic(Boolean value) {
        this.intrinsic = value;
    }

    /**
     * Gets the value of the readOnly property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isReadOnly() {
        return readOnly;
    }

    /**
     * Sets the value of the readOnly property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setReadOnly(Boolean value) {
        this.readOnly = value;
    }

    /**
     * Gets the value of the external property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isExternal() {
        return external;
    }

    /**
     * Sets the value of the external property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setExternal(Boolean value) {
        this.external = value;
    }

}
