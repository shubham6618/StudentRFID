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
 * Servlet implementation class DisplayAllStudent
 */
@WebServlet("/DisplayAllStudents")
public class DisplayAllStudents extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DisplayAllStudents() {
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
			ResultSet rs=StudentDAO.DisplayAll();
			out.println("<html>");
			out.println("<head><script src=asset/jquery-2.2.1.min.js></script>");
			out.println("<script src=\"asset/bootstrap.js\"></script>");
			out.println("<link href=\"asset/bootstrap.min.css\" rel=\"stylesheet\" ></head>");
			if(rs.next())
			{
				out.println("<table style=\"width:60%\" border=1>");
			    out.println("<tr><th>StudentId<br>Name</th><td>FatherName</td><td>DOB</td><td>Address<br>City<br>State</td><td>Phone no:</td><td>Email</td><td>ContactNo Father<br>Student</td><td>CurrentAddress</td><td>Branch<br>Semester</td><td>PhotoGraph</td><td>Update</td></tr>");
			    do
			    { 
			    
			    out.println("<tr><td>"+rs.getString(1)+"<br>"+rs.getString(2)+"</td><td>"+rs.getString(3)+"</td><td>"+rs.getString(4)+"</td><td>"+rs.getString(5)+"<br>"+rs.getString(7)+"<br>"+rs.getString(6)+"</td><td>"+rs.getString(8)+"</td><td>"+rs.getString(9)+"</td><td>"+rs.getString(10)+"<br>"+rs.getString(11)+"</td><td>"+rs.getString(12)+"</td><td>"+rs.getString(13)+"<br>"+rs.getString(14)+"</td><td><img src=pic/"+rs.getString(15)+" height=100 width=100 ></td><td><a href=UpdateDeleteStudent?sid="+rs.getString(1)+">Edit/Delete</a></td></tr>");	
			    	
			    	
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

}
