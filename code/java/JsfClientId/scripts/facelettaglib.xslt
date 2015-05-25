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

  <!-- XSLT file to create Facelet taglib descriptor -->

<xsl:transform version="1.0"
  xmlns:xsl="http://www.w3.org/1999/XSL/Transform" xmlns:tld="http://java.sun.com/xml/ns/javaee"
  xmlns:jsf="http://java.sun.com/xml/ns/javaee" xmlns:src="urn:src"
  exclude-result-prefixes="tld jsf src">

  <xsl:output method="xml" indent="yes"
    doctype-public="-//Sun Microsystems, Inc.//DTD Facelet Taglib 1.0//EN"
    doctype-system="http://java.sun.com/dtd/facelet-taglib_1_0.dtd" />

  <xsl:template match="/">
    <facelet-taglib xmlns="http://java.sun.com/JSF/Facelet">
      <namespace>
        <xsl:value-of select="src:facesrc/tld:taglib/tld:uri" />
      </namespace>

      <xsl:for-each select="src:facesrc/jsf:faces-config/jsf:component">
        <tag>
          <tag-name>
            <xsl:value-of select="jsf:display-name" />
          </tag-name>
          <component>
            <component-type>
              <xsl:value-of select="jsf:component-class" />
            </component-type>
          </component>
        </tag>
      </xsl:for-each>

      <xsl:for-each select="src:facesrc/tld:taglib/tld:function">
        <function>
          <function-name>
            <xsl:value-of select="tld:name" />
          </function-name>
          <function-class>
            <xsl:value-of select="tld:function-class" />
          </function-class>
          <function-signature>
            <xsl:value-of select="tld:function-signature" />
          </function-signature>
        </function>
      </xsl:for-each>

    </facelet-taglib>
  </xsl:template>
</xsl:transform>