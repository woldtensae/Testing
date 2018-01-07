<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Using RequestParam</h1>
	<c:forEach var="product" items="${products}" >
		Product-Value: ${product.value.itemName}
		<a href="<spring:url value="/product?id=${product.key}" />"> Detail</a>
	</c:forEach>
	
	<!-- only possible for known values -->
	<spring:url value="/product" var="product_id">
		<spring:param name="id" value="${product.key}" />
	</spring:url>
	
	<h1>Using pathVariable</h1>
	 <c:forEach var="product" items="${products}" >
		Product-Value: ${product.value.itemName}
		<a href="<spring:url value="/product/${product.key}" />"> Detail</a>
	</c:forEach>
</body>
</html>