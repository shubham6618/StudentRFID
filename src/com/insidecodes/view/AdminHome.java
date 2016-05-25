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
 * Servlet implementation class AdminHome
 */
@WebServlet("/AdminHome")
public class AdminHome extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AdminHome() {
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
		// out.println("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Strict//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd\">");
	    //   out.println("<html xmlns=\"http://www.w3.org/1999/xhtml\" xml:lang=\"en\" lang=\"en\">");
	       out.println("<html><head>");
	  //     out.println("<script src=\"asset/bootstrap.min.js\"></script>");
	   //    out.println("<script src=\"asset/jquery-2.2.1.min.js\"></script>");
	       out.println("<script src=\"asset/jquery-2.2.1.min.js\"></script>");
	       out.println("<link href=\"asset/bootstrap.min.css\" rel=\"stylesheet\"><link rel=\"shortcut icon\" href=\"/StudentRFID/favicon.ico\">");
	       //   out.println("<link href=\"asset/devicewidth.css\" rel=\"stylesheet\">");
	       
			 try{
				 request.getRequestDispatcher("/navbarAdmin.jsp").include(request, response);
				    
	//		 out.println("<h4><font color=green>Admin Id:"+ses.getValue("SAID").toString()+"</font>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"+ses.getValue("LDATE").toString()+"&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<a href=AdminLogout>Logout</a></h4><hr color=red>");
		//	 out.println("<table>");
		//	 out.println("<tr valign=top><td><a href=StudentInterface target=mw>Student Register</a><br><a href=FacultyInterface target=mw>Faculty Interface</a><br><a href=DisplayAllStudents target=mw>List of Students</a><br><a href=DisplayAllFaculties.jsp target=mw>Faculty List</a><br><a href=AdminLogout>Logout</a><td>");
		 out.println("<iframe frameborder=0 width=100% height=100% name=mw></iframe>");
	//		 out.println("</table>");
			 }catch(Exception e){
				 response.sendRedirect("AdminLogin");
				 
			 }
	}

}
