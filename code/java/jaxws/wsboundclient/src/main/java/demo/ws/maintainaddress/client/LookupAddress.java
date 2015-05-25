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

import java.net.URL;

import javax.xml.namespace.QName;
import javax.xml.ws.BindingProvider;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.soap.SOAPFaultException;

import demo.ws.address.CustomerAddress;
import demo.ws.name.Name;
import demo.ws.service.MaintainAddress;
import demo.ws.service.MaintainAddress_Service;

public class LookupAddress {

  public static void main(String[] args) {
    String endpoint =
        "http://localhost:8080/wsboundservice-0.0.1-SNAPSHOT/MaintainAddress";
    URL wsdl = LookupAddress.class.getClassLoader()
        .getResource("wsdl/MaintainAddress.wsdl");
    String namespace = "http://demo.iae.ws/MaintainAddress/";
    String localname = "MaintainAddress";
    MaintainAddress_Service service =
        new MaintainAddress_Service(wsdl, new QName(namespace, localname));
    MaintainAddress port = service.getMaintainAddressSOAP();
    BindingProvider bindingProvider = (BindingProvider) port;
    bindingProvider.getRequestContext()
        .put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY, endpoint);

    Name name = new Name();
    name.setForename("Joe");
    name.setSurname("Blogs");
    try {
      CustomerAddress address = port.lookupAddress(name);
      for (String line : address.getLocation()) {
        System.out.println(line);
      }
      System.out.println(address.getCode());
    } catch (SOAPFaultException e) {
      System.err.println(e);
    } catch (WebServiceException e) {
      System.err.println(e);
    }
  }
}
