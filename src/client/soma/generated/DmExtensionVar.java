
package client.soma.generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dmExtensionVar.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="dmExtensionVar">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="var://local/attachment-manifest"/>
 *     &lt;enumeration value="var://local/buffered-attachments"/>
 *     &lt;enumeration value="var://local/attachment-content-ids"/>
 *     &lt;enumeration value="var://local/root-swa-ref-node-values"/>
 *     &lt;enumeration value="var://local/clone-attachments"/>
 *     &lt;enumeration value="var://local/set-root-content-id"/>
 *     &lt;enumeration value="var://local/_internal/ap_conformance/ap_cid"/>
 *     &lt;enumeration value="var://local/_internal/ap_conformance/results_err_msg"/>
 *     &lt;enumeration value="var://local/mime/conformance/results"/>
 *     &lt;enumeration value="var://local/content-type"/>
 *     &lt;enumeration value="var://local/_extension/responsecode"/>
 *     &lt;enumeration value="var://local/_extension/header/"/>
 *     &lt;enumeration value="var://local/_extension/sslprofile"/>
 *     &lt;enumeration value="var://local/_extension/timeout"/>
 *     &lt;enumeration value="var://local/_extension/attachment-format"/>
 *     &lt;enumeration value="var://local/_extension/messages"/>
 *     &lt;enumeration value="var://local/_extension/response-header/"/>
 *     &lt;enumeration value="var://local/_extension/response-headers"/>
 *     &lt;enumeration value="var://local/_extension/variables"/>
 *     &lt;enumeration value="var://local/_extension/attachment-root-uri"/>
 *     &lt;enumeration value="var://local/_extension/allow-compression"/>
 *     &lt;enumeration value="var://local/_extension/prevent-persistent-connection"/>
 *     &lt;enumeration value="var://local/_extension/donot-follow-redirect"/>
 *     &lt;enumeration value="var://local/_extension/http-10-only"/>
 *     &lt;enumeration value="var://local/_extension/error"/>
 *     &lt;enumeration value="var://local/_extension/donot-rewrite-host"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "dmExtensionVar")
@XmlEnum
public enum DmExtensionVar {

    @XmlEnumValue("var://local/attachment-manifest")
    VAR_LOCAL_ATTACHMENT_MANIFEST("var://local/attachment-manifest"),
    @XmlEnumValue("var://local/buffered-attachments")
    VAR_LOCAL_BUFFERED_ATTACHMENTS("var://local/buffered-attachments"),
    @XmlEnumValue("var://local/attachment-content-ids")
    VAR_LOCAL_ATTACHMENT_CONTENT_IDS("var://local/attachment-content-ids"),
    @XmlEnumValue("var://local/root-swa-ref-node-values")
    VAR_LOCAL_ROOT_SWA_REF_NODE_VALUES("var://local/root-swa-ref-node-values"),
    @XmlEnumValue("var://local/clone-attachments")
    VAR_LOCAL_CLONE_ATTACHMENTS("var://local/clone-attachments"),
    @XmlEnumValue("var://local/set-root-content-id")
    VAR_LOCAL_SET_ROOT_CONTENT_ID("var://local/set-root-content-id"),
    @XmlEnumValue("var://local/_internal/ap_conformance/ap_cid")
    VAR_LOCAL_INTERNAL_AP_CONFORMANCE_AP_CID("var://local/_internal/ap_conformance/ap_cid"),
    @XmlEnumValue("var://local/_internal/ap_conformance/results_err_msg")
    VAR_LOCAL_INTERNAL_AP_CONFORMANCE_RESULTS_ERR_MSG("var://local/_internal/ap_conformance/results_err_msg"),
    @XmlEnumValue("var://local/mime/conformance/results")
    VAR_LOCAL_MIME_CONFORMANCE_RESULTS("var://local/mime/conformance/results"),
    @XmlEnumValue("var://local/content-type")
    VAR_LOCAL_CONTENT_TYPE("var://local/content-type"),
    @XmlEnumValue("var://local/_extension/responsecode")
    VAR_LOCAL_EXTENSION_RESPONSECODE("var://local/_extension/responsecode"),
    @XmlEnumValue("var://local/_extension/header/")
    VAR_LOCAL_EXTENSION_HEADER("var://local/_extension/header/"),
    @XmlEnumValue("var://local/_extension/sslprofile")
    VAR_LOCAL_EXTENSION_SSLPROFILE("var://local/_extension/sslprofile"),
    @XmlEnumValue("var://local/_extension/timeout")
    VAR_LOCAL_EXTENSION_TIMEOUT("var://local/_extension/timeout"),
    @XmlEnumValue("var://local/_extension/attachment-format")
    VAR_LOCAL_EXTENSION_ATTACHMENT_FORMAT("var://local/_extension/attachment-format"),
    @XmlEnumValue("var://local/_extension/messages")
    VAR_LOCAL_EXTENSION_MESSAGES("var://local/_extension/messages"),
    @XmlEnumValue("var://local/_extension/response-header/")
    VAR_LOCAL_EXTENSION_RESPONSE_HEADER("var://local/_extension/response-header/"),
    @XmlEnumValue("var://local/_extension/response-headers")
    VAR_LOCAL_EXTENSION_RESPONSE_HEADERS("var://local/_extension/response-headers"),
    @XmlEnumValue("var://local/_extension/variables")
    VAR_LOCAL_EXTENSION_VARIABLES("var://local/_extension/variables"),
    @XmlEnumValue("var://local/_extension/attachment-root-uri")
    VAR_LOCAL_EXTENSION_ATTACHMENT_ROOT_URI("var://local/_extension/attachment-root-uri"),
    @XmlEnumValue("var://local/_extension/allow-compression")
    VAR_LOCAL_EXTENSION_ALLOW_COMPRESSION("var://local/_extension/allow-compression"),
    @XmlEnumValue("var://local/_extension/prevent-persistent-connection")
    VAR_LOCAL_EXTENSION_PREVENT_PERSISTENT_CONNECTION("var://local/_extension/prevent-persistent-connection"),
    @XmlEnumValue("var://local/_extension/donot-follow-redirect")
    VAR_LOCAL_EXTENSION_DONOT_FOLLOW_REDIRECT("var://local/_extension/donot-follow-redirect"),
    @XmlEnumValue("var://local/_extension/http-10-only")
    VAR_LOCAL_EXTENSION_HTTP_10_ONLY("var://local/_extension/http-10-only"),
    @XmlEnumValue("var://local/_extension/error")
    VAR_LOCAL_EXTENSION_ERROR("var://local/_extension/error"),
    @XmlEnumValue("var://local/_extension/donot-rewrite-host")
    VAR_LOCAL_EXTENSION_DONOT_REWRITE_HOST("var://local/_extension/donot-rewrite-host");
    private final String value;

    DmExtensionVar(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DmExtensionVar fromValue(String v) {
        for (DmExtensionVar c: DmExtensionVar.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
