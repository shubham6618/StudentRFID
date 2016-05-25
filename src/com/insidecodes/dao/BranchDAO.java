package com.insidecodes.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

public class BranchDAO {

	
	static String provider="jdbc:mysql://localhost:3306/studentrfid";
	public static ResultSet DisplayAllBranch()
	 { 	
		try{
		 Class.forName("com.mysql.jdbc.Driver").newInstance();   
		 Connection cn=DriverManager.getConnection(provider,"root","root");
	  String query="select * from branch";
	  ResultSet rs=DBHelper.executeQuery(cn, query);
	  
	  
	   
	    return rs;
	 }catch(Exception e)
	 {System.out.println(e);
		 return null;
	 }}
	
}
