<?xml version="1.0" encoding="UTF-8"?>

  <!--
    Copyright (c) 2009 McDowell Permission is hereby granted, free of
    charge, to any person obtaining a copy of this software and
    associated documentation files (the "Software"), to deal in the
    Software without restriction, including without limitation the
    rights to use, copy, modify, merge, publish, distribute, sublicense,
    and/or sell copies of the Software, and to permit persons to whom
    the Software is furnished to do so, subject to the following
    conditions: The above copyright notice and this permission notice
    shall be included in all copies or substantial portions of the
    Software. THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY
    KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE
    WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND
    NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS
    BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN
    ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN
    CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
    SOFTWARE.
  -->

  <!-- XSLT file to create tag documentation from JSP 2.1 TLD file. -->

<xsl:transform version="1.0"
  xmlns:xsl="http://www.w3.org/1999/XSL/Transform" xmlns:tld="http://java.sun.com/xml/ns/javaee">

  <xsl:template match="/">
    <html>
      <head>
        <title>JsfFormatPanel</title>
      </head>
      <body>
        <h2>Tag Documentation</h2>
        <p>
          <xsl:value-of select="tld:taglib/tld:description" />
        </p>
        <p>
          <a
            href="http://illegalargumentexception.blogspot.com/2009/08/jsf-custom-format-panel-control-for.html">more information</a>
        </p>
        <table>
          <tr>
            <th>
              URI:</th>
            <td>
              <xsl:value-of select="tld:taglib/tld:uri" />
            </td>
          </tr>
          <tr>
            <th>
              Short name:</th>
            <td>
              <xsl:value-of select="tld:taglib/tld:short-name" />
            </td>
          </tr>
          <tr>
            <th>
              Library version:</th>
            <td>
              <xsl:value-of select="tld:taglib/tld:tlib-version" />
            </td>
          </tr>
        </table>
        <xsl:for-each select="tld:taglib/tld:tag">
          <h3>
            Tag:
            <xsl:value-of select="tld:name" />
          </h3>
          <p>
            <xsl:value-of select="tld:description" />
          </p>
          <h4>Attributes</h4>
          <table border="1">
            <tr>
              <th>Name</th>
              <th>Required</th>
              <th>Description</th>
              <th>Type</th>
            </tr>
            <xsl:for-each select="tld:attribute">
              <tr>
                <td>
                  <xsl:value-of select="tld:name" />
                </td>
                <td>
                  <xsl:value-of select="tld:required" />
                </td>
                <td>
                  <xsl:value-of select="tld:description" />
                </td>
                <td>
                  <xsl:value-of select="tld:deferred-value/tld:type" />
                </td>
              </tr>
            </xsl:for-each>
          </table>
        </xsl:for-each>
      </body>
    </html>
  </xsl:template>

</xsl:transform>