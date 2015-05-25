/*
Copyright (c) 2009 McDowell

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in
all copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
THE SOFTWARE.
 */
package xmlvalidation;

/**
 * Interface for returning specific validation-related information for an XML
 * file.
 * 
 * @author McDowell
 */
public interface ValidationInfo {

	public ValidationMechanism getValidationMechanism();

	/**
	 * Returns the name of the root element. This is the local name.
	 * 
	 * @return the name of the root element or null
	 */
	public String getRootElementName();

	/**
	 * Returns the name of the DTD, if any. See <a
	 * href="http://www.w3.org/TR/REC-xml/#dt-doctype">document type definition</a>.
	 * 
	 * @return the DTD name or null
	 */
	public String getDtdPublicId();

	/**
	 * Returns the URI of the DTD, if any. See <a
	 * href="http://www.w3.org/TR/REC-xml/#dt-doctype">document type definition</a>.
	 * 
	 * @return the URI of the DTD or null
	 */
	public String getDtdSystemId();

	/**
	 * See <a href="http://www.w3.org/TR/REC-xml-names/">Namespaces in XML 1.0</a>.
	 * 
	 * @return the namespace of the root element or null
	 */
	public String getNamespace();

	/**
	 * Returns the schema location defined in the document instance. See <a
	 * href="http://www.w3.org/TR/xmlschema-0/#schemaLocation">XML Schema Part
	 * 0: Primer Second Edition</a>.
	 * 
	 * @return the schema location or null
	 */
	public String getSchemaLocation();

	/**
	 * Returns the schema location defined in the document instance. See <a
	 * href="http://www.w3.org/TR/xmlschema-0/#schemaLocation">XML Schema Part
	 * 0: Primer Second Edition</a>.
	 * 
	 * @return the noNamespaceSchemaLocation
	 */
	public String getNoNamespaceSchemaLocation();

}
