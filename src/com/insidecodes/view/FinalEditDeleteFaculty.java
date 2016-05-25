package com.insidecodes.view;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

import org.softech.FileUpload;

import com.insidecodes.dao.FacultyDAO;
import com.insidecodes.dao.StudentDAO;
import com.insidecodes.model.Faculty;
import com.insidecodes.model.Student;

/**
 * Servlet implementation class FinalEditDeleteFaculty
 */
@WebServlet("/FinalEditDeleteFaculty")
@MultipartConfig(fileSizeThreshold=1024*1024*5,//2MB
maxFileSize=1024*1024*10,//10MB
maxRequestSize=1024*1024*50)
public class FinalEditDeleteFaculty extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FinalEditDeleteFaculty() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out=response.getWriter();
		out.println("<html>");
		try{
			String btn=request.getParameter("btn");
			if(btn.equals("Delete"))
			{
				boolean st=FacultyDAO.DeleteById(request.getParameter("facultyid"));
			}
			else if(btn.equals("Edit"))
			{
				Faculty F=new Faculty();
				F.setFacultyid(request.getParameter("facultyid"));
				F.setFacultyname(request.getParameter("facultyname"));
				F.setEmailid(request.getParameter("emailid"));
				F.setContactno(request.getParameter("contactno"));
				F.setMobileno(request.getParameter("mobileno"));
				F.setQualifictions(request.getParameter("qualifications"));
				F.setDesignation(request.getParameter("designation"));
				F.setBranch(request.getParameter("branch"));
				F.setPassword(request.getParameter("password"));
				System.out.println("password:" +request.getParameter("password"));
				System.out.println("photograph:" +request.getParameter("photograph")+":");
			//	F.setPhotograph(request.getParameter("photograph"));;
				if(request.getParameter("photograph")=="")
				{
					F.setPhotograph(request.getParameter("photograph"));
				}
				else
					{
					Part part=request.getPart("photograph"); 
				  String savepath="i:/StudentRFID/WebContent/facultypic";
				 FileUpload fu=new FileUpload(part,savepath);
				 F.setPhotograph(fu.filename);
					}
				boolean st=FacultyDAO.EditById(F);
			}
			response.sendRedirect("DisplayAllFaculty");
	}catch(Exception e)
		{
			out.println(e);
		}
		out.flush();
	}

}
