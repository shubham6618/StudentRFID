package com.insidecodes.view;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.insidecodes.SMSDAO;
import com.insidecodes.SendSMS;
import com.insidecodes.dao.StudentDAO;

/**
 * Servlet implementation class StudentOTPCheck
 */
@WebServlet("/StudentOTPCheck")
public class StudentOTPCheck extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public StudentOTPCheck() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out=response.getWriter();
	       
	       String rollno=request.getParameter("rollno");
	       String otp=request.getParameter("otp");
	       String mobile=StudentDAO.getMobileNo(rollno);
	       SMSDAO.init();
			SendSMS.sendSMS("127.0.0.1", "8800", "apple", "apple", mobile, "OTP "+otp);
			
	       out.println("<html>");
	       out.println("<head>");
	   //    out.println("<script src=\"asset/bootstrap.min.js\"></script>");
	       out.println("<script src=\"login.js\"></script>");
	       
	     //  out.println("<script src=\"asset/jquery-2.2.1.min.js\"></script>");
	      // out.println("<link href=\"asset/bootstrap.min.css\" rel=\"stylesheet\">");
	       out.println("<link href=\"asset/signin.css\" rel=\"stylesheet\">");
	       
	       out.println("</head><body>");
	       request.getRequestDispatcher("/navbar.jsp").include(request, response);
	       out.println("<div class=container>");
	       out.println("<form class=\"form-signin\"   action=StudentRecordDisplay method=post>");
	       out.println ( " <input type=\"text\" id=\"userotp\"  name=userotp class=\"form-control\"  placeholder=\"Enter OTP\" required autofocus>");
	       
	       out.println  (" <input type=hidden id=\"otp\" name=otp value="+otp+">");
	       out.println  (" <input type=hidden id=\"rollno\" name=rollno value="+rollno+">");
	       
	       out.println  ("<button class=\"btn btn-lg btn-primary btn-block\" type=\"submit\">Enter OTP</button>");
	       
	       out.println("</form>");
	       out.println("</div>");
	       
	       
	       
	       
	       
	       out.println("</html>");
	      
	}

}
