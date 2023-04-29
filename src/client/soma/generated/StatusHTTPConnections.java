
package client.soma.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for StatusHTTPConnections complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StatusHTTPConnections">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="XMLManager" type="{http://www.datapower.com/schemas/management}dmReference" minOccurs="0"/>
 *         &lt;element name="reqTenSec" type="{http://www.datapower.com/schemas/management}dmCounter32" minOccurs="0"/>
 *         &lt;element name="reqOneMin" type="{http://www.datapower.com/schemas/management}dmCounter32" minOccurs="0"/>
 *         &lt;element name="reqTenMin" type="{http://www.datapower.com/schemas/management}dmCounter32" minOccurs="0"/>
 *         &lt;element name="reqOneHr" type="{http://www.datapower.com/schemas/management}dmCounter32" minOccurs="0"/>
 *         &lt;element name="reqOneDay" type="{http://www.datapower.com/schemas/management}dmCounter32" minOccurs="0"/>
 *         &lt;element name="reuseTenSec" type="{http://www.datapower.com/schemas/management}dmCounter32" minOccurs="0"/>
 *         &lt;element name="reuseOneMin" type="{http://www.datapower.com/schemas/management}dmCounter32" minOccurs="0"/>
 *         &lt;element name="reuseTenMin" type="{http://www.datapower.com/schemas/management}dmCounter32" minOccurs="0"/>
 *         &lt;element name="reuseOneHr" type="{http://www.datapower.com/schemas/management}dmCounter32" minOccurs="0"/>
 *         &lt;element name="reuseOneDay" type="{http://www.datapower.com/schemas/management}dmCounter32" minOccurs="0"/>
 *         &lt;element name="createTenSec" type="{http://www.datapower.com/schemas/management}dmCounter32" minOccurs="0"/>
 *         &lt;element name="createOneMin" type="{http://www.datapower.com/schemas/management}dmCounter32" minOccurs="0"/>
 *         &lt;element name="createTenMin" type="{http://www.datapower.com/schemas/management}dmCounter32" minOccurs="0"/>
 *         &lt;element name="createOneHr" type="{http://www.datapower.com/schemas/management}dmCounter32" minOccurs="0"/>
 *         &lt;element name="createOneDay" type="{http://www.datapower.com/schemas/management}dmCounter32" minOccurs="0"/>
 *         &lt;element name="returnTenSec" type="{http://www.datapower.com/schemas/management}dmCounter32" minOccurs="0"/>
 *         &lt;element name="returnOneMin" type="{http://www.datapower.com/schemas/management}dmCounter32" minOccurs="0"/>
 *         &lt;element name="returnTenMin" type="{http://www.datapower.com/schemas/management}dmCounter32" minOccurs="0"/>
 *         &lt;element name="returnOneHr" type="{http://www.datapower.com/schemas/management}dmCounter32" minOccurs="0"/>
 *         &lt;element name="returnOneDay" type="{http://www.datapower.com/schemas/management}dmCounter32" minOccurs="0"/>
 *         &lt;element name="offerTenSec" type="{http://www.datapower.com/schemas/management}dmCounter32" minOccurs="0"/>
 *         &lt;element name="offerOneMin" type="{http://www.datapower.com/schemas/management}dmCounter32" minOccurs="0"/>
 *         &lt;element name="offerTenMin" type="{http://www.datapower.com/schemas/management}dmCounter32" minOccurs="0"/>
 *         &lt;element name="offerOneHr" type="{http://www.datapower.com/schemas/management}dmCounter32" minOccurs="0"/>
 *         &lt;element name="offerOneDay" type="{http://www.datapower.com/schemas/management}dmCounter32" minOccurs="0"/>
 *         &lt;element name="destroyTenSec" type="{http://www.datapower.com/schemas/management}dmCounter32" minOccurs="0"/>
 *         &lt;element name="destroyOneMin" type="{http://www.datapower.com/schemas/management}dmCounter32" minOccurs="0"/>
 *         &lt;element name="destroyTenMin" type="{http://www.datapower.com/schemas/management}dmCounter32" minOccurs="0"/>
 *         &lt;element name="destroyOneHr" type="{http://www.datapower.com/schemas/management}dmCounter32" minOccurs="0"/>
 *         &lt;element name="destroyOneDay" type="{http://www.datapower.com/schemas/management}dmCounter32" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StatusHTTPConnections", propOrder = {
    "xmlManager",
    "reqTenSec",
    "reqOneMin",
    "reqTenMin",
    "reqOneHr",
    "reqOneDay",
    "reuseTenSec",
    "reuseOneMin",
    "reuseTenMin",
    "reuseOneHr",
    "reuseOneDay",
    "createTenSec",
    "createOneMin",
    "createTenMin",
    "createOneHr",
    "createOneDay",
    "returnTenSec",
    "returnOneMin",
    "returnTenMin",
    "returnOneHr",
    "returnOneDay",
    "offerTenSec",
    "offerOneMin",
    "offerTenMin",
    "offerOneHr",
    "offerOneDay",
    "destroyTenSec",
    "destroyOneMin",
    "destroyTenMin",
    "destroyOneHr",
    "destroyOneDay"
})
public class StatusHTTPConnections {

    @XmlElement(name = "XMLManager")
    protected DmReference xmlManager;
    protected Long reqTenSec;
    protected Long reqOneMin;
    protected Long reqTenMin;
    protected Long reqOneHr;
    protected Long reqOneDay;
    protected Long reuseTenSec;
    protected Long reuseOneMin;
    protected Long reuseTenMin;
    protected Long reuseOneHr;
    protected Long reuseOneDay;
    protected Long createTenSec;
    protected Long createOneMin;
    protected Long createTenMin;
    protected Long createOneHr;
    protected Long createOneDay;
    protected Long returnTenSec;
    protected Long returnOneMin;
    protected Long returnTenMin;
    protected Long returnOneHr;
    protected Long returnOneDay;
    protected Long offerTenSec;
    protected Long offerOneMin;
    protected Long offerTenMin;
    protected Long offerOneHr;
    protected Long offerOneDay;
    protected Long destroyTenSec;
    protected Long destroyOneMin;
    protected Long destroyTenMin;
    protected Long destroyOneHr;
    protected Long destroyOneDay;

    /**
     * Gets the value of the xmlManager property.
     * 
     * @return
     *     possible object is
     *     {@link DmReference }
     *     
     */
    public DmReference getXMLManager() {
        return xmlManager;
    }

    /**
     * Sets the value of the xmlManager property.
     * 
     * @param value
     *     allowed object is
     *     {@link DmReference }
     *     
     */
    public void setXMLManager(DmReference value) {
        this.xmlManager = value;
    }

    /**
     * Gets the value of the reqTenSec property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getReqTenSec() {
        return reqTenSec;
    }

    /**
     * Sets the value of the reqTenSec property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setReqTenSec(Long value) {
        this.reqTenSec = value;
    }

    /**
     * Gets the value of the reqOneMin property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getReqOneMin() {
        return reqOneMin;
    }

    /**
     * Sets the value of the reqOneMin property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setReqOneMin(Long value) {
        this.reqOneMin = value;
    }

    /**
     * Gets the value of the reqTenMin property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getReqTenMin() {
        return reqTenMin;
    }

    /**
     * Sets the value of the reqTenMin property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setReqTenMin(Long value) {
        this.reqTenMin = value;
    }

    /**
     * Gets the value of the reqOneHr property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getReqOneHr() {
        return reqOneHr;
    }

    /**
     * Sets the value of the reqOneHr property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setReqOneHr(Long value) {
        this.reqOneHr = value;
    }

    /**
     * Gets the value of the reqOneDay property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getReqOneDay() {
        return reqOneDay;
    }

    /**
     * Sets the value of the reqOneDay property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setReqOneDay(Long value) {
        this.reqOneDay = value;
    }

    /**
     * Gets the value of the reuseTenSec property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getReuseTenSec() {
        return reuseTenSec;
    }

    /**
     * Sets the value of the reuseTenSec property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setReuseTenSec(Long value) {
        this.reuseTenSec = value;
    }

    /**
     * Gets the value of the reuseOneMin property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getReuseOneMin() {
        return reuseOneMin;
    }

    /**
     * Sets the value of the reuseOneMin property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setReuseOneMin(Long value) {
        this.reuseOneMin = value;
    }

    /**
     * Gets the value of the reuseTenMin property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getReuseTenMin() {
        return reuseTenMin;
    }

    /**
     * Sets the value of the reuseTenMin property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setReuseTenMin(Long value) {
        this.reuseTenMin = value;
    }

    /**
     * Gets the value of the reuseOneHr property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getReuseOneHr() {
        return reuseOneHr;
    }

    /**
     * Sets the value of the reuseOneHr property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setReuseOneHr(Long value) {
        this.reuseOneHr = value;
    }

    /**
     * Gets the value of the reuseOneDay property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getReuseOneDay() {
        return reuseOneDay;
    }

    /**
     * Sets the value of the reuseOneDay property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setReuseOneDay(Long value) {
        this.reuseOneDay = value;
    }

    /**
     * Gets the value of the createTenSec property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCreateTenSec() {
        return createTenSec;
    }

    /**
     * Sets the value of the createTenSec property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCreateTenSec(Long value) {
        this.createTenSec = value;
    }

    /**
     * Gets the value of the createOneMin property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCreateOneMin() {
        return createOneMin;
    }

    /**
     * Sets the value of the createOneMin property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCreateOneMin(Long value) {
        this.createOneMin = value;
    }

    /**
     * Gets the value of the createTenMin property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCreateTenMin() {
        return createTenMin;
    }

    /**
     * Sets the value of the createTenMin property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCreateTenMin(Long value) {
        this.createTenMin = value;
    }

    /**
     * Gets the value of the createOneHr property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCreateOneHr() {
        return createOneHr;
    }

    /**
     * Sets the value of the createOneHr property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCreateOneHr(Long value) {
        this.createOneHr = value;
    }

    /**
     * Gets the value of the createOneDay property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCreateOneDay() {
        return createOneDay;
    }

    /**
     * Sets the value of the createOneDay property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCreateOneDay(Long value) {
        this.createOneDay = value;
    }

    /**
     * Gets the value of the returnTenSec property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getReturnTenSec() {
        return returnTenSec;
    }

    /**
     * Sets the value of the returnTenSec property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setReturnTenSec(Long value) {
        this.returnTenSec = value;
    }

    /**
     * Gets the value of the returnOneMin property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getReturnOneMin() {
        return returnOneMin;
    }

    /**
     * Sets the value of the returnOneMin property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setReturnOneMin(Long value) {
        this.returnOneMin = value;
    }

    /**
     * Gets the value of the returnTenMin property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getReturnTenMin() {
        return returnTenMin;
    }

    /**
     * Sets the value of the returnTenMin property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setReturnTenMin(Long value) {
        this.returnTenMin = value;
    }

    /**
     * Gets the value of the returnOneHr property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getReturnOneHr() {
        return returnOneHr;
    }

    /**
     * Sets the value of the returnOneHr property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setReturnOneHr(Long value) {
        this.returnOneHr = value;
    }

    /**
     * Gets the value of the returnOneDay property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getReturnOneDay() {
        return returnOneDay;
    }

    /**
     * Sets the value of the returnOneDay property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setReturnOneDay(Long value) {
        this.returnOneDay = value;
    }

    /**
     * Gets the value of the offerTenSec property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getOfferTenSec() {
        return offerTenSec;
    }

    /**
     * Sets the value of the offerTenSec property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setOfferTenSec(Long value) {
        this.offerTenSec = value;
    }

    /**
     * Gets the value of the offerOneMin property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getOfferOneMin() {
        return offerOneMin;
    }

    /**
     * Sets the value of the offerOneMin property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setOfferOneMin(Long value) {
        this.offerOneMin = value;
    }

    /**
     * Gets the value of the offerTenMin property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getOfferTenMin() {
        return offerTenMin;
    }

    /**
     * Sets the value of the offerTenMin property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setOfferTenMin(Long value) {
        this.offerTenMin = value;
    }

    /**
     * Gets the value of the offerOneHr property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getOfferOneHr() {
        return offerOneHr;
    }

    /**
     * Sets the value of the offerOneHr property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setOfferOneHr(Long value) {
        this.offerOneHr = value;
    }

    /**
     * Gets the value of the offerOneDay property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getOfferOneDay() {
        return offerOneDay;
    }

    /**
     * Sets the value of the offerOneDay property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setOfferOneDay(Long value) {
        this.offerOneDay = value;
    }

    /**
     * Gets the value of the destroyTenSec property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getDestroyTenSec() {
        return destroyTenSec;
    }

    /**
     * Sets the value of the destroyTenSec property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setDestroyTenSec(Long value) {
        this.destroyTenSec = value;
    }

    /**
     * Gets the value of the destroyOneMin property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getDestroyOneMin() {
        return destroyOneMin;
    }

    /**
     * Sets the value of the destroyOneMin property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setDestroyOneMin(Long value) {
        this.destroyOneMin = value;
    }

    /**
     * Gets the value of the destroyTenMin property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getDestroyTenMin() {
        return destroyTenMin;
    }

    /**
     * Sets the value of the destroyTenMin property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setDestroyTenMin(Long value) {
        this.destroyTenMin = value;
    }

    /**
     * Gets the value of the destroyOneHr property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getDestroyOneHr() {
        return destroyOneHr;
    }

    /**
     * Sets the value of the destroyOneHr property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setDestroyOneHr(Long value) {
        this.destroyOneHr = value;
    }

    /**
     * Gets the value of the destroyOneDay property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getDestroyOneDay() {
        return destroyOneDay;
    }

    /**
     * Sets the value of the destroyOneDay property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setDestroyOneDay(Long value) {
        this.destroyOneDay = value;
    }

}
