
package com.insidecodes.view;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class FacultyInterface
 */
@WebServlet("/FacultyInterface")
public class FacultyInterface extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FacultyInterface() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		PrintWriter out=response.getWriter();
		out.println("<html>");
		out.println("<script src=\"asset/jquery-2.2.1.min.js\"></script>");
		out.println("<script src=\"branch.js\"></script>");
		
		out.println("<script src=\"asset/bootstrap.js\"></script>");
		out.println("<link href=\"asset/bootstrap.min.css\" rel=\"stylesheet\" ></head>");
		out.println("<head><title>Faculty Interface</title></head>");
		out.println("<body>");
		
		out.println("<center><form action=FacultySubmit method=post enctype=multipart/form-data>");
	    out.println("<table><caption><h3>Faculty Register</h3></caption>");
        out.println("<tr><td><b><i>Faculty Id:</i></b></td><td><input class=form-control type=text name=facultyid size=40></td></tr>");
        out.println("<tr><td><b><i>Faculty Name:</i></b></td><td><input class=form-control  type=text name=facultyname size=40></td></tr>");
        out.println("<tr><td><b><i>Email Id:</i></b></td><td><input type=text name=emailid  class=form-control size=40></td></tr>");
        out.println("<tr><td><b><i>Contact No:</i></b></td><td><input type=text name=contactno maxlength=14  class=form-control size=40></td></tr>");
        out.println("<tr><td><b><i>Mobile No:</i></b></td><td><input type=text name=mobileno maxlength=10 class=form-control  size=40></td></tr>");
        out.println("<tr><td><b><i>Qualifications:</i></b></td><td><input type=text  class=form-control name=qualifications></td></tr>");
        out.println("<tr><td><b><i>Designation:</i></b></td><td><input type=text class=form-control  name=designation></td></tr>");
        out.println("<tr><td><b><i>Branch:</i></b></td><td><select  name=branch  class=form-control id=branch></select></td></tr>");
        out.println("<tr><td><b><i>password:</i></b></td><td><input type=password name=password  class=form-control size=40></td></tr>");
        out.println("<tr><td><b><i>Photograph:</i></b></td><td><input type=file name=photograph class=form-control  size=40></td></tr>");
       
        out.println("<tr><td><input type=submit class=\"btn btn-default\" ></td><td><input  class=\"btn btn-default\" type=reset></td></tr>");
	    out.println("</table></form></center></body></html>");
	
	
	}

}

