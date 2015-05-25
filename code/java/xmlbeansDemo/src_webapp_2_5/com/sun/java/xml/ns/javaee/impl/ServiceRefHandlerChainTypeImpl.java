/*
 * XML Type:  service-ref_handler-chainType
 * Namespace: http://java.sun.com/xml/ns/javaee
 * Java type: com.sun.java.xml.ns.javaee.ServiceRefHandlerChainType
 *
 * Automatically generated - do not modify.
 */
package com.sun.java.xml.ns.javaee.impl;
/**
 * An XML service-ref_handler-chainType(@http://java.sun.com/xml/ns/javaee).
 *
 * This is a complex type.
 */
public class ServiceRefHandlerChainTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.sun.java.xml.ns.javaee.ServiceRefHandlerChainType
{
    private static final long serialVersionUID = 1L;
    
    public ServiceRefHandlerChainTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SERVICENAMEPATTERN$0 = 
        new javax.xml.namespace.QName("http://java.sun.com/xml/ns/javaee", "service-name-pattern");
    private static final javax.xml.namespace.QName PORTNAMEPATTERN$2 = 
        new javax.xml.namespace.QName("http://java.sun.com/xml/ns/javaee", "port-name-pattern");
    private static final javax.xml.namespace.QName PROTOCOLBINDINGS$4 = 
        new javax.xml.namespace.QName("http://java.sun.com/xml/ns/javaee", "protocol-bindings");
    private static final javax.xml.namespace.QName HANDLER$6 = 
        new javax.xml.namespace.QName("http://java.sun.com/xml/ns/javaee", "handler");
    private static final javax.xml.namespace.QName ID$8 = 
        new javax.xml.namespace.QName("", "id");
    
    
    /**
     * Gets the "service-name-pattern" element
     */
    public java.lang.String getServiceNamePattern()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SERVICENAMEPATTERN$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "service-name-pattern" element
     */
    public com.sun.java.xml.ns.javaee.ServiceRefQnamePattern xgetServiceNamePattern()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.javaee.ServiceRefQnamePattern target = null;
            target = (com.sun.java.xml.ns.javaee.ServiceRefQnamePattern)get_store().find_element_user(SERVICENAMEPATTERN$0, 0);
            return target;
        }
    }
    
    /**
     * True if has "service-name-pattern" element
     */
    public boolean isSetServiceNamePattern()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SERVICENAMEPATTERN$0) != 0;
        }
    }
    
    /**
     * Sets the "service-name-pattern" element
     */
    public void setServiceNamePattern(java.lang.String serviceNamePattern)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SERVICENAMEPATTERN$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SERVICENAMEPATTERN$0);
            }
            target.setStringValue(serviceNamePattern);
        }
    }
    
    /**
     * Sets (as xml) the "service-name-pattern" element
     */
    public void xsetServiceNamePattern(com.sun.java.xml.ns.javaee.ServiceRefQnamePattern serviceNamePattern)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.javaee.ServiceRefQnamePattern target = null;
            target = (com.sun.java.xml.ns.javaee.ServiceRefQnamePattern)get_store().find_element_user(SERVICENAMEPATTERN$0, 0);
            if (target == null)
            {
                target = (com.sun.java.xml.ns.javaee.ServiceRefQnamePattern)get_store().add_element_user(SERVICENAMEPATTERN$0);
            }
            target.set(serviceNamePattern);
        }
    }
    
    /**
     * Unsets the "service-name-pattern" element
     */
    public void unsetServiceNamePattern()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SERVICENAMEPATTERN$0, 0);
        }
    }
    
    /**
     * Gets the "port-name-pattern" element
     */
    public java.lang.String getPortNamePattern()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PORTNAMEPATTERN$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "port-name-pattern" element
     */
    public com.sun.java.xml.ns.javaee.ServiceRefQnamePattern xgetPortNamePattern()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.javaee.ServiceRefQnamePattern target = null;
            target = (com.sun.java.xml.ns.javaee.ServiceRefQnamePattern)get_store().find_element_user(PORTNAMEPATTERN$2, 0);
            return target;
        }
    }
    
    /**
     * True if has "port-name-pattern" element
     */
    public boolean isSetPortNamePattern()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PORTNAMEPATTERN$2) != 0;
        }
    }
    
    /**
     * Sets the "port-name-pattern" element
     */
    public void setPortNamePattern(java.lang.String portNamePattern)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PORTNAMEPATTERN$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PORTNAMEPATTERN$2);
            }
            target.setStringValue(portNamePattern);
        }
    }
    
    /**
     * Sets (as xml) the "port-name-pattern" element
     */
    public void xsetPortNamePattern(com.sun.java.xml.ns.javaee.ServiceRefQnamePattern portNamePattern)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.javaee.ServiceRefQnamePattern target = null;
            target = (com.sun.java.xml.ns.javaee.ServiceRefQnamePattern)get_store().find_element_user(PORTNAMEPATTERN$2, 0);
            if (target == null)
            {
                target = (com.sun.java.xml.ns.javaee.ServiceRefQnamePattern)get_store().add_element_user(PORTNAMEPATTERN$2);
            }
            target.set(portNamePattern);
        }
    }
    
    /**
     * Unsets the "port-name-pattern" element
     */
    public void unsetPortNamePattern()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PORTNAMEPATTERN$2, 0);
        }
    }
    
    /**
     * Gets the "protocol-bindings" element
     */
    public java.util.List getProtocolBindings()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROTOCOLBINDINGS$4, 0);
            if (target == null)
            {
                return null;
            }
            return target.getListValue();
        }
    }
    
    /**
     * Gets (as xml) the "protocol-bindings" element
     */
    public com.sun.java.xml.ns.javaee.ServiceRefProtocolBindingListType xgetProtocolBindings()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.javaee.ServiceRefProtocolBindingListType target = null;
            target = (com.sun.java.xml.ns.javaee.ServiceRefProtocolBindingListType)get_store().find_element_user(PROTOCOLBINDINGS$4, 0);
            return target;
        }
    }
    
    /**
     * True if has "protocol-bindings" element
     */
    public boolean isSetProtocolBindings()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PROTOCOLBINDINGS$4) != 0;
        }
    }
    
    /**
     * Sets the "protocol-bindings" element
     */
    public void setProtocolBindings(java.util.List protocolBindings)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROTOCOLBINDINGS$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PROTOCOLBINDINGS$4);
            }
            target.setListValue(protocolBindings);
        }
    }
    
    /**
     * Sets (as xml) the "protocol-bindings" element
     */
    public void xsetProtocolBindings(com.sun.java.xml.ns.javaee.ServiceRefProtocolBindingListType protocolBindings)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.javaee.ServiceRefProtocolBindingListType target = null;
            target = (com.sun.java.xml.ns.javaee.ServiceRefProtocolBindingListType)get_store().find_element_user(PROTOCOLBINDINGS$4, 0);
            if (target == null)
            {
                target = (com.sun.java.xml.ns.javaee.ServiceRefProtocolBindingListType)get_store().add_element_user(PROTOCOLBINDINGS$4);
            }
            target.set(protocolBindings);
        }
    }
    
    /**
     * Unsets the "protocol-bindings" element
     */
    public void unsetProtocolBindings()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PROTOCOLBINDINGS$4, 0);
        }
    }
    
    /**
     * Gets a List of "handler" elements
     */
    public java.util.List<com.sun.java.xml.ns.javaee.ServiceRefHandlerType> getHandlerList()
    {
        final class HandlerList extends java.util.AbstractList<com.sun.java.xml.ns.javaee.ServiceRefHandlerType>
        {
            public com.sun.java.xml.ns.javaee.ServiceRefHandlerType get(int i)
                { return ServiceRefHandlerChainTypeImpl.this.getHandlerArray(i); }
            
            public com.sun.java.xml.ns.javaee.ServiceRefHandlerType set(int i, com.sun.java.xml.ns.javaee.ServiceRefHandlerType o)
            {
                com.sun.java.xml.ns.javaee.ServiceRefHandlerType old = ServiceRefHandlerChainTypeImpl.this.getHandlerArray(i);
                ServiceRefHandlerChainTypeImpl.this.setHandlerArray(i, o);
                return old;
            }
            
            public void add(int i, com.sun.java.xml.ns.javaee.ServiceRefHandlerType o)
                { ServiceRefHandlerChainTypeImpl.this.insertNewHandler(i).set(o); }
            
            public com.sun.java.xml.ns.javaee.ServiceRefHandlerType remove(int i)
            {
                com.sun.java.xml.ns.javaee.ServiceRefHandlerType old = ServiceRefHandlerChainTypeImpl.this.getHandlerArray(i);
                ServiceRefHandlerChainTypeImpl.this.removeHandler(i);
                return old;
            }
            
            public int size()
                { return ServiceRefHandlerChainTypeImpl.this.sizeOfHandlerArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new HandlerList();
        }
    }
    
    /**
     * Gets array of all "handler" elements
     * @deprecated
     */
    public com.sun.java.xml.ns.javaee.ServiceRefHandlerType[] getHandlerArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List<com.sun.java.xml.ns.javaee.ServiceRefHandlerType> targetList = new java.util.ArrayList<com.sun.java.xml.ns.javaee.ServiceRefHandlerType>();
            get_store().find_all_element_users(HANDLER$6, targetList);
            com.sun.java.xml.ns.javaee.ServiceRefHandlerType[] result = new com.sun.java.xml.ns.javaee.ServiceRefHandlerType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "handler" element
     */
    public com.sun.java.xml.ns.javaee.ServiceRefHandlerType getHandlerArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.javaee.ServiceRefHandlerType target = null;
            target = (com.sun.java.xml.ns.javaee.ServiceRefHandlerType)get_store().find_element_user(HANDLER$6, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "handler" element
     */
    public int sizeOfHandlerArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(HANDLER$6);
        }
    }
    
    /**
     * Sets array of all "handler" element
     */
    public void setHandlerArray(com.sun.java.xml.ns.javaee.ServiceRefHandlerType[] handlerArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(handlerArray, HANDLER$6);
        }
    }
    
    /**
     * Sets ith "handler" element
     */
    public void setHandlerArray(int i, com.sun.java.xml.ns.javaee.ServiceRefHandlerType handler)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.javaee.ServiceRefHandlerType target = null;
            target = (com.sun.java.xml.ns.javaee.ServiceRefHandlerType)get_store().find_element_user(HANDLER$6, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(handler);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "handler" element
     */
    public com.sun.java.xml.ns.javaee.ServiceRefHandlerType insertNewHandler(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.javaee.ServiceRefHandlerType target = null;
            target = (com.sun.java.xml.ns.javaee.ServiceRefHandlerType)get_store().insert_element_user(HANDLER$6, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "handler" element
     */
    public com.sun.java.xml.ns.javaee.ServiceRefHandlerType addNewHandler()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.javaee.ServiceRefHandlerType target = null;
            target = (com.sun.java.xml.ns.javaee.ServiceRefHandlerType)get_store().add_element_user(HANDLER$6);
            return target;
        }
    }
    
    /**
     * Removes the ith "handler" element
     */
    public void removeHandler(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(HANDLER$6, i);
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
