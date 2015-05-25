/*
 * XML Type:  persistence-context-refType
 * Namespace: http://java.sun.com/xml/ns/javaee
 * Java type: com.sun.java.xml.ns.javaee.PersistenceContextRefType
 *
 * Automatically generated - do not modify.
 */
package com.sun.java.xml.ns.javaee;


/**
 * An XML persistence-context-refType(@http://java.sun.com/xml/ns/javaee).
 *
 * This is a complex type.
 */
public interface PersistenceContextRefType extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(PersistenceContextRefType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s429215E09F9EF360BEEFD852C264F65B").resolveHandle("persistencecontextreftype8642type");
    
    /**
     * Gets a List of "description" elements
     */
    java.util.List<com.sun.java.xml.ns.javaee.DescriptionType> getDescriptionList();
    
    /**
     * Gets array of all "description" elements
     * @deprecated
     */
    com.sun.java.xml.ns.javaee.DescriptionType[] getDescriptionArray();
    
    /**
     * Gets ith "description" element
     */
    com.sun.java.xml.ns.javaee.DescriptionType getDescriptionArray(int i);
    
    /**
     * Returns number of "description" element
     */
    int sizeOfDescriptionArray();
    
    /**
     * Sets array of all "description" element
     */
    void setDescriptionArray(com.sun.java.xml.ns.javaee.DescriptionType[] descriptionArray);
    
    /**
     * Sets ith "description" element
     */
    void setDescriptionArray(int i, com.sun.java.xml.ns.javaee.DescriptionType description);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "description" element
     */
    com.sun.java.xml.ns.javaee.DescriptionType insertNewDescription(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "description" element
     */
    com.sun.java.xml.ns.javaee.DescriptionType addNewDescription();
    
    /**
     * Removes the ith "description" element
     */
    void removeDescription(int i);
    
    /**
     * Gets the "persistence-context-ref-name" element
     */
    com.sun.java.xml.ns.javaee.JndiNameType getPersistenceContextRefName();
    
    /**
     * Sets the "persistence-context-ref-name" element
     */
    void setPersistenceContextRefName(com.sun.java.xml.ns.javaee.JndiNameType persistenceContextRefName);
    
    /**
     * Appends and returns a new empty "persistence-context-ref-name" element
     */
    com.sun.java.xml.ns.javaee.JndiNameType addNewPersistenceContextRefName();
    
    /**
     * Gets the "persistence-unit-name" element
     */
    com.sun.java.xml.ns.javaee.String getPersistenceUnitName();
    
    /**
     * True if has "persistence-unit-name" element
     */
    boolean isSetPersistenceUnitName();
    
    /**
     * Sets the "persistence-unit-name" element
     */
    void setPersistenceUnitName(com.sun.java.xml.ns.javaee.String persistenceUnitName);
    
    /**
     * Appends and returns a new empty "persistence-unit-name" element
     */
    com.sun.java.xml.ns.javaee.String addNewPersistenceUnitName();
    
    /**
     * Unsets the "persistence-unit-name" element
     */
    void unsetPersistenceUnitName();
    
    /**
     * Gets the "persistence-context-type" element
     */
    com.sun.java.xml.ns.javaee.PersistenceContextTypeType getPersistenceContextType();
    
    /**
     * True if has "persistence-context-type" element
     */
    boolean isSetPersistenceContextType();
    
    /**
     * Sets the "persistence-context-type" element
     */
    void setPersistenceContextType(com.sun.java.xml.ns.javaee.PersistenceContextTypeType persistenceContextType);
    
    /**
     * Appends and returns a new empty "persistence-context-type" element
     */
    com.sun.java.xml.ns.javaee.PersistenceContextTypeType addNewPersistenceContextType();
    
    /**
     * Unsets the "persistence-context-type" element
     */
    void unsetPersistenceContextType();
    
    /**
     * Gets a List of "persistence-property" elements
     */
    java.util.List<com.sun.java.xml.ns.javaee.PropertyType> getPersistencePropertyList();
    
    /**
     * Gets array of all "persistence-property" elements
     * @deprecated
     */
    com.sun.java.xml.ns.javaee.PropertyType[] getPersistencePropertyArray();
    
    /**
     * Gets ith "persistence-property" element
     */
    com.sun.java.xml.ns.javaee.PropertyType getPersistencePropertyArray(int i);
    
    /**
     * Returns number of "persistence-property" element
     */
    int sizeOfPersistencePropertyArray();
    
    /**
     * Sets array of all "persistence-property" element
     */
    void setPersistencePropertyArray(com.sun.java.xml.ns.javaee.PropertyType[] persistencePropertyArray);
    
    /**
     * Sets ith "persistence-property" element
     */
    void setPersistencePropertyArray(int i, com.sun.java.xml.ns.javaee.PropertyType persistenceProperty);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "persistence-property" element
     */
    com.sun.java.xml.ns.javaee.PropertyType insertNewPersistenceProperty(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "persistence-property" element
     */
    com.sun.java.xml.ns.javaee.PropertyType addNewPersistenceProperty();
    
    /**
     * Removes the ith "persistence-property" element
     */
    void removePersistenceProperty(int i);
    
    /**
     * Gets the "mapped-name" element
     */
    com.sun.java.xml.ns.javaee.XsdStringType getMappedName();
    
    /**
     * True if has "mapped-name" element
     */
    boolean isSetMappedName();
    
    /**
     * Sets the "mapped-name" element
     */
    void setMappedName(com.sun.java.xml.ns.javaee.XsdStringType mappedName);
    
    /**
     * Appends and returns a new empty "mapped-name" element
     */
    com.sun.java.xml.ns.javaee.XsdStringType addNewMappedName();
    
    /**
     * Unsets the "mapped-name" element
     */
    void unsetMappedName();
    
    /**
     * Gets a List of "injection-target" elements
     */
    java.util.List<com.sun.java.xml.ns.javaee.InjectionTargetType> getInjectionTargetList();
    
    /**
     * Gets array of all "injection-target" elements
     * @deprecated
     */
    com.sun.java.xml.ns.javaee.InjectionTargetType[] getInjectionTargetArray();
    
    /**
     * Gets ith "injection-target" element
     */
    com.sun.java.xml.ns.javaee.InjectionTargetType getInjectionTargetArray(int i);
    
    /**
     * Returns number of "injection-target" element
     */
    int sizeOfInjectionTargetArray();
    
    /**
     * Sets array of all "injection-target" element
     */
    void setInjectionTargetArray(com.sun.java.xml.ns.javaee.InjectionTargetType[] injectionTargetArray);
    
    /**
     * Sets ith "injection-target" element
     */
    void setInjectionTargetArray(int i, com.sun.java.xml.ns.javaee.InjectionTargetType injectionTarget);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "injection-target" element
     */
    com.sun.java.xml.ns.javaee.InjectionTargetType insertNewInjectionTarget(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "injection-target" element
     */
    com.sun.java.xml.ns.javaee.InjectionTargetType addNewInjectionTarget();
    
    /**
     * Removes the ith "injection-target" element
     */
    void removeInjectionTarget(int i);
    
    /**
     * Gets the "id" attribute
     */
    java.lang.String getId();
    
    /**
     * Gets (as xml) the "id" attribute
     */
    org.apache.xmlbeans.XmlID xgetId();
    
    /**
     * True if has "id" attribute
     */
    boolean isSetId();
    
    /**
     * Sets the "id" attribute
     */
    void setId(java.lang.String id);
    
    /**
     * Sets (as xml) the "id" attribute
     */
    void xsetId(org.apache.xmlbeans.XmlID id);
    
    /**
     * Unsets the "id" attribute
     */
    void unsetId();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.sun.java.xml.ns.javaee.PersistenceContextRefType newInstance() {
          return (com.sun.java.xml.ns.javaee.PersistenceContextRefType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.sun.java.xml.ns.javaee.PersistenceContextRefType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.sun.java.xml.ns.javaee.PersistenceContextRefType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.sun.java.xml.ns.javaee.PersistenceContextRefType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.sun.java.xml.ns.javaee.PersistenceContextRefType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.sun.java.xml.ns.javaee.PersistenceContextRefType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.sun.java.xml.ns.javaee.PersistenceContextRefType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.sun.java.xml.ns.javaee.PersistenceContextRefType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sun.java.xml.ns.javaee.PersistenceContextRefType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.sun.java.xml.ns.javaee.PersistenceContextRefType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sun.java.xml.ns.javaee.PersistenceContextRefType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.sun.java.xml.ns.javaee.PersistenceContextRefType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sun.java.xml.ns.javaee.PersistenceContextRefType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.sun.java.xml.ns.javaee.PersistenceContextRefType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sun.java.xml.ns.javaee.PersistenceContextRefType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.sun.java.xml.ns.javaee.PersistenceContextRefType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sun.java.xml.ns.javaee.PersistenceContextRefType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.sun.java.xml.ns.javaee.PersistenceContextRefType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sun.java.xml.ns.javaee.PersistenceContextRefType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.sun.java.xml.ns.javaee.PersistenceContextRefType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sun.java.xml.ns.javaee.PersistenceContextRefType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.sun.java.xml.ns.javaee.PersistenceContextRefType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sun.java.xml.ns.javaee.PersistenceContextRefType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.sun.java.xml.ns.javaee.PersistenceContextRefType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.sun.java.xml.ns.javaee.PersistenceContextRefType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.sun.java.xml.ns.javaee.PersistenceContextRefType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.sun.java.xml.ns.javaee.PersistenceContextRefType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.sun.java.xml.ns.javaee.PersistenceContextRefType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.sun.java.xml.ns.javaee.PersistenceContextRefType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.sun.java.xml.ns.javaee.PersistenceContextRefType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.sun.java.xml.ns.javaee.PersistenceContextRefType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.sun.java.xml.ns.javaee.PersistenceContextRefType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.sun.java.xml.ns.javaee.PersistenceContextRefType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.sun.java.xml.ns.javaee.PersistenceContextRefType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.sun.java.xml.ns.javaee.PersistenceContextRefType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
