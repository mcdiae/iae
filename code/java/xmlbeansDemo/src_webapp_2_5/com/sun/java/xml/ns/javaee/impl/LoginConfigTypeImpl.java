/*
 * XML Type:  login-configType
 * Namespace: http://java.sun.com/xml/ns/javaee
 * Java type: com.sun.java.xml.ns.javaee.LoginConfigType
 *
 * Automatically generated - do not modify.
 */
package com.sun.java.xml.ns.javaee.impl;
/**
 * An XML login-configType(@http://java.sun.com/xml/ns/javaee).
 *
 * This is a complex type.
 */
public class LoginConfigTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.sun.java.xml.ns.javaee.LoginConfigType
{
    private static final long serialVersionUID = 1L;
    
    public LoginConfigTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName AUTHMETHOD$0 = 
        new javax.xml.namespace.QName("http://java.sun.com/xml/ns/javaee", "auth-method");
    private static final javax.xml.namespace.QName REALMNAME$2 = 
        new javax.xml.namespace.QName("http://java.sun.com/xml/ns/javaee", "realm-name");
    private static final javax.xml.namespace.QName FORMLOGINCONFIG$4 = 
        new javax.xml.namespace.QName("http://java.sun.com/xml/ns/javaee", "form-login-config");
    private static final javax.xml.namespace.QName ID$6 = 
        new javax.xml.namespace.QName("", "id");
    
    
    /**
     * Gets the "auth-method" element
     */
    public com.sun.java.xml.ns.javaee.AuthMethodType getAuthMethod()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.javaee.AuthMethodType target = null;
            target = (com.sun.java.xml.ns.javaee.AuthMethodType)get_store().find_element_user(AUTHMETHOD$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "auth-method" element
     */
    public boolean isSetAuthMethod()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(AUTHMETHOD$0) != 0;
        }
    }
    
    /**
     * Sets the "auth-method" element
     */
    public void setAuthMethod(com.sun.java.xml.ns.javaee.AuthMethodType authMethod)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.javaee.AuthMethodType target = null;
            target = (com.sun.java.xml.ns.javaee.AuthMethodType)get_store().find_element_user(AUTHMETHOD$0, 0);
            if (target == null)
            {
                target = (com.sun.java.xml.ns.javaee.AuthMethodType)get_store().add_element_user(AUTHMETHOD$0);
            }
            target.set(authMethod);
        }
    }
    
    /**
     * Appends and returns a new empty "auth-method" element
     */
    public com.sun.java.xml.ns.javaee.AuthMethodType addNewAuthMethod()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.javaee.AuthMethodType target = null;
            target = (com.sun.java.xml.ns.javaee.AuthMethodType)get_store().add_element_user(AUTHMETHOD$0);
            return target;
        }
    }
    
    /**
     * Unsets the "auth-method" element
     */
    public void unsetAuthMethod()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(AUTHMETHOD$0, 0);
        }
    }
    
    /**
     * Gets the "realm-name" element
     */
    public com.sun.java.xml.ns.javaee.String getRealmName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.javaee.String target = null;
            target = (com.sun.java.xml.ns.javaee.String)get_store().find_element_user(REALMNAME$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "realm-name" element
     */
    public boolean isSetRealmName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(REALMNAME$2) != 0;
        }
    }
    
    /**
     * Sets the "realm-name" element
     */
    public void setRealmName(com.sun.java.xml.ns.javaee.String realmName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.javaee.String target = null;
            target = (com.sun.java.xml.ns.javaee.String)get_store().find_element_user(REALMNAME$2, 0);
            if (target == null)
            {
                target = (com.sun.java.xml.ns.javaee.String)get_store().add_element_user(REALMNAME$2);
            }
            target.set(realmName);
        }
    }
    
    /**
     * Appends and returns a new empty "realm-name" element
     */
    public com.sun.java.xml.ns.javaee.String addNewRealmName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.javaee.String target = null;
            target = (com.sun.java.xml.ns.javaee.String)get_store().add_element_user(REALMNAME$2);
            return target;
        }
    }
    
    /**
     * Unsets the "realm-name" element
     */
    public void unsetRealmName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(REALMNAME$2, 0);
        }
    }
    
    /**
     * Gets the "form-login-config" element
     */
    public com.sun.java.xml.ns.javaee.FormLoginConfigType getFormLoginConfig()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.javaee.FormLoginConfigType target = null;
            target = (com.sun.java.xml.ns.javaee.FormLoginConfigType)get_store().find_element_user(FORMLOGINCONFIG$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "form-login-config" element
     */
    public boolean isSetFormLoginConfig()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(FORMLOGINCONFIG$4) != 0;
        }
    }
    
    /**
     * Sets the "form-login-config" element
     */
    public void setFormLoginConfig(com.sun.java.xml.ns.javaee.FormLoginConfigType formLoginConfig)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.javaee.FormLoginConfigType target = null;
            target = (com.sun.java.xml.ns.javaee.FormLoginConfigType)get_store().find_element_user(FORMLOGINCONFIG$4, 0);
            if (target == null)
            {
                target = (com.sun.java.xml.ns.javaee.FormLoginConfigType)get_store().add_element_user(FORMLOGINCONFIG$4);
            }
            target.set(formLoginConfig);
        }
    }
    
    /**
     * Appends and returns a new empty "form-login-config" element
     */
    public com.sun.java.xml.ns.javaee.FormLoginConfigType addNewFormLoginConfig()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.javaee.FormLoginConfigType target = null;
            target = (com.sun.java.xml.ns.javaee.FormLoginConfigType)get_store().add_element_user(FORMLOGINCONFIG$4);
            return target;
        }
    }
    
    /**
     * Unsets the "form-login-config" element
     */
    public void unsetFormLoginConfig()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(FORMLOGINCONFIG$4, 0);
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
