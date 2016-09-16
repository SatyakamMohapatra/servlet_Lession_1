package com.satya.service;

import com.satya.dao.LoginDaoImpl;

public class LoginServiceImpl implements LoginService {
	
	LoginDaoImpl impl;
	@Override
	public Integer setUser(String user, String pass) {
		
		System.out.println("[LoginServiceImpl]..[setUser]..[Setting Login info from DB].."
				+ ""+"[Thread name-]-"+Thread.currentThread().getName());
		
		impl = new LoginDaoImpl();
		Integer i=impl.setUser(user, pass);
		return i;
	}

}
