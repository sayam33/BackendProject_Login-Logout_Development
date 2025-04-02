package com.web_app_project.controller;

import java.io.IOException;

import java.sql.ResultSet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.web_app_project.model.DAO;

@WebServlet("/listReg")
public class ListRegistrationController extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
	public ListRegistrationController() {
        super();
   
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		try {

			HttpSession session = request.getSession(false);
			session.setMaxInactiveInterval(60);
			if(session.getAttribute("email")!=null) {
			
			DAO d = new DAO();
			d.connectDB();
			ResultSet result = d.listReg();
			request.setAttribute("res", result);
			
			RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/views/list.jsp");
			rd.forward(request, response);
		}else {
			RequestDispatcher rd = request.getRequestDispatcher("index.jsp");
			rd.forward(request, response);
		}
		
		} catch (Exception e) {
			RequestDispatcher rd = request.getRequestDispatcher("index.jsp");
			rd.forward(request, response);
		}
	}	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	}
	}