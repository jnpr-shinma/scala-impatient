/* 
 * @(#)MgtConnection.java        1.0 30/12/14
 *
 * This file has been auto-generated by JNC, the
 * Java output format plug-in of pyang.
 * Origin: module "devmgt", revision: "2014-09-16".
 */

package net.juniper.jspace.ems.yang.devmgt.devicemgt.devices.device;

import com.tailf.jnc.Element;
import com.tailf.jnc.JNCException;
import com.tailf.jnc.Tagpath;
import com.tailf.jnc.YangElement;
import com.tailf.jnc.YangString;

import net.juniper.jspace.ems.yang.devmgt.Devmgt;

/**
 * This class represents an element from 
 * the namespace http://juniper.net/ns/space/test/1.0
 * generated to "src/net/juniper/jspace/ems/yang/devmgt/devicemgt/devices/device/mgtConnection"
 * <p>
 * See line 65 in
 * /home/maxin/workspace/js-easy-rest/easy-rest-core/yang/devmgt.yang
 *
 * @version 1.0 2014-12-30
 * @author Auto Generated
 */
public class MgtConnection extends YangElement {

    private static final long serialVersionUID = 1L;

    public static final Tagpath tagpath = new Tagpath("devmgt/devicemgt/devices/device/mgtConnection");

    static {
        Devmgt.enable();
    }

    /**
     * Constructor for an empty MgtConnection object.
     */
    public MgtConnection() {
        super(Devmgt.NAMESPACE, "mgtConnection");
    }

    /**
     * Clones this object, returning an exact copy.
     * @return A clone of the object.
     */
    public MgtConnection clone() {
        return (MgtConnection)cloneContent(new MgtConnection());
    }

    /**
     * Clones this object, returning a shallow copy.
     * @return A clone of the object. Children are not included.
     */
    public MgtConnection cloneShallow() {
        return (MgtConnection)cloneShallowContent(new MgtConnection());
    }

    /**
     * @return An array with the identifiers of any key children
     */
    public String[] keyNames() {
        return null;
    }

    /**
     * @return An array with the identifiers of any children, in order.
     */
    public String[] childrenNames() {
        return new String[] {
            "connType",
            "auth",
            "status",
            "webMgt",
        };
    }

    /* Access methods for optional leaf child: "connType". */

    /**
     * Gets the value for child leaf "connType".
     * @return The value of the leaf.
     */
    public YangString getConnTypeValue() throws JNCException {
        return (YangString)getValue("connType");
    }

    /**
     * Sets the value for child leaf "connType",
     * using instance of generated typedef class.
     * @param connTypeValue The value to set.
     * @param connTypeValue used during instantiation.
     */
    public void setConnTypeValue(YangString connTypeValue) throws JNCException {
        setLeafValue(Devmgt.NAMESPACE,
            "connType",
            connTypeValue,
            childrenNames());
    }

    /**
     * Sets the value for child leaf "connType",
     * using a String value.
     * @param connTypeValue used during instantiation.
     */
    public void setConnTypeValue(String connTypeValue) throws JNCException {
        setConnTypeValue(new YangString(connTypeValue));
    }

    /**
     * Unsets the value for child leaf "connType".
     */
    public void unsetConnTypeValue() throws JNCException {
        delete("connType");
    }

    /**
     * This method is used for creating a subtree filter.
     * The added "connType" leaf will not have a value.
     */
    public void addConnType() throws JNCException {
        setLeafValue(Devmgt.NAMESPACE,
            "connType",
            null,
            childrenNames());
    }

    /**
     * Marks the leaf "connType" with operation "replace".
     */
    public void markConnTypeReplace() throws JNCException {
        markLeafReplace("connType");
    }

    /**
     * Marks the leaf "connType" with operation "merge".
     */
    public void markConnTypeMerge() throws JNCException {
        markLeafMerge("connType");
    }

    /**
     * Marks the leaf "connType" with operation "create".
     */
    public void markConnTypeCreate() throws JNCException {
        markLeafCreate("connType");
    }

    /**
     * Marks the leaf "connType" with operation "delete".
     */
    public void markConnTypeDelete() throws JNCException {
        markLeafDelete("connType");
    }

    /* Access methods for optional leaf child: "auth". */

    /**
     * Gets the value for child leaf "auth".
     * @return The value of the leaf.
     */
    public YangString getAuthValue() throws JNCException {
        return (YangString)getValue("auth");
    }

    /**
     * Sets the value for child leaf "auth",
     * using instance of generated typedef class.
     * @param authValue The value to set.
     * @param authValue used during instantiation.
     */
    public void setAuthValue(YangString authValue) throws JNCException {
        setLeafValue(Devmgt.NAMESPACE,
            "auth",
            authValue,
            childrenNames());
    }

    /**
     * Sets the value for child leaf "auth",
     * using a String value.
     * @param authValue used during instantiation.
     */
    public void setAuthValue(String authValue) throws JNCException {
        setAuthValue(new YangString(authValue));
    }

    /**
     * Unsets the value for child leaf "auth".
     */
    public void unsetAuthValue() throws JNCException {
        delete("auth");
    }

    /**
     * This method is used for creating a subtree filter.
     * The added "auth" leaf will not have a value.
     */
    public void addAuth() throws JNCException {
        setLeafValue(Devmgt.NAMESPACE,
            "auth",
            null,
            childrenNames());
    }

    /**
     * Marks the leaf "auth" with operation "replace".
     */
    public void markAuthReplace() throws JNCException {
        markLeafReplace("auth");
    }

    /**
     * Marks the leaf "auth" with operation "merge".
     */
    public void markAuthMerge() throws JNCException {
        markLeafMerge("auth");
    }

    /**
     * Marks the leaf "auth" with operation "create".
     */
    public void markAuthCreate() throws JNCException {
        markLeafCreate("auth");
    }

    /**
     * Marks the leaf "auth" with operation "delete".
     */
    public void markAuthDelete() throws JNCException {
        markLeafDelete("auth");
    }

    /* Access methods for optional leaf child: "status". */

    /**
     * Gets the value for child leaf "status".
     * @return The value of the leaf.
     */
    public YangString getStatusValue() throws JNCException {
        return (YangString)getValue("status");
    }

    /**
     * Sets the value for child leaf "status",
     * using instance of generated typedef class.
     * @param statusValue The value to set.
     * @param statusValue used during instantiation.
     */
    public void setStatusValue(YangString statusValue) throws JNCException {
        setLeafValue(Devmgt.NAMESPACE,
            "status",
            statusValue,
            childrenNames());
    }

    /**
     * Sets the value for child leaf "status",
     * using a String value.
     * @param statusValue used during instantiation.
     */
    public void setStatusValue(String statusValue) throws JNCException {
        setStatusValue(new YangString(statusValue));
    }

    /**
     * Unsets the value for child leaf "status".
     */
    public void unsetStatusValue() throws JNCException {
        delete("status");
    }

    /**
     * This method is used for creating a subtree filter.
     * The added "status" leaf will not have a value.
     */
    public void addStatus() throws JNCException {
        setLeafValue(Devmgt.NAMESPACE,
            "status",
            null,
            childrenNames());
    }

    /**
     * Marks the leaf "status" with operation "replace".
     */
    public void markStatusReplace() throws JNCException {
        markLeafReplace("status");
    }

    /**
     * Marks the leaf "status" with operation "merge".
     */
    public void markStatusMerge() throws JNCException {
        markLeafMerge("status");
    }

    /**
     * Marks the leaf "status" with operation "create".
     */
    public void markStatusCreate() throws JNCException {
        markLeafCreate("status");
    }

    /**
     * Marks the leaf "status" with operation "delete".
     */
    public void markStatusDelete() throws JNCException {
        markLeafDelete("status");
    }

    /* Access methods for optional leaf child: "webMgt". */

    /**
     * Gets the value for child leaf "webMgt".
     * @return The value of the leaf.
     */
    public YangString getWebMgtValue() throws JNCException {
        return (YangString)getValue("webMgt");
    }

    /**
     * Sets the value for child leaf "webMgt",
     * using instance of generated typedef class.
     * @param webMgtValue The value to set.
     * @param webMgtValue used during instantiation.
     */
    public void setWebMgtValue(YangString webMgtValue) throws JNCException {
        setLeafValue(Devmgt.NAMESPACE,
            "webMgt",
            webMgtValue,
            childrenNames());
    }

    /**
     * Sets the value for child leaf "webMgt",
     * using a String value.
     * @param webMgtValue used during instantiation.
     */
    public void setWebMgtValue(String webMgtValue) throws JNCException {
        setWebMgtValue(new YangString(webMgtValue));
    }

    /**
     * Unsets the value for child leaf "webMgt".
     */
    public void unsetWebMgtValue() throws JNCException {
        delete("webMgt");
    }

    /**
     * This method is used for creating a subtree filter.
     * The added "webMgt" leaf will not have a value.
     */
    public void addWebMgt() throws JNCException {
        setLeafValue(Devmgt.NAMESPACE,
            "webMgt",
            null,
            childrenNames());
    }

    /**
     * Marks the leaf "webMgt" with operation "replace".
     */
    public void markWebMgtReplace() throws JNCException {
        markLeafReplace("webMgt");
    }

    /**
     * Marks the leaf "webMgt" with operation "merge".
     */
    public void markWebMgtMerge() throws JNCException {
        markLeafMerge("webMgt");
    }

    /**
     * Marks the leaf "webMgt" with operation "create".
     */
    public void markWebMgtCreate() throws JNCException {
        markLeafCreate("webMgt");
    }

    /**
     * Marks the leaf "webMgt" with operation "delete".
     */
    public void markWebMgtDelete() throws JNCException {
        markLeafDelete("webMgt");
    }

    /**
     * Support method for addChild.
     * Adds a child to this object.
     * 
     * @param child The child to add
     */
    public void addChild(Element child) {
        super.addChild(child);
    }

}