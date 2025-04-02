package com.web_app_project.model;

import java.sql.*;

public class DAO {
	private Connection con;
	private Statement stmtn;
	public void connectDB() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/projectdb","root","sayam");
			stmtn = con.createStatement();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public boolean verifyLogin(String email, String password) {
		try {
		ResultSet result = stmtn.executeQuery("select * from login where email='"+email+"' and password='"+password+"'");
		
		return result.next();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}
	public void createRegistrations(String name, String email, String mobile, String course) {
		try {
			 stmtn.executeUpdate("insert into registration value('"+name+"','"+email+"','"+course+"','"+mobile+"')");
			
			
			} catch (Exception e) {
				e.printStackTrace();
			}
		
	}
	public ResultSet listReg() {
		try {
			ResultSet result = stmtn.executeQuery("select * from registration");
			
			return result;
			} catch (Exception e) {
				e.printStackTrace();
			}
		return null;
	}
	public void deleteRegistration(String email) {
		try {
			 stmtn.executeUpdate("Delete from registration where email='"+email+"'");
			
			
			} catch (Exception e) {
				e.printStackTrace();
			}
		
	}
	public void updateRegistration(String email, String mobile) {
		try {
			 stmtn.executeUpdate("update registration set mobile='"+mobile+"' where email='"+email+"'");
			
			
			} catch (Exception e) {
				e.printStackTrace();
			}
		
	}
	

}
