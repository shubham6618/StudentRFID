package com.insidecodes.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

public class LoginDAO {
	static String provider="jdbc:mysql://localhost:3306/studentrfid";
	public static boolean checkAdminUsernamePassword(String uid,String pwd) {
		try{
			 Class.forName("com.mysql.jdbc.Driver").newInstance();   
			 Connection cn=DriverManager.getConnection(provider,"root","root");
		  String query="select * from adminlogin where username='"+uid+"'and password='"+pwd+"'";
		  System.out.println(query);
		  ResultSet rs=DBHelper.executeQuery(cn, query);
		  if(rs.next())
		   {
			   return true;
		   }
		   
		    return false;
			 
			 
		 }catch(Exception e)
		 {System.out.println(e);
			 return false;
		 }
	}
	public static boolean EditById(String adminid,String password,String oldusername)
    { try{
    	 Class.forName("com.mysql.jdbc.Driver").newInstance();   
    	 Connection cn=DriverManager.getConnection(provider,"root","root");
     String query="UPDATE adminlogin set username='"+adminid+"',password='"+password+"' where username='"+oldusername+"'";
     System.out.println(query);
       boolean st=DBHelper.executeUpdate(cn, query);
       return st;
    }catch(Exception e)
    {
    	 return false;
    }}
	public static ResultSet checkFacultyUsernamePassword(String fid,String pwd) {
		try{
			 Class.forName("com.mysql.jdbc.Driver").newInstance();   
			 Connection cn=DriverManager.getConnection(provider,"root","root");
		  String query="select * from faculty where facultyid='"+fid+"'and password='"+pwd+"'";
		  System.out.println(query);
		  ResultSet rs=DBHelper.executeQuery(cn, query);
		return rs;
			 
		 }catch(Exception e)
		 {System.out.println(e);
			 return null;
		 }
	}
}

