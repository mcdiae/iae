/*
 * XML Type:  resource-refType
 * Namespace: http://java.sun.com/xml/ns/javaee
 * Java type: com.sun.java.xml.ns.javaee.ResourceRefType
 *
 * Automatically generated - do not modify.
 */
package com.sun.java.xml.ns.javaee.impl;
/**
 * An XML resource-refType(@http://java.sun.com/xml/ns/javaee).
 *
 * This is a complex type.
 */
public class ResourceRefTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.sun.java.xml.ns.javaee.ResourceRefType
{
    private static final long serialVersionUID = 1L;
    
    public ResourceRefTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DESCRIPTION$0 = 
        new javax.xml.namespace.QName("http://java.sun.com/xml/ns/javaee", "description");
    private static final javax.xml.namespace.QName RESREFNAME$2 = 
        new javax.xml.namespace.QName("http://java.sun.com/xml/ns/javaee", "res-ref-name");
    private static final javax.xml.namespace.QName RESTYPE$4 = 
        new javax.xml.namespace.QName("http://java.sun.com/xml/ns/javaee", "res-type");
    private static final javax.xml.namespace.QName RESAUTH$6 = 
        new javax.xml.namespace.QName("http://java.sun.com/xml/ns/javaee", "res-auth");
    private static final javax.xml.namespace.QName RESSHARINGSCOPE$8 = 
        new javax.xml.namespace.QName("http://java.sun.com/xml/ns/javaee", "res-sharing-scope");
    private static final javax.xml.namespace.QName MAPPEDNAME$10 = 
        new javax.xml.namespace.QName("http://java.sun.com/xml/ns/javaee", "mapped-name");
    private static final javax.xml.namespace.QName INJECTIONTARGET$12 = 
        new javax.xml.namespace.QName("http://java.sun.com/xml/ns/javaee", "injection-target");
    private static final javax.xml.namespace.QName ID$14 = 
        new javax.xml.namespace.QName("", "id");
    
    
    /**
     * Gets a List of "description" elements
     */
    public java.util.List<com.sun.java.xml.ns.javaee.DescriptionType> getDescriptionList()
    {
        final class DescriptionList extends java.util.AbstractList<com.sun.java.xml.ns.javaee.DescriptionType>
        {
            public com.sun.java.xml.ns.javaee.DescriptionType get(int i)
                { return ResourceRefTypeImpl.this.getDescriptionArray(i); }
            
            public com.sun.java.xml.ns.javaee.DescriptionType set(int i, com.sun.java.xml.ns.javaee.DescriptionType o)
            {
                com.sun.java.xml.ns.javaee.DescriptionType old = ResourceRefTypeImpl.this.getDescriptionArray(i);
                ResourceRefTypeImpl.this.setDescriptionArray(i, o);
                return old;
            }
            
            public void add(int i, com.sun.java.xml.ns.javaee.DescriptionType o)
                { ResourceRefTypeImpl.this.insertNewDescription(i).set(o); }
            
            public com.sun.java.xml.ns.javaee.DescriptionType remove(int i)
            {
                com.sun.java.xml.ns.javaee.DescriptionType old = ResourceRefTypeImpl.this.getDescriptionArray(i);
                ResourceRefTypeImpl.this.removeDescription(i);
                return old;
            }
            
            public int size()
                { return ResourceRefTypeImpl.this.sizeOfDescriptionArray(); }
            
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
     * Gets the "res-ref-name" element
     */
    public com.sun.java.xml.ns.javaee.JndiNameType getResRefName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.javaee.JndiNameType target = null;
            target = (com.sun.java.xml.ns.javaee.JndiNameType)get_store().find_element_user(RESREFNAME$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "res-ref-name" element
     */
    public void setResRefName(com.sun.java.xml.ns.javaee.JndiNameType resRefName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.javaee.JndiNameType target = null;
            target = (com.sun.java.xml.ns.javaee.JndiNameType)get_store().find_element_user(RESREFNAME$2, 0);
            if (target == null)
            {
                target = (com.sun.java.xml.ns.javaee.JndiNameType)get_store().add_element_user(RESREFNAME$2);
            }
            target.set(resRefName);
        }
    }
    
    /**
     * Appends and returns a new empty "res-ref-name" element
     */
    public com.sun.java.xml.ns.javaee.JndiNameType addNewResRefName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.javaee.JndiNameType target = null;
            target = (com.sun.java.xml.ns.javaee.JndiNameType)get_store().add_element_user(RESREFNAME$2);
            return target;
        }
    }
    
    /**
     * Gets the "res-type" element
     */
    public com.sun.java.xml.ns.javaee.FullyQualifiedClassType getResType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.javaee.FullyQualifiedClassType target = null;
            target = (com.sun.java.xml.ns.javaee.FullyQualifiedClassType)get_store().find_element_user(RESTYPE$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "res-type" element
     */
    public boolean isSetResType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(RESTYPE$4) != 0;
        }
    }
    
    /**
     * Sets the "res-type" element
     */
    public void setResType(com.sun.java.xml.ns.javaee.FullyQualifiedClassType resType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.javaee.FullyQualifiedClassType target = null;
            target = (com.sun.java.xml.ns.javaee.FullyQualifiedClassType)get_store().find_element_user(RESTYPE$4, 0);
            if (target == null)
            {
                target = (com.sun.java.xml.ns.javaee.FullyQualifiedClassType)get_store().add_element_user(RESTYPE$4);
            }
            target.set(resType);
        }
    }
    
    /**
     * Appends and returns a new empty "res-type" element
     */
    public com.sun.java.xml.ns.javaee.FullyQualifiedClassType addNewResType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.javaee.FullyQualifiedClassType target = null;
            target = (com.sun.java.xml.ns.javaee.FullyQualifiedClassType)get_store().add_element_user(RESTYPE$4);
            return target;
        }
    }
    
    /**
     * Unsets the "res-type" element
     */
    public void unsetResType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(RESTYPE$4, 0);
        }
    }
    
    /**
     * Gets the "res-auth" element
     */
    public com.sun.java.xml.ns.javaee.ResAuthType getResAuth()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.javaee.ResAuthType target = null;
            target = (com.sun.java.xml.ns.javaee.ResAuthType)get_store().find_element_user(RESAUTH$6, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "res-auth" element
     */
    public boolean isSetResAuth()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(RESAUTH$6) != 0;
        }
    }
    
    /**
     * Sets the "res-auth" element
     */
    public void setResAuth(com.sun.java.xml.ns.javaee.ResAuthType resAuth)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.javaee.ResAuthType target = null;
            target = (com.sun.java.xml.ns.javaee.ResAuthType)get_store().find_element_user(RESAUTH$6, 0);
            if (target == null)
            {
                target = (com.sun.java.xml.ns.javaee.ResAuthType)get_store().add_element_user(RESAUTH$6);
            }
            target.set(resAuth);
        }
    }
    
    /**
     * Appends and returns a new empty "res-auth" element
     */
    public com.sun.java.xml.ns.javaee.ResAuthType addNewResAuth()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.javaee.ResAuthType target = null;
            target = (com.sun.java.xml.ns.javaee.ResAuthType)get_store().add_element_user(RESAUTH$6);
            return target;
        }
    }
    
    /**
     * Unsets the "res-auth" element
     */
    public void unsetResAuth()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(RESAUTH$6, 0);
        }
    }
    
    /**
     * Gets the "res-sharing-scope" element
     */
    public com.sun.java.xml.ns.javaee.ResSharingScopeType getResSharingScope()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.javaee.ResSharingScopeType target = null;
            target = (com.sun.java.xml.ns.javaee.ResSharingScopeType)get_store().find_element_user(RESSHARINGSCOPE$8, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "res-sharing-scope" element
     */
    public boolean isSetResSharingScope()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(RESSHARINGSCOPE$8) != 0;
        }
    }
    
    /**
     * Sets the "res-sharing-scope" element
     */
    public void setResSharingScope(com.sun.java.xml.ns.javaee.ResSharingScopeType resSharingScope)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.javaee.ResSharingScopeType target = null;
            target = (com.sun.java.xml.ns.javaee.ResSharingScopeType)get_store().find_element_user(RESSHARINGSCOPE$8, 0);
            if (target == null)
            {
                target = (com.sun.java.xml.ns.javaee.ResSharingScopeType)get_store().add_element_user(RESSHARINGSCOPE$8);
            }
            target.set(resSharingScope);
        }
    }
    
    /**
     * Appends and returns a new empty "res-sharing-scope" element
     */
    public com.sun.java.xml.ns.javaee.ResSharingScopeType addNewResSharingScope()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.javaee.ResSharingScopeType target = null;
            target = (com.sun.java.xml.ns.javaee.ResSharingScopeType)get_store().add_element_user(RESSHARINGSCOPE$8);
            return target;
        }
    }
    
    /**
     * Unsets the "res-sharing-scope" element
     */
    public void unsetResSharingScope()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(RESSHARINGSCOPE$8, 0);
        }
    }
    
    /**
     * Gets the "mapped-name" element
     */
    public com.sun.java.xml.ns.javaee.XsdStringType getMappedName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.javaee.XsdStringType target = null;
            target = (com.sun.java.xml.ns.javaee.XsdStringType)get_store().find_element_user(MAPPEDNAME$10, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "mapped-name" element
     */
    public boolean isSetMappedName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(MAPPEDNAME$10) != 0;
        }
    }
    
    /**
     * Sets the "mapped-name" element
     */
    public void setMappedName(com.sun.java.xml.ns.javaee.XsdStringType mappedName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.javaee.XsdStringType target = null;
            target = (com.sun.java.xml.ns.javaee.XsdStringType)get_store().find_element_user(MAPPEDNAME$10, 0);
            if (target == null)
            {
                target = (com.sun.java.xml.ns.javaee.XsdStringType)get_store().add_element_user(MAPPEDNAME$10);
            }
            target.set(mappedName);
        }
    }
    
    /**
     * Appends and returns a new empty "mapped-name" element
     */
    public com.sun.java.xml.ns.javaee.XsdStringType addNewMappedName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.javaee.XsdStringType target = null;
            target = (com.sun.java.xml.ns.javaee.XsdStringType)get_store().add_element_user(MAPPEDNAME$10);
            return target;
        }
    }
    
    /**
     * Unsets the "mapped-name" element
     */
    public void unsetMappedName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(MAPPEDNAME$10, 0);
        }
    }
    
    /**
     * Gets a List of "injection-target" elements
     */
    public java.util.List<com.sun.java.xml.ns.javaee.InjectionTargetType> getInjectionTargetList()
    {
        final class InjectionTargetList extends java.util.AbstractList<com.sun.java.xml.ns.javaee.InjectionTargetType>
        {
            public com.sun.java.xml.ns.javaee.InjectionTargetType get(int i)
                { return ResourceRefTypeImpl.this.getInjectionTargetArray(i); }
            
            public com.sun.java.xml.ns.javaee.InjectionTargetType set(int i, com.sun.java.xml.ns.javaee.InjectionTargetType o)
            {
                com.sun.java.xml.ns.javaee.InjectionTargetType old = ResourceRefTypeImpl.this.getInjectionTargetArray(i);
                ResourceRefTypeImpl.this.setInjectionTargetArray(i, o);
                return old;
            }
            
            public void add(int i, com.sun.java.xml.ns.javaee.InjectionTargetType o)
                { ResourceRefTypeImpl.this.insertNewInjectionTarget(i).set(o); }
            
            public com.sun.java.xml.ns.javaee.InjectionTargetType remove(int i)
            {
                com.sun.java.xml.ns.javaee.InjectionTargetType old = ResourceRefTypeImpl.this.getInjectionTargetArray(i);
                ResourceRefTypeImpl.this.removeInjectionTarget(i);
                return old;
            }
            
            public int size()
                { return ResourceRefTypeImpl.this.sizeOfInjectionTargetArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new InjectionTargetList();
        }
    }
    
    /**
     * Gets array of all "injection-target" elements
     * @deprecated
     */
    public com.sun.java.xml.ns.javaee.InjectionTargetType[] getInjectionTargetArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List<com.sun.java.xml.ns.javaee.InjectionTargetType> targetList = new java.util.ArrayList<com.sun.java.xml.ns.javaee.InjectionTargetType>();
            get_store().find_all_element_users(INJECTIONTARGET$12, targetList);
            com.sun.java.xml.ns.javaee.InjectionTargetType[] result = new com.sun.java.xml.ns.javaee.InjectionTargetType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "injection-target" element
     */
    public com.sun.java.xml.ns.javaee.InjectionTargetType getInjectionTargetArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.javaee.InjectionTargetType target = null;
            target = (com.sun.java.xml.ns.javaee.InjectionTargetType)get_store().find_element_user(INJECTIONTARGET$12, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "injection-target" element
     */
    public int sizeOfInjectionTargetArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(INJECTIONTARGET$12);
        }
    }
    
    /**
     * Sets array of all "injection-target" element
     */
    public void setInjectionTargetArray(com.sun.java.xml.ns.javaee.InjectionTargetType[] injectionTargetArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(injectionTargetArray, INJECTIONTARGET$12);
        }
    }
    
    /**
     * Sets ith "injection-target" element
     */
    public void setInjectionTargetArray(int i, com.sun.java.xml.ns.javaee.InjectionTargetType injectionTarget)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.javaee.InjectionTargetType target = null;
            target = (com.sun.java.xml.ns.javaee.InjectionTargetType)get_store().find_element_user(INJECTIONTARGET$12, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(injectionTarget);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "injection-target" element
     */
    public com.sun.java.xml.ns.javaee.InjectionTargetType insertNewInjectionTarget(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.javaee.InjectionTargetType target = null;
            target = (com.sun.java.xml.ns.javaee.InjectionTargetType)get_store().insert_element_user(INJECTIONTARGET$12, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "injection-target" element
     */
    public com.sun.java.xml.ns.javaee.InjectionTargetType addNewInjectionTarget()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.javaee.InjectionTargetType target = null;
            target = (com.sun.java.xml.ns.javaee.InjectionTargetType)get_store().add_element_user(INJECTIONTARGET$12);
            return target;
        }
    }
    
    /**
     * Removes the ith "injection-target" element
     */
    public void removeInjectionTarget(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(INJECTIONTARGET$12, i);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ID$14);
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
            target = (org.apache.xmlbeans.XmlID)get_store().find_attribute_user(ID$14);
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
            return get_store().find_attribute_user(ID$14) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ID$14);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ID$14);
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
            target = (org.apache.xmlbeans.XmlID)get_store().find_attribute_user(ID$14);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlID)get_store().add_attribute_user(ID$14);
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
            get_store().remove_attribute(ID$14);
        }
    }
}
