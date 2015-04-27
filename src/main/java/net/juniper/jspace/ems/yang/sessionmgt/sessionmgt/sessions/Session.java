/* 
 * @(#)Session.java        1.0 24/12/14
 *
 * This file has been auto-generated by JNC, the
 * Java output format plug-in of pyang.
 * Origin: module "sessionmgt", revision: "2014-09-16".
 */

package net.juniper.jspace.ems.yang.sessionmgt.sessionmgt.sessions;

import com.tailf.jnc.Element;
import com.tailf.jnc.JNCException;
import com.tailf.jnc.Leaf;
import com.tailf.jnc.NodeSet;
import com.tailf.jnc.YangElement;
import com.tailf.jnc.YangString;

import net.juniper.jspace.ems.yang.sessionmgt.Sesmgt;
import net.juniper.jspace.ems.yang.sessionmgt.sessionmgt.sessions.session.UserPrincipal;

/**
 * This class represents an element from 
 * the namespace http://juniper.net/ns/space/sesmgt/1.0
 * generated to "src/net/juniper/jspace/ems/yang/sessionmgt/sessionmgt/sessions/session"
 * <p>
 * See line 19 in
 * /home/maxin/workspace/js-easy-rest/easy-rest-core/yang/sessionmgt.yang
 *
 * @version 1.0 2014-12-24
 * @author Auto Generated
 */
public class Session extends YangElement {

    private static final long serialVersionUID = 1L;

    /**
     * Field for child container "userPrincipal".
     */
    public UserPrincipal userPrincipal = null;

    /**
     * Constructor for an empty Session object.
     */
    public Session() {
        super(Sesmgt.NAMESPACE, "session");
    }

    /**
     * Constructor for an initialized Session object,
     * 
     * @param ssoIdValue Key argument of child.
     */
    public Session(YangString ssoIdValue) throws JNCException {
        super(Sesmgt.NAMESPACE, "session");
        Leaf ssoId = new Leaf(Sesmgt.NAMESPACE, "ssoId");
        ssoId.setValue(ssoIdValue);
        insertChild(ssoId, childrenNames());
    }

    /**
     * Constructor for an initialized Session object,
     * with String keys.
     * @param ssoIdValue Key argument of child.
     */
    public Session(String ssoIdValue) throws JNCException {
        super(Sesmgt.NAMESPACE, "session");
        Leaf ssoId = new Leaf(Sesmgt.NAMESPACE, "ssoId");
        ssoId.setValue(new YangString(ssoIdValue));
        insertChild(ssoId, childrenNames());
    }

    /**
     * Clones this object, returning an exact copy.
     * @return A clone of the object.
     */
    public Session clone() {
        Session copy;
        try {
            copy = new Session(getSsoIdValue().toString());
        } catch (JNCException e) {
            copy = null;
        }
        return (Session)cloneContent(copy);
    }

    /**
     * Clones this object, returning a shallow copy.
     * @return A clone of the object. Children are not included.
     */
    public Session cloneShallow() {
        Session copy;
        try {
            copy = new Session(getSsoIdValue().toString());
        } catch (JNCException e) {
            copy = null;
        }
        return (Session)cloneShallowContent(copy);
    }

    /**
     * @return An array with the identifiers of any key children
     */
    public String[] keyNames() {
        return new String[] {
            "ssoId",
        };
    }

    /**
     * @return An array with the identifiers of any children, in order.
     */
    public String[] childrenNames() {
        return new String[] {
            "ssoId",
            "sesId",
            "userPrincipal",
        };
    }

    /* Access methods for leaf child: "ssoId". */

    /**
     * Gets the value for child leaf "ssoId".
     * @return The value of the leaf.
     */
    public YangString getSsoIdValue() throws JNCException {
        return (YangString)getValue("ssoId");
    }

    /**
     * Sets the value for child leaf "ssoId",
     * using instance of generated typedef class.
     * @param ssoIdValue The value to set.
     * @param ssoIdValue used during instantiation.
     */
    public void setSsoIdValue(YangString ssoIdValue) throws JNCException {
        setLeafValue(Sesmgt.NAMESPACE,
            "ssoId",
            ssoIdValue,
            childrenNames());
    }

    /**
     * Sets the value for child leaf "ssoId",
     * using a String value.
     * @param ssoIdValue used during instantiation.
     */
    public void setSsoIdValue(String ssoIdValue) throws JNCException {
        setSsoIdValue(new YangString(ssoIdValue));
    }

    /**
     * This method is used for creating a subtree filter.
     * The added "ssoId" leaf will not have a value.
     */
    public void addSsoId() throws JNCException {
        setLeafValue(Sesmgt.NAMESPACE,
            "ssoId",
            null,
            childrenNames());
    }

    /* Access methods for optional leaf child: "sesId". */

    /**
     * Gets the value for child leaf "sesId".
     * @return The value of the leaf.
     */
    public YangString getSesIdValue() throws JNCException {
        return (YangString)getValue("sesId");
    }

    /**
     * Sets the value for child leaf "sesId",
     * using instance of generated typedef class.
     * @param sesIdValue The value to set.
     * @param sesIdValue used during instantiation.
     */
    public void setSesIdValue(YangString sesIdValue) throws JNCException {
        setLeafValue(Sesmgt.NAMESPACE,
            "sesId",
            sesIdValue,
            childrenNames());
    }

    /**
     * Sets the value for child leaf "sesId",
     * using a String value.
     * @param sesIdValue used during instantiation.
     */
    public void setSesIdValue(String sesIdValue) throws JNCException {
        setSesIdValue(new YangString(sesIdValue));
    }

    /**
     * Unsets the value for child leaf "sesId".
     */
    public void unsetSesIdValue() throws JNCException {
        delete("sesId");
    }

    /**
     * This method is used for creating a subtree filter.
     * The added "sesId" leaf will not have a value.
     */
    public void addSesId() throws JNCException {
        setLeafValue(Sesmgt.NAMESPACE,
            "sesId",
            null,
            childrenNames());
    }

    /**
     * Marks the leaf "sesId" with operation "replace".
     */
    public void markSesIdReplace() throws JNCException {
        markLeafReplace("sesId");
    }

    /**
     * Marks the leaf "sesId" with operation "merge".
     */
    public void markSesIdMerge() throws JNCException {
        markLeafMerge("sesId");
    }

    /**
     * Marks the leaf "sesId" with operation "create".
     */
    public void markSesIdCreate() throws JNCException {
        markLeafCreate("sesId");
    }

    /**
     * Marks the leaf "sesId" with operation "delete".
     */
    public void markSesIdDelete() throws JNCException {
        markLeafDelete("sesId");
    }

    /* Access methods for container child: "userPrincipal". */

    /**
     * Adds container entry "userPrincipal", using an existing object.
     * @param userPrincipal The object to add.
     * @return The added child.
     */
    public UserPrincipal addUserPrincipal(UserPrincipal userPrincipal)
            throws JNCException {
        this.userPrincipal = userPrincipal;
        insertChild(userPrincipal, childrenNames());
        return userPrincipal;
    }

    /**
     * Adds container entry "userPrincipal".
     * This method is used for creating subtree filters.
     * @return The added child.
     */
    public UserPrincipal addUserPrincipal() throws JNCException {
        UserPrincipal userPrincipal = new UserPrincipal();
        this.userPrincipal = userPrincipal;
        insertChild(userPrincipal, childrenNames());
        return userPrincipal;
    }

    /**
     * Deletes container entry "userPrincipal".
     * @return An array of the deleted element nodes.
     */
    public NodeSet deleteUserPrincipal() throws JNCException {
        this.userPrincipal = null;
        String path = "userPrincipal";
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
        if (child instanceof UserPrincipal) userPrincipal = (UserPrincipal)child;
    }

}
