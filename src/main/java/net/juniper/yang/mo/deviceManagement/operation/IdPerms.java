/* 
 * @(#)IdPerms.java        1.0 19/01/15
 *
 * This file has been auto-generated by JNC, the
 * Java output format plug-in of pyang.
 * Origin: module "device-management", revision: "2014-07-26".
 */

package net.juniper.yang.mo.deviceManagement.operation;

import com.tailf.jnc.Element;
import com.tailf.jnc.JNCException;
import com.tailf.jnc.NodeSet;
import com.tailf.jnc.Tagpath;
import com.tailf.jnc.YangBoolean;
import com.tailf.jnc.YangElement;
import com.tailf.jnc.YangString;

import net.juniper.yang.mo.deviceManagement.operation.idPerms.Permissions;
import net.juniper.yang.mo.deviceManagement.operation.idPerms.Uuid;
import net.juniper.yang.mo.ietfYangTypes.DateAndTime;
import net.juniper.yang.mo.iqIfmapTypes.Ifmap;

/**
 * This class represents an element from 
 * the namespace http://juniper.net/ns/space/device-management/1.0
 * generated to "/home/maxin/space/js-ems/server/target/scala-2.11/src_managed/main/net/juniper/yang/mo/deviceManagement/operation/id-perms"
 * <p>
 * See line 97 in
 * /home/maxin/.yang/iq-ifmap-types.yang
 *
 * @version 1.0 2015-01-19
 * @author Auto Generated
 */
public class IdPerms extends YangElement {

    private static final long serialVersionUID = 1L;

    public static final Tagpath TAG_PATH = new Tagpath("operation/id-perms");

    static {
        Ifmap.enable();
    }

    /**
     * Field for child container "permissions".
     */
    public Permissions permissions = null;

    /**
     * Field for child container "uuid".
     */
    public Uuid uuid = null;

    /**
     * Constructor for an empty IdPerms object.
     */
    public IdPerms() {
        super(Ifmap.NAMESPACE, "id-perms");
        setDefaultPrefix();
        setPrefix(Ifmap.PREFIX);
    }

    /**
     * Clones this object, returning an exact copy.
     * @return A clone of the object.
     */
    public IdPerms clone() {
        return (IdPerms)cloneContent(new IdPerms());
    }

    /**
     * Clones this object, returning a shallow copy.
     * @return A clone of the object. Children are not included.
     */
    public IdPerms cloneShallow() {
        return (IdPerms)cloneShallowContent(new IdPerms());
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
            "permissions",
            "uuid",
            "enable",
            "created",
            "last-modified",
            "description",
            "user-visible",
        };
    }

    /* Access methods for container child: "permissions". */

    /**
     * Adds container entry "permissions", using an existing object.
     * @param permissions The object to add.
     * @return The added child.
     */
    public Permissions addPermissions(Permissions permissions)
            throws JNCException {
        this.permissions = permissions;
        insertChild(permissions, childrenNames());
        return permissions;
    }

    /**
     * Adds container entry "permissions".
     * This method is used for creating subtree filters.
     * @return The added child.
     */
    public Permissions addPermissions() throws JNCException {
        Permissions permissions = new Permissions();
        this.permissions = permissions;
        insertChild(permissions, childrenNames());
        return permissions;
    }

    /**
     * Deletes container entry "permissions".
     * @return An array of the deleted element nodes.
     */
    public NodeSet deletePermissions() throws JNCException {
        this.permissions = null;
        String path = "permissions";
        return delete(path);
    }

    /* Access methods for container child: "uuid". */

    /**
     * Adds container entry "uuid", using an existing object.
     * @param uuid The object to add.
     * @return The added child.
     */
    public Uuid addUuid(Uuid uuid) throws JNCException {
        this.uuid = uuid;
        insertChild(uuid, childrenNames());
        return uuid;
    }

    /**
     * Adds container entry "uuid".
     * This method is used for creating subtree filters.
     * @return The added child.
     */
    public Uuid addUuid() throws JNCException {
        Uuid uuid = new Uuid();
        this.uuid = uuid;
        insertChild(uuid, childrenNames());
        return uuid;
    }

    /**
     * Deletes container entry "uuid".
     * @return An array of the deleted element nodes.
     */
    public NodeSet deleteUuid() throws JNCException {
        this.uuid = null;
        String path = "uuid";
        return delete(path);
    }

    /* Access methods for optional leaf child: "enable". */

    /**
     * Gets the value for child leaf "enable".
     * @return The value of the leaf.
     */
    public YangBoolean getEnableValue() throws JNCException {
        return (YangBoolean)getValue("enable");
    }

    /**
     * Sets the value for child leaf "enable",
     * using instance of generated typedef class.
     * @param enableValue The value to set.
     * @param enableValue used during instantiation.
     */
    public void setEnableValue(YangBoolean enableValue) throws JNCException {
        setLeafValue(Ifmap.NAMESPACE,
            "enable",
            enableValue,
            childrenNames());
    }

    /**
     * Sets the value for child leaf "enable",
     * using Java primitive values.
     * @param enableValue used during instantiation.
     */
    public void setEnableValue(Boolean enableValue) throws JNCException {
        setEnableValue(new YangBoolean(enableValue));
    }

    /**
     * Sets the value for child leaf "enable",
     * using a String value.
     * @param enableValue used during instantiation.
     */
    public void setEnableValue(String enableValue) throws JNCException {
        setEnableValue(new YangBoolean(enableValue));
    }

    /**
     * Unsets the value for child leaf "enable".
     */
    public void unsetEnableValue() throws JNCException {
        delete("enable");
    }

    /**
     * This method is used for creating a subtree filter.
     * The added "enable" leaf will not have a value.
     */
    public void addEnable() throws JNCException {
        setLeafValue(Ifmap.NAMESPACE,
            "enable",
            null,
            childrenNames());
    }

    /**
     * Marks the leaf "enable" with operation "replace".
     */
    public void markEnableReplace() throws JNCException {
        markLeafReplace("enable");
    }

    /**
     * Marks the leaf "enable" with operation "merge".
     */
    public void markEnableMerge() throws JNCException {
        markLeafMerge("enable");
    }

    /**
     * Marks the leaf "enable" with operation "create".
     */
    public void markEnableCreate() throws JNCException {
        markLeafCreate("enable");
    }

    /**
     * Marks the leaf "enable" with operation "delete".
     */
    public void markEnableDelete() throws JNCException {
        markLeafDelete("enable");
    }

    /* Access methods for optional leaf child: "created". */

    /**
     * Gets the value for child leaf "created".
     * @return The value of the leaf.
     */
    public DateAndTime getCreatedValue() throws JNCException {
        return (DateAndTime)getValue("created");
    }

    /**
     * Sets the value for child leaf "created",
     * using a JNC type value.
     * @param createdValue The value to set.
     * @param createdValue used during instantiation.
     */
    public void setCreatedValue(DateAndTime createdValue) throws JNCException {
        setLeafValue(Ifmap.NAMESPACE,
            "created",
            createdValue,
            childrenNames());
    }

    /**
     * Sets the value for child leaf "created",
     * using a String value.
     * @param createdValue used during instantiation.
     */
    public void setCreatedValue(String createdValue) throws JNCException {
        setCreatedValue(new DateAndTime(createdValue));
    }

    /**
     * Unsets the value for child leaf "created".
     */
    public void unsetCreatedValue() throws JNCException {
        delete("created");
    }

    /**
     * This method is used for creating a subtree filter.
     * The added "created" leaf will not have a value.
     */
    public void addCreated() throws JNCException {
        setLeafValue(Ifmap.NAMESPACE,
            "created",
            null,
            childrenNames());
    }

    /**
     * Marks the leaf "created" with operation "replace".
     */
    public void markCreatedReplace() throws JNCException {
        markLeafReplace("created");
    }

    /**
     * Marks the leaf "created" with operation "merge".
     */
    public void markCreatedMerge() throws JNCException {
        markLeafMerge("created");
    }

    /**
     * Marks the leaf "created" with operation "create".
     */
    public void markCreatedCreate() throws JNCException {
        markLeafCreate("created");
    }

    /**
     * Marks the leaf "created" with operation "delete".
     */
    public void markCreatedDelete() throws JNCException {
        markLeafDelete("created");
    }

    /* Access methods for optional leaf child: "last-modified". */

    /**
     * Gets the value for child leaf "last-modified".
     * @return The value of the leaf.
     */
    public DateAndTime getLastModifiedValue() throws JNCException {
        return (DateAndTime)getValue("last-modified");
    }

    /**
     * Sets the value for child leaf "last-modified",
     * using a JNC type value.
     * @param lastModifiedValue The value to set.
     * @param lastModifiedValue used during instantiation.
     */
    public void setLastModifiedValue(DateAndTime lastModifiedValue)
            throws JNCException {
        setLeafValue(Ifmap.NAMESPACE,
            "last-modified",
            lastModifiedValue,
            childrenNames());
    }

    /**
     * Sets the value for child leaf "last-modified",
     * using a String value.
     * @param lastModifiedValue used during instantiation.
     */
    public void setLastModifiedValue(String lastModifiedValue)
            throws JNCException {
        setLastModifiedValue(new DateAndTime(lastModifiedValue));
    }

    /**
     * Unsets the value for child leaf "last-modified".
     */
    public void unsetLastModifiedValue() throws JNCException {
        delete("last-modified");
    }

    /**
     * This method is used for creating a subtree filter.
     * The added "last-modified" leaf will not have a value.
     */
    public void addLastModified() throws JNCException {
        setLeafValue(Ifmap.NAMESPACE,
            "last-modified",
            null,
            childrenNames());
    }

    /**
     * Marks the leaf "last-modified" with operation "replace".
     */
    public void markLastModifiedReplace() throws JNCException {
        markLeafReplace("lastModified");
    }

    /**
     * Marks the leaf "last-modified" with operation "merge".
     */
    public void markLastModifiedMerge() throws JNCException {
        markLeafMerge("lastModified");
    }

    /**
     * Marks the leaf "last-modified" with operation "create".
     */
    public void markLastModifiedCreate() throws JNCException {
        markLeafCreate("lastModified");
    }

    /**
     * Marks the leaf "last-modified" with operation "delete".
     */
    public void markLastModifiedDelete() throws JNCException {
        markLeafDelete("lastModified");
    }

    /* Access methods for optional leaf child: "description". */

    /**
     * Gets the value for child leaf "description".
     * @return The value of the leaf.
     */
    public YangString getDescriptionValue() throws JNCException {
        return (YangString)getValue("description");
    }

    /**
     * Sets the value for child leaf "description",
     * using instance of generated typedef class.
     * @param descriptionValue The value to set.
     * @param descriptionValue used during instantiation.
     */
    public void setDescriptionValue(YangString descriptionValue)
            throws JNCException {
        setLeafValue(Ifmap.NAMESPACE,
            "description",
            descriptionValue,
            childrenNames());
    }

    /**
     * Sets the value for child leaf "description",
     * using a String value.
     * @param descriptionValue used during instantiation.
     */
    public void setDescriptionValue(String descriptionValue)
            throws JNCException {
        setDescriptionValue(new YangString(descriptionValue));
    }

    /**
     * Unsets the value for child leaf "description".
     */
    public void unsetDescriptionValue() throws JNCException {
        delete("description");
    }

    /**
     * This method is used for creating a subtree filter.
     * The added "description" leaf will not have a value.
     */
    public void addDescription() throws JNCException {
        setLeafValue(Ifmap.NAMESPACE,
            "description",
            null,
            childrenNames());
    }

    /**
     * Marks the leaf "description" with operation "replace".
     */
    public void markDescriptionReplace() throws JNCException {
        markLeafReplace("description");
    }

    /**
     * Marks the leaf "description" with operation "merge".
     */
    public void markDescriptionMerge() throws JNCException {
        markLeafMerge("description");
    }

    /**
     * Marks the leaf "description" with operation "create".
     */
    public void markDescriptionCreate() throws JNCException {
        markLeafCreate("description");
    }

    /**
     * Marks the leaf "description" with operation "delete".
     */
    public void markDescriptionDelete() throws JNCException {
        markLeafDelete("description");
    }

    /* Access methods for optional leaf child: "user-visible". */

    /**
     * Gets the value for child leaf "user-visible".
     * @return The value of the leaf.
     */
    public YangBoolean getUserVisibleValue() throws JNCException {
        return (YangBoolean)getValue("user-visible");
    }

    /**
     * Sets the value for child leaf "user-visible",
     * using instance of generated typedef class.
     * @param userVisibleValue The value to set.
     * @param userVisibleValue used during instantiation.
     */
    public void setUserVisibleValue(YangBoolean userVisibleValue)
            throws JNCException {
        setLeafValue(Ifmap.NAMESPACE,
            "user-visible",
            userVisibleValue,
            childrenNames());
    }

    /**
     * Sets the value for child leaf "user-visible",
     * using Java primitive values.
     * @param userVisibleValue used during instantiation.
     */
    public void setUserVisibleValue(Boolean userVisibleValue)
            throws JNCException {
        setUserVisibleValue(new YangBoolean(userVisibleValue));
    }

    /**
     * Sets the value for child leaf "user-visible",
     * using a String value.
     * @param userVisibleValue used during instantiation.
     */
    public void setUserVisibleValue(String userVisibleValue)
            throws JNCException {
        setUserVisibleValue(new YangBoolean(userVisibleValue));
    }

    /**
     * Unsets the value for child leaf "user-visible".
     */
    public void unsetUserVisibleValue() throws JNCException {
        delete("user-visible");
    }

    /**
     * This method is used for creating a subtree filter.
     * The added "user-visible" leaf will not have a value.
     */
    public void addUserVisible() throws JNCException {
        setLeafValue(Ifmap.NAMESPACE,
            "user-visible",
            null,
            childrenNames());
    }

    /**
     * Marks the leaf "user-visible" with operation "replace".
     */
    public void markUserVisibleReplace() throws JNCException {
        markLeafReplace("userVisible");
    }

    /**
     * Marks the leaf "user-visible" with operation "merge".
     */
    public void markUserVisibleMerge() throws JNCException {
        markLeafMerge("userVisible");
    }

    /**
     * Marks the leaf "user-visible" with operation "create".
     */
    public void markUserVisibleCreate() throws JNCException {
        markLeafCreate("userVisible");
    }

    /**
     * Marks the leaf "user-visible" with operation "delete".
     */
    public void markUserVisibleDelete() throws JNCException {
        markLeafDelete("userVisible");
    }

    /**
     * Support method for addChild.
     * Adds a child to this object.
     * 
     * @param child The child to add
     */
    public void addChild(Element child) {
        super.addChild(child);
        if (child instanceof Permissions) permissions = (Permissions)child;
        else if (child instanceof Uuid) uuid = (Uuid)child;
    }

}
