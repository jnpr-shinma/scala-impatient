/* 
 * @(#)Yang.java        1.0 12/01/15
 *
 * This file has been auto-generated by JNC, the
 * Java output format plug-in of pyang.
 * Origin: module "ietf-yang-types", revision: "2013-07-15".
 */

package net.juniper.yang.mo.ietfYangTypes;

import com.tailf.jnc.*;

import java.util.HashMap;

/**
 * The root class for namespace urn:ietf:params:xml:ns:yang:ietf-yang-types (accessible from 
 * IetfYangTypes.NAMESPACE) with prefix "yang" (IetfYangTypes.PREFIX).
 *
 * @version 1.0 2015-01-12
 * @author Auto Generated
 */
public class Yang {

    public static final String NAMESPACE = "urn:ietf:params:xml:ns:yang:ietf-yang-types";

    public static final String PREFIX = "yang";

    private static boolean enabled = false;

    /**
     * Enable the elements in this namespace to be aware
     * of the data model and use the generated classes.
     */
    public static void enable() {
        if(enabled)
            return;
        try {
            YangElement.setPackage(NAMESPACE, "net.juniper.yang.mo.ietfYangTypes");
            Yang.registerSchema();
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
        parser.findAndReadFile("Yang.schema", h, Yang.class);
    }

}
