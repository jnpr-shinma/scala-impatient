/* 
 * @(#)Preference.java        1.0 26/12/14
 *
 * This file has been auto-generated by JNC, the
 * Java output format plug-in of pyang.
 * Origin: module "usermgt", revision: "2014-09-16".
 */

package net.juniper.jspace.ems.yang.usermgt.users.user.preferences;

import com.tailf.jnc.Element;
import com.tailf.jnc.JNCException;
import com.tailf.jnc.Leaf;
import com.tailf.jnc.Tagpath;
import com.tailf.jnc.YangElement;
import com.tailf.jnc.YangString;
import com.tailf.jnc.YangUInt32;

import net.juniper.jspace.ems.yang.usermgt.Usermgt;

/**
 * This class represents an element from 
 * the namespace http://juniper.net/ns/space/usermgt/1.0
 * generated to "src/net/juniper/jspace/ems/yang/usermgt/users/user/preferences/preference"
 * <p>
 * See line 25 in
 * /home/maxin/workspace/js-easy-rest/easy-rest-core/yang/usermgt.yang
 *
 * @version 1.0 2014-12-26
 * @author Auto Generated
 */
public class Preference extends YangElement {

    private static final long serialVersionUID = 1L;

    public static final Tagpath tagpath = new Tagpath("usermgt/users/user/preferences/preference");

    static {
        Usermgt.enable();
    }

    /**
     * Constructor for an empty Preference object.
     */
    public Preference() {
        super(Usermgt.NAMESPACE, "preference");
    }

    /**
     * Constructor for an initialized Preference object,
     * 
     * @param idValue Key argument of child.
     */
    public Preference(YangUInt32 idValue) throws JNCException {
        super(Usermgt.NAMESPACE, "preference");
        Leaf id = new Leaf(Usermgt.NAMESPACE, "id");
        id.setValue(idValue);
        insertChild(id, childrenNames());
    }

    /**
     * Constructor for an initialized Preference object,
     * with String keys.
     * @param idValue Key argument of child.
     */
    public Preference(String idValue) throws JNCException {
        super(Usermgt.NAMESPACE, "preference");
        Leaf id = new Leaf(Usermgt.NAMESPACE, "id");
        id.setValue(new YangUInt32(idValue));
        insertChild(id, childrenNames());
    }

    /**
     * Constructor for an initialized Preference object,
     * with keys of built in Java types.
     * @param idValue Key argument of child.
     */
    public Preference(long idValue) throws JNCException {
        super(Usermgt.NAMESPACE, "preference");
        Leaf id = new Leaf(Usermgt.NAMESPACE, "id");
        id.setValue(new YangUInt32(idValue));
        insertChild(id, childrenNames());
    }

    /**
     * Clones this object, returning an exact copy.
     * @return A clone of the object.
     */
    public Preference clone() {
        Preference copy;
        try {
            copy = new Preference(getIdValue().toString());
        } catch (JNCException e) {
            copy = null;
        }
        return (Preference)cloneContent(copy);
    }

    /**
     * Clones this object, returning a shallow copy.
     * @return A clone of the object. Children are not included.
     */
    public Preference cloneShallow() {
        Preference copy;
        try {
            copy = new Preference(getIdValue().toString());
        } catch (JNCException e) {
            copy = null;
        }
        return (Preference)cloneShallowContent(copy);
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
            "settings",
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
        setLeafValue(Usermgt.NAMESPACE,
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
        setLeafValue(Usermgt.NAMESPACE,
            "id",
            null,
            childrenNames());
    }

    /* Access methods for optional leaf child: "settings". */

    /**
     * Gets the value for child leaf "settings".
     * @return The value of the leaf.
     */
    public YangString getSettingsValue() throws JNCException {
        return (YangString)getValue("settings");
    }

    /**
     * Sets the value for child leaf "settings",
     * using instance of generated typedef class.
     * @param settingsValue The value to set.
     * @param settingsValue used during instantiation.
     */
    public void setSettingsValue(YangString settingsValue) throws JNCException {
        setLeafValue(Usermgt.NAMESPACE,
            "settings",
            settingsValue,
            childrenNames());
    }

    /**
     * Sets the value for child leaf "settings",
     * using a String value.
     * @param settingsValue used during instantiation.
     */
    public void setSettingsValue(String settingsValue) throws JNCException {
        setSettingsValue(new YangString(settingsValue));
    }

    /**
     * Unsets the value for child leaf "settings".
     */
    public void unsetSettingsValue() throws JNCException {
        delete("settings");
    }

    /**
     * This method is used for creating a subtree filter.
     * The added "settings" leaf will not have a value.
     */
    public void addSettings() throws JNCException {
        setLeafValue(Usermgt.NAMESPACE,
            "settings",
            null,
            childrenNames());
    }

    /**
     * Marks the leaf "settings" with operation "replace".
     */
    public void markSettingsReplace() throws JNCException {
        markLeafReplace("settings");
    }

    /**
     * Marks the leaf "settings" with operation "merge".
     */
    public void markSettingsMerge() throws JNCException {
        markLeafMerge("settings");
    }

    /**
     * Marks the leaf "settings" with operation "create".
     */
    public void markSettingsCreate() throws JNCException {
        markLeafCreate("settings");
    }

    /**
     * Marks the leaf "settings" with operation "delete".
     */
    public void markSettingsDelete() throws JNCException {
        markLeafDelete("settings");
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
