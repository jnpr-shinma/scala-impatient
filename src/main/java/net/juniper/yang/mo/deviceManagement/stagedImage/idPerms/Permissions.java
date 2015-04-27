/* 
 * @(#)Permissions.java        1.0 19/01/15
 *
 * This file has been auto-generated by JNC, the
 * Java output format plug-in of pyang.
 * Origin: module "device-management", revision: "2014-07-26".
 */

package net.juniper.yang.mo.deviceManagement.stagedImage.idPerms;

import com.tailf.jnc.Element;
import com.tailf.jnc.JNCException;
import com.tailf.jnc.Tagpath;
import com.tailf.jnc.YangElement;
import com.tailf.jnc.YangString;

import net.juniper.yang.mo.iqAcmTypes.Access;
import net.juniper.yang.mo.iqAcmTypes.Acm;
import net.juniper.yang.mo.iqIfmapTypes.Ifmap;

/**
 * This class represents an element from 
 * the namespace http://juniper.net/ns/space/device-management/1.0
 * generated to "/home/maxin/space/js-ems/server/target/scala-2.11/src_managed/main/net/juniper/yang/mo/deviceManagement/stagedImage/idPerms/permissions"
 * <p>
 * See line 38 in
 * /home/maxin/.yang/iq-ifmap-types.yang
 *
 * @version 1.0 2015-01-19
 * @author Auto Generated
 */
public class Permissions extends YangElement {

    private static final long serialVersionUID = 1L;

    public static final Tagpath TAG_PATH = new Tagpath("stagedImage/idPerms/permissions");

    static {
        Ifmap.enable();
    }

    /**
     * Constructor for an empty Permissions object.
     */
    public Permissions() {
        super(Ifmap.NAMESPACE, "permissions");
    }

    /**
     * Clones this object, returning an exact copy.
     * @return A clone of the object.
     */
    public Permissions clone() {
        return (Permissions)cloneContent(new Permissions());
    }

    /**
     * Clones this object, returning a shallow copy.
     * @return A clone of the object. Children are not included.
     */
    public Permissions cloneShallow() {
        return (Permissions)cloneShallowContent(new Permissions());
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
            "owner",
            "owner-access",
            "group",
            "group-access",
            "other-access",
        };
    }

    /* Access methods for optional leaf child: "owner". */

    /**
     * Gets the value for child leaf "owner".
     * @return The value of the leaf.
     */
    public YangString getOwnerValue() throws JNCException {
        return (YangString)getValue("owner");
    }

    /**
     * Sets the value for child leaf "owner",
     * using instance of generated typedef class.
     * @param ownerValue The value to set.
     * @param ownerValue used during instantiation.
     */
    public void setOwnerValue(YangString ownerValue) throws JNCException {
        setLeafValue(Acm.NAMESPACE,
            "owner",
            ownerValue,
            childrenNames());
    }

    /**
     * Sets the value for child leaf "owner",
     * using a String value.
     * @param ownerValue used during instantiation.
     */
    public void setOwnerValue(String ownerValue) throws JNCException {
        setOwnerValue(new YangString(ownerValue));
    }

    /**
     * Unsets the value for child leaf "owner".
     */
    public void unsetOwnerValue() throws JNCException {
        delete("owner");
    }

    /**
     * This method is used for creating a subtree filter.
     * The added "owner" leaf will not have a value.
     */
    public void addOwner() throws JNCException {
        setLeafValue(Acm.NAMESPACE,
            "owner",
            null,
            childrenNames());
    }

    /**
     * Marks the leaf "owner" with operation "replace".
     */
    public void markOwnerReplace() throws JNCException {
        markLeafReplace("owner");
    }

    /**
     * Marks the leaf "owner" with operation "merge".
     */
    public void markOwnerMerge() throws JNCException {
        markLeafMerge("owner");
    }

    /**
     * Marks the leaf "owner" with operation "create".
     */
    public void markOwnerCreate() throws JNCException {
        markLeafCreate("owner");
    }

    /**
     * Marks the leaf "owner" with operation "delete".
     */
    public void markOwnerDelete() throws JNCException {
        markLeafDelete("owner");
    }

    /* Access methods for optional leaf child: "owner-access". */

    /**
     * Gets the value for child leaf "owner-access".
     * @return The value of the leaf.
     */
    public Access getOwnerAccessValue() throws JNCException {
        return (Access)getValue("owner-access");
    }

    /**
     * Sets the value for child leaf "owner-access",
     * using a JNC type value.
     * @param ownerAccessValue The value to set.
     * @param ownerAccessValue used during instantiation.
     */
    public void setOwnerAccessValue(Access ownerAccessValue)
            throws JNCException {
        setLeafValue(Acm.NAMESPACE,
            "owner-access",
            ownerAccessValue,
            childrenNames());
    }

    /**
     * Sets the value for child leaf "owner-access",
     * using Java primitive values.
     * @param ownerAccessValue used during instantiation.
     */
    public void setOwnerAccessValue(short ownerAccessValue) throws JNCException {
        setOwnerAccessValue(new Access(ownerAccessValue));
    }

    /**
     * Sets the value for child leaf "owner-access",
     * using a String value.
     * @param ownerAccessValue used during instantiation.
     */
    public void setOwnerAccessValue(String ownerAccessValue)
            throws JNCException {
        setOwnerAccessValue(new Access(ownerAccessValue));
    }

    /**
     * Unsets the value for child leaf "owner-access".
     */
    public void unsetOwnerAccessValue() throws JNCException {
        delete("owner-access");
    }

    /**
     * This method is used for creating a subtree filter.
     * The added "owner-access" leaf will not have a value.
     */
    public void addOwnerAccess() throws JNCException {
        setLeafValue(Acm.NAMESPACE,
            "owner-access",
            null,
            childrenNames());
    }

    /**
     * Marks the leaf "owner-access" with operation "replace".
     */
    public void markOwnerAccessReplace() throws JNCException {
        markLeafReplace("ownerAccess");
    }

    /**
     * Marks the leaf "owner-access" with operation "merge".
     */
    public void markOwnerAccessMerge() throws JNCException {
        markLeafMerge("ownerAccess");
    }

    /**
     * Marks the leaf "owner-access" with operation "create".
     */
    public void markOwnerAccessCreate() throws JNCException {
        markLeafCreate("ownerAccess");
    }

    /**
     * Marks the leaf "owner-access" with operation "delete".
     */
    public void markOwnerAccessDelete() throws JNCException {
        markLeafDelete("ownerAccess");
    }

    /* Access methods for optional leaf child: "group". */

    /**
     * Gets the value for child leaf "group".
     * @return The value of the leaf.
     */
    public YangString getGroupValue() throws JNCException {
        return (YangString)getValue("group");
    }

    /**
     * Sets the value for child leaf "group",
     * using instance of generated typedef class.
     * @param groupValue The value to set.
     * @param groupValue used during instantiation.
     */
    public void setGroupValue(YangString groupValue) throws JNCException {
        setLeafValue(Acm.NAMESPACE,
            "group",
            groupValue,
            childrenNames());
    }

    /**
     * Sets the value for child leaf "group",
     * using a String value.
     * @param groupValue used during instantiation.
     */
    public void setGroupValue(String groupValue) throws JNCException {
        setGroupValue(new YangString(groupValue));
    }

    /**
     * Unsets the value for child leaf "group".
     */
    public void unsetGroupValue() throws JNCException {
        delete("group");
    }

    /**
     * This method is used for creating a subtree filter.
     * The added "group" leaf will not have a value.
     */
    public void addGroup() throws JNCException {
        setLeafValue(Acm.NAMESPACE,
            "group",
            null,
            childrenNames());
    }

    /**
     * Marks the leaf "group" with operation "replace".
     */
    public void markGroupReplace() throws JNCException {
        markLeafReplace("group");
    }

    /**
     * Marks the leaf "group" with operation "merge".
     */
    public void markGroupMerge() throws JNCException {
        markLeafMerge("group");
    }

    /**
     * Marks the leaf "group" with operation "create".
     */
    public void markGroupCreate() throws JNCException {
        markLeafCreate("group");
    }

    /**
     * Marks the leaf "group" with operation "delete".
     */
    public void markGroupDelete() throws JNCException {
        markLeafDelete("group");
    }

    /* Access methods for optional leaf child: "group-access". */

    /**
     * Gets the value for child leaf "group-access".
     * @return The value of the leaf.
     */
    public Access getGroupAccessValue() throws JNCException {
        return (Access)getValue("group-access");
    }

    /**
     * Sets the value for child leaf "group-access",
     * using a JNC type value.
     * @param groupAccessValue The value to set.
     * @param groupAccessValue used during instantiation.
     */
    public void setGroupAccessValue(Access groupAccessValue)
            throws JNCException {
        setLeafValue(Acm.NAMESPACE,
            "group-access",
            groupAccessValue,
            childrenNames());
    }

    /**
     * Sets the value for child leaf "group-access",
     * using Java primitive values.
     * @param groupAccessValue used during instantiation.
     */
    public void setGroupAccessValue(short groupAccessValue) throws JNCException {
        setGroupAccessValue(new Access(groupAccessValue));
    }

    /**
     * Sets the value for child leaf "group-access",
     * using a String value.
     * @param groupAccessValue used during instantiation.
     */
    public void setGroupAccessValue(String groupAccessValue)
            throws JNCException {
        setGroupAccessValue(new Access(groupAccessValue));
    }

    /**
     * Unsets the value for child leaf "group-access".
     */
    public void unsetGroupAccessValue() throws JNCException {
        delete("group-access");
    }

    /**
     * This method is used for creating a subtree filter.
     * The added "group-access" leaf will not have a value.
     */
    public void addGroupAccess() throws JNCException {
        setLeafValue(Acm.NAMESPACE,
            "group-access",
            null,
            childrenNames());
    }

    /**
     * Marks the leaf "group-access" with operation "replace".
     */
    public void markGroupAccessReplace() throws JNCException {
        markLeafReplace("groupAccess");
    }

    /**
     * Marks the leaf "group-access" with operation "merge".
     */
    public void markGroupAccessMerge() throws JNCException {
        markLeafMerge("groupAccess");
    }

    /**
     * Marks the leaf "group-access" with operation "create".
     */
    public void markGroupAccessCreate() throws JNCException {
        markLeafCreate("groupAccess");
    }

    /**
     * Marks the leaf "group-access" with operation "delete".
     */
    public void markGroupAccessDelete() throws JNCException {
        markLeafDelete("groupAccess");
    }

    /* Access methods for optional leaf child: "other-access". */

    /**
     * Gets the value for child leaf "other-access".
     * @return The value of the leaf.
     */
    public Access getOtherAccessValue() throws JNCException {
        return (Access)getValue("other-access");
    }

    /**
     * Sets the value for child leaf "other-access",
     * using a JNC type value.
     * @param otherAccessValue The value to set.
     * @param otherAccessValue used during instantiation.
     */
    public void setOtherAccessValue(Access otherAccessValue)
            throws JNCException {
        setLeafValue(Acm.NAMESPACE,
            "other-access",
            otherAccessValue,
            childrenNames());
    }

    /**
     * Sets the value for child leaf "other-access",
     * using Java primitive values.
     * @param otherAccessValue used during instantiation.
     */
    public void setOtherAccessValue(short otherAccessValue) throws JNCException {
        setOtherAccessValue(new Access(otherAccessValue));
    }

    /**
     * Sets the value for child leaf "other-access",
     * using a String value.
     * @param otherAccessValue used during instantiation.
     */
    public void setOtherAccessValue(String otherAccessValue)
            throws JNCException {
        setOtherAccessValue(new Access(otherAccessValue));
    }

    /**
     * Unsets the value for child leaf "other-access".
     */
    public void unsetOtherAccessValue() throws JNCException {
        delete("other-access");
    }

    /**
     * This method is used for creating a subtree filter.
     * The added "other-access" leaf will not have a value.
     */
    public void addOtherAccess() throws JNCException {
        setLeafValue(Acm.NAMESPACE,
            "other-access",
            null,
            childrenNames());
    }

    /**
     * Marks the leaf "other-access" with operation "replace".
     */
    public void markOtherAccessReplace() throws JNCException {
        markLeafReplace("otherAccess");
    }

    /**
     * Marks the leaf "other-access" with operation "merge".
     */
    public void markOtherAccessMerge() throws JNCException {
        markLeafMerge("otherAccess");
    }

    /**
     * Marks the leaf "other-access" with operation "create".
     */
    public void markOtherAccessCreate() throws JNCException {
        markLeafCreate("otherAccess");
    }

    /**
     * Marks the leaf "other-access" with operation "delete".
     */
    public void markOtherAccessDelete() throws JNCException {
        markLeafDelete("otherAccess");
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
