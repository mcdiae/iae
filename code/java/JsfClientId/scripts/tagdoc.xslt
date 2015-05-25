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
        <title>
          Tag Library:
          <xsl:value-of select="tld:taglib/tld:short-name" />
        </title>
        <link href="style.css" rel="stylesheet" type="text/css" />
      </head>
      <body>
        <h1>
          Tag Library:
          <xsl:value-of select="tld:taglib/tld:short-name" />
        </h1>
        <p>
          <xsl:value-of select="tld:taglib/tld:description" />
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

        <hr />

        <h2>Tags</h2>

        <xsl:for-each select="tld:taglib/tld:tag">
          <h3>
            Tag:
            <em>
              <xsl:value-of select="tld:name" />
            </em>
          </h3>
          <p>
            <xsl:value-of select="tld:description" />
          </p>
          <h5>Attributes</h5>
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
          <xsl:for-each select="tld:example">
            <h5>Example</h5>
            <pre>
              <xsl:value-of select="current()" />
            </pre>
          </xsl:for-each>
        </xsl:for-each>

        <hr />

        <h2>Functions</h2>

        <xsl:for-each select="tld:taglib/tld:function">
          <h3>
            Function:
            <em>
              <xsl:value-of select="tld:name" />
            </em>
          </h3>
          <p>
            <xsl:value-of select="tld:description" />
          </p>
          <h5>Parameters</h5>
          <table border="1">
            <tr>
              <th>Name</th>
              <th>Type</th>
              <th>Description</th>
            </tr>
            <xsl:for-each select="tld:function-extension/tld:param">
              <tr>
                <td>
                  <xsl:value-of select="@name" />
                </td>
                <td>
                  <xsl:value-of select="@type" />
                </td>
                <td>
                  <xsl:value-of select="@description" />
                </td>
              </tr>
            </xsl:for-each>
          </table>
          <h5>Return value</h5>
          <table border="1">
            <tr>
              <th>Type</th>
              <th>Description</th>
            </tr>
            <xsl:for-each select="tld:function-extension/tld:return">
              <tr>
                <td>
                  <xsl:value-of select="@type" />
                </td>
                <td>
                  <xsl:value-of select="@description" />
                </td>
              </tr>
            </xsl:for-each>
          </table>
          <xsl:for-each select="tld:example">
            <h5>Example</h5>
            <pre>
              <xsl:value-of select="current()" />
            </pre>
          </xsl:for-each>
        </xsl:for-each>


      </body>
    </html>
  </xsl:template>

</xsl:transform>