/* 
 * @(#)Domains.java        1.0 26/12/14
 *
 * This file has been auto-generated by JNC, the
 * Java output format plug-in of pyang.
 * Origin: module "usermgt", revision: "2014-09-16".
 */

package net.juniper.jspace.ems.yang.usermgt.users.user;

import com.tailf.jnc.Element;
import com.tailf.jnc.ElementChildrenIterator;
import com.tailf.jnc.JNCException;
import com.tailf.jnc.Tagpath;
import com.tailf.jnc.YangElement;
import com.tailf.jnc.YangUInt32;

import net.juniper.jspace.ems.yang.usermgt.Usermgt;
import net.juniper.jspace.ems.yang.usermgt.users.user.domains.Domain;

/**
 * This class represents an element from 
 * the namespace http://juniper.net/ns/space/usermgt/1.0
 * generated to "src/net/juniper/jspace/ems/yang/usermgt/users/user/domains"
 * <p>
 * See line 32 in
 * /home/maxin/workspace/js-easy-rest/easy-rest-core/yang/usermgt.yang
 *
 * @version 1.0 2014-12-26
 * @author Auto Generated
 */
public class Domains extends YangElement {

    private static final long serialVersionUID = 1L;

    public static final Tagpath tagpath = new Tagpath("usermgt/users/user/domains");

    static {
        Usermgt.enable();
    }

    /**
     * Constructor for an empty Domains object.
     */
    public Domains() {
        super(Usermgt.NAMESPACE, "domains");
    }

    /**
     * Clones this object, returning an exact copy.
     * @return A clone of the object.
     */
    public Domains clone() {
        return (Domains)cloneContent(new Domains());
    }

    /**
     * Clones this object, returning a shallow copy.
     * @return A clone of the object. Children are not included.
     */
    public Domains cloneShallow() {
        return (Domains)cloneShallowContent(new Domains());
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
            "domain",
        };
    }

    /* Access methods for list child: "domain". */

    /**
     * Gets list entry "domain", with specified keys.
     * @param idValue Key argument of child.
     */
    public Domain getDomain(YangUInt32 idValue) throws JNCException {
        String path = "domain[id='" + idValue + "']";
        return (Domain)searchOne(path);
    }

    /**
     * Gets list entry "domain", with specified keys.
     * The keys are specified as strings.
     * @param idValue Key argument of child.
     */
    public Domain getDomain(String idValue) throws JNCException {
        String path = "domain[id='" + idValue + "']";
        return (Domain)searchOne(path);
    }

    /**
     * Iterator method for the list "domain".
     * @return An iterator for the list.
     */
    public ElementChildrenIterator domainIterator() {
        return new ElementChildrenIterator(children, "domain");
    }

    /**
     * Adds list entry "domain", using an existing object.
     * @param domain The object to add.
     * @return The added child.
     */
    public Domain addDomain(Domain domain) throws JNCException {
        insertChild(domain, childrenNames());
        return domain;
    }

    /**
     * Adds list entry "domain", with specified keys.
     * @param idValue Key argument of child.
     * @return The added child.
     */
    public Domain addDomain(YangUInt32 idValue) throws JNCException {
        Domain domain = new Domain(idValue);
        return addDomain(domain);
    }

    /**
     * Adds list entry "domain", with specified keys.
     * The keys are specified as strings.
     * @param idValue Key argument of child.
     * @return The added child.
     */
    public Domain addDomain(String idValue) throws JNCException {
        Domain domain = new Domain(idValue);
        return addDomain(domain);
    }

    /**
     * Adds list entry "domain".
     * This method is used for creating subtree filters.
     * @return The added child.
     */
    public Domain addDomain() throws JNCException {
        Domain domain = new Domain();
        insertChild(domain, childrenNames());
        return domain;
    }

    /**
     * Deletes list entry "domain", with specified keys.
     * @param idValue Key argument of child.
     */
    public void deleteDomain(YangUInt32 idValue) throws JNCException {
        String path = "domain[id='" + idValue + "']";
        delete(path);
    }

    /**
     * Deletes list entry "domain", with specified keys.
     * The keys are specified as strings.
     * @param idValue Key argument of child.
     */
    public void deleteDomain(String idValue) throws JNCException {
        String path = "domain[id='" + idValue + "']";
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
