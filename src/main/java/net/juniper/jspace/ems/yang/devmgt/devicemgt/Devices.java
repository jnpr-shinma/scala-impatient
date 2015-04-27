/* 
 * @(#)Devices.java        1.0 30/12/14
 *
 * This file has been auto-generated by JNC, the
 * Java output format plug-in of pyang.
 * Origin: module "devmgt", revision: "2014-09-16".
 */

package net.juniper.jspace.ems.yang.devmgt.devicemgt;

import com.tailf.jnc.Element;
import com.tailf.jnc.ElementChildrenIterator;
import com.tailf.jnc.JNCException;
import com.tailf.jnc.Tagpath;
import com.tailf.jnc.YangElement;
import com.tailf.jnc.YangUInt32;

import net.juniper.jspace.ems.yang.devmgt.Devmgt;
import net.juniper.jspace.ems.yang.devmgt.devicemgt.devices.Device;

/**
 * This class represents an element from 
 * the namespace http://juniper.net/ns/space/test/1.0
 * generated to "src/net/juniper/jspace/ems/yang/devmgt/devicemgt/devices"
 * <p>
 * See line 18 in
 * /home/maxin/workspace/js-easy-rest/easy-rest-core/yang/devmgt.yang
 *
 * @version 1.0 2014-12-30
 * @author Auto Generated
 */
public class Devices extends YangElement {

    private static final long serialVersionUID = 1L;

    public static final Tagpath tagpath = new Tagpath("devmgt/devicemgt/devices");

    static {
        Devmgt.enable();
    }

    /**
     * Constructor for an empty Devices object.
     */
    public Devices() {
        super(Devmgt.NAMESPACE, "devices");
    }

    /**
     * Clones this object, returning an exact copy.
     * @return A clone of the object.
     */
    public Devices clone() {
        return (Devices)cloneContent(new Devices());
    }

    /**
     * Clones this object, returning a shallow copy.
     * @return A clone of the object. Children are not included.
     */
    public Devices cloneShallow() {
        return (Devices)cloneShallowContent(new Devices());
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
            "size",
            "device",
        };
    }

    /* Access methods for optional leaf child: "size". */

    /**
     * Gets the value for child leaf "size".
     * @return The value of the leaf.
     */
    public YangUInt32 getSizeValue() throws JNCException {
        return (YangUInt32)getValue("size");
    }

    /**
     * Sets the value for child leaf "size",
     * using instance of generated typedef class.
     * @param sizeValue The value to set.
     * @param sizeValue used during instantiation.
     */
    public void setSizeValue(YangUInt32 sizeValue) throws JNCException {
        setLeafValue(Devmgt.NAMESPACE,
            "size",
            sizeValue,
            childrenNames());
    }

    /**
     * Sets the value for child leaf "size",
     * using Java primitive values.
     * @param sizeValue used during instantiation.
     */
    public void setSizeValue(long sizeValue) throws JNCException {
        setSizeValue(new YangUInt32(sizeValue));
    }

    /**
     * Sets the value for child leaf "size",
     * using a String value.
     * @param sizeValue used during instantiation.
     */
    public void setSizeValue(String sizeValue) throws JNCException {
        setSizeValue(new YangUInt32(sizeValue));
    }

    /**
     * Unsets the value for child leaf "size".
     */
    public void unsetSizeValue() throws JNCException {
        delete("size");
    }

    /**
     * This method is used for creating a subtree filter.
     * The added "size" leaf will not have a value.
     */
    public void addSize() throws JNCException {
        setLeafValue(Devmgt.NAMESPACE,
            "size",
            null,
            childrenNames());
    }

    /**
     * Marks the leaf "size" with operation "replace".
     */
    public void markSizeReplace() throws JNCException {
        markLeafReplace("size");
    }

    /**
     * Marks the leaf "size" with operation "merge".
     */
    public void markSizeMerge() throws JNCException {
        markLeafMerge("size");
    }

    /**
     * Marks the leaf "size" with operation "create".
     */
    public void markSizeCreate() throws JNCException {
        markLeafCreate("size");
    }

    /**
     * Marks the leaf "size" with operation "delete".
     */
    public void markSizeDelete() throws JNCException {
        markLeafDelete("size");
    }

    /* Access methods for list child: "device". */

    /**
     * Gets list entry "device", with specified keys.
     * @param idValue Key argument of child.
     */
    public Device getDevice(YangUInt32 idValue) throws JNCException {
        String path = "device[id='" + idValue + "']";
        return (Device)searchOne(path);
    }

    /**
     * Gets list entry "device", with specified keys.
     * The keys are specified as strings.
     * @param idValue Key argument of child.
     */
    public Device getDevice(String idValue) throws JNCException {
        String path = "device[id='" + idValue + "']";
        return (Device)searchOne(path);
    }

    /**
     * Iterator method for the list "device".
     * @return An iterator for the list.
     */
    public ElementChildrenIterator deviceIterator() {
        return new ElementChildrenIterator(children, "device");
    }

    /**
     * Adds list entry "device", using an existing object.
     * @param device The object to add.
     * @return The added child.
     */
    public Device addDevice(Device device) throws JNCException {
        insertChild(device, childrenNames());
        return device;
    }

    /**
     * Adds list entry "device", with specified keys.
     * @param idValue Key argument of child.
     * @return The added child.
     */
    public Device addDevice(YangUInt32 idValue) throws JNCException {
        Device device = new Device(idValue);
        return addDevice(device);
    }

    /**
     * Adds list entry "device", with specified keys.
     * The keys are specified as strings.
     * @param idValue Key argument of child.
     * @return The added child.
     */
    public Device addDevice(String idValue) throws JNCException {
        Device device = new Device(idValue);
        return addDevice(device);
    }

    /**
     * Adds list entry "device".
     * This method is used for creating subtree filters.
     * @return The added child.
     */
    public Device addDevice() throws JNCException {
        Device device = new Device();
        insertChild(device, childrenNames());
        return device;
    }

    /**
     * Deletes list entry "device", with specified keys.
     * @param idValue Key argument of child.
     */
    public void deleteDevice(YangUInt32 idValue) throws JNCException {
        String path = "device[id='" + idValue + "']";
        delete(path);
    }

    /**
     * Deletes list entry "device", with specified keys.
     * The keys are specified as strings.
     * @param idValue Key argument of child.
     */
    public void deleteDevice(String idValue) throws JNCException {
        String path = "device[id='" + idValue + "']";
        delete(path);
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
