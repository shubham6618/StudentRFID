package com.insidecodes.view;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.insidecodes.dao.LoginDAO;

/**
 * Servlet implementation class CheckAdminLogin
 */
@WebServlet("/CheckAdminLogin")
public class CheckAdminLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CheckAdminLogin() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out=response.getWriter();
		String uid=request.getParameter("username");
		String pwd=request.getParameter("password");
		boolean st=LoginDAO.checkAdminUsernamePassword(uid, pwd);
		//System.out.println(st);
		if(st)
	    { HttpSession ses=request.getSession();
	    ses.putValue("SAID",request.getParameter("username"));
	    ses.putValue("LDATE", new java.util.Date());
	    
	    	
	    	response.sendRedirect("AdminHome");
	    }
	    else
	    {
	    	response.sendRedirect("AdminLogin?st=true");
	     out.println("<html><font color=red size=5>Invalid UserID/Password</font> </html>");
	     
	    	
	    }
		out.flush();
		
	}

}
