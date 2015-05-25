<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="f" uri="http://java.sun.com/jsf/core"%>
<%@ taglib prefix="h" uri="http://java.sun.com/jsf/html"%>
<%@ taglib prefix="g" uri="http://gurn/alpha"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>JSP Page</title>
</head>
<body>
<f:view>
	<g:repeat jsf-value="#{utils.pages}" jsf-var="row">
		<g:panel jsf-tag="a" href="#{row}">
			<h:outputText value="#{row}" />
			<g:panel jsf-tag="br" />
		</g:panel>
	</g:repeat>
</f:view>
</body>
</html>
