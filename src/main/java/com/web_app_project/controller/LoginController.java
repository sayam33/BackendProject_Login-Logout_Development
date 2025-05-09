package com.web_app_project.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.web_app_project.model.DAO;

@WebServlet("/verifyLogin")
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
	public LoginController() {
        super();
       
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		DAO d = new DAO();
		d.connectDB();
		boolean status = d.verifyLogin(email,password);
		if(status) {
			
		HttpSession session = request.getSession(true);
		session.setMaxInactiveInterval(60);
		session.setAttribute("email", email);
		
			RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/views/registration.jsp");
			rd.forward(request, response);
			
		}else {
			request.setAttribute("error", "Invalid username/password");
			RequestDispatcher rd = request.getRequestDispatcher("index.jsp");
			rd.forward(request, response);
			
		}
	}

}
