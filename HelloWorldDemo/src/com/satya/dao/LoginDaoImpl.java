package com.satya.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.satya.util.DriverLoader;

public class LoginDaoImpl implements LoginDao {
	
	private DriverLoader loader;
	@Override
	public Integer setUser(String user,String pass) {
		
		System.out.println("[LoginDaoImpl]..[SetUser]..[Setting Login info from DB].."
				+ ""+"[Thread name-]-"+Thread.currentThread().getName());
		loader = new DriverLoader();
		Connection con= loader.driverloader();
		String sql ="INSERT INTO demo_user(`USER_NAME`, `USER_PASSWD`) VALUES (?,?);"; 
		try {
			PreparedStatement preparedStatement = con.prepareStatement(sql);
			preparedStatement.setString(1,user);
			preparedStatement.setString(2,pass);
			Integer b = preparedStatement.executeUpdate();
			return b;
		} catch (SQLException e) {
			System.out.println(e);
		}finally {
			System.out.println(loader.driverClose());
		}
		return 0;
		
		
	}

}
