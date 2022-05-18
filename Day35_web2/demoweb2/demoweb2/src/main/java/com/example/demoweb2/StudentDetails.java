package com.example.demoweb2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class StudentDetails {
	
	private Student1 stud;
	
	//***** By Using constructor ******
//	@Autowired
//	public StudentDetails(Student1 stud)
//	{
//		this.stud=stud;
//	}
	
	
	
	
	public void setStud(Student1 stud)
	{
	  this.stud=stud;	
	}
	//***** By Using setter method
	
	@Autowired
	void setdata()
	{
		stud.setId(200);
		stud.setName("Pawar");
	}
	
	void shodata()
	{
		System.out.println(stud.getId());
		System.out.println(stud.getName());
		
	}
	
	


}
