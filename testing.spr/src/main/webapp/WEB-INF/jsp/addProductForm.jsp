<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"  %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1" />
<title>Insert title here</title>
</head>
<body>
	<form:form modelAttribute="product" action="add" method="post">
		<label for="id">Product id:</label>
		<form:input name="id" path="id"/><br/>
		
		<label for="itemName">Item Name:</label>
		<form:input type="text" name="itemName" path="itemName" /><br />
		
		<label for="price">Price:</label>
		<form:input name="price" path="price" /><br />
		
		<form:select path="category.id" items="${categories}"/>
		
		
	</form:form>
</body>
</html>