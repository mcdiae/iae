<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="f" uri="http://java.sun.com/jsf/core"%>
<%@ taglib prefix="h" uri="http://java.sun.com/jsf/html"%>
<%@ taglib prefix="be" uri="http://gurn/alpha"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Command</title>
</head>
<body>
<a href="${pageContext.request.contextPath}">home</a>

Tests the binding bean

<f:view>
	<h:form id="frm">
		<h:commandButton id="cmd" binding="#{components.cmd}" value="#{components.cmd.id}" />
	</h:form>
</f:view>
</body>
</html>