/*
 * XML Type:  auth-constraintType
 * Namespace: http://java.sun.com/xml/ns/javaee
 * Java type: com.sun.java.xml.ns.javaee.AuthConstraintType
 *
 * Automatically generated - do not modify.
 */
package com.sun.java.xml.ns.javaee.impl;
/**
 * An XML auth-constraintType(@http://java.sun.com/xml/ns/javaee).
 *
 * This is a complex type.
 */
public class AuthConstraintTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.sun.java.xml.ns.javaee.AuthConstraintType
{
    private static final long serialVersionUID = 1L;
    
    public AuthConstraintTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DESCRIPTION$0 = 
        new javax.xml.namespace.QName("http://java.sun.com/xml/ns/javaee", "description");
    private static final javax.xml.namespace.QName ROLENAME$2 = 
        new javax.xml.namespace.QName("http://java.sun.com/xml/ns/javaee", "role-name");
    private static final javax.xml.namespace.QName ID$4 = 
        new javax.xml.namespace.QName("", "id");
    
    
    /**
     * Gets a List of "description" elements
     */
    public java.util.List<com.sun.java.xml.ns.javaee.DescriptionType> getDescriptionList()
    {
        final class DescriptionList extends java.util.AbstractList<com.sun.java.xml.ns.javaee.DescriptionType>
        {
            public com.sun.java.xml.ns.javaee.DescriptionType get(int i)
                { return AuthConstraintTypeImpl.this.getDescriptionArray(i); }
            
            public com.sun.java.xml.ns.javaee.DescriptionType set(int i, com.sun.java.xml.ns.javaee.DescriptionType o)
            {
                com.sun.java.xml.ns.javaee.DescriptionType old = AuthConstraintTypeImpl.this.getDescriptionArray(i);
                AuthConstraintTypeImpl.this.setDescriptionArray(i, o);
                return old;
            }
            
            public void add(int i, com.sun.java.xml.ns.javaee.DescriptionType o)
                { AuthConstraintTypeImpl.this.insertNewDescription(i).set(o); }
            
            public com.sun.java.xml.ns.javaee.DescriptionType remove(int i)
            {
                com.sun.java.xml.ns.javaee.DescriptionType old = AuthConstraintTypeImpl.this.getDescriptionArray(i);
                AuthConstraintTypeImpl.this.removeDescription(i);
                return old;
            }
            
            public int size()
                { return AuthConstraintTypeImpl.this.sizeOfDescriptionArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new DescriptionList();
        }
    }
    
    /**
     * Gets array of all "description" elements
     * @deprecated
     */
    public com.sun.java.xml.ns.javaee.DescriptionType[] getDescriptionArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List<com.sun.java.xml.ns.javaee.DescriptionType> targetList = new java.util.ArrayList<com.sun.java.xml.ns.javaee.DescriptionType>();
            get_store().find_all_element_users(DESCRIPTION$0, targetList);
            com.sun.java.xml.ns.javaee.DescriptionType[] result = new com.sun.java.xml.ns.javaee.DescriptionType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "description" element
     */
    public com.sun.java.xml.ns.javaee.DescriptionType getDescriptionArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.javaee.DescriptionType target = null;
            target = (com.sun.java.xml.ns.javaee.DescriptionType)get_store().find_element_user(DESCRIPTION$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "description" element
     */
    public int sizeOfDescriptionArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DESCRIPTION$0);
        }
    }
    
    /**
     * Sets array of all "description" element
     */
    public void setDescriptionArray(com.sun.java.xml.ns.javaee.DescriptionType[] descriptionArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(descriptionArray, DESCRIPTION$0);
        }
    }
    
    /**
     * Sets ith "description" element
     */
    public void setDescriptionArray(int i, com.sun.java.xml.ns.javaee.DescriptionType description)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.javaee.DescriptionType target = null;
            target = (com.sun.java.xml.ns.javaee.DescriptionType)get_store().find_element_user(DESCRIPTION$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(description);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "description" element
     */
    public com.sun.java.xml.ns.javaee.DescriptionType insertNewDescription(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.javaee.DescriptionType target = null;
            target = (com.sun.java.xml.ns.javaee.DescriptionType)get_store().insert_element_user(DESCRIPTION$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "description" element
     */
    public com.sun.java.xml.ns.javaee.DescriptionType addNewDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.javaee.DescriptionType target = null;
            target = (com.sun.java.xml.ns.javaee.DescriptionType)get_store().add_element_user(DESCRIPTION$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "description" element
     */
    public void removeDescription(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DESCRIPTION$0, i);
        }
    }
    
    /**
     * Gets a List of "role-name" elements
     */
    public java.util.List<com.sun.java.xml.ns.javaee.RoleNameType> getRoleNameList()
    {
        final class RoleNameList extends java.util.AbstractList<com.sun.java.xml.ns.javaee.RoleNameType>
        {
            public com.sun.java.xml.ns.javaee.RoleNameType get(int i)
                { return AuthConstraintTypeImpl.this.getRoleNameArray(i); }
            
            public com.sun.java.xml.ns.javaee.RoleNameType set(int i, com.sun.java.xml.ns.javaee.RoleNameType o)
            {
                com.sun.java.xml.ns.javaee.RoleNameType old = AuthConstraintTypeImpl.this.getRoleNameArray(i);
                AuthConstraintTypeImpl.this.setRoleNameArray(i, o);
                return old;
            }
            
            public void add(int i, com.sun.java.xml.ns.javaee.RoleNameType o)
                { AuthConstraintTypeImpl.this.insertNewRoleName(i).set(o); }
            
            public com.sun.java.xml.ns.javaee.RoleNameType remove(int i)
            {
                com.sun.java.xml.ns.javaee.RoleNameType old = AuthConstraintTypeImpl.this.getRoleNameArray(i);
                AuthConstraintTypeImpl.this.removeRoleName(i);
                return old;
            }
            
            public int size()
                { return AuthConstraintTypeImpl.this.sizeOfRoleNameArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new RoleNameList();
        }
    }
    
    /**
     * Gets array of all "role-name" elements
     * @deprecated
     */
    public com.sun.java.xml.ns.javaee.RoleNameType[] getRoleNameArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List<com.sun.java.xml.ns.javaee.RoleNameType> targetList = new java.util.ArrayList<com.sun.java.xml.ns.javaee.RoleNameType>();
            get_store().find_all_element_users(ROLENAME$2, targetList);
            com.sun.java.xml.ns.javaee.RoleNameType[] result = new com.sun.java.xml.ns.javaee.RoleNameType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "role-name" element
     */
    public com.sun.java.xml.ns.javaee.RoleNameType getRoleNameArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.javaee.RoleNameType target = null;
            target = (com.sun.java.xml.ns.javaee.RoleNameType)get_store().find_element_user(ROLENAME$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "role-name" element
     */
    public int sizeOfRoleNameArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ROLENAME$2);
        }
    }
    
    /**
     * Sets array of all "role-name" element
     */
    public void setRoleNameArray(com.sun.java.xml.ns.javaee.RoleNameType[] roleNameArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(roleNameArray, ROLENAME$2);
        }
    }
    
    /**
     * Sets ith "role-name" element
     */
    public void setRoleNameArray(int i, com.sun.java.xml.ns.javaee.RoleNameType roleName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.javaee.RoleNameType target = null;
            target = (com.sun.java.xml.ns.javaee.RoleNameType)get_store().find_element_user(ROLENAME$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(roleName);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "role-name" element
     */
    public com.sun.java.xml.ns.javaee.RoleNameType insertNewRoleName(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.javaee.RoleNameType target = null;
            target = (com.sun.java.xml.ns.javaee.RoleNameType)get_store().insert_element_user(ROLENAME$2, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "role-name" element
     */
    public com.sun.java.xml.ns.javaee.RoleNameType addNewRoleName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.javaee.RoleNameType target = null;
            target = (com.sun.java.xml.ns.javaee.RoleNameType)get_store().add_element_user(ROLENAME$2);
            return target;
        }
    }
    
    /**
     * Removes the ith "role-name" element
     */
    public void removeRoleName(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ROLENAME$2, i);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ID$4);
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
            target = (org.apache.xmlbeans.XmlID)get_store().find_attribute_user(ID$4);
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
            return get_store().find_attribute_user(ID$4) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ID$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ID$4);
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
            target = (org.apache.xmlbeans.XmlID)get_store().find_attribute_user(ID$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlID)get_store().add_attribute_user(ID$4);
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
            get_store().remove_attribute(ID$4);
        }
    }
}
