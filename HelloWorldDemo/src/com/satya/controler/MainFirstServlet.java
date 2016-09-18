 package com.satya.controler;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MainFirstServlet
 */
public class MainFirstServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        
		System.out.println("[MainFirstServlet]..[doPost]..[Getting Request Setting Responce].."
				+ ""+"[Thread name-]-"+Thread.currentThread().getName());
		ServletContext context = getServletContext();
		System.out.println("contest param "+context.getInitParameter("mainapp"));
		System.out.println("initParam :-"+getServletConfig().getInitParameter("app"));
		PrintWriter stream = response.getWriter();
		stream.write("ram");
		stream.write("satya");
		System.out.println("Request Attribute [MainFirstServlet] Example :-"+request.getAttribute("user"));
		request.removeAttribute("user");
		stream.write(getServletConfig().getInitParameter("app"));
	}

}
