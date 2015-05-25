/*
 * XML Type:  persistence-context-refType
 * Namespace: http://java.sun.com/xml/ns/javaee
 * Java type: com.sun.java.xml.ns.javaee.PersistenceContextRefType
 *
 * Automatically generated - do not modify.
 */
package com.sun.java.xml.ns.javaee.impl;
/**
 * An XML persistence-context-refType(@http://java.sun.com/xml/ns/javaee).
 *
 * This is a complex type.
 */
public class PersistenceContextRefTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.sun.java.xml.ns.javaee.PersistenceContextRefType
{
    private static final long serialVersionUID = 1L;
    
    public PersistenceContextRefTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DESCRIPTION$0 = 
        new javax.xml.namespace.QName("http://java.sun.com/xml/ns/javaee", "description");
    private static final javax.xml.namespace.QName PERSISTENCECONTEXTREFNAME$2 = 
        new javax.xml.namespace.QName("http://java.sun.com/xml/ns/javaee", "persistence-context-ref-name");
    private static final javax.xml.namespace.QName PERSISTENCEUNITNAME$4 = 
        new javax.xml.namespace.QName("http://java.sun.com/xml/ns/javaee", "persistence-unit-name");
    private static final javax.xml.namespace.QName PERSISTENCECONTEXTTYPE$6 = 
        new javax.xml.namespace.QName("http://java.sun.com/xml/ns/javaee", "persistence-context-type");
    private static final javax.xml.namespace.QName PERSISTENCEPROPERTY$8 = 
        new javax.xml.namespace.QName("http://java.sun.com/xml/ns/javaee", "persistence-property");
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
                { return PersistenceContextRefTypeImpl.this.getDescriptionArray(i); }
            
            public com.sun.java.xml.ns.javaee.DescriptionType set(int i, com.sun.java.xml.ns.javaee.DescriptionType o)
            {
                com.sun.java.xml.ns.javaee.DescriptionType old = PersistenceContextRefTypeImpl.this.getDescriptionArray(i);
                PersistenceContextRefTypeImpl.this.setDescriptionArray(i, o);
                return old;
            }
            
            public void add(int i, com.sun.java.xml.ns.javaee.DescriptionType o)
                { PersistenceContextRefTypeImpl.this.insertNewDescription(i).set(o); }
            
            public com.sun.java.xml.ns.javaee.DescriptionType remove(int i)
            {
                com.sun.java.xml.ns.javaee.DescriptionType old = PersistenceContextRefTypeImpl.this.getDescriptionArray(i);
                PersistenceContextRefTypeImpl.this.removeDescription(i);
                return old;
            }
            
            public int size()
                { return PersistenceContextRefTypeImpl.this.sizeOfDescriptionArray(); }
            
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
     * Gets the "persistence-context-ref-name" element
     */
    public com.sun.java.xml.ns.javaee.JndiNameType getPersistenceContextRefName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.javaee.JndiNameType target = null;
            target = (com.sun.java.xml.ns.javaee.JndiNameType)get_store().find_element_user(PERSISTENCECONTEXTREFNAME$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "persistence-context-ref-name" element
     */
    public void setPersistenceContextRefName(com.sun.java.xml.ns.javaee.JndiNameType persistenceContextRefName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.javaee.JndiNameType target = null;
            target = (com.sun.java.xml.ns.javaee.JndiNameType)get_store().find_element_user(PERSISTENCECONTEXTREFNAME$2, 0);
            if (target == null)
            {
                target = (com.sun.java.xml.ns.javaee.JndiNameType)get_store().add_element_user(PERSISTENCECONTEXTREFNAME$2);
            }
            target.set(persistenceContextRefName);
        }
    }
    
    /**
     * Appends and returns a new empty "persistence-context-ref-name" element
     */
    public com.sun.java.xml.ns.javaee.JndiNameType addNewPersistenceContextRefName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.javaee.JndiNameType target = null;
            target = (com.sun.java.xml.ns.javaee.JndiNameType)get_store().add_element_user(PERSISTENCECONTEXTREFNAME$2);
            return target;
        }
    }
    
    /**
     * Gets the "persistence-unit-name" element
     */
    public com.sun.java.xml.ns.javaee.String getPersistenceUnitName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.javaee.String target = null;
            target = (com.sun.java.xml.ns.javaee.String)get_store().find_element_user(PERSISTENCEUNITNAME$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "persistence-unit-name" element
     */
    public boolean isSetPersistenceUnitName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PERSISTENCEUNITNAME$4) != 0;
        }
    }
    
    /**
     * Sets the "persistence-unit-name" element
     */
    public void setPersistenceUnitName(com.sun.java.xml.ns.javaee.String persistenceUnitName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.javaee.String target = null;
            target = (com.sun.java.xml.ns.javaee.String)get_store().find_element_user(PERSISTENCEUNITNAME$4, 0);
            if (target == null)
            {
                target = (com.sun.java.xml.ns.javaee.String)get_store().add_element_user(PERSISTENCEUNITNAME$4);
            }
            target.set(persistenceUnitName);
        }
    }
    
    /**
     * Appends and returns a new empty "persistence-unit-name" element
     */
    public com.sun.java.xml.ns.javaee.String addNewPersistenceUnitName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.javaee.String target = null;
            target = (com.sun.java.xml.ns.javaee.String)get_store().add_element_user(PERSISTENCEUNITNAME$4);
            return target;
        }
    }
    
    /**
     * Unsets the "persistence-unit-name" element
     */
    public void unsetPersistenceUnitName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PERSISTENCEUNITNAME$4, 0);
        }
    }
    
    /**
     * Gets the "persistence-context-type" element
     */
    public com.sun.java.xml.ns.javaee.PersistenceContextTypeType getPersistenceContextType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.javaee.PersistenceContextTypeType target = null;
            target = (com.sun.java.xml.ns.javaee.PersistenceContextTypeType)get_store().find_element_user(PERSISTENCECONTEXTTYPE$6, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "persistence-context-type" element
     */
    public boolean isSetPersistenceContextType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PERSISTENCECONTEXTTYPE$6) != 0;
        }
    }
    
    /**
     * Sets the "persistence-context-type" element
     */
    public void setPersistenceContextType(com.sun.java.xml.ns.javaee.PersistenceContextTypeType persistenceContextType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.javaee.PersistenceContextTypeType target = null;
            target = (com.sun.java.xml.ns.javaee.PersistenceContextTypeType)get_store().find_element_user(PERSISTENCECONTEXTTYPE$6, 0);
            if (target == null)
            {
                target = (com.sun.java.xml.ns.javaee.PersistenceContextTypeType)get_store().add_element_user(PERSISTENCECONTEXTTYPE$6);
            }
            target.set(persistenceContextType);
        }
    }
    
    /**
     * Appends and returns a new empty "persistence-context-type" element
     */
    public com.sun.java.xml.ns.javaee.PersistenceContextTypeType addNewPersistenceContextType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.javaee.PersistenceContextTypeType target = null;
            target = (com.sun.java.xml.ns.javaee.PersistenceContextTypeType)get_store().add_element_user(PERSISTENCECONTEXTTYPE$6);
            return target;
        }
    }
    
    /**
     * Unsets the "persistence-context-type" element
     */
    public void unsetPersistenceContextType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PERSISTENCECONTEXTTYPE$6, 0);
        }
    }
    
    /**
     * Gets a List of "persistence-property" elements
     */
    public java.util.List<com.sun.java.xml.ns.javaee.PropertyType> getPersistencePropertyList()
    {
        final class PersistencePropertyList extends java.util.AbstractList<com.sun.java.xml.ns.javaee.PropertyType>
        {
            public com.sun.java.xml.ns.javaee.PropertyType get(int i)
                { return PersistenceContextRefTypeImpl.this.getPersistencePropertyArray(i); }
            
            public com.sun.java.xml.ns.javaee.PropertyType set(int i, com.sun.java.xml.ns.javaee.PropertyType o)
            {
                com.sun.java.xml.ns.javaee.PropertyType old = PersistenceContextRefTypeImpl.this.getPersistencePropertyArray(i);
                PersistenceContextRefTypeImpl.this.setPersistencePropertyArray(i, o);
                return old;
            }
            
            public void add(int i, com.sun.java.xml.ns.javaee.PropertyType o)
                { PersistenceContextRefTypeImpl.this.insertNewPersistenceProperty(i).set(o); }
            
            public com.sun.java.xml.ns.javaee.PropertyType remove(int i)
            {
                com.sun.java.xml.ns.javaee.PropertyType old = PersistenceContextRefTypeImpl.this.getPersistencePropertyArray(i);
                PersistenceContextRefTypeImpl.this.removePersistenceProperty(i);
                return old;
            }
            
            public int size()
                { return PersistenceContextRefTypeImpl.this.sizeOfPersistencePropertyArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new PersistencePropertyList();
        }
    }
    
    /**
     * Gets array of all "persistence-property" elements
     * @deprecated
     */
    public com.sun.java.xml.ns.javaee.PropertyType[] getPersistencePropertyArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List<com.sun.java.xml.ns.javaee.PropertyType> targetList = new java.util.ArrayList<com.sun.java.xml.ns.javaee.PropertyType>();
            get_store().find_all_element_users(PERSISTENCEPROPERTY$8, targetList);
            com.sun.java.xml.ns.javaee.PropertyType[] result = new com.sun.java.xml.ns.javaee.PropertyType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "persistence-property" element
     */
    public com.sun.java.xml.ns.javaee.PropertyType getPersistencePropertyArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.javaee.PropertyType target = null;
            target = (com.sun.java.xml.ns.javaee.PropertyType)get_store().find_element_user(PERSISTENCEPROPERTY$8, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "persistence-property" element
     */
    public int sizeOfPersistencePropertyArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PERSISTENCEPROPERTY$8);
        }
    }
    
    /**
     * Sets array of all "persistence-property" element
     */
    public void setPersistencePropertyArray(com.sun.java.xml.ns.javaee.PropertyType[] persistencePropertyArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(persistencePropertyArray, PERSISTENCEPROPERTY$8);
        }
    }
    
    /**
     * Sets ith "persistence-property" element
     */
    public void setPersistencePropertyArray(int i, com.sun.java.xml.ns.javaee.PropertyType persistenceProperty)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.javaee.PropertyType target = null;
            target = (com.sun.java.xml.ns.javaee.PropertyType)get_store().find_element_user(PERSISTENCEPROPERTY$8, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(persistenceProperty);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "persistence-property" element
     */
    public com.sun.java.xml.ns.javaee.PropertyType insertNewPersistenceProperty(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.javaee.PropertyType target = null;
            target = (com.sun.java.xml.ns.javaee.PropertyType)get_store().insert_element_user(PERSISTENCEPROPERTY$8, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "persistence-property" element
     */
    public com.sun.java.xml.ns.javaee.PropertyType addNewPersistenceProperty()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.javaee.PropertyType target = null;
            target = (com.sun.java.xml.ns.javaee.PropertyType)get_store().add_element_user(PERSISTENCEPROPERTY$8);
            return target;
        }
    }
    
    /**
     * Removes the ith "persistence-property" element
     */
    public void removePersistenceProperty(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PERSISTENCEPROPERTY$8, i);
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
                { return PersistenceContextRefTypeImpl.this.getInjectionTargetArray(i); }
            
            public com.sun.java.xml.ns.javaee.InjectionTargetType set(int i, com.sun.java.xml.ns.javaee.InjectionTargetType o)
            {
                com.sun.java.xml.ns.javaee.InjectionTargetType old = PersistenceContextRefTypeImpl.this.getInjectionTargetArray(i);
                PersistenceContextRefTypeImpl.this.setInjectionTargetArray(i, o);
                return old;
            }
            
            public void add(int i, com.sun.java.xml.ns.javaee.InjectionTargetType o)
                { PersistenceContextRefTypeImpl.this.insertNewInjectionTarget(i).set(o); }
            
            public com.sun.java.xml.ns.javaee.InjectionTargetType remove(int i)
            {
                com.sun.java.xml.ns.javaee.InjectionTargetType old = PersistenceContextRefTypeImpl.this.getInjectionTargetArray(i);
                PersistenceContextRefTypeImpl.this.removeInjectionTarget(i);
                return old;
            }
            
            public int size()
                { return PersistenceContextRefTypeImpl.this.sizeOfInjectionTargetArray(); }
            
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
