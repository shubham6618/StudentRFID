
package com.insidecodes.view;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.insidecodes.dao.FacultyDAO;
import com.insidecodes.dao.StudentDAO;

/**
 * Servlet implementation class DisplayAllFaculty
 */
@WebServlet("/DisplayAllFaculty")
public class DisplayAllFaculty extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DisplayAllFaculty() {
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
			ResultSet rs=FacultyDAO.DisplayAll();
			out.println("<html>");
			out.println("<head><script src=asset/jquery-2.2.1.min.js></script>");
			out.println("<script src=\"asset/bootstrap.js\"></script>");
			out.println("<link href=\"asset/bootstrap.min.css\" rel=\"stylesheet\" ></head>");
			
			if(rs.next())
			{
				out.println("<table border=1>");
			    out.println("<tr><th>FacultyId<br>Name</th><th>Emailid<br>contactno</th><th>mobileno</th><th>qualification</th><th>Designation</th><th>branch</th><th>PhotoGraph</th><th>Update</th></tr>");
			    do
			    { 
			    
			    out.println("<tr><td>"+rs.getString(1)+"<br>"+rs.getString(2)+"</td><td>"+rs.getString(3)+"<br>"+rs.getString(4)+"</td><td>"+rs.getString(5)+"</td><td>"+rs.getString(6)+"</td><td>"+rs.getString(7)+"</td><td>"+rs.getString(8)+"</td><td><img src='facultypic/"+rs.getString(10)+"' height=100 width=100 ></td><td><a href=UpdateDeleteFaculty?fid="+rs.getString(1)+">Edit/Delete</a></td></tr>");	
			    	
			    	
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
			System.out.println(e);
		}
		
	}

}
