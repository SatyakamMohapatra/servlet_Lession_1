package com.satya.controler;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sun.net.httpserver.HttpsServer;

public class MainControler extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String s = req.getParameter("name");
		PrintWriter writer = resp.getWriter();
		writer.println("Hello.."+s);
		System.out.println(s+" "+writer);
		
		
	}

}
