/*
Copyright (c) 2011 McDowell

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

package demo.ws.maintainaddress.client;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;

import javax.xml.namespace.QName;
import javax.xml.soap.MessageFactory;
import javax.xml.soap.MimeHeaders;
import javax.xml.soap.SOAPBody;
import javax.xml.soap.SOAPConstants;
import javax.xml.soap.SOAPException;
import javax.xml.soap.SOAPMessage;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;
import javax.xml.ws.Dispatch;
import javax.xml.ws.Service;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.soap.SOAPBinding;
import javax.xml.ws.soap.SOAPFaultException;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpressionException;
import javax.xml.xpath.XPathFactory;

import org.w3c.dom.Node;

public class DynamicLookup {

  /**
   * Sets the request parameters using XPath
   */
  private static void setNames(Node node, String forename, String surname) {
    XPath xpath = XPathFactory.newInstance()
        .newXPath();
    xpath.setNamespaceContext(new NamespaceContextMap("ns",
        "http://demo.iae.ws/name"));
    try {
      Node forenameElement =
          (Node) xpath.evaluate("//ns:forename", node, XPathConstants.NODE);
      forenameElement.setTextContent(forename);
      Node surnameElement =
          (Node) xpath.evaluate("//ns:surname", node, XPathConstants.NODE);
      surnameElement.setTextContent(surname);
    } catch (XPathExpressionException e) {
      throw new IllegalStateException(e);
    }
  }

  /**
   * Creates a request from an XML template
   */
  private static SOAPMessage createRequest(String forename, String surname)
      throws SOAPException, IOException {
    InputStream template =
        DynamicLookup.class.getResourceAsStream("/xml/client.xml");
    try {
      MessageFactory mf =
          MessageFactory.newInstance(SOAPConstants.SOAP_1_1_PROTOCOL);
      SOAPMessage message = mf.createMessage(new MimeHeaders(), template);
      SOAPBody body = message.getSOAPBody();
      setNames(body, forename, surname);
      return message;
    } finally {
      template.close();
    }
  }

  /**
   * Transforms the XML response to HTML
   */
  private static void toHtml(Node node, OutputStream out)
      throws TransformerException, IOException {
    InputStream stylesheet =
        DynamicLookup.class.getResourceAsStream("/xml/tohtml.xslt");
    try {
      Transformer transformer = TransformerFactory.newInstance()
          .newTransformer(new StreamSource(stylesheet));
      transformer.transform(new DOMSource(node), new StreamResult(out));
    } finally {
      stylesheet.close();
    }
  }

  public static void main(String[] args) throws SOAPException, IOException,
      TransformerException {
    String endpoint =
        "http://localhost:8080/wsboundservice-0.0.1-SNAPSHOT/MaintainAddress";
    URL wsdl = DynamicLookup.class.getClassLoader()
        .getResource("wsdl/MaintainAddress.wsdl");
    String namespace = "http://demo.iae.ws/MaintainAddress/";
    Service service =
        Service.create(wsdl, new QName(namespace, "MaintainAddress"));
    QName portName = new QName(namespace, "lookupAddress");
    service.addPort(portName, SOAPBinding.SOAP11HTTP_BINDING, endpoint);
    Dispatch<SOAPMessage> dispatch =
        service.createDispatch(portName, SOAPMessage.class,
            Service.Mode.MESSAGE);

    SOAPMessage request = createRequest("Joe", "Blogs");
    try {
      SOAPMessage response = dispatch.invoke(request);
      toHtml(response.getSOAPBody(), System.out);
    } catch (SOAPFaultException e) {
      System.err.println(e);
    } catch (WebServiceException e) {
      System.err.println(e);
    }
  }
}
