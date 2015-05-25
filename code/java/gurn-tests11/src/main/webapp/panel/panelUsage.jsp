<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="f" uri="http://java.sun.com/jsf/core"%>
<%@ taglib prefix="h" uri="http://java.sun.com/jsf/html"%>
<%@ taglib prefix="g" uri="http://gurn/alpha"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<a href="${pageContext.request.contextPath}">home</a>
<br>

<f:view>
	<g:panel jsf-tag="a" href="#{gurn.resourceUrl['/command/command.faces']}">anchor</g:panel>
	<br>
	<g:panel jsf-tag="div" style="color: red; border-style: solid; border-width: 1px">div</g:panel>
	<br>
    <g:panel jsf-tag="span" style="color: blue; border-style: solid; border-width: 1px">span</g:panel>
    <br>
    <g:panel jsf-tag="ul" style="color: green">
      <g:panel jsf-tag="li">unordered</g:panel>
      <g:panel jsf-tag="li">list</g:panel>
    </g:panel>
</f:view>
</body>
</html>