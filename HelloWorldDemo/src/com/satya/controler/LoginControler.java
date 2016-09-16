package com.satya.controler;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.el.stream.Stream;

import com.satya.dao.LoginDao;
import com.satya.dao.LoginDaoImpl;
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
		if(loginService.setUser(user, pass)==1){
			System.out.println("User Account Created");
		}else{
			System.out.println("Issue while creating user account");
		}
		PrintWriter writer = response.getWriter();
		writer.write("Your User Account Created "+ user);
	}

}
