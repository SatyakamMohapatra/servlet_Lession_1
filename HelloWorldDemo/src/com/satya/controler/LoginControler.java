package com.satya.controler;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.satya.service.LoginServiceImpl;

/**
 * Servlet implementation class LoginControler
 */
/*@WebServlet("/LoginControler")*/
public class LoginControler extends HttpServlet {
	private static final long serialVersionUID = 1L;
	LoginServiceImpl loginService;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("[LoginControler]..[doPost]..[Getting Login Request].."
				+ ""+"[Thread name-]-"+Thread.currentThread().getName()); 
		loginService = new LoginServiceImpl();
		String user = request.getParameter("user");
		String pass = request.getParameter("Password");
		System.out.println("Entered User is " +user+" and Password is "+pass);
		request.setAttribute("user", "satyakamMohapatra");
		PrintWriter writer = response.getWriter();
		if(user.contentEquals("satya")){
		if(loginService.setUser(user, pass)==1){
			System.out.println("User Account Created");
			writer.write("Your User Account Created "+ user);
			RequestDispatcher dispatcher = request.getRequestDispatcher("MainFirstServlet");
			dispatcher.forward(request, response);
			System.out.println("User Account Sucessfull");
			System.out.println("Request Attribute Remove [LoginControler] Example :-"+request.getAttribute("user"));
		}else{
			System.out.println("Issue while creating user account");
		}
		}else{
			writer.write("<h3>Enter a valid user</h3>");
			System.out.println("Issue while creating user account");
			RequestDispatcher dispatcher = request.getRequestDispatcher("Login.jsp");
			dispatcher.include(request, response);
		}
		
		
	}

}
