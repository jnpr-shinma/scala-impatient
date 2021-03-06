/* 
 * @(#)TcCategory.java        1.0 12/01/15
 *
 * This file has been auto-generated by JNC, the
 * Java output format plug-in of pyang.
 * Origin: module "tc-pet-store", revision: "2014-12-25".
 */

package net.juniper.yang.mo.tcPetStore;

import com.tailf.jnc.*;
import net.juniper.yang.mo.ietfInetTypes.Uri;
import net.juniper.yang.mo.ietfYangTypes.Uuid;
import net.juniper.yang.mo.iqIfmapTypes.Ifmap;
import net.juniper.yang.mo.tcPetStore.tcCategory.IdPerms;
import net.juniper.yang.mo.tcPetStore.tcCategory.Products;

/**
 * This class represents an element from 
 * the namespace http://www.juniper.net/ns/testcase-pet-store
 * generated to "/home/maxin/myworkspace/js-easy-rest/easy-rest-orm/target/scala-2.11/src_managed/main/net/juniper/yang/mo/tcPetStore/tc-category"
 * <p>
 * See line 99 in
 * /home/maxin/myworkspace/js-easy-rest/easy-rest-orm/src/main/resources/yang/tc-pet-store.yang
 *
 * @version 1.0 2015-01-12
 * @author Auto Generated
 */
public class TcCategory extends YangElement {

    private static final long serialVersionUID = 1L;

    public static final Tagpath TAG_PATH = new Tagpath("tc-category");

    static {
        PetStoreTestcase.enable();
    }

    /**
     * Field for child container "id-perms".
     */
    public IdPerms idPerms = null;

    /**
     * Constructor for an empty TcCategory object.
     */
    public TcCategory() {
        super(PetStoreTestcase.NAMESPACE, "tc-category");
        setDefaultPrefix();
        setPrefix(PetStoreTestcase.PREFIX);
    }

    /**
     * Constructor for an initialized TcCategory object,
     * 
     * @param uuidValue Key argument of child.
     */
    public TcCategory(Uuid uuidValue) throws JNCException {
        super(PetStoreTestcase.NAMESPACE, "tc-category");
        setDefaultPrefix();
        setPrefix(PetStoreTestcase.PREFIX);
        Leaf uuid = new Leaf(PetStoreTestcase.NAMESPACE, "uuid");
        uuid.setValue(uuidValue);
        insertChild(uuid, childrenNames());
    }

    /**
     * Constructor for an initialized TcCategory object,
     * with String keys.
     * @param uuidValue Key argument of child.
     */
    public TcCategory(String uuidValue) throws JNCException {
        super(PetStoreTestcase.NAMESPACE, "tc-category");
        setDefaultPrefix();
        setPrefix(PetStoreTestcase.PREFIX);
        Leaf uuid = new Leaf(PetStoreTestcase.NAMESPACE, "uuid");
        uuid.setValue(new net.juniper.yang.mo.ietfYangTypes.Uuid(uuidValue));
        insertChild(uuid, childrenNames());
    }

    /**
     * Clones this object, returning an exact copy.
     * @return A clone of the object.
     */
    public TcCategory clone() {
        TcCategory copy;
        try {
            copy = new TcCategory(getUuidValue().toString());
        } catch (JNCException e) {
            copy = null;
        }
        return (TcCategory)cloneContent(copy);
    }

    /**
     * Clones this object, returning a shallow copy.
     * @return A clone of the object. Children are not included.
     */
    public TcCategory cloneShallow() {
        TcCategory copy;
        try {
            copy = new TcCategory(getUuidValue().toString());
        } catch (JNCException e) {
            copy = null;
        }
        return (TcCategory)cloneShallowContent(copy);
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
            "administrative-domain",
            "name",
            "type",
            "other-definition",
            "fq-name",
            "uuid",
            "href",
            "parent-uuid",
            "parent-href",
            "parent-type",
            "display-name",
            "id-perms",
            "descn",
            "products",
        };
    }

    /* Access methods for optional leaf child: "administrative-domain". */

    /**
     * Gets the value for child leaf "administrative-domain".
     * @return The value of the leaf.
     */
    public YangString getAdministrativeDomainValue() throws JNCException {
        return (YangString)getValue("administrative-domain");
    }

    /**
     * Sets the value for child leaf "administrative-domain",
     * using instance of generated typedef class.
     * @param administrativeDomainValue The value to set.
     * @param administrativeDomainValue used during instantiation.
     */
    public void setAdministrativeDomainValue(YangString administrativeDomainValue)
            throws JNCException {
        setLeafValue(Ifmap.NAMESPACE,
            "administrative-domain",
            administrativeDomainValue,
            childrenNames());
    }

    /**
     * Sets the value for child leaf "administrative-domain",
     * using a String value.
     * @param administrativeDomainValue used during instantiation.
     */
    public void setAdministrativeDomainValue(String administrativeDomainValue)
            throws JNCException {
        setAdministrativeDomainValue(new YangString(administrativeDomainValue));
    }

    /**
     * Unsets the value for child leaf "administrative-domain".
     */
    public void unsetAdministrativeDomainValue() throws JNCException {
        delete("administrative-domain");
    }

    /**
     * This method is used for creating a subtree filter.
     * The added "administrative-domain" leaf will not have a value.
     */
    public void addAdministrativeDomain() throws JNCException {
        setLeafValue(Ifmap.NAMESPACE,
            "administrative-domain",
            null,
            childrenNames());
    }

    /**
     * Marks the leaf "administrative-domain" with operation "replace".
     */
    public void markAdministrativeDomainReplace() throws JNCException {
        markLeafReplace("administrativeDomain");
    }

    /**
     * Marks the leaf "administrative-domain" with operation "merge".
     */
    public void markAdministrativeDomainMerge() throws JNCException {
        markLeafMerge("administrativeDomain");
    }

    /**
     * Marks the leaf "administrative-domain" with operation "create".
     */
    public void markAdministrativeDomainCreate() throws JNCException {
        markLeafCreate("administrativeDomain");
    }

    /**
     * Marks the leaf "administrative-domain" with operation "delete".
     */
    public void markAdministrativeDomainDelete() throws JNCException {
        markLeafDelete("administrativeDomain");
    }

    /* Access methods for optional leaf child: "name". */

    /**
     * Gets the value for child leaf "name".
     * @return The value of the leaf.
     */
    public YangString getNameValue() throws JNCException {
        return (YangString)getValue("name");
    }

    /**
     * Sets the value for child leaf "name",
     * using instance of generated typedef class.
     * @param nameValue The value to set.
     * @param nameValue used during instantiation.
     */
    public void setNameValue(YangString nameValue) throws JNCException {
        setLeafValue(Ifmap.NAMESPACE,
            "name",
            nameValue,
            childrenNames());
    }

    /**
     * Sets the value for child leaf "name",
     * using a String value.
     * @param nameValue used during instantiation.
     */
    public void setNameValue(String nameValue) throws JNCException {
        setNameValue(new YangString(nameValue));
    }

    /**
     * Unsets the value for child leaf "name".
     */
    public void unsetNameValue() throws JNCException {
        delete("name");
    }

    /**
     * This method is used for creating a subtree filter.
     * The added "name" leaf will not have a value.
     */
    public void addName() throws JNCException {
        setLeafValue(Ifmap.NAMESPACE,
            "name",
            null,
            childrenNames());
    }

    /**
     * Marks the leaf "name" with operation "replace".
     */
    public void markNameReplace() throws JNCException {
        markLeafReplace("name");
    }

    /**
     * Marks the leaf "name" with operation "merge".
     */
    public void markNameMerge() throws JNCException {
        markLeafMerge("name");
    }

    /**
     * Marks the leaf "name" with operation "create".
     */
    public void markNameCreate() throws JNCException {
        markLeafCreate("name");
    }

    /**
     * Marks the leaf "name" with operation "delete".
     */
    public void markNameDelete() throws JNCException {
        markLeafDelete("name");
    }

    /* Access methods for optional leaf child: "type". */

    /**
     * Gets the value for child leaf "type".
     * @return The value of the leaf.
     */
    public YangEnumeration getTypeValue() throws JNCException {
        return (YangEnumeration)getValue("type");
    }

    /**
     * Sets the value for child leaf "type",
     * using instance of generated typedef class.
     * @param typeValue The value to set.
     * @param typeValue used during instantiation.
     */
    public void setTypeValue(YangEnumeration typeValue) throws JNCException {
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
        setTypeValue(new YangEnumeration(typeValue, new String[] {
             "aik-name",
             "distinguished-name",
             "dns-name",
             "email-address",
             "hip-hit",
             "kerberos-principal",
             "username",
             "sip-uri",
             "tel-uri",
             "other",
        }));
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

    /* Access methods for optional leaf child: "other-definition". */

    /**
     * Gets the value for child leaf "other-definition".
     * @return The value of the leaf.
     */
    public YangString getOtherDefinitionValue() throws JNCException {
        return (YangString)getValue("other-definition");
    }

    /**
     * Sets the value for child leaf "other-definition",
     * using instance of generated typedef class.
     * @param otherDefinitionValue The value to set.
     * @param otherDefinitionValue used during instantiation.
     */
    public void setOtherDefinitionValue(YangString otherDefinitionValue)
            throws JNCException {
        setLeafValue(Ifmap.NAMESPACE,
            "other-definition",
            otherDefinitionValue,
            childrenNames());
    }

    /**
     * Sets the value for child leaf "other-definition",
     * using a String value.
     * @param otherDefinitionValue used during instantiation.
     */
    public void setOtherDefinitionValue(String otherDefinitionValue)
            throws JNCException {
        setOtherDefinitionValue(new YangString(otherDefinitionValue));
    }

    /**
     * Unsets the value for child leaf "other-definition".
     */
    public void unsetOtherDefinitionValue() throws JNCException {
        delete("other-definition");
    }

    /**
     * This method is used for creating a subtree filter.
     * The added "other-definition" leaf will not have a value.
     */
    public void addOtherDefinition() throws JNCException {
        setLeafValue(Ifmap.NAMESPACE,
            "other-definition",
            null,
            childrenNames());
    }

    /**
     * Marks the leaf "other-definition" with operation "replace".
     */
    public void markOtherDefinitionReplace() throws JNCException {
        markLeafReplace("otherDefinition");
    }

    /**
     * Marks the leaf "other-definition" with operation "merge".
     */
    public void markOtherDefinitionMerge() throws JNCException {
        markLeafMerge("otherDefinition");
    }

    /**
     * Marks the leaf "other-definition" with operation "create".
     */
    public void markOtherDefinitionCreate() throws JNCException {
        markLeafCreate("otherDefinition");
    }

    /**
     * Marks the leaf "other-definition" with operation "delete".
     */
    public void markOtherDefinitionDelete() throws JNCException {
        markLeafDelete("otherDefinition");
    }

    /* Access methods for optional leaf-list child: "fq-name". */

    /**
     * Iterator method for the leaf-list "fq-name".
     * @return An iterator for the leaf-list.
     */
    public ElementLeafListValueIterator fqNameIterator() {
        return new ElementLeafListValueIterator(children, "fq-name");
    }

    /**
     * Sets the value for child leaf-list "fq-name",
     * using instance of generated typedef class.
     * @param fqNameValue The value to set.
     * @param fqNameValue used during instantiation.
     */
    public void setFqNameValue(YangString fqNameValue) throws JNCException {
        setLeafListValue(Ifmap.NAMESPACE,
            "fq-name",
            fqNameValue,
            childrenNames());
    }

    /**
     * Sets the value for child leaf-list "fq-name",
     * using a String value.
     * @param fqNameValue used during instantiation.
     */
    public void setFqNameValue(String fqNameValue) throws JNCException {
        setFqNameValue(new YangString(fqNameValue));
    }

    /**
     * Deletes leaf-list entry "fqName".
     * @param fqNameValue Value to delete.
     */
    public void deleteFqName(YangString fqNameValue) throws JNCException {
        String path = "fqName[fqNameValue]";
        delete(path);
    }

    /**
     * Deletes leaf-list entry "fqName".
     * The value is specified as a string.
     * @param fqNameValue Value to delete.
     */
    public void deleteFqName(String fqNameValue) throws JNCException {
        String path = "fqName[fqNameValue]";
        delete(path);
    }

    /**
     * This method is used for creating a subtree filter.
     * The added "fq-name" leaf-list will not have a value.
     */
    public void addFqName() throws JNCException {
        setLeafListValue(Ifmap.NAMESPACE,
            "fq-name",
            null,
            childrenNames());
    }

    /**
     * Marks the leaf-list "fq-name" with operation "replace".
     * @param fqNameValue The value to mark
     */
    public void markFqNameReplace(YangString fqNameValue) throws JNCException {
        markLeafReplace("fqName[name='" + fqNameValue + "']");
    }

    /**
     * Marks the leaf-list "fq-name" with operation "merge".
     * @param fqNameValue The value to mark
     */
    public void markFqNameMerge(YangString fqNameValue) throws JNCException {
        markLeafMerge("fqName[name='" + fqNameValue + "']");
    }

    /**
     * Marks the leaf-list "fq-name" with operation "create".
     * @param fqNameValue The value to mark
     */
    public void markFqNameCreate(YangString fqNameValue) throws JNCException {
        markLeafCreate("fqName[name='" + fqNameValue + "']");
    }

    /**
     * Marks the leaf-list "fq-name" with operation "delete".
     * @param fqNameValue The value to mark
     */
    public void markFqNameDelete(YangString fqNameValue) throws JNCException {
        markLeafDelete("fqName[name='" + fqNameValue + "']");
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

    /* Access methods for optional leaf child: "parent-uuid". */

    /**
     * Gets the value for child leaf "parent-uuid".
     * @return The value of the leaf.
     */
    public Uuid getParentUuidValue() throws JNCException {
        return (Uuid)getValue("parent-uuid");
    }

    /**
     * Sets the value for child leaf "parent-uuid",
     * using a JNC type value.
     * @param parentUuidValue The value to set.
     * @param parentUuidValue used during instantiation.
     */
    public void setParentUuidValue(Uuid parentUuidValue) throws JNCException {
        setLeafValue(Ifmap.NAMESPACE,
            "parent-uuid",
            parentUuidValue,
            childrenNames());
    }

    /**
     * Sets the value for child leaf "parent-uuid",
     * using a String value.
     * @param parentUuidValue used during instantiation.
     */
    public void setParentUuidValue(String parentUuidValue) throws JNCException {
        setParentUuidValue(new Uuid(parentUuidValue));
    }

    /**
     * Unsets the value for child leaf "parent-uuid".
     */
    public void unsetParentUuidValue() throws JNCException {
        delete("parent-uuid");
    }

    /**
     * This method is used for creating a subtree filter.
     * The added "parent-uuid" leaf will not have a value.
     */
    public void addParentUuid() throws JNCException {
        setLeafValue(Ifmap.NAMESPACE,
            "parent-uuid",
            null,
            childrenNames());
    }

    /**
     * Marks the leaf "parent-uuid" with operation "replace".
     */
    public void markParentUuidReplace() throws JNCException {
        markLeafReplace("parentUuid");
    }

    /**
     * Marks the leaf "parent-uuid" with operation "merge".
     */
    public void markParentUuidMerge() throws JNCException {
        markLeafMerge("parentUuid");
    }

    /**
     * Marks the leaf "parent-uuid" with operation "create".
     */
    public void markParentUuidCreate() throws JNCException {
        markLeafCreate("parentUuid");
    }

    /**
     * Marks the leaf "parent-uuid" with operation "delete".
     */
    public void markParentUuidDelete() throws JNCException {
        markLeafDelete("parentUuid");
    }

    /* Access methods for optional leaf child: "parent-href". */

    /**
     * Gets the value for child leaf "parent-href".
     * @return The value of the leaf.
     */
    public Uri getParentHrefValue() throws JNCException {
        return (Uri)getValue("parent-href");
    }

    /**
     * Sets the value for child leaf "parent-href",
     * using a JNC type value.
     * @param parentHrefValue The value to set.
     * @param parentHrefValue used during instantiation.
     */
    public void setParentHrefValue(Uri parentHrefValue) throws JNCException {
        setLeafValue(Ifmap.NAMESPACE,
            "parent-href",
            parentHrefValue,
            childrenNames());
    }

    /**
     * Sets the value for child leaf "parent-href",
     * using a String value.
     * @param parentHrefValue used during instantiation.
     */
    public void setParentHrefValue(String parentHrefValue) throws JNCException {
        setParentHrefValue(new Uri(parentHrefValue));
    }

    /**
     * Unsets the value for child leaf "parent-href".
     */
    public void unsetParentHrefValue() throws JNCException {
        delete("parent-href");
    }

    /**
     * This method is used for creating a subtree filter.
     * The added "parent-href" leaf will not have a value.
     */
    public void addParentHref() throws JNCException {
        setLeafValue(Ifmap.NAMESPACE,
            "parent-href",
            null,
            childrenNames());
    }

    /**
     * Marks the leaf "parent-href" with operation "replace".
     */
    public void markParentHrefReplace() throws JNCException {
        markLeafReplace("parentHref");
    }

    /**
     * Marks the leaf "parent-href" with operation "merge".
     */
    public void markParentHrefMerge() throws JNCException {
        markLeafMerge("parentHref");
    }

    /**
     * Marks the leaf "parent-href" with operation "create".
     */
    public void markParentHrefCreate() throws JNCException {
        markLeafCreate("parentHref");
    }

    /**
     * Marks the leaf "parent-href" with operation "delete".
     */
    public void markParentHrefDelete() throws JNCException {
        markLeafDelete("parentHref");
    }

    /* Access methods for optional leaf child: "parent-type". */

    /**
     * Gets the value for child leaf "parent-type".
     * @return The value of the leaf.
     */
    public YangString getParentTypeValue() throws JNCException {
        return (YangString)getValue("parent-type");
    }

    /**
     * Sets the value for child leaf "parent-type",
     * using instance of generated typedef class.
     * @param parentTypeValue The value to set.
     * @param parentTypeValue used during instantiation.
     */
    public void setParentTypeValue(YangString parentTypeValue)
            throws JNCException {
        setLeafValue(Ifmap.NAMESPACE,
            "parent-type",
            parentTypeValue,
            childrenNames());
    }

    /**
     * Sets the value for child leaf "parent-type",
     * using a String value.
     * @param parentTypeValue used during instantiation.
     */
    public void setParentTypeValue(String parentTypeValue) throws JNCException {
        setParentTypeValue(new YangString(parentTypeValue));
    }

    /**
     * Unsets the value for child leaf "parent-type".
     */
    public void unsetParentTypeValue() throws JNCException {
        delete("parent-type");
    }

    /**
     * This method is used for creating a subtree filter.
     * The added "parent-type" leaf will not have a value.
     */
    public void addParentType() throws JNCException {
        setLeafValue(Ifmap.NAMESPACE,
            "parent-type",
            null,
            childrenNames());
    }

    /**
     * Marks the leaf "parent-type" with operation "replace".
     */
    public void markParentTypeReplace() throws JNCException {
        markLeafReplace("parentType");
    }

    /**
     * Marks the leaf "parent-type" with operation "merge".
     */
    public void markParentTypeMerge() throws JNCException {
        markLeafMerge("parentType");
    }

    /**
     * Marks the leaf "parent-type" with operation "create".
     */
    public void markParentTypeCreate() throws JNCException {
        markLeafCreate("parentType");
    }

    /**
     * Marks the leaf "parent-type" with operation "delete".
     */
    public void markParentTypeDelete() throws JNCException {
        markLeafDelete("parentType");
    }

    /* Access methods for optional leaf child: "display-name". */

    /**
     * Gets the value for child leaf "display-name".
     * @return The value of the leaf.
     */
    public YangString getDisplayNameValue() throws JNCException {
        return (YangString)getValue("display-name");
    }

    /**
     * Sets the value for child leaf "display-name",
     * using instance of generated typedef class.
     * @param displayNameValue The value to set.
     * @param displayNameValue used during instantiation.
     */
    public void setDisplayNameValue(YangString displayNameValue)
            throws JNCException {
        setLeafValue(Ifmap.NAMESPACE,
            "display-name",
            displayNameValue,
            childrenNames());
    }

    /**
     * Sets the value for child leaf "display-name",
     * using a String value.
     * @param displayNameValue used during instantiation.
     */
    public void setDisplayNameValue(String displayNameValue)
            throws JNCException {
        setDisplayNameValue(new YangString(displayNameValue));
    }

    /**
     * Unsets the value for child leaf "display-name".
     */
    public void unsetDisplayNameValue() throws JNCException {
        delete("display-name");
    }

    /**
     * This method is used for creating a subtree filter.
     * The added "display-name" leaf will not have a value.
     */
    public void addDisplayName() throws JNCException {
        setLeafValue(Ifmap.NAMESPACE,
            "display-name",
            null,
            childrenNames());
    }

    /**
     * Marks the leaf "display-name" with operation "replace".
     */
    public void markDisplayNameReplace() throws JNCException {
        markLeafReplace("displayName");
    }

    /**
     * Marks the leaf "display-name" with operation "merge".
     */
    public void markDisplayNameMerge() throws JNCException {
        markLeafMerge("displayName");
    }

    /**
     * Marks the leaf "display-name" with operation "create".
     */
    public void markDisplayNameCreate() throws JNCException {
        markLeafCreate("displayName");
    }

    /**
     * Marks the leaf "display-name" with operation "delete".
     */
    public void markDisplayNameDelete() throws JNCException {
        markLeafDelete("displayName");
    }

    /* Access methods for container child: "id-perms". */

    /**
     * Adds container entry "idPerms", using an existing object.
     * @param idPerms The object to add.
     * @return The added child.
     */
    public IdPerms addIdPerms(IdPerms idPerms) throws JNCException {
        this.idPerms = idPerms;
        insertChild(idPerms, childrenNames());
        return idPerms;
    }

    /**
     * Adds container entry "idPerms".
     * This method is used for creating subtree filters.
     * @return The added child.
     */
    public IdPerms addIdPerms() throws JNCException {
        IdPerms idPerms = new IdPerms();
        this.idPerms = idPerms;
        insertChild(idPerms, childrenNames());
        return idPerms;
    }

    /**
     * Deletes container entry "idPerms".
     * @return An array of the deleted element nodes.
     */
    public NodeSet deleteIdPerms() throws JNCException {
        this.idPerms = null;
        String path = "id-perms";
        return delete(path);
    }

    /* Access methods for optional leaf child: "descn". */

    /**
     * Gets the value for child leaf "descn".
     * @return The value of the leaf.
     */
    public YangString getDescnValue() throws JNCException {
        return (YangString)getValue("descn");
    }

    /**
     * Sets the value for child leaf "descn",
     * using instance of generated typedef class.
     * @param descnValue The value to set.
     * @param descnValue used during instantiation.
     */
    public void setDescnValue(YangString descnValue) throws JNCException {
        setLeafValue(PetStoreTestcase.NAMESPACE,
            "descn",
            descnValue,
            childrenNames());
    }

    /**
     * Sets the value for child leaf "descn",
     * using a String value.
     * @param descnValue used during instantiation.
     */
    public void setDescnValue(String descnValue) throws JNCException {
        setDescnValue(new YangString(descnValue));
    }

    /**
     * Unsets the value for child leaf "descn".
     */
    public void unsetDescnValue() throws JNCException {
        delete("descn");
    }

    /**
     * This method is used for creating a subtree filter.
     * The added "descn" leaf will not have a value.
     */
    public void addDescn() throws JNCException {
        setLeafValue(PetStoreTestcase.NAMESPACE,
            "descn",
            null,
            childrenNames());
    }

    /**
     * Marks the leaf "descn" with operation "replace".
     */
    public void markDescnReplace() throws JNCException {
        markLeafReplace("descn");
    }

    /**
     * Marks the leaf "descn" with operation "merge".
     */
    public void markDescnMerge() throws JNCException {
        markLeafMerge("descn");
    }

    /**
     * Marks the leaf "descn" with operation "create".
     */
    public void markDescnCreate() throws JNCException {
        markLeafCreate("descn");
    }

    /**
     * Marks the leaf "descn" with operation "delete".
     */
    public void markDescnDelete() throws JNCException {
        markLeafDelete("descn");
    }

    /* Access methods for list child: "products". */

    /**
     * Gets list entry "products", with specified keys.
     * @param uuidValue Key argument of child.
     */
    public Products getProducts(Uuid uuidValue) throws JNCException {
        String path = "products[uuid='" + uuidValue + "']";
        return (Products)searchOne(path);
    }

    /**
     * Gets list entry "products", with specified keys.
     * The keys are specified as strings.
     * @param uuidValue Key argument of child.
     */
    public Products getProducts(String uuidValue) throws JNCException {
        String path = "products[uuid='" + uuidValue + "']";
        return (Products)searchOne(path);
    }

    /**
     * Iterator method for the list "products".
     * @return An iterator for the list.
     */
    public ElementChildrenIterator productsIterator() {
        return new ElementChildrenIterator(children, "products");
    }

    /**
     * Adds list entry "products", using an existing object.
     * @param products The object to add.
     * @return The added child.
     */
    public Products addProducts(Products products) throws JNCException {
        insertChild(products, childrenNames());
        return products;
    }

    /**
     * Adds list entry "products", with specified keys.
     * @param uuidValue Key argument of child.
     * @return The added child.
     */
    public Products addProducts(Uuid uuidValue) throws JNCException {
        Products products = new Products(uuidValue);
        return addProducts(products);
    }

    /**
     * Adds list entry "products", with specified keys.
     * The keys are specified as strings.
     * @param uuidValue Key argument of child.
     * @return The added child.
     */
    public Products addProducts(String uuidValue) throws JNCException {
        Products products = new Products(uuidValue);
        return addProducts(products);
    }

    /**
     * Adds list entry "products".
     * This method is used for creating subtree filters.
     * @return The added child.
     */
    public Products addProducts() throws JNCException {
        Products products = new Products();
        insertChild(products, childrenNames());
        return products;
    }

    /**
     * Deletes list entry "products", with specified keys.
     * @param uuidValue Key argument of child.
     */
    public void deleteProducts(Uuid uuidValue) throws JNCException {
        String path = "products[uuid='" + uuidValue + "']";
        delete(path);
    }

    /**
     * Deletes list entry "products", with specified keys.
     * The keys are specified as strings.
     * @param uuidValue Key argument of child.
     */
    public void deleteProducts(String uuidValue) throws JNCException {
        String path = "products[uuid='" + uuidValue + "']";
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
        if (child instanceof IdPerms) idPerms = (IdPerms)child;
    }

}
