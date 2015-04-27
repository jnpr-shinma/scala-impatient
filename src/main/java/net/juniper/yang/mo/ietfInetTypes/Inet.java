/* 
 * @(#)Inet.java        1.0 12/01/15
 *
 * This file has been auto-generated by JNC, the
 * Java output format plug-in of pyang.
 * Origin: module "ietf-inet-types", revision: "2013-07-15".
 */

package net.juniper.yang.mo.ietfInetTypes;

import com.tailf.jnc.*;

import java.util.HashMap;

/**
 * The root class for namespace urn:ietf:params:xml:ns:yang:ietf-inet-types (accessible from 
 * IetfInetTypes.NAMESPACE) with prefix "inet" (IetfInetTypes.PREFIX).
 *
 * @version 1.0 2015-01-12
 * @author Auto Generated
 */
public class Inet {

    public static final String NAMESPACE = "urn:ietf:params:xml:ns:yang:ietf-inet-types";

    public static final String PREFIX = "inet";

    private static boolean enabled = false;

    /**
     * Enable the elements in this namespace to be aware
     * of the data model and use the generated classes.
     */
    public static void enable() {
        if(enabled)
            return;
        try {
            YangElement.setPackage(NAMESPACE, "net.juniper.yang.mo.ietfInetTypes");
            Inet.registerSchema();
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
        parser.findAndReadFile("Inet.schema", h, Inet.class);
    }

}