package com.jspider.jdbc_prepared_statement.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.cj.jdbc.Driver;
/**
 * @author Saurabh
 */

public class StudentDatabaseConnection {
	public static Connection getStudentDatabaseConnection() {
		try {
			Driver d=new Driver();
			DriverManager.registerDriver(d);
			String url="jdbc:mysql://localhost:3306/jdbc.api";
			String name="root";
			String pass="root";
			Connection connection=DriverManager.getConnection(url, name, pass);
			return connection;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
		
	
	

	}
