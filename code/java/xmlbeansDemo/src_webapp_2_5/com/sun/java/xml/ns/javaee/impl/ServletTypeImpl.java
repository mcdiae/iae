/*
 * XML Type:  servletType
 * Namespace: http://java.sun.com/xml/ns/javaee
 * Java type: com.sun.java.xml.ns.javaee.ServletType
 *
 * Automatically generated - do not modify.
 */
package com.sun.java.xml.ns.javaee.impl;
/**
 * An XML servletType(@http://java.sun.com/xml/ns/javaee).
 *
 * This is a complex type.
 */
public class ServletTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.sun.java.xml.ns.javaee.ServletType
{
    private static final long serialVersionUID = 1L;
    
    public ServletTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DESCRIPTION$0 = 
        new javax.xml.namespace.QName("http://java.sun.com/xml/ns/javaee", "description");
    private static final javax.xml.namespace.QName DISPLAYNAME$2 = 
        new javax.xml.namespace.QName("http://java.sun.com/xml/ns/javaee", "display-name");
    private static final javax.xml.namespace.QName ICON$4 = 
        new javax.xml.namespace.QName("http://java.sun.com/xml/ns/javaee", "icon");
    private static final javax.xml.namespace.QName SERVLETNAME$6 = 
        new javax.xml.namespace.QName("http://java.sun.com/xml/ns/javaee", "servlet-name");
    private static final javax.xml.namespace.QName SERVLETCLASS$8 = 
        new javax.xml.namespace.QName("http://java.sun.com/xml/ns/javaee", "servlet-class");
    private static final javax.xml.namespace.QName JSPFILE$10 = 
        new javax.xml.namespace.QName("http://java.sun.com/xml/ns/javaee", "jsp-file");
    private static final javax.xml.namespace.QName INITPARAM$12 = 
        new javax.xml.namespace.QName("http://java.sun.com/xml/ns/javaee", "init-param");
    private static final javax.xml.namespace.QName LOADONSTARTUP$14 = 
        new javax.xml.namespace.QName("http://java.sun.com/xml/ns/javaee", "load-on-startup");
    private static final javax.xml.namespace.QName RUNAS$16 = 
        new javax.xml.namespace.QName("http://java.sun.com/xml/ns/javaee", "run-as");
    private static final javax.xml.namespace.QName SECURITYROLEREF$18 = 
        new javax.xml.namespace.QName("http://java.sun.com/xml/ns/javaee", "security-role-ref");
    private static final javax.xml.namespace.QName ID$20 = 
        new javax.xml.namespace.QName("", "id");
    
    
    /**
     * Gets a List of "description" elements
     */
    public java.util.List<com.sun.java.xml.ns.javaee.DescriptionType> getDescriptionList()
    {
        final class DescriptionList extends java.util.AbstractList<com.sun.java.xml.ns.javaee.DescriptionType>
        {
            public com.sun.java.xml.ns.javaee.DescriptionType get(int i)
                { return ServletTypeImpl.this.getDescriptionArray(i); }
            
            public com.sun.java.xml.ns.javaee.DescriptionType set(int i, com.sun.java.xml.ns.javaee.DescriptionType o)
            {
                com.sun.java.xml.ns.javaee.DescriptionType old = ServletTypeImpl.this.getDescriptionArray(i);
                ServletTypeImpl.this.setDescriptionArray(i, o);
                return old;
            }
            
            public void add(int i, com.sun.java.xml.ns.javaee.DescriptionType o)
                { ServletTypeImpl.this.insertNewDescription(i).set(o); }
            
            public com.sun.java.xml.ns.javaee.DescriptionType remove(int i)
            {
                com.sun.java.xml.ns.javaee.DescriptionType old = ServletTypeImpl.this.getDescriptionArray(i);
                ServletTypeImpl.this.removeDescription(i);
                return old;
            }
            
            public int size()
                { return ServletTypeImpl.this.sizeOfDescriptionArray(); }
            
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
                { return ServletTypeImpl.this.getDisplayNameArray(i); }
            
            public com.sun.java.xml.ns.javaee.DisplayNameType set(int i, com.sun.java.xml.ns.javaee.DisplayNameType o)
            {
                com.sun.java.xml.ns.javaee.DisplayNameType old = ServletTypeImpl.this.getDisplayNameArray(i);
                ServletTypeImpl.this.setDisplayNameArray(i, o);
                return old;
            }
            
            public void add(int i, com.sun.java.xml.ns.javaee.DisplayNameType o)
                { ServletTypeImpl.this.insertNewDisplayName(i).set(o); }
            
            public com.sun.java.xml.ns.javaee.DisplayNameType remove(int i)
            {
                com.sun.java.xml.ns.javaee.DisplayNameType old = ServletTypeImpl.this.getDisplayNameArray(i);
                ServletTypeImpl.this.removeDisplayName(i);
                return old;
            }
            
            public int size()
                { return ServletTypeImpl.this.sizeOfDisplayNameArray(); }
            
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
                { return ServletTypeImpl.this.getIconArray(i); }
            
            public com.sun.java.xml.ns.javaee.IconType set(int i, com.sun.java.xml.ns.javaee.IconType o)
            {
                com.sun.java.xml.ns.javaee.IconType old = ServletTypeImpl.this.getIconArray(i);
                ServletTypeImpl.this.setIconArray(i, o);
                return old;
            }
            
            public void add(int i, com.sun.java.xml.ns.javaee.IconType o)
                { ServletTypeImpl.this.insertNewIcon(i).set(o); }
            
            public com.sun.java.xml.ns.javaee.IconType remove(int i)
            {
                com.sun.java.xml.ns.javaee.IconType old = ServletTypeImpl.this.getIconArray(i);
                ServletTypeImpl.this.removeIcon(i);
                return old;
            }
            
            public int size()
                { return ServletTypeImpl.this.sizeOfIconArray(); }
            
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
     * Gets the "servlet-name" element
     */
    public com.sun.java.xml.ns.javaee.ServletNameType getServletName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.javaee.ServletNameType target = null;
            target = (com.sun.java.xml.ns.javaee.ServletNameType)get_store().find_element_user(SERVLETNAME$6, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "servlet-name" element
     */
    public void setServletName(com.sun.java.xml.ns.javaee.ServletNameType servletName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.javaee.ServletNameType target = null;
            target = (com.sun.java.xml.ns.javaee.ServletNameType)get_store().find_element_user(SERVLETNAME$6, 0);
            if (target == null)
            {
                target = (com.sun.java.xml.ns.javaee.ServletNameType)get_store().add_element_user(SERVLETNAME$6);
            }
            target.set(servletName);
        }
    }
    
    /**
     * Appends and returns a new empty "servlet-name" element
     */
    public com.sun.java.xml.ns.javaee.ServletNameType addNewServletName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.javaee.ServletNameType target = null;
            target = (com.sun.java.xml.ns.javaee.ServletNameType)get_store().add_element_user(SERVLETNAME$6);
            return target;
        }
    }
    
    /**
     * Gets the "servlet-class" element
     */
    public com.sun.java.xml.ns.javaee.FullyQualifiedClassType getServletClass()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.javaee.FullyQualifiedClassType target = null;
            target = (com.sun.java.xml.ns.javaee.FullyQualifiedClassType)get_store().find_element_user(SERVLETCLASS$8, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "servlet-class" element
     */
    public boolean isSetServletClass()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SERVLETCLASS$8) != 0;
        }
    }
    
    /**
     * Sets the "servlet-class" element
     */
    public void setServletClass(com.sun.java.xml.ns.javaee.FullyQualifiedClassType servletClass)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.javaee.FullyQualifiedClassType target = null;
            target = (com.sun.java.xml.ns.javaee.FullyQualifiedClassType)get_store().find_element_user(SERVLETCLASS$8, 0);
            if (target == null)
            {
                target = (com.sun.java.xml.ns.javaee.FullyQualifiedClassType)get_store().add_element_user(SERVLETCLASS$8);
            }
            target.set(servletClass);
        }
    }
    
    /**
     * Appends and returns a new empty "servlet-class" element
     */
    public com.sun.java.xml.ns.javaee.FullyQualifiedClassType addNewServletClass()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.javaee.FullyQualifiedClassType target = null;
            target = (com.sun.java.xml.ns.javaee.FullyQualifiedClassType)get_store().add_element_user(SERVLETCLASS$8);
            return target;
        }
    }
    
    /**
     * Unsets the "servlet-class" element
     */
    public void unsetServletClass()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SERVLETCLASS$8, 0);
        }
    }
    
    /**
     * Gets the "jsp-file" element
     */
    public com.sun.java.xml.ns.javaee.JspFileType getJspFile()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.javaee.JspFileType target = null;
            target = (com.sun.java.xml.ns.javaee.JspFileType)get_store().find_element_user(JSPFILE$10, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "jsp-file" element
     */
    public boolean isSetJspFile()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(JSPFILE$10) != 0;
        }
    }
    
    /**
     * Sets the "jsp-file" element
     */
    public void setJspFile(com.sun.java.xml.ns.javaee.JspFileType jspFile)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.javaee.JspFileType target = null;
            target = (com.sun.java.xml.ns.javaee.JspFileType)get_store().find_element_user(JSPFILE$10, 0);
            if (target == null)
            {
                target = (com.sun.java.xml.ns.javaee.JspFileType)get_store().add_element_user(JSPFILE$10);
            }
            target.set(jspFile);
        }
    }
    
    /**
     * Appends and returns a new empty "jsp-file" element
     */
    public com.sun.java.xml.ns.javaee.JspFileType addNewJspFile()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.javaee.JspFileType target = null;
            target = (com.sun.java.xml.ns.javaee.JspFileType)get_store().add_element_user(JSPFILE$10);
            return target;
        }
    }
    
    /**
     * Unsets the "jsp-file" element
     */
    public void unsetJspFile()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(JSPFILE$10, 0);
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
                { return ServletTypeImpl.this.getInitParamArray(i); }
            
            public com.sun.java.xml.ns.javaee.ParamValueType set(int i, com.sun.java.xml.ns.javaee.ParamValueType o)
            {
                com.sun.java.xml.ns.javaee.ParamValueType old = ServletTypeImpl.this.getInitParamArray(i);
                ServletTypeImpl.this.setInitParamArray(i, o);
                return old;
            }
            
            public void add(int i, com.sun.java.xml.ns.javaee.ParamValueType o)
                { ServletTypeImpl.this.insertNewInitParam(i).set(o); }
            
            public com.sun.java.xml.ns.javaee.ParamValueType remove(int i)
            {
                com.sun.java.xml.ns.javaee.ParamValueType old = ServletTypeImpl.this.getInitParamArray(i);
                ServletTypeImpl.this.removeInitParam(i);
                return old;
            }
            
            public int size()
                { return ServletTypeImpl.this.sizeOfInitParamArray(); }
            
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
            get_store().find_all_element_users(INITPARAM$12, targetList);
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
            target = (com.sun.java.xml.ns.javaee.ParamValueType)get_store().find_element_user(INITPARAM$12, i);
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
            return get_store().count_elements(INITPARAM$12);
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
            arraySetterHelper(initParamArray, INITPARAM$12);
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
            target = (com.sun.java.xml.ns.javaee.ParamValueType)get_store().find_element_user(INITPARAM$12, i);
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
            target = (com.sun.java.xml.ns.javaee.ParamValueType)get_store().insert_element_user(INITPARAM$12, i);
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
            target = (com.sun.java.xml.ns.javaee.ParamValueType)get_store().add_element_user(INITPARAM$12);
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
            get_store().remove_element(INITPARAM$12, i);
        }
    }
    
    /**
     * Gets the "load-on-startup" element
     */
    public java.lang.Object getLoadOnStartup()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LOADONSTARTUP$14, 0);
            if (target == null)
            {
                return null;
            }
            return target.getObjectValue();
        }
    }
    
    /**
     * Gets (as xml) the "load-on-startup" element
     */
    public com.sun.java.xml.ns.javaee.LoadOnStartupType xgetLoadOnStartup()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.javaee.LoadOnStartupType target = null;
            target = (com.sun.java.xml.ns.javaee.LoadOnStartupType)get_store().find_element_user(LOADONSTARTUP$14, 0);
            return target;
        }
    }
    
    /**
     * True if has "load-on-startup" element
     */
    public boolean isSetLoadOnStartup()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(LOADONSTARTUP$14) != 0;
        }
    }
    
    /**
     * Sets the "load-on-startup" element
     */
    public void setLoadOnStartup(java.lang.Object loadOnStartup)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LOADONSTARTUP$14, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(LOADONSTARTUP$14);
            }
            target.setObjectValue(loadOnStartup);
        }
    }
    
    /**
     * Sets (as xml) the "load-on-startup" element
     */
    public void xsetLoadOnStartup(com.sun.java.xml.ns.javaee.LoadOnStartupType loadOnStartup)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.javaee.LoadOnStartupType target = null;
            target = (com.sun.java.xml.ns.javaee.LoadOnStartupType)get_store().find_element_user(LOADONSTARTUP$14, 0);
            if (target == null)
            {
                target = (com.sun.java.xml.ns.javaee.LoadOnStartupType)get_store().add_element_user(LOADONSTARTUP$14);
            }
            target.set(loadOnStartup);
        }
    }
    
    /**
     * Unsets the "load-on-startup" element
     */
    public void unsetLoadOnStartup()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(LOADONSTARTUP$14, 0);
        }
    }
    
    /**
     * Gets the "run-as" element
     */
    public com.sun.java.xml.ns.javaee.RunAsType getRunAs()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.javaee.RunAsType target = null;
            target = (com.sun.java.xml.ns.javaee.RunAsType)get_store().find_element_user(RUNAS$16, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "run-as" element
     */
    public boolean isSetRunAs()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(RUNAS$16) != 0;
        }
    }
    
    /**
     * Sets the "run-as" element
     */
    public void setRunAs(com.sun.java.xml.ns.javaee.RunAsType runAs)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.javaee.RunAsType target = null;
            target = (com.sun.java.xml.ns.javaee.RunAsType)get_store().find_element_user(RUNAS$16, 0);
            if (target == null)
            {
                target = (com.sun.java.xml.ns.javaee.RunAsType)get_store().add_element_user(RUNAS$16);
            }
            target.set(runAs);
        }
    }
    
    /**
     * Appends and returns a new empty "run-as" element
     */
    public com.sun.java.xml.ns.javaee.RunAsType addNewRunAs()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.javaee.RunAsType target = null;
            target = (com.sun.java.xml.ns.javaee.RunAsType)get_store().add_element_user(RUNAS$16);
            return target;
        }
    }
    
    /**
     * Unsets the "run-as" element
     */
    public void unsetRunAs()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(RUNAS$16, 0);
        }
    }
    
    /**
     * Gets a List of "security-role-ref" elements
     */
    public java.util.List<com.sun.java.xml.ns.javaee.SecurityRoleRefType> getSecurityRoleRefList()
    {
        final class SecurityRoleRefList extends java.util.AbstractList<com.sun.java.xml.ns.javaee.SecurityRoleRefType>
        {
            public com.sun.java.xml.ns.javaee.SecurityRoleRefType get(int i)
                { return ServletTypeImpl.this.getSecurityRoleRefArray(i); }
            
            public com.sun.java.xml.ns.javaee.SecurityRoleRefType set(int i, com.sun.java.xml.ns.javaee.SecurityRoleRefType o)
            {
                com.sun.java.xml.ns.javaee.SecurityRoleRefType old = ServletTypeImpl.this.getSecurityRoleRefArray(i);
                ServletTypeImpl.this.setSecurityRoleRefArray(i, o);
                return old;
            }
            
            public void add(int i, com.sun.java.xml.ns.javaee.SecurityRoleRefType o)
                { ServletTypeImpl.this.insertNewSecurityRoleRef(i).set(o); }
            
            public com.sun.java.xml.ns.javaee.SecurityRoleRefType remove(int i)
            {
                com.sun.java.xml.ns.javaee.SecurityRoleRefType old = ServletTypeImpl.this.getSecurityRoleRefArray(i);
                ServletTypeImpl.this.removeSecurityRoleRef(i);
                return old;
            }
            
            public int size()
                { return ServletTypeImpl.this.sizeOfSecurityRoleRefArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new SecurityRoleRefList();
        }
    }
    
    /**
     * Gets array of all "security-role-ref" elements
     * @deprecated
     */
    public com.sun.java.xml.ns.javaee.SecurityRoleRefType[] getSecurityRoleRefArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List<com.sun.java.xml.ns.javaee.SecurityRoleRefType> targetList = new java.util.ArrayList<com.sun.java.xml.ns.javaee.SecurityRoleRefType>();
            get_store().find_all_element_users(SECURITYROLEREF$18, targetList);
            com.sun.java.xml.ns.javaee.SecurityRoleRefType[] result = new com.sun.java.xml.ns.javaee.SecurityRoleRefType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "security-role-ref" element
     */
    public com.sun.java.xml.ns.javaee.SecurityRoleRefType getSecurityRoleRefArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.javaee.SecurityRoleRefType target = null;
            target = (com.sun.java.xml.ns.javaee.SecurityRoleRefType)get_store().find_element_user(SECURITYROLEREF$18, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "security-role-ref" element
     */
    public int sizeOfSecurityRoleRefArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SECURITYROLEREF$18);
        }
    }
    
    /**
     * Sets array of all "security-role-ref" element
     */
    public void setSecurityRoleRefArray(com.sun.java.xml.ns.javaee.SecurityRoleRefType[] securityRoleRefArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(securityRoleRefArray, SECURITYROLEREF$18);
        }
    }
    
    /**
     * Sets ith "security-role-ref" element
     */
    public void setSecurityRoleRefArray(int i, com.sun.java.xml.ns.javaee.SecurityRoleRefType securityRoleRef)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.javaee.SecurityRoleRefType target = null;
            target = (com.sun.java.xml.ns.javaee.SecurityRoleRefType)get_store().find_element_user(SECURITYROLEREF$18, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(securityRoleRef);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "security-role-ref" element
     */
    public com.sun.java.xml.ns.javaee.SecurityRoleRefType insertNewSecurityRoleRef(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.javaee.SecurityRoleRefType target = null;
            target = (com.sun.java.xml.ns.javaee.SecurityRoleRefType)get_store().insert_element_user(SECURITYROLEREF$18, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "security-role-ref" element
     */
    public com.sun.java.xml.ns.javaee.SecurityRoleRefType addNewSecurityRoleRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.javaee.SecurityRoleRefType target = null;
            target = (com.sun.java.xml.ns.javaee.SecurityRoleRefType)get_store().add_element_user(SECURITYROLEREF$18);
            return target;
        }
    }
    
    /**
     * Removes the ith "security-role-ref" element
     */
    public void removeSecurityRoleRef(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SECURITYROLEREF$18, i);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ID$20);
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
            target = (org.apache.xmlbeans.XmlID)get_store().find_attribute_user(ID$20);
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
            return get_store().find_attribute_user(ID$20) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ID$20);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ID$20);
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
            target = (org.apache.xmlbeans.XmlID)get_store().find_attribute_user(ID$20);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlID)get_store().add_attribute_user(ID$20);
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
            get_store().remove_attribute(ID$20);
        }
    }
}
