/*
 * XML Type:  session-configType
 * Namespace: http://java.sun.com/xml/ns/javaee
 * Java type: com.sun.java.xml.ns.javaee.SessionConfigType
 *
 * Automatically generated - do not modify.
 */
package com.sun.java.xml.ns.javaee.impl;
/**
 * An XML session-configType(@http://java.sun.com/xml/ns/javaee).
 *
 * This is a complex type.
 */
public class SessionConfigTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.sun.java.xml.ns.javaee.SessionConfigType
{
    private static final long serialVersionUID = 1L;
    
    public SessionConfigTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SESSIONTIMEOUT$0 = 
        new javax.xml.namespace.QName("http://java.sun.com/xml/ns/javaee", "session-timeout");
    private static final javax.xml.namespace.QName ID$2 = 
        new javax.xml.namespace.QName("", "id");
    
    
    /**
     * Gets the "session-timeout" element
     */
    public com.sun.java.xml.ns.javaee.XsdIntegerType getSessionTimeout()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.javaee.XsdIntegerType target = null;
            target = (com.sun.java.xml.ns.javaee.XsdIntegerType)get_store().find_element_user(SESSIONTIMEOUT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "session-timeout" element
     */
    public boolean isSetSessionTimeout()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SESSIONTIMEOUT$0) != 0;
        }
    }
    
    /**
     * Sets the "session-timeout" element
     */
    public void setSessionTimeout(com.sun.java.xml.ns.javaee.XsdIntegerType sessionTimeout)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.javaee.XsdIntegerType target = null;
            target = (com.sun.java.xml.ns.javaee.XsdIntegerType)get_store().find_element_user(SESSIONTIMEOUT$0, 0);
            if (target == null)
            {
                target = (com.sun.java.xml.ns.javaee.XsdIntegerType)get_store().add_element_user(SESSIONTIMEOUT$0);
            }
            target.set(sessionTimeout);
        }
    }
    
    /**
     * Appends and returns a new empty "session-timeout" element
     */
    public com.sun.java.xml.ns.javaee.XsdIntegerType addNewSessionTimeout()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.javaee.XsdIntegerType target = null;
            target = (com.sun.java.xml.ns.javaee.XsdIntegerType)get_store().add_element_user(SESSIONTIMEOUT$0);
            return target;
        }
    }
    
    /**
     * Unsets the "session-timeout" element
     */
    public void unsetSessionTimeout()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SESSIONTIMEOUT$0, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ID$2);
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
            target = (org.apache.xmlbeans.XmlID)get_store().find_attribute_user(ID$2);
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
            return get_store().find_attribute_user(ID$2) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ID$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ID$2);
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
            target = (org.apache.xmlbeans.XmlID)get_store().find_attribute_user(ID$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlID)get_store().add_attribute_user(ID$2);
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
            get_store().remove_attribute(ID$2);
        }
    }
}
