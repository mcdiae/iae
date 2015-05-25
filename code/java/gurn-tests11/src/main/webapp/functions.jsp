<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="f" uri="http://java.sun.com/jsf/core"%>
<%@ taglib prefix="h" uri="http://java.sun.com/jsf/html"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<a href="${pageContext.request.contextPath}">home</a>

<f:view>
	<h:outputText id="testActionUrl" value="#{gurn.actionUrl['/foo']}" />
	<h:outputText id="testResourceUrl" value="#{gurn.resourceUrl['/foo']}" />
	<h:outputText id="testNamespace" value="#{gurn.namespace['foo']}" />
	<h:outputText id="testIsUserInRole" value="#{gurn.isUserInRole['foo']}" />
	<h:outputText binding="#{components.foo}" id="testBinding"
		value="#{be.clientId[components.foo]}" />

	<h:outputText id="testXml" escape="false"
		value="#{gurn.xml[functionBean.xmlData]}" />
	<h:outputText id="testJsString"
		value="#{gurn.jsString[functionBean.jsData]}" />
	<h:outputText id="testSafeId"
		value="#{gurn.safeId[functionBean.unsafeId]}" />
</f:view>
</body>
</html>