/* 
 * @(#)ConfigInfo.java        1.0 19/01/15
 *
 * This file has been auto-generated by JNC, the
 * Java output format plug-in of pyang.
 * Origin: module "device-management", revision: "2014-07-26".
 */

package net.juniper.yang.mo.deviceManagement.device;

import com.tailf.jnc.Element;
import com.tailf.jnc.JNCException;
import com.tailf.jnc.Tagpath;
import com.tailf.jnc.YangElement;
import com.tailf.jnc.YangString;

import net.juniper.yang.mo.deviceManagement.CandidateConfigStateEnum;
import net.juniper.yang.mo.deviceManagement.DeviceConfigStatusEnum;
import net.juniper.yang.mo.deviceManagement.Devicemgt;

/**
 * This class represents an element from 
 * the namespace http://juniper.net/ns/space/device-management/1.0
 * generated to "/home/maxin/space/js-ems/server/target/scala-2.11/src_managed/main/net/juniper/yang/mo/deviceManagement/device/configInfo"
 * <p>
 * See line 361 in
 * /home/maxin/space/js-ems/server/src/main/resources/yang/device-management.yang
 *
 * @version 1.0 2015-01-19
 * @author Auto Generated
 */
public class ConfigInfo extends YangElement {

    private static final long serialVersionUID = 1L;

    public static final Tagpath TAG_PATH = new Tagpath("device/configInfo");

    static {
        Devicemgt.enable();
    }

    /**
     * Constructor for an empty ConfigInfo object.
     */
    public ConfigInfo() {
        super(Devicemgt.NAMESPACE, "configInfo");
    }

    /**
     * Clones this object, returning an exact copy.
     * @return A clone of the object.
     */
    public ConfigInfo clone() {
        return (ConfigInfo)cloneContent(new ConfigInfo());
    }

    /**
     * Clones this object, returning a shallow copy.
     * @return A clone of the object. Children are not included.
     */
    public ConfigInfo cloneShallow() {
        return (ConfigInfo)cloneShallowContent(new ConfigInfo());
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
            "schemaVersion",
            "configStatus",
            "candidateConfigState",
        };
    }

    /* Access methods for optional leaf child: "schemaVersion". */

    /**
     * Gets the value for child leaf "schemaVersion".
     * @return The value of the leaf.
     */
    public YangString getSchemaVersionValue() throws JNCException {
        return (YangString)getValue("schemaVersion");
    }

    /**
     * Sets the value for child leaf "schemaVersion",
     * using instance of generated typedef class.
     * @param schemaVersionValue The value to set.
     * @param schemaVersionValue used during instantiation.
     */
    public void setSchemaVersionValue(YangString schemaVersionValue)
            throws JNCException {
        setLeafValue(Devicemgt.NAMESPACE,
            "schemaVersion",
            schemaVersionValue,
            childrenNames());
    }

    /**
     * Sets the value for child leaf "schemaVersion",
     * using a String value.
     * @param schemaVersionValue used during instantiation.
     */
    public void setSchemaVersionValue(String schemaVersionValue)
            throws JNCException {
        setSchemaVersionValue(new YangString(schemaVersionValue));
    }

    /**
     * Unsets the value for child leaf "schemaVersion".
     */
    public void unsetSchemaVersionValue() throws JNCException {
        delete("schemaVersion");
    }

    /**
     * This method is used for creating a subtree filter.
     * The added "schemaVersion" leaf will not have a value.
     */
    public void addSchemaVersion() throws JNCException {
        setLeafValue(Devicemgt.NAMESPACE,
            "schemaVersion",
            null,
            childrenNames());
    }

    /**
     * Marks the leaf "schemaVersion" with operation "replace".
     */
    public void markSchemaVersionReplace() throws JNCException {
        markLeafReplace("schemaVersion");
    }

    /**
     * Marks the leaf "schemaVersion" with operation "merge".
     */
    public void markSchemaVersionMerge() throws JNCException {
        markLeafMerge("schemaVersion");
    }

    /**
     * Marks the leaf "schemaVersion" with operation "create".
     */
    public void markSchemaVersionCreate() throws JNCException {
        markLeafCreate("schemaVersion");
    }

    /**
     * Marks the leaf "schemaVersion" with operation "delete".
     */
    public void markSchemaVersionDelete() throws JNCException {
        markLeafDelete("schemaVersion");
    }

    /* Access methods for optional leaf child: "configStatus". */

    /**
     * Gets the value for child leaf "configStatus".
     * @return The value of the leaf.
     */
    public DeviceConfigStatusEnum getConfigStatusValue() throws JNCException {
        return (DeviceConfigStatusEnum)getValue("configStatus");
    }

    /**
     * Sets the value for child leaf "configStatus",
     * using a JNC type value.
     * @param configStatusValue The value to set.
     * @param configStatusValue used during instantiation.
     */
    public void setConfigStatusValue(DeviceConfigStatusEnum configStatusValue)
            throws JNCException {
        setLeafValue(Devicemgt.NAMESPACE,
            "configStatus",
            configStatusValue,
            childrenNames());
    }

    /**
     * Sets the value for child leaf "configStatus",
     * using a String value.
     * @param configStatusValue used during instantiation.
     */
    public void setConfigStatusValue(String configStatusValue)
            throws JNCException {
        setConfigStatusValue(new DeviceConfigStatusEnum(configStatusValue));
    }

    /**
     * Unsets the value for child leaf "configStatus".
     */
    public void unsetConfigStatusValue() throws JNCException {
        delete("configStatus");
    }

    /**
     * This method is used for creating a subtree filter.
     * The added "configStatus" leaf will not have a value.
     */
    public void addConfigStatus() throws JNCException {
        setLeafValue(Devicemgt.NAMESPACE,
            "configStatus",
            null,
            childrenNames());
    }

    /**
     * Marks the leaf "configStatus" with operation "replace".
     */
    public void markConfigStatusReplace() throws JNCException {
        markLeafReplace("configStatus");
    }

    /**
     * Marks the leaf "configStatus" with operation "merge".
     */
    public void markConfigStatusMerge() throws JNCException {
        markLeafMerge("configStatus");
    }

    /**
     * Marks the leaf "configStatus" with operation "create".
     */
    public void markConfigStatusCreate() throws JNCException {
        markLeafCreate("configStatus");
    }

    /**
     * Marks the leaf "configStatus" with operation "delete".
     */
    public void markConfigStatusDelete() throws JNCException {
        markLeafDelete("configStatus");
    }

    /* Access methods for optional leaf child: "candidateConfigState". */

    /**
     * Gets the value for child leaf "candidateConfigState".
     * @return The value of the leaf.
     */
    public CandidateConfigStateEnum getCandidateConfigStateValue()
            throws JNCException {
        return (CandidateConfigStateEnum)getValue("candidateConfigState");
    }

    /**
     * Sets the value for child leaf "candidateConfigState",
     * using a JNC type value.
     * @param candidateConfigStateValue The value to set.
     * @param candidateConfigStateValue used during instantiation.
     */
    public void setCandidateConfigStateValue(CandidateConfigStateEnum candidateConfigStateValue)
            throws JNCException {
        setLeafValue(Devicemgt.NAMESPACE,
            "candidateConfigState",
            candidateConfigStateValue,
            childrenNames());
    }

    /**
     * Sets the value for child leaf "candidateConfigState",
     * using a String value.
     * @param candidateConfigStateValue used during instantiation.
     */
    public void setCandidateConfigStateValue(String candidateConfigStateValue)
            throws JNCException {
        setCandidateConfigStateValue(new CandidateConfigStateEnum(candidateConfigStateValue));
    }

    /**
     * Unsets the value for child leaf "candidateConfigState".
     */
    public void unsetCandidateConfigStateValue() throws JNCException {
        delete("candidateConfigState");
    }

    /**
     * This method is used for creating a subtree filter.
     * The added "candidateConfigState" leaf will not have a value.
     */
    public void addCandidateConfigState() throws JNCException {
        setLeafValue(Devicemgt.NAMESPACE,
            "candidateConfigState",
            null,
            childrenNames());
    }

    /**
     * Marks the leaf "candidateConfigState" with operation "replace".
     */
    public void markCandidateConfigStateReplace() throws JNCException {
        markLeafReplace("candidateConfigState");
    }

    /**
     * Marks the leaf "candidateConfigState" with operation "merge".
     */
    public void markCandidateConfigStateMerge() throws JNCException {
        markLeafMerge("candidateConfigState");
    }

    /**
     * Marks the leaf "candidateConfigState" with operation "create".
     */
    public void markCandidateConfigStateCreate() throws JNCException {
        markLeafCreate("candidateConfigState");
    }

    /**
     * Marks the leaf "candidateConfigState" with operation "delete".
     */
    public void markCandidateConfigStateDelete() throws JNCException {
        markLeafDelete("candidateConfigState");
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
