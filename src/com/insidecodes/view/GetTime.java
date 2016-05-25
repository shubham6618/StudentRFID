package com.insidecodes.view;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.util.Calendar;
import java.util.GregorianCalendar;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class GetTime
 */
@WebServlet(name = "GetTimeAndIP", urlPatterns = { "/GetTimeAndIP" })
public class GetTime extends HttpServlet {
	private static final long serialVersionUID = 1L;
	 
    /**
     * @see HttpServlet#HttpServlet()
     */
    public GetTime() {
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
		      out.println("Loopback:"+InetAddress.getLoopbackAddress());
		      out.println("Server IP:"+InetAddress.getLocalHost());
			   
		      //  out.println("<input type=text value="+day+"/"+(month+1)+"/"+year+"::"+hour+":"+minute+":"+second+" name=dateTime");
		      out.println("</html>");
			
	}

}
