/*
 * XML Type:  port-component-refType
 * Namespace: http://java.sun.com/xml/ns/javaee
 * Java type: com.sun.java.xml.ns.javaee.PortComponentRefType
 *
 * Automatically generated - do not modify.
 */
package com.sun.java.xml.ns.javaee.impl;
/**
 * An XML port-component-refType(@http://java.sun.com/xml/ns/javaee).
 *
 * This is a complex type.
 */
public class PortComponentRefTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.sun.java.xml.ns.javaee.PortComponentRefType
{
    private static final long serialVersionUID = 1L;
    
    public PortComponentRefTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SERVICEENDPOINTINTERFACE$0 = 
        new javax.xml.namespace.QName("http://java.sun.com/xml/ns/javaee", "service-endpoint-interface");
    private static final javax.xml.namespace.QName ENABLEMTOM$2 = 
        new javax.xml.namespace.QName("http://java.sun.com/xml/ns/javaee", "enable-mtom");
    private static final javax.xml.namespace.QName PORTCOMPONENTLINK$4 = 
        new javax.xml.namespace.QName("http://java.sun.com/xml/ns/javaee", "port-component-link");
    private static final javax.xml.namespace.QName ID$6 = 
        new javax.xml.namespace.QName("", "id");
    
    
    /**
     * Gets the "service-endpoint-interface" element
     */
    public com.sun.java.xml.ns.javaee.FullyQualifiedClassType getServiceEndpointInterface()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.javaee.FullyQualifiedClassType target = null;
            target = (com.sun.java.xml.ns.javaee.FullyQualifiedClassType)get_store().find_element_user(SERVICEENDPOINTINTERFACE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "service-endpoint-interface" element
     */
    public void setServiceEndpointInterface(com.sun.java.xml.ns.javaee.FullyQualifiedClassType serviceEndpointInterface)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.javaee.FullyQualifiedClassType target = null;
            target = (com.sun.java.xml.ns.javaee.FullyQualifiedClassType)get_store().find_element_user(SERVICEENDPOINTINTERFACE$0, 0);
            if (target == null)
            {
                target = (com.sun.java.xml.ns.javaee.FullyQualifiedClassType)get_store().add_element_user(SERVICEENDPOINTINTERFACE$0);
            }
            target.set(serviceEndpointInterface);
        }
    }
    
    /**
     * Appends and returns a new empty "service-endpoint-interface" element
     */
    public com.sun.java.xml.ns.javaee.FullyQualifiedClassType addNewServiceEndpointInterface()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.javaee.FullyQualifiedClassType target = null;
            target = (com.sun.java.xml.ns.javaee.FullyQualifiedClassType)get_store().add_element_user(SERVICEENDPOINTINTERFACE$0);
            return target;
        }
    }
    
    /**
     * Gets the "enable-mtom" element
     */
    public com.sun.java.xml.ns.javaee.TrueFalseType getEnableMtom()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.javaee.TrueFalseType target = null;
            target = (com.sun.java.xml.ns.javaee.TrueFalseType)get_store().find_element_user(ENABLEMTOM$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "enable-mtom" element
     */
    public boolean isSetEnableMtom()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ENABLEMTOM$2) != 0;
        }
    }
    
    /**
     * Sets the "enable-mtom" element
     */
    public void setEnableMtom(com.sun.java.xml.ns.javaee.TrueFalseType enableMtom)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.javaee.TrueFalseType target = null;
            target = (com.sun.java.xml.ns.javaee.TrueFalseType)get_store().find_element_user(ENABLEMTOM$2, 0);
            if (target == null)
            {
                target = (com.sun.java.xml.ns.javaee.TrueFalseType)get_store().add_element_user(ENABLEMTOM$2);
            }
            target.set(enableMtom);
        }
    }
    
    /**
     * Appends and returns a new empty "enable-mtom" element
     */
    public com.sun.java.xml.ns.javaee.TrueFalseType addNewEnableMtom()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.javaee.TrueFalseType target = null;
            target = (com.sun.java.xml.ns.javaee.TrueFalseType)get_store().add_element_user(ENABLEMTOM$2);
            return target;
        }
    }
    
    /**
     * Unsets the "enable-mtom" element
     */
    public void unsetEnableMtom()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ENABLEMTOM$2, 0);
        }
    }
    
    /**
     * Gets the "port-component-link" element
     */
    public com.sun.java.xml.ns.javaee.String getPortComponentLink()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.javaee.String target = null;
            target = (com.sun.java.xml.ns.javaee.String)get_store().find_element_user(PORTCOMPONENTLINK$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "port-component-link" element
     */
    public boolean isSetPortComponentLink()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PORTCOMPONENTLINK$4) != 0;
        }
    }
    
    /**
     * Sets the "port-component-link" element
     */
    public void setPortComponentLink(com.sun.java.xml.ns.javaee.String portComponentLink)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.javaee.String target = null;
            target = (com.sun.java.xml.ns.javaee.String)get_store().find_element_user(PORTCOMPONENTLINK$4, 0);
            if (target == null)
            {
                target = (com.sun.java.xml.ns.javaee.String)get_store().add_element_user(PORTCOMPONENTLINK$4);
            }
            target.set(portComponentLink);
        }
    }
    
    /**
     * Appends and returns a new empty "port-component-link" element
     */
    public com.sun.java.xml.ns.javaee.String addNewPortComponentLink()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.javaee.String target = null;
            target = (com.sun.java.xml.ns.javaee.String)get_store().add_element_user(PORTCOMPONENTLINK$4);
            return target;
        }
    }
    
    /**
     * Unsets the "port-component-link" element
     */
    public void unsetPortComponentLink()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PORTCOMPONENTLINK$4, 0);
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
