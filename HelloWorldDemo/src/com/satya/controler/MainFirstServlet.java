package com.satya.controler;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.*;

/**
 * Servlet implementation class MainFirstServlet
 */
public class MainFirstServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		System.out.println("[MainFirstServlet]..[doPost]..[Getting Request Setting Responce].." + "" + "[Thread name-]-"
				+ Thread.currentThread().getName());
		ServletContext context = getServletContext();
		Cookie[] coo = request.getCookies();
		/*System.out.println("Cookie param :- " + coo[0].getValue());
		System.out.println("Cookie param :- " + coo[0].getDomain());
		System.out.println("Cookie param :- " + coo[0].getPath());
		System.out.println("Cookie param :- " + coo[0].getVersion());
		System.out.println("Cookie param :- " + coo[0].getClass());
		System.out.println("Cookie param :- " + coo[0].getMaxAge());*/
		System.out.println("contest param " + context.getInitParameter("mainapp"));
		System.out.println("initParam :-" + getServletConfig().getInitParameter("app"));
		PrintWriter stream = response.getWriter();
		stream.write("ram");
		stream.write("Cookie param :- " + coo[0].getValue());
		System.out.println("Request Attribute [MainFirstServlet] Example :-" + request.getAttribute("user"));
		request.removeAttribute("user");
		stream.write(getServletConfig().getInitParameter("app"));
	}

}
