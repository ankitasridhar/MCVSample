<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" 
	"http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Registration Success</title>
</head>
<body>
	<div align="center">
		<table border="0">
			<tr>
				<td colspan="2" align="center"><h2>Get request Succeeded!</h2></td>
			</tr>
			<tr>
				<td colspan="2" align="center">
					<h3>Here's the review of your details:</h3>
				</td>
			</tr>
			<tr>
				<td>Contact id:</td>
				<td>${contactForm.contactId}</td>
			</tr>
			
			<tr>
				<td>First Name:</td>
				<td>${contactForm.firstName}</td>
			</tr>

			<tr>
				<td>Middle Name:</td>
				<td>${contactForm.middleName}</td>
			</tr>

			<tr>
				<td>Last Name:</td>
				<td>${contactForm.lastName}</td>
			</tr>

			<tr>
				<td>Birthday:</td>
				<td>${contactForm.birthdate}</td>
			</tr>

			<tr>
				<td>E-mail:</td>
				<td>${contactForm.email}</td>
			</tr>

			<tr>
				<td>Work Phone:</td>
				<td>${contactForm.workPhone}</td>
			</tr>

			<tr>
				<td>Personal Phone:</td>
				<td>${contactForm.personalPhone}</td>
			</tr>

			<tr>
				<td>Company:</td>
				<td>${contactForm.company}</td>
			</tr>

			<tr>
				<td>Street:</td>
				<td>${contactForm.street}</td>
			</tr>


			<tr>
				<td>City:</td>
				<td>${contactForm.city}</td>
			</tr>


			<tr>
				<td>State:</td>
				<td>${contactForm.state}</td>
			</tr>

			<tr>
				<td>Zip:</td>
				<td>${contactForm.zip}</td>
			</tr>

			<tr>
				<td>Country:</td>
				<td>${contactForm.country}</td>
			</tr>

			<tr>
				<td>Profile Image:</td>
				<td>${contactForm.profileImage}</td>
			</tr>
		</table>
	</div>
</body>
</html>