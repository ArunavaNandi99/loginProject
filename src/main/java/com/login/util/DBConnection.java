package com.login.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {

	public static Connection createConnection() {
		Connection con = null;
		String url = "jdbc:mysql://localhost:3306/login";
		String username = "root";
		String password = "Arunava@1";

		try {
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");

			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}
			con  = DriverManager.getConnection(url,username,password);
	
		} catch (SQLException e) {
			e.printStackTrace();

		}
		return con;

	}

}
