/* 
 * @(#)Inventory.java        1.0 30/12/14
 *
 * This file has been auto-generated by JNC, the
 * Java output format plug-in of pyang.
 * Origin: module "devmgt", revision: "2014-09-16".
 */

package net.juniper.jspace.ems.yang.devmgt.devicemgt.devices.device.inventories;

import com.tailf.jnc.Element;
import com.tailf.jnc.JNCException;
import com.tailf.jnc.Leaf;
import com.tailf.jnc.Tagpath;
import com.tailf.jnc.YangElement;
import com.tailf.jnc.YangString;
import com.tailf.jnc.YangUInt32;

import net.juniper.jspace.ems.yang.devmgt.Devmgt;

/**
 * This class represents an element from 
 * the namespace http://juniper.net/ns/space/test/1.0
 * generated to "src/net/juniper/jspace/ems/yang/devmgt/devicemgt/devices/device/inventories/inventory"
 * <p>
 * See line 119 in
 * /home/maxin/workspace/js-easy-rest/easy-rest-core/yang/devmgt.yang
 *
 * @version 1.0 2014-12-30
 * @author Auto Generated
 */
public class Inventory extends YangElement {

    private static final long serialVersionUID = 1L;

    public static final Tagpath tagpath = new Tagpath("devmgt/devicemgt/devices/device/inventories/inventory");

    static {
        Devmgt.enable();
    }

    /**
     * Constructor for an empty Inventory object.
     */
    public Inventory() {
        super(Devmgt.NAMESPACE, "inventory");
    }

    /**
     * Constructor for an initialized Inventory object,
     * 
     * @param idValue Key argument of child.
     */
    public Inventory(YangUInt32 idValue) throws JNCException {
        super(Devmgt.NAMESPACE, "inventory");
        Leaf id = new Leaf(Devmgt.NAMESPACE, "id");
        id.setValue(idValue);
        insertChild(id, childrenNames());
    }

    /**
     * Constructor for an initialized Inventory object,
     * with String keys.
     * @param idValue Key argument of child.
     */
    public Inventory(String idValue) throws JNCException {
        super(Devmgt.NAMESPACE, "inventory");
        Leaf id = new Leaf(Devmgt.NAMESPACE, "id");
        id.setValue(new YangUInt32(idValue));
        insertChild(id, childrenNames());
    }

    /**
     * Constructor for an initialized Inventory object,
     * with keys of built in Java types.
     * @param idValue Key argument of child.
     */
    public Inventory(long idValue) throws JNCException {
        super(Devmgt.NAMESPACE, "inventory");
        Leaf id = new Leaf(Devmgt.NAMESPACE, "id");
        id.setValue(new YangUInt32(idValue));
        insertChild(id, childrenNames());
    }

    /**
     * Clones this object, returning an exact copy.
     * @return A clone of the object.
     */
    public Inventory clone() {
        Inventory copy;
        try {
            copy = new Inventory(getIdValue().toString());
        } catch (JNCException e) {
            copy = null;
        }
        return (Inventory)cloneContent(copy);
    }

    /**
     * Clones this object, returning a shallow copy.
     * @return A clone of the object. Children are not included.
     */
    public Inventory cloneShallow() {
        Inventory copy;
        try {
            copy = new Inventory(getIdValue().toString());
        } catch (JNCException e) {
            copy = null;
        }
        return (Inventory)cloneShallowContent(copy);
    }

    /**
     * @return An array with the identifiers of any key children
     */
    public String[] keyNames() {
        return new String[] {
            "id",
        };
    }

    /**
     * @return An array with the identifiers of any children, in order.
     */
    public String[] childrenNames() {
        return new String[] {
            "id",
            "pid",
            "name",
            "installedDescription",
            "installedEquipmentObjectType",
            "installedPartNumber",
            "installedSerialNumber",
            "installedVersion",
            "manufacturer",
            "path",
        };
    }

    /* Access methods for leaf child: "id". */

    /**
     * Gets the value for child leaf "id".
     * @return The value of the leaf.
     */
    public YangUInt32 getIdValue() throws JNCException {
        return (YangUInt32)getValue("id");
    }

    /**
     * Sets the value for child leaf "id",
     * using instance of generated typedef class.
     * @param idValue The value to set.
     * @param idValue used during instantiation.
     */
    public void setIdValue(YangUInt32 idValue) throws JNCException {
        setLeafValue(Devmgt.NAMESPACE,
            "id",
            idValue,
            childrenNames());
    }

    /**
     * Sets the value for child leaf "id",
     * using Java primitive values.
     * @param idValue used during instantiation.
     */
    public void setIdValue(long idValue) throws JNCException {
        setIdValue(new YangUInt32(idValue));
    }

    /**
     * Sets the value for child leaf "id",
     * using a String value.
     * @param idValue used during instantiation.
     */
    public void setIdValue(String idValue) throws JNCException {
        setIdValue(new YangUInt32(idValue));
    }

    /**
     * This method is used for creating a subtree filter.
     * The added "id" leaf will not have a value.
     */
    public void addId() throws JNCException {
        setLeafValue(Devmgt.NAMESPACE,
            "id",
            null,
            childrenNames());
    }

    /* Access methods for optional leaf child: "pid". */

    /**
     * Gets the value for child leaf "pid".
     * @return The value of the leaf.
     */
    public YangUInt32 getPidValue() throws JNCException {
        return (YangUInt32)getValue("pid");
    }

    /**
     * Sets the value for child leaf "pid",
     * using instance of generated typedef class.
     * @param pidValue The value to set.
     * @param pidValue used during instantiation.
     */
    public void setPidValue(YangUInt32 pidValue) throws JNCException {
        setLeafValue(Devmgt.NAMESPACE,
            "pid",
            pidValue,
            childrenNames());
    }

    /**
     * Sets the value for child leaf "pid",
     * using Java primitive values.
     * @param pidValue used during instantiation.
     */
    public void setPidValue(long pidValue) throws JNCException {
        setPidValue(new YangUInt32(pidValue));
    }

    /**
     * Sets the value for child leaf "pid",
     * using a String value.
     * @param pidValue used during instantiation.
     */
    public void setPidValue(String pidValue) throws JNCException {
        setPidValue(new YangUInt32(pidValue));
    }

    /**
     * Unsets the value for child leaf "pid".
     */
    public void unsetPidValue() throws JNCException {
        delete("pid");
    }

    /**
     * This method is used for creating a subtree filter.
     * The added "pid" leaf will not have a value.
     */
    public void addPid() throws JNCException {
        setLeafValue(Devmgt.NAMESPACE,
            "pid",
            null,
            childrenNames());
    }

    /**
     * Marks the leaf "pid" with operation "replace".
     */
    public void markPidReplace() throws JNCException {
        markLeafReplace("pid");
    }

    /**
     * Marks the leaf "pid" with operation "merge".
     */
    public void markPidMerge() throws JNCException {
        markLeafMerge("pid");
    }

    /**
     * Marks the leaf "pid" with operation "create".
     */
    public void markPidCreate() throws JNCException {
        markLeafCreate("pid");
    }

    /**
     * Marks the leaf "pid" with operation "delete".
     */
    public void markPidDelete() throws JNCException {
        markLeafDelete("pid");
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
        setLeafValue(Devmgt.NAMESPACE,
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
        setLeafValue(Devmgt.NAMESPACE,
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

    /* Access methods for optional leaf child: "installedDescription". */

    /**
     * Gets the value for child leaf "installedDescription".
     * @return The value of the leaf.
     */
    public YangString getInstalledDescriptionValue() throws JNCException {
        return (YangString)getValue("installedDescription");
    }

    /**
     * Sets the value for child leaf "installedDescription",
     * using instance of generated typedef class.
     * @param installedDescriptionValue The value to set.
     * @param installedDescriptionValue used during instantiation.
     */
    public void setInstalledDescriptionValue(YangString installedDescriptionValue)
            throws JNCException {
        setLeafValue(Devmgt.NAMESPACE,
            "installedDescription",
            installedDescriptionValue,
            childrenNames());
    }

    /**
     * Sets the value for child leaf "installedDescription",
     * using a String value.
     * @param installedDescriptionValue used during instantiation.
     */
    public void setInstalledDescriptionValue(String installedDescriptionValue)
            throws JNCException {
        setInstalledDescriptionValue(new YangString(installedDescriptionValue));
    }

    /**
     * Unsets the value for child leaf "installedDescription".
     */
    public void unsetInstalledDescriptionValue() throws JNCException {
        delete("installedDescription");
    }

    /**
     * This method is used for creating a subtree filter.
     * The added "installedDescription" leaf will not have a value.
     */
    public void addInstalledDescription() throws JNCException {
        setLeafValue(Devmgt.NAMESPACE,
            "installedDescription",
            null,
            childrenNames());
    }

    /**
     * Marks the leaf "installedDescription" with operation "replace".
     */
    public void markInstalledDescriptionReplace() throws JNCException {
        markLeafReplace("installedDescription");
    }

    /**
     * Marks the leaf "installedDescription" with operation "merge".
     */
    public void markInstalledDescriptionMerge() throws JNCException {
        markLeafMerge("installedDescription");
    }

    /**
     * Marks the leaf "installedDescription" with operation "create".
     */
    public void markInstalledDescriptionCreate() throws JNCException {
        markLeafCreate("installedDescription");
    }

    /**
     * Marks the leaf "installedDescription" with operation "delete".
     */
    public void markInstalledDescriptionDelete() throws JNCException {
        markLeafDelete("installedDescription");
    }

    /* Access methods for optional leaf child: "installedEquipmentObjectType". */

    /**
     * Gets the value for child leaf "installedEquipmentObjectType".
     * @return The value of the leaf.
     */
    public YangString getInstalledEquipmentObjectTypeValue()
            throws JNCException {
        return (YangString)getValue("installedEquipmentObjectType");
    }

    /**
     * Sets the value for child leaf "installedEquipmentObjectType",
     * using instance of generated typedef class.
     * @param installedEquipmentObjectTypeValue The value to set.
     * @param installedEquipmentObjectTypeValue used during instantiation.
     */
    public void setInstalledEquipmentObjectTypeValue(YangString installedEquipmentObjectTypeValue)
            throws JNCException {
        setLeafValue(Devmgt.NAMESPACE,
            "installedEquipmentObjectType",
            installedEquipmentObjectTypeValue,
            childrenNames());
    }

    /**
     * Sets the value for child leaf "installedEquipmentObjectType",
     * using a String value.
     * @param installedEquipmentObjectTypeValue used during instantiation.
     */
    public void setInstalledEquipmentObjectTypeValue(String installedEquipmentObjectTypeValue)
            throws JNCException {
        setInstalledEquipmentObjectTypeValue(new YangString(installedEquipmentObjectTypeValue));
    }

    /**
     * Unsets the value for child leaf "installedEquipmentObjectType".
     */
    public void unsetInstalledEquipmentObjectTypeValue() throws JNCException {
        delete("installedEquipmentObjectType");
    }

    /**
     * This method is used for creating a subtree filter.
     * The added "installedEquipmentObjectType" leaf will not have a value.
     */
    public void addInstalledEquipmentObjectType() throws JNCException {
        setLeafValue(Devmgt.NAMESPACE,
            "installedEquipmentObjectType",
            null,
            childrenNames());
    }

    /**
     * Marks the leaf "installedEquipmentObjectType" with operation "replace".
     */
    public void markInstalledEquipmentObjectTypeReplace() throws JNCException {
        markLeafReplace("installedEquipmentObjectType");
    }

    /**
     * Marks the leaf "installedEquipmentObjectType" with operation "merge".
     */
    public void markInstalledEquipmentObjectTypeMerge() throws JNCException {
        markLeafMerge("installedEquipmentObjectType");
    }

    /**
     * Marks the leaf "installedEquipmentObjectType" with operation "create".
     */
    public void markInstalledEquipmentObjectTypeCreate() throws JNCException {
        markLeafCreate("installedEquipmentObjectType");
    }

    /**
     * Marks the leaf "installedEquipmentObjectType" with operation "delete".
     */
    public void markInstalledEquipmentObjectTypeDelete() throws JNCException {
        markLeafDelete("installedEquipmentObjectType");
    }

    /* Access methods for optional leaf child: "installedPartNumber". */

    /**
     * Gets the value for child leaf "installedPartNumber".
     * @return The value of the leaf.
     */
    public YangString getInstalledPartNumberValue() throws JNCException {
        return (YangString)getValue("installedPartNumber");
    }

    /**
     * Sets the value for child leaf "installedPartNumber",
     * using instance of generated typedef class.
     * @param installedPartNumberValue The value to set.
     * @param installedPartNumberValue used during instantiation.
     */
    public void setInstalledPartNumberValue(YangString installedPartNumberValue)
            throws JNCException {
        setLeafValue(Devmgt.NAMESPACE,
            "installedPartNumber",
            installedPartNumberValue,
            childrenNames());
    }

    /**
     * Sets the value for child leaf "installedPartNumber",
     * using a String value.
     * @param installedPartNumberValue used during instantiation.
     */
    public void setInstalledPartNumberValue(String installedPartNumberValue)
            throws JNCException {
        setInstalledPartNumberValue(new YangString(installedPartNumberValue));
    }

    /**
     * Unsets the value for child leaf "installedPartNumber".
     */
    public void unsetInstalledPartNumberValue() throws JNCException {
        delete("installedPartNumber");
    }

    /**
     * This method is used for creating a subtree filter.
     * The added "installedPartNumber" leaf will not have a value.
     */
    public void addInstalledPartNumber() throws JNCException {
        setLeafValue(Devmgt.NAMESPACE,
            "installedPartNumber",
            null,
            childrenNames());
    }

    /**
     * Marks the leaf "installedPartNumber" with operation "replace".
     */
    public void markInstalledPartNumberReplace() throws JNCException {
        markLeafReplace("installedPartNumber");
    }

    /**
     * Marks the leaf "installedPartNumber" with operation "merge".
     */
    public void markInstalledPartNumberMerge() throws JNCException {
        markLeafMerge("installedPartNumber");
    }

    /**
     * Marks the leaf "installedPartNumber" with operation "create".
     */
    public void markInstalledPartNumberCreate() throws JNCException {
        markLeafCreate("installedPartNumber");
    }

    /**
     * Marks the leaf "installedPartNumber" with operation "delete".
     */
    public void markInstalledPartNumberDelete() throws JNCException {
        markLeafDelete("installedPartNumber");
    }

    /* Access methods for optional leaf child: "installedSerialNumber". */

    /**
     * Gets the value for child leaf "installedSerialNumber".
     * @return The value of the leaf.
     */
    public YangString getInstalledSerialNumberValue() throws JNCException {
        return (YangString)getValue("installedSerialNumber");
    }

    /**
     * Sets the value for child leaf "installedSerialNumber",
     * using instance of generated typedef class.
     * @param installedSerialNumberValue The value to set.
     * @param installedSerialNumberValue used during instantiation.
     */
    public void setInstalledSerialNumberValue(YangString installedSerialNumberValue)
            throws JNCException {
        setLeafValue(Devmgt.NAMESPACE,
            "installedSerialNumber",
            installedSerialNumberValue,
            childrenNames());
    }

    /**
     * Sets the value for child leaf "installedSerialNumber",
     * using a String value.
     * @param installedSerialNumberValue used during instantiation.
     */
    public void setInstalledSerialNumberValue(String installedSerialNumberValue)
            throws JNCException {
        setInstalledSerialNumberValue(new YangString(installedSerialNumberValue));
    }

    /**
     * Unsets the value for child leaf "installedSerialNumber".
     */
    public void unsetInstalledSerialNumberValue() throws JNCException {
        delete("installedSerialNumber");
    }

    /**
     * This method is used for creating a subtree filter.
     * The added "installedSerialNumber" leaf will not have a value.
     */
    public void addInstalledSerialNumber() throws JNCException {
        setLeafValue(Devmgt.NAMESPACE,
            "installedSerialNumber",
            null,
            childrenNames());
    }

    /**
     * Marks the leaf "installedSerialNumber" with operation "replace".
     */
    public void markInstalledSerialNumberReplace() throws JNCException {
        markLeafReplace("installedSerialNumber");
    }

    /**
     * Marks the leaf "installedSerialNumber" with operation "merge".
     */
    public void markInstalledSerialNumberMerge() throws JNCException {
        markLeafMerge("installedSerialNumber");
    }

    /**
     * Marks the leaf "installedSerialNumber" with operation "create".
     */
    public void markInstalledSerialNumberCreate() throws JNCException {
        markLeafCreate("installedSerialNumber");
    }

    /**
     * Marks the leaf "installedSerialNumber" with operation "delete".
     */
    public void markInstalledSerialNumberDelete() throws JNCException {
        markLeafDelete("installedSerialNumber");
    }

    /* Access methods for optional leaf child: "installedVersion". */

    /**
     * Gets the value for child leaf "installedVersion".
     * @return The value of the leaf.
     */
    public YangString getInstalledVersionValue() throws JNCException {
        return (YangString)getValue("installedVersion");
    }

    /**
     * Sets the value for child leaf "installedVersion",
     * using instance of generated typedef class.
     * @param installedVersionValue The value to set.
     * @param installedVersionValue used during instantiation.
     */
    public void setInstalledVersionValue(YangString installedVersionValue)
            throws JNCException {
        setLeafValue(Devmgt.NAMESPACE,
            "installedVersion",
            installedVersionValue,
            childrenNames());
    }

    /**
     * Sets the value for child leaf "installedVersion",
     * using a String value.
     * @param installedVersionValue used during instantiation.
     */
    public void setInstalledVersionValue(String installedVersionValue)
            throws JNCException {
        setInstalledVersionValue(new YangString(installedVersionValue));
    }

    /**
     * Unsets the value for child leaf "installedVersion".
     */
    public void unsetInstalledVersionValue() throws JNCException {
        delete("installedVersion");
    }

    /**
     * This method is used for creating a subtree filter.
     * The added "installedVersion" leaf will not have a value.
     */
    public void addInstalledVersion() throws JNCException {
        setLeafValue(Devmgt.NAMESPACE,
            "installedVersion",
            null,
            childrenNames());
    }

    /**
     * Marks the leaf "installedVersion" with operation "replace".
     */
    public void markInstalledVersionReplace() throws JNCException {
        markLeafReplace("installedVersion");
    }

    /**
     * Marks the leaf "installedVersion" with operation "merge".
     */
    public void markInstalledVersionMerge() throws JNCException {
        markLeafMerge("installedVersion");
    }

    /**
     * Marks the leaf "installedVersion" with operation "create".
     */
    public void markInstalledVersionCreate() throws JNCException {
        markLeafCreate("installedVersion");
    }

    /**
     * Marks the leaf "installedVersion" with operation "delete".
     */
    public void markInstalledVersionDelete() throws JNCException {
        markLeafDelete("installedVersion");
    }

    /* Access methods for optional leaf child: "manufacturer". */

    /**
     * Gets the value for child leaf "manufacturer".
     * @return The value of the leaf.
     */
    public YangString getManufacturerValue() throws JNCException {
        return (YangString)getValue("manufacturer");
    }

    /**
     * Sets the value for child leaf "manufacturer",
     * using instance of generated typedef class.
     * @param manufacturerValue The value to set.
     * @param manufacturerValue used during instantiation.
     */
    public void setManufacturerValue(YangString manufacturerValue)
            throws JNCException {
        setLeafValue(Devmgt.NAMESPACE,
            "manufacturer",
            manufacturerValue,
            childrenNames());
    }

    /**
     * Sets the value for child leaf "manufacturer",
     * using a String value.
     * @param manufacturerValue used during instantiation.
     */
    public void setManufacturerValue(String manufacturerValue)
            throws JNCException {
        setManufacturerValue(new YangString(manufacturerValue));
    }

    /**
     * Unsets the value for child leaf "manufacturer".
     */
    public void unsetManufacturerValue() throws JNCException {
        delete("manufacturer");
    }

    /**
     * This method is used for creating a subtree filter.
     * The added "manufacturer" leaf will not have a value.
     */
    public void addManufacturer() throws JNCException {
        setLeafValue(Devmgt.NAMESPACE,
            "manufacturer",
            null,
            childrenNames());
    }

    /**
     * Marks the leaf "manufacturer" with operation "replace".
     */
    public void markManufacturerReplace() throws JNCException {
        markLeafReplace("manufacturer");
    }

    /**
     * Marks the leaf "manufacturer" with operation "merge".
     */
    public void markManufacturerMerge() throws JNCException {
        markLeafMerge("manufacturer");
    }

    /**
     * Marks the leaf "manufacturer" with operation "create".
     */
    public void markManufacturerCreate() throws JNCException {
        markLeafCreate("manufacturer");
    }

    /**
     * Marks the leaf "manufacturer" with operation "delete".
     */
    public void markManufacturerDelete() throws JNCException {
        markLeafDelete("manufacturer");
    }

    /* Access methods for optional leaf child: "path". */

    /**
     * Gets the value for child leaf "path".
     * @return The value of the leaf.
     */
    public YangString getPathValue() throws JNCException {
        return (YangString)getValue("path");
    }

    /**
     * Sets the value for child leaf "path",
     * using instance of generated typedef class.
     * @param pathValue The value to set.
     * @param pathValue used during instantiation.
     */
    public void setPathValue(YangString pathValue) throws JNCException {
        setLeafValue(Devmgt.NAMESPACE,
            "path",
            pathValue,
            childrenNames());
    }

    /**
     * Sets the value for child leaf "path",
     * using a String value.
     * @param pathValue used during instantiation.
     */
    public void setPathValue(String pathValue) throws JNCException {
        setPathValue(new YangString(pathValue));
    }

    /**
     * Unsets the value for child leaf "path".
     */
    public void unsetPathValue() throws JNCException {
        delete("path");
    }

    /**
     * This method is used for creating a subtree filter.
     * The added "path" leaf will not have a value.
     */
    public void addPath() throws JNCException {
        setLeafValue(Devmgt.NAMESPACE,
            "path",
            null,
            childrenNames());
    }

    /**
     * Marks the leaf "path" with operation "replace".
     */
    public void markPathReplace() throws JNCException {
        markLeafReplace("path");
    }

    /**
     * Marks the leaf "path" with operation "merge".
     */
    public void markPathMerge() throws JNCException {
        markLeafMerge("path");
    }

    /**
     * Marks the leaf "path" with operation "create".
     */
    public void markPathCreate() throws JNCException {
        markLeafCreate("path");
    }

    /**
     * Marks the leaf "path" with operation "delete".
     */
    public void markPathDelete() throws JNCException {
        markLeafDelete("path");
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
