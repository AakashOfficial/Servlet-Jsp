package com.demo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/demo")
public class Demo extends HttpServlet {

	public void service(HttpServletRequest req, HttpServletResponse res)throws IOException {
		PrintWriter out = res.getWriter();
		HttpSession session = req.getSession();
		String name = req.getParameter( "username" );
		   session.setAttribute( "theName", name );
		   out.print("<A HREF='next.jsp'>Continue</A>");
		   
	}
}
