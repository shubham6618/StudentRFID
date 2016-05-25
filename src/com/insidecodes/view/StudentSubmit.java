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

import com.insidecodes.dao.StudentDAO;
import com.insidecodes.model.Student;

/**
 * Servlet implementation class StudentSubmit
 */
@WebServlet("/StudentSubmit")
@MultipartConfig(fileSizeThreshold=1024*1024*2,//2MB
maxFileSize=1024*1024*10,//10MB
maxRequestSize=1024*1024*50)
public class StudentSubmit extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public StudentSubmit() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out=response.getWriter();
		Student S=new Student();
		S.setStudentid(request.getParameter("studentid"));
		S.setStudentname(request.getParameter("studentname"));
		S.setFathername(request.getParameter("fathername"));
		S.setDob(request.getParameter("dob"));
		S.setAddress(request.getParameter("address"));
		S.setState(request.getParameter("state"));
		S.setCity(request.getParameter("city"));
		S.setPhone(request.getParameter("phone"));
		S.setEmail(request.getParameter("email"));
		S.setContactnofather(request.getParameter("contactnofather"));
		S.setContactnostudent(request.getParameter("contactnostudent"));
		S.setCurrentaddress(request.getParameter("currentaddress"));
		S.setBranch(request.getParameter("branch"));
		S.setSemester(request.getParameter("semester"));
		//S.setPhotograph(request.getParameter("photograph"));
		
		  Part part=request.getPart("photograph"); 
		  String savepath="i:/StudentRFID/WebContent/pic";
		 FileUpload F=new FileUpload(part,savepath);
		 S.setPhotograph(F.filename);
		 
		boolean st=StudentDAO.AddNewRecord(S);
		out.println("<html>");
		
		
		
		  if(st)
		  {out.println("<h3><font color=green>Record Submitted<br><a href=StudentInterface>Click Here to Add More Student..</a></font></h3>");
			}
		  else
		  {
			  out.println("<h3><font color=red>Fail to Record Submitted<br><a href=StudentInterface>Click Here to Add More Student..</a></font></h3>");  
			  
		  }  
			  
		  out.println("</html>");
		out.flush();
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	

}
