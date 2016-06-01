package com.insidecodes.view;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.insidecodes.dao.LoginDAO;

/**
 * Servlet implementation class CheckFacultyLogin
 */
@WebServlet("/CheckFacultyLogin")
public class CheckFacultyLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CheckFacultyLogin() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		try{
		PrintWriter out=response.getWriter();
		String fid=request.getParameter("username");
		String pwd=request.getParameter("password");
		ResultSet rs=LoginDAO.checkFacultyUsernamePassword(fid, pwd);
		//System.out.println(st);
		if(rs.next())
	    { HttpSession ses=request.getSession();
	    ses.putValue("SFID",request.getParameter("username"));
	    ses.putValue("LDATE", new java.util.Date());
	    ses.putValue("SFNAME", rs.getString(2));
	    ses.putValue("SFNAME", rs.getString(2));
	    ses.putValue("SFBRANCH", rs.getString(8));
	    ses.putValue("SFCONTACT", rs.getString(5));
	    	
	    	response.sendRedirect("FacultyHome");
	    }
	    else
	    {
	    	response.sendRedirect("FacultyLogin?st=true");
	     out.println("<html><font color=red size=5>Invalid UserID/Password</font> </html>");
	     
	    	
	    }
		out.flush();
		}catch(Exception e)
		{
			System.out.println("Unable to get Faculty data");
			
		}
	}

}
