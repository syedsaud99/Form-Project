package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.model.Form;
import com.utilities.DBUtilities;

public class FormDao {
	
	public void insertRecord(Form form) {
		System.out.println("I am in Dao");
		DBUtilities dbConnection = new DBUtilities();
		Connection conn = dbConnection.getConnection();
		try {
			PreparedStatement stmt=conn.prepareStatement("insert into form_table values(?,?,?,?)"); 
			stmt.setString(1,form.getEmp_name());  
			stmt.setString(2,form.getEmp_no()); 
			stmt.setString(3, form.getEmail());
			stmt.setString(4, form.getEmp_mob_no());
			  
			stmt.executeUpdate();  
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			dbConnection.closeConnection(conn);
		}
		
	}
}
