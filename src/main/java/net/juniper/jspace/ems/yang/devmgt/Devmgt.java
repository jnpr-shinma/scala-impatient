/* 
 * @(#)Devmgt.java        1.0 30/12/14
 *
 * This file has been auto-generated by JNC, the
 * Java output format plug-in of pyang.
 * Origin: module "devmgt", revision: "2014-09-16".
 */

package net.juniper.jspace.ems.yang.devmgt;

import com.tailf.jnc.JNCException;
import com.tailf.jnc.SchemaNode;
import com.tailf.jnc.SchemaParser;
import com.tailf.jnc.SchemaTree;
import com.tailf.jnc.Tagpath;
import com.tailf.jnc.YangElement;

import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.HashMap;

/**
 * The root class for namespace http://juniper.net/ns/space/test/1.0 (accessible from 
 * Devmgt.NAMESPACE) with prefix "devmgt" (Devmgt.PREFIX).
 *
 * @version 1.0 2014-12-30
 * @author Auto Generated
 */
public class Devmgt {

    public static final String NAMESPACE = "http://juniper.net/ns/space/test/1.0";

    public static final String PREFIX = "devmgt";

    private static boolean enabled = false;

    /**
     * Enable the elements in this namespace to be aware
     * of the data model and use the generated classes.
     */
    public static void enable() {
        if(enabled)
            return;
        try {
            YangElement.setPackage(NAMESPACE, "net.juniper.jspace.ems.yang.devmgt");
            Devmgt.registerSchema();
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
        parser.findAndReadFile("Devmgt.schema", h, Devmgt.class);
    }

}
