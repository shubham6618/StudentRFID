package com.insidecodes.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

import com.insidecodes.model.Student;

public class StudentDAO {
	static String provider="jdbc:mysql://localhost:3306/studentrfid";
 public static boolean AddNewRecord(Student S)
 { try{
	 Class.forName("com.mysql.jdbc.Driver").newInstance();   
	 Connection cn=DriverManager.getConnection(provider,"root","root");
  String query="INSERT INTO student values('"+S.getStudentid()+"','"+S.getStudentname()+"','"+S.getFathername()+"','"+S.getDob()+"','"+S.getAddress()+"','"+S.getState()+"','"+S.getCity()+"',"+S.getPhone()+",'"+S.getEmail()+"',"+S.getContactnofather()+","+S.getContactnostudent()+",'"+S.getCurrentaddress()+"','"+S.getBranch()+"','"+S.getSemester()+"','"+S.getPhotograph()+"')";
    boolean st=DBHelper.executeUpdate(cn, query);
    System.out.println(query);
    return st;
 }catch(Exception e)
 {
	 System.out.println(e);
	 return false;
 }}
 
 public static ResultSet DisplayAll()
 { try{
	 Class.forName("com.mysql.jdbc.Driver").newInstance();   
	 Connection cn=DriverManager.getConnection(provider,"root","root");
  String query="select * from student";
  ResultSet rs=DBHelper.executeQuery(cn, query);
  return rs;
	 
	 
 }catch(Exception e)
 {
	 return null;
 }}

public static ResultSet DisplayById(String sid) {
	try{
		 Class.forName("com.mysql.jdbc.Driver").newInstance();   
		 Connection cn=DriverManager.getConnection(provider,"root","root");
	  String query="select * from student where studentid='"+sid+"'";
	  ResultSet rs=DBHelper.executeQuery(cn, query);
	  return rs;
		 
		 
	 }catch(Exception e)
	 {System.out.println(e);
		 return null;
	 }
}
public static ResultSet FetchParentStudentMobileNumerByBranch(String branch) {
	try{
		 Class.forName("com.mysql.jdbc.Driver").newInstance();   
		 Connection cn=DriverManager.getConnection(provider,"root","root");
	  String query="select contactnofather,contactnostudent from student where branch='"+branch+"'";
	  System.out.println(query);
	  ResultSet rs=DBHelper.executeQuery(cn, query);
	  return rs;
		 
		 
	 }catch(Exception e)
	 {System.out.println(e);
		 return null;
	 }
}

public static boolean DeleteById(String sid)
{ try{
	 Class.forName("com.mysql.jdbc.Driver").newInstance();   
	 Connection cn=DriverManager.getConnection(provider,"root","root");
 String query="DELETE FROM student where studentid='"+sid+"'";
 System.out.println(query);
   boolean st=DBHelper.executeUpdate(cn, query);
   return st;
}catch(Exception e)
{
	 return false;
}
}

 
	
public static boolean EditById(Student S)
{ try{
	 Class.forName("com.mysql.jdbc.Driver").newInstance();   
	 Connection cn=DriverManager.getConnection(provider,"root","root");
 String query="UPDATE student set studentid='"+S.getStudentid()+"',studentname='"+S.getStudentname()+"',fathername='"+S.getFathername()+"',dob='"+S.getDob()+"',address='"+S.getAddress()+"',state='"+S.getState()+"',city='"+S.getCity()+"',phone='"+S.getPhone()+"',email='"+S.getEmail()+"',contactnofather='"+S.getContactnofather()+"',contactnostudent='"+S.getContactnostudent()+"',currentaddress='"+S.getCurrentaddress()+"',branch='"+S.getBranch()+"',semester='"+S.getSemester()+"',photograph='"+S.getPhotograph()+"' where studentid='"+S.getStudentid()+"'";
 System.out.println(query);
   boolean st=DBHelper.executeUpdate(cn, query);
   return st;
}catch(Exception e)
{
	 return false;
}}



public static String getMobileNo(String sid) {
	try{
		 Class.forName("com.mysql.jdbc.Driver").newInstance();   
		 Connection cn=DriverManager.getConnection(provider,"root","root");
	  String query="select contactnostudent from student where studentid='"+sid+"'";
	  ResultSet rs=DBHelper.executeQuery(cn, query);
	  String mob=null;
	  if(rs.next())
	  {
		  mob=rs.getString(1);
		  
	  } 
	  return mob;
		 
	 }catch(Exception e)
	 {System.out.println(e);
		 	return null;
	 		 }
}
public static ResultSet DisplayLogById(String sid) {
	try{
		 Class.forName("com.mysql.jdbc.Driver").newInstance();   
		 Connection cn=DriverManager.getConnection(provider,"root","root");
	  String query="select * from smsdetails where studentid='"+sid+"'";
	  ResultSet rs=DBHelper.executeQuery(cn, query);
	  return rs;
		 
		 
	 }catch(Exception e)
	 {System.out.println(e);
		 return null;
	 }
}
public static ResultSet DisplayAllStudentAttendence() {
	try{
		 Class.forName("com.mysql.jdbc.Driver").newInstance();   
		 Connection cn=DriverManager.getConnection(provider,"root","root");
	  String query="select * from smsdetails";
	  ResultSet rs=DBHelper.executeQuery(cn, query);
	  return rs;
		 
		 
	 }catch(Exception e)
	 {System.out.println(e);
		 return null;
	 }
}
}
