package com.servlet.jdbc.ServletJDBC;
import java.io.*;
import java.sql.*;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/register")
public class Register extends HttpServlet implements Serializable {
			public void service(HttpServletRequest request, HttpServletResponse response)
					throws ServletException, IOException {

				response.setContentType("text/html");
				PrintWriter out = response.getWriter();
				
				String n=request.getParameter("userName");
				String p=request.getParameter("userPass");
				String e=request.getParameter("userEmail");
				String c=request.getParameter("userCountry");
				System.out.println("Enter In Try");
				try{
					System.out.println("Entered In Try");
				Class.forName("org.h2.Driver");
				System.out.println("Driver Loaded");
				Connection con=DriverManager.getConnection("jdbc:h2:tcp://localhost/~/JDBC","sa","test"); 
					     System.out.println("Connection Created");
						   Statement stmt=con.createStatement();
						   int i=stmt.executeUpdate("insert into REGISTERUSER values('"+n+"','"+p+"','"+e+"','"+c+"')");
						   System.out.println("Run");
						   if(i==1){
						   out.println("You are successfully registered..."+n);
						   }else {out.println("User Not Registered");}
					   }catch(Exception ex){ex.printStackTrace();}
				
				out.println("welcome user"+n);
				out.println("You are successfully registered");
							
				out.close();
			
		}

	}

