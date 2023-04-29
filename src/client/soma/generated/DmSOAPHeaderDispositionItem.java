
package client.soma.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dmSOAPHeaderDispositionItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="dmSOAPHeaderDispositionItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Namespace" type="{http://www.datapower.com/schemas/management}dmString"/>
 *         &lt;element name="LocalName" type="{http://www.datapower.com/schemas/management}dmString"/>
 *         &lt;element name="ChildLocalName" type="{http://www.datapower.com/schemas/management}dmString"/>
 *         &lt;element name="Action" type="{http://www.datapower.com/schemas/management}dmSOAPHeaderRefineType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dmSOAPHeaderDispositionItem", propOrder = {
    "namespace",
    "localName",
    "childLocalName",
    "action"
})
public class DmSOAPHeaderDispositionItem {

    @XmlElement(name = "Namespace", required = true, nillable = true)
    protected String namespace;
    @XmlElement(name = "LocalName", required = true, nillable = true)
    protected String localName;
    @XmlElement(name = "ChildLocalName", required = true, nillable = true)
    protected String childLocalName;
    @XmlElement(name = "Action", required = true)
    protected DmSOAPHeaderRefineType action;

    /**
     * Gets the value of the namespace property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNamespace() {
        return namespace;
    }

    /**
     * Sets the value of the namespace property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNamespace(String value) {
        this.namespace = value;
    }

    /**
     * Gets the value of the localName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocalName() {
        return localName;
    }

    /**
     * Sets the value of the localName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocalName(String value) {
        this.localName = value;
    }

    /**
     * Gets the value of the childLocalName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChildLocalName() {
        return childLocalName;
    }

    /**
     * Sets the value of the childLocalName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChildLocalName(String value) {
        this.childLocalName = value;
    }

    /**
     * Gets the value of the action property.
     * 
     * @return
     *     possible object is
     *     {@link DmSOAPHeaderRefineType }
     *     
     */
    public DmSOAPHeaderRefineType getAction() {
        return action;
    }

    /**
     * Sets the value of the action property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmSOAPHeaderRefineType }
     *     
     */
    public void setAction(DmSOAPHeaderRefineType value) {
        this.action = value;
    }

}
