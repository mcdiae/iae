/*
 * XML Type:  message-destination-refType
 * Namespace: http://java.sun.com/xml/ns/javaee
 * Java type: com.sun.java.xml.ns.javaee.MessageDestinationRefType
 *
 * Automatically generated - do not modify.
 */
package com.sun.java.xml.ns.javaee.impl;
/**
 * An XML message-destination-refType(@http://java.sun.com/xml/ns/javaee).
 *
 * This is a complex type.
 */
public class MessageDestinationRefTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.sun.java.xml.ns.javaee.MessageDestinationRefType
{
    private static final long serialVersionUID = 1L;
    
    public MessageDestinationRefTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DESCRIPTION$0 = 
        new javax.xml.namespace.QName("http://java.sun.com/xml/ns/javaee", "description");
    private static final javax.xml.namespace.QName MESSAGEDESTINATIONREFNAME$2 = 
        new javax.xml.namespace.QName("http://java.sun.com/xml/ns/javaee", "message-destination-ref-name");
    private static final javax.xml.namespace.QName MESSAGEDESTINATIONTYPE$4 = 
        new javax.xml.namespace.QName("http://java.sun.com/xml/ns/javaee", "message-destination-type");
    private static final javax.xml.namespace.QName MESSAGEDESTINATIONUSAGE$6 = 
        new javax.xml.namespace.QName("http://java.sun.com/xml/ns/javaee", "message-destination-usage");
    private static final javax.xml.namespace.QName MESSAGEDESTINATIONLINK$8 = 
        new javax.xml.namespace.QName("http://java.sun.com/xml/ns/javaee", "message-destination-link");
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
                { return MessageDestinationRefTypeImpl.this.getDescriptionArray(i); }
            
            public com.sun.java.xml.ns.javaee.DescriptionType set(int i, com.sun.java.xml.ns.javaee.DescriptionType o)
            {
                com.sun.java.xml.ns.javaee.DescriptionType old = MessageDestinationRefTypeImpl.this.getDescriptionArray(i);
                MessageDestinationRefTypeImpl.this.setDescriptionArray(i, o);
                return old;
            }
            
            public void add(int i, com.sun.java.xml.ns.javaee.DescriptionType o)
                { MessageDestinationRefTypeImpl.this.insertNewDescription(i).set(o); }
            
            public com.sun.java.xml.ns.javaee.DescriptionType remove(int i)
            {
                com.sun.java.xml.ns.javaee.DescriptionType old = MessageDestinationRefTypeImpl.this.getDescriptionArray(i);
                MessageDestinationRefTypeImpl.this.removeDescription(i);
                return old;
            }
            
            public int size()
                { return MessageDestinationRefTypeImpl.this.sizeOfDescriptionArray(); }
            
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
     * Gets the "message-destination-ref-name" element
     */
    public com.sun.java.xml.ns.javaee.JndiNameType getMessageDestinationRefName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.javaee.JndiNameType target = null;
            target = (com.sun.java.xml.ns.javaee.JndiNameType)get_store().find_element_user(MESSAGEDESTINATIONREFNAME$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "message-destination-ref-name" element
     */
    public void setMessageDestinationRefName(com.sun.java.xml.ns.javaee.JndiNameType messageDestinationRefName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.javaee.JndiNameType target = null;
            target = (com.sun.java.xml.ns.javaee.JndiNameType)get_store().find_element_user(MESSAGEDESTINATIONREFNAME$2, 0);
            if (target == null)
            {
                target = (com.sun.java.xml.ns.javaee.JndiNameType)get_store().add_element_user(MESSAGEDESTINATIONREFNAME$2);
            }
            target.set(messageDestinationRefName);
        }
    }
    
    /**
     * Appends and returns a new empty "message-destination-ref-name" element
     */
    public com.sun.java.xml.ns.javaee.JndiNameType addNewMessageDestinationRefName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.javaee.JndiNameType target = null;
            target = (com.sun.java.xml.ns.javaee.JndiNameType)get_store().add_element_user(MESSAGEDESTINATIONREFNAME$2);
            return target;
        }
    }
    
    /**
     * Gets the "message-destination-type" element
     */
    public com.sun.java.xml.ns.javaee.MessageDestinationTypeType getMessageDestinationType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.javaee.MessageDestinationTypeType target = null;
            target = (com.sun.java.xml.ns.javaee.MessageDestinationTypeType)get_store().find_element_user(MESSAGEDESTINATIONTYPE$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "message-destination-type" element
     */
    public boolean isSetMessageDestinationType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(MESSAGEDESTINATIONTYPE$4) != 0;
        }
    }
    
    /**
     * Sets the "message-destination-type" element
     */
    public void setMessageDestinationType(com.sun.java.xml.ns.javaee.MessageDestinationTypeType messageDestinationType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.javaee.MessageDestinationTypeType target = null;
            target = (com.sun.java.xml.ns.javaee.MessageDestinationTypeType)get_store().find_element_user(MESSAGEDESTINATIONTYPE$4, 0);
            if (target == null)
            {
                target = (com.sun.java.xml.ns.javaee.MessageDestinationTypeType)get_store().add_element_user(MESSAGEDESTINATIONTYPE$4);
            }
            target.set(messageDestinationType);
        }
    }
    
    /**
     * Appends and returns a new empty "message-destination-type" element
     */
    public com.sun.java.xml.ns.javaee.MessageDestinationTypeType addNewMessageDestinationType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.javaee.MessageDestinationTypeType target = null;
            target = (com.sun.java.xml.ns.javaee.MessageDestinationTypeType)get_store().add_element_user(MESSAGEDESTINATIONTYPE$4);
            return target;
        }
    }
    
    /**
     * Unsets the "message-destination-type" element
     */
    public void unsetMessageDestinationType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(MESSAGEDESTINATIONTYPE$4, 0);
        }
    }
    
    /**
     * Gets the "message-destination-usage" element
     */
    public com.sun.java.xml.ns.javaee.MessageDestinationUsageType getMessageDestinationUsage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.javaee.MessageDestinationUsageType target = null;
            target = (com.sun.java.xml.ns.javaee.MessageDestinationUsageType)get_store().find_element_user(MESSAGEDESTINATIONUSAGE$6, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "message-destination-usage" element
     */
    public boolean isSetMessageDestinationUsage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(MESSAGEDESTINATIONUSAGE$6) != 0;
        }
    }
    
    /**
     * Sets the "message-destination-usage" element
     */
    public void setMessageDestinationUsage(com.sun.java.xml.ns.javaee.MessageDestinationUsageType messageDestinationUsage)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.javaee.MessageDestinationUsageType target = null;
            target = (com.sun.java.xml.ns.javaee.MessageDestinationUsageType)get_store().find_element_user(MESSAGEDESTINATIONUSAGE$6, 0);
            if (target == null)
            {
                target = (com.sun.java.xml.ns.javaee.MessageDestinationUsageType)get_store().add_element_user(MESSAGEDESTINATIONUSAGE$6);
            }
            target.set(messageDestinationUsage);
        }
    }
    
    /**
     * Appends and returns a new empty "message-destination-usage" element
     */
    public com.sun.java.xml.ns.javaee.MessageDestinationUsageType addNewMessageDestinationUsage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.javaee.MessageDestinationUsageType target = null;
            target = (com.sun.java.xml.ns.javaee.MessageDestinationUsageType)get_store().add_element_user(MESSAGEDESTINATIONUSAGE$6);
            return target;
        }
    }
    
    /**
     * Unsets the "message-destination-usage" element
     */
    public void unsetMessageDestinationUsage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(MESSAGEDESTINATIONUSAGE$6, 0);
        }
    }
    
    /**
     * Gets the "message-destination-link" element
     */
    public com.sun.java.xml.ns.javaee.MessageDestinationLinkType getMessageDestinationLink()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.javaee.MessageDestinationLinkType target = null;
            target = (com.sun.java.xml.ns.javaee.MessageDestinationLinkType)get_store().find_element_user(MESSAGEDESTINATIONLINK$8, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "message-destination-link" element
     */
    public boolean isSetMessageDestinationLink()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(MESSAGEDESTINATIONLINK$8) != 0;
        }
    }
    
    /**
     * Sets the "message-destination-link" element
     */
    public void setMessageDestinationLink(com.sun.java.xml.ns.javaee.MessageDestinationLinkType messageDestinationLink)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.javaee.MessageDestinationLinkType target = null;
            target = (com.sun.java.xml.ns.javaee.MessageDestinationLinkType)get_store().find_element_user(MESSAGEDESTINATIONLINK$8, 0);
            if (target == null)
            {
                target = (com.sun.java.xml.ns.javaee.MessageDestinationLinkType)get_store().add_element_user(MESSAGEDESTINATIONLINK$8);
            }
            target.set(messageDestinationLink);
        }
    }
    
    /**
     * Appends and returns a new empty "message-destination-link" element
     */
    public com.sun.java.xml.ns.javaee.MessageDestinationLinkType addNewMessageDestinationLink()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.javaee.MessageDestinationLinkType target = null;
            target = (com.sun.java.xml.ns.javaee.MessageDestinationLinkType)get_store().add_element_user(MESSAGEDESTINATIONLINK$8);
            return target;
        }
    }
    
    /**
     * Unsets the "message-destination-link" element
     */
    public void unsetMessageDestinationLink()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(MESSAGEDESTINATIONLINK$8, 0);
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
                { return MessageDestinationRefTypeImpl.this.getInjectionTargetArray(i); }
            
            public com.sun.java.xml.ns.javaee.InjectionTargetType set(int i, com.sun.java.xml.ns.javaee.InjectionTargetType o)
            {
                com.sun.java.xml.ns.javaee.InjectionTargetType old = MessageDestinationRefTypeImpl.this.getInjectionTargetArray(i);
                MessageDestinationRefTypeImpl.this.setInjectionTargetArray(i, o);
                return old;
            }
            
            public void add(int i, com.sun.java.xml.ns.javaee.InjectionTargetType o)
                { MessageDestinationRefTypeImpl.this.insertNewInjectionTarget(i).set(o); }
            
            public com.sun.java.xml.ns.javaee.InjectionTargetType remove(int i)
            {
                com.sun.java.xml.ns.javaee.InjectionTargetType old = MessageDestinationRefTypeImpl.this.getInjectionTargetArray(i);
                MessageDestinationRefTypeImpl.this.removeInjectionTarget(i);
                return old;
            }
            
            public int size()
                { return MessageDestinationRefTypeImpl.this.sizeOfInjectionTargetArray(); }
            
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
