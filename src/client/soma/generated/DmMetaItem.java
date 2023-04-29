
package client.soma.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dmMetaItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="dmMetaItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="MetaCategory" type="{http://www.datapower.com/schemas/management}dmMetadataCategory"/>
 *         &lt;element name="MetaName" type="{http://www.datapower.com/schemas/management}dmXMLLocalName"/>
 *         &lt;element name="DataSource" type="{http://www.datapower.com/schemas/management}dmString"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dmMetaItem", propOrder = {
    "metaCategory",
    "metaName",
    "dataSource"
})
public class DmMetaItem {

    @XmlElement(name = "MetaCategory", required = true)
    protected DmMetadataCategory metaCategory;
    @XmlElement(name = "MetaName", required = true)
    protected String metaName;
    @XmlElement(name = "DataSource", required = true, nillable = true)
    protected String dataSource;

    /**
     * Gets the value of the metaCategory property.
     * 
     * @return
     *     possible object is
     *     {@link DmMetadataCategory }
     *     
     */
    public DmMetadataCategory getMetaCategory() {
        return metaCategory;
    }

    /**
     * Sets the value of the metaCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmMetadataCategory }
     *     
     */
    public void setMetaCategory(DmMetadataCategory value) {
        this.metaCategory = value;
    }

    /**
     * Gets the value of the metaName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMetaName() {
        return metaName;
    }

    /**
     * Sets the value of the metaName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMetaName(String value) {
        this.metaName = value;
    }

    /**
     * Gets the value of the dataSource property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataSource() {
        return dataSource;
    }

    /**
     * Sets the value of the dataSource property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataSource(String value) {
        this.dataSource = value;
    }

}
