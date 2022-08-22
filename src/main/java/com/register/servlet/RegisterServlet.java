package com.register.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.login.bean.Users;
import com.register.DAO.RegisterDao;

@WebServlet("/RegisterServlet")
public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public RegisterServlet() {
		super();

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String fullname = request.getParameter("fullname");
		String email = request.getParameter("email");
		String userName = request.getParameter("username");
		String password = request.getParameter("password");

		Users user = new Users();

		user.setFullName(fullname);
		user.setEmail(email);
		user.setUserName(userName);
		user.setPassword(password);

		RegisterDao registerDao = new RegisterDao();

		String userRegistered = registerDao.registerUser(user);

		if (userRegistered.equals("SUCCESS")) {
			request.getRequestDispatcher("home.jsp").forward(request, response);
		} else {
			request.setAttribute("errMessage", userRegistered);
			request.getRequestDispatcher("Register.jsp").forward(request, response);
			;
		}

	}

}
