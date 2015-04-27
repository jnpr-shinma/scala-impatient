/* 
 * @(#)Streams.java        1.0 24/12/14
 *
 * This file has been auto-generated by JNC, the
 * Java output format plug-in of pyang.
 * Origin: module "streammgt", revision: "2014-09-16".
 */

package net.juniper.jspace.ems.yang.streammgt;

import com.tailf.jnc.Element;
import com.tailf.jnc.ElementChildrenIterator;
import com.tailf.jnc.JNCException;
import com.tailf.jnc.Tagpath;
import com.tailf.jnc.YangElement;
import com.tailf.jnc.YangString;

import net.juniper.jspace.ems.yang.streammgt.Streammgt;
import net.juniper.jspace.ems.yang.streammgt.streams.Stream;

/**
 * This class represents an element from 
 * the namespace http://juniper.net/ns/space/streammgt/1.0
 * generated to "src/net/juniper/jspace/ems/yang/streammgt/streams"
 * <p>
 * See line 15 in
 * /home/maxin/workspace/js-easy-rest/easy-rest-core/yang/streammgt.yang
 *
 * @version 1.0 2014-12-24
 * @author Auto Generated
 */
public class Streams extends YangElement {

    private static final long serialVersionUID = 1L;

    public static final Tagpath tagpath = new Tagpath("/streammgt/streams");

    /**
     * Constructor for an empty Streams object.
     */
    public Streams() {
        super(Streammgt.NAMESPACE, "streams");
        setDefaultPrefix();
        setPrefix(Streammgt.PREFIX);
    }

    /**
     * Clones this object, returning an exact copy.
     * @return A clone of the object.
     */
    public Streams clone() {
        return (Streams)cloneContent(new Streams());
    }

    /**
     * Clones this object, returning a shallow copy.
     * @return A clone of the object. Children are not included.
     */
    public Streams cloneShallow() {
        return (Streams)cloneShallowContent(new Streams());
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
            "stream",
        };
    }

    /* Access methods for list child: "stream". */

    /**
     * Gets list entry "stream", with specified keys.
     * @param nameValue Key argument of child.
     */
    public Stream getStream(YangString nameValue) throws JNCException {
        String path = "stream[name='" + nameValue + "']";
        return (Stream)searchOne(path);
    }

    /**
     * Gets list entry "stream", with specified keys.
     * The keys are specified as strings.
     * @param nameValue Key argument of child.
     */
    public Stream getStream(String nameValue) throws JNCException {
        String path = "stream[name='" + nameValue + "']";
        return (Stream)searchOne(path);
    }

    /**
     * Iterator method for the list "stream".
     * @return An iterator for the list.
     */
    public ElementChildrenIterator streamIterator() {
        return new ElementChildrenIterator(children, "stream");
    }

    /**
     * Adds list entry "stream", using an existing object.
     * @param stream The object to add.
     * @return The added child.
     */
    public Stream addStream(Stream stream) throws JNCException {
        insertChild(stream, childrenNames());
        return stream;
    }

    /**
     * Adds list entry "stream", with specified keys.
     * @param nameValue Key argument of child.
     * @return The added child.
     */
    public Stream addStream(YangString nameValue) throws JNCException {
        Stream stream = new Stream(nameValue);
        return addStream(stream);
    }

    /**
     * Adds list entry "stream", with specified keys.
     * The keys are specified as strings.
     * @param nameValue Key argument of child.
     * @return The added child.
     */
    public Stream addStream(String nameValue) throws JNCException {
        Stream stream = new Stream(nameValue);
        return addStream(stream);
    }

    /**
     * Adds list entry "stream".
     * This method is used for creating subtree filters.
     * @return The added child.
     */
    public Stream addStream() throws JNCException {
        Stream stream = new Stream();
        insertChild(stream, childrenNames());
        return stream;
    }

    /**
     * Deletes list entry "stream", with specified keys.
     * @param nameValue Key argument of child.
     */
    public void deleteStream(YangString nameValue) throws JNCException {
        String path = "stream[name='" + nameValue + "']";
        delete(path);
    }

    /**
     * Deletes list entry "stream", with specified keys.
     * The keys are specified as strings.
     * @param nameValue Key argument of child.
     */
    public void deleteStream(String nameValue) throws JNCException {
        String path = "stream[name='" + nameValue + "']";
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
