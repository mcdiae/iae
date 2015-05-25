/*
 * XML Type:  welcome-file-listType
 * Namespace: http://java.sun.com/xml/ns/javaee
 * Java type: com.sun.java.xml.ns.javaee.WelcomeFileListType
 *
 * Automatically generated - do not modify.
 */
package com.sun.java.xml.ns.javaee.impl;
/**
 * An XML welcome-file-listType(@http://java.sun.com/xml/ns/javaee).
 *
 * This is a complex type.
 */
public class WelcomeFileListTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.sun.java.xml.ns.javaee.WelcomeFileListType
{
    private static final long serialVersionUID = 1L;
    
    public WelcomeFileListTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName WELCOMEFILE$0 = 
        new javax.xml.namespace.QName("http://java.sun.com/xml/ns/javaee", "welcome-file");
    private static final javax.xml.namespace.QName ID$2 = 
        new javax.xml.namespace.QName("", "id");
    
    
    /**
     * Gets a List of "welcome-file" elements
     */
    public java.util.List<java.lang.String> getWelcomeFileList()
    {
        final class WelcomeFileList extends java.util.AbstractList<java.lang.String>
        {
            public java.lang.String get(int i)
                { return WelcomeFileListTypeImpl.this.getWelcomeFileArray(i); }
            
            public java.lang.String set(int i, java.lang.String o)
            {
                java.lang.String old = WelcomeFileListTypeImpl.this.getWelcomeFileArray(i);
                WelcomeFileListTypeImpl.this.setWelcomeFileArray(i, o);
                return old;
            }
            
            public void add(int i, java.lang.String o)
                { WelcomeFileListTypeImpl.this.insertWelcomeFile(i, o); }
            
            public java.lang.String remove(int i)
            {
                java.lang.String old = WelcomeFileListTypeImpl.this.getWelcomeFileArray(i);
                WelcomeFileListTypeImpl.this.removeWelcomeFile(i);
                return old;
            }
            
            public int size()
                { return WelcomeFileListTypeImpl.this.sizeOfWelcomeFileArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new WelcomeFileList();
        }
    }
    
    /**
     * Gets array of all "welcome-file" elements
     * @deprecated
     */
    public java.lang.String[] getWelcomeFileArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List<org.apache.xmlbeans.XmlString> targetList = new java.util.ArrayList<org.apache.xmlbeans.XmlString>();
            get_store().find_all_element_users(WELCOMEFILE$0, targetList);
            java.lang.String[] result = new java.lang.String[targetList.size()];
            for (int i = 0, len = targetList.size() ; i < len ; i++)
                result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getStringValue();
            return result;
        }
    }
    
    /**
     * Gets ith "welcome-file" element
     */
    public java.lang.String getWelcomeFileArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(WELCOMEFILE$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) a List of "welcome-file" elements
     */
    public java.util.List<org.apache.xmlbeans.XmlString> xgetWelcomeFileList()
    {
        final class WelcomeFileList extends java.util.AbstractList<org.apache.xmlbeans.XmlString>
        {
            public org.apache.xmlbeans.XmlString get(int i)
                { return WelcomeFileListTypeImpl.this.xgetWelcomeFileArray(i); }
            
            public org.apache.xmlbeans.XmlString set(int i, org.apache.xmlbeans.XmlString o)
            {
                org.apache.xmlbeans.XmlString old = WelcomeFileListTypeImpl.this.xgetWelcomeFileArray(i);
                WelcomeFileListTypeImpl.this.xsetWelcomeFileArray(i, o);
                return old;
            }
            
            public void add(int i, org.apache.xmlbeans.XmlString o)
                { WelcomeFileListTypeImpl.this.insertNewWelcomeFile(i).set(o); }
            
            public org.apache.xmlbeans.XmlString remove(int i)
            {
                org.apache.xmlbeans.XmlString old = WelcomeFileListTypeImpl.this.xgetWelcomeFileArray(i);
                WelcomeFileListTypeImpl.this.removeWelcomeFile(i);
                return old;
            }
            
            public int size()
                { return WelcomeFileListTypeImpl.this.sizeOfWelcomeFileArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new WelcomeFileList();
        }
    }
    
    /**
     * Gets array of all "welcome-file" elements
     * @deprecated
     */
    public org.apache.xmlbeans.XmlString[] xgetWelcomeFileArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List<org.apache.xmlbeans.XmlString> targetList = new java.util.ArrayList<org.apache.xmlbeans.XmlString>();
            get_store().find_all_element_users(WELCOMEFILE$0, targetList);
            org.apache.xmlbeans.XmlString[] result = new org.apache.xmlbeans.XmlString[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets (as xml) ith "welcome-file" element
     */
    public org.apache.xmlbeans.XmlString xgetWelcomeFileArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(WELCOMEFILE$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return (org.apache.xmlbeans.XmlString)target;
        }
    }
    
    /**
     * Returns number of "welcome-file" element
     */
    public int sizeOfWelcomeFileArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(WELCOMEFILE$0);
        }
    }
    
    /**
     * Sets array of all "welcome-file" element
     */
    public void setWelcomeFileArray(java.lang.String[] welcomeFileArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(welcomeFileArray, WELCOMEFILE$0);
        }
    }
    
    /**
     * Sets ith "welcome-file" element
     */
    public void setWelcomeFileArray(int i, java.lang.String welcomeFile)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(WELCOMEFILE$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setStringValue(welcomeFile);
        }
    }
    
    /**
     * Sets (as xml) array of all "welcome-file" element
     */
    public void xsetWelcomeFileArray(org.apache.xmlbeans.XmlString[]welcomeFileArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(welcomeFileArray, WELCOMEFILE$0);
        }
    }
    
    /**
     * Sets (as xml) ith "welcome-file" element
     */
    public void xsetWelcomeFileArray(int i, org.apache.xmlbeans.XmlString welcomeFile)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(WELCOMEFILE$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(welcomeFile);
        }
    }
    
    /**
     * Inserts the value as the ith "welcome-file" element
     */
    public void insertWelcomeFile(int i, java.lang.String welcomeFile)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = 
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(WELCOMEFILE$0, i);
            target.setStringValue(welcomeFile);
        }
    }
    
    /**
     * Appends the value as the last "welcome-file" element
     */
    public void addWelcomeFile(java.lang.String welcomeFile)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(WELCOMEFILE$0);
            target.setStringValue(welcomeFile);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "welcome-file" element
     */
    public org.apache.xmlbeans.XmlString insertNewWelcomeFile(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().insert_element_user(WELCOMEFILE$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "welcome-file" element
     */
    public org.apache.xmlbeans.XmlString addNewWelcomeFile()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(WELCOMEFILE$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "welcome-file" element
     */
    public void removeWelcomeFile(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(WELCOMEFILE$0, i);
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
