/* 
 * @(#)Devicemgt.java        1.0 30/12/14
 *
 * This file has been auto-generated by JNC, the
 * Java output format plug-in of pyang.
 * Origin: module "devmgt", revision: "2014-09-16".
 */

package net.juniper.jspace.ems.yang.devmgt;

import com.tailf.jnc.Element;
import com.tailf.jnc.JNCException;
import com.tailf.jnc.NodeSet;
import com.tailf.jnc.Tagpath;
import com.tailf.jnc.YangElement;

import net.juniper.jspace.ems.yang.devmgt.Devmgt;
import net.juniper.jspace.ems.yang.devmgt.devicemgt.Devices;

/**
 * This class represents an element from 
 * the namespace http://juniper.net/ns/space/test/1.0
 * generated to "src/net/juniper/jspace/ems/yang/devmgt/devicemgt"
 * <p>
 * See line 15 in
 * /home/maxin/workspace/js-easy-rest/easy-rest-core/yang/devmgt.yang
 *
 * @version 1.0 2014-12-30
 * @author Auto Generated
 */
public class Devicemgt extends YangElement {

    private static final long serialVersionUID = 1L;

    public static final Tagpath tagpath = new Tagpath("devmgt/devicemgt");

    static {
        Devmgt.enable();
    }

    /**
     * Field for child container "devices".
     */
    public Devices devices = null;

    /**
     * Constructor for an empty Devicemgt object.
     */
    public Devicemgt() {
        super(Devmgt.NAMESPACE, "devicemgt");
        setDefaultPrefix();
        setPrefix(Devmgt.PREFIX);
    }

    /**
     * Clones this object, returning an exact copy.
     * @return A clone of the object.
     */
    public Devicemgt clone() {
        return (Devicemgt)cloneContent(new Devicemgt());
    }

    /**
     * Clones this object, returning a shallow copy.
     * @return A clone of the object. Children are not included.
     */
    public Devicemgt cloneShallow() {
        return (Devicemgt)cloneShallowContent(new Devicemgt());
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
            "devices",
        };
    }

    /* Access methods for container child: "devices". */

    /**
     * Adds container entry "devices", using an existing object.
     * @param devices The object to add.
     * @return The added child.
     */
    public Devices addDevices(Devices devices) throws JNCException {
        this.devices = devices;
        insertChild(devices, childrenNames());
        return devices;
    }

    /**
     * Adds container entry "devices".
     * This method is used for creating subtree filters.
     * @return The added child.
     */
    public Devices addDevices() throws JNCException {
        Devices devices = new Devices();
        this.devices = devices;
        insertChild(devices, childrenNames());
        return devices;
    }

    /**
     * Deletes container entry "devices".
     * @return An array of the deleted element nodes.
     */
    public NodeSet deleteDevices() throws JNCException {
        this.devices = null;
        String path = "devices";
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
        if (child instanceof Devices) devices = (Devices)child;
    }

}
