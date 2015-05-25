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

<a href="#" onclick="toggle();">toggle</a>

<f:view>
	<h:form>
		<h:panelGrid id="quote" binding="#{components.quote}">
			<h:outputText value="Comedy is simply a funny way of being serious." />
			<h:outputText value="Peter Ustinov" />
		</h:panelGrid>
	</h:form>

<g:template jsf-tag="script" type="text/javascript">
function toggle() {
  var quote = document.getElementById('#{gurn.clientId[components.quote]}');
  if(quote.style.display === 'none') {
    quote.style.display = 'inline';
  } else {
    quote.style.display = 'none';
  }
}
</g:template>
</f:view>
</body>
</html>