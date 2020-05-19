<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>

<head>
	<meta charset="ISO-8859-1">
	<title>Student Form Page</title>
</head>
<body>
	<form:form action="processForm" modelAttribute="student"> <!-- modelAttribute same as in Student.java -->
		First name: <form:input path="firstName"/> <!--  properties -->
		<br>
		Last name: <form:input path="lastName"/>
		<br>
		<input type="submit" value="Submit"/>
		
		Country:
		<form:select path="country">
			<!--  hardcoding
				<form:option value="Brazil" label="Brazil"/>
				<form:option value="France" label="France"/>
				<form:option value="Germany" label="Germany"/>
				<form:option value="India" label="India"/>
			-->
			
			<!-- using hashMap -->
			<form:options items="${student.countryOptions}"/>
			
			<br>
			<input type="submit" value="Submit"/>
		</form:select>
		
	</form:form>

	
</body>

</html>