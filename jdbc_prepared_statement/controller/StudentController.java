package com.jspider.jdbc_prepared_statement.controller;

import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;

import com.jspider.jdbc_prepared_statement.dto.Student;
import com.jspider.jdbc_prepared_statement.service.StudentDaoService;

public class StudentController {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			StudentDaoService studentdaoservice=new StudentDaoService();
			Student student=null;
			System.out.println("Enter your Choice");
			System.out.println("If you want to insert the data inside tha Datatbase---*Select 1");
			System.out.println("If you want to fetch the all  data from tha Datatbase---*Select 2*");
			System.out.println("If you want to fetch the data by id the data from tha Datatbase---*Select 3*");
			System.out.println("If you want to delet the data of tha Datatbase---*Select 4*");
			int a=sc.nextInt();
			switch (a) {
			case 1: 
				System.out.println("Enter a id");
				int id=sc.nextInt();
				sc.nextLine();
				System.out.println("Enter a name");
				String name=sc.nextLine();
				System.out.println("Enter a email");
				String email=sc.nextLine();
				System.out.println("Enter a phone");
				Long phone =sc.nextLong();
//			System.out.println("Enter a Dob");
//			LocalDate dob=null;
				student=new Student(id, name, email, phone,LocalDate.of(2002, 12, 27));
				studentdaoservice.saveStudentService(student);
//			System.out.println("Data is inserted.........");
				break;
			case 2:
				 System.out.println("start");
				 List<Student> s=studentdaoservice.getAllStudentDetail();
				 System.out.println(student);
				 for (Student student2 : s) {
					 System.out.println("studentid"+student2.getId());
					 System.out.println("studentname"+student2.getName());
					 System.out.println("studentEmail"+student2.getEmail());
					 System.out.println("studentPhone"+student2.getPhone());
					// System.out.println("studentDob"+student2.getDob());
					
				}
				 
				break;
				
				
			case 3:
				System.out.println("Enter a id");
				int id1=sc.nextInt();
				 Student student1=studentdaoservice.getStudentdetailbyidService(id1);
				 if(student1!=null) {
						
						System.out.println("studentid = "+student1.getId());
						System.out.println("studentName = "+student1.getName());
						System.out.println("studentEmail = "+student1.getEmail());
						System.out.println("studentPhone = "+student1.getPhone());
						System.out.println("studentDob = "+student1.getDob());
					}else {
						System.out.println("given id is not present ....");
					}
				
				break;
			case 4:
				System.out.println("Enter a id");
				int id2=sc.nextInt();
				studentdaoservice.deleteStudentsdetaiDao(id2);
				break;
				
			default:
				 System.out.println("invalid choice-----");
			}
		}
	}
	 

}
