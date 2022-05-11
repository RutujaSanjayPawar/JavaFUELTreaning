package com.example.demo;
//import java.util.*;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		ApplicationContext context;
		context=SpringApplication.run(DemoApplication.class, args);
		StudentRepository stud=context.getBean(StudentRepository.class);
		//Create for row
		
		// Student st=new Student(102,"rutuja");
		// stud.save(st);
		//System.out.println("Record Saved");

		Student st=new Student(101,"pqr");
		stud.Updat(st);
		System.out.println("Updated Record");
		
		
				
	}

}
