package com.jspider.jdbc_prepared_statement.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import com.jspider.jdbc_prepared_statement.connection.StudentDatabaseConnection;
import com.jspider.jdbc_prepared_statement.dto.Student;

public class StudentDao {
	Connection connection=StudentDatabaseConnection.getStudentDatabaseConnection();
	public Student saveStudentDao(Student student){
		String insertquery="Insert into studentsdetails values(?,?,?,?,?)";
		try {
			PreparedStatement preparedstatement=connection.prepareStatement(insertquery);
			preparedstatement.setInt(1, student.getId());
			preparedstatement.setString(2,student.getName());
			preparedstatement.setString(3, student.getEmail());
			preparedstatement.setLong(4,student.getPhone());
			preparedstatement.setObject(5, student.getDob());
			preparedstatement.execute();
			System.out.println("Data inserted......");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return student;
		
		
	}
	public Student getStudentbyIdDao(int id) {
		
		String getbyidquery="Select * from studentsdetails where id=?";
		
		Student student=new Student();
		try {
		PreparedStatement prepareStatement=connection.prepareStatement(getbyidquery);
		prepareStatement.setInt(1, id);
		
		 ResultSet resultSet= prepareStatement.executeQuery();
		 
		 while(resultSet.next()) {
//			 student=new Student();
			 int id1=resultSet.getInt("id");
			 String name=resultSet.getString("name");
			 String email=resultSet.getString("email");
			 long phone=resultSet.getLong("phone");
			 LocalDate localDate =  resultSet.getObject("dob",LocalDate.class);
			 student.setId(id1);
			 student.setName(name);
			 student.setEmail(email);
			 student.setPhone(phone);
			 student.setDob(localDate);
			 
			 
			 
		 }
		 return student;
		
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	public void deleteStudentsdetaiDao(int id) {
		String deletequery="delete from studentsdetails where id=?";
		  try {
		PreparedStatement prepareStatement=connection.prepareStatement(deletequery);
		prepareStatement.setInt(1, id);
		prepareStatement.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public List<Student> getAllStudentsDetailsDao() {
		String query="SELECT * FROM studentsdetails";
		try {
		PreparedStatement prepareStatement=connection.prepareStatement(query);
		 ResultSet resultSet=prepareStatement.executeQuery();
		 List<Student> students=new ArrayList<Student>();
		 while(resultSet.next()) {
			 Student student=new Student();
			 int id=resultSet.getInt("id");
			 String name=resultSet.getString("name");
			 String email=resultSet.getString("email");
			 Long phone=resultSet.getLong("phone");
			 LocalDate dob=resultSet.getObject("dob",LocalDate.class);
			 student.setId(id);
			 student.setName(name);
			 student.setEmail(email);
			 student.setPhone(phone);
			// student.setDob(dob);
			 students.add(student);
			 		
		 }
		 return students;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

}
