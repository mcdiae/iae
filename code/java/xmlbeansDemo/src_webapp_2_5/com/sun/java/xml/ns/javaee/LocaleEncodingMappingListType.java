/*
 * XML Type:  locale-encoding-mapping-listType
 * Namespace: http://java.sun.com/xml/ns/javaee
 * Java type: com.sun.java.xml.ns.javaee.LocaleEncodingMappingListType
 *
 * Automatically generated - do not modify.
 */
package com.sun.java.xml.ns.javaee;


/**
 * An XML locale-encoding-mapping-listType(@http://java.sun.com/xml/ns/javaee).
 *
 * This is a complex type.
 */
public interface LocaleEncodingMappingListType extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(LocaleEncodingMappingListType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s429215E09F9EF360BEEFD852C264F65B").resolveHandle("localeencodingmappinglisttype5a71type");
    
    /**
     * Gets a List of "locale-encoding-mapping" elements
     */
    java.util.List<com.sun.java.xml.ns.javaee.LocaleEncodingMappingType> getLocaleEncodingMappingList();
    
    /**
     * Gets array of all "locale-encoding-mapping" elements
     * @deprecated
     */
    com.sun.java.xml.ns.javaee.LocaleEncodingMappingType[] getLocaleEncodingMappingArray();
    
    /**
     * Gets ith "locale-encoding-mapping" element
     */
    com.sun.java.xml.ns.javaee.LocaleEncodingMappingType getLocaleEncodingMappingArray(int i);
    
    /**
     * Returns number of "locale-encoding-mapping" element
     */
    int sizeOfLocaleEncodingMappingArray();
    
    /**
     * Sets array of all "locale-encoding-mapping" element
     */
    void setLocaleEncodingMappingArray(com.sun.java.xml.ns.javaee.LocaleEncodingMappingType[] localeEncodingMappingArray);
    
    /**
     * Sets ith "locale-encoding-mapping" element
     */
    void setLocaleEncodingMappingArray(int i, com.sun.java.xml.ns.javaee.LocaleEncodingMappingType localeEncodingMapping);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "locale-encoding-mapping" element
     */
    com.sun.java.xml.ns.javaee.LocaleEncodingMappingType insertNewLocaleEncodingMapping(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "locale-encoding-mapping" element
     */
    com.sun.java.xml.ns.javaee.LocaleEncodingMappingType addNewLocaleEncodingMapping();
    
    /**
     * Removes the ith "locale-encoding-mapping" element
     */
    void removeLocaleEncodingMapping(int i);
    
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
        public static com.sun.java.xml.ns.javaee.LocaleEncodingMappingListType newInstance() {
          return (com.sun.java.xml.ns.javaee.LocaleEncodingMappingListType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.sun.java.xml.ns.javaee.LocaleEncodingMappingListType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.sun.java.xml.ns.javaee.LocaleEncodingMappingListType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.sun.java.xml.ns.javaee.LocaleEncodingMappingListType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.sun.java.xml.ns.javaee.LocaleEncodingMappingListType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.sun.java.xml.ns.javaee.LocaleEncodingMappingListType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.sun.java.xml.ns.javaee.LocaleEncodingMappingListType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.sun.java.xml.ns.javaee.LocaleEncodingMappingListType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sun.java.xml.ns.javaee.LocaleEncodingMappingListType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.sun.java.xml.ns.javaee.LocaleEncodingMappingListType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sun.java.xml.ns.javaee.LocaleEncodingMappingListType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.sun.java.xml.ns.javaee.LocaleEncodingMappingListType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sun.java.xml.ns.javaee.LocaleEncodingMappingListType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.sun.java.xml.ns.javaee.LocaleEncodingMappingListType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sun.java.xml.ns.javaee.LocaleEncodingMappingListType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.sun.java.xml.ns.javaee.LocaleEncodingMappingListType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sun.java.xml.ns.javaee.LocaleEncodingMappingListType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.sun.java.xml.ns.javaee.LocaleEncodingMappingListType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sun.java.xml.ns.javaee.LocaleEncodingMappingListType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.sun.java.xml.ns.javaee.LocaleEncodingMappingListType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sun.java.xml.ns.javaee.LocaleEncodingMappingListType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.sun.java.xml.ns.javaee.LocaleEncodingMappingListType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sun.java.xml.ns.javaee.LocaleEncodingMappingListType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.sun.java.xml.ns.javaee.LocaleEncodingMappingListType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.sun.java.xml.ns.javaee.LocaleEncodingMappingListType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.sun.java.xml.ns.javaee.LocaleEncodingMappingListType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.sun.java.xml.ns.javaee.LocaleEncodingMappingListType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.sun.java.xml.ns.javaee.LocaleEncodingMappingListType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.sun.java.xml.ns.javaee.LocaleEncodingMappingListType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.sun.java.xml.ns.javaee.LocaleEncodingMappingListType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.sun.java.xml.ns.javaee.LocaleEncodingMappingListType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.sun.java.xml.ns.javaee.LocaleEncodingMappingListType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.sun.java.xml.ns.javaee.LocaleEncodingMappingListType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.sun.java.xml.ns.javaee.LocaleEncodingMappingListType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.sun.java.xml.ns.javaee.LocaleEncodingMappingListType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
