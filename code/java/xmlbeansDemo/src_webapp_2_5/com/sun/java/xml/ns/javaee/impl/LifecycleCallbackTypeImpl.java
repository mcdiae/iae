/*
 * XML Type:  lifecycle-callbackType
 * Namespace: http://java.sun.com/xml/ns/javaee
 * Java type: com.sun.java.xml.ns.javaee.LifecycleCallbackType
 *
 * Automatically generated - do not modify.
 */
package com.sun.java.xml.ns.javaee.impl;
/**
 * An XML lifecycle-callbackType(@http://java.sun.com/xml/ns/javaee).
 *
 * This is a complex type.
 */
public class LifecycleCallbackTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.sun.java.xml.ns.javaee.LifecycleCallbackType
{
    private static final long serialVersionUID = 1L;
    
    public LifecycleCallbackTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName LIFECYCLECALLBACKCLASS$0 = 
        new javax.xml.namespace.QName("http://java.sun.com/xml/ns/javaee", "lifecycle-callback-class");
    private static final javax.xml.namespace.QName LIFECYCLECALLBACKMETHOD$2 = 
        new javax.xml.namespace.QName("http://java.sun.com/xml/ns/javaee", "lifecycle-callback-method");
    
    
    /**
     * Gets the "lifecycle-callback-class" element
     */
    public com.sun.java.xml.ns.javaee.FullyQualifiedClassType getLifecycleCallbackClass()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.javaee.FullyQualifiedClassType target = null;
            target = (com.sun.java.xml.ns.javaee.FullyQualifiedClassType)get_store().find_element_user(LIFECYCLECALLBACKCLASS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "lifecycle-callback-class" element
     */
    public boolean isSetLifecycleCallbackClass()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(LIFECYCLECALLBACKCLASS$0) != 0;
        }
    }
    
    /**
     * Sets the "lifecycle-callback-class" element
     */
    public void setLifecycleCallbackClass(com.sun.java.xml.ns.javaee.FullyQualifiedClassType lifecycleCallbackClass)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.javaee.FullyQualifiedClassType target = null;
            target = (com.sun.java.xml.ns.javaee.FullyQualifiedClassType)get_store().find_element_user(LIFECYCLECALLBACKCLASS$0, 0);
            if (target == null)
            {
                target = (com.sun.java.xml.ns.javaee.FullyQualifiedClassType)get_store().add_element_user(LIFECYCLECALLBACKCLASS$0);
            }
            target.set(lifecycleCallbackClass);
        }
    }
    
    /**
     * Appends and returns a new empty "lifecycle-callback-class" element
     */
    public com.sun.java.xml.ns.javaee.FullyQualifiedClassType addNewLifecycleCallbackClass()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.javaee.FullyQualifiedClassType target = null;
            target = (com.sun.java.xml.ns.javaee.FullyQualifiedClassType)get_store().add_element_user(LIFECYCLECALLBACKCLASS$0);
            return target;
        }
    }
    
    /**
     * Unsets the "lifecycle-callback-class" element
     */
    public void unsetLifecycleCallbackClass()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(LIFECYCLECALLBACKCLASS$0, 0);
        }
    }
    
    /**
     * Gets the "lifecycle-callback-method" element
     */
    public com.sun.java.xml.ns.javaee.JavaIdentifierType getLifecycleCallbackMethod()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.javaee.JavaIdentifierType target = null;
            target = (com.sun.java.xml.ns.javaee.JavaIdentifierType)get_store().find_element_user(LIFECYCLECALLBACKMETHOD$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "lifecycle-callback-method" element
     */
    public void setLifecycleCallbackMethod(com.sun.java.xml.ns.javaee.JavaIdentifierType lifecycleCallbackMethod)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.javaee.JavaIdentifierType target = null;
            target = (com.sun.java.xml.ns.javaee.JavaIdentifierType)get_store().find_element_user(LIFECYCLECALLBACKMETHOD$2, 0);
            if (target == null)
            {
                target = (com.sun.java.xml.ns.javaee.JavaIdentifierType)get_store().add_element_user(LIFECYCLECALLBACKMETHOD$2);
            }
            target.set(lifecycleCallbackMethod);
        }
    }
    
    /**
     * Appends and returns a new empty "lifecycle-callback-method" element
     */
    public com.sun.java.xml.ns.javaee.JavaIdentifierType addNewLifecycleCallbackMethod()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.javaee.JavaIdentifierType target = null;
            target = (com.sun.java.xml.ns.javaee.JavaIdentifierType)get_store().add_element_user(LIFECYCLECALLBACKMETHOD$2);
            return target;
        }
    }
}
