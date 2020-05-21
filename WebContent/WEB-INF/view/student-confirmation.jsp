<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>

<head>
	<title>Student Confirmed</title>
</head>
<body>
	Confirmed student: ${student.firstName} ${student.lastName}
	
	<br>
	
	Country: ${student.country}
	<br>
	Fav language: ${student.favoriteLanguage}
	<br>
	Operating systems: 
	<ul>
		<c:forEach var="item" items="${student.operatingSystems}">
			<li>${item}</li>
		</c:forEach>
	</ul>
</body>

</html>