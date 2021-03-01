<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>

<head>

<title>Student Registration Form</title>

</head>

<body>

	<form:form action="processForm" modelAttribute="student">
	
	First Name: <form:input path="firstname"/>
	<br><br>
	
	Last Name: <form:input path="lastname"/>
	<br><br>	
	
	<input type="submit" value="Submit">
	
	</form:form>
	
</body>

</html>