/*
 * XML Type:  mime-mappingType
 * Namespace: http://java.sun.com/xml/ns/javaee
 * Java type: com.sun.java.xml.ns.javaee.MimeMappingType
 *
 * Automatically generated - do not modify.
 */
package com.sun.java.xml.ns.javaee.impl;
/**
 * An XML mime-mappingType(@http://java.sun.com/xml/ns/javaee).
 *
 * This is a complex type.
 */
public class MimeMappingTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.sun.java.xml.ns.javaee.MimeMappingType
{
    private static final long serialVersionUID = 1L;
    
    public MimeMappingTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName EXTENSION$0 = 
        new javax.xml.namespace.QName("http://java.sun.com/xml/ns/javaee", "extension");
    private static final javax.xml.namespace.QName MIMETYPE$2 = 
        new javax.xml.namespace.QName("http://java.sun.com/xml/ns/javaee", "mime-type");
    private static final javax.xml.namespace.QName ID$4 = 
        new javax.xml.namespace.QName("", "id");
    
    
    /**
     * Gets the "extension" element
     */
    public com.sun.java.xml.ns.javaee.String getExtension()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.javaee.String target = null;
            target = (com.sun.java.xml.ns.javaee.String)get_store().find_element_user(EXTENSION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "extension" element
     */
    public void setExtension(com.sun.java.xml.ns.javaee.String extension)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.javaee.String target = null;
            target = (com.sun.java.xml.ns.javaee.String)get_store().find_element_user(EXTENSION$0, 0);
            if (target == null)
            {
                target = (com.sun.java.xml.ns.javaee.String)get_store().add_element_user(EXTENSION$0);
            }
            target.set(extension);
        }
    }
    
    /**
     * Appends and returns a new empty "extension" element
     */
    public com.sun.java.xml.ns.javaee.String addNewExtension()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.javaee.String target = null;
            target = (com.sun.java.xml.ns.javaee.String)get_store().add_element_user(EXTENSION$0);
            return target;
        }
    }
    
    /**
     * Gets the "mime-type" element
     */
    public com.sun.java.xml.ns.javaee.MimeTypeType getMimeType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.javaee.MimeTypeType target = null;
            target = (com.sun.java.xml.ns.javaee.MimeTypeType)get_store().find_element_user(MIMETYPE$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "mime-type" element
     */
    public void setMimeType(com.sun.java.xml.ns.javaee.MimeTypeType mimeType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.javaee.MimeTypeType target = null;
            target = (com.sun.java.xml.ns.javaee.MimeTypeType)get_store().find_element_user(MIMETYPE$2, 0);
            if (target == null)
            {
                target = (com.sun.java.xml.ns.javaee.MimeTypeType)get_store().add_element_user(MIMETYPE$2);
            }
            target.set(mimeType);
        }
    }
    
    /**
     * Appends and returns a new empty "mime-type" element
     */
    public com.sun.java.xml.ns.javaee.MimeTypeType addNewMimeType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.javaee.MimeTypeType target = null;
            target = (com.sun.java.xml.ns.javaee.MimeTypeType)get_store().add_element_user(MIMETYPE$2);
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
