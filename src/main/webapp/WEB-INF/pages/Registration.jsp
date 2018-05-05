<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Registration</title>
</head>
<body>
	<div align="center">
		<form:form action="/SpringMVC/jobTargets/contact" method="POST"
			commandName="contactForm">
			<table border="0">
				<tr>
					<td colspan="2" align="center"><h2>Spring MVC Form Demo -
							Registration</h2></td>
				</tr>
				<tr>
					<td>First Name:</td>
					<td><form:input path="firstName" /></td>
				</tr>

				<tr>
					<td>Middle Name:</td>
					<td><form:input path="middleName" /></td>
				</tr>

				<tr>
					<td>Last Name:</td>
					<td><form:input path="lastName" /></td>
				</tr>

				<tr>
					<td>Birthday (yyyy-mm-dd):</td>
					<td><form:input path="birthdate" /></td>
				</tr>

				<tr>
					<td>E-mail:</td>
					<td><form:input path="email" /></td>
				</tr>

				<tr>
					<td>Work Phone:</td>
					<td><form:input path="workPhone" /></td>
				</tr>


				<tr>
					<td>Personal Phone:</td>
					<td><form:input path="personalPhone" /></td>
				</tr>

				<tr>
					<td>Company:</td>
					<td><form:input path="company" /></td>
				</tr>

				<tr>
					<td>Street:</td>
					<td><form:input path="street" /></td>
				</tr>

				<tr>
					<td>City:</td>
					<td><form:input path="city" /></td>
				</tr>

				<tr>
					<td>State:</td>
					<td><form:input path="state" /></td>
				</tr>

				<tr>
					<td>Zip:</td>
					<td><form:input path="zip" /></td>
				</tr>
				<tr>
					<td>Country:</td>
					<td><form:input path="country" /></td>
				</tr>

				<tr>
					<td>Profile Image:</td>
					<td><form:input path="profileImage" /></td>
				</tr>
				<tr>
					<td colspan="2" align="center"><input type="submit"
						value="Submit" /></td>
				</tr>
			</table>
		</form:form>
	</div>
</body>
</html>