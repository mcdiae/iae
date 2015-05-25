/*
 * XML Type:  filter-mappingType
 * Namespace: http://java.sun.com/xml/ns/javaee
 * Java type: com.sun.java.xml.ns.javaee.FilterMappingType
 *
 * Automatically generated - do not modify.
 */
package com.sun.java.xml.ns.javaee.impl;
/**
 * An XML filter-mappingType(@http://java.sun.com/xml/ns/javaee).
 *
 * This is a complex type.
 */
public class FilterMappingTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.sun.java.xml.ns.javaee.FilterMappingType
{
    private static final long serialVersionUID = 1L;
    
    public FilterMappingTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName FILTERNAME$0 = 
        new javax.xml.namespace.QName("http://java.sun.com/xml/ns/javaee", "filter-name");
    private static final javax.xml.namespace.QName URLPATTERN$2 = 
        new javax.xml.namespace.QName("http://java.sun.com/xml/ns/javaee", "url-pattern");
    private static final javax.xml.namespace.QName SERVLETNAME$4 = 
        new javax.xml.namespace.QName("http://java.sun.com/xml/ns/javaee", "servlet-name");
    private static final javax.xml.namespace.QName DISPATCHER$6 = 
        new javax.xml.namespace.QName("http://java.sun.com/xml/ns/javaee", "dispatcher");
    private static final javax.xml.namespace.QName ID$8 = 
        new javax.xml.namespace.QName("", "id");
    
    
    /**
     * Gets the "filter-name" element
     */
    public com.sun.java.xml.ns.javaee.FilterNameType getFilterName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.javaee.FilterNameType target = null;
            target = (com.sun.java.xml.ns.javaee.FilterNameType)get_store().find_element_user(FILTERNAME$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "filter-name" element
     */
    public void setFilterName(com.sun.java.xml.ns.javaee.FilterNameType filterName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.javaee.FilterNameType target = null;
            target = (com.sun.java.xml.ns.javaee.FilterNameType)get_store().find_element_user(FILTERNAME$0, 0);
            if (target == null)
            {
                target = (com.sun.java.xml.ns.javaee.FilterNameType)get_store().add_element_user(FILTERNAME$0);
            }
            target.set(filterName);
        }
    }
    
    /**
     * Appends and returns a new empty "filter-name" element
     */
    public com.sun.java.xml.ns.javaee.FilterNameType addNewFilterName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.javaee.FilterNameType target = null;
            target = (com.sun.java.xml.ns.javaee.FilterNameType)get_store().add_element_user(FILTERNAME$0);
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
                { return FilterMappingTypeImpl.this.getUrlPatternArray(i); }
            
            public com.sun.java.xml.ns.javaee.UrlPatternType set(int i, com.sun.java.xml.ns.javaee.UrlPatternType o)
            {
                com.sun.java.xml.ns.javaee.UrlPatternType old = FilterMappingTypeImpl.this.getUrlPatternArray(i);
                FilterMappingTypeImpl.this.setUrlPatternArray(i, o);
                return old;
            }
            
            public void add(int i, com.sun.java.xml.ns.javaee.UrlPatternType o)
                { FilterMappingTypeImpl.this.insertNewUrlPattern(i).set(o); }
            
            public com.sun.java.xml.ns.javaee.UrlPatternType remove(int i)
            {
                com.sun.java.xml.ns.javaee.UrlPatternType old = FilterMappingTypeImpl.this.getUrlPatternArray(i);
                FilterMappingTypeImpl.this.removeUrlPattern(i);
                return old;
            }
            
            public int size()
                { return FilterMappingTypeImpl.this.sizeOfUrlPatternArray(); }
            
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
     * Gets a List of "servlet-name" elements
     */
    public java.util.List<com.sun.java.xml.ns.javaee.ServletNameType> getServletNameList()
    {
        final class ServletNameList extends java.util.AbstractList<com.sun.java.xml.ns.javaee.ServletNameType>
        {
            public com.sun.java.xml.ns.javaee.ServletNameType get(int i)
                { return FilterMappingTypeImpl.this.getServletNameArray(i); }
            
            public com.sun.java.xml.ns.javaee.ServletNameType set(int i, com.sun.java.xml.ns.javaee.ServletNameType o)
            {
                com.sun.java.xml.ns.javaee.ServletNameType old = FilterMappingTypeImpl.this.getServletNameArray(i);
                FilterMappingTypeImpl.this.setServletNameArray(i, o);
                return old;
            }
            
            public void add(int i, com.sun.java.xml.ns.javaee.ServletNameType o)
                { FilterMappingTypeImpl.this.insertNewServletName(i).set(o); }
            
            public com.sun.java.xml.ns.javaee.ServletNameType remove(int i)
            {
                com.sun.java.xml.ns.javaee.ServletNameType old = FilterMappingTypeImpl.this.getServletNameArray(i);
                FilterMappingTypeImpl.this.removeServletName(i);
                return old;
            }
            
            public int size()
                { return FilterMappingTypeImpl.this.sizeOfServletNameArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new ServletNameList();
        }
    }
    
    /**
     * Gets array of all "servlet-name" elements
     * @deprecated
     */
    public com.sun.java.xml.ns.javaee.ServletNameType[] getServletNameArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List<com.sun.java.xml.ns.javaee.ServletNameType> targetList = new java.util.ArrayList<com.sun.java.xml.ns.javaee.ServletNameType>();
            get_store().find_all_element_users(SERVLETNAME$4, targetList);
            com.sun.java.xml.ns.javaee.ServletNameType[] result = new com.sun.java.xml.ns.javaee.ServletNameType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "servlet-name" element
     */
    public com.sun.java.xml.ns.javaee.ServletNameType getServletNameArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.javaee.ServletNameType target = null;
            target = (com.sun.java.xml.ns.javaee.ServletNameType)get_store().find_element_user(SERVLETNAME$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "servlet-name" element
     */
    public int sizeOfServletNameArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SERVLETNAME$4);
        }
    }
    
    /**
     * Sets array of all "servlet-name" element
     */
    public void setServletNameArray(com.sun.java.xml.ns.javaee.ServletNameType[] servletNameArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(servletNameArray, SERVLETNAME$4);
        }
    }
    
    /**
     * Sets ith "servlet-name" element
     */
    public void setServletNameArray(int i, com.sun.java.xml.ns.javaee.ServletNameType servletName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.javaee.ServletNameType target = null;
            target = (com.sun.java.xml.ns.javaee.ServletNameType)get_store().find_element_user(SERVLETNAME$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(servletName);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "servlet-name" element
     */
    public com.sun.java.xml.ns.javaee.ServletNameType insertNewServletName(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.javaee.ServletNameType target = null;
            target = (com.sun.java.xml.ns.javaee.ServletNameType)get_store().insert_element_user(SERVLETNAME$4, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "servlet-name" element
     */
    public com.sun.java.xml.ns.javaee.ServletNameType addNewServletName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.javaee.ServletNameType target = null;
            target = (com.sun.java.xml.ns.javaee.ServletNameType)get_store().add_element_user(SERVLETNAME$4);
            return target;
        }
    }
    
    /**
     * Removes the ith "servlet-name" element
     */
    public void removeServletName(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SERVLETNAME$4, i);
        }
    }
    
    /**
     * Gets a List of "dispatcher" elements
     */
    public java.util.List<com.sun.java.xml.ns.javaee.DispatcherType> getDispatcherList()
    {
        final class DispatcherList extends java.util.AbstractList<com.sun.java.xml.ns.javaee.DispatcherType>
        {
            public com.sun.java.xml.ns.javaee.DispatcherType get(int i)
                { return FilterMappingTypeImpl.this.getDispatcherArray(i); }
            
            public com.sun.java.xml.ns.javaee.DispatcherType set(int i, com.sun.java.xml.ns.javaee.DispatcherType o)
            {
                com.sun.java.xml.ns.javaee.DispatcherType old = FilterMappingTypeImpl.this.getDispatcherArray(i);
                FilterMappingTypeImpl.this.setDispatcherArray(i, o);
                return old;
            }
            
            public void add(int i, com.sun.java.xml.ns.javaee.DispatcherType o)
                { FilterMappingTypeImpl.this.insertNewDispatcher(i).set(o); }
            
            public com.sun.java.xml.ns.javaee.DispatcherType remove(int i)
            {
                com.sun.java.xml.ns.javaee.DispatcherType old = FilterMappingTypeImpl.this.getDispatcherArray(i);
                FilterMappingTypeImpl.this.removeDispatcher(i);
                return old;
            }
            
            public int size()
                { return FilterMappingTypeImpl.this.sizeOfDispatcherArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new DispatcherList();
        }
    }
    
    /**
     * Gets array of all "dispatcher" elements
     * @deprecated
     */
    public com.sun.java.xml.ns.javaee.DispatcherType[] getDispatcherArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List<com.sun.java.xml.ns.javaee.DispatcherType> targetList = new java.util.ArrayList<com.sun.java.xml.ns.javaee.DispatcherType>();
            get_store().find_all_element_users(DISPATCHER$6, targetList);
            com.sun.java.xml.ns.javaee.DispatcherType[] result = new com.sun.java.xml.ns.javaee.DispatcherType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "dispatcher" element
     */
    public com.sun.java.xml.ns.javaee.DispatcherType getDispatcherArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.javaee.DispatcherType target = null;
            target = (com.sun.java.xml.ns.javaee.DispatcherType)get_store().find_element_user(DISPATCHER$6, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "dispatcher" element
     */
    public int sizeOfDispatcherArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DISPATCHER$6);
        }
    }
    
    /**
     * Sets array of all "dispatcher" element
     */
    public void setDispatcherArray(com.sun.java.xml.ns.javaee.DispatcherType[] dispatcherArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(dispatcherArray, DISPATCHER$6);
        }
    }
    
    /**
     * Sets ith "dispatcher" element
     */
    public void setDispatcherArray(int i, com.sun.java.xml.ns.javaee.DispatcherType dispatcher)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.javaee.DispatcherType target = null;
            target = (com.sun.java.xml.ns.javaee.DispatcherType)get_store().find_element_user(DISPATCHER$6, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(dispatcher);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "dispatcher" element
     */
    public com.sun.java.xml.ns.javaee.DispatcherType insertNewDispatcher(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.javaee.DispatcherType target = null;
            target = (com.sun.java.xml.ns.javaee.DispatcherType)get_store().insert_element_user(DISPATCHER$6, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "dispatcher" element
     */
    public com.sun.java.xml.ns.javaee.DispatcherType addNewDispatcher()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.javaee.DispatcherType target = null;
            target = (com.sun.java.xml.ns.javaee.DispatcherType)get_store().add_element_user(DISPATCHER$6);
            return target;
        }
    }
    
    /**
     * Removes the ith "dispatcher" element
     */
    public void removeDispatcher(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DISPATCHER$6, i);
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
