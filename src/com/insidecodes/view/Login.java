package com.insidecodes.view;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Login
 */
@WebServlet("/Login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Login() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out=response.getWriter();
		out.println("<html>");
		out.println("<head><title>Login</title></head>");
		out.println("<body>");
		out.println("<form action=CheckLogin method=post>");
		out.println("<center><table>");
		out.println("<tr><td>Username:</td><td><input type=text name=username required></td></tr>");
		out.println("<tr><td>Password:</td><td><input type=password name=password required></td></tr>");
		out.println("<tr><td></td><td><input type=submit value=Login><input type=reset ></td></tr>");
		out.println("</table></center>");
		out.println("</form></body></html>");
		out.flush();
	}

}
