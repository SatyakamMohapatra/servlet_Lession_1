 package com.satya.controler;

import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MainFirstServlet
 */
@WebServlet(description = "Testing doGet", urlPatterns = { "/MainFirstServlet" })
public class MainFirstServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		System.out.println("[MainFirstServlet]..[doPost]..[Getting Request Setting Responce].."
				+ ""+"[Thread name-]-"+Thread.currentThread().getName());
		PrintWriter stream = response.getWriter();
		stream.write("ram");
		stream.write("satya");
		
	}

}
