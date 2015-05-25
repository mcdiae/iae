/*
 * XML Type:  env-entry-type-valuesType
 * Namespace: http://java.sun.com/xml/ns/javaee
 * Java type: com.sun.java.xml.ns.javaee.EnvEntryTypeValuesType
 *
 * Automatically generated - do not modify.
 */
package com.sun.java.xml.ns.javaee;


/**
 * An XML env-entry-type-valuesType(@http://java.sun.com/xml/ns/javaee).
 *
 * This is an atomic type that is a restriction of com.sun.java.xml.ns.javaee.EnvEntryTypeValuesType.
 */
public interface EnvEntryTypeValuesType extends com.sun.java.xml.ns.javaee.String
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(EnvEntryTypeValuesType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s429215E09F9EF360BEEFD852C264F65B").resolveHandle("enventrytypevaluestype39d5type");
    
    org.apache.xmlbeans.StringEnumAbstractBase enumValue();
    void set(org.apache.xmlbeans.StringEnumAbstractBase e);
    
    static final Enum JAVA_LANG_BOOLEAN = Enum.forString("java.lang.Boolean");
    static final Enum JAVA_LANG_BYTE = Enum.forString("java.lang.Byte");
    static final Enum JAVA_LANG_CHARACTER = Enum.forString("java.lang.Character");
    static final Enum JAVA_LANG_STRING = Enum.forString("java.lang.String");
    static final Enum JAVA_LANG_SHORT = Enum.forString("java.lang.Short");
    static final Enum JAVA_LANG_INTEGER = Enum.forString("java.lang.Integer");
    static final Enum JAVA_LANG_LONG = Enum.forString("java.lang.Long");
    static final Enum JAVA_LANG_FLOAT = Enum.forString("java.lang.Float");
    static final Enum JAVA_LANG_DOUBLE = Enum.forString("java.lang.Double");
    
    static final int INT_JAVA_LANG_BOOLEAN = Enum.INT_JAVA_LANG_BOOLEAN;
    static final int INT_JAVA_LANG_BYTE = Enum.INT_JAVA_LANG_BYTE;
    static final int INT_JAVA_LANG_CHARACTER = Enum.INT_JAVA_LANG_CHARACTER;
    static final int INT_JAVA_LANG_STRING = Enum.INT_JAVA_LANG_STRING;
    static final int INT_JAVA_LANG_SHORT = Enum.INT_JAVA_LANG_SHORT;
    static final int INT_JAVA_LANG_INTEGER = Enum.INT_JAVA_LANG_INTEGER;
    static final int INT_JAVA_LANG_LONG = Enum.INT_JAVA_LANG_LONG;
    static final int INT_JAVA_LANG_FLOAT = Enum.INT_JAVA_LANG_FLOAT;
    static final int INT_JAVA_LANG_DOUBLE = Enum.INT_JAVA_LANG_DOUBLE;
    
    /**
     * Enumeration value class for com.sun.java.xml.ns.javaee.EnvEntryTypeValuesType.
     * These enum values can be used as follows:
     * <pre>
     * enum.toString(); // returns the string value of the enum
     * enum.intValue(); // returns an int value, useful for switches
     * // e.g., case Enum.INT_JAVA_LANG_BOOLEAN
     * Enum.forString(s); // returns the enum value for a string
     * Enum.forInt(i); // returns the enum value for an int
     * </pre>
     * Enumeration objects are immutable singleton objects that
     * can be compared using == object equality. They have no
     * public constructor. See the constants defined within this
     * class for all the valid values.
     */
    static final class Enum extends org.apache.xmlbeans.StringEnumAbstractBase
    {
        /**
         * Returns the enum value for a string, or null if none.
         */
        public static Enum forString(java.lang.String s)
            { return (Enum)table.forString(s); }
        /**
         * Returns the enum value corresponding to an int, or null if none.
         */
        public static Enum forInt(int i)
            { return (Enum)table.forInt(i); }
        
        private Enum(java.lang.String s, int i)
            { super(s, i); }
        
        static final int INT_JAVA_LANG_BOOLEAN = 1;
        static final int INT_JAVA_LANG_BYTE = 2;
        static final int INT_JAVA_LANG_CHARACTER = 3;
        static final int INT_JAVA_LANG_STRING = 4;
        static final int INT_JAVA_LANG_SHORT = 5;
        static final int INT_JAVA_LANG_INTEGER = 6;
        static final int INT_JAVA_LANG_LONG = 7;
        static final int INT_JAVA_LANG_FLOAT = 8;
        static final int INT_JAVA_LANG_DOUBLE = 9;
        
        public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
            new org.apache.xmlbeans.StringEnumAbstractBase.Table
        (
            new Enum[]
            {
                new Enum("java.lang.Boolean", INT_JAVA_LANG_BOOLEAN),
                new Enum("java.lang.Byte", INT_JAVA_LANG_BYTE),
                new Enum("java.lang.Character", INT_JAVA_LANG_CHARACTER),
                new Enum("java.lang.String", INT_JAVA_LANG_STRING),
                new Enum("java.lang.Short", INT_JAVA_LANG_SHORT),
                new Enum("java.lang.Integer", INT_JAVA_LANG_INTEGER),
                new Enum("java.lang.Long", INT_JAVA_LANG_LONG),
                new Enum("java.lang.Float", INT_JAVA_LANG_FLOAT),
                new Enum("java.lang.Double", INT_JAVA_LANG_DOUBLE),
            }
        );
        private static final long serialVersionUID = 1L;
        private java.lang.Object readResolve() { return forInt(intValue()); } 
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.sun.java.xml.ns.javaee.EnvEntryTypeValuesType newInstance() {
          return (com.sun.java.xml.ns.javaee.EnvEntryTypeValuesType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.sun.java.xml.ns.javaee.EnvEntryTypeValuesType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.sun.java.xml.ns.javaee.EnvEntryTypeValuesType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.sun.java.xml.ns.javaee.EnvEntryTypeValuesType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.sun.java.xml.ns.javaee.EnvEntryTypeValuesType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.sun.java.xml.ns.javaee.EnvEntryTypeValuesType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.sun.java.xml.ns.javaee.EnvEntryTypeValuesType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.sun.java.xml.ns.javaee.EnvEntryTypeValuesType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sun.java.xml.ns.javaee.EnvEntryTypeValuesType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.sun.java.xml.ns.javaee.EnvEntryTypeValuesType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sun.java.xml.ns.javaee.EnvEntryTypeValuesType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.sun.java.xml.ns.javaee.EnvEntryTypeValuesType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sun.java.xml.ns.javaee.EnvEntryTypeValuesType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.sun.java.xml.ns.javaee.EnvEntryTypeValuesType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sun.java.xml.ns.javaee.EnvEntryTypeValuesType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.sun.java.xml.ns.javaee.EnvEntryTypeValuesType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sun.java.xml.ns.javaee.EnvEntryTypeValuesType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.sun.java.xml.ns.javaee.EnvEntryTypeValuesType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sun.java.xml.ns.javaee.EnvEntryTypeValuesType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.sun.java.xml.ns.javaee.EnvEntryTypeValuesType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sun.java.xml.ns.javaee.EnvEntryTypeValuesType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.sun.java.xml.ns.javaee.EnvEntryTypeValuesType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sun.java.xml.ns.javaee.EnvEntryTypeValuesType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.sun.java.xml.ns.javaee.EnvEntryTypeValuesType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.sun.java.xml.ns.javaee.EnvEntryTypeValuesType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.sun.java.xml.ns.javaee.EnvEntryTypeValuesType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.sun.java.xml.ns.javaee.EnvEntryTypeValuesType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.sun.java.xml.ns.javaee.EnvEntryTypeValuesType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.sun.java.xml.ns.javaee.EnvEntryTypeValuesType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.sun.java.xml.ns.javaee.EnvEntryTypeValuesType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.sun.java.xml.ns.javaee.EnvEntryTypeValuesType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.sun.java.xml.ns.javaee.EnvEntryTypeValuesType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.sun.java.xml.ns.javaee.EnvEntryTypeValuesType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.sun.java.xml.ns.javaee.EnvEntryTypeValuesType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.sun.java.xml.ns.javaee.EnvEntryTypeValuesType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
