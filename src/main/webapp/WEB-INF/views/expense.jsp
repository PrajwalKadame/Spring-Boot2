<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="c" uri="http://www.springframework.org.tags.form" %>

<c:set var="contextRoot" value="${pageContext.request.contextPath}"/>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Add Expense</h1>
	
	<form:input path="expensename" placeholder="Enter expense name"/>
	<form:textarea path="note" placeholder="Enter note(optional)"/>
	
	<button type="submit">Add Expense</button>
	
	</form:form>
</body>
</html>