package com.insidecodes.view;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class StudentSearchByRollnoSelf
 */
// @WebServlet("/StudentSearchByRollnoSelf")
public class StudentSearchByRollnoSelf extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public StudentSearchByRollnoSelf() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out=response.getWriter();
		
	    Random t = new Random();
	 
	    // random integers in [0, 100]
	 
	    
	       String otp=Integer.toString(t.nextInt(60000));
	    
	      	       out.println("<html>");
	       out.println("<head>");
	     //  out.println("<script src=\"asset/bootstrap.min.js\"></script>");
	       out.println("<script src=\"login.js\"></script>");
	       
	//       out.println("<script src=\"asset/jquery-2.2.1.min.js\"></script>");
	   //    out.println("<link href=\"asset/bootstrap.min.css\" rel=\"stylesheet\">");
	       out.println("<link href=\"asset/signin.css\" rel=\"stylesheet\">");
	       
	       out.println("</head><body>");
	       out.println("<div class=container>");
	       out.println("<form class=\"form-signin\"   action=StudentOTPCheck method=POST>");
	       out.println( "<center><h2 class=\"form-signin-heading\" >Student Log</h2></center>");
	       out.println ("<label for=\"rollno\" class=\"sr-only\">Enter Student ID</label>");
	       out.println ( " <input type=\"text\" id=\"rollno\"  name=rollno class=\"form-control\"  placeholder=\"Enter Student ID\" required autofocus>");
	       out.println("<input type=hidden name=otp value="+otp+">");
	       out.println  ("<button class=\"btn btn-lg btn-primary btn-block\" type=\"submit\">Search</button>");
	       out.println("</form>");
	       out.println("</div>");
	       
	       
	       
	       
	       
	       out.println("</html>");
	      
	}

}
