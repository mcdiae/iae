/*
 * XML Type:  filter-mappingType
 * Namespace: http://java.sun.com/xml/ns/javaee
 * Java type: com.sun.java.xml.ns.javaee.FilterMappingType
 *
 * Automatically generated - do not modify.
 */
package com.sun.java.xml.ns.javaee;


/**
 * An XML filter-mappingType(@http://java.sun.com/xml/ns/javaee).
 *
 * This is a complex type.
 */
public interface FilterMappingType extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(FilterMappingType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s429215E09F9EF360BEEFD852C264F65B").resolveHandle("filtermappingtypea8a6type");
    
    /**
     * Gets the "filter-name" element
     */
    com.sun.java.xml.ns.javaee.FilterNameType getFilterName();
    
    /**
     * Sets the "filter-name" element
     */
    void setFilterName(com.sun.java.xml.ns.javaee.FilterNameType filterName);
    
    /**
     * Appends and returns a new empty "filter-name" element
     */
    com.sun.java.xml.ns.javaee.FilterNameType addNewFilterName();
    
    /**
     * Gets a List of "url-pattern" elements
     */
    java.util.List<com.sun.java.xml.ns.javaee.UrlPatternType> getUrlPatternList();
    
    /**
     * Gets array of all "url-pattern" elements
     * @deprecated
     */
    com.sun.java.xml.ns.javaee.UrlPatternType[] getUrlPatternArray();
    
    /**
     * Gets ith "url-pattern" element
     */
    com.sun.java.xml.ns.javaee.UrlPatternType getUrlPatternArray(int i);
    
    /**
     * Returns number of "url-pattern" element
     */
    int sizeOfUrlPatternArray();
    
    /**
     * Sets array of all "url-pattern" element
     */
    void setUrlPatternArray(com.sun.java.xml.ns.javaee.UrlPatternType[] urlPatternArray);
    
    /**
     * Sets ith "url-pattern" element
     */
    void setUrlPatternArray(int i, com.sun.java.xml.ns.javaee.UrlPatternType urlPattern);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "url-pattern" element
     */
    com.sun.java.xml.ns.javaee.UrlPatternType insertNewUrlPattern(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "url-pattern" element
     */
    com.sun.java.xml.ns.javaee.UrlPatternType addNewUrlPattern();
    
    /**
     * Removes the ith "url-pattern" element
     */
    void removeUrlPattern(int i);
    
    /**
     * Gets a List of "servlet-name" elements
     */
    java.util.List<com.sun.java.xml.ns.javaee.ServletNameType> getServletNameList();
    
    /**
     * Gets array of all "servlet-name" elements
     * @deprecated
     */
    com.sun.java.xml.ns.javaee.ServletNameType[] getServletNameArray();
    
    /**
     * Gets ith "servlet-name" element
     */
    com.sun.java.xml.ns.javaee.ServletNameType getServletNameArray(int i);
    
    /**
     * Returns number of "servlet-name" element
     */
    int sizeOfServletNameArray();
    
    /**
     * Sets array of all "servlet-name" element
     */
    void setServletNameArray(com.sun.java.xml.ns.javaee.ServletNameType[] servletNameArray);
    
    /**
     * Sets ith "servlet-name" element
     */
    void setServletNameArray(int i, com.sun.java.xml.ns.javaee.ServletNameType servletName);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "servlet-name" element
     */
    com.sun.java.xml.ns.javaee.ServletNameType insertNewServletName(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "servlet-name" element
     */
    com.sun.java.xml.ns.javaee.ServletNameType addNewServletName();
    
    /**
     * Removes the ith "servlet-name" element
     */
    void removeServletName(int i);
    
    /**
     * Gets a List of "dispatcher" elements
     */
    java.util.List<com.sun.java.xml.ns.javaee.DispatcherType> getDispatcherList();
    
    /**
     * Gets array of all "dispatcher" elements
     * @deprecated
     */
    com.sun.java.xml.ns.javaee.DispatcherType[] getDispatcherArray();
    
    /**
     * Gets ith "dispatcher" element
     */
    com.sun.java.xml.ns.javaee.DispatcherType getDispatcherArray(int i);
    
    /**
     * Returns number of "dispatcher" element
     */
    int sizeOfDispatcherArray();
    
    /**
     * Sets array of all "dispatcher" element
     */
    void setDispatcherArray(com.sun.java.xml.ns.javaee.DispatcherType[] dispatcherArray);
    
    /**
     * Sets ith "dispatcher" element
     */
    void setDispatcherArray(int i, com.sun.java.xml.ns.javaee.DispatcherType dispatcher);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "dispatcher" element
     */
    com.sun.java.xml.ns.javaee.DispatcherType insertNewDispatcher(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "dispatcher" element
     */
    com.sun.java.xml.ns.javaee.DispatcherType addNewDispatcher();
    
    /**
     * Removes the ith "dispatcher" element
     */
    void removeDispatcher(int i);
    
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
        public static com.sun.java.xml.ns.javaee.FilterMappingType newInstance() {
          return (com.sun.java.xml.ns.javaee.FilterMappingType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.sun.java.xml.ns.javaee.FilterMappingType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.sun.java.xml.ns.javaee.FilterMappingType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.sun.java.xml.ns.javaee.FilterMappingType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.sun.java.xml.ns.javaee.FilterMappingType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.sun.java.xml.ns.javaee.FilterMappingType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.sun.java.xml.ns.javaee.FilterMappingType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.sun.java.xml.ns.javaee.FilterMappingType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sun.java.xml.ns.javaee.FilterMappingType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.sun.java.xml.ns.javaee.FilterMappingType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sun.java.xml.ns.javaee.FilterMappingType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.sun.java.xml.ns.javaee.FilterMappingType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sun.java.xml.ns.javaee.FilterMappingType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.sun.java.xml.ns.javaee.FilterMappingType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sun.java.xml.ns.javaee.FilterMappingType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.sun.java.xml.ns.javaee.FilterMappingType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sun.java.xml.ns.javaee.FilterMappingType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.sun.java.xml.ns.javaee.FilterMappingType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sun.java.xml.ns.javaee.FilterMappingType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.sun.java.xml.ns.javaee.FilterMappingType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sun.java.xml.ns.javaee.FilterMappingType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.sun.java.xml.ns.javaee.FilterMappingType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sun.java.xml.ns.javaee.FilterMappingType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.sun.java.xml.ns.javaee.FilterMappingType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.sun.java.xml.ns.javaee.FilterMappingType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.sun.java.xml.ns.javaee.FilterMappingType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.sun.java.xml.ns.javaee.FilterMappingType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.sun.java.xml.ns.javaee.FilterMappingType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.sun.java.xml.ns.javaee.FilterMappingType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.sun.java.xml.ns.javaee.FilterMappingType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.sun.java.xml.ns.javaee.FilterMappingType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.sun.java.xml.ns.javaee.FilterMappingType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.sun.java.xml.ns.javaee.FilterMappingType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.sun.java.xml.ns.javaee.FilterMappingType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.sun.java.xml.ns.javaee.FilterMappingType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
