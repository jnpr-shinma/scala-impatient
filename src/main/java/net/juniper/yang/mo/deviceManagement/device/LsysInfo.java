/* 
 * @(#)LsysInfo.java        1.0 19/01/15
 *
 * This file has been auto-generated by JNC, the
 * Java output format plug-in of pyang.
 * Origin: module "device-management", revision: "2014-07-26".
 */

package net.juniper.yang.mo.deviceManagement.device;

import com.tailf.jnc.Element;
import com.tailf.jnc.JNCException;
import com.tailf.jnc.NodeSet;
import com.tailf.jnc.Tagpath;
import com.tailf.jnc.YangElement;
import com.tailf.jnc.YangEmpty;

import net.juniper.yang.mo.deviceManagement.Devicemgt;
import net.juniper.yang.mo.deviceManagement.device.lsysInfo.LsysMembers;
import net.juniper.yang.mo.deviceManagement.device.lsysInfo.LsysRoot;

/**
 * This class represents an element from 
 * the namespace http://juniper.net/ns/space/device-management/1.0
 * generated to "/home/maxin/space/js-ems/server/target/scala-2.11/src_managed/main/net/juniper/yang/mo/deviceManagement/device/lsysInfo"
 * <p>
 * See line 284 in
 * /home/maxin/space/js-ems/server/src/main/resources/yang/device-management.yang
 *
 * @version 1.0 2015-01-19
 * @author Auto Generated
 */
public class LsysInfo extends YangElement {

    private static final long serialVersionUID = 1L;

    public static final Tagpath TAG_PATH = new Tagpath("device/lsysInfo");

    static {
        Devicemgt.enable();
    }

    /**
     * Field for child container "lsysMembers".
     */
    public LsysMembers lsysMembers = null;

    /**
     * Field for child container "lsysRoot".
     */
    public LsysRoot lsysRoot = null;

    /**
     * Constructor for an empty LsysInfo object.
     */
    public LsysInfo() {
        super(Devicemgt.NAMESPACE, "lsysInfo");
    }

    /**
     * Clones this object, returning an exact copy.
     * @return A clone of the object.
     */
    public LsysInfo clone() {
        return (LsysInfo)cloneContent(new LsysInfo());
    }

    /**
     * Clones this object, returning a shallow copy.
     * @return A clone of the object. Children are not included.
     */
    public LsysInfo cloneShallow() {
        return (LsysInfo)cloneShallowContent(new LsysInfo());
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
            "none",
            "lsysMembers",
            "lsysRoot",
        };
    }

    /* Access methods for optional leaf child: "none". */

    /**
     * Searches for leaf "none".
     * @return A YangEmpty object if leaf exists; <code>null</code> otherwise.
     */
    public YangEmpty getNoneValue() throws JNCException {
        return (YangEmpty)getValue("none");
    }

    /**
     * Sets the value for child leaf "none",
     * using instance of generated typedef class.
     * @param noneValue The value to set.
     * @param noneValue used during instantiation.
     */
    public void setNoneValue(YangEmpty noneValue) throws JNCException {
        setLeafValue(Devicemgt.NAMESPACE,
            "none",
            noneValue,
            childrenNames());
    }

    /**
     * Sets the value for child leaf "none",
     * by instantiating it (value n/a).
     * @param noneValue ignored.
     */
    public void setNoneValue(String noneValue) throws JNCException {
        setNoneValue(new YangEmpty());
    }

    /**
     * Unsets the value for child leaf "none".
     */
    public void unsetNoneValue() throws JNCException {
        delete("none");
    }

    /**
     * This method is used for creating a subtree filter.
     * The added "none" leaf will not have a value.
     */
    public void addNone() throws JNCException {
        setLeafValue(Devicemgt.NAMESPACE,
            "none",
            null,
            childrenNames());
    }

    /**
     * Marks the leaf "none" with operation "replace".
     */
    public void markNoneReplace() throws JNCException {
        markLeafReplace("none");
    }

    /**
     * Marks the leaf "none" with operation "merge".
     */
    public void markNoneMerge() throws JNCException {
        markLeafMerge("none");
    }

    /**
     * Marks the leaf "none" with operation "create".
     */
    public void markNoneCreate() throws JNCException {
        markLeafCreate("none");
    }

    /**
     * Marks the leaf "none" with operation "delete".
     */
    public void markNoneDelete() throws JNCException {
        markLeafDelete("none");
    }

    /* Access methods for container child: "lsysMembers". */

    /**
     * Adds container entry "lsysMembers", using an existing object.
     * @param lsysMembers The object to add.
     * @return The added child.
     */
    public LsysMembers addLsysMembers(LsysMembers lsysMembers)
            throws JNCException {
        this.lsysMembers = lsysMembers;
        insertChild(lsysMembers, childrenNames());
        return lsysMembers;
    }

    /**
     * Adds container entry "lsysMembers".
     * This method is used for creating subtree filters.
     * @return The added child.
     */
    public LsysMembers addLsysMembers() throws JNCException {
        LsysMembers lsysMembers = new LsysMembers();
        this.lsysMembers = lsysMembers;
        insertChild(lsysMembers, childrenNames());
        return lsysMembers;
    }

    /**
     * Deletes container entry "lsysMembers".
     * @return An array of the deleted element nodes.
     */
    public NodeSet deleteLsysMembers() throws JNCException {
        this.lsysMembers = null;
        String path = "lsysMembers";
        return delete(path);
    }

    /* Access methods for container child: "lsysRoot". */

    /**
     * Adds container entry "lsysRoot", using an existing object.
     * @param lsysRoot The object to add.
     * @return The added child.
     */
    public LsysRoot addLsysRoot(LsysRoot lsysRoot) throws JNCException {
        this.lsysRoot = lsysRoot;
        insertChild(lsysRoot, childrenNames());
        return lsysRoot;
    }

    /**
     * Adds container entry "lsysRoot".
     * This method is used for creating subtree filters.
     * @return The added child.
     */
    public LsysRoot addLsysRoot() throws JNCException {
        LsysRoot lsysRoot = new LsysRoot();
        this.lsysRoot = lsysRoot;
        insertChild(lsysRoot, childrenNames());
        return lsysRoot;
    }

    /**
     * Deletes container entry "lsysRoot".
     * @return An array of the deleted element nodes.
     */
    public NodeSet deleteLsysRoot() throws JNCException {
        this.lsysRoot = null;
        String path = "lsysRoot";
        return delete(path);
    }

    /**
     * Support method for addChild.
     * Adds a child to this object.
     * 
     * @param child The child to add
     */
    public void addChild(Element child) {
        super.addChild(child);
        if (child instanceof LsysMembers) lsysMembers = (LsysMembers)child;
        else if (child instanceof LsysRoot) lsysRoot = (LsysRoot)child;
    }

}