<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Broadcast Message</title>
<script src=asset/jquery-2.2.1.min.js></script>
		<script src=asset/bootstrap.js></script>
		<link href=asset/bootstrap.min.css rel=stylesheet >		
<script type="text/javascript">
	$('document').ready(function(){
		
		
		
	});

</script>
</head>
<body>

		<%  HttpSession ses=request.getSession();
			String branch=ses.getValue("SFBRANCH").toString();
		%>
		<form action=SendBulkSMS>
		
		<center><table>
		<tr><td>Branch:</td><td><input type=text name=branch value=<% out.println(branch); %> readonly></td></tr>
		
		<tr><td>Receiver:</td><td><select name=receiver><option value="parent">All Parent</option><option value=student>All Student</option></select></td></tr>
		<tr><td>Message:</td><td><textarea rows=5 cols=40 name=msg class=form-control required></textarea></td></tr>
		<tr><td></td><td><input type=submit class=btn btn-default value=Send><input class=btn btn-default type=reset ></td></tr>
		</table></center></form>
</body>
</html>