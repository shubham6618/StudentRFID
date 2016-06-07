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
 * Servlet implementation class AdminUpdate
 */
@WebServlet(name = "AdminUpdateProfile", urlPatterns = { "/AdminUpdateProfile" })
public class AdminUpdate extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AdminUpdate() {
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
			
			
			HttpSession ses=request.getSession();
			
			
				 out.println("<html><form action=FinalEditDeleteAdmin method=post >");
				 out.println("<input type=hidden name=oldusername size=40 value="+ses.getValue("SAID").toString()+">");
			       
			      out.println("<table cellpadding=15 cellspacing=15><tr><td>");
			    //   out.println("<table><caption><h3>Faculty Register</h3></caption>");
			       out.println("<tr><td><b><i>Admin Id:</i></b></td><td><input type=text name=adminid size=40 value="+ses.getValue("SAID").toString()+"></td></tr>");
			       out.println("<tr><td><b><i>Password:</i></b></td><td><input type=text  name=password value=''></td></tr>");
			       
			        
			       out.println("<tr><td><input type=submit name=btn value=Change>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type=reset></td></tr>");
			       out.println("</table></form>");
			    
				
			
			}catch(Exception e)
			{out.println(e);
				
			}
	}

}
