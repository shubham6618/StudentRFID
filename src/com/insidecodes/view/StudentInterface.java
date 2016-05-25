package com.insidecodes.view;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class StudentInterface
 */
@WebServlet(urlPatterns={"/StudentInterface","*.pagal"})
public class StudentInterface extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public StudentInterface() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
			PrintWriter out=response.getWriter();
			out.println("<html>");
			out.println("<script src=asset/jquery-2.2.1.min.js></script>");
			out.println("<script src=\"asset/bootstrap.js\"></script>");
			out.println("<link href=\"asset/bootstrap.min.css\" rel=\"stylesheet\" >");
		    out.println("<script src=statecity.js></script>");
		   
		    
		    out.println("<link href=\"asset/datepicker/css/datepicker.css\" rel=\"stylesheet\" >");
		    out.println("<script src=asset/datepicker/js/bootstrap-datepicker.js ></script>");
		    out.println("<script src=asset/datepicker/js/datepickerinit.js ></script>");
			
		    
		    out.println("<head><title>Student Interface</title></head>");
			out.println("<body>");
			
			out.println("<center><div class=form-group><form action=StudentSubmit method=post enctype=multipart/form-data>");
		    out.println("<table><caption><h3>Student Register</h3></caption>");
	        out.println("<tr><td><b><i>Student Id:</i></b></td><td><input type=text name=studentid size=40 class=form-control required></td></tr>");
	        out.println("<tr><td><b><i>Name:</i></b></td><td><input type=text name=studentname size=40 class=form-control required></td></tr>");
	        out.println("<tr><td><b><i>Father's Name:</i></b></td><td><input type=text name=fathername size=40 class=form-control required></td></tr>");
	        out.println("<tr><td><b><i>Birth Date:</i></b></td><td><input type=text name=dob id=dob class=form-control required ></td></tr>");
	       
	        out.println("<tr><td><b><i>Address:</i></b></td><td><textarea  name=address rows=3 cols=40 class=form-control required></textarea></td></tr>");
	        out.println("<tr><td><b><i>State:</i></b></td><td><select name=state id=stateid class=form-control required></select></td></tr>");
	        out.println("<tr><td><b><i>City:</i></b></td><td><select name=city id=cityid class=form-control required></select></td></tr>");
	      
	        out.println("<tr><td><b><i>Phone No:</i></b></td><td><input type=text name=phone maxlength=14 size=40 class=form-control required></td></tr>");
	        out.println("<tr><td><b><i>Email Id:</i></b></td><td><input type=email name=email size=40 class=form-control required></td></tr>");
	        out.println("<tr><td><b><i>Contact No(Father):</i></b></td><td><input type=text required maxlength=10 name=contactnofather class=form-control size=40></td></tr>");
	        out.println("<tr><td><b><i>Contact No(Student):</i></b></td><td><input type=text name=contactnostudent maxlength=10 required class=form-control size=40></td></tr>");
	        out.println("<tr><td><b><i>Current Address:</i></b></td><td><textarea  name=currentaddress rows=3 cols=40 class=form-control required></textarea></td></tr>");
	        out.println("<tr><td><b><i>Branch:</i></b></td><td><input type=text name=branch size=40 class=form-control required></td></tr>");
	        out.println("<tr><td><b><i>Semester:</i></b></td><td><input type=text name=semester class=form-control size=40></td></tr>");
	        out.println("<tr><td><b><i>Photograph:</i></b></td><td><input type=file name=photograph size=40></td></tr>");
	       
	        out.println("<tr><td><input type=submit class=\"btn btn-default\"></td><td><input class=\"btn btn-default\"type=reset></td></tr>");
		    out.println("</table></form><div></center></body></html>");
	}

}
