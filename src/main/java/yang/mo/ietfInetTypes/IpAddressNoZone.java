/* 
 * @(#)IpAddressNoZone.java        1.0 19/01/15
 *
 * This file has been auto-generated by JNC, the
 * Java output format plug-in of pyang.
 * Origin: module "ietf-inet-types", revision: "2013-07-15".
 */

package yang.mo.ietfInetTypes;

import com.tailf.jnc.YangException;
import com.tailf.jnc.YangUnion;

/**
 * This class represents an element from 
 * the namespace 
 * generated to "/home/maxin/space/js-ems/server/target/scala-2.11/src_managed/main/net/juniper/yang/mo/ietfInetTypes/ip-address-no-zone"
 * <p>
 * See line 248 in
 * /home/maxin/3rdParty/pyang-1.5/modules/ietf-inet-types.yang
 *
 * @version 1.0 2015-01-19
 * @author Auto Generated
 */
public class IpAddressNoZone extends YangUnion {

    private static final long serialVersionUID = 1L;

    /**
     * Constructor for IpAddressNoZone object from a string.
     * @param value Value to construct the IpAddressNoZone from.
     */
    public IpAddressNoZone(String value) throws YangException {
        super(value,
            new String[] {
                "net.juniper.yang.mo.ietfInetTypes.Ipv4AddressNoZone",
                "net.juniper.yang.mo.ietfInetTypes.Ipv6AddressNoZone",
            }
        );
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
