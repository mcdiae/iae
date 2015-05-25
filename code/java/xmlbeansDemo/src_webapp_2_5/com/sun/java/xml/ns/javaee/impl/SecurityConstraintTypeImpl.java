/*
 * XML Type:  security-constraintType
 * Namespace: http://java.sun.com/xml/ns/javaee
 * Java type: com.sun.java.xml.ns.javaee.SecurityConstraintType
 *
 * Automatically generated - do not modify.
 */
package com.sun.java.xml.ns.javaee.impl;
/**
 * An XML security-constraintType(@http://java.sun.com/xml/ns/javaee).
 *
 * This is a complex type.
 */
public class SecurityConstraintTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.sun.java.xml.ns.javaee.SecurityConstraintType
{
    private static final long serialVersionUID = 1L;
    
    public SecurityConstraintTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DISPLAYNAME$0 = 
        new javax.xml.namespace.QName("http://java.sun.com/xml/ns/javaee", "display-name");
    private static final javax.xml.namespace.QName WEBRESOURCECOLLECTION$2 = 
        new javax.xml.namespace.QName("http://java.sun.com/xml/ns/javaee", "web-resource-collection");
    private static final javax.xml.namespace.QName AUTHCONSTRAINT$4 = 
        new javax.xml.namespace.QName("http://java.sun.com/xml/ns/javaee", "auth-constraint");
    private static final javax.xml.namespace.QName USERDATACONSTRAINT$6 = 
        new javax.xml.namespace.QName("http://java.sun.com/xml/ns/javaee", "user-data-constraint");
    private static final javax.xml.namespace.QName ID$8 = 
        new javax.xml.namespace.QName("", "id");
    
    
    /**
     * Gets a List of "display-name" elements
     */
    public java.util.List<com.sun.java.xml.ns.javaee.DisplayNameType> getDisplayNameList()
    {
        final class DisplayNameList extends java.util.AbstractList<com.sun.java.xml.ns.javaee.DisplayNameType>
        {
            public com.sun.java.xml.ns.javaee.DisplayNameType get(int i)
                { return SecurityConstraintTypeImpl.this.getDisplayNameArray(i); }
            
            public com.sun.java.xml.ns.javaee.DisplayNameType set(int i, com.sun.java.xml.ns.javaee.DisplayNameType o)
            {
                com.sun.java.xml.ns.javaee.DisplayNameType old = SecurityConstraintTypeImpl.this.getDisplayNameArray(i);
                SecurityConstraintTypeImpl.this.setDisplayNameArray(i, o);
                return old;
            }
            
            public void add(int i, com.sun.java.xml.ns.javaee.DisplayNameType o)
                { SecurityConstraintTypeImpl.this.insertNewDisplayName(i).set(o); }
            
            public com.sun.java.xml.ns.javaee.DisplayNameType remove(int i)
            {
                com.sun.java.xml.ns.javaee.DisplayNameType old = SecurityConstraintTypeImpl.this.getDisplayNameArray(i);
                SecurityConstraintTypeImpl.this.removeDisplayName(i);
                return old;
            }
            
            public int size()
                { return SecurityConstraintTypeImpl.this.sizeOfDisplayNameArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new DisplayNameList();
        }
    }
    
    /**
     * Gets array of all "display-name" elements
     * @deprecated
     */
    public com.sun.java.xml.ns.javaee.DisplayNameType[] getDisplayNameArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List<com.sun.java.xml.ns.javaee.DisplayNameType> targetList = new java.util.ArrayList<com.sun.java.xml.ns.javaee.DisplayNameType>();
            get_store().find_all_element_users(DISPLAYNAME$0, targetList);
            com.sun.java.xml.ns.javaee.DisplayNameType[] result = new com.sun.java.xml.ns.javaee.DisplayNameType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "display-name" element
     */
    public com.sun.java.xml.ns.javaee.DisplayNameType getDisplayNameArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.javaee.DisplayNameType target = null;
            target = (com.sun.java.xml.ns.javaee.DisplayNameType)get_store().find_element_user(DISPLAYNAME$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "display-name" element
     */
    public int sizeOfDisplayNameArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DISPLAYNAME$0);
        }
    }
    
    /**
     * Sets array of all "display-name" element
     */
    public void setDisplayNameArray(com.sun.java.xml.ns.javaee.DisplayNameType[] displayNameArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(displayNameArray, DISPLAYNAME$0);
        }
    }
    
    /**
     * Sets ith "display-name" element
     */
    public void setDisplayNameArray(int i, com.sun.java.xml.ns.javaee.DisplayNameType displayName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.javaee.DisplayNameType target = null;
            target = (com.sun.java.xml.ns.javaee.DisplayNameType)get_store().find_element_user(DISPLAYNAME$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(displayName);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "display-name" element
     */
    public com.sun.java.xml.ns.javaee.DisplayNameType insertNewDisplayName(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.javaee.DisplayNameType target = null;
            target = (com.sun.java.xml.ns.javaee.DisplayNameType)get_store().insert_element_user(DISPLAYNAME$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "display-name" element
     */
    public com.sun.java.xml.ns.javaee.DisplayNameType addNewDisplayName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.javaee.DisplayNameType target = null;
            target = (com.sun.java.xml.ns.javaee.DisplayNameType)get_store().add_element_user(DISPLAYNAME$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "display-name" element
     */
    public void removeDisplayName(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DISPLAYNAME$0, i);
        }
    }
    
    /**
     * Gets a List of "web-resource-collection" elements
     */
    public java.util.List<com.sun.java.xml.ns.javaee.WebResourceCollectionType> getWebResourceCollectionList()
    {
        final class WebResourceCollectionList extends java.util.AbstractList<com.sun.java.xml.ns.javaee.WebResourceCollectionType>
        {
            public com.sun.java.xml.ns.javaee.WebResourceCollectionType get(int i)
                { return SecurityConstraintTypeImpl.this.getWebResourceCollectionArray(i); }
            
            public com.sun.java.xml.ns.javaee.WebResourceCollectionType set(int i, com.sun.java.xml.ns.javaee.WebResourceCollectionType o)
            {
                com.sun.java.xml.ns.javaee.WebResourceCollectionType old = SecurityConstraintTypeImpl.this.getWebResourceCollectionArray(i);
                SecurityConstraintTypeImpl.this.setWebResourceCollectionArray(i, o);
                return old;
            }
            
            public void add(int i, com.sun.java.xml.ns.javaee.WebResourceCollectionType o)
                { SecurityConstraintTypeImpl.this.insertNewWebResourceCollection(i).set(o); }
            
            public com.sun.java.xml.ns.javaee.WebResourceCollectionType remove(int i)
            {
                com.sun.java.xml.ns.javaee.WebResourceCollectionType old = SecurityConstraintTypeImpl.this.getWebResourceCollectionArray(i);
                SecurityConstraintTypeImpl.this.removeWebResourceCollection(i);
                return old;
            }
            
            public int size()
                { return SecurityConstraintTypeImpl.this.sizeOfWebResourceCollectionArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new WebResourceCollectionList();
        }
    }
    
    /**
     * Gets array of all "web-resource-collection" elements
     * @deprecated
     */
    public com.sun.java.xml.ns.javaee.WebResourceCollectionType[] getWebResourceCollectionArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List<com.sun.java.xml.ns.javaee.WebResourceCollectionType> targetList = new java.util.ArrayList<com.sun.java.xml.ns.javaee.WebResourceCollectionType>();
            get_store().find_all_element_users(WEBRESOURCECOLLECTION$2, targetList);
            com.sun.java.xml.ns.javaee.WebResourceCollectionType[] result = new com.sun.java.xml.ns.javaee.WebResourceCollectionType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "web-resource-collection" element
     */
    public com.sun.java.xml.ns.javaee.WebResourceCollectionType getWebResourceCollectionArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.javaee.WebResourceCollectionType target = null;
            target = (com.sun.java.xml.ns.javaee.WebResourceCollectionType)get_store().find_element_user(WEBRESOURCECOLLECTION$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "web-resource-collection" element
     */
    public int sizeOfWebResourceCollectionArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(WEBRESOURCECOLLECTION$2);
        }
    }
    
    /**
     * Sets array of all "web-resource-collection" element
     */
    public void setWebResourceCollectionArray(com.sun.java.xml.ns.javaee.WebResourceCollectionType[] webResourceCollectionArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(webResourceCollectionArray, WEBRESOURCECOLLECTION$2);
        }
    }
    
    /**
     * Sets ith "web-resource-collection" element
     */
    public void setWebResourceCollectionArray(int i, com.sun.java.xml.ns.javaee.WebResourceCollectionType webResourceCollection)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.javaee.WebResourceCollectionType target = null;
            target = (com.sun.java.xml.ns.javaee.WebResourceCollectionType)get_store().find_element_user(WEBRESOURCECOLLECTION$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(webResourceCollection);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "web-resource-collection" element
     */
    public com.sun.java.xml.ns.javaee.WebResourceCollectionType insertNewWebResourceCollection(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.javaee.WebResourceCollectionType target = null;
            target = (com.sun.java.xml.ns.javaee.WebResourceCollectionType)get_store().insert_element_user(WEBRESOURCECOLLECTION$2, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "web-resource-collection" element
     */
    public com.sun.java.xml.ns.javaee.WebResourceCollectionType addNewWebResourceCollection()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.javaee.WebResourceCollectionType target = null;
            target = (com.sun.java.xml.ns.javaee.WebResourceCollectionType)get_store().add_element_user(WEBRESOURCECOLLECTION$2);
            return target;
        }
    }
    
    /**
     * Removes the ith "web-resource-collection" element
     */
    public void removeWebResourceCollection(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(WEBRESOURCECOLLECTION$2, i);
        }
    }
    
    /**
     * Gets the "auth-constraint" element
     */
    public com.sun.java.xml.ns.javaee.AuthConstraintType getAuthConstraint()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.javaee.AuthConstraintType target = null;
            target = (com.sun.java.xml.ns.javaee.AuthConstraintType)get_store().find_element_user(AUTHCONSTRAINT$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "auth-constraint" element
     */
    public boolean isSetAuthConstraint()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(AUTHCONSTRAINT$4) != 0;
        }
    }
    
    /**
     * Sets the "auth-constraint" element
     */
    public void setAuthConstraint(com.sun.java.xml.ns.javaee.AuthConstraintType authConstraint)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.javaee.AuthConstraintType target = null;
            target = (com.sun.java.xml.ns.javaee.AuthConstraintType)get_store().find_element_user(AUTHCONSTRAINT$4, 0);
            if (target == null)
            {
                target = (com.sun.java.xml.ns.javaee.AuthConstraintType)get_store().add_element_user(AUTHCONSTRAINT$4);
            }
            target.set(authConstraint);
        }
    }
    
    /**
     * Appends and returns a new empty "auth-constraint" element
     */
    public com.sun.java.xml.ns.javaee.AuthConstraintType addNewAuthConstraint()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.javaee.AuthConstraintType target = null;
            target = (com.sun.java.xml.ns.javaee.AuthConstraintType)get_store().add_element_user(AUTHCONSTRAINT$4);
            return target;
        }
    }
    
    /**
     * Unsets the "auth-constraint" element
     */
    public void unsetAuthConstraint()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(AUTHCONSTRAINT$4, 0);
        }
    }
    
    /**
     * Gets the "user-data-constraint" element
     */
    public com.sun.java.xml.ns.javaee.UserDataConstraintType getUserDataConstraint()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.javaee.UserDataConstraintType target = null;
            target = (com.sun.java.xml.ns.javaee.UserDataConstraintType)get_store().find_element_user(USERDATACONSTRAINT$6, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "user-data-constraint" element
     */
    public boolean isSetUserDataConstraint()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(USERDATACONSTRAINT$6) != 0;
        }
    }
    
    /**
     * Sets the "user-data-constraint" element
     */
    public void setUserDataConstraint(com.sun.java.xml.ns.javaee.UserDataConstraintType userDataConstraint)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.javaee.UserDataConstraintType target = null;
            target = (com.sun.java.xml.ns.javaee.UserDataConstraintType)get_store().find_element_user(USERDATACONSTRAINT$6, 0);
            if (target == null)
            {
                target = (com.sun.java.xml.ns.javaee.UserDataConstraintType)get_store().add_element_user(USERDATACONSTRAINT$6);
            }
            target.set(userDataConstraint);
        }
    }
    
    /**
     * Appends and returns a new empty "user-data-constraint" element
     */
    public com.sun.java.xml.ns.javaee.UserDataConstraintType addNewUserDataConstraint()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.javaee.UserDataConstraintType target = null;
            target = (com.sun.java.xml.ns.javaee.UserDataConstraintType)get_store().add_element_user(USERDATACONSTRAINT$6);
            return target;
        }
    }
    
    /**
     * Unsets the "user-data-constraint" element
     */
    public void unsetUserDataConstraint()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(USERDATACONSTRAINT$6, 0);
        }
    }
    
    /**
     * Gets the "id" attribute
     */
    public java.lang.String getId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ID$8);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "id" attribute
     */
    public org.apache.xmlbeans.XmlID xgetId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlID target = null;
            target = (org.apache.xmlbeans.XmlID)get_store().find_attribute_user(ID$8);
            return target;
        }
    }
    
    /**
     * True if has "id" attribute
     */
    public boolean isSetId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(ID$8) != null;
        }
    }
    
    /**
     * Sets the "id" attribute
     */
    public void setId(java.lang.String id)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ID$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ID$8);
            }
            target.setStringValue(id);
        }
    }
    
    /**
     * Sets (as xml) the "id" attribute
     */
    public void xsetId(org.apache.xmlbeans.XmlID id)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlID target = null;
            target = (org.apache.xmlbeans.XmlID)get_store().find_attribute_user(ID$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlID)get_store().add_attribute_user(ID$8);
            }
            target.set(id);
        }
    }
    
    /**
     * Unsets the "id" attribute
     */
    public void unsetId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(ID$8);
        }
    }
}
