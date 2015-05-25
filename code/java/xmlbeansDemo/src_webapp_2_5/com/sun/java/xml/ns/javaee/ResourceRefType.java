/*
 * XML Type:  resource-refType
 * Namespace: http://java.sun.com/xml/ns/javaee
 * Java type: com.sun.java.xml.ns.javaee.ResourceRefType
 *
 * Automatically generated - do not modify.
 */
package com.sun.java.xml.ns.javaee;


/**
 * An XML resource-refType(@http://java.sun.com/xml/ns/javaee).
 *
 * This is a complex type.
 */
public interface ResourceRefType extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ResourceRefType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s429215E09F9EF360BEEFD852C264F65B").resolveHandle("resourcereftypefd81type");
    
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
     * Gets the "res-ref-name" element
     */
    com.sun.java.xml.ns.javaee.JndiNameType getResRefName();
    
    /**
     * Sets the "res-ref-name" element
     */
    void setResRefName(com.sun.java.xml.ns.javaee.JndiNameType resRefName);
    
    /**
     * Appends and returns a new empty "res-ref-name" element
     */
    com.sun.java.xml.ns.javaee.JndiNameType addNewResRefName();
    
    /**
     * Gets the "res-type" element
     */
    com.sun.java.xml.ns.javaee.FullyQualifiedClassType getResType();
    
    /**
     * True if has "res-type" element
     */
    boolean isSetResType();
    
    /**
     * Sets the "res-type" element
     */
    void setResType(com.sun.java.xml.ns.javaee.FullyQualifiedClassType resType);
    
    /**
     * Appends and returns a new empty "res-type" element
     */
    com.sun.java.xml.ns.javaee.FullyQualifiedClassType addNewResType();
    
    /**
     * Unsets the "res-type" element
     */
    void unsetResType();
    
    /**
     * Gets the "res-auth" element
     */
    com.sun.java.xml.ns.javaee.ResAuthType getResAuth();
    
    /**
     * True if has "res-auth" element
     */
    boolean isSetResAuth();
    
    /**
     * Sets the "res-auth" element
     */
    void setResAuth(com.sun.java.xml.ns.javaee.ResAuthType resAuth);
    
    /**
     * Appends and returns a new empty "res-auth" element
     */
    com.sun.java.xml.ns.javaee.ResAuthType addNewResAuth();
    
    /**
     * Unsets the "res-auth" element
     */
    void unsetResAuth();
    
    /**
     * Gets the "res-sharing-scope" element
     */
    com.sun.java.xml.ns.javaee.ResSharingScopeType getResSharingScope();
    
    /**
     * True if has "res-sharing-scope" element
     */
    boolean isSetResSharingScope();
    
    /**
     * Sets the "res-sharing-scope" element
     */
    void setResSharingScope(com.sun.java.xml.ns.javaee.ResSharingScopeType resSharingScope);
    
    /**
     * Appends and returns a new empty "res-sharing-scope" element
     */
    com.sun.java.xml.ns.javaee.ResSharingScopeType addNewResSharingScope();
    
    /**
     * Unsets the "res-sharing-scope" element
     */
    void unsetResSharingScope();
    
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
        public static com.sun.java.xml.ns.javaee.ResourceRefType newInstance() {
          return (com.sun.java.xml.ns.javaee.ResourceRefType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.sun.java.xml.ns.javaee.ResourceRefType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.sun.java.xml.ns.javaee.ResourceRefType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.sun.java.xml.ns.javaee.ResourceRefType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.sun.java.xml.ns.javaee.ResourceRefType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.sun.java.xml.ns.javaee.ResourceRefType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.sun.java.xml.ns.javaee.ResourceRefType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.sun.java.xml.ns.javaee.ResourceRefType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sun.java.xml.ns.javaee.ResourceRefType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.sun.java.xml.ns.javaee.ResourceRefType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sun.java.xml.ns.javaee.ResourceRefType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.sun.java.xml.ns.javaee.ResourceRefType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sun.java.xml.ns.javaee.ResourceRefType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.sun.java.xml.ns.javaee.ResourceRefType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sun.java.xml.ns.javaee.ResourceRefType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.sun.java.xml.ns.javaee.ResourceRefType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sun.java.xml.ns.javaee.ResourceRefType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.sun.java.xml.ns.javaee.ResourceRefType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sun.java.xml.ns.javaee.ResourceRefType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.sun.java.xml.ns.javaee.ResourceRefType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sun.java.xml.ns.javaee.ResourceRefType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.sun.java.xml.ns.javaee.ResourceRefType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sun.java.xml.ns.javaee.ResourceRefType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.sun.java.xml.ns.javaee.ResourceRefType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.sun.java.xml.ns.javaee.ResourceRefType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.sun.java.xml.ns.javaee.ResourceRefType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.sun.java.xml.ns.javaee.ResourceRefType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.sun.java.xml.ns.javaee.ResourceRefType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.sun.java.xml.ns.javaee.ResourceRefType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.sun.java.xml.ns.javaee.ResourceRefType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.sun.java.xml.ns.javaee.ResourceRefType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.sun.java.xml.ns.javaee.ResourceRefType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.sun.java.xml.ns.javaee.ResourceRefType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.sun.java.xml.ns.javaee.ResourceRefType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.sun.java.xml.ns.javaee.ResourceRefType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
