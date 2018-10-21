package com.utilities;

import java.sql.*;
import java.sql.DriverManager;



public class DBUtilities {
	
	private static String url = "jdbc:mysql://localhost:3306/form_db";
	private static String driverName = "com.mysql.jdbc.Driver";
	private static String username = "root";
	private static String password = "";
	
	
	public Connection getConnection()
	{
		
		
		
		try {
			Driver d=new com.mysql.jdbc.Driver();  
            DriverManager.registerDriver(d);  
			Class.forName(driverName);
		
			Connection connection = DriverManager.getConnection(url, username, password);
			return connection;
		} catch (ClassNotFoundException e) {
			System.out.println("SQLException: " + e.getMessage());
			System.out.println("class not fouund");
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println("sql exception generated");
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
	public void closeConnection(Connection connection) {
		
		if(connection != null) {
			
			
			try {
				connection.close();
				connection = null;
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	
	
	public void closeResultSet (ResultSet resultSet) {
		
		if(resultSet != null) {
			
			try {
				resultSet.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
	}
	
	public void closeStatement(PreparedStatement preparedStatement) {
		
		
		if (preparedStatement != null) {
			
			try {
				preparedStatement.close();
				preparedStatement = null;
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	
	
}
