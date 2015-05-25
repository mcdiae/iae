/*
 * XML Type:  web-appType
 * Namespace: http://java.sun.com/xml/ns/javaee
 * Java type: com.sun.java.xml.ns.javaee.WebAppType
 *
 * Automatically generated - do not modify.
 */
package com.sun.java.xml.ns.javaee.impl;
/**
 * An XML web-appType(@http://java.sun.com/xml/ns/javaee).
 *
 * This is a complex type.
 */
public class WebAppTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.sun.java.xml.ns.javaee.WebAppType
{
    private static final long serialVersionUID = 1L;
    
    public WebAppTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DESCRIPTION$0 = 
        new javax.xml.namespace.QName("http://java.sun.com/xml/ns/javaee", "description");
    private static final javax.xml.namespace.QName DISPLAYNAME$2 = 
        new javax.xml.namespace.QName("http://java.sun.com/xml/ns/javaee", "display-name");
    private static final javax.xml.namespace.QName ICON$4 = 
        new javax.xml.namespace.QName("http://java.sun.com/xml/ns/javaee", "icon");
    private static final javax.xml.namespace.QName DISTRIBUTABLE$6 = 
        new javax.xml.namespace.QName("http://java.sun.com/xml/ns/javaee", "distributable");
    private static final javax.xml.namespace.QName CONTEXTPARAM$8 = 
        new javax.xml.namespace.QName("http://java.sun.com/xml/ns/javaee", "context-param");
    private static final javax.xml.namespace.QName FILTER$10 = 
        new javax.xml.namespace.QName("http://java.sun.com/xml/ns/javaee", "filter");
    private static final javax.xml.namespace.QName FILTERMAPPING$12 = 
        new javax.xml.namespace.QName("http://java.sun.com/xml/ns/javaee", "filter-mapping");
    private static final javax.xml.namespace.QName LISTENER$14 = 
        new javax.xml.namespace.QName("http://java.sun.com/xml/ns/javaee", "listener");
    private static final javax.xml.namespace.QName SERVLET$16 = 
        new javax.xml.namespace.QName("http://java.sun.com/xml/ns/javaee", "servlet");
    private static final javax.xml.namespace.QName SERVLETMAPPING$18 = 
        new javax.xml.namespace.QName("http://java.sun.com/xml/ns/javaee", "servlet-mapping");
    private static final javax.xml.namespace.QName SESSIONCONFIG$20 = 
        new javax.xml.namespace.QName("http://java.sun.com/xml/ns/javaee", "session-config");
    private static final javax.xml.namespace.QName MIMEMAPPING$22 = 
        new javax.xml.namespace.QName("http://java.sun.com/xml/ns/javaee", "mime-mapping");
    private static final javax.xml.namespace.QName WELCOMEFILELIST$24 = 
        new javax.xml.namespace.QName("http://java.sun.com/xml/ns/javaee", "welcome-file-list");
    private static final javax.xml.namespace.QName ERRORPAGE$26 = 
        new javax.xml.namespace.QName("http://java.sun.com/xml/ns/javaee", "error-page");
    private static final javax.xml.namespace.QName JSPCONFIG$28 = 
        new javax.xml.namespace.QName("http://java.sun.com/xml/ns/javaee", "jsp-config");
    private static final javax.xml.namespace.QName SECURITYCONSTRAINT$30 = 
        new javax.xml.namespace.QName("http://java.sun.com/xml/ns/javaee", "security-constraint");
    private static final javax.xml.namespace.QName LOGINCONFIG$32 = 
        new javax.xml.namespace.QName("http://java.sun.com/xml/ns/javaee", "login-config");
    private static final javax.xml.namespace.QName SECURITYROLE$34 = 
        new javax.xml.namespace.QName("http://java.sun.com/xml/ns/javaee", "security-role");
    private static final javax.xml.namespace.QName ENVENTRY$36 = 
        new javax.xml.namespace.QName("http://java.sun.com/xml/ns/javaee", "env-entry");
    private static final javax.xml.namespace.QName EJBREF$38 = 
        new javax.xml.namespace.QName("http://java.sun.com/xml/ns/javaee", "ejb-ref");
    private static final javax.xml.namespace.QName EJBLOCALREF$40 = 
        new javax.xml.namespace.QName("http://java.sun.com/xml/ns/javaee", "ejb-local-ref");
    private static final javax.xml.namespace.QName SERVICEREF$42 = 
        new javax.xml.namespace.QName("http://java.sun.com/xml/ns/javaee", "service-ref");
    private static final javax.xml.namespace.QName RESOURCEREF$44 = 
        new javax.xml.namespace.QName("http://java.sun.com/xml/ns/javaee", "resource-ref");
    private static final javax.xml.namespace.QName RESOURCEENVREF$46 = 
        new javax.xml.namespace.QName("http://java.sun.com/xml/ns/javaee", "resource-env-ref");
    private static final javax.xml.namespace.QName MESSAGEDESTINATIONREF$48 = 
        new javax.xml.namespace.QName("http://java.sun.com/xml/ns/javaee", "message-destination-ref");
    private static final javax.xml.namespace.QName PERSISTENCECONTEXTREF$50 = 
        new javax.xml.namespace.QName("http://java.sun.com/xml/ns/javaee", "persistence-context-ref");
    private static final javax.xml.namespace.QName PERSISTENCEUNITREF$52 = 
        new javax.xml.namespace.QName("http://java.sun.com/xml/ns/javaee", "persistence-unit-ref");
    private static final javax.xml.namespace.QName POSTCONSTRUCT$54 = 
        new javax.xml.namespace.QName("http://java.sun.com/xml/ns/javaee", "post-construct");
    private static final javax.xml.namespace.QName PREDESTROY$56 = 
        new javax.xml.namespace.QName("http://java.sun.com/xml/ns/javaee", "pre-destroy");
    private static final javax.xml.namespace.QName MESSAGEDESTINATION$58 = 
        new javax.xml.namespace.QName("http://java.sun.com/xml/ns/javaee", "message-destination");
    private static final javax.xml.namespace.QName LOCALEENCODINGMAPPINGLIST$60 = 
        new javax.xml.namespace.QName("http://java.sun.com/xml/ns/javaee", "locale-encoding-mapping-list");
    private static final javax.xml.namespace.QName VERSION$62 = 
        new javax.xml.namespace.QName("", "version");
    private static final javax.xml.namespace.QName ID$64 = 
        new javax.xml.namespace.QName("", "id");
    private static final javax.xml.namespace.QName METADATACOMPLETE$66 = 
        new javax.xml.namespace.QName("", "metadata-complete");
    
    
    /**
     * Gets a List of "description" elements
     */
    public java.util.List<com.sun.java.xml.ns.javaee.DescriptionType> getDescriptionList()
    {
        final class DescriptionList extends java.util.AbstractList<com.sun.java.xml.ns.javaee.DescriptionType>
        {
            public com.sun.java.xml.ns.javaee.DescriptionType get(int i)
                { return WebAppTypeImpl.this.getDescriptionArray(i); }
            
            public com.sun.java.xml.ns.javaee.DescriptionType set(int i, com.sun.java.xml.ns.javaee.DescriptionType o)
            {
                com.sun.java.xml.ns.javaee.DescriptionType old = WebAppTypeImpl.this.getDescriptionArray(i);
                WebAppTypeImpl.this.setDescriptionArray(i, o);
                return old;
            }
            
            public void add(int i, com.sun.java.xml.ns.javaee.DescriptionType o)
                { WebAppTypeImpl.this.insertNewDescription(i).set(o); }
            
            public com.sun.java.xml.ns.javaee.DescriptionType remove(int i)
            {
                com.sun.java.xml.ns.javaee.DescriptionType old = WebAppTypeImpl.this.getDescriptionArray(i);
                WebAppTypeImpl.this.removeDescription(i);
                return old;
            }
            
            public int size()
                { return WebAppTypeImpl.this.sizeOfDescriptionArray(); }
            
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
                { return WebAppTypeImpl.this.getDisplayNameArray(i); }
            
            public com.sun.java.xml.ns.javaee.DisplayNameType set(int i, com.sun.java.xml.ns.javaee.DisplayNameType o)
            {
                com.sun.java.xml.ns.javaee.DisplayNameType old = WebAppTypeImpl.this.getDisplayNameArray(i);
                WebAppTypeImpl.this.setDisplayNameArray(i, o);
                return old;
            }
            
            public void add(int i, com.sun.java.xml.ns.javaee.DisplayNameType o)
                { WebAppTypeImpl.this.insertNewDisplayName(i).set(o); }
            
            public com.sun.java.xml.ns.javaee.DisplayNameType remove(int i)
            {
                com.sun.java.xml.ns.javaee.DisplayNameType old = WebAppTypeImpl.this.getDisplayNameArray(i);
                WebAppTypeImpl.this.removeDisplayName(i);
                return old;
            }
            
            public int size()
                { return WebAppTypeImpl.this.sizeOfDisplayNameArray(); }
            
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
                { return WebAppTypeImpl.this.getIconArray(i); }
            
            public com.sun.java.xml.ns.javaee.IconType set(int i, com.sun.java.xml.ns.javaee.IconType o)
            {
                com.sun.java.xml.ns.javaee.IconType old = WebAppTypeImpl.this.getIconArray(i);
                WebAppTypeImpl.this.setIconArray(i, o);
                return old;
            }
            
            public void add(int i, com.sun.java.xml.ns.javaee.IconType o)
                { WebAppTypeImpl.this.insertNewIcon(i).set(o); }
            
            public com.sun.java.xml.ns.javaee.IconType remove(int i)
            {
                com.sun.java.xml.ns.javaee.IconType old = WebAppTypeImpl.this.getIconArray(i);
                WebAppTypeImpl.this.removeIcon(i);
                return old;
            }
            
            public int size()
                { return WebAppTypeImpl.this.sizeOfIconArray(); }
            
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
     * Gets a List of "distributable" elements
     */
    public java.util.List<com.sun.java.xml.ns.javaee.EmptyType> getDistributableList()
    {
        final class DistributableList extends java.util.AbstractList<com.sun.java.xml.ns.javaee.EmptyType>
        {
            public com.sun.java.xml.ns.javaee.EmptyType get(int i)
                { return WebAppTypeImpl.this.getDistributableArray(i); }
            
            public com.sun.java.xml.ns.javaee.EmptyType set(int i, com.sun.java.xml.ns.javaee.EmptyType o)
            {
                com.sun.java.xml.ns.javaee.EmptyType old = WebAppTypeImpl.this.getDistributableArray(i);
                WebAppTypeImpl.this.setDistributableArray(i, o);
                return old;
            }
            
            public void add(int i, com.sun.java.xml.ns.javaee.EmptyType o)
                { WebAppTypeImpl.this.insertNewDistributable(i).set(o); }
            
            public com.sun.java.xml.ns.javaee.EmptyType remove(int i)
            {
                com.sun.java.xml.ns.javaee.EmptyType old = WebAppTypeImpl.this.getDistributableArray(i);
                WebAppTypeImpl.this.removeDistributable(i);
                return old;
            }
            
            public int size()
                { return WebAppTypeImpl.this.sizeOfDistributableArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new DistributableList();
        }
    }
    
    /**
     * Gets array of all "distributable" elements
     * @deprecated
     */
    public com.sun.java.xml.ns.javaee.EmptyType[] getDistributableArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List<com.sun.java.xml.ns.javaee.EmptyType> targetList = new java.util.ArrayList<com.sun.java.xml.ns.javaee.EmptyType>();
            get_store().find_all_element_users(DISTRIBUTABLE$6, targetList);
            com.sun.java.xml.ns.javaee.EmptyType[] result = new com.sun.java.xml.ns.javaee.EmptyType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "distributable" element
     */
    public com.sun.java.xml.ns.javaee.EmptyType getDistributableArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.javaee.EmptyType target = null;
            target = (com.sun.java.xml.ns.javaee.EmptyType)get_store().find_element_user(DISTRIBUTABLE$6, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "distributable" element
     */
    public int sizeOfDistributableArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DISTRIBUTABLE$6);
        }
    }
    
    /**
     * Sets array of all "distributable" element
     */
    public void setDistributableArray(com.sun.java.xml.ns.javaee.EmptyType[] distributableArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(distributableArray, DISTRIBUTABLE$6);
        }
    }
    
    /**
     * Sets ith "distributable" element
     */
    public void setDistributableArray(int i, com.sun.java.xml.ns.javaee.EmptyType distributable)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.javaee.EmptyType target = null;
            target = (com.sun.java.xml.ns.javaee.EmptyType)get_store().find_element_user(DISTRIBUTABLE$6, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(distributable);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "distributable" element
     */
    public com.sun.java.xml.ns.javaee.EmptyType insertNewDistributable(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.javaee.EmptyType target = null;
            target = (com.sun.java.xml.ns.javaee.EmptyType)get_store().insert_element_user(DISTRIBUTABLE$6, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "distributable" element
     */
    public com.sun.java.xml.ns.javaee.EmptyType addNewDistributable()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.javaee.EmptyType target = null;
            target = (com.sun.java.xml.ns.javaee.EmptyType)get_store().add_element_user(DISTRIBUTABLE$6);
            return target;
        }
    }
    
    /**
     * Removes the ith "distributable" element
     */
    public void removeDistributable(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DISTRIBUTABLE$6, i);
        }
    }
    
    /**
     * Gets a List of "context-param" elements
     */
    public java.util.List<com.sun.java.xml.ns.javaee.ParamValueType> getContextParamList()
    {
        final class ContextParamList extends java.util.AbstractList<com.sun.java.xml.ns.javaee.ParamValueType>
        {
            public com.sun.java.xml.ns.javaee.ParamValueType get(int i)
                { return WebAppTypeImpl.this.getContextParamArray(i); }
            
            public com.sun.java.xml.ns.javaee.ParamValueType set(int i, com.sun.java.xml.ns.javaee.ParamValueType o)
            {
                com.sun.java.xml.ns.javaee.ParamValueType old = WebAppTypeImpl.this.getContextParamArray(i);
                WebAppTypeImpl.this.setContextParamArray(i, o);
                return old;
            }
            
            public void add(int i, com.sun.java.xml.ns.javaee.ParamValueType o)
                { WebAppTypeImpl.this.insertNewContextParam(i).set(o); }
            
            public com.sun.java.xml.ns.javaee.ParamValueType remove(int i)
            {
                com.sun.java.xml.ns.javaee.ParamValueType old = WebAppTypeImpl.this.getContextParamArray(i);
                WebAppTypeImpl.this.removeContextParam(i);
                return old;
            }
            
            public int size()
                { return WebAppTypeImpl.this.sizeOfContextParamArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new ContextParamList();
        }
    }
    
    /**
     * Gets array of all "context-param" elements
     * @deprecated
     */
    public com.sun.java.xml.ns.javaee.ParamValueType[] getContextParamArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List<com.sun.java.xml.ns.javaee.ParamValueType> targetList = new java.util.ArrayList<com.sun.java.xml.ns.javaee.ParamValueType>();
            get_store().find_all_element_users(CONTEXTPARAM$8, targetList);
            com.sun.java.xml.ns.javaee.ParamValueType[] result = new com.sun.java.xml.ns.javaee.ParamValueType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "context-param" element
     */
    public com.sun.java.xml.ns.javaee.ParamValueType getContextParamArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.javaee.ParamValueType target = null;
            target = (com.sun.java.xml.ns.javaee.ParamValueType)get_store().find_element_user(CONTEXTPARAM$8, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "context-param" element
     */
    public int sizeOfContextParamArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CONTEXTPARAM$8);
        }
    }
    
    /**
     * Sets array of all "context-param" element
     */
    public void setContextParamArray(com.sun.java.xml.ns.javaee.ParamValueType[] contextParamArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(contextParamArray, CONTEXTPARAM$8);
        }
    }
    
    /**
     * Sets ith "context-param" element
     */
    public void setContextParamArray(int i, com.sun.java.xml.ns.javaee.ParamValueType contextParam)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.javaee.ParamValueType target = null;
            target = (com.sun.java.xml.ns.javaee.ParamValueType)get_store().find_element_user(CONTEXTPARAM$8, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(contextParam);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "context-param" element
     */
    public com.sun.java.xml.ns.javaee.ParamValueType insertNewContextParam(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.javaee.ParamValueType target = null;
            target = (com.sun.java.xml.ns.javaee.ParamValueType)get_store().insert_element_user(CONTEXTPARAM$8, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "context-param" element
     */
    public com.sun.java.xml.ns.javaee.ParamValueType addNewContextParam()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.javaee.ParamValueType target = null;
            target = (com.sun.java.xml.ns.javaee.ParamValueType)get_store().add_element_user(CONTEXTPARAM$8);
            return target;
        }
    }
    
    /**
     * Removes the ith "context-param" element
     */
    public void removeContextParam(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CONTEXTPARAM$8, i);
        }
    }
    
    /**
     * Gets a List of "filter" elements
     */
    public java.util.List<com.sun.java.xml.ns.javaee.FilterType> getFilterList()
    {
        final class FilterList extends java.util.AbstractList<com.sun.java.xml.ns.javaee.FilterType>
        {
            public com.sun.java.xml.ns.javaee.FilterType get(int i)
                { return WebAppTypeImpl.this.getFilterArray(i); }
            
            public com.sun.java.xml.ns.javaee.FilterType set(int i, com.sun.java.xml.ns.javaee.FilterType o)
            {
                com.sun.java.xml.ns.javaee.FilterType old = WebAppTypeImpl.this.getFilterArray(i);
                WebAppTypeImpl.this.setFilterArray(i, o);
                return old;
            }
            
            public void add(int i, com.sun.java.xml.ns.javaee.FilterType o)
                { WebAppTypeImpl.this.insertNewFilter(i).set(o); }
            
            public com.sun.java.xml.ns.javaee.FilterType remove(int i)
            {
                com.sun.java.xml.ns.javaee.FilterType old = WebAppTypeImpl.this.getFilterArray(i);
                WebAppTypeImpl.this.removeFilter(i);
                return old;
            }
            
            public int size()
                { return WebAppTypeImpl.this.sizeOfFilterArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new FilterList();
        }
    }
    
    /**
     * Gets array of all "filter" elements
     * @deprecated
     */
    public com.sun.java.xml.ns.javaee.FilterType[] getFilterArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List<com.sun.java.xml.ns.javaee.FilterType> targetList = new java.util.ArrayList<com.sun.java.xml.ns.javaee.FilterType>();
            get_store().find_all_element_users(FILTER$10, targetList);
            com.sun.java.xml.ns.javaee.FilterType[] result = new com.sun.java.xml.ns.javaee.FilterType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "filter" element
     */
    public com.sun.java.xml.ns.javaee.FilterType getFilterArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.javaee.FilterType target = null;
            target = (com.sun.java.xml.ns.javaee.FilterType)get_store().find_element_user(FILTER$10, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "filter" element
     */
    public int sizeOfFilterArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(FILTER$10);
        }
    }
    
    /**
     * Sets array of all "filter" element
     */
    public void setFilterArray(com.sun.java.xml.ns.javaee.FilterType[] filterArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(filterArray, FILTER$10);
        }
    }
    
    /**
     * Sets ith "filter" element
     */
    public void setFilterArray(int i, com.sun.java.xml.ns.javaee.FilterType filter)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.javaee.FilterType target = null;
            target = (com.sun.java.xml.ns.javaee.FilterType)get_store().find_element_user(FILTER$10, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(filter);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "filter" element
     */
    public com.sun.java.xml.ns.javaee.FilterType insertNewFilter(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.javaee.FilterType target = null;
            target = (com.sun.java.xml.ns.javaee.FilterType)get_store().insert_element_user(FILTER$10, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "filter" element
     */
    public com.sun.java.xml.ns.javaee.FilterType addNewFilter()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.javaee.FilterType target = null;
            target = (com.sun.java.xml.ns.javaee.FilterType)get_store().add_element_user(FILTER$10);
            return target;
        }
    }
    
    /**
     * Removes the ith "filter" element
     */
    public void removeFilter(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(FILTER$10, i);
        }
    }
    
    /**
     * Gets a List of "filter-mapping" elements
     */
    public java.util.List<com.sun.java.xml.ns.javaee.FilterMappingType> getFilterMappingList()
    {
        final class FilterMappingList extends java.util.AbstractList<com.sun.java.xml.ns.javaee.FilterMappingType>
        {
            public com.sun.java.xml.ns.javaee.FilterMappingType get(int i)
                { return WebAppTypeImpl.this.getFilterMappingArray(i); }
            
            public com.sun.java.xml.ns.javaee.FilterMappingType set(int i, com.sun.java.xml.ns.javaee.FilterMappingType o)
            {
                com.sun.java.xml.ns.javaee.FilterMappingType old = WebAppTypeImpl.this.getFilterMappingArray(i);
                WebAppTypeImpl.this.setFilterMappingArray(i, o);
                return old;
            }
            
            public void add(int i, com.sun.java.xml.ns.javaee.FilterMappingType o)
                { WebAppTypeImpl.this.insertNewFilterMapping(i).set(o); }
            
            public com.sun.java.xml.ns.javaee.FilterMappingType remove(int i)
            {
                com.sun.java.xml.ns.javaee.FilterMappingType old = WebAppTypeImpl.this.getFilterMappingArray(i);
                WebAppTypeImpl.this.removeFilterMapping(i);
                return old;
            }
            
            public int size()
                { return WebAppTypeImpl.this.sizeOfFilterMappingArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new FilterMappingList();
        }
    }
    
    /**
     * Gets array of all "filter-mapping" elements
     * @deprecated
     */
    public com.sun.java.xml.ns.javaee.FilterMappingType[] getFilterMappingArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List<com.sun.java.xml.ns.javaee.FilterMappingType> targetList = new java.util.ArrayList<com.sun.java.xml.ns.javaee.FilterMappingType>();
            get_store().find_all_element_users(FILTERMAPPING$12, targetList);
            com.sun.java.xml.ns.javaee.FilterMappingType[] result = new com.sun.java.xml.ns.javaee.FilterMappingType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "filter-mapping" element
     */
    public com.sun.java.xml.ns.javaee.FilterMappingType getFilterMappingArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.javaee.FilterMappingType target = null;
            target = (com.sun.java.xml.ns.javaee.FilterMappingType)get_store().find_element_user(FILTERMAPPING$12, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "filter-mapping" element
     */
    public int sizeOfFilterMappingArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(FILTERMAPPING$12);
        }
    }
    
    /**
     * Sets array of all "filter-mapping" element
     */
    public void setFilterMappingArray(com.sun.java.xml.ns.javaee.FilterMappingType[] filterMappingArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(filterMappingArray, FILTERMAPPING$12);
        }
    }
    
    /**
     * Sets ith "filter-mapping" element
     */
    public void setFilterMappingArray(int i, com.sun.java.xml.ns.javaee.FilterMappingType filterMapping)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.javaee.FilterMappingType target = null;
            target = (com.sun.java.xml.ns.javaee.FilterMappingType)get_store().find_element_user(FILTERMAPPING$12, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(filterMapping);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "filter-mapping" element
     */
    public com.sun.java.xml.ns.javaee.FilterMappingType insertNewFilterMapping(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.javaee.FilterMappingType target = null;
            target = (com.sun.java.xml.ns.javaee.FilterMappingType)get_store().insert_element_user(FILTERMAPPING$12, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "filter-mapping" element
     */
    public com.sun.java.xml.ns.javaee.FilterMappingType addNewFilterMapping()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.javaee.FilterMappingType target = null;
            target = (com.sun.java.xml.ns.javaee.FilterMappingType)get_store().add_element_user(FILTERMAPPING$12);
            return target;
        }
    }
    
    /**
     * Removes the ith "filter-mapping" element
     */
    public void removeFilterMapping(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(FILTERMAPPING$12, i);
        }
    }
    
    /**
     * Gets a List of "listener" elements
     */
    public java.util.List<com.sun.java.xml.ns.javaee.ListenerType> getListenerList()
    {
        final class ListenerList extends java.util.AbstractList<com.sun.java.xml.ns.javaee.ListenerType>
        {
            public com.sun.java.xml.ns.javaee.ListenerType get(int i)
                { return WebAppTypeImpl.this.getListenerArray(i); }
            
            public com.sun.java.xml.ns.javaee.ListenerType set(int i, com.sun.java.xml.ns.javaee.ListenerType o)
            {
                com.sun.java.xml.ns.javaee.ListenerType old = WebAppTypeImpl.this.getListenerArray(i);
                WebAppTypeImpl.this.setListenerArray(i, o);
                return old;
            }
            
            public void add(int i, com.sun.java.xml.ns.javaee.ListenerType o)
                { WebAppTypeImpl.this.insertNewListener(i).set(o); }
            
            public com.sun.java.xml.ns.javaee.ListenerType remove(int i)
            {
                com.sun.java.xml.ns.javaee.ListenerType old = WebAppTypeImpl.this.getListenerArray(i);
                WebAppTypeImpl.this.removeListener(i);
                return old;
            }
            
            public int size()
                { return WebAppTypeImpl.this.sizeOfListenerArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new ListenerList();
        }
    }
    
    /**
     * Gets array of all "listener" elements
     * @deprecated
     */
    public com.sun.java.xml.ns.javaee.ListenerType[] getListenerArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List<com.sun.java.xml.ns.javaee.ListenerType> targetList = new java.util.ArrayList<com.sun.java.xml.ns.javaee.ListenerType>();
            get_store().find_all_element_users(LISTENER$14, targetList);
            com.sun.java.xml.ns.javaee.ListenerType[] result = new com.sun.java.xml.ns.javaee.ListenerType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "listener" element
     */
    public com.sun.java.xml.ns.javaee.ListenerType getListenerArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.javaee.ListenerType target = null;
            target = (com.sun.java.xml.ns.javaee.ListenerType)get_store().find_element_user(LISTENER$14, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "listener" element
     */
    public int sizeOfListenerArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(LISTENER$14);
        }
    }
    
    /**
     * Sets array of all "listener" element
     */
    public void setListenerArray(com.sun.java.xml.ns.javaee.ListenerType[] listenerArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(listenerArray, LISTENER$14);
        }
    }
    
    /**
     * Sets ith "listener" element
     */
    public void setListenerArray(int i, com.sun.java.xml.ns.javaee.ListenerType listener)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.javaee.ListenerType target = null;
            target = (com.sun.java.xml.ns.javaee.ListenerType)get_store().find_element_user(LISTENER$14, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(listener);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "listener" element
     */
    public com.sun.java.xml.ns.javaee.ListenerType insertNewListener(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.javaee.ListenerType target = null;
            target = (com.sun.java.xml.ns.javaee.ListenerType)get_store().insert_element_user(LISTENER$14, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "listener" element
     */
    public com.sun.java.xml.ns.javaee.ListenerType addNewListener()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.javaee.ListenerType target = null;
            target = (com.sun.java.xml.ns.javaee.ListenerType)get_store().add_element_user(LISTENER$14);
            return target;
        }
    }
    
    /**
     * Removes the ith "listener" element
     */
    public void removeListener(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(LISTENER$14, i);
        }
    }
    
    /**
     * Gets a List of "servlet" elements
     */
    public java.util.List<com.sun.java.xml.ns.javaee.ServletType> getServletList()
    {
        final class ServletList extends java.util.AbstractList<com.sun.java.xml.ns.javaee.ServletType>
        {
            public com.sun.java.xml.ns.javaee.ServletType get(int i)
                { return WebAppTypeImpl.this.getServletArray(i); }
            
            public com.sun.java.xml.ns.javaee.ServletType set(int i, com.sun.java.xml.ns.javaee.ServletType o)
            {
                com.sun.java.xml.ns.javaee.ServletType old = WebAppTypeImpl.this.getServletArray(i);
                WebAppTypeImpl.this.setServletArray(i, o);
                return old;
            }
            
            public void add(int i, com.sun.java.xml.ns.javaee.ServletType o)
                { WebAppTypeImpl.this.insertNewServlet(i).set(o); }
            
            public com.sun.java.xml.ns.javaee.ServletType remove(int i)
            {
                com.sun.java.xml.ns.javaee.ServletType old = WebAppTypeImpl.this.getServletArray(i);
                WebAppTypeImpl.this.removeServlet(i);
                return old;
            }
            
            public int size()
                { return WebAppTypeImpl.this.sizeOfServletArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new ServletList();
        }
    }
    
    /**
     * Gets array of all "servlet" elements
     * @deprecated
     */
    public com.sun.java.xml.ns.javaee.ServletType[] getServletArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List<com.sun.java.xml.ns.javaee.ServletType> targetList = new java.util.ArrayList<com.sun.java.xml.ns.javaee.ServletType>();
            get_store().find_all_element_users(SERVLET$16, targetList);
            com.sun.java.xml.ns.javaee.ServletType[] result = new com.sun.java.xml.ns.javaee.ServletType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "servlet" element
     */
    public com.sun.java.xml.ns.javaee.ServletType getServletArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.javaee.ServletType target = null;
            target = (com.sun.java.xml.ns.javaee.ServletType)get_store().find_element_user(SERVLET$16, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "servlet" element
     */
    public int sizeOfServletArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SERVLET$16);
        }
    }
    
    /**
     * Sets array of all "servlet" element
     */
    public void setServletArray(com.sun.java.xml.ns.javaee.ServletType[] servletArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(servletArray, SERVLET$16);
        }
    }
    
    /**
     * Sets ith "servlet" element
     */
    public void setServletArray(int i, com.sun.java.xml.ns.javaee.ServletType servlet)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.javaee.ServletType target = null;
            target = (com.sun.java.xml.ns.javaee.ServletType)get_store().find_element_user(SERVLET$16, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(servlet);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "servlet" element
     */
    public com.sun.java.xml.ns.javaee.ServletType insertNewServlet(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.javaee.ServletType target = null;
            target = (com.sun.java.xml.ns.javaee.ServletType)get_store().insert_element_user(SERVLET$16, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "servlet" element
     */
    public com.sun.java.xml.ns.javaee.ServletType addNewServlet()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.javaee.ServletType target = null;
            target = (com.sun.java.xml.ns.javaee.ServletType)get_store().add_element_user(SERVLET$16);
            return target;
        }
    }
    
    /**
     * Removes the ith "servlet" element
     */
    public void removeServlet(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SERVLET$16, i);
        }
    }
    
    /**
     * Gets a List of "servlet-mapping" elements
     */
    public java.util.List<com.sun.java.xml.ns.javaee.ServletMappingType> getServletMappingList()
    {
        final class ServletMappingList extends java.util.AbstractList<com.sun.java.xml.ns.javaee.ServletMappingType>
        {
            public com.sun.java.xml.ns.javaee.ServletMappingType get(int i)
                { return WebAppTypeImpl.this.getServletMappingArray(i); }
            
            public com.sun.java.xml.ns.javaee.ServletMappingType set(int i, com.sun.java.xml.ns.javaee.ServletMappingType o)
            {
                com.sun.java.xml.ns.javaee.ServletMappingType old = WebAppTypeImpl.this.getServletMappingArray(i);
                WebAppTypeImpl.this.setServletMappingArray(i, o);
                return old;
            }
            
            public void add(int i, com.sun.java.xml.ns.javaee.ServletMappingType o)
                { WebAppTypeImpl.this.insertNewServletMapping(i).set(o); }
            
            public com.sun.java.xml.ns.javaee.ServletMappingType remove(int i)
            {
                com.sun.java.xml.ns.javaee.ServletMappingType old = WebAppTypeImpl.this.getServletMappingArray(i);
                WebAppTypeImpl.this.removeServletMapping(i);
                return old;
            }
            
            public int size()
                { return WebAppTypeImpl.this.sizeOfServletMappingArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new ServletMappingList();
        }
    }
    
    /**
     * Gets array of all "servlet-mapping" elements
     * @deprecated
     */
    public com.sun.java.xml.ns.javaee.ServletMappingType[] getServletMappingArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List<com.sun.java.xml.ns.javaee.ServletMappingType> targetList = new java.util.ArrayList<com.sun.java.xml.ns.javaee.ServletMappingType>();
            get_store().find_all_element_users(SERVLETMAPPING$18, targetList);
            com.sun.java.xml.ns.javaee.ServletMappingType[] result = new com.sun.java.xml.ns.javaee.ServletMappingType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "servlet-mapping" element
     */
    public com.sun.java.xml.ns.javaee.ServletMappingType getServletMappingArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.javaee.ServletMappingType target = null;
            target = (com.sun.java.xml.ns.javaee.ServletMappingType)get_store().find_element_user(SERVLETMAPPING$18, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "servlet-mapping" element
     */
    public int sizeOfServletMappingArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SERVLETMAPPING$18);
        }
    }
    
    /**
     * Sets array of all "servlet-mapping" element
     */
    public void setServletMappingArray(com.sun.java.xml.ns.javaee.ServletMappingType[] servletMappingArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(servletMappingArray, SERVLETMAPPING$18);
        }
    }
    
    /**
     * Sets ith "servlet-mapping" element
     */
    public void setServletMappingArray(int i, com.sun.java.xml.ns.javaee.ServletMappingType servletMapping)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.javaee.ServletMappingType target = null;
            target = (com.sun.java.xml.ns.javaee.ServletMappingType)get_store().find_element_user(SERVLETMAPPING$18, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(servletMapping);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "servlet-mapping" element
     */
    public com.sun.java.xml.ns.javaee.ServletMappingType insertNewServletMapping(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.javaee.ServletMappingType target = null;
            target = (com.sun.java.xml.ns.javaee.ServletMappingType)get_store().insert_element_user(SERVLETMAPPING$18, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "servlet-mapping" element
     */
    public com.sun.java.xml.ns.javaee.ServletMappingType addNewServletMapping()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.javaee.ServletMappingType target = null;
            target = (com.sun.java.xml.ns.javaee.ServletMappingType)get_store().add_element_user(SERVLETMAPPING$18);
            return target;
        }
    }
    
    /**
     * Removes the ith "servlet-mapping" element
     */
    public void removeServletMapping(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SERVLETMAPPING$18, i);
        }
    }
    
    /**
     * Gets a List of "session-config" elements
     */
    public java.util.List<com.sun.java.xml.ns.javaee.SessionConfigType> getSessionConfigList()
    {
        final class SessionConfigList extends java.util.AbstractList<com.sun.java.xml.ns.javaee.SessionConfigType>
        {
            public com.sun.java.xml.ns.javaee.SessionConfigType get(int i)
                { return WebAppTypeImpl.this.getSessionConfigArray(i); }
            
            public com.sun.java.xml.ns.javaee.SessionConfigType set(int i, com.sun.java.xml.ns.javaee.SessionConfigType o)
            {
                com.sun.java.xml.ns.javaee.SessionConfigType old = WebAppTypeImpl.this.getSessionConfigArray(i);
                WebAppTypeImpl.this.setSessionConfigArray(i, o);
                return old;
            }
            
            public void add(int i, com.sun.java.xml.ns.javaee.SessionConfigType o)
                { WebAppTypeImpl.this.insertNewSessionConfig(i).set(o); }
            
            public com.sun.java.xml.ns.javaee.SessionConfigType remove(int i)
            {
                com.sun.java.xml.ns.javaee.SessionConfigType old = WebAppTypeImpl.this.getSessionConfigArray(i);
                WebAppTypeImpl.this.removeSessionConfig(i);
                return old;
            }
            
            public int size()
                { return WebAppTypeImpl.this.sizeOfSessionConfigArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new SessionConfigList();
        }
    }
    
    /**
     * Gets array of all "session-config" elements
     * @deprecated
     */
    public com.sun.java.xml.ns.javaee.SessionConfigType[] getSessionConfigArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List<com.sun.java.xml.ns.javaee.SessionConfigType> targetList = new java.util.ArrayList<com.sun.java.xml.ns.javaee.SessionConfigType>();
            get_store().find_all_element_users(SESSIONCONFIG$20, targetList);
            com.sun.java.xml.ns.javaee.SessionConfigType[] result = new com.sun.java.xml.ns.javaee.SessionConfigType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "session-config" element
     */
    public com.sun.java.xml.ns.javaee.SessionConfigType getSessionConfigArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.javaee.SessionConfigType target = null;
            target = (com.sun.java.xml.ns.javaee.SessionConfigType)get_store().find_element_user(SESSIONCONFIG$20, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "session-config" element
     */
    public int sizeOfSessionConfigArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SESSIONCONFIG$20);
        }
    }
    
    /**
     * Sets array of all "session-config" element
     */
    public void setSessionConfigArray(com.sun.java.xml.ns.javaee.SessionConfigType[] sessionConfigArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(sessionConfigArray, SESSIONCONFIG$20);
        }
    }
    
    /**
     * Sets ith "session-config" element
     */
    public void setSessionConfigArray(int i, com.sun.java.xml.ns.javaee.SessionConfigType sessionConfig)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.javaee.SessionConfigType target = null;
            target = (com.sun.java.xml.ns.javaee.SessionConfigType)get_store().find_element_user(SESSIONCONFIG$20, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(sessionConfig);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "session-config" element
     */
    public com.sun.java.xml.ns.javaee.SessionConfigType insertNewSessionConfig(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.javaee.SessionConfigType target = null;
            target = (com.sun.java.xml.ns.javaee.SessionConfigType)get_store().insert_element_user(SESSIONCONFIG$20, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "session-config" element
     */
    public com.sun.java.xml.ns.javaee.SessionConfigType addNewSessionConfig()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.javaee.SessionConfigType target = null;
            target = (com.sun.java.xml.ns.javaee.SessionConfigType)get_store().add_element_user(SESSIONCONFIG$20);
            return target;
        }
    }
    
    /**
     * Removes the ith "session-config" element
     */
    public void removeSessionConfig(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SESSIONCONFIG$20, i);
        }
    }
    
    /**
     * Gets a List of "mime-mapping" elements
     */
    public java.util.List<com.sun.java.xml.ns.javaee.MimeMappingType> getMimeMappingList()
    {
        final class MimeMappingList extends java.util.AbstractList<com.sun.java.xml.ns.javaee.MimeMappingType>
        {
            public com.sun.java.xml.ns.javaee.MimeMappingType get(int i)
                { return WebAppTypeImpl.this.getMimeMappingArray(i); }
            
            public com.sun.java.xml.ns.javaee.MimeMappingType set(int i, com.sun.java.xml.ns.javaee.MimeMappingType o)
            {
                com.sun.java.xml.ns.javaee.MimeMappingType old = WebAppTypeImpl.this.getMimeMappingArray(i);
                WebAppTypeImpl.this.setMimeMappingArray(i, o);
                return old;
            }
            
            public void add(int i, com.sun.java.xml.ns.javaee.MimeMappingType o)
                { WebAppTypeImpl.this.insertNewMimeMapping(i).set(o); }
            
            public com.sun.java.xml.ns.javaee.MimeMappingType remove(int i)
            {
                com.sun.java.xml.ns.javaee.MimeMappingType old = WebAppTypeImpl.this.getMimeMappingArray(i);
                WebAppTypeImpl.this.removeMimeMapping(i);
                return old;
            }
            
            public int size()
                { return WebAppTypeImpl.this.sizeOfMimeMappingArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new MimeMappingList();
        }
    }
    
    /**
     * Gets array of all "mime-mapping" elements
     * @deprecated
     */
    public com.sun.java.xml.ns.javaee.MimeMappingType[] getMimeMappingArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List<com.sun.java.xml.ns.javaee.MimeMappingType> targetList = new java.util.ArrayList<com.sun.java.xml.ns.javaee.MimeMappingType>();
            get_store().find_all_element_users(MIMEMAPPING$22, targetList);
            com.sun.java.xml.ns.javaee.MimeMappingType[] result = new com.sun.java.xml.ns.javaee.MimeMappingType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "mime-mapping" element
     */
    public com.sun.java.xml.ns.javaee.MimeMappingType getMimeMappingArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.javaee.MimeMappingType target = null;
            target = (com.sun.java.xml.ns.javaee.MimeMappingType)get_store().find_element_user(MIMEMAPPING$22, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "mime-mapping" element
     */
    public int sizeOfMimeMappingArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(MIMEMAPPING$22);
        }
    }
    
    /**
     * Sets array of all "mime-mapping" element
     */
    public void setMimeMappingArray(com.sun.java.xml.ns.javaee.MimeMappingType[] mimeMappingArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(mimeMappingArray, MIMEMAPPING$22);
        }
    }
    
    /**
     * Sets ith "mime-mapping" element
     */
    public void setMimeMappingArray(int i, com.sun.java.xml.ns.javaee.MimeMappingType mimeMapping)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.javaee.MimeMappingType target = null;
            target = (com.sun.java.xml.ns.javaee.MimeMappingType)get_store().find_element_user(MIMEMAPPING$22, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(mimeMapping);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "mime-mapping" element
     */
    public com.sun.java.xml.ns.javaee.MimeMappingType insertNewMimeMapping(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.javaee.MimeMappingType target = null;
            target = (com.sun.java.xml.ns.javaee.MimeMappingType)get_store().insert_element_user(MIMEMAPPING$22, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "mime-mapping" element
     */
    public com.sun.java.xml.ns.javaee.MimeMappingType addNewMimeMapping()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.javaee.MimeMappingType target = null;
            target = (com.sun.java.xml.ns.javaee.MimeMappingType)get_store().add_element_user(MIMEMAPPING$22);
            return target;
        }
    }
    
    /**
     * Removes the ith "mime-mapping" element
     */
    public void removeMimeMapping(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(MIMEMAPPING$22, i);
        }
    }
    
    /**
     * Gets a List of "welcome-file-list" elements
     */
    public java.util.List<com.sun.java.xml.ns.javaee.WelcomeFileListType> getWelcomeFileListList()
    {
        final class WelcomeFileListList extends java.util.AbstractList<com.sun.java.xml.ns.javaee.WelcomeFileListType>
        {
            public com.sun.java.xml.ns.javaee.WelcomeFileListType get(int i)
                { return WebAppTypeImpl.this.getWelcomeFileListArray(i); }
            
            public com.sun.java.xml.ns.javaee.WelcomeFileListType set(int i, com.sun.java.xml.ns.javaee.WelcomeFileListType o)
            {
                com.sun.java.xml.ns.javaee.WelcomeFileListType old = WebAppTypeImpl.this.getWelcomeFileListArray(i);
                WebAppTypeImpl.this.setWelcomeFileListArray(i, o);
                return old;
            }
            
            public void add(int i, com.sun.java.xml.ns.javaee.WelcomeFileListType o)
                { WebAppTypeImpl.this.insertNewWelcomeFileList(i).set(o); }
            
            public com.sun.java.xml.ns.javaee.WelcomeFileListType remove(int i)
            {
                com.sun.java.xml.ns.javaee.WelcomeFileListType old = WebAppTypeImpl.this.getWelcomeFileListArray(i);
                WebAppTypeImpl.this.removeWelcomeFileList(i);
                return old;
            }
            
            public int size()
                { return WebAppTypeImpl.this.sizeOfWelcomeFileListArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new WelcomeFileListList();
        }
    }
    
    /**
     * Gets array of all "welcome-file-list" elements
     * @deprecated
     */
    public com.sun.java.xml.ns.javaee.WelcomeFileListType[] getWelcomeFileListArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List<com.sun.java.xml.ns.javaee.WelcomeFileListType> targetList = new java.util.ArrayList<com.sun.java.xml.ns.javaee.WelcomeFileListType>();
            get_store().find_all_element_users(WELCOMEFILELIST$24, targetList);
            com.sun.java.xml.ns.javaee.WelcomeFileListType[] result = new com.sun.java.xml.ns.javaee.WelcomeFileListType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "welcome-file-list" element
     */
    public com.sun.java.xml.ns.javaee.WelcomeFileListType getWelcomeFileListArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.javaee.WelcomeFileListType target = null;
            target = (com.sun.java.xml.ns.javaee.WelcomeFileListType)get_store().find_element_user(WELCOMEFILELIST$24, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "welcome-file-list" element
     */
    public int sizeOfWelcomeFileListArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(WELCOMEFILELIST$24);
        }
    }
    
    /**
     * Sets array of all "welcome-file-list" element
     */
    public void setWelcomeFileListArray(com.sun.java.xml.ns.javaee.WelcomeFileListType[] welcomeFileListArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(welcomeFileListArray, WELCOMEFILELIST$24);
        }
    }
    
    /**
     * Sets ith "welcome-file-list" element
     */
    public void setWelcomeFileListArray(int i, com.sun.java.xml.ns.javaee.WelcomeFileListType welcomeFileList)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.javaee.WelcomeFileListType target = null;
            target = (com.sun.java.xml.ns.javaee.WelcomeFileListType)get_store().find_element_user(WELCOMEFILELIST$24, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(welcomeFileList);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "welcome-file-list" element
     */
    public com.sun.java.xml.ns.javaee.WelcomeFileListType insertNewWelcomeFileList(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.javaee.WelcomeFileListType target = null;
            target = (com.sun.java.xml.ns.javaee.WelcomeFileListType)get_store().insert_element_user(WELCOMEFILELIST$24, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "welcome-file-list" element
     */
    public com.sun.java.xml.ns.javaee.WelcomeFileListType addNewWelcomeFileList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.javaee.WelcomeFileListType target = null;
            target = (com.sun.java.xml.ns.javaee.WelcomeFileListType)get_store().add_element_user(WELCOMEFILELIST$24);
            return target;
        }
    }
    
    /**
     * Removes the ith "welcome-file-list" element
     */
    public void removeWelcomeFileList(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(WELCOMEFILELIST$24, i);
        }
    }
    
    /**
     * Gets a List of "error-page" elements
     */
    public java.util.List<com.sun.java.xml.ns.javaee.ErrorPageType> getErrorPageList()
    {
        final class ErrorPageList extends java.util.AbstractList<com.sun.java.xml.ns.javaee.ErrorPageType>
        {
            public com.sun.java.xml.ns.javaee.ErrorPageType get(int i)
                { return WebAppTypeImpl.this.getErrorPageArray(i); }
            
            public com.sun.java.xml.ns.javaee.ErrorPageType set(int i, com.sun.java.xml.ns.javaee.ErrorPageType o)
            {
                com.sun.java.xml.ns.javaee.ErrorPageType old = WebAppTypeImpl.this.getErrorPageArray(i);
                WebAppTypeImpl.this.setErrorPageArray(i, o);
                return old;
            }
            
            public void add(int i, com.sun.java.xml.ns.javaee.ErrorPageType o)
                { WebAppTypeImpl.this.insertNewErrorPage(i).set(o); }
            
            public com.sun.java.xml.ns.javaee.ErrorPageType remove(int i)
            {
                com.sun.java.xml.ns.javaee.ErrorPageType old = WebAppTypeImpl.this.getErrorPageArray(i);
                WebAppTypeImpl.this.removeErrorPage(i);
                return old;
            }
            
            public int size()
                { return WebAppTypeImpl.this.sizeOfErrorPageArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new ErrorPageList();
        }
    }
    
    /**
     * Gets array of all "error-page" elements
     * @deprecated
     */
    public com.sun.java.xml.ns.javaee.ErrorPageType[] getErrorPageArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List<com.sun.java.xml.ns.javaee.ErrorPageType> targetList = new java.util.ArrayList<com.sun.java.xml.ns.javaee.ErrorPageType>();
            get_store().find_all_element_users(ERRORPAGE$26, targetList);
            com.sun.java.xml.ns.javaee.ErrorPageType[] result = new com.sun.java.xml.ns.javaee.ErrorPageType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "error-page" element
     */
    public com.sun.java.xml.ns.javaee.ErrorPageType getErrorPageArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.javaee.ErrorPageType target = null;
            target = (com.sun.java.xml.ns.javaee.ErrorPageType)get_store().find_element_user(ERRORPAGE$26, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "error-page" element
     */
    public int sizeOfErrorPageArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ERRORPAGE$26);
        }
    }
    
    /**
     * Sets array of all "error-page" element
     */
    public void setErrorPageArray(com.sun.java.xml.ns.javaee.ErrorPageType[] errorPageArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(errorPageArray, ERRORPAGE$26);
        }
    }
    
    /**
     * Sets ith "error-page" element
     */
    public void setErrorPageArray(int i, com.sun.java.xml.ns.javaee.ErrorPageType errorPage)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.javaee.ErrorPageType target = null;
            target = (com.sun.java.xml.ns.javaee.ErrorPageType)get_store().find_element_user(ERRORPAGE$26, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(errorPage);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "error-page" element
     */
    public com.sun.java.xml.ns.javaee.ErrorPageType insertNewErrorPage(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.javaee.ErrorPageType target = null;
            target = (com.sun.java.xml.ns.javaee.ErrorPageType)get_store().insert_element_user(ERRORPAGE$26, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "error-page" element
     */
    public com.sun.java.xml.ns.javaee.ErrorPageType addNewErrorPage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.javaee.ErrorPageType target = null;
            target = (com.sun.java.xml.ns.javaee.ErrorPageType)get_store().add_element_user(ERRORPAGE$26);
            return target;
        }
    }
    
    /**
     * Removes the ith "error-page" element
     */
    public void removeErrorPage(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ERRORPAGE$26, i);
        }
    }
    
    /**
     * Gets a List of "jsp-config" elements
     */
    public java.util.List<com.sun.java.xml.ns.javaee.JspConfigType> getJspConfigList()
    {
        final class JspConfigList extends java.util.AbstractList<com.sun.java.xml.ns.javaee.JspConfigType>
        {
            public com.sun.java.xml.ns.javaee.JspConfigType get(int i)
                { return WebAppTypeImpl.this.getJspConfigArray(i); }
            
            public com.sun.java.xml.ns.javaee.JspConfigType set(int i, com.sun.java.xml.ns.javaee.JspConfigType o)
            {
                com.sun.java.xml.ns.javaee.JspConfigType old = WebAppTypeImpl.this.getJspConfigArray(i);
                WebAppTypeImpl.this.setJspConfigArray(i, o);
                return old;
            }
            
            public void add(int i, com.sun.java.xml.ns.javaee.JspConfigType o)
                { WebAppTypeImpl.this.insertNewJspConfig(i).set(o); }
            
            public com.sun.java.xml.ns.javaee.JspConfigType remove(int i)
            {
                com.sun.java.xml.ns.javaee.JspConfigType old = WebAppTypeImpl.this.getJspConfigArray(i);
                WebAppTypeImpl.this.removeJspConfig(i);
                return old;
            }
            
            public int size()
                { return WebAppTypeImpl.this.sizeOfJspConfigArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new JspConfigList();
        }
    }
    
    /**
     * Gets array of all "jsp-config" elements
     * @deprecated
     */
    public com.sun.java.xml.ns.javaee.JspConfigType[] getJspConfigArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List<com.sun.java.xml.ns.javaee.JspConfigType> targetList = new java.util.ArrayList<com.sun.java.xml.ns.javaee.JspConfigType>();
            get_store().find_all_element_users(JSPCONFIG$28, targetList);
            com.sun.java.xml.ns.javaee.JspConfigType[] result = new com.sun.java.xml.ns.javaee.JspConfigType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "jsp-config" element
     */
    public com.sun.java.xml.ns.javaee.JspConfigType getJspConfigArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.javaee.JspConfigType target = null;
            target = (com.sun.java.xml.ns.javaee.JspConfigType)get_store().find_element_user(JSPCONFIG$28, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "jsp-config" element
     */
    public int sizeOfJspConfigArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(JSPCONFIG$28);
        }
    }
    
    /**
     * Sets array of all "jsp-config" element
     */
    public void setJspConfigArray(com.sun.java.xml.ns.javaee.JspConfigType[] jspConfigArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(jspConfigArray, JSPCONFIG$28);
        }
    }
    
    /**
     * Sets ith "jsp-config" element
     */
    public void setJspConfigArray(int i, com.sun.java.xml.ns.javaee.JspConfigType jspConfig)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.javaee.JspConfigType target = null;
            target = (com.sun.java.xml.ns.javaee.JspConfigType)get_store().find_element_user(JSPCONFIG$28, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(jspConfig);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "jsp-config" element
     */
    public com.sun.java.xml.ns.javaee.JspConfigType insertNewJspConfig(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.javaee.JspConfigType target = null;
            target = (com.sun.java.xml.ns.javaee.JspConfigType)get_store().insert_element_user(JSPCONFIG$28, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "jsp-config" element
     */
    public com.sun.java.xml.ns.javaee.JspConfigType addNewJspConfig()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.javaee.JspConfigType target = null;
            target = (com.sun.java.xml.ns.javaee.JspConfigType)get_store().add_element_user(JSPCONFIG$28);
            return target;
        }
    }
    
    /**
     * Removes the ith "jsp-config" element
     */
    public void removeJspConfig(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(JSPCONFIG$28, i);
        }
    }
    
    /**
     * Gets a List of "security-constraint" elements
     */
    public java.util.List<com.sun.java.xml.ns.javaee.SecurityConstraintType> getSecurityConstraintList()
    {
        final class SecurityConstraintList extends java.util.AbstractList<com.sun.java.xml.ns.javaee.SecurityConstraintType>
        {
            public com.sun.java.xml.ns.javaee.SecurityConstraintType get(int i)
                { return WebAppTypeImpl.this.getSecurityConstraintArray(i); }
            
            public com.sun.java.xml.ns.javaee.SecurityConstraintType set(int i, com.sun.java.xml.ns.javaee.SecurityConstraintType o)
            {
                com.sun.java.xml.ns.javaee.SecurityConstraintType old = WebAppTypeImpl.this.getSecurityConstraintArray(i);
                WebAppTypeImpl.this.setSecurityConstraintArray(i, o);
                return old;
            }
            
            public void add(int i, com.sun.java.xml.ns.javaee.SecurityConstraintType o)
                { WebAppTypeImpl.this.insertNewSecurityConstraint(i).set(o); }
            
            public com.sun.java.xml.ns.javaee.SecurityConstraintType remove(int i)
            {
                com.sun.java.xml.ns.javaee.SecurityConstraintType old = WebAppTypeImpl.this.getSecurityConstraintArray(i);
                WebAppTypeImpl.this.removeSecurityConstraint(i);
                return old;
            }
            
            public int size()
                { return WebAppTypeImpl.this.sizeOfSecurityConstraintArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new SecurityConstraintList();
        }
    }
    
    /**
     * Gets array of all "security-constraint" elements
     * @deprecated
     */
    public com.sun.java.xml.ns.javaee.SecurityConstraintType[] getSecurityConstraintArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List<com.sun.java.xml.ns.javaee.SecurityConstraintType> targetList = new java.util.ArrayList<com.sun.java.xml.ns.javaee.SecurityConstraintType>();
            get_store().find_all_element_users(SECURITYCONSTRAINT$30, targetList);
            com.sun.java.xml.ns.javaee.SecurityConstraintType[] result = new com.sun.java.xml.ns.javaee.SecurityConstraintType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "security-constraint" element
     */
    public com.sun.java.xml.ns.javaee.SecurityConstraintType getSecurityConstraintArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.javaee.SecurityConstraintType target = null;
            target = (com.sun.java.xml.ns.javaee.SecurityConstraintType)get_store().find_element_user(SECURITYCONSTRAINT$30, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "security-constraint" element
     */
    public int sizeOfSecurityConstraintArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SECURITYCONSTRAINT$30);
        }
    }
    
    /**
     * Sets array of all "security-constraint" element
     */
    public void setSecurityConstraintArray(com.sun.java.xml.ns.javaee.SecurityConstraintType[] securityConstraintArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(securityConstraintArray, SECURITYCONSTRAINT$30);
        }
    }
    
    /**
     * Sets ith "security-constraint" element
     */
    public void setSecurityConstraintArray(int i, com.sun.java.xml.ns.javaee.SecurityConstraintType securityConstraint)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.javaee.SecurityConstraintType target = null;
            target = (com.sun.java.xml.ns.javaee.SecurityConstraintType)get_store().find_element_user(SECURITYCONSTRAINT$30, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(securityConstraint);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "security-constraint" element
     */
    public com.sun.java.xml.ns.javaee.SecurityConstraintType insertNewSecurityConstraint(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.javaee.SecurityConstraintType target = null;
            target = (com.sun.java.xml.ns.javaee.SecurityConstraintType)get_store().insert_element_user(SECURITYCONSTRAINT$30, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "security-constraint" element
     */
    public com.sun.java.xml.ns.javaee.SecurityConstraintType addNewSecurityConstraint()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.javaee.SecurityConstraintType target = null;
            target = (com.sun.java.xml.ns.javaee.SecurityConstraintType)get_store().add_element_user(SECURITYCONSTRAINT$30);
            return target;
        }
    }
    
    /**
     * Removes the ith "security-constraint" element
     */
    public void removeSecurityConstraint(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SECURITYCONSTRAINT$30, i);
        }
    }
    
    /**
     * Gets a List of "login-config" elements
     */
    public java.util.List<com.sun.java.xml.ns.javaee.LoginConfigType> getLoginConfigList()
    {
        final class LoginConfigList extends java.util.AbstractList<com.sun.java.xml.ns.javaee.LoginConfigType>
        {
            public com.sun.java.xml.ns.javaee.LoginConfigType get(int i)
                { return WebAppTypeImpl.this.getLoginConfigArray(i); }
            
            public com.sun.java.xml.ns.javaee.LoginConfigType set(int i, com.sun.java.xml.ns.javaee.LoginConfigType o)
            {
                com.sun.java.xml.ns.javaee.LoginConfigType old = WebAppTypeImpl.this.getLoginConfigArray(i);
                WebAppTypeImpl.this.setLoginConfigArray(i, o);
                return old;
            }
            
            public void add(int i, com.sun.java.xml.ns.javaee.LoginConfigType o)
                { WebAppTypeImpl.this.insertNewLoginConfig(i).set(o); }
            
            public com.sun.java.xml.ns.javaee.LoginConfigType remove(int i)
            {
                com.sun.java.xml.ns.javaee.LoginConfigType old = WebAppTypeImpl.this.getLoginConfigArray(i);
                WebAppTypeImpl.this.removeLoginConfig(i);
                return old;
            }
            
            public int size()
                { return WebAppTypeImpl.this.sizeOfLoginConfigArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new LoginConfigList();
        }
    }
    
    /**
     * Gets array of all "login-config" elements
     * @deprecated
     */
    public com.sun.java.xml.ns.javaee.LoginConfigType[] getLoginConfigArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List<com.sun.java.xml.ns.javaee.LoginConfigType> targetList = new java.util.ArrayList<com.sun.java.xml.ns.javaee.LoginConfigType>();
            get_store().find_all_element_users(LOGINCONFIG$32, targetList);
            com.sun.java.xml.ns.javaee.LoginConfigType[] result = new com.sun.java.xml.ns.javaee.LoginConfigType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "login-config" element
     */
    public com.sun.java.xml.ns.javaee.LoginConfigType getLoginConfigArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.javaee.LoginConfigType target = null;
            target = (com.sun.java.xml.ns.javaee.LoginConfigType)get_store().find_element_user(LOGINCONFIG$32, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "login-config" element
     */
    public int sizeOfLoginConfigArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(LOGINCONFIG$32);
        }
    }
    
    /**
     * Sets array of all "login-config" element
     */
    public void setLoginConfigArray(com.sun.java.xml.ns.javaee.LoginConfigType[] loginConfigArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(loginConfigArray, LOGINCONFIG$32);
        }
    }
    
    /**
     * Sets ith "login-config" element
     */
    public void setLoginConfigArray(int i, com.sun.java.xml.ns.javaee.LoginConfigType loginConfig)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.javaee.LoginConfigType target = null;
            target = (com.sun.java.xml.ns.javaee.LoginConfigType)get_store().find_element_user(LOGINCONFIG$32, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(loginConfig);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "login-config" element
     */
    public com.sun.java.xml.ns.javaee.LoginConfigType insertNewLoginConfig(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.javaee.LoginConfigType target = null;
            target = (com.sun.java.xml.ns.javaee.LoginConfigType)get_store().insert_element_user(LOGINCONFIG$32, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "login-config" element
     */
    public com.sun.java.xml.ns.javaee.LoginConfigType addNewLoginConfig()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.javaee.LoginConfigType target = null;
            target = (com.sun.java.xml.ns.javaee.LoginConfigType)get_store().add_element_user(LOGINCONFIG$32);
            return target;
        }
    }
    
    /**
     * Removes the ith "login-config" element
     */
    public void removeLoginConfig(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(LOGINCONFIG$32, i);
        }
    }
    
    /**
     * Gets a List of "security-role" elements
     */
    public java.util.List<com.sun.java.xml.ns.javaee.SecurityRoleType> getSecurityRoleList()
    {
        final class SecurityRoleList extends java.util.AbstractList<com.sun.java.xml.ns.javaee.SecurityRoleType>
        {
            public com.sun.java.xml.ns.javaee.SecurityRoleType get(int i)
                { return WebAppTypeImpl.this.getSecurityRoleArray(i); }
            
            public com.sun.java.xml.ns.javaee.SecurityRoleType set(int i, com.sun.java.xml.ns.javaee.SecurityRoleType o)
            {
                com.sun.java.xml.ns.javaee.SecurityRoleType old = WebAppTypeImpl.this.getSecurityRoleArray(i);
                WebAppTypeImpl.this.setSecurityRoleArray(i, o);
                return old;
            }
            
            public void add(int i, com.sun.java.xml.ns.javaee.SecurityRoleType o)
                { WebAppTypeImpl.this.insertNewSecurityRole(i).set(o); }
            
            public com.sun.java.xml.ns.javaee.SecurityRoleType remove(int i)
            {
                com.sun.java.xml.ns.javaee.SecurityRoleType old = WebAppTypeImpl.this.getSecurityRoleArray(i);
                WebAppTypeImpl.this.removeSecurityRole(i);
                return old;
            }
            
            public int size()
                { return WebAppTypeImpl.this.sizeOfSecurityRoleArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new SecurityRoleList();
        }
    }
    
    /**
     * Gets array of all "security-role" elements
     * @deprecated
     */
    public com.sun.java.xml.ns.javaee.SecurityRoleType[] getSecurityRoleArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List<com.sun.java.xml.ns.javaee.SecurityRoleType> targetList = new java.util.ArrayList<com.sun.java.xml.ns.javaee.SecurityRoleType>();
            get_store().find_all_element_users(SECURITYROLE$34, targetList);
            com.sun.java.xml.ns.javaee.SecurityRoleType[] result = new com.sun.java.xml.ns.javaee.SecurityRoleType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "security-role" element
     */
    public com.sun.java.xml.ns.javaee.SecurityRoleType getSecurityRoleArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.javaee.SecurityRoleType target = null;
            target = (com.sun.java.xml.ns.javaee.SecurityRoleType)get_store().find_element_user(SECURITYROLE$34, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "security-role" element
     */
    public int sizeOfSecurityRoleArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SECURITYROLE$34);
        }
    }
    
    /**
     * Sets array of all "security-role" element
     */
    public void setSecurityRoleArray(com.sun.java.xml.ns.javaee.SecurityRoleType[] securityRoleArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(securityRoleArray, SECURITYROLE$34);
        }
    }
    
    /**
     * Sets ith "security-role" element
     */
    public void setSecurityRoleArray(int i, com.sun.java.xml.ns.javaee.SecurityRoleType securityRole)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.javaee.SecurityRoleType target = null;
            target = (com.sun.java.xml.ns.javaee.SecurityRoleType)get_store().find_element_user(SECURITYROLE$34, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(securityRole);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "security-role" element
     */
    public com.sun.java.xml.ns.javaee.SecurityRoleType insertNewSecurityRole(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.javaee.SecurityRoleType target = null;
            target = (com.sun.java.xml.ns.javaee.SecurityRoleType)get_store().insert_element_user(SECURITYROLE$34, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "security-role" element
     */
    public com.sun.java.xml.ns.javaee.SecurityRoleType addNewSecurityRole()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.javaee.SecurityRoleType target = null;
            target = (com.sun.java.xml.ns.javaee.SecurityRoleType)get_store().add_element_user(SECURITYROLE$34);
            return target;
        }
    }
    
    /**
     * Removes the ith "security-role" element
     */
    public void removeSecurityRole(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SECURITYROLE$34, i);
        }
    }
    
    /**
     * Gets a List of "env-entry" elements
     */
    public java.util.List<com.sun.java.xml.ns.javaee.EnvEntryType> getEnvEntryList()
    {
        final class EnvEntryList extends java.util.AbstractList<com.sun.java.xml.ns.javaee.EnvEntryType>
        {
            public com.sun.java.xml.ns.javaee.EnvEntryType get(int i)
                { return WebAppTypeImpl.this.getEnvEntryArray(i); }
            
            public com.sun.java.xml.ns.javaee.EnvEntryType set(int i, com.sun.java.xml.ns.javaee.EnvEntryType o)
            {
                com.sun.java.xml.ns.javaee.EnvEntryType old = WebAppTypeImpl.this.getEnvEntryArray(i);
                WebAppTypeImpl.this.setEnvEntryArray(i, o);
                return old;
            }
            
            public void add(int i, com.sun.java.xml.ns.javaee.EnvEntryType o)
                { WebAppTypeImpl.this.insertNewEnvEntry(i).set(o); }
            
            public com.sun.java.xml.ns.javaee.EnvEntryType remove(int i)
            {
                com.sun.java.xml.ns.javaee.EnvEntryType old = WebAppTypeImpl.this.getEnvEntryArray(i);
                WebAppTypeImpl.this.removeEnvEntry(i);
                return old;
            }
            
            public int size()
                { return WebAppTypeImpl.this.sizeOfEnvEntryArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new EnvEntryList();
        }
    }
    
    /**
     * Gets array of all "env-entry" elements
     * @deprecated
     */
    public com.sun.java.xml.ns.javaee.EnvEntryType[] getEnvEntryArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List<com.sun.java.xml.ns.javaee.EnvEntryType> targetList = new java.util.ArrayList<com.sun.java.xml.ns.javaee.EnvEntryType>();
            get_store().find_all_element_users(ENVENTRY$36, targetList);
            com.sun.java.xml.ns.javaee.EnvEntryType[] result = new com.sun.java.xml.ns.javaee.EnvEntryType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "env-entry" element
     */
    public com.sun.java.xml.ns.javaee.EnvEntryType getEnvEntryArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.javaee.EnvEntryType target = null;
            target = (com.sun.java.xml.ns.javaee.EnvEntryType)get_store().find_element_user(ENVENTRY$36, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "env-entry" element
     */
    public int sizeOfEnvEntryArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ENVENTRY$36);
        }
    }
    
    /**
     * Sets array of all "env-entry" element
     */
    public void setEnvEntryArray(com.sun.java.xml.ns.javaee.EnvEntryType[] envEntryArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(envEntryArray, ENVENTRY$36);
        }
    }
    
    /**
     * Sets ith "env-entry" element
     */
    public void setEnvEntryArray(int i, com.sun.java.xml.ns.javaee.EnvEntryType envEntry)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.javaee.EnvEntryType target = null;
            target = (com.sun.java.xml.ns.javaee.EnvEntryType)get_store().find_element_user(ENVENTRY$36, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(envEntry);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "env-entry" element
     */
    public com.sun.java.xml.ns.javaee.EnvEntryType insertNewEnvEntry(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.javaee.EnvEntryType target = null;
            target = (com.sun.java.xml.ns.javaee.EnvEntryType)get_store().insert_element_user(ENVENTRY$36, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "env-entry" element
     */
    public com.sun.java.xml.ns.javaee.EnvEntryType addNewEnvEntry()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.javaee.EnvEntryType target = null;
            target = (com.sun.java.xml.ns.javaee.EnvEntryType)get_store().add_element_user(ENVENTRY$36);
            return target;
        }
    }
    
    /**
     * Removes the ith "env-entry" element
     */
    public void removeEnvEntry(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ENVENTRY$36, i);
        }
    }
    
    /**
     * Gets a List of "ejb-ref" elements
     */
    public java.util.List<com.sun.java.xml.ns.javaee.EjbRefType> getEjbRefList()
    {
        final class EjbRefList extends java.util.AbstractList<com.sun.java.xml.ns.javaee.EjbRefType>
        {
            public com.sun.java.xml.ns.javaee.EjbRefType get(int i)
                { return WebAppTypeImpl.this.getEjbRefArray(i); }
            
            public com.sun.java.xml.ns.javaee.EjbRefType set(int i, com.sun.java.xml.ns.javaee.EjbRefType o)
            {
                com.sun.java.xml.ns.javaee.EjbRefType old = WebAppTypeImpl.this.getEjbRefArray(i);
                WebAppTypeImpl.this.setEjbRefArray(i, o);
                return old;
            }
            
            public void add(int i, com.sun.java.xml.ns.javaee.EjbRefType o)
                { WebAppTypeImpl.this.insertNewEjbRef(i).set(o); }
            
            public com.sun.java.xml.ns.javaee.EjbRefType remove(int i)
            {
                com.sun.java.xml.ns.javaee.EjbRefType old = WebAppTypeImpl.this.getEjbRefArray(i);
                WebAppTypeImpl.this.removeEjbRef(i);
                return old;
            }
            
            public int size()
                { return WebAppTypeImpl.this.sizeOfEjbRefArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new EjbRefList();
        }
    }
    
    /**
     * Gets array of all "ejb-ref" elements
     * @deprecated
     */
    public com.sun.java.xml.ns.javaee.EjbRefType[] getEjbRefArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List<com.sun.java.xml.ns.javaee.EjbRefType> targetList = new java.util.ArrayList<com.sun.java.xml.ns.javaee.EjbRefType>();
            get_store().find_all_element_users(EJBREF$38, targetList);
            com.sun.java.xml.ns.javaee.EjbRefType[] result = new com.sun.java.xml.ns.javaee.EjbRefType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "ejb-ref" element
     */
    public com.sun.java.xml.ns.javaee.EjbRefType getEjbRefArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.javaee.EjbRefType target = null;
            target = (com.sun.java.xml.ns.javaee.EjbRefType)get_store().find_element_user(EJBREF$38, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "ejb-ref" element
     */
    public int sizeOfEjbRefArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(EJBREF$38);
        }
    }
    
    /**
     * Sets array of all "ejb-ref" element
     */
    public void setEjbRefArray(com.sun.java.xml.ns.javaee.EjbRefType[] ejbRefArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(ejbRefArray, EJBREF$38);
        }
    }
    
    /**
     * Sets ith "ejb-ref" element
     */
    public void setEjbRefArray(int i, com.sun.java.xml.ns.javaee.EjbRefType ejbRef)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.javaee.EjbRefType target = null;
            target = (com.sun.java.xml.ns.javaee.EjbRefType)get_store().find_element_user(EJBREF$38, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(ejbRef);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "ejb-ref" element
     */
    public com.sun.java.xml.ns.javaee.EjbRefType insertNewEjbRef(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.javaee.EjbRefType target = null;
            target = (com.sun.java.xml.ns.javaee.EjbRefType)get_store().insert_element_user(EJBREF$38, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "ejb-ref" element
     */
    public com.sun.java.xml.ns.javaee.EjbRefType addNewEjbRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.javaee.EjbRefType target = null;
            target = (com.sun.java.xml.ns.javaee.EjbRefType)get_store().add_element_user(EJBREF$38);
            return target;
        }
    }
    
    /**
     * Removes the ith "ejb-ref" element
     */
    public void removeEjbRef(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(EJBREF$38, i);
        }
    }
    
    /**
     * Gets a List of "ejb-local-ref" elements
     */
    public java.util.List<com.sun.java.xml.ns.javaee.EjbLocalRefType> getEjbLocalRefList()
    {
        final class EjbLocalRefList extends java.util.AbstractList<com.sun.java.xml.ns.javaee.EjbLocalRefType>
        {
            public com.sun.java.xml.ns.javaee.EjbLocalRefType get(int i)
                { return WebAppTypeImpl.this.getEjbLocalRefArray(i); }
            
            public com.sun.java.xml.ns.javaee.EjbLocalRefType set(int i, com.sun.java.xml.ns.javaee.EjbLocalRefType o)
            {
                com.sun.java.xml.ns.javaee.EjbLocalRefType old = WebAppTypeImpl.this.getEjbLocalRefArray(i);
                WebAppTypeImpl.this.setEjbLocalRefArray(i, o);
                return old;
            }
            
            public void add(int i, com.sun.java.xml.ns.javaee.EjbLocalRefType o)
                { WebAppTypeImpl.this.insertNewEjbLocalRef(i).set(o); }
            
            public com.sun.java.xml.ns.javaee.EjbLocalRefType remove(int i)
            {
                com.sun.java.xml.ns.javaee.EjbLocalRefType old = WebAppTypeImpl.this.getEjbLocalRefArray(i);
                WebAppTypeImpl.this.removeEjbLocalRef(i);
                return old;
            }
            
            public int size()
                { return WebAppTypeImpl.this.sizeOfEjbLocalRefArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new EjbLocalRefList();
        }
    }
    
    /**
     * Gets array of all "ejb-local-ref" elements
     * @deprecated
     */
    public com.sun.java.xml.ns.javaee.EjbLocalRefType[] getEjbLocalRefArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List<com.sun.java.xml.ns.javaee.EjbLocalRefType> targetList = new java.util.ArrayList<com.sun.java.xml.ns.javaee.EjbLocalRefType>();
            get_store().find_all_element_users(EJBLOCALREF$40, targetList);
            com.sun.java.xml.ns.javaee.EjbLocalRefType[] result = new com.sun.java.xml.ns.javaee.EjbLocalRefType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "ejb-local-ref" element
     */
    public com.sun.java.xml.ns.javaee.EjbLocalRefType getEjbLocalRefArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.javaee.EjbLocalRefType target = null;
            target = (com.sun.java.xml.ns.javaee.EjbLocalRefType)get_store().find_element_user(EJBLOCALREF$40, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "ejb-local-ref" element
     */
    public int sizeOfEjbLocalRefArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(EJBLOCALREF$40);
        }
    }
    
    /**
     * Sets array of all "ejb-local-ref" element
     */
    public void setEjbLocalRefArray(com.sun.java.xml.ns.javaee.EjbLocalRefType[] ejbLocalRefArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(ejbLocalRefArray, EJBLOCALREF$40);
        }
    }
    
    /**
     * Sets ith "ejb-local-ref" element
     */
    public void setEjbLocalRefArray(int i, com.sun.java.xml.ns.javaee.EjbLocalRefType ejbLocalRef)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.javaee.EjbLocalRefType target = null;
            target = (com.sun.java.xml.ns.javaee.EjbLocalRefType)get_store().find_element_user(EJBLOCALREF$40, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(ejbLocalRef);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "ejb-local-ref" element
     */
    public com.sun.java.xml.ns.javaee.EjbLocalRefType insertNewEjbLocalRef(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.javaee.EjbLocalRefType target = null;
            target = (com.sun.java.xml.ns.javaee.EjbLocalRefType)get_store().insert_element_user(EJBLOCALREF$40, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "ejb-local-ref" element
     */
    public com.sun.java.xml.ns.javaee.EjbLocalRefType addNewEjbLocalRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.javaee.EjbLocalRefType target = null;
            target = (com.sun.java.xml.ns.javaee.EjbLocalRefType)get_store().add_element_user(EJBLOCALREF$40);
            return target;
        }
    }
    
    /**
     * Removes the ith "ejb-local-ref" element
     */
    public void removeEjbLocalRef(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(EJBLOCALREF$40, i);
        }
    }
    
    /**
     * Gets a List of "service-ref" elements
     */
    public java.util.List<com.sun.java.xml.ns.javaee.ServiceRefType> getServiceRefList()
    {
        final class ServiceRefList extends java.util.AbstractList<com.sun.java.xml.ns.javaee.ServiceRefType>
        {
            public com.sun.java.xml.ns.javaee.ServiceRefType get(int i)
                { return WebAppTypeImpl.this.getServiceRefArray(i); }
            
            public com.sun.java.xml.ns.javaee.ServiceRefType set(int i, com.sun.java.xml.ns.javaee.ServiceRefType o)
            {
                com.sun.java.xml.ns.javaee.ServiceRefType old = WebAppTypeImpl.this.getServiceRefArray(i);
                WebAppTypeImpl.this.setServiceRefArray(i, o);
                return old;
            }
            
            public void add(int i, com.sun.java.xml.ns.javaee.ServiceRefType o)
                { WebAppTypeImpl.this.insertNewServiceRef(i).set(o); }
            
            public com.sun.java.xml.ns.javaee.ServiceRefType remove(int i)
            {
                com.sun.java.xml.ns.javaee.ServiceRefType old = WebAppTypeImpl.this.getServiceRefArray(i);
                WebAppTypeImpl.this.removeServiceRef(i);
                return old;
            }
            
            public int size()
                { return WebAppTypeImpl.this.sizeOfServiceRefArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new ServiceRefList();
        }
    }
    
    /**
     * Gets array of all "service-ref" elements
     * @deprecated
     */
    public com.sun.java.xml.ns.javaee.ServiceRefType[] getServiceRefArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List<com.sun.java.xml.ns.javaee.ServiceRefType> targetList = new java.util.ArrayList<com.sun.java.xml.ns.javaee.ServiceRefType>();
            get_store().find_all_element_users(SERVICEREF$42, targetList);
            com.sun.java.xml.ns.javaee.ServiceRefType[] result = new com.sun.java.xml.ns.javaee.ServiceRefType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "service-ref" element
     */
    public com.sun.java.xml.ns.javaee.ServiceRefType getServiceRefArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.javaee.ServiceRefType target = null;
            target = (com.sun.java.xml.ns.javaee.ServiceRefType)get_store().find_element_user(SERVICEREF$42, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "service-ref" element
     */
    public int sizeOfServiceRefArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SERVICEREF$42);
        }
    }
    
    /**
     * Sets array of all "service-ref" element
     */
    public void setServiceRefArray(com.sun.java.xml.ns.javaee.ServiceRefType[] serviceRefArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(serviceRefArray, SERVICEREF$42);
        }
    }
    
    /**
     * Sets ith "service-ref" element
     */
    public void setServiceRefArray(int i, com.sun.java.xml.ns.javaee.ServiceRefType serviceRef)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.javaee.ServiceRefType target = null;
            target = (com.sun.java.xml.ns.javaee.ServiceRefType)get_store().find_element_user(SERVICEREF$42, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(serviceRef);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "service-ref" element
     */
    public com.sun.java.xml.ns.javaee.ServiceRefType insertNewServiceRef(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.javaee.ServiceRefType target = null;
            target = (com.sun.java.xml.ns.javaee.ServiceRefType)get_store().insert_element_user(SERVICEREF$42, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "service-ref" element
     */
    public com.sun.java.xml.ns.javaee.ServiceRefType addNewServiceRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.javaee.ServiceRefType target = null;
            target = (com.sun.java.xml.ns.javaee.ServiceRefType)get_store().add_element_user(SERVICEREF$42);
            return target;
        }
    }
    
    /**
     * Removes the ith "service-ref" element
     */
    public void removeServiceRef(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SERVICEREF$42, i);
        }
    }
    
    /**
     * Gets a List of "resource-ref" elements
     */
    public java.util.List<com.sun.java.xml.ns.javaee.ResourceRefType> getResourceRefList()
    {
        final class ResourceRefList extends java.util.AbstractList<com.sun.java.xml.ns.javaee.ResourceRefType>
        {
            public com.sun.java.xml.ns.javaee.ResourceRefType get(int i)
                { return WebAppTypeImpl.this.getResourceRefArray(i); }
            
            public com.sun.java.xml.ns.javaee.ResourceRefType set(int i, com.sun.java.xml.ns.javaee.ResourceRefType o)
            {
                com.sun.java.xml.ns.javaee.ResourceRefType old = WebAppTypeImpl.this.getResourceRefArray(i);
                WebAppTypeImpl.this.setResourceRefArray(i, o);
                return old;
            }
            
            public void add(int i, com.sun.java.xml.ns.javaee.ResourceRefType o)
                { WebAppTypeImpl.this.insertNewResourceRef(i).set(o); }
            
            public com.sun.java.xml.ns.javaee.ResourceRefType remove(int i)
            {
                com.sun.java.xml.ns.javaee.ResourceRefType old = WebAppTypeImpl.this.getResourceRefArray(i);
                WebAppTypeImpl.this.removeResourceRef(i);
                return old;
            }
            
            public int size()
                { return WebAppTypeImpl.this.sizeOfResourceRefArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new ResourceRefList();
        }
    }
    
    /**
     * Gets array of all "resource-ref" elements
     * @deprecated
     */
    public com.sun.java.xml.ns.javaee.ResourceRefType[] getResourceRefArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List<com.sun.java.xml.ns.javaee.ResourceRefType> targetList = new java.util.ArrayList<com.sun.java.xml.ns.javaee.ResourceRefType>();
            get_store().find_all_element_users(RESOURCEREF$44, targetList);
            com.sun.java.xml.ns.javaee.ResourceRefType[] result = new com.sun.java.xml.ns.javaee.ResourceRefType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "resource-ref" element
     */
    public com.sun.java.xml.ns.javaee.ResourceRefType getResourceRefArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.javaee.ResourceRefType target = null;
            target = (com.sun.java.xml.ns.javaee.ResourceRefType)get_store().find_element_user(RESOURCEREF$44, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "resource-ref" element
     */
    public int sizeOfResourceRefArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(RESOURCEREF$44);
        }
    }
    
    /**
     * Sets array of all "resource-ref" element
     */
    public void setResourceRefArray(com.sun.java.xml.ns.javaee.ResourceRefType[] resourceRefArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(resourceRefArray, RESOURCEREF$44);
        }
    }
    
    /**
     * Sets ith "resource-ref" element
     */
    public void setResourceRefArray(int i, com.sun.java.xml.ns.javaee.ResourceRefType resourceRef)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.javaee.ResourceRefType target = null;
            target = (com.sun.java.xml.ns.javaee.ResourceRefType)get_store().find_element_user(RESOURCEREF$44, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(resourceRef);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "resource-ref" element
     */
    public com.sun.java.xml.ns.javaee.ResourceRefType insertNewResourceRef(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.javaee.ResourceRefType target = null;
            target = (com.sun.java.xml.ns.javaee.ResourceRefType)get_store().insert_element_user(RESOURCEREF$44, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "resource-ref" element
     */
    public com.sun.java.xml.ns.javaee.ResourceRefType addNewResourceRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.javaee.ResourceRefType target = null;
            target = (com.sun.java.xml.ns.javaee.ResourceRefType)get_store().add_element_user(RESOURCEREF$44);
            return target;
        }
    }
    
    /**
     * Removes the ith "resource-ref" element
     */
    public void removeResourceRef(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(RESOURCEREF$44, i);
        }
    }
    
    /**
     * Gets a List of "resource-env-ref" elements
     */
    public java.util.List<com.sun.java.xml.ns.javaee.ResourceEnvRefType> getResourceEnvRefList()
    {
        final class ResourceEnvRefList extends java.util.AbstractList<com.sun.java.xml.ns.javaee.ResourceEnvRefType>
        {
            public com.sun.java.xml.ns.javaee.ResourceEnvRefType get(int i)
                { return WebAppTypeImpl.this.getResourceEnvRefArray(i); }
            
            public com.sun.java.xml.ns.javaee.ResourceEnvRefType set(int i, com.sun.java.xml.ns.javaee.ResourceEnvRefType o)
            {
                com.sun.java.xml.ns.javaee.ResourceEnvRefType old = WebAppTypeImpl.this.getResourceEnvRefArray(i);
                WebAppTypeImpl.this.setResourceEnvRefArray(i, o);
                return old;
            }
            
            public void add(int i, com.sun.java.xml.ns.javaee.ResourceEnvRefType o)
                { WebAppTypeImpl.this.insertNewResourceEnvRef(i).set(o); }
            
            public com.sun.java.xml.ns.javaee.ResourceEnvRefType remove(int i)
            {
                com.sun.java.xml.ns.javaee.ResourceEnvRefType old = WebAppTypeImpl.this.getResourceEnvRefArray(i);
                WebAppTypeImpl.this.removeResourceEnvRef(i);
                return old;
            }
            
            public int size()
                { return WebAppTypeImpl.this.sizeOfResourceEnvRefArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new ResourceEnvRefList();
        }
    }
    
    /**
     * Gets array of all "resource-env-ref" elements
     * @deprecated
     */
    public com.sun.java.xml.ns.javaee.ResourceEnvRefType[] getResourceEnvRefArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List<com.sun.java.xml.ns.javaee.ResourceEnvRefType> targetList = new java.util.ArrayList<com.sun.java.xml.ns.javaee.ResourceEnvRefType>();
            get_store().find_all_element_users(RESOURCEENVREF$46, targetList);
            com.sun.java.xml.ns.javaee.ResourceEnvRefType[] result = new com.sun.java.xml.ns.javaee.ResourceEnvRefType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "resource-env-ref" element
     */
    public com.sun.java.xml.ns.javaee.ResourceEnvRefType getResourceEnvRefArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.javaee.ResourceEnvRefType target = null;
            target = (com.sun.java.xml.ns.javaee.ResourceEnvRefType)get_store().find_element_user(RESOURCEENVREF$46, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "resource-env-ref" element
     */
    public int sizeOfResourceEnvRefArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(RESOURCEENVREF$46);
        }
    }
    
    /**
     * Sets array of all "resource-env-ref" element
     */
    public void setResourceEnvRefArray(com.sun.java.xml.ns.javaee.ResourceEnvRefType[] resourceEnvRefArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(resourceEnvRefArray, RESOURCEENVREF$46);
        }
    }
    
    /**
     * Sets ith "resource-env-ref" element
     */
    public void setResourceEnvRefArray(int i, com.sun.java.xml.ns.javaee.ResourceEnvRefType resourceEnvRef)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.javaee.ResourceEnvRefType target = null;
            target = (com.sun.java.xml.ns.javaee.ResourceEnvRefType)get_store().find_element_user(RESOURCEENVREF$46, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(resourceEnvRef);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "resource-env-ref" element
     */
    public com.sun.java.xml.ns.javaee.ResourceEnvRefType insertNewResourceEnvRef(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.javaee.ResourceEnvRefType target = null;
            target = (com.sun.java.xml.ns.javaee.ResourceEnvRefType)get_store().insert_element_user(RESOURCEENVREF$46, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "resource-env-ref" element
     */
    public com.sun.java.xml.ns.javaee.ResourceEnvRefType addNewResourceEnvRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.javaee.ResourceEnvRefType target = null;
            target = (com.sun.java.xml.ns.javaee.ResourceEnvRefType)get_store().add_element_user(RESOURCEENVREF$46);
            return target;
        }
    }
    
    /**
     * Removes the ith "resource-env-ref" element
     */
    public void removeResourceEnvRef(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(RESOURCEENVREF$46, i);
        }
    }
    
    /**
     * Gets a List of "message-destination-ref" elements
     */
    public java.util.List<com.sun.java.xml.ns.javaee.MessageDestinationRefType> getMessageDestinationRefList()
    {
        final class MessageDestinationRefList extends java.util.AbstractList<com.sun.java.xml.ns.javaee.MessageDestinationRefType>
        {
            public com.sun.java.xml.ns.javaee.MessageDestinationRefType get(int i)
                { return WebAppTypeImpl.this.getMessageDestinationRefArray(i); }
            
            public com.sun.java.xml.ns.javaee.MessageDestinationRefType set(int i, com.sun.java.xml.ns.javaee.MessageDestinationRefType o)
            {
                com.sun.java.xml.ns.javaee.MessageDestinationRefType old = WebAppTypeImpl.this.getMessageDestinationRefArray(i);
                WebAppTypeImpl.this.setMessageDestinationRefArray(i, o);
                return old;
            }
            
            public void add(int i, com.sun.java.xml.ns.javaee.MessageDestinationRefType o)
                { WebAppTypeImpl.this.insertNewMessageDestinationRef(i).set(o); }
            
            public com.sun.java.xml.ns.javaee.MessageDestinationRefType remove(int i)
            {
                com.sun.java.xml.ns.javaee.MessageDestinationRefType old = WebAppTypeImpl.this.getMessageDestinationRefArray(i);
                WebAppTypeImpl.this.removeMessageDestinationRef(i);
                return old;
            }
            
            public int size()
                { return WebAppTypeImpl.this.sizeOfMessageDestinationRefArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new MessageDestinationRefList();
        }
    }
    
    /**
     * Gets array of all "message-destination-ref" elements
     * @deprecated
     */
    public com.sun.java.xml.ns.javaee.MessageDestinationRefType[] getMessageDestinationRefArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List<com.sun.java.xml.ns.javaee.MessageDestinationRefType> targetList = new java.util.ArrayList<com.sun.java.xml.ns.javaee.MessageDestinationRefType>();
            get_store().find_all_element_users(MESSAGEDESTINATIONREF$48, targetList);
            com.sun.java.xml.ns.javaee.MessageDestinationRefType[] result = new com.sun.java.xml.ns.javaee.MessageDestinationRefType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "message-destination-ref" element
     */
    public com.sun.java.xml.ns.javaee.MessageDestinationRefType getMessageDestinationRefArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.javaee.MessageDestinationRefType target = null;
            target = (com.sun.java.xml.ns.javaee.MessageDestinationRefType)get_store().find_element_user(MESSAGEDESTINATIONREF$48, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "message-destination-ref" element
     */
    public int sizeOfMessageDestinationRefArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(MESSAGEDESTINATIONREF$48);
        }
    }
    
    /**
     * Sets array of all "message-destination-ref" element
     */
    public void setMessageDestinationRefArray(com.sun.java.xml.ns.javaee.MessageDestinationRefType[] messageDestinationRefArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(messageDestinationRefArray, MESSAGEDESTINATIONREF$48);
        }
    }
    
    /**
     * Sets ith "message-destination-ref" element
     */
    public void setMessageDestinationRefArray(int i, com.sun.java.xml.ns.javaee.MessageDestinationRefType messageDestinationRef)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.javaee.MessageDestinationRefType target = null;
            target = (com.sun.java.xml.ns.javaee.MessageDestinationRefType)get_store().find_element_user(MESSAGEDESTINATIONREF$48, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(messageDestinationRef);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "message-destination-ref" element
     */
    public com.sun.java.xml.ns.javaee.MessageDestinationRefType insertNewMessageDestinationRef(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.javaee.MessageDestinationRefType target = null;
            target = (com.sun.java.xml.ns.javaee.MessageDestinationRefType)get_store().insert_element_user(MESSAGEDESTINATIONREF$48, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "message-destination-ref" element
     */
    public com.sun.java.xml.ns.javaee.MessageDestinationRefType addNewMessageDestinationRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.javaee.MessageDestinationRefType target = null;
            target = (com.sun.java.xml.ns.javaee.MessageDestinationRefType)get_store().add_element_user(MESSAGEDESTINATIONREF$48);
            return target;
        }
    }
    
    /**
     * Removes the ith "message-destination-ref" element
     */
    public void removeMessageDestinationRef(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(MESSAGEDESTINATIONREF$48, i);
        }
    }
    
    /**
     * Gets a List of "persistence-context-ref" elements
     */
    public java.util.List<com.sun.java.xml.ns.javaee.PersistenceContextRefType> getPersistenceContextRefList()
    {
        final class PersistenceContextRefList extends java.util.AbstractList<com.sun.java.xml.ns.javaee.PersistenceContextRefType>
        {
            public com.sun.java.xml.ns.javaee.PersistenceContextRefType get(int i)
                { return WebAppTypeImpl.this.getPersistenceContextRefArray(i); }
            
            public com.sun.java.xml.ns.javaee.PersistenceContextRefType set(int i, com.sun.java.xml.ns.javaee.PersistenceContextRefType o)
            {
                com.sun.java.xml.ns.javaee.PersistenceContextRefType old = WebAppTypeImpl.this.getPersistenceContextRefArray(i);
                WebAppTypeImpl.this.setPersistenceContextRefArray(i, o);
                return old;
            }
            
            public void add(int i, com.sun.java.xml.ns.javaee.PersistenceContextRefType o)
                { WebAppTypeImpl.this.insertNewPersistenceContextRef(i).set(o); }
            
            public com.sun.java.xml.ns.javaee.PersistenceContextRefType remove(int i)
            {
                com.sun.java.xml.ns.javaee.PersistenceContextRefType old = WebAppTypeImpl.this.getPersistenceContextRefArray(i);
                WebAppTypeImpl.this.removePersistenceContextRef(i);
                return old;
            }
            
            public int size()
                { return WebAppTypeImpl.this.sizeOfPersistenceContextRefArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new PersistenceContextRefList();
        }
    }
    
    /**
     * Gets array of all "persistence-context-ref" elements
     * @deprecated
     */
    public com.sun.java.xml.ns.javaee.PersistenceContextRefType[] getPersistenceContextRefArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List<com.sun.java.xml.ns.javaee.PersistenceContextRefType> targetList = new java.util.ArrayList<com.sun.java.xml.ns.javaee.PersistenceContextRefType>();
            get_store().find_all_element_users(PERSISTENCECONTEXTREF$50, targetList);
            com.sun.java.xml.ns.javaee.PersistenceContextRefType[] result = new com.sun.java.xml.ns.javaee.PersistenceContextRefType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "persistence-context-ref" element
     */
    public com.sun.java.xml.ns.javaee.PersistenceContextRefType getPersistenceContextRefArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.javaee.PersistenceContextRefType target = null;
            target = (com.sun.java.xml.ns.javaee.PersistenceContextRefType)get_store().find_element_user(PERSISTENCECONTEXTREF$50, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "persistence-context-ref" element
     */
    public int sizeOfPersistenceContextRefArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PERSISTENCECONTEXTREF$50);
        }
    }
    
    /**
     * Sets array of all "persistence-context-ref" element
     */
    public void setPersistenceContextRefArray(com.sun.java.xml.ns.javaee.PersistenceContextRefType[] persistenceContextRefArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(persistenceContextRefArray, PERSISTENCECONTEXTREF$50);
        }
    }
    
    /**
     * Sets ith "persistence-context-ref" element
     */
    public void setPersistenceContextRefArray(int i, com.sun.java.xml.ns.javaee.PersistenceContextRefType persistenceContextRef)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.javaee.PersistenceContextRefType target = null;
            target = (com.sun.java.xml.ns.javaee.PersistenceContextRefType)get_store().find_element_user(PERSISTENCECONTEXTREF$50, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(persistenceContextRef);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "persistence-context-ref" element
     */
    public com.sun.java.xml.ns.javaee.PersistenceContextRefType insertNewPersistenceContextRef(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.javaee.PersistenceContextRefType target = null;
            target = (com.sun.java.xml.ns.javaee.PersistenceContextRefType)get_store().insert_element_user(PERSISTENCECONTEXTREF$50, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "persistence-context-ref" element
     */
    public com.sun.java.xml.ns.javaee.PersistenceContextRefType addNewPersistenceContextRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.javaee.PersistenceContextRefType target = null;
            target = (com.sun.java.xml.ns.javaee.PersistenceContextRefType)get_store().add_element_user(PERSISTENCECONTEXTREF$50);
            return target;
        }
    }
    
    /**
     * Removes the ith "persistence-context-ref" element
     */
    public void removePersistenceContextRef(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PERSISTENCECONTEXTREF$50, i);
        }
    }
    
    /**
     * Gets a List of "persistence-unit-ref" elements
     */
    public java.util.List<com.sun.java.xml.ns.javaee.PersistenceUnitRefType> getPersistenceUnitRefList()
    {
        final class PersistenceUnitRefList extends java.util.AbstractList<com.sun.java.xml.ns.javaee.PersistenceUnitRefType>
        {
            public com.sun.java.xml.ns.javaee.PersistenceUnitRefType get(int i)
                { return WebAppTypeImpl.this.getPersistenceUnitRefArray(i); }
            
            public com.sun.java.xml.ns.javaee.PersistenceUnitRefType set(int i, com.sun.java.xml.ns.javaee.PersistenceUnitRefType o)
            {
                com.sun.java.xml.ns.javaee.PersistenceUnitRefType old = WebAppTypeImpl.this.getPersistenceUnitRefArray(i);
                WebAppTypeImpl.this.setPersistenceUnitRefArray(i, o);
                return old;
            }
            
            public void add(int i, com.sun.java.xml.ns.javaee.PersistenceUnitRefType o)
                { WebAppTypeImpl.this.insertNewPersistenceUnitRef(i).set(o); }
            
            public com.sun.java.xml.ns.javaee.PersistenceUnitRefType remove(int i)
            {
                com.sun.java.xml.ns.javaee.PersistenceUnitRefType old = WebAppTypeImpl.this.getPersistenceUnitRefArray(i);
                WebAppTypeImpl.this.removePersistenceUnitRef(i);
                return old;
            }
            
            public int size()
                { return WebAppTypeImpl.this.sizeOfPersistenceUnitRefArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new PersistenceUnitRefList();
        }
    }
    
    /**
     * Gets array of all "persistence-unit-ref" elements
     * @deprecated
     */
    public com.sun.java.xml.ns.javaee.PersistenceUnitRefType[] getPersistenceUnitRefArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List<com.sun.java.xml.ns.javaee.PersistenceUnitRefType> targetList = new java.util.ArrayList<com.sun.java.xml.ns.javaee.PersistenceUnitRefType>();
            get_store().find_all_element_users(PERSISTENCEUNITREF$52, targetList);
            com.sun.java.xml.ns.javaee.PersistenceUnitRefType[] result = new com.sun.java.xml.ns.javaee.PersistenceUnitRefType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "persistence-unit-ref" element
     */
    public com.sun.java.xml.ns.javaee.PersistenceUnitRefType getPersistenceUnitRefArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.javaee.PersistenceUnitRefType target = null;
            target = (com.sun.java.xml.ns.javaee.PersistenceUnitRefType)get_store().find_element_user(PERSISTENCEUNITREF$52, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "persistence-unit-ref" element
     */
    public int sizeOfPersistenceUnitRefArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PERSISTENCEUNITREF$52);
        }
    }
    
    /**
     * Sets array of all "persistence-unit-ref" element
     */
    public void setPersistenceUnitRefArray(com.sun.java.xml.ns.javaee.PersistenceUnitRefType[] persistenceUnitRefArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(persistenceUnitRefArray, PERSISTENCEUNITREF$52);
        }
    }
    
    /**
     * Sets ith "persistence-unit-ref" element
     */
    public void setPersistenceUnitRefArray(int i, com.sun.java.xml.ns.javaee.PersistenceUnitRefType persistenceUnitRef)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.javaee.PersistenceUnitRefType target = null;
            target = (com.sun.java.xml.ns.javaee.PersistenceUnitRefType)get_store().find_element_user(PERSISTENCEUNITREF$52, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(persistenceUnitRef);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "persistence-unit-ref" element
     */
    public com.sun.java.xml.ns.javaee.PersistenceUnitRefType insertNewPersistenceUnitRef(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.javaee.PersistenceUnitRefType target = null;
            target = (com.sun.java.xml.ns.javaee.PersistenceUnitRefType)get_store().insert_element_user(PERSISTENCEUNITREF$52, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "persistence-unit-ref" element
     */
    public com.sun.java.xml.ns.javaee.PersistenceUnitRefType addNewPersistenceUnitRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.javaee.PersistenceUnitRefType target = null;
            target = (com.sun.java.xml.ns.javaee.PersistenceUnitRefType)get_store().add_element_user(PERSISTENCEUNITREF$52);
            return target;
        }
    }
    
    /**
     * Removes the ith "persistence-unit-ref" element
     */
    public void removePersistenceUnitRef(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PERSISTENCEUNITREF$52, i);
        }
    }
    
    /**
     * Gets a List of "post-construct" elements
     */
    public java.util.List<com.sun.java.xml.ns.javaee.LifecycleCallbackType> getPostConstructList()
    {
        final class PostConstructList extends java.util.AbstractList<com.sun.java.xml.ns.javaee.LifecycleCallbackType>
        {
            public com.sun.java.xml.ns.javaee.LifecycleCallbackType get(int i)
                { return WebAppTypeImpl.this.getPostConstructArray(i); }
            
            public com.sun.java.xml.ns.javaee.LifecycleCallbackType set(int i, com.sun.java.xml.ns.javaee.LifecycleCallbackType o)
            {
                com.sun.java.xml.ns.javaee.LifecycleCallbackType old = WebAppTypeImpl.this.getPostConstructArray(i);
                WebAppTypeImpl.this.setPostConstructArray(i, o);
                return old;
            }
            
            public void add(int i, com.sun.java.xml.ns.javaee.LifecycleCallbackType o)
                { WebAppTypeImpl.this.insertNewPostConstruct(i).set(o); }
            
            public com.sun.java.xml.ns.javaee.LifecycleCallbackType remove(int i)
            {
                com.sun.java.xml.ns.javaee.LifecycleCallbackType old = WebAppTypeImpl.this.getPostConstructArray(i);
                WebAppTypeImpl.this.removePostConstruct(i);
                return old;
            }
            
            public int size()
                { return WebAppTypeImpl.this.sizeOfPostConstructArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new PostConstructList();
        }
    }
    
    /**
     * Gets array of all "post-construct" elements
     * @deprecated
     */
    public com.sun.java.xml.ns.javaee.LifecycleCallbackType[] getPostConstructArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List<com.sun.java.xml.ns.javaee.LifecycleCallbackType> targetList = new java.util.ArrayList<com.sun.java.xml.ns.javaee.LifecycleCallbackType>();
            get_store().find_all_element_users(POSTCONSTRUCT$54, targetList);
            com.sun.java.xml.ns.javaee.LifecycleCallbackType[] result = new com.sun.java.xml.ns.javaee.LifecycleCallbackType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "post-construct" element
     */
    public com.sun.java.xml.ns.javaee.LifecycleCallbackType getPostConstructArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.javaee.LifecycleCallbackType target = null;
            target = (com.sun.java.xml.ns.javaee.LifecycleCallbackType)get_store().find_element_user(POSTCONSTRUCT$54, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "post-construct" element
     */
    public int sizeOfPostConstructArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(POSTCONSTRUCT$54);
        }
    }
    
    /**
     * Sets array of all "post-construct" element
     */
    public void setPostConstructArray(com.sun.java.xml.ns.javaee.LifecycleCallbackType[] postConstructArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(postConstructArray, POSTCONSTRUCT$54);
        }
    }
    
    /**
     * Sets ith "post-construct" element
     */
    public void setPostConstructArray(int i, com.sun.java.xml.ns.javaee.LifecycleCallbackType postConstruct)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.javaee.LifecycleCallbackType target = null;
            target = (com.sun.java.xml.ns.javaee.LifecycleCallbackType)get_store().find_element_user(POSTCONSTRUCT$54, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(postConstruct);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "post-construct" element
     */
    public com.sun.java.xml.ns.javaee.LifecycleCallbackType insertNewPostConstruct(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.javaee.LifecycleCallbackType target = null;
            target = (com.sun.java.xml.ns.javaee.LifecycleCallbackType)get_store().insert_element_user(POSTCONSTRUCT$54, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "post-construct" element
     */
    public com.sun.java.xml.ns.javaee.LifecycleCallbackType addNewPostConstruct()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.javaee.LifecycleCallbackType target = null;
            target = (com.sun.java.xml.ns.javaee.LifecycleCallbackType)get_store().add_element_user(POSTCONSTRUCT$54);
            return target;
        }
    }
    
    /**
     * Removes the ith "post-construct" element
     */
    public void removePostConstruct(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(POSTCONSTRUCT$54, i);
        }
    }
    
    /**
     * Gets a List of "pre-destroy" elements
     */
    public java.util.List<com.sun.java.xml.ns.javaee.LifecycleCallbackType> getPreDestroyList()
    {
        final class PreDestroyList extends java.util.AbstractList<com.sun.java.xml.ns.javaee.LifecycleCallbackType>
        {
            public com.sun.java.xml.ns.javaee.LifecycleCallbackType get(int i)
                { return WebAppTypeImpl.this.getPreDestroyArray(i); }
            
            public com.sun.java.xml.ns.javaee.LifecycleCallbackType set(int i, com.sun.java.xml.ns.javaee.LifecycleCallbackType o)
            {
                com.sun.java.xml.ns.javaee.LifecycleCallbackType old = WebAppTypeImpl.this.getPreDestroyArray(i);
                WebAppTypeImpl.this.setPreDestroyArray(i, o);
                return old;
            }
            
            public void add(int i, com.sun.java.xml.ns.javaee.LifecycleCallbackType o)
                { WebAppTypeImpl.this.insertNewPreDestroy(i).set(o); }
            
            public com.sun.java.xml.ns.javaee.LifecycleCallbackType remove(int i)
            {
                com.sun.java.xml.ns.javaee.LifecycleCallbackType old = WebAppTypeImpl.this.getPreDestroyArray(i);
                WebAppTypeImpl.this.removePreDestroy(i);
                return old;
            }
            
            public int size()
                { return WebAppTypeImpl.this.sizeOfPreDestroyArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new PreDestroyList();
        }
    }
    
    /**
     * Gets array of all "pre-destroy" elements
     * @deprecated
     */
    public com.sun.java.xml.ns.javaee.LifecycleCallbackType[] getPreDestroyArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List<com.sun.java.xml.ns.javaee.LifecycleCallbackType> targetList = new java.util.ArrayList<com.sun.java.xml.ns.javaee.LifecycleCallbackType>();
            get_store().find_all_element_users(PREDESTROY$56, targetList);
            com.sun.java.xml.ns.javaee.LifecycleCallbackType[] result = new com.sun.java.xml.ns.javaee.LifecycleCallbackType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "pre-destroy" element
     */
    public com.sun.java.xml.ns.javaee.LifecycleCallbackType getPreDestroyArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.javaee.LifecycleCallbackType target = null;
            target = (com.sun.java.xml.ns.javaee.LifecycleCallbackType)get_store().find_element_user(PREDESTROY$56, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "pre-destroy" element
     */
    public int sizeOfPreDestroyArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PREDESTROY$56);
        }
    }
    
    /**
     * Sets array of all "pre-destroy" element
     */
    public void setPreDestroyArray(com.sun.java.xml.ns.javaee.LifecycleCallbackType[] preDestroyArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(preDestroyArray, PREDESTROY$56);
        }
    }
    
    /**
     * Sets ith "pre-destroy" element
     */
    public void setPreDestroyArray(int i, com.sun.java.xml.ns.javaee.LifecycleCallbackType preDestroy)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.javaee.LifecycleCallbackType target = null;
            target = (com.sun.java.xml.ns.javaee.LifecycleCallbackType)get_store().find_element_user(PREDESTROY$56, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(preDestroy);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "pre-destroy" element
     */
    public com.sun.java.xml.ns.javaee.LifecycleCallbackType insertNewPreDestroy(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.javaee.LifecycleCallbackType target = null;
            target = (com.sun.java.xml.ns.javaee.LifecycleCallbackType)get_store().insert_element_user(PREDESTROY$56, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "pre-destroy" element
     */
    public com.sun.java.xml.ns.javaee.LifecycleCallbackType addNewPreDestroy()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.javaee.LifecycleCallbackType target = null;
            target = (com.sun.java.xml.ns.javaee.LifecycleCallbackType)get_store().add_element_user(PREDESTROY$56);
            return target;
        }
    }
    
    /**
     * Removes the ith "pre-destroy" element
     */
    public void removePreDestroy(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PREDESTROY$56, i);
        }
    }
    
    /**
     * Gets a List of "message-destination" elements
     */
    public java.util.List<com.sun.java.xml.ns.javaee.MessageDestinationType> getMessageDestinationList()
    {
        final class MessageDestinationList extends java.util.AbstractList<com.sun.java.xml.ns.javaee.MessageDestinationType>
        {
            public com.sun.java.xml.ns.javaee.MessageDestinationType get(int i)
                { return WebAppTypeImpl.this.getMessageDestinationArray(i); }
            
            public com.sun.java.xml.ns.javaee.MessageDestinationType set(int i, com.sun.java.xml.ns.javaee.MessageDestinationType o)
            {
                com.sun.java.xml.ns.javaee.MessageDestinationType old = WebAppTypeImpl.this.getMessageDestinationArray(i);
                WebAppTypeImpl.this.setMessageDestinationArray(i, o);
                return old;
            }
            
            public void add(int i, com.sun.java.xml.ns.javaee.MessageDestinationType o)
                { WebAppTypeImpl.this.insertNewMessageDestination(i).set(o); }
            
            public com.sun.java.xml.ns.javaee.MessageDestinationType remove(int i)
            {
                com.sun.java.xml.ns.javaee.MessageDestinationType old = WebAppTypeImpl.this.getMessageDestinationArray(i);
                WebAppTypeImpl.this.removeMessageDestination(i);
                return old;
            }
            
            public int size()
                { return WebAppTypeImpl.this.sizeOfMessageDestinationArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new MessageDestinationList();
        }
    }
    
    /**
     * Gets array of all "message-destination" elements
     * @deprecated
     */
    public com.sun.java.xml.ns.javaee.MessageDestinationType[] getMessageDestinationArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List<com.sun.java.xml.ns.javaee.MessageDestinationType> targetList = new java.util.ArrayList<com.sun.java.xml.ns.javaee.MessageDestinationType>();
            get_store().find_all_element_users(MESSAGEDESTINATION$58, targetList);
            com.sun.java.xml.ns.javaee.MessageDestinationType[] result = new com.sun.java.xml.ns.javaee.MessageDestinationType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "message-destination" element
     */
    public com.sun.java.xml.ns.javaee.MessageDestinationType getMessageDestinationArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.javaee.MessageDestinationType target = null;
            target = (com.sun.java.xml.ns.javaee.MessageDestinationType)get_store().find_element_user(MESSAGEDESTINATION$58, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "message-destination" element
     */
    public int sizeOfMessageDestinationArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(MESSAGEDESTINATION$58);
        }
    }
    
    /**
     * Sets array of all "message-destination" element
     */
    public void setMessageDestinationArray(com.sun.java.xml.ns.javaee.MessageDestinationType[] messageDestinationArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(messageDestinationArray, MESSAGEDESTINATION$58);
        }
    }
    
    /**
     * Sets ith "message-destination" element
     */
    public void setMessageDestinationArray(int i, com.sun.java.xml.ns.javaee.MessageDestinationType messageDestination)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.javaee.MessageDestinationType target = null;
            target = (com.sun.java.xml.ns.javaee.MessageDestinationType)get_store().find_element_user(MESSAGEDESTINATION$58, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(messageDestination);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "message-destination" element
     */
    public com.sun.java.xml.ns.javaee.MessageDestinationType insertNewMessageDestination(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.javaee.MessageDestinationType target = null;
            target = (com.sun.java.xml.ns.javaee.MessageDestinationType)get_store().insert_element_user(MESSAGEDESTINATION$58, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "message-destination" element
     */
    public com.sun.java.xml.ns.javaee.MessageDestinationType addNewMessageDestination()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.javaee.MessageDestinationType target = null;
            target = (com.sun.java.xml.ns.javaee.MessageDestinationType)get_store().add_element_user(MESSAGEDESTINATION$58);
            return target;
        }
    }
    
    /**
     * Removes the ith "message-destination" element
     */
    public void removeMessageDestination(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(MESSAGEDESTINATION$58, i);
        }
    }
    
    /**
     * Gets a List of "locale-encoding-mapping-list" elements
     */
    public java.util.List<com.sun.java.xml.ns.javaee.LocaleEncodingMappingListType> getLocaleEncodingMappingListList()
    {
        final class LocaleEncodingMappingListList extends java.util.AbstractList<com.sun.java.xml.ns.javaee.LocaleEncodingMappingListType>
        {
            public com.sun.java.xml.ns.javaee.LocaleEncodingMappingListType get(int i)
                { return WebAppTypeImpl.this.getLocaleEncodingMappingListArray(i); }
            
            public com.sun.java.xml.ns.javaee.LocaleEncodingMappingListType set(int i, com.sun.java.xml.ns.javaee.LocaleEncodingMappingListType o)
            {
                com.sun.java.xml.ns.javaee.LocaleEncodingMappingListType old = WebAppTypeImpl.this.getLocaleEncodingMappingListArray(i);
                WebAppTypeImpl.this.setLocaleEncodingMappingListArray(i, o);
                return old;
            }
            
            public void add(int i, com.sun.java.xml.ns.javaee.LocaleEncodingMappingListType o)
                { WebAppTypeImpl.this.insertNewLocaleEncodingMappingList(i).set(o); }
            
            public com.sun.java.xml.ns.javaee.LocaleEncodingMappingListType remove(int i)
            {
                com.sun.java.xml.ns.javaee.LocaleEncodingMappingListType old = WebAppTypeImpl.this.getLocaleEncodingMappingListArray(i);
                WebAppTypeImpl.this.removeLocaleEncodingMappingList(i);
                return old;
            }
            
            public int size()
                { return WebAppTypeImpl.this.sizeOfLocaleEncodingMappingListArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new LocaleEncodingMappingListList();
        }
    }
    
    /**
     * Gets array of all "locale-encoding-mapping-list" elements
     * @deprecated
     */
    public com.sun.java.xml.ns.javaee.LocaleEncodingMappingListType[] getLocaleEncodingMappingListArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List<com.sun.java.xml.ns.javaee.LocaleEncodingMappingListType> targetList = new java.util.ArrayList<com.sun.java.xml.ns.javaee.LocaleEncodingMappingListType>();
            get_store().find_all_element_users(LOCALEENCODINGMAPPINGLIST$60, targetList);
            com.sun.java.xml.ns.javaee.LocaleEncodingMappingListType[] result = new com.sun.java.xml.ns.javaee.LocaleEncodingMappingListType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "locale-encoding-mapping-list" element
     */
    public com.sun.java.xml.ns.javaee.LocaleEncodingMappingListType getLocaleEncodingMappingListArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.javaee.LocaleEncodingMappingListType target = null;
            target = (com.sun.java.xml.ns.javaee.LocaleEncodingMappingListType)get_store().find_element_user(LOCALEENCODINGMAPPINGLIST$60, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "locale-encoding-mapping-list" element
     */
    public int sizeOfLocaleEncodingMappingListArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(LOCALEENCODINGMAPPINGLIST$60);
        }
    }
    
    /**
     * Sets array of all "locale-encoding-mapping-list" element
     */
    public void setLocaleEncodingMappingListArray(com.sun.java.xml.ns.javaee.LocaleEncodingMappingListType[] localeEncodingMappingListArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(localeEncodingMappingListArray, LOCALEENCODINGMAPPINGLIST$60);
        }
    }
    
    /**
     * Sets ith "locale-encoding-mapping-list" element
     */
    public void setLocaleEncodingMappingListArray(int i, com.sun.java.xml.ns.javaee.LocaleEncodingMappingListType localeEncodingMappingList)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.javaee.LocaleEncodingMappingListType target = null;
            target = (com.sun.java.xml.ns.javaee.LocaleEncodingMappingListType)get_store().find_element_user(LOCALEENCODINGMAPPINGLIST$60, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(localeEncodingMappingList);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "locale-encoding-mapping-list" element
     */
    public com.sun.java.xml.ns.javaee.LocaleEncodingMappingListType insertNewLocaleEncodingMappingList(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.javaee.LocaleEncodingMappingListType target = null;
            target = (com.sun.java.xml.ns.javaee.LocaleEncodingMappingListType)get_store().insert_element_user(LOCALEENCODINGMAPPINGLIST$60, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "locale-encoding-mapping-list" element
     */
    public com.sun.java.xml.ns.javaee.LocaleEncodingMappingListType addNewLocaleEncodingMappingList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.javaee.LocaleEncodingMappingListType target = null;
            target = (com.sun.java.xml.ns.javaee.LocaleEncodingMappingListType)get_store().add_element_user(LOCALEENCODINGMAPPINGLIST$60);
            return target;
        }
    }
    
    /**
     * Removes the ith "locale-encoding-mapping-list" element
     */
    public void removeLocaleEncodingMappingList(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(LOCALEENCODINGMAPPINGLIST$60, i);
        }
    }
    
    /**
     * Gets the "version" attribute
     */
    public com.sun.java.xml.ns.javaee.WebAppVersionType.Enum getVersion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VERSION$62);
            if (target == null)
            {
                return null;
            }
            return (com.sun.java.xml.ns.javaee.WebAppVersionType.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "version" attribute
     */
    public com.sun.java.xml.ns.javaee.WebAppVersionType xgetVersion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.javaee.WebAppVersionType target = null;
            target = (com.sun.java.xml.ns.javaee.WebAppVersionType)get_store().find_attribute_user(VERSION$62);
            return target;
        }
    }
    
    /**
     * Sets the "version" attribute
     */
    public void setVersion(com.sun.java.xml.ns.javaee.WebAppVersionType.Enum version)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VERSION$62);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(VERSION$62);
            }
            target.setEnumValue(version);
        }
    }
    
    /**
     * Sets (as xml) the "version" attribute
     */
    public void xsetVersion(com.sun.java.xml.ns.javaee.WebAppVersionType version)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sun.java.xml.ns.javaee.WebAppVersionType target = null;
            target = (com.sun.java.xml.ns.javaee.WebAppVersionType)get_store().find_attribute_user(VERSION$62);
            if (target == null)
            {
                target = (com.sun.java.xml.ns.javaee.WebAppVersionType)get_store().add_attribute_user(VERSION$62);
            }
            target.set(version);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ID$64);
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
            target = (org.apache.xmlbeans.XmlID)get_store().find_attribute_user(ID$64);
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
            return get_store().find_attribute_user(ID$64) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ID$64);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ID$64);
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
            target = (org.apache.xmlbeans.XmlID)get_store().find_attribute_user(ID$64);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlID)get_store().add_attribute_user(ID$64);
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
            get_store().remove_attribute(ID$64);
        }
    }
    
    /**
     * Gets the "metadata-complete" attribute
     */
    public boolean getMetadataComplete()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(METADATACOMPLETE$66);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "metadata-complete" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetMetadataComplete()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(METADATACOMPLETE$66);
            return target;
        }
    }
    
    /**
     * True if has "metadata-complete" attribute
     */
    public boolean isSetMetadataComplete()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(METADATACOMPLETE$66) != null;
        }
    }
    
    /**
     * Sets the "metadata-complete" attribute
     */
    public void setMetadataComplete(boolean metadataComplete)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(METADATACOMPLETE$66);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(METADATACOMPLETE$66);
            }
            target.setBooleanValue(metadataComplete);
        }
    }
    
    /**
     * Sets (as xml) the "metadata-complete" attribute
     */
    public void xsetMetadataComplete(org.apache.xmlbeans.XmlBoolean metadataComplete)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(METADATACOMPLETE$66);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(METADATACOMPLETE$66);
            }
            target.set(metadataComplete);
        }
    }
    
    /**
     * Unsets the "metadata-complete" attribute
     */
    public void unsetMetadataComplete()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(METADATACOMPLETE$66);
        }
    }
}
