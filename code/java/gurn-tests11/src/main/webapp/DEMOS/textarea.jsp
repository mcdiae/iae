<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="f" uri="http://java.sun.com/jsf/core"%>
<%@ taglib prefix="h" uri="http://java.sun.com/jsf/html"%>
<%@ taglib prefix="g" uri="http://gurn/alpha"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Input</title>
</head>
<body>
<a href="${pageContext.request.contextPath}">home</a>
<br>

<f:view>
	<h:form>
		<g:input jsf-tag="textarea"
			jsf-valueChangeListener="#{testValue.change}"
			jsf-binding="#{components.in}"
			jsf-in="#{param[components.in.clientId]}"
			name="#{components.in.clientId}" type="text"
			jsf-value="#{testValue.foo}" cols="50" rows="10"><h:outputText 
			value="#{testValue.foo}" /></g:input>
		<h:commandButton value="submit" />
		<h:messages />
	</h:form>
</f:view>
</body>
</html>