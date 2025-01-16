package com.loginservlet;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/loginservlet")

public class loginservlet extends HttpServlet {
	 public void doGet(HttpServletRequest rq,HttpServletResponse rs) throws IOException
{
		 rs.setContentType("text/html");
		 PrintWriter out= rs.getWriter();
		 String username= rq.getParameter("username");
		 String userid=rq.getParameter("userid");
		 String password=rq.getParameter("password");
		 out.print("username" +username);
		 out.print("userid" +userid);
		 out.print("password" +password);
		 
		 
}


public void doPost(HttpServletRequest rq, HttpServletResponse rs) throws IOException
{
	doGet(rq,rs);
}

}
