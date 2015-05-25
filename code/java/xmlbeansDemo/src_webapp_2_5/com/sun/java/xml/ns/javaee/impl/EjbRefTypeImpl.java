/*
 * XML Type:  ejb-refType
 * Namespace: http://java.sun.com/xml/ns/javaee
 * Java type: com.sun.java.xml.ns.javaee.EjbRefType
 *
 * Automatically generated - do not modify.
 */
package com.sun.java.xml.ns.javaee.impl;
/**
 * An XML ejb-refType(@http://java.sun.com/xml/ns/javaee).
 *
 * This is a complex type.
 */
public class EjbRefTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.sun.java.xml.ns.javaee.EjbRefType
{
    private static final long serialVersionUID = 1L;
    
    public EjbRefTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DESCRIPTION$0 = 
        new javax.xml.namespace.QName("http://java.sun.com/xml/ns/javaee", "description");
    private static final javax.xml.namespace.QName EJBREFNAME$2 = 
        new javax.xml.namespace.QName("http://java.sun.com/xml/ns/javaee", "ejb-ref-name");
    private static final javax.xml.namespace.QName EJBREFTYPE$4 = 
        new javax.xml.namespace.QName("http://java.sun.com/xml/ns/javaee", "ejb-ref-type");
    private static final javax.xml.namespace.QName HOME$6 = 
        new javax.xml.namespace.QName("http://java.sun.com/xml/ns/javaee", "home");
    private static final javax.xml.namespace.QName REMOTE$8 = 
        new javax.xml.namespace.QName("http://java.sun.com/xml/ns/javaee", "remote");
    private static final javax.xml.namespace.QName EJBLINK$10 = 
        new javax.xml.namespace.QName("http://java.sun.com/xml/ns/javaee", "ejb-link");
    private static final javax.xml.namespace.QName MAPPEDNAME$12 = 
        new javax.xml.namespace.QName("http://java.sun.com/xml/ns/javaee", "mapped-name");
    private static final javax.xml.namespace.QName INJECTIONTARGET$14 = 
        new javax.xml.namespace.QName("http://java.sun.com/xml/ns/javaee", "injection-target");
    private static final javax.xml.namespace.QName ID$16 = 
        new javax.xml.namespace.QName("", "id");
    
    
    /**
     * Gets a List of "description" elements
     */
    public java.util.List<com.sun.java.xml.ns.javaee.DescriptionType> getDescriptionList()
    {
        final class DescriptionList extends java.util.AbstractList<com.sun.java.xml.ns.javaee.DescriptionType>
        {
            public com.sun.java.xml.ns.javaee.DescriptionType get(int i)
                { return EjbRefTypeImpl.this.getDescriptionArray(i); }
            
            public com.sun.java.xml.ns.javaee.DescriptionType set(int i, com.sun.java.xml.ns.javaee.DescriptionType o)
            {
                com.sun.java.xml.ns.javaee.DescriptionType old = EjbRefTypeImpl.this.getDescriptionArray(i);
                EjbRefTypeImpl.this.setDescriptionArray(i, o);
                return old;
            }
            
            public void add(int i, com.sun.java.xml.ns.javaee.DescriptionType o)
                { EjbRefTypeImpl.this.insertNewDescription(i).set(o); }
            
            public com.sun.java.xml.ns.javaee.DescriptionType remove(int i)
            {
                com.sun.java.xml.ns.javaee.DescriptionType old = EjbRefTypeImpl.this.getDescriptionArray(i);
                EjbRefTypeImpl.this.removeDescription(i);
                return old;
            }
            
            public int size()
                { return EjbRefTypeImpl.this.sizeOfDescriptionArray(); }
            
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
     * Gets the "ejb-ref-name" element
     */
    public com.sun.java.xml.ns.javaee.EjbRefNameType getEjbRefName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.javaee.EjbRefNameType target = null;
            target = (com.sun.java.xml.ns.javaee.EjbRefNameType)get_store().find_element_user(EJBREFNAME$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "ejb-ref-name" element
     */
    public void setEjbRefName(com.sun.java.xml.ns.javaee.EjbRefNameType ejbRefName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.javaee.EjbRefNameType target = null;
            target = (com.sun.java.xml.ns.javaee.EjbRefNameType)get_store().find_element_user(EJBREFNAME$2, 0);
            if (target == null)
            {
                target = (com.sun.java.xml.ns.javaee.EjbRefNameType)get_store().add_element_user(EJBREFNAME$2);
            }
            target.set(ejbRefName);
        }
    }
    
    /**
     * Appends and returns a new empty "ejb-ref-name" element
     */
    public com.sun.java.xml.ns.javaee.EjbRefNameType addNewEjbRefName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.javaee.EjbRefNameType target = null;
            target = (com.sun.java.xml.ns.javaee.EjbRefNameType)get_store().add_element_user(EJBREFNAME$2);
            return target;
        }
    }
    
    /**
     * Gets the "ejb-ref-type" element
     */
    public com.sun.java.xml.ns.javaee.EjbRefTypeType getEjbRefType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.javaee.EjbRefTypeType target = null;
            target = (com.sun.java.xml.ns.javaee.EjbRefTypeType)get_store().find_element_user(EJBREFTYPE$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "ejb-ref-type" element
     */
    public boolean isSetEjbRefType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(EJBREFTYPE$4) != 0;
        }
    }
    
    /**
     * Sets the "ejb-ref-type" element
     */
    public void setEjbRefType(com.sun.java.xml.ns.javaee.EjbRefTypeType ejbRefType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.javaee.EjbRefTypeType target = null;
            target = (com.sun.java.xml.ns.javaee.EjbRefTypeType)get_store().find_element_user(EJBREFTYPE$4, 0);
            if (target == null)
            {
                target = (com.sun.java.xml.ns.javaee.EjbRefTypeType)get_store().add_element_user(EJBREFTYPE$4);
            }
            target.set(ejbRefType);
        }
    }
    
    /**
     * Appends and returns a new empty "ejb-ref-type" element
     */
    public com.sun.java.xml.ns.javaee.EjbRefTypeType addNewEjbRefType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.javaee.EjbRefTypeType target = null;
            target = (com.sun.java.xml.ns.javaee.EjbRefTypeType)get_store().add_element_user(EJBREFTYPE$4);
            return target;
        }
    }
    
    /**
     * Unsets the "ejb-ref-type" element
     */
    public void unsetEjbRefType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(EJBREFTYPE$4, 0);
        }
    }
    
    /**
     * Gets the "home" element
     */
    public com.sun.java.xml.ns.javaee.HomeType getHome()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.javaee.HomeType target = null;
            target = (com.sun.java.xml.ns.javaee.HomeType)get_store().find_element_user(HOME$6, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "home" element
     */
    public boolean isSetHome()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(HOME$6) != 0;
        }
    }
    
    /**
     * Sets the "home" element
     */
    public void setHome(com.sun.java.xml.ns.javaee.HomeType home)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.javaee.HomeType target = null;
            target = (com.sun.java.xml.ns.javaee.HomeType)get_store().find_element_user(HOME$6, 0);
            if (target == null)
            {
                target = (com.sun.java.xml.ns.javaee.HomeType)get_store().add_element_user(HOME$6);
            }
            target.set(home);
        }
    }
    
    /**
     * Appends and returns a new empty "home" element
     */
    public com.sun.java.xml.ns.javaee.HomeType addNewHome()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.javaee.HomeType target = null;
            target = (com.sun.java.xml.ns.javaee.HomeType)get_store().add_element_user(HOME$6);
            return target;
        }
    }
    
    /**
     * Unsets the "home" element
     */
    public void unsetHome()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(HOME$6, 0);
        }
    }
    
    /**
     * Gets the "remote" element
     */
    public com.sun.java.xml.ns.javaee.RemoteType getRemote()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.javaee.RemoteType target = null;
            target = (com.sun.java.xml.ns.javaee.RemoteType)get_store().find_element_user(REMOTE$8, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "remote" element
     */
    public boolean isSetRemote()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(REMOTE$8) != 0;
        }
    }
    
    /**
     * Sets the "remote" element
     */
    public void setRemote(com.sun.java.xml.ns.javaee.RemoteType remote)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.javaee.RemoteType target = null;
            target = (com.sun.java.xml.ns.javaee.RemoteType)get_store().find_element_user(REMOTE$8, 0);
            if (target == null)
            {
                target = (com.sun.java.xml.ns.javaee.RemoteType)get_store().add_element_user(REMOTE$8);
            }
            target.set(remote);
        }
    }
    
    /**
     * Appends and returns a new empty "remote" element
     */
    public com.sun.java.xml.ns.javaee.RemoteType addNewRemote()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.javaee.RemoteType target = null;
            target = (com.sun.java.xml.ns.javaee.RemoteType)get_store().add_element_user(REMOTE$8);
            return target;
        }
    }
    
    /**
     * Unsets the "remote" element
     */
    public void unsetRemote()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(REMOTE$8, 0);
        }
    }
    
    /**
     * Gets the "ejb-link" element
     */
    public com.sun.java.xml.ns.javaee.EjbLinkType getEjbLink()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.javaee.EjbLinkType target = null;
            target = (com.sun.java.xml.ns.javaee.EjbLinkType)get_store().find_element_user(EJBLINK$10, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "ejb-link" element
     */
    public boolean isSetEjbLink()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(EJBLINK$10) != 0;
        }
    }
    
    /**
     * Sets the "ejb-link" element
     */
    public void setEjbLink(com.sun.java.xml.ns.javaee.EjbLinkType ejbLink)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.javaee.EjbLinkType target = null;
            target = (com.sun.java.xml.ns.javaee.EjbLinkType)get_store().find_element_user(EJBLINK$10, 0);
            if (target == null)
            {
                target = (com.sun.java.xml.ns.javaee.EjbLinkType)get_store().add_element_user(EJBLINK$10);
            }
            target.set(ejbLink);
        }
    }
    
    /**
     * Appends and returns a new empty "ejb-link" element
     */
    public com.sun.java.xml.ns.javaee.EjbLinkType addNewEjbLink()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.javaee.EjbLinkType target = null;
            target = (com.sun.java.xml.ns.javaee.EjbLinkType)get_store().add_element_user(EJBLINK$10);
            return target;
        }
    }
    
    /**
     * Unsets the "ejb-link" element
     */
    public void unsetEjbLink()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(EJBLINK$10, 0);
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
            target = (com.sun.java.xml.ns.javaee.XsdStringType)get_store().find_element_user(MAPPEDNAME$12, 0);
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
            return get_store().count_elements(MAPPEDNAME$12) != 0;
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
            target = (com.sun.java.xml.ns.javaee.XsdStringType)get_store().find_element_user(MAPPEDNAME$12, 0);
            if (target == null)
            {
                target = (com.sun.java.xml.ns.javaee.XsdStringType)get_store().add_element_user(MAPPEDNAME$12);
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
            target = (com.sun.java.xml.ns.javaee.XsdStringType)get_store().add_element_user(MAPPEDNAME$12);
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
            get_store().remove_element(MAPPEDNAME$12, 0);
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
                { return EjbRefTypeImpl.this.getInjectionTargetArray(i); }
            
            public com.sun.java.xml.ns.javaee.InjectionTargetType set(int i, com.sun.java.xml.ns.javaee.InjectionTargetType o)
            {
                com.sun.java.xml.ns.javaee.InjectionTargetType old = EjbRefTypeImpl.this.getInjectionTargetArray(i);
                EjbRefTypeImpl.this.setInjectionTargetArray(i, o);
                return old;
            }
            
            public void add(int i, com.sun.java.xml.ns.javaee.InjectionTargetType o)
                { EjbRefTypeImpl.this.insertNewInjectionTarget(i).set(o); }
            
            public com.sun.java.xml.ns.javaee.InjectionTargetType remove(int i)
            {
                com.sun.java.xml.ns.javaee.InjectionTargetType old = EjbRefTypeImpl.this.getInjectionTargetArray(i);
                EjbRefTypeImpl.this.removeInjectionTarget(i);
                return old;
            }
            
            public int size()
                { return EjbRefTypeImpl.this.sizeOfInjectionTargetArray(); }
            
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
            get_store().find_all_element_users(INJECTIONTARGET$14, targetList);
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
            target = (com.sun.java.xml.ns.javaee.InjectionTargetType)get_store().find_element_user(INJECTIONTARGET$14, i);
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
            return get_store().count_elements(INJECTIONTARGET$14);
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
            arraySetterHelper(injectionTargetArray, INJECTIONTARGET$14);
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
            target = (com.sun.java.xml.ns.javaee.InjectionTargetType)get_store().find_element_user(INJECTIONTARGET$14, i);
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
            target = (com.sun.java.xml.ns.javaee.InjectionTargetType)get_store().insert_element_user(INJECTIONTARGET$14, i);
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
            target = (com.sun.java.xml.ns.javaee.InjectionTargetType)get_store().add_element_user(INJECTIONTARGET$14);
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
            get_store().remove_element(INJECTIONTARGET$14, i);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ID$16);
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
            target = (org.apache.xmlbeans.XmlID)get_store().find_attribute_user(ID$16);
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
            return get_store().find_attribute_user(ID$16) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ID$16);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ID$16);
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
            target = (org.apache.xmlbeans.XmlID)get_store().find_attribute_user(ID$16);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlID)get_store().add_attribute_user(ID$16);
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
            get_store().remove_attribute(ID$16);
        }
    }
}
