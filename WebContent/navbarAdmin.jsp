<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
 <script src="asset/jquery-2.2.1.min.js"></script>
 <script src="asset/bootstrap.js"></script>
<link href="asset/bootstrap.min.css" rel="stylesheet" >

<link rel="shortcut icon" href="/StudentRFID/favicon.ico">
<link rel="icon" href="/StudentRFID/favicon.ico">
</head>
<body>
<% HttpSession ses=request.getSession();  try{  %>
 <nav class="navbar navbar-default">
  <div class="container-fluid">
    <!-- Brand and toggle get grouped for better mobile display -->
    <div class="navbar-header">
      <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1" aria-expanded="false">
        <span class="sr-only">Toggle navigation</span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
      </button>
      <a class="navbar-brand" href="#">Admin ID:<% out.println(ses.getValue("SAID").toString()); %></a>
    </div>

    <!-- Collect the nav links, forms, and other content for toggling -->
    <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
      <ul class="nav navbar-nav">
   
        <li><a href=FacultyInterface target=mw>Register Faculty</a></li>
        <li class="dropdown">
          <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">drop-down <span class="caret"></span></a>
          <ul class="dropdown-menu">
            <li><a href=DisplayAllFaculties.jsp target=mw>Display All Faculty</a></li>
          
            
            <li role="separator" class="divider"></li>
           
          </ul>
        </li>
      </ul>
     
      <ul class="nav navbar-nav navbar-right">
      <li><a href="#"><% out.println(ses.getValue("LDATE").toString()); %></a></li>
        <li><a href=AdminLogout>LOGOUT</a></li>
        <li class="dropdown">
          <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">Account Settings <span class="caret"></span></a>
          <ul class="dropdown-menu">
            <li><a href="AdminUpdateProfile" target=mw>Update Profile</a></li>
            
          </ul>
        </li>
      </ul>
    </div><!-- /.navbar-collapse -->
  </div><!-- /.container-fluid -->
</nav>
    
</body>
</html>
<%  }catch(Exception e){ response.sendRedirect("FacultyLogin");} %>