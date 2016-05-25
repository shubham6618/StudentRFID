package com.insidecodes.view;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.insidecodes.dao.StudentDAO;

/**
 * Servlet implementation class StudentRecordDisplay
 */
@WebServlet("/StudentRecordDisplay")
public class StudentRecordDisplay extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public StudentRecordDisplay() {
        super();
        // TODO Auto-generated constructor stub
    }
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	try{}catch(Exception e){response.sendRedirect("/StudentRFID/index.jsp");}
    }
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	try{	String rollno=request.getParameter("rollno");
	       String otp=request.getParameter("otp");
	       String userotp=request.getParameter("userotp");
	       System.out.println("userotp otp ="+userotp+"=  ="+otp+"=");
	       if(userotp.equals(otp))
	       {
	    	   PrintWriter out=response.getWriter();
	   		try{
	   			ResultSet rs=StudentDAO.DisplayLogById(rollno);
	   			out.println("<html>");
	   			request.getRequestDispatcher("/navbar.jsp").include(request, response);
	   			request.getRequestDispatcher("/DisplayStudentDetailsByID.jsp?sid="+rollno).include(request, response);
	   			if(rs.next())
	   			{
	   				
	   				out.println("<table style=\"width:80%\" border=1>");
	   			    out.println("<br><tr><th>Date<br></th><td>Timein</td><td>Timeout</td></tr>");
	   			    do
	   			    { 
	   			    
	   			    out.println("<tr><td >"+rs.getString(2)+"</td><td>"+rs.getString(4)+"</td><td>"+rs.getString(5)+"</td></tr>");	
	   			    	
	   			    	
	   			    }while(rs.next());
	   				   rs.close();
	   				   out.println("</table>");
	   			   
	   			} else
	   			   {
	   				out.println("Record Not Found..");   
	   			   }
	   			    out.println("</html>");
	   			    
	   		}catch(Exception e)
	   		{
	   			out.println(e);
	   		}
	   		
	   		
	       }
	       else
		    	response.sendRedirect("/StudentRFID/index.jsp");
	      
	
	
		}catch(Exception e)
		{
			response.sendRedirect("/StudentRFID/index.jsp");
		}
	}
}
