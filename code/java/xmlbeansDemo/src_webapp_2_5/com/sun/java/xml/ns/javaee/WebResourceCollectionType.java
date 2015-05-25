/*
 * XML Type:  web-resource-collectionType
 * Namespace: http://java.sun.com/xml/ns/javaee
 * Java type: com.sun.java.xml.ns.javaee.WebResourceCollectionType
 *
 * Automatically generated - do not modify.
 */
package com.sun.java.xml.ns.javaee;


/**
 * An XML web-resource-collectionType(@http://java.sun.com/xml/ns/javaee).
 *
 * This is a complex type.
 */
public interface WebResourceCollectionType extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(WebResourceCollectionType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s429215E09F9EF360BEEFD852C264F65B").resolveHandle("webresourcecollectiontype58fftype");
    
    /**
     * Gets the "web-resource-name" element
     */
    com.sun.java.xml.ns.javaee.String getWebResourceName();
    
    /**
     * Sets the "web-resource-name" element
     */
    void setWebResourceName(com.sun.java.xml.ns.javaee.String webResourceName);
    
    /**
     * Appends and returns a new empty "web-resource-name" element
     */
    com.sun.java.xml.ns.javaee.String addNewWebResourceName();
    
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
     * Gets a List of "http-method" elements
     */
    java.util.List<java.lang.String> getHttpMethodList();
    
    /**
     * Gets array of all "http-method" elements
     * @deprecated
     */
    java.lang.String[] getHttpMethodArray();
    
    /**
     * Gets ith "http-method" element
     */
    java.lang.String getHttpMethodArray(int i);
    
    /**
     * Gets (as xml) a List of "http-method" elements
     */
    java.util.List<com.sun.java.xml.ns.javaee.HttpMethodType> xgetHttpMethodList();
    
    /**
     * Gets (as xml) array of all "http-method" elements
     * @deprecated
     */
    com.sun.java.xml.ns.javaee.HttpMethodType[] xgetHttpMethodArray();
    
    /**
     * Gets (as xml) ith "http-method" element
     */
    com.sun.java.xml.ns.javaee.HttpMethodType xgetHttpMethodArray(int i);
    
    /**
     * Returns number of "http-method" element
     */
    int sizeOfHttpMethodArray();
    
    /**
     * Sets array of all "http-method" element
     */
    void setHttpMethodArray(java.lang.String[] httpMethodArray);
    
    /**
     * Sets ith "http-method" element
     */
    void setHttpMethodArray(int i, java.lang.String httpMethod);
    
    /**
     * Sets (as xml) array of all "http-method" element
     */
    void xsetHttpMethodArray(com.sun.java.xml.ns.javaee.HttpMethodType[] httpMethodArray);
    
    /**
     * Sets (as xml) ith "http-method" element
     */
    void xsetHttpMethodArray(int i, com.sun.java.xml.ns.javaee.HttpMethodType httpMethod);
    
    /**
     * Inserts the value as the ith "http-method" element
     */
    void insertHttpMethod(int i, java.lang.String httpMethod);
    
    /**
     * Appends the value as the last "http-method" element
     */
    void addHttpMethod(java.lang.String httpMethod);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "http-method" element
     */
    com.sun.java.xml.ns.javaee.HttpMethodType insertNewHttpMethod(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "http-method" element
     */
    com.sun.java.xml.ns.javaee.HttpMethodType addNewHttpMethod();
    
    /**
     * Removes the ith "http-method" element
     */
    void removeHttpMethod(int i);
    
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
        public static com.sun.java.xml.ns.javaee.WebResourceCollectionType newInstance() {
          return (com.sun.java.xml.ns.javaee.WebResourceCollectionType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.sun.java.xml.ns.javaee.WebResourceCollectionType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.sun.java.xml.ns.javaee.WebResourceCollectionType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.sun.java.xml.ns.javaee.WebResourceCollectionType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.sun.java.xml.ns.javaee.WebResourceCollectionType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.sun.java.xml.ns.javaee.WebResourceCollectionType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.sun.java.xml.ns.javaee.WebResourceCollectionType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.sun.java.xml.ns.javaee.WebResourceCollectionType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sun.java.xml.ns.javaee.WebResourceCollectionType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.sun.java.xml.ns.javaee.WebResourceCollectionType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sun.java.xml.ns.javaee.WebResourceCollectionType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.sun.java.xml.ns.javaee.WebResourceCollectionType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sun.java.xml.ns.javaee.WebResourceCollectionType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.sun.java.xml.ns.javaee.WebResourceCollectionType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sun.java.xml.ns.javaee.WebResourceCollectionType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.sun.java.xml.ns.javaee.WebResourceCollectionType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sun.java.xml.ns.javaee.WebResourceCollectionType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.sun.java.xml.ns.javaee.WebResourceCollectionType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sun.java.xml.ns.javaee.WebResourceCollectionType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.sun.java.xml.ns.javaee.WebResourceCollectionType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sun.java.xml.ns.javaee.WebResourceCollectionType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.sun.java.xml.ns.javaee.WebResourceCollectionType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sun.java.xml.ns.javaee.WebResourceCollectionType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.sun.java.xml.ns.javaee.WebResourceCollectionType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.sun.java.xml.ns.javaee.WebResourceCollectionType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.sun.java.xml.ns.javaee.WebResourceCollectionType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.sun.java.xml.ns.javaee.WebResourceCollectionType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.sun.java.xml.ns.javaee.WebResourceCollectionType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.sun.java.xml.ns.javaee.WebResourceCollectionType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.sun.java.xml.ns.javaee.WebResourceCollectionType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.sun.java.xml.ns.javaee.WebResourceCollectionType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.sun.java.xml.ns.javaee.WebResourceCollectionType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.sun.java.xml.ns.javaee.WebResourceCollectionType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.sun.java.xml.ns.javaee.WebResourceCollectionType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.sun.java.xml.ns.javaee.WebResourceCollectionType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
