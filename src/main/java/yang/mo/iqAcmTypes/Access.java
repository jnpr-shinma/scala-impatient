/* 
 * @(#)Access.java        1.0 19/01/15
 *
 * This file has been auto-generated by JNC, the
 * Java output format plug-in of pyang.
 * Origin: module "iq-acm-types", revision: "2014-12-05".
 */

package yang.mo.iqAcmTypes;

import com.tailf.jnc.YangException;
import com.tailf.jnc.YangUInt8;

/**
 * This class represents an element from 
 * the namespace 
 * generated to "/home/maxin/space/js-ems/server/target/scala-2.11/src_managed/main/net/juniper/yang/mo/iqAcmTypes/Access"
 * <p>
 * See line 19 in
 * /home/maxin/.yang/iq-acm-types.yang
 *
 * @version 1.0 2015-01-19
 * @author Auto Generated
 */
public class Access extends YangUInt8 {

    private static final long serialVersionUID = 1L;

    /**
     * Constructor for Access object from a string.
     * @param value Value to construct the Access from.
     */
    public Access(String value) throws YangException {
        super(value);
        check();
    }

    /**
     * Constructor for Access object from a short.
     * @param value Value to construct the Access from.
     */
    public Access(short value) throws YangException {
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
     * Sets the value using a value of type short.
     * @param value The value to set.
     */
    public void setValue(short value) throws YangException {
        super.setValue(value);
        check();
    }

    /**
     * Checks all restrictions (if any).
     */
    public void check() throws YangException {
    }

}