/*
 * XML Type:  service-refType
 * Namespace: http://java.sun.com/xml/ns/javaee
 * Java type: com.sun.java.xml.ns.javaee.ServiceRefType
 *
 * Automatically generated - do not modify.
 */
package com.sun.java.xml.ns.javaee.impl;
/**
 * An XML service-refType(@http://java.sun.com/xml/ns/javaee).
 *
 * This is a complex type.
 */
public class ServiceRefTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.sun.java.xml.ns.javaee.ServiceRefType
{
    private static final long serialVersionUID = 1L;
    
    public ServiceRefTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DESCRIPTION$0 = 
        new javax.xml.namespace.QName("http://java.sun.com/xml/ns/javaee", "description");
    private static final javax.xml.namespace.QName DISPLAYNAME$2 = 
        new javax.xml.namespace.QName("http://java.sun.com/xml/ns/javaee", "display-name");
    private static final javax.xml.namespace.QName ICON$4 = 
        new javax.xml.namespace.QName("http://java.sun.com/xml/ns/javaee", "icon");
    private static final javax.xml.namespace.QName SERVICEREFNAME$6 = 
        new javax.xml.namespace.QName("http://java.sun.com/xml/ns/javaee", "service-ref-name");
    private static final javax.xml.namespace.QName SERVICEINTERFACE$8 = 
        new javax.xml.namespace.QName("http://java.sun.com/xml/ns/javaee", "service-interface");
    private static final javax.xml.namespace.QName SERVICEREFTYPE$10 = 
        new javax.xml.namespace.QName("http://java.sun.com/xml/ns/javaee", "service-ref-type");
    private static final javax.xml.namespace.QName WSDLFILE$12 = 
        new javax.xml.namespace.QName("http://java.sun.com/xml/ns/javaee", "wsdl-file");
    private static final javax.xml.namespace.QName JAXRPCMAPPINGFILE$14 = 
        new javax.xml.namespace.QName("http://java.sun.com/xml/ns/javaee", "jaxrpc-mapping-file");
    private static final javax.xml.namespace.QName SERVICEQNAME$16 = 
        new javax.xml.namespace.QName("http://java.sun.com/xml/ns/javaee", "service-qname");
    private static final javax.xml.namespace.QName PORTCOMPONENTREF$18 = 
        new javax.xml.namespace.QName("http://java.sun.com/xml/ns/javaee", "port-component-ref");
    private static final javax.xml.namespace.QName HANDLER$20 = 
        new javax.xml.namespace.QName("http://java.sun.com/xml/ns/javaee", "handler");
    private static final javax.xml.namespace.QName HANDLERCHAINS$22 = 
        new javax.xml.namespace.QName("http://java.sun.com/xml/ns/javaee", "handler-chains");
    private static final javax.xml.namespace.QName MAPPEDNAME$24 = 
        new javax.xml.namespace.QName("http://java.sun.com/xml/ns/javaee", "mapped-name");
    private static final javax.xml.namespace.QName INJECTIONTARGET$26 = 
        new javax.xml.namespace.QName("http://java.sun.com/xml/ns/javaee", "injection-target");
    private static final javax.xml.namespace.QName ID$28 = 
        new javax.xml.namespace.QName("", "id");
    
    
    /**
     * Gets a List of "description" elements
     */
    public java.util.List<com.sun.java.xml.ns.javaee.DescriptionType> getDescriptionList()
    {
        final class DescriptionList extends java.util.AbstractList<com.sun.java.xml.ns.javaee.DescriptionType>
        {
            public com.sun.java.xml.ns.javaee.DescriptionType get(int i)
                { return ServiceRefTypeImpl.this.getDescriptionArray(i); }
            
            public com.sun.java.xml.ns.javaee.DescriptionType set(int i, com.sun.java.xml.ns.javaee.DescriptionType o)
            {
                com.sun.java.xml.ns.javaee.DescriptionType old = ServiceRefTypeImpl.this.getDescriptionArray(i);
                ServiceRefTypeImpl.this.setDescriptionArray(i, o);
                return old;
            }
            
            public void add(int i, com.sun.java.xml.ns.javaee.DescriptionType o)
                { ServiceRefTypeImpl.this.insertNewDescription(i).set(o); }
            
            public com.sun.java.xml.ns.javaee.DescriptionType remove(int i)
            {
                com.sun.java.xml.ns.javaee.DescriptionType old = ServiceRefTypeImpl.this.getDescriptionArray(i);
                ServiceRefTypeImpl.this.removeDescription(i);
                return old;
            }
            
            public int size()
                { return ServiceRefTypeImpl.this.sizeOfDescriptionArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new DescriptionList();
        }
    }
    
    /**
     * Gets array of all "description" elements
     * @deprecated
     */
    public com.sun.java.xml.ns.javaee.DescriptionType[] getDescriptionArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List<com.sun.java.xml.ns.javaee.DescriptionType> targetList = new java.util.ArrayList<com.sun.java.xml.ns.javaee.DescriptionType>();
            get_store().find_all_element_users(DESCRIPTION$0, targetList);
            com.sun.java.xml.ns.javaee.DescriptionType[] result = new com.sun.java.xml.ns.javaee.DescriptionType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "description" element
     */
    public com.sun.java.xml.ns.javaee.DescriptionType getDescriptionArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.javaee.DescriptionType target = null;
            target = (com.sun.java.xml.ns.javaee.DescriptionType)get_store().find_element_user(DESCRIPTION$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "description" element
     */
    public int sizeOfDescriptionArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DESCRIPTION$0);
        }
    }
    
    /**
     * Sets array of all "description" element
     */
    public void setDescriptionArray(com.sun.java.xml.ns.javaee.DescriptionType[] descriptionArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(descriptionArray, DESCRIPTION$0);
        }
    }
    
    /**
     * Sets ith "description" element
     */
    public void setDescriptionArray(int i, com.sun.java.xml.ns.javaee.DescriptionType description)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.javaee.DescriptionType target = null;
            target = (com.sun.java.xml.ns.javaee.DescriptionType)get_store().find_element_user(DESCRIPTION$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(description);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "description" element
     */
    public com.sun.java.xml.ns.javaee.DescriptionType insertNewDescription(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.javaee.DescriptionType target = null;
            target = (com.sun.java.xml.ns.javaee.DescriptionType)get_store().insert_element_user(DESCRIPTION$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "description" element
     */
    public com.sun.java.xml.ns.javaee.DescriptionType addNewDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.javaee.DescriptionType target = null;
            target = (com.sun.java.xml.ns.javaee.DescriptionType)get_store().add_element_user(DESCRIPTION$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "description" element
     */
    public void removeDescription(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DESCRIPTION$0, i);
        }
    }
    
    /**
     * Gets a List of "display-name" elements
     */
    public java.util.List<com.sun.java.xml.ns.javaee.DisplayNameType> getDisplayNameList()
    {
        final class DisplayNameList extends java.util.AbstractList<com.sun.java.xml.ns.javaee.DisplayNameType>
        {
            public com.sun.java.xml.ns.javaee.DisplayNameType get(int i)
                { return ServiceRefTypeImpl.this.getDisplayNameArray(i); }
            
            public com.sun.java.xml.ns.javaee.DisplayNameType set(int i, com.sun.java.xml.ns.javaee.DisplayNameType o)
            {
                com.sun.java.xml.ns.javaee.DisplayNameType old = ServiceRefTypeImpl.this.getDisplayNameArray(i);
                ServiceRefTypeImpl.this.setDisplayNameArray(i, o);
                return old;
            }
            
            public void add(int i, com.sun.java.xml.ns.javaee.DisplayNameType o)
                { ServiceRefTypeImpl.this.insertNewDisplayName(i).set(o); }
            
            public com.sun.java.xml.ns.javaee.DisplayNameType remove(int i)
            {
                com.sun.java.xml.ns.javaee.DisplayNameType old = ServiceRefTypeImpl.this.getDisplayNameArray(i);
                ServiceRefTypeImpl.this.removeDisplayName(i);
                return old;
            }
            
            public int size()
                { return ServiceRefTypeImpl.this.sizeOfDisplayNameArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new DisplayNameList();
        }
    }
    
    /**
     * Gets array of all "display-name" elements
     * @deprecated
     */
    public com.sun.java.xml.ns.javaee.DisplayNameType[] getDisplayNameArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List<com.sun.java.xml.ns.javaee.DisplayNameType> targetList = new java.util.ArrayList<com.sun.java.xml.ns.javaee.DisplayNameType>();
            get_store().find_all_element_users(DISPLAYNAME$2, targetList);
            com.sun.java.xml.ns.javaee.DisplayNameType[] result = new com.sun.java.xml.ns.javaee.DisplayNameType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "display-name" element
     */
    public com.sun.java.xml.ns.javaee.DisplayNameType getDisplayNameArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.javaee.DisplayNameType target = null;
            target = (com.sun.java.xml.ns.javaee.DisplayNameType)get_store().find_element_user(DISPLAYNAME$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "display-name" element
     */
    public int sizeOfDisplayNameArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DISPLAYNAME$2);
        }
    }
    
    /**
     * Sets array of all "display-name" element
     */
    public void setDisplayNameArray(com.sun.java.xml.ns.javaee.DisplayNameType[] displayNameArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(displayNameArray, DISPLAYNAME$2);
        }
    }
    
    /**
     * Sets ith "display-name" element
     */
    public void setDisplayNameArray(int i, com.sun.java.xml.ns.javaee.DisplayNameType displayName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.javaee.DisplayNameType target = null;
            target = (com.sun.java.xml.ns.javaee.DisplayNameType)get_store().find_element_user(DISPLAYNAME$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(displayName);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "display-name" element
     */
    public com.sun.java.xml.ns.javaee.DisplayNameType insertNewDisplayName(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.javaee.DisplayNameType target = null;
            target = (com.sun.java.xml.ns.javaee.DisplayNameType)get_store().insert_element_user(DISPLAYNAME$2, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "display-name" element
     */
    public com.sun.java.xml.ns.javaee.DisplayNameType addNewDisplayName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.javaee.DisplayNameType target = null;
            target = (com.sun.java.xml.ns.javaee.DisplayNameType)get_store().add_element_user(DISPLAYNAME$2);
            return target;
        }
    }
    
    /**
     * Removes the ith "display-name" element
     */
    public void removeDisplayName(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DISPLAYNAME$2, i);
        }
    }
    
    /**
     * Gets a List of "icon" elements
     */
    public java.util.List<com.sun.java.xml.ns.javaee.IconType> getIconList()
    {
        final class IconList extends java.util.AbstractList<com.sun.java.xml.ns.javaee.IconType>
        {
            public com.sun.java.xml.ns.javaee.IconType get(int i)
                { return ServiceRefTypeImpl.this.getIconArray(i); }
            
            public com.sun.java.xml.ns.javaee.IconType set(int i, com.sun.java.xml.ns.javaee.IconType o)
            {
                com.sun.java.xml.ns.javaee.IconType old = ServiceRefTypeImpl.this.getIconArray(i);
                ServiceRefTypeImpl.this.setIconArray(i, o);
                return old;
            }
            
            public void add(int i, com.sun.java.xml.ns.javaee.IconType o)
                { ServiceRefTypeImpl.this.insertNewIcon(i).set(o); }
            
            public com.sun.java.xml.ns.javaee.IconType remove(int i)
            {
                com.sun.java.xml.ns.javaee.IconType old = ServiceRefTypeImpl.this.getIconArray(i);
                ServiceRefTypeImpl.this.removeIcon(i);
                return old;
            }
            
            public int size()
                { return ServiceRefTypeImpl.this.sizeOfIconArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new IconList();
        }
    }
    
    /**
     * Gets array of all "icon" elements
     * @deprecated
     */
    public com.sun.java.xml.ns.javaee.IconType[] getIconArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List<com.sun.java.xml.ns.javaee.IconType> targetList = new java.util.ArrayList<com.sun.java.xml.ns.javaee.IconType>();
            get_store().find_all_element_users(ICON$4, targetList);
            com.sun.java.xml.ns.javaee.IconType[] result = new com.sun.java.xml.ns.javaee.IconType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "icon" element
     */
    public com.sun.java.xml.ns.javaee.IconType getIconArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.javaee.IconType target = null;
            target = (com.sun.java.xml.ns.javaee.IconType)get_store().find_element_user(ICON$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "icon" element
     */
    public int sizeOfIconArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ICON$4);
        }
    }
    
    /**
     * Sets array of all "icon" element
     */
    public void setIconArray(com.sun.java.xml.ns.javaee.IconType[] iconArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(iconArray, ICON$4);
        }
    }
    
    /**
     * Sets ith "icon" element
     */
    public void setIconArray(int i, com.sun.java.xml.ns.javaee.IconType icon)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.javaee.IconType target = null;
            target = (com.sun.java.xml.ns.javaee.IconType)get_store().find_element_user(ICON$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(icon);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "icon" element
     */
    public com.sun.java.xml.ns.javaee.IconType insertNewIcon(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.javaee.IconType target = null;
            target = (com.sun.java.xml.ns.javaee.IconType)get_store().insert_element_user(ICON$4, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "icon" element
     */
    public com.sun.java.xml.ns.javaee.IconType addNewIcon()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.javaee.IconType target = null;
            target = (com.sun.java.xml.ns.javaee.IconType)get_store().add_element_user(ICON$4);
            return target;
        }
    }
    
    /**
     * Removes the ith "icon" element
     */
    public void removeIcon(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ICON$4, i);
        }
    }
    
    /**
     * Gets the "service-ref-name" element
     */
    public com.sun.java.xml.ns.javaee.JndiNameType getServiceRefName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.javaee.JndiNameType target = null;
            target = (com.sun.java.xml.ns.javaee.JndiNameType)get_store().find_element_user(SERVICEREFNAME$6, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "service-ref-name" element
     */
    public void setServiceRefName(com.sun.java.xml.ns.javaee.JndiNameType serviceRefName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.javaee.JndiNameType target = null;
            target = (com.sun.java.xml.ns.javaee.JndiNameType)get_store().find_element_user(SERVICEREFNAME$6, 0);
            if (target == null)
            {
                target = (com.sun.java.xml.ns.javaee.JndiNameType)get_store().add_element_user(SERVICEREFNAME$6);
            }
            target.set(serviceRefName);
        }
    }
    
    /**
     * Appends and returns a new empty "service-ref-name" element
     */
    public com.sun.java.xml.ns.javaee.JndiNameType addNewServiceRefName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.javaee.JndiNameType target = null;
            target = (com.sun.java.xml.ns.javaee.JndiNameType)get_store().add_element_user(SERVICEREFNAME$6);
            return target;
        }
    }
    
    /**
     * Gets the "service-interface" element
     */
    public com.sun.java.xml.ns.javaee.FullyQualifiedClassType getServiceInterface()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.javaee.FullyQualifiedClassType target = null;
            target = (com.sun.java.xml.ns.javaee.FullyQualifiedClassType)get_store().find_element_user(SERVICEINTERFACE$8, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "service-interface" element
     */
    public void setServiceInterface(com.sun.java.xml.ns.javaee.FullyQualifiedClassType serviceInterface)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.javaee.FullyQualifiedClassType target = null;
            target = (com.sun.java.xml.ns.javaee.FullyQualifiedClassType)get_store().find_element_user(SERVICEINTERFACE$8, 0);
            if (target == null)
            {
                target = (com.sun.java.xml.ns.javaee.FullyQualifiedClassType)get_store().add_element_user(SERVICEINTERFACE$8);
            }
            target.set(serviceInterface);
        }
    }
    
    /**
     * Appends and returns a new empty "service-interface" element
     */
    public com.sun.java.xml.ns.javaee.FullyQualifiedClassType addNewServiceInterface()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.javaee.FullyQualifiedClassType target = null;
            target = (com.sun.java.xml.ns.javaee.FullyQualifiedClassType)get_store().add_element_user(SERVICEINTERFACE$8);
            return target;
        }
    }
    
    /**
     * Gets the "service-ref-type" element
     */
    public com.sun.java.xml.ns.javaee.FullyQualifiedClassType getServiceRefType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.javaee.FullyQualifiedClassType target = null;
            target = (com.sun.java.xml.ns.javaee.FullyQualifiedClassType)get_store().find_element_user(SERVICEREFTYPE$10, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "service-ref-type" element
     */
    public boolean isSetServiceRefType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SERVICEREFTYPE$10) != 0;
        }
    }
    
    /**
     * Sets the "service-ref-type" element
     */
    public void setServiceRefType(com.sun.java.xml.ns.javaee.FullyQualifiedClassType serviceRefType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.javaee.FullyQualifiedClassType target = null;
            target = (com.sun.java.xml.ns.javaee.FullyQualifiedClassType)get_store().find_element_user(SERVICEREFTYPE$10, 0);
            if (target == null)
            {
                target = (com.sun.java.xml.ns.javaee.FullyQualifiedClassType)get_store().add_element_user(SERVICEREFTYPE$10);
            }
            target.set(serviceRefType);
        }
    }
    
    /**
     * Appends and returns a new empty "service-ref-type" element
     */
    public com.sun.java.xml.ns.javaee.FullyQualifiedClassType addNewServiceRefType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.javaee.FullyQualifiedClassType target = null;
            target = (com.sun.java.xml.ns.javaee.FullyQualifiedClassType)get_store().add_element_user(SERVICEREFTYPE$10);
            return target;
        }
    }
    
    /**
     * Unsets the "service-ref-type" element
     */
    public void unsetServiceRefType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SERVICEREFTYPE$10, 0);
        }
    }
    
    /**
     * Gets the "wsdl-file" element
     */
    public com.sun.java.xml.ns.javaee.XsdAnyURIType getWsdlFile()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.javaee.XsdAnyURIType target = null;
            target = (com.sun.java.xml.ns.javaee.XsdAnyURIType)get_store().find_element_user(WSDLFILE$12, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "wsdl-file" element
     */
    public boolean isSetWsdlFile()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(WSDLFILE$12) != 0;
        }
    }
    
    /**
     * Sets the "wsdl-file" element
     */
    public void setWsdlFile(com.sun.java.xml.ns.javaee.XsdAnyURIType wsdlFile)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.javaee.XsdAnyURIType target = null;
            target = (com.sun.java.xml.ns.javaee.XsdAnyURIType)get_store().find_element_user(WSDLFILE$12, 0);
            if (target == null)
            {
                target = (com.sun.java.xml.ns.javaee.XsdAnyURIType)get_store().add_element_user(WSDLFILE$12);
            }
            target.set(wsdlFile);
        }
    }
    
    /**
     * Appends and returns a new empty "wsdl-file" element
     */
    public com.sun.java.xml.ns.javaee.XsdAnyURIType addNewWsdlFile()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.javaee.XsdAnyURIType target = null;
            target = (com.sun.java.xml.ns.javaee.XsdAnyURIType)get_store().add_element_user(WSDLFILE$12);
            return target;
        }
    }
    
    /**
     * Unsets the "wsdl-file" element
     */
    public void unsetWsdlFile()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(WSDLFILE$12, 0);
        }
    }
    
    /**
     * Gets the "jaxrpc-mapping-file" element
     */
    public com.sun.java.xml.ns.javaee.PathType getJaxrpcMappingFile()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.javaee.PathType target = null;
            target = (com.sun.java.xml.ns.javaee.PathType)get_store().find_element_user(JAXRPCMAPPINGFILE$14, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "jaxrpc-mapping-file" element
     */
    public boolean isSetJaxrpcMappingFile()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(JAXRPCMAPPINGFILE$14) != 0;
        }
    }
    
    /**
     * Sets the "jaxrpc-mapping-file" element
     */
    public void setJaxrpcMappingFile(com.sun.java.xml.ns.javaee.PathType jaxrpcMappingFile)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.javaee.PathType target = null;
            target = (com.sun.java.xml.ns.javaee.PathType)get_store().find_element_user(JAXRPCMAPPINGFILE$14, 0);
            if (target == null)
            {
                target = (com.sun.java.xml.ns.javaee.PathType)get_store().add_element_user(JAXRPCMAPPINGFILE$14);
            }
            target.set(jaxrpcMappingFile);
        }
    }
    
    /**
     * Appends and returns a new empty "jaxrpc-mapping-file" element
     */
    public com.sun.java.xml.ns.javaee.PathType addNewJaxrpcMappingFile()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.javaee.PathType target = null;
            target = (com.sun.java.xml.ns.javaee.PathType)get_store().add_element_user(JAXRPCMAPPINGFILE$14);
            return target;
        }
    }
    
    /**
     * Unsets the "jaxrpc-mapping-file" element
     */
    public void unsetJaxrpcMappingFile()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(JAXRPCMAPPINGFILE$14, 0);
        }
    }
    
    /**
     * Gets the "service-qname" element
     */
    public com.sun.java.xml.ns.javaee.XsdQNameType getServiceQname()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.javaee.XsdQNameType target = null;
            target = (com.sun.java.xml.ns.javaee.XsdQNameType)get_store().find_element_user(SERVICEQNAME$16, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "service-qname" element
     */
    public boolean isSetServiceQname()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SERVICEQNAME$16) != 0;
        }
    }
    
    /**
     * Sets the "service-qname" element
     */
    public void setServiceQname(com.sun.java.xml.ns.javaee.XsdQNameType serviceQname)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.javaee.XsdQNameType target = null;
            target = (com.sun.java.xml.ns.javaee.XsdQNameType)get_store().find_element_user(SERVICEQNAME$16, 0);
            if (target == null)
            {
                target = (com.sun.java.xml.ns.javaee.XsdQNameType)get_store().add_element_user(SERVICEQNAME$16);
            }
            target.set(serviceQname);
        }
    }
    
    /**
     * Appends and returns a new empty "service-qname" element
     */
    public com.sun.java.xml.ns.javaee.XsdQNameType addNewServiceQname()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.javaee.XsdQNameType target = null;
            target = (com.sun.java.xml.ns.javaee.XsdQNameType)get_store().add_element_user(SERVICEQNAME$16);
            return target;
        }
    }
    
    /**
     * Unsets the "service-qname" element
     */
    public void unsetServiceQname()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SERVICEQNAME$16, 0);
        }
    }
    
    /**
     * Gets a List of "port-component-ref" elements
     */
    public java.util.List<com.sun.java.xml.ns.javaee.PortComponentRefType> getPortComponentRefList()
    {
        final class PortComponentRefList extends java.util.AbstractList<com.sun.java.xml.ns.javaee.PortComponentRefType>
        {
            public com.sun.java.xml.ns.javaee.PortComponentRefType get(int i)
                { return ServiceRefTypeImpl.this.getPortComponentRefArray(i); }
            
            public com.sun.java.xml.ns.javaee.PortComponentRefType set(int i, com.sun.java.xml.ns.javaee.PortComponentRefType o)
            {
                com.sun.java.xml.ns.javaee.PortComponentRefType old = ServiceRefTypeImpl.this.getPortComponentRefArray(i);
                ServiceRefTypeImpl.this.setPortComponentRefArray(i, o);
                return old;
            }
            
            public void add(int i, com.sun.java.xml.ns.javaee.PortComponentRefType o)
                { ServiceRefTypeImpl.this.insertNewPortComponentRef(i).set(o); }
            
            public com.sun.java.xml.ns.javaee.PortComponentRefType remove(int i)
            {
                com.sun.java.xml.ns.javaee.PortComponentRefType old = ServiceRefTypeImpl.this.getPortComponentRefArray(i);
                ServiceRefTypeImpl.this.removePortComponentRef(i);
                return old;
            }
            
            public int size()
                { return ServiceRefTypeImpl.this.sizeOfPortComponentRefArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new PortComponentRefList();
        }
    }
    
    /**
     * Gets array of all "port-component-ref" elements
     * @deprecated
     */
    public com.sun.java.xml.ns.javaee.PortComponentRefType[] getPortComponentRefArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List<com.sun.java.xml.ns.javaee.PortComponentRefType> targetList = new java.util.ArrayList<com.sun.java.xml.ns.javaee.PortComponentRefType>();
            get_store().find_all_element_users(PORTCOMPONENTREF$18, targetList);
            com.sun.java.xml.ns.javaee.PortComponentRefType[] result = new com.sun.java.xml.ns.javaee.PortComponentRefType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "port-component-ref" element
     */
    public com.sun.java.xml.ns.javaee.PortComponentRefType getPortComponentRefArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.javaee.PortComponentRefType target = null;
            target = (com.sun.java.xml.ns.javaee.PortComponentRefType)get_store().find_element_user(PORTCOMPONENTREF$18, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "port-component-ref" element
     */
    public int sizeOfPortComponentRefArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PORTCOMPONENTREF$18);
        }
    }
    
    /**
     * Sets array of all "port-component-ref" element
     */
    public void setPortComponentRefArray(com.sun.java.xml.ns.javaee.PortComponentRefType[] portComponentRefArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(portComponentRefArray, PORTCOMPONENTREF$18);
        }
    }
    
    /**
     * Sets ith "port-component-ref" element
     */
    public void setPortComponentRefArray(int i, com.sun.java.xml.ns.javaee.PortComponentRefType portComponentRef)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.javaee.PortComponentRefType target = null;
            target = (com.sun.java.xml.ns.javaee.PortComponentRefType)get_store().find_element_user(PORTCOMPONENTREF$18, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(portComponentRef);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "port-component-ref" element
     */
    public com.sun.java.xml.ns.javaee.PortComponentRefType insertNewPortComponentRef(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.javaee.PortComponentRefType target = null;
            target = (com.sun.java.xml.ns.javaee.PortComponentRefType)get_store().insert_element_user(PORTCOMPONENTREF$18, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "port-component-ref" element
     */
    public com.sun.java.xml.ns.javaee.PortComponentRefType addNewPortComponentRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.javaee.PortComponentRefType target = null;
            target = (com.sun.java.xml.ns.javaee.PortComponentRefType)get_store().add_element_user(PORTCOMPONENTREF$18);
            return target;
        }
    }
    
    /**
     * Removes the ith "port-component-ref" element
     */
    public void removePortComponentRef(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PORTCOMPONENTREF$18, i);
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
                { return ServiceRefTypeImpl.this.getHandlerArray(i); }
            
            public com.sun.java.xml.ns.javaee.ServiceRefHandlerType set(int i, com.sun.java.xml.ns.javaee.ServiceRefHandlerType o)
            {
                com.sun.java.xml.ns.javaee.ServiceRefHandlerType old = ServiceRefTypeImpl.this.getHandlerArray(i);
                ServiceRefTypeImpl.this.setHandlerArray(i, o);
                return old;
            }
            
            public void add(int i, com.sun.java.xml.ns.javaee.ServiceRefHandlerType o)
                { ServiceRefTypeImpl.this.insertNewHandler(i).set(o); }
            
            public com.sun.java.xml.ns.javaee.ServiceRefHandlerType remove(int i)
            {
                com.sun.java.xml.ns.javaee.ServiceRefHandlerType old = ServiceRefTypeImpl.this.getHandlerArray(i);
                ServiceRefTypeImpl.this.removeHandler(i);
                return old;
            }
            
            public int size()
                { return ServiceRefTypeImpl.this.sizeOfHandlerArray(); }
            
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
            get_store().find_all_element_users(HANDLER$20, targetList);
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
            target = (com.sun.java.xml.ns.javaee.ServiceRefHandlerType)get_store().find_element_user(HANDLER$20, i);
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
            return get_store().count_elements(HANDLER$20);
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
            arraySetterHelper(handlerArray, HANDLER$20);
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
            target = (com.sun.java.xml.ns.javaee.ServiceRefHandlerType)get_store().find_element_user(HANDLER$20, i);
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
            target = (com.sun.java.xml.ns.javaee.ServiceRefHandlerType)get_store().insert_element_user(HANDLER$20, i);
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
            target = (com.sun.java.xml.ns.javaee.ServiceRefHandlerType)get_store().add_element_user(HANDLER$20);
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
            get_store().remove_element(HANDLER$20, i);
        }
    }
    
    /**
     * Gets the "handler-chains" element
     */
    public com.sun.java.xml.ns.javaee.ServiceRefHandlerChainsType getHandlerChains()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.javaee.ServiceRefHandlerChainsType target = null;
            target = (com.sun.java.xml.ns.javaee.ServiceRefHandlerChainsType)get_store().find_element_user(HANDLERCHAINS$22, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "handler-chains" element
     */
    public boolean isSetHandlerChains()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(HANDLERCHAINS$22) != 0;
        }
    }
    
    /**
     * Sets the "handler-chains" element
     */
    public void setHandlerChains(com.sun.java.xml.ns.javaee.ServiceRefHandlerChainsType handlerChains)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.javaee.ServiceRefHandlerChainsType target = null;
            target = (com.sun.java.xml.ns.javaee.ServiceRefHandlerChainsType)get_store().find_element_user(HANDLERCHAINS$22, 0);
            if (target == null)
            {
                target = (com.sun.java.xml.ns.javaee.ServiceRefHandlerChainsType)get_store().add_element_user(HANDLERCHAINS$22);
            }
            target.set(handlerChains);
        }
    }
    
    /**
     * Appends and returns a new empty "handler-chains" element
     */
    public com.sun.java.xml.ns.javaee.ServiceRefHandlerChainsType addNewHandlerChains()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.javaee.ServiceRefHandlerChainsType target = null;
            target = (com.sun.java.xml.ns.javaee.ServiceRefHandlerChainsType)get_store().add_element_user(HANDLERCHAINS$22);
            return target;
        }
    }
    
    /**
     * Unsets the "handler-chains" element
     */
    public void unsetHandlerChains()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(HANDLERCHAINS$22, 0);
        }
    }
    
    /**
     * Gets the "mapped-name" element
     */
    public com.sun.java.xml.ns.javaee.XsdStringType getMappedName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.javaee.XsdStringType target = null;
            target = (com.sun.java.xml.ns.javaee.XsdStringType)get_store().find_element_user(MAPPEDNAME$24, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "mapped-name" element
     */
    public boolean isSetMappedName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(MAPPEDNAME$24) != 0;
        }
    }
    
    /**
     * Sets the "mapped-name" element
     */
    public void setMappedName(com.sun.java.xml.ns.javaee.XsdStringType mappedName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.javaee.XsdStringType target = null;
            target = (com.sun.java.xml.ns.javaee.XsdStringType)get_store().find_element_user(MAPPEDNAME$24, 0);
            if (target == null)
            {
                target = (com.sun.java.xml.ns.javaee.XsdStringType)get_store().add_element_user(MAPPEDNAME$24);
            }
            target.set(mappedName);
        }
    }
    
    /**
     * Appends and returns a new empty "mapped-name" element
     */
    public com.sun.java.xml.ns.javaee.XsdStringType addNewMappedName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.javaee.XsdStringType target = null;
            target = (com.sun.java.xml.ns.javaee.XsdStringType)get_store().add_element_user(MAPPEDNAME$24);
            return target;
        }
    }
    
    /**
     * Unsets the "mapped-name" element
     */
    public void unsetMappedName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(MAPPEDNAME$24, 0);
        }
    }
    
    /**
     * Gets a List of "injection-target" elements
     */
    public java.util.List<com.sun.java.xml.ns.javaee.InjectionTargetType> getInjectionTargetList()
    {
        final class InjectionTargetList extends java.util.AbstractList<com.sun.java.xml.ns.javaee.InjectionTargetType>
        {
            public com.sun.java.xml.ns.javaee.InjectionTargetType get(int i)
                { return ServiceRefTypeImpl.this.getInjectionTargetArray(i); }
            
            public com.sun.java.xml.ns.javaee.InjectionTargetType set(int i, com.sun.java.xml.ns.javaee.InjectionTargetType o)
            {
                com.sun.java.xml.ns.javaee.InjectionTargetType old = ServiceRefTypeImpl.this.getInjectionTargetArray(i);
                ServiceRefTypeImpl.this.setInjectionTargetArray(i, o);
                return old;
            }
            
            public void add(int i, com.sun.java.xml.ns.javaee.InjectionTargetType o)
                { ServiceRefTypeImpl.this.insertNewInjectionTarget(i).set(o); }
            
            public com.sun.java.xml.ns.javaee.InjectionTargetType remove(int i)
            {
                com.sun.java.xml.ns.javaee.InjectionTargetType old = ServiceRefTypeImpl.this.getInjectionTargetArray(i);
                ServiceRefTypeImpl.this.removeInjectionTarget(i);
                return old;
            }
            
            public int size()
                { return ServiceRefTypeImpl.this.sizeOfInjectionTargetArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new InjectionTargetList();
        }
    }
    
    /**
     * Gets array of all "injection-target" elements
     * @deprecated
     */
    public com.sun.java.xml.ns.javaee.InjectionTargetType[] getInjectionTargetArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List<com.sun.java.xml.ns.javaee.InjectionTargetType> targetList = new java.util.ArrayList<com.sun.java.xml.ns.javaee.InjectionTargetType>();
            get_store().find_all_element_users(INJECTIONTARGET$26, targetList);
            com.sun.java.xml.ns.javaee.InjectionTargetType[] result = new com.sun.java.xml.ns.javaee.InjectionTargetType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "injection-target" element
     */
    public com.sun.java.xml.ns.javaee.InjectionTargetType getInjectionTargetArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.javaee.InjectionTargetType target = null;
            target = (com.sun.java.xml.ns.javaee.InjectionTargetType)get_store().find_element_user(INJECTIONTARGET$26, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "injection-target" element
     */
    public int sizeOfInjectionTargetArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(INJECTIONTARGET$26);
        }
    }
    
    /**
     * Sets array of all "injection-target" element
     */
    public void setInjectionTargetArray(com.sun.java.xml.ns.javaee.InjectionTargetType[] injectionTargetArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(injectionTargetArray, INJECTIONTARGET$26);
        }
    }
    
    /**
     * Sets ith "injection-target" element
     */
    public void setInjectionTargetArray(int i, com.sun.java.xml.ns.javaee.InjectionTargetType injectionTarget)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.javaee.InjectionTargetType target = null;
            target = (com.sun.java.xml.ns.javaee.InjectionTargetType)get_store().find_element_user(INJECTIONTARGET$26, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(injectionTarget);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "injection-target" element
     */
    public com.sun.java.xml.ns.javaee.InjectionTargetType insertNewInjectionTarget(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.javaee.InjectionTargetType target = null;
            target = (com.sun.java.xml.ns.javaee.InjectionTargetType)get_store().insert_element_user(INJECTIONTARGET$26, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "injection-target" element
     */
    public com.sun.java.xml.ns.javaee.InjectionTargetType addNewInjectionTarget()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.javaee.InjectionTargetType target = null;
            target = (com.sun.java.xml.ns.javaee.InjectionTargetType)get_store().add_element_user(INJECTIONTARGET$26);
            return target;
        }
    }
    
    /**
     * Removes the ith "injection-target" element
     */
    public void removeInjectionTarget(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(INJECTIONTARGET$26, i);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ID$28);
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
            target = (org.apache.xmlbeans.XmlID)get_store().find_attribute_user(ID$28);
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
            return get_store().find_attribute_user(ID$28) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ID$28);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ID$28);
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
            target = (org.apache.xmlbeans.XmlID)get_store().find_attribute_user(ID$28);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlID)get_store().add_attribute_user(ID$28);
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
            get_store().remove_attribute(ID$28);
        }
    }
}
