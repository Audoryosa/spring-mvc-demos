<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>

<head>
	<title>Customer Registration Form</title>
	
	<style>
		.error{
			color:red;
			font-style: italic;
			font-weight: bold;
		}
		
		hr{
			text-align: left;
		}
	</style>
	
</head>

<body>
	
	<form:form action="processForm" modelAttribute="customerModel">
	
	<p>
		<i>Fill our the form. Asterisk (*) means required.</i>
		<br><br>
	</p>
	
	<p>
		First name: <form:input path="firstName"/>
		<br><br>
		Last name (*): <form:input path="lastName"/>
		<form:errors path="lastName" cssClass="error"/>
		<br><br>
		Free passes (*): <form:input path="freePasses"/>
		<form:errors path="freePasses" cssClass="error"/>
		<br><br>
		Course code: <form:input path="courseCode"/>
		<form:errors path="courseCode" cssClass="error"/>
		<br><br>
	</p>
	
	<input type="submit" value="Submit form"/>
	</form:form>
	
	<hr width="50%">
	
</body>
</html>