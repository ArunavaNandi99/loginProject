package com.register.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.login.bean.Users;
import com.login.util.DBConnection;

public class RegisterDao {
	public String registerUser(Users user) {
		String fullName = user.getFullName();
		String email = user.getEmail();
		String userName = user.getUserName();
		String password = user.getPassword();

		Connection con = null;
		PreparedStatement stmt = null;
		try {
			con = DBConnection.createConnection();
			String sql = "insert into loginuser(FULLNAME,EMAIL,USERNAME,PASSWORD) values(?,?,?,?)";

			stmt = con.prepareStatement(sql);
			stmt.setString(1, fullName);
			stmt.setString(2, email);
			stmt.setString(3, userName);
			stmt.setString(4, password);

			int i = stmt.executeUpdate();
			if (i != 0) {
				return "SUCCESS";
			}
		} catch (SQLException e) {

			e.printStackTrace();
		}
		return "Oops.. Somthing went wrong there..!";

	}

}
