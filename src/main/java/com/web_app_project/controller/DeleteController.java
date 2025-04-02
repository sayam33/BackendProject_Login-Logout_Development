package com.web_app_project.controller;

import java.io.IOException;
import java.sql.ResultSet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.web_app_project.model.DAO;

@WebServlet("/deleteController")
public class DeleteController extends HttpServlet {
	private static final long serialVersionUID = 1L;
 
	public DeleteController() {
        super();
     
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
     
		String email = request.getParameter("email");
		DAO d = new DAO();
		d.connectDB();
		d.deleteRegistration(email);
		
		ResultSet result = d.listReg();
		request.setAttribute("res", result);
		
		RequestDispatcher rd = request.getRequestDispatcher("WEB-INF/views/list.jsp");
		rd.forward(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	}

}
