package com.insidecodes.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

public class StateCityDAO {
	static String provider="jdbc:mysql://localhost:3306/studentrfid";
	public static ResultSet DisplayAllStates()
	 { 	
		try{
		 Class.forName("com.mysql.jdbc.Driver").newInstance();   
		 Connection cn=DriverManager.getConnection(provider,"root","root");
	  String query="select * from states";
	  ResultSet rs=DBHelper.executeQuery(cn, query);
	  
	  
	   
	    return rs;
	 }catch(Exception e)
	 {System.out.println(e);
		 return null;
	 }}
	
	public static ResultSet DisplayAllCities(String sid)
	 { 	
		try{
		 Class.forName("com.mysql.jdbc.Driver").newInstance();   
		 Connection cn=DriverManager.getConnection(provider,"root","root");
	  String query="select * from cities where stateid='"+sid+"'";
	  ResultSet rs=DBHelper.executeQuery(cn, query);
	  
	  
	   
	    return rs;
	 }catch(Exception e)
	 {System.out.println(e);
		 return null;
	 }}

}
