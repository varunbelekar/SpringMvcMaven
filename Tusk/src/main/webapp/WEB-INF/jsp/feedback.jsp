<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h3>Feedback Form</h3>
<form:form method="get" action="addFeedback">
	Enter name:<br>
	<form:input path="name"/><br>
	Enter email address:<br>
	<form:input path="email"/><br>
	Enter name:<br>
	<form:select path="website">
		<form:option value="Amazon" label="Amazon"></form:option>
		<form:option value="Google" label="Google"></form:option>
		<form:option value="Flipkart" label="Flipkart"></form:option>
	</form:select>
	Enter code:<br>
	<form:input path="code"/><br>
	Enter message:<br>
	<form:textarea path="message"/><br>
	Gender:<br>
	Male:<form:radiobutton path="gender" value="male"/><br>
	Female:<form:radiobutton path="gender" value="female"/><br>
	
	<input type="submit" value="submit">
</form:form>
</body>
</html>