<%@ page import="com.insidecodes.dao.StudentDAO" %>
<%@ page import="java.sql.ResultSet" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>

<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta name="description" content="A Components Mix Bootstarp 3 Admin Dashboard Template">
<meta name="author" content="Westilian">
<title>DisplayAllStudents</title>
<link rel="stylesheet" href="asset/css/font-awesome.css" type="text/css">
<link rel="stylesheet" href="asset/css/bootstrap.css" type="text/css">
<link rel="stylesheet" href="asset/css/animate.css" type="text/css">
<link rel="stylesheet" href="asset/css/waves.css" type="text/css">
<link rel="stylesheet" href="asset/css/layout.css" type="text/css">
<link rel="stylesheet" href="asset/css/components.css" type="text/css">
<link rel="stylesheet" href="asset/css/plugins.css" type="text/css">
<link rel="stylesheet" href="asset/css/common-styles.css" type="text/css">
<link rel="stylesheet" href="asset/css/pages.css" type="text/css">
<link rel="stylesheet" href="asset/css/responsive.css" type="text/css">
<link rel="stylesheet" href="asset/css/matmix-iconfont.css" type="text/css">
<link href="http://fonts.googleapis.com/css?family=Roboto:400,300,400italic,500,500italic" rel="stylesheet" type="text/css">
<link href="http://fonts.googleapis.com/css?family=Open+Sans:400italic,600italic,400,600" rel="stylesheet" type="text/css">

</head>
<body>
<div class="widget-container">
<% 	try{
			ResultSet rs=StudentDAO.DisplayAll();
			out.println("<html>");
			out.println("<head><script src=asset/jquery-2.2.1.min.js></script>");
			out.println("<script src=\"asset/bootstrap.js\"></script>");
			out.println("<link href=\"asset/bootstrap.min.css\" rel=\"stylesheet\" ></head>");
			if(rs.next())
			{
				%>
				<div class="col-md-12"><div class="td-content"><table aria-describedby="DataTables_Table_1_info" role="grid" id="DataTables_Table_1" class="table dt-table dataTable dtr-inline">
									<thead>
									<tr role="row"><th aria-sort="ascending" aria-label="
											StudentId<br>Name
										: activate to sort column descending" style="width: 193px;" colspan="1" rowspan="1" aria-controls="DataTables_Table_1" tabindex="0" class="sorting_asc">
											StudentId<br>Name
										</th><th aria-label="
											FatherName
										: activate to sort column ascending" style="width: 313px;" colspan="1" rowspan="1" aria-controls="DataTables_Table_1" tabindex="0" class="sorting">
											FatherName
										</th><th aria-label="
											DOB
										: activate to sort column ascending" style="width: 141px;" colspan="1" rowspan="1" aria-controls="DataTables_Table_1" tabindex="0" class="sorting">
											DOB
										</th><th aria-label="
											Address<br>City<br>State
										: activate to sort column ascending" style="width: 70px;" colspan="1" rowspan="1" aria-controls="DataTables_Table_1" tabindex="0" class="sorting">
											Address<br>City<br>State
										</th><th aria-label="
											Phone no:
										: activate to sort column ascending" style="width: 134px;" colspan="1" rowspan="1" aria-controls="DataTables_Table_1" tabindex="0" class="sorting">
											Phone no:
										</th><th aria-label="
											Email
										: activate to sort column ascending" style="width: 108px;" colspan="1" rowspan="1" aria-controls="DataTables_Table_1" tabindex="0" class="sorting">
											Email
										</th><th aria-label="
											ContactNo Father<br>Student
										: activate to sort column ascending" style="width: 108px;" colspan="1" rowspan="1" aria-controls="DataTables_Table_1" tabindex="0" class="sorting">
											ContactNo Father<br>Student
										</th><th aria-label="
											CurrentAddress
										: activate to sort column ascending" style="width: 108px;" colspan="1" rowspan="1" aria-controls="DataTables_Table_1" tabindex="0" class="sorting">
											CurrentAddress
										</th><th aria-label="
											Branch<br>Semester
										: activate to sort column ascending" style="width: 108px;" colspan="1" rowspan="1" aria-controls="DataTables_Table_1" tabindex="0" class="sorting">
											Branch<br>Semester
										</th><th aria-label="
											Photograph
										: activate to sort column ascending" style="width: 108px;" colspan="1" rowspan="1" aria-controls="DataTables_Table_1" tabindex="0" class="sorting">
											Photograph
										</th><th aria-label="
											Update
										: activate to sort column ascending" style="width: 108px;" colspan="1" rowspan="1" aria-controls="DataTables_Table_1" tabindex="0" class="sorting">
											Update
										</th></tr>
									</thead>	
								<!-- 	<tfoot>
									<tr><th colspan="1" rowspan="1">
											Name
										</th><th colspan="1" rowspan="1">
											Position
										</th><th colspan="1" rowspan="1">
											Office
										</th><th colspan="1" rowspan="1">
											Age
										</th><th colspan="1" rowspan="1">
											Start date
										</th><th colspan="1" rowspan="1">
											Salary
										</th></tr>
									</tfoot> -->
                                    <tbody>
				
				
				<%   do
			    { 
			    
			    out.println("<tr><td>"+rs.getString(1)+"<br>"+rs.getString(2)+"</td><td>"+rs.getString(3)+"</td><td>"+rs.getString(4)+"</td><td>"+rs.getString(5)+"<br>"+rs.getString(7)+"<br>"+rs.getString(6)+"</td><td>"+rs.getString(8)+"</td><td>"+rs.getString(9)+"</td><td>"+rs.getString(10)+"<br>"+rs.getString(11)+"</td><td>"+rs.getString(12)+"</td><td>"+rs.getString(13)+"<br>"+rs.getString(14)+"</td><td><img src=pic/"+rs.getString(15)+" height=100 width=100 ></td><td><a href=UpdateDeleteStudent?sid="+rs.getString(1)+">Edit/Delete</a></td></tr>");	
			    	
			    	
			    }while(rs.next());
				   rs.close();
				   out.println("</table>");
			   
			} else
			   {
				out.println("Record Not Found..");   
			   }
			    out.println("</html>");
		}catch(Exception e)
		{
			out.println(e);
		}
		%>
								
						
							
                                    
                                    
                                    
                                    
                                    
                                    
                                    
                                    
                                    
                                    
                                    
                                    
                                    
                                    
                                    
                                    
                                    
                                    
                                    
                                    
                                    
                                    
                                    
                                    
                                    
                                    
                                    
                                    
                                    
                                    

                                    </tbody>
									</table>
								</div>
							</div>
							<script src="asset/js/jquery-1.11.2.min.js"></script>
<script src="asset/js/jquery-migrate-1.2.1.min.js"></script>
<!--Load Mask-->
<script src="asset/js/jquery.loadmask.js"></script>
<script src="asset/js/jRespond.min.js"></script>
<script src="asset/js/bootstrap.min.js"></script>
<script src="asset/js/nav-accordion.js"></script>
<script src="asset/js/hoverintent.js"></script>
<!--Materialize Effect-->
<script src="asset/js/waves.js"></script>
<!--iCheck-->
<script src="asset/js/icheck.js"></script>
<!--Select2-->
<script src="asset/js/select2.js"></script>
<!--jquery.mentionsInput-->
<script src="asset/js/underscore.js"></script>
<script src="asset/js/jquery.elastic.js"></script>
<script src="asset/js/jquery.events.input.js"></script>
<script src="asset/js/jquery.mentionsInput.js"></script>
<!--Text Editor-->
<script src="asset/js/summernote.min.js"></script>
<!--CHARTS-->
<script src="asset/js/chart/sparkline/jquery.sparkline.js"></script>
<script src="asset/js/chart/easypie/jquery.easypiechart.min.js"></script>
<!--Smart Resize-->
<script src="asset/js/smart-resize.js"></script>
<!--Data Tables-->
<script src="asset/js/jquery.dataTables.js"></script>
<script src="asset/js/dataTables.responsive.js"></script>
<script src="asset/js/dataTables.tableTools.js"></script>
<script src="asset/js/dataTables.bootstrap.js"></script>
<script src="asset/js/stacktable.js"></script>
<!--Layout Initialize-->
<script src="asset/js/layout.init.js"></script>
<!--Template Plugins Initialize-->
<script src="asset/js/matmix.init.js"></script>
<!--High Resolution Ready-->
<script src="asset/js/retina.min.js"></script>
</body>
</html>