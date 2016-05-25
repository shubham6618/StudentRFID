package com.insidecodes.view;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class FacultyHome
 */
@WebServlet("/FacultyHome")
public class FacultyHome extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FacultyHome() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out=response.getWriter();
		 HttpSession ses=request.getSession();
	       out.println("<html>");
	       out.println("<head>");
	      // out.println("<script src=\"asset/bootstrap.min.js\"></script>");
	       out.println("<script src=\"asset/jquery-2.2.1.min.js\"></script>");
	       out.println("<link href=\"asset/bootstrap.min.css\" rel=\"stylesheet\"><link rel=\"shortcut icon\" href=\"/StudentRFID/favicon.ico\">");
	       request.getRequestDispatcher("/navbarFaculty.jsp").include(request, response);
		    
			 try{
			// out.println("<h4><font color=green>Faculty Id:"+ses.getValue("SAID").toString()+"</font>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"+ses.getValue("LDATE").toString()+"&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<a href=AdminLogout>Logout</a></h4><hr color=red>");
			// out.println("<a href=StudentInterface target=mw>Student Register</a><a href=SendSMS.api target=mw>Send SMS</a><a href=DisplayAllStudents.jsp target=mw>List of Students</a><a href=DisplayAllStudentAttendenceServlet target=mw>Show All Student Record</a></h4><hr color=red>");
			 
			// out.println("<table>");
			//out.println("<tr valign=top><td><a href=StudentInterface target=mw>Student Register</a><br><a href=SendSMS.api target=mw>Send SMS</a><br><a href=DisplayAllStudents.jsp target=mw>List of Students</a><br><a href=DisplayAllStudentAttendenceServlet target=mw>Show All Student Record</a><td>");
			 out.println("<iframe frameborder=0 width=100% height=100% name=mw></iframe></td></tr>");
			// out.println("</table>");
			 }catch(Exception e){
				 response.sendRedirect("AdminLogin");
				 
			 }

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
