package com.insidecodes.view;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.insidecodes.SMSDAO;
import com.insidecodes.SendSMS;
import com.insidecodes.dao.StudentDAO;

/**
 * Servlet implementation class SendBulkSMS
 */
@WebServlet("/SendBulkSMS")
public class SendBulkSMS extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SendBulkSMS() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out=response.getWriter();
		String receiver=request.getParameter("receiver");
		String msg=request.getParameter("msg");
		String branch=request.getParameter("branch");
		try{
			SMSDAO.init();
			System.out.println("Receiver="+receiver);
			
		ResultSet rs=StudentDAO.FetchParentStudentMobileNumerByBranch(branch);
		if(receiver.equals("parent"))
		{	System.out.println("Receiver="+receiver);
			if(rs.next()){
				do{
					SendSMS.sendSMS("127.0.0.1", "8800", "apple", "apple", rs.getString(1), msg);
					System.out.println(rs.getString(1));
				}while(rs.next());
			}
			
		}
		else if(receiver.equals("student"))
		{
			if(rs.next()){
				do{
					SendSMS.sendSMS("127.0.0.1", "8800", "apple", "apple", rs.getString(2), msg);
					System.out.println("ssss"+rs.getString(2));
				}while(rs.next());
			}
			
		}
		out.println("Messages Sent to all "+receiver);
		}catch(Exception e){
			System.out.println(e);
			
		}
		}

}
