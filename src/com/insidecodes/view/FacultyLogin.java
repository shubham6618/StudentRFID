package com.insidecodes.view;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class FacultyLogin
 */
// @WebServlet("/FacultyLogin")
public class FacultyLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FacultyLogin() {
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
	       boolean wp=false;
	       wp=request.getParameter("st") != null;
	       request.getRequestDispatcher("/navbar.jsp").include(request, response);
	       out.println("<html>");
	       out.println("<head><title>Faculty Login</title>");
	   
	       out.println("<script src=\"login.js\"></script>");
	       
	
	       out.println("<link href=\"asset/signin.css\" rel=\"stylesheet\">");
	       
	       out.println("</head><body>");
	       out.println("<div class=container>");
	       out.println("<form class=\"form-signin\"   action=CheckFacultyLogin method=post>");
	       out.println( "<center><h2 class=\"form-signin-heading\" >Faculty Login</h2></center>");
	       out.println ("<label for=\"username\" class=\"sr-only\">Email address</label>");
	       out.println ( " <input type=\"text\" id=\"username\"  name=username class=\"form-control\"  placeholder=\"Username\" required autofocus>");
	       out.println ("<label for=\"password\" class=\"sr-only\">Password</label>");
	       out.println  (" <input type=\"password\" id=\"password\" name=password class=\"form-control\" placeholder=\"Password\" required>");
	       if(wp)
	       {
	    	   out.println("<div id=\"wrongPassword\"><center><font color=red>Wrong password</font></center></div>"); 
	       }
	       out.println  ("<button class=\"btn btn-lg btn-primary btn-block\" type=\"submit\">Sign in</button>");
	       out.println("</form>");
	       out.println("</div>");
	       
	       
	       
	       
	       
	       out.println("</html>");
	      
	 
	}

}
