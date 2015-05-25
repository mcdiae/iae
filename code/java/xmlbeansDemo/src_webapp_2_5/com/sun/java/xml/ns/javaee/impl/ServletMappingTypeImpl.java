/*
 * XML Type:  servlet-mappingType
 * Namespace: http://java.sun.com/xml/ns/javaee
 * Java type: com.sun.java.xml.ns.javaee.ServletMappingType
 *
 * Automatically generated - do not modify.
 */
package com.sun.java.xml.ns.javaee.impl;
/**
 * An XML servlet-mappingType(@http://java.sun.com/xml/ns/javaee).
 *
 * This is a complex type.
 */
public class ServletMappingTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.sun.java.xml.ns.javaee.ServletMappingType
{
    private static final long serialVersionUID = 1L;
    
    public ServletMappingTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SERVLETNAME$0 = 
        new javax.xml.namespace.QName("http://java.sun.com/xml/ns/javaee", "servlet-name");
    private static final javax.xml.namespace.QName URLPATTERN$2 = 
        new javax.xml.namespace.QName("http://java.sun.com/xml/ns/javaee", "url-pattern");
    private static final javax.xml.namespace.QName ID$4 = 
        new javax.xml.namespace.QName("", "id");
    
    
    /**
     * Gets the "servlet-name" element
     */
    public com.sun.java.xml.ns.javaee.ServletNameType getServletName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.javaee.ServletNameType target = null;
            target = (com.sun.java.xml.ns.javaee.ServletNameType)get_store().find_element_user(SERVLETNAME$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "servlet-name" element
     */
    public void setServletName(com.sun.java.xml.ns.javaee.ServletNameType servletName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.javaee.ServletNameType target = null;
            target = (com.sun.java.xml.ns.javaee.ServletNameType)get_store().find_element_user(SERVLETNAME$0, 0);
            if (target == null)
            {
                target = (com.sun.java.xml.ns.javaee.ServletNameType)get_store().add_element_user(SERVLETNAME$0);
            }
            target.set(servletName);
        }
    }
    
    /**
     * Appends and returns a new empty "servlet-name" element
     */
    public com.sun.java.xml.ns.javaee.ServletNameType addNewServletName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.javaee.ServletNameType target = null;
            target = (com.sun.java.xml.ns.javaee.ServletNameType)get_store().add_element_user(SERVLETNAME$0);
            return target;
        }
    }
    
    /**
     * Gets a List of "url-pattern" elements
     */
    public java.util.List<com.sun.java.xml.ns.javaee.UrlPatternType> getUrlPatternList()
    {
        final class UrlPatternList extends java.util.AbstractList<com.sun.java.xml.ns.javaee.UrlPatternType>
        {
            public com.sun.java.xml.ns.javaee.UrlPatternType get(int i)
                { return ServletMappingTypeImpl.this.getUrlPatternArray(i); }
            
            public com.sun.java.xml.ns.javaee.UrlPatternType set(int i, com.sun.java.xml.ns.javaee.UrlPatternType o)
            {
                com.sun.java.xml.ns.javaee.UrlPatternType old = ServletMappingTypeImpl.this.getUrlPatternArray(i);
                ServletMappingTypeImpl.this.setUrlPatternArray(i, o);
                return old;
            }
            
            public void add(int i, com.sun.java.xml.ns.javaee.UrlPatternType o)
                { ServletMappingTypeImpl.this.insertNewUrlPattern(i).set(o); }
            
            public com.sun.java.xml.ns.javaee.UrlPatternType remove(int i)
            {
                com.sun.java.xml.ns.javaee.UrlPatternType old = ServletMappingTypeImpl.this.getUrlPatternArray(i);
                ServletMappingTypeImpl.this.removeUrlPattern(i);
                return old;
            }
            
            public int size()
                { return ServletMappingTypeImpl.this.sizeOfUrlPatternArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new UrlPatternList();
        }
    }
    
    /**
     * Gets array of all "url-pattern" elements
     * @deprecated
     */
    public com.sun.java.xml.ns.javaee.UrlPatternType[] getUrlPatternArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List<com.sun.java.xml.ns.javaee.UrlPatternType> targetList = new java.util.ArrayList<com.sun.java.xml.ns.javaee.UrlPatternType>();
            get_store().find_all_element_users(URLPATTERN$2, targetList);
            com.sun.java.xml.ns.javaee.UrlPatternType[] result = new com.sun.java.xml.ns.javaee.UrlPatternType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "url-pattern" element
     */
    public com.sun.java.xml.ns.javaee.UrlPatternType getUrlPatternArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.javaee.UrlPatternType target = null;
            target = (com.sun.java.xml.ns.javaee.UrlPatternType)get_store().find_element_user(URLPATTERN$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "url-pattern" element
     */
    public int sizeOfUrlPatternArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(URLPATTERN$2);
        }
    }
    
    /**
     * Sets array of all "url-pattern" element
     */
    public void setUrlPatternArray(com.sun.java.xml.ns.javaee.UrlPatternType[] urlPatternArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(urlPatternArray, URLPATTERN$2);
        }
    }
    
    /**
     * Sets ith "url-pattern" element
     */
    public void setUrlPatternArray(int i, com.sun.java.xml.ns.javaee.UrlPatternType urlPattern)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.javaee.UrlPatternType target = null;
            target = (com.sun.java.xml.ns.javaee.UrlPatternType)get_store().find_element_user(URLPATTERN$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(urlPattern);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "url-pattern" element
     */
    public com.sun.java.xml.ns.javaee.UrlPatternType insertNewUrlPattern(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.javaee.UrlPatternType target = null;
            target = (com.sun.java.xml.ns.javaee.UrlPatternType)get_store().insert_element_user(URLPATTERN$2, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "url-pattern" element
     */
    public com.sun.java.xml.ns.javaee.UrlPatternType addNewUrlPattern()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.javaee.UrlPatternType target = null;
            target = (com.sun.java.xml.ns.javaee.UrlPatternType)get_store().add_element_user(URLPATTERN$2);
            return target;
        }
    }
    
    /**
     * Removes the ith "url-pattern" element
     */
    public void removeUrlPattern(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(URLPATTERN$2, i);
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
