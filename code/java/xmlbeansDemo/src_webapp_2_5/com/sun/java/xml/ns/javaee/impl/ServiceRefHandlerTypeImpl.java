/*
 * XML Type:  service-ref_handlerType
 * Namespace: http://java.sun.com/xml/ns/javaee
 * Java type: com.sun.java.xml.ns.javaee.ServiceRefHandlerType
 *
 * Automatically generated - do not modify.
 */
package com.sun.java.xml.ns.javaee.impl;
/**
 * An XML service-ref_handlerType(@http://java.sun.com/xml/ns/javaee).
 *
 * This is a complex type.
 */
public class ServiceRefHandlerTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.sun.java.xml.ns.javaee.ServiceRefHandlerType
{
    private static final long serialVersionUID = 1L;
    
    public ServiceRefHandlerTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DESCRIPTION$0 = 
        new javax.xml.namespace.QName("http://java.sun.com/xml/ns/javaee", "description");
    private static final javax.xml.namespace.QName DISPLAYNAME$2 = 
        new javax.xml.namespace.QName("http://java.sun.com/xml/ns/javaee", "display-name");
    private static final javax.xml.namespace.QName ICON$4 = 
        new javax.xml.namespace.QName("http://java.sun.com/xml/ns/javaee", "icon");
    private static final javax.xml.namespace.QName HANDLERNAME$6 = 
        new javax.xml.namespace.QName("http://java.sun.com/xml/ns/javaee", "handler-name");
    private static final javax.xml.namespace.QName HANDLERCLASS$8 = 
        new javax.xml.namespace.QName("http://java.sun.com/xml/ns/javaee", "handler-class");
    private static final javax.xml.namespace.QName INITPARAM$10 = 
        new javax.xml.namespace.QName("http://java.sun.com/xml/ns/javaee", "init-param");
    private static final javax.xml.namespace.QName SOAPHEADER$12 = 
        new javax.xml.namespace.QName("http://java.sun.com/xml/ns/javaee", "soap-header");
    private static final javax.xml.namespace.QName SOAPROLE$14 = 
        new javax.xml.namespace.QName("http://java.sun.com/xml/ns/javaee", "soap-role");
    private static final javax.xml.namespace.QName PORTNAME$16 = 
        new javax.xml.namespace.QName("http://java.sun.com/xml/ns/javaee", "port-name");
    private static final javax.xml.namespace.QName ID$18 = 
        new javax.xml.namespace.QName("", "id");
    
    
    /**
     * Gets a List of "description" elements
     */
    public java.util.List<com.sun.java.xml.ns.javaee.DescriptionType> getDescriptionList()
    {
        final class DescriptionList extends java.util.AbstractList<com.sun.java.xml.ns.javaee.DescriptionType>
        {
            public com.sun.java.xml.ns.javaee.DescriptionType get(int i)
                { return ServiceRefHandlerTypeImpl.this.getDescriptionArray(i); }
            
            public com.sun.java.xml.ns.javaee.DescriptionType set(int i, com.sun.java.xml.ns.javaee.DescriptionType o)
            {
                com.sun.java.xml.ns.javaee.DescriptionType old = ServiceRefHandlerTypeImpl.this.getDescriptionArray(i);
                ServiceRefHandlerTypeImpl.this.setDescriptionArray(i, o);
                return old;
            }
            
            public void add(int i, com.sun.java.xml.ns.javaee.DescriptionType o)
                { ServiceRefHandlerTypeImpl.this.insertNewDescription(i).set(o); }
            
            public com.sun.java.xml.ns.javaee.DescriptionType remove(int i)
            {
                com.sun.java.xml.ns.javaee.DescriptionType old = ServiceRefHandlerTypeImpl.this.getDescriptionArray(i);
                ServiceRefHandlerTypeImpl.this.removeDescription(i);
                return old;
            }
            
            public int size()
                { return ServiceRefHandlerTypeImpl.this.sizeOfDescriptionArray(); }
            
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
                { return ServiceRefHandlerTypeImpl.this.getDisplayNameArray(i); }
            
            public com.sun.java.xml.ns.javaee.DisplayNameType set(int i, com.sun.java.xml.ns.javaee.DisplayNameType o)
            {
                com.sun.java.xml.ns.javaee.DisplayNameType old = ServiceRefHandlerTypeImpl.this.getDisplayNameArray(i);
                ServiceRefHandlerTypeImpl.this.setDisplayNameArray(i, o);
                return old;
            }
            
            public void add(int i, com.sun.java.xml.ns.javaee.DisplayNameType o)
                { ServiceRefHandlerTypeImpl.this.insertNewDisplayName(i).set(o); }
            
            public com.sun.java.xml.ns.javaee.DisplayNameType remove(int i)
            {
                com.sun.java.xml.ns.javaee.DisplayNameType old = ServiceRefHandlerTypeImpl.this.getDisplayNameArray(i);
                ServiceRefHandlerTypeImpl.this.removeDisplayName(i);
                return old;
            }
            
            public int size()
                { return ServiceRefHandlerTypeImpl.this.sizeOfDisplayNameArray(); }
            
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
                { return ServiceRefHandlerTypeImpl.this.getIconArray(i); }
            
            public com.sun.java.xml.ns.javaee.IconType set(int i, com.sun.java.xml.ns.javaee.IconType o)
            {
                com.sun.java.xml.ns.javaee.IconType old = ServiceRefHandlerTypeImpl.this.getIconArray(i);
                ServiceRefHandlerTypeImpl.this.setIconArray(i, o);
                return old;
            }
            
            public void add(int i, com.sun.java.xml.ns.javaee.IconType o)
                { ServiceRefHandlerTypeImpl.this.insertNewIcon(i).set(o); }
            
            public com.sun.java.xml.ns.javaee.IconType remove(int i)
            {
                com.sun.java.xml.ns.javaee.IconType old = ServiceRefHandlerTypeImpl.this.getIconArray(i);
                ServiceRefHandlerTypeImpl.this.removeIcon(i);
                return old;
            }
            
            public int size()
                { return ServiceRefHandlerTypeImpl.this.sizeOfIconArray(); }
            
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
     * Gets the "handler-name" element
     */
    public com.sun.java.xml.ns.javaee.String getHandlerName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.javaee.String target = null;
            target = (com.sun.java.xml.ns.javaee.String)get_store().find_element_user(HANDLERNAME$6, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "handler-name" element
     */
    public void setHandlerName(com.sun.java.xml.ns.javaee.String handlerName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.javaee.String target = null;
            target = (com.sun.java.xml.ns.javaee.String)get_store().find_element_user(HANDLERNAME$6, 0);
            if (target == null)
            {
                target = (com.sun.java.xml.ns.javaee.String)get_store().add_element_user(HANDLERNAME$6);
            }
            target.set(handlerName);
        }
    }
    
    /**
     * Appends and returns a new empty "handler-name" element
     */
    public com.sun.java.xml.ns.javaee.String addNewHandlerName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.javaee.String target = null;
            target = (com.sun.java.xml.ns.javaee.String)get_store().add_element_user(HANDLERNAME$6);
            return target;
        }
    }
    
    /**
     * Gets the "handler-class" element
     */
    public com.sun.java.xml.ns.javaee.FullyQualifiedClassType getHandlerClass()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.javaee.FullyQualifiedClassType target = null;
            target = (com.sun.java.xml.ns.javaee.FullyQualifiedClassType)get_store().find_element_user(HANDLERCLASS$8, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "handler-class" element
     */
    public void setHandlerClass(com.sun.java.xml.ns.javaee.FullyQualifiedClassType handlerClass)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.javaee.FullyQualifiedClassType target = null;
            target = (com.sun.java.xml.ns.javaee.FullyQualifiedClassType)get_store().find_element_user(HANDLERCLASS$8, 0);
            if (target == null)
            {
                target = (com.sun.java.xml.ns.javaee.FullyQualifiedClassType)get_store().add_element_user(HANDLERCLASS$8);
            }
            target.set(handlerClass);
        }
    }
    
    /**
     * Appends and returns a new empty "handler-class" element
     */
    public com.sun.java.xml.ns.javaee.FullyQualifiedClassType addNewHandlerClass()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.javaee.FullyQualifiedClassType target = null;
            target = (com.sun.java.xml.ns.javaee.FullyQualifiedClassType)get_store().add_element_user(HANDLERCLASS$8);
            return target;
        }
    }
    
    /**
     * Gets a List of "init-param" elements
     */
    public java.util.List<com.sun.java.xml.ns.javaee.ParamValueType> getInitParamList()
    {
        final class InitParamList extends java.util.AbstractList<com.sun.java.xml.ns.javaee.ParamValueType>
        {
            public com.sun.java.xml.ns.javaee.ParamValueType get(int i)
                { return ServiceRefHandlerTypeImpl.this.getInitParamArray(i); }
            
            public com.sun.java.xml.ns.javaee.ParamValueType set(int i, com.sun.java.xml.ns.javaee.ParamValueType o)
            {
                com.sun.java.xml.ns.javaee.ParamValueType old = ServiceRefHandlerTypeImpl.this.getInitParamArray(i);
                ServiceRefHandlerTypeImpl.this.setInitParamArray(i, o);
                return old;
            }
            
            public void add(int i, com.sun.java.xml.ns.javaee.ParamValueType o)
                { ServiceRefHandlerTypeImpl.this.insertNewInitParam(i).set(o); }
            
            public com.sun.java.xml.ns.javaee.ParamValueType remove(int i)
            {
                com.sun.java.xml.ns.javaee.ParamValueType old = ServiceRefHandlerTypeImpl.this.getInitParamArray(i);
                ServiceRefHandlerTypeImpl.this.removeInitParam(i);
                return old;
            }
            
            public int size()
                { return ServiceRefHandlerTypeImpl.this.sizeOfInitParamArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new InitParamList();
        }
    }
    
    /**
     * Gets array of all "init-param" elements
     * @deprecated
     */
    public com.sun.java.xml.ns.javaee.ParamValueType[] getInitParamArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List<com.sun.java.xml.ns.javaee.ParamValueType> targetList = new java.util.ArrayList<com.sun.java.xml.ns.javaee.ParamValueType>();
            get_store().find_all_element_users(INITPARAM$10, targetList);
            com.sun.java.xml.ns.javaee.ParamValueType[] result = new com.sun.java.xml.ns.javaee.ParamValueType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "init-param" element
     */
    public com.sun.java.xml.ns.javaee.ParamValueType getInitParamArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.javaee.ParamValueType target = null;
            target = (com.sun.java.xml.ns.javaee.ParamValueType)get_store().find_element_user(INITPARAM$10, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "init-param" element
     */
    public int sizeOfInitParamArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(INITPARAM$10);
        }
    }
    
    /**
     * Sets array of all "init-param" element
     */
    public void setInitParamArray(com.sun.java.xml.ns.javaee.ParamValueType[] initParamArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(initParamArray, INITPARAM$10);
        }
    }
    
    /**
     * Sets ith "init-param" element
     */
    public void setInitParamArray(int i, com.sun.java.xml.ns.javaee.ParamValueType initParam)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.javaee.ParamValueType target = null;
            target = (com.sun.java.xml.ns.javaee.ParamValueType)get_store().find_element_user(INITPARAM$10, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(initParam);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "init-param" element
     */
    public com.sun.java.xml.ns.javaee.ParamValueType insertNewInitParam(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.javaee.ParamValueType target = null;
            target = (com.sun.java.xml.ns.javaee.ParamValueType)get_store().insert_element_user(INITPARAM$10, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "init-param" element
     */
    public com.sun.java.xml.ns.javaee.ParamValueType addNewInitParam()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.javaee.ParamValueType target = null;
            target = (com.sun.java.xml.ns.javaee.ParamValueType)get_store().add_element_user(INITPARAM$10);
            return target;
        }
    }
    
    /**
     * Removes the ith "init-param" element
     */
    public void removeInitParam(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(INITPARAM$10, i);
        }
    }
    
    /**
     * Gets a List of "soap-header" elements
     */
    public java.util.List<com.sun.java.xml.ns.javaee.XsdQNameType> getSoapHeaderList()
    {
        final class SoapHeaderList extends java.util.AbstractList<com.sun.java.xml.ns.javaee.XsdQNameType>
        {
            public com.sun.java.xml.ns.javaee.XsdQNameType get(int i)
                { return ServiceRefHandlerTypeImpl.this.getSoapHeaderArray(i); }
            
            public com.sun.java.xml.ns.javaee.XsdQNameType set(int i, com.sun.java.xml.ns.javaee.XsdQNameType o)
            {
                com.sun.java.xml.ns.javaee.XsdQNameType old = ServiceRefHandlerTypeImpl.this.getSoapHeaderArray(i);
                ServiceRefHandlerTypeImpl.this.setSoapHeaderArray(i, o);
                return old;
            }
            
            public void add(int i, com.sun.java.xml.ns.javaee.XsdQNameType o)
                { ServiceRefHandlerTypeImpl.this.insertNewSoapHeader(i).set(o); }
            
            public com.sun.java.xml.ns.javaee.XsdQNameType remove(int i)
            {
                com.sun.java.xml.ns.javaee.XsdQNameType old = ServiceRefHandlerTypeImpl.this.getSoapHeaderArray(i);
                ServiceRefHandlerTypeImpl.this.removeSoapHeader(i);
                return old;
            }
            
            public int size()
                { return ServiceRefHandlerTypeImpl.this.sizeOfSoapHeaderArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new SoapHeaderList();
        }
    }
    
    /**
     * Gets array of all "soap-header" elements
     * @deprecated
     */
    public com.sun.java.xml.ns.javaee.XsdQNameType[] getSoapHeaderArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List<com.sun.java.xml.ns.javaee.XsdQNameType> targetList = new java.util.ArrayList<com.sun.java.xml.ns.javaee.XsdQNameType>();
            get_store().find_all_element_users(SOAPHEADER$12, targetList);
            com.sun.java.xml.ns.javaee.XsdQNameType[] result = new com.sun.java.xml.ns.javaee.XsdQNameType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "soap-header" element
     */
    public com.sun.java.xml.ns.javaee.XsdQNameType getSoapHeaderArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.javaee.XsdQNameType target = null;
            target = (com.sun.java.xml.ns.javaee.XsdQNameType)get_store().find_element_user(SOAPHEADER$12, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "soap-header" element
     */
    public int sizeOfSoapHeaderArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SOAPHEADER$12);
        }
    }
    
    /**
     * Sets array of all "soap-header" element
     */
    public void setSoapHeaderArray(com.sun.java.xml.ns.javaee.XsdQNameType[] soapHeaderArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(soapHeaderArray, SOAPHEADER$12);
        }
    }
    
    /**
     * Sets ith "soap-header" element
     */
    public void setSoapHeaderArray(int i, com.sun.java.xml.ns.javaee.XsdQNameType soapHeader)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.javaee.XsdQNameType target = null;
            target = (com.sun.java.xml.ns.javaee.XsdQNameType)get_store().find_element_user(SOAPHEADER$12, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(soapHeader);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "soap-header" element
     */
    public com.sun.java.xml.ns.javaee.XsdQNameType insertNewSoapHeader(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.javaee.XsdQNameType target = null;
            target = (com.sun.java.xml.ns.javaee.XsdQNameType)get_store().insert_element_user(SOAPHEADER$12, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "soap-header" element
     */
    public com.sun.java.xml.ns.javaee.XsdQNameType addNewSoapHeader()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.javaee.XsdQNameType target = null;
            target = (com.sun.java.xml.ns.javaee.XsdQNameType)get_store().add_element_user(SOAPHEADER$12);
            return target;
        }
    }
    
    /**
     * Removes the ith "soap-header" element
     */
    public void removeSoapHeader(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SOAPHEADER$12, i);
        }
    }
    
    /**
     * Gets a List of "soap-role" elements
     */
    public java.util.List<com.sun.java.xml.ns.javaee.String> getSoapRoleList()
    {
        final class SoapRoleList extends java.util.AbstractList<com.sun.java.xml.ns.javaee.String>
        {
            public com.sun.java.xml.ns.javaee.String get(int i)
                { return ServiceRefHandlerTypeImpl.this.getSoapRoleArray(i); }
            
            public com.sun.java.xml.ns.javaee.String set(int i, com.sun.java.xml.ns.javaee.String o)
            {
                com.sun.java.xml.ns.javaee.String old = ServiceRefHandlerTypeImpl.this.getSoapRoleArray(i);
                ServiceRefHandlerTypeImpl.this.setSoapRoleArray(i, o);
                return old;
            }
            
            public void add(int i, com.sun.java.xml.ns.javaee.String o)
                { ServiceRefHandlerTypeImpl.this.insertNewSoapRole(i).set(o); }
            
            public com.sun.java.xml.ns.javaee.String remove(int i)
            {
                com.sun.java.xml.ns.javaee.String old = ServiceRefHandlerTypeImpl.this.getSoapRoleArray(i);
                ServiceRefHandlerTypeImpl.this.removeSoapRole(i);
                return old;
            }
            
            public int size()
                { return ServiceRefHandlerTypeImpl.this.sizeOfSoapRoleArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new SoapRoleList();
        }
    }
    
    /**
     * Gets array of all "soap-role" elements
     * @deprecated
     */
    public com.sun.java.xml.ns.javaee.String[] getSoapRoleArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List<com.sun.java.xml.ns.javaee.String> targetList = new java.util.ArrayList<com.sun.java.xml.ns.javaee.String>();
            get_store().find_all_element_users(SOAPROLE$14, targetList);
            com.sun.java.xml.ns.javaee.String[] result = new com.sun.java.xml.ns.javaee.String[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "soap-role" element
     */
    public com.sun.java.xml.ns.javaee.String getSoapRoleArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.javaee.String target = null;
            target = (com.sun.java.xml.ns.javaee.String)get_store().find_element_user(SOAPROLE$14, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "soap-role" element
     */
    public int sizeOfSoapRoleArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SOAPROLE$14);
        }
    }
    
    /**
     * Sets array of all "soap-role" element
     */
    public void setSoapRoleArray(com.sun.java.xml.ns.javaee.String[] soapRoleArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(soapRoleArray, SOAPROLE$14);
        }
    }
    
    /**
     * Sets ith "soap-role" element
     */
    public void setSoapRoleArray(int i, com.sun.java.xml.ns.javaee.String soapRole)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.javaee.String target = null;
            target = (com.sun.java.xml.ns.javaee.String)get_store().find_element_user(SOAPROLE$14, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(soapRole);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "soap-role" element
     */
    public com.sun.java.xml.ns.javaee.String insertNewSoapRole(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.javaee.String target = null;
            target = (com.sun.java.xml.ns.javaee.String)get_store().insert_element_user(SOAPROLE$14, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "soap-role" element
     */
    public com.sun.java.xml.ns.javaee.String addNewSoapRole()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.javaee.String target = null;
            target = (com.sun.java.xml.ns.javaee.String)get_store().add_element_user(SOAPROLE$14);
            return target;
        }
    }
    
    /**
     * Removes the ith "soap-role" element
     */
    public void removeSoapRole(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SOAPROLE$14, i);
        }
    }
    
    /**
     * Gets a List of "port-name" elements
     */
    public java.util.List<com.sun.java.xml.ns.javaee.String> getPortNameList()
    {
        final class PortNameList extends java.util.AbstractList<com.sun.java.xml.ns.javaee.String>
        {
            public com.sun.java.xml.ns.javaee.String get(int i)
                { return ServiceRefHandlerTypeImpl.this.getPortNameArray(i); }
            
            public com.sun.java.xml.ns.javaee.String set(int i, com.sun.java.xml.ns.javaee.String o)
            {
                com.sun.java.xml.ns.javaee.String old = ServiceRefHandlerTypeImpl.this.getPortNameArray(i);
                ServiceRefHandlerTypeImpl.this.setPortNameArray(i, o);
                return old;
            }
            
            public void add(int i, com.sun.java.xml.ns.javaee.String o)
                { ServiceRefHandlerTypeImpl.this.insertNewPortName(i).set(o); }
            
            public com.sun.java.xml.ns.javaee.String remove(int i)
            {
                com.sun.java.xml.ns.javaee.String old = ServiceRefHandlerTypeImpl.this.getPortNameArray(i);
                ServiceRefHandlerTypeImpl.this.removePortName(i);
                return old;
            }
            
            public int size()
                { return ServiceRefHandlerTypeImpl.this.sizeOfPortNameArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new PortNameList();
        }
    }
    
    /**
     * Gets array of all "port-name" elements
     * @deprecated
     */
    public com.sun.java.xml.ns.javaee.String[] getPortNameArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List<com.sun.java.xml.ns.javaee.String> targetList = new java.util.ArrayList<com.sun.java.xml.ns.javaee.String>();
            get_store().find_all_element_users(PORTNAME$16, targetList);
            com.sun.java.xml.ns.javaee.String[] result = new com.sun.java.xml.ns.javaee.String[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "port-name" element
     */
    public com.sun.java.xml.ns.javaee.String getPortNameArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.javaee.String target = null;
            target = (com.sun.java.xml.ns.javaee.String)get_store().find_element_user(PORTNAME$16, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "port-name" element
     */
    public int sizeOfPortNameArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PORTNAME$16);
        }
    }
    
    /**
     * Sets array of all "port-name" element
     */
    public void setPortNameArray(com.sun.java.xml.ns.javaee.String[] portNameArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(portNameArray, PORTNAME$16);
        }
    }
    
    /**
     * Sets ith "port-name" element
     */
    public void setPortNameArray(int i, com.sun.java.xml.ns.javaee.String portName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.javaee.String target = null;
            target = (com.sun.java.xml.ns.javaee.String)get_store().find_element_user(PORTNAME$16, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(portName);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "port-name" element
     */
    public com.sun.java.xml.ns.javaee.String insertNewPortName(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.javaee.String target = null;
            target = (com.sun.java.xml.ns.javaee.String)get_store().insert_element_user(PORTNAME$16, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "port-name" element
     */
    public com.sun.java.xml.ns.javaee.String addNewPortName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.javaee.String target = null;
            target = (com.sun.java.xml.ns.javaee.String)get_store().add_element_user(PORTNAME$16);
            return target;
        }
    }
    
    /**
     * Removes the ith "port-name" element
     */
    public void removePortName(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PORTNAME$16, i);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ID$18);
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
            target = (org.apache.xmlbeans.XmlID)get_store().find_attribute_user(ID$18);
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
            return get_store().find_attribute_user(ID$18) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ID$18);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ID$18);
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
            target = (org.apache.xmlbeans.XmlID)get_store().find_attribute_user(ID$18);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlID)get_store().add_attribute_user(ID$18);
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
            get_store().remove_attribute(ID$18);
        }
    }
}
