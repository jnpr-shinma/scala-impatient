/* 
 * @(#)Ifmap.java        1.0 12/01/15
 *
 * This file has been auto-generated by JNC, the
 * Java output format plug-in of pyang.
 * Origin: module "iq-ifmap-types", revision: "2014-12-05".
 */

package net.juniper.yang.mo.iqIfmapTypes;

import com.tailf.jnc.*;

import java.util.HashMap;

/**
 * The root class for namespace http://www.juniper.net/ns/iq/ifmap (accessible from 
 * IqIfmapTypes.NAMESPACE) with prefix "ifmap" (IqIfmapTypes.PREFIX).
 *
 * @version 1.0 2015-01-12
 * @author Auto Generated
 */
public class Ifmap {

    public static final String NAMESPACE = "http://www.juniper.net/ns/iq/ifmap";

    public static final String PREFIX = "ifmap";

    private static boolean enabled = false;

    /**
     * Enable the elements in this namespace to be aware
     * of the data model and use the generated classes.
     */
    public static void enable() {
        if(enabled)
            return;
        try {
            YangElement.setPackage(NAMESPACE, "net.juniper.yang.mo.iqIfmapTypes");
            Ifmap.registerSchema();
        }
        catch(Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * Register the schema for this namespace in the global
     * schema table (CsTree) making it possible to lookup
     * CsNode entries for all tagpaths
     */
    public static void registerSchema() throws JNCException {
        SchemaParser parser = new SchemaParser();
        HashMap<Tagpath, SchemaNode> h = SchemaTree.create(NAMESPACE);
        parser.findAndReadFile("Ifmap.schema", h, Ifmap.class);
    }

}