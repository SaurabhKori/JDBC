package com.jspider.jdbc_prepared_statement.dto;

import java.time.LocalDate;

public class Student {
	private int id;
	private String name;
	private String email;
	private long phone;
	private LocalDate dob;
	public Student() {
		// TODO Auto-generated constructor stub
	}
	public Student(int id,String name,String email,long phone,LocalDate dob) {
		this.id=id;
		this.name=name;
		this.email=email;
		this.phone=phone;
		this.dob=dob;
	}
	
	public LocalDate getDob() {
		return dob;
	}
	public void setDob(LocalDate dob) {
		this.dob = dob;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public long getPhone() {
		return phone;
	}
	public void setPhone(long phone) {
		this.phone = phone;
	}
	

}
