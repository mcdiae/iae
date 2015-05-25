/*
 * XML Type:  service-ref_handlerType
 * Namespace: http://java.sun.com/xml/ns/javaee
 * Java type: com.sun.java.xml.ns.javaee.ServiceRefHandlerType
 *
 * Automatically generated - do not modify.
 */
package com.sun.java.xml.ns.javaee;


/**
 * An XML service-ref_handlerType(@http://java.sun.com/xml/ns/javaee).
 *
 * This is a complex type.
 */
public interface ServiceRefHandlerType extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ServiceRefHandlerType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s429215E09F9EF360BEEFD852C264F65B").resolveHandle("servicerefhandlertype65c1type");
    
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
     * Gets a List of "display-name" elements
     */
    java.util.List<com.sun.java.xml.ns.javaee.DisplayNameType> getDisplayNameList();
    
    /**
     * Gets array of all "display-name" elements
     * @deprecated
     */
    com.sun.java.xml.ns.javaee.DisplayNameType[] getDisplayNameArray();
    
    /**
     * Gets ith "display-name" element
     */
    com.sun.java.xml.ns.javaee.DisplayNameType getDisplayNameArray(int i);
    
    /**
     * Returns number of "display-name" element
     */
    int sizeOfDisplayNameArray();
    
    /**
     * Sets array of all "display-name" element
     */
    void setDisplayNameArray(com.sun.java.xml.ns.javaee.DisplayNameType[] displayNameArray);
    
    /**
     * Sets ith "display-name" element
     */
    void setDisplayNameArray(int i, com.sun.java.xml.ns.javaee.DisplayNameType displayName);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "display-name" element
     */
    com.sun.java.xml.ns.javaee.DisplayNameType insertNewDisplayName(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "display-name" element
     */
    com.sun.java.xml.ns.javaee.DisplayNameType addNewDisplayName();
    
    /**
     * Removes the ith "display-name" element
     */
    void removeDisplayName(int i);
    
    /**
     * Gets a List of "icon" elements
     */
    java.util.List<com.sun.java.xml.ns.javaee.IconType> getIconList();
    
    /**
     * Gets array of all "icon" elements
     * @deprecated
     */
    com.sun.java.xml.ns.javaee.IconType[] getIconArray();
    
    /**
     * Gets ith "icon" element
     */
    com.sun.java.xml.ns.javaee.IconType getIconArray(int i);
    
    /**
     * Returns number of "icon" element
     */
    int sizeOfIconArray();
    
    /**
     * Sets array of all "icon" element
     */
    void setIconArray(com.sun.java.xml.ns.javaee.IconType[] iconArray);
    
    /**
     * Sets ith "icon" element
     */
    void setIconArray(int i, com.sun.java.xml.ns.javaee.IconType icon);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "icon" element
     */
    com.sun.java.xml.ns.javaee.IconType insertNewIcon(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "icon" element
     */
    com.sun.java.xml.ns.javaee.IconType addNewIcon();
    
    /**
     * Removes the ith "icon" element
     */
    void removeIcon(int i);
    
    /**
     * Gets the "handler-name" element
     */
    com.sun.java.xml.ns.javaee.String getHandlerName();
    
    /**
     * Sets the "handler-name" element
     */
    void setHandlerName(com.sun.java.xml.ns.javaee.String handlerName);
    
    /**
     * Appends and returns a new empty "handler-name" element
     */
    com.sun.java.xml.ns.javaee.String addNewHandlerName();
    
    /**
     * Gets the "handler-class" element
     */
    com.sun.java.xml.ns.javaee.FullyQualifiedClassType getHandlerClass();
    
    /**
     * Sets the "handler-class" element
     */
    void setHandlerClass(com.sun.java.xml.ns.javaee.FullyQualifiedClassType handlerClass);
    
    /**
     * Appends and returns a new empty "handler-class" element
     */
    com.sun.java.xml.ns.javaee.FullyQualifiedClassType addNewHandlerClass();
    
    /**
     * Gets a List of "init-param" elements
     */
    java.util.List<com.sun.java.xml.ns.javaee.ParamValueType> getInitParamList();
    
    /**
     * Gets array of all "init-param" elements
     * @deprecated
     */
    com.sun.java.xml.ns.javaee.ParamValueType[] getInitParamArray();
    
    /**
     * Gets ith "init-param" element
     */
    com.sun.java.xml.ns.javaee.ParamValueType getInitParamArray(int i);
    
    /**
     * Returns number of "init-param" element
     */
    int sizeOfInitParamArray();
    
    /**
     * Sets array of all "init-param" element
     */
    void setInitParamArray(com.sun.java.xml.ns.javaee.ParamValueType[] initParamArray);
    
    /**
     * Sets ith "init-param" element
     */
    void setInitParamArray(int i, com.sun.java.xml.ns.javaee.ParamValueType initParam);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "init-param" element
     */
    com.sun.java.xml.ns.javaee.ParamValueType insertNewInitParam(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "init-param" element
     */
    com.sun.java.xml.ns.javaee.ParamValueType addNewInitParam();
    
    /**
     * Removes the ith "init-param" element
     */
    void removeInitParam(int i);
    
    /**
     * Gets a List of "soap-header" elements
     */
    java.util.List<com.sun.java.xml.ns.javaee.XsdQNameType> getSoapHeaderList();
    
    /**
     * Gets array of all "soap-header" elements
     * @deprecated
     */
    com.sun.java.xml.ns.javaee.XsdQNameType[] getSoapHeaderArray();
    
    /**
     * Gets ith "soap-header" element
     */
    com.sun.java.xml.ns.javaee.XsdQNameType getSoapHeaderArray(int i);
    
    /**
     * Returns number of "soap-header" element
     */
    int sizeOfSoapHeaderArray();
    
    /**
     * Sets array of all "soap-header" element
     */
    void setSoapHeaderArray(com.sun.java.xml.ns.javaee.XsdQNameType[] soapHeaderArray);
    
    /**
     * Sets ith "soap-header" element
     */
    void setSoapHeaderArray(int i, com.sun.java.xml.ns.javaee.XsdQNameType soapHeader);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "soap-header" element
     */
    com.sun.java.xml.ns.javaee.XsdQNameType insertNewSoapHeader(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "soap-header" element
     */
    com.sun.java.xml.ns.javaee.XsdQNameType addNewSoapHeader();
    
    /**
     * Removes the ith "soap-header" element
     */
    void removeSoapHeader(int i);
    
    /**
     * Gets a List of "soap-role" elements
     */
    java.util.List<com.sun.java.xml.ns.javaee.String> getSoapRoleList();
    
    /**
     * Gets array of all "soap-role" elements
     * @deprecated
     */
    com.sun.java.xml.ns.javaee.String[] getSoapRoleArray();
    
    /**
     * Gets ith "soap-role" element
     */
    com.sun.java.xml.ns.javaee.String getSoapRoleArray(int i);
    
    /**
     * Returns number of "soap-role" element
     */
    int sizeOfSoapRoleArray();
    
    /**
     * Sets array of all "soap-role" element
     */
    void setSoapRoleArray(com.sun.java.xml.ns.javaee.String[] soapRoleArray);
    
    /**
     * Sets ith "soap-role" element
     */
    void setSoapRoleArray(int i, com.sun.java.xml.ns.javaee.String soapRole);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "soap-role" element
     */
    com.sun.java.xml.ns.javaee.String insertNewSoapRole(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "soap-role" element
     */
    com.sun.java.xml.ns.javaee.String addNewSoapRole();
    
    /**
     * Removes the ith "soap-role" element
     */
    void removeSoapRole(int i);
    
    /**
     * Gets a List of "port-name" elements
     */
    java.util.List<com.sun.java.xml.ns.javaee.String> getPortNameList();
    
    /**
     * Gets array of all "port-name" elements
     * @deprecated
     */
    com.sun.java.xml.ns.javaee.String[] getPortNameArray();
    
    /**
     * Gets ith "port-name" element
     */
    com.sun.java.xml.ns.javaee.String getPortNameArray(int i);
    
    /**
     * Returns number of "port-name" element
     */
    int sizeOfPortNameArray();
    
    /**
     * Sets array of all "port-name" element
     */
    void setPortNameArray(com.sun.java.xml.ns.javaee.String[] portNameArray);
    
    /**
     * Sets ith "port-name" element
     */
    void setPortNameArray(int i, com.sun.java.xml.ns.javaee.String portName);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "port-name" element
     */
    com.sun.java.xml.ns.javaee.String insertNewPortName(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "port-name" element
     */
    com.sun.java.xml.ns.javaee.String addNewPortName();
    
    /**
     * Removes the ith "port-name" element
     */
    void removePortName(int i);
    
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
        public static com.sun.java.xml.ns.javaee.ServiceRefHandlerType newInstance() {
          return (com.sun.java.xml.ns.javaee.ServiceRefHandlerType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.sun.java.xml.ns.javaee.ServiceRefHandlerType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.sun.java.xml.ns.javaee.ServiceRefHandlerType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.sun.java.xml.ns.javaee.ServiceRefHandlerType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.sun.java.xml.ns.javaee.ServiceRefHandlerType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.sun.java.xml.ns.javaee.ServiceRefHandlerType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.sun.java.xml.ns.javaee.ServiceRefHandlerType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.sun.java.xml.ns.javaee.ServiceRefHandlerType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sun.java.xml.ns.javaee.ServiceRefHandlerType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.sun.java.xml.ns.javaee.ServiceRefHandlerType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sun.java.xml.ns.javaee.ServiceRefHandlerType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.sun.java.xml.ns.javaee.ServiceRefHandlerType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sun.java.xml.ns.javaee.ServiceRefHandlerType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.sun.java.xml.ns.javaee.ServiceRefHandlerType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sun.java.xml.ns.javaee.ServiceRefHandlerType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.sun.java.xml.ns.javaee.ServiceRefHandlerType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sun.java.xml.ns.javaee.ServiceRefHandlerType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.sun.java.xml.ns.javaee.ServiceRefHandlerType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sun.java.xml.ns.javaee.ServiceRefHandlerType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.sun.java.xml.ns.javaee.ServiceRefHandlerType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sun.java.xml.ns.javaee.ServiceRefHandlerType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.sun.java.xml.ns.javaee.ServiceRefHandlerType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sun.java.xml.ns.javaee.ServiceRefHandlerType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.sun.java.xml.ns.javaee.ServiceRefHandlerType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.sun.java.xml.ns.javaee.ServiceRefHandlerType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.sun.java.xml.ns.javaee.ServiceRefHandlerType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.sun.java.xml.ns.javaee.ServiceRefHandlerType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.sun.java.xml.ns.javaee.ServiceRefHandlerType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.sun.java.xml.ns.javaee.ServiceRefHandlerType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.sun.java.xml.ns.javaee.ServiceRefHandlerType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.sun.java.xml.ns.javaee.ServiceRefHandlerType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.sun.java.xml.ns.javaee.ServiceRefHandlerType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.sun.java.xml.ns.javaee.ServiceRefHandlerType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.sun.java.xml.ns.javaee.ServiceRefHandlerType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.sun.java.xml.ns.javaee.ServiceRefHandlerType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
