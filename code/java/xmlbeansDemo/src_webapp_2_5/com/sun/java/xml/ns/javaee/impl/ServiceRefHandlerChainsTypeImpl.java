/*
 * XML Type:  service-ref_handler-chainsType
 * Namespace: http://java.sun.com/xml/ns/javaee
 * Java type: com.sun.java.xml.ns.javaee.ServiceRefHandlerChainsType
 *
 * Automatically generated - do not modify.
 */
package com.sun.java.xml.ns.javaee.impl;
/**
 * An XML service-ref_handler-chainsType(@http://java.sun.com/xml/ns/javaee).
 *
 * This is a complex type.
 */
public class ServiceRefHandlerChainsTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.sun.java.xml.ns.javaee.ServiceRefHandlerChainsType
{
    private static final long serialVersionUID = 1L;
    
    public ServiceRefHandlerChainsTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName HANDLERCHAIN$0 = 
        new javax.xml.namespace.QName("http://java.sun.com/xml/ns/javaee", "handler-chain");
    private static final javax.xml.namespace.QName ID$2 = 
        new javax.xml.namespace.QName("", "id");
    
    
    /**
     * Gets a List of "handler-chain" elements
     */
    public java.util.List<com.sun.java.xml.ns.javaee.ServiceRefHandlerChainType> getHandlerChainList()
    {
        final class HandlerChainList extends java.util.AbstractList<com.sun.java.xml.ns.javaee.ServiceRefHandlerChainType>
        {
            public com.sun.java.xml.ns.javaee.ServiceRefHandlerChainType get(int i)
                { return ServiceRefHandlerChainsTypeImpl.this.getHandlerChainArray(i); }
            
            public com.sun.java.xml.ns.javaee.ServiceRefHandlerChainType set(int i, com.sun.java.xml.ns.javaee.ServiceRefHandlerChainType o)
            {
                com.sun.java.xml.ns.javaee.ServiceRefHandlerChainType old = ServiceRefHandlerChainsTypeImpl.this.getHandlerChainArray(i);
                ServiceRefHandlerChainsTypeImpl.this.setHandlerChainArray(i, o);
                return old;
            }
            
            public void add(int i, com.sun.java.xml.ns.javaee.ServiceRefHandlerChainType o)
                { ServiceRefHandlerChainsTypeImpl.this.insertNewHandlerChain(i).set(o); }
            
            public com.sun.java.xml.ns.javaee.ServiceRefHandlerChainType remove(int i)
            {
                com.sun.java.xml.ns.javaee.ServiceRefHandlerChainType old = ServiceRefHandlerChainsTypeImpl.this.getHandlerChainArray(i);
                ServiceRefHandlerChainsTypeImpl.this.removeHandlerChain(i);
                return old;
            }
            
            public int size()
                { return ServiceRefHandlerChainsTypeImpl.this.sizeOfHandlerChainArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new HandlerChainList();
        }
    }
    
    /**
     * Gets array of all "handler-chain" elements
     * @deprecated
     */
    public com.sun.java.xml.ns.javaee.ServiceRefHandlerChainType[] getHandlerChainArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List<com.sun.java.xml.ns.javaee.ServiceRefHandlerChainType> targetList = new java.util.ArrayList<com.sun.java.xml.ns.javaee.ServiceRefHandlerChainType>();
            get_store().find_all_element_users(HANDLERCHAIN$0, targetList);
            com.sun.java.xml.ns.javaee.ServiceRefHandlerChainType[] result = new com.sun.java.xml.ns.javaee.ServiceRefHandlerChainType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "handler-chain" element
     */
    public com.sun.java.xml.ns.javaee.ServiceRefHandlerChainType getHandlerChainArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.javaee.ServiceRefHandlerChainType target = null;
            target = (com.sun.java.xml.ns.javaee.ServiceRefHandlerChainType)get_store().find_element_user(HANDLERCHAIN$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "handler-chain" element
     */
    public int sizeOfHandlerChainArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(HANDLERCHAIN$0);
        }
    }
    
    /**
     * Sets array of all "handler-chain" element
     */
    public void setHandlerChainArray(com.sun.java.xml.ns.javaee.ServiceRefHandlerChainType[] handlerChainArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(handlerChainArray, HANDLERCHAIN$0);
        }
    }
    
    /**
     * Sets ith "handler-chain" element
     */
    public void setHandlerChainArray(int i, com.sun.java.xml.ns.javaee.ServiceRefHandlerChainType handlerChain)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.javaee.ServiceRefHandlerChainType target = null;
            target = (com.sun.java.xml.ns.javaee.ServiceRefHandlerChainType)get_store().find_element_user(HANDLERCHAIN$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(handlerChain);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "handler-chain" element
     */
    public com.sun.java.xml.ns.javaee.ServiceRefHandlerChainType insertNewHandlerChain(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.javaee.ServiceRefHandlerChainType target = null;
            target = (com.sun.java.xml.ns.javaee.ServiceRefHandlerChainType)get_store().insert_element_user(HANDLERCHAIN$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "handler-chain" element
     */
    public com.sun.java.xml.ns.javaee.ServiceRefHandlerChainType addNewHandlerChain()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.javaee.ServiceRefHandlerChainType target = null;
            target = (com.sun.java.xml.ns.javaee.ServiceRefHandlerChainType)get_store().add_element_user(HANDLERCHAIN$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "handler-chain" element
     */
    public void removeHandlerChain(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(HANDLERCHAIN$0, i);
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
