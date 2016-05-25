package com.insidecodes.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

import com.insidecodes.model.Faculty;
import com.insidecodes.model.Student;


public class FacultyDAO {
	static String provider="jdbc:mysql://localhost:3306/studentrfid";
	 public static boolean AddNewRecord(Faculty F)
	 { try{
		 Class.forName("com.mysql.jdbc.Driver").newInstance();   
		 Connection cn=DriverManager.getConnection(provider,"root","root");
	  String query="INSERT INTO faculty values('"+F.getFacultyid()+"','"+F.getFacultyname()+"','"+F.getEmailid()+"','"+F.getContactno()+"','"+F.getMobileno()+"','"+F.getQualifictions()+"','"+F.getDesignation()+"','"+F.getBranch()+"','"+F.getPassword()+"','"+F.getPhotograph()+"')";
	    boolean st=DBHelper.executeUpdate(cn, query);
	    System.out.println(query);
	    return st;
	 }catch(Exception e)
	 {
		 System.out.println(e);
		 return false;
	 }}
	 public static ResultSet DisplayAll()
	 {
		 try{
		 Class.forName("com.mysql.jdbc.Driver").newInstance();   
		 Connection cn=DriverManager.getConnection(provider,"root","root");
		 String query="select * from faculty";
		 ResultSet rs=DBHelper.executeQuery(cn, query);
		 return rs;
		 
		 
	 }catch(Exception e)
	 {
		 return null;
	 }
		 
		 
		 
	 }

    public static ResultSet DisplayById(String fid)
    {
    	try{
    		Class.forName("com.mysql.jdbc.Driver").newInstance();   
   		 Connection cn=DriverManager.getConnection(provider,"root","root");
   		 String query="select * from faculty where facultyid='"+fid+"'";
   		 ResultSet rs=DBHelper.executeQuery(cn, query);
   		 return rs;
   		 
    	}catch(Exception e){
    		System.out.println(e);
    		return null;
    	}
    	
    	
    }
    public static boolean DeleteById(String fid)
    { try{
    	 Class.forName("com.mysql.jdbc.Driver").newInstance();   
    	 Connection cn=DriverManager.getConnection(provider,"root","root");
     String query="DELETE FROM faculty where facultyid='"+fid+"'";
     System.out.println(query);
       boolean st=DBHelper.executeUpdate(cn, query);
       return st;
    }catch(Exception e)
    {
    	 return false;
    }
    }

     
    	
    public static boolean EditById(Faculty F)
    { try{
    	 Class.forName("com.mysql.jdbc.Driver").newInstance();   
    	 Connection cn=DriverManager.getConnection(provider,"root","root");
     String query="UPDATE faculty set facultyid='"+F.getFacultyid()+"',facultyname='"+F.getFacultyname()+"',emailid='"+F.getEmailid()+"',contactno='"+F.getContactno()+"',mobileno='"+F.getMobileno()+"',qualification='"+F.getQualifictions()+"',designation='"+F.getDesignation()+"',branch='"+F.getBranch()+"',password='"+F.getPassword()+"',photograph='"+F.getPhotograph()+"' where facultyid='"+F.getFacultyid()+"'";
     System.out.println(query);
       boolean st=DBHelper.executeUpdate(cn, query);
       return st;
    }catch(Exception e)
    {
    	 return false;
    }}
}
