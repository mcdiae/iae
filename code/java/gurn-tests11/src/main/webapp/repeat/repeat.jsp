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
	<h:form id="form1">
		<g:repeat jsf-tag="span" jsf-id="foo" jsf-value="#{testList.list}"
			jsf-var="row">
			<h:commandButton value="#{row.value}" action="#{row.printValue}" />
		</g:repeat>
	</h:form>
</f:view>
</body>
</html>