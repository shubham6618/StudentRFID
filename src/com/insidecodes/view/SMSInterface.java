package com.insidecodes.view;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SendSMS
 */
@WebServlet("/SendSMS.api")
public class SMSInterface extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SMSInterface() {
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
		out.println("<head><script src=asset/jquery-2.2.1.min.js></script>");
		out.println("<script src=\"asset/bootstrap.js\"></script>");
		out.println("<link href=\"asset/bootstrap.min.css\" rel=\"stylesheet\" ></head>");
		out.println("");
		out.println("<form action=SMS>");
		out.println("<center><table>");
		out.println("<tr><td>Mobile No:</td><td><input type=text name=mob cols=40 class=form-control required></td></tr>");
		out.println("<tr><td>Message:</td><td><textarea rows=5 cols=40 name=msg class=form-control required></textarea></td></tr>");
		out.println("<tr><td></td><td><input type=submit class=\"btn btn-default\" value=Send><input class=\"btn btn-default\" type=reset ></td></tr>");
		out.println("</table></center>");
		out.println("</form></html>");
		
	}

}
