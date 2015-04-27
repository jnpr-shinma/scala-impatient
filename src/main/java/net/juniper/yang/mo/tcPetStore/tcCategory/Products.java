/* 
 * @(#)Products.java        1.0 12/01/15
 *
 * This file has been auto-generated by JNC, the
 * Java output format plug-in of pyang.
 * Origin: module "tc-pet-store", revision: "2014-12-25".
 */

package net.juniper.yang.mo.tcPetStore.tcCategory;

import com.tailf.jnc.*;
import net.juniper.yang.mo.ietfInetTypes.Uri;
import net.juniper.yang.mo.ietfYangTypes.Uuid;
import net.juniper.yang.mo.iqIfmapTypes.Ifmap;
import net.juniper.yang.mo.tcPetStore.PetStoreTestcase;

/**
 * This class represents an element from 
 * the namespace http://www.juniper.net/ns/testcase-pet-store
 * generated to "/home/maxin/myworkspace/js-easy-rest/easy-rest-orm/target/scala-2.11/src_managed/main/net/juniper/yang/mo/tcPetStore/tcCategory/products"
 * <p>
 * See line 106 in
 * /home/maxin/myworkspace/js-easy-rest/easy-rest-orm/src/main/resources/yang/tc-pet-store.yang
 *
 * @version 1.0 2015-01-12
 * @author Auto Generated
 */
public class Products extends YangElement {

    private static final long serialVersionUID = 1L;

    public static final Tagpath TAG_PATH = new Tagpath("tcCategory/products");

    static {
        PetStoreTestcase.enable();
    }

    /**
     * Constructor for an empty Products object.
     */
    public Products() {
        super(PetStoreTestcase.NAMESPACE, "products");
    }

    /**
     * Constructor for an initialized Products object,
     * 
     * @param uuidValue Key argument of child.
     */
    public Products(Uuid uuidValue) throws JNCException {
        super(PetStoreTestcase.NAMESPACE, "products");
        Leaf uuid = new Leaf(PetStoreTestcase.NAMESPACE, "uuid");
        uuid.setValue(uuidValue);
        insertChild(uuid, childrenNames());
    }

    /**
     * Constructor for an initialized Products object,
     * with String keys.
     * @param uuidValue Key argument of child.
     */
    public Products(String uuidValue) throws JNCException {
        super(PetStoreTestcase.NAMESPACE, "products");
        Leaf uuid = new Leaf(PetStoreTestcase.NAMESPACE, "uuid");
        uuid.setValue(new net.juniper.yang.mo.ietfYangTypes.Uuid(uuidValue));
        insertChild(uuid, childrenNames());
    }

    /**
     * Clones this object, returning an exact copy.
     * @return A clone of the object.
     */
    public Products clone() {
        Products copy;
        try {
            copy = new Products(getUuidValue().toString());
        } catch (JNCException e) {
            copy = null;
        }
        return (Products)cloneContent(copy);
    }

    /**
     * Clones this object, returning a shallow copy.
     * @return A clone of the object. Children are not included.
     */
    public Products cloneShallow() {
        Products copy;
        try {
            copy = new Products(getUuidValue().toString());
        } catch (JNCException e) {
            copy = null;
        }
        return (Products)cloneShallowContent(copy);
    }

    /**
     * @return An array with the identifiers of any key children
     */
    public String[] keyNames() {
        return new String[] {
            "uuid",
        };
    }

    /**
     * @return An array with the identifiers of any children, in order.
     */
    public String[] childrenNames() {
        return new String[] {
            "to",
            "uuid",
            "type",
            "href",
        };
    }

    /* Access methods for optional leaf-list child: "to". */

    /**
     * Iterator method for the leaf-list "to".
     * @return An iterator for the leaf-list.
     */
    public ElementLeafListValueIterator toIterator() {
        return new ElementLeafListValueIterator(children, "to");
    }

    /**
     * Sets the value for child leaf-list "to",
     * using instance of generated typedef class.
     * @param toValue The value to set.
     * @param toValue used during instantiation.
     */
    public void setToValue(YangString toValue) throws JNCException {
        setLeafListValue(Ifmap.NAMESPACE,
            "to",
            toValue,
            childrenNames());
    }

    /**
     * Sets the value for child leaf-list "to",
     * using a String value.
     * @param toValue used during instantiation.
     */
    public void setToValue(String toValue) throws JNCException {
        setToValue(new YangString(toValue));
    }

    /**
     * Deletes leaf-list entry "to".
     * @param toValue Value to delete.
     */
    public void deleteTo(YangString toValue) throws JNCException {
        String path = "to[toValue]";
        delete(path);
    }

    /**
     * Deletes leaf-list entry "to".
     * The value is specified as a string.
     * @param toValue Value to delete.
     */
    public void deleteTo(String toValue) throws JNCException {
        String path = "to[toValue]";
        delete(path);
    }

    /**
     * This method is used for creating a subtree filter.
     * The added "to" leaf-list will not have a value.
     */
    public void addTo() throws JNCException {
        setLeafListValue(Ifmap.NAMESPACE,
            "to",
            null,
            childrenNames());
    }

    /**
     * Marks the leaf-list "to" with operation "replace".
     * @param toValue The value to mark
     */
    public void markToReplace(YangString toValue) throws JNCException {
        markLeafReplace("to[name='" + toValue + "']");
    }

    /**
     * Marks the leaf-list "to" with operation "merge".
     * @param toValue The value to mark
     */
    public void markToMerge(YangString toValue) throws JNCException {
        markLeafMerge("to[name='" + toValue + "']");
    }

    /**
     * Marks the leaf-list "to" with operation "create".
     * @param toValue The value to mark
     */
    public void markToCreate(YangString toValue) throws JNCException {
        markLeafCreate("to[name='" + toValue + "']");
    }

    /**
     * Marks the leaf-list "to" with operation "delete".
     * @param toValue The value to mark
     */
    public void markToDelete(YangString toValue) throws JNCException {
        markLeafDelete("to[name='" + toValue + "']");
    }

    /* Access methods for leaf child: "uuid". */

    /**
     * Gets the value for child leaf "uuid".
     * @return The value of the leaf.
     */
    public Uuid getUuidValue() throws JNCException {
        return (Uuid)getValue("uuid");
    }

    /**
     * Sets the value for child leaf "uuid",
     * using a JNC type value.
     * @param uuidValue The value to set.
     * @param uuidValue used during instantiation.
     */
    public void setUuidValue(Uuid uuidValue) throws JNCException {
        setLeafValue(Ifmap.NAMESPACE,
            "uuid",
            uuidValue,
            childrenNames());
    }

    /**
     * Sets the value for child leaf "uuid",
     * using a String value.
     * @param uuidValue used during instantiation.
     */
    public void setUuidValue(String uuidValue) throws JNCException {
        setUuidValue(new Uuid(uuidValue));
    }

    /**
     * This method is used for creating a subtree filter.
     * The added "uuid" leaf will not have a value.
     */
    public void addUuid() throws JNCException {
        setLeafValue(Ifmap.NAMESPACE,
            "uuid",
            null,
            childrenNames());
    }

    /* Access methods for optional leaf child: "type". */

    /**
     * Gets the value for child leaf "type".
     * @return The value of the leaf.
     */
    public YangString getTypeValue() throws JNCException {
        return (YangString)getValue("type");
    }

    /**
     * Sets the value for child leaf "type",
     * using instance of generated typedef class.
     * @param typeValue The value to set.
     * @param typeValue used during instantiation.
     */
    public void setTypeValue(YangString typeValue) throws JNCException {
        setLeafValue(Ifmap.NAMESPACE,
            "type",
            typeValue,
            childrenNames());
    }

    /**
     * Sets the value for child leaf "type",
     * using a String value.
     * @param typeValue used during instantiation.
     */
    public void setTypeValue(String typeValue) throws JNCException {
        setTypeValue(new YangString(typeValue));
    }

    /**
     * Unsets the value for child leaf "type".
     */
    public void unsetTypeValue() throws JNCException {
        delete("type");
    }

    /**
     * This method is used for creating a subtree filter.
     * The added "type" leaf will not have a value.
     */
    public void addType() throws JNCException {
        setLeafValue(Ifmap.NAMESPACE,
            "type",
            null,
            childrenNames());
    }

    /**
     * Marks the leaf "type" with operation "replace".
     */
    public void markTypeReplace() throws JNCException {
        markLeafReplace("type");
    }

    /**
     * Marks the leaf "type" with operation "merge".
     */
    public void markTypeMerge() throws JNCException {
        markLeafMerge("type");
    }

    /**
     * Marks the leaf "type" with operation "create".
     */
    public void markTypeCreate() throws JNCException {
        markLeafCreate("type");
    }

    /**
     * Marks the leaf "type" with operation "delete".
     */
    public void markTypeDelete() throws JNCException {
        markLeafDelete("type");
    }

    /* Access methods for optional leaf child: "href". */

    /**
     * Gets the value for child leaf "href".
     * @return The value of the leaf.
     */
    public Uri getHrefValue() throws JNCException {
        return (Uri)getValue("href");
    }

    /**
     * Sets the value for child leaf "href",
     * using a JNC type value.
     * @param hrefValue The value to set.
     * @param hrefValue used during instantiation.
     */
    public void setHrefValue(Uri hrefValue) throws JNCException {
        setLeafValue(Ifmap.NAMESPACE,
            "href",
            hrefValue,
            childrenNames());
    }

    /**
     * Sets the value for child leaf "href",
     * using a String value.
     * @param hrefValue used during instantiation.
     */
    public void setHrefValue(String hrefValue) throws JNCException {
        setHrefValue(new Uri(hrefValue));
    }

    /**
     * Unsets the value for child leaf "href".
     */
    public void unsetHrefValue() throws JNCException {
        delete("href");
    }

    /**
     * This method is used for creating a subtree filter.
     * The added "href" leaf will not have a value.
     */
    public void addHref() throws JNCException {
        setLeafValue(Ifmap.NAMESPACE,
            "href",
            null,
            childrenNames());
    }

    /**
     * Marks the leaf "href" with operation "replace".
     */
    public void markHrefReplace() throws JNCException {
        markLeafReplace("href");
    }

    /**
     * Marks the leaf "href" with operation "merge".
     */
    public void markHrefMerge() throws JNCException {
        markLeafMerge("href");
    }

    /**
     * Marks the leaf "href" with operation "create".
     */
    public void markHrefCreate() throws JNCException {
        markLeafCreate("href");
    }

    /**
     * Marks the leaf "href" with operation "delete".
     */
    public void markHrefDelete() throws JNCException {
        markLeafDelete("href");
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
