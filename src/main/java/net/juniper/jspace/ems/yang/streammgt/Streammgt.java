/* 
 * @(#)Streammgt.java        1.0 24/12/14
 *
 * This file has been auto-generated by JNC, the
 * Java output format plug-in of pyang.
 * Origin: module "streammgt", revision: "2014-09-16".
 */

package net.juniper.jspace.ems.yang.streammgt;

import com.tailf.jnc.JNCException;
import com.tailf.jnc.SchemaNode;
import com.tailf.jnc.SchemaParser;
import com.tailf.jnc.SchemaTree;
import com.tailf.jnc.Tagpath;
import com.tailf.jnc.YangElement;

import java.util.HashMap;

/**
 * The root class for namespace http://juniper.net/ns/space/streammgt/1.0 (accessible from 
 * Streammgt.NAMESPACE) with prefix "streammgt" (Streammgt.PREFIX).
 *
 * @version 1.0 2014-12-24
 * @author Auto Generated
 */
public class Streammgt {

    public static final String NAMESPACE = "http://juniper.net/ns/space/streammgt/1.0";

    public static final String PREFIX = "streammgt";

    /**
     * Enable the elements in this namespace to be aware
     * of the data model and use the generated classes.
     */
    public static void enable() throws JNCException {
        YangElement.setPackage(NAMESPACE, "net.juniper.jspace.ems.yang.streammgt");
        Streammgt.registerSchema();
    }

    /**
     * Register the schema for this namespace in the global
     * schema table (CsTree) making it possible to lookup
     * CsNode entries for all tagpaths
     */
    public static void registerSchema() throws JNCException {
        SchemaParser parser = new SchemaParser();
        HashMap<Tagpath, SchemaNode> h = SchemaTree.create(NAMESPACE);
        parser.findAndReadFile("Streammgt.schema", h, Streammgt.class);
    }

}
