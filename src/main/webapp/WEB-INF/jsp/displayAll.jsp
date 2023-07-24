<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>


<h1>Employee List</h1>

	<select name="" id="">
		<c:forEach var="empData" items="${empList }">
		     <option value="${empData.id }">${empData.name }</option>
		</c:forEach>
	</select>

	<table border="1" cellpadding="10">
		<tr>
			<th>Id</th>
			<th>Name</th>
			<th>Email Id</th>
			<th>Mobile No.</th>
			<th>City</th>
			<th>State</th>
			<th>Address</th>
		</tr>
		
		<c:forEach var="empData" items="${empList }">
		
			<tr>
				<td>${empData.id }</td>
				<td>${empData.name }</td>
				<td>${empData.emailId }</td>
				<td>${empData.mobile }</td>
				<td>${empData.city }</td>
				<td>${empData.state }</td>
				<td>${empData.address }</td>
			</tr>
		
		</c:forEach>
		
	</table>
</body>
</html>