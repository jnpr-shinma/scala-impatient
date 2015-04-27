/* 
 * @(#)LsysRoot.java        1.0 19/01/15
 *
 * This file has been auto-generated by JNC, the
 * Java output format plug-in of pyang.
 * Origin: module "device-management", revision: "2014-07-26".
 */

package net.juniper.yang.mo.deviceManagement.device.lsysInfo;

import com.tailf.jnc.Element;
import com.tailf.jnc.JNCException;
import com.tailf.jnc.Tagpath;
import com.tailf.jnc.YangElement;
import com.tailf.jnc.YangString;

import net.juniper.yang.mo.deviceManagement.DeviceIdRef;
import net.juniper.yang.mo.deviceManagement.Devicemgt;

/**
 * This class represents an element from 
 * the namespace http://juniper.net/ns/space/device-management/1.0
 * generated to "/home/maxin/space/js-ems/server/target/scala-2.11/src_managed/main/net/juniper/yang/mo/deviceManagement/device/lsysInfo/lsysRoot"
 * <p>
 * See line 317 in
 * /home/maxin/space/js-ems/server/src/main/resources/yang/device-management.yang
 *
 * @version 1.0 2015-01-19
 * @author Auto Generated
 */
public class LsysRoot extends YangElement {

    private static final long serialVersionUID = 1L;

    public static final Tagpath TAG_PATH = new Tagpath("device/lsysInfo/lsysRoot");

    static {
        Devicemgt.enable();
    }

    /**
     * Constructor for an empty LsysRoot object.
     */
    public LsysRoot() {
        super(Devicemgt.NAMESPACE, "lsysRoot");
    }

    /**
     * Clones this object, returning an exact copy.
     * @return A clone of the object.
     */
    public LsysRoot clone() {
        return (LsysRoot)cloneContent(new LsysRoot());
    }

    /**
     * Clones this object, returning a shallow copy.
     * @return A clone of the object. Children are not included.
     */
    public LsysRoot cloneShallow() {
        return (LsysRoot)cloneShallowContent(new LsysRoot());
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
            "uuid",
            "name",
        };
    }

    /* Access methods for optional leaf child: "uuid". */

    /**
     * Gets the value for child leaf "uuid".
     * @return The value of the leaf.
     */
    public DeviceIdRef getUuidValue() throws JNCException {
        return (DeviceIdRef)getValue("uuid");
    }

    /**
     * Sets the value for child leaf "uuid",
     * using a JNC type value.
     * @param uuidValue The value to set.
     * @param uuidValue used during instantiation.
     */
    public void setUuidValue(DeviceIdRef uuidValue) throws JNCException {
        setLeafValue(Devicemgt.NAMESPACE,
            "uuid",
            uuidValue,
            childrenNames());
    }

    /**
     * Sets the value for child leaf "uuid",
     * using a String value.
     * @param uuidValue used during instantiation.
     */
    public void setUuidValue(String uuidValue) throws JNCException {
        setUuidValue(new DeviceIdRef(uuidValue));
    }

    /**
     * Unsets the value for child leaf "uuid".
     */
    public void unsetUuidValue() throws JNCException {
        delete("uuid");
    }

    /**
     * This method is used for creating a subtree filter.
     * The added "uuid" leaf will not have a value.
     */
    public void addUuid() throws JNCException {
        setLeafValue(Devicemgt.NAMESPACE,
            "uuid",
            null,
            childrenNames());
    }

    /**
     * Marks the leaf "uuid" with operation "replace".
     */
    public void markUuidReplace() throws JNCException {
        markLeafReplace("uuid");
    }

    /**
     * Marks the leaf "uuid" with operation "merge".
     */
    public void markUuidMerge() throws JNCException {
        markLeafMerge("uuid");
    }

    /**
     * Marks the leaf "uuid" with operation "create".
     */
    public void markUuidCreate() throws JNCException {
        markLeafCreate("uuid");
    }

    /**
     * Marks the leaf "uuid" with operation "delete".
     */
    public void markUuidDelete() throws JNCException {
        markLeafDelete("uuid");
    }

    /* Access methods for optional leaf child: "name". */

    /**
     * Gets the value for child leaf "name".
     * @return The value of the leaf.
     */
    public YangString getNameValue() throws JNCException {
        return (YangString)getValue("name");
    }

    /**
     * Sets the value for child leaf "name",
     * using instance of generated typedef class.
     * @param nameValue The value to set.
     * @param nameValue used during instantiation.
     */
    public void setNameValue(YangString nameValue) throws JNCException {
        setLeafValue(Devicemgt.NAMESPACE,
            "name",
            nameValue,
            childrenNames());
    }

    /**
     * Sets the value for child leaf "name",
     * using a String value.
     * @param nameValue used during instantiation.
     */
    public void setNameValue(String nameValue) throws JNCException {
        setNameValue(new YangString(nameValue));
    }

    /**
     * Unsets the value for child leaf "name".
     */
    public void unsetNameValue() throws JNCException {
        delete("name");
    }

    /**
     * This method is used for creating a subtree filter.
     * The added "name" leaf will not have a value.
     */
    public void addName() throws JNCException {
        setLeafValue(Devicemgt.NAMESPACE,
            "name",
            null,
            childrenNames());
    }

    /**
     * Marks the leaf "name" with operation "replace".
     */
    public void markNameReplace() throws JNCException {
        markLeafReplace("name");
    }

    /**
     * Marks the leaf "name" with operation "merge".
     */
    public void markNameMerge() throws JNCException {
        markLeafMerge("name");
    }

    /**
     * Marks the leaf "name" with operation "create".
     */
    public void markNameCreate() throws JNCException {
        markLeafCreate("name");
    }

    /**
     * Marks the leaf "name" with operation "delete".
     */
    public void markNameDelete() throws JNCException {
        markLeafDelete("name");
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
