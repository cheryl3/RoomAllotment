<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Room Allotment</title>
</head>
<body>
<form:form method="POST"  modelAttribute="allotmentBean" action="saveAllotment">
	<h2><u>Room Allotment Details</u></h2>
		<table>
		
			 <tr>
				
				<td><form:input path="allotment_id" type="hidden" /></td>
			</tr> 
			
			 <tr>
				<td>Company Name:</td>
				<td><form:select path="company_name">
						<%-- <form:option value="0" label="Select" /> --%>
						<form:option value="TCS"  label="TCS" />
						<form:option value="Accenture" label="Accenture" />
						<form:option value="Reliance"  label="Reliance" />
						<form:option value="Godrej" label="Godrej" />
						
					</form:select></td>
			</tr> 
			
			<tr>
				<td>Round No. :</td>
				<td><form:input path="round_no" /></td>
			</tr>
			
			<tr>
				<td>Room No. :</td>
				<td><form:input path="room_no" /></td>
			</tr>
			
			<tr>
				<td>Description :</td>
				<td><form:textarea path="job_description" /></td>
			</tr>
			
			<tr>
				<td>Drive date :</td>
				<td><form:input path="drive_date" /></td>
			</tr>
			
			<tr></tr><tr></tr>
			
			<tr>
			
				<td colspan="2"><input type="submit" value="Save"></td>
			</tr>
		</table>
	</form:form>

</body>
</html>
