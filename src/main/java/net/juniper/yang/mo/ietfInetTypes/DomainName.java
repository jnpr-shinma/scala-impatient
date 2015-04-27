/* 
 * @(#)DomainName.java        1.0 12/01/15
 *
 * This file has been auto-generated by JNC, the
 * Java output format plug-in of pyang.
 * Origin: module "ietf-inet-types", revision: "2013-07-15".
 */

package net.juniper.yang.mo.ietfInetTypes;

import com.tailf.jnc.YangException;
import com.tailf.jnc.YangString;

/**
 * This class represents an element from 
 * the namespace 
 * generated to "/home/maxin/myworkspace/js-easy-rest/easy-rest-orm/target/scala-2.11/src_managed/main/net/juniper/yang/mo/ietfInetTypes/domain-name"
 * <p>
 * See line 354 in
 * /home/maxin/3rdParty/pyang-1.5/modules/ietf-inet-types.yang
 *
 * @version 1.0 2015-01-12
 * @author Auto Generated
 */
public class DomainName extends YangString {

    private static final long serialVersionUID = 1L;

    /**
     * Constructor for DomainName object from a string.
     * @param value Value to construct the DomainName from.
     */
    public DomainName(String value) throws YangException {
        super(value);
        check();
    }

    /**
     * Sets the value using a string value.
     * @param value The value to set.
     */
    public void setValue(String value) throws YangException {
        super.setValue(value);
        check();
    }

    /**
     * Checks all restrictions (if any).
     */
    public void check() throws YangException {
    }

}
