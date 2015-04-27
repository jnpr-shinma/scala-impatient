/* 
 * @(#)Task.java        1.0 26/12/14
 *
 * This file has been auto-generated by JNC, the
 * Java output format plug-in of pyang.
 * Origin: module "paradigmmgt", revision: "2014-09-16".
 */

package net.juniper.jspace.ems.yang.paradigmmgt.paradigmmgt.modules.module.workspaces.workspace.tasks;

import com.tailf.jnc.Element;
import com.tailf.jnc.JNCException;
import com.tailf.jnc.Leaf;
import com.tailf.jnc.Tagpath;
import com.tailf.jnc.YangElement;
import com.tailf.jnc.YangString;
import com.tailf.jnc.YangUInt32;

import net.juniper.jspace.ems.yang.paradigmmgt.Paramgt;

/**
 * This class represents an element from 
 * the namespace http://juniper.net/ns/space/paradigm/1.0
 * generated to "src/net/juniper/jspace/ems/yang/paradigmmgt/paradigmmgt/modules/module/workspaces/workspace/tasks/task"
 * <p>
 * See line 35 in
 * /home/maxin/workspace/js-easy-rest/easy-rest-core/yang/paradigmmgt.yang
 *
 * @version 1.0 2014-12-26
 * @author Auto Generated
 */
public class Task extends YangElement {

    private static final long serialVersionUID = 1L;

    public static final Tagpath tagpath = new Tagpath("paradigmmgt/paradigmmgt/modules/module/workspaces/workspace/tasks/task");

    static {
        Paramgt.enable();
    }

    /**
     * Constructor for an empty Task object.
     */
    public Task() {
        super(Paramgt.NAMESPACE, "task");
    }

    /**
     * Constructor for an initialized Task object,
     * 
     * @param idValue Key argument of child.
     */
    public Task(YangUInt32 idValue) throws JNCException {
        super(Paramgt.NAMESPACE, "task");
        Leaf id = new Leaf(Paramgt.NAMESPACE, "id");
        id.setValue(idValue);
        insertChild(id, childrenNames());
    }

    /**
     * Constructor for an initialized Task object,
     * with String keys.
     * @param idValue Key argument of child.
     */
    public Task(String idValue) throws JNCException {
        super(Paramgt.NAMESPACE, "task");
        Leaf id = new Leaf(Paramgt.NAMESPACE, "id");
        id.setValue(new YangUInt32(idValue));
        insertChild(id, childrenNames());
    }

    /**
     * Constructor for an initialized Task object,
     * with keys of built in Java types.
     * @param idValue Key argument of child.
     */
    public Task(long idValue) throws JNCException {
        super(Paramgt.NAMESPACE, "task");
        Leaf id = new Leaf(Paramgt.NAMESPACE, "id");
        id.setValue(new YangUInt32(idValue));
        insertChild(id, childrenNames());
    }

    /**
     * Clones this object, returning an exact copy.
     * @return A clone of the object.
     */
    public Task clone() {
        Task copy;
        try {
            copy = new Task(getIdValue().toString());
        } catch (JNCException e) {
            copy = null;
        }
        return (Task)cloneContent(copy);
    }

    /**
     * Clones this object, returning a shallow copy.
     * @return A clone of the object. Children are not included.
     */
    public Task cloneShallow() {
        Task copy;
        try {
            copy = new Task(getIdValue().toString());
        } catch (JNCException e) {
            copy = null;
        }
        return (Task)cloneShallowContent(copy);
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
            "title",
            "name",
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
        setLeafValue(Paramgt.NAMESPACE,
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
        setLeafValue(Paramgt.NAMESPACE,
            "id",
            null,
            childrenNames());
    }

    /* Access methods for optional leaf child: "title". */

    /**
     * Gets the value for child leaf "title".
     * @return The value of the leaf.
     */
    public YangString getTitleValue() throws JNCException {
        return (YangString)getValue("title");
    }

    /**
     * Sets the value for child leaf "title",
     * using instance of generated typedef class.
     * @param titleValue The value to set.
     * @param titleValue used during instantiation.
     */
    public void setTitleValue(YangString titleValue) throws JNCException {
        setLeafValue(Paramgt.NAMESPACE,
            "title",
            titleValue,
            childrenNames());
    }

    /**
     * Sets the value for child leaf "title",
     * using a String value.
     * @param titleValue used during instantiation.
     */
    public void setTitleValue(String titleValue) throws JNCException {
        setTitleValue(new YangString(titleValue));
    }

    /**
     * Unsets the value for child leaf "title".
     */
    public void unsetTitleValue() throws JNCException {
        delete("title");
    }

    /**
     * This method is used for creating a subtree filter.
     * The added "title" leaf will not have a value.
     */
    public void addTitle() throws JNCException {
        setLeafValue(Paramgt.NAMESPACE,
            "title",
            null,
            childrenNames());
    }

    /**
     * Marks the leaf "title" with operation "replace".
     */
    public void markTitleReplace() throws JNCException {
        markLeafReplace("title");
    }

    /**
     * Marks the leaf "title" with operation "merge".
     */
    public void markTitleMerge() throws JNCException {
        markLeafMerge("title");
    }

    /**
     * Marks the leaf "title" with operation "create".
     */
    public void markTitleCreate() throws JNCException {
        markLeafCreate("title");
    }

    /**
     * Marks the leaf "title" with operation "delete".
     */
    public void markTitleDelete() throws JNCException {
        markLeafDelete("title");
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
        setLeafValue(Paramgt.NAMESPACE,
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
        setLeafValue(Paramgt.NAMESPACE,
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