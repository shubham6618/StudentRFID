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

import com.insidecodes.model.Faculty;


/**
 * Servlet implementation class FacultySubmit
 */
@WebServlet("/FacultySubmit")
@MultipartConfig(fileSizeThreshold=1024*1024*2,//2MB
maxFileSize=1024*1024*10,//10MB
maxRequestSize=1024*1024*50)
public class FacultySubmit extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FacultySubmit() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out=response.getWriter();
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
	//	F.setPhotograph(request.getParameter("photograph"));;
		 Part part=request.getPart("photograph"); 
		  String savepath="i:/StudentRFID/WebContent/facultypic";
		 FileUpload fu=new FileUpload(part,savepath);
		 F.setPhotograph(fu.filename);
		 
		boolean st=FacultyDAO.AddNewRecord(F);
		out.println("<html>");
		
		
		
		  if(st)
		  {out.println("<h3><font color=green>Faculty Record Submitted<br><a href=FacultyInterface>Click Here to Add More Faculty.....</a></font></h3>");
			}
		  else
		  {
			  out.println("<h3><font color=red>Fail to Submit record<br><a href=FacultyInterface>Click Here to Add More Faculty.....</a></font></h3>");  
			  
		  }  
			  
		  out.println("</html>");
		out.flush();
		
	}
	//	response.getWriter().append("Served at: ").append(request.getContextPath());
	

}
