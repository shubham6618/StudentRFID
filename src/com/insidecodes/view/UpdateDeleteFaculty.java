package com.insidecodes.view;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.insidecodes.dao.FacultyDAO;


/**
 * Servlet implementation class UpdateDeleteFaculty
 */
@WebServlet("/UpdateDeleteFaculty")
public class UpdateDeleteFaculty extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpdateDeleteFaculty() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out=response.getWriter();
		try{
			
			
			String fid=request.getParameter("fid");
			ResultSet rs=FacultyDAO.DisplayById(fid);
			if(rs.next())
			{
				 out.println("<html><form action=FinalEditDeleteFaculty method=post enctype=multipart/form-data>");
			       out.println("<a href=DisplayAllFaculty>List of Faculties</a><br>");
			       out.println("<table cellpadding=15 cellspacing=15><tr><td>");
			       out.println("<table><caption><h3>Faculty Register</h3></caption>");
			       out.println("<tr><td><b><i>Faculty Id:</i></b></td><td><input type=text name=facultyid size=40 value="+rs.getString(1)+"></td></tr>");
			       out.println("<tr><td><b><i>Name:</i></b></td><td><input type=text name=facultyname size=40 value=\'"+rs.getString(2)+"\'></td></tr>");
			       out.println("<tr><td><b><i>Email</i></b></td><td><input type=text name=emailid size=40 value="+rs.getString(3)+"></td></tr>");

			       out.println("<tr><td><b><i>Contact No:</i></b></td><td><input type=text name=contactno size=40 value="+rs.getString(4)+"></td></tr>");
			       out.println("<tr><td><b><i>Mobile no:</i></b></td><td><input type=text name=mobileno size=40 value="+rs.getString(5)+"></td></tr>");
			       
			       
			       
			       out.println("<tr><td><b><i>Qualifications:</i></b></td><td><textarea  name=qualifications rows=3 cols=40>"+rs.getString(6)+"</textarea></td></tr>");
			       out.println("<tr><td><b><i>Designation:</i></b></td><td><input type=text name=designation size=40 value=\'"+rs.getString(7)+"\'></td></tr>");
			       out.println("<tr><td><b><i>Branch:</i></b></td><td><input type=text  name=branch value="+rs.getString(8)+"></td></tr>");
			       out.println("<tr><td><b><i>Password:</i></b></td><td><input type=text  name=password value=''></td></tr>");
			       
			        
			       out.println("<tr><td><input type=submit name=btn value=Edit>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type=submit name=btn value=Delete></td></tr>");
			       out.println("</table></td>");
			       out.println("<th valign=middle><img src=facultypic/"+rs.getString(10)+" width=250 height=250><br><br><input type=file name=photograph></th></tr></table>");
			       
				
				
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
