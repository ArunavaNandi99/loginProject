package com.login.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import com.login.bean.Users;
import com.login.util.DBConnection;

public class LoginDao {

	public String authenticateuser(Users user) {
		String userName = user.getUserName();
		String password = user.getPassword();

		Connection con = null;
		Statement stmt = null;
		ResultSet rs = null;

		String userNameDb = "";
		String passwordDb = "";

		String sql = "select username,password from loginuser";

		try {
			con = DBConnection.createConnection();
			stmt = con.createStatement();
			rs = stmt.executeQuery(sql);

			while (rs.next()) {
				userNameDb = rs.getString("username");
				passwordDb = rs.getString("password");

				if (userName.equals(userNameDb) && password.equals(passwordDb)) {
					return "User-r";
				}
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return "Invalid user";
	}

}
