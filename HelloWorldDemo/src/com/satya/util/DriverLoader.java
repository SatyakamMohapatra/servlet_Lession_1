package com.satya.util;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class DriverLoader {
	
 static Connection con;
 
 private String driver = "com.mysql.jdbc.Driver";
 private String url= "jdbc:mysql://localhost:3306/demodb";
 
 public Connection driverloader() {
		try {
			System.out.println("------------driver loaded");
			Class.forName(driver);
			con =DriverManager.getConnection(url,"root","satya");
			System.out.println("Thread :-" +Thread.currentThread().getName());
			System.out.println("------------Connection Establised");
			return con;
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null ;
}
 public String driverClose() {
	 try {
		con.close();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	 System.out.println();
	 return "---------------Connection closed";
}
}
