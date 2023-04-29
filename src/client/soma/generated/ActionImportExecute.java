
package client.soma.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ActionImportExecute complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ActionImportExecute">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ImportPackageName" type="{http://www.datapower.com/schemas/management}dmString"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ActionImportExecute", propOrder = {
    "importPackageName"
})
public class ActionImportExecute {

    @XmlElement(name = "ImportPackageName", required = true)
    protected String importPackageName;

    /**
     * Gets the value of the importPackageName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImportPackageName() {
        return importPackageName;
    }

    /**
     * Sets the value of the importPackageName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImportPackageName(String value) {
        this.importPackageName = value;
    }

}
