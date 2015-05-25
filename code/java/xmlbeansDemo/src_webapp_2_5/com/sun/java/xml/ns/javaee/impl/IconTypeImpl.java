/*
 * XML Type:  iconType
 * Namespace: http://java.sun.com/xml/ns/javaee
 * Java type: com.sun.java.xml.ns.javaee.IconType
 *
 * Automatically generated - do not modify.
 */
package com.sun.java.xml.ns.javaee.impl;
/**
 * An XML iconType(@http://java.sun.com/xml/ns/javaee).
 *
 * This is a complex type.
 */
public class IconTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.sun.java.xml.ns.javaee.IconType
{
    private static final long serialVersionUID = 1L;
    
    public IconTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SMALLICON$0 = 
        new javax.xml.namespace.QName("http://java.sun.com/xml/ns/javaee", "small-icon");
    private static final javax.xml.namespace.QName LARGEICON$2 = 
        new javax.xml.namespace.QName("http://java.sun.com/xml/ns/javaee", "large-icon");
    private static final javax.xml.namespace.QName LANG$4 = 
        new javax.xml.namespace.QName("http://www.w3.org/XML/1998/namespace", "lang");
    private static final javax.xml.namespace.QName ID$6 = 
        new javax.xml.namespace.QName("", "id");
    
    
    /**
     * Gets the "small-icon" element
     */
    public com.sun.java.xml.ns.javaee.PathType getSmallIcon()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.javaee.PathType target = null;
            target = (com.sun.java.xml.ns.javaee.PathType)get_store().find_element_user(SMALLICON$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "small-icon" element
     */
    public boolean isSetSmallIcon()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SMALLICON$0) != 0;
        }
    }
    
    /**
     * Sets the "small-icon" element
     */
    public void setSmallIcon(com.sun.java.xml.ns.javaee.PathType smallIcon)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.javaee.PathType target = null;
            target = (com.sun.java.xml.ns.javaee.PathType)get_store().find_element_user(SMALLICON$0, 0);
            if (target == null)
            {
                target = (com.sun.java.xml.ns.javaee.PathType)get_store().add_element_user(SMALLICON$0);
            }
            target.set(smallIcon);
        }
    }
    
    /**
     * Appends and returns a new empty "small-icon" element
     */
    public com.sun.java.xml.ns.javaee.PathType addNewSmallIcon()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.javaee.PathType target = null;
            target = (com.sun.java.xml.ns.javaee.PathType)get_store().add_element_user(SMALLICON$0);
            return target;
        }
    }
    
    /**
     * Unsets the "small-icon" element
     */
    public void unsetSmallIcon()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SMALLICON$0, 0);
        }
    }
    
    /**
     * Gets the "large-icon" element
     */
    public com.sun.java.xml.ns.javaee.PathType getLargeIcon()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.javaee.PathType target = null;
            target = (com.sun.java.xml.ns.javaee.PathType)get_store().find_element_user(LARGEICON$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "large-icon" element
     */
    public boolean isSetLargeIcon()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(LARGEICON$2) != 0;
        }
    }
    
    /**
     * Sets the "large-icon" element
     */
    public void setLargeIcon(com.sun.java.xml.ns.javaee.PathType largeIcon)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.javaee.PathType target = null;
            target = (com.sun.java.xml.ns.javaee.PathType)get_store().find_element_user(LARGEICON$2, 0);
            if (target == null)
            {
                target = (com.sun.java.xml.ns.javaee.PathType)get_store().add_element_user(LARGEICON$2);
            }
            target.set(largeIcon);
        }
    }
    
    /**
     * Appends and returns a new empty "large-icon" element
     */
    public com.sun.java.xml.ns.javaee.PathType addNewLargeIcon()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.javaee.PathType target = null;
            target = (com.sun.java.xml.ns.javaee.PathType)get_store().add_element_user(LARGEICON$2);
            return target;
        }
    }
    
    /**
     * Unsets the "large-icon" element
     */
    public void unsetLargeIcon()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(LARGEICON$2, 0);
        }
    }
    
    /**
     * Gets the "lang" attribute
     */
    public java.lang.String getLang()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LANG$4);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "lang" attribute
     */
    public org.apache.xmlbeans.XmlLanguage xgetLang()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlLanguage target = null;
            target = (org.apache.xmlbeans.XmlLanguage)get_store().find_attribute_user(LANG$4);
            return target;
        }
    }
    
    /**
     * True if has "lang" attribute
     */
    public boolean isSetLang()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(LANG$4) != null;
        }
    }
    
    /**
     * Sets the "lang" attribute
     */
    public void setLang(java.lang.String lang)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LANG$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(LANG$4);
            }
            target.setStringValue(lang);
        }
    }
    
    /**
     * Sets (as xml) the "lang" attribute
     */
    public void xsetLang(org.apache.xmlbeans.XmlLanguage lang)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlLanguage target = null;
            target = (org.apache.xmlbeans.XmlLanguage)get_store().find_attribute_user(LANG$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlLanguage)get_store().add_attribute_user(LANG$4);
            }
            target.set(lang);
        }
    }
    
    /**
     * Unsets the "lang" attribute
     */
    public void unsetLang()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(LANG$4);
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
