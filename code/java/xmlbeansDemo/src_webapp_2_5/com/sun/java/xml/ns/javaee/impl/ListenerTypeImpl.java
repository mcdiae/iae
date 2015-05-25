/*
 * XML Type:  listenerType
 * Namespace: http://java.sun.com/xml/ns/javaee
 * Java type: com.sun.java.xml.ns.javaee.ListenerType
 *
 * Automatically generated - do not modify.
 */
package com.sun.java.xml.ns.javaee.impl;
/**
 * An XML listenerType(@http://java.sun.com/xml/ns/javaee).
 *
 * This is a complex type.
 */
public class ListenerTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.sun.java.xml.ns.javaee.ListenerType
{
    private static final long serialVersionUID = 1L;
    
    public ListenerTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DESCRIPTION$0 = 
        new javax.xml.namespace.QName("http://java.sun.com/xml/ns/javaee", "description");
    private static final javax.xml.namespace.QName DISPLAYNAME$2 = 
        new javax.xml.namespace.QName("http://java.sun.com/xml/ns/javaee", "display-name");
    private static final javax.xml.namespace.QName ICON$4 = 
        new javax.xml.namespace.QName("http://java.sun.com/xml/ns/javaee", "icon");
    private static final javax.xml.namespace.QName LISTENERCLASS$6 = 
        new javax.xml.namespace.QName("http://java.sun.com/xml/ns/javaee", "listener-class");
    private static final javax.xml.namespace.QName ID$8 = 
        new javax.xml.namespace.QName("", "id");
    
    
    /**
     * Gets a List of "description" elements
     */
    public java.util.List<com.sun.java.xml.ns.javaee.DescriptionType> getDescriptionList()
    {
        final class DescriptionList extends java.util.AbstractList<com.sun.java.xml.ns.javaee.DescriptionType>
        {
            public com.sun.java.xml.ns.javaee.DescriptionType get(int i)
                { return ListenerTypeImpl.this.getDescriptionArray(i); }
            
            public com.sun.java.xml.ns.javaee.DescriptionType set(int i, com.sun.java.xml.ns.javaee.DescriptionType o)
            {
                com.sun.java.xml.ns.javaee.DescriptionType old = ListenerTypeImpl.this.getDescriptionArray(i);
                ListenerTypeImpl.this.setDescriptionArray(i, o);
                return old;
            }
            
            public void add(int i, com.sun.java.xml.ns.javaee.DescriptionType o)
                { ListenerTypeImpl.this.insertNewDescription(i).set(o); }
            
            public com.sun.java.xml.ns.javaee.DescriptionType remove(int i)
            {
                com.sun.java.xml.ns.javaee.DescriptionType old = ListenerTypeImpl.this.getDescriptionArray(i);
                ListenerTypeImpl.this.removeDescription(i);
                return old;
            }
            
            public int size()
                { return ListenerTypeImpl.this.sizeOfDescriptionArray(); }
            
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
     * Gets a List of "display-name" elements
     */
    public java.util.List<com.sun.java.xml.ns.javaee.DisplayNameType> getDisplayNameList()
    {
        final class DisplayNameList extends java.util.AbstractList<com.sun.java.xml.ns.javaee.DisplayNameType>
        {
            public com.sun.java.xml.ns.javaee.DisplayNameType get(int i)
                { return ListenerTypeImpl.this.getDisplayNameArray(i); }
            
            public com.sun.java.xml.ns.javaee.DisplayNameType set(int i, com.sun.java.xml.ns.javaee.DisplayNameType o)
            {
                com.sun.java.xml.ns.javaee.DisplayNameType old = ListenerTypeImpl.this.getDisplayNameArray(i);
                ListenerTypeImpl.this.setDisplayNameArray(i, o);
                return old;
            }
            
            public void add(int i, com.sun.java.xml.ns.javaee.DisplayNameType o)
                { ListenerTypeImpl.this.insertNewDisplayName(i).set(o); }
            
            public com.sun.java.xml.ns.javaee.DisplayNameType remove(int i)
            {
                com.sun.java.xml.ns.javaee.DisplayNameType old = ListenerTypeImpl.this.getDisplayNameArray(i);
                ListenerTypeImpl.this.removeDisplayName(i);
                return old;
            }
            
            public int size()
                { return ListenerTypeImpl.this.sizeOfDisplayNameArray(); }
            
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
            get_store().find_all_element_users(DISPLAYNAME$2, targetList);
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
            target = (com.sun.java.xml.ns.javaee.DisplayNameType)get_store().find_element_user(DISPLAYNAME$2, i);
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
            return get_store().count_elements(DISPLAYNAME$2);
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
            arraySetterHelper(displayNameArray, DISPLAYNAME$2);
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
            target = (com.sun.java.xml.ns.javaee.DisplayNameType)get_store().find_element_user(DISPLAYNAME$2, i);
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
            target = (com.sun.java.xml.ns.javaee.DisplayNameType)get_store().insert_element_user(DISPLAYNAME$2, i);
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
            target = (com.sun.java.xml.ns.javaee.DisplayNameType)get_store().add_element_user(DISPLAYNAME$2);
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
            get_store().remove_element(DISPLAYNAME$2, i);
        }
    }
    
    /**
     * Gets a List of "icon" elements
     */
    public java.util.List<com.sun.java.xml.ns.javaee.IconType> getIconList()
    {
        final class IconList extends java.util.AbstractList<com.sun.java.xml.ns.javaee.IconType>
        {
            public com.sun.java.xml.ns.javaee.IconType get(int i)
                { return ListenerTypeImpl.this.getIconArray(i); }
            
            public com.sun.java.xml.ns.javaee.IconType set(int i, com.sun.java.xml.ns.javaee.IconType o)
            {
                com.sun.java.xml.ns.javaee.IconType old = ListenerTypeImpl.this.getIconArray(i);
                ListenerTypeImpl.this.setIconArray(i, o);
                return old;
            }
            
            public void add(int i, com.sun.java.xml.ns.javaee.IconType o)
                { ListenerTypeImpl.this.insertNewIcon(i).set(o); }
            
            public com.sun.java.xml.ns.javaee.IconType remove(int i)
            {
                com.sun.java.xml.ns.javaee.IconType old = ListenerTypeImpl.this.getIconArray(i);
                ListenerTypeImpl.this.removeIcon(i);
                return old;
            }
            
            public int size()
                { return ListenerTypeImpl.this.sizeOfIconArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new IconList();
        }
    }
    
    /**
     * Gets array of all "icon" elements
     * @deprecated
     */
    public com.sun.java.xml.ns.javaee.IconType[] getIconArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List<com.sun.java.xml.ns.javaee.IconType> targetList = new java.util.ArrayList<com.sun.java.xml.ns.javaee.IconType>();
            get_store().find_all_element_users(ICON$4, targetList);
            com.sun.java.xml.ns.javaee.IconType[] result = new com.sun.java.xml.ns.javaee.IconType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "icon" element
     */
    public com.sun.java.xml.ns.javaee.IconType getIconArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.javaee.IconType target = null;
            target = (com.sun.java.xml.ns.javaee.IconType)get_store().find_element_user(ICON$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "icon" element
     */
    public int sizeOfIconArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ICON$4);
        }
    }
    
    /**
     * Sets array of all "icon" element
     */
    public void setIconArray(com.sun.java.xml.ns.javaee.IconType[] iconArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(iconArray, ICON$4);
        }
    }
    
    /**
     * Sets ith "icon" element
     */
    public void setIconArray(int i, com.sun.java.xml.ns.javaee.IconType icon)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.javaee.IconType target = null;
            target = (com.sun.java.xml.ns.javaee.IconType)get_store().find_element_user(ICON$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(icon);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "icon" element
     */
    public com.sun.java.xml.ns.javaee.IconType insertNewIcon(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.javaee.IconType target = null;
            target = (com.sun.java.xml.ns.javaee.IconType)get_store().insert_element_user(ICON$4, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "icon" element
     */
    public com.sun.java.xml.ns.javaee.IconType addNewIcon()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.javaee.IconType target = null;
            target = (com.sun.java.xml.ns.javaee.IconType)get_store().add_element_user(ICON$4);
            return target;
        }
    }
    
    /**
     * Removes the ith "icon" element
     */
    public void removeIcon(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ICON$4, i);
        }
    }
    
    /**
     * Gets the "listener-class" element
     */
    public com.sun.java.xml.ns.javaee.FullyQualifiedClassType getListenerClass()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.javaee.FullyQualifiedClassType target = null;
            target = (com.sun.java.xml.ns.javaee.FullyQualifiedClassType)get_store().find_element_user(LISTENERCLASS$6, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "listener-class" element
     */
    public void setListenerClass(com.sun.java.xml.ns.javaee.FullyQualifiedClassType listenerClass)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.javaee.FullyQualifiedClassType target = null;
            target = (com.sun.java.xml.ns.javaee.FullyQualifiedClassType)get_store().find_element_user(LISTENERCLASS$6, 0);
            if (target == null)
            {
                target = (com.sun.java.xml.ns.javaee.FullyQualifiedClassType)get_store().add_element_user(LISTENERCLASS$6);
            }
            target.set(listenerClass);
        }
    }
    
    /**
     * Appends and returns a new empty "listener-class" element
     */
    public com.sun.java.xml.ns.javaee.FullyQualifiedClassType addNewListenerClass()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.javaee.FullyQualifiedClassType target = null;
            target = (com.sun.java.xml.ns.javaee.FullyQualifiedClassType)get_store().add_element_user(LISTENERCLASS$6);
            return target;
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
