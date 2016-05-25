<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title></title>
</head>
<body>
<%@page import="java.sql.ResultSet" %>
<%@page import="com.insidecodes.dao.StudentDAO" %>
<%
	String sid=request.getParameter("sid");
    ResultSet rs=StudentDAO.DisplayById(sid);
    String studentID="";
	String name="";
	String fathername="";
	String dob="";
	String branch="";
	String photograph="";
    if(rs.next())
    {
    	studentID=rs.getString(1);
    	name=rs.getString(2);
    	fathername=rs.getString(3);
    	dob=rs.getString(4);
    	branch=rs.getString(13);
    	photograph=rs.getString(15);
    }
%>

	
		<Label>StudentID:</Label><% out.print(studentID); %>&nbsp;&nbsp;&nbsp;
		<Label>Name:</Label><% out.print(name); %>&nbsp;&nbsp;&nbsp;
		<Label>FatherName:</Label><% out.print(fathername); %>&nbsp;&nbsp;&nbsp;
		<Label>Branch:</Label><% out.print(branch); %>&nbsp;&nbsp;&nbsp;
	

</body>
</html>