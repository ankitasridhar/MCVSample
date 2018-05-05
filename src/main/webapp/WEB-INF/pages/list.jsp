<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>


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
			<!-- <tr>
				<td colspan="2" align="center"><h2>Get request Succeeded!</h2></td>
			</tr>
			<tr>
				<td colspan="2" align="center">
					<h3>Here's the review of your details:</h3>
				</td>
			</tr> -->

			<thead>
				<tr>
					<th>#Contact Id</th>
					<th>First Name</th>
					<th>Middle Name</th>
					<th>Last Name</th>
					<th>Birthday</th>
					<th>Email</th>
					<th>Work Phone</th>
					<th>Personal Phone</th>
					<th>Company</th>
					<th>Street</th>
					<th>City</th>
					<th>State</th>
					<th>Zip</th>
					<th>Country</th>
					<th>ProfileImage</th>
					<th>Action</th>
				</tr>
			</thead>


			<c:forEach items="${contactForm}" var="contact" varStatus="status">

				<tr>

					<td>${contact.contactId}</td>

					<td>${contact.firstName}</td>

					<td>${contact.middleName}</td>

					<td>${contact.lastName}</td>

					<td>${contact.birthdate}</td>

					<td>${contact.email}</td>

					<td>${contact.workPhone}</td>

					<td>${contact.personalPhone}</td>

					<td>${contact.company}</td>

					<td>${contact.street}</td>

					<td>${contact.city}</td>

					<td>${contact.state}</td>

					<td>${contact.zip}</td>

					<td>${contact.country}</td>

					<td>${contact.profileImage}</td>
<%-- 
					<td><c:forEach var="contact" items="${contactForm}"
							varStatus="loop">
					${contact}
    				        <c:if test="${not loop.last}">,</c:if>
						</c:forEach></td> --%>
					<td>
						<%-- 	<spring:url value="/users/${user.id}/delete" var="deleteUrl" /> --%>
						<spring:url value="/contact/${contact.contactId}/update"
							var="updateUrl" /> <%-- <button class="btn btn-info" onclick="location.href='${userUrl}'">Query</button> --%>
						<button class="btn btn-primary"
							onclick="location.href='${updateUrl}'">Update</button> <%-- <button class="btn btn-danger"
					onclick="this.disabled=true;post('${deleteUrl}')">Delete</button> --%>
					</td>
				</tr>
			</c:forEach>
		</table>
	</div>
</body>
</html>



