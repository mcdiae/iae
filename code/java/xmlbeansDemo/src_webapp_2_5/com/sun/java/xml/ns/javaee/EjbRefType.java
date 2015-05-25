/*
 * XML Type:  ejb-refType
 * Namespace: http://java.sun.com/xml/ns/javaee
 * Java type: com.sun.java.xml.ns.javaee.EjbRefType
 *
 * Automatically generated - do not modify.
 */
package com.sun.java.xml.ns.javaee;


/**
 * An XML ejb-refType(@http://java.sun.com/xml/ns/javaee).
 *
 * This is a complex type.
 */
public interface EjbRefType extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(EjbRefType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s429215E09F9EF360BEEFD852C264F65B").resolveHandle("ejbreftype7d1etype");
    
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
     * Gets the "ejb-ref-name" element
     */
    com.sun.java.xml.ns.javaee.EjbRefNameType getEjbRefName();
    
    /**
     * Sets the "ejb-ref-name" element
     */
    void setEjbRefName(com.sun.java.xml.ns.javaee.EjbRefNameType ejbRefName);
    
    /**
     * Appends and returns a new empty "ejb-ref-name" element
     */
    com.sun.java.xml.ns.javaee.EjbRefNameType addNewEjbRefName();
    
    /**
     * Gets the "ejb-ref-type" element
     */
    com.sun.java.xml.ns.javaee.EjbRefTypeType getEjbRefType();
    
    /**
     * True if has "ejb-ref-type" element
     */
    boolean isSetEjbRefType();
    
    /**
     * Sets the "ejb-ref-type" element
     */
    void setEjbRefType(com.sun.java.xml.ns.javaee.EjbRefTypeType ejbRefType);
    
    /**
     * Appends and returns a new empty "ejb-ref-type" element
     */
    com.sun.java.xml.ns.javaee.EjbRefTypeType addNewEjbRefType();
    
    /**
     * Unsets the "ejb-ref-type" element
     */
    void unsetEjbRefType();
    
    /**
     * Gets the "home" element
     */
    com.sun.java.xml.ns.javaee.HomeType getHome();
    
    /**
     * True if has "home" element
     */
    boolean isSetHome();
    
    /**
     * Sets the "home" element
     */
    void setHome(com.sun.java.xml.ns.javaee.HomeType home);
    
    /**
     * Appends and returns a new empty "home" element
     */
    com.sun.java.xml.ns.javaee.HomeType addNewHome();
    
    /**
     * Unsets the "home" element
     */
    void unsetHome();
    
    /**
     * Gets the "remote" element
     */
    com.sun.java.xml.ns.javaee.RemoteType getRemote();
    
    /**
     * True if has "remote" element
     */
    boolean isSetRemote();
    
    /**
     * Sets the "remote" element
     */
    void setRemote(com.sun.java.xml.ns.javaee.RemoteType remote);
    
    /**
     * Appends and returns a new empty "remote" element
     */
    com.sun.java.xml.ns.javaee.RemoteType addNewRemote();
    
    /**
     * Unsets the "remote" element
     */
    void unsetRemote();
    
    /**
     * Gets the "ejb-link" element
     */
    com.sun.java.xml.ns.javaee.EjbLinkType getEjbLink();
    
    /**
     * True if has "ejb-link" element
     */
    boolean isSetEjbLink();
    
    /**
     * Sets the "ejb-link" element
     */
    void setEjbLink(com.sun.java.xml.ns.javaee.EjbLinkType ejbLink);
    
    /**
     * Appends and returns a new empty "ejb-link" element
     */
    com.sun.java.xml.ns.javaee.EjbLinkType addNewEjbLink();
    
    /**
     * Unsets the "ejb-link" element
     */
    void unsetEjbLink();
    
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
        public static com.sun.java.xml.ns.javaee.EjbRefType newInstance() {
          return (com.sun.java.xml.ns.javaee.EjbRefType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.sun.java.xml.ns.javaee.EjbRefType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.sun.java.xml.ns.javaee.EjbRefType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.sun.java.xml.ns.javaee.EjbRefType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.sun.java.xml.ns.javaee.EjbRefType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.sun.java.xml.ns.javaee.EjbRefType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.sun.java.xml.ns.javaee.EjbRefType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.sun.java.xml.ns.javaee.EjbRefType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sun.java.xml.ns.javaee.EjbRefType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.sun.java.xml.ns.javaee.EjbRefType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sun.java.xml.ns.javaee.EjbRefType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.sun.java.xml.ns.javaee.EjbRefType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sun.java.xml.ns.javaee.EjbRefType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.sun.java.xml.ns.javaee.EjbRefType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sun.java.xml.ns.javaee.EjbRefType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.sun.java.xml.ns.javaee.EjbRefType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sun.java.xml.ns.javaee.EjbRefType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.sun.java.xml.ns.javaee.EjbRefType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sun.java.xml.ns.javaee.EjbRefType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.sun.java.xml.ns.javaee.EjbRefType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sun.java.xml.ns.javaee.EjbRefType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.sun.java.xml.ns.javaee.EjbRefType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sun.java.xml.ns.javaee.EjbRefType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.sun.java.xml.ns.javaee.EjbRefType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.sun.java.xml.ns.javaee.EjbRefType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.sun.java.xml.ns.javaee.EjbRefType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.sun.java.xml.ns.javaee.EjbRefType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.sun.java.xml.ns.javaee.EjbRefType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.sun.java.xml.ns.javaee.EjbRefType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.sun.java.xml.ns.javaee.EjbRefType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.sun.java.xml.ns.javaee.EjbRefType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.sun.java.xml.ns.javaee.EjbRefType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.sun.java.xml.ns.javaee.EjbRefType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.sun.java.xml.ns.javaee.EjbRefType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.sun.java.xml.ns.javaee.EjbRefType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
