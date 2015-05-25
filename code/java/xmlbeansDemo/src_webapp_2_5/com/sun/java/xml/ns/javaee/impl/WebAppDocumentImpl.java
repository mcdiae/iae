/*
 * An XML document type.
 * Localname: web-app
 * Namespace: http://java.sun.com/xml/ns/javaee
 * Java type: com.sun.java.xml.ns.javaee.WebAppDocument
 *
 * Automatically generated - do not modify.
 */
package com.sun.java.xml.ns.javaee.impl;
/**
 * A document containing one web-app(@http://java.sun.com/xml/ns/javaee) element.
 *
 * This is a complex type.
 */
public class WebAppDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.sun.java.xml.ns.javaee.WebAppDocument
{
    private static final long serialVersionUID = 1L;
    
    public WebAppDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName WEBAPP$0 = 
        new javax.xml.namespace.QName("http://java.sun.com/xml/ns/javaee", "web-app");
    
    
    /**
     * Gets the "web-app" element
     */
    public com.sun.java.xml.ns.javaee.WebAppType getWebApp()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.javaee.WebAppType target = null;
            target = (com.sun.java.xml.ns.javaee.WebAppType)get_store().find_element_user(WEBAPP$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "web-app" element
     */
    public void setWebApp(com.sun.java.xml.ns.javaee.WebAppType webApp)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.javaee.WebAppType target = null;
            target = (com.sun.java.xml.ns.javaee.WebAppType)get_store().find_element_user(WEBAPP$0, 0);
            if (target == null)
            {
                target = (com.sun.java.xml.ns.javaee.WebAppType)get_store().add_element_user(WEBAPP$0);
            }
            target.set(webApp);
        }
    }
    
    /**
     * Appends and returns a new empty "web-app" element
     */
    public com.sun.java.xml.ns.javaee.WebAppType addNewWebApp()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.javaee.WebAppType target = null;
            target = (com.sun.java.xml.ns.javaee.WebAppType)get_store().add_element_user(WEBAPP$0);
            return target;
        }
    }
}
