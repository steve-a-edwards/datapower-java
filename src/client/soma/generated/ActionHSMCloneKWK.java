
package client.soma.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ActionHSMCloneKWK complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ActionHSMCloneKWK">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="InputFilename" type="{http://www.datapower.com/schemas/management}dmFSFile" minOccurs="0"/>
 *         &lt;element name="OutputFilename" type="{http://www.datapower.com/schemas/management}dmString" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ActionHSMCloneKWK", propOrder = {
    "inputFilename",
    "outputFilename"
})
public class ActionHSMCloneKWK {

    @XmlElement(name = "InputFilename")
    protected String inputFilename;
    @XmlElement(name = "OutputFilename")
    protected String outputFilename;

    /**
     * Gets the value of the inputFilename property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInputFilename() {
        return inputFilename;
    }

    /**
     * Sets the value of the inputFilename property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInputFilename(String value) {
        this.inputFilename = value;
    }

    /**
     * Gets the value of the outputFilename property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutputFilename() {
        return outputFilename;
    }

    /**
     * Sets the value of the outputFilename property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutputFilename(String value) {
        this.outputFilename = value;
    }

}
