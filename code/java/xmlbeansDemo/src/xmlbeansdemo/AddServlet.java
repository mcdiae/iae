/*
Copyright (c) 2008 McDowell

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
package xmlbeansdemo;

import java.net.URL;

import xmlbeansdemo.sample.Res;

import com.sun.java.xml.ns.javaee.ServletMappingType;
import com.sun.java.xml.ns.javaee.ServletType;
import com.sun.java.xml.ns.javaee.WebAppDocument;

/**
 * @author McDowell
 */
public class AddServlet {

	/**
	 * Adds a servlet definition to the web.xml
	 */
	public static void main(String[] args) throws Exception {
		final String servletName = "FooBarServlet";
		final String displayName = servletName;
		final String description = "A Foo/Bar Servlet";
		final String servletClass = "foo.BarServlet";
		final String urlPattern = "/FooBarServlet/*";
		
		URL web_xml = Res.WEB_2_5_XML;
		WebAppDocument webAppDocument = WebAppDocument.Factory.parse(web_xml);
		
		System.out.println("==BEFORE==");
		System.out.println(webAppDocument);
		System.out.println();
		
		ServletType servlet = webAppDocument.getWebApp().addNewServlet();
		servlet.addNewDescription().setStringValue(description);
		servlet.addNewDisplayName().setStringValue(displayName);
		servlet.addNewServletName().setStringValue(servletName);
		servlet.addNewServletClass().setStringValue(servletClass);
		
		ServletMappingType servletMapping = webAppDocument.getWebApp().addNewServletMapping();
		servletMapping.addNewServletName().setStringValue(servletName);
		servletMapping.addNewUrlPattern().setStringValue(urlPattern);
		
		System.out.println("==AFTER==");
		System.out.println(webAppDocument);
		System.out.println();
	}
	
}
