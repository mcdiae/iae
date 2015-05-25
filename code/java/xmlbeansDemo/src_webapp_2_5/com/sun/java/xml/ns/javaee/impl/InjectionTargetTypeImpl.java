/*
 * XML Type:  injection-targetType
 * Namespace: http://java.sun.com/xml/ns/javaee
 * Java type: com.sun.java.xml.ns.javaee.InjectionTargetType
 *
 * Automatically generated - do not modify.
 */
package com.sun.java.xml.ns.javaee.impl;
/**
 * An XML injection-targetType(@http://java.sun.com/xml/ns/javaee).
 *
 * This is a complex type.
 */
public class InjectionTargetTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.sun.java.xml.ns.javaee.InjectionTargetType
{
    private static final long serialVersionUID = 1L;
    
    public InjectionTargetTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName INJECTIONTARGETCLASS$0 = 
        new javax.xml.namespace.QName("http://java.sun.com/xml/ns/javaee", "injection-target-class");
    private static final javax.xml.namespace.QName INJECTIONTARGETNAME$2 = 
        new javax.xml.namespace.QName("http://java.sun.com/xml/ns/javaee", "injection-target-name");
    
    
    /**
     * Gets the "injection-target-class" element
     */
    public com.sun.java.xml.ns.javaee.FullyQualifiedClassType getInjectionTargetClass()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.javaee.FullyQualifiedClassType target = null;
            target = (com.sun.java.xml.ns.javaee.FullyQualifiedClassType)get_store().find_element_user(INJECTIONTARGETCLASS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "injection-target-class" element
     */
    public void setInjectionTargetClass(com.sun.java.xml.ns.javaee.FullyQualifiedClassType injectionTargetClass)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.javaee.FullyQualifiedClassType target = null;
            target = (com.sun.java.xml.ns.javaee.FullyQualifiedClassType)get_store().find_element_user(INJECTIONTARGETCLASS$0, 0);
            if (target == null)
            {
                target = (com.sun.java.xml.ns.javaee.FullyQualifiedClassType)get_store().add_element_user(INJECTIONTARGETCLASS$0);
            }
            target.set(injectionTargetClass);
        }
    }
    
    /**
     * Appends and returns a new empty "injection-target-class" element
     */
    public com.sun.java.xml.ns.javaee.FullyQualifiedClassType addNewInjectionTargetClass()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.javaee.FullyQualifiedClassType target = null;
            target = (com.sun.java.xml.ns.javaee.FullyQualifiedClassType)get_store().add_element_user(INJECTIONTARGETCLASS$0);
            return target;
        }
    }
    
    /**
     * Gets the "injection-target-name" element
     */
    public com.sun.java.xml.ns.javaee.JavaIdentifierType getInjectionTargetName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.javaee.JavaIdentifierType target = null;
            target = (com.sun.java.xml.ns.javaee.JavaIdentifierType)get_store().find_element_user(INJECTIONTARGETNAME$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "injection-target-name" element
     */
    public void setInjectionTargetName(com.sun.java.xml.ns.javaee.JavaIdentifierType injectionTargetName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.javaee.JavaIdentifierType target = null;
            target = (com.sun.java.xml.ns.javaee.JavaIdentifierType)get_store().find_element_user(INJECTIONTARGETNAME$2, 0);
            if (target == null)
            {
                target = (com.sun.java.xml.ns.javaee.JavaIdentifierType)get_store().add_element_user(INJECTIONTARGETNAME$2);
            }
            target.set(injectionTargetName);
        }
    }
    
    /**
     * Appends and returns a new empty "injection-target-name" element
     */
    public com.sun.java.xml.ns.javaee.JavaIdentifierType addNewInjectionTargetName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.javaee.JavaIdentifierType target = null;
            target = (com.sun.java.xml.ns.javaee.JavaIdentifierType)get_store().add_element_user(INJECTIONTARGETNAME$2);
            return target;
        }
    }
}
