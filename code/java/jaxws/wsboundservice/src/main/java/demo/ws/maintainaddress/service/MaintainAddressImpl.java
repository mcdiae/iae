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

package demo.ws.maintainaddress.service;

import java.util.List;

import javax.jws.WebService;
import javax.xml.namespace.QName;
import javax.xml.soap.SOAPConstants;
import javax.xml.soap.SOAPException;
import javax.xml.soap.SOAPFactory;
import javax.xml.soap.SOAPFault;
import javax.xml.ws.soap.SOAPFaultException;

import demo.ws.address.CustomerAddress;
import demo.ws.name.Name;
import demo.ws.service.MaintainAddress;

@WebService(endpointInterface = "demo.ws.service.MaintainAddress", serviceName = "MaintainAddress")
public class MaintainAddressImpl implements MaintainAddress {
  @Override
  public CustomerAddress lookupAddress(Name parameters) {
    String forename = assertNotEmpty("forename", parameters.getForename());
    String surname = assertNotEmpty("surname", parameters.getSurname());
    CustomerAddress address = new CustomerAddress();
    Name name = new Name();
    name.setForename(forename);
    name.setSurname(surname);
    address.setName(name);
    List<String> location = address.getLocation();
    location.add("1 " + forename + "'s Street");
    location.add(forename + "'s Town");
    address.setCode("123");
    return address;
  }

  private String assertNotEmpty(String id, String s) {
    if (s == null || s.isEmpty()) {
      try {
        SOAPFactory fac = SOAPFactory.newInstance();
        SOAPFault sf =
            fac.createFault("Illegal argument: " + id, new QName(
                SOAPConstants.URI_NS_SOAP_1_1_ENVELOPE, "Client"));
        throw new SOAPFaultException(sf);
      } catch (SOAPException e) {
        throw new IllegalStateException(e);
      }
    }
    return s;
  }
}
