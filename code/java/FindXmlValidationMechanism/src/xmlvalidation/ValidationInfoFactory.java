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

import java.io.ByteArrayInputStream;
import java.io.IOException;

import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLResolver;
import javax.xml.stream.XMLStreamConstants;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;
import javax.xml.transform.Source;

/**
 * Class for creating ValidationInfo instances from XML sources.
 * 
 * @author McDowell
 */
public class ValidationInfoFactory {

	private static final String XSD_NAMESPACE_URI = "http://www.w3.org/2001/XMLSchema-instance";

	public ValidationInfo getValidationMechanism(Source source)
			throws IOException {
		final ValidationInfoImpl validationInfo = new ValidationInfoImpl();

		XMLInputFactory xmlInputFactory = XMLInputFactory.newInstance();
		xmlInputFactory.setProperty(XMLInputFactory.RESOLVER,
				new CustomEntityResolver(validationInfo));
		try {
			XMLStreamReader xmlStreamReader = xmlInputFactory
					.createXMLStreamReader(source);
			try {
				while (xmlStreamReader.hasNext()) {
					int eventType = xmlStreamReader.next();

					// stop reading on first element
					if (eventType == XMLStreamConstants.START_ELEMENT) {
						validationInfo.rootElementName = xmlStreamReader
								.getLocalName();
						validationInfo.namespace = xmlStreamReader
								.getNamespaceURI();
						validationInfo.schemaLocation = xmlStreamReader
								.getAttributeValue(XSD_NAMESPACE_URI,
										"schemaLocation");
						validationInfo.noNamespaceSchemaLocation = xmlStreamReader
								.getAttributeValue(XSD_NAMESPACE_URI,
										"noNamespaceSchemaLocation");

						return validationInfo;
					}
				}
			} finally {
				xmlStreamReader.close();
			}
			return validationInfo;
		} catch (XMLStreamException e) {
			throw new IOException(e);
		}
	}

	private static class CustomEntityResolver implements XMLResolver {

		private final ValidationInfoImpl info;

		public CustomEntityResolver(ValidationInfoImpl info) {
			this.info = info;
		}

		@Override
		public Object resolveEntity(String publicID, String systemID,
				String baseURI, String namespace) throws XMLStreamException {

			info.dtdPublicId = publicID;
			info.dtdSystemId = systemID;

			return new ByteArrayInputStream(new byte[0]);
		}
	}

	private static class ValidationInfoImpl implements ValidationInfo {

		private String rootElementName;
		private String dtdPublicId;
		private String dtdSystemId;
		private String namespace;
		private String noNamespaceSchemaLocation;
		private String schemaLocation;

		@Override
		public String getRootElementName() {
			return rootElementName;
		}

		@Override
		public String getDtdPublicId() {
			return dtdPublicId;
		}

		@Override
		public String getDtdSystemId() {
			return dtdSystemId;
		}

		@Override
		public String getNamespace() {
			return namespace;
		}

		@Override
		public String getNoNamespaceSchemaLocation() {
			return noNamespaceSchemaLocation;
		}

		@Override
		public String getSchemaLocation() {
			return schemaLocation;
		}

		@Override
		public ValidationMechanism getValidationMechanism() {
			if (dtdPublicId != null || dtdSystemId != null) {
				return ValidationMechanism.DTD;
			}
			if (schemaLocation != null || noNamespaceSchemaLocation != null) {
				return ValidationMechanism.XSD;
			}
			return ValidationMechanism.UNKNOWN;
		}

		@Override
		public String toString() {
			StringBuilder stringBuilder = new StringBuilder();
			ValidationMechanism mechanism = getValidationMechanism();
			stringBuilder.append("mechanism=");
			stringBuilder.append(mechanism);
			stringBuilder.append(" namespace=");
			stringBuilder.append(namespace);
			stringBuilder.append(" rootElementName=");
			stringBuilder.append(rootElementName);
			if (mechanism == ValidationMechanism.DTD) {
				stringBuilder.append(" publicId=");
				stringBuilder.append(dtdPublicId);
				stringBuilder.append(" systemId=");
				stringBuilder.append(dtdSystemId);
			} else if (mechanism == ValidationMechanism.XSD) {
				stringBuilder.append(" schemaLocation=");
				stringBuilder.append(schemaLocation);
				stringBuilder.append(" noNamespaceSchemaLocation=");
				stringBuilder.append(noNamespaceSchemaLocation);
			}
			return stringBuilder.toString();
		}
	}

}
