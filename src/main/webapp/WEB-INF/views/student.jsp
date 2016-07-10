<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ page session="false" %>
<html>
<head>
	<title>Student Page</title>
	<style type="text/css">
		.tg  {border-collapse:collapse;border-spacing:0;border-color:#ccc;}
		.tg td{font-family:Arial, sans-serif;font-size:14px;padding:10px 5px;border-style:solid;border-width:1px;overflow:hidden;word-break:normal;border-color:#ccc;color:#333;background-color:#fff;}
		.tg th{font-family:Arial, sans-serif;font-size:14px;font-weight:normal;padding:10px 5px;border-style:solid;border-width:1px;overflow:hidden;word-break:normal;border-color:#ccc;color:#333;background-color:#f0f0f0;}
		.tg .tg-4eph{background-color:#f9f9f9}
	</style>
</head>
<body>
<h1>
	Add a Student
</h1>

<c:url var="addAction" value="/student/add" ></c:url>

<form:form action="${addAction}" commandName="student">
<table>
	<c:if test="${!empty student.firstName}">
	<tr>
		<td>
			<form:label path="id">
				<spring:message text="ID"/>
			</form:label>
		</td>
		<td>
			<form:input path="id" readonly="true" size="8"  disabled="true" />
			<form:hidden path="id" />
		</td> 
	</tr>
	</c:if>
	<tr>
		<td>
			<form:label path="ssn">
				<spring:message text="SSN"/>
			</form:label>
		</td>
		<td>
			<form:input path="ssn" />
		</td> 
	</tr>
	<tr>
		<td>
			<form:label path="firstName">
				<spring:message text="First Name"/>
			</form:label>
		</td>
		<td>
			<form:input path="firstName" />
		</td> 
	</tr>
	<tr>
		<td>
			<form:label path="lastName">
				<spring:message text="Last Name"/>
			</form:label>
		</td>
		<td>
			<form:input path="lastName" />
		</td> 
	</tr>
	<tr>
		<td>
			<form:label path="gender">
				<spring:message text="Gender"/>
			</form:label>
		</td>
		<td>
			<form:input path="gender" />
		</td> 
	</tr>
	<tr>
		<td>
			<form:label path="phoneNumber">
				<spring:message text="Phone Number"/>
			</form:label>
		</td>
		<td>
			<form:input path="phoneNumber" />
		</td> 
	</tr>
	<tr>
		<td>
			<form:label path="dateOfBirth">
				<spring:message text="Date of Birth"/>
			</form:label>
		</td>
		<td>
			<form:input path="dateOfBirth" />
		</td> 
	</tr>
	<tr>
		<td>
			<form:label path="momName">
				<spring:message text="Mom's Name"/>
			</form:label>
		</td>
		<td>
			<form:input path="momName" />
		</td> 
	</tr>
	<tr>
		<td>
			<form:label path="dadName">
				<spring:message text="Dad's Name"/>
			</form:label>
		</td>
		<td>
			<form:input path="dadName" />
		</td> 
	</tr>
	<tr>
		<td colspan="2">
			<c:if test="${!empty student.firstName}">
				<input type="submit"
					value="<spring:message text="Edit Student"/>" />
			</c:if>
			<c:if test="${empty student.firstName}">
				<input type="submit"
					value="<spring:message text="Add Student"/>" />
			</c:if>
		</td>
	</tr>
</table>	
</form:form>
<br>
<h3>Student List</h3>
<c:if test="${!empty listStudents}">
	<table class="tg">
	<tr>
		<th width="80">Student ID</th>
		<th width="80">Student SSN</th>
		<th width="120">Student First Name</th>
		<th width="120">Student Last Name</th>
		<th width="120">Student Gender</th>
		<th width="120">Student Phone Number</th>
		<th width="120">Student Date of Birth</th>
		<th width="120">Student's Mom's Name</th>
		<th width="120">Student's Dad's Name</th>
		<th width="60">Edit</th>
		<th width="60">Delete</th>
	</tr>
	<c:forEach items="${listStudents}" var="student">
		<tr>
			<td>${student.id}</td>
			<td>${student.ssn}</td>
			<td>${student.firstName}</td>
			<td>${student.lastName}</td>
			<td>${student.gender}</td>
			<td>${student.phoneNumber}</td>
			<td>${student.dateOfBirth}</td>
			<td>${student.momName}</td>
			<td>${student.dadName}</td>
			<td><a href="<c:url value='/edit/${student.id}' />" >Edit</a></td>
			<td><a href="<c:url value='/remove/${student.id}' />" >Delete</a></td>
		</tr>
	</c:forEach>
	</table>
</c:if>
</body>
</html>
