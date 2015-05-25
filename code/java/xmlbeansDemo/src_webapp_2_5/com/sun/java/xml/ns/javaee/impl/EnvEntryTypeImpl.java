/*
 * XML Type:  env-entryType
 * Namespace: http://java.sun.com/xml/ns/javaee
 * Java type: com.sun.java.xml.ns.javaee.EnvEntryType
 *
 * Automatically generated - do not modify.
 */
package com.sun.java.xml.ns.javaee.impl;
/**
 * An XML env-entryType(@http://java.sun.com/xml/ns/javaee).
 *
 * This is a complex type.
 */
public class EnvEntryTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.sun.java.xml.ns.javaee.EnvEntryType
{
    private static final long serialVersionUID = 1L;
    
    public EnvEntryTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DESCRIPTION$0 = 
        new javax.xml.namespace.QName("http://java.sun.com/xml/ns/javaee", "description");
    private static final javax.xml.namespace.QName ENVENTRYNAME$2 = 
        new javax.xml.namespace.QName("http://java.sun.com/xml/ns/javaee", "env-entry-name");
    private static final javax.xml.namespace.QName ENVENTRYTYPE$4 = 
        new javax.xml.namespace.QName("http://java.sun.com/xml/ns/javaee", "env-entry-type");
    private static final javax.xml.namespace.QName ENVENTRYVALUE$6 = 
        new javax.xml.namespace.QName("http://java.sun.com/xml/ns/javaee", "env-entry-value");
    private static final javax.xml.namespace.QName MAPPEDNAME$8 = 
        new javax.xml.namespace.QName("http://java.sun.com/xml/ns/javaee", "mapped-name");
    private static final javax.xml.namespace.QName INJECTIONTARGET$10 = 
        new javax.xml.namespace.QName("http://java.sun.com/xml/ns/javaee", "injection-target");
    private static final javax.xml.namespace.QName ID$12 = 
        new javax.xml.namespace.QName("", "id");
    
    
    /**
     * Gets a List of "description" elements
     */
    public java.util.List<com.sun.java.xml.ns.javaee.DescriptionType> getDescriptionList()
    {
        final class DescriptionList extends java.util.AbstractList<com.sun.java.xml.ns.javaee.DescriptionType>
        {
            public com.sun.java.xml.ns.javaee.DescriptionType get(int i)
                { return EnvEntryTypeImpl.this.getDescriptionArray(i); }
            
            public com.sun.java.xml.ns.javaee.DescriptionType set(int i, com.sun.java.xml.ns.javaee.DescriptionType o)
            {
                com.sun.java.xml.ns.javaee.DescriptionType old = EnvEntryTypeImpl.this.getDescriptionArray(i);
                EnvEntryTypeImpl.this.setDescriptionArray(i, o);
                return old;
            }
            
            public void add(int i, com.sun.java.xml.ns.javaee.DescriptionType o)
                { EnvEntryTypeImpl.this.insertNewDescription(i).set(o); }
            
            public com.sun.java.xml.ns.javaee.DescriptionType remove(int i)
            {
                com.sun.java.xml.ns.javaee.DescriptionType old = EnvEntryTypeImpl.this.getDescriptionArray(i);
                EnvEntryTypeImpl.this.removeDescription(i);
                return old;
            }
            
            public int size()
                { return EnvEntryTypeImpl.this.sizeOfDescriptionArray(); }
            
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
     * Gets the "env-entry-name" element
     */
    public com.sun.java.xml.ns.javaee.JndiNameType getEnvEntryName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.javaee.JndiNameType target = null;
            target = (com.sun.java.xml.ns.javaee.JndiNameType)get_store().find_element_user(ENVENTRYNAME$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "env-entry-name" element
     */
    public void setEnvEntryName(com.sun.java.xml.ns.javaee.JndiNameType envEntryName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.javaee.JndiNameType target = null;
            target = (com.sun.java.xml.ns.javaee.JndiNameType)get_store().find_element_user(ENVENTRYNAME$2, 0);
            if (target == null)
            {
                target = (com.sun.java.xml.ns.javaee.JndiNameType)get_store().add_element_user(ENVENTRYNAME$2);
            }
            target.set(envEntryName);
        }
    }
    
    /**
     * Appends and returns a new empty "env-entry-name" element
     */
    public com.sun.java.xml.ns.javaee.JndiNameType addNewEnvEntryName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.javaee.JndiNameType target = null;
            target = (com.sun.java.xml.ns.javaee.JndiNameType)get_store().add_element_user(ENVENTRYNAME$2);
            return target;
        }
    }
    
    /**
     * Gets the "env-entry-type" element
     */
    public com.sun.java.xml.ns.javaee.EnvEntryTypeValuesType getEnvEntryType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.javaee.EnvEntryTypeValuesType target = null;
            target = (com.sun.java.xml.ns.javaee.EnvEntryTypeValuesType)get_store().find_element_user(ENVENTRYTYPE$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "env-entry-type" element
     */
    public boolean isSetEnvEntryType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ENVENTRYTYPE$4) != 0;
        }
    }
    
    /**
     * Sets the "env-entry-type" element
     */
    public void setEnvEntryType(com.sun.java.xml.ns.javaee.EnvEntryTypeValuesType envEntryType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.javaee.EnvEntryTypeValuesType target = null;
            target = (com.sun.java.xml.ns.javaee.EnvEntryTypeValuesType)get_store().find_element_user(ENVENTRYTYPE$4, 0);
            if (target == null)
            {
                target = (com.sun.java.xml.ns.javaee.EnvEntryTypeValuesType)get_store().add_element_user(ENVENTRYTYPE$4);
            }
            target.set(envEntryType);
        }
    }
    
    /**
     * Appends and returns a new empty "env-entry-type" element
     */
    public com.sun.java.xml.ns.javaee.EnvEntryTypeValuesType addNewEnvEntryType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.javaee.EnvEntryTypeValuesType target = null;
            target = (com.sun.java.xml.ns.javaee.EnvEntryTypeValuesType)get_store().add_element_user(ENVENTRYTYPE$4);
            return target;
        }
    }
    
    /**
     * Unsets the "env-entry-type" element
     */
    public void unsetEnvEntryType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ENVENTRYTYPE$4, 0);
        }
    }
    
    /**
     * Gets the "env-entry-value" element
     */
    public com.sun.java.xml.ns.javaee.XsdStringType getEnvEntryValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.javaee.XsdStringType target = null;
            target = (com.sun.java.xml.ns.javaee.XsdStringType)get_store().find_element_user(ENVENTRYVALUE$6, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "env-entry-value" element
     */
    public boolean isSetEnvEntryValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ENVENTRYVALUE$6) != 0;
        }
    }
    
    /**
     * Sets the "env-entry-value" element
     */
    public void setEnvEntryValue(com.sun.java.xml.ns.javaee.XsdStringType envEntryValue)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.javaee.XsdStringType target = null;
            target = (com.sun.java.xml.ns.javaee.XsdStringType)get_store().find_element_user(ENVENTRYVALUE$6, 0);
            if (target == null)
            {
                target = (com.sun.java.xml.ns.javaee.XsdStringType)get_store().add_element_user(ENVENTRYVALUE$6);
            }
            target.set(envEntryValue);
        }
    }
    
    /**
     * Appends and returns a new empty "env-entry-value" element
     */
    public com.sun.java.xml.ns.javaee.XsdStringType addNewEnvEntryValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.javaee.XsdStringType target = null;
            target = (com.sun.java.xml.ns.javaee.XsdStringType)get_store().add_element_user(ENVENTRYVALUE$6);
            return target;
        }
    }
    
    /**
     * Unsets the "env-entry-value" element
     */
    public void unsetEnvEntryValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ENVENTRYVALUE$6, 0);
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
            target = (com.sun.java.xml.ns.javaee.XsdStringType)get_store().find_element_user(MAPPEDNAME$8, 0);
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
            return get_store().count_elements(MAPPEDNAME$8) != 0;
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
            target = (com.sun.java.xml.ns.javaee.XsdStringType)get_store().find_element_user(MAPPEDNAME$8, 0);
            if (target == null)
            {
                target = (com.sun.java.xml.ns.javaee.XsdStringType)get_store().add_element_user(MAPPEDNAME$8);
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
            target = (com.sun.java.xml.ns.javaee.XsdStringType)get_store().add_element_user(MAPPEDNAME$8);
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
            get_store().remove_element(MAPPEDNAME$8, 0);
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
                { return EnvEntryTypeImpl.this.getInjectionTargetArray(i); }
            
            public com.sun.java.xml.ns.javaee.InjectionTargetType set(int i, com.sun.java.xml.ns.javaee.InjectionTargetType o)
            {
                com.sun.java.xml.ns.javaee.InjectionTargetType old = EnvEntryTypeImpl.this.getInjectionTargetArray(i);
                EnvEntryTypeImpl.this.setInjectionTargetArray(i, o);
                return old;
            }
            
            public void add(int i, com.sun.java.xml.ns.javaee.InjectionTargetType o)
                { EnvEntryTypeImpl.this.insertNewInjectionTarget(i).set(o); }
            
            public com.sun.java.xml.ns.javaee.InjectionTargetType remove(int i)
            {
                com.sun.java.xml.ns.javaee.InjectionTargetType old = EnvEntryTypeImpl.this.getInjectionTargetArray(i);
                EnvEntryTypeImpl.this.removeInjectionTarget(i);
                return old;
            }
            
            public int size()
                { return EnvEntryTypeImpl.this.sizeOfInjectionTargetArray(); }
            
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
            get_store().find_all_element_users(INJECTIONTARGET$10, targetList);
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
            target = (com.sun.java.xml.ns.javaee.InjectionTargetType)get_store().find_element_user(INJECTIONTARGET$10, i);
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
            return get_store().count_elements(INJECTIONTARGET$10);
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
            arraySetterHelper(injectionTargetArray, INJECTIONTARGET$10);
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
            target = (com.sun.java.xml.ns.javaee.InjectionTargetType)get_store().find_element_user(INJECTIONTARGET$10, i);
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
            target = (com.sun.java.xml.ns.javaee.InjectionTargetType)get_store().insert_element_user(INJECTIONTARGET$10, i);
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
            target = (com.sun.java.xml.ns.javaee.InjectionTargetType)get_store().add_element_user(INJECTIONTARGET$10);
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
            get_store().remove_element(INJECTIONTARGET$10, i);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ID$12);
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
            target = (org.apache.xmlbeans.XmlID)get_store().find_attribute_user(ID$12);
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
            return get_store().find_attribute_user(ID$12) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ID$12);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ID$12);
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
            target = (org.apache.xmlbeans.XmlID)get_store().find_attribute_user(ID$12);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlID)get_store().add_attribute_user(ID$12);
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
            get_store().remove_attribute(ID$12);
        }
    }
}
