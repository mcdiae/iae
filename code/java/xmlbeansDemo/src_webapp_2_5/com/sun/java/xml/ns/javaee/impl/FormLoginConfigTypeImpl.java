/*
 * XML Type:  form-login-configType
 * Namespace: http://java.sun.com/xml/ns/javaee
 * Java type: com.sun.java.xml.ns.javaee.FormLoginConfigType
 *
 * Automatically generated - do not modify.
 */
package com.sun.java.xml.ns.javaee.impl;
/**
 * An XML form-login-configType(@http://java.sun.com/xml/ns/javaee).
 *
 * This is a complex type.
 */
public class FormLoginConfigTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.sun.java.xml.ns.javaee.FormLoginConfigType
{
    private static final long serialVersionUID = 1L;
    
    public FormLoginConfigTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName FORMLOGINPAGE$0 = 
        new javax.xml.namespace.QName("http://java.sun.com/xml/ns/javaee", "form-login-page");
    private static final javax.xml.namespace.QName FORMERRORPAGE$2 = 
        new javax.xml.namespace.QName("http://java.sun.com/xml/ns/javaee", "form-error-page");
    private static final javax.xml.namespace.QName ID$4 = 
        new javax.xml.namespace.QName("", "id");
    
    
    /**
     * Gets the "form-login-page" element
     */
    public com.sun.java.xml.ns.javaee.WarPathType getFormLoginPage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.javaee.WarPathType target = null;
            target = (com.sun.java.xml.ns.javaee.WarPathType)get_store().find_element_user(FORMLOGINPAGE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "form-login-page" element
     */
    public void setFormLoginPage(com.sun.java.xml.ns.javaee.WarPathType formLoginPage)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.javaee.WarPathType target = null;
            target = (com.sun.java.xml.ns.javaee.WarPathType)get_store().find_element_user(FORMLOGINPAGE$0, 0);
            if (target == null)
            {
                target = (com.sun.java.xml.ns.javaee.WarPathType)get_store().add_element_user(FORMLOGINPAGE$0);
            }
            target.set(formLoginPage);
        }
    }
    
    /**
     * Appends and returns a new empty "form-login-page" element
     */
    public com.sun.java.xml.ns.javaee.WarPathType addNewFormLoginPage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.javaee.WarPathType target = null;
            target = (com.sun.java.xml.ns.javaee.WarPathType)get_store().add_element_user(FORMLOGINPAGE$0);
            return target;
        }
    }
    
    /**
     * Gets the "form-error-page" element
     */
    public com.sun.java.xml.ns.javaee.WarPathType getFormErrorPage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.javaee.WarPathType target = null;
            target = (com.sun.java.xml.ns.javaee.WarPathType)get_store().find_element_user(FORMERRORPAGE$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "form-error-page" element
     */
    public void setFormErrorPage(com.sun.java.xml.ns.javaee.WarPathType formErrorPage)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.javaee.WarPathType target = null;
            target = (com.sun.java.xml.ns.javaee.WarPathType)get_store().find_element_user(FORMERRORPAGE$2, 0);
            if (target == null)
            {
                target = (com.sun.java.xml.ns.javaee.WarPathType)get_store().add_element_user(FORMERRORPAGE$2);
            }
            target.set(formErrorPage);
        }
    }
    
    /**
     * Appends and returns a new empty "form-error-page" element
     */
    public com.sun.java.xml.ns.javaee.WarPathType addNewFormErrorPage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.javaee.WarPathType target = null;
            target = (com.sun.java.xml.ns.javaee.WarPathType)get_store().add_element_user(FORMERRORPAGE$2);
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
