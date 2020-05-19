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
		</form:select>
		
		<br><br>
		
		Favourite language: <br>
		Java <form:radiobutton path="favoriteLanguage" value="Java"/>
		C# <form:radiobutton path="favoriteLanguage" value="C#"/>
		PHP <form:radiobutton path="favoriteLanguage" value="PHP"/>
		Python <form:radiobutton path="favoriteLanguage" value="Python"/>
		
		<br>
		<input type="submit" value="Submit"/>
		
	</form:form>

	
</body>

</html>