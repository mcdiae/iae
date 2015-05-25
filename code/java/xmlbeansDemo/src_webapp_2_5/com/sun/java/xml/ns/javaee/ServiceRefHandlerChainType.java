/*
 * XML Type:  service-ref_handler-chainType
 * Namespace: http://java.sun.com/xml/ns/javaee
 * Java type: com.sun.java.xml.ns.javaee.ServiceRefHandlerChainType
 *
 * Automatically generated - do not modify.
 */
package com.sun.java.xml.ns.javaee;


/**
 * An XML service-ref_handler-chainType(@http://java.sun.com/xml/ns/javaee).
 *
 * This is a complex type.
 */
public interface ServiceRefHandlerChainType extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ServiceRefHandlerChainType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s429215E09F9EF360BEEFD852C264F65B").resolveHandle("servicerefhandlerchaintypea7b5type");
    
    /**
     * Gets the "service-name-pattern" element
     */
    java.lang.String getServiceNamePattern();
    
    /**
     * Gets (as xml) the "service-name-pattern" element
     */
    com.sun.java.xml.ns.javaee.ServiceRefQnamePattern xgetServiceNamePattern();
    
    /**
     * True if has "service-name-pattern" element
     */
    boolean isSetServiceNamePattern();
    
    /**
     * Sets the "service-name-pattern" element
     */
    void setServiceNamePattern(java.lang.String serviceNamePattern);
    
    /**
     * Sets (as xml) the "service-name-pattern" element
     */
    void xsetServiceNamePattern(com.sun.java.xml.ns.javaee.ServiceRefQnamePattern serviceNamePattern);
    
    /**
     * Unsets the "service-name-pattern" element
     */
    void unsetServiceNamePattern();
    
    /**
     * Gets the "port-name-pattern" element
     */
    java.lang.String getPortNamePattern();
    
    /**
     * Gets (as xml) the "port-name-pattern" element
     */
    com.sun.java.xml.ns.javaee.ServiceRefQnamePattern xgetPortNamePattern();
    
    /**
     * True if has "port-name-pattern" element
     */
    boolean isSetPortNamePattern();
    
    /**
     * Sets the "port-name-pattern" element
     */
    void setPortNamePattern(java.lang.String portNamePattern);
    
    /**
     * Sets (as xml) the "port-name-pattern" element
     */
    void xsetPortNamePattern(com.sun.java.xml.ns.javaee.ServiceRefQnamePattern portNamePattern);
    
    /**
     * Unsets the "port-name-pattern" element
     */
    void unsetPortNamePattern();
    
    /**
     * Gets the "protocol-bindings" element
     */
    java.util.List getProtocolBindings();
    
    /**
     * Gets (as xml) the "protocol-bindings" element
     */
    com.sun.java.xml.ns.javaee.ServiceRefProtocolBindingListType xgetProtocolBindings();
    
    /**
     * True if has "protocol-bindings" element
     */
    boolean isSetProtocolBindings();
    
    /**
     * Sets the "protocol-bindings" element
     */
    void setProtocolBindings(java.util.List protocolBindings);
    
    /**
     * Sets (as xml) the "protocol-bindings" element
     */
    void xsetProtocolBindings(com.sun.java.xml.ns.javaee.ServiceRefProtocolBindingListType protocolBindings);
    
    /**
     * Unsets the "protocol-bindings" element
     */
    void unsetProtocolBindings();
    
    /**
     * Gets a List of "handler" elements
     */
    java.util.List<com.sun.java.xml.ns.javaee.ServiceRefHandlerType> getHandlerList();
    
    /**
     * Gets array of all "handler" elements
     * @deprecated
     */
    com.sun.java.xml.ns.javaee.ServiceRefHandlerType[] getHandlerArray();
    
    /**
     * Gets ith "handler" element
     */
    com.sun.java.xml.ns.javaee.ServiceRefHandlerType getHandlerArray(int i);
    
    /**
     * Returns number of "handler" element
     */
    int sizeOfHandlerArray();
    
    /**
     * Sets array of all "handler" element
     */
    void setHandlerArray(com.sun.java.xml.ns.javaee.ServiceRefHandlerType[] handlerArray);
    
    /**
     * Sets ith "handler" element
     */
    void setHandlerArray(int i, com.sun.java.xml.ns.javaee.ServiceRefHandlerType handler);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "handler" element
     */
    com.sun.java.xml.ns.javaee.ServiceRefHandlerType insertNewHandler(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "handler" element
     */
    com.sun.java.xml.ns.javaee.ServiceRefHandlerType addNewHandler();
    
    /**
     * Removes the ith "handler" element
     */
    void removeHandler(int i);
    
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
        public static com.sun.java.xml.ns.javaee.ServiceRefHandlerChainType newInstance() {
          return (com.sun.java.xml.ns.javaee.ServiceRefHandlerChainType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.sun.java.xml.ns.javaee.ServiceRefHandlerChainType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.sun.java.xml.ns.javaee.ServiceRefHandlerChainType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.sun.java.xml.ns.javaee.ServiceRefHandlerChainType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.sun.java.xml.ns.javaee.ServiceRefHandlerChainType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.sun.java.xml.ns.javaee.ServiceRefHandlerChainType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.sun.java.xml.ns.javaee.ServiceRefHandlerChainType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.sun.java.xml.ns.javaee.ServiceRefHandlerChainType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sun.java.xml.ns.javaee.ServiceRefHandlerChainType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.sun.java.xml.ns.javaee.ServiceRefHandlerChainType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sun.java.xml.ns.javaee.ServiceRefHandlerChainType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.sun.java.xml.ns.javaee.ServiceRefHandlerChainType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sun.java.xml.ns.javaee.ServiceRefHandlerChainType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.sun.java.xml.ns.javaee.ServiceRefHandlerChainType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sun.java.xml.ns.javaee.ServiceRefHandlerChainType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.sun.java.xml.ns.javaee.ServiceRefHandlerChainType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sun.java.xml.ns.javaee.ServiceRefHandlerChainType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.sun.java.xml.ns.javaee.ServiceRefHandlerChainType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sun.java.xml.ns.javaee.ServiceRefHandlerChainType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.sun.java.xml.ns.javaee.ServiceRefHandlerChainType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sun.java.xml.ns.javaee.ServiceRefHandlerChainType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.sun.java.xml.ns.javaee.ServiceRefHandlerChainType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sun.java.xml.ns.javaee.ServiceRefHandlerChainType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.sun.java.xml.ns.javaee.ServiceRefHandlerChainType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.sun.java.xml.ns.javaee.ServiceRefHandlerChainType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.sun.java.xml.ns.javaee.ServiceRefHandlerChainType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.sun.java.xml.ns.javaee.ServiceRefHandlerChainType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.sun.java.xml.ns.javaee.ServiceRefHandlerChainType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.sun.java.xml.ns.javaee.ServiceRefHandlerChainType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.sun.java.xml.ns.javaee.ServiceRefHandlerChainType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.sun.java.xml.ns.javaee.ServiceRefHandlerChainType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.sun.java.xml.ns.javaee.ServiceRefHandlerChainType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.sun.java.xml.ns.javaee.ServiceRefHandlerChainType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.sun.java.xml.ns.javaee.ServiceRefHandlerChainType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.sun.java.xml.ns.javaee.ServiceRefHandlerChainType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
