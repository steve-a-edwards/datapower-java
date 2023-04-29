
package client.soma.generated;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="get-samlart">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="user" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="password" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="get-status">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="class" type="{http://www.datapower.com/schemas/management}StatusEnum" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="get-config">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="class" type="{http://www.datapower.com/schemas/management}ConfigEnum" />
 *                 &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="recursive" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                 &lt;attribute name="persisted" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="get-diff">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;choice>
 *                   &lt;sequence>
 *                     &lt;element name="from">
 *                       &lt;complexType>
 *                         &lt;complexContent>
 *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                             &lt;choice>
 *                               &lt;element name="export" type="{http://www.datapower.com/schemas/management}base64-binary"/>
 *                               &lt;element name="backup" type="{http://www.datapower.com/schemas/management}base64-binary"/>
 *                               &lt;element name="object">
 *                                 &lt;complexType>
 *                                   &lt;complexContent>
 *                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                       &lt;attribute name="class" type="{http://www.datapower.com/schemas/management}export-class" />
 *                                       &lt;attribute name="name" type="{http://www.datapower.com/schemas/management}export-name" />
 *                                       &lt;attribute name="recursive" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                                       &lt;attribute name="persisted" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                                     &lt;/restriction>
 *                                   &lt;/complexContent>
 *                                 &lt;/complexType>
 *                               &lt;/element>
 *                             &lt;/choice>
 *                           &lt;/restriction>
 *                         &lt;/complexContent>
 *                       &lt;/complexType>
 *                     &lt;/element>
 *                     &lt;element name="to">
 *                       &lt;complexType>
 *                         &lt;complexContent>
 *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                             &lt;choice>
 *                               &lt;element name="export" type="{http://www.datapower.com/schemas/management}base64-binary"/>
 *                               &lt;element name="backup" type="{http://www.datapower.com/schemas/management}base64-binary"/>
 *                               &lt;element name="object">
 *                                 &lt;complexType>
 *                                   &lt;complexContent>
 *                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                       &lt;attribute name="class" type="{http://www.datapower.com/schemas/management}export-class" />
 *                                       &lt;attribute name="name" type="{http://www.datapower.com/schemas/management}export-name" />
 *                                       &lt;attribute name="recursive" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                                       &lt;attribute name="persisted" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                                     &lt;/restriction>
 *                                   &lt;/complexContent>
 *                                 &lt;/complexType>
 *                               &lt;/element>
 *                             &lt;/choice>
 *                           &lt;/restriction>
 *                         &lt;/complexContent>
 *                       &lt;/complexType>
 *                     &lt;/element>
 *                   &lt;/sequence>
 *                   &lt;element name="object">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attribute name="class" type="{http://www.datapower.com/schemas/management}export-class" />
 *                           &lt;attribute name="name" type="{http://www.datapower.com/schemas/management}export-name" />
 *                           &lt;attribute name="recursive" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                           &lt;attribute name="from-persisted" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                           &lt;attribute name="to-persisted" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/choice>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="get-conformance-report">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="class" type="{http://www.datapower.com/schemas/management}ConfigEnum" />
 *                 &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="profile" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="get-log">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="get-filestore">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="location" type="{http://www.datapower.com/schemas/management}filestore-location" />
 *                 &lt;attribute name="annotated" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                 &lt;attribute name="layout-only" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                 &lt;attribute name="no-subdirectories" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="get-file">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="set-file">
 *           &lt;complexType>
 *             &lt;simpleContent>
 *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>base64Binary">
 *                 &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/extension>
 *             &lt;/simpleContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="do-export">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="user-comment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="object" maxOccurs="unbounded">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attribute name="class" type="{http://www.datapower.com/schemas/management}export-class" />
 *                           &lt;attribute name="name" type="{http://www.datapower.com/schemas/management}export-name" />
 *                           &lt;attribute name="ref-objects" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                           &lt;attribute name="ref-files" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                           &lt;attribute name="include-debug" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="deployment-policy" type="{http://www.datapower.com/schemas/management}ConfigConfigDeploymentPolicy" minOccurs="0"/>
 *                 &lt;/sequence>
 *                 &lt;attribute name="format" type="{http://www.datapower.com/schemas/management}export-format" />
 *                 &lt;attribute name="all-files" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                 &lt;attribute name="persisted" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                 &lt;attribute name="deployment-policy" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="do-import">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="input-file" type="{http://www.datapower.com/schemas/management}base64-binary"/>
 *                   &lt;element name="object" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attribute name="class" type="{http://www.datapower.com/schemas/management}export-class" />
 *                           &lt;attribute name="name" type="{http://www.datapower.com/schemas/management}export-name" />
 *                           &lt;attribute name="overwrite" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                           &lt;attribute name="import-debug" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="file" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="overwrite" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="deployment-policy" type="{http://www.datapower.com/schemas/management}ConfigConfigDeploymentPolicy" minOccurs="0"/>
 *                 &lt;/sequence>
 *                 &lt;attribute name="source-type" type="{http://www.datapower.com/schemas/management}export-format" />
 *                 &lt;attribute name="dry-run" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                 &lt;attribute name="overwrite-files" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                 &lt;attribute name="overwrite-objects" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                 &lt;attribute name="rewrite-local-ip" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                 &lt;attribute name="deployment-policy" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="do-cpa-import">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="input-file" type="{http://www.datapower.com/schemas/management}base64-binary"/>
 *                   &lt;element name="gateway-name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="internal-party" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                 &lt;/sequence>
 *                 &lt;attribute name="overwrite-files" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                 &lt;attribute name="overwrite-objects" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="do-backup">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="user-comment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="domain" maxOccurs="unbounded">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="deployment-policy" type="{http://www.datapower.com/schemas/management}ConfigConfigDeploymentPolicy" minOccurs="0"/>
 *                 &lt;/sequence>
 *                 &lt;attribute name="format" type="{http://www.datapower.com/schemas/management}export-format" />
 *                 &lt;attribute name="persisted" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                 &lt;attribute name="deployment-policy" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="do-restore">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="input-file" type="{http://www.datapower.com/schemas/management}base64-binary"/>
 *                   &lt;element name="domain" maxOccurs="unbounded">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="import-domain" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                           &lt;attribute name="reset-domain" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="deployment-policy" type="{http://www.datapower.com/schemas/management}ConfigConfigDeploymentPolicy" minOccurs="0"/>
 *                 &lt;/sequence>
 *                 &lt;attribute name="source-type" type="{http://www.datapower.com/schemas/management}export-format" />
 *                 &lt;attribute name="dry-run" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                 &lt;attribute name="overwrite-files" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                 &lt;attribute name="overwrite-objects" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                 &lt;attribute name="rewrite-local-ip" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                 &lt;attribute name="deployment-policy" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="do-action" type="{http://www.datapower.com/schemas/management}AnyActionElement"/>
 *         &lt;element name="get-async-result">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="logid" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="set-config" type="{http://www.datapower.com/schemas/management}AnyConfigElement"/>
 *         &lt;element name="modify-config" type="{http://www.datapower.com/schemas/management}AnyModifyElement"/>
 *         &lt;element name="del-config" type="{http://www.datapower.com/schemas/management}AnyDeleteElement"/>
 *       &lt;/choice>
 *       &lt;attribute name="domain" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "getSamlart",
    "getStatus",
    "getConfig",
    "getDiff",
    "getConformanceReport",
    "getLog",
    "getFilestore",
    "getFile",
    "setFile",
    "doExport",
    "doImport",
    "doCpaImport",
    "doBackup",
    "doRestore",
    "doAction",
    "getAsyncResult",
    "setConfig",
    "modifyConfig",
    "delConfig"
})
@XmlRootElement(name = "request")
public class Request {

    @XmlElement(name = "get-samlart", namespace = "http://www.datapower.com/schemas/management")
    protected Request.GetSamlart getSamlart;
    @XmlElement(name = "get-status", namespace = "http://www.datapower.com/schemas/management")
    protected Request.GetStatus getStatus;
    @XmlElement(name = "get-config", namespace = "http://www.datapower.com/schemas/management")
    protected Request.GetConfig getConfig;
    @XmlElement(name = "get-diff", namespace = "http://www.datapower.com/schemas/management")
    protected Request.GetDiff getDiff;
    @XmlElement(name = "get-conformance-report", namespace = "http://www.datapower.com/schemas/management")
    protected Request.GetConformanceReport getConformanceReport;
    @XmlElement(name = "get-log", namespace = "http://www.datapower.com/schemas/management")
    protected Request.GetLog getLog;
    @XmlElement(name = "get-filestore", namespace = "http://www.datapower.com/schemas/management")
    protected Request.GetFilestore getFilestore;
    @XmlElement(name = "get-file", namespace = "http://www.datapower.com/schemas/management")
    protected Request.GetFile getFile;
    @XmlElement(name = "set-file", namespace = "http://www.datapower.com/schemas/management")
    protected Request.SetFile setFile;
    @XmlElement(name = "do-export", namespace = "http://www.datapower.com/schemas/management")
    protected Request.DoExport doExport;
    @XmlElement(name = "do-import", namespace = "http://www.datapower.com/schemas/management")
    protected Request.DoImport doImport;
    @XmlElement(name = "do-cpa-import", namespace = "http://www.datapower.com/schemas/management")
    protected Request.DoCpaImport doCpaImport;
    @XmlElement(name = "do-backup", namespace = "http://www.datapower.com/schemas/management")
    protected Request.DoBackup doBackup;
    @XmlElement(name = "do-restore", namespace = "http://www.datapower.com/schemas/management")
    protected Request.DoRestore doRestore;
    @XmlElement(name = "do-action", namespace = "http://www.datapower.com/schemas/management")
    protected AnyActionElement doAction;
    @XmlElement(name = "get-async-result", namespace = "http://www.datapower.com/schemas/management")
    protected Request.GetAsyncResult getAsyncResult;
    @XmlElement(name = "set-config", namespace = "http://www.datapower.com/schemas/management")
    protected AnyConfigElement setConfig;
    @XmlElement(name = "modify-config", namespace = "http://www.datapower.com/schemas/management")
    protected AnyModifyElement modifyConfig;
    @XmlElement(name = "del-config", namespace = "http://www.datapower.com/schemas/management")
    protected AnyDeleteElement delConfig;
    @XmlAttribute
    protected String domain;

    /**
     * Gets the value of the getSamlart property.
     * 
     * @return
     *     possible object is
     *     {@link Request.GetSamlart }
     *     
     */
    public Request.GetSamlart getGetSamlart() {
        return getSamlart;
    }

    /**
     * Sets the value of the getSamlart property.
     * 
     * @param value
     *     allowed object is
     *     {@link Request.GetSamlart }
     *     
     */
    public void setGetSamlart(Request.GetSamlart value) {
        this.getSamlart = value;
    }

    /**
     * Gets the value of the getStatus property.
     * 
     * @return
     *     possible object is
     *     {@link Request.GetStatus }
     *     
     */
    public Request.GetStatus getGetStatus() {
        return getStatus;
    }

    /**
     * Sets the value of the getStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link Request.GetStatus }
     *     
     */
    public void setGetStatus(Request.GetStatus value) {
        this.getStatus = value;
    }

    /**
     * Gets the value of the getConfig property.
     * 
     * @return
     *     possible object is
     *     {@link Request.GetConfig }
     *     
     */
    public Request.GetConfig getGetConfig() {
        return getConfig;
    }

    /**
     * Sets the value of the getConfig property.
     * 
     * @param value
     *     allowed object is
     *     {@link Request.GetConfig }
     *     
     */
    public void setGetConfig(Request.GetConfig value) {
        this.getConfig = value;
    }

    /**
     * Gets the value of the getDiff property.
     * 
     * @return
     *     possible object is
     *     {@link Request.GetDiff }
     *     
     */
    public Request.GetDiff getGetDiff() {
        return getDiff;
    }

    /**
     * Sets the value of the getDiff property.
     * 
     * @param value
     *     allowed object is
     *     {@link Request.GetDiff }
     *     
     */
    public void setGetDiff(Request.GetDiff value) {
        this.getDiff = value;
    }

    /**
     * Gets the value of the getConformanceReport property.
     * 
     * @return
     *     possible object is
     *     {@link Request.GetConformanceReport }
     *     
     */
    public Request.GetConformanceReport getGetConformanceReport() {
        return getConformanceReport;
    }

    /**
     * Sets the value of the getConformanceReport property.
     * 
     * @param value
     *     allowed object is
     *     {@link Request.GetConformanceReport }
     *     
     */
    public void setGetConformanceReport(Request.GetConformanceReport value) {
        this.getConformanceReport = value;
    }

    /**
     * Gets the value of the getLog property.
     * 
     * @return
     *     possible object is
     *     {@link Request.GetLog }
     *     
     */
    public Request.GetLog getGetLog() {
        return getLog;
    }

    /**
     * Sets the value of the getLog property.
     * 
     * @param value
     *     allowed object is
     *     {@link Request.GetLog }
     *     
     */
    public void setGetLog(Request.GetLog value) {
        this.getLog = value;
    }

    /**
     * Gets the value of the getFilestore property.
     * 
     * @return
     *     possible object is
     *     {@link Request.GetFilestore }
     *     
     */
    public Request.GetFilestore getGetFilestore() {
        return getFilestore;
    }

    /**
     * Sets the value of the getFilestore property.
     * 
     * @param value
     *     allowed object is
     *     {@link Request.GetFilestore }
     *     
     */
    public void setGetFilestore(Request.GetFilestore value) {
        this.getFilestore = value;
    }

    /**
     * Gets the value of the getFile property.
     * 
     * @return
     *     possible object is
     *     {@link Request.GetFile }
     *     
     */
    public Request.GetFile getGetFile() {
        return getFile;
    }

    /**
     * Sets the value of the getFile property.
     * 
     * @param value
     *     allowed object is
     *     {@link Request.GetFile }
     *     
     */
    public void setGetFile(Request.GetFile value) {
        this.getFile = value;
    }

    /**
     * Gets the value of the setFile property.
     * 
     * @return
     *     possible object is
     *     {@link Request.SetFile }
     *     
     */
    public Request.SetFile getSetFile() {
        return setFile;
    }

    /**
     * Sets the value of the setFile property.
     * 
     * @param value
     *     allowed object is
     *     {@link Request.SetFile }
     *     
     */
    public void setSetFile(Request.SetFile value) {
        this.setFile = value;
    }

    /**
     * Gets the value of the doExport property.
     * 
     * @return
     *     possible object is
     *     {@link Request.DoExport }
     *     
     */
    public Request.DoExport getDoExport() {
        return doExport;
    }

    /**
     * Sets the value of the doExport property.
     * 
     * @param value
     *     allowed object is
     *     {@link Request.DoExport }
     *     
     */
    public void setDoExport(Request.DoExport value) {
        this.doExport = value;
    }

    /**
     * Gets the value of the doImport property.
     * 
     * @return
     *     possible object is
     *     {@link Request.DoImport }
     *     
     */
    public Request.DoImport getDoImport() {
        return doImport;
    }

    /**
     * Sets the value of the doImport property.
     * 
     * @param value
     *     allowed object is
     *     {@link Request.DoImport }
     *     
     */
    public void setDoImport(Request.DoImport value) {
        this.doImport = value;
    }

    /**
     * Gets the value of the doCpaImport property.
     * 
     * @return
     *     possible object is
     *     {@link Request.DoCpaImport }
     *     
     */
    public Request.DoCpaImport getDoCpaImport() {
        return doCpaImport;
    }

    /**
     * Sets the value of the doCpaImport property.
     * 
     * @param value
     *     allowed object is
     *     {@link Request.DoCpaImport }
     *     
     */
    public void setDoCpaImport(Request.DoCpaImport value) {
        this.doCpaImport = value;
    }

    /**
     * Gets the value of the doBackup property.
     * 
     * @return
     *     possible object is
     *     {@link Request.DoBackup }
     *     
     */
    public Request.DoBackup getDoBackup() {
        return doBackup;
    }

    /**
     * Sets the value of the doBackup property.
     * 
     * @param value
     *     allowed object is
     *     {@link Request.DoBackup }
     *     
     */
    public void setDoBackup(Request.DoBackup value) {
        this.doBackup = value;
    }

    /**
     * Gets the value of the doRestore property.
     * 
     * @return
     *     possible object is
     *     {@link Request.DoRestore }
     *     
     */
    public Request.DoRestore getDoRestore() {
        return doRestore;
    }

    /**
     * Sets the value of the doRestore property.
     * 
     * @param value
     *     allowed object is
     *     {@link Request.DoRestore }
     *     
     */
    public void setDoRestore(Request.DoRestore value) {
        this.doRestore = value;
    }

    /**
     * Gets the value of the doAction property.
     * 
     * @return
     *     possible object is
     *     {@link AnyActionElement }
     *     
     */
    public AnyActionElement getDoAction() {
        return doAction;
    }

    /**
     * Sets the value of the doAction property.
     * 
     * @param value
     *     allowed object is
     *     {@link AnyActionElement }
     *     
     */
    public void setDoAction(AnyActionElement value) {
        this.doAction = value;
    }

    /**
     * Gets the value of the getAsyncResult property.
     * 
     * @return
     *     possible object is
     *     {@link Request.GetAsyncResult }
     *     
     */
    public Request.GetAsyncResult getGetAsyncResult() {
        return getAsyncResult;
    }

    /**
     * Sets the value of the getAsyncResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link Request.GetAsyncResult }
     *     
     */
    public void setGetAsyncResult(Request.GetAsyncResult value) {
        this.getAsyncResult = value;
    }

    /**
     * Gets the value of the setConfig property.
     * 
     * @return
     *     possible object is
     *     {@link AnyConfigElement }
     *     
     */
    public AnyConfigElement getSetConfig() {
        return setConfig;
    }

    /**
     * Sets the value of the setConfig property.
     * 
     * @param value
     *     allowed object is
     *     {@link AnyConfigElement }
     *     
     */
    public void setSetConfig(AnyConfigElement value) {
        this.setConfig = value;
    }

    /**
     * Gets the value of the modifyConfig property.
     * 
     * @return
     *     possible object is
     *     {@link AnyModifyElement }
     *     
     */
    public AnyModifyElement getModifyConfig() {
        return modifyConfig;
    }

    /**
     * Sets the value of the modifyConfig property.
     * 
     * @param value
     *     allowed object is
     *     {@link AnyModifyElement }
     *     
     */
    public void setModifyConfig(AnyModifyElement value) {
        this.modifyConfig = value;
    }

    /**
     * Gets the value of the delConfig property.
     * 
     * @return
     *     possible object is
     *     {@link AnyDeleteElement }
     *     
     */
    public AnyDeleteElement getDelConfig() {
        return delConfig;
    }

    /**
     * Sets the value of the delConfig property.
     * 
     * @param value
     *     allowed object is
     *     {@link AnyDeleteElement }
     *     
     */
    public void setDelConfig(AnyDeleteElement value) {
        this.delConfig = value;
    }

    /**
     * Gets the value of the domain property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDomain() {
        return domain;
    }

    /**
     * Sets the value of the domain property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDomain(String value) {
        this.domain = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="user-comment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="domain" maxOccurs="unbounded">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="deployment-policy" type="{http://www.datapower.com/schemas/management}ConfigConfigDeploymentPolicy" minOccurs="0"/>
     *       &lt;/sequence>
     *       &lt;attribute name="format" type="{http://www.datapower.com/schemas/management}export-format" />
     *       &lt;attribute name="persisted" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *       &lt;attribute name="deployment-policy" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "userComment",
        "domain",
        "deploymentPolicy"
    })
    public static class DoBackup {

        @XmlElement(name = "user-comment", namespace = "http://www.datapower.com/schemas/management")
        protected String userComment;
        @XmlElement(namespace = "http://www.datapower.com/schemas/management", required = true)
        protected List<Request.DoBackup.Domain> domain;
        @XmlElement(name = "deployment-policy", namespace = "http://www.datapower.com/schemas/management")
        protected ConfigConfigDeploymentPolicy deploymentPolicy;
        @XmlAttribute
        protected ExportFormat format;
        @XmlAttribute
        protected Boolean persisted;
        @XmlAttribute(name = "deployment-policy")
        protected String deploymentPolicyAttrDoBackup;

        /**
         * Gets the value of the userComment property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getUserComment() {
            return userComment;
        }

        /**
         * Sets the value of the userComment property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setUserComment(String value) {
            this.userComment = value;
        }

        /**
         * Gets the value of the domain property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the domain property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getDomain().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Request.DoBackup.Domain }
         * 
         * 
         */
        public List<Request.DoBackup.Domain> getDomain() {
            if (domain == null) {
                domain = new ArrayList<Request.DoBackup.Domain>();
            }
            return this.domain;
        }

        /**
         * Gets the value of the deploymentPolicy property.
         * 
         * @return
         *     possible object is
         *     {@link ConfigConfigDeploymentPolicy }
         *     
         */
        public ConfigConfigDeploymentPolicy getDeploymentPolicy() {
            return deploymentPolicy;
        }

        /**
         * Sets the value of the deploymentPolicy property.
         * 
         * @param value
         *     allowed object is
         *     {@link ConfigConfigDeploymentPolicy }
         *     
         */
        public void setDeploymentPolicy(ConfigConfigDeploymentPolicy value) {
            this.deploymentPolicy = value;
        }

        /**
         * Gets the value of the format property.
         * 
         * @return
         *     possible object is
         *     {@link ExportFormat }
         *     
         */
        public ExportFormat getFormat() {
            return format;
        }

        /**
         * Sets the value of the format property.
         * 
         * @param value
         *     allowed object is
         *     {@link ExportFormat }
         *     
         */
        public void setFormat(ExportFormat value) {
            this.format = value;
        }

        /**
         * Gets the value of the persisted property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isPersisted() {
            return persisted;
        }

        /**
         * Sets the value of the persisted property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setPersisted(Boolean value) {
            this.persisted = value;
        }

        /**
         * Gets the value of the deploymentPolicyAttrDoBackup property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDeploymentPolicyAttrDoBackup() {
            return deploymentPolicyAttrDoBackup;
        }

        /**
         * Sets the value of the deploymentPolicyAttrDoBackup property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDeploymentPolicyAttrDoBackup(String value) {
            this.deploymentPolicyAttrDoBackup = value;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class Domain {

            @XmlAttribute
            protected String name;

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

        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="input-file" type="{http://www.datapower.com/schemas/management}base64-binary"/>
     *         &lt;element name="gateway-name" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="internal-party" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *       &lt;/sequence>
     *       &lt;attribute name="overwrite-files" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *       &lt;attribute name="overwrite-objects" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "inputFile",
        "gatewayName",
        "internalParty"
    })
    public static class DoCpaImport {

        @XmlElement(name = "input-file", namespace = "http://www.datapower.com/schemas/management", required = true)
        protected Base64Binary inputFile;
        @XmlElement(name = "gateway-name", namespace = "http://www.datapower.com/schemas/management", required = true)
        protected String gatewayName;
        @XmlElement(name = "internal-party", namespace = "http://www.datapower.com/schemas/management", required = true)
        protected String internalParty;
        @XmlAttribute(name = "overwrite-files")
        protected Boolean overwriteFiles;
        @XmlAttribute(name = "overwrite-objects")
        protected Boolean overwriteObjects;

        /**
         * Gets the value of the inputFile property.
         * 
         * @return
         *     possible object is
         *     {@link Base64Binary }
         *     
         */
        public Base64Binary getInputFile() {
            return inputFile;
        }

        /**
         * Sets the value of the inputFile property.
         * 
         * @param value
         *     allowed object is
         *     {@link Base64Binary }
         *     
         */
        public void setInputFile(Base64Binary value) {
            this.inputFile = value;
        }

        /**
         * Gets the value of the gatewayName property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getGatewayName() {
            return gatewayName;
        }

        /**
         * Sets the value of the gatewayName property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setGatewayName(String value) {
            this.gatewayName = value;
        }

        /**
         * Gets the value of the internalParty property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getInternalParty() {
            return internalParty;
        }

        /**
         * Sets the value of the internalParty property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setInternalParty(String value) {
            this.internalParty = value;
        }

        /**
         * Gets the value of the overwriteFiles property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isOverwriteFiles() {
            return overwriteFiles;
        }

        /**
         * Sets the value of the overwriteFiles property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setOverwriteFiles(Boolean value) {
            this.overwriteFiles = value;
        }

        /**
         * Gets the value of the overwriteObjects property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isOverwriteObjects() {
            return overwriteObjects;
        }

        /**
         * Sets the value of the overwriteObjects property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setOverwriteObjects(Boolean value) {
            this.overwriteObjects = value;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="user-comment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="object" maxOccurs="unbounded">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attribute name="class" type="{http://www.datapower.com/schemas/management}export-class" />
     *                 &lt;attribute name="name" type="{http://www.datapower.com/schemas/management}export-name" />
     *                 &lt;attribute name="ref-objects" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *                 &lt;attribute name="ref-files" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *                 &lt;attribute name="include-debug" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="deployment-policy" type="{http://www.datapower.com/schemas/management}ConfigConfigDeploymentPolicy" minOccurs="0"/>
     *       &lt;/sequence>
     *       &lt;attribute name="format" type="{http://www.datapower.com/schemas/management}export-format" />
     *       &lt;attribute name="all-files" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *       &lt;attribute name="persisted" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *       &lt;attribute name="deployment-policy" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "userComment",
        "object",
        "deploymentPolicy"
    })
    public static class DoExport {

        @XmlElement(name = "user-comment", namespace = "http://www.datapower.com/schemas/management")
        protected String userComment;
        @XmlElement(namespace = "http://www.datapower.com/schemas/management", required = true)
        protected List<Request.DoExport.Object> object;
        @XmlElement(name = "deployment-policy", namespace = "http://www.datapower.com/schemas/management")
        protected ConfigConfigDeploymentPolicy deploymentPolicy;
        @XmlAttribute
        protected ExportFormat format;
        @XmlAttribute(name = "all-files")
        protected Boolean allFiles;
        @XmlAttribute
        protected Boolean persisted;
        @XmlAttribute(name = "deployment-policy")
        protected String deploymentPolicyAttrDoExport;

        /**
         * Gets the value of the userComment property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getUserComment() {
            return userComment;
        }

        /**
         * Sets the value of the userComment property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setUserComment(String value) {
            this.userComment = value;
        }

        /**
         * Gets the value of the object property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the object property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getObject().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Request.DoExport.Object }
         * 
         * 
         */
        public List<Request.DoExport.Object> getObject() {
            if (object == null) {
                object = new ArrayList<Request.DoExport.Object>();
            }
            return this.object;
        }

        /**
         * Gets the value of the deploymentPolicy property.
         * 
         * @return
         *     possible object is
         *     {@link ConfigConfigDeploymentPolicy }
         *     
         */
        public ConfigConfigDeploymentPolicy getDeploymentPolicy() {
            return deploymentPolicy;
        }

        /**
         * Sets the value of the deploymentPolicy property.
         * 
         * @param value
         *     allowed object is
         *     {@link ConfigConfigDeploymentPolicy }
         *     
         */
        public void setDeploymentPolicy(ConfigConfigDeploymentPolicy value) {
            this.deploymentPolicy = value;
        }

        /**
         * Gets the value of the format property.
         * 
         * @return
         *     possible object is
         *     {@link ExportFormat }
         *     
         */
        public ExportFormat getFormat() {
            return format;
        }

        /**
         * Sets the value of the format property.
         * 
         * @param value
         *     allowed object is
         *     {@link ExportFormat }
         *     
         */
        public void setFormat(ExportFormat value) {
            this.format = value;
        }

        /**
         * Gets the value of the allFiles property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isAllFiles() {
            return allFiles;
        }

        /**
         * Sets the value of the allFiles property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setAllFiles(Boolean value) {
            this.allFiles = value;
        }

        /**
         * Gets the value of the persisted property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isPersisted() {
            return persisted;
        }

        /**
         * Sets the value of the persisted property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setPersisted(Boolean value) {
            this.persisted = value;
        }

        /**
         * Gets the value of the deploymentPolicyAttrDoExport property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDeploymentPolicyAttrDoExport() {
            return deploymentPolicyAttrDoExport;
        }

        /**
         * Sets the value of the deploymentPolicyAttrDoExport property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDeploymentPolicyAttrDoExport(String value) {
            this.deploymentPolicyAttrDoExport = value;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;attribute name="class" type="{http://www.datapower.com/schemas/management}export-class" />
         *       &lt;attribute name="name" type="{http://www.datapower.com/schemas/management}export-name" />
         *       &lt;attribute name="ref-objects" type="{http://www.w3.org/2001/XMLSchema}boolean" />
         *       &lt;attribute name="ref-files" type="{http://www.w3.org/2001/XMLSchema}boolean" />
         *       &lt;attribute name="include-debug" type="{http://www.w3.org/2001/XMLSchema}boolean" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class Object {

            @XmlAttribute(name = "class")
            protected String clazz;
            @XmlAttribute
            protected String name;
            @XmlAttribute(name = "ref-objects")
            protected Boolean refObjects;
            @XmlAttribute(name = "ref-files")
            protected Boolean refFiles;
            @XmlAttribute(name = "include-debug")
            protected Boolean includeDebug;

            /**
             * Gets the value of the clazz property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getClazz() {
                return clazz;
            }

            /**
             * Sets the value of the clazz property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setClazz(String value) {
                this.clazz = value;
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
             * Gets the value of the refObjects property.
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public Boolean isRefObjects() {
                return refObjects;
            }

            /**
             * Sets the value of the refObjects property.
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             */
            public void setRefObjects(Boolean value) {
                this.refObjects = value;
            }

            /**
             * Gets the value of the refFiles property.
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public Boolean isRefFiles() {
                return refFiles;
            }

            /**
             * Sets the value of the refFiles property.
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             */
            public void setRefFiles(Boolean value) {
                this.refFiles = value;
            }

            /**
             * Gets the value of the includeDebug property.
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public Boolean isIncludeDebug() {
                return includeDebug;
            }

            /**
             * Sets the value of the includeDebug property.
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             */
            public void setIncludeDebug(Boolean value) {
                this.includeDebug = value;
            }

        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="input-file" type="{http://www.datapower.com/schemas/management}base64-binary"/>
     *         &lt;element name="object" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attribute name="class" type="{http://www.datapower.com/schemas/management}export-class" />
     *                 &lt;attribute name="name" type="{http://www.datapower.com/schemas/management}export-name" />
     *                 &lt;attribute name="overwrite" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *                 &lt;attribute name="import-debug" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="file" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="overwrite" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="deployment-policy" type="{http://www.datapower.com/schemas/management}ConfigConfigDeploymentPolicy" minOccurs="0"/>
     *       &lt;/sequence>
     *       &lt;attribute name="source-type" type="{http://www.datapower.com/schemas/management}export-format" />
     *       &lt;attribute name="dry-run" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *       &lt;attribute name="overwrite-files" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *       &lt;attribute name="overwrite-objects" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *       &lt;attribute name="rewrite-local-ip" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *       &lt;attribute name="deployment-policy" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "inputFile",
        "object",
        "file",
        "deploymentPolicy"
    })
    public static class DoImport {

        @XmlElement(name = "input-file", namespace = "http://www.datapower.com/schemas/management", required = true)
        protected Base64Binary inputFile;
        @XmlElement(namespace = "http://www.datapower.com/schemas/management")
        protected List<Request.DoImport.Object> object;
        @XmlElement(namespace = "http://www.datapower.com/schemas/management")
        protected List<Request.DoImport.File> file;
        @XmlElement(name = "deployment-policy", namespace = "http://www.datapower.com/schemas/management")
        protected ConfigConfigDeploymentPolicy deploymentPolicy;
        @XmlAttribute(name = "source-type")
        protected ExportFormat sourceType;
        @XmlAttribute(name = "dry-run")
        protected Boolean dryRun;
        @XmlAttribute(name = "overwrite-files")
        protected Boolean overwriteFiles;
        @XmlAttribute(name = "overwrite-objects")
        protected Boolean overwriteObjects;
        @XmlAttribute(name = "rewrite-local-ip")
        protected Boolean rewriteLocalIp;
        @XmlAttribute(name = "deployment-policy")
        protected String deploymentPolicyAttrDoImport;

        /**
         * Gets the value of the inputFile property.
         * 
         * @return
         *     possible object is
         *     {@link Base64Binary }
         *     
         */
        public Base64Binary getInputFile() {
            return inputFile;
        }

        /**
         * Sets the value of the inputFile property.
         * 
         * @param value
         *     allowed object is
         *     {@link Base64Binary }
         *     
         */
        public void setInputFile(Base64Binary value) {
            this.inputFile = value;
        }

        /**
         * Gets the value of the object property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the object property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getObject().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Request.DoImport.Object }
         * 
         * 
         */
        public List<Request.DoImport.Object> getObject() {
            if (object == null) {
                object = new ArrayList<Request.DoImport.Object>();
            }
            return this.object;
        }

        /**
         * Gets the value of the file property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the file property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getFile().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Request.DoImport.File }
         * 
         * 
         */
        public List<Request.DoImport.File> getFile() {
            if (file == null) {
                file = new ArrayList<Request.DoImport.File>();
            }
            return this.file;
        }

        /**
         * Gets the value of the deploymentPolicy property.
         * 
         * @return
         *     possible object is
         *     {@link ConfigConfigDeploymentPolicy }
         *     
         */
        public ConfigConfigDeploymentPolicy getDeploymentPolicy() {
            return deploymentPolicy;
        }

        /**
         * Sets the value of the deploymentPolicy property.
         * 
         * @param value
         *     allowed object is
         *     {@link ConfigConfigDeploymentPolicy }
         *     
         */
        public void setDeploymentPolicy(ConfigConfigDeploymentPolicy value) {
            this.deploymentPolicy = value;
        }

        /**
         * Gets the value of the sourceType property.
         * 
         * @return
         *     possible object is
         *     {@link ExportFormat }
         *     
         */
        public ExportFormat getSourceType() {
            return sourceType;
        }

        /**
         * Sets the value of the sourceType property.
         * 
         * @param value
         *     allowed object is
         *     {@link ExportFormat }
         *     
         */
        public void setSourceType(ExportFormat value) {
            this.sourceType = value;
        }

        /**
         * Gets the value of the dryRun property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isDryRun() {
            return dryRun;
        }

        /**
         * Sets the value of the dryRun property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setDryRun(Boolean value) {
            this.dryRun = value;
        }

        /**
         * Gets the value of the overwriteFiles property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isOverwriteFiles() {
            return overwriteFiles;
        }

        /**
         * Sets the value of the overwriteFiles property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setOverwriteFiles(Boolean value) {
            this.overwriteFiles = value;
        }

        /**
         * Gets the value of the overwriteObjects property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isOverwriteObjects() {
            return overwriteObjects;
        }

        /**
         * Sets the value of the overwriteObjects property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setOverwriteObjects(Boolean value) {
            this.overwriteObjects = value;
        }

        /**
         * Gets the value of the rewriteLocalIp property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isRewriteLocalIp() {
            return rewriteLocalIp;
        }

        /**
         * Sets the value of the rewriteLocalIp property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setRewriteLocalIp(Boolean value) {
            this.rewriteLocalIp = value;
        }

        /**
         * Gets the value of the deploymentPolicyAttrDoImport property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDeploymentPolicyAttrDoImport() {
            return deploymentPolicyAttrDoImport;
        }

        /**
         * Sets the value of the deploymentPolicyAttrDoImport property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDeploymentPolicyAttrDoImport(String value) {
            this.deploymentPolicyAttrDoImport = value;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="overwrite" type="{http://www.w3.org/2001/XMLSchema}boolean" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class File {

            @XmlAttribute
            protected String name;
            @XmlAttribute
            protected Boolean overwrite;

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
             * Gets the value of the overwrite property.
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public Boolean isOverwrite() {
                return overwrite;
            }

            /**
             * Sets the value of the overwrite property.
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             */
            public void setOverwrite(Boolean value) {
                this.overwrite = value;
            }

        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;attribute name="class" type="{http://www.datapower.com/schemas/management}export-class" />
         *       &lt;attribute name="name" type="{http://www.datapower.com/schemas/management}export-name" />
         *       &lt;attribute name="overwrite" type="{http://www.w3.org/2001/XMLSchema}boolean" />
         *       &lt;attribute name="import-debug" type="{http://www.w3.org/2001/XMLSchema}boolean" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class Object {

            @XmlAttribute(name = "class")
            protected String clazz;
            @XmlAttribute
            protected String name;
            @XmlAttribute
            protected Boolean overwrite;
            @XmlAttribute(name = "import-debug")
            protected Boolean importDebug;

            /**
             * Gets the value of the clazz property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getClazz() {
                return clazz;
            }

            /**
             * Sets the value of the clazz property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setClazz(String value) {
                this.clazz = value;
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
             * Gets the value of the overwrite property.
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public Boolean isOverwrite() {
                return overwrite;
            }

            /**
             * Sets the value of the overwrite property.
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             */
            public void setOverwrite(Boolean value) {
                this.overwrite = value;
            }

            /**
             * Gets the value of the importDebug property.
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public Boolean isImportDebug() {
                return importDebug;
            }

            /**
             * Sets the value of the importDebug property.
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             */
            public void setImportDebug(Boolean value) {
                this.importDebug = value;
            }

        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="input-file" type="{http://www.datapower.com/schemas/management}base64-binary"/>
     *         &lt;element name="domain" maxOccurs="unbounded">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="import-domain" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *                 &lt;attribute name="reset-domain" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="deployment-policy" type="{http://www.datapower.com/schemas/management}ConfigConfigDeploymentPolicy" minOccurs="0"/>
     *       &lt;/sequence>
     *       &lt;attribute name="source-type" type="{http://www.datapower.com/schemas/management}export-format" />
     *       &lt;attribute name="dry-run" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *       &lt;attribute name="overwrite-files" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *       &lt;attribute name="overwrite-objects" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *       &lt;attribute name="rewrite-local-ip" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *       &lt;attribute name="deployment-policy" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "inputFile",
        "domain",
        "deploymentPolicy"
    })
    public static class DoRestore {

        @XmlElement(name = "input-file", namespace = "http://www.datapower.com/schemas/management", required = true)
        protected Base64Binary inputFile;
        @XmlElement(namespace = "http://www.datapower.com/schemas/management", required = true)
        protected List<Request.DoRestore.Domain> domain;
        @XmlElement(name = "deployment-policy", namespace = "http://www.datapower.com/schemas/management")
        protected ConfigConfigDeploymentPolicy deploymentPolicy;
        @XmlAttribute(name = "source-type")
        protected ExportFormat sourceType;
        @XmlAttribute(name = "dry-run")
        protected Boolean dryRun;
        @XmlAttribute(name = "overwrite-files")
        protected Boolean overwriteFiles;
        @XmlAttribute(name = "overwrite-objects")
        protected Boolean overwriteObjects;
        @XmlAttribute(name = "rewrite-local-ip")
        protected Boolean rewriteLocalIp;
        @XmlAttribute(name = "deployment-policy")
        protected String deploymentPolicyAttrDoRestore;

        /**
         * Gets the value of the inputFile property.
         * 
         * @return
         *     possible object is
         *     {@link Base64Binary }
         *     
         */
        public Base64Binary getInputFile() {
            return inputFile;
        }

        /**
         * Sets the value of the inputFile property.
         * 
         * @param value
         *     allowed object is
         *     {@link Base64Binary }
         *     
         */
        public void setInputFile(Base64Binary value) {
            this.inputFile = value;
        }

        /**
         * Gets the value of the domain property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the domain property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getDomain().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Request.DoRestore.Domain }
         * 
         * 
         */
        public List<Request.DoRestore.Domain> getDomain() {
            if (domain == null) {
                domain = new ArrayList<Request.DoRestore.Domain>();
            }
            return this.domain;
        }

        /**
         * Gets the value of the deploymentPolicy property.
         * 
         * @return
         *     possible object is
         *     {@link ConfigConfigDeploymentPolicy }
         *     
         */
        public ConfigConfigDeploymentPolicy getDeploymentPolicy() {
            return deploymentPolicy;
        }

        /**
         * Sets the value of the deploymentPolicy property.
         * 
         * @param value
         *     allowed object is
         *     {@link ConfigConfigDeploymentPolicy }
         *     
         */
        public void setDeploymentPolicy(ConfigConfigDeploymentPolicy value) {
            this.deploymentPolicy = value;
        }

        /**
         * Gets the value of the sourceType property.
         * 
         * @return
         *     possible object is
         *     {@link ExportFormat }
         *     
         */
        public ExportFormat getSourceType() {
            return sourceType;
        }

        /**
         * Sets the value of the sourceType property.
         * 
         * @param value
         *     allowed object is
         *     {@link ExportFormat }
         *     
         */
        public void setSourceType(ExportFormat value) {
            this.sourceType = value;
        }

        /**
         * Gets the value of the dryRun property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isDryRun() {
            return dryRun;
        }

        /**
         * Sets the value of the dryRun property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setDryRun(Boolean value) {
            this.dryRun = value;
        }

        /**
         * Gets the value of the overwriteFiles property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isOverwriteFiles() {
            return overwriteFiles;
        }

        /**
         * Sets the value of the overwriteFiles property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setOverwriteFiles(Boolean value) {
            this.overwriteFiles = value;
        }

        /**
         * Gets the value of the overwriteObjects property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isOverwriteObjects() {
            return overwriteObjects;
        }

        /**
         * Sets the value of the overwriteObjects property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setOverwriteObjects(Boolean value) {
            this.overwriteObjects = value;
        }

        /**
         * Gets the value of the rewriteLocalIp property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isRewriteLocalIp() {
            return rewriteLocalIp;
        }

        /**
         * Sets the value of the rewriteLocalIp property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setRewriteLocalIp(Boolean value) {
            this.rewriteLocalIp = value;
        }

        /**
         * Gets the value of the deploymentPolicyAttrDoRestore property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDeploymentPolicyAttrDoRestore() {
            return deploymentPolicyAttrDoRestore;
        }

        /**
         * Sets the value of the deploymentPolicyAttrDoRestore property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDeploymentPolicyAttrDoRestore(String value) {
            this.deploymentPolicyAttrDoRestore = value;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="import-domain" type="{http://www.w3.org/2001/XMLSchema}boolean" />
         *       &lt;attribute name="reset-domain" type="{http://www.w3.org/2001/XMLSchema}boolean" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class Domain {

            @XmlAttribute
            protected String name;
            @XmlAttribute(name = "import-domain")
            protected Boolean importDomain;
            @XmlAttribute(name = "reset-domain")
            protected Boolean resetDomain;

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
             * Gets the value of the importDomain property.
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public Boolean isImportDomain() {
                return importDomain;
            }

            /**
             * Sets the value of the importDomain property.
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             */
            public void setImportDomain(Boolean value) {
                this.importDomain = value;
            }

            /**
             * Gets the value of the resetDomain property.
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public Boolean isResetDomain() {
                return resetDomain;
            }

            /**
             * Sets the value of the resetDomain property.
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             */
            public void setResetDomain(Boolean value) {
                this.resetDomain = value;
            }

        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;attribute name="logid" type="{http://www.w3.org/2001/XMLSchema}integer" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class GetAsyncResult {

        @XmlAttribute
        protected BigInteger logid;

        /**
         * Gets the value of the logid property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getLogid() {
            return logid;
        }

        /**
         * Sets the value of the logid property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setLogid(BigInteger value) {
            this.logid = value;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;attribute name="class" type="{http://www.datapower.com/schemas/management}ConfigEnum" />
     *       &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="recursive" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *       &lt;attribute name="persisted" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class GetConfig {

        @XmlAttribute(name = "class")
        protected ConfigEnum clazz;
        @XmlAttribute
        protected String name;
        @XmlAttribute
        protected Boolean recursive;
        @XmlAttribute
        protected Boolean persisted;

        /**
         * Gets the value of the clazz property.
         * 
         * @return
         *     possible object is
         *     {@link ConfigEnum }
         *     
         */
        public ConfigEnum getClazz() {
            return clazz;
        }

        /**
         * Sets the value of the clazz property.
         * 
         * @param value
         *     allowed object is
         *     {@link ConfigEnum }
         *     
         */
        public void setClazz(ConfigEnum value) {
            this.clazz = value;
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
         * Gets the value of the recursive property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isRecursive() {
            return recursive;
        }

        /**
         * Sets the value of the recursive property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setRecursive(Boolean value) {
            this.recursive = value;
        }

        /**
         * Gets the value of the persisted property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isPersisted() {
            return persisted;
        }

        /**
         * Sets the value of the persisted property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setPersisted(Boolean value) {
            this.persisted = value;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;attribute name="class" type="{http://www.datapower.com/schemas/management}ConfigEnum" />
     *       &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="profile" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class GetConformanceReport {

        @XmlAttribute(name = "class")
        protected ConfigEnum clazz;
        @XmlAttribute
        protected String name;
        @XmlAttribute
        protected String profile;

        /**
         * Gets the value of the clazz property.
         * 
         * @return
         *     possible object is
         *     {@link ConfigEnum }
         *     
         */
        public ConfigEnum getClazz() {
            return clazz;
        }

        /**
         * Sets the value of the clazz property.
         * 
         * @param value
         *     allowed object is
         *     {@link ConfigEnum }
         *     
         */
        public void setClazz(ConfigEnum value) {
            this.clazz = value;
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
         * Gets the value of the profile property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getProfile() {
            return profile;
        }

        /**
         * Sets the value of the profile property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setProfile(String value) {
            this.profile = value;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;choice>
     *         &lt;sequence>
     *           &lt;element name="from">
     *             &lt;complexType>
     *               &lt;complexContent>
     *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                   &lt;choice>
     *                     &lt;element name="export" type="{http://www.datapower.com/schemas/management}base64-binary"/>
     *                     &lt;element name="backup" type="{http://www.datapower.com/schemas/management}base64-binary"/>
     *                     &lt;element name="object">
     *                       &lt;complexType>
     *                         &lt;complexContent>
     *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                             &lt;attribute name="class" type="{http://www.datapower.com/schemas/management}export-class" />
     *                             &lt;attribute name="name" type="{http://www.datapower.com/schemas/management}export-name" />
     *                             &lt;attribute name="recursive" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *                             &lt;attribute name="persisted" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *                           &lt;/restriction>
     *                         &lt;/complexContent>
     *                       &lt;/complexType>
     *                     &lt;/element>
     *                   &lt;/choice>
     *                 &lt;/restriction>
     *               &lt;/complexContent>
     *             &lt;/complexType>
     *           &lt;/element>
     *           &lt;element name="to">
     *             &lt;complexType>
     *               &lt;complexContent>
     *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                   &lt;choice>
     *                     &lt;element name="export" type="{http://www.datapower.com/schemas/management}base64-binary"/>
     *                     &lt;element name="backup" type="{http://www.datapower.com/schemas/management}base64-binary"/>
     *                     &lt;element name="object">
     *                       &lt;complexType>
     *                         &lt;complexContent>
     *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                             &lt;attribute name="class" type="{http://www.datapower.com/schemas/management}export-class" />
     *                             &lt;attribute name="name" type="{http://www.datapower.com/schemas/management}export-name" />
     *                             &lt;attribute name="recursive" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *                             &lt;attribute name="persisted" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *                           &lt;/restriction>
     *                         &lt;/complexContent>
     *                       &lt;/complexType>
     *                     &lt;/element>
     *                   &lt;/choice>
     *                 &lt;/restriction>
     *               &lt;/complexContent>
     *             &lt;/complexType>
     *           &lt;/element>
     *         &lt;/sequence>
     *         &lt;element name="object">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attribute name="class" type="{http://www.datapower.com/schemas/management}export-class" />
     *                 &lt;attribute name="name" type="{http://www.datapower.com/schemas/management}export-name" />
     *                 &lt;attribute name="recursive" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *                 &lt;attribute name="from-persisted" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *                 &lt;attribute name="to-persisted" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/choice>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "from",
        "to",
        "object"
    })
    public static class GetDiff {

        @XmlElement(namespace = "http://www.datapower.com/schemas/management")
        protected Request.GetDiff.From from;
        @XmlElement(namespace = "http://www.datapower.com/schemas/management")
        protected Request.GetDiff.To to;
        @XmlElement(namespace = "http://www.datapower.com/schemas/management")
        protected Request.GetDiff.Object object;

        /**
         * Gets the value of the from property.
         * 
         * @return
         *     possible object is
         *     {@link Request.GetDiff.From }
         *     
         */
        public Request.GetDiff.From getFrom() {
            return from;
        }

        /**
         * Sets the value of the from property.
         * 
         * @param value
         *     allowed object is
         *     {@link Request.GetDiff.From }
         *     
         */
        public void setFrom(Request.GetDiff.From value) {
            this.from = value;
        }

        /**
         * Gets the value of the to property.
         * 
         * @return
         *     possible object is
         *     {@link Request.GetDiff.To }
         *     
         */
        public Request.GetDiff.To getTo() {
            return to;
        }

        /**
         * Sets the value of the to property.
         * 
         * @param value
         *     allowed object is
         *     {@link Request.GetDiff.To }
         *     
         */
        public void setTo(Request.GetDiff.To value) {
            this.to = value;
        }

        /**
         * Gets the value of the object property.
         * 
         * @return
         *     possible object is
         *     {@link Request.GetDiff.Object }
         *     
         */
        public Request.GetDiff.Object getObject() {
            return object;
        }

        /**
         * Sets the value of the object property.
         * 
         * @param value
         *     allowed object is
         *     {@link Request.GetDiff.Object }
         *     
         */
        public void setObject(Request.GetDiff.Object value) {
            this.object = value;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;choice>
         *         &lt;element name="export" type="{http://www.datapower.com/schemas/management}base64-binary"/>
         *         &lt;element name="backup" type="{http://www.datapower.com/schemas/management}base64-binary"/>
         *         &lt;element name="object">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;attribute name="class" type="{http://www.datapower.com/schemas/management}export-class" />
         *                 &lt;attribute name="name" type="{http://www.datapower.com/schemas/management}export-name" />
         *                 &lt;attribute name="recursive" type="{http://www.w3.org/2001/XMLSchema}boolean" />
         *                 &lt;attribute name="persisted" type="{http://www.w3.org/2001/XMLSchema}boolean" />
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *       &lt;/choice>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "export",
            "backup",
            "object"
        })
        public static class From {

            @XmlElement(namespace = "http://www.datapower.com/schemas/management")
            protected Base64Binary export;
            @XmlElement(namespace = "http://www.datapower.com/schemas/management")
            protected Base64Binary backup;
            @XmlElement(namespace = "http://www.datapower.com/schemas/management")
            protected Request.GetDiff.From.Object object;

            /**
             * Gets the value of the export property.
             * 
             * @return
             *     possible object is
             *     {@link Base64Binary }
             *     
             */
            public Base64Binary getExport() {
                return export;
            }

            /**
             * Sets the value of the export property.
             * 
             * @param value
             *     allowed object is
             *     {@link Base64Binary }
             *     
             */
            public void setExport(Base64Binary value) {
                this.export = value;
            }

            /**
             * Gets the value of the backup property.
             * 
             * @return
             *     possible object is
             *     {@link Base64Binary }
             *     
             */
            public Base64Binary getBackup() {
                return backup;
            }

            /**
             * Sets the value of the backup property.
             * 
             * @param value
             *     allowed object is
             *     {@link Base64Binary }
             *     
             */
            public void setBackup(Base64Binary value) {
                this.backup = value;
            }

            /**
             * Gets the value of the object property.
             * 
             * @return
             *     possible object is
             *     {@link Request.GetDiff.From.Object }
             *     
             */
            public Request.GetDiff.From.Object getObject() {
                return object;
            }

            /**
             * Sets the value of the object property.
             * 
             * @param value
             *     allowed object is
             *     {@link Request.GetDiff.From.Object }
             *     
             */
            public void setObject(Request.GetDiff.From.Object value) {
                this.object = value;
            }


            /**
             * <p>Java class for anonymous complex type.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;attribute name="class" type="{http://www.datapower.com/schemas/management}export-class" />
             *       &lt;attribute name="name" type="{http://www.datapower.com/schemas/management}export-name" />
             *       &lt;attribute name="recursive" type="{http://www.w3.org/2001/XMLSchema}boolean" />
             *       &lt;attribute name="persisted" type="{http://www.w3.org/2001/XMLSchema}boolean" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class Object {

                @XmlAttribute(name = "class")
                protected String clazz;
                @XmlAttribute
                protected String name;
                @XmlAttribute
                protected Boolean recursive;
                @XmlAttribute
                protected Boolean persisted;

                /**
                 * Gets the value of the clazz property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getClazz() {
                    return clazz;
                }

                /**
                 * Sets the value of the clazz property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setClazz(String value) {
                    this.clazz = value;
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
                 * Gets the value of the recursive property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Boolean }
                 *     
                 */
                public Boolean isRecursive() {
                    return recursive;
                }

                /**
                 * Sets the value of the recursive property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Boolean }
                 *     
                 */
                public void setRecursive(Boolean value) {
                    this.recursive = value;
                }

                /**
                 * Gets the value of the persisted property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Boolean }
                 *     
                 */
                public Boolean isPersisted() {
                    return persisted;
                }

                /**
                 * Sets the value of the persisted property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Boolean }
                 *     
                 */
                public void setPersisted(Boolean value) {
                    this.persisted = value;
                }

            }

        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;attribute name="class" type="{http://www.datapower.com/schemas/management}export-class" />
         *       &lt;attribute name="name" type="{http://www.datapower.com/schemas/management}export-name" />
         *       &lt;attribute name="recursive" type="{http://www.w3.org/2001/XMLSchema}boolean" />
         *       &lt;attribute name="from-persisted" type="{http://www.w3.org/2001/XMLSchema}boolean" />
         *       &lt;attribute name="to-persisted" type="{http://www.w3.org/2001/XMLSchema}boolean" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class Object {

            @XmlAttribute(name = "class")
            protected String clazz;
            @XmlAttribute
            protected String name;
            @XmlAttribute
            protected Boolean recursive;
            @XmlAttribute(name = "from-persisted")
            protected Boolean fromPersisted;
            @XmlAttribute(name = "to-persisted")
            protected Boolean toPersisted;

            /**
             * Gets the value of the clazz property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getClazz() {
                return clazz;
            }

            /**
             * Sets the value of the clazz property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setClazz(String value) {
                this.clazz = value;
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
             * Gets the value of the recursive property.
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public Boolean isRecursive() {
                return recursive;
            }

            /**
             * Sets the value of the recursive property.
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             */
            public void setRecursive(Boolean value) {
                this.recursive = value;
            }

            /**
             * Gets the value of the fromPersisted property.
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public Boolean isFromPersisted() {
                return fromPersisted;
            }

            /**
             * Sets the value of the fromPersisted property.
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             */
            public void setFromPersisted(Boolean value) {
                this.fromPersisted = value;
            }

            /**
             * Gets the value of the toPersisted property.
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public Boolean isToPersisted() {
                return toPersisted;
            }

            /**
             * Sets the value of the toPersisted property.
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             */
            public void setToPersisted(Boolean value) {
                this.toPersisted = value;
            }

        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;choice>
         *         &lt;element name="export" type="{http://www.datapower.com/schemas/management}base64-binary"/>
         *         &lt;element name="backup" type="{http://www.datapower.com/schemas/management}base64-binary"/>
         *         &lt;element name="object">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;attribute name="class" type="{http://www.datapower.com/schemas/management}export-class" />
         *                 &lt;attribute name="name" type="{http://www.datapower.com/schemas/management}export-name" />
         *                 &lt;attribute name="recursive" type="{http://www.w3.org/2001/XMLSchema}boolean" />
         *                 &lt;attribute name="persisted" type="{http://www.w3.org/2001/XMLSchema}boolean" />
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *       &lt;/choice>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "export",
            "backup",
            "object"
        })
        public static class To {

            @XmlElement(namespace = "http://www.datapower.com/schemas/management")
            protected Base64Binary export;
            @XmlElement(namespace = "http://www.datapower.com/schemas/management")
            protected Base64Binary backup;
            @XmlElement(namespace = "http://www.datapower.com/schemas/management")
            protected Request.GetDiff.To.Object object;

            /**
             * Gets the value of the export property.
             * 
             * @return
             *     possible object is
             *     {@link Base64Binary }
             *     
             */
            public Base64Binary getExport() {
                return export;
            }

            /**
             * Sets the value of the export property.
             * 
             * @param value
             *     allowed object is
             *     {@link Base64Binary }
             *     
             */
            public void setExport(Base64Binary value) {
                this.export = value;
            }

            /**
             * Gets the value of the backup property.
             * 
             * @return
             *     possible object is
             *     {@link Base64Binary }
             *     
             */
            public Base64Binary getBackup() {
                return backup;
            }

            /**
             * Sets the value of the backup property.
             * 
             * @param value
             *     allowed object is
             *     {@link Base64Binary }
             *     
             */
            public void setBackup(Base64Binary value) {
                this.backup = value;
            }

            /**
             * Gets the value of the object property.
             * 
             * @return
             *     possible object is
             *     {@link Request.GetDiff.To.Object }
             *     
             */
            public Request.GetDiff.To.Object getObject() {
                return object;
            }

            /**
             * Sets the value of the object property.
             * 
             * @param value
             *     allowed object is
             *     {@link Request.GetDiff.To.Object }
             *     
             */
            public void setObject(Request.GetDiff.To.Object value) {
                this.object = value;
            }


            /**
             * <p>Java class for anonymous complex type.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;attribute name="class" type="{http://www.datapower.com/schemas/management}export-class" />
             *       &lt;attribute name="name" type="{http://www.datapower.com/schemas/management}export-name" />
             *       &lt;attribute name="recursive" type="{http://www.w3.org/2001/XMLSchema}boolean" />
             *       &lt;attribute name="persisted" type="{http://www.w3.org/2001/XMLSchema}boolean" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class Object {

                @XmlAttribute(name = "class")
                protected String clazz;
                @XmlAttribute
                protected String name;
                @XmlAttribute
                protected Boolean recursive;
                @XmlAttribute
                protected Boolean persisted;

                /**
                 * Gets the value of the clazz property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getClazz() {
                    return clazz;
                }

                /**
                 * Sets the value of the clazz property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setClazz(String value) {
                    this.clazz = value;
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
                 * Gets the value of the recursive property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Boolean }
                 *     
                 */
                public Boolean isRecursive() {
                    return recursive;
                }

                /**
                 * Sets the value of the recursive property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Boolean }
                 *     
                 */
                public void setRecursive(Boolean value) {
                    this.recursive = value;
                }

                /**
                 * Gets the value of the persisted property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Boolean }
                 *     
                 */
                public Boolean isPersisted() {
                    return persisted;
                }

                /**
                 * Sets the value of the persisted property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Boolean }
                 *     
                 */
                public void setPersisted(Boolean value) {
                    this.persisted = value;
                }

            }

        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class GetFile {

        @XmlAttribute(required = true)
        protected String name;

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

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;attribute name="location" type="{http://www.datapower.com/schemas/management}filestore-location" />
     *       &lt;attribute name="annotated" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *       &lt;attribute name="layout-only" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *       &lt;attribute name="no-subdirectories" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class GetFilestore {

        @XmlAttribute
        protected FilestoreLocation location;
        @XmlAttribute
        protected Boolean annotated;
        @XmlAttribute(name = "layout-only")
        protected Boolean layoutOnly;
        @XmlAttribute(name = "no-subdirectories")
        protected Boolean noSubdirectories;

        /**
         * Gets the value of the location property.
         * 
         * @return
         *     possible object is
         *     {@link FilestoreLocation }
         *     
         */
        public FilestoreLocation getLocation() {
            return location;
        }

        /**
         * Sets the value of the location property.
         * 
         * @param value
         *     allowed object is
         *     {@link FilestoreLocation }
         *     
         */
        public void setLocation(FilestoreLocation value) {
            this.location = value;
        }

        /**
         * Gets the value of the annotated property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isAnnotated() {
            return annotated;
        }

        /**
         * Sets the value of the annotated property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setAnnotated(Boolean value) {
            this.annotated = value;
        }

        /**
         * Gets the value of the layoutOnly property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isLayoutOnly() {
            return layoutOnly;
        }

        /**
         * Sets the value of the layoutOnly property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setLayoutOnly(Boolean value) {
            this.layoutOnly = value;
        }

        /**
         * Gets the value of the noSubdirectories property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isNoSubdirectories() {
            return noSubdirectories;
        }

        /**
         * Sets the value of the noSubdirectories property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setNoSubdirectories(Boolean value) {
            this.noSubdirectories = value;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class GetLog {

        @XmlAttribute
        protected String name;

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

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;attribute name="user" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="password" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class GetSamlart {

        @XmlAttribute
        protected String user;
        @XmlAttribute
        protected String password;

        /**
         * Gets the value of the user property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getUser() {
            return user;
        }

        /**
         * Sets the value of the user property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setUser(String value) {
            this.user = value;
        }

        /**
         * Gets the value of the password property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPassword() {
            return password;
        }

        /**
         * Sets the value of the password property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPassword(String value) {
            this.password = value;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;attribute name="class" type="{http://www.datapower.com/schemas/management}StatusEnum" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class GetStatus {

        @XmlAttribute(name = "class")
        protected StatusEnum clazz;

        /**
         * Gets the value of the clazz property.
         * 
         * @return
         *     possible object is
         *     {@link StatusEnum }
         *     
         */
        public StatusEnum getClazz() {
            return clazz;
        }

        /**
         * Sets the value of the clazz property.
         * 
         * @param value
         *     allowed object is
         *     {@link StatusEnum }
         *     
         */
        public void setClazz(StatusEnum value) {
            this.clazz = value;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;simpleContent>
     *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>base64Binary">
     *       &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "value"
    })
    public static class SetFile {

        @XmlValue
        protected byte[] value;
        @XmlAttribute
        protected String name;

        /**
         * Gets the value of the value property.
         * 
         * @return
         *     possible object is
         *     byte[]
         */
        public byte[] getValue() {
            return value;
        }

        /**
         * Sets the value of the value property.
         * 
         * @param value
         *     allowed object is
         *     byte[]
         */
        public void setValue(byte[] value) {
            this.value = ((byte[]) value);
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

    }

}
