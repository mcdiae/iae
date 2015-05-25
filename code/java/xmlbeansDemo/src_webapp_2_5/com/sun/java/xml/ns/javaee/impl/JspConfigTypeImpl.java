/*
 * XML Type:  jsp-configType
 * Namespace: http://java.sun.com/xml/ns/javaee
 * Java type: com.sun.java.xml.ns.javaee.JspConfigType
 *
 * Automatically generated - do not modify.
 */
package com.sun.java.xml.ns.javaee.impl;
/**
 * An XML jsp-configType(@http://java.sun.com/xml/ns/javaee).
 *
 * This is a complex type.
 */
public class JspConfigTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.sun.java.xml.ns.javaee.JspConfigType
{
    private static final long serialVersionUID = 1L;
    
    public JspConfigTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TAGLIB$0 = 
        new javax.xml.namespace.QName("http://java.sun.com/xml/ns/javaee", "taglib");
    private static final javax.xml.namespace.QName JSPPROPERTYGROUP$2 = 
        new javax.xml.namespace.QName("http://java.sun.com/xml/ns/javaee", "jsp-property-group");
    private static final javax.xml.namespace.QName ID$4 = 
        new javax.xml.namespace.QName("", "id");
    
    
    /**
     * Gets a List of "taglib" elements
     */
    public java.util.List<com.sun.java.xml.ns.javaee.TaglibType> getTaglibList()
    {
        final class TaglibList extends java.util.AbstractList<com.sun.java.xml.ns.javaee.TaglibType>
        {
            public com.sun.java.xml.ns.javaee.TaglibType get(int i)
                { return JspConfigTypeImpl.this.getTaglibArray(i); }
            
            public com.sun.java.xml.ns.javaee.TaglibType set(int i, com.sun.java.xml.ns.javaee.TaglibType o)
            {
                com.sun.java.xml.ns.javaee.TaglibType old = JspConfigTypeImpl.this.getTaglibArray(i);
                JspConfigTypeImpl.this.setTaglibArray(i, o);
                return old;
            }
            
            public void add(int i, com.sun.java.xml.ns.javaee.TaglibType o)
                { JspConfigTypeImpl.this.insertNewTaglib(i).set(o); }
            
            public com.sun.java.xml.ns.javaee.TaglibType remove(int i)
            {
                com.sun.java.xml.ns.javaee.TaglibType old = JspConfigTypeImpl.this.getTaglibArray(i);
                JspConfigTypeImpl.this.removeTaglib(i);
                return old;
            }
            
            public int size()
                { return JspConfigTypeImpl.this.sizeOfTaglibArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new TaglibList();
        }
    }
    
    /**
     * Gets array of all "taglib" elements
     * @deprecated
     */
    public com.sun.java.xml.ns.javaee.TaglibType[] getTaglibArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List<com.sun.java.xml.ns.javaee.TaglibType> targetList = new java.util.ArrayList<com.sun.java.xml.ns.javaee.TaglibType>();
            get_store().find_all_element_users(TAGLIB$0, targetList);
            com.sun.java.xml.ns.javaee.TaglibType[] result = new com.sun.java.xml.ns.javaee.TaglibType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "taglib" element
     */
    public com.sun.java.xml.ns.javaee.TaglibType getTaglibArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.javaee.TaglibType target = null;
            target = (com.sun.java.xml.ns.javaee.TaglibType)get_store().find_element_user(TAGLIB$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "taglib" element
     */
    public int sizeOfTaglibArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TAGLIB$0);
        }
    }
    
    /**
     * Sets array of all "taglib" element
     */
    public void setTaglibArray(com.sun.java.xml.ns.javaee.TaglibType[] taglibArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(taglibArray, TAGLIB$0);
        }
    }
    
    /**
     * Sets ith "taglib" element
     */
    public void setTaglibArray(int i, com.sun.java.xml.ns.javaee.TaglibType taglib)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.javaee.TaglibType target = null;
            target = (com.sun.java.xml.ns.javaee.TaglibType)get_store().find_element_user(TAGLIB$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(taglib);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "taglib" element
     */
    public com.sun.java.xml.ns.javaee.TaglibType insertNewTaglib(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.javaee.TaglibType target = null;
            target = (com.sun.java.xml.ns.javaee.TaglibType)get_store().insert_element_user(TAGLIB$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "taglib" element
     */
    public com.sun.java.xml.ns.javaee.TaglibType addNewTaglib()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.javaee.TaglibType target = null;
            target = (com.sun.java.xml.ns.javaee.TaglibType)get_store().add_element_user(TAGLIB$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "taglib" element
     */
    public void removeTaglib(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TAGLIB$0, i);
        }
    }
    
    /**
     * Gets a List of "jsp-property-group" elements
     */
    public java.util.List<com.sun.java.xml.ns.javaee.JspPropertyGroupType> getJspPropertyGroupList()
    {
        final class JspPropertyGroupList extends java.util.AbstractList<com.sun.java.xml.ns.javaee.JspPropertyGroupType>
        {
            public com.sun.java.xml.ns.javaee.JspPropertyGroupType get(int i)
                { return JspConfigTypeImpl.this.getJspPropertyGroupArray(i); }
            
            public com.sun.java.xml.ns.javaee.JspPropertyGroupType set(int i, com.sun.java.xml.ns.javaee.JspPropertyGroupType o)
            {
                com.sun.java.xml.ns.javaee.JspPropertyGroupType old = JspConfigTypeImpl.this.getJspPropertyGroupArray(i);
                JspConfigTypeImpl.this.setJspPropertyGroupArray(i, o);
                return old;
            }
            
            public void add(int i, com.sun.java.xml.ns.javaee.JspPropertyGroupType o)
                { JspConfigTypeImpl.this.insertNewJspPropertyGroup(i).set(o); }
            
            public com.sun.java.xml.ns.javaee.JspPropertyGroupType remove(int i)
            {
                com.sun.java.xml.ns.javaee.JspPropertyGroupType old = JspConfigTypeImpl.this.getJspPropertyGroupArray(i);
                JspConfigTypeImpl.this.removeJspPropertyGroup(i);
                return old;
            }
            
            public int size()
                { return JspConfigTypeImpl.this.sizeOfJspPropertyGroupArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new JspPropertyGroupList();
        }
    }
    
    /**
     * Gets array of all "jsp-property-group" elements
     * @deprecated
     */
    public com.sun.java.xml.ns.javaee.JspPropertyGroupType[] getJspPropertyGroupArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List<com.sun.java.xml.ns.javaee.JspPropertyGroupType> targetList = new java.util.ArrayList<com.sun.java.xml.ns.javaee.JspPropertyGroupType>();
            get_store().find_all_element_users(JSPPROPERTYGROUP$2, targetList);
            com.sun.java.xml.ns.javaee.JspPropertyGroupType[] result = new com.sun.java.xml.ns.javaee.JspPropertyGroupType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "jsp-property-group" element
     */
    public com.sun.java.xml.ns.javaee.JspPropertyGroupType getJspPropertyGroupArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.javaee.JspPropertyGroupType target = null;
            target = (com.sun.java.xml.ns.javaee.JspPropertyGroupType)get_store().find_element_user(JSPPROPERTYGROUP$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "jsp-property-group" element
     */
    public int sizeOfJspPropertyGroupArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(JSPPROPERTYGROUP$2);
        }
    }
    
    /**
     * Sets array of all "jsp-property-group" element
     */
    public void setJspPropertyGroupArray(com.sun.java.xml.ns.javaee.JspPropertyGroupType[] jspPropertyGroupArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(jspPropertyGroupArray, JSPPROPERTYGROUP$2);
        }
    }
    
    /**
     * Sets ith "jsp-property-group" element
     */
    public void setJspPropertyGroupArray(int i, com.sun.java.xml.ns.javaee.JspPropertyGroupType jspPropertyGroup)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.javaee.JspPropertyGroupType target = null;
            target = (com.sun.java.xml.ns.javaee.JspPropertyGroupType)get_store().find_element_user(JSPPROPERTYGROUP$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(jspPropertyGroup);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "jsp-property-group" element
     */
    public com.sun.java.xml.ns.javaee.JspPropertyGroupType insertNewJspPropertyGroup(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.javaee.JspPropertyGroupType target = null;
            target = (com.sun.java.xml.ns.javaee.JspPropertyGroupType)get_store().insert_element_user(JSPPROPERTYGROUP$2, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "jsp-property-group" element
     */
    public com.sun.java.xml.ns.javaee.JspPropertyGroupType addNewJspPropertyGroup()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.javaee.JspPropertyGroupType target = null;
            target = (com.sun.java.xml.ns.javaee.JspPropertyGroupType)get_store().add_element_user(JSPPROPERTYGROUP$2);
            return target;
        }
    }
    
    /**
     * Removes the ith "jsp-property-group" element
     */
    public void removeJspPropertyGroup(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(JSPPROPERTYGROUP$2, i);
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
