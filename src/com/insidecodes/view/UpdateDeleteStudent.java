package com.insidecodes.view;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.insidecodes.dao.StudentDAO;

/**
 * Servlet implementation class UpdateDeleteStudent
 */
@WebServlet("/UpdateDeleteStudent")
public class UpdateDeleteStudent extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpdateDeleteStudent() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out=response.getWriter();
		try{
			String sid=request.getParameter("sid");
			ResultSet rs=StudentDAO.DisplayById(sid);
			if(rs.next())
			{
				 out.println("<html>");
					out.println("<head><script src=asset/jquery-2.2.1.min.js></script>");
					out.println("<script src=\"asset/bootstrap.js\"></script>");
					out.println("<link href=\"asset/bootstrap.min.css\" rel=\"stylesheet\" ></head>");
					out.println("<form action=FinalEditDeleteStudent  method=post enctype=multipart/form-data>");
			       out.println("<table cellpadding=15 cellspacing=15><tr><td>");
			       out.println("<table><caption><h3>Student Register</h3></caption>");
			       out.println("<tr><td><b><i>Student Id:</i></b></td><td><input type=text class=form-control name=studentid size=40 value="+rs.getString(1)+"></td></tr>");
			       out.println("<tr><td><b><i>Name:</i></b></td><td><input type=text class=form-control  name=studentname size=40 value=\'"+rs.getString(2)+"\'></td></tr>");
			       out.println("<tr><td><b><i>Father's Name:</i></b></td><td><input type=text  class=form-control name=fathername size=40 value=\'"+rs.getString(3)+"\'></td></tr>");
			       out.println("<tr><td><b><i>Birth Date:</i></b></td><td><input type=text name=dob size=40  class=form-control value="+rs.getString(4)+"></td></tr>");
			       
			       
			       out.println("<tr><td><b><i>Address:</i></b></td><td><textarea class=form-control   name=address rows=3 cols=40>"+rs.getString(5)+"</textarea></td></tr>");
			       out.println("<tr><td><b><i>State:</i></b></td><td><input type=text name=state  class=form-control size=40 value=\'"+rs.getString(6)+"\'></td></tr>");
			       out.println("<tr><td><b><i>City:</i></b></td><td><input type=text name=city size=40  class=form-control value="+rs.getString(7)+"></td></tr>");
			      
			       out.println("<tr><td><b><i>Phone No:</i></b></td><td><input type=text name=phone size=40 class=form-control  value="+rs.getString(8)+"></td></tr>");
			       out.println("<tr><td><b><i>Email</i></b></td><td><input type=text name=email size=40 class=form-control  value="+rs.getString(9)+"></td></tr>");
			       out.println("<tr><td><b><i>ContactNoFather:</i></b></td><td><input type=text name=contactnofather class=form-control  size=40 value="+rs.getString(10)+"></td></tr>");
			       out.println("<tr><td><b><i>ContactNoStudent:</i></b></td><td><input type=text name=contactnostudent size=40 class=form-control  value="+rs.getString(11)+"></td></tr>");
			       out.println("<tr><td><b><i>CurrentAddress:</i></b></td><td><textarea  name=currentaddress rows=3 class=form-control  cols=40>"+rs.getString(12)+"</textarea></td></tr>");
			       out.println("<tr><td><b><i>Branch:</i></b></td><td><input type=text  name=branch class=form-control  value="+rs.getString(13)+"></td></tr>");
			       out.println("<tr><td><b><i>Semester:</i></b></td><td><input type=text name=semester size=40 class=form-control  value="+rs.getString(14)+"></td></tr>");
			      
			        
			       out.println("<tr><td><input type=submit class=\"btn btn-default\"  name=btn value=Edit>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input class=\"btn btn-default\" type=submit name=btn value=Delete></td></tr>");
			       out.println("</table></td>");
			       out.println("<th valign=middle><img src=pic/"+rs.getString(15)+" width=250 height=250><br><br><input type=file name=photograph></th></tr></table>");
				
				
				
			}
			else
			{
				out.println("not found...");
			}
			}catch(Exception e)
			{out.println(e);
				
			}
	}

}
