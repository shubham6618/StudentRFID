package com.insidecodes.view;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.JSONObject;

import com.insidecodes.dao.BranchDAO;
import com.insidecodes.dao.DBHelper;


/**
 * Servlet implementation class FetchAllBranchJSON
 */
@WebServlet("/FetchAllBranchJSON")
public class FetchAllBranchJSON extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FetchAllBranchJSON() {
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
			ResultSet rs=BranchDAO.DisplayAllBranch();
			ArrayList <JSONObject>list=DBHelper.getFormattedResult(rs);
			out.println(list);
		}catch(Exception e){}
	
	}
	

}
