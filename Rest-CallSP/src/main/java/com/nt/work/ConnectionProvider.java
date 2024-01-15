package com.nt.work;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionProvider {
	private static Connection connection;
	
	public static Connection getConnection() {
		try {
			if(connection==null) {
			connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/learn_sp","root","root");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return connection;
	}
}
