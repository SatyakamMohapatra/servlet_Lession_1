package com.satya.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class AuthFilter implements Filter {

	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		// TODO Auto-generated method stub
		System.out.println("[com.satya.filter.AuthFilter][AuthFilter][init] inside init...");
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		//System.out.println("[com.satya.filter.AuthFilter][AuthFilter][doFilter] inside checker 1...");
		//RequestDispatcher dispatcher = request.getServletContext().getRequestDispatcher("/MainTest.jsp");
		//dispatcher.include(request, response);
	    String s=request.getParameter("user");
		System.out.println("[com.satya.filter.AuthFilter][AuthFilter][doFilter] in filter...");
	    //chain.doFilter(request, response);
		//if (s.equals("satya")) {
			System.out.println("[com.satya.filter.AuthFilter][AuthFilter][doFilter] inside checker 2...");
			chain.doFilter(request, response);
			System.out.println("[com.satya.filter.AuthFilter][AuthFilter][doFilter] post filter...");
		//}else{
			System.out.println("[com.satya.filter.AuthFilter][AuthFilter][doFilter] password did not match...");
	//	}
	}

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		System.out.println("[com.satya.filter.AuthFilter][AuthFilter][destroy] inside destory...");
		
	}

}
