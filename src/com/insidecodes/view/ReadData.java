package com.insidecodes.view;

import java.io.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.*;
import javax.comm.*;
import javax.swing.*;


import com.insidecodes.SMSDAO;
import com.insidecodes.SendSMS;
public class ReadData implements Runnable, SerialPortEventListener {
    static CommPortIdentifier portId;
    static Enumeration portList;

OutputStream outputStream;

    InputStream inputStream;
    SerialPort serialPort;
    Thread readThread;
     String value=new String();




    public ReadData(String name,String comPort) {


        try {
			portId = CommPortIdentifier.getPortIdentifier(comPort);
            serialPort = (SerialPort) portId.open(name, 2000);

            inputStream = serialPort.getInputStream();

            serialPort.addEventListener(this);

        serialPort.notifyOnDataAvailable(true);

            serialPort.setSerialPortParams(9600,
                SerialPort.DATABITS_8,
                SerialPort.STOPBITS_1,
                SerialPort.PARITY_NONE);
        } catch (Exception e) {System.out.println(e);}


        readThread = new Thread(this);
        readThread.start();
    }

    public void run() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {System.out.println(e);}


    }

    public void serialEvent(SerialPortEvent event) {
        switch(event.getEventType()) {
        case SerialPortEvent.BI:
        case SerialPortEvent.OE:
        case SerialPortEvent.FE:
        case SerialPortEvent.PE:
        case SerialPortEvent.CD:
        case SerialPortEvent.CTS:
        case SerialPortEvent.DSR:
        case SerialPortEvent.RI:
        case SerialPortEvent.OUTPUT_BUFFER_EMPTY:
            break;
        case SerialPortEvent.DATA_AVAILABLE:
            byte[] readBuffer = new byte[12];

            try {

                 while (inputStream.available() > 0) {
                    int numBytes = inputStream.read(readBuffer);
                }
                value=new String(readBuffer);
                //Update Balance

                String provider="jdbc:mysql://localhost:3306/studentrfid";


						try{
						//	Runtime.getRuntime().exec("cls");
						 Class.forName("com.mysql.jdbc.Driver").newInstance();
						 Connection cn=DriverManager.getConnection(provider,"root","root");
					  Statement smt=cn.createStatement();
					  String query="select studentname,contactnofather,studentid from student where studentid in(select studentid from card where rfid='"+value.trim()+"')";
					    ResultSet rs=smt.executeQuery(query);
					    if(rs.next())
					    {	String name=rs.getString(1);
					    	String ph=rs.getString(2);
					    	String studentid=rs.getString(3);
					      rs.close();
					      Date date=new Date();
					      SMSDAO.init();
					      String transectiondate=((date.getYear()+1900)+"/"+(date.getMonth()+1)+"/"+date.getDate()).toString();
					      String time=(date.getHours()+":"+date.getMinutes()+":"+date.getSeconds()).toString();
					      query="select * from smsdetails where studentid='"+studentid+"' and transectiondate='"+transectiondate+"'";
					      ResultSet temp=smt.executeQuery(query);
					      if(temp.next()){
					    	  query="update smsdetails set timeout='"+time+"' where studentid='"+studentid+"' and transectiondate='"+transectiondate+"'";
					    	  SendSMS.sendSMS("127.0.0.1", "8800", "apple", "apple", ph, name+" is out from collage @ "+date);
					      }
					      else
					      {
					    	  query="insert into smsdetails(transectiondate,studentid,timein) value('"+transectiondate+"','"+studentid+"','"+time+"')";
					    	  SendSMS.sendSMS("127.0.0.1", "8800", "apple", "apple", ph, name+" is in collage @ "+date);
					      }
				       smt.executeUpdate(query);
					   System.out.println("SMSDetails Updated....");
					 //   SmsServlet T=new SmsServlet();
					  //  T.SendSms("COM5",ph,"Amount 30/- Deducted from Ur Account "+value);
					     
					     
					      //SimpleDateFormat dateFormat=new SimpleDateFormat("dd-M-yyyy hh:mm:ss");
					      
							
							
					    
					    }
					else
					{//System.out.println("Balance Updated....");
						}

					 }catch(Exception e)
					 {System.out.println(e);
					 }

               ////////////////////////

                System.out.print("     "+value);

            } catch (IOException e) {//System.out.println(e);
            }
            break;
        }
    }
}