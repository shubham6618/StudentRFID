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
 * Servlet implementation class DisplayAllStudentAttendenceServlet
 */
@WebServlet("/DisplayAllStudentAttendenceServlet")
public class DisplayAllStudentAttendenceServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DisplayAllStudentAttendenceServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
	    	   PrintWriter out=response.getWriter();
	   		try{
	   			ResultSet rs=StudentDAO.DisplayAllStudentAttendence();
	   			out.println("<html>");
	   			out.println("<head><script src=asset/jquery-2.2.1.min.js></script>");
	   			out.println("<script src=\"asset/bootstrap.js\"></script>");
	   			out.println("<link href=\"asset/bootstrap.min.css\" rel=\"stylesheet\" ></head>");
	   		//	request.getRequestDispatcher("/navbar.jsp").include(request, response);
	   			if(rs.next())
	   			{
	   				
	   				out.println("<table style=\"width:50%\"border=1  > ");
	   			    out.println("<br><tr><th>StudentID</th><th>Date</th><td>Timein</td><td>Timeout</td></tr>");
	   			    do
	   			    { 
	   			    
	   			    out.println("<tr><td>"+rs.getString(3)+"</td><td>"+rs.getString(2)+"</td><td>"+rs.getString(4)+"</td><td>"+rs.getString(5)+"</td></tr>");	
	   			    	
	   			    	
	   			    }while(rs.next());
	   				   rs.close();
	   				   out.println("</table></center>");
	   			   
	   			}
	   			   
	   			else
	   				out.println("Record Not Found..");   
	   			 
	   			    out.println("</html>");
	   			
	   		}catch(Exception e)
	   		{
	   			out.println(e);
	   		}
	   		
	       
	      
	}

}
