package com.insidecodes.view;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.insidecodes.dao.LoginDAO;

/**
 * Servlet implementation class FinalEditDeleteAdmin
 */
@WebServlet("/FinalEditDeleteAdmin")
public class FinalEditDeleteAdmin extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FinalEditDeleteAdmin() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out=response.getWriter();
		out.println("<html>");
		try{
			String adminid=request.getParameter("adminid");
			String password=request.getParameter("password");
			String oldusername=request.getParameter("oldusername");
			boolean st=LoginDAO.EditById(adminid, password, oldusername);
			if(st)
				out.println("<font color=green>Account Credentials Updated....</font>");
			else
				out.println("<font color=red>Failed to Update Account Credentials....</font>");
		}catch(Exception e)
		{
			out.println(e);
		}
		out.flush();
	

	}

}
