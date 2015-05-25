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
		<g:input jsf-tag="select" id="colours" name="colours"
			jsf-in="#{paramValues['colours']}"
			jsf-value="#{selectBean.selected}" multiple="true">
			<g:repeat jsf-value="#{selectBean.options}" jsf-var="_option">
				<g:template jsf-escape="#{false}">
					<option #{selectBean.selectedMap[_option]?'selected':''}
			             value="#{_option}">#{_option}</option>
				</g:template>
			</g:repeat>
		</g:input>

		<h:commandButton value="Submit" />

		<h:messages />
	</h:form>

	<h:outputText value="#{selectBean.selectedList}" />
</f:view>
</body>
</html>