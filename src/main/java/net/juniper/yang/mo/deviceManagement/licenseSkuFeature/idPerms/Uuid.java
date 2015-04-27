/* 
 * @(#)Uuid.java        1.0 19/01/15
 *
 * This file has been auto-generated by JNC, the
 * Java output format plug-in of pyang.
 * Origin: module "device-management", revision: "2014-07-26".
 */

package net.juniper.yang.mo.deviceManagement.licenseSkuFeature.idPerms;

import com.tailf.jnc.Element;
import com.tailf.jnc.JNCException;
import com.tailf.jnc.Tagpath;
import com.tailf.jnc.YangElement;
import com.tailf.jnc.YangUInt64;

import java.math.BigInteger;

import net.juniper.yang.mo.iqCommonTypes.Common;
import net.juniper.yang.mo.iqIfmapTypes.Ifmap;

/**
 * This class represents an element from 
 * the namespace http://juniper.net/ns/space/device-management/1.0
 * generated to "/home/maxin/space/js-ems/server/target/scala-2.11/src_managed/main/net/juniper/yang/mo/deviceManagement/licenseSkuFeature/idPerms/uuid"
 * <p>
 * See line 39 in
 * /home/maxin/.yang/iq-ifmap-types.yang
 *
 * @version 1.0 2015-01-19
 * @author Auto Generated
 */
public class Uuid extends YangElement {

    private static final long serialVersionUID = 1L;

    public static final Tagpath TAG_PATH = new Tagpath("licenseSkuFeature/idPerms/uuid");

    static {
        Ifmap.enable();
    }

    /**
     * Constructor for an empty Uuid object.
     */
    public Uuid() {
        super(Ifmap.NAMESPACE, "uuid");
    }

    /**
     * Clones this object, returning an exact copy.
     * @return A clone of the object.
     */
    public Uuid clone() {
        return (Uuid)cloneContent(new Uuid());
    }

    /**
     * Clones this object, returning a shallow copy.
     * @return A clone of the object. Children are not included.
     */
    public Uuid cloneShallow() {
        return (Uuid)cloneShallowContent(new Uuid());
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
            "uuid-mslong",
            "uuid-lslong",
        };
    }

    /* Access methods for optional leaf child: "uuid-mslong". */

    /**
     * Gets the value for child leaf "uuid-mslong".
     * @return The value of the leaf.
     */
    public YangUInt64 getUuidMslongValue() throws JNCException {
        return (YangUInt64)getValue("uuid-mslong");
    }

    /**
     * Sets the value for child leaf "uuid-mslong",
     * using instance of generated typedef class.
     * @param uuidMslongValue The value to set.
     * @param uuidMslongValue used during instantiation.
     */
    public void setUuidMslongValue(YangUInt64 uuidMslongValue)
            throws JNCException {
        setLeafValue(Common.NAMESPACE,
            "uuid-mslong",
            uuidMslongValue,
            childrenNames());
    }

    /**
     * Sets the value for child leaf "uuid-mslong",
     * using Java primitive values.
     * @param uuidMslongValue used during instantiation.
     */
    public void setUuidMslongValue(BigInteger uuidMslongValue)
            throws JNCException {
        setUuidMslongValue(new YangUInt64(uuidMslongValue));
    }

    /**
     * Sets the value for child leaf "uuid-mslong",
     * using a String value.
     * @param uuidMslongValue used during instantiation.
     */
    public void setUuidMslongValue(String uuidMslongValue) throws JNCException {
        setUuidMslongValue(new YangUInt64(uuidMslongValue));
    }

    /**
     * Unsets the value for child leaf "uuid-mslong".
     */
    public void unsetUuidMslongValue() throws JNCException {
        delete("uuid-mslong");
    }

    /**
     * This method is used for creating a subtree filter.
     * The added "uuid-mslong" leaf will not have a value.
     */
    public void addUuidMslong() throws JNCException {
        setLeafValue(Common.NAMESPACE,
            "uuid-mslong",
            null,
            childrenNames());
    }

    /**
     * Marks the leaf "uuid-mslong" with operation "replace".
     */
    public void markUuidMslongReplace() throws JNCException {
        markLeafReplace("uuidMslong");
    }

    /**
     * Marks the leaf "uuid-mslong" with operation "merge".
     */
    public void markUuidMslongMerge() throws JNCException {
        markLeafMerge("uuidMslong");
    }

    /**
     * Marks the leaf "uuid-mslong" with operation "create".
     */
    public void markUuidMslongCreate() throws JNCException {
        markLeafCreate("uuidMslong");
    }

    /**
     * Marks the leaf "uuid-mslong" with operation "delete".
     */
    public void markUuidMslongDelete() throws JNCException {
        markLeafDelete("uuidMslong");
    }

    /* Access methods for optional leaf child: "uuid-lslong". */

    /**
     * Gets the value for child leaf "uuid-lslong".
     * @return The value of the leaf.
     */
    public YangUInt64 getUuidLslongValue() throws JNCException {
        return (YangUInt64)getValue("uuid-lslong");
    }

    /**
     * Sets the value for child leaf "uuid-lslong",
     * using instance of generated typedef class.
     * @param uuidLslongValue The value to set.
     * @param uuidLslongValue used during instantiation.
     */
    public void setUuidLslongValue(YangUInt64 uuidLslongValue)
            throws JNCException {
        setLeafValue(Common.NAMESPACE,
            "uuid-lslong",
            uuidLslongValue,
            childrenNames());
    }

    /**
     * Sets the value for child leaf "uuid-lslong",
     * using Java primitive values.
     * @param uuidLslongValue used during instantiation.
     */
    public void setUuidLslongValue(BigInteger uuidLslongValue)
            throws JNCException {
        setUuidLslongValue(new YangUInt64(uuidLslongValue));
    }

    /**
     * Sets the value for child leaf "uuid-lslong",
     * using a String value.
     * @param uuidLslongValue used during instantiation.
     */
    public void setUuidLslongValue(String uuidLslongValue) throws JNCException {
        setUuidLslongValue(new YangUInt64(uuidLslongValue));
    }

    /**
     * Unsets the value for child leaf "uuid-lslong".
     */
    public void unsetUuidLslongValue() throws JNCException {
        delete("uuid-lslong");
    }

    /**
     * This method is used for creating a subtree filter.
     * The added "uuid-lslong" leaf will not have a value.
     */
    public void addUuidLslong() throws JNCException {
        setLeafValue(Common.NAMESPACE,
            "uuid-lslong",
            null,
            childrenNames());
    }

    /**
     * Marks the leaf "uuid-lslong" with operation "replace".
     */
    public void markUuidLslongReplace() throws JNCException {
        markLeafReplace("uuidLslong");
    }

    /**
     * Marks the leaf "uuid-lslong" with operation "merge".
     */
    public void markUuidLslongMerge() throws JNCException {
        markLeafMerge("uuidLslong");
    }

    /**
     * Marks the leaf "uuid-lslong" with operation "create".
     */
    public void markUuidLslongCreate() throws JNCException {
        markLeafCreate("uuidLslong");
    }

    /**
     * Marks the leaf "uuid-lslong" with operation "delete".
     */
    public void markUuidLslongDelete() throws JNCException {
        markLeafDelete("uuidLslong");
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
