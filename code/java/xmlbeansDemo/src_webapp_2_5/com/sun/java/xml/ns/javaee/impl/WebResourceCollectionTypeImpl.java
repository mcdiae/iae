/*
 * XML Type:  web-resource-collectionType
 * Namespace: http://java.sun.com/xml/ns/javaee
 * Java type: com.sun.java.xml.ns.javaee.WebResourceCollectionType
 *
 * Automatically generated - do not modify.
 */
package com.sun.java.xml.ns.javaee.impl;
/**
 * An XML web-resource-collectionType(@http://java.sun.com/xml/ns/javaee).
 *
 * This is a complex type.
 */
public class WebResourceCollectionTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.sun.java.xml.ns.javaee.WebResourceCollectionType
{
    private static final long serialVersionUID = 1L;
    
    public WebResourceCollectionTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName WEBRESOURCENAME$0 = 
        new javax.xml.namespace.QName("http://java.sun.com/xml/ns/javaee", "web-resource-name");
    private static final javax.xml.namespace.QName DESCRIPTION$2 = 
        new javax.xml.namespace.QName("http://java.sun.com/xml/ns/javaee", "description");
    private static final javax.xml.namespace.QName URLPATTERN$4 = 
        new javax.xml.namespace.QName("http://java.sun.com/xml/ns/javaee", "url-pattern");
    private static final javax.xml.namespace.QName HTTPMETHOD$6 = 
        new javax.xml.namespace.QName("http://java.sun.com/xml/ns/javaee", "http-method");
    private static final javax.xml.namespace.QName ID$8 = 
        new javax.xml.namespace.QName("", "id");
    
    
    /**
     * Gets the "web-resource-name" element
     */
    public com.sun.java.xml.ns.javaee.String getWebResourceName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.javaee.String target = null;
            target = (com.sun.java.xml.ns.javaee.String)get_store().find_element_user(WEBRESOURCENAME$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "web-resource-name" element
     */
    public void setWebResourceName(com.sun.java.xml.ns.javaee.String webResourceName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.javaee.String target = null;
            target = (com.sun.java.xml.ns.javaee.String)get_store().find_element_user(WEBRESOURCENAME$0, 0);
            if (target == null)
            {
                target = (com.sun.java.xml.ns.javaee.String)get_store().add_element_user(WEBRESOURCENAME$0);
            }
            target.set(webResourceName);
        }
    }
    
    /**
     * Appends and returns a new empty "web-resource-name" element
     */
    public com.sun.java.xml.ns.javaee.String addNewWebResourceName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.javaee.String target = null;
            target = (com.sun.java.xml.ns.javaee.String)get_store().add_element_user(WEBRESOURCENAME$0);
            return target;
        }
    }
    
    /**
     * Gets a List of "description" elements
     */
    public java.util.List<com.sun.java.xml.ns.javaee.DescriptionType> getDescriptionList()
    {
        final class DescriptionList extends java.util.AbstractList<com.sun.java.xml.ns.javaee.DescriptionType>
        {
            public com.sun.java.xml.ns.javaee.DescriptionType get(int i)
                { return WebResourceCollectionTypeImpl.this.getDescriptionArray(i); }
            
            public com.sun.java.xml.ns.javaee.DescriptionType set(int i, com.sun.java.xml.ns.javaee.DescriptionType o)
            {
                com.sun.java.xml.ns.javaee.DescriptionType old = WebResourceCollectionTypeImpl.this.getDescriptionArray(i);
                WebResourceCollectionTypeImpl.this.setDescriptionArray(i, o);
                return old;
            }
            
            public void add(int i, com.sun.java.xml.ns.javaee.DescriptionType o)
                { WebResourceCollectionTypeImpl.this.insertNewDescription(i).set(o); }
            
            public com.sun.java.xml.ns.javaee.DescriptionType remove(int i)
            {
                com.sun.java.xml.ns.javaee.DescriptionType old = WebResourceCollectionTypeImpl.this.getDescriptionArray(i);
                WebResourceCollectionTypeImpl.this.removeDescription(i);
                return old;
            }
            
            public int size()
                { return WebResourceCollectionTypeImpl.this.sizeOfDescriptionArray(); }
            
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
            get_store().find_all_element_users(DESCRIPTION$2, targetList);
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
            target = (com.sun.java.xml.ns.javaee.DescriptionType)get_store().find_element_user(DESCRIPTION$2, i);
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
            return get_store().count_elements(DESCRIPTION$2);
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
            arraySetterHelper(descriptionArray, DESCRIPTION$2);
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
            target = (com.sun.java.xml.ns.javaee.DescriptionType)get_store().find_element_user(DESCRIPTION$2, i);
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
            target = (com.sun.java.xml.ns.javaee.DescriptionType)get_store().insert_element_user(DESCRIPTION$2, i);
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
            target = (com.sun.java.xml.ns.javaee.DescriptionType)get_store().add_element_user(DESCRIPTION$2);
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
            get_store().remove_element(DESCRIPTION$2, i);
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
                { return WebResourceCollectionTypeImpl.this.getUrlPatternArray(i); }
            
            public com.sun.java.xml.ns.javaee.UrlPatternType set(int i, com.sun.java.xml.ns.javaee.UrlPatternType o)
            {
                com.sun.java.xml.ns.javaee.UrlPatternType old = WebResourceCollectionTypeImpl.this.getUrlPatternArray(i);
                WebResourceCollectionTypeImpl.this.setUrlPatternArray(i, o);
                return old;
            }
            
            public void add(int i, com.sun.java.xml.ns.javaee.UrlPatternType o)
                { WebResourceCollectionTypeImpl.this.insertNewUrlPattern(i).set(o); }
            
            public com.sun.java.xml.ns.javaee.UrlPatternType remove(int i)
            {
                com.sun.java.xml.ns.javaee.UrlPatternType old = WebResourceCollectionTypeImpl.this.getUrlPatternArray(i);
                WebResourceCollectionTypeImpl.this.removeUrlPattern(i);
                return old;
            }
            
            public int size()
                { return WebResourceCollectionTypeImpl.this.sizeOfUrlPatternArray(); }
            
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
            get_store().find_all_element_users(URLPATTERN$4, targetList);
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
            target = (com.sun.java.xml.ns.javaee.UrlPatternType)get_store().find_element_user(URLPATTERN$4, i);
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
            return get_store().count_elements(URLPATTERN$4);
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
            arraySetterHelper(urlPatternArray, URLPATTERN$4);
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
            target = (com.sun.java.xml.ns.javaee.UrlPatternType)get_store().find_element_user(URLPATTERN$4, i);
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
            target = (com.sun.java.xml.ns.javaee.UrlPatternType)get_store().insert_element_user(URLPATTERN$4, i);
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
            target = (com.sun.java.xml.ns.javaee.UrlPatternType)get_store().add_element_user(URLPATTERN$4);
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
            get_store().remove_element(URLPATTERN$4, i);
        }
    }
    
    /**
     * Gets a List of "http-method" elements
     */
    public java.util.List<java.lang.String> getHttpMethodList()
    {
        final class HttpMethodList extends java.util.AbstractList<java.lang.String>
        {
            public java.lang.String get(int i)
                { return WebResourceCollectionTypeImpl.this.getHttpMethodArray(i); }
            
            public java.lang.String set(int i, java.lang.String o)
            {
                java.lang.String old = WebResourceCollectionTypeImpl.this.getHttpMethodArray(i);
                WebResourceCollectionTypeImpl.this.setHttpMethodArray(i, o);
                return old;
            }
            
            public void add(int i, java.lang.String o)
                { WebResourceCollectionTypeImpl.this.insertHttpMethod(i, o); }
            
            public java.lang.String remove(int i)
            {
                java.lang.String old = WebResourceCollectionTypeImpl.this.getHttpMethodArray(i);
                WebResourceCollectionTypeImpl.this.removeHttpMethod(i);
                return old;
            }
            
            public int size()
                { return WebResourceCollectionTypeImpl.this.sizeOfHttpMethodArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new HttpMethodList();
        }
    }
    
    /**
     * Gets array of all "http-method" elements
     * @deprecated
     */
    public java.lang.String[] getHttpMethodArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List<com.sun.java.xml.ns.javaee.HttpMethodType> targetList = new java.util.ArrayList<com.sun.java.xml.ns.javaee.HttpMethodType>();
            get_store().find_all_element_users(HTTPMETHOD$6, targetList);
            java.lang.String[] result = new java.lang.String[targetList.size()];
            for (int i = 0, len = targetList.size() ; i < len ; i++)
                result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getStringValue();
            return result;
        }
    }
    
    /**
     * Gets ith "http-method" element
     */
    public java.lang.String getHttpMethodArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(HTTPMETHOD$6, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) a List of "http-method" elements
     */
    public java.util.List<com.sun.java.xml.ns.javaee.HttpMethodType> xgetHttpMethodList()
    {
        final class HttpMethodList extends java.util.AbstractList<com.sun.java.xml.ns.javaee.HttpMethodType>
        {
            public com.sun.java.xml.ns.javaee.HttpMethodType get(int i)
                { return WebResourceCollectionTypeImpl.this.xgetHttpMethodArray(i); }
            
            public com.sun.java.xml.ns.javaee.HttpMethodType set(int i, com.sun.java.xml.ns.javaee.HttpMethodType o)
            {
                com.sun.java.xml.ns.javaee.HttpMethodType old = WebResourceCollectionTypeImpl.this.xgetHttpMethodArray(i);
                WebResourceCollectionTypeImpl.this.xsetHttpMethodArray(i, o);
                return old;
            }
            
            public void add(int i, com.sun.java.xml.ns.javaee.HttpMethodType o)
                { WebResourceCollectionTypeImpl.this.insertNewHttpMethod(i).set(o); }
            
            public com.sun.java.xml.ns.javaee.HttpMethodType remove(int i)
            {
                com.sun.java.xml.ns.javaee.HttpMethodType old = WebResourceCollectionTypeImpl.this.xgetHttpMethodArray(i);
                WebResourceCollectionTypeImpl.this.removeHttpMethod(i);
                return old;
            }
            
            public int size()
                { return WebResourceCollectionTypeImpl.this.sizeOfHttpMethodArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new HttpMethodList();
        }
    }
    
    /**
     * Gets array of all "http-method" elements
     * @deprecated
     */
    public com.sun.java.xml.ns.javaee.HttpMethodType[] xgetHttpMethodArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List<com.sun.java.xml.ns.javaee.HttpMethodType> targetList = new java.util.ArrayList<com.sun.java.xml.ns.javaee.HttpMethodType>();
            get_store().find_all_element_users(HTTPMETHOD$6, targetList);
            com.sun.java.xml.ns.javaee.HttpMethodType[] result = new com.sun.java.xml.ns.javaee.HttpMethodType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets (as xml) ith "http-method" element
     */
    public com.sun.java.xml.ns.javaee.HttpMethodType xgetHttpMethodArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.javaee.HttpMethodType target = null;
            target = (com.sun.java.xml.ns.javaee.HttpMethodType)get_store().find_element_user(HTTPMETHOD$6, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return (com.sun.java.xml.ns.javaee.HttpMethodType)target;
        }
    }
    
    /**
     * Returns number of "http-method" element
     */
    public int sizeOfHttpMethodArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(HTTPMETHOD$6);
        }
    }
    
    /**
     * Sets array of all "http-method" element
     */
    public void setHttpMethodArray(java.lang.String[] httpMethodArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(httpMethodArray, HTTPMETHOD$6);
        }
    }
    
    /**
     * Sets ith "http-method" element
     */
    public void setHttpMethodArray(int i, java.lang.String httpMethod)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(HTTPMETHOD$6, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setStringValue(httpMethod);
        }
    }
    
    /**
     * Sets (as xml) array of all "http-method" element
     */
    public void xsetHttpMethodArray(com.sun.java.xml.ns.javaee.HttpMethodType[]httpMethodArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(httpMethodArray, HTTPMETHOD$6);
        }
    }
    
    /**
     * Sets (as xml) ith "http-method" element
     */
    public void xsetHttpMethodArray(int i, com.sun.java.xml.ns.javaee.HttpMethodType httpMethod)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.javaee.HttpMethodType target = null;
            target = (com.sun.java.xml.ns.javaee.HttpMethodType)get_store().find_element_user(HTTPMETHOD$6, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(httpMethod);
        }
    }
    
    /**
     * Inserts the value as the ith "http-method" element
     */
    public void insertHttpMethod(int i, java.lang.String httpMethod)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = 
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(HTTPMETHOD$6, i);
            target.setStringValue(httpMethod);
        }
    }
    
    /**
     * Appends the value as the last "http-method" element
     */
    public void addHttpMethod(java.lang.String httpMethod)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(HTTPMETHOD$6);
            target.setStringValue(httpMethod);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "http-method" element
     */
    public com.sun.java.xml.ns.javaee.HttpMethodType insertNewHttpMethod(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.javaee.HttpMethodType target = null;
            target = (com.sun.java.xml.ns.javaee.HttpMethodType)get_store().insert_element_user(HTTPMETHOD$6, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "http-method" element
     */
    public com.sun.java.xml.ns.javaee.HttpMethodType addNewHttpMethod()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.javaee.HttpMethodType target = null;
            target = (com.sun.java.xml.ns.javaee.HttpMethodType)get_store().add_element_user(HTTPMETHOD$6);
            return target;
        }
    }
    
    /**
     * Removes the ith "http-method" element
     */
    public void removeHttpMethod(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(HTTPMETHOD$6, i);
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
