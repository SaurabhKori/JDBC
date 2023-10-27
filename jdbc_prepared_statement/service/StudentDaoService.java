package com.jspider.jdbc_prepared_statement.service;

import java.util.List;

import com.jspider.jdbc_prepared_statement.dao.StudentDao;
import com.jspider.jdbc_prepared_statement.dto.Student;

public class StudentDaoService {
	StudentDao studentdao=new StudentDao();
	public Student saveStudentService(Student student) {
		int id=student.getId();
		if(id>99||id<1000) {
			studentdao.saveStudentDao(student);
			
		}
		else {
			System.out.println("please insert the id three digit");
		}
		return student;
		
	}
	public Student getStudentdetailbyidService(int id) {
		Student student=studentdao.getStudentbyIdDao(id);
		return student;
	}
	public List<Student> getAllStudentDetail(){
		return studentdao.getAllStudentsDetailsDao();
	}
     public void deleteStudentsdetaiDao(int id) {
    	 Student student=getStudentdetailbyidService(id);
    	 if(student!=null) {
    		 studentdao.deleteStudentsdetaiDao(id);
    		 System.out.println("Data deleted.........");
    	 }
    	 else {
    		 System.out.println("given id is not found in this table");
    	 }
     }
}
