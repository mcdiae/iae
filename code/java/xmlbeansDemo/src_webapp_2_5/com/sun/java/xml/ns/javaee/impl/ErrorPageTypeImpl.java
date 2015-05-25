/*
 * XML Type:  error-pageType
 * Namespace: http://java.sun.com/xml/ns/javaee
 * Java type: com.sun.java.xml.ns.javaee.ErrorPageType
 *
 * Automatically generated - do not modify.
 */
package com.sun.java.xml.ns.javaee.impl;
/**
 * An XML error-pageType(@http://java.sun.com/xml/ns/javaee).
 *
 * This is a complex type.
 */
public class ErrorPageTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.sun.java.xml.ns.javaee.ErrorPageType
{
    private static final long serialVersionUID = 1L;
    
    public ErrorPageTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ERRORCODE$0 = 
        new javax.xml.namespace.QName("http://java.sun.com/xml/ns/javaee", "error-code");
    private static final javax.xml.namespace.QName EXCEPTIONTYPE$2 = 
        new javax.xml.namespace.QName("http://java.sun.com/xml/ns/javaee", "exception-type");
    private static final javax.xml.namespace.QName LOCATION$4 = 
        new javax.xml.namespace.QName("http://java.sun.com/xml/ns/javaee", "location");
    private static final javax.xml.namespace.QName ID$6 = 
        new javax.xml.namespace.QName("", "id");
    
    
    /**
     * Gets the "error-code" element
     */
    public com.sun.java.xml.ns.javaee.ErrorCodeType getErrorCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.javaee.ErrorCodeType target = null;
            target = (com.sun.java.xml.ns.javaee.ErrorCodeType)get_store().find_element_user(ERRORCODE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "error-code" element
     */
    public boolean isSetErrorCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ERRORCODE$0) != 0;
        }
    }
    
    /**
     * Sets the "error-code" element
     */
    public void setErrorCode(com.sun.java.xml.ns.javaee.ErrorCodeType errorCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.javaee.ErrorCodeType target = null;
            target = (com.sun.java.xml.ns.javaee.ErrorCodeType)get_store().find_element_user(ERRORCODE$0, 0);
            if (target == null)
            {
                target = (com.sun.java.xml.ns.javaee.ErrorCodeType)get_store().add_element_user(ERRORCODE$0);
            }
            target.set(errorCode);
        }
    }
    
    /**
     * Appends and returns a new empty "error-code" element
     */
    public com.sun.java.xml.ns.javaee.ErrorCodeType addNewErrorCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.javaee.ErrorCodeType target = null;
            target = (com.sun.java.xml.ns.javaee.ErrorCodeType)get_store().add_element_user(ERRORCODE$0);
            return target;
        }
    }
    
    /**
     * Unsets the "error-code" element
     */
    public void unsetErrorCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ERRORCODE$0, 0);
        }
    }
    
    /**
     * Gets the "exception-type" element
     */
    public com.sun.java.xml.ns.javaee.FullyQualifiedClassType getExceptionType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.javaee.FullyQualifiedClassType target = null;
            target = (com.sun.java.xml.ns.javaee.FullyQualifiedClassType)get_store().find_element_user(EXCEPTIONTYPE$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "exception-type" element
     */
    public boolean isSetExceptionType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(EXCEPTIONTYPE$2) != 0;
        }
    }
    
    /**
     * Sets the "exception-type" element
     */
    public void setExceptionType(com.sun.java.xml.ns.javaee.FullyQualifiedClassType exceptionType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.javaee.FullyQualifiedClassType target = null;
            target = (com.sun.java.xml.ns.javaee.FullyQualifiedClassType)get_store().find_element_user(EXCEPTIONTYPE$2, 0);
            if (target == null)
            {
                target = (com.sun.java.xml.ns.javaee.FullyQualifiedClassType)get_store().add_element_user(EXCEPTIONTYPE$2);
            }
            target.set(exceptionType);
        }
    }
    
    /**
     * Appends and returns a new empty "exception-type" element
     */
    public com.sun.java.xml.ns.javaee.FullyQualifiedClassType addNewExceptionType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.javaee.FullyQualifiedClassType target = null;
            target = (com.sun.java.xml.ns.javaee.FullyQualifiedClassType)get_store().add_element_user(EXCEPTIONTYPE$2);
            return target;
        }
    }
    
    /**
     * Unsets the "exception-type" element
     */
    public void unsetExceptionType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(EXCEPTIONTYPE$2, 0);
        }
    }
    
    /**
     * Gets the "location" element
     */
    public com.sun.java.xml.ns.javaee.WarPathType getLocation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.javaee.WarPathType target = null;
            target = (com.sun.java.xml.ns.javaee.WarPathType)get_store().find_element_user(LOCATION$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "location" element
     */
    public void setLocation(com.sun.java.xml.ns.javaee.WarPathType location)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.javaee.WarPathType target = null;
            target = (com.sun.java.xml.ns.javaee.WarPathType)get_store().find_element_user(LOCATION$4, 0);
            if (target == null)
            {
                target = (com.sun.java.xml.ns.javaee.WarPathType)get_store().add_element_user(LOCATION$4);
            }
            target.set(location);
        }
    }
    
    /**
     * Appends and returns a new empty "location" element
     */
    public com.sun.java.xml.ns.javaee.WarPathType addNewLocation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.javaee.WarPathType target = null;
            target = (com.sun.java.xml.ns.javaee.WarPathType)get_store().add_element_user(LOCATION$4);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ID$6);
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
            target = (org.apache.xmlbeans.XmlID)get_store().find_attribute_user(ID$6);
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
            return get_store().find_attribute_user(ID$6) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ID$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ID$6);
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
            target = (org.apache.xmlbeans.XmlID)get_store().find_attribute_user(ID$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlID)get_store().add_attribute_user(ID$6);
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
            get_store().remove_attribute(ID$6);
        }
    }
}
