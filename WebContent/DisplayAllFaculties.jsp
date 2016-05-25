<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ page import="java.util.*" %>
<%@ page import="com.insidecodes.dao.FacultyDAO" %>
<%@ page import="java.sql.ResultSet" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>All Student Attendance</title>
<link rel="stylesheet" type="text/css" href="asset/bower_components/datatables.net-dt/css/custom.css">
<link href="asset/bootstrap.min.css" rel="stylesheet" >
<script src=asset/bower_components/jquery/dist/jquery.min.js type="text/javascript"></script>
<script src="asset/bootstrap.js"></script>

<script src=asset/bower_components/datatables.net/js/jquery.dataTables.min.js type="text/javascript"></script>
<script type="text/javascript" src=asset/bower_components/datatables.net/js/initilize.js></script>
</head>
<body>
<% try{ResultSet rs=FacultyDAO.DisplayAll(); %>
  
<% if(rs.next())
{
	out.println("<table id=\"table_id\" class=\"display cell-border .dt-table\"  cellspacing=\"0\" width=\"100%\">");
    out.println("<thead><tr><th>FacultyId<br>Name</th><th>Emailid<br>contactno</th><th>mobileno</th><th>qualification</th><th>Designation</th><th>branch</th><th>PhotoGraph</th><th>Update</th></tr></thead><tbody>");
    do
    { 
    
    out.println("<tr><td>"+rs.getString(1)+"<br>"+rs.getString(2)+"</td><td>"+rs.getString(3)+"<br>"+rs.getString(4)+"</td><td>"+rs.getString(5)+"</td><td>"+rs.getString(6)+"</td><td>"+rs.getString(7)+"</td><td>"+rs.getString(8)+"</td><td><img src='facultypic/"+rs.getString(10)+"' height=50 width=50 ></td><td><a href=UpdateDeleteFaculty?fid="+rs.getString(1)+">Edit/Delete</a></td></tr>");	
    	
    	
    }while(rs.next());
	   rs.close();
	   out.println("</tbody></table>");
   
} else
   {
	out.println("Record Not Found..");   
   }
  


}catch(Exception e)
{
System.out.println(e);
}

 %>

</body>
</html>